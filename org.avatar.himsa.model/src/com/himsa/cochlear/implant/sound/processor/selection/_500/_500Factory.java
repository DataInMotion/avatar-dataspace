/*
 */
package com.himsa.cochlear.implant.sound.processor.selection._500;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.cochlear.implant.sound.processor.selection._500._500Package
 * @generated
 */
@ProviderType
public interface _500Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_500Factory eINSTANCE = com.himsa.cochlear.implant.sound.processor.selection._500.impl._500FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cochlear Implant Sound Processor Selection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cochlear Implant Sound Processor Selection Type</em>'.
	 * @generated
	 */
	CochlearImplantSoundProcessorSelectionType createCochlearImplantSoundProcessorSelectionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_500Package get_500Package();

} //_500Factory
