package org.avatar.ds.dummy.component;

import java.nio.file.Path;

import org.avatar.ds.model.asset.AssetPolicy;
import org.avatar.ds.model.asset.DataSpaceResponse;
import org.avatar.provider.backend.api.DataSpaceService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, name = "DSDummyComponent", service =  DSDummyComponent.class, property = {
		"osgi.command.scope=ds", //
		"osgi.command.function=addAsset", 
		"osgi.command.function=addPolicy",
		"osgi.command.function=addContract",
		"osgi.command.function=getPolicy"
})
public class DSDummyComponent {

	@Reference
	DataSpaceService dsService;
	
	@Activate
	public void activate() {
		System.out.println("DSDummyComponent is active!");
	}
	
	public DataSpaceResponse addAsset(String id, String path, String name) {
		return dsService.createAssetInDataSpace(id, Path.of(path), name);
	}
	
	public DataSpaceResponse addPolicy(String policyId) {
		return dsService.createAssetPolicyInDataSpace(policyId);
	}
	
	public DataSpaceResponse addContract(String policyId) {
		return dsService.createContractDefinitionInDataSpace(policyId);
	}
	
	public AssetPolicy getPolicy(String policyId) {
		return dsService.getAssetPolicy(policyId);
	}

}
