/*
 */
package com.himsa.measurement.audiogram.metadata._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMCLASS Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getRightEar <em>Right Ear</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getLeftEar <em>Left Ear</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType1()
 * @model extendedMetaData="name='AMCLASS_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AMCLASSType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram.metadata._500.SymmetryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType1_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType getSymmetry();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>Right Ear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ear</em>' containment reference.
	 * @see #setRightEar(AMCLASSType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType1_RightEar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RightEar' namespace='##targetNamespace'"
	 * @generated
	 */
	AMCLASSType getRightEar();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getRightEar <em>Right Ear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ear</em>' containment reference.
	 * @see #getRightEar()
	 * @generated
	 */
	void setRightEar(AMCLASSType value);

	/**
	 * Returns the value of the '<em><b>Left Ear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Ear</em>' containment reference.
	 * @see #setLeftEar(AMCLASSType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType1_LeftEar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LeftEar' namespace='##targetNamespace'"
	 * @generated
	 */
	AMCLASSType getLeftEar();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getLeftEar <em>Left Ear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ear</em>' containment reference.
	 * @see #getLeftEar()
	 * @generated
	 */
	void setLeftEar(AMCLASSType value);

} // AMCLASSType1
