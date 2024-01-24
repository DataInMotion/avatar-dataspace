/*
 */
package com.himsa.measurement.tinnitus._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of Signal used in the measurement. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes <em>Signal Types</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getSignalType()
 * @model extendedMetaData="name='Signal_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Types</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.tinnitus._500.SignalTypesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Other type should be specified in the OtherSignalType element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Types</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @see #isSetSignalTypes()
	 * @see #unsetSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getSignalType_SignalTypes()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Types' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalTypesType getSignalTypes();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Types</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @see #isSetSignalTypes()
	 * @see #unsetSignalTypes()
	 * @see #getSignalTypes()
	 * @generated
	 */
	void setSignalTypes(SignalTypesType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalTypes()
	 * @see #getSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @generated
	 */
	void unsetSignalTypes();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes <em>Signal Types</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Types</em>' attribute is set.
	 * @see #unsetSignalTypes()
	 * @see #getSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @generated
	 */
	boolean isSetSignalTypes();

	/**
	 * Returns the value of the '<em><b>Other Signal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the Signal used when referring to "Other" signal type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Signal Specification</em>' attribute.
	 * @see #setOtherSignalSpecification(String)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getSignalType_OtherSignalSpecification()
	 * @model dataType="com.himsa.measurement.tinnitus._500.OtherSignalSpecificationType"
	 *        extendedMetaData="kind='element' name='OtherSignalSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOtherSignalSpecification();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Signal Specification</em>' attribute.
	 * @see #getOtherSignalSpecification()
	 * @generated
	 */
	void setOtherSignalSpecification(String value);

} // SignalType
