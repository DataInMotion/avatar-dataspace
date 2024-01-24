/*
 */
package com.himsa.instrument.remote.control;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.instrument.remote.control.ControlPackage
 * @generated
 */
@ProviderType
public interface ControlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlFactory eINSTANCE = com.himsa.instrument.remote.control.impl.ControlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Battery Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Type</em>'.
	 * @generated
	 */
	BatteryType createBatteryType();

	/**
	 * Returns a new object of class '<em>Remote Control Selection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Control Selection Type</em>'.
	 * @generated
	 */
	RemoteControlSelectionType createRemoteControlSelectionType();

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
	ControlPackage getControlPackage();

} //ControlFactory
