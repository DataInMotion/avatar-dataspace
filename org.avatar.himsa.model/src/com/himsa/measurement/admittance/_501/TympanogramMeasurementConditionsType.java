/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tympanogram Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measure Conditions (tymp)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramMeasurementConditionsType()
 * @model extendedMetaData="name='TympanogramMeasurementConditions_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TympanogramMeasurementConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sweep Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change in the pressure in which the curve is recorded. Measured and saved in
	 * dekaPascal per second (daPa/s).
	 * 
	 * @@ This value has changed from mandatory to optional to help support manual entry of data where this information may not be known or supported to be recorded.  This change was made in format 501
	 * 
	 * @@ Convert DOWN from 501 to 500
	 * This element is mandatory in format 500.  When converting down enter a value of 0 (zero)
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sweep Speed</em>' attribute.
	 * @see #setSweepSpeed(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramMeasurementConditionsType_SweepSpeed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SweepSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSweepSpeed();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sweep Speed</em>' attribute.
	 * @see #getSweepSpeed()
	 * @generated
	 */
	void setSweepSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Record Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.admittance._501.RecordingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How is the admittance curve recorded, Compensated or Non Compensated.
	 * 
	 * The admittance equivalent to the Ear canal volume is conventionally subtracted
	 * from measures of total aural admittance to yield an estimate of the middle ear
	 * admittance. This is referred to as compensated admittance. 
	 * 
	 * Katz pg 169
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Mode</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.RecordingModeType
	 * @see #isSetRecordMode()
	 * @see #unsetRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramMeasurementConditionsType_RecordMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RecordMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordingModeType getRecordMode();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Mode</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.RecordingModeType
	 * @see #isSetRecordMode()
	 * @see #unsetRecordMode()
	 * @see #getRecordMode()
	 * @generated
	 */
	void setRecordMode(RecordingModeType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecordMode()
	 * @see #getRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @generated
	 */
	void unsetRecordMode();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Record Mode</em>' attribute is set.
	 * @see #unsetRecordMode()
	 * @see #getRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @generated
	 */
	boolean isSetRecordMode();

	/**
	 * Returns the value of the '<em><b>Probe Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the probe tone
	 * 
	 * @@ Convert down 501 --> 500
	 * 
	 * The ProbeFrequency element has been changed to the below structure, to support the ability to record that the frequency is essentially unknown
	 * 
	 * Convert the 501 Frequency to  ProbeFrequency if the value is an integer
	 * 
	 * If the "Other" value has been chossen then enter zero in ProbeFrequency
	 * 
	 * @@
	 * 
	 * @@ Convert up 500 --> 501
	 * 
	 * The ProbeFrequency element has been changed to the below structure, to support the ability to record that the frequency is essentially unknown
	 * 
	 * Convert the 500 ProbeFrequency to Frequency if the value is an integer
	 * 
	 * If the value is not present then add "Other" to the Other element
	 * 
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probe Frequency</em>' containment reference.
	 * @see #setProbeFrequency(ProbeFrequencyType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramMeasurementConditionsType_ProbeFrequency()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProbeFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	ProbeFrequencyType getProbeFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Frequency</em>' containment reference.
	 * @see #getProbeFrequency()
	 * @generated
	 */
	void setProbeFrequency(ProbeFrequencyType value);

} // TympanogramMeasurementConditionsType
