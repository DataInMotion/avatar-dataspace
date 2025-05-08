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

import org.avatar.provider.backend.api.ProviderBackendService;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.rest.annotations.EMFResourceOptions;
import org.gecko.emf.rest.annotations.ResourceOption;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.avatar.status.QueryRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
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
@Component(name = "HimsaProviderResource", service = HimsaRESTResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class HimsaRESTResource {
		
	@Reference(target = "(provider.id=himsa)")
	private ProviderBackendService backendService;
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello HimsaProviderResource!";
	}

	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/dryrun/{requestId}")
//	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
//	public Response dryrun(@PathParam("requestId") String requestId, Query query) {
//		return Response.ok(backendService.executeDryRun(requestId, query)).build();
//	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query")
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class)})
	public Response patientByQuery(QueryRequest queryRequest) {
		System.out.println("GOT QUery");
		backendService.executeQuery(queryRequest);
		return Response.ok("Query sent with success for Provider Himsa").build();
	}
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/status/{requestId}")
//	public Response status(@PathParam("requestId") String requestId) {
//		return Response.ok(backendService.executeStatus(requestId)).build();
//	}
}
