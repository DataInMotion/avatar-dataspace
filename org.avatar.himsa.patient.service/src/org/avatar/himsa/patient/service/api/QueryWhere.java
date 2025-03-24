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
package org.avatar.himsa.patient.service.api;

/**
 * 
 * @author ilenia
 * @since Jan 22, 2025
 */
public record QueryWhere(String queryType, String featureName, String comparatorName, String comparatorType, 
		String startValue, String endValue, boolean includeStartValue, boolean includeEndValue, String operation) { }

