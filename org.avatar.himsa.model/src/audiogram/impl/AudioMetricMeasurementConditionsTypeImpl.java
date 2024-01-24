/*
 */
package audiogram.impl;

import audiogram.AudioMetricMeasurementConditionsType;
import audiogram.AudiogramFactory;
import audiogram.AudiogramPackage;
import audiogram.AuxiliaryParameterType;
import audiogram.DBweightingType;
import audiogram.HearingInstrumentConditionType;
import audiogram.PresentationType;
import audiogram.SignalOutputType;
import audiogram.SignalType;
import audiogram.SpeechThresholdType;
import audiogram.TransducerCalibrationStandardType;
import audiogram.TransducerType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Metric Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusSignalType <em>Stimulus Signal Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingSignalType <em>Masking Signal Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusSignalOutput <em>Stimulus Signal Output</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingSignalOutput <em>Masking Signal Output</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingdBWeighting <em>Maskingd BWeighting</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusPresentationType <em>Stimulus Presentation Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingPresentationType <em>Masking Presentation Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusTransducerType <em>Stimulus Transducer Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingTransducerType <em>Masking Transducer Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getTransducerDescription <em>Transducer Description</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingAuxiliary <em>Masking Auxiliary</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getWordListName <em>Word List Name</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getAuxiliaryParameterDescription <em>Auxiliary Parameter Description</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getSpeechThresholdType <em>Speech Threshold Type</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusOnTime <em>Stimulus On Time</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingOnTime <em>Masking On Time</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusOffTime <em>Stimulus Off Time</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingOffTime <em>Masking Off Time</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusSiSiParameter <em>Stimulus Si Si Parameter</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingSiSiParameter <em>Masking Si Si Parameter</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusWarbleModulation <em>Stimulus Warble Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingWarbleModulation <em>Masking Warble Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusWarbleModulationSize <em>Stimulus Warble Modulation Size</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingWarbleModulationSize <em>Masking Warble Modulation Size</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusPulseModulation <em>Stimulus Pulse Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingPulseModulation <em>Masking Pulse Modulation</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getStimulusPulseCycle <em>Stimulus Pulse Cycle</em>}</li>
 *   <li>{@link audiogram.impl.AudioMetricMeasurementConditionsTypeImpl#getMaskingPulseCycle <em>Masking Pulse Cycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioMetricMeasurementConditionsTypeImpl extends MinimalEObjectImpl.Container implements AudioMetricMeasurementConditionsType {
	/**
	 * The default value of the '{@link #getStimulusSignalType() <em>Stimulus Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final SignalType STIMULUS_SIGNAL_TYPE_EDEFAULT = (SignalType)AudiogramFactory.eINSTANCE.createFromString(AudiogramPackage.eINSTANCE.getStimulusSignalTypeType(), "NoSignalApplied");

	/**
	 * The cached value of the '{@link #getStimulusSignalType() <em>Stimulus Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType stimulusSignalType = STIMULUS_SIGNAL_TYPE_EDEFAULT;

	/**
	 * This is true if the Stimulus Signal Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusSignalTypeESet;

	/**
	 * The default value of the '{@link #getMaskingSignalType() <em>Masking Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final SignalType MASKING_SIGNAL_TYPE_EDEFAULT = SignalType.NO_SIGNAL_APPLIED;

	/**
	 * The cached value of the '{@link #getMaskingSignalType() <em>Masking Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType maskingSignalType = MASKING_SIGNAL_TYPE_EDEFAULT;

	/**
	 * This is true if the Masking Signal Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingSignalTypeESet;

	/**
	 * The default value of the '{@link #getStimulusSignalOutput() <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType STIMULUS_SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.NO_SIGNAL_OUTPUT;

	/**
	 * The cached value of the '{@link #getStimulusSignalOutput() <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType stimulusSignalOutput = STIMULUS_SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Stimulus Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusSignalOutputESet;

	/**
	 * The default value of the '{@link #getMaskingSignalOutput() <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType MASKING_SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.NO_SIGNAL_OUTPUT;

	/**
	 * The cached value of the '{@link #getMaskingSignalOutput() <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType maskingSignalOutput = MASKING_SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Masking Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingSignalOutputESet;

	/**
	 * The default value of the '{@link #getStimulusdBWeighting() <em>Stimulusd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusdBWeighting()
	 * @generated
	 * @ordered
	 */
	protected static final DBweightingType STIMULUSD_BWEIGHTING_EDEFAULT = DBweightingType.NOD_BWEIGHTING;

	/**
	 * The cached value of the '{@link #getStimulusdBWeighting() <em>Stimulusd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusdBWeighting()
	 * @generated
	 * @ordered
	 */
	protected DBweightingType stimulusdBWeighting = STIMULUSD_BWEIGHTING_EDEFAULT;

	/**
	 * This is true if the Stimulusd BWeighting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusdBWeightingESet;

	/**
	 * The default value of the '{@link #getMaskingdBWeighting() <em>Maskingd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingdBWeighting()
	 * @generated
	 * @ordered
	 */
	protected static final DBweightingType MASKINGD_BWEIGHTING_EDEFAULT = DBweightingType.NOD_BWEIGHTING;

	/**
	 * The cached value of the '{@link #getMaskingdBWeighting() <em>Maskingd BWeighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingdBWeighting()
	 * @generated
	 * @ordered
	 */
	protected DBweightingType maskingdBWeighting = MASKINGD_BWEIGHTING_EDEFAULT;

	/**
	 * This is true if the Maskingd BWeighting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingdBWeightingESet;

	/**
	 * The default value of the '{@link #getStimulusPresentationType() <em>Stimulus Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPresentationType()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationType STIMULUS_PRESENTATION_TYPE_EDEFAULT = (PresentationType)AudiogramFactory.eINSTANCE.createFromString(AudiogramPackage.eINSTANCE.getStimulusPresentationTypeType(), "NoPresentationType");

	/**
	 * The cached value of the '{@link #getStimulusPresentationType() <em>Stimulus Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPresentationType()
	 * @generated
	 * @ordered
	 */
	protected PresentationType stimulusPresentationType = STIMULUS_PRESENTATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Stimulus Presentation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusPresentationTypeESet;

	/**
	 * The default value of the '{@link #getMaskingPresentationType() <em>Masking Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPresentationType()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationType MASKING_PRESENTATION_TYPE_EDEFAULT = PresentationType.NO_PRESENTATION_TYPE;

	/**
	 * The cached value of the '{@link #getMaskingPresentationType() <em>Masking Presentation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPresentationType()
	 * @generated
	 * @ordered
	 */
	protected PresentationType maskingPresentationType = MASKING_PRESENTATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Masking Presentation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingPresentationTypeESet;

	/**
	 * The default value of the '{@link #getStimulusTransducerType() <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerType()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerType STIMULUS_TRANSDUCER_TYPE_EDEFAULT = TransducerType.NO_TRANSDUCER_TYPE;

	/**
	 * The cached value of the '{@link #getStimulusTransducerType() <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerType()
	 * @generated
	 * @ordered
	 */
	protected TransducerType stimulusTransducerType = STIMULUS_TRANSDUCER_TYPE_EDEFAULT;

	/**
	 * This is true if the Stimulus Transducer Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusTransducerTypeESet;

	/**
	 * The default value of the '{@link #getMaskingTransducerType() <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerType()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerType MASKING_TRANSDUCER_TYPE_EDEFAULT = TransducerType.NO_TRANSDUCER_TYPE;

	/**
	 * The cached value of the '{@link #getMaskingTransducerType() <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerType()
	 * @generated
	 * @ordered
	 */
	protected TransducerType maskingTransducerType = MASKING_TRANSDUCER_TYPE_EDEFAULT;

	/**
	 * This is true if the Masking Transducer Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingTransducerTypeESet;

	/**
	 * The default value of the '{@link #getTransducerDescription() <em>Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSDUCER_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTransducerDescription() <em>Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected String transducerDescription = TRANSDUCER_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Transducer Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transducerDescriptionESet;

	/**
	 * The default value of the '{@link #getStimulusTransducerCalibrationStandard() <em>Stimulus Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerCalibrationStandard()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerCalibrationStandardType STIMULUS_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT = TransducerCalibrationStandardType.NO_TRANSDUCER_CALIBRATION_STANDARD;

	/**
	 * The cached value of the '{@link #getStimulusTransducerCalibrationStandard() <em>Stimulus Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerCalibrationStandard()
	 * @generated
	 * @ordered
	 */
	protected TransducerCalibrationStandardType stimulusTransducerCalibrationStandard = STIMULUS_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT;

	/**
	 * This is true if the Stimulus Transducer Calibration Standard attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusTransducerCalibrationStandardESet;

	/**
	 * The default value of the '{@link #getMaskingTransducerCalibrationStandard() <em>Masking Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerCalibrationStandard()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerCalibrationStandardType MASKING_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT = TransducerCalibrationStandardType.NO_TRANSDUCER_CALIBRATION_STANDARD;

	/**
	 * The cached value of the '{@link #getMaskingTransducerCalibrationStandard() <em>Masking Transducer Calibration Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerCalibrationStandard()
	 * @generated
	 * @ordered
	 */
	protected TransducerCalibrationStandardType maskingTransducerCalibrationStandard = MASKING_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT;

	/**
	 * This is true if the Masking Transducer Calibration Standard attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingTransducerCalibrationStandardESet;

	/**
	 * The default value of the '{@link #getHearingInstrument1Condition() <em>Hearing Instrument1 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrument1Condition()
	 * @generated
	 * @ordered
	 */
	protected static final HearingInstrumentConditionType HEARING_INSTRUMENT1_CONDITION_EDEFAULT = HearingInstrumentConditionType.NO_CONDITION;

	/**
	 * The cached value of the '{@link #getHearingInstrument1Condition() <em>Hearing Instrument1 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrument1Condition()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentConditionType hearingInstrument1Condition = HEARING_INSTRUMENT1_CONDITION_EDEFAULT;

	/**
	 * This is true if the Hearing Instrument1 Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hearingInstrument1ConditionESet;

	/**
	 * The default value of the '{@link #getHearingInstrument2Condition() <em>Hearing Instrument2 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrument2Condition()
	 * @generated
	 * @ordered
	 */
	protected static final HearingInstrumentConditionType HEARING_INSTRUMENT2_CONDITION_EDEFAULT = HearingInstrumentConditionType.NO_CONDITION;

	/**
	 * The cached value of the '{@link #getHearingInstrument2Condition() <em>Hearing Instrument2 Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrument2Condition()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentConditionType hearingInstrument2Condition = HEARING_INSTRUMENT2_CONDITION_EDEFAULT;

	/**
	 * This is true if the Hearing Instrument2 Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hearingInstrument2ConditionESet;

	/**
	 * The default value of the '{@link #getHearingInstrumentDescription() <em>Hearing Instrument Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String HEARING_INSTRUMENT_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHearingInstrumentDescription() <em>Hearing Instrument Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentDescription()
	 * @generated
	 * @ordered
	 */
	protected String hearingInstrumentDescription = HEARING_INSTRUMENT_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Hearing Instrument Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hearingInstrumentDescriptionESet;

	/**
	 * The default value of the '{@link #getStimulusAuxiliary() <em>Stimulus Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAuxiliary()
	 * @generated
	 * @ordered
	 */
	protected static final AuxiliaryParameterType STIMULUS_AUXILIARY_EDEFAULT = AuxiliaryParameterType.NO_AUXILIARY_PARAMETER;

	/**
	 * The cached value of the '{@link #getStimulusAuxiliary() <em>Stimulus Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAuxiliary()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryParameterType stimulusAuxiliary = STIMULUS_AUXILIARY_EDEFAULT;

	/**
	 * This is true if the Stimulus Auxiliary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusAuxiliaryESet;

	/**
	 * The default value of the '{@link #getMaskingAuxiliary() <em>Masking Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAuxiliary()
	 * @generated
	 * @ordered
	 */
	protected static final AuxiliaryParameterType MASKING_AUXILIARY_EDEFAULT = AuxiliaryParameterType.NO_AUXILIARY_PARAMETER;

	/**
	 * The cached value of the '{@link #getMaskingAuxiliary() <em>Masking Auxiliary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAuxiliary()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryParameterType maskingAuxiliary = MASKING_AUXILIARY_EDEFAULT;

	/**
	 * This is true if the Masking Auxiliary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingAuxiliaryESet;

	/**
	 * The default value of the '{@link #getWordListName() <em>Word List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordListName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORD_LIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordListName() <em>Word List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordListName()
	 * @generated
	 * @ordered
	 */
	protected String wordListName = WORD_LIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliaryParameterDescription() <em>Auxiliary Parameter Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryParameterDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_PARAMETER_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliaryParameterDescription() <em>Auxiliary Parameter Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryParameterDescription()
	 * @generated
	 * @ordered
	 */
	protected String auxiliaryParameterDescription = AUXILIARY_PARAMETER_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeechThresholdType() <em>Speech Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechThresholdType()
	 * @generated
	 * @ordered
	 */
	protected static final SpeechThresholdType SPEECH_THRESHOLD_TYPE_EDEFAULT = SpeechThresholdType.NOT_USED;

	/**
	 * The cached value of the '{@link #getSpeechThresholdType() <em>Speech Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechThresholdType()
	 * @generated
	 * @ordered
	 */
	protected SpeechThresholdType speechThresholdType = SPEECH_THRESHOLD_TYPE_EDEFAULT;

	/**
	 * This is true if the Speech Threshold Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speechThresholdTypeESet;

	/**
	 * The default value of the '{@link #getStimulusOnTime() <em>Stimulus On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusOnTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_ON_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusOnTime() <em>Stimulus On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusOnTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusOnTime = STIMULUS_ON_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingOnTime() <em>Masking On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingOnTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_ON_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingOnTime() <em>Masking On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingOnTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingOnTime = MASKING_ON_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusOffTime() <em>Stimulus Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusOffTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_OFF_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusOffTime() <em>Stimulus Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusOffTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusOffTime = STIMULUS_OFF_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingOffTime() <em>Masking Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingOffTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_OFF_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingOffTime() <em>Masking Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingOffTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingOffTime = MASKING_OFF_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusSiSiParameter() <em>Stimulus Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSiSiParameter()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_SI_SI_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusSiSiParameter() <em>Stimulus Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSiSiParameter()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusSiSiParameter = STIMULUS_SI_SI_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingSiSiParameter() <em>Masking Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSiSiParameter()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_SI_SI_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingSiSiParameter() <em>Masking Si Si Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSiSiParameter()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingSiSiParameter = MASKING_SI_SI_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusWarbleModulation() <em>Stimulus Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusWarbleModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STIMULUS_WARBLE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusWarbleModulation() <em>Stimulus Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusWarbleModulation()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stimulusWarbleModulation = STIMULUS_WARBLE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingWarbleModulation() <em>Masking Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingWarbleModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MASKING_WARBLE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingWarbleModulation() <em>Masking Warble Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingWarbleModulation()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maskingWarbleModulation = MASKING_WARBLE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusWarbleModulationSize() <em>Stimulus Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusWarbleModulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_WARBLE_MODULATION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusWarbleModulationSize() <em>Stimulus Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusWarbleModulationSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusWarbleModulationSize = STIMULUS_WARBLE_MODULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingWarbleModulationSize() <em>Masking Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingWarbleModulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_WARBLE_MODULATION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingWarbleModulationSize() <em>Masking Warble Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingWarbleModulationSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingWarbleModulationSize = MASKING_WARBLE_MODULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusFrequencyModulation() <em>Stimulus Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_FREQUENCY_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusFrequencyModulation() <em>Stimulus Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusFrequencyModulation = STIMULUS_FREQUENCY_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingFrequencyModulation() <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_FREQUENCY_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingFrequencyModulation() <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingFrequencyModulation = MASKING_FREQUENCY_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusAmplitudeModulation() <em>Stimulus Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_AMPLITUDE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusAmplitudeModulation() <em>Stimulus Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusAmplitudeModulation = STIMULUS_AMPLITUDE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingAmplitudeModulation() <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_AMPLITUDE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingAmplitudeModulation() <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingAmplitudeModulation = MASKING_AMPLITUDE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusPulseModulation() <em>Stimulus Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_PULSE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusPulseModulation() <em>Stimulus Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusPulseModulation = STIMULUS_PULSE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingPulseModulation() <em>Masking Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPulseModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_PULSE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingPulseModulation() <em>Masking Pulse Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPulseModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingPulseModulation = MASKING_PULSE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusPulseCycle() <em>Stimulus Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseCycle()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_PULSE_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusPulseCycle() <em>Stimulus Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseCycle()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusPulseCycle = STIMULUS_PULSE_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingPulseCycle() <em>Masking Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPulseCycle()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_PULSE_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingPulseCycle() <em>Masking Pulse Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingPulseCycle()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingPulseCycle = MASKING_PULSE_CYCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioMetricMeasurementConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType getStimulusSignalType() {
		return stimulusSignalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusSignalType(SignalType newStimulusSignalType) {
		SignalType oldStimulusSignalType = stimulusSignalType;
		stimulusSignalType = newStimulusSignalType;
		boolean oldStimulusSignalTypeESet = stimulusSignalTypeESet;
		stimulusSignalTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, oldStimulusSignalType, stimulusSignalType, !oldStimulusSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusSignalType() {
		SignalType oldStimulusSignalType = stimulusSignalType;
		boolean oldStimulusSignalTypeESet = stimulusSignalTypeESet;
		stimulusSignalType = STIMULUS_SIGNAL_TYPE_EDEFAULT;
		stimulusSignalTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, oldStimulusSignalType, STIMULUS_SIGNAL_TYPE_EDEFAULT, oldStimulusSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusSignalType() {
		return stimulusSignalTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType getMaskingSignalType() {
		return maskingSignalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingSignalType(SignalType newMaskingSignalType) {
		SignalType oldMaskingSignalType = maskingSignalType;
		maskingSignalType = newMaskingSignalType == null ? MASKING_SIGNAL_TYPE_EDEFAULT : newMaskingSignalType;
		boolean oldMaskingSignalTypeESet = maskingSignalTypeESet;
		maskingSignalTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, oldMaskingSignalType, maskingSignalType, !oldMaskingSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingSignalType() {
		SignalType oldMaskingSignalType = maskingSignalType;
		boolean oldMaskingSignalTypeESet = maskingSignalTypeESet;
		maskingSignalType = MASKING_SIGNAL_TYPE_EDEFAULT;
		maskingSignalTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, oldMaskingSignalType, MASKING_SIGNAL_TYPE_EDEFAULT, oldMaskingSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingSignalType() {
		return maskingSignalTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getStimulusSignalOutput() {
		return stimulusSignalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusSignalOutput(SignalOutputType newStimulusSignalOutput) {
		SignalOutputType oldStimulusSignalOutput = stimulusSignalOutput;
		stimulusSignalOutput = newStimulusSignalOutput == null ? STIMULUS_SIGNAL_OUTPUT_EDEFAULT : newStimulusSignalOutput;
		boolean oldStimulusSignalOutputESet = stimulusSignalOutputESet;
		stimulusSignalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT, oldStimulusSignalOutput, stimulusSignalOutput, !oldStimulusSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusSignalOutput() {
		SignalOutputType oldStimulusSignalOutput = stimulusSignalOutput;
		boolean oldStimulusSignalOutputESet = stimulusSignalOutputESet;
		stimulusSignalOutput = STIMULUS_SIGNAL_OUTPUT_EDEFAULT;
		stimulusSignalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT, oldStimulusSignalOutput, STIMULUS_SIGNAL_OUTPUT_EDEFAULT, oldStimulusSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusSignalOutput() {
		return stimulusSignalOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getMaskingSignalOutput() {
		return maskingSignalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingSignalOutput(SignalOutputType newMaskingSignalOutput) {
		SignalOutputType oldMaskingSignalOutput = maskingSignalOutput;
		maskingSignalOutput = newMaskingSignalOutput == null ? MASKING_SIGNAL_OUTPUT_EDEFAULT : newMaskingSignalOutput;
		boolean oldMaskingSignalOutputESet = maskingSignalOutputESet;
		maskingSignalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT, oldMaskingSignalOutput, maskingSignalOutput, !oldMaskingSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingSignalOutput() {
		SignalOutputType oldMaskingSignalOutput = maskingSignalOutput;
		boolean oldMaskingSignalOutputESet = maskingSignalOutputESet;
		maskingSignalOutput = MASKING_SIGNAL_OUTPUT_EDEFAULT;
		maskingSignalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT, oldMaskingSignalOutput, MASKING_SIGNAL_OUTPUT_EDEFAULT, oldMaskingSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingSignalOutput() {
		return maskingSignalOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBweightingType getStimulusdBWeighting() {
		return stimulusdBWeighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusdBWeighting(DBweightingType newStimulusdBWeighting) {
		DBweightingType oldStimulusdBWeighting = stimulusdBWeighting;
		stimulusdBWeighting = newStimulusdBWeighting == null ? STIMULUSD_BWEIGHTING_EDEFAULT : newStimulusdBWeighting;
		boolean oldStimulusdBWeightingESet = stimulusdBWeightingESet;
		stimulusdBWeightingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING, oldStimulusdBWeighting, stimulusdBWeighting, !oldStimulusdBWeightingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusdBWeighting() {
		DBweightingType oldStimulusdBWeighting = stimulusdBWeighting;
		boolean oldStimulusdBWeightingESet = stimulusdBWeightingESet;
		stimulusdBWeighting = STIMULUSD_BWEIGHTING_EDEFAULT;
		stimulusdBWeightingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING, oldStimulusdBWeighting, STIMULUSD_BWEIGHTING_EDEFAULT, oldStimulusdBWeightingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusdBWeighting() {
		return stimulusdBWeightingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBweightingType getMaskingdBWeighting() {
		return maskingdBWeighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingdBWeighting(DBweightingType newMaskingdBWeighting) {
		DBweightingType oldMaskingdBWeighting = maskingdBWeighting;
		maskingdBWeighting = newMaskingdBWeighting == null ? MASKINGD_BWEIGHTING_EDEFAULT : newMaskingdBWeighting;
		boolean oldMaskingdBWeightingESet = maskingdBWeightingESet;
		maskingdBWeightingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING, oldMaskingdBWeighting, maskingdBWeighting, !oldMaskingdBWeightingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingdBWeighting() {
		DBweightingType oldMaskingdBWeighting = maskingdBWeighting;
		boolean oldMaskingdBWeightingESet = maskingdBWeightingESet;
		maskingdBWeighting = MASKINGD_BWEIGHTING_EDEFAULT;
		maskingdBWeightingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING, oldMaskingdBWeighting, MASKINGD_BWEIGHTING_EDEFAULT, oldMaskingdBWeightingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingdBWeighting() {
		return maskingdBWeightingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationType getStimulusPresentationType() {
		return stimulusPresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusPresentationType(PresentationType newStimulusPresentationType) {
		PresentationType oldStimulusPresentationType = stimulusPresentationType;
		stimulusPresentationType = newStimulusPresentationType;
		boolean oldStimulusPresentationTypeESet = stimulusPresentationTypeESet;
		stimulusPresentationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE, oldStimulusPresentationType, stimulusPresentationType, !oldStimulusPresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusPresentationType() {
		PresentationType oldStimulusPresentationType = stimulusPresentationType;
		boolean oldStimulusPresentationTypeESet = stimulusPresentationTypeESet;
		stimulusPresentationType = STIMULUS_PRESENTATION_TYPE_EDEFAULT;
		stimulusPresentationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE, oldStimulusPresentationType, STIMULUS_PRESENTATION_TYPE_EDEFAULT, oldStimulusPresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusPresentationType() {
		return stimulusPresentationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationType getMaskingPresentationType() {
		return maskingPresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingPresentationType(PresentationType newMaskingPresentationType) {
		PresentationType oldMaskingPresentationType = maskingPresentationType;
		maskingPresentationType = newMaskingPresentationType == null ? MASKING_PRESENTATION_TYPE_EDEFAULT : newMaskingPresentationType;
		boolean oldMaskingPresentationTypeESet = maskingPresentationTypeESet;
		maskingPresentationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE, oldMaskingPresentationType, maskingPresentationType, !oldMaskingPresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingPresentationType() {
		PresentationType oldMaskingPresentationType = maskingPresentationType;
		boolean oldMaskingPresentationTypeESet = maskingPresentationTypeESet;
		maskingPresentationType = MASKING_PRESENTATION_TYPE_EDEFAULT;
		maskingPresentationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE, oldMaskingPresentationType, MASKING_PRESENTATION_TYPE_EDEFAULT, oldMaskingPresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingPresentationType() {
		return maskingPresentationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerType getStimulusTransducerType() {
		return stimulusTransducerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusTransducerType(TransducerType newStimulusTransducerType) {
		TransducerType oldStimulusTransducerType = stimulusTransducerType;
		stimulusTransducerType = newStimulusTransducerType == null ? STIMULUS_TRANSDUCER_TYPE_EDEFAULT : newStimulusTransducerType;
		boolean oldStimulusTransducerTypeESet = stimulusTransducerTypeESet;
		stimulusTransducerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE, oldStimulusTransducerType, stimulusTransducerType, !oldStimulusTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusTransducerType() {
		TransducerType oldStimulusTransducerType = stimulusTransducerType;
		boolean oldStimulusTransducerTypeESet = stimulusTransducerTypeESet;
		stimulusTransducerType = STIMULUS_TRANSDUCER_TYPE_EDEFAULT;
		stimulusTransducerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE, oldStimulusTransducerType, STIMULUS_TRANSDUCER_TYPE_EDEFAULT, oldStimulusTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusTransducerType() {
		return stimulusTransducerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerType getMaskingTransducerType() {
		return maskingTransducerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingTransducerType(TransducerType newMaskingTransducerType) {
		TransducerType oldMaskingTransducerType = maskingTransducerType;
		maskingTransducerType = newMaskingTransducerType == null ? MASKING_TRANSDUCER_TYPE_EDEFAULT : newMaskingTransducerType;
		boolean oldMaskingTransducerTypeESet = maskingTransducerTypeESet;
		maskingTransducerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE, oldMaskingTransducerType, maskingTransducerType, !oldMaskingTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingTransducerType() {
		TransducerType oldMaskingTransducerType = maskingTransducerType;
		boolean oldMaskingTransducerTypeESet = maskingTransducerTypeESet;
		maskingTransducerType = MASKING_TRANSDUCER_TYPE_EDEFAULT;
		maskingTransducerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE, oldMaskingTransducerType, MASKING_TRANSDUCER_TYPE_EDEFAULT, oldMaskingTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingTransducerType() {
		return maskingTransducerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransducerDescription() {
		return transducerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransducerDescription(String newTransducerDescription) {
		String oldTransducerDescription = transducerDescription;
		transducerDescription = newTransducerDescription;
		boolean oldTransducerDescriptionESet = transducerDescriptionESet;
		transducerDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION, oldTransducerDescription, transducerDescription, !oldTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransducerDescription() {
		String oldTransducerDescription = transducerDescription;
		boolean oldTransducerDescriptionESet = transducerDescriptionESet;
		transducerDescription = TRANSDUCER_DESCRIPTION_EDEFAULT;
		transducerDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION, oldTransducerDescription, TRANSDUCER_DESCRIPTION_EDEFAULT, oldTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransducerDescription() {
		return transducerDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerCalibrationStandardType getStimulusTransducerCalibrationStandard() {
		return stimulusTransducerCalibrationStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusTransducerCalibrationStandard(TransducerCalibrationStandardType newStimulusTransducerCalibrationStandard) {
		TransducerCalibrationStandardType oldStimulusTransducerCalibrationStandard = stimulusTransducerCalibrationStandard;
		stimulusTransducerCalibrationStandard = newStimulusTransducerCalibrationStandard == null ? STIMULUS_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT : newStimulusTransducerCalibrationStandard;
		boolean oldStimulusTransducerCalibrationStandardESet = stimulusTransducerCalibrationStandardESet;
		stimulusTransducerCalibrationStandardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD, oldStimulusTransducerCalibrationStandard, stimulusTransducerCalibrationStandard, !oldStimulusTransducerCalibrationStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusTransducerCalibrationStandard() {
		TransducerCalibrationStandardType oldStimulusTransducerCalibrationStandard = stimulusTransducerCalibrationStandard;
		boolean oldStimulusTransducerCalibrationStandardESet = stimulusTransducerCalibrationStandardESet;
		stimulusTransducerCalibrationStandard = STIMULUS_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT;
		stimulusTransducerCalibrationStandardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD, oldStimulusTransducerCalibrationStandard, STIMULUS_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT, oldStimulusTransducerCalibrationStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusTransducerCalibrationStandard() {
		return stimulusTransducerCalibrationStandardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerCalibrationStandardType getMaskingTransducerCalibrationStandard() {
		return maskingTransducerCalibrationStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingTransducerCalibrationStandard(TransducerCalibrationStandardType newMaskingTransducerCalibrationStandard) {
		TransducerCalibrationStandardType oldMaskingTransducerCalibrationStandard = maskingTransducerCalibrationStandard;
		maskingTransducerCalibrationStandard = newMaskingTransducerCalibrationStandard == null ? MASKING_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT : newMaskingTransducerCalibrationStandard;
		boolean oldMaskingTransducerCalibrationStandardESet = maskingTransducerCalibrationStandardESet;
		maskingTransducerCalibrationStandardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD, oldMaskingTransducerCalibrationStandard, maskingTransducerCalibrationStandard, !oldMaskingTransducerCalibrationStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingTransducerCalibrationStandard() {
		TransducerCalibrationStandardType oldMaskingTransducerCalibrationStandard = maskingTransducerCalibrationStandard;
		boolean oldMaskingTransducerCalibrationStandardESet = maskingTransducerCalibrationStandardESet;
		maskingTransducerCalibrationStandard = MASKING_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT;
		maskingTransducerCalibrationStandardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD, oldMaskingTransducerCalibrationStandard, MASKING_TRANSDUCER_CALIBRATION_STANDARD_EDEFAULT, oldMaskingTransducerCalibrationStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingTransducerCalibrationStandard() {
		return maskingTransducerCalibrationStandardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentConditionType getHearingInstrument1Condition() {
		return hearingInstrument1Condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHearingInstrument1Condition(HearingInstrumentConditionType newHearingInstrument1Condition) {
		HearingInstrumentConditionType oldHearingInstrument1Condition = hearingInstrument1Condition;
		hearingInstrument1Condition = newHearingInstrument1Condition == null ? HEARING_INSTRUMENT1_CONDITION_EDEFAULT : newHearingInstrument1Condition;
		boolean oldHearingInstrument1ConditionESet = hearingInstrument1ConditionESet;
		hearingInstrument1ConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION, oldHearingInstrument1Condition, hearingInstrument1Condition, !oldHearingInstrument1ConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHearingInstrument1Condition() {
		HearingInstrumentConditionType oldHearingInstrument1Condition = hearingInstrument1Condition;
		boolean oldHearingInstrument1ConditionESet = hearingInstrument1ConditionESet;
		hearingInstrument1Condition = HEARING_INSTRUMENT1_CONDITION_EDEFAULT;
		hearingInstrument1ConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION, oldHearingInstrument1Condition, HEARING_INSTRUMENT1_CONDITION_EDEFAULT, oldHearingInstrument1ConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHearingInstrument1Condition() {
		return hearingInstrument1ConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentConditionType getHearingInstrument2Condition() {
		return hearingInstrument2Condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHearingInstrument2Condition(HearingInstrumentConditionType newHearingInstrument2Condition) {
		HearingInstrumentConditionType oldHearingInstrument2Condition = hearingInstrument2Condition;
		hearingInstrument2Condition = newHearingInstrument2Condition == null ? HEARING_INSTRUMENT2_CONDITION_EDEFAULT : newHearingInstrument2Condition;
		boolean oldHearingInstrument2ConditionESet = hearingInstrument2ConditionESet;
		hearingInstrument2ConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION, oldHearingInstrument2Condition, hearingInstrument2Condition, !oldHearingInstrument2ConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHearingInstrument2Condition() {
		HearingInstrumentConditionType oldHearingInstrument2Condition = hearingInstrument2Condition;
		boolean oldHearingInstrument2ConditionESet = hearingInstrument2ConditionESet;
		hearingInstrument2Condition = HEARING_INSTRUMENT2_CONDITION_EDEFAULT;
		hearingInstrument2ConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION, oldHearingInstrument2Condition, HEARING_INSTRUMENT2_CONDITION_EDEFAULT, oldHearingInstrument2ConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHearingInstrument2Condition() {
		return hearingInstrument2ConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHearingInstrumentDescription() {
		return hearingInstrumentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHearingInstrumentDescription(String newHearingInstrumentDescription) {
		String oldHearingInstrumentDescription = hearingInstrumentDescription;
		hearingInstrumentDescription = newHearingInstrumentDescription;
		boolean oldHearingInstrumentDescriptionESet = hearingInstrumentDescriptionESet;
		hearingInstrumentDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION, oldHearingInstrumentDescription, hearingInstrumentDescription, !oldHearingInstrumentDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHearingInstrumentDescription() {
		String oldHearingInstrumentDescription = hearingInstrumentDescription;
		boolean oldHearingInstrumentDescriptionESet = hearingInstrumentDescriptionESet;
		hearingInstrumentDescription = HEARING_INSTRUMENT_DESCRIPTION_EDEFAULT;
		hearingInstrumentDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION, oldHearingInstrumentDescription, HEARING_INSTRUMENT_DESCRIPTION_EDEFAULT, oldHearingInstrumentDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHearingInstrumentDescription() {
		return hearingInstrumentDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuxiliaryParameterType getStimulusAuxiliary() {
		return stimulusAuxiliary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusAuxiliary(AuxiliaryParameterType newStimulusAuxiliary) {
		AuxiliaryParameterType oldStimulusAuxiliary = stimulusAuxiliary;
		stimulusAuxiliary = newStimulusAuxiliary == null ? STIMULUS_AUXILIARY_EDEFAULT : newStimulusAuxiliary;
		boolean oldStimulusAuxiliaryESet = stimulusAuxiliaryESet;
		stimulusAuxiliaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY, oldStimulusAuxiliary, stimulusAuxiliary, !oldStimulusAuxiliaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusAuxiliary() {
		AuxiliaryParameterType oldStimulusAuxiliary = stimulusAuxiliary;
		boolean oldStimulusAuxiliaryESet = stimulusAuxiliaryESet;
		stimulusAuxiliary = STIMULUS_AUXILIARY_EDEFAULT;
		stimulusAuxiliaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY, oldStimulusAuxiliary, STIMULUS_AUXILIARY_EDEFAULT, oldStimulusAuxiliaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusAuxiliary() {
		return stimulusAuxiliaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuxiliaryParameterType getMaskingAuxiliary() {
		return maskingAuxiliary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingAuxiliary(AuxiliaryParameterType newMaskingAuxiliary) {
		AuxiliaryParameterType oldMaskingAuxiliary = maskingAuxiliary;
		maskingAuxiliary = newMaskingAuxiliary == null ? MASKING_AUXILIARY_EDEFAULT : newMaskingAuxiliary;
		boolean oldMaskingAuxiliaryESet = maskingAuxiliaryESet;
		maskingAuxiliaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY, oldMaskingAuxiliary, maskingAuxiliary, !oldMaskingAuxiliaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingAuxiliary() {
		AuxiliaryParameterType oldMaskingAuxiliary = maskingAuxiliary;
		boolean oldMaskingAuxiliaryESet = maskingAuxiliaryESet;
		maskingAuxiliary = MASKING_AUXILIARY_EDEFAULT;
		maskingAuxiliaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY, oldMaskingAuxiliary, MASKING_AUXILIARY_EDEFAULT, oldMaskingAuxiliaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingAuxiliary() {
		return maskingAuxiliaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWordListName() {
		return wordListName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWordListName(String newWordListName) {
		String oldWordListName = wordListName;
		wordListName = newWordListName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME, oldWordListName, wordListName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuxiliaryParameterDescription() {
		return auxiliaryParameterDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuxiliaryParameterDescription(String newAuxiliaryParameterDescription) {
		String oldAuxiliaryParameterDescription = auxiliaryParameterDescription;
		auxiliaryParameterDescription = newAuxiliaryParameterDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION, oldAuxiliaryParameterDescription, auxiliaryParameterDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechThresholdType getSpeechThresholdType() {
		return speechThresholdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeechThresholdType(SpeechThresholdType newSpeechThresholdType) {
		SpeechThresholdType oldSpeechThresholdType = speechThresholdType;
		speechThresholdType = newSpeechThresholdType == null ? SPEECH_THRESHOLD_TYPE_EDEFAULT : newSpeechThresholdType;
		boolean oldSpeechThresholdTypeESet = speechThresholdTypeESet;
		speechThresholdTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE, oldSpeechThresholdType, speechThresholdType, !oldSpeechThresholdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpeechThresholdType() {
		SpeechThresholdType oldSpeechThresholdType = speechThresholdType;
		boolean oldSpeechThresholdTypeESet = speechThresholdTypeESet;
		speechThresholdType = SPEECH_THRESHOLD_TYPE_EDEFAULT;
		speechThresholdTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE, oldSpeechThresholdType, SPEECH_THRESHOLD_TYPE_EDEFAULT, oldSpeechThresholdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpeechThresholdType() {
		return speechThresholdTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusOnTime() {
		return stimulusOnTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusOnTime(BigDecimal newStimulusOnTime) {
		BigDecimal oldStimulusOnTime = stimulusOnTime;
		stimulusOnTime = newStimulusOnTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME, oldStimulusOnTime, stimulusOnTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingOnTime() {
		return maskingOnTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingOnTime(BigDecimal newMaskingOnTime) {
		BigDecimal oldMaskingOnTime = maskingOnTime;
		maskingOnTime = newMaskingOnTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME, oldMaskingOnTime, maskingOnTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusOffTime() {
		return stimulusOffTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusOffTime(BigDecimal newStimulusOffTime) {
		BigDecimal oldStimulusOffTime = stimulusOffTime;
		stimulusOffTime = newStimulusOffTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME, oldStimulusOffTime, stimulusOffTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingOffTime() {
		return maskingOffTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingOffTime(BigDecimal newMaskingOffTime) {
		BigDecimal oldMaskingOffTime = maskingOffTime;
		maskingOffTime = newMaskingOffTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME, oldMaskingOffTime, maskingOffTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusSiSiParameter() {
		return stimulusSiSiParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusSiSiParameter(BigDecimal newStimulusSiSiParameter) {
		BigDecimal oldStimulusSiSiParameter = stimulusSiSiParameter;
		stimulusSiSiParameter = newStimulusSiSiParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER, oldStimulusSiSiParameter, stimulusSiSiParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingSiSiParameter() {
		return maskingSiSiParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingSiSiParameter(BigDecimal newMaskingSiSiParameter) {
		BigDecimal oldMaskingSiSiParameter = maskingSiSiParameter;
		maskingSiSiParameter = newMaskingSiSiParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER, oldMaskingSiSiParameter, maskingSiSiParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStimulusWarbleModulation() {
		return stimulusWarbleModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusWarbleModulation(BigInteger newStimulusWarbleModulation) {
		BigInteger oldStimulusWarbleModulation = stimulusWarbleModulation;
		stimulusWarbleModulation = newStimulusWarbleModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION, oldStimulusWarbleModulation, stimulusWarbleModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaskingWarbleModulation() {
		return maskingWarbleModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingWarbleModulation(BigInteger newMaskingWarbleModulation) {
		BigInteger oldMaskingWarbleModulation = maskingWarbleModulation;
		maskingWarbleModulation = newMaskingWarbleModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION, oldMaskingWarbleModulation, maskingWarbleModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusWarbleModulationSize() {
		return stimulusWarbleModulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusWarbleModulationSize(BigDecimal newStimulusWarbleModulationSize) {
		BigDecimal oldStimulusWarbleModulationSize = stimulusWarbleModulationSize;
		stimulusWarbleModulationSize = newStimulusWarbleModulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE, oldStimulusWarbleModulationSize, stimulusWarbleModulationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingWarbleModulationSize() {
		return maskingWarbleModulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingWarbleModulationSize(BigDecimal newMaskingWarbleModulationSize) {
		BigDecimal oldMaskingWarbleModulationSize = maskingWarbleModulationSize;
		maskingWarbleModulationSize = newMaskingWarbleModulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE, oldMaskingWarbleModulationSize, maskingWarbleModulationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusFrequencyModulation() {
		return stimulusFrequencyModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusFrequencyModulation(BigDecimal newStimulusFrequencyModulation) {
		BigDecimal oldStimulusFrequencyModulation = stimulusFrequencyModulation;
		stimulusFrequencyModulation = newStimulusFrequencyModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION, oldStimulusFrequencyModulation, stimulusFrequencyModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingFrequencyModulation() {
		return maskingFrequencyModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingFrequencyModulation(BigDecimal newMaskingFrequencyModulation) {
		BigDecimal oldMaskingFrequencyModulation = maskingFrequencyModulation;
		maskingFrequencyModulation = newMaskingFrequencyModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION, oldMaskingFrequencyModulation, maskingFrequencyModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusAmplitudeModulation() {
		return stimulusAmplitudeModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusAmplitudeModulation(BigDecimal newStimulusAmplitudeModulation) {
		BigDecimal oldStimulusAmplitudeModulation = stimulusAmplitudeModulation;
		stimulusAmplitudeModulation = newStimulusAmplitudeModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION, oldStimulusAmplitudeModulation, stimulusAmplitudeModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingAmplitudeModulation() {
		return maskingAmplitudeModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingAmplitudeModulation(BigDecimal newMaskingAmplitudeModulation) {
		BigDecimal oldMaskingAmplitudeModulation = maskingAmplitudeModulation;
		maskingAmplitudeModulation = newMaskingAmplitudeModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION, oldMaskingAmplitudeModulation, maskingAmplitudeModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusPulseModulation() {
		return stimulusPulseModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusPulseModulation(BigDecimal newStimulusPulseModulation) {
		BigDecimal oldStimulusPulseModulation = stimulusPulseModulation;
		stimulusPulseModulation = newStimulusPulseModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION, oldStimulusPulseModulation, stimulusPulseModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingPulseModulation() {
		return maskingPulseModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingPulseModulation(BigDecimal newMaskingPulseModulation) {
		BigDecimal oldMaskingPulseModulation = maskingPulseModulation;
		maskingPulseModulation = newMaskingPulseModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION, oldMaskingPulseModulation, maskingPulseModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusPulseCycle() {
		return stimulusPulseCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusPulseCycle(BigDecimal newStimulusPulseCycle) {
		BigDecimal oldStimulusPulseCycle = stimulusPulseCycle;
		stimulusPulseCycle = newStimulusPulseCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE, oldStimulusPulseCycle, stimulusPulseCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingPulseCycle() {
		return maskingPulseCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingPulseCycle(BigDecimal newMaskingPulseCycle) {
		BigDecimal oldMaskingPulseCycle = maskingPulseCycle;
		maskingPulseCycle = newMaskingPulseCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE, oldMaskingPulseCycle, maskingPulseCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				return getStimulusSignalType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				return getMaskingSignalType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				return getStimulusSignalOutput();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				return getMaskingSignalOutput();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING:
				return getStimulusdBWeighting();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING:
				return getMaskingdBWeighting();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE:
				return getStimulusPresentationType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE:
				return getMaskingPresentationType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				return getStimulusTransducerType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				return getMaskingTransducerType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION:
				return getTransducerDescription();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD:
				return getStimulusTransducerCalibrationStandard();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD:
				return getMaskingTransducerCalibrationStandard();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION:
				return getHearingInstrument1Condition();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION:
				return getHearingInstrument2Condition();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION:
				return getHearingInstrumentDescription();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY:
				return getStimulusAuxiliary();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY:
				return getMaskingAuxiliary();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME:
				return getWordListName();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION:
				return getAuxiliaryParameterDescription();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE:
				return getSpeechThresholdType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME:
				return getStimulusOnTime();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME:
				return getMaskingOnTime();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME:
				return getStimulusOffTime();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME:
				return getMaskingOffTime();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER:
				return getStimulusSiSiParameter();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER:
				return getMaskingSiSiParameter();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION:
				return getStimulusWarbleModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION:
				return getMaskingWarbleModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE:
				return getStimulusWarbleModulationSize();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE:
				return getMaskingWarbleModulationSize();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				return getStimulusFrequencyModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				return getMaskingFrequencyModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				return getStimulusAmplitudeModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				return getMaskingAmplitudeModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION:
				return getStimulusPulseModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION:
				return getMaskingPulseModulation();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE:
				return getStimulusPulseCycle();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE:
				return getMaskingPulseCycle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				setStimulusSignalType((SignalType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				setMaskingSignalType((SignalType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				setStimulusSignalOutput((SignalOutputType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				setMaskingSignalOutput((SignalOutputType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING:
				setStimulusdBWeighting((DBweightingType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING:
				setMaskingdBWeighting((DBweightingType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE:
				setStimulusPresentationType((PresentationType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE:
				setMaskingPresentationType((PresentationType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				setStimulusTransducerType((TransducerType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				setMaskingTransducerType((TransducerType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION:
				setTransducerDescription((String)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD:
				setStimulusTransducerCalibrationStandard((TransducerCalibrationStandardType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD:
				setMaskingTransducerCalibrationStandard((TransducerCalibrationStandardType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION:
				setHearingInstrument1Condition((HearingInstrumentConditionType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION:
				setHearingInstrument2Condition((HearingInstrumentConditionType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION:
				setHearingInstrumentDescription((String)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY:
				setStimulusAuxiliary((AuxiliaryParameterType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY:
				setMaskingAuxiliary((AuxiliaryParameterType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME:
				setWordListName((String)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION:
				setAuxiliaryParameterDescription((String)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE:
				setSpeechThresholdType((SpeechThresholdType)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME:
				setStimulusOnTime((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME:
				setMaskingOnTime((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME:
				setStimulusOffTime((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME:
				setMaskingOffTime((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER:
				setStimulusSiSiParameter((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER:
				setMaskingSiSiParameter((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION:
				setStimulusWarbleModulation((BigInteger)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION:
				setMaskingWarbleModulation((BigInteger)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE:
				setStimulusWarbleModulationSize((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE:
				setMaskingWarbleModulationSize((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				setStimulusFrequencyModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				setMaskingFrequencyModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				setStimulusAmplitudeModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				setMaskingAmplitudeModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION:
				setStimulusPulseModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION:
				setMaskingPulseModulation((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE:
				setStimulusPulseCycle((BigDecimal)newValue);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE:
				setMaskingPulseCycle((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				unsetStimulusSignalType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				unsetMaskingSignalType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				unsetStimulusSignalOutput();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				unsetMaskingSignalOutput();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING:
				unsetStimulusdBWeighting();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING:
				unsetMaskingdBWeighting();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE:
				unsetStimulusPresentationType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE:
				unsetMaskingPresentationType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				unsetStimulusTransducerType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				unsetMaskingTransducerType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION:
				unsetTransducerDescription();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD:
				unsetStimulusTransducerCalibrationStandard();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD:
				unsetMaskingTransducerCalibrationStandard();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION:
				unsetHearingInstrument1Condition();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION:
				unsetHearingInstrument2Condition();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION:
				unsetHearingInstrumentDescription();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY:
				unsetStimulusAuxiliary();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY:
				unsetMaskingAuxiliary();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME:
				setWordListName(WORD_LIST_NAME_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION:
				setAuxiliaryParameterDescription(AUXILIARY_PARAMETER_DESCRIPTION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE:
				unsetSpeechThresholdType();
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME:
				setStimulusOnTime(STIMULUS_ON_TIME_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME:
				setMaskingOnTime(MASKING_ON_TIME_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME:
				setStimulusOffTime(STIMULUS_OFF_TIME_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME:
				setMaskingOffTime(MASKING_OFF_TIME_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER:
				setStimulusSiSiParameter(STIMULUS_SI_SI_PARAMETER_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER:
				setMaskingSiSiParameter(MASKING_SI_SI_PARAMETER_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION:
				setStimulusWarbleModulation(STIMULUS_WARBLE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION:
				setMaskingWarbleModulation(MASKING_WARBLE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE:
				setStimulusWarbleModulationSize(STIMULUS_WARBLE_MODULATION_SIZE_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE:
				setMaskingWarbleModulationSize(MASKING_WARBLE_MODULATION_SIZE_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				setStimulusFrequencyModulation(STIMULUS_FREQUENCY_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				setMaskingFrequencyModulation(MASKING_FREQUENCY_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				setStimulusAmplitudeModulation(STIMULUS_AMPLITUDE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				setMaskingAmplitudeModulation(MASKING_AMPLITUDE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION:
				setStimulusPulseModulation(STIMULUS_PULSE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION:
				setMaskingPulseModulation(MASKING_PULSE_MODULATION_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE:
				setStimulusPulseCycle(STIMULUS_PULSE_CYCLE_EDEFAULT);
				return;
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE:
				setMaskingPulseCycle(MASKING_PULSE_CYCLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				return isSetStimulusSignalType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				return isSetMaskingSignalType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				return isSetStimulusSignalOutput();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				return isSetMaskingSignalOutput();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING:
				return isSetStimulusdBWeighting();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING:
				return isSetMaskingdBWeighting();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE:
				return isSetStimulusPresentationType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE:
				return isSetMaskingPresentationType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				return isSetStimulusTransducerType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				return isSetMaskingTransducerType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION:
				return isSetTransducerDescription();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD:
				return isSetStimulusTransducerCalibrationStandard();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD:
				return isSetMaskingTransducerCalibrationStandard();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION:
				return isSetHearingInstrument1Condition();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION:
				return isSetHearingInstrument2Condition();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION:
				return isSetHearingInstrumentDescription();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY:
				return isSetStimulusAuxiliary();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY:
				return isSetMaskingAuxiliary();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME:
				return WORD_LIST_NAME_EDEFAULT == null ? wordListName != null : !WORD_LIST_NAME_EDEFAULT.equals(wordListName);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION:
				return AUXILIARY_PARAMETER_DESCRIPTION_EDEFAULT == null ? auxiliaryParameterDescription != null : !AUXILIARY_PARAMETER_DESCRIPTION_EDEFAULT.equals(auxiliaryParameterDescription);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE:
				return isSetSpeechThresholdType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME:
				return STIMULUS_ON_TIME_EDEFAULT == null ? stimulusOnTime != null : !STIMULUS_ON_TIME_EDEFAULT.equals(stimulusOnTime);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME:
				return MASKING_ON_TIME_EDEFAULT == null ? maskingOnTime != null : !MASKING_ON_TIME_EDEFAULT.equals(maskingOnTime);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME:
				return STIMULUS_OFF_TIME_EDEFAULT == null ? stimulusOffTime != null : !STIMULUS_OFF_TIME_EDEFAULT.equals(stimulusOffTime);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME:
				return MASKING_OFF_TIME_EDEFAULT == null ? maskingOffTime != null : !MASKING_OFF_TIME_EDEFAULT.equals(maskingOffTime);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER:
				return STIMULUS_SI_SI_PARAMETER_EDEFAULT == null ? stimulusSiSiParameter != null : !STIMULUS_SI_SI_PARAMETER_EDEFAULT.equals(stimulusSiSiParameter);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER:
				return MASKING_SI_SI_PARAMETER_EDEFAULT == null ? maskingSiSiParameter != null : !MASKING_SI_SI_PARAMETER_EDEFAULT.equals(maskingSiSiParameter);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION:
				return STIMULUS_WARBLE_MODULATION_EDEFAULT == null ? stimulusWarbleModulation != null : !STIMULUS_WARBLE_MODULATION_EDEFAULT.equals(stimulusWarbleModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION:
				return MASKING_WARBLE_MODULATION_EDEFAULT == null ? maskingWarbleModulation != null : !MASKING_WARBLE_MODULATION_EDEFAULT.equals(maskingWarbleModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE:
				return STIMULUS_WARBLE_MODULATION_SIZE_EDEFAULT == null ? stimulusWarbleModulationSize != null : !STIMULUS_WARBLE_MODULATION_SIZE_EDEFAULT.equals(stimulusWarbleModulationSize);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE:
				return MASKING_WARBLE_MODULATION_SIZE_EDEFAULT == null ? maskingWarbleModulationSize != null : !MASKING_WARBLE_MODULATION_SIZE_EDEFAULT.equals(maskingWarbleModulationSize);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				return STIMULUS_FREQUENCY_MODULATION_EDEFAULT == null ? stimulusFrequencyModulation != null : !STIMULUS_FREQUENCY_MODULATION_EDEFAULT.equals(stimulusFrequencyModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				return MASKING_FREQUENCY_MODULATION_EDEFAULT == null ? maskingFrequencyModulation != null : !MASKING_FREQUENCY_MODULATION_EDEFAULT.equals(maskingFrequencyModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				return STIMULUS_AMPLITUDE_MODULATION_EDEFAULT == null ? stimulusAmplitudeModulation != null : !STIMULUS_AMPLITUDE_MODULATION_EDEFAULT.equals(stimulusAmplitudeModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				return MASKING_AMPLITUDE_MODULATION_EDEFAULT == null ? maskingAmplitudeModulation != null : !MASKING_AMPLITUDE_MODULATION_EDEFAULT.equals(maskingAmplitudeModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION:
				return STIMULUS_PULSE_MODULATION_EDEFAULT == null ? stimulusPulseModulation != null : !STIMULUS_PULSE_MODULATION_EDEFAULT.equals(stimulusPulseModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION:
				return MASKING_PULSE_MODULATION_EDEFAULT == null ? maskingPulseModulation != null : !MASKING_PULSE_MODULATION_EDEFAULT.equals(maskingPulseModulation);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE:
				return STIMULUS_PULSE_CYCLE_EDEFAULT == null ? stimulusPulseCycle != null : !STIMULUS_PULSE_CYCLE_EDEFAULT.equals(stimulusPulseCycle);
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE:
				return MASKING_PULSE_CYCLE_EDEFAULT == null ? maskingPulseCycle != null : !MASKING_PULSE_CYCLE_EDEFAULT.equals(maskingPulseCycle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stimulusSignalType: ");
		if (stimulusSignalTypeESet) result.append(stimulusSignalType); else result.append("<unset>");
		result.append(", maskingSignalType: ");
		if (maskingSignalTypeESet) result.append(maskingSignalType); else result.append("<unset>");
		result.append(", stimulusSignalOutput: ");
		if (stimulusSignalOutputESet) result.append(stimulusSignalOutput); else result.append("<unset>");
		result.append(", maskingSignalOutput: ");
		if (maskingSignalOutputESet) result.append(maskingSignalOutput); else result.append("<unset>");
		result.append(", stimulusdBWeighting: ");
		if (stimulusdBWeightingESet) result.append(stimulusdBWeighting); else result.append("<unset>");
		result.append(", maskingdBWeighting: ");
		if (maskingdBWeightingESet) result.append(maskingdBWeighting); else result.append("<unset>");
		result.append(", stimulusPresentationType: ");
		if (stimulusPresentationTypeESet) result.append(stimulusPresentationType); else result.append("<unset>");
		result.append(", maskingPresentationType: ");
		if (maskingPresentationTypeESet) result.append(maskingPresentationType); else result.append("<unset>");
		result.append(", stimulusTransducerType: ");
		if (stimulusTransducerTypeESet) result.append(stimulusTransducerType); else result.append("<unset>");
		result.append(", maskingTransducerType: ");
		if (maskingTransducerTypeESet) result.append(maskingTransducerType); else result.append("<unset>");
		result.append(", transducerDescription: ");
		if (transducerDescriptionESet) result.append(transducerDescription); else result.append("<unset>");
		result.append(", stimulusTransducerCalibrationStandard: ");
		if (stimulusTransducerCalibrationStandardESet) result.append(stimulusTransducerCalibrationStandard); else result.append("<unset>");
		result.append(", maskingTransducerCalibrationStandard: ");
		if (maskingTransducerCalibrationStandardESet) result.append(maskingTransducerCalibrationStandard); else result.append("<unset>");
		result.append(", hearingInstrument1Condition: ");
		if (hearingInstrument1ConditionESet) result.append(hearingInstrument1Condition); else result.append("<unset>");
		result.append(", hearingInstrument2Condition: ");
		if (hearingInstrument2ConditionESet) result.append(hearingInstrument2Condition); else result.append("<unset>");
		result.append(", hearingInstrumentDescription: ");
		if (hearingInstrumentDescriptionESet) result.append(hearingInstrumentDescription); else result.append("<unset>");
		result.append(", stimulusAuxiliary: ");
		if (stimulusAuxiliaryESet) result.append(stimulusAuxiliary); else result.append("<unset>");
		result.append(", maskingAuxiliary: ");
		if (maskingAuxiliaryESet) result.append(maskingAuxiliary); else result.append("<unset>");
		result.append(", wordListName: ");
		result.append(wordListName);
		result.append(", auxiliaryParameterDescription: ");
		result.append(auxiliaryParameterDescription);
		result.append(", speechThresholdType: ");
		if (speechThresholdTypeESet) result.append(speechThresholdType); else result.append("<unset>");
		result.append(", stimulusOnTime: ");
		result.append(stimulusOnTime);
		result.append(", maskingOnTime: ");
		result.append(maskingOnTime);
		result.append(", stimulusOffTime: ");
		result.append(stimulusOffTime);
		result.append(", maskingOffTime: ");
		result.append(maskingOffTime);
		result.append(", stimulusSiSiParameter: ");
		result.append(stimulusSiSiParameter);
		result.append(", maskingSiSiParameter: ");
		result.append(maskingSiSiParameter);
		result.append(", stimulusWarbleModulation: ");
		result.append(stimulusWarbleModulation);
		result.append(", maskingWarbleModulation: ");
		result.append(maskingWarbleModulation);
		result.append(", stimulusWarbleModulationSize: ");
		result.append(stimulusWarbleModulationSize);
		result.append(", maskingWarbleModulationSize: ");
		result.append(maskingWarbleModulationSize);
		result.append(", stimulusFrequencyModulation: ");
		result.append(stimulusFrequencyModulation);
		result.append(", maskingFrequencyModulation: ");
		result.append(maskingFrequencyModulation);
		result.append(", stimulusAmplitudeModulation: ");
		result.append(stimulusAmplitudeModulation);
		result.append(", maskingAmplitudeModulation: ");
		result.append(maskingAmplitudeModulation);
		result.append(", stimulusPulseModulation: ");
		result.append(stimulusPulseModulation);
		result.append(", maskingPulseModulation: ");
		result.append(maskingPulseModulation);
		result.append(", stimulusPulseCycle: ");
		result.append(stimulusPulseCycle);
		result.append(", maskingPulseCycle: ");
		result.append(maskingPulseCycle);
		result.append(')');
		return result.toString();
	}

} //AudioMetricMeasurementConditionsTypeImpl
