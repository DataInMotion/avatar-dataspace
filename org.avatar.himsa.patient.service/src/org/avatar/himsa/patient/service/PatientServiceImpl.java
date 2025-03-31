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
import org.eclipse.emf.ecore.EAttribute;
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

import de.avatar.metadata.ConsentInfo;
import de.avatar.metadata.ConsentMetadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.query.SortEntity;

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
		ConsentMetadata metadata = MetadataFactory.eINSTANCE.createConsentMetadata();
		try {
			Patient patient = repo.getEObject(modelPackage.getPatient(), id, loadOptions);
			if(patient != null) {
				metadata.setResultsBeforeConsentFilter(1);
			} else {
				metadata.setResultsBeforeConsentFilter(0);
			}
			if(consentIds.contains(id)) {
				metadata.setResultsAfterConsentFilter(1);
				patientResponse.setPatient(patient);
			} else {
				metadata.setResultsAfterConsentFilter(0);
			}
		} finally {
			repoSO.ungetService(repo);
		}
		ConsentInfo consentInfo = MetadataFactory.eINSTANCE.createConsentInfo();
		consentInfo.setDomainId(consentDomainId);
		consentInfo.setPolicyId(consentPolicyId);
		consentInfo.setPolicyVersion(consentPolicyVersion);
		consentInfo.setConsentIdType(consentIdType);
		metadata.setConsentInfo(consentInfo);
		patientResponse.getMetadata().add(metadata);
		return patientResponse;
	}
	


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.PatientService#getPatientsByQuery2(org.gecko.emf.repository.query.IQuery, int, int, java.util.List, java.util.Map, org.eclipse.emf.ecore.EStructuralFeature[][])
	 */
	@Override
	public PatientResponse getPatientsByQuery(IQuery query, int limit, int skip, List<SortEntity> sort,
			Map<Object, Object> loadOptions, EStructuralFeature[]... projectionFeaturePaths) {
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
				System.out.println("Projection in query " + projection);
				queryBuilderNoFilter = queryBuilderNoFilter.projectionPath(projection);
				queryBuilderFilter = queryBuilderFilter.projectionPath(projection);
			}
			for(SortEntity s : sort) {
				queryBuilderNoFilter = queryBuilderNoFilter.sort((EAttribute)s.getSortFeature(), "ASC".equals(s.getSortOrder().toString()) ? SortType.ASCENDING : SortType.DESCENDING);
				queryBuilderFilter = queryBuilderFilter.sort((EAttribute)s.getSortFeature(), "ASC".equals(s.getSortOrder().toString()) ? SortType.ASCENDING : SortType.DESCENDING);
			}
			List<Patient> patients =  repo.getEObjectsByQuery(modelPackage.getPatientType1(), queryBuilderNoFilter.limit(limit).skip(skip).build(), loadOptions);
			List<Patient> filteredPatients = repo.getEObjectsByQuery(modelPackage.getPatientType1(), queryBuilderFilter.limit(limit).skip(skip).build(), loadOptions);
			PatientResponse patientResponse = new PatientResponse();
			ConsentMetadata metadata = MetadataFactory.eINSTANCE.createConsentMetadata();
			metadata.setResultsBeforeConsentFilter(patients.size());
			metadata.setResultsAfterConsentFilter(filteredPatients.size());
			ConsentInfo consentInfo = MetadataFactory.eINSTANCE.createConsentInfo();
			consentInfo.setDomainId(consentDomainId);
			consentInfo.setPolicyId(consentPolicyId);
			consentInfo.setPolicyVersion(consentPolicyVersion);
			consentInfo.setConsentIdType(consentIdType);
			metadata.setConsentInfo(consentInfo);
			patientResponse.getMetadata().add(metadata);
			patientResponse.getPatients().addAll(filteredPatients);
			return patientResponse;
		} finally {
			repoSO.ungetService(repo);
		}
	}
}
