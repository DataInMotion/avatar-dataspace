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
package org.avatar.other.backend;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.patient.service.api.PatientAnonymizationService;
import org.avatar.himsa.patient.service.api.PatientDataQualityService;
import org.avatar.himsa.patient.service.api.PatientService;
import org.avatar.himsa.patient.service.api.PatientService.PatientResponse;
import org.avatar.himsa.patient.service.api.QueryHelper;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.osgi.service.component.ComponentServiceObjects;

import de.avatar.query.Operation;
import de.avatar.query.QSubject;



/**
 * 
 * @author ilenia
 * @since Feb 6, 2025
 */
public class RequestExecutor implements Callable<PatientResponse> {

	private static final Logger LOGGER = Logger.getLogger(RequestExecutor.class.getName());	
	private PatientService patientService;
	private de.avatar.query.Query query;

	Map<Object, Object> loadOptions = new HashMap<>();
	private ComponentServiceObjects<EMFRepository> repoSO;
	private PatientAnonymizationService anonymizationService;
	private PatientDataQualityService dataQualityService;



	public RequestExecutor(de.avatar.query.Query query, PatientService patientService, PatientAnonymizationService anonymizationService, 
			PatientDataQualityService dataQualityService, ComponentServiceObjects<EMFRepository> repoSO) throws ParseException {
		this.query = query;
		this.patientService = patientService;
		this.anonymizationService = anonymizationService;
		this.dataQualityService = dataQualityService;
		this.repoSO = repoSO;
	}

	/* 
	 * (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public PatientResponse call() throws Exception {
		IQuery iQuery = QueryHelper.buildQuery(query, repoSO);
		EStructuralFeature[][] projections =  new EStructuralFeature[query.getSubject().size()][];
		int i = 0;
		for(QSubject subj : query.getSubject()) {
			projections[i] = subj.getFeaturePath().getFeature().toArray(new EStructuralFeature[subj.getFeaturePath().getFeature().size()]);
			i++;
		}
		Map<Object, Object> loadOptions = new HashMap<>();
		loadOptions.put(Options.OPTION_COLLECTION_NAME, "Patient");
		PatientResponse response = patientService.getPatientsByQuery2(iQuery, query.getLimit(), query.getSkip(), query.getSortBy(), loadOptions, projections);
		applyPostOperations(response.getPatients(), query.getSubject());
		
		LOGGER.info(String.format("Start data quality..."));		
		response.getMetadata().add(dataQualityService.getDataQualityMetadataForPatients(response.getPatients(), projections));
		
		LOGGER.info(String.format("Start anonymizing data..."));
		List<Patient> anonymizedPatients = (List<Patient>) anonymizationService.anonymizeEObjects(response.getPatients());
		response.getMetadata().add(anonymizationService.getAnonymizationMetadataForFeatures(projections));
		
		PatientResponse anonymResponse = new PatientResponse(anonymizedPatients, response.getMetadata());
		return anonymResponse;
	}




	private void applyPostOperations(List<Patient> patients, List<QSubject> subjects) {

		for(Patient patient : patients) {
			for(QSubject subj : subjects) {
				EStructuralFeature feature = subj.getFeaturePath().getFeature().get(subj.getFeaturePath().getFeature().size()-1);
				patient.eSet(feature, doApplyPostOperation(patient.eGet(feature), subj.getOperation()));
			}
		}		
	}

	private Object doApplyPostOperation(Object featureValue, Operation operation) {
		if(operation == null) return featureValue;
		switch(operation.eClass().getName()) {
		case "ToLowerCase":
			return ((String) featureValue).toLowerCase();
		case "ToUpperCase":
			return ((String) featureValue).toUpperCase();		
		}
		LOGGER.warning(String.format("Post Query Operation %s currently not supported. Ignoring it!", operation.eClass().getName()));
		return featureValue;
	}

}
