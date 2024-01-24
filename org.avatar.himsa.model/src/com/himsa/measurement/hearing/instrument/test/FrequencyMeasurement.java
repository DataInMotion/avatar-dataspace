/*
 */
package com.himsa.measurement.hearing.instrument.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic two-channel frequency response type measurement
 * 
 * ## TFreqMeas ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurement#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getFrequencyMeasurement()
 * @model extendedMetaData="name='FrequencyMeasurement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FrequencyMeasurement extends EObject {
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
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getFrequencyMeasurement_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
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
	 * 
	 * ## TFreqMeasPoint ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getFrequencyMeasurement_Point()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurementPoint> getPoint();

} // FrequencyMeasurement
