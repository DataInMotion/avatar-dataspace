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
package org.avatar.provider.backend.api;

import java.nio.file.Path;
import java.util.UUID;

import org.assertj.core.util.Files;
import org.avatar.ds.model.dataspace.Asset;
import org.avatar.ds.model.dataspace.AssetPolicy;
import org.avatar.ds.model.dataspace.Context;
import org.avatar.ds.model.dataspace.ContractDefinition;
import org.avatar.ds.model.dataspace.DataAddress;
import org.avatar.ds.model.dataspace.DataspaceFactory;
import org.avatar.ds.model.dataspace.Policy;
import org.avatar.ds.model.dataspace.PolicyContext;

/**
 * 
 * @author ilenia
 * @since May 12, 2025
 */
public class DataSpaceHelper {
	
	public static Asset createAsset(String requestId, String url, String type, String name) {
		Asset asset = DataspaceFactory.eINSTANCE.createAsset();
		asset.setId(requestId);
		Context ctxt = DataspaceFactory.eINSTANCE.createContext();
		ctxt.setVocab("https://w3id.org/edc/v0.0.1/ns/");
		asset.setContext(ctxt);
		DataAddress dataAddress = DataspaceFactory.eINSTANCE.createDataAddress();
		dataAddress.setBaseUrl(url);
		dataAddress.setType(type);
		dataAddress.setName(name);
		asset.setDataAddress(dataAddress);
		asset.getProperties().put("name", name);
		asset.getProperties().put("contenttype", type);
		return asset;		
	}
	
	public static Asset createQueryResultAsset(String requestId, Path dataFilePath, String name) {
		Asset asset = DataspaceFactory.eINSTANCE.createAsset();
		asset.setId(requestId);
		Context ctxt = DataspaceFactory.eINSTANCE.createContext();
		ctxt.setVocab("https://w3id.org/edc/v0.0.1/ns/");
		asset.setContext(ctxt);
		DataAddress dataAddress = DataspaceFactory.eINSTANCE.createDataAddress();
		dataAddress.setBaseUrl(dataFilePath.toString());
		String extension = Files.getFileNameExtension(dataFilePath.getFileName().toString()).orElse("xml");
		dataAddress.setType(extension);
		dataAddress.setName(name);
		asset.setDataAddress(dataAddress);
		asset.getProperties().put("name", name);
		asset.getProperties().put("contenttype", extension);
		return asset;		
	}
	
	public static AssetPolicy createAssetPolicy(String policyId) {
		AssetPolicy assetPolicy = DataspaceFactory.eINSTANCE.createAssetPolicy();
		PolicyContext ctxt = DataspaceFactory.eINSTANCE.createPolicyContext();
		ctxt.setVocab("https://w3id.org/edc/v0.0.1/ns/");
		ctxt.setOdrl("http://www.w3.org/ns/odrl/2/");
		assetPolicy.setContext(ctxt);
		assetPolicy.setId(policyId);
		Policy policy = DataspaceFactory.eINSTANCE.createPolicy();
		policy.setContext("http://www.w3.org/ns/odrl.jsonld");
		policy.setType("Set");
		assetPolicy.setPolicy(policy);
		return assetPolicy;
	}
	
	public static ContractDefinition createContractDefinition(String policyId) {
		ContractDefinition contract = DataspaceFactory.eINSTANCE.createContractDefinition();
		contract.setId(UUID.randomUUID().toString());
		Context ctxt = DataspaceFactory.eINSTANCE.createContext();
		ctxt.setVocab("https://w3id.org/edc/v0.0.1/ns/");
		contract.setContext(ctxt);
		contract.setAccessPolicyId(policyId);
		contract.setContractPolicyId(policyId);
		return contract;		
	}

}
