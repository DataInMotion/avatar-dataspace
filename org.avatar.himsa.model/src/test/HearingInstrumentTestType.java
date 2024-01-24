/*
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Instrument Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.HearingInstrumentTestType#getSaturationResponse <em>Saturation Response</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getFullOnGain <em>Full On Gain</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getFrequencyResponse <em>Frequency Response</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getBatteryMeasurement <em>Battery Measurement</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getSecondThirdHarmonicDistortion <em>Second Third Harmonic Distortion</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getIntermodulationDistortionMeasurement <em>Intermodulation Distortion Measurement</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getEquivalentInputNoiseMeasurement <em>Equivalent Input Noise Measurement</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getAttackRecoverCurve <em>Attack Recover Curve</em>}</li>
 *   <li>{@link test.HearingInstrumentTestType#getInductionCoil <em>Induction Coil</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getHearingInstrumentTestType()
 * @model extendedMetaData="name='HearingInstrumentTest_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HearingInstrumentTestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Saturation Response</b></em>' containment reference list.
	 * The list contents are of type {@link test.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saturation Response
	 * 
	 * ##spl90##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saturation Response</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_SaturationResponse()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='SaturationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getSaturationResponse();

	/**
	 * Returns the value of the '<em><b>Full On Gain</b></em>' containment reference list.
	 * The list contents are of type {@link test.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full On Gain. It represents a calculated level in a 2CC coupler for hearing instrument with the volume control set to its full on position.
	 * 
	 * ## FullOnGain ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full On Gain</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_FullOnGain()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='FullOnGain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getFullOnGain();

	/**
	 * Returns the value of the '<em><b>Frequency Response</b></em>' containment reference list.
	 * The list contents are of type {@link test.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency Response
	 * 
	 * freqResp##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Response</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_FrequencyResponse()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='FrequencyResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getFrequencyResponse();

	/**
	 * Returns the value of the '<em><b>Battery Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link test.BatteryCurrentMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Battery Measurement
	 * 
	 * ##Battery##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Measurement</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_BatteryMeasurement()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='BatteryMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BatteryCurrentMeasurement> getBatteryMeasurement();

	/**
	 * Returns the value of the '<em><b>Second Third Harmonic Distortion</b></em>' containment reference list.
	 * The list contents are of type {@link test.HarmonicDistortionMeasurementCurve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second and Third Harmonic Distortion Measurement
	 * 
	 * ##harmDistortion##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Third Harmonic Distortion</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_SecondThirdHarmonicDistortion()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='SecondThirdHarmonicDistortion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HarmonicDistortionMeasurementCurve> getSecondThirdHarmonicDistortion();

	/**
	 * Returns the value of the '<em><b>Intermodulation Distortion Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link test.IntermodulationDistortionMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intermodulation Distortion Measurement
	 * 
	 * ##interDistortion##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intermodulation Distortion Measurement</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_IntermodulationDistortionMeasurement()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='IntermodulationDistortionMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntermodulationDistortionMeasurement> getIntermodulationDistortionMeasurement();

	/**
	 * Returns the value of the '<em><b>Equivalent Input Noise Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link test.EquivalentInputNoise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent Input Noise Measurement
	 * 
	 * ##equivInputNoise##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equivalent Input Noise Measurement</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_EquivalentInputNoiseMeasurement()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='EquivalentInputNoiseMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EquivalentInputNoise> getEquivalentInputNoiseMeasurement();

	/**
	 * Returns the value of the '<em><b>Input Output</b></em>' containment reference list.
	 * The list contents are of type {@link test.InputOutputMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input / Output Measurement
	 * 
	 * ##ioMeas##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Output</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_InputOutput()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='InputOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InputOutputMeasurement> getInputOutput();

	/**
	 * Returns the value of the '<em><b>Attack Recover Curve</b></em>' containment reference list.
	 * The list contents are of type {@link test.TargetMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attack / Recover Curve measurement
	 * 
	 * ##attackRecover##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attack Recover Curve</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_AttackRecoverCurve()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='AttackRecoverCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TargetMeasurement> getAttackRecoverCurve();

	/**
	 * Returns the value of the '<em><b>Induction Coil</b></em>' containment reference list.
	 * The list contents are of type {@link test.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Audio Induction Coil Loop is one of the oldest forms of assisted listening technology in use today. These systems provide large area access to Hearing Instruments equipped with telecoil.
	 * 
	 * 
	 * ##inductionCoil##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Induction Coil</em>' containment reference list.
	 * @see test.TestPackage#getHearingInstrumentTestType_InductionCoil()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='InductionCoil' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getInductionCoil();

} // HearingInstrumentTestType
