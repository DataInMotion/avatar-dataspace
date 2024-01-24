/**
 */
package com.himsa.measurement.admittance._501.util;

import com.himsa.measurement.admittance._501._501Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class _501XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _501XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		_501Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the _501ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new _501ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new _501ResourceFactoryImpl());
		}
		return registrations;
	}

} //_501XMLProcessor
