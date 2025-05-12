package org.avatar.ds.dummy.component;

import java.nio.file.Path;

import org.avatar.ds.model.asset.Asset;
import org.avatar.ds.model.asset.AssetPolicy;
import org.avatar.ds.model.asset.ContractDefinition;
import org.avatar.provider.backend.api.DataAssetService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, name = "DSDummyComponent", service =  DSDummyComponent.class, property = {
		"osgi.command.scope=ds", //
		"osgi.command.function=addAsset", 
		"osgi.command.function=addPolicy",
		"osgi.command.function=addContract"
})
public class DSDummyComponent {

	@Reference
	DataAssetService dsService;
	
	@Activate
	public void activate() {
		System.out.println("DSDummyComponent is active!");
	}
	
	public Asset addAsset(String id, String path, String name) {
		return dsService.createAssetInDataSpace(id, Path.of(path), name);
	}
	
	public AssetPolicy addPolicy(String policyId) {
		return dsService.createAssetPolicyInDataSpace(policyId);
	}
	
	public ContractDefinition addContract(String policyId) {
		return dsService.createContractDefinitionInDataSpace(policyId);
	}

}
