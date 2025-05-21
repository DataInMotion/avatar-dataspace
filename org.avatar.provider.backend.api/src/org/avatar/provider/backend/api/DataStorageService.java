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

import java.io.IOException;

import de.avatar.model.connector.EndpointResponse;

/**
 * 
 * @author ilenia
 * @since May 8, 2025
 */
public interface DataStorageService {
	
	String saveEndpointResponse(EndpointResponse response);
	
	boolean existEndpointResponse(String requestId) throws IOException;

}
