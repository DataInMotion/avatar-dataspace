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
package org.avatar.himsa.dummy.data.component.helper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.MissingPackageHandler;

import audiogram502.Audiogram502Package;

/**
 * 
 * @author ilenia
 * @since Mar 26, 2025
 */
public class DummyDataHelper {
	
	public static EObject loadXMLResource(String filePath, ResourceSet resourceSet) {
		String data = System.getProperty("data","/opt/avatar/data/");
		Resource resource = resourceSet.createResource(URI.createFileURI(data+"Format502AudSample.xml"), "application/xml");
		try {
			Map<String, Object> options = new HashMap<>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
			options.put(XMLResource.OPTION_MISSING_PACKAGE_HANDLER, new MissingPackageHandler() {

				@Override
				public EPackage getPackage(String nsURI) {
					return Audiogram502Package.eINSTANCE;
				}}
			);
			resource.load(options);
			if(resource.getContents() != null && !resource.getContents().isEmpty()) {
				EObject eObj = resource.getContents().get(0);
				return eObj;
//				if(eObj instanceof DocumentRoot root) {
//					himsaAudiometricStandard = root.getHIMSAAudiometricStandard();
//					if(himsaAudiometricStandard != null) {
//						System.out.println("Yeeeee!");
//					}
//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
