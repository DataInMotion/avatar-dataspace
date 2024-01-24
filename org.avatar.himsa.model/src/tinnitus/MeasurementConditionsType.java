/*
 */
package tinnitus;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measuring Conditions for each measurement
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusBandwidthModulation <em>Stimulus Bandwidth Modulation</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingBandwidthModulation <em>Masking Bandwidth Modulation</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}</li>
 *   <li>{@link tinnitus.MeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType()
 * @model extendedMetaData="name='MeasurementConditions_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Signal Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus signal is the sound being presented to the patient, in the ear being tested, that you want them to respond to. (e.g. Pure Tone)
	 * Please note, for ResidualInhibition, the patient is submitted to a masking signal on the ear being tested. In this case the StimulusSignalType must be set in accordance to that masking signal. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Signal Type</em>' containment reference.
	 * @see #setStimulusSignalType(SignalType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusSignalType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusSignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalType getStimulusSignalType();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Signal Type</em>' containment reference.
	 * @see #getStimulusSignalType()
	 * @generated
	 */
	void setStimulusSignalType(SignalType value);

	/**
	 * Returns the value of the '<em><b>Stimulus Signal Output</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This refers to the method used to deliver the sound the patient responds to.  The ear and way the sound is delivered is specified but not the exact device used to deliver that sound (e.g. left air conduction not TDH39)
	 * See annotations for SignalOutput_Type for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Signal Output</em>' attribute.
	 * @see tinnitus.SignalOutputType
	 * @see #isSetStimulusSignalOutput()
	 * @see #unsetStimulusSignalOutput()
	 * @see #setStimulusSignalOutput(SignalOutputType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusSignalOutput()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusSignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getStimulusSignalOutput();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Signal Output</em>' attribute.
	 * @see tinnitus.SignalOutputType
	 * @see #isSetStimulusSignalOutput()
	 * @see #unsetStimulusSignalOutput()
	 * @see #getStimulusSignalOutput()
	 * @generated
	 */
	void setStimulusSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusSignalOutput()
	 * @see #getStimulusSignalOutput()
	 * @see #setStimulusSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetStimulusSignalOutput();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Masking Signal Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a sound used to stop the hearing in an ear that is not being tested from picking up the test signal. Often used when one ear is found to be significantly poorer than the other or for bone conduction testing.
	 * The non test ear picking up the test tone is called crossover. Masking is presented to the non test ear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Signal Type</em>' containment reference.
	 * @see #setMaskingSignalType(SignalType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingSignalType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaskingSignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalType getMaskingSignalType();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Signal Type</em>' containment reference.
	 * @see #getMaskingSignalType()
	 * @generated
	 */
	void setMaskingSignalType(SignalType value);

	/**
	 * Returns the value of the '<em><b>Masking Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.SignalUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit used for the masking signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Unit</em>' attribute.
	 * @see tinnitus.SignalUnitType
	 * @see #isSetMaskingUnit()
	 * @see #unsetMaskingUnit()
	 * @see #setMaskingUnit(SignalUnitType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalUnitType getMaskingUnit();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Unit</em>' attribute.
	 * @see tinnitus.SignalUnitType
	 * @see #isSetMaskingUnit()
	 * @see #unsetMaskingUnit()
	 * @see #getMaskingUnit()
	 * @generated
	 */
	void setMaskingUnit(SignalUnitType value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingUnit()
	 * @see #getMaskingUnit()
	 * @see #setMaskingUnit(SignalUnitType)
	 * @generated
	 */
	void unsetMaskingUnit();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Unit</em>' attribute is set.
	 * @see #unsetMaskingUnit()
	 * @see #getMaskingUnit()
	 * @see #setMaskingUnit(SignalUnitType)
	 * @generated
	 */
	boolean isSetMaskingUnit();

	/**
	 * Returns the value of the '<em><b>Masking Signal Output</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This refers to the method used to deliver the masking sound to the patient. The ear and way the sound is delivered is specified but not the exact device used to deliver that sound. (e.g. left air conduction not TDH39)
	 * See annotations for SignalOutput_Type for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Signal Output</em>' attribute.
	 * @see tinnitus.SignalOutputType
	 * @see #isSetMaskingSignalOutput()
	 * @see #unsetMaskingSignalOutput()
	 * @see #setMaskingSignalOutput(SignalOutputType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingSignalOutput()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingSignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getMaskingSignalOutput();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Signal Output</em>' attribute.
	 * @see tinnitus.SignalOutputType
	 * @see #isSetMaskingSignalOutput()
	 * @see #unsetMaskingSignalOutput()
	 * @see #getMaskingSignalOutput()
	 * @generated
	 */
	void setMaskingSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingSignalOutput()
	 * @see #getMaskingSignalOutput()
	 * @see #setMaskingSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetMaskingSignalOutput();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Stimulus Transducer Type</b></em>' attribute.
	 * The default value is <code>"NoTransducer"</code>.
	 * The literals are from the enumeration {@link tinnitus.TransducerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to deliver sound to the test ear.
	 * See annotations for Transducer_Type for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Transducer Type</em>' attribute.
	 * @see tinnitus.TransducerType
	 * @see #isSetStimulusTransducerType()
	 * @see #unsetStimulusTransducerType()
	 * @see #setStimulusTransducerType(TransducerType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusTransducerType()
	 * @model default="NoTransducer" unsettable="true"
	 *        extendedMetaData="kind='element' name='StimulusTransducerType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerType getStimulusTransducerType();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Transducer Type</em>' attribute.
	 * @see tinnitus.TransducerType
	 * @see #isSetStimulusTransducerType()
	 * @see #unsetStimulusTransducerType()
	 * @see #getStimulusTransducerType()
	 * @generated
	 */
	void setStimulusTransducerType(TransducerType value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusTransducerType()
	 * @see #getStimulusTransducerType()
	 * @see #setStimulusTransducerType(TransducerType)
	 * @generated
	 */
	void unsetStimulusTransducerType();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}' attribute is set.
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
	 * The default value is <code>"NoTransducer"</code>.
	 * The literals are from the enumeration {@link tinnitus.TransducerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to deliver sound to the non test ear.
	 * See annotations for Transducer_Type for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Transducer Type</em>' attribute.
	 * @see tinnitus.TransducerType
	 * @see #isSetMaskingTransducerType()
	 * @see #unsetMaskingTransducerType()
	 * @see #setMaskingTransducerType(TransducerType)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingTransducerType()
	 * @model default="NoTransducer" unsettable="true"
	 *        extendedMetaData="kind='element' name='MaskingTransducerType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransducerType getMaskingTransducerType();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Transducer Type</em>' attribute.
	 * @see tinnitus.TransducerType
	 * @see #isSetMaskingTransducerType()
	 * @see #unsetMaskingTransducerType()
	 * @see #getMaskingTransducerType()
	 * @generated
	 */
	void setMaskingTransducerType(TransducerType value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingTransducerType()
	 * @see #getMaskingTransducerType()
	 * @see #setMaskingTransducerType(TransducerType)
	 * @generated
	 */
	void unsetMaskingTransducerType();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Stimulus Transducer Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional description of the Transducer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Transducer Description</em>' attribute.
	 * @see #isSetStimulusTransducerDescription()
	 * @see #unsetStimulusTransducerDescription()
	 * @see #setStimulusTransducerDescription(String)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusTransducerDescription()
	 * @model default="" unsettable="true" dataType="tinnitus.StimulusTransducerDescriptionType"
	 *        extendedMetaData="kind='element' name='StimulusTransducerDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStimulusTransducerDescription();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Transducer Description</em>' attribute.
	 * @see #isSetStimulusTransducerDescription()
	 * @see #unsetStimulusTransducerDescription()
	 * @see #getStimulusTransducerDescription()
	 * @generated
	 */
	void setStimulusTransducerDescription(String value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStimulusTransducerDescription()
	 * @see #getStimulusTransducerDescription()
	 * @see #setStimulusTransducerDescription(String)
	 * @generated
	 */
	void unsetStimulusTransducerDescription();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stimulus Transducer Description</em>' attribute is set.
	 * @see #unsetStimulusTransducerDescription()
	 * @see #getStimulusTransducerDescription()
	 * @see #setStimulusTransducerDescription(String)
	 * @generated
	 */
	boolean isSetStimulusTransducerDescription();

	/**
	 * Returns the value of the '<em><b>Masking Transducer Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional description of the Transducer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Transducer Description</em>' attribute.
	 * @see #isSetMaskingTransducerDescription()
	 * @see #unsetMaskingTransducerDescription()
	 * @see #setMaskingTransducerDescription(String)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingTransducerDescription()
	 * @model default="" unsettable="true" dataType="tinnitus.MaskingTransducerDescriptionType"
	 *        extendedMetaData="kind='element' name='MaskingTransducerDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaskingTransducerDescription();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Transducer Description</em>' attribute.
	 * @see #isSetMaskingTransducerDescription()
	 * @see #unsetMaskingTransducerDescription()
	 * @see #getMaskingTransducerDescription()
	 * @generated
	 */
	void setMaskingTransducerDescription(String value);

	/**
	 * Unsets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaskingTransducerDescription()
	 * @see #getMaskingTransducerDescription()
	 * @see #setMaskingTransducerDescription(String)
	 * @generated
	 */
	void unsetMaskingTransducerDescription();

	/**
	 * Returns whether the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masking Transducer Description</em>' attribute is set.
	 * @see #unsetMaskingTransducerDescription()
	 * @see #getMaskingTransducerDescription()
	 * @see #setMaskingTransducerDescription(String)
	 * @generated
	 */
	boolean isSetMaskingTransducerDescription();

	/**
	 * Returns the value of the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amplitude of the basic tone is modulated to produce a warble sound. 
	 * Measurement conditions typically used with DifferenceLimenIntensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Amplitude Modulation</em>' attribute.
	 * @see #setStimulusAmplitudeModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusAmplitudeModulation()
	 * @model dataType="tinnitus.StimulusAmplitudeModulationType"
	 *        extendedMetaData="kind='element' name='StimulusAmplitudeModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusAmplitudeModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Amplitude Modulation</em>' attribute.
	 * @see #setMaskingAmplitudeModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingAmplitudeModulation()
	 * @model dataType="tinnitus.MaskingAmplitudeModulationType"
	 *        extendedMetaData="kind='element' name='MaskingAmplitudeModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingAmplitudeModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Amplitude Modulation</em>' attribute.
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 */
	void setMaskingAmplitudeModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Bandwidth Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD! 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Bandwidth Modulation</em>' attribute.
	 * @see #setStimulusBandwidthModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusBandwidthModulation()
	 * @model dataType="tinnitus.StimulusBandwidthModulationType"
	 *        extendedMetaData="kind='element' name='StimulusBandwidthModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusBandwidthModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusBandwidthModulation <em>Stimulus Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Bandwidth Modulation</em>' attribute.
	 * @see #getStimulusBandwidthModulation()
	 * @generated
	 */
	void setStimulusBandwidthModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Bandwidth Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD! 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Bandwidth Modulation</em>' attribute.
	 * @see #setMaskingBandwidthModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingBandwidthModulation()
	 * @model dataType="tinnitus.MaskingBandwidthModulationType"
	 *        extendedMetaData="kind='element' name='MaskingBandwidthModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingBandwidthModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingBandwidthModulation <em>Masking Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Bandwidth Modulation</em>' attribute.
	 * @see #getMaskingBandwidthModulation()
	 * @generated
	 */
	void setMaskingBandwidthModulation(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stimulus Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency of the basic tone is modulated by a lower frequency to produce a warble sound. 
	 * Measurement conditions typically used with DifferenceLimenFrequency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency Modulation</em>' attribute.
	 * @see #setStimulusFrequencyModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_StimulusFrequencyModulation()
	 * @model dataType="tinnitus.StimulusFrequencyModulationType"
	 *        extendedMetaData="kind='element' name='StimulusFrequencyModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusFrequencyModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency Modulation</em>' attribute.
	 * @see #setMaskingFrequencyModulation(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementConditionsType_MaskingFrequencyModulation()
	 * @model dataType="tinnitus.MaskingFrequencyModulationType"
	 *        extendedMetaData="kind='element' name='MaskingFrequencyModulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingFrequencyModulation();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Frequency Modulation</em>' attribute.
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 */
	void setMaskingFrequencyModulation(BigDecimal value);

} // MeasurementConditionsType
