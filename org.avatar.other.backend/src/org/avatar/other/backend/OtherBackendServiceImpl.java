package org.avatar.other.backend;

import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

import org.avatar.himsa.patient.service.api.PatientService;
import org.avatar.himsa.patient.service.api.QueryHelperService;
import org.avatar.himsa.patient.service.api.PatientService.PatientResponse;
import org.avatar.other.backend.api.OtherBackendService;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.Metadata;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;

@Component(name = "OtherBackendService")
public class OtherBackendServiceImpl implements OtherBackendService{
	
	@Reference
	private PatientService patientService;

	@Reference
	private QueryHelperService queryHelperService;

	private static Map<String, Promise<PatientResponse>> REQUEST_PROMISE_MAP = new ConcurrentHashMap<>();
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'")
			.withZone(ZoneId.systemDefault());

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.other.backend.api.OtherBackendApi#executeQuery(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String[], int, int)
	 */
	@Override
	public EndpointResponse executeQuery(String requestId, String[] where, String[] subjects, String[] sort, int limit,
			int skip) {
		Promise<PatientResponse> promise = getPromiseResult(where, subjects, sort, limit, skip);
		REQUEST_PROMISE_MAP.put(requestId, promise);

		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(UUID.randomUUID().toString());
		response.setCode(ResponseCode.PENDING);
		PendingResult pendingRes = AConnectorFactory.eINSTANCE.createPendingResult();
		pendingRes.setEstRuntime(new Random().nextInt(300 - 5) + 5);
		response.setResult(pendingRes);
		return response;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.other.backend.api.OtherBackendApi#executeDryRun(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String[], int, int)
	 */
	@Override
	public EndpointResponse executeDryRun(String requestId, String[] where, String[] subjects, String[] sort, int limit,
			int skip) {
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setCode(ResponseCode.DRYRUN_OK);
		response.setTimestamp(Instant.now().toEpochMilli());
		DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
		result.setEstRuntime(new Random().nextInt(300 - 5) + 5);
		result.setResultCount(new Random().nextInt(300 - 5) + 5);
		response.setResult(result);
		return response;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.other.backend.api.OtherBackendApi#executeStatus(java.lang.String)
	 */
	@Override
	public EndpointResponse executeStatus(String requestId) {
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setTimestamp(Instant.now().toEpochMilli());

		Promise<PatientResponse> promise = REQUEST_PROMISE_MAP.get(requestId);
		if(promise == null) {
			System.out.println("Status ERROR");
			response.setCode(ResponseCode.ERROR);
			ErrorResult errResult = AConnectorFactory.eINSTANCE.createErrorResult();
			errResult.setError(String.format("No query is running for request %s", requestId));
			response.setResult(errResult);
			return response;
		}

		if(!promise.isDone()) {
			System.out.println("Status PENDING");
			response.setCode(ResponseCode.PENDING);
			PendingResult pendingResult = AConnectorFactory.eINSTANCE.createPendingResult();
			pendingResult.setEstRuntime(new Random().nextInt(300 - 5) + 5);
			response.setResult(pendingResult);
			return response;
		}
		else {
			try {
				if(promise.getFailure() != null) {
					System.out.println("Status DONE BUT ERROR");
					response.setCode(ResponseCode.ERROR);
					ErrorResult errResult = AConnectorFactory.eINSTANCE.createErrorResult();					
					errResult.setError(String.format("Query failed for request %s with msg %s", requestId, promise.getFailure().getMessage() != null ? promise.getFailure().getMessage() : promise.getFailure().getCause() != null ? promise.getFailure().getCause().getMessage() : promise.getFailure().getStackTrace()));
					response.setResult(errResult);			
				} else {
					System.out.println("Status SUCCESS");
					PatientResponse patientResponse = promise.getValue();
					addResponseMetadata(response, patientResponse.getMetadata());
					if(patientResponse.getPatients().isEmpty()) {
						response.setCode(ResponseCode.NO_CONTENT);
					} else {
						response.setCode(ResponseCode.OK);
						org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
						emfResponse.getData().addAll(patientResponse.getPatients());

						EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
						result.setValue(emfResponse);
						response.setResult(result);			
					}
				}				
				REQUEST_PROMISE_MAP.remove(requestId);
				return response;	
			} catch(InterruptedException | InvocationTargetException e) {
				response.setCode(ResponseCode.ERROR);
				ErrorResult errResult = AConnectorFactory.eINSTANCE.createErrorResult();					
				errResult.setError(String.format("Exception while trying to retrieve promise result for request with id %s", requestId));
				response.setResult(errResult);			
				return response;
			}			
		}
	}

	private void addResponseMetadata(EndpointResponse response, Map<String, String> metadata) {
		metadata.forEach((k,v) -> {
			Metadata responseMD = AConnectorFactory.eINSTANCE.createMetadata();
			responseMD.setKey(k);
			responseMD.setValue(v);
			response.getMetadata().add(responseMD);
		});
		Metadata responseTimeMD = AConnectorFactory.eINSTANCE.createMetadata();
		responseTimeMD.setKey("response.time");
		responseTimeMD.setValue(DATE_TIME_FORMATTER.format(Instant.now()));
		response.getMetadata().add(responseTimeMD);
	}

	private Promise<PatientResponse> getPromiseResult(String[] where, String[] subjects, String[] sort, int limit, int skip) {

		Deferred<PatientResponse> def = new Deferred<>();
		Callable<PatientResponse> callable = new RequestExecutor(where, subjects, sort, limit, skip, patientService, queryHelperService);
		try {
			def.resolve(callable.call());
		} catch (Exception e) {
			e.printStackTrace();
			def.fail(e);
		}		
		return def.getPromise();
	}

}
