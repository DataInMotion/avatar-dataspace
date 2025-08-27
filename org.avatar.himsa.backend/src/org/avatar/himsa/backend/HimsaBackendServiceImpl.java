package org.avatar.himsa.backend;

import java.util.UUID;

import org.avatar.himsa.patient.service.api.QueryRequestExecutorService;
import org.avatar.provider.backend.api.ProviderBackendService;
import org.hl7.fhir.FHIRPackage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.avatar.metadata.ConnectorMetadata;
import de.avatar.metadata.MetadataFactory;
import de.avatar.model.connector.EndpointResponse;
import de.avatar.status.QueryRequest;

@Component(name = "HimsaBackendService", property = {"provider.id=himsa"})
public class HimsaBackendServiceImpl implements ProviderBackendService{
	
	private QueryRequestExecutorService himsaQueryExecutorService;
	private QueryRequestExecutorService hl7QueryExecutorService;

	@Activate
	public HimsaBackendServiceImpl(@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(component.name=PatientQueryRequestExecutorService)") QueryRequestExecutorService himsaQueryExecutorService,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(component.name=Hl7QueryRequestExecutorService)") QueryRequestExecutorService hl7QueryExecutorService) {
		this.himsaQueryExecutorService = himsaQueryExecutorService;	
		this.hl7QueryExecutorService = hl7QueryExecutorService;
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.ProviderBackendService#executeQuery(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeQuery(QueryRequest queryRequest) {
		EndpointResponse response = null;
		if(FHIRPackage.eNS_URI.equals(queryRequest.getQuery().getFrom().get(0).getRootEClass().getEPackage().getNsURI())) {
			response = hl7QueryExecutorService.executeQueryRequest(queryRequest, getConnectorMetadata());
		} else {
			response = himsaQueryExecutorService.executeQueryRequest(queryRequest, getConnectorMetadata());
		}
		return response;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.avatar.provider.backend.api.ProviderBackendService#executeDryRun(de.avatar.status.QueryRequest)
	 */
	@Override
	public EndpointResponse executeDryRun(QueryRequest queryRequest) {
		EndpointResponse response = null;
		if(FHIRPackage.eNS_URI.equals(queryRequest.getQuery().getFrom().get(0).getRootEClass().getEPackage().getNsURI())) {
			response = hl7QueryExecutorService.executeDryRunRequest(queryRequest, getConnectorMetadata());
		} else {
			response = himsaQueryExecutorService.executeDryRunRequest(queryRequest, getConnectorMetadata());	
		}	
		return response;		
	}
	
	private ConnectorMetadata getConnectorMetadata() {
		ConnectorMetadata connMetadata = MetadataFactory.eINSTANCE.createConnectorMetadata();
		connMetadata.setConnectorId("himsa");
		connMetadata.setConnectorName("himsa");
		connMetadata.setDescription("Himsa Data Provider");
		connMetadata.setId(UUID.randomUUID().toString());
		return connMetadata;
	}
}
