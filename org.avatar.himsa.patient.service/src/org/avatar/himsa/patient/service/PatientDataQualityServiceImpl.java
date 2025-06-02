/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.avatar.himsa.patient.service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.patient.service.api.PatientDataQualityService;
import org.avatar.provider.backend.api.DataQualityService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.avatar.metadata.DataQualityFilter;
import de.avatar.metadata.DataQualityMetadata;
import de.avatar.metadata.DataQualityResult;
import de.avatar.metadata.MetadataFactory;

/**
 * 
 * @author ilenia
 * @since Mar 25, 2025
 */
@Component(name = "PatientDataQualityService", service = {PatientDataQualityService.class, DataQualityService.class})
public class PatientDataQualityServiceImpl implements PatientDataQualityService {
	
	private static final Logger LOGGER = Logger.getLogger(PatientDataQualityServiceImpl.class.getName());

	private DataQualityFilter f1;
	private DataQualityFilter f2;

	@Activate
	public void activate() {
		LOGGER.info("PatientDataQualityService is up!");
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.data.quality.api.DataQualityService#getDataQualityMetadata()
	 */
	@Override
	public DataQualityMetadata getDataQualityMetadata() {
		DataQualityMetadata metadata = MetadataFactory.eINSTANCE.createDataQualityMetadata();
		metadata.setId(UUID.randomUUID().toString());
		metadata.setDescription("Metadata containing data quality information");

		DataQualityFilter filter = MetadataFactory.eINSTANCE.createDataQualityFilter();
		filter.setName("check-null-obj");
		filter.setDescription("Check for null objecs");
		metadata.getDataQualityFilter().add(filter);

		filter = MetadataFactory.eINSTANCE.createDataQualityFilter();
		filter.setName("check-empty-string");
		filter.setDescription("Check for empty strings");
		metadata.getDataQualityFilter().add(filter);		

		return metadata;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.PatientDataQualityService#getDataQualityMetadataForPatients(java.util.List, org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public DataQualityMetadata getDataQualityMetadataForPatients(List<Patient> patients, EStructuralFeature[]... projections) {

		DataQualityMetadata metadata = getDataQualityMetadata();
		f1 = metadata.getDataQualityFilter().stream().filter(f -> "check-null-obj".equals(f.getName())).findAny().orElse(null);
		f2 = metadata.getDataQualityFilter().stream().filter(f -> "check-empty-string".equals(f.getName())).findAny().orElse(null);
		for(EStructuralFeature[] projPath : projections) {
			for(Patient patient : patients) {
				performDataQuality(patient, patients.size(), patient.eClass().getName(), projPath);
			}
		}
		return metadata;
	}

	private String extractFeaturePathName(String prefix, EStructuralFeature ...featurePath) {
		String featureName = prefix != null ? prefix+"." : "";
		for(EStructuralFeature f : featurePath) {
			featureName += f.getName() + ".";
		}
		String fName = featureName.substring(0, featureName.length()-1);
		return fName;
	}

	private void performDataQuality(EObject startEObj, int totObjBeforeFilter, String featureNamePrefix, EStructuralFeature ...featurePath) {
		Object obj = retrieveFromFeaturePath(startEObj, featurePath);	
		String fName = extractFeaturePathName(featureNamePrefix, featurePath);
		DataQualityResult r1 = f1.getDataQualityResult().stream().filter(r -> fName.equals(r.getFeatureName())).findAny().orElse(null);
		if(r1 == null) {
			r1 = MetadataFactory.eINSTANCE.createDataQualityResult();
			r1.setFeatureName(fName);
			r1.setElementsBeforeQualityFilter(0);
			r1.setElementsAfterQualityFilter(0);
			f1.getDataQualityResult().add(r1);
		} 
		
		r1.setElementsBeforeQualityFilter(r1.getElementsBeforeQualityFilter()+1);
		if(obj != null) {
			r1 = f1.getDataQualityResult().stream().filter(r -> fName.equals(r.getFeatureName())).findAny().orElse(null);
			r1.setElementsAfterQualityFilter(r1.getElementsAfterQualityFilter()+1);
			if(obj instanceof String str) {
				DataQualityResult r2 = f2.getDataQualityResult().stream().filter(r -> fName.equals(r.getFeatureName())).findAny().orElse(null);
				if(r2 == null) {
					r2 = MetadataFactory.eINSTANCE.createDataQualityResult();
					r2.setFeatureName(fName);
					r2.setElementsBeforeQualityFilter(0);
					r2.setElementsAfterQualityFilter(0);
					f2.getDataQualityResult().add(r2);
				} 
				r2.setElementsBeforeQualityFilter(r2.getElementsBeforeQualityFilter()+1);				
				if(!str.isEmpty()) {		
					r2 = f2.getDataQualityResult().stream().filter(r -> fName.equals(r.getFeatureName())).findAny().orElse(null);
					r2.setElementsAfterQualityFilter(r2.getElementsAfterQualityFilter()+1);
				}
			} else if(obj instanceof EObject eObj) {
				for(EStructuralFeature f : eObj.eClass().getEAllStructuralFeatures()) {
					performDataQuality(eObj, totObjBeforeFilter, featureNamePrefix+"."+eObj.eClass().getName(), f);
				}
			} else if(obj instanceof List list) {
				for(Object lo : list) {
					if(lo instanceof EObject eo) {
						for(EStructuralFeature f : eo.eClass().getEAllStructuralFeatures()) {
							performDataQuality(eo, totObjBeforeFilter, featureNamePrefix+"."+eo.eClass().getName(), f);
						}
					}
				}
			} 
		}
	}

	private Object retrieveFromFeaturePath(EObject startEObj, EStructuralFeature ... featurePath) {
		Object obj = null;
		for(EStructuralFeature f : featurePath) {
			if(obj == null) {
				obj = startEObj.eGet(f);
			} else if(obj instanceof EObject eObj) {
				obj = eObj.eGet(f);
			}
		}
		return obj;
	}
}
