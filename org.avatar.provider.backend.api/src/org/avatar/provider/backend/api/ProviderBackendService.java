package org.avatar.provider.backend.api;

import de.avatar.status.QueryRequest;


public interface ProviderBackendService {
	
	 void executeQuery(QueryRequest queryRequest);
	 
	 void executeDryRun(QueryRequest queryRequest);

}
