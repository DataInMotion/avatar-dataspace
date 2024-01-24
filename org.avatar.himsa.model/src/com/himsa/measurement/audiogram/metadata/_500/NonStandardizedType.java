/*
 */
package com.himsa.measurement.audiogram.metadata._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Standardized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue <em>Defined Value</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getCustomValue <em>Custom Value</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getNonStandardizedType()
 * @model extendedMetaData="name='NonStandardized_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NonStandardizedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enumerated choices of Good, Fair and Poor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Value</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @see #isSetDefinedValue()
	 * @see #unsetDefinedValue()
	 * @see #setDefinedValue(DefinedValueType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getNonStandardizedType_DefinedValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DefinedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinedValueType getDefinedValue();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Value</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @see #isSetDefinedValue()
	 * @see #unsetDefinedValue()
	 * @see #getDefinedValue()
	 * @generated
	 */
	void setDefinedValue(DefinedValueType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinedValue()
	 * @see #getDefinedValue()
	 * @see #setDefinedValue(DefinedValueType)
	 * @generated
	 */
	void unsetDefinedValue();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue <em>Defined Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defined Value</em>' attribute is set.
	 * @see #unsetDefinedValue()
	 * @see #getDefinedValue()
	 * @see #setDefinedValue(DefinedValueType)
	 * @generated
	 */
	boolean isSetDefinedValue();

	/**
	 * Returns the value of the '<em><b>Custom Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a free form text string can be stored if one of the defined values is not desired
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Value</em>' attribute.
	 * @see #setCustomValue(String)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getNonStandardizedType_CustomValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CustomValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomValue();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getCustomValue <em>Custom Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Value</em>' attribute.
	 * @see #getCustomValue()
	 * @generated
	 */
	void setCustomValue(String value);

} // NonStandardizedType
