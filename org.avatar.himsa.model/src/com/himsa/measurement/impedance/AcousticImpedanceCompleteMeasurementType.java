/*
 */
package com.himsa.measurement.impedance;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acoustic Impedance Complete Measurement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getTympanogramTest <em>Tympanogram Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getReflexTest <em>Reflex Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getPrivateImpedanceData <em>Private Impedance Data</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType()
 * @model extendedMetaData="name='AcousticImpedanceCompleteMeasurement_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AcousticImpedanceCompleteMeasurementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tympanogram Test</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.impedance.TympanogramTestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tympanograms
	 * 
	 * The mobility of the ear drum and the middle ear is recorded while the air
	 * pressure in the auditory canal is varied, typically in the interval of
	 * [-300 .. +200] daPa .
	 * 
	 * + Unit for Pressure [p]ı / The unit chosen for pressure is deka Pascal (daPa) or tens of Pascal.
	 * 1 daPa approximates 1 mm Water. Ref. [Van Camp].
	 * 
	 * 		[p] = daPa dekaPascal or tens of Pascals.
	 * 
	 * + resFreq / Ear Resonance Frequency. This field is intended for future use in Noah.
	 * If the probe frequency is swept in an interval of e.g. [200..2kHz], a
	 * resonance frequency can be found near 1000 Hz. Below this frequency the
	 * ear is stiffness controlled, and above this frequency it is mass controlled.
	 * 
	 * + Maximum Mobility point i.e.Max 
	 *  Point / For the well-functioning normal middle ear a point of "maximum mobility" will be found, often for a slightly negative pressure [-100..0 ] daPa.
	 * 
	 * + Middle Ear Acoustic Impedance and Admittance / The mobility of the ear drum and the middle ear is in short named "Middle Ear acoustic Immitance", which can mean Acoustic Impedance, Za
	 * or Acoustic Admittance Ya where pr. definition
	 * 
	 * 		__1__
	 * 		Za = Ya The subscript a for acoustic is omitted hereafter.
	 * 
	 * + Unit for Acoustic Admittance [Y] / For practical reasons the Admittance Y is most often measured, and indeed this measure is the one saved in IMPDEF.H, the SI unit being
	 * 
	 * 		____m3___
	 * 		[Y] = Pa . s
	 * 
	 * + "SI-mho / The SI unit is equal to the cgs unit millimho x 100 or mho x 105
	 * 
	 * ## tympTest ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tympanogram Test</em>' containment reference list.
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_TympanogramTest()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='TympanogramTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TympanogramTestType> getTympanogramTest();

	/**
	 * Returns the value of the '<em><b>Reflex Test</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.impedance.ReflexTestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reflex Tests
	 * 
	 * The acoustic reflex is a contraction of two middle ear muscles, named the stapedius and tensor tympani muscles. The muscle contraction is a normal bilateral response to acoustic or other eliciting stimuli, (which is not necessarily bilateral). The amount of contraction and subsequent acoustic reflex decay are measured by immitance audiometry.
	 * 
	 * The reflex is commonly described as ipsilateral or contralateral depending on which side the response is observed relative to the stimulus.
	 * 
	 * Usually manual inspection of the recorded response is required to verify that a reflex response has been recorded as normal breathing can cause artefact on the test recordings.
	 * Generally there are 3 tests undertaken using the acoustic reflex response, which are:
	 * 1) Normal reflex test
	 * 2) Reflex decay test
	 * 3) Reflex latency test
	 * 
	 * 
	 * 1) Normal reflex test 
	 * Changes in the immitance of the ear are monitored as a tonal or noise stimuli is presented which elicits an acoustic reflex. The test establishes the lowest sound level that elicits a reliable acoustic reflex response which is seen as a measurable change in acoustic immitance. 
	 * 
	 * As the acoustic reflex is a bilateral response we can stimulate either ear and record a response from the same or opposite ear.
	 * 
	 *  The stimulus can be presented in the same ear as the immitance recording and this is called an ipsilateral reflex. Alternatively the immitance can be recorded in the opposite ear to the stimulus and this is called a contralateral reflex. Ipsilateral and contralateral reflexes test different neural pathways.
	 * 
	 * For clarity the definitions used are detailed below.
	 * 
	 * + Right contralateral reflex denotes the stimulus is delivered in the left ear and the probe recording the response is in the right ear.
	 * 
	 * + Left contralateral reflex denotes the stimulus is delivered in the right ear and the probe recording the response is in the left ear.
	 * 
	 * + Right ipsilateral denotes stimulus and probe in the right ear.
	 * 
	 * + Left ipsilateral denotes stimulus and probe in left ear. Ref: Pg 207 Katz
	 * 
	 * 
	 * 2) Reflex Decay test 
	 * Acoustic reflex decay or adaptation, is the reduction in the magnitude of the acoustic reflex response during the presentation of a sustained stimulus. (pg 220 Katz)
	 * 
	 * Test frequencies tend to be 500Hz and 1000Hz as the reflex tends to naturally rapidly decay at high frequencies.
	 * 
	 * A reflex is said to decay if it falls to 50% or less of its original value in the 10 or 30 second stimulus time.
	 * 
	 * Abnormally rapid reflex decay is associated with retrocochlear hearing loss.
	 * 
	 * 
	 * This curve illustrates the normal situation where the decay value is negative. The formula used for calculating the decay is
	 * 
	 * 		Y2 - Y1
	 * 		_______
	 * 	Decay = Y1 . 100		 percent. Range [0..100] percent.
	 * 
	 * 
	 * 3) Reflex Latency test 
	 * Acoustic reflex latency refers to how long it takes for the acoustic reflex to occur after the stimulus is presented. The delay is measured from the onset of the stimulus until the beginning of the reflex response. (pg 223 Katz). Generally taken as the time it takes after the stimulus is presented for the immitance change to rise to 10% of it’s eventual value.
	 * 
	 * The latency period tends to be substantially increased in retrocochlear hearing losses.
	 * 
	 * 
	 * 
	 * ##  reflexTest  ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Test</em>' containment reference list.
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_ReflexTest()
	 * @model containment="true" upper="16"
	 *        extendedMetaData="kind='element' name='ReflexTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReflexTestType> getReflexTest();

	/**
	 * Returns the value of the '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Test (Intact ear drum)
	 * 
	 * The principle of this test is to record a maximum compliance point and if it is recorded at a significantly negative pressure to continue the test. The patient is then asked to try to force open the Eustachian tube by yawning, swallowing or holding the nose and blowing. A second maximum compliance is then recorded. A normal outcome would be for the second maximum compliance to be recorded closer to 0daPa. Only peak compliance volume is stored for each test. Ref Katz pg. 183
	 * 
	 * The result of the test  / The movement of the max point from one sweep to another indicates the
	 * pressure change in the middle ear. Maximum compliance is assumed to happen when the applied pressure equals the internal pressure in the middle ear.  Overview and principles of Acoustic.  Ref Katz pg. 176
	 * 
	 * 
	 * 
	 * 
	 * ## etfIntactTest ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eustachian Tube Function Intact Ear Drum Test</em>' containment reference.
	 * @see #setEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EustachianTubeFunctionIntactEarDrumTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EustachianTubeFunctionIntactEarDrumTest getEustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eustachian Tube Function Intact Ear Drum Test</em>' containment reference.
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	void setEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest value);

	/**
	 * Returns the value of the '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Test (Perforated Ear drum)
	 * 
	 * The pressure of the sealed ear canal volume and middle ear is measured as a function of time. The client is asked to swallow /yarn / hold the mouth and nose shut while blowing, in order to activate Eustachian tube function. A pressure fall will indicate a functioning Eustachian tube.
	 * 
	 * pressure Point / Curve points. The pressure in daPa is saved versus time.
	 * 
	 * openPoint / If the Eustachian tube ventilates the middle ear, the pressure change will be registered on the curve. Up to 3 identified pressures can be saved.
	 * 
	 * closePoint / When the Eustachian tube closes, the pressure stabilises. Up to 3 identifiedpressures can be saved.
	 * 
	 * timeBase / The maximum x-value is saved here for scaling purposes.
	 * 
	 * ## etfPerforatedTes ## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' containment reference.
	 * @see #setEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EustachianTubeFunctionPerforatedEarDrumTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EustachianTubeFunctionPerforatedEarDrumTest getEustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' containment reference.
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	void setEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest value);

	/**
	 * Returns the value of the '<em><b>Private Impedance Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the past it was allowed by HIMSA to save privately formatted data in the unused section of the public storage area of a NOAH action.  This usage was used mainly because more space was allocated for public storage versus private.  At present this is no longer an issue as equal storage is allocated to both public and private data storage.
	 * 
	 * This elements primary function is to pass along any private data stored in the public area as base64 encoded data.  NOAH is not performing any translation or conversion of data.
	 * 
	 * The data will be upconverted from format 100 to format 500
	 * 
	 * This data will never be converted back to an earlier version of a IMP data standard.  For example, if an IMP action format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the data (causing a conversion down to format 100) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Impedance Data</em>' attribute.
	 * @see #setPrivateImpedanceData(byte[])
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateImpedanceData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateImpedanceData();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getPrivateImpedanceData <em>Private Impedance Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Impedance Data</em>' attribute.
	 * @see #getPrivateImpedanceData()
	 * @generated
	 */
	void setPrivateImpedanceData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software saving data formatted via this XSD file should not use this element for storage.  The intention is for Noah data convertors to fill in an appropriate value for runtime conversions - not permanent storage.
	 * 
	 * Please note that values less than 500 mean that the data was originally stored in a format which was not validated by Noah before storage.  This could mean that the data will not validated against this version
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard()
	 * @model dataType="com.himsa.measurement.impedance.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 */
	void setConvertedFromDataStandard(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is no longer in use.  The original intention was for Noah to fill in the value but the idea was never fully implemented and not needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @generated
	 */
	void setValidatedByNOAH(boolean value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validated By NOAH</em>' attribute is set.
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	boolean isSetValidatedByNOAH();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getAcousticImpedanceCompleteMeasurementType_Version()
	 * @model default="500" unsettable="true" dataType="com.himsa.measurement.impedance.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // AcousticImpedanceCompleteMeasurementType
