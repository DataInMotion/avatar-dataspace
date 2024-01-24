/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acoustic Immittance Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getTympanogramTest <em>Tympanogram Test</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getReflexTest <em>Reflex Test</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getSupplementaryData <em>Supplementary Data</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType()
 * @model extendedMetaData="name='AcousticImmittanceAssessment_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AcousticImmittanceAssessmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tympanogram Test</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.admittance._501.TympanogramTestType}.
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
	 * 
	 * @@ 501 -> 500 Prior to format 501 this element was limited to 3 and this limitation has now been removed. When converting down and finding more than 3 then convert the first 3 and drop the remaining tests @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tympanogram Test</em>' containment reference list.
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_TympanogramTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TympanogramTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TympanogramTestType> getTympanogramTest();

	/**
	 * Returns the value of the '<em><b>Reflex Test</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.admittance._501.ReflexTestType}.
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
	 * Contra Reflex Measurement (Right):
	 * + Probe in: Right ear
	 * + Stimuli in: Left ear
	 * +Reflex result are saved for: Right ear
	 * 
	 * Contra Reflex Measurement (Left):
	 * +Probe in: Left ear
	 * +Stimuli in: Right ear
	 * +Reflex result are saved for: Left ear
	 * 
	 * IPSI Reflex Measurement (Right):
	 * +Probe in: Right ear
	 * +Stimuli in: Right ear
	 * +Reflex result are saved for: Right ear
	 * 
	 * IPSI Reflex Measurement (Left):
	 * +Probe in: Left ear
	 * +Stimuli in: Left ear
	 * +Reflex result are saved for: Left ear
	 * 
	 * Ref: Pg 207 Katz
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
	 * @@ 501 -> 500 
	 * 
	 * The number of reflex tests were capped at 16 prior to format 501.  In order to provide backwards compatibility, the following logic will be followed
	 * Convert all results, not exceeding more than 16, any ReflexTests over this number will be dropped.  Convert with the following preferred order
	 * Group 1
	 * ImpedanceMeasurementCondition > TestType = Reflex AND ResultOfReflexTest = True (0), sort tests by ImpedanceMeasurementCondition > SignalLevel in ascending order.  If the limit of 16 has not been met move to Group 2
	 * Group 2
	 * ImpedanceMeasurementCondition > TestType = Reflex AND ResultOfReflexTest = True (0), where ImpedanceMeasurementCondition > SignalLevel does not exist, SignalLevel was not provided.  If the total limit of 16 from groups 1 and 2 have not been met, then proceed to group 3
	 * Group 3
	 * ImpedanceMeasurementCondition > TestType = Decay.  If the total limit of 16 from groups 1, 2, and 3 have not been met, then proceed to group 4
	 * Group 4
	 * ImpedanceMeasurementCondition > TestType = Latency.  If the total limit of 16 from groups 1, 2, 3, and 4 have not been met, then proceed to group 5
	 * Group 5
	 * ImpedanceMeasurementCondition > TestType = any other remaining choices in order they are saved
	 * 
	 * @@ 
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Test</em>' containment reference list.
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_ReflexTest()
	 * @model containment="true"
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
	 * The principle of this test is to record a maximum admittance point and if it is recorded at a significantly negative pressure to continue the test. The patient is then asked to try to force open the Eustachian tube by yawning, swallowing or holding the nose and blowing. A second maximum admittance is then recorded. A normal outcome would be for the second maximum admittance to be recorded closer to 0daPa. Only peak admittance volume is stored for each test. Ref Katz pg. 183
	 * 
	 * The result of the test  / The movement of the max point from one sweep to another indicates the
	 * pressure change in the middle ear. Maximum admittance is assumed to happen when the applied pressure equals the internal pressure in the middle ear.  Overview and principles of Acoustic.  Ref Katz pg. 176
	 * 
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eustachian Tube Function Intact Ear Drum Test</em>' containment reference.
	 * @see #setEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest)
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EustachianTubeFunctionIntactEarDrumTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EustachianTubeFunctionIntactEarDrumTest getEustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}' containment reference.
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
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' containment reference.
	 * @see #setEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest)
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EustachianTubeFunctionPerforatedEarDrumTest' namespace='##targetNamespace'"
	 * @generated
	 */
	EustachianTubeFunctionPerforatedEarDrumTest getEustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' containment reference.
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	void setEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest value);

	/**
	 * Returns the value of the '<em><b>Supplementary Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplementary data is data supplied by a Noah compatible application that does not follow a HIMSA published standard.  The Supplementary data is included in conjunction with the HIMSA defined data standard – the data will be alongside the well-established HIMSA standards.  For readers that are knowledgeable with the past “Public Extension” concept that Noah originally used with C header file based standards, this idea is similar in nature.
	 * 
	 * What is the need for supplementary data?
	 * 
	 * This general idea was originally suggested by a current HIMSA measurement equipment member company.  
	 * 
	 * Despite HIMSA’s best intentions it is unrealistic that the HIMSA defined data standards can be updated as quickly as desired by another member company.  HIMSA is actively trying to create a system where data standards can be updated in a more flexible manner but there will still be times where HIMSA cannot publish an updated version quickly enough due to technical issues or it could be that there is not good consensus with other member companies on a particular topic.
	 * 
	 * If data is stored as supplementary data then there is an easier to use option for the member to include the data so that other HIMSA member companies may make use of the data until it may be possible that the data structure be placed in the official HIMSA standard.
	 * 
	 * At first it may seem that HIMSA is suggesting a step backwards in data standardization but this is not the case.  HIMSA believes that it will only make Noah easier to work with for member companies and in the long run provide HIMSA with more data information that could be candidates for standardization.
	 * 
	 * What will HIMSA have for requirements?
	 * 
	 * +The intention for saving the data in this area is to share it to other members that may wish to use it.  If the data is proprietary or is secret in some way, do not store the data here.
	 * 
	 * +Supplementary data must be stored in an XML format.
	 * 
	 * +The data must include a version number, if the member creating the data changes the format then the version of the format must change as well
	 * 
	 * +If a new version is created the member company is required to notify HIMSA of the changes
	 * 
	 * +The member company creating supplementary data recognizes that HIMSA will most likely review the supplementary data format for possible inclusion in a future HIMSA standard.
	 * 
	 * What will HIMSA ask for but not have as a requirement?
	 * 
	 * +Supplementary will be defined by a schema (.XSD) file, if not then documentation must be available to HIMSA member companies requesting it.  
	 * 
	 * +If a HIMSA standard is eventually updated to include the data that used to be stored in supplementary data HIMSA will strongly encourage member companies to move towards utilizing the updated public data standard.
	 * 
	 * 
	 * What can the member companies (creators of data) expect?
	 * 
	 * +If a Noah runtime data converter is translating data from one format to another it will not perform any conversion on supplementary data, it will simply pass it along in the existing format.  Please note that this will only function on data standards 502 and newer.  This means that software trying to utilize older format (e.g. format 200) will not be able to receive this data.
	 * 
	 * @@ 501 to 500 conversion - This data must be removed as it was not supported in formation 500 
	 * 
	 * @@ 
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplementary Data</em>' containment reference.
	 * @see #setSupplementaryData(SupplementaryDataType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_SupplementaryData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplementaryData' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplementaryDataType getSupplementaryData();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getSupplementaryData <em>Supplementary Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplementary Data</em>' containment reference.
	 * @see #getSupplementaryData()
	 * @generated
	 */
	void setSupplementaryData(SupplementaryDataType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(MeasurementNotesType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementNotesType getNotes();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(MeasurementNotesType value);

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
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_ConvertedFromDataStandard()
	 * @model dataType="com.himsa.measurement.admittance._501.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
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
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
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
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
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
	 * The default value is <code>"501"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getAcousticImmittanceAssessmentType_Version()
	 * @model default="501" unsettable="true" dataType="com.himsa.measurement.admittance._501.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // AcousticImmittanceAssessmentType
