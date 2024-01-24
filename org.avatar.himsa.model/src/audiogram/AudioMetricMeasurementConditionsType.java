/*
 */
package audiogram;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Metric Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measuring Conditions for each recorded curve
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getWordListName <em>Word List Name</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription <em>Auxiliary Parameter Description</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusOnTime <em>Stimulus On Time</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingOnTime <em>Masking On Time</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusOffTime <em>Stimulus Off Time</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingOffTime <em>Masking Off Time</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter <em>Stimulus Si Si Parameter</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter <em>Masking Si Si Parameter</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation <em>Stimulus Warble Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation <em>Masking Warble Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize <em>Stimulus Warble Modulation Size</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize <em>Masking Warble Modulation Size</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseModulation <em>Stimulus Pulse Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseModulation <em>Masking Pulse Modulation</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseCycle <em>Stimulus Pulse Cycle</em>}</li>
 *   <li>{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseCycle <em>Masking Pulse Cycle</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType()
 * @model extendedMetaData="name='AudioMetricMeasurementConditions_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AudioMetricMeasurementConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Signal Type</b></em>' attribute.
	 * The default value is <code>"NoSignalApplied"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus signal is the sound being presented to the patient, in the ear being tested, that you want them to respond to. (e.g. Pure Tone)
	 * 
	 * @@ If the converter DLL for some reason find that this value is not correctly specified then it will set the value as unknown @@
	 * 
	 * ## SignalType1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Signal Type</em>' attribute.
	 * @see #isSetStimulusSignalType()
	 * @see #unsetStimulusSignalType()
	 * @see #setStimulusSignalType(SignalType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusSignalType()
	 * @model default="NoSignalApplied" unsettable="true" dataType="audiogram.StimulusSignalTypeType" required="true"
	 *        extendedMetaData="kind='element' name='StimulusSignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalType getStimulusSignalType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Signal Type</em>' attribute.
	 * @see #isSetStimulusSignalType()
	 * @see #unsetStimulusSignalType()
	 * @see #getStimulusSignalType()
	 * @generated
	 */
	void setStimulusSignalType(SignalType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusSignalType()
	 * @see #getStimulusSignalType()
	 * @see #setStimulusSignalType(SignalType)
	 * @generated
	 */
	void unsetStimulusSignalType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Signal Type</em>' attribute is set.
	 * @see #unsetStimulusSignalType()
	 * @see #getStimulusSignalType()
	 * @see #setStimulusSignalType(SignalType)
	 * @generated
	 */
	boolean isSetStimulusSignalType();

	/**
	 * Returns the value of the '<em><b>Masking Signal Type</b></em>' attribute.
	 * The default value is <code>"NoSignalApplied"</code>.
	 * The literals are from the enumeration {@link audiogram.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a sound used to stop the hearing in an ear that is not being tested from picking up the test signal. Often used when one ear is found to be significantly poorer than the other or for bone conduction testing.
	 * 
	 * The non test ear picking up the test tone is called crossover. Masking is presented to the non test ear.
	 * 
	 * An example of masking noise commonly used is narrowband noise (NBN)
	 * 
	 * The enumerated value "NoSignalApplied" signals that masking has NOT been performed.  If masking has been used then a value other then NoSignalApplied will and must be used.
	 * 
	 * Ref. [HOCA-5, Chapter 9, page 124: Clinical Masking]
	 * 
	 * ## SignalType2 ##
	 * 
	 * @@ Translator/Converter RULE
	 * In the Audiogram format 100 and 200 it has been unclearly documented the exact method that must be used to note if masking is used or not.  In some cases the signalType2 would be set correctly or in some cases it was not but yet freq2 or intentisty2 would be set (e.g. masking points would be saved).  In other words there have been two ways to indicate that masking has been used.
	 * 
	 * If a NOAH compatible program is to create an Audiogram using this XSD file and wishes to state that masking has not been used then it must set “NoSignalApplied”
	 * 
	 * If a NOAH compatible program is reading format 100 or 200 translated to XML then the translator DLL must follow the below rule
	 * 
	 * If (SignalType2 = NoSignal) AND There is at least (1 value for freq2 OR  intensity2) for any of the available points then MaskingSignalType = “Unknown” @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Signal Type</em>' attribute.
	 * @see audiogram.SignalType
	 * @see #isSetMaskingSignalType()
	 * @see #unsetMaskingSignalType()
	 * @see #setMaskingSignalType(SignalType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingSignalType()
	 * @model default="NoSignalApplied" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MaskingSignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalType getMaskingSignalType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Signal Type</em>' attribute.
	 * @see audiogram.SignalType
	 * @see #isSetMaskingSignalType()
	 * @see #unsetMaskingSignalType()
	 * @see #getMaskingSignalType()
	 * @generated
	 */
	void setMaskingSignalType(SignalType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingSignalType()
	 * @see #getMaskingSignalType()
	 * @see #setMaskingSignalType(SignalType)
	 * @generated
	 */
	void unsetMaskingSignalType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Signal Type</em>' attribute is set.
	 * @see #unsetMaskingSignalType()
	 * @see #getMaskingSignalType()
	 * @see #setMaskingSignalType(SignalType)
	 * @generated
	 */
	boolean isSetMaskingSignalType();

	/**
	 * Returns the value of the '<em><b>Stimulus Signal Output</b></em>' attribute.
	 * The default value is <code>"NoSignalOutput"</code>.
	 * The literals are from the enumeration {@link audiogram.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This refers to the method used to deliver the sound the patient responds to.  The ear and way the sound is delivered is specified but not the exact device used to deliver that sound (e.g. left air conduction not TDH39)
	 * 
	 * See annotations for SignalOutput_Type for more information
	 * 
	 * @@ If the converter DLL for some reason find that this value is not correctly specified then it will set the value as unknown @@
	 * 
	 * ## SignalOutput1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Signal Output</em>' attribute.
	 * @see audiogram.SignalOutputType
	 * @see #isSetStimulusSignalOutput()
	 * @see #unsetStimulusSignalOutput()
	 * @see #setStimulusSignalOutput(SignalOutputType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusSignalOutput()
	 * @model default="NoSignalOutput" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusSignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getStimulusSignalOutput();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Signal Output</em>' attribute.
	 * @see audiogram.SignalOutputType
	 * @see #isSetStimulusSignalOutput()
	 * @see #unsetStimulusSignalOutput()
	 * @see #getStimulusSignalOutput()
	 * @generated
	 */
	void setStimulusSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusSignalOutput()
	 * @see #getStimulusSignalOutput()
	 * @see #setStimulusSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetStimulusSignalOutput();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Signal Output</em>' attribute is set.
	 * @see #unsetStimulusSignalOutput()
	 * @see #getStimulusSignalOutput()
	 * @see #setStimulusSignalOutput(SignalOutputType)
	 * @generated
	 */
	boolean isSetStimulusSignalOutput();

	/**
	 * Returns the value of the '<em><b>Masking Signal Output</b></em>' attribute.
	 * The default value is <code>"NoSignalOutput"</code>.
	 * The literals are from the enumeration {@link audiogram.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This refers to the method used to deliver the masking sound to the patient. The ear and way the sound is delivered is specified but not the exact device used to deliver that sound. (e.g. left air conduction not TDH39)
	 * 
	 * See annotations for SignalOutput_Type for more information
	 * 
	 * @@ If the converter DLL for some reason find that this value is not correctly specified then it will set the value as unknown @@
	 * 
	 * ## SignalOutput2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Signal Output</em>' attribute.
	 * @see audiogram.SignalOutputType
	 * @see #isSetMaskingSignalOutput()
	 * @see #unsetMaskingSignalOutput()
	 * @see #setMaskingSignalOutput(SignalOutputType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingSignalOutput()
	 * @model default="NoSignalOutput" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MaskingSignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getMaskingSignalOutput();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Signal Output</em>' attribute.
	 * @see audiogram.SignalOutputType
	 * @see #isSetMaskingSignalOutput()
	 * @see #unsetMaskingSignalOutput()
	 * @see #getMaskingSignalOutput()
	 * @generated
	 */
	void setMaskingSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingSignalOutput()
	 * @see #getMaskingSignalOutput()
	 * @see #setMaskingSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetMaskingSignalOutput();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Signal Output</em>' attribute is set.
	 * @see #unsetMaskingSignalOutput()
	 * @see #getMaskingSignalOutput()
	 * @see #setMaskingSignalOutput(SignalOutputType)
	 * @generated
	 */
	boolean isSetMaskingSignalOutput();

	/**
	 * Returns the value of the '<em><b>Stimulusd BWeighting</b></em>' attribute.
	 * The default value is <code>"NodBWeighting"</code>.
	 * The literals are from the enumeration {@link audiogram.DBweightingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The weighting used for the stimulus signal.
	 * 
	 * See annotations for dBweighting_Type for more information
	 * 
	 * @@ If the converter DLL for some reason find that this value is not correctly specified then it will set the value as unknown @@
	 * 
	 * ## dBWeighting1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulusd BWeighting</em>' attribute.
	 * @see audiogram.DBweightingType
	 * @see #isSetStimulusdBWeighting()
	 * @see #unsetStimulusdBWeighting()
	 * @see #setStimulusdBWeighting(DBweightingType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusdBWeighting()
	 * @model default="NodBWeighting" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusdBWeighting' namespace='##targetNamespace'"
	 * @generated
	 */
	DBweightingType getStimulusdBWeighting();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulusd BWeighting</em>' attribute.
	 * @see audiogram.DBweightingType
	 * @see #isSetStimulusdBWeighting()
	 * @see #unsetStimulusdBWeighting()
	 * @see #getStimulusdBWeighting()
	 * @generated
	 */
	void setStimulusdBWeighting(DBweightingType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusdBWeighting()
	 * @see #getStimulusdBWeighting()
	 * @see #setStimulusdBWeighting(DBweightingType)
	 * @generated
	 */
	void unsetStimulusdBWeighting();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulusd BWeighting</em>' attribute is set.
	 * @see #unsetStimulusdBWeighting()
	 * @see #getStimulusdBWeighting()
	 * @see #setStimulusdBWeighting(DBweightingType)
	 * @generated
	 */
	boolean isSetStimulusdBWeighting();

	/**
	 * Returns the value of the '<em><b>Maskingd BWeighting</b></em>' attribute.
	 * The default value is <code>"NodBWeighting"</code>.
	 * The literals are from the enumeration {@link audiogram.DBweightingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The weighting used for the masking signal.
	 * 
	 * See annotations for dBweighting_Type for more information
	 * 
	 * @@ If the converter DLL for some reason find that this value is not correctly specified then it will set the value as unknown @@
	 * 
	 * ## dBWeighting2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maskingd BWeighting</em>' attribute.
	 * @see audiogram.DBweightingType
	 * @see #isSetMaskingdBWeighting()
	 * @see #unsetMaskingdBWeighting()
	 * @see #setMaskingdBWeighting(DBweightingType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingdBWeighting()
	 * @model default="NodBWeighting" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MaskingdBWeighting' namespace='##targetNamespace'"
	 * @generated
	 */
	DBweightingType getMaskingdBWeighting();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maskingd BWeighting</em>' attribute.
	 * @see audiogram.DBweightingType
	 * @see #isSetMaskingdBWeighting()
	 * @see #unsetMaskingdBWeighting()
	 * @see #getMaskingdBWeighting()
	 * @generated
	 */
	void setMaskingdBWeighting(DBweightingType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingdBWeighting()
	 * @see #getMaskingdBWeighting()
	 * @see #setMaskingdBWeighting(DBweightingType)
	 * @generated
	 */
	void unsetMaskingdBWeighting();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maskingd BWeighting</em>' attribute is set.
	 * @see #unsetMaskingdBWeighting()
	 * @see #getMaskingdBWeighting()
	 * @see #setMaskingdBWeighting(DBweightingType)
	 * @generated
	 */
	boolean isSetMaskingdBWeighting();

	/**
	 * Returns the value of the '<em><b>Stimulus Presentation Type</b></em>' attribute.
	 * The default value is <code>"NoPresentationType"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Presentation Type for the Stimulus signal
	 * 
	 * See annotations for Presentation_Type for more information
	 * 
	 * ## presentType1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Presentation Type</em>' attribute.
	 * @see #isSetStimulusPresentationType()
	 * @see #unsetStimulusPresentationType()
	 * @see #setStimulusPresentationType(PresentationType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusPresentationType()
	 * @model default="NoPresentationType" unsettable="true" dataType="audiogram.StimulusPresentationTypeType"
	 *        extendedMetaData="kind='element' name='StimulusPresentationType' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationType getStimulusPresentationType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Presentation Type</em>' attribute.
	 * @see #isSetStimulusPresentationType()
	 * @see #unsetStimulusPresentationType()
	 * @see #getStimulusPresentationType()
	 * @generated
	 */
	void setStimulusPresentationType(PresentationType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusPresentationType()
	 * @see #getStimulusPresentationType()
	 * @see #setStimulusPresentationType(PresentationType)
	 * @generated
	 */
	void unsetStimulusPresentationType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Presentation Type</em>' attribute is set.
	 * @see #unsetStimulusPresentationType()
	 * @see #getStimulusPresentationType()
	 * @see #setStimulusPresentationType(PresentationType)
	 * @generated
	 */
	boolean isSetStimulusPresentationType();

	/**
	 * Returns the value of the '<em><b>Masking Presentation Type</b></em>' attribute.
	 * The default value is <code>"NoPresentationType"</code>.
	 * The literals are from the enumeration {@link audiogram.PresentationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Presentation Type for the Masking signal
	 * 
	 * See annotations for Presentation_Type for more information
	 * 
	 * ##  presentType 2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Presentation Type</em>' attribute.
	 * @see audiogram.PresentationType
	 * @see #isSetMaskingPresentationType()
	 * @see #unsetMaskingPresentationType()
	 * @see #setMaskingPresentationType(PresentationType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingPresentationType()
	 * @model default="NoPresentationType" unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingPresentationType' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationType getMaskingPresentationType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Presentation Type</em>' attribute.
	 * @see audiogram.PresentationType
	 * @see #isSetMaskingPresentationType()
	 * @see #unsetMaskingPresentationType()
	 * @see #getMaskingPresentationType()
	 * @generated
	 */
	void setMaskingPresentationType(PresentationType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingPresentationType()
	 * @see #getMaskingPresentationType()
	 * @see #setMaskingPresentationType(PresentationType)
	 * @generated
	 */
	void unsetMaskingPresentationType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Presentation Type</em>' attribute is set.
	 * @see #unsetMaskingPresentationType()
	 * @see #getMaskingPresentationType()
	 * @see #setMaskingPresentationType(PresentationType)
	 * @generated
	 */
	boolean isSetMaskingPresentationType();

	/**
	 * Returns the value of the '<em><b>Stimulus Transducer Type</b></em>' attribute.
	 * The default value is <code>"NoTransducerType"</code>.
	 * The literals are from the enumeration {@link audiogram.TransducerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to deliver sound to the test ear.
	 * 
	 * See annotations for Transducer_Type for more information
	 * 
	 * ## transType1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Transducer Type</em>' attribute.
	 * @see audiogram.TransducerType
	 * @see #isSetStimulusTransducerType()
	 * @see #unsetStimulusTransducerType()
	 * @see #setStimulusTransducerType(TransducerType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusTransducerType()
	 * @model default="NoTransducerType" unsettable="true"
	 *        extendedMetaData="kind='element' name='StimulusTransducerType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerType getStimulusTransducerType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Transducer Type</em>' attribute.
	 * @see audiogram.TransducerType
	 * @see #isSetStimulusTransducerType()
	 * @see #unsetStimulusTransducerType()
	 * @see #getStimulusTransducerType()
	 * @generated
	 */
	void setStimulusTransducerType(TransducerType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusTransducerType()
	 * @see #getStimulusTransducerType()
	 * @see #setStimulusTransducerType(TransducerType)
	 * @generated
	 */
	void unsetStimulusTransducerType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Transducer Type</em>' attribute is set.
	 * @see #unsetStimulusTransducerType()
	 * @see #getStimulusTransducerType()
	 * @see #setStimulusTransducerType(TransducerType)
	 * @generated
	 */
	boolean isSetStimulusTransducerType();

	/**
	 * Returns the value of the '<em><b>Masking Transducer Type</b></em>' attribute.
	 * The default value is <code>"NoTransducerType"</code>.
	 * The literals are from the enumeration {@link audiogram.TransducerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to deliver sound to the non test ear.
	 * 
	 * See annotations for Transducer_Type for more information
	 * 
	 * ## transType2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Transducer Type</em>' attribute.
	 * @see audiogram.TransducerType
	 * @see #isSetMaskingTransducerType()
	 * @see #unsetMaskingTransducerType()
	 * @see #setMaskingTransducerType(TransducerType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingTransducerType()
	 * @model default="NoTransducerType" unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingTransducerType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerType getMaskingTransducerType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Transducer Type</em>' attribute.
	 * @see audiogram.TransducerType
	 * @see #isSetMaskingTransducerType()
	 * @see #unsetMaskingTransducerType()
	 * @see #getMaskingTransducerType()
	 * @generated
	 */
	void setMaskingTransducerType(TransducerType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingTransducerType()
	 * @see #getMaskingTransducerType()
	 * @see #setMaskingTransducerType(TransducerType)
	 * @generated
	 */
	void unsetMaskingTransducerType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Transducer Type</em>' attribute is set.
	 * @see #unsetMaskingTransducerType()
	 * @see #getMaskingTransducerType()
	 * @see #setMaskingTransducerType(TransducerType)
	 * @generated
	 */
	boolean isSetMaskingTransducerType();

	/**
	 * Returns the value of the '<em><b>Transducer Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional description of the Transducer
	 * 
	 * ## transDescr ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transducer Description</em>' attribute.
	 * @see #isSetTransducerDescription()
	 * @see #unsetTransducerDescription()
	 * @see #setTransducerDescription(String)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_TransducerDescription()
	 * @model default="" unsettable="true" dataType="audiogram.TransducerDescriptionType"
	 *        extendedMetaData="kind='element' name='TransducerDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransducerDescription();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transducer Description</em>' attribute.
	 * @see #isSetTransducerDescription()
	 * @see #unsetTransducerDescription()
	 * @see #getTransducerDescription()
	 * @generated
	 */
	void setTransducerDescription(String value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransducerDescription()
	 * @see #getTransducerDescription()
	 * @see #setTransducerDescription(String)
	 * @generated
	 */
	void unsetTransducerDescription();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transducer Description</em>' attribute is set.
	 * @see #unsetTransducerDescription()
	 * @see #getTransducerDescription()
	 * @see #setTransducerDescription(String)
	 * @generated
	 */
	boolean isSetTransducerDescription();

	/**
	 * Returns the value of the '<em><b>Stimulus Transducer Calibration Standard</b></em>' attribute.
	 * The default value is <code>"NoTransducerCalibrationStandard"</code>.
	 * The literals are from the enumeration {@link audiogram.TransducerCalibrationStandardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard used for the Stimulus Transducer Calibration
	 * 
	 * See annotations for Transducer_Type for more information
	 * 
	 * Ref. [HOCA-5, Chapter 4, page 50: Puretone, Speech and Noise signals]
	 * 
	 * ## transCalStand1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Transducer Calibration Standard</em>' attribute.
	 * @see audiogram.TransducerCalibrationStandardType
	 * @see #isSetStimulusTransducerCalibrationStandard()
	 * @see #unsetStimulusTransducerCalibrationStandard()
	 * @see #setStimulusTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard()
	 * @model default="NoTransducerCalibrationStandard" unsettable="true"
	 *        extendedMetaData="kind='element' name='StimulusTransducerCalibrationStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerCalibrationStandardType getStimulusTransducerCalibrationStandard();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Transducer Calibration Standard</em>' attribute.
	 * @see audiogram.TransducerCalibrationStandardType
	 * @see #isSetStimulusTransducerCalibrationStandard()
	 * @see #unsetStimulusTransducerCalibrationStandard()
	 * @see #getStimulusTransducerCalibrationStandard()
	 * @generated
	 */
	void setStimulusTransducerCalibrationStandard(TransducerCalibrationStandardType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusTransducerCalibrationStandard()
	 * @see #getStimulusTransducerCalibrationStandard()
	 * @see #setStimulusTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @generated
	 */
	void unsetStimulusTransducerCalibrationStandard();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Transducer Calibration Standard</em>' attribute is set.
	 * @see #unsetStimulusTransducerCalibrationStandard()
	 * @see #getStimulusTransducerCalibrationStandard()
	 * @see #setStimulusTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @generated
	 */
	boolean isSetStimulusTransducerCalibrationStandard();

	/**
	 * Returns the value of the '<em><b>Masking Transducer Calibration Standard</b></em>' attribute.
	 * The default value is <code>"NoTransducerCalibrationStandard"</code>.
	 * The literals are from the enumeration {@link audiogram.TransducerCalibrationStandardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard used for the MaskingTransducer Calibration
	 * 
	 * See annotations for Transducer_Type for more information
	 * 
	 * Ref. [HOCA-5, Chapter 4, page 50: Puretone, Speech and Noise signals]
	 * 
	 * ## transCalStand2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Transducer Calibration Standard</em>' attribute.
	 * @see audiogram.TransducerCalibrationStandardType
	 * @see #isSetMaskingTransducerCalibrationStandard()
	 * @see #unsetMaskingTransducerCalibrationStandard()
	 * @see #setMaskingTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard()
	 * @model default="NoTransducerCalibrationStandard" unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingTransducerCalibrationStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerCalibrationStandardType getMaskingTransducerCalibrationStandard();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Transducer Calibration Standard</em>' attribute.
	 * @see audiogram.TransducerCalibrationStandardType
	 * @see #isSetMaskingTransducerCalibrationStandard()
	 * @see #unsetMaskingTransducerCalibrationStandard()
	 * @see #getMaskingTransducerCalibrationStandard()
	 * @generated
	 */
	void setMaskingTransducerCalibrationStandard(TransducerCalibrationStandardType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingTransducerCalibrationStandard()
	 * @see #getMaskingTransducerCalibrationStandard()
	 * @see #setMaskingTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @generated
	 */
	void unsetMaskingTransducerCalibrationStandard();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Transducer Calibration Standard</em>' attribute is set.
	 * @see #unsetMaskingTransducerCalibrationStandard()
	 * @see #getMaskingTransducerCalibrationStandard()
	 * @see #setMaskingTransducerCalibrationStandard(TransducerCalibrationStandardType)
	 * @generated
	 */
	boolean isSetMaskingTransducerCalibrationStandard();

	/**
	 * Returns the value of the '<em><b>Hearing Instrument1 Condition</b></em>' attribute.
	 * The default value is <code>"NoCondition"</code>.
	 * The literals are from the enumeration {@link audiogram.HearingInstrumentConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if a hearing instrument was worn by the patient during testing for condition 1
	 * 
	 * See annotations for HearingInstrumentCondtion_Type for more information
	 * 
	 * ## condition1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument1 Condition</em>' attribute.
	 * @see audiogram.HearingInstrumentConditionType
	 * @see #isSetHearingInstrument1Condition()
	 * @see #unsetHearingInstrument1Condition()
	 * @see #setHearingInstrument1Condition(HearingInstrumentConditionType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_HearingInstrument1Condition()
	 * @model default="NoCondition" unsettable="true"
	 *        extendedMetaData="kind='element' name='HearingInstrument_1_Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	HearingInstrumentConditionType getHearingInstrument1Condition();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument1 Condition</em>' attribute.
	 * @see audiogram.HearingInstrumentConditionType
	 * @see #isSetHearingInstrument1Condition()
	 * @see #unsetHearingInstrument1Condition()
	 * @see #getHearingInstrument1Condition()
	 * @generated
	 */
	void setHearingInstrument1Condition(HearingInstrumentConditionType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHearingInstrument1Condition()
	 * @see #getHearingInstrument1Condition()
	 * @see #setHearingInstrument1Condition(HearingInstrumentConditionType)
	 * @generated
	 */
	void unsetHearingInstrument1Condition();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hearing Instrument1 Condition</em>' attribute is set.
	 * @see #unsetHearingInstrument1Condition()
	 * @see #getHearingInstrument1Condition()
	 * @see #setHearingInstrument1Condition(HearingInstrumentConditionType)
	 * @generated
	 */
	boolean isSetHearingInstrument1Condition();

	/**
	 * Returns the value of the '<em><b>Hearing Instrument2 Condition</b></em>' attribute.
	 * The default value is <code>"NoCondition"</code>.
	 * The literals are from the enumeration {@link audiogram.HearingInstrumentConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if a hearing instrument was worn by the patient during testing for condition 2
	 * 
	 * See annotations for HearingInstrumentCondtion_Type for more information
	 * 
	 * ## condition2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument2 Condition</em>' attribute.
	 * @see audiogram.HearingInstrumentConditionType
	 * @see #isSetHearingInstrument2Condition()
	 * @see #unsetHearingInstrument2Condition()
	 * @see #setHearingInstrument2Condition(HearingInstrumentConditionType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_HearingInstrument2Condition()
	 * @model default="NoCondition" unsettable="true"
	 *        extendedMetaData="kind='element' name='HearingInstrument_2_Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	HearingInstrumentConditionType getHearingInstrument2Condition();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument2 Condition</em>' attribute.
	 * @see audiogram.HearingInstrumentConditionType
	 * @see #isSetHearingInstrument2Condition()
	 * @see #unsetHearingInstrument2Condition()
	 * @see #getHearingInstrument2Condition()
	 * @generated
	 */
	void setHearingInstrument2Condition(HearingInstrumentConditionType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHearingInstrument2Condition()
	 * @see #getHearingInstrument2Condition()
	 * @see #setHearingInstrument2Condition(HearingInstrumentConditionType)
	 * @generated
	 */
	void unsetHearingInstrument2Condition();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hearing Instrument2 Condition</em>' attribute is set.
	 * @see #unsetHearingInstrument2Condition()
	 * @see #getHearingInstrument2Condition()
	 * @see #setHearingInstrument2Condition(HearingInstrumentConditionType)
	 * @generated
	 */
	boolean isSetHearingInstrument2Condition();

	/**
	 * Returns the value of the '<em><b>Hearing Instrument Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic text description of the hearing instrument(s) worn during the test
	 * 
	 * ## instrDescr ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument Description</em>' attribute.
	 * @see #isSetHearingInstrumentDescription()
	 * @see #unsetHearingInstrumentDescription()
	 * @see #setHearingInstrumentDescription(String)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_HearingInstrumentDescription()
	 * @model default="" unsettable="true" dataType="audiogram.HearingInstrumentDescriptionType"
	 *        extendedMetaData="kind='element' name='HearingInstrumentDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHearingInstrumentDescription();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument Description</em>' attribute.
	 * @see #isSetHearingInstrumentDescription()
	 * @see #unsetHearingInstrumentDescription()
	 * @see #getHearingInstrumentDescription()
	 * @generated
	 */
	void setHearingInstrumentDescription(String value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHearingInstrumentDescription()
	 * @see #getHearingInstrumentDescription()
	 * @see #setHearingInstrumentDescription(String)
	 * @generated
	 */
	void unsetHearingInstrumentDescription();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hearing Instrument Description</em>' attribute is set.
	 * @see #unsetHearingInstrumentDescription()
	 * @see #getHearingInstrumentDescription()
	 * @see #setHearingInstrumentDescription(String)
	 * @generated
	 */
	boolean isSetHearingInstrumentDescription();

	/**
	 * Returns the value of the '<em><b>Stimulus Auxiliary</b></em>' attribute.
	 * The default value is <code>"NoAuxiliaryParameter"</code>.
	 * The literals are from the enumeration {@link audiogram.AuxiliaryParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Word list type used for stimulus
	 * 
	 * See AuxiliaryParameter_Type for more information
	 * 
	 * ## auxParm1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Auxiliary</em>' attribute.
	 * @see audiogram.AuxiliaryParameterType
	 * @see #isSetStimulusAuxiliary()
	 * @see #unsetStimulusAuxiliary()
	 * @see #setStimulusAuxiliary(AuxiliaryParameterType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusAuxiliary()
	 * @model default="NoAuxiliaryParameter" unsettable="true"
	 *        extendedMetaData="kind='element' name='StimulusAuxiliary' namespace='##targetNamespace'"
	 * @generated
	 */
	AuxiliaryParameterType getStimulusAuxiliary();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Auxiliary</em>' attribute.
	 * @see audiogram.AuxiliaryParameterType
	 * @see #isSetStimulusAuxiliary()
	 * @see #unsetStimulusAuxiliary()
	 * @see #getStimulusAuxiliary()
	 * @generated
	 */
	void setStimulusAuxiliary(AuxiliaryParameterType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusAuxiliary()
	 * @see #getStimulusAuxiliary()
	 * @see #setStimulusAuxiliary(AuxiliaryParameterType)
	 * @generated
	 */
	void unsetStimulusAuxiliary();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Auxiliary</em>' attribute is set.
	 * @see #unsetStimulusAuxiliary()
	 * @see #getStimulusAuxiliary()
	 * @see #setStimulusAuxiliary(AuxiliaryParameterType)
	 * @generated
	 */
	boolean isSetStimulusAuxiliary();

	/**
	 * Returns the value of the '<em><b>Masking Auxiliary</b></em>' attribute.
	 * The default value is <code>"NoAuxiliaryParameter"</code>.
	 * The literals are from the enumeration {@link audiogram.AuxiliaryParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Word list type used for masking
	 * 
	 * See AuxiliaryParameter_Type for more information
	 * 
	 * ##  auxParm2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Auxiliary</em>' attribute.
	 * @see audiogram.AuxiliaryParameterType
	 * @see #isSetMaskingAuxiliary()
	 * @see #unsetMaskingAuxiliary()
	 * @see #setMaskingAuxiliary(AuxiliaryParameterType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingAuxiliary()
	 * @model default="NoAuxiliaryParameter" unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingAuxiliary' namespace='##targetNamespace'"
	 * @generated
	 */
	AuxiliaryParameterType getMaskingAuxiliary();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Auxiliary</em>' attribute.
	 * @see audiogram.AuxiliaryParameterType
	 * @see #isSetMaskingAuxiliary()
	 * @see #unsetMaskingAuxiliary()
	 * @see #getMaskingAuxiliary()
	 * @generated
	 */
	void setMaskingAuxiliary(AuxiliaryParameterType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingAuxiliary()
	 * @see #getMaskingAuxiliary()
	 * @see #setMaskingAuxiliary(AuxiliaryParameterType)
	 * @generated
	 */
	void unsetMaskingAuxiliary();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Auxiliary</em>' attribute is set.
	 * @see #unsetMaskingAuxiliary()
	 * @see #getMaskingAuxiliary()
	 * @see #setMaskingAuxiliary(AuxiliaryParameterType)
	 * @generated
	 */
	boolean isSetMaskingAuxiliary();

	/**
	 * Returns the value of the '<em><b>Word List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When testing a patient's speech discrimination a number of different sets of words can be used these are termed word lists (e.g. Maryland CNC word list or BKB Sentence list)
	 * 
	 * ## wordListName ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Word List Name</em>' attribute.
	 * @see #setWordListName(String)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_WordListName()
	 * @model dataType="audiogram.WordListNameType"
	 *        extendedMetaData="kind='element' name='WordListName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWordListName();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getWordListName <em>Word List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word List Name</em>' attribute.
	 * @see #getWordListName()
	 * @generated
	 */
	void setWordListName(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Parameter Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic text description of the Auxiliary Parameters
	 * 
	 * ## auxParmDescr ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary Parameter Description</em>' attribute.
	 * @see #setAuxiliaryParameterDescription(String)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription()
	 * @model dataType="audiogram.AuxiliaryParameterDescriptionType"
	 *        extendedMetaData="kind='element' name='AuxiliaryParameterDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuxiliaryParameterDescription();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription <em>Auxiliary Parameter Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Parameter Description</em>' attribute.
	 * @see #getAuxiliaryParameterDescription()
	 * @generated
	 */
	void setAuxiliaryParameterDescription(String value);

	/**
	 * Returns the value of the '<em><b>Speech Threshold Type</b></em>' attribute.
	 * The default value is <code>"NotUsed"</code>.
	 * The literals are from the enumeration {@link audiogram.SpeechThresholdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of speech threshold test
	 * 
	 * See SpeechThreshold_Type for more information
	 * 
	 * ## speechThresType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Threshold Type</em>' attribute.
	 * @see audiogram.SpeechThresholdType
	 * @see #isSetSpeechThresholdType()
	 * @see #unsetSpeechThresholdType()
	 * @see #setSpeechThresholdType(SpeechThresholdType)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_SpeechThresholdType()
	 * @model default="NotUsed" unsettable="true"
	 *        extendedMetaData="kind='element' name='SpeechThresholdType' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechThresholdType getSpeechThresholdType();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Threshold Type</em>' attribute.
	 * @see audiogram.SpeechThresholdType
	 * @see #isSetSpeechThresholdType()
	 * @see #unsetSpeechThresholdType()
	 * @see #getSpeechThresholdType()
	 * @generated
	 */
	void setSpeechThresholdType(SpeechThresholdType value);

	/**
	 * Unsets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeechThresholdType()
	 * @see #getSpeechThresholdType()
	 * @see #setSpeechThresholdType(SpeechThresholdType)
	 * @generated
	 */
	void unsetSpeechThresholdType();

	/**
	 * Returns whether the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speech Threshold Type</em>' attribute is set.
	 * @see #unsetSpeechThresholdType()
	 * @see #getSpeechThresholdType()
	 * @see #setSpeechThresholdType(SpeechThresholdType)
	 * @generated
	 */
	boolean isSetSpeechThresholdType();

	/**
	 * Returns the value of the '<em><b>Stimulus On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to control how long a signal is presented, in seconds, when a button on the audiometer is pressed.
	 * 
	 * An example is SISI - short increment sensitivity index testing where a continuous tone is presented 20dB above HTL and every 5 seconds the intensity of that tone increases by 1 dB and is held at that level for one- fifth of a second before reducing back to the original level. 
	 * 
	 * ## onTime1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus On Time</em>' attribute.
	 * @see #setStimulusOnTime(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusOnTime()
	 * @model dataType="audiogram.StimulusOnTimeType"
	 *        extendedMetaData="kind='element' name='StimulusOnTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusOnTime();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusOnTime <em>Stimulus On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus On Time</em>' attribute.
	 * @see #getStimulusOnTime()
	 * @generated
	 */
	void setStimulusOnTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to control how long a signal is presented, in seconds, when a button on the audiometer is pressed.
	 * 
	 * ## onTime2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking On Time</em>' attribute.
	 * @see #setMaskingOnTime(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingOnTime()
	 * @model dataType="audiogram.MaskingOnTimeType"
	 *        extendedMetaData="kind='element' name='MaskingOnTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingOnTime();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingOnTime <em>Masking On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking On Time</em>' attribute.
	 * @see #getMaskingOnTime()
	 * @generated
	 */
	void setMaskingOnTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to control how long a signal is off between presentations (in seconds) in automatic tests.
	 * example is SISI - short increment sensitivity index testing where a continuous tone is presented 20dB above HTL and every 5 seconds the intensity of that tone increases by 1 dB and is held at that level for one- fifth of a second before reducing back to the original level. 
	 * 
	 * 
	 * ## offTime1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Off Time</em>' attribute.
	 * @see #setStimulusOffTime(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusOffTime()
	 * @model dataType="audiogram.StimulusOffTimeType"
	 *        extendedMetaData="kind='element' name='StimulusOffTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusOffTime();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusOffTime <em>Stimulus Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Off Time</em>' attribute.
	 * @see #getStimulusOffTime()
	 * @generated
	 */
	void setStimulusOffTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to control how long a signal is presented, in seconds, when a button on the audiometer is pressed.
	 * 
	 * ## offTime2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Off Time</em>' attribute.
	 * @see #setMaskingOffTime(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingOffTime()
	 * @model dataType="audiogram.MaskingOffTimeType"
	 *        extendedMetaData="kind='element' name='MaskingOffTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingOffTime();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingOffTime <em>Masking Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Off Time</em>' attribute.
	 * @see #getMaskingOffTime()
	 * @generated
	 */
	void setMaskingOffTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Si Si Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the amount of decibel increase added to the carrier signal during SISI testing, commonly used values are 1,2 and 3 dB
	 * 
	 * ## siSiParm1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Si Si Parameter</em>' attribute.
	 * @see #setStimulusSiSiParameter(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusSiSiParameter()
	 * @model dataType="audiogram.StimulusSiSiParameterType"
	 *        extendedMetaData="kind='element' name='StimulusSiSiParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusSiSiParameter();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter <em>Stimulus Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Si Si Parameter</em>' attribute.
	 * @see #getStimulusSiSiParameter()
	 * @generated
	 */
	void setStimulusSiSiParameter(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Si Si Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking is not commonly used for SiSi testing, 
	 * 
	 * ## ## siSiParm2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Si Si Parameter</em>' attribute.
	 * @see #setMaskingSiSiParameter(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingSiSiParameter()
	 * @model dataType="audiogram.MaskingSiSiParameterType"
	 *        extendedMetaData="kind='element' name='MaskingSiSiParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingSiSiParameter();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter <em>Masking Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Si Si Parameter</em>' attribute.
	 * @see #getMaskingSiSiParameter()
	 * @generated
	 */
	void setMaskingSiSiParameter(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Warble Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The warble tone is a variation of the pure tone. The frequency of the basic tone is modulated in a desired pattern This is often used in free field Audiometry testing 
	 * 
	 * ## WarbleModFreq1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Warble Modulation</em>' attribute.
	 * @see #setStimulusWarbleModulation(BigInteger)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusWarbleModulation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='StimulusWarbleModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusWarbleModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation <em>Stimulus Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Warble Modulation</em>' attribute.
	 * @see #getStimulusWarbleModulation()
	 * @generated
	 */
	void setStimulusWarbleModulation(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Masking Warble Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Warble Modulation is not commonly used.
	 * 
	 * ## WarbleModFreq2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Warble Modulation</em>' attribute.
	 * @see #setMaskingWarbleModulation(BigInteger)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingWarbleModulation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingWarbleModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingWarbleModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation <em>Masking Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Warble Modulation</em>' attribute.
	 * @see #getMaskingWarbleModulation()
	 * @generated
	 */
	void setMaskingWarbleModulation(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stimulus Warble Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amplitude of the warble tone in percent of the steady tone.
	 * 
	 * Measurement conditions typically used with DifferenceLimenFrequency testing.
	 * 
	 * ## WarbleModSize1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Warble Modulation Size</em>' attribute.
	 * @see #setStimulusWarbleModulationSize(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize()
	 * @model dataType="audiogram.StimulusWarbleModulationSizeType"
	 *        extendedMetaData="kind='element' name='StimulusWarbleModulationSize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusWarbleModulationSize();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize <em>Stimulus Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Warble Modulation Size</em>' attribute.
	 * @see #getStimulusWarbleModulationSize()
	 * @generated
	 */
	void setStimulusWarbleModulationSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Warble Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Warble Modulation Size is not commonly used
	 * 
	 * ## WarbleModSize2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Warble Modulation Size</em>' attribute.
	 * @see #setMaskingWarbleModulationSize(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize()
	 * @model dataType="audiogram.MaskingWarbleModulationSizeType"
	 *        extendedMetaData="kind='element' name='MaskingWarbleModulationSize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingWarbleModulationSize();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize <em>Masking Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Warble Modulation Size</em>' attribute.
	 * @see #getMaskingWarbleModulationSize()
	 * @generated
	 */
	void setMaskingWarbleModulationSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency of the basic tone is modulated by a lower frequency to produce a warble sound. 
	 * 
	 * Measurement conditions typically used with DifferenceLimenFrequency
	 * 
	 * ## fmModSize1##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency Modulation</em>' attribute.
	 * @see #setStimulusFrequencyModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation()
	 * @model dataType="audiogram.StimulusFrequencyModulationType"
	 *        extendedMetaData="kind='element' name='StimulusFrequencyModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusFrequencyModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Frequency Modulation</em>' attribute.
	 * @see #getStimulusFrequencyModulation()
	 * @generated
	 */
	void setStimulusFrequencyModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Frequency Modulation is typically not used.
	 * 
	 * ## fmModSize2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency Modulation</em>' attribute.
	 * @see #setMaskingFrequencyModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation()
	 * @model dataType="audiogram.MaskingFrequencyModulationType"
	 *        extendedMetaData="kind='element' name='MaskingFrequencyModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingFrequencyModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Frequency Modulation</em>' attribute.
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 */
	void setMaskingFrequencyModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amplitude of the basic tone is modulated to produce a warble sound. 
	 * 
	 * Measurement conditions typically used with DifferenceLimenIntensity.
	 * 
	 * ## AMModSize1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Amplitude Modulation</em>' attribute.
	 * @see #setStimulusAmplitudeModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation()
	 * @model dataType="audiogram.StimulusAmplitudeModulationType"
	 *        extendedMetaData="kind='element' name='StimulusAmplitudeModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusAmplitudeModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Amplitude Modulation</em>' attribute.
	 * @see #getStimulusAmplitudeModulation()
	 * @generated
	 */
	void setStimulusAmplitudeModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Amplitude Modulation is typically not used
	 * 
	 * ## AMModSize2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Amplitude Modulation</em>' attribute.
	 * @see #setMaskingAmplitudeModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation()
	 * @model dataType="audiogram.MaskingAmplitudeModulationType"
	 *        extendedMetaData="kind='element' name='MaskingAmplitudeModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingAmplitudeModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Amplitude Modulation</em>' attribute.
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 */
	void setMaskingAmplitudeModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Pulse Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the frequency in Hz with which the signal is switched between the ears
	 * 
	 * Measurement conditions typically used with AlternateBinauralLoudnessBalanceConditions
	 * 
	 * ## ## pulseModFreq1 ## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Pulse Modulation</em>' attribute.
	 * @see #setStimulusPulseModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusPulseModulation()
	 * @model dataType="audiogram.StimulusPulseModulationType"
	 *        extendedMetaData="kind='element' name='StimulusPulseModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusPulseModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseModulation <em>Stimulus Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Pulse Modulation</em>' attribute.
	 * @see #getStimulusPulseModulation()
	 * @generated
	 */
	void setStimulusPulseModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Pulse Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Pulse Modulation is typically not used
	 * 
	 * ## pulseModFreq2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Pulse Modulation</em>' attribute.
	 * @see #setMaskingPulseModulation(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingPulseModulation()
	 * @model dataType="audiogram.MaskingPulseModulationType"
	 *        extendedMetaData="kind='element' name='MaskingPulseModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingPulseModulation();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseModulation <em>Masking Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Pulse Modulation</em>' attribute.
	 * @see #getMaskingPulseModulation()
	 * @generated
	 */
	void setMaskingPulseModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Pulse Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Stimulus Pulse Cycle is the percentage of stimulus frequency where the signal is applied to the good ear. The rest of the pulse time is applied to the bad ear.  This tells the audiometer how to cycle through that presentation when the stimulus present button is pressed.
	 * 
	 * Measurement conditions typically used with AlternateBinauralLoudnessBalanceConditions 
	 * 
	 * ## pulseDutyCycle1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Pulse Cycle</em>' attribute.
	 * @see #setStimulusPulseCycle(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_StimulusPulseCycle()
	 * @model dataType="audiogram.StimulusPulseCycleType"
	 *        extendedMetaData="kind='element' name='StimulusPulseCycle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusPulseCycle();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseCycle <em>Stimulus Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Pulse Cycle</em>' attribute.
	 * @see #getStimulusPulseCycle()
	 * @generated
	 */
	void setStimulusPulseCycle(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Pulse Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In this case masking is understood to be the second measurement channel.  This is the pulse time applied to the bad ear.  
	 * 
	 * Measurement conditions typically used with AlternateBinauralLoudnessBalanceConditions
	 * 
	 * ## pulseDutyCycle2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Pulse Cycle</em>' attribute.
	 * @see #setMaskingPulseCycle(BigDecimal)
	 * @see audiogram.AudiogramPackage#getAudioMetricMeasurementConditionsType_MaskingPulseCycle()
	 * @model dataType="audiogram.MaskingPulseCycleType"
	 *        extendedMetaData="kind='element' name='MaskingPulseCycle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingPulseCycle();

	/**
	 * Sets the value of the '{@link audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseCycle <em>Masking Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Pulse Cycle</em>' attribute.
	 * @see #getMaskingPulseCycle()
	 * @generated
	 */
	void setMaskingPulseCycle(BigDecimal value);

} // AudioMetricMeasurementConditionsType
