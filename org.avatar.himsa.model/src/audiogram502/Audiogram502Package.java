/*
 */
package audiogram502;


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
 * @see audiogram502.Audiogram502Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = Audiogram502Package.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/audiogram_502.ecore", ecoreSourceLocations="/model/audiogram_502.ecore")
public interface Audiogram502Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "audiogram502";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/Audiogram/502";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ag502";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Audiogram502Package eINSTANCE = audiogram502.impl.Audiogram502PackageImpl.init();

	/**
	 * The meta object id for the '{@link audiogram502.impl.AdditionalMasking2TypeImpl <em>Additional Masking2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.AdditionalMasking2TypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMasking2Type()
	 * @generated
	 */
	int ADDITIONAL_MASKING2_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Additional Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Additional Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Additional Masking2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING2_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Additional Masking2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING2_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.AdditionalMaskingTypeImpl <em>Additional Masking Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.AdditionalMaskingTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingType()
	 * @generated
	 */
	int ADDITIONAL_MASKING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Additional Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Additional Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Additional Masking Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Additional Masking Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Additional Masking Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_MASKING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl <em>Alternate Binaural Loudness Balance Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	int ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE = 2;

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
	 * The meta object id for the '{@link audiogram502.impl.AudioMetricMeasurementConditionsTypeImpl <em>Audio Metric Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.AudioMetricMeasurementConditionsTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE = 3;

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
	 * The feature id for the '<em><b>Estimated Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__ESTIMATED_RESULT = 39;

	/**
	 * The feature id for the '<em><b>Device Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__DEVICE_SOLUTIONS = 40;

	/**
	 * The number of structural features of the '<em>Audio Metric Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE_FEATURE_COUNT = 41;

	/**
	 * The number of operations of the '<em>Audio Metric Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.DecayAudiogramTypeImpl <em>Decay Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DecayAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDecayAudiogramType()
	 * @generated
	 */
	int DECAY_AUDIOGRAM_TYPE = 4;

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
	 * The meta object id for the '{@link audiogram502.impl.DecayPointTypeImpl <em>Decay Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DecayPointTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDecayPointType()
	 * @generated
	 */
	int DECAY_POINT_TYPE = 5;

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
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE__ADDITIONAL_MASKING_POINT = 6;

	/**
	 * The number of structural features of the '<em>Decay Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Decay Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.DeviceSolutionsTypeImpl <em>Device Solutions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DeviceSolutionsTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDeviceSolutionsType()
	 * @generated
	 */
	int DEVICE_SOLUTIONS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Right Ear Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Left Ear Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Device Solutions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SOLUTIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Solutions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SOLUTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.DifferenceLimenFrequencyPointTypeImpl <em>Difference Limen Frequency Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DifferenceLimenFrequencyPointTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE = 7;

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
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__ADDITIONAL_MASKING_POINT = 6;

	/**
	 * The number of structural features of the '<em>Difference Limen Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Difference Limen Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.DifferenceLimenFrequencyTypeImpl <em>Difference Limen Frequency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DifferenceLimenFrequencyTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenFrequencyType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_FREQUENCY_TYPE = 8;

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
	 * The meta object id for the '{@link audiogram502.impl.DifferenceLimenIntensityPointTypeImpl <em>Difference Limen Intensity Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DifferenceLimenIntensityPointTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE = 9;

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
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__ADDITIONAL_MASKING_POINT = 6;

	/**
	 * The number of structural features of the '<em>Difference Limen Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Difference Limen Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.DifferenceLimenIntensityTypeImpl <em>Difference Limen Intensity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DifferenceLimenIntensityTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenIntensityType()
	 * @generated
	 */
	int DIFFERENCE_LIMEN_INTENSITY_TYPE = 10;

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
	 * The meta object id for the '{@link audiogram502.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.DocumentRootImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

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
	 * The meta object id for the '{@link audiogram502.impl.FrequenciesUsedForToneAverageTypeImpl <em>Frequencies Used For Tone Average Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.FrequenciesUsedForToneAverageTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	int FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE = 12;

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
	 * The meta object id for the '{@link audiogram502.impl.HIMSAAudiometricStandardTypeImpl <em>HIMSA Audiometric Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.HIMSAAudiometricStandardTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getHIMSAAudiometricStandardType()
	 * @generated
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE = 13;

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
	 * The feature id for the '<em><b>Weber Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__WEBER_POINTS = 17;

	/**
	 * The feature id for the '<em><b>Supplementary Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__SUPPLEMENTARY_DATA = 18;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD = 19;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH = 20;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION = 21;

	/**
	 * The number of structural features of the '<em>HIMSA Audiometric Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>HIMSA Audiometric Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOMETRIC_STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.InformationTypeImpl <em>Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.InformationTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getInformationType()
	 * @generated
	 */
	int INFORMATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.MeasurementNotesTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMeasurementNotesType()
	 * @generated
	 */
	int MEASUREMENT_NOTES_TYPE = 15;

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
	 * The feature id for the '<em><b>Is Deaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__IS_DEAF = 5;

	/**
	 * The number of structural features of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.MostComfortableLevelTypeImpl <em>Most Comfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.MostComfortableLevelTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMostComfortableLevelType()
	 * @generated
	 */
	int MOST_COMFORTABLE_LEVEL_TYPE = 16;

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
	 * The meta object id for the '{@link audiogram502.impl.ShortIncrementSensitivityIndexPointImpl <em>Short Increment Sensitivity Index Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.ShortIncrementSensitivityIndexPointImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT = 17;

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
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__ADDITIONAL_MASKING_POINT = 7;

	/**
	 * The number of structural features of the '<em>Short Increment Sensitivity Index Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Short Increment Sensitivity Index Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.ShortIncrementSensitivityIndexTypeImpl <em>Short Increment Sensitivity Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.ShortIncrementSensitivityIndexTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	int SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE = 18;

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
	 * The meta object id for the '{@link audiogram502.impl.SpeechDiscriminationAudiogramTypeImpl <em>Speech Discrimination Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SpeechDiscriminationAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	int SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE = 19;

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
	 * The meta object id for the '{@link audiogram502.impl.SpeechMostComfortableLevelTypeImpl <em>Speech Most Comfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SpeechMostComfortableLevelTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechMostComfortableLevelType()
	 * @generated
	 */
	int SPEECH_MOST_COMFORTABLE_LEVEL_TYPE = 20;

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
	 * The meta object id for the '{@link audiogram502.impl.SpeechReceptionThresholdAudiogramTypeImpl <em>Speech Reception Threshold Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SpeechReceptionThresholdAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	int SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE = 21;

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
	 * The meta object id for the '{@link audiogram502.impl.SpeechScorePointTypeImpl <em>Speech Score Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SpeechScorePointTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechScorePointType()
	 * @generated
	 */
	int SPEECH_SCORE_POINT_TYPE = 22;

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
	 * The feature id for the '<em><b>Speech Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT = 5;

	/**
	 * The number of structural features of the '<em>Speech Score Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Speech Score Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_SCORE_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.SpeechUncomfortableLevelTypeImpl <em>Speech Uncomfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SpeechUncomfortableLevelTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechUncomfortableLevelType()
	 * @generated
	 */
	int SPEECH_UNCOMFORTABLE_LEVEL_TYPE = 23;

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
	 * The meta object id for the '{@link audiogram502.impl.StengerAudiogramTypeImpl <em>Stenger Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.StengerAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStengerAudiogramType()
	 * @generated
	 */
	int STENGER_AUDIOGRAM_TYPE = 24;

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
	 * The meta object id for the '{@link audiogram502.impl.SupplementaryDataTypeImpl <em>Supplementary Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.SupplementaryDataTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSupplementaryDataType()
	 * @generated
	 */
	int SUPPLEMENTARY_DATA_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_DATA_TYPE__INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_DATA_TYPE__ANY = 1;

	/**
	 * The number of structural features of the '<em>Supplementary Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Supplementary Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.TonePointsTypeImpl <em>Tone Points Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.TonePointsTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTonePointsType()
	 * @generated
	 */
	int TONE_POINTS_TYPE = 26;

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
	 * The feature id for the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT = 5;

	/**
	 * The number of structural features of the '<em>Tone Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tone Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_POINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.ToneThresholdAudiogramTypeImpl <em>Tone Threshold Audiogram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.ToneThresholdAudiogramTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getToneThresholdAudiogramType()
	 * @generated
	 */
	int TONE_THRESHOLD_AUDIOGRAM_TYPE = 27;

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
	 * The meta object id for the '{@link audiogram502.impl.UncomfortableLevelTypeImpl <em>Uncomfortable Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.UncomfortableLevelTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getUncomfortableLevelType()
	 * @generated
	 */
	int UNCOMFORTABLE_LEVEL_TYPE = 28;

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
	 * The meta object id for the '{@link audiogram502.impl.WeberPointsTypeImpl <em>Weber Points Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.WeberPointsTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointsType()
	 * @generated
	 */
	int WEBER_POINTS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Weber Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINTS_TYPE__WEBER_POINT = 0;

	/**
	 * The number of structural features of the '<em>Weber Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Weber Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.impl.WeberPointTypeImpl <em>Weber Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.impl.WeberPointTypeImpl
	 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointType()
	 * @generated
	 */
	int WEBER_POINT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINT_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINT_TYPE__STIMULUS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Point Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINT_TYPE__POINT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Weber Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Weber Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBER_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link audiogram502.AidedSolutionsType <em>Aided Solutions Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.AidedSolutionsType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAidedSolutionsType()
	 * @generated
	 */
	int AIDED_SOLUTIONS_TYPE = 31;

	/**
	 * The meta object id for the '{@link audiogram502.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.AuxiliaryParameterType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterType()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_TYPE = 32;

	/**
	 * The meta object id for the '{@link audiogram502.DBweightingType <em>DBweighting Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.DBweightingType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDBweightingType()
	 * @generated
	 */
	int DBWEIGHTING_TYPE = 33;

	/**
	 * The meta object id for the '{@link audiogram502.EarType <em>Ear Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.EarType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getEarType()
	 * @generated
	 */
	int EAR_TYPE = 34;

	/**
	 * The meta object id for the '{@link audiogram502.EstimatedResultByType <em>Estimated Result By Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.EstimatedResultByType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getEstimatedResultByType()
	 * @generated
	 */
	int ESTIMATED_RESULT_BY_TYPE = 35;

	/**
	 * The meta object id for the '{@link audiogram502.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.HearingInstrumentConditionType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentConditionType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_CONDITION_TYPE = 36;

	/**
	 * The meta object id for the '{@link audiogram502.PointStatusType <em>Point Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.PointStatusType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getPointStatusType()
	 * @generated
	 */
	int POINT_STATUS_TYPE = 37;

	/**
	 * The meta object id for the '{@link audiogram502.PresentationType <em>Presentation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.PresentationType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getPresentationType()
	 * @generated
	 */
	int PRESENTATION_TYPE = 38;

	/**
	 * The meta object id for the '{@link audiogram502.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SignalOutputType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 39;

	/**
	 * The meta object id for the '{@link audiogram502.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SignalType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 40;

	/**
	 * The meta object id for the '{@link audiogram502.SpeechThresholdType <em>Speech Threshold Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SpeechThresholdType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechThresholdType()
	 * @generated
	 */
	int SPEECH_THRESHOLD_TYPE = 41;

	/**
	 * The meta object id for the '{@link audiogram502.ToneAverageType <em>Tone Average Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.ToneAverageType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getToneAverageType()
	 * @generated
	 */
	int TONE_AVERAGE_TYPE = 42;

	/**
	 * The meta object id for the '{@link audiogram502.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.TransducerCalibrationStandardType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerCalibrationStandardType()
	 * @generated
	 */
	int TRANSDUCER_CALIBRATION_STANDARD_TYPE = 43;

	/**
	 * The meta object id for the '{@link audiogram502.TransducerType <em>Transducer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.TransducerType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerType()
	 * @generated
	 */
	int TRANSDUCER_TYPE = 44;

	/**
	 * The meta object id for the '{@link audiogram502.WeberPointStatusType <em>Weber Point Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.WeberPointStatusType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointStatusType()
	 * @generated
	 */
	int WEBER_POINT_STATUS_TYPE = 45;

	/**
	 * The meta object id for the '<em>Additional Masking Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingLevelType()
	 * @generated
	 */
	int ADDITIONAL_MASKING_LEVEL_TYPE = 46;

	/**
	 * The meta object id for the '<em>Additional Masking Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingLevelType1()
	 * @generated
	 */
	int ADDITIONAL_MASKING_LEVEL_TYPE1 = 47;

	/**
	 * The meta object id for the '<em>Additional Stimulus Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalStimulusLevelType()
	 * @generated
	 */
	int ADDITIONAL_STIMULUS_LEVEL_TYPE = 48;

	/**
	 * The meta object id for the '<em>Additional Stimulus Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalStimulusLevelType1()
	 * @generated
	 */
	int ADDITIONAL_STIMULUS_LEVEL_TYPE1 = 49;

	/**
	 * The meta object id for the '<em>Aided Solutions Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.AidedSolutionsType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAidedSolutionsTypeObject()
	 * @generated
	 */
	int AIDED_SOLUTIONS_TYPE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Audiometer Make Model Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAudiometerMakeModelType()
	 * @generated
	 */
	int AUDIOMETER_MAKE_MODEL_TYPE = 51;

	/**
	 * The meta object id for the '<em>Audiometer Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAudiometerSerialNumberType()
	 * @generated
	 */
	int AUDIOMETER_SERIAL_NUMBER_TYPE = 52;

	/**
	 * The meta object id for the '<em>Auxiliary Parameter Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterDescriptionType()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_DESCRIPTION_TYPE = 53;

	/**
	 * The meta object id for the '<em>Auxiliary Parameter Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.AuxiliaryParameterType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterTypeObject()
	 * @generated
	 */
	int AUXILIARY_PARAMETER_TYPE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see audiogram502.impl.Audiogram502PackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 55;

	/**
	 * The meta object id for the '<em>DBweighting Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.DBweightingType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getDBweightingTypeObject()
	 * @generated
	 */
	int DBWEIGHTING_TYPE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Ear Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.EarType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getEarTypeObject()
	 * @generated
	 */
	int EAR_TYPE_OBJECT = 57;

	/**
	 * The meta object id for the '<em>End Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getEndTimeType()
	 * @generated
	 */
	int END_TIME_TYPE = 58;

	/**
	 * The meta object id for the '<em>Estimated Result By Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.EstimatedResultByType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getEstimatedResultByTypeObject()
	 * @generated
	 */
	int ESTIMATED_RESULT_BY_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Hearing Instrument Condition Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.HearingInstrumentConditionType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentConditionTypeObject()
	 * @generated
	 */
	int HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT = 60;

	/**
	 * The meta object id for the '<em>Hearing Instrument Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentDescriptionType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_DESCRIPTION_TYPE = 61;

	/**
	 * The meta object id for the '<em>Left Ear1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.ToneAverageType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getLeftEar1Type()
	 * @generated
	 */
	int LEFT_EAR1_TYPE = 62;

	/**
	 * The meta object id for the '<em>Masking Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingAmplitudeModulationType()
	 * @generated
	 */
	int MASKING_AMPLITUDE_MODULATION_TYPE = 63;

	/**
	 * The meta object id for the '<em>Masking Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingFrequencyModulationType()
	 * @generated
	 */
	int MASKING_FREQUENCY_MODULATION_TYPE = 64;

	/**
	 * The meta object id for the '<em>Masking Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE = 65;

	/**
	 * The meta object id for the '<em>Masking Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType1()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE1 = 66;

	/**
	 * The meta object id for the '<em>Masking Level Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType2()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE2 = 67;

	/**
	 * The meta object id for the '<em>Masking Level Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType3()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE3 = 68;

	/**
	 * The meta object id for the '<em>Masking Level Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType4()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE4 = 69;

	/**
	 * The meta object id for the '<em>Masking Level Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType5()
	 * @generated
	 */
	int MASKING_LEVEL_TYPE5 = 70;

	/**
	 * The meta object id for the '<em>Masking Off Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingOffTimeType()
	 * @generated
	 */
	int MASKING_OFF_TIME_TYPE = 71;

	/**
	 * The meta object id for the '<em>Masking On Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingOnTimeType()
	 * @generated
	 */
	int MASKING_ON_TIME_TYPE = 72;

	/**
	 * The meta object id for the '<em>Masking Pulse Cycle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingPulseCycleType()
	 * @generated
	 */
	int MASKING_PULSE_CYCLE_TYPE = 73;

	/**
	 * The meta object id for the '<em>Masking Pulse Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingPulseModulationType()
	 * @generated
	 */
	int MASKING_PULSE_MODULATION_TYPE = 74;

	/**
	 * The meta object id for the '<em>Masking Si Si Parameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingSiSiParameterType()
	 * @generated
	 */
	int MASKING_SI_SI_PARAMETER_TYPE = 75;

	/**
	 * The meta object id for the '<em>Masking Warble Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingWarbleModulationSizeType()
	 * @generated
	 */
	int MASKING_WARBLE_MODULATION_SIZE_TYPE = 76;

	/**
	 * The meta object id for the '<em>Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE = 77;

	/**
	 * The meta object id for the '<em>Modulation Size Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType1()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE1 = 78;

	/**
	 * The meta object id for the '<em>Modulation Size Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType2()
	 * @generated
	 */
	int MODULATION_SIZE_TYPE2 = 79;

	/**
	 * The meta object id for the '<em>Point Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.PointStatusType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getPointStatusTypeObject()
	 * @generated
	 */
	int POINT_STATUS_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Presentation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.PresentationType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getPresentationTypeObject()
	 * @generated
	 */
	int PRESENTATION_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Score Percent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getScorePercentType()
	 * @generated
	 */
	int SCORE_PERCENT_TYPE = 82;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SignalOutputType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Signal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SignalType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Speech Threshold Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SpeechThresholdType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechThresholdTypeObject()
	 * @generated
	 */
	int SPEECH_THRESHOLD_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Start Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStartTimeType()
	 * @generated
	 */
	int START_TIME_TYPE = 86;

	/**
	 * The meta object id for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusAmplitudeModulationType()
	 * @generated
	 */
	int STIMULUS_AMPLITUDE_MODULATION_TYPE = 87;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusFrequencyModulationType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_MODULATION_TYPE = 88;

	/**
	 * The meta object id for the '<em>Stimulus Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE = 89;

	/**
	 * The meta object id for the '<em>Stimulus Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType1()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE1 = 90;

	/**
	 * The meta object id for the '<em>Stimulus Level Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType2()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE2 = 91;

	/**
	 * The meta object id for the '<em>Stimulus Level Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType3()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE3 = 92;

	/**
	 * The meta object id for the '<em>Stimulus Level Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType4()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE4 = 93;

	/**
	 * The meta object id for the '<em>Stimulus Level Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType5()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE5 = 94;

	/**
	 * The meta object id for the '<em>Stimulus Level Type6</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType6()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE6 = 95;

	/**
	 * The meta object id for the '<em>Stimulus Off Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusOffTimeType()
	 * @generated
	 */
	int STIMULUS_OFF_TIME_TYPE = 96;

	/**
	 * The meta object id for the '<em>Stimulus On Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusOnTimeType()
	 * @generated
	 */
	int STIMULUS_ON_TIME_TYPE = 97;

	/**
	 * The meta object id for the '<em>Stimulus Presentation Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.PresentationType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPresentationTypeType()
	 * @generated
	 */
	int STIMULUS_PRESENTATION_TYPE_TYPE = 98;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Cycle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPulseCycleType()
	 * @generated
	 */
	int STIMULUS_PULSE_CYCLE_TYPE = 99;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPulseModulationType()
	 * @generated
	 */
	int STIMULUS_PULSE_MODULATION_TYPE = 100;

	/**
	 * The meta object id for the '<em>Stimulus Signal Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.SignalType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusSignalTypeType()
	 * @generated
	 */
	int STIMULUS_SIGNAL_TYPE_TYPE = 101;

	/**
	 * The meta object id for the '<em>Stimulus Si Si Parameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusSiSiParameterType()
	 * @generated
	 */
	int STIMULUS_SI_SI_PARAMETER_TYPE = 102;

	/**
	 * The meta object id for the '<em>Stimulus Warble Modulation Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusWarbleModulationSizeType()
	 * @generated
	 */
	int STIMULUS_WARBLE_MODULATION_SIZE_TYPE = 103;

	/**
	 * The meta object id for the '<em>Test Method Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTestMethodType()
	 * @generated
	 */
	int TEST_METHOD_TYPE = 104;

	/**
	 * The meta object id for the '<em>Test Reliability Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTestReliabilityType()
	 * @generated
	 */
	int TEST_RELIABILITY_TYPE = 105;

	/**
	 * The meta object id for the '<em>Tone Average Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.ToneAverageType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getToneAverageTypeObject()
	 * @generated
	 */
	int TONE_AVERAGE_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Transducer Calibration Standard Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.TransducerCalibrationStandardType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerCalibrationStandardTypeObject()
	 * @generated
	 */
	int TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerDescriptionType()
	 * @generated
	 */
	int TRANSDUCER_DESCRIPTION_TYPE = 108;

	/**
	 * The meta object id for the '<em>Transducer Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.TransducerType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerTypeObject()
	 * @generated
	 */
	int TRANSDUCER_TYPE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see audiogram502.impl.Audiogram502PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 110;

	/**
	 * The meta object id for the '<em>Version Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see audiogram502.impl.Audiogram502PackageImpl#getVersionType1()
	 * @generated
	 */
	int VERSION_TYPE1 = 111;

	/**
	 * The meta object id for the '<em>Weber Point Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogram502.WeberPointStatusType
	 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointStatusTypeObject()
	 * @generated
	 */
	int WEBER_POINT_STATUS_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Word List Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see audiogram502.impl.Audiogram502PackageImpl#getWordListNameType()
	 * @generated
	 */
	int WORD_LIST_NAME_TYPE = 113;


	/**
	 * Returns the meta object for class '{@link audiogram502.AdditionalMasking2Type <em>Additional Masking2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Masking2 Type</em>'.
	 * @see audiogram502.AdditionalMasking2Type
	 * @generated
	 */
	EClass getAdditionalMasking2Type();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AdditionalMasking2Type#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Stimulus Level</em>'.
	 * @see audiogram502.AdditionalMasking2Type#getAdditionalStimulusLevel()
	 * @see #getAdditionalMasking2Type()
	 * @generated
	 */
	EAttribute getAdditionalMasking2Type_AdditionalStimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AdditionalMasking2Type#getAdditionalMaskingLevel <em>Additional Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Masking Level</em>'.
	 * @see audiogram502.AdditionalMasking2Type#getAdditionalMaskingLevel()
	 * @see #getAdditionalMasking2Type()
	 * @generated
	 */
	EAttribute getAdditionalMasking2Type_AdditionalMaskingLevel();

	/**
	 * Returns the meta object for class '{@link audiogram502.AdditionalMaskingType <em>Additional Masking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Masking Type</em>'.
	 * @see audiogram502.AdditionalMaskingType
	 * @generated
	 */
	EClass getAdditionalMaskingType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AdditionalMaskingType#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Stimulus Level</em>'.
	 * @see audiogram502.AdditionalMaskingType#getAdditionalStimulusLevel()
	 * @see #getAdditionalMaskingType()
	 * @generated
	 */
	EAttribute getAdditionalMaskingType_AdditionalStimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AdditionalMaskingType#getAdditionalMaskingLevel <em>Additional Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Masking Level</em>'.
	 * @see audiogram502.AdditionalMaskingType#getAdditionalMaskingLevel()
	 * @see #getAdditionalMaskingType()
	 * @generated
	 */
	EAttribute getAdditionalMaskingType_AdditionalMaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AdditionalMaskingType#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Masking Point Status</em>'.
	 * @see audiogram502.AdditionalMaskingType#getAdditionalMaskingPointStatus()
	 * @see #getAdditionalMaskingType()
	 * @generated
	 */
	EAttribute getAdditionalMaskingType_AdditionalMaskingPointStatus();

	/**
	 * Returns the meta object for class '{@link audiogram502.AlternateBinauralLoudnessBalanceAudiogramType <em>Alternate Binaural Loudness Balance Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate Binaural Loudness Balance Audiogram Type</em>'.
	 * @see audiogram502.AlternateBinauralLoudnessBalanceAudiogramType
	 * @generated
	 */
	EClass getAlternateBinauralLoudnessBalanceAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.AlternateBinauralLoudnessBalanceAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.AlternateBinauralLoudnessBalanceAudiogramType#getAudMeasurementConditions()
	 * @see #getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	EReference getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.AlternateBinauralLoudnessBalanceAudiogramType#getAlternateBinauralLoudnessBalancePoints <em>Alternate Binaural Loudness Balance Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternate Binaural Loudness Balance Points</em>'.
	 * @see audiogram502.AlternateBinauralLoudnessBalanceAudiogramType#getAlternateBinauralLoudnessBalancePoints()
	 * @see #getAlternateBinauralLoudnessBalanceAudiogramType()
	 * @generated
	 */
	EReference getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.AudioMetricMeasurementConditionsType <em>Audio Metric Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Metric Measurement Conditions Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType
	 * @generated
	 */
	EClass getAudioMetricMeasurementConditionsType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusSignalType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingSignalType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Output</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusSignalOutput()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Output</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingSignalOutput()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusdBWeighting <em>Stimulusd BWeighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulusd BWeighting</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusdBWeighting()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusdBWeighting();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingdBWeighting <em>Maskingd BWeighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maskingd BWeighting</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingdBWeighting()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingdBWeighting();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusPresentationType <em>Stimulus Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Presentation Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusPresentationType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPresentationType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingPresentationType <em>Masking Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Presentation Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingPresentationType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPresentationType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusTransducerType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingTransducerType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getTransducerDescription <em>Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transducer Description</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getTransducerDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_TransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard <em>Stimulus Transducer Calibration Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Calibration Standard</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusTransducerCalibrationStandard()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard <em>Masking Transducer Calibration Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Calibration Standard</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingTransducerCalibrationStandard()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition <em>Hearing Instrument1 Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument1 Condition</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrument1Condition()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument1Condition();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition <em>Hearing Instrument2 Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument2 Condition</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrument2Condition()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument2Condition();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription <em>Hearing Instrument Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument Description</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getHearingInstrumentDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_HearingInstrumentDescription();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusAuxiliary <em>Stimulus Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Auxiliary</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusAuxiliary()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusAuxiliary();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingAuxiliary <em>Masking Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Auxiliary</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingAuxiliary()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingAuxiliary();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getWordListName <em>Word List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word List Name</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getWordListName()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_WordListName();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription <em>Auxiliary Parameter Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary Parameter Description</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getAuxiliaryParameterDescription()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getSpeechThresholdType <em>Speech Threshold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speech Threshold Type</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getSpeechThresholdType()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_SpeechThresholdType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusOnTime <em>Stimulus On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus On Time</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusOnTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusOnTime();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingOnTime <em>Masking On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking On Time</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingOnTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingOnTime();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusOffTime <em>Stimulus Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Off Time</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusOffTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusOffTime();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingOffTime <em>Masking Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Off Time</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingOffTime()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingOffTime();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter <em>Stimulus Si Si Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Si Si Parameter</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusSiSiParameter()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusSiSiParameter();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter <em>Masking Si Si Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Si Si Parameter</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingSiSiParameter()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingSiSiParameter();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation <em>Stimulus Warble Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Warble Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusWarbleModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation <em>Masking Warble Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Warble Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingWarbleModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize <em>Stimulus Warble Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Warble Modulation Size</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusWarbleModulationSize()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize <em>Masking Warble Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Warble Modulation Size</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingWarbleModulationSize()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusFrequencyModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingFrequencyModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Amplitude Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusAmplitudeModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Amplitude Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingAmplitudeModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusPulseModulation <em>Stimulus Pulse Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusPulseModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingPulseModulation <em>Masking Pulse Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Pulse Modulation</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingPulseModulation()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseModulation();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getStimulusPulseCycle <em>Stimulus Pulse Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Cycle</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getStimulusPulseCycle()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseCycle();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getMaskingPulseCycle <em>Masking Pulse Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Pulse Cycle</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getMaskingPulseCycle()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseCycle();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.AudioMetricMeasurementConditionsType#getEstimatedResult <em>Estimated Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Result</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getEstimatedResult()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getAudioMetricMeasurementConditionsType_EstimatedResult();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.AudioMetricMeasurementConditionsType#getDeviceSolutions <em>Device Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Solutions</em>'.
	 * @see audiogram502.AudioMetricMeasurementConditionsType#getDeviceSolutions()
	 * @see #getAudioMetricMeasurementConditionsType()
	 * @generated
	 */
	EReference getAudioMetricMeasurementConditionsType_DeviceSolutions();

	/**
	 * Returns the meta object for class '{@link audiogram502.DecayAudiogramType <em>Decay Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decay Audiogram Type</em>'.
	 * @see audiogram502.DecayAudiogramType
	 * @generated
	 */
	EClass getDecayAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DecayAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.DecayAudiogramType#getAudMeasurementConditions()
	 * @see #getDecayAudiogramType()
	 * @generated
	 */
	EReference getDecayAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.DecayAudiogramType#getDecayPoints <em>Decay Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decay Points</em>'.
	 * @see audiogram502.DecayAudiogramType#getDecayPoints()
	 * @see #getDecayAudiogramType()
	 * @generated
	 */
	EReference getDecayAudiogramType_DecayPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.DecayPointType <em>Decay Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decay Point Type</em>'.
	 * @see audiogram502.DecayPointType
	 * @generated
	 */
	EClass getDecayPointType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.DecayPointType#getStimulusFrequency()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.DecayPointType#getStimulusLevel()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see audiogram502.DecayPointType#getMaskingFrequency()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.DecayPointType#getMaskingLevel()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see audiogram502.DecayPointType#getStartTime()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DecayPointType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see audiogram502.DecayPointType#getEndTime()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EAttribute getDecayPointType_EndTime();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DecayPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.DecayPointType#getAdditionalMaskingPoint()
	 * @see #getDecayPointType()
	 * @generated
	 */
	EReference getDecayPointType_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.DeviceSolutionsType <em>Device Solutions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Solutions Type</em>'.
	 * @see audiogram502.DeviceSolutionsType
	 * @generated
	 */
	EClass getDeviceSolutionsType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DeviceSolutionsType#getRightEarDevice <em>Right Ear Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Ear Device</em>'.
	 * @see audiogram502.DeviceSolutionsType#getRightEarDevice()
	 * @see #getDeviceSolutionsType()
	 * @generated
	 */
	EAttribute getDeviceSolutionsType_RightEarDevice();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DeviceSolutionsType#getLeftEarDevice <em>Left Ear Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Ear Device</em>'.
	 * @see audiogram502.DeviceSolutionsType#getLeftEarDevice()
	 * @see #getDeviceSolutionsType()
	 * @generated
	 */
	EAttribute getDeviceSolutionsType_LeftEarDevice();

	/**
	 * Returns the meta object for class '{@link audiogram502.DifferenceLimenFrequencyPointType <em>Difference Limen Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Frequency Point Type</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType
	 * @generated
	 */
	EClass getDifferenceLimenFrequencyPointType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getStimulusFrequency()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getStimulusLevel()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getMaskingFrequency()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getMaskingLevel()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getModulationSize()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenFrequencyPointType#getDifferenceLimenFrequencyPointStatus <em>Difference Limen Frequency Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difference Limen Frequency Point Status</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getDifferenceLimenFrequencyPointStatus()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DifferenceLimenFrequencyPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyPointType#getAdditionalMaskingPoint()
	 * @see #getDifferenceLimenFrequencyPointType()
	 * @generated
	 */
	EReference getDifferenceLimenFrequencyPointType_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.DifferenceLimenFrequencyType <em>Difference Limen Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Frequency Type</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyType
	 * @generated
	 */
	EClass getDifferenceLimenFrequencyType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DifferenceLimenFrequencyType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyType#getAudMeasurementConditions()
	 * @see #getDifferenceLimenFrequencyType()
	 * @generated
	 */
	EReference getDifferenceLimenFrequencyType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.DifferenceLimenFrequencyType#getDifferenceLimenFrequencyPoints <em>Difference Limen Frequency Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Frequency Points</em>'.
	 * @see audiogram502.DifferenceLimenFrequencyType#getDifferenceLimenFrequencyPoints()
	 * @see #getDifferenceLimenFrequencyType()
	 * @generated
	 */
	EReference getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.DifferenceLimenIntensityPointType <em>Difference Limen Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Intensity Point Type</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType
	 * @generated
	 */
	EClass getDifferenceLimenIntensityPointType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getStimulusFrequency()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getStimulusLevel()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getMaskingFrequency()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getMaskingLevel()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getModulationSize()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difference Limen Intensity Point Status</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EAttribute getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DifferenceLimenIntensityPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.DifferenceLimenIntensityPointType#getAdditionalMaskingPoint()
	 * @see #getDifferenceLimenIntensityPointType()
	 * @generated
	 */
	EReference getDifferenceLimenIntensityPointType_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.DifferenceLimenIntensityType <em>Difference Limen Intensity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Limen Intensity Type</em>'.
	 * @see audiogram502.DifferenceLimenIntensityType
	 * @generated
	 */
	EClass getDifferenceLimenIntensityType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DifferenceLimenIntensityType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.DifferenceLimenIntensityType#getAudMeasurementConditions()
	 * @see #getDifferenceLimenIntensityType()
	 * @generated
	 */
	EReference getDifferenceLimenIntensityType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.DifferenceLimenIntensityType#getDifferenceLimenIntensityPoints <em>Difference Limen Intensity Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Intensity Points</em>'.
	 * @see audiogram502.DifferenceLimenIntensityType#getDifferenceLimenIntensityPoints()
	 * @see #getDifferenceLimenIntensityType()
	 * @generated
	 */
	EReference getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see audiogram502.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see audiogram502.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link audiogram502.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see audiogram502.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link audiogram502.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see audiogram502.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.DocumentRoot#getAudMeasurementConditions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiometric Standard</em>'.
	 * @see audiogram502.DocumentRoot#getHIMSAAudiometricStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIMSAAudiometricStandard();

	/**
	 * Returns the meta object for class '{@link audiogram502.FrequenciesUsedForToneAverageType <em>Frequencies Used For Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequencies Used For Tone Average Type</em>'.
	 * @see audiogram502.FrequenciesUsedForToneAverageType
	 * @generated
	 */
	EClass getFrequenciesUsedForToneAverageType();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.FrequenciesUsedForToneAverageType#getLeftEar1 <em>Left Ear1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Left Ear1</em>'.
	 * @see audiogram502.FrequenciesUsedForToneAverageType#getLeftEar1()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_LeftEar1();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.FrequenciesUsedForToneAverageType#getLeftEar2 <em>Left Ear2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Left Ear2</em>'.
	 * @see audiogram502.FrequenciesUsedForToneAverageType#getLeftEar2()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_LeftEar2();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.FrequenciesUsedForToneAverageType#getRightEar1 <em>Right Ear1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Right Ear1</em>'.
	 * @see audiogram502.FrequenciesUsedForToneAverageType#getRightEar1()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_RightEar1();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.FrequenciesUsedForToneAverageType#getRightEar2 <em>Right Ear2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Right Ear2</em>'.
	 * @see audiogram502.FrequenciesUsedForToneAverageType#getRightEar2()
	 * @see #getFrequenciesUsedForToneAverageType()
	 * @generated
	 */
	EAttribute getFrequenciesUsedForToneAverageType_RightEar2();

	/**
	 * Returns the meta object for class '{@link audiogram502.HIMSAAudiometricStandardType <em>HIMSA Audiometric Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIMSA Audiometric Standard Type</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType
	 * @generated
	 */
	EClass getHIMSAAudiometricStandardType();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getToneThresholdAudiogram <em>Tone Threshold Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Threshold Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getToneThresholdAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ToneThresholdAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getUncomfortableLevel <em>Uncomfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uncomfortable Level</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getUncomfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_UncomfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getMostComfortableLevel <em>Most Comfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Most Comfortable Level</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getMostComfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_MostComfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getSpeechDiscriminationAudiogram <em>Speech Discrimination Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Discrimination Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSpeechDiscriminationAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getSpeechReceptionThresholdAudiogram <em>Speech Reception Threshold Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Reception Threshold Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSpeechReceptionThresholdAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getSpeechMostComfortableLevel <em>Speech Most Comfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Most Comfortable Level</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSpeechMostComfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechMostComfortableLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getSpeechUncomfortableLevel <em>Speech Uncomfortable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Uncomfortable Level</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSpeechUncomfortableLevel()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechUncomfortableLevel();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getToneNotes <em>Tone Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tone Notes</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getToneNotes()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ToneNotes();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getSpeechNotes <em>Speech Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Notes</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSpeechNotes()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SpeechNotes();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage <em>Frequencies Used For Tone Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequencies Used For Tone Average</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getDecayAudiogram <em>Decay Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decay Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getDecayAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DecayAudiogram();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram <em>Alternate Binaural Loudness Balance Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternate Binaural Loudness Balance Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getStengerAudiogram <em>Stenger Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stenger Audiogram</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getStengerAudiogram()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_StengerAudiogram();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getDifferenceLimenIntensity <em>Difference Limen Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Intensity</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getDifferenceLimenIntensity()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DifferenceLimenIntensity();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getDifferenceLimenFrequency <em>Difference Limen Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difference Limen Frequency</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getDifferenceLimenFrequency()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_DifferenceLimenFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.HIMSAAudiometricStandardType#getShortIncrementSensitivityIndex <em>Short Increment Sensitivity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Increment Sensitivity Index</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getShortIncrementSensitivityIndex()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.HIMSAAudiometricStandardType#getPrivateAudiogramData <em>Private Audiogram Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Audiogram Data</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getPrivateAudiogramData()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_PrivateAudiogramData();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getWeberPoints <em>Weber Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weber Points</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getWeberPoints()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_WeberPoints();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.HIMSAAudiometricStandardType#getSupplementaryData <em>Supplementary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplementary Data</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getSupplementaryData()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiometricStandardType_SupplementaryData();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.HIMSAAudiometricStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getConvertedFromDataStandard()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#isValidatedByNOAH()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.HIMSAAudiometricStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see audiogram502.HIMSAAudiometricStandardType#getVersion()
	 * @see #getHIMSAAudiometricStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiometricStandardType_Version();

	/**
	 * Returns the meta object for class '{@link audiogram502.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type</em>'.
	 * @see audiogram502.InformationType
	 * @generated
	 */
	EClass getInformationType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.InformationType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see audiogram502.InformationType#getComments()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Comments();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.InformationType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see audiogram502.InformationType#getVersion()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Version();

	/**
	 * Returns the meta object for class '{@link audiogram502.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Notes Type</em>'.
	 * @see audiogram502.MeasurementNotesType
	 * @generated
	 */
	EClass getMeasurementNotesType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Make Model</em>'.
	 * @see audiogram502.MeasurementNotesType#getAudiometerMakeModel()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerMakeModel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Serial Number</em>'.
	 * @see audiogram502.MeasurementNotesType#getAudiometerSerialNumber()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Last Calibration</em>'.
	 * @see audiogram502.MeasurementNotesType#getAudiometerLastCalibration()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_AudiometerLastCalibration();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getTestMethod <em>Test Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Method</em>'.
	 * @see audiogram502.MeasurementNotesType#getTestMethod()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TestMethod();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Reliability</em>'.
	 * @see audiogram502.MeasurementNotesType#getTestReliability()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TestReliability();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deaf</em>'.
	 * @see audiogram502.MeasurementNotesType#getIsDeaf()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_IsDeaf();

	/**
	 * Returns the meta object for class '{@link audiogram502.MostComfortableLevelType <em>Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Most Comfortable Level Type</em>'.
	 * @see audiogram502.MostComfortableLevelType
	 * @generated
	 */
	EClass getMostComfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.MostComfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.MostComfortableLevelType#getAudMeasurementConditions()
	 * @see #getMostComfortableLevelType()
	 * @generated
	 */
	EReference getMostComfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.MostComfortableLevelType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see audiogram502.MostComfortableLevelType#getTonePoints()
	 * @see #getMostComfortableLevelType()
	 * @generated
	 */
	EReference getMostComfortableLevelType_TonePoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.ShortIncrementSensitivityIndexPoint <em>Short Increment Sensitivity Index Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Increment Sensitivity Index Point</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint
	 * @generated
	 */
	EClass getShortIncrementSensitivityIndexPoint();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusFrequency()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusLevel()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingFrequency()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingLevel()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Size</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getModulationSize()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_ModulationSize();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Answers</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_NumberOfAnswers();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Increments</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EAttribute getShortIncrementSensitivityIndexPoint_NumberOfIncrements();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint#getAdditionalMaskingPoint()
	 * @see #getShortIncrementSensitivityIndexPoint()
	 * @generated
	 */
	EReference getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.ShortIncrementSensitivityIndexType <em>Short Increment Sensitivity Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Increment Sensitivity Index Type</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexType
	 * @generated
	 */
	EClass getShortIncrementSensitivityIndexType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.ShortIncrementSensitivityIndexType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexType#getAudMeasurementConditions()
	 * @see #getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	EReference getShortIncrementSensitivityIndexType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.ShortIncrementSensitivityIndexType#getShortIncrementSensitivityIndexPoints <em>Short Increment Sensitivity Index Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Increment Sensitivity Index Points</em>'.
	 * @see audiogram502.ShortIncrementSensitivityIndexType#getShortIncrementSensitivityIndexPoints()
	 * @see #getShortIncrementSensitivityIndexType()
	 * @generated
	 */
	EReference getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.SpeechDiscriminationAudiogramType <em>Speech Discrimination Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Discrimination Audiogram Type</em>'.
	 * @see audiogram502.SpeechDiscriminationAudiogramType
	 * @generated
	 */
	EClass getSpeechDiscriminationAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechDiscriminationAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.SpeechDiscriminationAudiogramType#getAudMeasurementConditions()
	 * @see #getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	EReference getSpeechDiscriminationAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.SpeechDiscriminationAudiogramType#getSpeechDiscriminationPoints <em>Speech Discrimination Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Discrimination Points</em>'.
	 * @see audiogram502.SpeechDiscriminationAudiogramType#getSpeechDiscriminationPoints()
	 * @see #getSpeechDiscriminationAudiogramType()
	 * @generated
	 */
	EReference getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.SpeechMostComfortableLevelType <em>Speech Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Most Comfortable Level Type</em>'.
	 * @see audiogram502.SpeechMostComfortableLevelType
	 * @generated
	 */
	EClass getSpeechMostComfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechMostComfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.SpeechMostComfortableLevelType#getAudMeasurementConditions()
	 * @see #getSpeechMostComfortableLevelType()
	 * @generated
	 */
	EReference getSpeechMostComfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechMostComfortableLevelType#getSpeechMostComfortablePoint <em>Speech Most Comfortable Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Most Comfortable Point</em>'.
	 * @see audiogram502.SpeechMostComfortableLevelType#getSpeechMostComfortablePoint()
	 * @see #getSpeechMostComfortableLevelType()
	 * @generated
	 */
	EReference getSpeechMostComfortableLevelType_SpeechMostComfortablePoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.SpeechReceptionThresholdAudiogramType <em>Speech Reception Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Reception Threshold Audiogram Type</em>'.
	 * @see audiogram502.SpeechReceptionThresholdAudiogramType
	 * @generated
	 */
	EClass getSpeechReceptionThresholdAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechReceptionThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.SpeechReceptionThresholdAudiogramType#getAudMeasurementConditions()
	 * @see #getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	EReference getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.SpeechReceptionThresholdAudiogramType#getSpeechReceptionPoints <em>Speech Reception Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech Reception Points</em>'.
	 * @see audiogram502.SpeechReceptionThresholdAudiogramType#getSpeechReceptionPoints()
	 * @see #getSpeechReceptionThresholdAudiogramType()
	 * @generated
	 */
	EReference getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.SpeechScorePointType <em>Speech Score Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Score Point Type</em>'.
	 * @see audiogram502.SpeechScorePointType
	 * @generated
	 */
	EClass getSpeechScorePointType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.SpeechScorePointType#getStimulusLevel()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.SpeechScorePointType#getMaskingLevel()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.SpeechScorePointType#getScorePercent <em>Score Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Percent</em>'.
	 * @see audiogram502.SpeechScorePointType#getScorePercent()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_ScorePercent();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Words</em>'.
	 * @see audiogram502.SpeechScorePointType#getNumberOfWords()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_NumberOfWords();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.SpeechScorePointType#getSpeechPointStatus <em>Speech Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speech Point Status</em>'.
	 * @see audiogram502.SpeechScorePointType#getSpeechPointStatus()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EAttribute getSpeechScorePointType_SpeechPointStatus();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechScorePointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.SpeechScorePointType#getAdditionalMaskingPoint()
	 * @see #getSpeechScorePointType()
	 * @generated
	 */
	EReference getSpeechScorePointType_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.SpeechUncomfortableLevelType <em>Speech Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Uncomfortable Level Type</em>'.
	 * @see audiogram502.SpeechUncomfortableLevelType
	 * @generated
	 */
	EClass getSpeechUncomfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechUncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.SpeechUncomfortableLevelType#getAudMeasurementConditions()
	 * @see #getSpeechUncomfortableLevelType()
	 * @generated
	 */
	EReference getSpeechUncomfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint <em>Speech Uncomfortable Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Uncomfortable Point</em>'.
	 * @see audiogram502.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint()
	 * @see #getSpeechUncomfortableLevelType()
	 * @generated
	 */
	EReference getSpeechUncomfortableLevelType_SpeechUncomfortablePoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.StengerAudiogramType <em>Stenger Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stenger Audiogram Type</em>'.
	 * @see audiogram502.StengerAudiogramType
	 * @generated
	 */
	EClass getStengerAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.StengerAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.StengerAudiogramType#getAudMeasurementConditions()
	 * @see #getStengerAudiogramType()
	 * @generated
	 */
	EReference getStengerAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.StengerAudiogramType#getStengerPoints <em>Stenger Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stenger Points</em>'.
	 * @see audiogram502.StengerAudiogramType#getStengerPoints()
	 * @see #getStengerAudiogramType()
	 * @generated
	 */
	EReference getStengerAudiogramType_StengerPoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.SupplementaryDataType <em>Supplementary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplementary Data Type</em>'.
	 * @see audiogram502.SupplementaryDataType
	 * @generated
	 */
	EClass getSupplementaryDataType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.SupplementaryDataType#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information</em>'.
	 * @see audiogram502.SupplementaryDataType#getInformation()
	 * @see #getSupplementaryDataType()
	 * @generated
	 */
	EReference getSupplementaryDataType_Information();

	/**
	 * Returns the meta object for the attribute list '{@link audiogram502.SupplementaryDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see audiogram502.SupplementaryDataType#getAny()
	 * @see #getSupplementaryDataType()
	 * @generated
	 */
	EAttribute getSupplementaryDataType_Any();

	/**
	 * Returns the meta object for class '{@link audiogram502.TonePointsType <em>Tone Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tone Points Type</em>'.
	 * @see audiogram502.TonePointsType
	 * @generated
	 */
	EClass getTonePointsType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.TonePointsType#getStimulusFrequency()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.TonePointsType#getStimulusLevel()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see audiogram502.TonePointsType#getMaskingFrequency()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_MaskingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.TonePointsType#getMaskingLevel <em>Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Level</em>'.
	 * @see audiogram502.TonePointsType#getMaskingLevel()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_MaskingLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tone Point Status</em>'.
	 * @see audiogram502.TonePointsType#getTonePointStatus()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EAttribute getTonePointsType_TonePointStatus();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.TonePointsType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Masking Point</em>'.
	 * @see audiogram502.TonePointsType#getAdditionalMaskingPoint()
	 * @see #getTonePointsType()
	 * @generated
	 */
	EReference getTonePointsType_AdditionalMaskingPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.ToneThresholdAudiogramType <em>Tone Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tone Threshold Audiogram Type</em>'.
	 * @see audiogram502.ToneThresholdAudiogramType
	 * @generated
	 */
	EClass getToneThresholdAudiogramType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.ToneThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.ToneThresholdAudiogramType#getAudMeasurementConditions()
	 * @see #getToneThresholdAudiogramType()
	 * @generated
	 */
	EReference getToneThresholdAudiogramType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.ToneThresholdAudiogramType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see audiogram502.ToneThresholdAudiogramType#getTonePoints()
	 * @see #getToneThresholdAudiogramType()
	 * @generated
	 */
	EReference getToneThresholdAudiogramType_TonePoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.UncomfortableLevelType <em>Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncomfortable Level Type</em>'.
	 * @see audiogram502.UncomfortableLevelType
	 * @generated
	 */
	EClass getUncomfortableLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogram502.UncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aud Measurement Conditions</em>'.
	 * @see audiogram502.UncomfortableLevelType#getAudMeasurementConditions()
	 * @see #getUncomfortableLevelType()
	 * @generated
	 */
	EReference getUncomfortableLevelType_AudMeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.UncomfortableLevelType#getTonePoints <em>Tone Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tone Points</em>'.
	 * @see audiogram502.UncomfortableLevelType#getTonePoints()
	 * @see #getUncomfortableLevelType()
	 * @generated
	 */
	EReference getUncomfortableLevelType_TonePoints();

	/**
	 * Returns the meta object for class '{@link audiogram502.WeberPointsType <em>Weber Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weber Points Type</em>'.
	 * @see audiogram502.WeberPointsType
	 * @generated
	 */
	EClass getWeberPointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogram502.WeberPointsType#getWeberPoint <em>Weber Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weber Point</em>'.
	 * @see audiogram502.WeberPointsType#getWeberPoint()
	 * @see #getWeberPointsType()
	 * @generated
	 */
	EReference getWeberPointsType_WeberPoint();

	/**
	 * Returns the meta object for class '{@link audiogram502.WeberPointType <em>Weber Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weber Point Type</em>'.
	 * @see audiogram502.WeberPointType
	 * @generated
	 */
	EClass getWeberPointType();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.WeberPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see audiogram502.WeberPointType#getStimulusFrequency()
	 * @see #getWeberPointType()
	 * @generated
	 */
	EAttribute getWeberPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.WeberPointType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see audiogram502.WeberPointType#getStimulusLevel()
	 * @see #getWeberPointType()
	 * @generated
	 */
	EAttribute getWeberPointType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link audiogram502.WeberPointType#getPointStatus <em>Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Status</em>'.
	 * @see audiogram502.WeberPointType#getPointStatus()
	 * @see #getWeberPointType()
	 * @generated
	 */
	EAttribute getWeberPointType_PointStatus();

	/**
	 * Returns the meta object for enum '{@link audiogram502.AidedSolutionsType <em>Aided Solutions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aided Solutions Type</em>'.
	 * @see audiogram502.AidedSolutionsType
	 * @generated
	 */
	EEnum getAidedSolutionsType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auxiliary Parameter Type</em>'.
	 * @see audiogram502.AuxiliaryParameterType
	 * @generated
	 */
	EEnum getAuxiliaryParameterType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.DBweightingType <em>DBweighting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBweighting Type</em>'.
	 * @see audiogram502.DBweightingType
	 * @generated
	 */
	EEnum getDBweightingType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.EarType <em>Ear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ear Type</em>'.
	 * @see audiogram502.EarType
	 * @generated
	 */
	EEnum getEarType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.EstimatedResultByType <em>Estimated Result By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estimated Result By Type</em>'.
	 * @see audiogram502.EstimatedResultByType
	 * @generated
	 */
	EEnum getEstimatedResultByType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hearing Instrument Condition Type</em>'.
	 * @see audiogram502.HearingInstrumentConditionType
	 * @generated
	 */
	EEnum getHearingInstrumentConditionType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.PointStatusType <em>Point Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Point Status Type</em>'.
	 * @see audiogram502.PointStatusType
	 * @generated
	 */
	EEnum getPointStatusType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Type</em>'.
	 * @see audiogram502.PresentationType
	 * @generated
	 */
	EEnum getPresentationType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see audiogram502.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see audiogram502.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.SpeechThresholdType <em>Speech Threshold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speech Threshold Type</em>'.
	 * @see audiogram502.SpeechThresholdType
	 * @generated
	 */
	EEnum getSpeechThresholdType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.ToneAverageType <em>Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tone Average Type</em>'.
	 * @see audiogram502.ToneAverageType
	 * @generated
	 */
	EEnum getToneAverageType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Calibration Standard Type</em>'.
	 * @see audiogram502.TransducerCalibrationStandardType
	 * @generated
	 */
	EEnum getTransducerCalibrationStandardType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.TransducerType <em>Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Type</em>'.
	 * @see audiogram502.TransducerType
	 * @generated
	 */
	EEnum getTransducerType();

	/**
	 * Returns the meta object for enum '{@link audiogram502.WeberPointStatusType <em>Weber Point Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weber Point Status Type</em>'.
	 * @see audiogram502.WeberPointStatusType
	 * @generated
	 */
	EEnum getWeberPointStatusType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Additional Masking Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Additional Masking Level Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='AdditionalMaskingLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getAdditionalMaskingLevelType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Additional Masking Level Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Additional Masking Level Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='AdditionalMaskingLevel_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getAdditionalMaskingLevelType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Additional Stimulus Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Additional Stimulus Level Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='AdditionalStimulusLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getAdditionalStimulusLevelType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Additional Stimulus Level Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Additional Stimulus Level Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='AdditionalStimulusLevel_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getAdditionalStimulusLevelType1();

	/**
	 * Returns the meta object for data type '{@link audiogram502.AidedSolutionsType <em>Aided Solutions Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aided Solutions Type Object</em>'.
	 * @see audiogram502.AidedSolutionsType
	 * @model instanceClass="audiogram502.AidedSolutionsType"
	 *        extendedMetaData="name='AidedSolutions_Type:Object' baseType='AidedSolutions_Type'"
	 * @generated
	 */
	EDataType getAidedSolutionsTypeObject();

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
	 * Returns the meta object for data type '{@link audiogram502.AuxiliaryParameterType <em>Auxiliary Parameter Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auxiliary Parameter Type Object</em>'.
	 * @see audiogram502.AuxiliaryParameterType
	 * @model instanceClass="audiogram502.AuxiliaryParameterType"
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
	 * Returns the meta object for data type '{@link audiogram502.DBweightingType <em>DBweighting Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DBweighting Type Object</em>'.
	 * @see audiogram502.DBweightingType
	 * @model instanceClass="audiogram502.DBweightingType"
	 *        extendedMetaData="name='dBweighting_Type:Object' baseType='dBweighting_Type'"
	 * @generated
	 */
	EDataType getDBweightingTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.EarType <em>Ear Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ear Type Object</em>'.
	 * @see audiogram502.EarType
	 * @model instanceClass="audiogram502.EarType"
	 *        extendedMetaData="name='Ear_Type:Object' baseType='Ear_Type'"
	 * @generated
	 */
	EDataType getEarTypeObject();

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
	 * Returns the meta object for data type '{@link audiogram502.EstimatedResultByType <em>Estimated Result By Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Estimated Result By Type Object</em>'.
	 * @see audiogram502.EstimatedResultByType
	 * @model instanceClass="audiogram502.EstimatedResultByType"
	 *        extendedMetaData="name='EstimatedResultBy_Type:Object' baseType='EstimatedResultBy_Type'"
	 * @generated
	 */
	EDataType getEstimatedResultByTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.HearingInstrumentConditionType <em>Hearing Instrument Condition Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hearing Instrument Condition Type Object</em>'.
	 * @see audiogram502.HearingInstrumentConditionType
	 * @model instanceClass="audiogram502.HearingInstrumentConditionType"
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
	 * Returns the meta object for data type '{@link audiogram502.ToneAverageType <em>Left Ear1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Left Ear1 Type</em>'.
	 * @see audiogram502.ToneAverageType
	 * @model instanceClass="audiogram502.ToneAverageType"
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
	 * Returns the meta object for data type '{@link audiogram502.PointStatusType <em>Point Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point Status Type Object</em>'.
	 * @see audiogram502.PointStatusType
	 * @model instanceClass="audiogram502.PointStatusType"
	 *        extendedMetaData="name='PointStatus_Type:Object' baseType='PointStatus_Type'"
	 * @generated
	 */
	EDataType getPointStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.PresentationType <em>Presentation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Presentation Type Object</em>'.
	 * @see audiogram502.PresentationType
	 * @model instanceClass="audiogram502.PresentationType"
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
	 * Returns the meta object for data type '{@link audiogram502.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see audiogram502.SignalOutputType
	 * @model instanceClass="audiogram502.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.SignalType <em>Signal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Object</em>'.
	 * @see audiogram502.SignalType
	 * @model instanceClass="audiogram502.SignalType"
	 *        extendedMetaData="name='Signal_Type:Object' baseType='Signal_Type'"
	 * @generated
	 */
	EDataType getSignalTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.SpeechThresholdType <em>Speech Threshold Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Speech Threshold Type Object</em>'.
	 * @see audiogram502.SpeechThresholdType
	 * @model instanceClass="audiogram502.SpeechThresholdType"
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
	 *        extendedMetaData="name='StimulusLevel_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Level Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Level Type6</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusLevel_._6_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusLevelType6();

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
	 * Returns the meta object for data type '{@link audiogram502.PresentationType <em>Stimulus Presentation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Presentation Type Type</em>'.
	 * @see audiogram502.PresentationType
	 * @model instanceClass="audiogram502.PresentationType"
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
	 * Returns the meta object for data type '{@link audiogram502.SignalType <em>Stimulus Signal Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Signal Type Type</em>'.
	 * @see audiogram502.SignalType
	 * @model instanceClass="audiogram502.SignalType"
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
	 * Returns the meta object for data type '{@link audiogram502.ToneAverageType <em>Tone Average Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tone Average Type Object</em>'.
	 * @see audiogram502.ToneAverageType
	 * @model instanceClass="audiogram502.ToneAverageType"
	 *        extendedMetaData="name='ToneAverage_Type:Object' baseType='ToneAverage_Type'"
	 * @generated
	 */
	EDataType getToneAverageTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogram502.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Calibration Standard Type Object</em>'.
	 * @see audiogram502.TransducerCalibrationStandardType
	 * @model instanceClass="audiogram502.TransducerCalibrationStandardType"
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
	 * Returns the meta object for data type '{@link audiogram502.TransducerType <em>Transducer Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Type Object</em>'.
	 * @see audiogram502.TransducerType
	 * @model instanceClass="audiogram502.TransducerType"
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
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getVersionType1();

	/**
	 * Returns the meta object for data type '{@link audiogram502.WeberPointStatusType <em>Weber Point Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weber Point Status Type Object</em>'.
	 * @see audiogram502.WeberPointStatusType
	 * @model instanceClass="audiogram502.WeberPointStatusType"
	 *        extendedMetaData="name='WeberPointStatus_Type:Object' baseType='WeberPointStatus_Type'"
	 * @generated
	 */
	EDataType getWeberPointStatusTypeObject();

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
	Audiogram502Factory getAudiogram502Factory();

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
		 * The meta object literal for the '{@link audiogram502.impl.AdditionalMasking2TypeImpl <em>Additional Masking2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.AdditionalMasking2TypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMasking2Type()
		 * @generated
		 */
		EClass ADDITIONAL_MASKING2_TYPE = eINSTANCE.getAdditionalMasking2Type();

		/**
		 * The meta object literal for the '<em><b>Additional Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL = eINSTANCE.getAdditionalMasking2Type_AdditionalStimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Additional Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL = eINSTANCE.getAdditionalMasking2Type_AdditionalMaskingLevel();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.AdditionalMaskingTypeImpl <em>Additional Masking Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.AdditionalMaskingTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingType()
		 * @generated
		 */
		EClass ADDITIONAL_MASKING_TYPE = eINSTANCE.getAdditionalMaskingType();

		/**
		 * The meta object literal for the '<em><b>Additional Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL = eINSTANCE.getAdditionalMaskingType_AdditionalStimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Additional Masking Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL = eINSTANCE.getAdditionalMaskingType_AdditionalMaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Additional Masking Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS = eINSTANCE.getAdditionalMaskingType_AdditionalMaskingPointStatus();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl <em>Alternate Binaural Loudness Balance Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAlternateBinauralLoudnessBalanceAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.AudioMetricMeasurementConditionsTypeImpl <em>Audio Metric Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.AudioMetricMeasurementConditionsTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAudioMetricMeasurementConditionsType()
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
		 * The meta object literal for the '<em><b>Estimated Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__ESTIMATED_RESULT = eINSTANCE.getAudioMetricMeasurementConditionsType_EstimatedResult();

		/**
		 * The meta object literal for the '<em><b>Device Solutions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__DEVICE_SOLUTIONS = eINSTANCE.getAudioMetricMeasurementConditionsType_DeviceSolutions();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.DecayAudiogramTypeImpl <em>Decay Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DecayAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDecayAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.DecayPointTypeImpl <em>Decay Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DecayPointTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDecayPointType()
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
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECAY_POINT_TYPE__ADDITIONAL_MASKING_POINT = eINSTANCE.getDecayPointType_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.DeviceSolutionsTypeImpl <em>Device Solutions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DeviceSolutionsTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDeviceSolutionsType()
		 * @generated
		 */
		EClass DEVICE_SOLUTIONS_TYPE = eINSTANCE.getDeviceSolutionsType();

		/**
		 * The meta object literal for the '<em><b>Right Ear Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE = eINSTANCE.getDeviceSolutionsType_RightEarDevice();

		/**
		 * The meta object literal for the '<em><b>Left Ear Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE = eINSTANCE.getDeviceSolutionsType_LeftEarDevice();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.DifferenceLimenFrequencyPointTypeImpl <em>Difference Limen Frequency Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DifferenceLimenFrequencyPointTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenFrequencyPointType()
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
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__ADDITIONAL_MASKING_POINT = eINSTANCE.getDifferenceLimenFrequencyPointType_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.DifferenceLimenFrequencyTypeImpl <em>Difference Limen Frequency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DifferenceLimenFrequencyTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenFrequencyType()
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
		 * The meta object literal for the '{@link audiogram502.impl.DifferenceLimenIntensityPointTypeImpl <em>Difference Limen Intensity Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DifferenceLimenIntensityPointTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenIntensityPointType()
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
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__ADDITIONAL_MASKING_POINT = eINSTANCE.getDifferenceLimenIntensityPointType_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.DifferenceLimenIntensityTypeImpl <em>Difference Limen Intensity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DifferenceLimenIntensityTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDifferenceLimenIntensityType()
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
		 * The meta object literal for the '{@link audiogram502.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.DocumentRootImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link audiogram502.impl.FrequenciesUsedForToneAverageTypeImpl <em>Frequencies Used For Tone Average Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.FrequenciesUsedForToneAverageTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getFrequenciesUsedForToneAverageType()
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
		 * The meta object literal for the '{@link audiogram502.impl.HIMSAAudiometricStandardTypeImpl <em>HIMSA Audiometric Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.HIMSAAudiometricStandardTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getHIMSAAudiometricStandardType()
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
		 * The meta object literal for the '<em><b>Weber Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__WEBER_POINTS = eINSTANCE.getHIMSAAudiometricStandardType_WeberPoints();

		/**
		 * The meta object literal for the '<em><b>Supplementary Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOMETRIC_STANDARD_TYPE__SUPPLEMENTARY_DATA = eINSTANCE.getHIMSAAudiometricStandardType_SupplementaryData();

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
		 * The meta object literal for the '{@link audiogram502.impl.InformationTypeImpl <em>Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.InformationTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getInformationType()
		 * @generated
		 */
		EClass INFORMATION_TYPE = eINSTANCE.getInformationType();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__COMMENTS = eINSTANCE.getInformationType_Comments();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__VERSION = eINSTANCE.getInformationType_Version();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.MeasurementNotesTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMeasurementNotesType()
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
		 * The meta object literal for the '<em><b>Is Deaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__IS_DEAF = eINSTANCE.getMeasurementNotesType_IsDeaf();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.MostComfortableLevelTypeImpl <em>Most Comfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.MostComfortableLevelTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMostComfortableLevelType()
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
		 * The meta object literal for the '{@link audiogram502.impl.ShortIncrementSensitivityIndexPointImpl <em>Short Increment Sensitivity Index Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.ShortIncrementSensitivityIndexPointImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getShortIncrementSensitivityIndexPoint()
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
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__ADDITIONAL_MASKING_POINT = eINSTANCE.getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.ShortIncrementSensitivityIndexTypeImpl <em>Short Increment Sensitivity Index Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.ShortIncrementSensitivityIndexTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getShortIncrementSensitivityIndexType()
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
		 * The meta object literal for the '{@link audiogram502.impl.SpeechDiscriminationAudiogramTypeImpl <em>Speech Discrimination Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SpeechDiscriminationAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechDiscriminationAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.SpeechMostComfortableLevelTypeImpl <em>Speech Most Comfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SpeechMostComfortableLevelTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechMostComfortableLevelType()
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
		 * The meta object literal for the '{@link audiogram502.impl.SpeechReceptionThresholdAudiogramTypeImpl <em>Speech Reception Threshold Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SpeechReceptionThresholdAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechReceptionThresholdAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.SpeechScorePointTypeImpl <em>Speech Score Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SpeechScorePointTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechScorePointType()
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
		 * The meta object literal for the '<em><b>Speech Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS = eINSTANCE.getSpeechScorePointType_SpeechPointStatus();

		/**
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT = eINSTANCE.getSpeechScorePointType_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.SpeechUncomfortableLevelTypeImpl <em>Speech Uncomfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SpeechUncomfortableLevelTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechUncomfortableLevelType()
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
		 * The meta object literal for the '{@link audiogram502.impl.StengerAudiogramTypeImpl <em>Stenger Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.StengerAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStengerAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.SupplementaryDataTypeImpl <em>Supplementary Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.SupplementaryDataTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSupplementaryDataType()
		 * @generated
		 */
		EClass SUPPLEMENTARY_DATA_TYPE = eINSTANCE.getSupplementaryDataType();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLEMENTARY_DATA_TYPE__INFORMATION = eINSTANCE.getSupplementaryDataType_Information();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLEMENTARY_DATA_TYPE__ANY = eINSTANCE.getSupplementaryDataType_Any();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.TonePointsTypeImpl <em>Tone Points Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.TonePointsTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTonePointsType()
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
		 * The meta object literal for the '<em><b>Additional Masking Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT = eINSTANCE.getTonePointsType_AdditionalMaskingPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.ToneThresholdAudiogramTypeImpl <em>Tone Threshold Audiogram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.ToneThresholdAudiogramTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getToneThresholdAudiogramType()
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
		 * The meta object literal for the '{@link audiogram502.impl.UncomfortableLevelTypeImpl <em>Uncomfortable Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.UncomfortableLevelTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getUncomfortableLevelType()
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
		 * The meta object literal for the '{@link audiogram502.impl.WeberPointsTypeImpl <em>Weber Points Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.WeberPointsTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointsType()
		 * @generated
		 */
		EClass WEBER_POINTS_TYPE = eINSTANCE.getWeberPointsType();

		/**
		 * The meta object literal for the '<em><b>Weber Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBER_POINTS_TYPE__WEBER_POINT = eINSTANCE.getWeberPointsType_WeberPoint();

		/**
		 * The meta object literal for the '{@link audiogram502.impl.WeberPointTypeImpl <em>Weber Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.impl.WeberPointTypeImpl
		 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointType()
		 * @generated
		 */
		EClass WEBER_POINT_TYPE = eINSTANCE.getWeberPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBER_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getWeberPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBER_POINT_TYPE__STIMULUS_LEVEL = eINSTANCE.getWeberPointType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Point Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBER_POINT_TYPE__POINT_STATUS = eINSTANCE.getWeberPointType_PointStatus();

		/**
		 * The meta object literal for the '{@link audiogram502.AidedSolutionsType <em>Aided Solutions Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.AidedSolutionsType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAidedSolutionsType()
		 * @generated
		 */
		EEnum AIDED_SOLUTIONS_TYPE = eINSTANCE.getAidedSolutionsType();

		/**
		 * The meta object literal for the '{@link audiogram502.AuxiliaryParameterType <em>Auxiliary Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.AuxiliaryParameterType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterType()
		 * @generated
		 */
		EEnum AUXILIARY_PARAMETER_TYPE = eINSTANCE.getAuxiliaryParameterType();

		/**
		 * The meta object literal for the '{@link audiogram502.DBweightingType <em>DBweighting Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.DBweightingType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDBweightingType()
		 * @generated
		 */
		EEnum DBWEIGHTING_TYPE = eINSTANCE.getDBweightingType();

		/**
		 * The meta object literal for the '{@link audiogram502.EarType <em>Ear Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.EarType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getEarType()
		 * @generated
		 */
		EEnum EAR_TYPE = eINSTANCE.getEarType();

		/**
		 * The meta object literal for the '{@link audiogram502.EstimatedResultByType <em>Estimated Result By Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.EstimatedResultByType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getEstimatedResultByType()
		 * @generated
		 */
		EEnum ESTIMATED_RESULT_BY_TYPE = eINSTANCE.getEstimatedResultByType();

		/**
		 * The meta object literal for the '{@link audiogram502.HearingInstrumentConditionType <em>Hearing Instrument Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.HearingInstrumentConditionType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentConditionType()
		 * @generated
		 */
		EEnum HEARING_INSTRUMENT_CONDITION_TYPE = eINSTANCE.getHearingInstrumentConditionType();

		/**
		 * The meta object literal for the '{@link audiogram502.PointStatusType <em>Point Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.PointStatusType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getPointStatusType()
		 * @generated
		 */
		EEnum POINT_STATUS_TYPE = eINSTANCE.getPointStatusType();

		/**
		 * The meta object literal for the '{@link audiogram502.PresentationType <em>Presentation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.PresentationType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getPresentationType()
		 * @generated
		 */
		EEnum PRESENTATION_TYPE = eINSTANCE.getPresentationType();

		/**
		 * The meta object literal for the '{@link audiogram502.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SignalOutputType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link audiogram502.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SignalType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '{@link audiogram502.SpeechThresholdType <em>Speech Threshold Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SpeechThresholdType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechThresholdType()
		 * @generated
		 */
		EEnum SPEECH_THRESHOLD_TYPE = eINSTANCE.getSpeechThresholdType();

		/**
		 * The meta object literal for the '{@link audiogram502.ToneAverageType <em>Tone Average Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.ToneAverageType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getToneAverageType()
		 * @generated
		 */
		EEnum TONE_AVERAGE_TYPE = eINSTANCE.getToneAverageType();

		/**
		 * The meta object literal for the '{@link audiogram502.TransducerCalibrationStandardType <em>Transducer Calibration Standard Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.TransducerCalibrationStandardType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerCalibrationStandardType()
		 * @generated
		 */
		EEnum TRANSDUCER_CALIBRATION_STANDARD_TYPE = eINSTANCE.getTransducerCalibrationStandardType();

		/**
		 * The meta object literal for the '{@link audiogram502.TransducerType <em>Transducer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.TransducerType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerType()
		 * @generated
		 */
		EEnum TRANSDUCER_TYPE = eINSTANCE.getTransducerType();

		/**
		 * The meta object literal for the '{@link audiogram502.WeberPointStatusType <em>Weber Point Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.WeberPointStatusType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointStatusType()
		 * @generated
		 */
		EEnum WEBER_POINT_STATUS_TYPE = eINSTANCE.getWeberPointStatusType();

		/**
		 * The meta object literal for the '<em>Additional Masking Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingLevelType()
		 * @generated
		 */
		EDataType ADDITIONAL_MASKING_LEVEL_TYPE = eINSTANCE.getAdditionalMaskingLevelType();

		/**
		 * The meta object literal for the '<em>Additional Masking Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalMaskingLevelType1()
		 * @generated
		 */
		EDataType ADDITIONAL_MASKING_LEVEL_TYPE1 = eINSTANCE.getAdditionalMaskingLevelType1();

		/**
		 * The meta object literal for the '<em>Additional Stimulus Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalStimulusLevelType()
		 * @generated
		 */
		EDataType ADDITIONAL_STIMULUS_LEVEL_TYPE = eINSTANCE.getAdditionalStimulusLevelType();

		/**
		 * The meta object literal for the '<em>Additional Stimulus Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAdditionalStimulusLevelType1()
		 * @generated
		 */
		EDataType ADDITIONAL_STIMULUS_LEVEL_TYPE1 = eINSTANCE.getAdditionalStimulusLevelType1();

		/**
		 * The meta object literal for the '<em>Aided Solutions Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.AidedSolutionsType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAidedSolutionsTypeObject()
		 * @generated
		 */
		EDataType AIDED_SOLUTIONS_TYPE_OBJECT = eINSTANCE.getAidedSolutionsTypeObject();

		/**
		 * The meta object literal for the '<em>Audiometer Make Model Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAudiometerMakeModelType()
		 * @generated
		 */
		EDataType AUDIOMETER_MAKE_MODEL_TYPE = eINSTANCE.getAudiometerMakeModelType();

		/**
		 * The meta object literal for the '<em>Audiometer Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAudiometerSerialNumberType()
		 * @generated
		 */
		EDataType AUDIOMETER_SERIAL_NUMBER_TYPE = eINSTANCE.getAudiometerSerialNumberType();

		/**
		 * The meta object literal for the '<em>Auxiliary Parameter Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterDescriptionType()
		 * @generated
		 */
		EDataType AUXILIARY_PARAMETER_DESCRIPTION_TYPE = eINSTANCE.getAuxiliaryParameterDescriptionType();

		/**
		 * The meta object literal for the '<em>Auxiliary Parameter Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.AuxiliaryParameterType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getAuxiliaryParameterTypeObject()
		 * @generated
		 */
		EDataType AUXILIARY_PARAMETER_TYPE_OBJECT = eINSTANCE.getAuxiliaryParameterTypeObject();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see audiogram502.impl.Audiogram502PackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>DBweighting Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.DBweightingType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getDBweightingTypeObject()
		 * @generated
		 */
		EDataType DBWEIGHTING_TYPE_OBJECT = eINSTANCE.getDBweightingTypeObject();

		/**
		 * The meta object literal for the '<em>Ear Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.EarType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getEarTypeObject()
		 * @generated
		 */
		EDataType EAR_TYPE_OBJECT = eINSTANCE.getEarTypeObject();

		/**
		 * The meta object literal for the '<em>End Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getEndTimeType()
		 * @generated
		 */
		EDataType END_TIME_TYPE = eINSTANCE.getEndTimeType();

		/**
		 * The meta object literal for the '<em>Estimated Result By Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.EstimatedResultByType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getEstimatedResultByTypeObject()
		 * @generated
		 */
		EDataType ESTIMATED_RESULT_BY_TYPE_OBJECT = eINSTANCE.getEstimatedResultByTypeObject();

		/**
		 * The meta object literal for the '<em>Hearing Instrument Condition Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.HearingInstrumentConditionType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentConditionTypeObject()
		 * @generated
		 */
		EDataType HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT = eINSTANCE.getHearingInstrumentConditionTypeObject();

		/**
		 * The meta object literal for the '<em>Hearing Instrument Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getHearingInstrumentDescriptionType()
		 * @generated
		 */
		EDataType HEARING_INSTRUMENT_DESCRIPTION_TYPE = eINSTANCE.getHearingInstrumentDescriptionType();

		/**
		 * The meta object literal for the '<em>Left Ear1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.ToneAverageType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getLeftEar1Type()
		 * @generated
		 */
		EDataType LEFT_EAR1_TYPE = eINSTANCE.getLeftEar1Type();

		/**
		 * The meta object literal for the '<em>Masking Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingAmplitudeModulationType()
		 * @generated
		 */
		EDataType MASKING_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getMaskingAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingFrequencyModulationType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_MODULATION_TYPE = eINSTANCE.getMaskingFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Masking Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE = eINSTANCE.getMaskingLevelType();

		/**
		 * The meta object literal for the '<em>Masking Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType1()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE1 = eINSTANCE.getMaskingLevelType1();

		/**
		 * The meta object literal for the '<em>Masking Level Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType2()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE2 = eINSTANCE.getMaskingLevelType2();

		/**
		 * The meta object literal for the '<em>Masking Level Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType3()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE3 = eINSTANCE.getMaskingLevelType3();

		/**
		 * The meta object literal for the '<em>Masking Level Type4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType4()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE4 = eINSTANCE.getMaskingLevelType4();

		/**
		 * The meta object literal for the '<em>Masking Level Type5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingLevelType5()
		 * @generated
		 */
		EDataType MASKING_LEVEL_TYPE5 = eINSTANCE.getMaskingLevelType5();

		/**
		 * The meta object literal for the '<em>Masking Off Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingOffTimeType()
		 * @generated
		 */
		EDataType MASKING_OFF_TIME_TYPE = eINSTANCE.getMaskingOffTimeType();

		/**
		 * The meta object literal for the '<em>Masking On Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingOnTimeType()
		 * @generated
		 */
		EDataType MASKING_ON_TIME_TYPE = eINSTANCE.getMaskingOnTimeType();

		/**
		 * The meta object literal for the '<em>Masking Pulse Cycle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingPulseCycleType()
		 * @generated
		 */
		EDataType MASKING_PULSE_CYCLE_TYPE = eINSTANCE.getMaskingPulseCycleType();

		/**
		 * The meta object literal for the '<em>Masking Pulse Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingPulseModulationType()
		 * @generated
		 */
		EDataType MASKING_PULSE_MODULATION_TYPE = eINSTANCE.getMaskingPulseModulationType();

		/**
		 * The meta object literal for the '<em>Masking Si Si Parameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingSiSiParameterType()
		 * @generated
		 */
		EDataType MASKING_SI_SI_PARAMETER_TYPE = eINSTANCE.getMaskingSiSiParameterType();

		/**
		 * The meta object literal for the '<em>Masking Warble Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getMaskingWarbleModulationSizeType()
		 * @generated
		 */
		EDataType MASKING_WARBLE_MODULATION_SIZE_TYPE = eINSTANCE.getMaskingWarbleModulationSizeType();

		/**
		 * The meta object literal for the '<em>Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE = eINSTANCE.getModulationSizeType();

		/**
		 * The meta object literal for the '<em>Modulation Size Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType1()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE1 = eINSTANCE.getModulationSizeType1();

		/**
		 * The meta object literal for the '<em>Modulation Size Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getModulationSizeType2()
		 * @generated
		 */
		EDataType MODULATION_SIZE_TYPE2 = eINSTANCE.getModulationSizeType2();

		/**
		 * The meta object literal for the '<em>Point Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.PointStatusType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getPointStatusTypeObject()
		 * @generated
		 */
		EDataType POINT_STATUS_TYPE_OBJECT = eINSTANCE.getPointStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Presentation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.PresentationType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getPresentationTypeObject()
		 * @generated
		 */
		EDataType PRESENTATION_TYPE_OBJECT = eINSTANCE.getPresentationTypeObject();

		/**
		 * The meta object literal for the '<em>Score Percent Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getScorePercentType()
		 * @generated
		 */
		EDataType SCORE_PERCENT_TYPE = eINSTANCE.getScorePercentType();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SignalOutputType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SignalType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSignalTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_OBJECT = eINSTANCE.getSignalTypeObject();

		/**
		 * The meta object literal for the '<em>Speech Threshold Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SpeechThresholdType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getSpeechThresholdTypeObject()
		 * @generated
		 */
		EDataType SPEECH_THRESHOLD_TYPE_OBJECT = eINSTANCE.getSpeechThresholdTypeObject();

		/**
		 * The meta object literal for the '<em>Start Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStartTimeType()
		 * @generated
		 */
		EDataType START_TIME_TYPE = eINSTANCE.getStartTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusAmplitudeModulationType()
		 * @generated
		 */
		EDataType STIMULUS_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getStimulusAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusFrequencyModulationType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_MODULATION_TYPE = eINSTANCE.getStimulusFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE = eINSTANCE.getStimulusLevelType();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType1()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE1 = eINSTANCE.getStimulusLevelType1();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType2()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE2 = eINSTANCE.getStimulusLevelType2();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType3()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE3 = eINSTANCE.getStimulusLevelType3();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType4()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE4 = eINSTANCE.getStimulusLevelType4();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType5()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE5 = eINSTANCE.getStimulusLevelType5();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type6</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusLevelType6()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE6 = eINSTANCE.getStimulusLevelType6();

		/**
		 * The meta object literal for the '<em>Stimulus Off Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusOffTimeType()
		 * @generated
		 */
		EDataType STIMULUS_OFF_TIME_TYPE = eINSTANCE.getStimulusOffTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus On Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusOnTimeType()
		 * @generated
		 */
		EDataType STIMULUS_ON_TIME_TYPE = eINSTANCE.getStimulusOnTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Presentation Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.PresentationType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPresentationTypeType()
		 * @generated
		 */
		EDataType STIMULUS_PRESENTATION_TYPE_TYPE = eINSTANCE.getStimulusPresentationTypeType();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Cycle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPulseCycleType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_CYCLE_TYPE = eINSTANCE.getStimulusPulseCycleType();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusPulseModulationType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_MODULATION_TYPE = eINSTANCE.getStimulusPulseModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Signal Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.SignalType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusSignalTypeType()
		 * @generated
		 */
		EDataType STIMULUS_SIGNAL_TYPE_TYPE = eINSTANCE.getStimulusSignalTypeType();

		/**
		 * The meta object literal for the '<em>Stimulus Si Si Parameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusSiSiParameterType()
		 * @generated
		 */
		EDataType STIMULUS_SI_SI_PARAMETER_TYPE = eINSTANCE.getStimulusSiSiParameterType();

		/**
		 * The meta object literal for the '<em>Stimulus Warble Modulation Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see audiogram502.impl.Audiogram502PackageImpl#getStimulusWarbleModulationSizeType()
		 * @generated
		 */
		EDataType STIMULUS_WARBLE_MODULATION_SIZE_TYPE = eINSTANCE.getStimulusWarbleModulationSizeType();

		/**
		 * The meta object literal for the '<em>Test Method Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTestMethodType()
		 * @generated
		 */
		EDataType TEST_METHOD_TYPE = eINSTANCE.getTestMethodType();

		/**
		 * The meta object literal for the '<em>Test Reliability Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTestReliabilityType()
		 * @generated
		 */
		EDataType TEST_RELIABILITY_TYPE = eINSTANCE.getTestReliabilityType();

		/**
		 * The meta object literal for the '<em>Tone Average Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.ToneAverageType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getToneAverageTypeObject()
		 * @generated
		 */
		EDataType TONE_AVERAGE_TYPE_OBJECT = eINSTANCE.getToneAverageTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Calibration Standard Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.TransducerCalibrationStandardType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerCalibrationStandardTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT = eINSTANCE.getTransducerCalibrationStandardTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerDescriptionType()
		 * @generated
		 */
		EDataType TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Transducer Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.TransducerType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getTransducerTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_TYPE_OBJECT = eINSTANCE.getTransducerTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see audiogram502.impl.Audiogram502PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em>Version Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see audiogram502.impl.Audiogram502PackageImpl#getVersionType1()
		 * @generated
		 */
		EDataType VERSION_TYPE1 = eINSTANCE.getVersionType1();

		/**
		 * The meta object literal for the '<em>Weber Point Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogram502.WeberPointStatusType
		 * @see audiogram502.impl.Audiogram502PackageImpl#getWeberPointStatusTypeObject()
		 * @generated
		 */
		EDataType WEBER_POINT_STATUS_TYPE_OBJECT = eINSTANCE.getWeberPointStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Word List Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see audiogram502.impl.Audiogram502PackageImpl#getWordListNameType()
		 * @generated
		 */
		EDataType WORD_LIST_NAME_TYPE = eINSTANCE.getWordListNameType();

	}

} //Audiogram502Package
