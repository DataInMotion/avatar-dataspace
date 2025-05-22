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
import java.util.UUID;
import java.util.logging.Logger;

import org.avatar.gics.service.api.GICSService;
import org.avatar.gics.service.api.GICSServiceConfig;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsent;
import org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
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
@Component(name = "GICSService", configurationPid = "GICSService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class GICSServiceImpl implements GICSService {

	@Reference(target = "(&("+EMFNamespaces. EMF_MODEL_CONTENT_TYPE+"=soap)("+EMFNamespaces.EMF_MODEL_NAME+"=cm2))")
	ResourceSet rs;

	@Reference(target = "("+EMFNamespaces.EMF_MODEL_CONTENT_TYPE+"=soap)")
	EnvelopePackage soapPackage;

	@Reference(target = "("+EMFNamespaces.EMF_MODEL_NAME+"=cm2)")
	Cm2Package cm2Package;

	private static final Logger LOGGER = Logger.getLogger(GICSServiceImpl.class.getName());
	private GICSServiceConfig config;

	@Activate
	public void activate(GICSServiceConfig config) {
		this.config = config;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.gics.service.api.GICSService#getAllConsentedIdsFor(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public GetAllConsentedIdsForResponse getAllConsentedIdsFor(String domainName, String policyName,
			String policyVersion, String signerIdTypeName) {

		org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot gICSRoot = Cm2Factory.eINSTANCE.createDocumentRoot();
		GetAllConsentedIdsFor request = GICSServiceHelper.createGetAllConsentedIdsForRequest(domainName, policyName, policyVersion, signerIdTypeName);
		gICSRoot.setGetAllConsentedIdsFor(request);
		
		DocumentRoot soapRoot = EnvelopeFactory.eINSTANCE.createDocumentRoot();
		Envelope envelope = EnvelopeFactory.eINSTANCE.createEnvelope();
		Body body = EnvelopeFactory.eINSTANCE.createBody();
		envelope.setBody(body);
		soapRoot.setEnvelope(envelope);
		
		body.getAny().add(cm2Package.getDocumentRoot_GetAllConsentedIdsFor(), request);
		Resource resource = rs.createResource(URI.createURI(config.url()), "soap");
		resource.getContents().add(soapRoot);

		try {
			HttpURLConnection connection = setupConnection("POST");
			resource.save(connection.getOutputStream(), null);
			int responseCode = connection.getResponseCode();
			if (responseCode == 200 ) {
				Resource responseResource = rs.createResource(URI.createURI(UUID.randomUUID().toString()+".soap"), "soap");
				responseResource.load(connection.getInputStream(), null);
				DocumentRoot response = (DocumentRoot) responseResource.getContents().get(0);
				FeatureMap mixed = response.getMixed();
				Envelope responseEnvelope = (Envelope) mixed.get(soapPackage.getDocumentRoot_Envelope(), true);
				GetAllConsentedIdsForResponse responseBody =  (GetAllConsentedIdsForResponse) responseEnvelope.getBody().getAny().get(0).getValue();
				return responseBody;
			} else {
				LOGGER.warning(String.format("Unexpected response code %d for request GetAllConsentedIdsFor: %s", responseCode, connection.getResponseMessage()));
				return null;
			}
			
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while sending request GetAllConsentedIdsFor: %s", e.getCause()));
			e.printStackTrace();
			return null;
		}		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.avatar.gics.service.api.GICSService#addConsent(org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO)
	 */
	@Override
	public AddConsentResponse addConsent(ConsentDTO consent) {
		org.emau.icmvc.ganimed.ttp.cm2.DocumentRoot gICSRoot = Cm2Factory.eINSTANCE.createDocumentRoot();
		AddConsent request = Cm2Factory.eINSTANCE.createAddConsent();
		request.setConsent(consent);
		gICSRoot.setAddConsent(request);
		
		DocumentRoot soapRoot = EnvelopeFactory.eINSTANCE.createDocumentRoot();
		Envelope envelope = EnvelopeFactory.eINSTANCE.createEnvelope();
		Body body = EnvelopeFactory.eINSTANCE.createBody();
		envelope.setBody(body);
		soapRoot.setEnvelope(envelope);
		
		body.getAny().add(cm2Package.getDocumentRoot_AddConsent(), request);
		Resource resource = rs.createResource(URI.createURI(config.url()), "soap");
		resource.getContents().add(soapRoot);
		
		try {
			HttpURLConnection connection = setupConnection("POST");
			resource.save(connection.getOutputStream(), null);
			int responseCode = connection.getResponseCode();
			if (responseCode == 200 ) {
				//				InputStream result = dwdCon.getInputStream();
				Resource responseResource = rs.createResource(URI.createURI(UUID.randomUUID().toString()+".soap"), "soap");
				responseResource.load(connection.getInputStream(), null);
				DocumentRoot response = (DocumentRoot) responseResource.getContents().get(0);
				FeatureMap mixed = response.getMixed();
				Envelope responseEnvelope = (Envelope) mixed.get(soapPackage.getDocumentRoot_Envelope(), true);
				AddConsentResponse responseBody =  (AddConsentResponse) responseEnvelope.getBody().getAny().get(0).getValue();
				LOGGER.info(String.format("Got response request AddConsent"));
				return responseBody;
			} else {
				LOGGER.warning(String.format("Unexpected response code %d for request AddConsent", responseCode));
				return null;
			}
			
		} catch(IOException e) {
			LOGGER.severe(String.format("IOException while sending request AddConsent"));
			e.printStackTrace();
			return null;
		}		
	}


	private HttpURLConnection setupConnection(String methodType) throws IOException {

		URL url = new URL(config.url());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.addRequestProperty("Accept", "*/*");
		connection.addRequestProperty("Content-Type", "text/plain");
		connection.addRequestProperty("SOAPAction", "");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod(methodType);
		return connection;
	}

	
}
