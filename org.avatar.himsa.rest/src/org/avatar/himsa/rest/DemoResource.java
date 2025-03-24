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

import org.avatar.himsa.backend.api.HimsaBackendService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

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
@Component(name = "HimsaProviderResource", service = DemoResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class DemoResource {
		
	@Reference
	private HimsaBackendService backendService;
	
	

	@GET
	@Path("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query/{requestId}")
	public Response patientByQuery(@PathParam("requestId") String requestId,
			@QueryParam("where") String[] where, @QueryParam("subject") String[] subjects, 
			@QueryParam("sort") String[] sort, 
			@QueryParam("limit") int limit, @QueryParam("skip") int skip) {
		return Response.ok(backendService.executeQuery(requestId, where, subjects, sort, limit, skip)).build();
	}
	

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status/{requestId}")
	public Response status(@PathParam("requestId") String requestId) {
		return Response.ok(backendService.executeStatus(requestId)).build();
	}
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dryrun/{requestId}")
	public Response dryrun(@PathParam("requestId") String requestId, @QueryParam("where") String[] where, 
			@QueryParam("subject") String[] subjects, 
			@QueryParam("sort") String[] sort, 
			@QueryParam("limit") int limit, @QueryParam("skip") int skip) {
		return Response.ok(backendService.executeDryRun(requestId, where, subjects, sort, limit, skip)).build();
	}
	
}
