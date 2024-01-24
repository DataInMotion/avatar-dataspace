/*
 */
package com.himsa.instrument.selection;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.instrument.selection.SelectionPackage
 * @generated
 */
@ProviderType
public interface SelectionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectionFactory eINSTANCE = com.himsa.instrument.selection.impl.SelectionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Battery Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Type</em>'.
	 * @generated
	 */
	BatteryType createBatteryType();

	/**
	 * Returns a new object of class '<em>Device Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Category Type</em>'.
	 * @generated
	 */
	DeviceCategoryType createDeviceCategoryType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Hearing Instrument Selection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hearing Instrument Selection Type</em>'.
	 * @generated
	 */
	HearingInstrumentSelectionType createHearingInstrumentSelectionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SelectionPackage getSelectionPackage();

} //SelectionFactory
