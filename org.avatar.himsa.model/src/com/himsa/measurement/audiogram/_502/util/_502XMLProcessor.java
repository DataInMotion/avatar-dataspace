/**
 */
package com.himsa.measurement.audiogram._502.util;

import com.himsa.measurement.audiogram._502._502Package;

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
public class _502XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _502XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		_502Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the _502ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new _502ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new _502ResourceFactoryImpl());
		}
		return registrations;
	}

} //_502XMLProcessor
