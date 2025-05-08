package org.avatar.himsa.backend;

import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.ProviderBackendService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.status.QueryRequest;

@Component(name = "HimsaBackendService", property = {"provider.id=himsa"})
public class HimsaBackendServiceImpl implements ProviderBackendService{
	
	private QueryRequestExecutorService queryExecutorService;

	@Activate
	public HimsaBackendServiceImpl(@Reference(cardinality = ReferenceCardinality.MANDATORY) QueryRequestExecutorService queryExecutorService) {
		this.queryExecutorService = queryExecutorService;	
	}
	
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
