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

import java.nio.file.Path;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.patient.service.api.PatientAnonymizationService;
import org.avatar.himsa.patient.service.api.PatientDataQualityService;
import org.avatar.himsa.patient.service.api.PatientService;
import org.avatar.himsa.patient.service.api.PatientService.PatientResponse;
import org.avatar.himsa.patient.service.api.QueryHelper;
import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.DataSpaceService;
import org.avatar.provider.backend.api.DataStorageService;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.metadata.MetadataFactory;
import de.avatar.metadata.ResponseMetadata;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.query.Operation;
import de.avatar.query.QSubject;
import de.avatar.query.Query;
import de.avatar.status.QueryRequest;

/**
 * 
 * @author ilenia
 * @since Feb 6, 2025
 */
@Component(name = "PatientQueryRequestExecutorService")
public class PatientQueryRequestExecutorServiceImpl implements QueryRequestExecutorService{

	private static final Logger LOGGER = Logger.getLogger(PatientQueryRequestExecutorServiceImpl.class.getName());
	
	private PatientService patientService;
	private ComponentServiceObjects<EMFRepository> repoSO;
	private PatientAnonymizationService anonymizationService;
	private PatientDataQualityService dataQualityService;
	private DataStorageService jsonDataStorage;
	private DataStorageService xmlDataStorage;
	private DataSpaceService dataSpaceService;


	@Activate
	public PatientQueryRequestExecutorServiceImpl(@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientService patientService, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientAnonymizationService anonymizationService, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientDataQualityService dataQualityService, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<EMFRepository> repoSO, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=json)") DataStorageService jsonDataStorage,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=xml)") DataStorageService xmlDataStorage, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) DataSpaceService dataSpaceService) throws ParseException {
		this.patientService = patientService;
		this.anonymizationService = anonymizationService;
		this.dataQualityService = dataQualityService;
		this.repoSO = repoSO;
		this.jsonDataStorage = jsonDataStorage;
		this.xmlDataStorage = xmlDataStorage;
		this.dataSpaceService = dataSpaceService;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.QueryRequestExecutorService#executeQueryRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeQueryRequest(QueryRequest queryRequest) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		QueryTask task = new QueryTask(queryRequest);
		try {
			Future<EndpointResponse> submit = executor.submit(task);
			EndpointResponse response = submit.get();
			return response;
		} catch(Exception e) {
			return task.createErrorResponse(queryRequest.getRequestId(), e);
		} finally {
			executor.shutdown();
		}		
	}
	
	class QueryTask implements Callable<EndpointResponse> {
		
		private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'")
				.withZone(ZoneId.of("Europe/Berlin"));
		
		private Query query;
		private String requestId;
		private String contentType;

		public QueryTask(QueryRequest queryRequest) {
			this.requestId = queryRequest.getRequestId();
			this.query = queryRequest.getQuery();
			this.contentType = queryRequest.getContentType();
		}

		/* 
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@SuppressWarnings("unchecked")
		@Override
		public EndpointResponse call() throws Exception {
			EndpointResponse response;
			
			try {
				IQuery iQuery = QueryHelper.buildQuery(query, repoSO);
				EStructuralFeature[][] projections =  new EStructuralFeature[query.getSubject().size()][];
				int i = 0;
				for(QSubject subj : query.getSubject()) {
					projections[i] = subj.getFeaturePath().getFeature().toArray(new EStructuralFeature[subj.getFeaturePath().getFeature().size()]);
					i++;
				}
				PatientResponse patientResponse = patientService.getPatientsByQuery(iQuery, query.getLimit(), query.getSkip(), query.getSortBy(), projections);
				applyPostOperations(patientResponse.getPatients(), query.getSubject());
				
				LOGGER.info(String.format("Start data quality..."));		
				patientResponse.getMetadata().add(dataQualityService.getDataQualityMetadataForPatients(patientResponse.getPatients(), projections));
				
				LOGGER.info(String.format("Start anonymizing data..."));
				List<Patient> anonymizedPatients = (List<Patient>) anonymizationService.anonymizeEObjects(patientResponse.getPatients());
				patientResponse.getMetadata().add(anonymizationService.getAnonymizationMetadataForFeatures(projections));
				
				PatientResponse anonymResponse = new PatientResponse(anonymizedPatients, patientResponse.getMetadata());
				
				response = AConnectorFactory.eINSTANCE.createEndpointResponse();
				response.setSourceId(requestId);
				addResponseMetadata(response, requestId);
				if(anonymResponse.getPatients().isEmpty()) {
					response.setCode(ResponseCode.NO_CONTENT);
				} else {
					response.setCode(ResponseCode.OK);
					org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
					emfResponse.getData().addAll(anonymResponse.getPatients());
					EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
					result.setValue(emfResponse);
					response.setResult(result);		
					response.getMetadata().addAll(anonymResponse.getMetadata());					
				}			
				
			} catch(Exception e) {
				response = createErrorResponse(requestId, e);
			} 
			LOGGER.info(String.format("Start saving data..."));
			try {
				Path dataFilePath = null;
				switch(contentType) {
				case "json", "application/json": default:
					dataFilePath = jsonDataStorage.saveEndpointResponse(response);
					
					break;
				case "xml", "application/xml", "text/xml":
					dataFilePath = xmlDataStorage.saveEndpointResponse(response);
					break;			
				}
				if(dataFilePath != null) {
					LOGGER.info(String.format("Start creating asset..."));
					dataSpaceService.createAssetInDataSpace(requestId, dataFilePath, "Asset for Patient Query Result");
				}				
			} catch(Exception e) {
				response = createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while saving the data", e));
			}
			return response;
		}
		
		private EndpointResponse createErrorResponse(String requestId, Throwable errCause) {
			EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
			addResponseMetadata(response, requestId);
			response.setSourceId(requestId);
			response.setCode(ResponseCode.ERROR);
			ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
			errRes.setError(errCause.getMessage());
			errRes.setErrorText(errCause.getMessage());
			response.setResult(errRes);
			return response;
		}
		
		private void addResponseMetadata(EndpointResponse response, String requestId) {
			ResponseMetadata metadata = MetadataFactory.eINSTANCE.createResponseMetadata();
			metadata.setId(UUID.randomUUID().toString());
			metadata.setRequestId(requestId);
			if(response.getId() == null) response.setId(UUID.randomUUID().toString());
			metadata.setResponseId(response.getId());
			response.setTimestamp(Instant.now().toEpochMilli());
			metadata.setResponseTime(DATE_TIME_FORMATTER.format(Instant.ofEpochMilli(response.getTimestamp())));
			response.getMetadata().add(metadata);
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
}
