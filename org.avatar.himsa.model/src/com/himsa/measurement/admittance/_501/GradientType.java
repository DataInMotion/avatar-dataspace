/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Gradient of the admittance Curve 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.GradientType#getGradientValue <em>Gradient Value</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.GradientType#getGradientUnit <em>Gradient Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getGradientType()
 * @model extendedMetaData="name='Gradient_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GradientType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gradient Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gradient of the admittance curve
	 * 
	 * @@ Convert UP from 500 to 501
	 * When converting UP the ArgumentUnit1 value will map to admittanceValueMeasured > G
	 * ArgumentUnit2 will map to admittanceValueMeasured > B
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient Value</em>' containment reference.
	 * @see #setGradientValue(AdmittanceValueType)
	 * @see com.himsa.measurement.admittance._501._501Package#getGradientType_GradientValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GradientValue' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueType getGradientValue();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.GradientType#getGradientValue <em>Gradient Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Value</em>' containment reference.
	 * @see #getGradientValue()
	 * @generated
	 */
	void setGradientValue(AdmittanceValueType value);

	/**
	 * Returns the value of the '<em><b>Gradient Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the gradient value either ml,cc, mmho or deka Pascal
	 * 
	 * 
	 * @@ Convert UP from 500 to 501
	 * In format 500 there was only one unit.  To keep the XSD more consistent:
	 * 
	 * When dealing with a calculated point then map to Y
	 * When dealing wiht a measured pont then map to both G and B
	 * 
	 * @@
	 * 
	 * 
	 * @@ Convert Down from 501 to 500
	 * Map Y to GradientUnit
	 * Or
	 * Map G to GradientUnit
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient Unit</em>' containment reference.
	 * @see #setGradientUnit(AdmittanceUnitType)
	 * @see com.himsa.measurement.admittance._501._501Package#getGradientType_GradientUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GradientUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitType getGradientUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.GradientType#getGradientUnit <em>Gradient Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Unit</em>' containment reference.
	 * @see #getGradientUnit()
	 * @generated
	 */
	void setGradientUnit(AdmittanceUnitType value);

} // GradientType
