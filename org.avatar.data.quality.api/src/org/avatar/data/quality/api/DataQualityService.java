package org.avatar.data.quality.api;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.avatar.model.connector.Metadata;

@ProviderType
public interface DataQualityService {

    List<Metadata> getDataQualityMetadata();


}
