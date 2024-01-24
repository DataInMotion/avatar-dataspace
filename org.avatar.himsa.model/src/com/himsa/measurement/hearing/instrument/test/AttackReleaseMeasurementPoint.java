/*
 */
package com.himsa.measurement.hearing.instrument.test;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Release Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measurement point for Attack/Release measurements.  The time result (in milliseconds) is saved for the Attack and Release curve.
 * 
 * ##TARMeasPoint##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.AttackReleaseMeasurementPoint#getOutput <em>Output</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.AttackReleaseMeasurementPoint#getAttackReleaseTime <em>Attack Release Time</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getAttackReleaseMeasurementPoint()
 * @model extendedMetaData="name='AttackReleaseMeasurementPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AttackReleaseMeasurementPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level Attack or Release curve. Component of the
	 * structure TARMeasPoint of type TdB10 (or centiBel).
	 * 
	 * ##output##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getAttackReleaseMeasurementPoint_Output()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.OutputType1" required="true"
	 *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutput();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.AttackReleaseMeasurementPoint#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Attack Release Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attack / Release time measured in milliseconds. The TARTime
	 * is defined Integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attack Release Time</em>' attribute.
	 * @see #setAttackReleaseTime(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getAttackReleaseMeasurementPoint_AttackReleaseTime()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.AttackReleaseTimeType" required="true"
	 *        extendedMetaData="kind='element' name='AttackReleaseTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getAttackReleaseTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.AttackReleaseMeasurementPoint#getAttackReleaseTime <em>Attack Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Release Time</em>' attribute.
	 * @see #getAttackReleaseTime()
	 * @generated
	 */
	void setAttackReleaseTime(BigDecimal value);

} // AttackReleaseMeasurementPoint
