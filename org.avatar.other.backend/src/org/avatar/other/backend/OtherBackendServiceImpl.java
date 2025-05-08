package org.avatar.other.backend;

import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.ProviderBackendService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
	public void executeQuery(QueryRequest queryRequest) {
		queryExecutorService.executeQueryRequest(queryRequest);
	}


	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.ProviderBackendService#executeDryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public void executeDryRun(QueryRequest queryRequest) {
		// TODO Auto-generated method stub
		
	}
}
