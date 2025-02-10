/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 *     Stefan Bishof - API and implementation
 *     Tim Ward - implementation
 */
package org.avatar.himsa.rest;

import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.service.example.api.PatientService;
import org.avatar.himsa.service.example.api.QueryHelperService;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * This is a Demo Resource for a Jakartars Whiteboard 
 * You should see an log output like this, that mentions port and uri: 
 * Started Jakartars whiteboard server for port: <port> and context: /rest/
 * 
 * So the application can be reached under:
 * http://localhost:8088/himsa/rest/hello
 * 
 * ------------------------------------------------------------
 * !!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * ------------------------------------------------------------
 * 
 * @since 1.0
 */
@JakartarsResource
@JakartarsName("demo")
@Component(service = DemoResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class DemoResource {
		
	@Reference
	private PatientService patientService;
	
	@Reference
	private QueryHelperService queryHelperService;
	
	private static Map<String, Promise<List<Patient>>> REQUEST_PROMISE_MAP = new ConcurrentHashMap<>();

	@GET
	@Path("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/request/{requestId}")
	public Response request(@PathParam("requestId") String requestId, @QueryParam("count") boolean count, 
			@QueryParam("distinct") boolean distinct) {
		System.out.println("Got a request for " + requestId);
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setCode(ResponseCode.PENDING);
		response.setTimestamp(Instant.now().toEpochMilli());
		PendingResult result = AConnectorFactory.eINSTANCE.createPendingResult();;
		result.setEstRuntime(77);
		response.setResult(result);
		return Response.ok(response).build();
	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/patient/query")
//	public Response patientByQuery(@QueryParam("where") String[] where, @QueryParam("projections") String[] projections) {
//		
//		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
//		response.setId(UUID.randomUUID().toString());
//		
//		List<QueryWhere> qwhere = new ArrayList<>(where.length);
//		for(String w : where) {
//			qwhere.add(extractQWhereFromRequest(w));
//		}
//		EStructuralFeature[][] projectionsFeatures = new EStructuralFeature[projections.length][];
//		int i = 0, j = 0;
//		for(String proj : projections) {
//			String[] projSplit = proj.split("-");
//			j = 0;
//			for(String projName : projSplit) {
//				projectionsFeatures[i] = new EStructuralFeature[projSplit.length];
//				EStructuralFeature f = PatientExportPackage.Literals.PATIENT.getEStructuralFeature(projName);
//				if(f != null) {
//					projectionsFeatures[i][j] = f;
//					j++;
//				}
//			}
//			i++;				
//		}
//		try {
//			IQuery query = queryHelperService.buildQuery(qwhere);
//			List<Patient> patients = patientService.getPatientsByQuery(query, projectionsFeatures);
//			response.setCode(patients == null || patients.isEmpty() ? ResponseCode.NO_CONTENT : ResponseCode.OK);
//			response.setTimestamp(Instant.now().toEpochMilli());
//			org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
//			emfResponse.getData().addAll(patients);
//			
//			EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
//			result.setValue(emfResponse);
//			response.setResult(result);			
//			return Response.ok(response).build();
//		} catch(ParseException e) {
//			response.setCode(ResponseCode.ERROR);
//			ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
//			errRes.setThrowable(e);
//			errRes.setError("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
//			errRes.setErrorText("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
//			response.setResult(errRes);
//			return Response.ok(response).build();
//		}			
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query/{requestId}")
	public Response patientByQuery(@PathParam("requestId") String requestId,
			@QueryParam("where") String[] where, @QueryParam("subject") String[] subjects, 
			@QueryParam("sort") String[] sort, 
			@QueryParam("limit") int limit, @QueryParam("skip") int skip) {
		
		Promise<List<Patient>> promise = getPromiseResult(where, subjects, sort, limit, skip);
		REQUEST_PROMISE_MAP.put(requestId, promise);
		
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setId(UUID.randomUUID().toString());
		response.setCode(ResponseCode.PENDING);
		PendingResult pendingRes = AConnectorFactory.eINSTANCE.createPendingResult();
		pendingRes.setEstRuntime(77);
		response.setResult(pendingRes);
		return Response.ok(response).build();
	}
	

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status/{requestId}")
	public Response status(@PathParam("requestId") String requestId) {
		System.out.println("Got a status request for " + requestId);
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setTimestamp(Instant.now().toEpochMilli());
		
		Promise<List<Patient>> promise = REQUEST_PROMISE_MAP.get(requestId);
		if(promise == null) {
			response.setCode(ResponseCode.ERROR);
			ErrorResult errResult = AConnectorFactory.eINSTANCE.createErrorResult();
			errResult.setError(String.format("No query is running for request %s", requestId));
			response.setResult(errResult);
			return Response.ok(response).build();			
		}
		
		if(!promise.isDone()) {
			response.setCode(ResponseCode.PENDING);
			PendingResult pendingResult = AConnectorFactory.eINSTANCE.createPendingResult();
			pendingResult.setEstRuntime(7);
			response.setResult(pendingResult);
			return Response.ok(response).build();	
		}
		else {
			try {
				if(promise.getFailure() != null) {
					response.setCode(ResponseCode.ERROR);
					ErrorResult errResult = AConnectorFactory.eINSTANCE.createErrorResult();
					errResult.setError(String.format("Query failed for request %s with msg %s", requestId, promise.getFailure().getMessage()));
					response.setResult(errResult);					
				} else {
					List<Patient> patients = promise.getValue();
					if(patients.isEmpty()) {
						response.setCode(ResponseCode.NO_CONTENT);
					} else {
						response.setCode(ResponseCode.OK);
						org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
						emfResponse.getData().addAll(patients);
						
						EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
						result.setValue(emfResponse);
						response.setResult(result);			
					}
				}				
				REQUEST_PROMISE_MAP.remove(requestId);
				return Response.ok(response).build();	
			} catch(InterruptedException | InvocationTargetException e) {
				return Response.serverError().build();
			}			
		}
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dryrun/{requestId}")
	public Response dryrun(@PathParam("requestId") String requestId, @QueryParam("where") String[] where, 
			@QueryParam("subject") String[] subjects, 
			@QueryParam("sort") String[] sort, 
			@QueryParam("limit") int limit, @QueryParam("skip") int skip) {
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setCode(ResponseCode.OK);
		response.setTimestamp(Instant.now().toEpochMilli());
		DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
		result.setEstRuntime(77);
		result.setResultCount(77);
		response.setResult(result);
		return Response.ok(response).build();
	}
	
	/**
	 * http://localhost:8088/himsa/rest/patient/etester
	 * @param id
	 * @return
	 */
	@GET
	@Path("/patient/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response patient(@PathParam("id") String id) {
		if (Objects.isNull(id)) {
			return Response.noContent().build();
		}
		Patient p = patientService.getPatient(id);
		if (Objects.isNull(p)) {
			System.out.println("No patient found with id " + id);
			return Response.noContent().build();
		} else {
			return Response.ok(p).build();
		}
	}
	
	@GET
	@Path("/patient/with/consent/{domainId}/{policyId}/{policyVersion}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response patientWithConsent(@PathParam("domainId") String domainId, @PathParam("policyId") String policyId,
			@PathParam("policyVersion") String policyVersion) {
		if (Objects.isNull(domainId) || Objects.isNull(policyId)) {
			return Response.noContent().build();
		}
		List<Patient> patientsWithConsent = patientService.getPatientsWithConsent(domainId, policyId, policyVersion == null ? "1.0" : policyVersion);
		if(patientsWithConsent.isEmpty()) {
			System.out.println("No patients with consent found");
			return Response.noContent().build();
		}
		org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
		emfResponse.getData().addAll(patientsWithConsent);
		return Response.ok(emfResponse).build();
	}
	
	private Promise<List<Patient>> getPromiseResult(String[] where, String[] subjects, String[] sort, int limit, int skip) {
		
		Deferred<List<Patient>> def = new Deferred<>();
		Callable<List<Patient>> callable = new RequestExecutor(where, subjects, sort, limit, skip, patientService, queryHelperService);
		try {
			def.resolve(callable.call());
		} catch (Exception e) {
			def.fail(e);
		}		
		return def.getPromise();
	}
	
	
	
	
	
	
//	private <T extends Object> Object selectRandomElement(T[] elements)  {
//		Random rndm = new Random();
//		int rndmIndx = rndm.nextInt(elements.length);
//		Object rndmElem = elements[rndmIndx];
//		return rndmElem;
//	}
	
}
