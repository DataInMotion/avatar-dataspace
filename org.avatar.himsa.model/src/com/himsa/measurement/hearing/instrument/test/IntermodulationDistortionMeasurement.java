/*
 */
package com.himsa.measurement.hearing.instrument.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermodulation Distortion Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete curve containing an Intermodulation Distortion measurement. The Intermodulation Distortion (IM) (difference-frequency) is the ratio of the power of the output signal at frequencies other than those delivered to the Hearing Instrument (HI) to the power of the signals that were applied to the HI. It includes the tones Freq2-Freq1 and 2*Freq1 - Freq2.
 * 
 * ##TTIMDistMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionMeasurement#getMeasurementCondition <em>Measurement Condition</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionMeasurement#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionMeasurement()
 * @model extendedMetaData="name='IntermodulationDistortionMeasurement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IntermodulationDistortionMeasurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIT Measurement Conditions.
	 * 
	 * ## TRHMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #setMeasurementCondition(MeasurementConditions)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionMeasurement_MeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementCondition();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionMeasurement#getMeasurementCondition <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #getMeasurementCondition()
	 * @generated
	 */
	void setMeasurementCondition(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionMeasurement_Point()
	 * @model containment="true" required="true" upper="161"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntermodulationDistortionPoint> getPoint();

} // IntermodulationDistortionMeasurement
