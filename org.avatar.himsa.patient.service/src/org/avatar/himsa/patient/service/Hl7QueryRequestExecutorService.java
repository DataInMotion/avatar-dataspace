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
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import org.avatar.ds.model.dataspace.DataSpaceResponse;
import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.hl7.dummy.data.component.Hl7DummyDataComponent;
import org.avatar.provider.backend.api.DataSpaceService;
import org.avatar.provider.backend.api.DataStorageService;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.hl7.fhir.DomainResource;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
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
@Component(name = "Hl7QueryRequestExecutorService")
public class Hl7QueryRequestExecutorService implements QueryRequestExecutorService {

	private static final Logger LOGGER = Logger.getLogger(Hl7QueryRequestExecutorService.class.getName());
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


	private DataStorageService jsonDataStorage;
	private DataStorageService xmlDataStorage;
	private DataSpaceService dataSpaceService;
	private Hl7DummyDataComponent dummyDataComponent;


	@Activate
	public Hl7QueryRequestExecutorService(
			@Reference(cardinality = ReferenceCardinality.MANDATORY) Hl7DummyDataComponent dummyDataComponent,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=json)") DataStorageService jsonDataStorage,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(data.format=xml)") DataStorageService xmlDataStorage, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) DataSpaceService dataSpaceService
			) throws ParseException {
	
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
			return task.createErrorResponse(queryRequest.getRequestId(), e);
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

		/* 
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public EndpointResponse call() throws Exception {

			boolean exists = "json".equals(contentType) ? jsonDataStorage.existEndpointResponse(requestId) : xmlDataStorage.existEndpointResponse(requestId);
			if(exists) {
				return createErrorResponse(requestId, new IllegalArgumentException(String.format("A query with id %s for format %s has already been sent and data are already available", requestId, contentType)));
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
					
				response = AConnectorFactory.eINSTANCE.createEndpointResponse();
				response.setSourceId(requestId);
				addResponseMetadata(response, requestId);
				response.getMetadata().add(getConsentMetadata(resources.size()));
				response.getMetadata().add(connectorMetadata);
				
				if(resources.isEmpty()) {
					response.setCode(ResponseCode.NO_CONTENT);
				} else {
					response.setCode(ResponseCode.OK);
					org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
					emfResponse.getData().addAll(resources);
					EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
					result.setValue(emfResponse);
					response.setResult(result);						
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
							return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while creating a new Asset in the DataSpace"));
						}
					}				
				} catch(Exception e) {
					return createErrorResponse(requestId, new IllegalArgumentException("Query was successfull but there was an error while saving the data", e));
				}
				return response;

			} catch(Exception e) {
				LOGGER.severe(String.format("Error when querying for Query %s", requestId));
				return createErrorResponse(requestId, e);
			} 			
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

	
	}
	
	private ConsentMetadata getConsentMetadata(int resourcesSize) {
		ConsentMetadata metadata = MetadataFactory.eINSTANCE.createConsentMetadata();
		metadata.setResultsBeforeConsentFilter(50);
		metadata.setResultsAfterConsentFilter(resourcesSize/4);
		ConsentInfo consentInfo = MetadataFactory.eINSTANCE.createConsentInfo();
		consentInfo.setDomainId("avatar");
		consentInfo.setPolicyId("medical_history_policy");
		consentInfo.setPolicyVersion("1.0");
		consentInfo.setConsentIdType("Patient ID");
		metadata.setConsentInfo(consentInfo);
		return metadata;
	}

}
