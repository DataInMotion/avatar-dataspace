package org.avatar.other.backend;

import java.util.UUID;

import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.ProviderBackendService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.QueryRequest;

@Component(name = "OtherBackendService", property = "provider.id=other")
public class OtherBackendServiceImpl implements ProviderBackendService{
	
	@Reference
	QueryRequestExecutorService queryExecutorService;


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.ProviderBackendService#executeQuery(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeQuery(QueryRequest queryRequest) {
		EndpointResponse response = queryExecutorService.executeQueryRequest(queryRequest);		
		if(response != null) {
			addConnectorMetadata(response);
		}
		return response;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.ProviderBackendService#executeDryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public void executeDryRun(QueryRequest queryRequest) {
		// TODO Auto-generated method stub
		
	}
	
	private void addConnectorMetadata(EndpointResponse response) {
		ConnectorMetadata connMetadata = MetadataFactory.eINSTANCE.createConnectorMetadata();
		connMetadata.setConnectorId("other");
		connMetadata.setConnectorName("other");
		connMetadata.setDescription("Other Data Provider");
		connMetadata.setId(UUID.randomUUID().toString());
		response.getMetadata().add(connMetadata);
	}
}
