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

import org.avatar.ds.model.dataspace.AssetPolicy;
import org.avatar.ds.model.dataspace.DataSpaceResponse;

/**
 * 
 * @author ilenia
 * @since May 12, 2025
 */
public interface DataSpaceService {
	
	DataSpaceResponse createAssetInDataSpace(String requestId, Path dataFilePath, String assetName);
	
	DataSpaceResponse createAssetPolicyInDataSpace(String policyId);
	
	DataSpaceResponse createContractDefinitionInDataSpace(String policyId);
	
	AssetPolicy getAssetPolicy(String policyId);

}
