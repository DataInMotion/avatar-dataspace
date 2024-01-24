/*
 */
package org.avatar.himsa.export;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.avatar.himsa.export.PatientExportPackage
 * @generated
 */
@ProviderType
public interface PatientExportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatientExportFactory eINSTANCE = org.avatar.himsa.export.impl.PatientExportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Data Type</em>'.
	 * @generated
	 */
	ActionDataType createActionDataType();

	/**
	 * Returns a new object of class '<em>Actions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actions Type</em>'.
	 * @generated
	 */
	ActionsType createActionsType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Patients Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patients Type</em>'.
	 * @generated
	 */
	PatientsType createPatientsType();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Patient Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Type1</em>'.
	 * @generated
	 */
	PatientType1 createPatientType1();

	/**
	 * Returns a new object of class '<em>Publicly Formatted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publicly Formatted Data</em>'.
	 * @generated
	 */
	PubliclyFormattedData createPubliclyFormattedData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatientExportPackage getPatientExportPackage();

} //PatientExportFactory
