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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.provider.backend.api.ProviderBackendService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.rest.annotations.EMFResourceOptions;
import org.gecko.emf.rest.annotations.ResourceOption;
import org.gecko.emf.rest.annotations.json.EMFJSONConfig;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.ErrorResult;
import de.avatar.model.connector.ResponseCode;
import de.avatar.status.QueryRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

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
	
	private static final Logger LOGGER = Logger.getLogger(HimsaRESTResource.class.getName());
		
	@Reference(target = "(provider.id=himsa)")
	private ProviderBackendService backendService;
	
	@Reference
	ResourceSet resSet;
	
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello HimsaProviderResource!";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/dryrun")
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class), 
			@ResourceOption(key = EMFJs.OPTION_TYPE_FIELD, value = "_type")})	
	public Response dryrun(@EMFJSONConfig(typeFieldName = "_type") QueryRequest queryRequest) {
		LOGGER.info("GOT DryRun");
		EndpointResponse response = backendService.executeDryRun(queryRequest);
		if(ResponseCode.ERROR.equals(response.getCode())) {
			return Response.status(Status.BAD_REQUEST).entity(response).build();
		} else {
			return Response.ok(response).build();
		}		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query")
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class), 
			@ResourceOption(key = EMFJs.OPTION_TYPE_FIELD, value = "_type")})
	public Response patientByQuery(@EMFJSONConfig(typeFieldName = "_type") QueryRequest queryRequest) {
		LOGGER.info("GOT Query");
		EndpointResponse response = backendService.executeQuery(queryRequest);
		if(ResponseCode.ERROR.equals(response.getCode())) {
			return Response.status(Status.BAD_REQUEST).entity(response).build();
		} else {
			return Response.ok(response).build();
		}		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/patient/query/{reqId}")
	@EMFResourceOptions(options= {@ResourceOption(key = EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, value = "true", valueType = Boolean.class), 
			@ResourceOption(key = EMFJs.OPTION_TYPE_FIELD, value = "_type")})
	public Response patientByQuery2(@PathParam("reqId") String reqId,  @EMFJSONConfig(typeFieldName = "_type")QueryRequest queryRequest) {
		LOGGER.info(String.format("Got Query with id %s", reqId));
		Resource res = resSet.createResource(URI.createURI(UUID.randomUUID().toString()+".json"));
		res.getContents().add(EcoreUtil.copy(queryRequest.getQuery()));
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			res.save(os, null);
			LOGGER.info(String.format("Query is %s", new String(os.toByteArray())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		EndpointResponse response = backendService.executeQuery(queryRequest);
		if(ResponseCode.ERROR.equals(response.getCode())) {
			LOGGER.severe(String.format("Error Response for Query with id %s: %s", reqId, response.getResult() instanceof ErrorResult ? ((ErrorResult) response.getResult()).getError() : ""));
			if(response.getResult() instanceof ErrorResult errRes) {
				if(errRes.getThrowable() != null) errRes.getThrowable().printStackTrace();
			}
			return Response.status(Status.BAD_REQUEST).entity(response).build();
		} else {
			LOGGER.info(String.format("OK Response for Query with id %s", reqId));
			return Response.ok(response).build();
		}		
	}
	
	@GET
	@Path("/downloads/{fileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response download(@PathParam("fileName") String fileName) {
		
		File resultFile = new File(System.getProperty("data").concat(fileName));
		if(resultFile.exists()) {
			try(InputStream is = new FileInputStream(resultFile)) {
				return Response.ok(is.readAllBytes()).
						header("Content-Disposition", "attachment; filename=".concat(fileName)).
						build();
			} catch(Exception e) {
				return Response.status(Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getMessage()).build();
			}
		} else {
			return Response.noContent().build();
		}
	}
}
