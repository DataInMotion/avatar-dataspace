/*
 */
package com.himsa.measurement.tinnitus._500;


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
 * @see com.himsa.measurement.tinnitus._500._500Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = _500Package.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/tinnitus.ecore", ecoreSourceLocations="/model/tinnitus.ecore")
public interface _500Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_500";

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
	String eNS_PREFIX = "_500";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_500Package eINSTANCE = com.himsa.measurement.tinnitus._500.impl._500PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl <em>Bandwidth Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getBandwidthType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.IntensityType1Impl <em>Intensity Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.IntensityType1Impl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getIntensityType1()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl <em>Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementConditionsType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl <em>Measurement Equipment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementEquipmentType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementFrequencyPointTypeImpl <em>Measurement Frequency Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementFrequencyPointTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementFrequencyPointType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl <em>Measurement Intensity Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementIntensityPointType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.MinimumMaskingLevelTypeImpl <em>Minimum Masking Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.MinimumMaskingLevelTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMinimumMaskingLevelType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl <em>Residual Inhibition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getResidualInhibitionType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl <em>Signal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalType()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusLoudnessMatchTypeImpl <em>Tinnitus Loudness Match Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusLoudnessMatchTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusLoudnessMatchType()
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
	 * The number of structural features of the '<em>Tinnitus Loudness Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tinnitus Loudness Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_LOUDNESS_MATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementDataTypeImpl <em>Tinnitus Measurement Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementDataTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMeasurementDataType()
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
	 * The number of structural features of the '<em>Tinnitus Measurement Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tinnitus Measurement Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementNotesTypeImpl <em>Tinnitus Measurement Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementNotesTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMeasurementNotesType()
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
	 * The number of structural features of the '<em>Tinnitus Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tinnitus Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_MEASUREMENT_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl <em>Tinnitus Pitch Match Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPitchMatchType()
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
	 * The number of structural features of the '<em>Tinnitus Pitch Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tinnitus Pitch Match Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINNITUS_PITCH_MATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.impl.DocumentRootImpl
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 14;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.SignalTypesType <em>Signal Types Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalTypesType()
	 * @generated
	 */
	int SIGNAL_TYPES_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.SignalUnitType <em>Signal Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalUnitType()
	 * @generated
	 */
	int SIGNAL_UNIT_TYPE = 16;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType <em>Tinnitus Inhibition Sucess Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusInhibitionSucessType()
	 * @generated
	 */
	int TINNITUS_INHIBITION_SUCESS_TYPE = 17;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType <em>Tinnitus Match Sucess Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMatchSucessType()
	 * @generated
	 */
	int TINNITUS_MATCH_SUCESS_TYPE = 18;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType <em>Tinnitus Perception Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPerceptionLocationType()
	 * @generated
	 */
	int TINNITUS_PERCEPTION_LOCATION_TYPE = 19;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType <em>Tinnitus Temporal Characteristic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusTemporalCharacteristicType()
	 * @generated
	 */
	int TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE = 20;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.tinnitus._500.TransducerType <em>Transducer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TransducerType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTransducerType()
	 * @generated
	 */
	int TRANSDUCER_TYPE = 21;

	/**
	 * The meta object id for the '<em>Audiometer Make Model Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getAudiometerMakeModelType()
	 * @generated
	 */
	int AUDIOMETER_MAKE_MODEL_TYPE = 22;

	/**
	 * The meta object id for the '<em>Audiometer Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getAudiometerSerialNumberType()
	 * @generated
	 */
	int AUDIOMETER_SERIAL_NUMBER_TYPE = 23;

	/**
	 * The meta object id for the '<em>Gap Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getGapDurationType()
	 * @generated
	 */
	int GAP_DURATION_TYPE = 24;

	/**
	 * The meta object id for the '<em>Inhibition Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getInhibitionTimeType()
	 * @generated
	 */
	int INHIBITION_TIME_TYPE = 25;

	/**
	 * The meta object id for the '<em>Intensity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getIntensityType()
	 * @generated
	 */
	int INTENSITY_TYPE = 26;

	/**
	 * The meta object id for the '<em>Lower Limit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getLowerLimitType()
	 * @generated
	 */
	int LOWER_LIMIT_TYPE = 27;

	/**
	 * The meta object id for the '<em>Lower Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getLowerSlopeType()
	 * @generated
	 */
	int LOWER_SLOPE_TYPE = 28;

	/**
	 * The meta object id for the '<em>Masking Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingAmplitudeModulationType()
	 * @generated
	 */
	int MASKING_AMPLITUDE_MODULATION_TYPE = 29;

	/**
	 * The meta object id for the '<em>Masking Bandwidth Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingBandwidthModulationType()
	 * @generated
	 */
	int MASKING_BANDWIDTH_MODULATION_TYPE = 30;

	/**
	 * The meta object id for the '<em>Masking Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyModulationType()
	 * @generated
	 */
	int MASKING_FREQUENCY_MODULATION_TYPE = 31;

	/**
	 * The meta object id for the '<em>Masking Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyType()
	 * @generated
	 */
	int MASKING_FREQUENCY_TYPE = 32;

	/**
	 * The meta object id for the '<em>Masking Frequency Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyType1()
	 * @generated
	 */
	int MASKING_FREQUENCY_TYPE1 = 33;

	/**
	 * The meta object id for the '<em>Masking Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingTransducerDescriptionType()
	 * @generated
	 */
	int MASKING_TRANSDUCER_DESCRIPTION_TYPE = 34;

	/**
	 * The meta object id for the '<em>Number Of Cycles Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getNumberOfCyclesType()
	 * @generated
	 */
	int NUMBER_OF_CYCLES_TYPE = 35;

	/**
	 * The meta object id for the '<em>Other Measurement Notes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getOtherMeasurementNotesType()
	 * @generated
	 */
	int OTHER_MEASUREMENT_NOTES_TYPE = 36;

	/**
	 * The meta object id for the '<em>Other Signal Specification Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getOtherSignalSpecificationType()
	 * @generated
	 */
	int OTHER_SIGNAL_SPECIFICATION_TYPE = 37;

	/**
	 * The meta object id for the '<em>Plateau Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getPlateauSlopeType()
	 * @generated
	 */
	int PLATEAU_SLOPE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Pulse Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getPulseDurationType()
	 * @generated
	 */
	int PULSE_DURATION_TYPE = 39;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Signal Types Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalTypesTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPES_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Signal Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalUnitTypeObject()
	 * @generated
	 */
	int SIGNAL_UNIT_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusAmplitudeModulationType()
	 * @generated
	 */
	int STIMULUS_AMPLITUDE_MODULATION_TYPE = 43;

	/**
	 * The meta object id for the '<em>Stimulus Bandwidth Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusBandwidthModulationType()
	 * @generated
	 */
	int STIMULUS_BANDWIDTH_MODULATION_TYPE = 44;

	/**
	 * The meta object id for the '<em>Stimulus Exposure Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusExposureTimeType()
	 * @generated
	 */
	int STIMULUS_EXPOSURE_TIME_TYPE = 45;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Modulation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyModulationType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_MODULATION_TYPE = 46;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyType()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_TYPE = 47;

	/**
	 * The meta object id for the '<em>Stimulus Frequency Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyType1()
	 * @generated
	 */
	int STIMULUS_FREQUENCY_TYPE1 = 48;

	/**
	 * The meta object id for the '<em>Stimulus Pulse Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusPulseDurationType()
	 * @generated
	 */
	int STIMULUS_PULSE_DURATION_TYPE = 49;

	/**
	 * The meta object id for the '<em>Stimulus Transducer Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusTransducerDescriptionType()
	 * @generated
	 */
	int STIMULUS_TRANSDUCER_DESCRIPTION_TYPE = 50;

	/**
	 * The meta object id for the '<em>Tinnitus Inhibition Sucess Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusInhibitionSucessTypeObject()
	 * @generated
	 */
	int TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Tinnitus Match Sucess Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMatchSucessTypeObject()
	 * @generated
	 */
	int TINNITUS_MATCH_SUCESS_TYPE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Tinnitus Perception Location Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPerceptionLocationTypeObject()
	 * @generated
	 */
	int TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Tinnitus Temporal Characteristic Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusTemporalCharacteristicTypeObject()
	 * @generated
	 */
	int TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Transducer Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.tinnitus._500.TransducerType
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTransducerTypeObject()
	 * @generated
	 */
	int TRANSDUCER_TYPE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Upper Limit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getUpperLimitType()
	 * @generated
	 */
	int UPPER_LIMIT_TYPE = 56;

	/**
	 * The meta object id for the '<em>Upper Slope Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getUpperSlopeType()
	 * @generated
	 */
	int UPPER_SLOPE_TYPE = 57;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.BandwidthType <em>Bandwidth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType
	 * @generated
	 */
	EClass getBandwidthType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType#getUpperLimit()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_UpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperSlope <em>Upper Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Slope</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType#getUpperSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_UpperSlope();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getPlateauSlope <em>Plateau Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plateau Slope</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType#getPlateauSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_PlateauSlope();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType#getLowerLimit()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerSlope <em>Lower Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Slope</em>'.
	 * @see com.himsa.measurement.tinnitus._500.BandwidthType#getLowerSlope()
	 * @see #getBandwidthType()
	 * @generated
	 */
	EAttribute getBandwidthType_LowerSlope();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.IntensityType1 <em>Intensity Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intensity Type1</em>'.
	 * @see com.himsa.measurement.tinnitus._500.IntensityType1
	 * @generated
	 */
	EClass getIntensityType1();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.IntensityType1#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.IntensityType1#getIntensity()
	 * @see #getIntensityType1()
	 * @generated
	 */
	EAttribute getIntensityType1_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.IntensityType1#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.himsa.measurement.tinnitus._500.IntensityType1#getUnit()
	 * @see #getIntensityType1()
	 * @generated
	 */
	EAttribute getIntensityType1_Unit();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType <em>Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Conditions Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType
	 * @generated
	 */
	EClass getMeasurementConditionsType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusSignalType <em>Stimulus Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Signal Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusSignalType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EReference getMeasurementConditionsType_StimulusSignalType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusSignalOutput <em>Stimulus Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Signal Output</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusSignalOutput()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusSignalOutput();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingSignalType <em>Masking Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Masking Signal Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingSignalType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EReference getMeasurementConditionsType_MaskingSignalType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingUnit <em>Masking Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Unit</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingUnit()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingSignalOutput <em>Masking Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Signal Output</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingSignalOutput()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingSignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusTransducerType <em>Stimulus Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusTransducerType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingTransducerType <em>Masking Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingTransducerType()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingTransducerType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Transducer Description</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusTransducerDescription()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusTransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingTransducerDescription <em>Masking Transducer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Transducer Description</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingTransducerDescription()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingTransducerDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Amplitude Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusAmplitudeModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Amplitude Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingAmplitudeModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingAmplitudeModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusBandwidthModulation <em>Stimulus Bandwidth Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Bandwidth Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusBandwidthModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusBandwidthModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingBandwidthModulation <em>Masking Bandwidth Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Bandwidth Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingBandwidthModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingBandwidthModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getStimulusFrequencyModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_StimulusFrequencyModulation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency Modulation</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementConditionsType#getMaskingFrequencyModulation()
	 * @see #getMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getMeasurementConditionsType_MaskingFrequencyModulation();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.MeasurementEquipmentType <em>Measurement Equipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Equipment Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementEquipmentType
	 * @generated
	 */
	EClass getMeasurementEquipmentType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerMakeModel <em>Audiometer Make Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Make Model</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerMakeModel()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerMakeModel();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Serial Number</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerSerialNumber()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerLastCalibrationDate <em>Audiometer Last Calibration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audiometer Last Calibration Date</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementEquipmentType#getAudiometerLastCalibrationDate()
	 * @see #getMeasurementEquipmentType()
	 * @generated
	 */
	EAttribute getMeasurementEquipmentType_AudiometerLastCalibrationDate();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType <em>Measurement Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Frequency Point Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType
	 * @generated
	 */
	EClass getMeasurementFrequencyPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusFrequency()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusIntensity <em>Stimulus Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusIntensity()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_StimulusIntensity();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusBandwidth <em>Stimulus Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Bandwidth</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusBandwidth()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_StimulusBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusPulseDuration <em>Stimulus Pulse Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Pulse Duration</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getStimulusPulseDuration()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_StimulusPulseDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getMaskingFrequency()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EAttribute getMeasurementFrequencyPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getMaskingIntensity <em>Masking Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Masking Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType#getMaskingIntensity()
	 * @see #getMeasurementFrequencyPointType()
	 * @generated
	 */
	EReference getMeasurementFrequencyPointType_MaskingIntensity();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType <em>Measurement Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Intensity Point Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType
	 * @generated
	 */
	EClass getMeasurementIntensityPointType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusIntensity <em>Stimulus Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusIntensity()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EReference getMeasurementIntensityPointType_StimulusIntensity();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Frequency</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getStimulusFrequency()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EAttribute getMeasurementIntensityPointType_StimulusFrequency();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masking Frequency</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingFrequency()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EAttribute getMeasurementIntensityPointType_MaskingFrequency();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingIntensity <em>Masking Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Masking Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType#getMaskingIntensity()
	 * @see #getMeasurementIntensityPointType()
	 * @generated
	 */
	EReference getMeasurementIntensityPointType_MaskingIntensity();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType <em>Minimum Masking Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Masking Level Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType
	 * @generated
	 */
	EClass getMinimumMaskingLevelType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementConditions()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EReference getMinimumMaskingLevelType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementPoint()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EReference getMinimumMaskingLevelType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess()
	 * @see #getMinimumMaskingLevelType()
	 * @generated
	 */
	EAttribute getMinimumMaskingLevelType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType <em>Residual Inhibition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Residual Inhibition Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType
	 * @generated
	 */
	EClass getResidualInhibitionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getMeasurementConditions()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EReference getResidualInhibitionType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getSignalIntensity <em>Signal Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Intensity</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getSignalIntensity()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EReference getResidualInhibitionType_SignalIntensity();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getStimulusExposureTime <em>Stimulus Exposure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Exposure Time</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getStimulusExposureTime()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_StimulusExposureTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getInhibitionTime <em>Inhibition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhibition Time</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getInhibitionTime()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_InhibitionTime();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getPulseDuration <em>Pulse Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulse Duration</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getPulseDuration()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_PulseDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getGapDuration <em>Gap Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Duration</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getGapDuration()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_GapDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getNumberOfCycles <em>Number Of Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cycles</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getNumberOfCycles()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_NumberOfCycles();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhibition Success</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getInhibitionSuccess()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_InhibitionSuccess();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perception Location</em>'.
	 * @see com.himsa.measurement.tinnitus._500.ResidualInhibitionType#getPerceptionLocation()
	 * @see #getResidualInhibitionType()
	 * @generated
	 */
	EAttribute getResidualInhibitionType_PerceptionLocation();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalType
	 * @generated
	 */
	EClass getSignalType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes <em>Signal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Types</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalType#getSignalTypes()
	 * @see #getSignalType()
	 * @generated
	 */
	EAttribute getSignalType_SignalTypes();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Signal Specification</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalType#getOtherSignalSpecification()
	 * @see #getSignalType()
	 * @generated
	 */
	EAttribute getSignalType_OtherSignalSpecification();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType <em>Tinnitus Loudness Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tinnitus Loudness Match Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType
	 * @generated
	 */
	EClass getTinnitusLoudnessMatchType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMeasurementConditions()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EReference getTinnitusLoudnessMatchType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMeasurementPoint()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EReference getTinnitusLoudnessMatchType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType#getMatchingSuccess()
	 * @see #getTinnitusLoudnessMatchType()
	 * @generated
	 */
	EAttribute getTinnitusLoudnessMatchType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType <em>Tinnitus Measurement Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tinnitus Measurement Data Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType
	 * @generated
	 */
	EClass getTinnitusMeasurementDataType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementNotes <em>Tinnitus Measurement Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Notes</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementNotes()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusMeasurementNotes();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment <em>Tinnitus Measurement Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Equipment</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusMeasurementEquipment();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusPitchMatch <em>Tinnitus Pitch Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tinnitus Pitch Match</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusPitchMatch()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusPitchMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusLoudnessMatch <em>Tinnitus Loudness Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tinnitus Loudness Match</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusLoudnessMatch()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_TinnitusLoudnessMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getMinimumMaskingLevel <em>Minimum Masking Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minimum Masking Level</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getMinimumMaskingLevel()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_MinimumMaskingLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getResidualInhibition <em>Residual Inhibition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Residual Inhibition</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getResidualInhibition()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EReference getTinnitusMeasurementDataType_ResidualInhibition();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion()
	 * @see #getTinnitusMeasurementDataType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementDataType_Version();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType <em>Tinnitus Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tinnitus Measurement Notes Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType
	 * @generated
	 */
	EClass getTinnitusMeasurementNotesType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tinnitus Perception Location</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_TinnitusPerceptionLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tinnitus Temporal Characteristic</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getOtherMeasurementNotes <em>Other Measurement Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Measurement Notes</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getOtherMeasurementNotes()
	 * @see #getTinnitusMeasurementNotesType()
	 * @generated
	 */
	EAttribute getTinnitusMeasurementNotesType_OtherMeasurementNotes();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType <em>Tinnitus Pitch Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tinnitus Pitch Match Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType
	 * @generated
	 */
	EClass getTinnitusPitchMatchType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMeasurementConditions()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EReference getTinnitusPitchMatchType_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMeasurementPoint <em>Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Point</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMeasurementPoint()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EReference getTinnitusPitchMatchType_MeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMatchingSuccess <em>Matching Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Success</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType#getMatchingSuccess()
	 * @see #getTinnitusPitchMatchType()
	 * @generated
	 */
	EAttribute getTinnitusPitchMatchType_MatchingSuccess();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.tinnitus._500.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.measurement.tinnitus._500.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.tinnitus._500.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.measurement.tinnitus._500.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.tinnitus._500.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.measurement.tinnitus._500.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.tinnitus._500.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.measurement.tinnitus._500.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.tinnitus._500.DocumentRoot#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Data</em>'.
	 * @see com.himsa.measurement.tinnitus._500.DocumentRoot#getTinnitusMeasurementData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TinnitusMeasurementData();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.SignalTypesType <em>Signal Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Types Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @generated
	 */
	EEnum getSignalTypesType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.SignalUnitType <em>Signal Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Unit Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
	 * @generated
	 */
	EEnum getSignalUnitType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType <em>Tinnitus Inhibition Sucess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tinnitus Inhibition Sucess Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
	 * @generated
	 */
	EEnum getTinnitusInhibitionSucessType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType <em>Tinnitus Match Sucess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tinnitus Match Sucess Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @generated
	 */
	EEnum getTinnitusMatchSucessType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType <em>Tinnitus Perception Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tinnitus Perception Location Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @generated
	 */
	EEnum getTinnitusPerceptionLocationType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType <em>Tinnitus Temporal Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tinnitus Temporal Characteristic Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @generated
	 */
	EEnum getTinnitusTemporalCharacteristicType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.tinnitus._500.TransducerType <em>Transducer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transducer Type</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TransducerType
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
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.SignalTypesType <em>Signal Types Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Types Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.SignalTypesType"
	 *        extendedMetaData="name='Signal_Types_._type:Object' baseType='Signal_Types_._type'"
	 * @generated
	 */
	EDataType getSignalTypesTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.SignalUnitType <em>Signal Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Unit Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.SignalUnitType"
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
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType <em>Tinnitus Inhibition Sucess Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tinnitus Inhibition Sucess Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType"
	 *        extendedMetaData="name='TinnitusInhibitionSucess_Type:Object' baseType='TinnitusInhibitionSucess_Type'"
	 * @generated
	 */
	EDataType getTinnitusInhibitionSucessTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType <em>Tinnitus Match Sucess Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tinnitus Match Sucess Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType"
	 *        extendedMetaData="name='TinnitusMatchSucess_Type:Object' baseType='TinnitusMatchSucess_Type'"
	 * @generated
	 */
	EDataType getTinnitusMatchSucessTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType <em>Tinnitus Perception Location Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tinnitus Perception Location Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType"
	 *        extendedMetaData="name='TinnitusPerceptionLocation_Type:Object' baseType='TinnitusPerceptionLocation_Type'"
	 * @generated
	 */
	EDataType getTinnitusPerceptionLocationTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType <em>Tinnitus Temporal Characteristic Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tinnitus Temporal Characteristic Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType"
	 *        extendedMetaData="name='TinnitusTemporalCharacteristic_Type:Object' baseType='TinnitusTemporalCharacteristic_Type'"
	 * @generated
	 */
	EDataType getTinnitusTemporalCharacteristicTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.tinnitus._500.TransducerType <em>Transducer Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transducer Type Object</em>'.
	 * @see com.himsa.measurement.tinnitus._500.TransducerType
	 * @model instanceClass="com.himsa.measurement.tinnitus._500.TransducerType"
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
	_500Factory get_500Factory();

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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl <em>Bandwidth Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getBandwidthType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.IntensityType1Impl <em>Intensity Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.IntensityType1Impl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getIntensityType1()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl <em>Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementConditionsType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl <em>Measurement Equipment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementEquipmentType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementFrequencyPointTypeImpl <em>Measurement Frequency Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementFrequencyPointTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementFrequencyPointType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl <em>Measurement Intensity Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMeasurementIntensityPointType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.MinimumMaskingLevelTypeImpl <em>Minimum Masking Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.MinimumMaskingLevelTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMinimumMaskingLevelType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl <em>Residual Inhibition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getResidualInhibitionType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl <em>Signal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusLoudnessMatchTypeImpl <em>Tinnitus Loudness Match Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusLoudnessMatchTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusLoudnessMatchType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementDataTypeImpl <em>Tinnitus Measurement Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementDataTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMeasurementDataType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementNotesTypeImpl <em>Tinnitus Measurement Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusMeasurementNotesTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMeasurementNotesType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl <em>Tinnitus Pitch Match Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPitchMatchType()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.impl.DocumentRootImpl
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.SignalTypesType <em>Signal Types Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalTypesType()
		 * @generated
		 */
		EEnum SIGNAL_TYPES_TYPE = eINSTANCE.getSignalTypesType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.SignalUnitType <em>Signal Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalUnitType()
		 * @generated
		 */
		EEnum SIGNAL_UNIT_TYPE = eINSTANCE.getSignalUnitType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType <em>Tinnitus Inhibition Sucess Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusInhibitionSucessType()
		 * @generated
		 */
		EEnum TINNITUS_INHIBITION_SUCESS_TYPE = eINSTANCE.getTinnitusInhibitionSucessType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType <em>Tinnitus Match Sucess Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMatchSucessType()
		 * @generated
		 */
		EEnum TINNITUS_MATCH_SUCESS_TYPE = eINSTANCE.getTinnitusMatchSucessType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType <em>Tinnitus Perception Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPerceptionLocationType()
		 * @generated
		 */
		EEnum TINNITUS_PERCEPTION_LOCATION_TYPE = eINSTANCE.getTinnitusPerceptionLocationType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType <em>Tinnitus Temporal Characteristic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusTemporalCharacteristicType()
		 * @generated
		 */
		EEnum TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE = eINSTANCE.getTinnitusTemporalCharacteristicType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.tinnitus._500.TransducerType <em>Transducer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TransducerType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTransducerType()
		 * @generated
		 */
		EEnum TRANSDUCER_TYPE = eINSTANCE.getTransducerType();

		/**
		 * The meta object literal for the '<em>Audiometer Make Model Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getAudiometerMakeModelType()
		 * @generated
		 */
		EDataType AUDIOMETER_MAKE_MODEL_TYPE = eINSTANCE.getAudiometerMakeModelType();

		/**
		 * The meta object literal for the '<em>Audiometer Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getAudiometerSerialNumberType()
		 * @generated
		 */
		EDataType AUDIOMETER_SERIAL_NUMBER_TYPE = eINSTANCE.getAudiometerSerialNumberType();

		/**
		 * The meta object literal for the '<em>Gap Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getGapDurationType()
		 * @generated
		 */
		EDataType GAP_DURATION_TYPE = eINSTANCE.getGapDurationType();

		/**
		 * The meta object literal for the '<em>Inhibition Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getInhibitionTimeType()
		 * @generated
		 */
		EDataType INHIBITION_TIME_TYPE = eINSTANCE.getInhibitionTimeType();

		/**
		 * The meta object literal for the '<em>Intensity Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getIntensityType()
		 * @generated
		 */
		EDataType INTENSITY_TYPE = eINSTANCE.getIntensityType();

		/**
		 * The meta object literal for the '<em>Lower Limit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getLowerLimitType()
		 * @generated
		 */
		EDataType LOWER_LIMIT_TYPE = eINSTANCE.getLowerLimitType();

		/**
		 * The meta object literal for the '<em>Lower Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getLowerSlopeType()
		 * @generated
		 */
		EDataType LOWER_SLOPE_TYPE = eINSTANCE.getLowerSlopeType();

		/**
		 * The meta object literal for the '<em>Masking Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingAmplitudeModulationType()
		 * @generated
		 */
		EDataType MASKING_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getMaskingAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Masking Bandwidth Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingBandwidthModulationType()
		 * @generated
		 */
		EDataType MASKING_BANDWIDTH_MODULATION_TYPE = eINSTANCE.getMaskingBandwidthModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyModulationType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_MODULATION_TYPE = eINSTANCE.getMaskingFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyType()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_TYPE = eINSTANCE.getMaskingFrequencyType();

		/**
		 * The meta object literal for the '<em>Masking Frequency Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingFrequencyType1()
		 * @generated
		 */
		EDataType MASKING_FREQUENCY_TYPE1 = eINSTANCE.getMaskingFrequencyType1();

		/**
		 * The meta object literal for the '<em>Masking Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getMaskingTransducerDescriptionType()
		 * @generated
		 */
		EDataType MASKING_TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getMaskingTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Number Of Cycles Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getNumberOfCyclesType()
		 * @generated
		 */
		EDataType NUMBER_OF_CYCLES_TYPE = eINSTANCE.getNumberOfCyclesType();

		/**
		 * The meta object literal for the '<em>Other Measurement Notes Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getOtherMeasurementNotesType()
		 * @generated
		 */
		EDataType OTHER_MEASUREMENT_NOTES_TYPE = eINSTANCE.getOtherMeasurementNotesType();

		/**
		 * The meta object literal for the '<em>Other Signal Specification Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getOtherSignalSpecificationType()
		 * @generated
		 */
		EDataType OTHER_SIGNAL_SPECIFICATION_TYPE = eINSTANCE.getOtherSignalSpecificationType();

		/**
		 * The meta object literal for the '<em>Plateau Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getPlateauSlopeType()
		 * @generated
		 */
		EDataType PLATEAU_SLOPE_TYPE = eINSTANCE.getPlateauSlopeType();

		/**
		 * The meta object literal for the '<em>Pulse Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getPulseDurationType()
		 * @generated
		 */
		EDataType PULSE_DURATION_TYPE = eINSTANCE.getPulseDurationType();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalOutputType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Types Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalTypesType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalTypesTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPES_TYPE_OBJECT = eINSTANCE.getSignalTypesTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.SignalUnitType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getSignalUnitTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_UNIT_TYPE_OBJECT = eINSTANCE.getSignalUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Stimulus Amplitude Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusAmplitudeModulationType()
		 * @generated
		 */
		EDataType STIMULUS_AMPLITUDE_MODULATION_TYPE = eINSTANCE.getStimulusAmplitudeModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Bandwidth Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusBandwidthModulationType()
		 * @generated
		 */
		EDataType STIMULUS_BANDWIDTH_MODULATION_TYPE = eINSTANCE.getStimulusBandwidthModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Exposure Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusExposureTimeType()
		 * @generated
		 */
		EDataType STIMULUS_EXPOSURE_TIME_TYPE = eINSTANCE.getStimulusExposureTimeType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Modulation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyModulationType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_MODULATION_TYPE = eINSTANCE.getStimulusFrequencyModulationType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyType()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_TYPE = eINSTANCE.getStimulusFrequencyType();

		/**
		 * The meta object literal for the '<em>Stimulus Frequency Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusFrequencyType1()
		 * @generated
		 */
		EDataType STIMULUS_FREQUENCY_TYPE1 = eINSTANCE.getStimulusFrequencyType1();

		/**
		 * The meta object literal for the '<em>Stimulus Pulse Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusPulseDurationType()
		 * @generated
		 */
		EDataType STIMULUS_PULSE_DURATION_TYPE = eINSTANCE.getStimulusPulseDurationType();

		/**
		 * The meta object literal for the '<em>Stimulus Transducer Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getStimulusTransducerDescriptionType()
		 * @generated
		 */
		EDataType STIMULUS_TRANSDUCER_DESCRIPTION_TYPE = eINSTANCE.getStimulusTransducerDescriptionType();

		/**
		 * The meta object literal for the '<em>Tinnitus Inhibition Sucess Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusInhibitionSucessTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT = eINSTANCE.getTinnitusInhibitionSucessTypeObject();

		/**
		 * The meta object literal for the '<em>Tinnitus Match Sucess Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusMatchSucessTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_MATCH_SUCESS_TYPE_OBJECT = eINSTANCE.getTinnitusMatchSucessTypeObject();

		/**
		 * The meta object literal for the '<em>Tinnitus Perception Location Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusPerceptionLocationTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT = eINSTANCE.getTinnitusPerceptionLocationTypeObject();

		/**
		 * The meta object literal for the '<em>Tinnitus Temporal Characteristic Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTinnitusTemporalCharacteristicTypeObject()
		 * @generated
		 */
		EDataType TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT = eINSTANCE.getTinnitusTemporalCharacteristicTypeObject();

		/**
		 * The meta object literal for the '<em>Transducer Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.tinnitus._500.TransducerType
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getTransducerTypeObject()
		 * @generated
		 */
		EDataType TRANSDUCER_TYPE_OBJECT = eINSTANCE.getTransducerTypeObject();

		/**
		 * The meta object literal for the '<em>Upper Limit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getUpperLimitType()
		 * @generated
		 */
		EDataType UPPER_LIMIT_TYPE = eINSTANCE.getUpperLimitType();

		/**
		 * The meta object literal for the '<em>Upper Slope Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getUpperSlopeType()
		 * @generated
		 */
		EDataType UPPER_SLOPE_TYPE = eINSTANCE.getUpperSlopeType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.tinnitus._500.impl._500PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //_500Package
