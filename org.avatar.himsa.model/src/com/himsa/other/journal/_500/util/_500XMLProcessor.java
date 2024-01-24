/**
 */
package com.himsa.other.journal._500.util;

import com.himsa.other.journal._500._500Package;

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
public class _500XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _500XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		_500Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the _500ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new _500ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new _500ResourceFactoryImpl());
		}
		return registrations;
	}

} //_500XMLProcessor
