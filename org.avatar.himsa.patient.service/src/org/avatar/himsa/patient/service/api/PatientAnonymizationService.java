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

import java.util.List;

import org.avatar.anonymization.api.AnonymizationService;
import org.avatar.himsa.export.Patient;

/**
 * 
 * @author ilenia
 * @since Mar 24, 2025
 */
public interface PatientAnonymizationService extends AnonymizationService {
	
	List<Patient> anonymizePatients(List<Patient> patients);

}
