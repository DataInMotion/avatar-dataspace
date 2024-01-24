/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admittance Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Y-values of the admittance Curve can have different units (cc, ml, mmho..
 * etc), which depends of the instrument type.
 * 
 * @@ Convert UP from 500 to 501
 * When converting UP the ArgumentUnit1 value will map to admittanceUnitMeasured > G
 * ArgumentUnit2 will map to admittanceUnitMeasured > B
 * @@
 * 
 * @@ 500 to 501 name change
 * admittanceUnit_Type to AdmittanceUnit_Type
 * @@
 * 
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceUnitType#getAdmittanceUnitCalculated <em>Admittance Unit Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceUnitType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceUnitType()
 * @model extendedMetaData="name='AdmittanceUnit_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Admittance Unit Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculated value was first introduced in version 501.  When converting down it will be necessary to map the Y value to ArgumentUnit1 AND also ArgumentUnit2.  
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Unit Calculated</em>' containment reference.
	 * @see #setAdmittanceUnitCalculated(AdmittanceUnitCalculatedType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceUnitType_AdmittanceUnitCalculated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdmittanceUnitCalculated' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitCalculatedType getAdmittanceUnitCalculated();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceUnitType#getAdmittanceUnitCalculated <em>Admittance Unit Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Unit Calculated</em>' containment reference.
	 * @see #getAdmittanceUnitCalculated()
	 * @generated
	 */
	void setAdmittanceUnitCalculated(AdmittanceUnitCalculatedType value);

	/**
	 * Returns the value of the '<em><b>Admittance Unit Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The Measured value was first introduced in version 501. 
	 * When converting down it will be necessary to map the Y value to ArgumentUnit1 AND B value to ArgumentUnit2.  
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Unit Measured</em>' containment reference.
	 * @see #setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceUnitType_AdmittanceUnitMeasured()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdmittanceUnitMeasured' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitMeasuredType getAdmittanceUnitMeasured();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceUnitType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Unit Measured</em>' containment reference.
	 * @see #getAdmittanceUnitMeasured()
	 * @generated
	 */
	void setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType value);

} // AdmittanceUnitType
