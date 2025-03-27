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

import org.avatar.data.quality.api.DataQualityService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.patient.service.api.PatientDataQualityService;
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

	@Activate
	public void activate() {
		System.out.println("PatientDataQualityService is up!");
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
	public DataQualityMetadata getDataQualityMetadataForPatients(List<Patient> patients,
			EStructuralFeature[]... projections) {

		DataQualityMetadata metadata = getDataQualityMetadata();
		DataQualityFilter f1 = metadata.getDataQualityFilter().stream().filter(f -> "check-null-obj".equals(f.getName())).findAny().orElse(null);
		DataQualityFilter f2 = metadata.getDataQualityFilter().stream().filter(f -> "check-empty-string".equals(f.getName())).findAny().orElse(null);
		for(EStructuralFeature[] projPath : projections) {
			EStructuralFeature feature = projPath[projPath.length-1];
			String featureName = "";
			for(EStructuralFeature f : projPath) {
				featureName += f.getName() + ".";
			}
			featureName = featureName.substring(0, featureName.length());
			for(Patient patient : patients) {
				Object obj = patient.eGet(feature);
				if(obj == null) {
					if(f1 != null) {
						DataQualityResult result = f1.getDataQualityResult().stream().filter(r -> feature.getName().equals(r.getFeatureName())).findAny().orElse(null);
						if(result == null) {
							result = MetadataFactory.eINSTANCE.createDataQualityResult();
							result.setFeatureName(feature.getName());
							result.setElementsBeforeQualityFilter(patients.size());
							result.setElementsAfterQualityFilter(patients.size());
							f1.getDataQualityResult().add(result);
						}
						result.setElementsAfterQualityFilter(result.getElementsAfterQualityFilter() - 1);
					}
				}
				if(obj instanceof String str) {
					if(str.isEmpty()) {						
						if(f2 != null) {
							DataQualityResult result = f2.getDataQualityResult().stream().filter(r -> feature.getName().equals(r.getFeatureName())).findAny().orElse(null);
							if(result == null) {
								result = MetadataFactory.eINSTANCE.createDataQualityResult();
								result.setFeatureName(feature.getName());
								result.setElementsBeforeQualityFilter(patients.size());
								result.setElementsAfterQualityFilter(patients.size());
								f2.getDataQualityResult().add(result);
							}
							result.setElementsAfterQualityFilter(result.getElementsAfterQualityFilter() - 1);
						}
					}						
				}
			}

			DataQualityResult result = f1.getDataQualityResult().stream().filter(r -> feature.getName().equals(r.getFeatureName())).findAny().orElse(null);
			if(result == null) {
				result = MetadataFactory.eINSTANCE.createDataQualityResult();
				result.setFeatureName(featureName);
				result.setElementsBeforeQualityFilter(patients.size());
				result.setElementsAfterQualityFilter(patients.size());
				f1.getDataQualityResult().add(result);
			}
			result = f2.getDataQualityResult().stream().filter(r -> feature.getName().equals(r.getFeatureName())).findAny().orElse(null);
			if(result == null) {
				result = MetadataFactory.eINSTANCE.createDataQualityResult();
				result.setFeatureName(featureName);
				result.setElementsBeforeQualityFilter(patients.size());
				result.setElementsAfterQualityFilter(patients.size());
				f2.getDataQualityResult().add(result);
			}
		}

		return metadata;
	}
}
