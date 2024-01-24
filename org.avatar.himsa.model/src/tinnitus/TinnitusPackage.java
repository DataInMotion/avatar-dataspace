/*
 */
package tinnitus;


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
 * @see tinnitus.TinnitusFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = TinnitusPackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/tinnitus.ecore", ecoreSourceLocations="/model/tinnitus.ecore")
public interface TinnitusPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tinnitus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/measurement/Tinnitus/500";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tinnitus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TinnitusPackage eINSTANCE = tinnitus.impl.TinnitusPackageImpl.init();

	/**
	 * The meta object id for the '{@link tinnitus.impl.BandwidthTypeImpl <em>Bandwidth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.BandwidthTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getBandwidthType()
	 * @generated
	 */
	int BANDWIDTH_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE__UPPER_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Upper Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE__UPPER_SLOPE = 1;

	/**
	 * The feature id for the '<em><b>Plateau Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE__PLATEAU_SLOPE = 2;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE__LOWER_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Lower Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE__LOWER_SLOPE = 4;

	/**
	 * The number of structural features of the '<em>Bandwidth Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bandwidth Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.IntensityType1Impl <em>Intensity Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.IntensityType1Impl
	 * @see tinnitus.impl.TinnitusPackageImpl#getIntensityType1()
	 * @generated
	 */
	int INTENSITY_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_TYPE1__INTENSITY = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_TYPE1__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Intensity Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intensity Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.MeasurementConditionsTypeImpl <em>Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.MeasurementConditionsTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementConditionsType()
	 * @generated
	 */
	int MEASUREMENT_CONDITIONS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Stimulus Signal Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Masking Signal Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Masking Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Masking Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Stimulus Transducer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Masking Transducer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Stimulus Transducer Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Masking Transducer Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION = 9;

	/**
	 * The feature id for the '<em><b>Masking Amplitude Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION = 10;

	/**
	 * The feature id for the '<em><b>Stimulus Bandwidth Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION = 11;

	/**
	 * The feature id for the '<em><b>Masking Bandwidth Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION = 12;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION = 13;

	/**
	 * The feature id for the '<em><b>Masking Frequency Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION = 14;

	/**
	 * The number of structural features of the '<em>Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.MeasurementEquipmentTypeImpl <em>Measurement Equipment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.MeasurementEquipmentTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementEquipmentType()
	 * @generated
	 */
	int MEASUREMENT_EQUIPMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Audiometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Audiometer Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Audiometer Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Measurement Equipment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_EQUIPMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Measurement Equipment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_EQUIPMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl <em>Measurement Frequency Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.MeasurementFrequencyPointTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementFrequencyPointType()
	 * @generated
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Intensity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY = 1;

	/**
	 * The feature id for the '<em><b>Stimulus Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH = 2;

	/**
	 * The feature id for the '<em><b>Stimulus Pulse Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY = 4;

	/**
	 * The feature id for the '<em><b>Masking Intensity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY = 5;

	/**
	 * The number of structural features of the '<em>Measurement Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Measurement Frequency Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FREQUENCY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.MeasurementIntensityPointTypeImpl <em>Measurement Intensity Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.MeasurementIntensityPointTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementIntensityPointType()
	 * @generated
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Stimulus Intensity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY = 0;

	/**
	 * The feature id for the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY = 1;

	/**
	 * The feature id for the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Masking Intensity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY = 3;

	/**
	 * The number of structural features of the '<em>Measurement Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Measurement Intensity Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_INTENSITY_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.MinimumMaskingLevelTypeImpl <em>Minimum Masking Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.MinimumMaskingLevelTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getMinimumMaskingLevelType()
	 * @generated
	 */
	int MINIMUM_MASKING_LEVEL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT = 1;

	/**
	 * The feature id for the '<em><b>Matching Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS = 2;

	/**
	 * The number of structural features of the '<em>Minimum Masking Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_MASKING_LEVEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Minimum Masking Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_MASKING_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.ResidualInhibitionTypeImpl <em>Residual Inhibition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.ResidualInhibitionTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getResidualInhibitionType()
	 * @generated
	 */
	int RESIDUAL_INHIBITION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Signal Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY = 1;

	/**
	 * The feature id for the '<em><b>Stimulus Exposure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Inhibition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME = 3;

	/**
	 * The feature id for the '<em><b>Pulse Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__PULSE_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Gap Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__GAP_DURATION = 5;

	/**
	 * The feature id for the '<em><b>Number Of Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES = 6;

	/**
	 * The feature id for the '<em><b>Inhibition Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS = 7;

	/**
	 * The feature id for the '<em><b>Perception Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION = 8;

	/**
	 * The number of structural features of the '<em>Residual Inhibition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Residual Inhibition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDUAL_INHIBITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.SignalTypeImpl <em>Signal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.SignalTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Signal Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__SIGNAL_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Other Signal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Signal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.TinnitusLoudnessMatchTypeImpl <em>Loudness Match Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.TinnitusLoudnessMatchTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusLoudnessMatchType()
	 * @generated
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_POINT = 1;

	/**
	 * The feature id for the '<em><b>Matching Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE__MATCHING_SUCCESS = 2;

	/**
	 * The number of structural features of the '<em>Loudness Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Loudness Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl <em>Measurement Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.TinnitusMeasurementDataTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMeasurementDataType()
	 * @generated
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Tinnitus Measurement Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES = 0;

	/**
	 * The feature id for the '<em><b>Tinnitus Measurement Equipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT = 1;

	/**
	 * The feature id for the '<em><b>Tinnitus Pitch Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH = 2;

	/**
	 * The feature id for the '<em><b>Tinnitus Loudness Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH = 3;

	/**
	 * The feature id for the '<em><b>Minimum Masking Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Residual Inhibition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Measurement Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Measurement Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.TinnitusMeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.TinnitusMeasurementNotesTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMeasurementNotesType()
	 * @generated
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Tinnitus Perception Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Tinnitus Temporal Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC = 1;

	/**
	 * The feature id for the '<em><b>Other Measurement Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES = 2;

	/**
	 * The number of structural features of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.TinnitusPitchMatchTypeImpl <em>Pitch Match Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.TinnitusPitchMatchTypeImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPitchMatchType()
	 * @generated
	 */
	int TINNITUS_PITCH_MATCH_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT = 1;

	/**
	 * The feature id for the '<em><b>Matching Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS = 2;

	/**
	 * The number of structural features of the '<em>Pitch Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pitch Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.impl.DocumentRootImpl
	 * @see tinnitus.impl.TinnitusPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 13;

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
	 * The feature id for the '<em><b>Tinnitus Measurement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TINNITUS_MEASUREMENT_DATA = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinnitus.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalOutputType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 14;

	/**
	 * The meta object id for the '{@link tinnitus.SignalTypesType <em>Signal Types Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalTypesType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalTypesType()
	 * @generated
	 */
	int SIGNAL_TYPES_TYPE = 15;

	/**
	 * The meta object id for the '{@link tinnitus.SignalUnitType <em>Signal Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalUnitType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalUnitType()
	 * @generated
	 */
	int SIGNAL_UNIT_TYPE = 16;

	/**
	 * The meta object id for the '{@link tinnitus.TinnitusInhibitionSucessType <em>Inhibition Sucess Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusInhibitionSucessType()
	 * @generated
	 */
	int TINNITUS_INHIBITION_SUCESS_TYPE = 17;

	/**
	 * The meta object id for the '{@link tinnitus.TinnitusMatchSucessType <em>Match Sucess Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusMatchSucessType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMatchSucessType()
	 * @generated
	 */
	int TINNITUS_MATCH_SUCESS_TYPE = 18;

	/**
	 * The meta object id for the '{@link tinnitus.TinnitusPerceptionLocationType <em>Perception Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPerceptionLocationType()
	 * @generated
	 */
	int TINNITUS_PERCEPTION_LOCATION_TYPE = 19;

	/**
	 * The meta object id for the '{@link tinnitus.TinnitusTemporalCharacteristicType <em>Temporal Characteristic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusTemporalCharacteristicType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusTemporalCharacteristicType()
	 * @generated
	 */
	int TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE = 20;

	/**
	 * The meta object id for the '{@link tinnitus.TransducerType <em>Transducer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TransducerType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTransducerType()
	 * @generated
	 */
	int TRANSDUCER_TYPE = 21;

	/**
	 * The meta object id for the '<em>Audiometer Make Model Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getAudiometerMakeModelType()
	 * @generated
	 */
	int AUDIOMETER_MAKE_MODEL_TYPE = 22;

	/**
	 * The meta object id for the '<em>Audiometer Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getAudiometerSerialNumberType()
	 * @generated
	 */
	int AUDIOMETER_SERIAL_NUMBER_TYPE = 23;

	/**
	 * The meta object id for the '<em>Gap Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getGapDurationType()
	 * @generated
	 */
	int GAP_DURATION_TYPE = 24;

	/**
	 * The meta object id for the '<em>Inhibition Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getInhibitionTimeType()
	 * @generated
	 */
	int INHIBITION_TIME_TYPE = 25;

	/**
	 * The meta object id for the '<em>Intensity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getIntensityType()
	 * @generated
	 */
	int INTENSITY_TYPE = 26;

	/**
	 * The meta object id for the '<em>Lower Limit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getLowerLimitType()
	 * @generated
	 */
	int LOWER_LIMIT_TYPE = 27;

	/**
	 * The meta object id for the '<em>Lower Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getLowerSlopeType()
	 * @generated
	 */
	int LOWER_SLOPE_TYPE = 28;

	/**
	 * The meta object id for the '<em>Masking Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingAmplitudeModulationType()
	 * @generated
	 */
	int MASKING_AMPLITUDE_MODULATION_TYPE = 29;

	/**
	 * The meta object id for the '<em>Masking Bandwidth Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingBandwidthModulationType()
	 * @generated
	 */
	int MASKING_BANDWIDTH_MODULATION_TYPE = 30;

	/**
	 * The meta object id for the '<em>Masking Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyModulationType()
	 * @generated
	 */
	int MASKING_FREQUENCY_MODULATION_TYPE = 31;

	/**
	 * The meta object id for the '<em>Masking Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyType()
	 * @generated
	 */
	int MASKING_FREQUENCY_TYPE = 32;

	/**
	 * The meta object id for the '<em>Masking Frequency Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyType1()
	 * @generated
	 */
	int MASKING_FREQUENCY_TYPE1 = 33;

	/**
	 * The meta object id for the '<em>Masking Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingTransducerDescriptionType()
	 * @generated
	 */
	int MASKING_TRANSDUCER_DESCRIPTION_TYPE = 34;

	/**
	 * The meta object id for the '<em>Number Of Cycles Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getNumberOfCyclesType()
	 * @generated
	 */
	int NUMBER_OF_CYCLES_TYPE = 35;

	/**
	 * The meta object id for the '<em>Other Measurement Notes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getOtherMeasurementNotesType()
	 * @generated
	 */
	int OTHER_MEASUREMENT_NOTES_TYPE = 36;

	/**
	 * The meta object id for the '<em>Other Signal Specification Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getOtherSignalSpecificationType()
	 * @generated
	 */
	int OTHER_SIGNAL_SPECIFICATION_TYPE = 37;

	/**
	 * The meta object id for the '<em>Plateau Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getPlateauSlopeType()
	 * @generated
	 */
	int PLATEAU_SLOPE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Pulse Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getPulseDurationType()
	 * @generated
	 */
	int PULSE_DURATION_TYPE = 39;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalOutputType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Signal Types Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalTypesType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalTypesTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPES_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Signal Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.SignalUnitType
	 * @see tinnitus.impl.TinnitusPackageImpl#getSignalUnitTypeObject()
	 * @generated
	 */
	int SIGNAL_UNIT_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusAmplitudeModulationType()
	 * @generated
	 */
	int STIMULUS_AMPLITUDE_MODULATION_TYPE = 43;

	/**
	 * The meta object id for the '<em>Stimulus Bandwidth Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusBandwidthModulationType()
	 * @generated
	 */
	int STIMULUS_BANDWIDTH_MODULATION_TYPE = 44;

	/**
	 * The meta object id for the '<em>Stimulus Exposure Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusExposureTimeType()
	 * @generated
	 */
	int STIMULUS_EXPOSURE_TIME_TYPE = 45;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyModulationType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_MODULATION_TYPE = 46;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_TYPE = 47;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyType1()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_TYPE1 = 48;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusPulseDurationType()
	 * @generated
	 */
	int STIMULUS_PULSE_DURATION_TYPE = 49;

	/**
	 * The meta object id for the '<em>Stimulus Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusTransducerDescriptionType()
	 * @generated
	 */
	int STIMULUS_TRANSDUCER_DESCRIPTION_TYPE = 50;

	/**
	 * The meta object id for the '<em>Inhibition Sucess Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusInhibitionSucessTypeObject()
	 * @generated
	 */
	int TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Match Sucess Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusMatchSucessType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMatchSucessTypeObject()
	 * @generated
	 */
	int TINNITUS_MATCH_SUCESS_TYPE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Perception Location Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPerceptionLocationTypeObject()
	 * @generated
	 */
	int TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Temporal Characteristic Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TinnitusTemporalCharacteristicType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusTemporalCharacteristicTypeObject()
	 * @generated
	 */
	int TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Transducer Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinnitus.TransducerType
	 * @see tinnitus.impl.TinnitusPackageImpl#getTransducerTypeObject()
	 * @generated
	 */
	int TRANSDUCER_TYPE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Upper Limit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getUpperLimitType()
	 * @generated
	 */
	int UPPER_LIMIT_TYPE = 56;

	/**
	 * The meta object id for the '<em>Upper Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see tinnitus.impl.TinnitusPackageImpl#getUpperSlopeType()
	 * @generated
	 */
	int UPPER_SLOPE_TYPE = 57;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tinnitus.impl.TinnitusPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link tinnitus.BandwidthType <em>Bandwidth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth Type</em>'.
	 * @see tinnitus.BandwidthType
	 * @generated
	 */
	EClass getBandwidthType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.BandwidthType#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see tinnitus.BandwidthType#getUpperLimit()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_UpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.BandwidthType#getUpperSlope <em>Upper Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Slope</em>'.
	 * @see tinnitus.BandwidthType#getUpperSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_UpperSlope();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.BandwidthType#getPlateauSlope <em>Plateau Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plateau Slope</em>'.
	 * @see tinnitus.BandwidthType#getPlateauSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_PlateauSlope();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.BandwidthType#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see tinnitus.BandwidthType#getLowerLimit()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.BandwidthType#getLowerSlope <em>Lower Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Slope</em>'.
	 * @see tinnitus.BandwidthType#getLowerSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_LowerSlope();

	/**
	 * Returns the meta object for class '{@link tinnitus.IntensityType1 <em>Intensity Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intensity Type1</em>'.
	 * @see tinnitus.IntensityType1
	 * @generated
	 */
	EClass getIntensityType1();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.IntensityType1#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see tinnitus.IntensityType1#getIntensity()
	 * @see #getIntensityType1()
	 * @generated
	 */
	EAttribute getIntensityType1_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.IntensityType1#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see tinnitus.IntensityType1#getUnit()
	 * @see #getIntensityType1()
	 * @generated
	 */
	EAttribute getIntensityType1_Unit();

	/**
	 * Returns the meta object for class '{@link tinnitus.MeasurementConditionsType <em>Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Conditions Type</em>'.
	 * @see tinnitus.MeasurementConditionsType
	 * @generated
	 */
	EClass getMeasurementConditionsType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.MeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Signal Type</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusSignalType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EReference getMeasurementConditionsType_StimulusSignalType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Output</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusSignalOutput()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusSignalOutput();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.MeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Masking Signal Type</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingSignalType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EReference getMeasurementConditionsType_MaskingSignalType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Unit</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingUnit()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingUnit();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Output</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingSignalOutput()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Type</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusTransducerType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Type</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingTransducerType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Description</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusTransducerDescription()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusTransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Description</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingTransducerDescription()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingTransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Amplitude Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusAmplitudeModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Amplitude Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingAmplitudeModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusBandwidthModulation <em>Stimulus Bandwidth Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Bandwidth Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusBandwidthModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusBandwidthModulation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingBandwidthModulation <em>Masking Bandwidth Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Bandwidth Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingBandwidthModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingBandwidthModulation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getStimulusFrequencyModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency Modulation</em>'.
	 * @see tinnitus.MeasurementConditionsType#getMaskingFrequencyModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingFrequencyModulation();

	/**
	 * Returns the meta object for class '{@link tinnitus.MeasurementEquipmentType <em>Measurement Equipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Equipment Type</em>'.
	 * @see tinnitus.MeasurementEquipmentType
	 * @generated
	 */
	EClass getMeasurementEquipmentType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementEquipmentType#getAudiometerMakeModel <em>Audiometer Make Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Make Model</em>'.
	 * @see tinnitus.MeasurementEquipmentType#getAudiometerMakeModel()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerMakeModel();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementEquipmentType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Serial Number</em>'.
	 * @see tinnitus.MeasurementEquipmentType#getAudiometerSerialNumber()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementEquipmentType#getAudiometerLastCalibrationDate <em>Audiometer Last Calibration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Last Calibration Date</em>'.
	 * @see tinnitus.MeasurementEquipmentType#getAudiometerLastCalibrationDate()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerLastCalibrationDate();

	/**
	 * Returns the meta object for class '{@link tinnitus.MeasurementFrequencyPointType <em>Measurement Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Frequency Point Type</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType
	 * @generated
	 */
	EClass getMeasurementFrequencyPointType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getStimulusFrequency()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.MeasurementFrequencyPointType#getStimulusIntensity <em>Stimulus Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus Intensity</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getStimulusIntensity()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_StimulusIntensity();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.MeasurementFrequencyPointType#getStimulusBandwidth <em>Stimulus Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Bandwidth</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getStimulusBandwidth()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_StimulusBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementFrequencyPointType#getStimulusPulseDuration <em>Stimulus Pulse Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Duration</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getStimulusPulseDuration()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_StimulusPulseDuration();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getMaskingFrequency()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.MeasurementFrequencyPointType#getMaskingIntensity <em>Masking Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Masking Intensity</em>'.
	 * @see tinnitus.MeasurementFrequencyPointType#getMaskingIntensity()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_MaskingIntensity();

	/**
	 * Returns the meta object for class '{@link tinnitus.MeasurementIntensityPointType <em>Measurement Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Intensity Point Type</em>'.
	 * @see tinnitus.MeasurementIntensityPointType
	 * @generated
	 */
	EClass getMeasurementIntensityPointType();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.MeasurementIntensityPointType#getStimulusIntensity <em>Stimulus Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus Intensity</em>'.
	 * @see tinnitus.MeasurementIntensityPointType#getStimulusIntensity()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EReference getMeasurementIntensityPointType_StimulusIntensity();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see tinnitus.MeasurementIntensityPointType#getStimulusFrequency()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EAttribute getMeasurementIntensityPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MeasurementIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see tinnitus.MeasurementIntensityPointType#getMaskingFrequency()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EAttribute getMeasurementIntensityPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.MeasurementIntensityPointType#getMaskingIntensity <em>Masking Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Masking Intensity</em>'.
	 * @see tinnitus.MeasurementIntensityPointType#getMaskingIntensity()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EReference getMeasurementIntensityPointType_MaskingIntensity();

	/**
	 * Returns the meta object for class '{@link tinnitus.MinimumMaskingLevelType <em>Minimum Masking Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Masking Level Type</em>'.
	 * @see tinnitus.MinimumMaskingLevelType
	 * @generated
	 */
	EClass getMinimumMaskingLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.MinimumMaskingLevelType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see tinnitus.MinimumMaskingLevelType#getMeasurementConditions()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EReference getMinimumMaskingLevelType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.MinimumMaskingLevelType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see tinnitus.MinimumMaskingLevelType#getMeasurementPoint()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EReference getMinimumMaskingLevelType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see tinnitus.MinimumMaskingLevelType#getMatchingSuccess()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EAttribute getMinimumMaskingLevelType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link tinnitus.ResidualInhibitionType <em>Residual Inhibition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Residual Inhibition Type</em>'.
	 * @see tinnitus.ResidualInhibitionType
	 * @generated
	 */
	EClass getResidualInhibitionType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.ResidualInhibitionType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see tinnitus.ResidualInhibitionType#getMeasurementConditions()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EReference getResidualInhibitionType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.ResidualInhibitionType#getSignalIntensity <em>Signal Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Intensity</em>'.
	 * @see tinnitus.ResidualInhibitionType#getSignalIntensity()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EReference getResidualInhibitionType_SignalIntensity();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getStimulusExposureTime <em>Stimulus Exposure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Exposure Time</em>'.
	 * @see tinnitus.ResidualInhibitionType#getStimulusExposureTime()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_StimulusExposureTime();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getInhibitionTime <em>Inhibition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhibition Time</em>'.
	 * @see tinnitus.ResidualInhibitionType#getInhibitionTime()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_InhibitionTime();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getPulseDuration <em>Pulse Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulse Duration</em>'.
	 * @see tinnitus.ResidualInhibitionType#getPulseDuration()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_PulseDuration();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getGapDuration <em>Gap Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Duration</em>'.
	 * @see tinnitus.ResidualInhibitionType#getGapDuration()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_GapDuration();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getNumberOfCycles <em>Number Of Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cycles</em>'.
	 * @see tinnitus.ResidualInhibitionType#getNumberOfCycles()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_NumberOfCycles();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhibition Success</em>'.
	 * @see tinnitus.ResidualInhibitionType#getInhibitionSuccess()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_InhibitionSuccess();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perception Location</em>'.
	 * @see tinnitus.ResidualInhibitionType#getPerceptionLocation()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_PerceptionLocation();

	/**
	 * Returns the meta object for class '{@link tinnitus.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Type</em>'.
	 * @see tinnitus.SignalType
	 * @generated
	 */
	EClass getSignalType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.SignalType#getSignalTypes <em>Signal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Types</em>'.
	 * @see tinnitus.SignalType#getSignalTypes()
	 * @see #getSignalType()
	 * @generated
	 */
	EAttribute getSignalType_SignalTypes();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Signal Specification</em>'.
	 * @see tinnitus.SignalType#getOtherSignalSpecification()
	 * @see #getSignalType()
	 * @generated
	 */
	EAttribute getSignalType_OtherSignalSpecification();

	/**
	 * Returns the meta object for class '{@link tinnitus.TinnitusLoudnessMatchType <em>Loudness Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loudness Match Type</em>'.
	 * @see tinnitus.TinnitusLoudnessMatchType
	 * @generated
	 */
	EClass getTinnitusLoudnessMatchType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see tinnitus.TinnitusLoudnessMatchType#getMeasurementConditions()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EReference getTinnitusLoudnessMatchType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see tinnitus.TinnitusLoudnessMatchType#getMeasurementPoint()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EReference getTinnitusLoudnessMatchType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EAttribute getTinnitusLoudnessMatchType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link tinnitus.TinnitusMeasurementDataType <em>Measurement Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Data Type</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType
	 * @generated
	 */
	EClass getTinnitusMeasurementDataType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusMeasurementDataType#getTinnitusMeasurementNotes <em>Tinnitus Measurement Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Notes</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getTinnitusMeasurementNotes()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusMeasurementNotes();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment <em>Tinnitus Measurement Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Equipment</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusMeasurementEquipment();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.TinnitusMeasurementDataType#getTinnitusPitchMatch <em>Tinnitus Pitch Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tinnitus Pitch Match</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getTinnitusPitchMatch()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusPitchMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.TinnitusMeasurementDataType#getTinnitusLoudnessMatch <em>Tinnitus Loudness Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tinnitus Loudness Match</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getTinnitusLoudnessMatch()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusLoudnessMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.TinnitusMeasurementDataType#getMinimumMaskingLevel <em>Minimum Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minimum Masking Level</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getMinimumMaskingLevel()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_MinimumMaskingLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link tinnitus.TinnitusMeasurementDataType#getResidualInhibition <em>Residual Inhibition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Residual Inhibition</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getResidualInhibition()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_ResidualInhibition();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusMeasurementDataType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see tinnitus.TinnitusMeasurementDataType#getVersion()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementDataType_Version();

	/**
	 * Returns the meta object for class '{@link tinnitus.TinnitusMeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Notes Type</em>'.
	 * @see tinnitus.TinnitusMeasurementNotesType
	 * @generated
	 */
	EClass getTinnitusMeasurementNotesType();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tinnitus Perception Location</em>'.
	 * @see tinnitus.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_TinnitusPerceptionLocation();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tinnitus Temporal Characteristic</em>'.
	 * @see tinnitus.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusMeasurementNotesType#getOtherMeasurementNotes <em>Other Measurement Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Measurement Notes</em>'.
	 * @see tinnitus.TinnitusMeasurementNotesType#getOtherMeasurementNotes()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_OtherMeasurementNotes();

	/**
	 * Returns the meta object for class '{@link tinnitus.TinnitusPitchMatchType <em>Pitch Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch Match Type</em>'.
	 * @see tinnitus.TinnitusPitchMatchType
	 * @generated
	 */
	EClass getTinnitusPitchMatchType();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusPitchMatchType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see tinnitus.TinnitusPitchMatchType#getMeasurementConditions()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EReference getTinnitusPitchMatchType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.TinnitusPitchMatchType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see tinnitus.TinnitusPitchMatchType#getMeasurementPoint()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EReference getTinnitusPitchMatchType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link tinnitus.TinnitusPitchMatchType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see tinnitus.TinnitusPitchMatchType#getMatchingSuccess()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EAttribute getTinnitusPitchMatchType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link tinnitus.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see tinnitus.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link tinnitus.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see tinnitus.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link tinnitus.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see tinnitus.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link tinnitus.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see tinnitus.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link tinnitus.DocumentRoot#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Data</em>'.
	 * @see tinnitus.DocumentRoot#getTinnitusMeasurementData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TinnitusMeasurementData();

	/**
	 * Returns the meta object for enum '{@link tinnitus.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see tinnitus.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.SignalTypesType <em>Signal Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Types Type</em>'.
	 * @see tinnitus.SignalTypesType
	 * @generated
	 */
	EEnum getSignalTypesType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.SignalUnitType <em>Signal Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Unit Type</em>'.
	 * @see tinnitus.SignalUnitType
	 * @generated
	 */
	EEnum getSignalUnitType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.TinnitusInhibitionSucessType <em>Inhibition Sucess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inhibition Sucess Type</em>'.
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @generated
	 */
	EEnum getTinnitusInhibitionSucessType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.TinnitusMatchSucessType <em>Match Sucess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Sucess Type</em>'.
	 * @see tinnitus.TinnitusMatchSucessType
	 * @generated
	 */
	EEnum getTinnitusMatchSucessType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.TinnitusPerceptionLocationType <em>Perception Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Perception Location Type</em>'.
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @generated
	 */
	EEnum getTinnitusPerceptionLocationType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.TinnitusTemporalCharacteristicType <em>Temporal Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Characteristic Type</em>'.
	 * @see tinnitus.TinnitusTemporalCharacteristicType
	 * @generated
	 */
	EEnum getTinnitusTemporalCharacteristicType();

	/**
	 * Returns the meta object for enum '{@link tinnitus.TransducerType <em>Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Type</em>'.
	 * @see tinnitus.TransducerType
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
	 *        extendedMetaData="name='AudiometerMakeModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Gap Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gap Duration Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='GapDuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getGapDurationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Inhibition Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inhibition Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='InhibitionTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getInhibitionTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Intensity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Intensity Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Intensity_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getIntensityType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Lower Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lower Limit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='LowerLimit_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getLowerLimitType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Lower Slope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lower Slope Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='LowerSlope_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getLowerSlopeType();

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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Masking Bandwidth Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Bandwidth Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='MaskingBandwidthModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getMaskingBandwidthModulationType();

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
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Masking Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Frequency Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='MaskingFrequency_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minExclusive='0'"
	 * @generated
	 */
	EDataType getMaskingFrequencyType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Masking Frequency Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Frequency Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='MaskingFrequency_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minExclusive='0'"
	 * @generated
	 */
	EDataType getMaskingFrequencyType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Masking Transducer Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Masking Transducer Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MaskingTransducerDescription_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getMaskingTransducerDescriptionType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Number Of Cycles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Of Cycles Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='NumberOfCycles_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minExclusive='0'"
	 * @generated
	 */
	EDataType getNumberOfCyclesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Other Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other Measurement Notes Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='OtherMeasurementNotes_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getOtherMeasurementNotesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Other Signal Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other Signal Specification Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='OtherSignalSpecification_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getOtherSignalSpecificationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Plateau Slope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plateau Slope Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='PlateauSlope_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getPlateauSlopeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Pulse Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pulse Duration Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='PulseDuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getPulseDurationType();

	/**
	 * Returns the meta object for data type '{@link tinnitus.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see tinnitus.SignalOutputType
	 * @model instanceClass="tinnitus.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.SignalTypesType <em>Signal Types Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Types Type Object</em>'.
	 * @see tinnitus.SignalTypesType
	 * @model instanceClass="tinnitus.SignalTypesType"
	 *        extendedMetaData="name='Signal_Types_._type:Object' baseType='Signal_Types_._type'"
	 * @generated
	 */
	EDataType getSignalTypesTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.SignalUnitType <em>Signal Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Unit Type Object</em>'.
	 * @see tinnitus.SignalUnitType
	 * @model instanceClass="tinnitus.SignalUnitType"
	 *        extendedMetaData="name='SignalUnit_Type:Object' baseType='SignalUnit_Type'"
	 * @generated
	 */
	EDataType getSignalUnitTypeObject();

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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Bandwidth Modulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Bandwidth Modulation Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusBandwidthModulation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getStimulusBandwidthModulationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Exposure Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Exposure Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusExposureTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getStimulusExposureTimeType();

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
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Stimulus Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Frequency Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='StimulusFrequency_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minExclusive='0'"
	 * @generated
	 */
	EDataType getStimulusFrequencyType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Stimulus Frequency Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Frequency Type1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='StimulusFrequency_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minExclusive='0'"
	 * @generated
	 */
	EDataType getStimulusFrequencyType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Stimulus Pulse Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Pulse Duration Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='StimulusPulseDuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getStimulusPulseDurationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stimulus Transducer Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stimulus Transducer Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StimulusTransducerDescription_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getStimulusTransducerDescriptionType();

	/**
	 * Returns the meta object for data type '{@link tinnitus.TinnitusInhibitionSucessType <em>Inhibition Sucess Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inhibition Sucess Type Object</em>'.
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @model instanceClass="tinnitus.TinnitusInhibitionSucessType"
	 *        extendedMetaData="name='TinnitusInhibitionSucess_Type:Object' baseType='TinnitusInhibitionSucess_Type'"
	 * @generated
	 */
	EDataType getTinnitusInhibitionSucessTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.TinnitusMatchSucessType <em>Match Sucess Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Match Sucess Type Object</em>'.
	 * @see tinnitus.TinnitusMatchSucessType
	 * @model instanceClass="tinnitus.TinnitusMatchSucessType"
	 *        extendedMetaData="name='TinnitusMatchSucess_Type:Object' baseType='TinnitusMatchSucess_Type'"
	 * @generated
	 */
	EDataType getTinnitusMatchSucessTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.TinnitusPerceptionLocationType <em>Perception Location Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Perception Location Type Object</em>'.
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @model instanceClass="tinnitus.TinnitusPerceptionLocationType"
	 *        extendedMetaData="name='TinnitusPerceptionLocation_Type:Object' baseType='TinnitusPerceptionLocation_Type'"
	 * @generated
	 */
	EDataType getTinnitusPerceptionLocationTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.TinnitusTemporalCharacteristicType <em>Temporal Characteristic Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temporal Characteristic Type Object</em>'.
	 * @see tinnitus.TinnitusTemporalCharacteristicType
	 * @model instanceClass="tinnitus.TinnitusTemporalCharacteristicType"
	 *        extendedMetaData="name='TinnitusTemporalCharacteristic_Type:Object' baseType='TinnitusTemporalCharacteristic_Type'"
	 * @generated
	 */
	EDataType getTinnitusTemporalCharacteristicTypeObject();

	/**
	 * Returns the meta object for data type '{@link tinnitus.TransducerType <em>Transducer Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Type Object</em>'.
	 * @see tinnitus.TransducerType
	 * @model instanceClass="tinnitus.TransducerType"
	 *        extendedMetaData="name='Transducer_Type:Object' baseType='Transducer_Type'"
	 * @generated
	 */
	EDataType getTransducerTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Upper Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Limit Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='UpperLimit_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getUpperLimitType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Upper Slope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Slope Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='UpperSlope_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0'"
	 * @generated
	 */
	EDataType getUpperSlopeType();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TinnitusFactory getTinnitusFactory();

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
		 * The meta object literal for the '{@link tinnitus.impl.BandwidthTypeImpl <em>Bandwidth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.BandwidthTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getBandwidthType()
		 * @generated
		 */
		EClass BANDWIDTH_TYPE = eINSTANCE.getBandwidthType();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH_TYPE__UPPER_LIMIT = eINSTANCE.getBandwidthType_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH_TYPE__UPPER_SLOPE = eINSTANCE.getBandwidthType_UpperSlope();

		/**
		 * The meta object literal for the '<em><b>Plateau Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH_TYPE__PLATEAU_SLOPE = eINSTANCE.getBandwidthType_PlateauSlope();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH_TYPE__LOWER_LIMIT = eINSTANCE.getBandwidthType_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Lower Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH_TYPE__LOWER_SLOPE = eINSTANCE.getBandwidthType_LowerSlope();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.IntensityType1Impl <em>Intensity Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.IntensityType1Impl
		 * @see tinnitus.impl.TinnitusPackageImpl#getIntensityType1()
		 * @generated
		 */
		EClass INTENSITY_TYPE1 = eINSTANCE.getIntensityType1();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENSITY_TYPE1__INTENSITY = eINSTANCE.getIntensityType1_Intensity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENSITY_TYPE1__UNIT = eINSTANCE.getIntensityType1_Unit();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.MeasurementConditionsTypeImpl <em>Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.MeasurementConditionsTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementConditionsType()
		 * @generated
		 */
		EClass MEASUREMENT_CONDITIONS_TYPE = eINSTANCE.getMeasurementConditionsType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Signal Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE = eINSTANCE.getMeasurementConditionsType_StimulusSignalType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT = eINSTANCE.getMeasurementConditionsType_StimulusSignalOutput();

		/**
		 * The meta object literal for the '<em><b>Masking Signal Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE = eINSTANCE.getMeasurementConditionsType_MaskingSignalType();

		/**
		 * The meta object literal for the '<em><b>Masking Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT = eINSTANCE.getMeasurementConditionsType_MaskingUnit();

		/**
		 * The meta object literal for the '<em><b>Masking Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT = eINSTANCE.getMeasurementConditionsType_MaskingSignalOutput();

		/**
		 * The meta object literal for the '<em><b>Stimulus Transducer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE = eINSTANCE.getMeasurementConditionsType_StimulusTransducerType();

		/**
		 * The meta object literal for the '<em><b>Masking Transducer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE = eINSTANCE.getMeasurementConditionsType_MaskingTransducerType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Transducer Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION = eINSTANCE.getMeasurementConditionsType_StimulusTransducerDescription();

		/**
		 * The meta object literal for the '<em><b>Masking Transducer Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION = eINSTANCE.getMeasurementConditionsType_MaskingTransducerDescription();

		/**
		 * The meta object literal for the '<em><b>Stimulus Amplitude Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION = eINSTANCE.getMeasurementConditionsType_StimulusAmplitudeModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Amplitude Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION = eINSTANCE.getMeasurementConditionsType_MaskingAmplitudeModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Bandwidth Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION = eINSTANCE.getMeasurementConditionsType_StimulusBandwidthModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Bandwidth Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION = eINSTANCE.getMeasurementConditionsType_MaskingBandwidthModulation();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION = eINSTANCE.getMeasurementConditionsType_StimulusFrequencyModulation();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION = eINSTANCE.getMeasurementConditionsType_MaskingFrequencyModulation();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.MeasurementEquipmentTypeImpl <em>Measurement Equipment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.MeasurementEquipmentTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementEquipmentType()
		 * @generated
		 */
		EClass MEASUREMENT_EQUIPMENT_TYPE = eINSTANCE.getMeasurementEquipmentType();

		/**
		 * The meta object literal for the '<em><b>Audiometer Make Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL = eINSTANCE.getMeasurementEquipmentType_AudiometerMakeModel();

		/**
		 * The meta object literal for the '<em><b>Audiometer Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER = eINSTANCE.getMeasurementEquipmentType_AudiometerSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Audiometer Last Calibration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE = eINSTANCE.getMeasurementEquipmentType_AudiometerLastCalibrationDate();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl <em>Measurement Frequency Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.MeasurementFrequencyPointTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementFrequencyPointType()
		 * @generated
		 */
		EClass MEASUREMENT_FREQUENCY_POINT_TYPE = eINSTANCE.getMeasurementFrequencyPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getMeasurementFrequencyPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Stimulus Intensity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY = eINSTANCE.getMeasurementFrequencyPointType_StimulusIntensity();

		/**
		 * The meta object literal for the '<em><b>Stimulus Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH = eINSTANCE.getMeasurementFrequencyPointType_StimulusBandwidth();

		/**
		 * The meta object literal for the '<em><b>Stimulus Pulse Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION = eINSTANCE.getMeasurementFrequencyPointType_StimulusPulseDuration();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY = eINSTANCE.getMeasurementFrequencyPointType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Intensity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY = eINSTANCE.getMeasurementFrequencyPointType_MaskingIntensity();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.MeasurementIntensityPointTypeImpl <em>Measurement Intensity Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.MeasurementIntensityPointTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getMeasurementIntensityPointType()
		 * @generated
		 */
		EClass MEASUREMENT_INTENSITY_POINT_TYPE = eINSTANCE.getMeasurementIntensityPointType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Intensity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY = eINSTANCE.getMeasurementIntensityPointType_StimulusIntensity();

		/**
		 * The meta object literal for the '<em><b>Stimulus Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY = eINSTANCE.getMeasurementIntensityPointType_StimulusFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY = eINSTANCE.getMeasurementIntensityPointType_MaskingFrequency();

		/**
		 * The meta object literal for the '<em><b>Masking Intensity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY = eINSTANCE.getMeasurementIntensityPointType_MaskingIntensity();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.MinimumMaskingLevelTypeImpl <em>Minimum Masking Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.MinimumMaskingLevelTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getMinimumMaskingLevelType()
		 * @generated
		 */
		EClass MINIMUM_MASKING_LEVEL_TYPE = eINSTANCE.getMinimumMaskingLevelType();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS = eINSTANCE.getMinimumMaskingLevelType_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Measurement Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT = eINSTANCE.getMinimumMaskingLevelType_MeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Matching Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS = eINSTANCE.getMinimumMaskingLevelType_MatchingSuccess();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.ResidualInhibitionTypeImpl <em>Residual Inhibition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.ResidualInhibitionTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getResidualInhibitionType()
		 * @generated
		 */
		EClass RESIDUAL_INHIBITION_TYPE = eINSTANCE.getResidualInhibitionType();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS = eINSTANCE.getResidualInhibitionType_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Signal Intensity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY = eINSTANCE.getResidualInhibitionType_SignalIntensity();

		/**
		 * The meta object literal for the '<em><b>Stimulus Exposure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME = eINSTANCE.getResidualInhibitionType_StimulusExposureTime();

		/**
		 * The meta object literal for the '<em><b>Inhibition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME = eINSTANCE.getResidualInhibitionType_InhibitionTime();

		/**
		 * The meta object literal for the '<em><b>Pulse Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__PULSE_DURATION = eINSTANCE.getResidualInhibitionType_PulseDuration();

		/**
		 * The meta object literal for the '<em><b>Gap Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__GAP_DURATION = eINSTANCE.getResidualInhibitionType_GapDuration();

		/**
		 * The meta object literal for the '<em><b>Number Of Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES = eINSTANCE.getResidualInhibitionType_NumberOfCycles();

		/**
		 * The meta object literal for the '<em><b>Inhibition Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS = eINSTANCE.getResidualInhibitionType_InhibitionSuccess();

		/**
		 * The meta object literal for the '<em><b>Perception Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION = eINSTANCE.getResidualInhibitionType_PerceptionLocation();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.SignalTypeImpl <em>Signal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.SignalTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalType()
		 * @generated
		 */
		EClass SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '<em><b>Signal Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_TYPE__SIGNAL_TYPES = eINSTANCE.getSignalType_SignalTypes();

		/**
		 * The meta object literal for the '<em><b>Other Signal Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION = eINSTANCE.getSignalType_OtherSignalSpecification();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.TinnitusLoudnessMatchTypeImpl <em>Loudness Match Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.TinnitusLoudnessMatchTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusLoudnessMatchType()
		 * @generated
		 */
		EClass TINNITUS_LOUDNESS_MATCH_TYPE = eINSTANCE.getTinnitusLoudnessMatchType();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_CONDITIONS = eINSTANCE.getTinnitusLoudnessMatchType_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Measurement Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_POINT = eINSTANCE.getTinnitusLoudnessMatchType_MeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Matching Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_LOUDNESS_MATCH_TYPE__MATCHING_SUCCESS = eINSTANCE.getTinnitusLoudnessMatchType_MatchingSuccess();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl <em>Measurement Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.TinnitusMeasurementDataTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMeasurementDataType()
		 * @generated
		 */
		EClass TINNITUS_MEASUREMENT_DATA_TYPE = eINSTANCE.getTinnitusMeasurementDataType();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Measurement Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES = eINSTANCE.getTinnitusMeasurementDataType_TinnitusMeasurementNotes();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Measurement Equipment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT = eINSTANCE.getTinnitusMeasurementDataType_TinnitusMeasurementEquipment();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Pitch Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH = eINSTANCE.getTinnitusMeasurementDataType_TinnitusPitchMatch();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Loudness Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH = eINSTANCE.getTinnitusMeasurementDataType_TinnitusLoudnessMatch();

		/**
		 * The meta object literal for the '<em><b>Minimum Masking Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL = eINSTANCE.getTinnitusMeasurementDataType_MinimumMaskingLevel();

		/**
		 * The meta object literal for the '<em><b>Residual Inhibition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION = eINSTANCE.getTinnitusMeasurementDataType_ResidualInhibition();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_MEASUREMENT_DATA_TYPE__VERSION = eINSTANCE.getTinnitusMeasurementDataType_Version();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.TinnitusMeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.TinnitusMeasurementNotesTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMeasurementNotesType()
		 * @generated
		 */
		EClass TINNITUS_MEASUREMENT_NOTES_TYPE = eINSTANCE.getTinnitusMeasurementNotesType();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Perception Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION = eINSTANCE.getTinnitusMeasurementNotesType_TinnitusPerceptionLocation();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Temporal Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC = eINSTANCE.getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Other Measurement Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES = eINSTANCE.getTinnitusMeasurementNotesType_OtherMeasurementNotes();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.TinnitusPitchMatchTypeImpl <em>Pitch Match Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.TinnitusPitchMatchTypeImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPitchMatchType()
		 * @generated
		 */
		EClass TINNITUS_PITCH_MATCH_TYPE = eINSTANCE.getTinnitusPitchMatchType();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS = eINSTANCE.getTinnitusPitchMatchType_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Measurement Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT = eINSTANCE.getTinnitusPitchMatchType_MeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Matching Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS = eINSTANCE.getTinnitusPitchMatchType_MatchingSuccess();

		/**
		 * The meta object literal for the '{@link tinnitus.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.impl.DocumentRootImpl
		 * @see tinnitus.impl.TinnitusPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Tinnitus Measurement Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TINNITUS_MEASUREMENT_DATA = eINSTANCE.getDocumentRoot_TinnitusMeasurementData();

		/**
		 * The meta object literal for the '{@link tinnitus.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalOutputType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link tinnitus.SignalTypesType <em>Signal Types Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalTypesType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalTypesType()
		 * @generated
		 */
		EEnum SIGNAL_TYPES_TYPE = eINSTANCE.getSignalTypesType();

		/**
		 * The meta object literal for the '{@link tinnitus.SignalUnitType <em>Signal Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalUnitType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalUnitType()
		 * @generated
		 */
		EEnum SIGNAL_UNIT_TYPE = eINSTANCE.getSignalUnitType();

		/**
		 * The meta object literal for the '{@link tinnitus.TinnitusInhibitionSucessType <em>Inhibition Sucess Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusInhibitionSucessType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusInhibitionSucessType()
		 * @generated
		 */
		EEnum TINNITUS_INHIBITION_SUCESS_TYPE = eINSTANCE.getTinnitusInhibitionSucessType();

		/**
		 * The meta object literal for the '{@link tinnitus.TinnitusMatchSucessType <em>Match Sucess Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusMatchSucessType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMatchSucessType()
		 * @generated
		 */
		EEnum TINNITUS_MATCH_SUCESS_TYPE = eINSTANCE.getTinnitusMatchSucessType();

		/**
		 * The meta object literal for the '{@link tinnitus.TinnitusPerceptionLocationType <em>Perception Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusPerceptionLocationType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPerceptionLocationType()
		 * @generated
		 */
		EEnum TINNITUS_PERCEPTION_LOCATION_TYPE = eINSTANCE.getTinnitusPerceptionLocationType();

		/**
		 * The meta object literal for the '{@link tinnitus.TinnitusTemporalCharacteristicType <em>Temporal Characteristic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusTemporalCharacteristicType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusTemporalCharacteristicType()
		 * @generated
		 */
		EEnum TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE = eINSTANCE.getTinnitusTemporalCharacteristicType();

		/**
		 * The meta object literal for the '{@link tinnitus.TransducerType <em>Transducer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TransducerType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTransducerType()
		 * @generated
		 */
		EEnum TRANSDUCER_TYPE = eINSTANCE.getTransducerType();

		/**
		 * The meta object literal for the '<em>Audiometer Make Model Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getAudiometerMakeModelType()
		 * @generated
		 */
		EDataType AUDIOMETER_MAKE_MODEL_TYPE = eINSTANCE.getAudiometerMakeModelType();

		/**
		 * The meta object literal for the '<em>Audiometer Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getAudiometerSerialNumberType()
		 * @generated
		 */
		EDataType AUDIOMETER_SERIAL_NUMBER_TYPE = eINSTANCE.getAudiometerSerialNumberType();

		/**
		 * The meta object literal for the '<em>Gap Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getGapDurationType()
		 * @generated
		 */
		EDataType GAP_DURATION_TYPE = eINSTANCE.getGapDurationType();

		/**
		 * The meta object literal for the '<em>Inhibition Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getInhibitionTimeType()
		 * @generated
		 */
		EDataType INHIBITION_TIME_TYPE = eINSTANCE.getInhibitionTimeType();

		/**
		 * The meta object literal for the '<em>Intensity Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getIntensityType()
		 * @generated
		 */
		EDataType INTENSITY_TYPE = eINSTANCE.getIntensityType();

		/**
		 * The meta object literal for the '<em>Lower Limit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getLowerLimitType()
		 * @generated
		 */
		EDataType LOWER_LIMIT_TYPE = eINSTANCE.getLowerLimitType();

		/**
		 * The meta object literal for the '<em>Lower Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getLowerSlopeType()
		 * @generated
		 */
		EDataType LOWER_SLOPE_TYPE = eINSTANCE.getLowerSlopeType();

		/**
		 * The meta object literal for the '<em>Masking Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingAmplitudeModulationType()
		 * @generated
		 */
		EDataType MASKING_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getMaskingAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Masking Bandwidth Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingBandwidthModulationType()
		 * @generated
		 */
		EDataType MASKING_BANDWIDTH_MODULATION_TYPE = eINSTANCE.getMaskingBandwidthModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyModulationType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_MODULATION_TYPE = eINSTANCE.getMaskingFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_TYPE = eINSTANCE.getMaskingFrequencyType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingFrequencyType1()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_TYPE1 = eINSTANCE.getMaskingFrequencyType1();

		/**
		 * The meta object literal for the '<em>Masking Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getMaskingTransducerDescriptionType()
		 * @generated
		 */
		EDataType MASKING_TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getMaskingTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Number Of Cycles Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getNumberOfCyclesType()
		 * @generated
		 */
		EDataType NUMBER_OF_CYCLES_TYPE = eINSTANCE.getNumberOfCyclesType();

		/**
		 * The meta object literal for the '<em>Other Measurement Notes Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getOtherMeasurementNotesType()
		 * @generated
		 */
		EDataType OTHER_MEASUREMENT_NOTES_TYPE = eINSTANCE.getOtherMeasurementNotesType();

		/**
		 * The meta object literal for the '<em>Other Signal Specification Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getOtherSignalSpecificationType()
		 * @generated
		 */
		EDataType OTHER_SIGNAL_SPECIFICATION_TYPE = eINSTANCE.getOtherSignalSpecificationType();

		/**
		 * The meta object literal for the '<em>Plateau Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getPlateauSlopeType()
		 * @generated
		 */
		EDataType PLATEAU_SLOPE_TYPE = eINSTANCE.getPlateauSlopeType();

		/**
		 * The meta object literal for the '<em>Pulse Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getPulseDurationType()
		 * @generated
		 */
		EDataType PULSE_DURATION_TYPE = eINSTANCE.getPulseDurationType();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalOutputType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Types Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalTypesType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalTypesTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPES_TYPE_OBJECT = eINSTANCE.getSignalTypesTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.SignalUnitType
		 * @see tinnitus.impl.TinnitusPackageImpl#getSignalUnitTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_UNIT_TYPE_OBJECT = eINSTANCE.getSignalUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusAmplitudeModulationType()
		 * @generated
		 */
		EDataType STIMULUS_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getStimulusAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Bandwidth Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusBandwidthModulationType()
		 * @generated
		 */
		EDataType STIMULUS_BANDWIDTH_MODULATION_TYPE = eINSTANCE.getStimulusBandwidthModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Exposure Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusExposureTimeType()
		 * @generated
		 */
		EDataType STIMULUS_EXPOSURE_TIME_TYPE = eINSTANCE.getStimulusExposureTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyModulationType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_MODULATION_TYPE = eINSTANCE.getStimulusFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_TYPE = eINSTANCE.getStimulusFrequencyType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusFrequencyType1()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_TYPE1 = eINSTANCE.getStimulusFrequencyType1();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusPulseDurationType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_DURATION_TYPE = eINSTANCE.getStimulusPulseDurationType();

		/**
		 * The meta object literal for the '<em>Stimulus Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tinnitus.impl.TinnitusPackageImpl#getStimulusTransducerDescriptionType()
		 * @generated
		 */
		EDataType STIMULUS_TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getStimulusTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Inhibition Sucess Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusInhibitionSucessType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusInhibitionSucessTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT = eINSTANCE.getTinnitusInhibitionSucessTypeObject();

		/**
		 * The meta object literal for the '<em>Match Sucess Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusMatchSucessType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusMatchSucessTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_MATCH_SUCESS_TYPE_OBJECT = eINSTANCE.getTinnitusMatchSucessTypeObject();

		/**
		 * The meta object literal for the '<em>Perception Location Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusPerceptionLocationType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusPerceptionLocationTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT = eINSTANCE.getTinnitusPerceptionLocationTypeObject();

		/**
		 * The meta object literal for the '<em>Temporal Characteristic Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TinnitusTemporalCharacteristicType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTinnitusTemporalCharacteristicTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT = eINSTANCE.getTinnitusTemporalCharacteristicTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinnitus.TransducerType
		 * @see tinnitus.impl.TinnitusPackageImpl#getTransducerTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_TYPE_OBJECT = eINSTANCE.getTransducerTypeObject();

		/**
		 * The meta object literal for the '<em>Upper Limit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getUpperLimitType()
		 * @generated
		 */
		EDataType UPPER_LIMIT_TYPE = eINSTANCE.getUpperLimitType();

		/**
		 * The meta object literal for the '<em>Upper Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see tinnitus.impl.TinnitusPackageImpl#getUpperSlopeType()
		 * @generated
		 */
		EDataType UPPER_SLOPE_TYPE = eINSTANCE.getUpperSlopeType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tinnitus.impl.TinnitusPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //TinnitusPackage
