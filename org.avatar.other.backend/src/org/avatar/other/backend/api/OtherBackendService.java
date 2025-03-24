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
package org.avatar.other.backend.api;

import de.avatar.model.connector.EndpointResponse;

/**
 * 
 * @author ilenia
 * @since Mar 24, 2025
 */
public interface OtherBackendService {
	
	EndpointResponse executeQuery(String requestId, String[] where, String[] subjects, String[] sort, int limit, int skip);
	
	EndpointResponse executeDryRun(String requestId, String[] where, String[] subjects, String[] sort, int limit, int skip);
	
	EndpointResponse executeStatus(String requestId);

}
