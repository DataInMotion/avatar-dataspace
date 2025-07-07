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
package org.avatar.himsa.dummy.data.component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.avatar.himsa.export.ActionDataType;
import org.avatar.himsa.export.DocumentRoot;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.export.PatientType1;
import org.avatar.himsa.export.PatientsType;
import org.avatar.himsa.export.TypeOfDataType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2025
 */
//@Component(immediate=true, name = "HimsaLoaderComponent")
public class HimsaLoaderComponent {

	private ResourceSet resourceSet;

	@Activate
	public HimsaLoaderComponent(@Reference(cardinality = ReferenceCardinality.MANDATORY)
	ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		//		save();		
		load();
	}

	private void save() {
		Resource resource = resourceSet.createResource(URI.createURI("data/test.xml"));
		Map<String, Object> options = new HashMap<>();
		//		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		//		options.put(XMLResource.OPTION_ROOT_OBJECTS, List.of(PatientExportPackage.Literals.PATIENT_TYPE1));

		PatientType1 p1 = PatientExportFactory.eINSTANCE.createPatientType1();
		p1.setPatientGUID(UUID.randomUUID().toString());

		PatientType1 p2 = PatientExportFactory.eINSTANCE.createPatientType1();
		p2.setPatientGUID(UUID.randomUUID().toString());

		PatientsType patients = PatientExportFactory.eINSTANCE.createPatientsType();
		patients.getPatient().add(p1);
		patients.getPatient().add(p2);
		resource.getContents().add(patients);

		try {
			resource.save(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void load() {

		resourceSet.getPackageRegistry().put(PatientExportPackage.eNS_URI, PatientExportPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put("http://www.himsa.com/PatientExport/PatientExport", PatientExportPackage.eINSTANCE);
		// Create and configure ExtendedMetaData
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		Resource resource = resourceSet.createResource(URI.createURI("data/two_patients_data.xml"));
		//		Resource resource = resourceSet.createResource(URI.createURI("data/test.xml"));
		Map<String, Object> options = new HashMap<>();
		//		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		options.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		//		options.put(XMLResource.OPTION_ROOT_OBJECTS, List.of(PatientExportPackage.Literals.PATIENT_TYPE1));
		try {
			resource.load(options);
			if(!resource.getContents().isEmpty()) {
				for(EObject eObj : resource.getContents()) {
					if(eObj instanceof DocumentRoot root) {
						PatientsType patients = root.getPatients();
						if(patients != null) {
							for(PatientType1 p : patients.getPatient()) {
								for(ActionDataType adt : p.getActions().getAction()) {
									if(adt.getTypeOfData().equals(TypeOfDataType.AUDIOGRAM)) {
										System.out.println(adt.getPublicData().getHIMSAAudiometricStandard().toString());
									}
								}
							}
						}

					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
