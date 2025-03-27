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
package org.avatar.himsa.dummy.data.component.helper;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.mongo.ValueConverter;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author ilenia
 * @since Mar 26, 2025
 */
//@Component(immediate=true, name="EnumValueConverter")
public class EnumValueConverter implements ValueConverter {

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#convertMongoDBValueToEMFValue(org.eclipse.emf.ecore.EDataType, java.lang.Object)
	 */
	@Override
	public Object convertMongoDBValueToEMFValue(EDataType eDataType, Object databaseValue) {
		return EcoreUtil.createFromString(eDataType, (String) databaseValue);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#convertEMFValueToMongoDBValue(org.eclipse.emf.ecore.EDataType, java.lang.Object)
	 */
	@Override
	public Object convertEMFValueToMongoDBValue(EDataType eDataType, Object emfValue) {
		return EcoreUtil.convertToString(eDataType, emfValue);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#isConverterForType(org.eclipse.emf.ecore.EDataType)
	 */
	@Override
	public boolean isConverterForType(EDataType eDataType) {
		System.out.println(eDataType.getInstanceClass().getName());
		if (eDataType.getInstanceClass().equals(audiogram502.SignalType.class) || 
				eDataType.getInstanceClass().equals(audiogram502.SpeechThresholdType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.SignalOutputType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.PresentationType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.PointStatusType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.ToneAverageType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.TransducerCalibrationStandardType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.TransducerType.class) ||
				eDataType.getInstanceClass().equals(audiogram502.WeberPointStatusType.class)) {
			return true;
		}
		return false;
	}

}
