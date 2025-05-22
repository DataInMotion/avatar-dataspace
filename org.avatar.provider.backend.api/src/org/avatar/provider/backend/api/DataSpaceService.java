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

import org.avatar.ds.model.dataspace.DataSpaceResponse;

/**
 * 
 * @author ilenia
 * @since May 12, 2025
 */
public interface DataSpaceService {
	
	DataSpaceResponse createAssetInDataSpace(String requestId, String url, String type, String name);
	
	DataSpaceResponse createAssetPolicyInDataSpace(String policyId);
	
	DataSpaceResponse createContractDefinitionInDataSpace(String policyId);
	
	DataSpaceResponse getAssetPolicy(String policyId);
	
	DataSpaceResponse getAsset(String assetId);

}
