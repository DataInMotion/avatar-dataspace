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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.service.example.api.PatientService;
import org.avatar.himsa.service.example.api.QueryHelperService;
import org.avatar.himsa.service.example.api.QueryWhere;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.avatar.model.connector.AConnectorFactory;
import de.avatar.model.connector.DryRunResult;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.PendingResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.model.connector.ResponseResult;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.gecko.emf.repository.query.IQuery;

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
	
	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("dd-mm-yyyy");
	
	@Reference
	private PatientService patientService;
	
	@Reference
	private QueryHelperService queryHelperService;

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
		response.setSourceId(requestId);
		response.setCode(ResponseCode.PENDING);
		response.setTimestamp(Instant.now().toEpochMilli());
		PendingResult result = AConnectorFactory.eINSTANCE.createPendingResult();;
		result.setEstRuntime(77);
		response.setResult(result);
		return Response.ok(response).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query")
	public Response patientByQuery(@QueryParam("where") String[] where, @QueryParam("projections") String[] projections) {
		
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();

		List<QueryWhere> qwhere = new ArrayList<>(where.length);
		for(String w : where) {
			String[] wSplit = w.split(",");
			if(wSplit.length != 4) {
				response.setCode(ResponseCode.ERROR);
				ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
				errRes.setError(String.format("Expected 4 attributes for every 'where' parameter"));
				errRes.setErrorText(String.format("Expected 4 attributes for every 'where' parameter"));
				response.setResult(errRes);
				return Response.ok(response).build();
			} else {
				QueryWhere qw = new QueryWhere();
				qw.setType(wSplit[0]);
				qw.setFeatureName(wSplit[1]);
				qw.setComparator(wSplit[2]);
				qw.setValue(wSplit[3]);
				qwhere.add(qw);
			}
		}
		EStructuralFeature[][] projectionsFeatures = new EStructuralFeature[projections.length][];
		int i = 0, j = 0;
		for(String proj : projections) {
			String[] projSplit = proj.split("-");
			j = 0;
			for(String projName : projSplit) {
				projectionsFeatures[i] = new EStructuralFeature[projSplit.length];
				EStructuralFeature f = PatientExportPackage.Literals.PATIENT.getEStructuralFeature(projName);
				if(f != null) {
					projectionsFeatures[i][j] = f;
					j++;
				}
			}
			i++;				
		}
		try {
			IQuery query = queryHelperService.buildQuery(qwhere);
			List<Patient> patients = patientService.getPatientsByQuery(query, projectionsFeatures);
			response.setCode(patients == null || patients.isEmpty() ? ResponseCode.NO_CONTENT : ResponseCode.OK);
			response.setTimestamp(Instant.now().toEpochMilli());
			org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
			emfResponse.getData().addAll(patients);
			
			EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
			result.setValue(emfResponse);
			response.setResult(result);			
			return Response.ok(response).build();
		} catch(ParseException e) {
			response.setCode(ResponseCode.ERROR);
			ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
			errRes.setThrowable(e);
			errRes.setError("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
			errRes.setErrorText("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
			response.setResult(errRes);
			return Response.ok(response).build();
		}	
		
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/range")
	public Response patientByRangeQuery(@QueryParam("type") String type, @QueryParam("feature") String feature, 
			@QueryParam("start") String start, @QueryParam("end") String end, @QueryParam("includeStart") boolean includeStart, 
			@QueryParam("includeEnd") boolean includeEnd, @QueryParam("projections") String[] projections) {

		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		try {
			EAttribute queryAttribute = (EAttribute) PatientExportPackage.Literals.PATIENT.getEStructuralFeature(feature);
			if(queryAttribute == null) {
				response.setCode(ResponseCode.ERROR);
				ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
				errRes.setError(String.format("No EAttribute with name %s found in PatiendExport Package!", feature));
				errRes.setErrorText(String.format("No EAttribute with name %s found in PatiendExport Package!", feature));
				response.setResult(errRes);
				return Response.ok(response).build();
			}
			EStructuralFeature[][] projectionsFeatures = new EStructuralFeature[projections.length][];
			int i = 0, j = 0;
			for(String proj : projections) {
				String[] projSplit = proj.split("-");
				j = 0;
				for(String projName : projSplit) {
					projectionsFeatures[i] = new EStructuralFeature[projSplit.length];
					EStructuralFeature f = PatientExportPackage.Literals.PATIENT.getEStructuralFeature(projName);
					if(f != null) {
						projectionsFeatures[i][j] = f;
						j++;
					}
				}
				i++;				
			}
			List<Patient> patients = null;
			if("numeric".equals(type)) {
				Float startNum = start == null ? null : Float.valueOf(start);
				Float endNum = end == null ? null : Float.valueOf(end);
				patients = patientService.getPatientsByRangeQuery(queryAttribute, startNum, endNum, includeEnd, includeEnd, projectionsFeatures);					
			} else if("date".equals(type)) {
				try {
					Date startDate = start == null ? null : DATE_FORMAT.parse(start);
					Date endDate = end == null ? null : DATE_FORMAT.parse(end);
					patients = patientService.getPatientsByRangeQuery(queryAttribute, startDate, endDate, includeEnd, includeEnd, projectionsFeatures);					
				} catch(ParseException e) {
					response.setCode(ResponseCode.ERROR);
					ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
					errRes.setThrowable(e);
					errRes.setError("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
					errRes.setErrorText("Error parsing dates from query parameters. Format should be 'dd-mm-yyyy'");
					response.setResult(errRes);
					return Response.ok(response).build();
				}				
			} else {
				response.setCode(ResponseCode.ERROR);
				ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
				errRes.setError("The 'type' query parameter should either be 'numeric' or 'date'");
				errRes.setErrorText("The 'type' query parameter should either be 'numeric' or 'date'");
				response.setResult(errRes);
				return Response.ok(response).build();
			}
			
			response.setCode(patients == null || patients.isEmpty() ? ResponseCode.NO_CONTENT : ResponseCode.OK);
			response.setTimestamp(Instant.now().toEpochMilli());
			org.gecko.emf.utilities.Response emfResponse = UtilitiesFactory.eINSTANCE.createResponse();
			emfResponse.getData().addAll(patients);
			
			EcoreResult result = AConnectorFactory.eINSTANCE.createEcoreResult();
			result.setValue(emfResponse);
			response.setResult(result);			
			return Response.ok(response).build();
		} catch(ClassCastException e) {
			response.setCode(ResponseCode.ERROR);
			ErrorResult errRes = AConnectorFactory.eINSTANCE.createErrorResult();
			errRes.setThrowable(e);
			errRes.setError("Query parameter 'feature' should be an EAttribute!");
			errRes.setErrorText("Query parameter 'feature' should be an EAttribute!");
			response.setResult(errRes);
			return Response.ok(response).build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status/{requestId}")
	public Response status(@PathParam("requestId") String requestId) {
		System.out.println("Got a status request for " + requestId);
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setSourceId(requestId);
		response.setCode((ResponseCode) selectRandomElement(ResponseCode.values()));
		response.setTimestamp(Instant.now().toEpochMilli());
		ResponseResult result = null;
		switch(response.getCode()) {
		case ERROR: case NO_CONTENT: case TIMEOUT: case OTHER: default:
			result = AConnectorFactory.eINSTANCE.createErrorResult();
			((ErrorResult) result).setError("An error occurred");
			break;
		case OK:
			result = AConnectorFactory.eINSTANCE.createEcoreResult();
			((EcoreResult) result).setValue(PatientExportFactory.eINSTANCE.createPatient());
			break;		
		case PENDING:
			result = AConnectorFactory.eINSTANCE.createPendingResult();
			((PendingResult) result).setEstRuntime(50);
			break;			
		}
		response.setResult(result);
		return Response.ok(response).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dryrun/{requestId}")
	public Response dryrun(@PathParam("requestId") String requestId, @QueryParam("count") boolean count, 
			@QueryParam("distinct") boolean distinct) {
		System.out.println(String.format("Got a dry run request with id %s, count %s, distinct %s", requestId, count, distinct));
		EndpointResponse response = AConnectorFactory.eINSTANCE.createEndpointResponse();
		response.setSourceId(requestId);
		response.setCode(ResponseCode.OK);
		response.setTimestamp(Instant.now().toEpochMilli());
		DryRunResult result = AConnectorFactory.eINSTANCE.createDryRunResult();
		result.setEstRuntime(7);
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
	
	
	
	private <T extends Object> Object selectRandomElement(T[] elements)  {
		Random rndm = new Random();
		int rndmIndx = rndm.nextInt(elements.length);
		Object rndmElem = elements[rndmIndx];
		return rndmElem;
	}
	
}
