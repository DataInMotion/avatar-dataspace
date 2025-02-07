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
package org.avatar.himsa.service.example;

import java.util.List;
import java.util.Objects;

import org.avatar.gics.service.api.GICSService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.service.example.api.PatientService;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * !!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * @author Mark Hoffmann
 * @since 19.01.2024
 */
@Component(name ="PatientService", scope = ServiceScope.PROTOTYPE)
public class PatientServiceImpl implements PatientService {
	
	@Reference
	private PatientExportFactory modelFactory;
	@Reference
	private PatientExportPackage modelPackage;
	@Reference(target="(repo_id=test1.test)")
	ComponentServiceObjects<EMFRepository> repoSO;
	@Reference
	GICSService gicsService;
	

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatient(java.lang.String)
	 */
	@Override
	public Patient getPatient(String id) {
		if (Objects.isNull(id)) {
			return null;
		}
		EMFRepository repo = repoSO.getService();
		try {
			return repo.getEObject(modelPackage.getPatient(), id);
		} finally {
			repoSO.ungetService(repo);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatientsWithConsent(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Patient> getPatientsWithConsent(String domainId, String policyId, String policyVersion) {
		GetAllConsentedIdsForResponse allConsentedIdsFor = gicsService.getAllConsentedIdsFor(domainId, policyId, policyVersion, "Patient ID");
		List<String> patientIdsWithConsent = allConsentedIdsFor.getReturn().getConsentIds();
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQuery query = repo.createQueryBuilder().column(modelPackage.getPatient_PatientGUID()).in(patientIdsWithConsent.toArray()).build();				
			return repo.getEObjectsByQuery(modelPackage.getPatient(), query);
		} finally {
			repoSO.ungetService(repo);
		}
	}

	
	
	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatientsByRangeQuery(org.eclipse.emf.ecore.EAttribute, java.lang.Object, java.lang.Object, boolean, boolean, org.eclipse.emf.ecore.EStructuralFeature[])
	 */
	@Override
	public List<Patient> getPatientsByRangeQuery(EAttribute columnName, Object startValue, Object endValue,
			 boolean isStartIncluded, boolean isEndIncluded, EStructuralFeature[]... projectionFeatures) {
		
		GetAllConsentedIdsForResponse allConsentedIdsFor = gicsService.getAllConsentedIdsFor("avatar", "hearing_policy", "1.0", "Patient ID");
		List<String> patientIdsWithConsent = allConsentedIdsFor.getReturn().getConsentIds();		
		
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {		
			IQuery consentQuery = repo.createQueryBuilder().column(modelPackage.getPatient_PatientGUID()).in(patientIdsWithConsent.toArray()).build();	
			IQuery query = repo.
					createQueryBuilder().
					rangeQuery().
					column(columnName).
					startValue(startValue, isStartIncluded).
					endValue(endValue, isEndIncluded).
					build();				
			IQueryBuilder queryBuilder = repo.createQueryBuilder().and(query, consentQuery);
			for(EStructuralFeature[] projection : projectionFeatures) {
				queryBuilder = queryBuilder.projectionPath(projection);
			}
			return repo.getEObjectsByQuery(modelPackage.getPatient(), queryBuilder.build());
		} finally {
			repoSO.ungetService(repo);
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatientsByQuery(org.gecko.emf.repository.query.IQueryBuilder, org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public List<Patient> getPatientsByQuery(IQuery query, EStructuralFeature[]... projectionFeaturePaths) {
		GetAllConsentedIdsForResponse allConsentedIdsFor = gicsService.getAllConsentedIdsFor("avatar", "hearing_policy", "1.0", "Patient ID");
		List<String> patientIdsWithConsent = allConsentedIdsFor.getReturn().getConsentIds();		
		
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQuery consentQuery = repo.createQueryBuilder().column(modelPackage.getPatient_PatientGUID()).in(patientIdsWithConsent.toArray()).build();	
			IQueryBuilder queryBuilder = repo.createQueryBuilder().and(query, consentQuery);
			for(EStructuralFeature[] projection : projectionFeaturePaths) {
				queryBuilder = queryBuilder.projectionPath(projection);
			}
			return repo.getEObjectsByQuery(modelPackage.getPatient(), queryBuilder.build());
		} finally {
			repoSO.ungetService(repo);
		}
		
	}
}
