package org.avatar.data.quality.api;

import org.osgi.annotation.versioning.ProviderType;

import de.avatar.metadata.DataQualityMetadata;

@ProviderType
public interface DataQualityService {

    DataQualityMetadata getDataQualityMetadata();

}
