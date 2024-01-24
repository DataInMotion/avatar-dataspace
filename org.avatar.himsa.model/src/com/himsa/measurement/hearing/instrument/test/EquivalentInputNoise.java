/*
 */
package com.himsa.measurement.hearing.instrument.test;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Input Noise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Equivalent Input Noise Measurement.
 * In a test box, the Hearing Instrument (HI) is connected to a 2CC coupler. A
 * reference microphone is placed close to the HI’s microphone. No signal is
 * used. The noise floor in the test box is measured by the reference
 * microphone and saved as input level, and the level delivered in the 2CC
 * coupler by the HI is measured. The 2CC gain (measured earlier) is
 * subtracted from the measured level and the result, saved as output, is called
 * the Equivalent Input Noise. This noise is the noise floor plus the HI noise.
 * The level should be at least at the input level, which is saved as an extra
 * security.
 * 
 * ##EINMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.EquivalentInputNoise#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.EquivalentInputNoise#getPoint <em>Point</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.EquivalentInputNoise#getEquivalentRootMeanSquare <em>Equivalent Root Mean Square</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getEquivalentInputNoise()
 * @model extendedMetaData="name='EquivalentInputNoise' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EquivalentInputNoise extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIT Measurement Conditions.
	 * 
	 * ## TRHMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditions)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getEquivalentInputNoise_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.EquivalentInputNoise#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurementPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent Input Noise Curve points
	 * 
	 * ##einCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getEquivalentInputNoise_Point()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurementPoint> getPoint();

	/**
	 * Returns the value of the '<em><b>Equivalent Root Mean Square</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The curve points of the einCrv output curve are squared,
	 * summed and divided with the number of defined curve points.
	 * The square root of the result is saved as EINRMS (Root Mean
	 * Square).
	 * 
	 * ##einRMS##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equivalent Root Mean Square</em>' attribute.
	 * @see #setEquivalentRootMeanSquare(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getEquivalentInputNoise_EquivalentRootMeanSquare()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.EquivalentRootMeanSquareType" required="true"
	 *        extendedMetaData="kind='element' name='EquivalentRootMeanSquare' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getEquivalentRootMeanSquare();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.EquivalentInputNoise#getEquivalentRootMeanSquare <em>Equivalent Root Mean Square</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Root Mean Square</em>' attribute.
	 * @see #getEquivalentRootMeanSquare()
	 * @generated
	 */
	void setEquivalentRootMeanSquare(BigDecimal value);

} // EquivalentInputNoise
