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

import java.util.List;
import java.util.Objects;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.service.example.api.PatientService;
import org.gecko.emf.utilities.UtilitiesFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
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

	@GET
	@Path("/hello")
	public String hello() {
		return "Hello World!";
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
}
