/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.MeasuredType#getAdmittancePointMeasured <em>Admittance Point Measured</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.MeasuredType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType()
 * @model extendedMetaData="name='Measured_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasuredType extends EObject {
	/**
	 * Returns the value of the '<em><b>Admittance Point Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admittance Point Measured</em>' containment reference.
	 * @see #setAdmittancePointMeasured(AdmittanceValueMeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType_AdmittancePointMeasured()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdmittancePointMeasured' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueMeasuredType getAdmittancePointMeasured();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.MeasuredType#getAdmittancePointMeasured <em>Admittance Point Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Point Measured</em>' containment reference.
	 * @see #getAdmittancePointMeasured()
	 * @generated
	 */
	void setAdmittancePointMeasured(AdmittanceValueMeasuredType value);

	/**
	 * Returns the value of the '<em><b>Admittance Unit Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Unit Measured</em>' containment reference.
	 * @see #setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType_AdmittanceUnitMeasured()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdmittanceUnitMeasured' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitMeasuredType getAdmittanceUnitMeasured();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.MeasuredType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Unit Measured</em>' containment reference.
	 * @see #getAdmittanceUnitMeasured()
	 * @generated
	 */
	void setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType value);

} // MeasuredType
