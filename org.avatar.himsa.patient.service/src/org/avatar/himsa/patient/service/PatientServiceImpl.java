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
package org.avatar.himsa.patient.service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.avatar.gics.service.api.GICSService;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.patient.service.api.PatientService;
import org.avatar.himsa.patient.service.api.Query;
import org.avatar.himsa.patient.service.api.Query.Sort;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.gecko.emf.repository.query.SortType;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * !!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * @author Mark Hoffmann
 * @since 19.01.2024
 */
@Component(name ="PatientService", scope = ServiceScope.PROTOTYPE, 
configurationPid = "HIMSAConsentManagement", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class PatientServiceImpl implements PatientService {
	
	@Reference
	private PatientExportFactory modelFactory;
	@Reference
	private PatientExportPackage modelPackage;
	@Reference(target="(repo_id=avatar.avatar)")
	ComponentServiceObjects<EMFRepository> repoSO;
	
	@Reference
	GICSService gicsService;
	
	private String consentDomainId;
	private String consentPolicyId;
	private String consentPolicyVersion;
	private String consentIdType;
	
	@Activate
	public void activate(Map<String, Object> properties) {
		consentDomainId = (String) properties.get("consent.domain.id");
		consentPolicyId = (String) properties.get("consent.policy.id");
		consentPolicyVersion = (String) properties.get("consent.policy.version");
		consentIdType = (String) properties.get("consent.id.type");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatient(java.lang.String, java.util.Map)
	 */
	@Override
	public PatientResponse getPatient(String id, Map<Object, Object> loadOptions) {
		if (Objects.isNull(id)) {
			return null;
		}
		PatientResponse patientResponse = new PatientResponse();
		List<String> consentIds = gicsService.
				getAllConsentedIdsFor(consentDomainId, consentPolicyId, consentPolicyVersion, consentIdType).
				getReturn().
				getConsentIds();
		EMFRepository repo = repoSO.getService();
		try {
			Patient patient = repo.getEObject(modelPackage.getPatient(), id, loadOptions);
			if(patient != null) {
				patientResponse.getMetadata().put("total.results.before.consent.filter", "1");
			} else {
				patientResponse.getMetadata().put("total.results.before.consent.filter", "0");
			}
			if(consentIds.contains(id)) {
				patientResponse.getMetadata().put("total.results.after.consent.filter", "1");
				patientResponse.setPatient(patient);
			} else {
				patientResponse.getMetadata().put("total.results.after.consent.filter", "0");
			}
		} finally {
			repoSO.ungetService(repo);
		}
		patientResponse.getMetadata().put("consent.filter.domain.id", consentDomainId);
		patientResponse.getMetadata().put("consent.filter.policy.id", consentPolicyId);
		patientResponse.getMetadata().put("consent.filter.policy.version", consentPolicyVersion);
		patientResponse.getMetadata().put("consent.filter.id.type", consentIdType);
		return patientResponse;
	}
	
//	/* 
//	 * (non-Javadoc)
//	 * @see org.avatar.himsa.service.example.api.PatientService#getPatientsByRangeQuery(org.eclipse.emf.ecore.EAttribute, java.lang.Object, java.lang.Object, boolean, boolean, org.eclipse.emf.ecore.EStructuralFeature[][])
//	 */
//	@Override
//	public PatientResponse getPatientsByRangeQuery(EAttribute columnName, Object startValue, Object endValue,
//			boolean isStartIncluded, boolean isEndIncluded, EStructuralFeature[]... projectionFeatures) {
//		
//		List<String> consentIds = gicsService.
//				getAllConsentedIdsFor(consentDomainId, consentPolicyId, consentPolicyVersion, consentIdType).
//				getReturn().
//				getConsentIds();	
//		
//		QueryRepository repo = (QueryRepository) repoSO.getService();
//		try {		
//			IQuery query = repo.
//					createQueryBuilder().
//					rangeQuery().
//					column(columnName).
//					startValue(startValue, isStartIncluded).
//					endValue(endValue, isEndIncluded).
//					build();				
//			IQueryBuilder queryBuilder = repo.createQueryBuilder().and(query);
//			for(EStructuralFeature[] projection : projectionFeatures) {
//				queryBuilder = queryBuilder.projectionPath(projection);
//				
//			}
//			List<Patient> patients = repo.getEObjectsByQuery(modelPackage.getPatient(), queryBuilder.build());
//			List<Patient> filteredPatients = patients.stream().filter(p -> consentIds.contains(p.getPatientGUID())).toList();
//			PatientResponse patientResponse = new PatientResponse();
//			patientResponse.getMetadata().put("total.results.before.consent.filter", String.valueOf(patients.size()));
//			patientResponse.getMetadata().put("total.results.after.consent.filter", String.valueOf(filteredPatients.size()));
//			patientResponse.getMetadata().put("consent.filter.domain.id", consentDomainId);
//			patientResponse.getMetadata().put("consent.filter.policy.id", consentPolicyId);
//			patientResponse.getMetadata().put("consent.filter.policy.version", consentPolicyVersion);
//			patientResponse.getMetadata().put("consent.filter.id.type", consentIdType);
//			patientResponse.getPatients().addAll(filteredPatients);
//			return patientResponse;
//		} finally {
//			repoSO.ungetService(repo);
//		}		
//	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatientsByQuery(org.gecko.emf.repository.query.IQuery, int, int, java.util.List, java.util.Map, org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public PatientResponse getPatientsByQuery(IQuery query, int limit, int skip, List<Sort> sort, Map<Object, Object> loadOptions, 
			EStructuralFeature[]... projectionFeaturePaths) {
		List<String> consentIds = gicsService.
				getAllConsentedIdsFor(consentDomainId, consentPolicyId, consentPolicyVersion, consentIdType).
				getReturn().
				getConsentIds();		
		
		QueryRepository repo = (QueryRepository) repoSO.getService();
		try {
			IQuery consentQuery = repo.createQueryBuilder().column(modelPackage.getPatient_PatientGUID()).in(consentIds.toArray()).build();
			IQueryBuilder queryBuilderNoFilter = repo.createQueryBuilder().and(query);
			IQueryBuilder queryBuilderFilter = repo.createQueryBuilder().and(query, consentQuery);
			for(EStructuralFeature[] projection : projectionFeaturePaths) {
				queryBuilderNoFilter = queryBuilderNoFilter.projectionPath(projection);
				queryBuilderFilter = queryBuilderFilter.projectionPath(projection);
			}
			for(Query.Sort s : sort) {
				queryBuilderNoFilter = queryBuilderNoFilter.sort(s.sortAttribute(), "ASC".equals(s.sortOrder()) ? SortType.ASCENDING : SortType.DESCENDING);
				queryBuilderFilter = queryBuilderFilter.sort(s.sortAttribute(), "ASC".equals(s.sortOrder()) ? SortType.ASCENDING : SortType.DESCENDING);
			}
			List<Patient> patients =  repo.getEObjectsByQuery(modelPackage.getPatient(), queryBuilderNoFilter.limit(limit).skip(skip).build(), loadOptions);
			List<Patient> filteredPatients = repo.getEObjectsByQuery(modelPackage.getPatient(), queryBuilderFilter.limit(limit).skip(skip).build(), loadOptions);
			PatientResponse patientResponse = new PatientResponse();
			patientResponse.getMetadata().put("total.results.before.consent.filter", String.valueOf(patients.size()));
			patientResponse.getMetadata().put("total.results.after.consent.filter", String.valueOf(filteredPatients.size()));
			patientResponse.getMetadata().put("consent.filter.domain.id", consentDomainId);
			patientResponse.getMetadata().put("consent.filter.policy.id", consentPolicyId);
			patientResponse.getMetadata().put("consent.filter.policy.version", consentPolicyVersion);
			patientResponse.getMetadata().put("consent.filter.id.type", consentIdType);
			patientResponse.getPatients().addAll(filteredPatients);
			return patientResponse;
		} finally {
			repoSO.ungetService(repo);
		}
	}
}
