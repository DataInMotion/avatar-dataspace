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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import org.avatar.ds.model.dataspace.DataSpaceResponse;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.patient.service.api.PatientService;
import org.avatar.himsa.patient.service.api.PatientService.PatientResponse;
import org.avatar.himsa.patient.service.api.QueryHelper;
import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.hl7.dummy.data.component.FHIRHelper;
import org.avatar.hl7.dummy.data.component.Hl7DummyDataComponent;
import org.avatar.provider.backend.api.DataSpaceService;
import org.avatar.provider.backend.api.DataStorageService;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.hl7.fhir.Condition;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Observation;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.ConsentInfo;
import de.avatar.metadata.ConsentMetadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.metadata.ResponseMetadata;
import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.AConnectorPackage;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.query.DateComparator;
import de.avatar.query.EnumComparator;
import de.avatar.query.IsAfter;
import de.avatar.query.IsAfterOrEqual;
import de.avatar.query.IsBefore;
import de.avatar.query.IsBeforeOrEqual;
import de.avatar.query.QWhere;
import de.avatar.query.Query;
import de.avatar.query.StringComparator;
import de.avatar.status.QueryRequest;

/**
 * 
 * @author ilenia
 * @since Aug 27, 2025
 */
@Component(name = "Hl7QueryRequestExecutorService", configurationPid = {"DataLoadOptions"}, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class Hl7QueryRequestExecutorService implements QueryRequestExecutorService {

	private static final Logger LOGGER = Logger.getLogger(Hl7QueryRequestExecutorService.class.getName());
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


	private DataStorageService jsonDataStorage;
	private DataStorageService xmlDataStorage;
	private DataSpaceService dataSpaceService;
	private Hl7DummyDataComponent dummyDataComponent;
	private PatientService patientService;
//	private PatientAnonymizationService anonymizationService;
//	private PatientDataQualityService dataQualityService;
	private ComponentServiceObjects<EMFRepository> repoSO;
	private Map<String, Object> properties;


	@Activate
	public Hl7QueryRequestExecutorService(Map<String, Object> properties,
			@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientService patientService, 
//			@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientAnonymizationService anonymizationService, 
//			@Reference(cardinality = ReferenceCardinality.MANDATORY) PatientDataQualityService dataQualityService, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<EMFRepository> repoSO, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) Hl7DummyDataComponent dummyDataComponent,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=json)") DataStorageService jsonDataStorage,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=xml)") DataStorageService xmlDataStorage, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) DataSpaceService dataSpaceService
			) throws ParseException {

		this.properties = properties;
		this.patientService = patientService;
//		this.anonymizationService = anonymizationService;
//		this.dataQualityService = dataQualityService;
		this.repoSO = repoSO;
		this.dummyDataComponent = dummyDataComponent;
		this.jsonDataStorage = jsonDataStorage;
		this.xmlDataStorage = xmlDataStorage;
		this.dataSpaceService = dataSpaceService;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.QueryRequestExecutorService#executeQueryRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeQueryRequest(QueryRequest queryRequest, ConnectorMetadata connectorMetadata) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		QueryTask task = new QueryTask(queryRequest, "request", connectorMetadata);
		try {
			Future<EndpointResponse> submit = executor.submit(task);
			EndpointResponse response = submit.get();
			return response;
		} catch(Exception e) {
			return task.createErrorResponse(queryRequest.getRequestId(), e, connectorMetadata);
		} finally {
			executor.shutdown();
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.patient.service.api.QueryRequestExecutorService#executeDryRunRequest(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeDryRunRequest(QueryRequest queryRequest, ConnectorMetadata connectorMetadata) {
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	class QueryTask implements Callable<EndpointResponse> {

		private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'")
				.withZone(ZoneId.of("Europe/Berlin"));

		private Query query;
		private String requestId;
		private String contentType;

		private ConnectorMetadata connectorMetadata;

		public QueryTask(QueryRequest queryRequest, String requestType, ConnectorMetadata connectorMetadata) {
			this.connectorMetadata = connectorMetadata;
			Objects.requireNonNull(queryRequest, "QueryRequest cannot be null!");
			Objects.requireNonNull(queryRequest.getRequestId(), "Request id cannot be null!");
			Objects.requireNonNull(queryRequest.getQuery(), "Query cannot be null!");
			this.requestId = queryRequest.getRequestId();
			this.query = queryRequest.getQuery();
			switch(queryRequest.getContentType()) {
			case "json", "application/json": default:
				contentType = "json";			
				break;
			case "xml", "application/xml", "text/xml":
				contentType = "xml";
			break;			
			}
		}

		//		/* 
		//		 * (non-Javadoc)
		//		 * @see java.util.concurrent.Callable#call()
		//		 */
		//		@Override
		//		public EndpointResponse call() throws Exception {
		//
		//			boolean exists = "json".equals(contentType) ? jsonDataStorage.existEndpointResponse(requestId) : xmlDataStorage.existEndpointResponse(requestId);
		//			if(exists) {
		//				return createErrorResponse(requestId, new IllegalArgumentException(String.format("A query with id %s for format %s has already been sent and data are already available", requestId, contentType)));
		//			}
		//			EndpointResponse response;
		//
		//			try {
		//				Date minBithDate = null, maxBirthDate = null;
		//				String gender = null, observationCode = null;
		//				for(QWhere where : query.getWhere()) {
		//					if(where.getComparator() instanceof DateComparator dateComparator) {
		//						if(dateComparator instanceof IsBefore || dateComparator instanceof IsBeforeOrEqual) {
		//							maxBirthDate = DATE_FORMAT.parse(dateComparator.getValue());
		//						} else if(dateComparator instanceof IsAfter || dateComparator instanceof IsAfterOrEqual) {
		//							minBithDate = DATE_FORMAT.parse(dateComparator.getValue());
		//						}
		//					}
		//					else if(where.getComparator() instanceof EnumComparator enumComparator) {
		//						gender = enumComparator.getValue();
		//					} else if(where.getComparator() instanceof StringComparator strComparator) {
		//						observationCode = strComparator.getValue();
		//					}
		//				}
		//				LOGGER.info(String.format("Start retrieving data..."));
		//				List<DomainResource> resources = dummyDataComponent.generateDomainResources(50, gender, minBithDate, maxBirthDate, observationCode);
		//					
		//				response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		//				response.setSourceId(requestId);
		//				addResponseMetadata(response, requestId);
		//				response.getMetadata().add(getConsentMetadata(resources.size()));
		//				response.getMetadata().add(connectorMetadata);
		//				
		//				if(resources.isEmpty()) {
		//					response.setCode(ResponseCode.NO_CONTENT);
		//				} else {
		//					response.setCode(ResponseCode.OK);
		//					org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
		//					emfResponse.getData().addAll(resources);
		//					EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
		//					result.setValue(emfResponse);
		//					response.setResult(result);						
		//				}	
		//				LOGGER.info(String.format("Start saving data..."));
		//				try {
		//					String dataFileUrl = null;
		//					switch(contentType) {
		//					case "json":
		//						dataFileUrl = jsonDataStorage.saveEndpointResponse(response);					
		//						break;
		//					case "xml":
		//						dataFileUrl = xmlDataStorage.saveEndpointResponse(response);
		//					break;			
		//					}
		//					//					Unset the data now because we do not want to send it back
		//					response.eUnset(AConnectorPackage.Literals.ENDPOINT_RESPONSE__RESULT);
		//					if(dataFileUrl != null) {
		//						LOGGER.info(String.format("Start creating asset..."));
		//						DataSpaceResponse dsResponse = dataSpaceService.createAssetInDataSpace(requestId, dataFileUrl, contentType, "Asset for Patient Query Result");
		//						if(dsResponse == null) {
		//							return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while creating a new Asset in the DataSpace"));
		//						}
		//					}				
		//				} catch(Exception e) {
		//					return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while saving the data", e));
		//				}
		//				return response;
		//
		//			} catch(Exception e) {
		//				LOGGER.severe(String.format("Error when querying for Query %s", requestId));
		//				return createErrorResponse(requestId, e);
		//			} 			
		//		}

		/* 
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public EndpointResponse call() throws Exception {

			boolean exists = "json".equals(contentType) ? jsonDataStorage.existEndpointResponse(requestId) : xmlDataStorage.existEndpointResponse(requestId);
			if(exists) {
				return createDataAlreadyAvailableResponse(requestId, connectorMetadata);
//				return createErrorResponse(requestId, new IllegalArgumentException(String.format("A query with id %s for format %s has already been sent and data are already available", requestId, contentType)));
			}
			EndpointResponse response;

			try {
				Date minBithDate = null, maxBirthDate = null;
				String gender = null, observationCode = null;
				for(QWhere where : query.getWhere()) {
					if(where.getComparator() instanceof DateComparator dateComparator) {
						if(dateComparator instanceof IsBefore || dateComparator instanceof IsBeforeOrEqual) {
							maxBirthDate = DATE_FORMAT.parse(dateComparator.getValue());
						} else if(dateComparator instanceof IsAfter || dateComparator instanceof IsAfterOrEqual) {
							minBithDate = DATE_FORMAT.parse(dateComparator.getValue());
						}
					}
					else if(where.getComparator() instanceof EnumComparator enumComparator) {
						gender = enumComparator.getValue();
					} else if(where.getComparator() instanceof StringComparator strComparator) {
						observationCode = strComparator.getValue();
					}
				}
				LOGGER.info(String.format("Start retrieving data..."));
				List<DomainResource> resources = dummyDataComponent.generateDomainResources(50, gender, minBithDate, maxBirthDate, observationCode);
				List<DomainResource> finalResources = new ArrayList<>(resources.size());
				for(DomainResource r : resources) {
					if(r instanceof org.hl7.fhir.Patient hl7Patient) {
						hl7Patient.eUnset(FHIRPackage.eINSTANCE.getPatient_BirthDate());
					}
					finalResources.add(r);
				}
				convertToHismaQuery(query);

				IQuery iQuery = QueryHelper.buildQuery(query, repoSO);
				EStructuralFeature[][] projections =  new EStructuralFeature[1][];
				projections[0] = new EStructuralFeature[] {PatientExportPackage.Literals.PATIENT__PATIENT_GUID};
				PatientResponse himsaResponse = patientService.getPatientsByQuery(iQuery, query.getLimit(), query.getSkip(), query.getSortBy(), projections);
				
				response = AConnectorFactory.eINSTANCE.createEndpointResponse();
				response.getMetadata().add(connectorMetadata);
				response.setSourceId(requestId);
				addResponseMetadata(response, requestId);
//				response.getMetadata().addAll(himsaResponse.getMetadata());
				ConsentMetadata himsaConsentMetadata = ((ConsentMetadata) himsaResponse.getMetadata().get(0));
				
				if(himsaResponse.getPatients().isEmpty() && finalResources.isEmpty()) {
					response.setCode(ResponseCode.NO_CONTENT);
				} else {
					response.setCode(ResponseCode.OK);
					org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
					QueryRepository repo = (QueryRepository) repoSO.getService();
					Map<Object, Object> loadOptions = new HashMap<>();
					if(properties.containsKey("hl7.collection.name")) loadOptions.put(Options.OPTION_COLLECTION_NAME, (String) properties.get("hl7.collection.name"));
					
					try {
						for(Patient patient : himsaResponse.getPatients()) {
							org.hl7.fhir.Patient hl7Patient = repo.getEObject(FHIRPackage.eINSTANCE.getPatient(), patient.getPatientGUID(), loadOptions);
							if(hl7Patient != null) {
								String encounterId = UUID.randomUUID().toString();
								Observation observation = FHIRHelper.generateObservation(hl7Patient.getId().getValue(), encounterId, null);
								Condition condition = FHIRHelper.generateCondition(hl7Patient.getId().getValue(), observation.getCode().getCoding().get(0).getCode().getValue());
								Encounter encounter = FHIRHelper.generateEncounter(hl7Patient.getId().getValue(), encounterId);
								hl7Patient.eUnset(FHIRPackage.eINSTANCE.getPatient_BirthDate());
								emfResponse.getData().add(hl7Patient);
								emfResponse.getData().add(observation);
								emfResponse.getData().add(condition);
								emfResponse.getData().add(encounter);	
							}
						}
						emfResponse.getData().addAll(finalResources);
						EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
						result.setValue(emfResponse);
						
						response.getMetadata().add(getConsentMetadata(50+himsaConsentMetadata.getResultsBeforeConsentFilter(), (resources.size()/4)+himsaConsentMetadata.getResultsAfterConsentFilter()));
						response.setResult(result);		
					} finally {
						repoSO.ungetService(repo);
					}
					
				}
				
				LOGGER.info(String.format("Start saving data..."));
				try {
					String dataFileUrl = null;
					switch(contentType) {
					case "json":
						dataFileUrl = jsonDataStorage.saveEndpointResponse(response);					
						break;
					case "xml":
						dataFileUrl = xmlDataStorage.saveEndpointResponse(response);
						break;			
					}
					//					Unset the data now because we do not want to send it back
					response.eUnset(AConnectorPackage.Literals.ENDPOINT_RESPONSE__RESULT);
					if(dataFileUrl != null) {
						LOGGER.info(String.format("Start creating asset..."));
						DataSpaceResponse dsResponse = dataSpaceService.createAssetInDataSpace(requestId, dataFileUrl, contentType, "Asset for Patient Query Result");
						if(dsResponse == null) {
							return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while creating a new Asset in the DataSpace"), connectorMetadata);
						}
					}				
				} catch(Exception e) {
					return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while saving the data", e), connectorMetadata);
				}
				return response;

			} catch(Exception e) {
				LOGGER.severe(String.format("Error when querying for Query %s", requestId));
				return createErrorResponse(requestId, e, connectorMetadata);
			} 			
		}

		/**
		 * @param query2
		 * @return
		 */
		private void convertToHismaQuery(Query hl7Query) {
			for(QWhere where : hl7Query.getWhere()) {
				if(where.getComparator() instanceof DateComparator dateComparator) {
					where.getFeaturePath().getFeature().clear();
					where.getFeaturePath().getFeature().add(PatientExportPackage.Literals.PATIENT__BIRTH_DATE);
				}
				else if(where.getComparator() instanceof EnumComparator enumComparator) {
					where.getFeaturePath().getFeature().clear();
					where.getFeaturePath().getFeature().add(PatientExportPackage.Literals.PATIENT__GENDER);
					enumComparator.setValue(convertGenderEnumValue(enumComparator.getValue()));
				} 
			}
		}

		/**
		 * @param value
		 * @return
		 */
		private String convertGenderEnumValue(String hl7GenderValue) {
			switch(hl7GenderValue) {
			case "male":
				return "Male";
			case "female":
				return "Female";
			default:
				return "NotRecorded";
			}
		}
		
		private EndpointResponse createDataAlreadyAvailableResponse(String requestId, ConnectorMetadata connectorMetadata) {
			EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
			addResponseMetadata(response, requestId);
			response.getMetadata().add(connectorMetadata);
			response.setSourceId(requestId);
			response.setCode(ResponseCode.OK);
			return response;
		}

		private EndpointResponse createErrorResponse(String requestId, Throwable errCause, ConnectorMetadata connectorMetadata) {
			EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
			addResponseMetadata(response, requestId);
			response.getMetadata().add(connectorMetadata);
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
	}

	private ConsentMetadata getConsentMetadata(int before, int after) {
		ConsentMetadata metadata = MetadataFactory.eINSTANCE.createConsentMetadata();
		metadata.setResultsBeforeConsentFilter(before);
		metadata.setResultsAfterConsentFilter(after);
		ConsentInfo consentInfo = MetadataFactory.eINSTANCE.createConsentInfo();
		consentInfo.setDomainId("avatar");
		consentInfo.setPolicyId("medical_history_policy");
		consentInfo.setPolicyVersion("1.0");
		consentInfo.setConsentIdType("Patient ID");
		metadata.setConsentInfo(consentInfo);
		return metadata;
	}

}
