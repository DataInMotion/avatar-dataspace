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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.avatar.data.quality.api.DataQualityService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.patient.service.api.PatientDataQualityService;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.Metadata;

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
	public List<Metadata> getDataQualityMetadata() {
		List<Metadata> metadatas = new ArrayList<>(2);
		Metadata metadata = AConnectorFactory.eINSTANCE.createMetadata();
		metadata.setKey("data.quality.startegy");
		metadata.setValue("check-null-object");
		metadatas.add(metadata);

		metadata = AConnectorFactory.eINSTANCE.createMetadata();
		metadata.setKey("data.quality.startegy");
		metadata.setValue("check-empty-string");
		metadatas.add(metadata);

		return metadatas;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.PatientDataQualityService#getQualityMetadataForPatients(java.util.List, org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public List<Metadata> getQualityMetadataForPatients(List<Patient> patients, EStructuralFeature[] ... projections) {
		Map<String, Map<EStructuralFeature, Integer>> qualityDataMap = new HashMap<>();
		for(EStructuralFeature[] projPath : projections) {
			EStructuralFeature feature = projPath[projPath.length-1];
			System.out.println("Data Quality for feature " + feature.getName());
			for(Patient patient : patients) {
				Object obj = patient.eGet(feature);
				if(obj == null) {
					if(!qualityDataMap.containsKey("check-null-object")) {
						qualityDataMap.put("check-null-object", new HashMap<EStructuralFeature, Integer>());
					}
					if(!qualityDataMap.get("check-null-object").containsKey(feature)) {
						qualityDataMap.get("check-null-object").put(feature, 0);
					}
					Integer counter = qualityDataMap.get("check-null-object").get(feature);
					counter = counter + 1;
					qualityDataMap.get("check-null-object").put(feature, counter);
				}
				if(obj instanceof String str) {
					if(str.isEmpty()) {
						if(!qualityDataMap.containsKey("check-empty-string")) {
							qualityDataMap.put("check-empty-string", new HashMap<EStructuralFeature, Integer>());
						}
						if(!qualityDataMap.get("check-empty-string").containsKey(feature)) {
							qualityDataMap.get("check-empty-string").put(feature, 0);
						}
						Integer counter = qualityDataMap.get("check-empty-string").get(feature);
						counter = counter + 1;
						qualityDataMap.get("check-empty-string").put(feature, counter);
					}						
				}
			}
		}
		List<Metadata> metadatas = new LinkedList<>();
		qualityDataMap.forEach((strategy, dataQuality) -> {
			dataQuality.forEach((feature, counter) -> {
				Metadata metadata = AConnectorFactory.eINSTANCE.createMetadata();
				metadata.setKey("data.quality." + strategy + "." + feature.getName());
				metadata.setValue(String.valueOf(counter));
				metadatas.add(metadata);
			});
		});

		return metadatas;
	}

}
