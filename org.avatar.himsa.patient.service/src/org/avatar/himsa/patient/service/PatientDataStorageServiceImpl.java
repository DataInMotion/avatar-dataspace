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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import org.avatar.provider.backend.api.DataStorageService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.avatar.metadata.Metadata;
import de.avatar.model.connector.EcoreResult;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.model.connector.JavaResult;
import de.avatar.model.connector.ResponseResult;

/**
 * 
 * @author ilenia
 * @since May 8, 2025
 */
@Component(name = "PatientDataStorageService", configurationPid = "DataStorageService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class PatientDataStorageServiceImpl implements DataStorageService {

	private final static Logger LOGGER = Logger.getLogger(PatientDataStorageServiceImpl.class.getName());

	@Reference
	private ComponentServiceObjects<ResourceSet> rsFactory;

	private ObjectMapper mapper = new ObjectMapper();
	private String dataFormat;
	private String dataFolder;
	private String baseUrl;

	@Activate()
	public void activate(Map<String, Object> properties) {
		dataFormat = (String) properties.getOrDefault("data.format", null);
		Objects.requireNonNull(dataFormat, "Data Format for DataStorageService should be specified through configuration property data.format");
		dataFolder = (String) properties.getOrDefault("data.storage.folder", null);
		Objects.requireNonNull(dataFolder, "Data Storage folder for DataStorageService should be specified through configuration property data.storage.folder");
		baseUrl = (String) properties.getOrDefault("base.url", null);
		Objects.requireNonNull(dataFolder, "Base url for DataStorageService should be specified through configuration property base.url");
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataStorageService#saveEndpointResponse(de.avatar.model.connector.EndpointResponse)
	 */
	@Override
	public String saveEndpointResponse(EndpointResponse response) {
		String requestId = response.getSourceId();
		String responseId = response.getId(); 
		Objects.requireNonNull(requestId, "Request ID cannot be null!");
		Objects.requireNonNull(responseId, "Source ID cannot be null!");

		String filePath = System.getProperty(dataFolder).
				concat(requestId).
				concat("_").
				concat(responseId).
				concat(".").
				concat(dataFormat);
		File responseFile = new File(filePath);
		try {
			responseFile.createNewFile();
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException when creating new file for response from connector with id %s", responseId));
			e.printStackTrace();
		}

		ResponseResult result = response.getResult();
		List<Metadata> metadatas = (List<Metadata>) EcoreUtil.copyAll(response.getMetadata());
		ResourceSet resourceSet = rsFactory.getService();
		Resource resource = resourceSet.createResource(URI.createFileURI(filePath));
		resource.getContents().addAll(metadatas);
		if(result instanceof EcoreResult ecoreRes) {
			resource.getContents().add(ecoreRes.getValue());			
		}
		try {	
			resource.save(null);				
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while saving EcoreResult for response from connector with id %s", responseId));
			e.printStackTrace();
			responseFile.delete();
		} finally {
			rsFactory.ungetService(resourceSet);
		}

		if(result instanceof JavaResult javaRes) {
			try {
				mapper.writeValue(responseFile, javaRes.getValue());				
			} catch(IOException e) {
				LOGGER.severe(String.format("Error serializing JavaResult for response from connector with id %s", responseId));
				e.printStackTrace();
				responseFile.delete();
			}
		}
		if(Files.exists(responseFile.toPath())) {
			return baseUrl.concat(responseFile.getName());
		} else {
			return null;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataStorageService#existEndpointResponse(java.lang.String)
	 */
	@Override
	public boolean existEndpointResponse(String requestId) throws IOException {
		Path filePath = Path.of(System.getProperty(dataFolder));
		return Files.list(filePath).filter(p -> {
			return Files.isRegularFile(p) && p.getFileName().toString().startsWith(requestId.concat("_")) && p.getFileName().toString().endsWith(dataFormat);
		}).findFirst().isPresent();
	}


}
