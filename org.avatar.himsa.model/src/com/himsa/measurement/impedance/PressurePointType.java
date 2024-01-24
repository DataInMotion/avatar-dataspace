/*
 */
package com.himsa.measurement.impedance;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Curve point for the Measurement of the Eustachian Tube Function in the
 * case of a perforated eardrum (tympanic membrane). 
 * 
 * ## TPressurePoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.PressurePointType#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.PressurePointType#getPressure <em>Pressure</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getPressurePointType()
 * @model extendedMetaData="name='PressurePoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PressurePointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(BigDecimal)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getPressurePointType_Time()
	 * @model dataType="com.himsa.measurement.impedance.TimeType" required="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.PressurePointType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deka Pascal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getPressurePointType_Pressure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPressure();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.PressurePointType#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(BigInteger value);

} // PressurePointType
