package org.avatar.other.backend;

import java.util.UUID;

import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.ProviderBackendService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.QueryRequest;

@Component(name = "OtherBackendService", property = "provider.id=other")
public class OtherBackendServiceImpl implements ProviderBackendService{
	
	
	private QueryRequestExecutorService queryExecutorService;

	@Activate
	public OtherBackendServiceImpl(@Reference(cardinality = ReferenceCardinality.MANDATORY) QueryRequestExecutorService queryExecutorService) {
		this.queryExecutorService = queryExecutorService;	
	}


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
	public EndpointResponse executeDryRun(QueryRequest queryRequest) {
		EndpointResponse response = queryExecutorService.executeDryRunRequest(queryRequest);		
		if(response != null) {
			addConnectorMetadata(response);
		}
		return response;
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
