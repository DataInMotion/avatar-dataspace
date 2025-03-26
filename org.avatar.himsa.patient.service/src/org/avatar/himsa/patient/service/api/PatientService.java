/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.avatar.himsa.patient.service.api;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.avatar.himsa.export.Patient;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.repository.query.IQuery;

import de.avatar.metadata.ConsentMetadata;
import de.avatar.metadata.MetadataFactory;

/**
 * 
 * @author mark
 * @since 24.01.2024
 */
public interface PatientService {
	
	PatientResponse getPatient(String id, Map<Object, Object> loadOptions);
	
//	PatientResponse getPatientsWithConsent(String domainId, String policyId, String policyVersion);
		
//	PatientResponse getPatientsByRangeQuery(EAttribute columnName, Object startValue, Object endValue, boolean isStartIncluded, boolean isEndIncluded, 
//			EStructuralFeature[] ... projectionFeaturePaths);
	
	PatientResponse getPatientsByQuery(IQuery query, int limit, int skip, List<Query.Sort> sort, Map<Object, Object> loadOptions, EStructuralFeature[] ... projectionFeaturePaths);
	
	class PatientResponse {
		
		private Patient patient;
		private ConsentMetadata metadata = MetadataFactory.eINSTANCE.createConsentMetadata();
		private List<Patient> patients = new LinkedList<>();
		private EStructuralFeature[][] projections;
		
		public PatientResponse() {
			
		}

		public PatientResponse(Patient patient, ConsentMetadata metadata) {
			this.patient = patient;
			this.metadata = metadata;			
		}
		
		public PatientResponse(List<Patient> patients, ConsentMetadata metadata) {
			this.patients = patients;
			this.metadata = metadata;			
		}
		
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		
		public ConsentMetadata getMetadata() {
			return metadata;
		}
		
		public Patient getPatient() {
			return patient;
		}
		
		public List<Patient> getPatients() {
			return patients;
		}
		
		public void setProjections(EStructuralFeature[]...  projections) {
			this.projections = projections;
		}
		
		public EStructuralFeature[][] getProjections() {
			return projections;
		}
	}
}
