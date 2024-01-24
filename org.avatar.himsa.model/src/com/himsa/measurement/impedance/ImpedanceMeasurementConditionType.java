/*
 */
package com.himsa.measurement.impedance;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measuring conditions (reflex)
 * 
 * ##TImpMeasCond ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalType <em>Signal Type</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getProbeFrequency <em>Probe Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getTestType <em>Test Type</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getCanalVolume <em>Canal Volume</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType()
 * @model extendedMetaData="name='ImpedanceMeasurementCondition_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImpedanceMeasurementConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of the stimulus tone in dB HL. The ipsilateral stimulus tone is added via
	 * the probe, the contralateral stimulus tone is added through a headphone, often a
	 * TDH39 that can easily be calibrated in dB HL (Hearing Level).
	 * 
	 * ## signalLevel ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Level</em>' attribute.
	 * @see #setSignalLevel(BigDecimal)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_SignalLevel()
	 * @model dataType="com.himsa.measurement.impedance.SignalLevelType" required="true"
	 *        extendedMetaData="kind='element' name='SignalLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSignalLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalLevel <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Level</em>' attribute.
	 * @see #getSignalLevel()
	 * @generated
	 */
	void setSignalLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.impedance.SignalTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the stimulus tone:
	 * 
	 * See SignalType_Type for more information
	 * 
	 * ## signalType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Type</em>' attribute.
	 * @see com.himsa.measurement.impedance.SignalTypeType
	 * @see #isSetSignalType()
	 * @see #unsetSignalType()
	 * @see #setSignalType(SignalTypeType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_SignalType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalTypeType getSignalType();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalType <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Type</em>' attribute.
	 * @see com.himsa.measurement.impedance.SignalTypeType
	 * @see #isSetSignalType()
	 * @see #unsetSignalType()
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(SignalTypeType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalType <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalType()
	 * @see #getSignalType()
	 * @see #setSignalType(SignalTypeType)
	 * @generated
	 */
	void unsetSignalType();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalType <em>Signal Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Type</em>' attribute is set.
	 * @see #unsetSignalType()
	 * @see #getSignalType()
	 * @see #setSignalType(SignalTypeType)
	 * @generated
	 */
	boolean isSetSignalType();

	/**
	 * Returns the value of the '<em><b>Signal Output</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.impedance.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See SignalOutput_Type for more information
	 * 
	 * ## signalOutput ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Output</em>' attribute.
	 * @see com.himsa.measurement.impedance.SignalOutputType
	 * @see #isSetSignalOutput()
	 * @see #unsetSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_SignalOutput()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getSignalOutput();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Output</em>' attribute.
	 * @see com.himsa.measurement.impedance.SignalOutputType
	 * @see #isSetSignalOutput()
	 * @see #unsetSignalOutput()
	 * @see #getSignalOutput()
	 * @generated
	 */
	void setSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalOutput()
	 * @see #getSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetSignalOutput();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Output</em>' attribute is set.
	 * @see #unsetSignalOutput()
	 * @see #getSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @generated
	 */
	boolean isSetSignalOutput();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus tone frequency measured in Hertz.
	 * 
	 * !! Rev 2 change
	 * The element has been changed from mandatory to optional.  This was needed because the element is used depending on the SignalOutput
	 * 
	 * For a fixed level tests this element would not be used if SignalOutput is set to PureTone or NarrowBandNoise
	 * 
	 * For Auto Threshold Search, sequence, multiplexed, or reflex tests this element would only be used if the SignalOutput is set to PureTone or NarrowBandNoise
	 * 
	 * For Latency or Decay tests this element would be used if SignalOutput is NarrowBandNoise the center frequency should be stated. !!
	 * 
	 * 
	 * ## frequency ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_Frequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pressure applied through probe measured in deka Pascal
	 * 
	 * ## pressure ##
	 * 
	 * @@ REV 5 Converter Change 100>500
	 * If undefined, will be given the value -32767
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_Pressure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPressure();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Probe Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the probe tone
	 * 
	 * Format 100 defined this data as optional and if not specified was to be assumed to be a value of 226.  If the conversion DLL finds this value to be empty in a format 100 data record it will insert the value of 226.
	 * 
	 * ## ProbeFreq ##
	 * 
	 * @@ If reading format 100 and the field is empty then populate this element with the value of 226 @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probe Frequency</em>' attribute.
	 * @see #setProbeFrequency(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_ProbeFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ProbeFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getProbeFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getProbeFrequency <em>Probe Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Frequency</em>' attribute.
	 * @see #getProbeFrequency()
	 * @generated
	 */
	void setProbeFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Test Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.impedance.ReflexTestTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ReflexTestType_Type for more information
	 * 
	 * ## testType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Type</em>' attribute.
	 * @see com.himsa.measurement.impedance.ReflexTestTypeType
	 * @see #isSetTestType()
	 * @see #unsetTestType()
	 * @see #setTestType(ReflexTestTypeType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_TestType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TestType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflexTestTypeType getTestType();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getTestType <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Type</em>' attribute.
	 * @see com.himsa.measurement.impedance.ReflexTestTypeType
	 * @see #isSetTestType()
	 * @see #unsetTestType()
	 * @see #getTestType()
	 * @generated
	 */
	void setTestType(ReflexTestTypeType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getTestType <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestType()
	 * @see #getTestType()
	 * @see #setTestType(ReflexTestTypeType)
	 * @generated
	 */
	void unsetTestType();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getTestType <em>Test Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Type</em>' attribute is set.
	 * @see #unsetTestType()
	 * @see #getTestType()
	 * @see #setTestType(ReflexTestTypeType)
	 * @generated
	 */
	boolean isSetTestType();

	/**
	 * Returns the value of the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canalVolume / The admittance equivalent to the Ear canal volume is conventionally subtracted from measures of total aural admittance to yield an estimate of the middle ear admittance. This is referred to as compensated admittance. Ear canal volumes are in the range of [0.30 .. 1.00] ccm in children and
	 * [0.65 .. 1.75] ccm in adults. Refer [HOCA4] Chapter 20. The volume is given by the formula
	 * 
	 * Vc = γ . ps . Ca = ρ . c2 . Ca where
	 * 
	 * +Vc / is the equivalent volume in m3
	 * +γ / is the ratio of specific heat for air at constant pressure to that at constant volume, approximately 1.40.
	 * +ps / is the barometric pressure in Pa, normal pressure 0.1013 MPa.
	 * +ρ / is the ambient density of air in kg/m3, at the temperature and pressure of the measurement
	 * +c / is the speed of sound in m/s at the temperature and pressure of the measurement
	 * +Ca / is the acoustic compliance in m3/Pa
	 * +Note 1 / The ear canal volume equivalent is valid at the probe tone frequency 226 Hz.
	 * +Note 2 / The equivalent volume of air is equal to its physical value for values not exceeding 5 ccm.
	 * ##canalVoll ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canal Volume</em>' containment reference.
	 * @see #setCanalVolume(ComplianceType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getImpedanceMeasurementConditionType_CanalVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CanalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceType getCanalVolume();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType#getCanalVolume <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canal Volume</em>' containment reference.
	 * @see #getCanalVolume()
	 * @generated
	 */
	void setCanalVolume(ComplianceType value);

} // ImpedanceMeasurementConditionType
