/*
 */
package com.himsa.patient.export.patient.export;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.patient.export.patient.export.PatientType1#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.himsa.patient.export.patient.export.ExportPackage#getPatientType1()
 * @model extendedMetaData="name='Patient_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PatientType1 extends PatientType {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #isSetActions()
	 * @see #unsetActions()
	 * @see #setActions(ActionsType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPatientType1_Actions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Actions' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionsType getActions();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PatientType1#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #isSetActions()
	 * @see #unsetActions()
	 * @see #getActions()
	 * @generated
	 */
	void setActions(ActionsType value);

	/**
	 * Unsets the value of the '{@link com.himsa.patient.export.patient.export.PatientType1#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActions()
	 * @see #getActions()
	 * @see #setActions(ActionsType)
	 * @generated
	 */
	void unsetActions();

	/**
	 * Returns whether the value of the '{@link com.himsa.patient.export.patient.export.PatientType1#getActions <em>Actions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actions</em>' containment reference is set.
	 * @see #unsetActions()
	 * @see #getActions()
	 * @see #setActions(ActionsType)
	 * @generated
	 */
	boolean isSetActions();

} // PatientType1
