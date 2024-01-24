/*
 */
package com.himsa.measurement.audiogram;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.audiogram.AudiogramFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AudiogramPackage.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/audiogram.ecore", ecoreSourceLocations="/model/audiogram.ecore")
public interface AudiogramPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "audiogram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/Audiogram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "audiogram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AudiogramPackage eINSTANCE = com.himsa.measurement.audiogram.impl.AudiogramPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl <em>Alternate Binaural Loudness Balance Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Alternate Binaural Loudness Balance Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Alternate Binaural Loudness Balance Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alternate Binaural Loudness Balance Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.AudioMetricMeasurementConditionsTypeImpl <em>Audio Metric Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.AudioMetricMeasurementConditionsTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Stimulus Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Masking Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Stimulus Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Masking Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Stimulusd BWeighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING = 4;

	/**
	 * The feature id for the '<em><b>Maskingd BWeighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING = 5;

	/**
	 * The feature id for the '<em><b>Stimulus Presentation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Masking Presentation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Stimulus Transducer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Masking Transducer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Transducer Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Stimulus Transducer Calibration Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD = 11;

	/**
	 * The feature id for the '<em><b>Masking Transducer Calibration Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD = 12;

	/**
	 * The feature id for the '<em><b>Hearing Instrument1 Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Hearing Instrument2 Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Hearing Instrument Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Stimulus Auxiliary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY = 16;

	/**
	 * The feature id for the '<em><b>Masking Auxiliary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY = 17;

	/**
	 * The feature id for the '<em><b>Word List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME = 18;

	/**
	 * The feature id for the '<em><b>Auxiliary Parameter Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Speech Threshold Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Stimulus On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME = 21;

	/**
	 * The feature id for the '<em><b>Masking On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME = 22;

	/**
	 * The feature id for the '<em><b>Stimulus Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME = 23;

	/**
	 * The feature id for the '<em><b>Masking Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME = 24;

	/**
	 * The feature id for the '<em><b>Stimulus Si Si Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER = 25;

	/**
	 * The feature id for the '<em><b>Masking Si Si Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Stimulus Warble Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION = 27;

	/**
	 * The feature id for the '<em><b>Masking Warble Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION = 28;

	/**
	 * The feature id for the '<em><b>Stimulus Warble Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE = 29;

	/**
	 * The feature id for the '<em><b>Masking Warble Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE = 30;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION = 31;

	/**
	 * The feature id for the '<em><b>Masking Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION = 32;

	/**
	 * The feature id for the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION = 33;

	/**
	 * The feature id for the '<em><b>Masking Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION = 34;

	/**
	 * The feature id for the '<em><b>Stimulus Pulse Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION = 35;

	/**
	 * The feature id for the '<em><b>Masking Pulse Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION = 36;

	/**
	 * The feature id for the '<em><b>Stimulus Pulse Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE = 37;

	/**
	 * The feature id for the '<em><b>Masking Pulse Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE = 38;

	/**
	 * The number of structural features of the '<em>Audio Metric Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE_FEATURE_COUNT = 39;

	/**
	 * The number of operations of the '<em>Audio Metric Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DecayAudiogramTypeImpl <em>Decay Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DecayAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDecayAudiogramType()
	 * @generated
	 */
	int DECAY_AUDIOGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Decay Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_AUDIOGRAM_TYPE__DECAY_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Decay Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decay Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DecayPointTypeImpl <em>Decay Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DecayPointTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDecayPointType()
	 * @generated
	 */
	int DECAY_POINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__MASKING_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__START_TIME = 4;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__END_TIME = 5;

	/**
	 * The number of structural features of the '<em>Decay Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Decay Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyPointTypeImpl <em>Difference Limen Frequency Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyPointTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MODULATION_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Difference Limen Frequency Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINT_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Difference Limen Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Difference Limen Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyTypeImpl <em>Difference Limen Frequency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenFrequencyType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Difference Limen Frequency Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Difference Limen Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Difference Limen Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityPointTypeImpl <em>Difference Limen Intensity Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityPointTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Difference Limen Intensity Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Difference Limen Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Difference Limen Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityTypeImpl <em>Difference Limen Intensity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenIntensityType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Difference Limen Intensity Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Difference Limen Intensity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Difference Limen Intensity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.DocumentRootImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUD_MEASUREMENT_CONDITIONS = 3;

	/**
	 * The feature id for the '<em><b>HIMSA Audiometric Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIMSA_AUDIOMETRIC_STANDARD = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.FrequenciesUsedForToneAverageTypeImpl <em>Frequencies Used For Tone Average Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.FrequenciesUsedForToneAverageTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Left Ear1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1 = 0;

	/**
	 * The feature id for the '<em><b>Left Ear2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2 = 1;

	/**
	 * The feature id for the '<em><b>Right Ear1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1 = 2;

	/**
	 * The feature id for the '<em><b>Right Ear2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2 = 3;

	/**
	 * The number of structural features of the '<em>Frequencies Used For Tone Average Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Frequencies Used For Tone Average Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.HIMSAAudiometricStandardTypeImpl <em>HIMSA Audiometric Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.HIMSAAudiometricStandardTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHIMSAAudiometricStandardType()
	 * @generated
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Tone Threshold Audiogram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM = 0;

	/**
	 * The feature id for the '<em><b>Uncomfortable Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Most Comfortable Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Speech Discrimination Audiogram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM = 3;

	/**
	 * The feature id for the '<em><b>Speech Reception Threshold Audiogram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM = 4;

	/**
	 * The feature id for the '<em><b>Speech Most Comfortable Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Speech Uncomfortable Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL = 6;

	/**
	 * The feature id for the '<em><b>Tone Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES = 7;

	/**
	 * The feature id for the '<em><b>Speech Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES = 8;

	/**
	 * The feature id for the '<em><b>Frequencies Used For Tone Average</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE = 9;

	/**
	 * The feature id for the '<em><b>Decay Audiogram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM = 10;

	/**
	 * The feature id for the '<em><b>Alternate Binaural Loudness Balance Audiogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM = 11;

	/**
	 * The feature id for the '<em><b>Stenger Audiogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM = 12;

	/**
	 * The feature id for the '<em><b>Difference Limen Intensity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY = 13;

	/**
	 * The feature id for the '<em><b>Difference Limen Frequency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY = 14;

	/**
	 * The feature id for the '<em><b>Short Increment Sensitivity Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX = 15;

	/**
	 * The feature id for the '<em><b>Private Audiogram Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA = 16;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD = 17;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH = 18;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION = 19;

	/**
	 * The number of structural features of the '<em>HIMSA Audiometric Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>HIMSA Audiometric Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMeasurementNotesType()
	 * @generated
	 */
	int MEASUREMENT_NOTES_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Audiometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Audiometer Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Audiometer Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION = 2;

	/**
	 * The feature id for the '<em><b>Test Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__TEST_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Test Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY = 4;

	/**
	 * The number of structural features of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.MostComfortableLevelTypeImpl <em>Most Comfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.MostComfortableLevelTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMostComfortableLevelType()
	 * @generated
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Tone Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Most Comfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Most Comfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl <em>Short Increment Sensitivity Index Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT = 13;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Number Of Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS = 5;

	/**
	 * The feature id for the '<em><b>Number Of Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS = 6;

	/**
	 * The number of structural features of the '<em>Short Increment Sensitivity Index Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Short Increment Sensitivity Index Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexTypeImpl <em>Short Increment Sensitivity Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Short Increment Sensitivity Index Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Short Increment Sensitivity Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Short Increment Sensitivity Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.SpeechDiscriminationAudiogramTypeImpl <em>Speech Discrimination Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.SpeechDiscriminationAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Speech Discrimination Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__SPEECH_DISCRIMINATION_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Speech Discrimination Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speech Discrimination Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.SpeechMostComfortableLevelTypeImpl <em>Speech Most Comfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.SpeechMostComfortableLevelTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechMostComfortableLevelType()
	 * @generated
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Speech Most Comfortable Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT = 1;

	/**
	 * The number of structural features of the '<em>Speech Most Comfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speech Most Comfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl <em>Speech Reception Threshold Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Speech Reception Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Speech Reception Threshold Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speech Reception Threshold Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl <em>Speech Score Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechScorePointType()
	 * @generated
	 */
	int SPEECH_SCORE_POINT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Score Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT = 2;

	/**
	 * The feature id for the '<em><b>Number Of Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS = 3;

	/**
	 * The number of structural features of the '<em>Speech Score Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Speech Score Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.SpeechUncomfortableLevelTypeImpl <em>Speech Uncomfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.SpeechUncomfortableLevelTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechUncomfortableLevelType()
	 * @generated
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Speech Uncomfortable Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT = 1;

	/**
	 * The number of structural features of the '<em>Speech Uncomfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speech Uncomfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.StengerAudiogramTypeImpl <em>Stenger Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.StengerAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStengerAudiogramType()
	 * @generated
	 */
	int STENGER_AUDIOGRAM_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Stenger Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STENGER_AUDIOGRAM_TYPE__STENGER_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Stenger Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STENGER_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stenger Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STENGER_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.TonePointsTypeImpl <em>Tone Points Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.TonePointsTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTonePointsType()
	 * @generated
	 */
	int TONE_POINTS_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__MASKING_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Tone Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__TONE_POINT_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Tone Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tone Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.ToneThresholdAudiogramTypeImpl <em>Tone Threshold Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.ToneThresholdAudiogramTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneThresholdAudiogramType()
	 * @generated
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Tone Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE__TONE_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Tone Threshold Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tone Threshold Audiogram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.impl.UncomfortableLevelTypeImpl <em>Uncomfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.impl.UncomfortableLevelTypeImpl
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getUncomfortableLevelType()
	 * @generated
	 */
	int UNCOMFORTABLE_LEVEL_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Tone Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCOMFORTABLE_LEVEL_TYPE__TONE_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Uncomfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCOMFORTABLE_LEVEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uncomfortable Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCOMFORTABLE_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterType()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_TYPE = 24;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.DBweightingType <em>DBweighting Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.DBweightingType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDBweightingType()
	 * @generated
	 */
	int DBWEIGHTING_TYPE = 25;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentConditionType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_CONDITION_TYPE = 26;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.PointStatusType <em>Point Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPointStatusType()
	 * @generated
	 */
	int POINT_STATUS_TYPE = 27;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.PresentationType <em>Presentation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPresentationType()
	 * @generated
	 */
	int PRESENTATION_TYPE = 28;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SignalOutputType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 29;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 30;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.SpeechThresholdType <em>Speech Threshold Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SpeechThresholdType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechThresholdType()
	 * @generated
	 */
	int SPEECH_THRESHOLD_TYPE = 31;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.ToneAverageType <em>Tone Average Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneAverageType()
	 * @generated
	 */
	int TONE_AVERAGE_TYPE = 32;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerCalibrationStandardType()
	 * @generated
	 */
	int TRANSDUCER_CALIBRATION_STANDARD_TYPE = 33;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.TransducerType <em>Transducer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.TransducerType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerType()
	 * @generated
	 */
	int TRANSDUCER_TYPE = 34;

	/**
	 * The meta object id for the '<em>Audiometer Make Model Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudiometerMakeModelType()
	 * @generated
	 */
	int AUDIOMETER_MAKE_MODEL_TYPE = 35;

	/**
	 * The meta object id for the '<em>Audiometer Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudiometerSerialNumberType()
	 * @generated
	 */
	int AUDIOMETER_SERIAL_NUMBER_TYPE = 36;

	/**
	 * The meta object id for the '<em>Auxiliary Parameter Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterDescriptionType()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_DESCRIPTION_TYPE = 37;

	/**
	 * The meta object id for the '<em>Auxiliary Parameter Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterTypeObject()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_TYPE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 39;

	/**
	 * The meta object id for the '<em>DBweighting Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.DBweightingType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDBweightingTypeObject()
	 * @generated
	 */
	int DBWEIGHTING_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>End Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getEndTimeType()
	 * @generated
	 */
	int END_TIME_TYPE = 41;

	/**
	 * The meta object id for the '<em>Hearing Instrument Condition Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentConditionTypeObject()
	 * @generated
	 */
	int HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Hearing Instrument Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentDescriptionType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_DESCRIPTION_TYPE = 43;

	/**
	 * The meta object id for the '<em>Left Ear1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getLeftEar1Type()
	 * @generated
	 */
	int LEFT_EAR1_TYPE = 44;

	/**
	 * The meta object id for the '<em>Masking Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingAmplitudeModulationType()
	 * @generated
	 */
	int MASKING_AMPLITUDE_MODULATION_TYPE = 45;

	/**
	 * The meta object id for the '<em>Masking Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingFrequencyModulationType()
	 * @generated
	 */
	int MASKING_FREQUENCY_MODULATION_TYPE = 46;

	/**
	 * The meta object id for the '<em>Masking Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE = 47;

	/**
	 * The meta object id for the '<em>Masking Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType1()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE1 = 48;

	/**
	 * The meta object id for the '<em>Masking Level Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType2()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE2 = 49;

	/**
	 * The meta object id for the '<em>Masking Level Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType3()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE3 = 50;

	/**
	 * The meta object id for the '<em>Masking Level Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType4()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE4 = 51;

	/**
	 * The meta object id for the '<em>Masking Level Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType5()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE5 = 52;

	/**
	 * The meta object id for the '<em>Masking Off Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingOffTimeType()
	 * @generated
	 */
	int MASKING_OFF_TIME_TYPE = 53;

	/**
	 * The meta object id for the '<em>Masking On Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingOnTimeType()
	 * @generated
	 */
	int MASKING_ON_TIME_TYPE = 54;

	/**
	 * The meta object id for the '<em>Masking Pulse Cycle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingPulseCycleType()
	 * @generated
	 */
	int MASKING_PULSE_CYCLE_TYPE = 55;

	/**
	 * The meta object id for the '<em>Masking Pulse Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingPulseModulationType()
	 * @generated
	 */
	int MASKING_PULSE_MODULATION_TYPE = 56;

	/**
	 * The meta object id for the '<em>Masking Si Si Parameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingSiSiParameterType()
	 * @generated
	 */
	int MASKING_SI_SI_PARAMETER_TYPE = 57;

	/**
	 * The meta object id for the '<em>Masking Warble Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingWarbleModulationSizeType()
	 * @generated
	 */
	int MASKING_WARBLE_MODULATION_SIZE_TYPE = 58;

	/**
	 * The meta object id for the '<em>Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE = 59;

	/**
	 * The meta object id for the '<em>Modulation Size Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType1()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE1 = 60;

	/**
	 * The meta object id for the '<em>Modulation Size Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType2()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE2 = 61;

	/**
	 * The meta object id for the '<em>Point Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPointStatusTypeObject()
	 * @generated
	 */
	int POINT_STATUS_TYPE_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Presentation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPresentationTypeObject()
	 * @generated
	 */
	int PRESENTATION_TYPE_OBJECT = 63;

	/**
	 * The meta object id for the '<em>Score Percent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getScorePercentType()
	 * @generated
	 */
	int SCORE_PERCENT_TYPE = 64;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SignalOutputType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Signal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Speech Threshold Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SpeechThresholdType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechThresholdTypeObject()
	 * @generated
	 */
	int SPEECH_THRESHOLD_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Start Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStartTimeType()
	 * @generated
	 */
	int START_TIME_TYPE = 68;

	/**
	 * The meta object id for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusAmplitudeModulationType()
	 * @generated
	 */
	int STIMULUS_AMPLITUDE_MODULATION_TYPE = 69;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusFrequencyModulationType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_MODULATION_TYPE = 70;

	/**
	 * The meta object id for the '<em>Stimulus Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE = 71;

	/**
	 * The meta object id for the '<em>Stimulus Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType1()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE1 = 72;

	/**
	 * The meta object id for the '<em>Stimulus Level Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType2()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE2 = 73;

	/**
	 * The meta object id for the '<em>Stimulus Level Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType3()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE3 = 74;

	/**
	 * The meta object id for the '<em>Stimulus Level Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType4()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE4 = 75;

	/**
	 * The meta object id for the '<em>Stimulus Level Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType5()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE5 = 76;

	/**
	 * The meta object id for the '<em>Stimulus Off Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusOffTimeType()
	 * @generated
	 */
	int STIMULUS_OFF_TIME_TYPE = 77;

	/**
	 * The meta object id for the '<em>Stimulus On Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusOnTimeType()
	 * @generated
	 */
	int STIMULUS_ON_TIME_TYPE = 78;

	/**
	 * The meta object id for the '<em>Stimulus Presentation Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPresentationTypeType()
	 * @generated
	 */
	int STIMULUS_PRESENTATION_TYPE_TYPE = 79;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Cycle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPulseCycleType()
	 * @generated
	 */
	int STIMULUS_PULSE_CYCLE_TYPE = 80;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPulseModulationType()
	 * @generated
	 */
	int STIMULUS_PULSE_MODULATION_TYPE = 81;

	/**
	 * The meta object id for the '<em>Stimulus Signal Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusSignalTypeType()
	 * @generated
	 */
	int STIMULUS_SIGNAL_TYPE_TYPE = 82;

	/**
	 * The meta object id for the '<em>Stimulus Si Si Parameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusSiSiParameterType()
	 * @generated
	 */
	int STIMULUS_SI_SI_PARAMETER_TYPE = 83;

	/**
	 * The meta object id for the '<em>Stimulus Warble Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusWarbleModulationSizeType()
	 * @generated
	 */
	int STIMULUS_WARBLE_MODULATION_SIZE_TYPE = 84;

	/**
	 * The meta object id for the '<em>Test Method Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTestMethodType()
	 * @generated
	 */
	int TEST_METHOD_TYPE = 85;

	/**
	 * The meta object id for the '<em>Test Reliability Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTestReliabilityType()
	 * @generated
	 */
	int TEST_RELIABILITY_TYPE = 86;

	/**
	 * The meta object id for the '<em>Tone Average Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneAverageTypeObject()
	 * @generated
	 */
	int TONE_AVERAGE_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Transducer Calibration Standard Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerCalibrationStandardTypeObject()
	 * @generated
	 */
	int TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerDescriptionType()
	 * @generated
	 */
	int TRANSDUCER_DESCRIPTION_TYPE = 89;

	/**
	 * The meta object id for the '<em>Transducer Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.TransducerType
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerTypeObject()
	 * @generated
	 */
	int TRANSDUCER_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 91;

	/**
	 * The meta object id for the '<em>Word List Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getWordListNameType()
	 * @generated
	 */
	int WORD_LIST_NAME_TYPE = 92;


	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType <em>Alternate Binaural Loudness Balance Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate Binaural Loudness Balance Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType
	 * @generated
	 */
	EClass getAlternateBinauralLoudnessBalanceAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType#getAudMeasurementConditions()
	 * @see #getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	EReference getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType#getAlternateBinauralLoudnessBalancePoints <em>Alternate Binaural Loudness Balance Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternate Binaural Loudness Balance Points</em>'.
	 * @see com.himsa.measurement.audiogram.AlternateBinauralLoudnessBalanceAudiogramType#getAlternateBinauralLoudnessBalancePoints()
	 * @see #getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	EReference getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType <em>Audio Metric Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Metric Measurement Conditions Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType
	 * @generated
	 */
	EClass getAudioMetricMeasurementConditionsType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Output</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSignalOutput()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Output</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSignalOutput()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulusd BWeighting</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusdBWeighting()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusdBWeighting();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maskingd BWeighting</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingdBWeighting()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingdBWeighting();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Presentation Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPresentationType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPresentationType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Presentation Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPresentationType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPresentationType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transducer Description</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getTransducerDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_TransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Calibration Standard</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Calibration Standard</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument1 Condition</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument1Condition();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument2 Condition</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument2Condition();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument Description</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrumentDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Auxiliary</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusAuxiliary()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusAuxiliary();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Auxiliary</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingAuxiliary()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingAuxiliary();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getWordListName <em>Word List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word List Name</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getWordListName()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_WordListName();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription <em>Auxiliary Parameter Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary Parameter Description</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speech Threshold Type</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getSpeechThresholdType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_SpeechThresholdType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusOnTime <em>Stimulus On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus On Time</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusOnTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusOnTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingOnTime <em>Masking On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking On Time</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingOnTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingOnTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusOffTime <em>Stimulus Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Off Time</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusOffTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusOffTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingOffTime <em>Masking Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Off Time</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingOffTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingOffTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter <em>Stimulus Si Si Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Si Si Parameter</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSiSiParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter <em>Masking Si Si Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Si Si Parameter</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSiSiParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation <em>Stimulus Warble Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Warble Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation <em>Masking Warble Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Warble Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize <em>Stimulus Warble Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Warble Modulation Size</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize <em>Masking Warble Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Warble Modulation Size</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Amplitude Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Amplitude Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseModulation <em>Stimulus Pulse Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseModulation <em>Masking Pulse Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Pulse Modulation</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseCycle <em>Stimulus Pulse Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Cycle</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getStimulusPulseCycle()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseCycle();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseCycle <em>Masking Pulse Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Pulse Cycle</em>'.
	 * @see com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType#getMaskingPulseCycle()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseCycle();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DecayAudiogramType <em>Decay Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decay Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.DecayAudiogramType
	 * @generated
	 */
	EClass getDecayAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.DecayAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.DecayAudiogramType#getAudMeasurementConditions()
	 * @see #getDecayAudiogramType()
	 * @generated
	 */
	EReference getDecayAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.DecayAudiogramType#getDecayPoints <em>Decay Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decay Points</em>'.
	 * @see com.himsa.measurement.audiogram.DecayAudiogramType#getDecayPoints()
	 * @see #getDecayAudiogramType()
	 * @generated
	 */
	EReference getDecayAudiogramType_DecayPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DecayPointType <em>Decay Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decay Point Type</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType
	 * @generated
	 */
	EClass getDecayPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getStimulusFrequency()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getStimulusLevel()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getMaskingFrequency()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getMaskingLevel()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getStartTime()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DecayPointType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see com.himsa.measurement.audiogram.DecayPointType#getEndTime()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_EndTime();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType <em>Difference Limen Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Frequency Point Type</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType
	 * @generated
	 */
	EClass getDifferenceLimenFrequencyPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getStimulusFrequency()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getStimulusLevel()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getMaskingFrequency()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getMaskingLevel()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getModulationSize()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getDifferenceLimenFrequencyPointStatus <em>Difference Limen Frequency Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difference Limen Frequency Point Status</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyPointType#getDifferenceLimenFrequencyPointStatus()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyType <em>Difference Limen Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Frequency Type</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyType
	 * @generated
	 */
	EClass getDifferenceLimenFrequencyType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyType#getAudMeasurementConditions()
	 * @see #getDifferenceLimenFrequencyType()
	 * @generated
	 */
	EReference getDifferenceLimenFrequencyType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.DifferenceLimenFrequencyType#getDifferenceLimenFrequencyPoints <em>Difference Limen Frequency Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Frequency Points</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenFrequencyType#getDifferenceLimenFrequencyPoints()
	 * @see #getDifferenceLimenFrequencyType()
	 * @generated
	 */
	EReference getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType <em>Difference Limen Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Intensity Point Type</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType
	 * @generated
	 */
	EClass getDifferenceLimenIntensityPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getStimulusFrequency()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getStimulusLevel()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getMaskingFrequency()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getMaskingLevel()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getModulationSize()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difference Limen Intensity Point Status</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType <em>Difference Limen Intensity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Intensity Type</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityType
	 * @generated
	 */
	EClass getDifferenceLimenIntensityType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getAudMeasurementConditions()
	 * @see #getDifferenceLimenIntensityType()
	 * @generated
	 */
	EReference getDifferenceLimenIntensityType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getDifferenceLimenIntensityPoints <em>Difference Limen Intensity Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Intensity Points</em>'.
	 * @see com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getDifferenceLimenIntensityPoints()
	 * @see #getDifferenceLimenIntensityType()
	 * @generated
	 */
	EReference getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.audiogram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.audiogram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot#getAudMeasurementConditions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiometric Standard</em>'.
	 * @see com.himsa.measurement.audiogram.DocumentRoot#getHIMSAAudiometricStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIMSAAudiometricStandard();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType <em>Frequencies Used For Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequencies Used For Tone Average Type</em>'.
	 * @see com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType
	 * @generated
	 */
	EClass getFrequenciesUsedForToneAverageType();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getLeftEar1 <em>Left Ear1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Left Ear1</em>'.
	 * @see com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getLeftEar1()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_LeftEar1();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getLeftEar2 <em>Left Ear2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Left Ear2</em>'.
	 * @see com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getLeftEar2()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_LeftEar2();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getRightEar1 <em>Right Ear1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Right Ear1</em>'.
	 * @see com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getRightEar1()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_RightEar1();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getRightEar2 <em>Right Ear2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Right Ear2</em>'.
	 * @see com.himsa.measurement.audiogram.FrequenciesUsedForToneAverageType#getRightEar2()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_RightEar2();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType <em>HIMSA Audiometric Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIMSA Audiometric Standard Type</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType
	 * @generated
	 */
	EClass getHIMSAAudiometricStandardType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getToneThresholdAudiogram <em>Tone Threshold Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Threshold Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getToneThresholdAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ToneThresholdAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getUncomfortableLevel <em>Uncomfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uncomfortable Level</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getUncomfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_UncomfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getMostComfortableLevel <em>Most Comfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Most Comfortable Level</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getMostComfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_MostComfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechDiscriminationAudiogram <em>Speech Discrimination Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Discrimination Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechDiscriminationAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechReceptionThresholdAudiogram <em>Speech Reception Threshold Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Reception Threshold Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechReceptionThresholdAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechMostComfortableLevel <em>Speech Most Comfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Most Comfortable Level</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechMostComfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechMostComfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechUncomfortableLevel <em>Speech Uncomfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Uncomfortable Level</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechUncomfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechUncomfortableLevel();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getToneNotes <em>Tone Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tone Notes</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getToneNotes()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ToneNotes();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechNotes <em>Speech Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Notes</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getSpeechNotes()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechNotes();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage <em>Frequencies Used For Tone Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequencies Used For Tone Average</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDecayAudiogram <em>Decay Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decay Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDecayAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DecayAudiogram();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram <em>Alternate Binaural Loudness Balance Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternate Binaural Loudness Balance Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getStengerAudiogram <em>Stenger Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stenger Audiogram</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getStengerAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_StengerAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDifferenceLimenIntensity <em>Difference Limen Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Intensity</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDifferenceLimenIntensity()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DifferenceLimenIntensity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDifferenceLimenFrequency <em>Difference Limen Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getDifferenceLimenFrequency()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DifferenceLimenFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getShortIncrementSensitivityIndex <em>Short Increment Sensitivity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Increment Sensitivity Index</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getShortIncrementSensitivityIndex()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getPrivateAudiogramData <em>Private Audiogram Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Audiogram Data</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getPrivateAudiogramData()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_PrivateAudiogramData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getConvertedFromDataStandard()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.measurement.audiogram.HIMSAAudiometricStandardType#getVersion()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_Version();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Notes Type</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType
	 * @generated
	 */
	EClass getMeasurementNotesType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Make Model</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerMakeModel()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerMakeModel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Serial Number</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerSerialNumber()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Last Calibration</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType#getAudiometerLastCalibration()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerLastCalibration();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.MeasurementNotesType#getTestMethod <em>Test Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Method</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType#getTestMethod()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TestMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Reliability</em>'.
	 * @see com.himsa.measurement.audiogram.MeasurementNotesType#getTestReliability()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TestReliability();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.MostComfortableLevelType <em>Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Most Comfortable Level Type</em>'.
	 * @see com.himsa.measurement.audiogram.MostComfortableLevelType
	 * @generated
	 */
	EClass getMostComfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.MostComfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.MostComfortableLevelType#getAudMeasurementConditions()
	 * @see #getMostComfortableLevelType()
	 * @generated
	 */
	EReference getMostComfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.MostComfortableLevelType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see com.himsa.measurement.audiogram.MostComfortableLevelType#getTonePoints()
	 * @see #getMostComfortableLevelType()
	 * @generated
	 */
	EReference getMostComfortableLevelType_TonePoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint <em>Short Increment Sensitivity Index Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Increment Sensitivity Index Point</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint
	 * @generated
	 */
	EClass getShortIncrementSensitivityIndexPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusFrequency()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusLevel()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingFrequency()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingLevel()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getModulationSize()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Answers</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_NumberOfAnswers();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Increments</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_NumberOfIncrements();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType <em>Short Increment Sensitivity Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Increment Sensitivity Index Type</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType
	 * @generated
	 */
	EClass getShortIncrementSensitivityIndexType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType#getAudMeasurementConditions()
	 * @see #getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	EReference getShortIncrementSensitivityIndexType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType#getShortIncrementSensitivityIndexPoints <em>Short Increment Sensitivity Index Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Increment Sensitivity Index Points</em>'.
	 * @see com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexType#getShortIncrementSensitivityIndexPoints()
	 * @see #getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	EReference getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType <em>Speech Discrimination Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Discrimination Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType
	 * @generated
	 */
	EClass getSpeechDiscriminationAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType#getAudMeasurementConditions()
	 * @see #getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	EReference getSpeechDiscriminationAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType#getSpeechDiscriminationPoints <em>Speech Discrimination Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Discrimination Points</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechDiscriminationAudiogramType#getSpeechDiscriminationPoints()
	 * @see #getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	EReference getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.SpeechMostComfortableLevelType <em>Speech Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Most Comfortable Level Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechMostComfortableLevelType
	 * @generated
	 */
	EClass getSpeechMostComfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechMostComfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechMostComfortableLevelType#getAudMeasurementConditions()
	 * @see #getSpeechMostComfortableLevelType()
	 * @generated
	 */
	EReference getSpeechMostComfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechMostComfortableLevelType#getSpeechMostComfortablePoint <em>Speech Most Comfortable Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Most Comfortable Point</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechMostComfortableLevelType#getSpeechMostComfortablePoint()
	 * @see #getSpeechMostComfortableLevelType()
	 * @generated
	 */
	EReference getSpeechMostComfortableLevelType_SpeechMostComfortablePoint();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType <em>Speech Reception Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Reception Threshold Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType
	 * @generated
	 */
	EClass getSpeechReceptionThresholdAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType#getAudMeasurementConditions()
	 * @see #getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	EReference getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType#getSpeechReceptionPoints <em>Speech Reception Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Reception Points</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType#getSpeechReceptionPoints()
	 * @see #getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	EReference getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.SpeechScorePointType <em>Speech Score Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Score Point Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechScorePointType
	 * @generated
	 */
	EClass getSpeechScorePointType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechScorePointType#getStimulusLevel()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechScorePointType#getMaskingLevel()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.SpeechScorePointType#getScorePercent <em>Score Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Percent</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechScorePointType#getScorePercent()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_ScorePercent();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Words</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechScorePointType#getNumberOfWords()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_NumberOfWords();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.SpeechUncomfortableLevelType <em>Speech Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Uncomfortable Level Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechUncomfortableLevelType
	 * @generated
	 */
	EClass getSpeechUncomfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechUncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechUncomfortableLevelType#getAudMeasurementConditions()
	 * @see #getSpeechUncomfortableLevelType()
	 * @generated
	 */
	EReference getSpeechUncomfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint <em>Speech Uncomfortable Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Uncomfortable Point</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint()
	 * @see #getSpeechUncomfortableLevelType()
	 * @generated
	 */
	EReference getSpeechUncomfortableLevelType_SpeechUncomfortablePoint();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.StengerAudiogramType <em>Stenger Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stenger Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.StengerAudiogramType
	 * @generated
	 */
	EClass getStengerAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.StengerAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.StengerAudiogramType#getAudMeasurementConditions()
	 * @see #getStengerAudiogramType()
	 * @generated
	 */
	EReference getStengerAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.StengerAudiogramType#getStengerPoints <em>Stenger Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stenger Points</em>'.
	 * @see com.himsa.measurement.audiogram.StengerAudiogramType#getStengerPoints()
	 * @see #getStengerAudiogramType()
	 * @generated
	 */
	EReference getStengerAudiogramType_StengerPoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.TonePointsType <em>Tone Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tone Points Type</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType
	 * @generated
	 */
	EClass getTonePointsType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType#getStimulusFrequency()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType#getStimulusLevel()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType#getMaskingFrequency()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType#getMaskingLevel()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tone Point Status</em>'.
	 * @see com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_TonePointStatus();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.ToneThresholdAudiogramType <em>Tone Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tone Threshold Audiogram Type</em>'.
	 * @see com.himsa.measurement.audiogram.ToneThresholdAudiogramType
	 * @generated
	 */
	EClass getToneThresholdAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.ToneThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.ToneThresholdAudiogramType#getAudMeasurementConditions()
	 * @see #getToneThresholdAudiogramType()
	 * @generated
	 */
	EReference getToneThresholdAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.ToneThresholdAudiogramType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see com.himsa.measurement.audiogram.ToneThresholdAudiogramType#getTonePoints()
	 * @see #getToneThresholdAudiogramType()
	 * @generated
	 */
	EReference getToneThresholdAudiogramType_TonePoints();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.UncomfortableLevelType <em>Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncomfortable Level Type</em>'.
	 * @see com.himsa.measurement.audiogram.UncomfortableLevelType
	 * @generated
	 */
	EClass getUncomfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.UncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see com.himsa.measurement.audiogram.UncomfortableLevelType#getAudMeasurementConditions()
	 * @see #getUncomfortableLevelType()
	 * @generated
	 */
	EReference getUncomfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.UncomfortableLevelType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see com.himsa.measurement.audiogram.UncomfortableLevelType#getTonePoints()
	 * @see #getUncomfortableLevelType()
	 * @generated
	 */
	EReference getUncomfortableLevelType_TonePoints();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auxiliary Parameter Type</em>'.
	 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
	 * @generated
	 */
	EEnum getAuxiliaryParameterType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.DBweightingType <em>DBweighting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBweighting Type</em>'.
	 * @see com.himsa.measurement.audiogram.DBweightingType
	 * @generated
	 */
	EEnum getDBweightingType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hearing Instrument Condition Type</em>'.
	 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
	 * @generated
	 */
	EEnum getHearingInstrumentConditionType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.PointStatusType <em>Point Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Point Status Type</em>'.
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @generated
	 */
	EEnum getPointStatusType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Type</em>'.
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @generated
	 */
	EEnum getPresentationType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see com.himsa.measurement.audiogram.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.SpeechThresholdType <em>Speech Threshold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speech Threshold Type</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechThresholdType
	 * @generated
	 */
	EEnum getSpeechThresholdType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.ToneAverageType <em>Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tone Average Type</em>'.
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @generated
	 */
	EEnum getToneAverageType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Calibration Standard Type</em>'.
	 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
	 * @generated
	 */
	EEnum getTransducerCalibrationStandardType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.TransducerType <em>Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Type</em>'.
	 * @see com.himsa.measurement.audiogram.TransducerType
	 * @generated
	 */
	EEnum getTransducerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Audiometer Make Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Audiometer Make Model Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AudiometerMakeModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getAudiometerMakeModelType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Audiometer Serial Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Audiometer Serial Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AudiometerSerialNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getAudiometerSerialNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Auxiliary Parameter Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auxiliary Parameter Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AuxiliaryParameterDescription_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getAuxiliaryParameterDescriptionType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.AuxiliaryParameterType <em>Auxiliary Parameter Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auxiliary Parameter Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
	 * @model instanceClass="com.himsa.measurement.audiogram.AuxiliaryParameterType"
	 *        extendedMetaData="name='AuxiliaryParameter_Type:Object' baseType='AuxiliaryParameter_Type'"
	 * @generated
	 */
	EDataType getAuxiliaryParameterTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Converted From Data Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Converted From Data Standard Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ConvertedFromDataStandard_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='100'"
	 * @generated
	 */
	EDataType getConvertedFromDataStandardType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.DBweightingType <em>DBweighting Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DBweighting Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.DBweightingType
	 * @model instanceClass="com.himsa.measurement.audiogram.DBweightingType"
	 *        extendedMetaData="name='dBweighting_Type:Object' baseType='dBweighting_Type'"
	 * @generated
	 */
	EDataType getDBweightingTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>End Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>End Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='EndTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getEndTimeType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.HearingInstrumentConditionType <em>Hearing Instrument Condition Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hearing Instrument Condition Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
	 * @model instanceClass="com.himsa.measurement.audiogram.HearingInstrumentConditionType"
	 *        extendedMetaData="name='HearingInstrumentCondition_Type:Object' baseType='HearingInstrumentCondition_Type'"
	 * @generated
	 */
	EDataType getHearingInstrumentConditionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hearing Instrument Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hearing Instrument Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HearingInstrumentDescription_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getHearingInstrumentDescriptionType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.ToneAverageType <em>Left Ear1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Left Ear1 Type</em>'.
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @model instanceClass="com.himsa.measurement.audiogram.ToneAverageType"
	 *        extendedMetaData="name='LeftEar1_._type' baseType='ToneAverage_Type'"
	 * @generated
	 */
	EDataType getLeftEar1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Amplitude Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Amplitude Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingAmplitudeModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingAmplitudeModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Frequency Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Frequency Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingFrequencyModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getMaskingFrequencyModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType2();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type3</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType3();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type4</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._4_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType4();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Level Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Level Type5</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingLevel_._5_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingLevelType5();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Off Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Off Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingOffTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3' minInclusive='0.000'"
	 * @generated
	 */
	EDataType getMaskingOffTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking On Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking On Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingOnTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.000' fractionDigits='3'"
	 * @generated
	 */
	EDataType getMaskingOnTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Pulse Cycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Pulse Cycle Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingPulseCycle_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getMaskingPulseCycleType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Pulse Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Pulse Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingPulseModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.0' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingPulseModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Si Si Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Si Si Parameter Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingSiSiParameter_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingSiSiParameterType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Warble Modulation Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Warble Modulation Size Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingWarbleModulationSize_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getMaskingWarbleModulationSizeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Modulation Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modulation Size Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ModulationSize_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getModulationSizeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Modulation Size Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modulation Size Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ModulationSize_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' totalDigits='2'"
	 * @generated
	 */
	EDataType getModulationSizeType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Modulation Size Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modulation Size Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ModulationSize_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getModulationSizeType2();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.PointStatusType <em>Point Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point Status Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @model instanceClass="com.himsa.measurement.audiogram.PointStatusType"
	 *        extendedMetaData="name='PointStatus_Type:Object' baseType='PointStatus_Type'"
	 * @generated
	 */
	EDataType getPointStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.PresentationType <em>Presentation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Presentation Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @model instanceClass="com.himsa.measurement.audiogram.PresentationType"
	 *        extendedMetaData="name='Presentation_Type:Object' baseType='Presentation_Type'"
	 * @generated
	 */
	EDataType getPresentationTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Score Percent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Score Percent Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ScorePercent_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getScorePercentType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.SignalOutputType
	 * @model instanceClass="com.himsa.measurement.audiogram.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.SignalType <em>Signal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @model instanceClass="com.himsa.measurement.audiogram.SignalType"
	 *        extendedMetaData="name='Signal_Type:Object' baseType='Signal_Type'"
	 * @generated
	 */
	EDataType getSignalTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.SpeechThresholdType <em>Speech Threshold Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Speech Threshold Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.SpeechThresholdType
	 * @model instanceClass="com.himsa.measurement.audiogram.SpeechThresholdType"
	 *        extendedMetaData="name='SpeechThreshold_Type:Object' baseType='SpeechThreshold_Type'"
	 * @generated
	 */
	EDataType getSpeechThresholdTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Start Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Start Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StartTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getStartTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Amplitude Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Amplitude Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusAmplitudeModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusAmplitudeModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Frequency Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Frequency Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusFrequencyModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getStimulusFrequencyModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType2();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type3</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType3();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type4</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._4_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType4();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type5</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._5_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType5();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Off Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Off Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusOffTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.000' fractionDigits='3'"
	 * @generated
	 */
	EDataType getStimulusOffTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus On Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus On Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusOnTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.000' fractionDigits='3'"
	 * @generated
	 */
	EDataType getStimulusOnTimeType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.PresentationType <em>Stimulus Presentation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Presentation Type Type</em>'.
	 * @see com.himsa.measurement.audiogram.PresentationType
	 * @model instanceClass="com.himsa.measurement.audiogram.PresentationType"
	 *        extendedMetaData="name='StimulusPresentationType_._type' baseType='Presentation_Type'"
	 * @generated
	 */
	EDataType getStimulusPresentationTypeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Pulse Cycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Pulse Cycle Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusPulseCycle_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00' fractionDigits='2'"
	 * @generated
	 */
	EDataType getStimulusPulseCycleType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Pulse Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Pulse Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusPulseModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.0' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusPulseModulationType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.SignalType <em>Stimulus Signal Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Signal Type Type</em>'.
	 * @see com.himsa.measurement.audiogram.SignalType
	 * @model instanceClass="com.himsa.measurement.audiogram.SignalType"
	 *        extendedMetaData="name='StimulusSignalType_._type' baseType='Signal_Type'"
	 * @generated
	 */
	EDataType getStimulusSignalTypeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Si Si Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Si Si Parameter Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusSiSiParameter_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusSiSiParameterType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Warble Modulation Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Warble Modulation Size Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusWarbleModulationSize_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getStimulusWarbleModulationSizeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Test Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Method Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TestMethod_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getTestMethodType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Test Reliability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Reliability Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TestReliability_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getTestReliabilityType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.ToneAverageType <em>Tone Average Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tone Average Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.ToneAverageType
	 * @model instanceClass="com.himsa.measurement.audiogram.ToneAverageType"
	 *        extendedMetaData="name='ToneAverage_Type:Object' baseType='ToneAverage_Type'"
	 * @generated
	 */
	EDataType getToneAverageTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Calibration Standard Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
	 * @model instanceClass="com.himsa.measurement.audiogram.TransducerCalibrationStandardType"
	 *        extendedMetaData="name='TransducerCalibrationStandard_Type:Object' baseType='TransducerCalibrationStandard_Type'"
	 * @generated
	 */
	EDataType getTransducerCalibrationStandardTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Transducer Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TransducerDescription_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getTransducerDescriptionType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.TransducerType <em>Transducer Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.TransducerType
	 * @model instanceClass="com.himsa.measurement.audiogram.TransducerType"
	 *        extendedMetaData="name='Transducer_Type:Object' baseType='Transducer_Type'"
	 * @generated
	 */
	EDataType getTransducerTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='500'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Word List Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Word List Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WordListName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getWordListNameType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AudiogramFactory getAudiogramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl <em>Alternate Binaural Loudness Balance Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAlternateBinauralLoudnessBalanceAudiogramType()
		 * @generated
		 */
		EClass ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE = eINSTANCE.getAlternateBinauralLoudnessBalanceAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Alternate Binaural Loudness Balance Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS = eINSTANCE.getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.AudioMetricMeasurementConditionsTypeImpl <em>Audio Metric Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.AudioMetricMeasurementConditionsTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudioMetricMeasurementConditionsType()
		 * @generated
		 */
		EClass AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusSignalType();

		/**
		 * The meta object literal for the '<em><b>Masking Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingSignalType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusSignalOutput();

		/**
		 * The meta object literal for the '<em><b>Masking Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingSignalOutput();

		/**
		 * The meta object literal for the '<em><b>Stimulusd BWeighting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusdBWeighting();

		/**
		 * The meta object literal for the '<em><b>Maskingd BWeighting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingdBWeighting();

		/**
		 * The meta object literal for the '<em><b>Stimulus Presentation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusPresentationType();

		/**
		 * The meta object literal for the '<em><b>Masking Presentation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingPresentationType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Transducer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusTransducerType();

		/**
		 * The meta object literal for the '<em><b>Masking Transducer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingTransducerType();

		/**
		 * The meta object literal for the '<em><b>Transducer Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION = eINSTANCE.getAudioMetricMeasurementConditionsType_TransducerDescription();

		/**
		 * The meta object literal for the '<em><b>Stimulus Transducer Calibration Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard();

		/**
		 * The meta object literal for the '<em><b>Masking Transducer Calibration Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument1 Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION = eINSTANCE.getAudioMetricMeasurementConditionsType_HearingInstrument1Condition();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument2 Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION = eINSTANCE.getAudioMetricMeasurementConditionsType_HearingInstrument2Condition();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION = eINSTANCE.getAudioMetricMeasurementConditionsType_HearingInstrumentDescription();

		/**
		 * The meta object literal for the '<em><b>Stimulus Auxiliary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusAuxiliary();

		/**
		 * The meta object literal for the '<em><b>Masking Auxiliary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingAuxiliary();

		/**
		 * The meta object literal for the '<em><b>Word List Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME = eINSTANCE.getAudioMetricMeasurementConditionsType_WordListName();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Parameter Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION = eINSTANCE.getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription();

		/**
		 * The meta object literal for the '<em><b>Speech Threshold Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE = eINSTANCE.getAudioMetricMeasurementConditionsType_SpeechThresholdType();

		/**
		 * The meta object literal for the '<em><b>Stimulus On Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusOnTime();

		/**
		 * The meta object literal for the '<em><b>Masking On Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingOnTime();

		/**
		 * The meta object literal for the '<em><b>Stimulus Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusOffTime();

		/**
		 * The meta object literal for the '<em><b>Masking Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingOffTime();

		/**
		 * The meta object literal for the '<em><b>Stimulus Si Si Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusSiSiParameter();

		/**
		 * The meta object literal for the '<em><b>Masking Si Si Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingSiSiParameter();

		/**
		 * The meta object literal for the '<em><b>Stimulus Warble Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusWarbleModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Warble Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingWarbleModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Warble Modulation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize();

		/**
		 * The meta object literal for the '<em><b>Masking Warble Modulation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Amplitude Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Pulse Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusPulseModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Pulse Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingPulseModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Pulse Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE = eINSTANCE.getAudioMetricMeasurementConditionsType_StimulusPulseCycle();

		/**
		 * The meta object literal for the '<em><b>Masking Pulse Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE = eINSTANCE.getAudioMetricMeasurementConditionsType_MaskingPulseCycle();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DecayAudiogramTypeImpl <em>Decay Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DecayAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDecayAudiogramType()
		 * @generated
		 */
		EClass DECAY_AUDIOGRAM_TYPE = eINSTANCE.getDecayAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECAY_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getDecayAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Decay Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECAY_AUDIOGRAM_TYPE__DECAY_POINTS = eINSTANCE.getDecayAudiogramType_DecayPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DecayPointTypeImpl <em>Decay Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DecayPointTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDecayPointType()
		 * @generated
		 */
		EClass DECAY_POINT_TYPE = eINSTANCE.getDecayPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getDecayPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__STIMULUS_LEVEL = eINSTANCE.getDecayPointType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__MASKING_FREQUENCY = eINSTANCE.getDecayPointType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__MASKING_LEVEL = eINSTANCE.getDecayPointType_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__START_TIME = eINSTANCE.getDecayPointType_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAY_POINT_TYPE__END_TIME = eINSTANCE.getDecayPointType_EndTime();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyPointTypeImpl <em>Difference Limen Frequency Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyPointTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenFrequencyPointType()
		 * @generated
		 */
		EClass DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE = eINSTANCE.getDifferenceLimenFrequencyPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getDifferenceLimenFrequencyPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_LEVEL = eINSTANCE.getDifferenceLimenFrequencyPointType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY = eINSTANCE.getDifferenceLimenFrequencyPointType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_LEVEL = eINSTANCE.getDifferenceLimenFrequencyPointType_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Modulation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MODULATION_SIZE = eINSTANCE.getDifferenceLimenFrequencyPointType_ModulationSize();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Frequency Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINT_STATUS = eINSTANCE.getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyTypeImpl <em>Difference Limen Frequency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenFrequencyTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenFrequencyType()
		 * @generated
		 */
		EClass DIFFERENCE_LIMEN_FREQUENCY_TYPE = eINSTANCE.getDifferenceLimenFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_FREQUENCY_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getDifferenceLimenFrequencyType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Frequency Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_FREQUENCY_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINTS = eINSTANCE.getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityPointTypeImpl <em>Difference Limen Intensity Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityPointTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenIntensityPointType()
		 * @generated
		 */
		EClass DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE = eINSTANCE.getDifferenceLimenIntensityPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getDifferenceLimenIntensityPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL = eINSTANCE.getDifferenceLimenIntensityPointType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY = eINSTANCE.getDifferenceLimenIntensityPointType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL = eINSTANCE.getDifferenceLimenIntensityPointType_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Modulation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE = eINSTANCE.getDifferenceLimenIntensityPointType_ModulationSize();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Intensity Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS = eINSTANCE.getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityTypeImpl <em>Difference Limen Intensity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DifferenceLimenIntensityTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDifferenceLimenIntensityType()
		 * @generated
		 */
		EClass DIFFERENCE_LIMEN_INTENSITY_TYPE = eINSTANCE.getDifferenceLimenIntensityType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_INTENSITY_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getDifferenceLimenIntensityType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Intensity Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_INTENSITY_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINTS = eINSTANCE.getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.DocumentRootImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getDocumentRoot_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>HIMSA Audiometric Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIMSA_AUDIOMETRIC_STANDARD = eINSTANCE.getDocumentRoot_HIMSAAudiometricStandard();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.FrequenciesUsedForToneAverageTypeImpl <em>Frequencies Used For Tone Average Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.FrequenciesUsedForToneAverageTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getFrequenciesUsedForToneAverageType()
		 * @generated
		 */
		EClass FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE = eINSTANCE.getFrequenciesUsedForToneAverageType();

		/**
		 * The meta object literal for the '<em><b>Left Ear1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1 = eINSTANCE.getFrequenciesUsedForToneAverageType_LeftEar1();

		/**
		 * The meta object literal for the '<em><b>Left Ear2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2 = eINSTANCE.getFrequenciesUsedForToneAverageType_LeftEar2();

		/**
		 * The meta object literal for the '<em><b>Right Ear1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1 = eINSTANCE.getFrequenciesUsedForToneAverageType_RightEar1();

		/**
		 * The meta object literal for the '<em><b>Right Ear2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2 = eINSTANCE.getFrequenciesUsedForToneAverageType_RightEar2();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.HIMSAAudiometricStandardTypeImpl <em>HIMSA Audiometric Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.HIMSAAudiometricStandardTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHIMSAAudiometricStandardType()
		 * @generated
		 */
		EClass HIMSA_AUDIOMETRIC_STANDARD_TYPE = eINSTANCE.getHIMSAAudiometricStandardType();

		/**
		 * The meta object literal for the '<em><b>Tone Threshold Audiogram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_ToneThresholdAudiogram();

		/**
		 * The meta object literal for the '<em><b>Uncomfortable Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL = eINSTANCE.getHIMSAAudiometricStandardType_UncomfortableLevel();

		/**
		 * The meta object literal for the '<em><b>Most Comfortable Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL = eINSTANCE.getHIMSAAudiometricStandardType_MostComfortableLevel();

		/**
		 * The meta object literal for the '<em><b>Speech Discrimination Audiogram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram();

		/**
		 * The meta object literal for the '<em><b>Speech Reception Threshold Audiogram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram();

		/**
		 * The meta object literal for the '<em><b>Speech Most Comfortable Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL = eINSTANCE.getHIMSAAudiometricStandardType_SpeechMostComfortableLevel();

		/**
		 * The meta object literal for the '<em><b>Speech Uncomfortable Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL = eINSTANCE.getHIMSAAudiometricStandardType_SpeechUncomfortableLevel();

		/**
		 * The meta object literal for the '<em><b>Tone Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES = eINSTANCE.getHIMSAAudiometricStandardType_ToneNotes();

		/**
		 * The meta object literal for the '<em><b>Speech Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES = eINSTANCE.getHIMSAAudiometricStandardType_SpeechNotes();

		/**
		 * The meta object literal for the '<em><b>Frequencies Used For Tone Average</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE = eINSTANCE.getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage();

		/**
		 * The meta object literal for the '<em><b>Decay Audiogram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_DecayAudiogram();

		/**
		 * The meta object literal for the '<em><b>Alternate Binaural Loudness Balance Audiogram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram();

		/**
		 * The meta object literal for the '<em><b>Stenger Audiogram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM = eINSTANCE.getHIMSAAudiometricStandardType_StengerAudiogram();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Intensity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY = eINSTANCE.getHIMSAAudiometricStandardType_DifferenceLimenIntensity();

		/**
		 * The meta object literal for the '<em><b>Difference Limen Frequency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY = eINSTANCE.getHIMSAAudiometricStandardType_DifferenceLimenFrequency();

		/**
		 * The meta object literal for the '<em><b>Short Increment Sensitivity Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX = eINSTANCE.getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex();

		/**
		 * The meta object literal for the '<em><b>Private Audiogram Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA = eINSTANCE.getHIMSAAudiometricStandardType_PrivateAudiogramData();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getHIMSAAudiometricStandardType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getHIMSAAudiometricStandardType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION = eINSTANCE.getHIMSAAudiometricStandardType_Version();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMeasurementNotesType()
		 * @generated
		 */
		EClass MEASUREMENT_NOTES_TYPE = eINSTANCE.getMeasurementNotesType();

		/**
		 * The meta object literal for the '<em><b>Audiometer Make Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL = eINSTANCE.getMeasurementNotesType_AudiometerMakeModel();

		/**
		 * The meta object literal for the '<em><b>Audiometer Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER = eINSTANCE.getMeasurementNotesType_AudiometerSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Audiometer Last Calibration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION = eINSTANCE.getMeasurementNotesType_AudiometerLastCalibration();

		/**
		 * The meta object literal for the '<em><b>Test Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__TEST_METHOD = eINSTANCE.getMeasurementNotesType_TestMethod();

		/**
		 * The meta object literal for the '<em><b>Test Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY = eINSTANCE.getMeasurementNotesType_TestReliability();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.MostComfortableLevelTypeImpl <em>Most Comfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.MostComfortableLevelTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMostComfortableLevelType()
		 * @generated
		 */
		EClass MOST_COMFORTABLE_LEVEL_TYPE = eINSTANCE.getMostComfortableLevelType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getMostComfortableLevelType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Tone Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS = eINSTANCE.getMostComfortableLevelType_TonePoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl <em>Short Increment Sensitivity Index Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getShortIncrementSensitivityIndexPoint()
		 * @generated
		 */
		EClass SHORT_INCREMENT_SENSITIVITY_INDEX_POINT = eINSTANCE.getShortIncrementSensitivityIndexPoint();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY = eINSTANCE.getShortIncrementSensitivityIndexPoint_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL = eINSTANCE.getShortIncrementSensitivityIndexPoint_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY = eINSTANCE.getShortIncrementSensitivityIndexPoint_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL = eINSTANCE.getShortIncrementSensitivityIndexPoint_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Modulation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE = eINSTANCE.getShortIncrementSensitivityIndexPoint_ModulationSize();

		/**
		 * The meta object literal for the '<em><b>Number Of Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS = eINSTANCE.getShortIncrementSensitivityIndexPoint_NumberOfAnswers();

		/**
		 * The meta object literal for the '<em><b>Number Of Increments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS = eINSTANCE.getShortIncrementSensitivityIndexPoint_NumberOfIncrements();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexTypeImpl <em>Short Increment Sensitivity Index Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getShortIncrementSensitivityIndexType()
		 * @generated
		 */
		EClass SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE = eINSTANCE.getShortIncrementSensitivityIndexType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getShortIncrementSensitivityIndexType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Short Increment Sensitivity Index Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS = eINSTANCE.getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.SpeechDiscriminationAudiogramTypeImpl <em>Speech Discrimination Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.SpeechDiscriminationAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechDiscriminationAudiogramType()
		 * @generated
		 */
		EClass SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE = eINSTANCE.getSpeechDiscriminationAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getSpeechDiscriminationAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Speech Discrimination Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__SPEECH_DISCRIMINATION_POINTS = eINSTANCE.getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.SpeechMostComfortableLevelTypeImpl <em>Speech Most Comfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.SpeechMostComfortableLevelTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechMostComfortableLevelType()
		 * @generated
		 */
		EClass SPEECH_MOST_COMFORTABLE_LEVEL_TYPE = eINSTANCE.getSpeechMostComfortableLevelType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getSpeechMostComfortableLevelType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Speech Most Comfortable Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT = eINSTANCE.getSpeechMostComfortableLevelType_SpeechMostComfortablePoint();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl <em>Speech Reception Threshold Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechReceptionThresholdAudiogramType()
		 * @generated
		 */
		EClass SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE = eINSTANCE.getSpeechReceptionThresholdAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Speech Reception Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS = eINSTANCE.getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl <em>Speech Score Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechScorePointType()
		 * @generated
		 */
		EClass SPEECH_SCORE_POINT_TYPE = eINSTANCE.getSpeechScorePointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL = eINSTANCE.getSpeechScorePointType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL = eINSTANCE.getSpeechScorePointType_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Score Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT = eINSTANCE.getSpeechScorePointType_ScorePercent();

		/**
		 * The meta object literal for the '<em><b>Number Of Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS = eINSTANCE.getSpeechScorePointType_NumberOfWords();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.SpeechUncomfortableLevelTypeImpl <em>Speech Uncomfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.SpeechUncomfortableLevelTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechUncomfortableLevelType()
		 * @generated
		 */
		EClass SPEECH_UNCOMFORTABLE_LEVEL_TYPE = eINSTANCE.getSpeechUncomfortableLevelType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getSpeechUncomfortableLevelType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Speech Uncomfortable Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT = eINSTANCE.getSpeechUncomfortableLevelType_SpeechUncomfortablePoint();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.StengerAudiogramTypeImpl <em>Stenger Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.StengerAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStengerAudiogramType()
		 * @generated
		 */
		EClass STENGER_AUDIOGRAM_TYPE = eINSTANCE.getStengerAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getStengerAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Stenger Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STENGER_AUDIOGRAM_TYPE__STENGER_POINTS = eINSTANCE.getStengerAudiogramType_StengerPoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.TonePointsTypeImpl <em>Tone Points Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.TonePointsTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTonePointsType()
		 * @generated
		 */
		EClass TONE_POINTS_TYPE = eINSTANCE.getTonePointsType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TONE_POINTS_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getTonePointsType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TONE_POINTS_TYPE__STIMULUS_LEVEL = eINSTANCE.getTonePointsType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TONE_POINTS_TYPE__MASKING_FREQUENCY = eINSTANCE.getTonePointsType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TONE_POINTS_TYPE__MASKING_LEVEL = eINSTANCE.getTonePointsType_MaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Tone Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TONE_POINTS_TYPE__TONE_POINT_STATUS = eINSTANCE.getTonePointsType_TonePointStatus();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.ToneThresholdAudiogramTypeImpl <em>Tone Threshold Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.ToneThresholdAudiogramTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneThresholdAudiogramType()
		 * @generated
		 */
		EClass TONE_THRESHOLD_AUDIOGRAM_TYPE = eINSTANCE.getToneThresholdAudiogramType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TONE_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getToneThresholdAudiogramType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Tone Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TONE_THRESHOLD_AUDIOGRAM_TYPE__TONE_POINTS = eINSTANCE.getToneThresholdAudiogramType_TonePoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.impl.UncomfortableLevelTypeImpl <em>Uncomfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.impl.UncomfortableLevelTypeImpl
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getUncomfortableLevelType()
		 * @generated
		 */
		EClass UNCOMFORTABLE_LEVEL_TYPE = eINSTANCE.getUncomfortableLevelType();

		/**
		 * The meta object literal for the '<em><b>Aud Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS = eINSTANCE.getUncomfortableLevelType_AudMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Tone Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCOMFORTABLE_LEVEL_TYPE__TONE_POINTS = eINSTANCE.getUncomfortableLevelType_TonePoints();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterType()
		 * @generated
		 */
		EEnum AUXILIARY_PARAMETER_TYPE = eINSTANCE.getAuxiliaryParameterType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.DBweightingType <em>DBweighting Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.DBweightingType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDBweightingType()
		 * @generated
		 */
		EEnum DBWEIGHTING_TYPE = eINSTANCE.getDBweightingType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentConditionType()
		 * @generated
		 */
		EEnum HEARING_INSTRUMENT_CONDITION_TYPE = eINSTANCE.getHearingInstrumentConditionType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.PointStatusType <em>Point Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.PointStatusType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPointStatusType()
		 * @generated
		 */
		EEnum POINT_STATUS_TYPE = eINSTANCE.getPointStatusType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.PresentationType <em>Presentation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.PresentationType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPresentationType()
		 * @generated
		 */
		EEnum PRESENTATION_TYPE = eINSTANCE.getPresentationType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SignalOutputType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SignalType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.SpeechThresholdType <em>Speech Threshold Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SpeechThresholdType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechThresholdType()
		 * @generated
		 */
		EEnum SPEECH_THRESHOLD_TYPE = eINSTANCE.getSpeechThresholdType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.ToneAverageType <em>Tone Average Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.ToneAverageType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneAverageType()
		 * @generated
		 */
		EEnum TONE_AVERAGE_TYPE = eINSTANCE.getToneAverageType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerCalibrationStandardType()
		 * @generated
		 */
		EEnum TRANSDUCER_CALIBRATION_STANDARD_TYPE = eINSTANCE.getTransducerCalibrationStandardType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.TransducerType <em>Transducer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.TransducerType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerType()
		 * @generated
		 */
		EEnum TRANSDUCER_TYPE = eINSTANCE.getTransducerType();

		/**
		 * The meta object literal for the '<em>Audiometer Make Model Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudiometerMakeModelType()
		 * @generated
		 */
		EDataType AUDIOMETER_MAKE_MODEL_TYPE = eINSTANCE.getAudiometerMakeModelType();

		/**
		 * The meta object literal for the '<em>Audiometer Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAudiometerSerialNumberType()
		 * @generated
		 */
		EDataType AUDIOMETER_SERIAL_NUMBER_TYPE = eINSTANCE.getAudiometerSerialNumberType();

		/**
		 * The meta object literal for the '<em>Auxiliary Parameter Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterDescriptionType()
		 * @generated
		 */
		EDataType AUXILIARY_PARAMETER_DESCRIPTION_TYPE = eINSTANCE.getAuxiliaryParameterDescriptionType();

		/**
		 * The meta object literal for the '<em>Auxiliary Parameter Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.AuxiliaryParameterType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getAuxiliaryParameterTypeObject()
		 * @generated
		 */
		EDataType AUXILIARY_PARAMETER_TYPE_OBJECT = eINSTANCE.getAuxiliaryParameterTypeObject();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>DBweighting Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.DBweightingType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getDBweightingTypeObject()
		 * @generated
		 */
		EDataType DBWEIGHTING_TYPE_OBJECT = eINSTANCE.getDBweightingTypeObject();

		/**
		 * The meta object literal for the '<em>End Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getEndTimeType()
		 * @generated
		 */
		EDataType END_TIME_TYPE = eINSTANCE.getEndTimeType();

		/**
		 * The meta object literal for the '<em>Hearing Instrument Condition Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.HearingInstrumentConditionType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentConditionTypeObject()
		 * @generated
		 */
		EDataType HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT = eINSTANCE.getHearingInstrumentConditionTypeObject();

		/**
		 * The meta object literal for the '<em>Hearing Instrument Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getHearingInstrumentDescriptionType()
		 * @generated
		 */
		EDataType HEARING_INSTRUMENT_DESCRIPTION_TYPE = eINSTANCE.getHearingInstrumentDescriptionType();

		/**
		 * The meta object literal for the '<em>Left Ear1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.ToneAverageType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getLeftEar1Type()
		 * @generated
		 */
		EDataType LEFT_EAR1_TYPE = eINSTANCE.getLeftEar1Type();

		/**
		 * The meta object literal for the '<em>Masking Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingAmplitudeModulationType()
		 * @generated
		 */
		EDataType MASKING_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getMaskingAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingFrequencyModulationType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_MODULATION_TYPE = eINSTANCE.getMaskingFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Masking Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE = eINSTANCE.getMaskingLevelType();

		/**
		 * The meta object literal for the '<em>Masking Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType1()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE1 = eINSTANCE.getMaskingLevelType1();

		/**
		 * The meta object literal for the '<em>Masking Level Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType2()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE2 = eINSTANCE.getMaskingLevelType2();

		/**
		 * The meta object literal for the '<em>Masking Level Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType3()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE3 = eINSTANCE.getMaskingLevelType3();

		/**
		 * The meta object literal for the '<em>Masking Level Type4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType4()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE4 = eINSTANCE.getMaskingLevelType4();

		/**
		 * The meta object literal for the '<em>Masking Level Type5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingLevelType5()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE5 = eINSTANCE.getMaskingLevelType5();

		/**
		 * The meta object literal for the '<em>Masking Off Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingOffTimeType()
		 * @generated
		 */
		EDataType MASKING_OFF_TIME_TYPE = eINSTANCE.getMaskingOffTimeType();

		/**
		 * The meta object literal for the '<em>Masking On Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingOnTimeType()
		 * @generated
		 */
		EDataType MASKING_ON_TIME_TYPE = eINSTANCE.getMaskingOnTimeType();

		/**
		 * The meta object literal for the '<em>Masking Pulse Cycle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingPulseCycleType()
		 * @generated
		 */
		EDataType MASKING_PULSE_CYCLE_TYPE = eINSTANCE.getMaskingPulseCycleType();

		/**
		 * The meta object literal for the '<em>Masking Pulse Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingPulseModulationType()
		 * @generated
		 */
		EDataType MASKING_PULSE_MODULATION_TYPE = eINSTANCE.getMaskingPulseModulationType();

		/**
		 * The meta object literal for the '<em>Masking Si Si Parameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingSiSiParameterType()
		 * @generated
		 */
		EDataType MASKING_SI_SI_PARAMETER_TYPE = eINSTANCE.getMaskingSiSiParameterType();

		/**
		 * The meta object literal for the '<em>Masking Warble Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getMaskingWarbleModulationSizeType()
		 * @generated
		 */
		EDataType MASKING_WARBLE_MODULATION_SIZE_TYPE = eINSTANCE.getMaskingWarbleModulationSizeType();

		/**
		 * The meta object literal for the '<em>Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE = eINSTANCE.getModulationSizeType();

		/**
		 * The meta object literal for the '<em>Modulation Size Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType1()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE1 = eINSTANCE.getModulationSizeType1();

		/**
		 * The meta object literal for the '<em>Modulation Size Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getModulationSizeType2()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE2 = eINSTANCE.getModulationSizeType2();

		/**
		 * The meta object literal for the '<em>Point Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.PointStatusType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPointStatusTypeObject()
		 * @generated
		 */
		EDataType POINT_STATUS_TYPE_OBJECT = eINSTANCE.getPointStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Presentation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.PresentationType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getPresentationTypeObject()
		 * @generated
		 */
		EDataType PRESENTATION_TYPE_OBJECT = eINSTANCE.getPresentationTypeObject();

		/**
		 * The meta object literal for the '<em>Score Percent Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getScorePercentType()
		 * @generated
		 */
		EDataType SCORE_PERCENT_TYPE = eINSTANCE.getScorePercentType();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SignalOutputType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SignalType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSignalTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_OBJECT = eINSTANCE.getSignalTypeObject();

		/**
		 * The meta object literal for the '<em>Speech Threshold Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SpeechThresholdType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getSpeechThresholdTypeObject()
		 * @generated
		 */
		EDataType SPEECH_THRESHOLD_TYPE_OBJECT = eINSTANCE.getSpeechThresholdTypeObject();

		/**
		 * The meta object literal for the '<em>Start Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStartTimeType()
		 * @generated
		 */
		EDataType START_TIME_TYPE = eINSTANCE.getStartTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusAmplitudeModulationType()
		 * @generated
		 */
		EDataType STIMULUS_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getStimulusAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusFrequencyModulationType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_MODULATION_TYPE = eINSTANCE.getStimulusFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE = eINSTANCE.getStimulusLevelType();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType1()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE1 = eINSTANCE.getStimulusLevelType1();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType2()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE2 = eINSTANCE.getStimulusLevelType2();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType3()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE3 = eINSTANCE.getStimulusLevelType3();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType4()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE4 = eINSTANCE.getStimulusLevelType4();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusLevelType5()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE5 = eINSTANCE.getStimulusLevelType5();

		/**
		 * The meta object literal for the '<em>Stimulus Off Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusOffTimeType()
		 * @generated
		 */
		EDataType STIMULUS_OFF_TIME_TYPE = eINSTANCE.getStimulusOffTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus On Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusOnTimeType()
		 * @generated
		 */
		EDataType STIMULUS_ON_TIME_TYPE = eINSTANCE.getStimulusOnTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Presentation Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.PresentationType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPresentationTypeType()
		 * @generated
		 */
		EDataType STIMULUS_PRESENTATION_TYPE_TYPE = eINSTANCE.getStimulusPresentationTypeType();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Cycle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPulseCycleType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_CYCLE_TYPE = eINSTANCE.getStimulusPulseCycleType();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusPulseModulationType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_MODULATION_TYPE = eINSTANCE.getStimulusPulseModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Signal Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.SignalType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusSignalTypeType()
		 * @generated
		 */
		EDataType STIMULUS_SIGNAL_TYPE_TYPE = eINSTANCE.getStimulusSignalTypeType();

		/**
		 * The meta object literal for the '<em>Stimulus Si Si Parameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusSiSiParameterType()
		 * @generated
		 */
		EDataType STIMULUS_SI_SI_PARAMETER_TYPE = eINSTANCE.getStimulusSiSiParameterType();

		/**
		 * The meta object literal for the '<em>Stimulus Warble Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getStimulusWarbleModulationSizeType()
		 * @generated
		 */
		EDataType STIMULUS_WARBLE_MODULATION_SIZE_TYPE = eINSTANCE.getStimulusWarbleModulationSizeType();

		/**
		 * The meta object literal for the '<em>Test Method Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTestMethodType()
		 * @generated
		 */
		EDataType TEST_METHOD_TYPE = eINSTANCE.getTestMethodType();

		/**
		 * The meta object literal for the '<em>Test Reliability Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTestReliabilityType()
		 * @generated
		 */
		EDataType TEST_RELIABILITY_TYPE = eINSTANCE.getTestReliabilityType();

		/**
		 * The meta object literal for the '<em>Tone Average Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.ToneAverageType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getToneAverageTypeObject()
		 * @generated
		 */
		EDataType TONE_AVERAGE_TYPE_OBJECT = eINSTANCE.getToneAverageTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Calibration Standard Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.TransducerCalibrationStandardType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerCalibrationStandardTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT = eINSTANCE.getTransducerCalibrationStandardTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerDescriptionType()
		 * @generated
		 */
		EDataType TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Transducer Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.TransducerType
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getTransducerTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_TYPE_OBJECT = eINSTANCE.getTransducerTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em>Word List Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.audiogram.impl.AudiogramPackageImpl#getWordListNameType()
		 * @generated
		 */
		EDataType WORD_LIST_NAME_TYPE = eINSTANCE.getWordListNameType();

	}

} //AudiogramPackage
