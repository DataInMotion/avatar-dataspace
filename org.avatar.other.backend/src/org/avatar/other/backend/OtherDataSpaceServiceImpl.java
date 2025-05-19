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
package org.avatar.other.backend;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.ds.model.dataspace.Asset;
import org.avatar.ds.model.dataspace.AssetPolicy;
import org.avatar.ds.model.dataspace.ContractDefinition;
import org.avatar.ds.model.dataspace.DataSpaceResponse;
import org.avatar.ds.model.dataspace.DataspacePackage;
import org.avatar.provider.backend.api.DataSpaceHelper;
import org.avatar.provider.backend.api.DataSpaceService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

/**
 * 
 * @author ilenia
 * @since May 16, 2025
 */
@Component(name = "OtherDataSpaceService", configurationPid = "DataSpaceService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class OtherDataSpaceServiceImpl implements DataSpaceService {

	private static final Logger LOGGER = Logger.getLogger(OtherDataSpaceServiceImpl.class.getName());

	private String policyId;
	private ResourceSet resSet;

	private String baseDSUrl;

	@Activate
	public OtherDataSpaceServiceImpl(
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target="("+EMFNamespaces.EMF_MODEL_FILE_EXT + "=json)") 
			ResourceSet resSet,
			Map<String, Object> properties) {		
		this.resSet = resSet;
		baseDSUrl = (String) properties.getOrDefault("base.ds.url", null);
		if(baseDSUrl == null) {
			throw new IllegalArgumentException("Property base.ds.url must be set!");
		}
		policyId = (String) properties.getOrDefault("start.policy.id", null);
		if(policyId != null && getAssetPolicy(policyId) == null) {
			LOGGER.info(String.format("Creating policy %s  and initial assets in data space", policyId));
			createAssetPolicyInDataSpace(policyId);
			createContractDefinitionInDataSpace(policyId);
			createInitialAssets();
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataSpaceService#createAssetInDataSpace(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public DataSpaceResponse createAssetInDataSpace(String requestId, String url, String type, String name) {
		Asset asset = DataSpaceHelper.createAsset(requestId, url, type, name);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "assets"), "application/json");
		requestRes.getContents().add(asset);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		return sendPOSTRequestToDataSpace(requestRes, responseRes);
	}



	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataAssetService#createAssetPolicyInDataSpace(java.lang.String)
	 */
	@Override
	public DataSpaceResponse createAssetPolicyInDataSpace(String policyId) {
		AssetPolicy policy = DataSpaceHelper.createAssetPolicy(policyId);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "policydefinitions"), "application/json");
		requestRes.getContents().add(policy);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		return sendPOSTRequestToDataSpace(requestRes, responseRes);
	}



	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataAssetService#createContractDefinitionInDataSpace(java.lang.String)
	 */
	@Override
	public DataSpaceResponse createContractDefinitionInDataSpace(String policyId) {
		ContractDefinition contract = DataSpaceHelper.createContractDefinition(policyId);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "contractdefinitions"), "application/json");
		requestRes.getContents().add(contract);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		return sendPOSTRequestToDataSpace(requestRes, responseRes);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataSpaceService#getAssetPolicy(java.lang.String)
	 */
	@Override
	public AssetPolicy getAssetPolicy(String policyId) {
		if(policyId == null) return null;
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "policydefinitions/" + policyId), "application/json");
		return (AssetPolicy) sendGETRequestToDataSpace(requestRes);
	}

	private void createInitialAssets() {
		DataSpaceResponse response = createAssetInDataSpace(UUID.randomUUID().toString(), "http://localhost:8088/other/rest/patient/query/{requestId}", "json", "Patient hearing data in json format");
		if(response == null) {
			throw new IllegalArgumentException("Error while creating initial asset in dataspace");
		}
		response = createAssetInDataSpace(UUID.randomUUID().toString(), "http://localhost:8088/other/rest/patient/query/{requestId}", "xml", "Patient hearing data in xml format");
		if(response == null) {
			throw new IllegalArgumentException("Error while creating initial asset in dataspace");
		}
	}

	private EObject sendGETRequestToDataSpace(Resource requestRes) {
		Map<String, Object> options = new HashMap<>();
		Map<String, Object> headers = new HashMap<>();		
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json");
		headers.put("Method", "GET");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "GET");	
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
		options.put(EMFJs.OPTION_ROOT_ELEMENT, DataspacePackage.Literals.ASSET_POLICY);
		try {
			requestRes.load(options);
			if(!requestRes.getContents().isEmpty()) {
				return requestRes.getContents().get(0);
			} else {
				LOGGER.severe(String.format("Response does NOT contain any object"));
			}
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while sending request to data space: %s", e));
		}
		return null;
	}

	private DataSpaceResponse sendPOSTRequestToDataSpace(Resource requestRes, Resource responseRes) {

		Map<String, Object> options = new HashMap<>();
		Map<String, Object> headers = new HashMap<>();		
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json");		
		headers.put("Method", "POST");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "POST");	
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
		options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE, responseRes);
		Map<String, Object> responseOptions = new HashMap<>();
		responseOptions.put(EMFJs.OPTION_ROOT_ELEMENT, DataspacePackage.Literals.DATA_SPACE_RESPONSE);
		responseOptions.put("Accepts", "application/json");
		options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE_OPTIONS, responseOptions);
		try {
			requestRes.save(options);
			if(!responseRes.getContents().isEmpty()) {
				if(responseRes.getContents().get(0) instanceof DataSpaceResponse response) {
					return response;
				} else {
					LOGGER.severe(String.format("Response object is not of expected type DataSpaceResponse"));
				}
			} else {
				LOGGER.severe(String.format("Response does NOT contain any object"));
			}
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while sending request to data space: %s", e));
		}
		return null;
	}

}
