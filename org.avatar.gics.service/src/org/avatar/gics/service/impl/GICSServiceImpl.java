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
package org.avatar.gics.service.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.avatar.gics.service.api.GICSService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigFactory;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.xmlsoap.schemas.envelope.Body;
import org.xmlsoap.schemas.envelope.DocumentRoot;
import org.xmlsoap.schemas.envelope.Envelope;
import org.xmlsoap.schemas.envelope.EnvelopeFactory;
import org.xmlsoap.schemas.envelope.EnvelopePackage;

/**
 * 
 * @author ilenia
 * @since Nov 28, 2024
 */
@RequireEMF
@Component(immediate = true, name = "GICSService")
public class GICSServiceImpl implements GICSService {
	
	@Reference(target = "("+EMFNamespaces. EMF_MODEL_CONTENT_TYPE+"=soap)")
	ResourceSet rs;
	
	@Reference(target = "("+EMFNamespaces.EMF_MODEL_CONTENT_TYPE+"=soap)")
	EnvelopePackage soapPackage;
	
	@Reference(target = "("+EMFNamespaces.EMF_MODEL_NAME+"=cm2)")
	Cm2Package cm2Package;
	
	@Activate
	public void activate() {
		Resource res = rs.createResource(URI.createFileURI("test.envelope"), "soap");
		DocumentRoot soapRoot = EnvelopeFactory.eINSTANCE.createDocumentRoot();
		Envelope envelope = EnvelopeFactory.eINSTANCE.createEnvelope();
		Body body = EnvelopeFactory.eINSTANCE.createBody();
		envelope.setBody(body);
		soapRoot.setEnvelope(envelope);

		
		org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot gICSRoot = Cm2Factory.eINSTANCE.createDocumentRoot();
		GetAllConsentedIdsFor request = Cm2Factory.eINSTANCE.createGetAllConsentedIdsFor();
		request.setSignerIdTypeName("Patient ID");
		PolicyKeyDTO policyKey = Cm2Factory.eINSTANCE.createPolicyKeyDTO();
		policyKey.setDomainName("avatar");
		policyKey.setName("medical_history_policy");
		policyKey.setVersion("1.0");
		request.setPolicyKey(policyKey);
		CheckConsentConfig config = ConfigFactory.eINSTANCE.createCheckConsentConfig();
		config.setIgnoreVersionNumber(false);
		request.setConfig(config);
		request.setConfig(config);
		gICSRoot.setGetAllConsentedIdsFor(request);
		
		body.getAny().add(cm2Package.getDocumentRoot_GetAllConsentedIdsFor(), request);
		Resource resource = rs.createResource(URI.createURI("http://localhost:8080/gics/gicsService"), "soap");
		resource.getContents().add(soapRoot);
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		try {
//			resource.save(baos, null);
//			System.out.println("Result: " + new String(baos.toByteArray(), StandardCharsets.UTF_8));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		body.getAny().add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, request);
//		
//		Resource resource = rs.createResource(URI.createURI("http://localhost:8080/gics/gicsService"));
//		resource.getContents().add(soapRoot);
		try {
			URL dwd = new URL("http://localhost:8080/gics/gicsService");
			HttpURLConnection dwdCon = (HttpURLConnection) dwd.openConnection();
			dwdCon.addRequestProperty("Accept", "*/*");
			dwdCon.addRequestProperty("Content-Type", "text/plain");
			dwdCon.addRequestProperty("SOAPAction", "");
			dwdCon.setDoInput(true);
			dwdCon.setDoOutput(true);
			dwdCon.setRequestMethod("POST");
			resource.save(dwdCon.getOutputStream(), null);
			int responseCode = dwdCon.getResponseCode();
			if (responseCode == 200 ) {
//				InputStream result = dwdCon.getInputStream();
				Resource responseResource = rs.createResource(URI.createURI("reposnse.soap"), "soap");
				responseResource.load(dwdCon.getInputStream(), null);
				DocumentRoot response = (DocumentRoot) responseResource.getContents().get(0);
				FeatureMap mixed = response.getMixed();
				Envelope responseEnvelope = (Envelope) mixed.get(soapPackage.getDocumentRoot_Envelope(), true);
				GetAllConsentedIdsForResponse responseBody =  (GetAllConsentedIdsForResponse) responseEnvelope.getBody().getAny().get(0).getValue();
				
				System.out.println("Test");
				for(String id : responseBody.getReturn().getConsentIds()) {
					System.out.println("Consented Id " + id);
				}
			} else {
				System.out.println("Error: unexpected response code for request: " + responseCode);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		
//		
//		System.out.println("Test");
	}
}
