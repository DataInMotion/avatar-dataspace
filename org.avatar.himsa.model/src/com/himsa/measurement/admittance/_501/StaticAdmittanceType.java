/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Admittance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Also known as peak compensated static acoustic admittance. This is the height of the peak measured from the positive tail (typically +200daPa) to the peak. The term compensated means the admittance at the positive tail, which is used as an estimate of ear canal volume, has been removed from the measurement of peak height. 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.StaticAdmittanceType#getStaticAdmittanceValue <em>Static Admittance Value</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.StaticAdmittanceType#getStaticAdmittanceUnit <em>Static Admittance Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getStaticAdmittanceType()
 * @model extendedMetaData="name='StaticAdmittance_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaticAdmittanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Static Admittance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Admittance Value</em>' containment reference.
	 * @see #setStaticAdmittanceValue(AdmittanceValueType)
	 * @see com.himsa.measurement.admittance._501._501Package#getStaticAdmittanceType_StaticAdmittanceValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StaticAdmittanceValue' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueType getStaticAdmittanceValue();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.StaticAdmittanceType#getStaticAdmittanceValue <em>Static Admittance Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Admittance Value</em>' containment reference.
	 * @see #getStaticAdmittanceValue()
	 * @generated
	 */
	void setStaticAdmittanceValue(AdmittanceValueType value);

	/**
	 * Returns the value of the '<em><b>Static Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usually  "cc", "ml", "mmho"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Admittance Unit</em>' containment reference.
	 * @see #setStaticAdmittanceUnit(AdmittanceUnitType)
	 * @see com.himsa.measurement.admittance._501._501Package#getStaticAdmittanceType_StaticAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StaticAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitType getStaticAdmittanceUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.StaticAdmittanceType#getStaticAdmittanceUnit <em>Static Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Admittance Unit</em>' containment reference.
	 * @see #getStaticAdmittanceUnit()
	 * @generated
	 */
	void setStaticAdmittanceUnit(AdmittanceUnitType value);

} // StaticAdmittanceType
