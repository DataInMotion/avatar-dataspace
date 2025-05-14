package org.avatar.provider.backend.api;

import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.QueryRequest;


public interface ProviderBackendService {
	
	 EndpointResponse executeQuery(QueryRequest queryRequest);
	 
	 void executeDryRun(QueryRequest queryRequest);

}
