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
import java.util.List;

import org.avatar.anonymization.api.AnonymizationService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.patient.service.api.PatientAnonymizationService;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Component;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.Metadata;

/**
 * 
 * @author ilenia
 * @since Mar 24, 2025
 */
@Component(name = "PatientAnonymizationService", service = {PatientAnonymizationService.class, AnonymizationService.class})
public class PatientAnonymizationServiceImpl implements PatientAnonymizationService {

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.anonymization.api.AnonymizationService#getAnonymizationMetadata()
	 */
	@Override
	public List<Metadata> getAnonymizationMetadata() {
		List<Metadata> metadatas = new ArrayList<>(2);
		Metadata metadata = AConnectorFactory.eINSTANCE.createMetadata();
		metadata.setKey("anonymization.model.name");
		metadata.setValue("idmt");
		metadatas.add(metadata);
		
		metadata = AConnectorFactory.eINSTANCE.createMetadata();
		metadata.setKey("anonymization.model.name");
		metadata.setValue("idmt");
		metadatas.add(metadata);
		return metadatas;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.avatar.anonymization.api.AnonymizationService#getAnonymizationMetadataForFeatures(org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public List<Metadata> getAnonymizationMetadataForFeatures(EStructuralFeature[]... eStructuralFeatures) {
		List<Metadata> metadatas = new ArrayList<>(eStructuralFeatures.length*3);
		for(EStructuralFeature[] projPath : eStructuralFeatures) {
			EStructuralFeature feature = projPath[projPath.length-1];
			Metadata metadata = AConnectorFactory.eINSTANCE.createMetadata();
			metadata.setKey("anonymization.feature.name");
			metadata.setValue(feature.getName());
			metadatas.add(metadata);
			
			metadata = AConnectorFactory.eINSTANCE.createMetadata();
			metadata.setKey("anonymization.feature.strategy."+feature.getName());
			metadata.setValue("ANONYMIZE");
			metadatas.add(metadata);
			
			metadata = AConnectorFactory.eINSTANCE.createMetadata();
			metadata.setKey("anonymization.feature.metric."+feature.getName());
			metadata.setValue("ANONYMIZE");
			metadatas.add(metadata);
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.PatientAnonymizationService#anonymizePatients(java.util.List)
	 */
	@Override
	public List<Patient> anonymizePatients(List<Patient> patients) {
		// it was not our responsibility to implement anonymization so we simply do not do anything here
		return patients;
	}

	

}
