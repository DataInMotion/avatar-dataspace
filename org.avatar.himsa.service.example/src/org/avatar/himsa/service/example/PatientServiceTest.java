/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.avatar.himsa.service.example;

import java.util.Objects;

import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.service.example.api.PatientService;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * !!!!! SEE ALL REQUIRE DECLARATION IN package-info.java !!!!!
 * @author Mark Hoffmann
 * @since 19.01.2024
 */
@Component(scope = ServiceScope.PROTOTYPE)
public class PatientServiceTest implements PatientService {
	
	@Reference
	private PatientExportFactory modelFactory;
	@Reference
	private PatientExportPackage modelPackage;
	@Reference
	private EMFRepository repo;
	
	@Activate
	public void activate() {
		Patient patient = modelFactory.createPatient();
//		patient.setPatientGUID(UUID.randomUUID().toString());
		patient.setPatientGUID("etester");
		patient.setFirstName("Emil");
		patient.setLastName("Tester");
		System.out.println("Ready to do something with " + patient);
		// untested!!!!
		repo.save(patient);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.himsa.service.example.api.PatientService#getPatient(java.lang.String)
	 */
	@Override
	public Patient getPatient(String id) {
		if (Objects.isNull(id)) {
			return null;
		}
		return repo.getEObject(modelPackage.getPatient(), id);
	}
	
	


}
