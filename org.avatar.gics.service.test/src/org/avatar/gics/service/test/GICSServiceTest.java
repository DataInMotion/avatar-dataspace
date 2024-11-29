/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.avatar.gics.service.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.avatar.gics.service.api.GICSService;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Reference;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "GICSService", location = "?", name = "test", properties = {
		@Property(key = "url", value = "http://localhost:8080/gics/gicsService")
})
public class GICSServiceTest {
	
	@Reference(target = "(&("+EMFNamespaces. EMF_MODEL_CONTENT_TYPE+"=soap)("+EMFNamespaces.EMF_MODEL_NAME+"=cm2))")
	ResourceSet rs;
	

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		
	}
	
	@Test
	public void test(@InjectService ServiceAware<GICSService> gicsServiceAware) {
		assertNotNull(gicsServiceAware);
		GICSService gicsService = gicsServiceAware.getService();
		assertNotNull(gicsService);
	}
	
	

}
