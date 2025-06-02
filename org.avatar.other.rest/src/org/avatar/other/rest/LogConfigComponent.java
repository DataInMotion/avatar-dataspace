/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.avatar.other.rest;

import java.io.IOException;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author ilenia
 * @since Jun 2, 2025
 */
@Component(name = "LogConfigComponent", immediate = true)
public class LogConfigComponent {
	
	private static final Logger LOGGER = Logger.getLogger(LogConfigComponent.class.getName());
	
	@Activate
	public void activate() {
		setupLogConfig();
		LOGGER.info("Log Config done!");
	}
	
	private void setupLogConfig() {
		String logConfig = ".level=" + java.util.logging.Level.INFO + '\n';
		logConfig += "handlers=java.util.logging.ConsoleHandler\n";
		// ensure ConsoleHandler does not filter
		logConfig += "java.util.logging.ConsoleHandler" + ".level=" + java.util.logging.Level.FINEST + '\n';

		//set your custom levels
		logConfig += "o.e.e.m.eObjectBuilder" + ".level=" + java.util.logging.Level.SEVERE + "\n";

		try {
		  java.util.logging.LogManager.getLogManager().readConfiguration(new java.io.ByteArrayInputStream(logConfig.getBytes("UTF-8")));
		  // no need to close ByteArrayInputStream -- it is a no-op
		}
		catch (IOException ioe) {
		  LOGGER.severe("IOException while configuring login");
		  ioe.printStackTrace();
		}

	}
}
