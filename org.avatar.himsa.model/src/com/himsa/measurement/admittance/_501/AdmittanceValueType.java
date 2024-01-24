/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admittance Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The admittance Curve depicts the modulus of the admittance, i.e. the length of a complex value, calculated by using Pythagoras´ sentence. In this
 * structure, both the real and the imaginary part of the value is saved, but for practical purposes, the admittance can be considered 90 degrees out of
 * phase (real part approximately zero) at the Max. admittance point. This rule applies only for probe frequencies near 220 Hz e.g. 226 Hz.
 * 
 * @@ 500 to 501 name change
 * admittanceValue_Type to AdmittanceValue_Type
 * @@
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceValueType#getValueCalculated <em>Value Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceValueType#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueType()
 * @model extendedMetaData="name='AdmittanceValue_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculated value was first introduced in version 501.  When converting down it will be necessary to move the Y value to Argumentadmittance1 > AND then place a 0 (zero) in the Argumentadmittance2 Element.  HIMSA has tried very hard not to use zero in this case since the migration to XSD based formats.  However, in this case, this is the only option and previous to format 501 the use of zero in B was commonly used to denote that the point was a calculated point.
	 * 
	 * @@
	 * 
	 * 
	 * @@ Convert UP from 500 to 501
	 * 
	 * IF there is one point or value AND argument2 is set to 0 then it is possible to map Argument 1 to Y
	 * 
	 * If there is more than one point or value then argument1 will map to G and argument2 will map to B, it is not a calculated point but rather a measured
	 * 
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Calculated</em>' containment reference.
	 * @see #setValueCalculated(AdmittanceValueCalculatedType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueType_ValueCalculated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueCalculated' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueCalculatedType getValueCalculated();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceValueType#getValueCalculated <em>Value Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Calculated</em>' containment reference.
	 * @see #getValueCalculated()
	 * @generated
	 */
	void setValueCalculated(AdmittanceValueCalculatedType value);

	/**
	 * Returns the value of the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculated value was first introduced in version 501.  When converting down it will be necessary to move the G value to Argumentadmittance1 > AND then B value to the Argumentadmittance2 Element.  
	 * 
	 * @@
	 * 
	 * 
	 * @@ Convert UP from 500 to 501
	 * 
	 * IF there is one point or value AND argument2 is set to 0 then it is possible to map Argument 1 to Y
	 * 
	 * If there is more than one point or value then argument1 will map to G and argument2 will map to B
	 * 
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured</em>' containment reference.
	 * @see #setMeasured(AdmittanceValueMeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueType_Measured()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measured' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueMeasuredType getMeasured();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceValueType#getMeasured <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured</em>' containment reference.
	 * @see #getMeasured()
	 * @generated
	 */
	void setMeasured(AdmittanceValueMeasuredType value);

} // AdmittanceValueType
