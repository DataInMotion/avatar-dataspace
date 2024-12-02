package org.avatar.gics.service.api;

import org.emau.icmvc.ganimed.ttp.cm2.AddConsentResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsForResponse;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface GICSService {

	GetAllConsentedIdsForResponse getAllConsentedIdsFor(String domainName, String policyName, String policyVersion, String signerIdTypeName);
	
	AddConsentResponse addConsent(ConsentDTO consent); 

}
