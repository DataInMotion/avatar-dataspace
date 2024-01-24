/*
 */
package com.himsa.measurement.tinnitus._500;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Intensity Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurement Point with Intensity and optional Frequency, bandwidth and pulseDuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusIntensity <em>Stimulus Intensity</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingIntensity <em>Masking Intensity</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getMeasurementIntensityPointType()
 * @model extendedMetaData="name='MeasurementIntensityPoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementIntensityPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Intensity</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.IntensityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal intensity and unit used for the stimulus signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Intensity</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMeasurementIntensityPointType_StimulusIntensity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntensityType1> getStimulusIntensity();

	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the measurement was done.
	 * ##freq## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMeasurementIntensityPointType_StimulusFrequency()
	 * @model dataType="com.himsa.measurement.tinnitus._500.StimulusFrequencyType"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #getStimulusFrequency()
	 * @generated
	 */
	void setStimulusFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the masking was done.
	 * ##freq## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMeasurementIntensityPointType_MaskingFrequency()
	 * @model dataType="com.himsa.measurement.tinnitus._500.MaskingFrequencyType"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Frequency</em>' attribute.
	 * @see #getMaskingFrequency()
	 * @generated
	 */
	void setMaskingFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Masking Intensity</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.IntensityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal intensity and unit used for the masking signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Intensity</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMeasurementIntensityPointType_MaskingIntensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaskingIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntensityType1> getMaskingIntensity();

} // MeasurementIntensityPointType
