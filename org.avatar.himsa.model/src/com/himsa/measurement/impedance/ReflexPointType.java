/*
 */
package com.himsa.measurement.impedance;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reflex test point
 * 
 * ## TReflexPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.ReflexPointType#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ReflexPointType#getCompliance <em>Compliance</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexPointType()
 * @model extendedMetaData="name='ReflexPoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in seconds  X-Values of the point
	 * 
	 * ##  time ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(BigDecimal)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexPointType_Time()
	 * @model dataType="com.himsa.measurement.impedance.TimeType1" required="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ReflexPointType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Values of the point
	 * 
	 * ## compliance ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance</em>' containment reference.
	 * @see #setCompliance(ComplianceValueType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexPointType_Compliance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Compliance' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceValueType getCompliance();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ReflexPointType#getCompliance <em>Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance</em>' containment reference.
	 * @see #getCompliance()
	 * @generated
	 */
	void setCompliance(ComplianceValueType value);

} // ReflexPointType
