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
import org.avatar.himsa.patient.service.api.PatientAnonymizationService;
import org.avatar.provider.backend.api.AnonymizationService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.avatar.metadata.AnonymizationInfo;
import de.avatar.metadata.AnonymizationMetadata;
import de.avatar.metadata.AnonymizationModelConfig;
import de.avatar.metadata.AnonymizationModelFeatureConfig;
import de.avatar.metadata.MetadataFactory;

/**
 * 
 * @author ilenia
 * @since Mar 24, 2025
 */
@Component(name = "PatientAnonymizationService", service = {PatientAnonymizationService.class, AnonymizationService.class})
public class PatientAnonymizationServiceImpl implements PatientAnonymizationService {
	
	private static final Logger LOGGER = Logger.getLogger(PatientAnonymizationServiceImpl.class.getName());
	
	@Activate
	public void activate() {
		LOGGER.info("PatientAnonymizationService is up");
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.anonymization.api.AnonymizationService#getAnonymizationMetadata()
	 */
	@Override
	public AnonymizationMetadata getAnonymizationMetadata() {
		AnonymizationMetadata metadata = MetadataFactory.eINSTANCE.createAnonymizationMetadata();
		metadata.setId(UUID.randomUUID().toString());
		metadata.setDescription("Metadata relative to the anonymization process");
		AnonymizationInfo anInfo = MetadataFactory.eINSTANCE.createAnonymizationInfo();
		anInfo.setModelName("IDMT-ot");
		anInfo.setModelProvider("Fraunhofer IDMT");
		anInfo.setModelVersion("1.0");
		anInfo.setModelDescription("IDMT optimal transport anonymization algorithm");
		metadata.setAnonymizationInfo(anInfo);
		return metadata;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.PatientAnonymizationService#getAnonymizationMetadataForFeatures(org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public AnonymizationMetadata getAnonymizationMetadataForFeatures(EStructuralFeature[]... projections) {
		
		AnonymizationMetadata metadata = getAnonymizationMetadata();
		AnonymizationModelConfig modelConfig = MetadataFactory.eINSTANCE.createAnonymizationModelConfig();
		for(EStructuralFeature[] projPath : projections) {
			EStructuralFeature feature = projPath[projPath.length-1];
//			This is just an example. The actual meaningful config should be provided accordingly to the anonymization algorithm
			AnonymizationModelFeatureConfig featureConfig = MetadataFactory.eINSTANCE.createAnonymizationModelFeatureConfig();
			featureConfig.setFeatureName(feature.getName());
			featureConfig.setStrategy("ANONYMIZE");
			featureConfig.setMetric("CATEGORICAL_DISTANCE_100");
			modelConfig.getFeatureConfig().add(featureConfig);
		}
		metadata.getAnonymizationInfo().setModelConfig(modelConfig);
		return metadata;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.anonymization.api.AnonymizationService#anonymizeEObjects(java.util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> anonymizeEObjects(List<? extends EObject> eObjects) {
//		We are not doing anything in particular here because is not our responsibility to implement the anonymization algorithm
		return (List<Patient>) eObjects;
	}
}
