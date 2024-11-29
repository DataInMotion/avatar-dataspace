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

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Factory;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigFactory;

/**
 * 
 * @author ilenia
 * @since Nov 29, 2024
 */
public class GICSServiceHelper {
	
	private GICSServiceHelper() {
		
	}
	
	public static GetAllConsentedIdsFor createGetAllConsentedIdsForRequest(String domainName, String policyName,
			String policyVersion, String signerIdTypeName) {
		
		GetAllConsentedIdsFor request = Cm2Factory.eINSTANCE.createGetAllConsentedIdsFor();
		request.setSignerIdTypeName(signerIdTypeName);
		PolicyKeyDTO policyKey = Cm2Factory.eINSTANCE.createPolicyKeyDTO();
		policyKey.setDomainName(domainName);
		policyKey.setName(policyName);
		policyKey.setVersion(policyVersion);
		request.setPolicyKey(policyKey);
		CheckConsentConfig consentConfig = ConfigFactory.eINSTANCE.createCheckConsentConfig();
		consentConfig.setIgnoreVersionNumber(false);
		request.setConfig(consentConfig);
		request.setConfig(consentConfig);
		return request;
	}

}
