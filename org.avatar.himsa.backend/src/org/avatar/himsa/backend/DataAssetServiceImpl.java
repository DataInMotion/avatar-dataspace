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
package org.avatar.himsa.backend;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.ds.model.asset.Asset;
import org.avatar.ds.model.asset.AssetPolicy;
import org.avatar.ds.model.asset.ContractDefinition;
import org.avatar.ds.model.asset.DataSpaceAssetPackage;
import org.avatar.ds.model.asset.DataSpaceResponse;
import org.avatar.provider.backend.api.DataAssetHelper;
import org.avatar.provider.backend.api.DataAssetService;
import org.eclipse.emf.common.util.URI;
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
 * @since May 12, 2025
 */
@Component(name = "DataAssetService", configurationPid = "DataAssetService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class DataAssetServiceImpl implements DataAssetService {
	
	private static final Logger LOGGER = Logger.getLogger(DataAssetServiceImpl.class.getName());
	
	private String policyId;
	private ResourceSet resSet;

	private String baseDSUrl;
	
	@Activate
	public DataAssetServiceImpl(
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target="("+EMFNamespaces.EMF_MODEL_FILE_EXT + "=json)") 
	ResourceSet resSet,
	Map<String, Object> properties) {		
		this.resSet = resSet;
		baseDSUrl = (String) properties.getOrDefault("base.ds.url", null);
		policyId = (String) properties.getOrDefault("start.policy.id", null);
		if(policyId != null) {
			createAssetPolicyInDataSpace(policyId);
		}
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataAssetService#createAssetInDataSpace(java.lang.String, java.nio.file.Path, java.lang.String)
	 */
	@Override
	public Asset createAssetInDataSpace(String requestId, Path dataFilePath, String assetName) {
		Asset asset = DataAssetHelper.createAsset(requestId, dataFilePath, assetName);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "assets"), "application/json");
		requestRes.getContents().add(asset);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		sendRequestToDataSpace(requestRes, responseRes);
		return asset;
	}



	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataAssetService#createAssetPolicyInDataSpace(java.lang.String)
	 */
	@Override
	public AssetPolicy createAssetPolicyInDataSpace(String policyId) {
		AssetPolicy policy = DataAssetHelper.createAssetPolicy(policyId);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "policydefinitions"), "application/json");
		requestRes.getContents().add(policy);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		sendRequestToDataSpace(requestRes, responseRes);
		return policy;
	}



	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.DataAssetService#createContractDefinitionInDataSpace(java.lang.String)
	 */
	@Override
	public ContractDefinition createContractDefinitionInDataSpace(String policyId) {
		ContractDefinition contract = DataAssetHelper.createContractDefinition(policyId);
		Resource requestRes = resSet.createResource(URI.createURI(baseDSUrl + "contractdefinitions"), "application/json");
		requestRes.getContents().add(contract);
		Resource responseRes = resSet.createResource(URI.createURI(UUID.randomUUID().toString().concat(".json")), "application/json");
		sendRequestToDataSpace(requestRes, responseRes);
		return contract;
	}
	
	private DataSpaceResponse sendRequestToDataSpace(Resource requestRes, Resource responseRes) {
		
		Map<String, Object> options = new HashMap<>();
		Map<String, Object> headers = new HashMap<>();		
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json");
		
		headers.put("Method", "POST");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "POST");	
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
		options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE, responseRes);
		Map<String, Object> responseOptions = new HashMap<>();
		responseOptions.put(EMFJs.OPTION_ROOT_ELEMENT, DataSpaceAssetPackage.Literals.DATA_SPACE_RESPONSE);
		responseOptions.put("Accepts", "application/json");
		options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE_OPTIONS, responseOptions);
		try {
			requestRes.save(System.out, options);
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
