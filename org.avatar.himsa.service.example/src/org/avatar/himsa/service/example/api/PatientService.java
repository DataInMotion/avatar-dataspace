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
package org.avatar.himsa.service.example.api;

import java.util.List;

import org.avatar.himsa.export.Patient;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.repository.query.IQuery;

/**
 * 
 * @author mark
 * @since 24.01.2024
 */
public interface PatientService {
	
	Patient getPatient(String id);
	
	List<Patient> getPatientsWithConsent(String domainId, String policyId, String policyVersion);
		
	List<Patient> getPatientsByRangeQuery(EAttribute columnName, Object startValue, Object endValue, boolean isStartIncluded, boolean isEndIncluded, 
			EStructuralFeature[] ... projectionFeaturePaths);
	
	List<Patient> getPatientsByQuery(IQuery query, EStructuralFeature[] ... projectionFeaturePaths);

}
