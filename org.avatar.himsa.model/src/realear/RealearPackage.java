/*
 */
package realear;


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
 * @see realear.RealearFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = RealearPackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/realear-measurement.ecore", ecoreSourceLocations="/model/realear-measurement.ecore")
public interface RealearPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realear";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/RealEar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ear";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealearPackage eINSTANCE = realear.impl.RealearPackageImpl.init();

	/**
	 * The meta object id for the '{@link realear.impl.AttackReleaseMeasurementPointImpl <em>Attack Release Measurement Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.AttackReleaseMeasurementPointImpl
	 * @see realear.impl.RealearPackageImpl#getAttackReleaseMeasurementPoint()
	 * @generated
	 */
	int ATTACK_RELEASE_MEASUREMENT_POINT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Attack Release Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME = 1;

	/**
	 * The number of structural features of the '<em>Attack Release Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_RELEASE_MEASUREMENT_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attack Release Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_RELEASE_MEASUREMENT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.BatteryCurrentMeasurementImpl <em>Battery Current Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.BatteryCurrentMeasurementImpl
	 * @see realear.impl.RealearPackageImpl#getBatteryCurrentMeasurement()
	 * @generated
	 */
	int BATTERY_CURRENT_MEASUREMENT = 1;

	/**
	 * The feature id for the '<em><b>Battery Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Battery Curve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE = 1;

	/**
	 * The number of structural features of the '<em>Battery Current Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_CURRENT_MEASUREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Battery Current Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_CURRENT_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.BatteryMeasurementConditionsImpl <em>Battery Measurement Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.BatteryMeasurementConditionsImpl
	 * @see realear.impl.RealearPackageImpl#getBatteryMeasurementConditions()
	 * @generated
	 */
	int BATTERY_MEASUREMENT_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Manufacturer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Dev Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Signal Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Battery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Battery Pill Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Battery Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE = 8;

	/**
	 * The feature id for the '<em><b>Battery Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE = 9;

	/**
	 * The feature id for the '<em><b>Use Real Ear Coupler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER = 10;

	/**
	 * The feature id for the '<em><b>Measurement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE = 11;

	/**
	 * The feature id for the '<em><b>Measurement Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION = 12;

	/**
	 * The number of structural features of the '<em>Battery Measurement Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Battery Measurement Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.BatteryMeasurementPointImpl <em>Battery Measurement Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.BatteryMeasurementPointImpl
	 * @see realear.impl.RealearPackageImpl#getBatteryMeasurementPoint()
	 * @generated
	 */
	int BATTERY_MEASUREMENT_POINT = 3;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_POINT__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_POINT__CURRENT = 1;

	/**
	 * The number of structural features of the '<em>Battery Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Battery Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_MEASUREMENT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.DocumentRootImpl
	 * @see realear.impl.RealearPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>HIMSA Rem Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIMSA_REM_STANDARD = 3;

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
	 * The meta object id for the '{@link realear.impl.EquivalentInputNoiseImpl <em>Equivalent Input Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.EquivalentInputNoiseImpl
	 * @see realear.impl.RealearPackageImpl#getEquivalentInputNoise()
	 * @generated
	 */
	int EQUIVALENT_INPUT_NOISE = 5;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INPUT_NOISE__POINT = 1;

	/**
	 * The feature id for the '<em><b>Equivalent Root Mean Square</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE = 2;

	/**
	 * The number of structural features of the '<em>Equivalent Input Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INPUT_NOISE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Equivalent Input Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_INPUT_NOISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.FrequencyMeasurementImpl <em>Frequency Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.FrequencyMeasurementImpl
	 * @see realear.impl.RealearPackageImpl#getFrequencyMeasurement()
	 * @generated
	 */
	int FREQUENCY_MEASUREMENT = 6;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT__POINT = 1;

	/**
	 * The number of structural features of the '<em>Frequency Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Frequency Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.FrequencyMeasurementPointImpl <em>Frequency Measurement Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.FrequencyMeasurementPointImpl
	 * @see realear.impl.RealearPackageImpl#getFrequencyMeasurementPoint()
	 * @generated
	 */
	int FREQUENCY_MEASUREMENT_POINT = 7;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_POINT__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_POINT__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_POINT__OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Frequency Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Frequency Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_MEASUREMENT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.FullTargetCurveImpl <em>Full Target Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.FullTargetCurveImpl
	 * @see realear.impl.RealearPackageImpl#getFullTargetCurve()
	 * @generated
	 */
	int FULL_TARGET_CURVE = 8;

	/**
	 * The feature id for the '<em><b>Manufacturers Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__MANUFACTURERS_CODE = 0;

	/**
	 * The feature id for the '<em><b>Device Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__DEVICE_TYPE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Fitting Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__FITTING_RULE = 2;

	/**
	 * The feature id for the '<em><b>Hearing Instrument Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Vent Canal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__VENT_CANAL_DIAMETER = 4;

	/**
	 * The feature id for the '<em><b>Vent Canal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__VENT_CANAL_LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Reserve Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__RESERVE_GAIN = 6;

	/**
	 * The feature id for the '<em><b>Coupler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__COUPLER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__SIGNAL_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__TARGET = 9;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE__RULE_NAME = 10;

	/**
	 * The number of structural features of the '<em>Full Target Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Full Target Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TARGET_CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.HarmonicDistortionMeasurementCurveImpl <em>Harmonic Distortion Measurement Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.HarmonicDistortionMeasurementCurveImpl
	 * @see realear.impl.RealearPackageImpl#getHarmonicDistortionMeasurementCurve()
	 * @generated
	 */
	int HARMONIC_DISTORTION_MEASUREMENT_CURVE = 9;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT = 1;

	/**
	 * The number of structural features of the '<em>Harmonic Distortion Measurement Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_MEASUREMENT_CURVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Harmonic Distortion Measurement Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_MEASUREMENT_CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.HarmonicDistortionPointImpl <em>Harmonic Distortion Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.HarmonicDistortionPointImpl
	 * @see realear.impl.RealearPackageImpl#getHarmonicDistortionPoint()
	 * @generated
	 */
	int HARMONIC_DISTORTION_POINT = 10;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Fx1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__FX1 = 2;

	/**
	 * The feature id for the '<em><b>Fx2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__FX2 = 3;

	/**
	 * The feature id for the '<em><b>Fx3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__FX3 = 4;

	/**
	 * The feature id for the '<em><b>Third HD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT__THIRD_HD = 5;

	/**
	 * The number of structural features of the '<em>Harmonic Distortion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Harmonic Distortion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARMONIC_DISTORTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.HIMSARemStandardTypeImpl <em>HIMSA Rem Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.HIMSARemStandardTypeImpl
	 * @see realear.impl.RealearPackageImpl#getHIMSARemStandardType()
	 * @generated
	 */
	int HIMSA_REM_STANDARD_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Real Ear Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE__REAL_EAR_DATA = 0;

	/**
	 * The feature id for the '<em><b>Private REM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE__PRIVATE_REM = 1;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD = 2;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE__VALIDATED_BY_NOAH = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>HIMSA Rem Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>HIMSA Rem Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_REM_STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.InputOutputMeasurementImpl <em>Input Output Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.InputOutputMeasurementImpl
	 * @see realear.impl.RealearPackageImpl#getInputOutputMeasurement()
	 * @generated
	 */
	int INPUT_OUTPUT_MEASUREMENT = 12;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_MEASUREMENT__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_MEASUREMENT__POINT = 1;

	/**
	 * The number of structural features of the '<em>Input Output Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_MEASUREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Output Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.InputOutputPointImpl <em>Input Output Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.InputOutputPointImpl
	 * @see realear.impl.RealearPackageImpl#getInputOutputPoint()
	 * @generated
	 */
	int INPUT_OUTPUT_POINT = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_POINT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_POINT__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Input Output Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Output Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.IntermodulationDistortionMeasurementImpl <em>Intermodulation Distortion Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.IntermodulationDistortionMeasurementImpl
	 * @see realear.impl.RealearPackageImpl#getIntermodulationDistortionMeasurement()
	 * @generated
	 */
	int INTERMODULATION_DISTORTION_MEASUREMENT = 14;

	/**
	 * The feature id for the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_MEASUREMENT__POINT = 1;

	/**
	 * The number of structural features of the '<em>Intermodulation Distortion Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_MEASUREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intermodulation Distortion Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.IntermodulationDistortionPointImpl <em>Intermodulation Distortion Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.IntermodulationDistortionPointImpl
	 * @see realear.impl.RealearPackageImpl#getIntermodulationDistortionPoint()
	 * @generated
	 */
	int INTERMODULATION_DISTORTION_POINT = 15;

	/**
	 * The feature id for the '<em><b>Freq1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__FREQ1 = 0;

	/**
	 * The feature id for the '<em><b>Freq2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__FREQ2 = 1;

	/**
	 * The feature id for the '<em><b>Input1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__INPUT1 = 2;

	/**
	 * The feature id for the '<em><b>Input2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__INPUT2 = 3;

	/**
	 * The feature id for the '<em><b>Output1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__OUTPUT1 = 4;

	/**
	 * The feature id for the '<em><b>Output2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__OUTPUT2 = 5;

	/**
	 * The feature id for the '<em><b>Output Diff1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1 = 6;

	/**
	 * The feature id for the '<em><b>Output Diff2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2 = 7;

	/**
	 * The feature id for the '<em><b>TI Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT__TI_DISTORTION = 8;

	/**
	 * The number of structural features of the '<em>Intermodulation Distortion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Intermodulation Distortion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMODULATION_DISTORTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.MeasurementConditionsImpl <em>Measurement Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.MeasurementConditionsImpl
	 * @see realear.impl.RealearPackageImpl#getMeasurementConditions()
	 * @generated
	 */
	int MEASUREMENT_CONDITIONS = 16;

	/**
	 * The feature id for the '<em><b>Manufacturer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__MANUFACTURER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Dev Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__DEV_TYPE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__SIGNAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__SIGNAL_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Signal Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Battery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__BATTERY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Battery Pill Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Battery Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE = 8;

	/**
	 * The feature id for the '<em><b>Battery Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE = 9;

	/**
	 * The feature id for the '<em><b>Use Real Ear Coupler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER = 10;

	/**
	 * The feature id for the '<em><b>Measurement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__MEASUREMENT_MODE = 11;

	/**
	 * The feature id for the '<em><b>Measurement Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION = 12;

	/**
	 * The number of structural features of the '<em>Measurement Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Measurement Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.OcclusionEffectsImpl <em>Occlusion Effects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.OcclusionEffectsImpl
	 * @see realear.impl.RealearPackageImpl#getOcclusionEffects()
	 * @generated
	 */
	int OCCLUSION_EFFECTS = 17;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>REUR</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCLUSION_EFFECTS__REUR = 1;

	/**
	 * The feature id for the '<em><b>REOR</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCLUSION_EFFECTS__REOR = 2;

	/**
	 * The number of structural features of the '<em>Occlusion Effects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCLUSION_EFFECTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Occlusion Effects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCLUSION_EFFECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.RealEarCouplerDifferenceImpl <em>Real Ear Coupler Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.RealEarCouplerDifferenceImpl
	 * @see realear.impl.RealearPackageImpl#getRealEarCouplerDifference()
	 * @generated
	 */
	int REAL_EAR_COUPLER_DIFFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>RECD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_COUPLER_DIFFERENCE__RECD = 1;

	/**
	 * The number of structural features of the '<em>Real Ear Coupler Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_COUPLER_DIFFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Real Ear Coupler Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_COUPLER_DIFFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.RealEarDataTypeImpl <em>Real Ear Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.RealEarDataTypeImpl
	 * @see realear.impl.RealearPackageImpl#getRealEarDataType()
	 * @generated
	 */
	int REAL_EAR_DATA_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__TARGETS = 0;

	/**
	 * The feature id for the '<em><b>Real Ear Unaided Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Real Ear Occluded Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Real Ear Insertion Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Real Ear Aided Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Input Output Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT = 5;

	/**
	 * The feature id for the '<em><b>Total Harmonic Distortion Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT = 6;

	/**
	 * The feature id for the '<em><b>Occlusion Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT = 7;

	/**
	 * The feature id for the '<em><b>Real Ear Coupler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER = 8;

	/**
	 * The number of structural features of the '<em>Real Ear Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Real Ear Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EAR_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.TargetCurveImpl <em>Target Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.TargetCurveImpl
	 * @see realear.impl.RealearPackageImpl#getTargetCurve()
	 * @generated
	 */
	int TARGET_CURVE = 20;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE__CURVE = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE__RESOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Pre Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE__PRE_DELAY = 3;

	/**
	 * The number of structural features of the '<em>Target Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Target Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.TargetMeasurementImpl <em>Target Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.TargetMeasurementImpl
	 * @see realear.impl.RealearPackageImpl#getTargetMeasurement()
	 * @generated
	 */
	int TARGET_MEASUREMENT = 21;

	/**
	 * The feature id for the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Level Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT__LEVEL_STEP = 1;

	/**
	 * The feature id for the '<em><b>Attack Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT__ATTACK_CURVE = 2;

	/**
	 * The feature id for the '<em><b>Release Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT__RELEASE_CURVE = 3;

	/**
	 * The number of structural features of the '<em>Target Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Target Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.TargetMeasurementPointImpl <em>Target Measurement Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.TargetMeasurementPointImpl
	 * @see realear.impl.RealearPackageImpl#getTargetMeasurementPoint()
	 * @generated
	 */
	int TARGET_MEASUREMENT_POINT = 22;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT_POINT__OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Target Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Measurement Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MEASUREMENT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.impl.TargetPointImpl <em>Target Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.impl.TargetPointImpl
	 * @see realear.impl.RealearPackageImpl#getTargetPoint()
	 * @generated
	 */
	int TARGET_POINT = 23;

	/**
	 * The feature id for the '<em><b>Target Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT__TARGET_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Target Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT__TARGET_GAIN = 1;

	/**
	 * The number of structural features of the '<em>Target Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Target Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link realear.BatteryPillType <em>Battery Pill Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.BatteryPillType
	 * @see realear.impl.RealearPackageImpl#getBatteryPillType()
	 * @generated
	 */
	int BATTERY_PILL_TYPE = 24;

	/**
	 * The meta object id for the '{@link realear.BatteryType <em>Battery Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.BatteryType
	 * @see realear.impl.RealearPackageImpl#getBatteryType()
	 * @generated
	 */
	int BATTERY_TYPE = 25;

	/**
	 * The meta object id for the '{@link realear.CouplerType <em>Coupler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.CouplerType
	 * @see realear.impl.RealearPackageImpl#getCouplerType()
	 * @generated
	 */
	int COUPLER_TYPE = 26;

	/**
	 * The meta object id for the '{@link realear.FittingRule <em>Fitting Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.FittingRule
	 * @see realear.impl.RealearPackageImpl#getFittingRule()
	 * @generated
	 */
	int FITTING_RULE = 27;

	/**
	 * The meta object id for the '{@link realear.HearingInstrumentType <em>Hearing Instrument Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.HearingInstrumentType
	 * @see realear.impl.RealearPackageImpl#getHearingInstrumentType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_TYPE = 28;

	/**
	 * The meta object id for the '{@link realear.MeasurementIdentification <em>Measurement Identification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.MeasurementIdentification
	 * @see realear.impl.RealearPackageImpl#getMeasurementIdentification()
	 * @generated
	 */
	int MEASUREMENT_IDENTIFICATION = 29;

	/**
	 * The meta object id for the '{@link realear.MeasurementMode <em>Measurement Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.MeasurementMode
	 * @see realear.impl.RealearPackageImpl#getMeasurementMode()
	 * @generated
	 */
	int MEASUREMENT_MODE = 30;

	/**
	 * The meta object id for the '{@link realear.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.SignalOutputType
	 * @see realear.impl.RealearPackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 31;

	/**
	 * The meta object id for the '{@link realear.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.SignalType
	 * @see realear.impl.RealearPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 32;

	/**
	 * The meta object id for the '<em>Attack Release Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getAttackReleaseTimeType()
	 * @generated
	 */
	int ATTACK_RELEASE_TIME_TYPE = 33;

	/**
	 * The meta object id for the '<em>Battery Impedance Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getBatteryImpedanceType()
	 * @generated
	 */
	int BATTERY_IMPEDANCE_TYPE = 34;

	/**
	 * The meta object id for the '<em>Battery Impedance Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getBatteryImpedanceType1()
	 * @generated
	 */
	int BATTERY_IMPEDANCE_TYPE1 = 35;

	/**
	 * The meta object id for the '<em>Battery Pill Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.BatteryPillType
	 * @see realear.impl.RealearPackageImpl#getBatteryPillTypeObject()
	 * @generated
	 */
	int BATTERY_PILL_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Battery Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.BatteryType
	 * @see realear.impl.RealearPackageImpl#getBatteryTypeObject()
	 * @generated
	 */
	int BATTERY_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Battery Voltage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getBatteryVoltageType()
	 * @generated
	 */
	int BATTERY_VOLTAGE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Battery Voltage Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getBatteryVoltageType1()
	 * @generated
	 */
	int BATTERY_VOLTAGE_TYPE1 = 39;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see realear.impl.RealearPackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 40;

	/**
	 * The meta object id for the '<em>Coupler Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.CouplerType
	 * @see realear.impl.RealearPackageImpl#getCouplerTypeObject()
	 * @generated
	 */
	int COUPLER_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Current Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getCurrentType()
	 * @generated
	 */
	int CURRENT_TYPE = 42;

	/**
	 * The meta object id for the '<em>Equivalent Root Mean Square Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getEquivalentRootMeanSquareType()
	 * @generated
	 */
	int EQUIVALENT_ROOT_MEAN_SQUARE_TYPE = 43;

	/**
	 * The meta object id for the '<em>Fitting Rule Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.FittingRule
	 * @see realear.impl.RealearPackageImpl#getFittingRuleObject()
	 * @generated
	 */
	int FITTING_RULE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Fx1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getFx1Type()
	 * @generated
	 */
	int FX1_TYPE = 45;

	/**
	 * The meta object id for the '<em>Fx2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getFx2Type()
	 * @generated
	 */
	int FX2_TYPE = 46;

	/**
	 * The meta object id for the '<em>Fx3 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getFx3Type()
	 * @generated
	 */
	int FX3_TYPE = 47;

	/**
	 * The meta object id for the '<em>Hearing Instrument Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.HearingInstrumentType
	 * @see realear.impl.RealearPackageImpl#getHearingInstrumentTypeObject()
	 * @generated
	 */
	int HEARING_INSTRUMENT_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Input1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getInput1Type()
	 * @generated
	 */
	int INPUT1_TYPE = 49;

	/**
	 * The meta object id for the '<em>Input2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getInput2Type()
	 * @generated
	 */
	int INPUT2_TYPE = 50;

	/**
	 * The meta object id for the '<em>Input Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 51;

	/**
	 * The meta object id for the '<em>Input Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getInputType1()
	 * @generated
	 */
	int INPUT_TYPE1 = 52;

	/**
	 * The meta object id for the '<em>Input Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getInputType2()
	 * @generated
	 */
	int INPUT_TYPE2 = 53;

	/**
	 * The meta object id for the '<em>Level Step Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getLevelStepType()
	 * @generated
	 */
	int LEVEL_STEP_TYPE = 54;

	/**
	 * The meta object id for the '<em>Measurement Identification Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.MeasurementIdentification
	 * @see realear.impl.RealearPackageImpl#getMeasurementIdentificationObject()
	 * @generated
	 */
	int MEASUREMENT_IDENTIFICATION_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Measurement Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.MeasurementMode
	 * @see realear.impl.RealearPackageImpl#getMeasurementModeObject()
	 * @generated
	 */
	int MEASUREMENT_MODE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Output1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutput1Type()
	 * @generated
	 */
	int OUTPUT1_TYPE = 57;

	/**
	 * The meta object id for the '<em>Output2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutput2Type()
	 * @generated
	 */
	int OUTPUT2_TYPE = 58;

	/**
	 * The meta object id for the '<em>Output Diff1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputDiff1Type()
	 * @generated
	 */
	int OUTPUT_DIFF1_TYPE = 59;

	/**
	 * The meta object id for the '<em>Output Diff2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputDiff2Type()
	 * @generated
	 */
	int OUTPUT_DIFF2_TYPE = 60;

	/**
	 * The meta object id for the '<em>Output Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 61;

	/**
	 * The meta object id for the '<em>Output Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputType1()
	 * @generated
	 */
	int OUTPUT_TYPE1 = 62;

	/**
	 * The meta object id for the '<em>Output Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputType2()
	 * @generated
	 */
	int OUTPUT_TYPE2 = 63;

	/**
	 * The meta object id for the '<em>Output Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getOutputType3()
	 * @generated
	 */
	int OUTPUT_TYPE3 = 64;

	/**
	 * The meta object id for the '<em>Reserve Gain Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getReserveGainType()
	 * @generated
	 */
	int RESERVE_GAIN_TYPE = 65;

	/**
	 * The meta object id for the '<em>Rule Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see realear.impl.RealearPackageImpl#getRuleNameType()
	 * @generated
	 */
	int RULE_NAME_TYPE = 66;

	/**
	 * The meta object id for the '<em>Signal Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getSignalLevelType()
	 * @generated
	 */
	int SIGNAL_LEVEL_TYPE = 67;

	/**
	 * The meta object id for the '<em>Signal Level Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getSignalLevelType1()
	 * @generated
	 */
	int SIGNAL_LEVEL_TYPE1 = 68;

	/**
	 * The meta object id for the '<em>Signal Level Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getSignalLevelType2()
	 * @generated
	 */
	int SIGNAL_LEVEL_TYPE2 = 69;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.SignalOutputType
	 * @see realear.impl.RealearPackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Signal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see realear.SignalType
	 * @see realear.impl.RealearPackageImpl#getSignalTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Target Gain Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getTargetGainType()
	 * @generated
	 */
	int TARGET_GAIN_TYPE = 72;

	/**
	 * The meta object id for the '<em>Third HD Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getThirdHDType()
	 * @generated
	 */
	int THIRD_HD_TYPE = 73;

	/**
	 * The meta object id for the '<em>TI Distortion Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getTIDistortionType()
	 * @generated
	 */
	int TI_DISTORTION_TYPE = 74;

	/**
	 * The meta object id for the '<em>Vent Canal Diameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getVentCanalDiameterType()
	 * @generated
	 */
	int VENT_CANAL_DIAMETER_TYPE = 75;

	/**
	 * The meta object id for the '<em>Vent Canal Length Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see realear.impl.RealearPackageImpl#getVentCanalLengthType()
	 * @generated
	 */
	int VENT_CANAL_LENGTH_TYPE = 76;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see realear.impl.RealearPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 77;


	/**
	 * Returns the meta object for class '{@link realear.AttackReleaseMeasurementPoint <em>Attack Release Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Release Measurement Point</em>'.
	 * @see realear.AttackReleaseMeasurementPoint
	 * @generated
	 */
	EClass getAttackReleaseMeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.AttackReleaseMeasurementPoint#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see realear.AttackReleaseMeasurementPoint#getOutput()
	 * @see #getAttackReleaseMeasurementPoint()
	 * @generated
	 */
	EAttribute getAttackReleaseMeasurementPoint_Output();

	/**
	 * Returns the meta object for the attribute '{@link realear.AttackReleaseMeasurementPoint#getAttackReleaseTime <em>Attack Release Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Release Time</em>'.
	 * @see realear.AttackReleaseMeasurementPoint#getAttackReleaseTime()
	 * @see #getAttackReleaseMeasurementPoint()
	 * @generated
	 */
	EAttribute getAttackReleaseMeasurementPoint_AttackReleaseTime();

	/**
	 * Returns the meta object for class '{@link realear.BatteryCurrentMeasurement <em>Battery Current Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Current Measurement</em>'.
	 * @see realear.BatteryCurrentMeasurement
	 * @generated
	 */
	EClass getBatteryCurrentMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.BatteryCurrentMeasurement#getBatteryConditions <em>Battery Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Battery Conditions</em>'.
	 * @see realear.BatteryCurrentMeasurement#getBatteryConditions()
	 * @see #getBatteryCurrentMeasurement()
	 * @generated
	 */
	EReference getBatteryCurrentMeasurement_BatteryConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.BatteryCurrentMeasurement#getBatteryCurve <em>Battery Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Battery Curve</em>'.
	 * @see realear.BatteryCurrentMeasurement#getBatteryCurve()
	 * @see #getBatteryCurrentMeasurement()
	 * @generated
	 */
	EReference getBatteryCurrentMeasurement_BatteryCurve();

	/**
	 * Returns the meta object for class '{@link realear.BatteryMeasurementConditions <em>Battery Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Measurement Conditions</em>'.
	 * @see realear.BatteryMeasurementConditions
	 * @generated
	 */
	EClass getBatteryMeasurementConditions();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getManufacturerCode <em>Manufacturer Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer Code</em>'.
	 * @see realear.BatteryMeasurementConditions#getManufacturerCode()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_ManufacturerCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getDevTypeCode <em>Dev Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Type Code</em>'.
	 * @see realear.BatteryMeasurementConditions#getDevTypeCode()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_DevTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see realear.BatteryMeasurementConditions#getSignalType()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_SignalType();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getSignalOutput <em>Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Output</em>'.
	 * @see realear.BatteryMeasurementConditions#getSignalOutput()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_SignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getSignalLevel <em>Signal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Level</em>'.
	 * @see realear.BatteryMeasurementConditions#getSignalLevel()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_SignalLevel();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getSignalFrequency <em>Signal Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Frequency</em>'.
	 * @see realear.BatteryMeasurementConditions#getSignalFrequency()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_SignalFrequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getBatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type</em>'.
	 * @see realear.BatteryMeasurementConditions#getBatteryType()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_BatteryType();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Pill Type</em>'.
	 * @see realear.BatteryMeasurementConditions#getBatteryPillType()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_BatteryPillType();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getBatteryVoltage <em>Battery Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Voltage</em>'.
	 * @see realear.BatteryMeasurementConditions#getBatteryVoltage()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_BatteryVoltage();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getBatteryImpedance <em>Battery Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Impedance</em>'.
	 * @see realear.BatteryMeasurementConditions#getBatteryImpedance()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_BatteryImpedance();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Real Ear Coupler</em>'.
	 * @see realear.BatteryMeasurementConditions#isUseRealEarCoupler()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_UseRealEarCoupler();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Mode</em>'.
	 * @see realear.BatteryMeasurementConditions#getMeasurementMode()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_MeasurementMode();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Identification</em>'.
	 * @see realear.BatteryMeasurementConditions#getMeasurementIdentification()
	 * @see #getBatteryMeasurementConditions()
	 * @generated
	 */
	EAttribute getBatteryMeasurementConditions_MeasurementIdentification();

	/**
	 * Returns the meta object for class '{@link realear.BatteryMeasurementPoint <em>Battery Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Measurement Point</em>'.
	 * @see realear.BatteryMeasurementPoint
	 * @generated
	 */
	EClass getBatteryMeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementPoint#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see realear.BatteryMeasurementPoint#getFrequency()
	 * @see #getBatteryMeasurementPoint()
	 * @generated
	 */
	EAttribute getBatteryMeasurementPoint_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.BatteryMeasurementPoint#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see realear.BatteryMeasurementPoint#getCurrent()
	 * @see #getBatteryMeasurementPoint()
	 * @generated
	 */
	EAttribute getBatteryMeasurementPoint_Current();

	/**
	 * Returns the meta object for class '{@link realear.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see realear.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link realear.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see realear.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link realear.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see realear.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link realear.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see realear.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link realear.DocumentRoot#getHIMSARemStandard <em>HIMSA Rem Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Rem Standard</em>'.
	 * @see realear.DocumentRoot#getHIMSARemStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIMSARemStandard();

	/**
	 * Returns the meta object for class '{@link realear.EquivalentInputNoise <em>Equivalent Input Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Input Noise</em>'.
	 * @see realear.EquivalentInputNoise
	 * @generated
	 */
	EClass getEquivalentInputNoise();

	/**
	 * Returns the meta object for the containment reference '{@link realear.EquivalentInputNoise#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.EquivalentInputNoise#getMeasurementConditions()
	 * @see #getEquivalentInputNoise()
	 * @generated
	 */
	EReference getEquivalentInputNoise_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.EquivalentInputNoise#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see realear.EquivalentInputNoise#getPoint()
	 * @see #getEquivalentInputNoise()
	 * @generated
	 */
	EReference getEquivalentInputNoise_Point();

	/**
	 * Returns the meta object for the attribute '{@link realear.EquivalentInputNoise#getEquivalentRootMeanSquare <em>Equivalent Root Mean Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equivalent Root Mean Square</em>'.
	 * @see realear.EquivalentInputNoise#getEquivalentRootMeanSquare()
	 * @see #getEquivalentInputNoise()
	 * @generated
	 */
	EAttribute getEquivalentInputNoise_EquivalentRootMeanSquare();

	/**
	 * Returns the meta object for class '{@link realear.FrequencyMeasurement <em>Frequency Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Measurement</em>'.
	 * @see realear.FrequencyMeasurement
	 * @generated
	 */
	EClass getFrequencyMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.FrequencyMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.FrequencyMeasurement#getMeasurementConditions()
	 * @see #getFrequencyMeasurement()
	 * @generated
	 */
	EReference getFrequencyMeasurement_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.FrequencyMeasurement#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see realear.FrequencyMeasurement#getPoint()
	 * @see #getFrequencyMeasurement()
	 * @generated
	 */
	EReference getFrequencyMeasurement_Point();

	/**
	 * Returns the meta object for class '{@link realear.FrequencyMeasurementPoint <em>Frequency Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Measurement Point</em>'.
	 * @see realear.FrequencyMeasurementPoint
	 * @generated
	 */
	EClass getFrequencyMeasurementPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.FrequencyMeasurementPoint#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see realear.FrequencyMeasurementPoint#getFrequency()
	 * @see #getFrequencyMeasurementPoint()
	 * @generated
	 */
	EAttribute getFrequencyMeasurementPoint_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.FrequencyMeasurementPoint#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see realear.FrequencyMeasurementPoint#getInput()
	 * @see #getFrequencyMeasurementPoint()
	 * @generated
	 */
	EAttribute getFrequencyMeasurementPoint_Input();

	/**
	 * Returns the meta object for the attribute '{@link realear.FrequencyMeasurementPoint#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see realear.FrequencyMeasurementPoint#getOutput()
	 * @see #getFrequencyMeasurementPoint()
	 * @generated
	 */
	EAttribute getFrequencyMeasurementPoint_Output();

	/**
	 * Returns the meta object for class '{@link realear.FullTargetCurve <em>Full Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Target Curve</em>'.
	 * @see realear.FullTargetCurve
	 * @generated
	 */
	EClass getFullTargetCurve();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getManufacturersCode <em>Manufacturers Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturers Code</em>'.
	 * @see realear.FullTargetCurve#getManufacturersCode()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_ManufacturersCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getDeviceTypeCode <em>Device Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type Code</em>'.
	 * @see realear.FullTargetCurve#getDeviceTypeCode()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_DeviceTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getFittingRule <em>Fitting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fitting Rule</em>'.
	 * @see realear.FullTargetCurve#getFittingRule()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_FittingRule();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getHearingInstrumentType <em>Hearing Instrument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hearing Instrument Type</em>'.
	 * @see realear.FullTargetCurve#getHearingInstrumentType()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_HearingInstrumentType();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getVentCanalDiameter <em>Vent Canal Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vent Canal Diameter</em>'.
	 * @see realear.FullTargetCurve#getVentCanalDiameter()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_VentCanalDiameter();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getVentCanalLength <em>Vent Canal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vent Canal Length</em>'.
	 * @see realear.FullTargetCurve#getVentCanalLength()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_VentCanalLength();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getReserveGain <em>Reserve Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve Gain</em>'.
	 * @see realear.FullTargetCurve#getReserveGain()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_ReserveGain();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getCouplerType <em>Coupler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coupler Type</em>'.
	 * @see realear.FullTargetCurve#getCouplerType()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_CouplerType();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getSignalLevel <em>Signal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Level</em>'.
	 * @see realear.FullTargetCurve#getSignalLevel()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_SignalLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.FullTargetCurve#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see realear.FullTargetCurve#getTarget()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EReference getFullTargetCurve_Target();

	/**
	 * Returns the meta object for the attribute '{@link realear.FullTargetCurve#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see realear.FullTargetCurve#getRuleName()
	 * @see #getFullTargetCurve()
	 * @generated
	 */
	EAttribute getFullTargetCurve_RuleName();

	/**
	 * Returns the meta object for class '{@link realear.HarmonicDistortionMeasurementCurve <em>Harmonic Distortion Measurement Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harmonic Distortion Measurement Curve</em>'.
	 * @see realear.HarmonicDistortionMeasurementCurve
	 * @generated
	 */
	EClass getHarmonicDistortionMeasurementCurve();

	/**
	 * Returns the meta object for the containment reference '{@link realear.HarmonicDistortionMeasurementCurve#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.HarmonicDistortionMeasurementCurve#getMeasurementConditions()
	 * @see #getHarmonicDistortionMeasurementCurve()
	 * @generated
	 */
	EReference getHarmonicDistortionMeasurementCurve_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.HarmonicDistortionMeasurementCurve#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see realear.HarmonicDistortionMeasurementCurve#getPoint()
	 * @see #getHarmonicDistortionMeasurementCurve()
	 * @generated
	 */
	EReference getHarmonicDistortionMeasurementCurve_Point();

	/**
	 * Returns the meta object for class '{@link realear.HarmonicDistortionPoint <em>Harmonic Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harmonic Distortion Point</em>'.
	 * @see realear.HarmonicDistortionPoint
	 * @generated
	 */
	EClass getHarmonicDistortionPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see realear.HarmonicDistortionPoint#getFrequency()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see realear.HarmonicDistortionPoint#getInput()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_Input();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getFx1 <em>Fx1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx1</em>'.
	 * @see realear.HarmonicDistortionPoint#getFx1()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_Fx1();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getFx2 <em>Fx2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx2</em>'.
	 * @see realear.HarmonicDistortionPoint#getFx2()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_Fx2();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getFx3 <em>Fx3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fx3</em>'.
	 * @see realear.HarmonicDistortionPoint#getFx3()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_Fx3();

	/**
	 * Returns the meta object for the attribute '{@link realear.HarmonicDistortionPoint#getThirdHD <em>Third HD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third HD</em>'.
	 * @see realear.HarmonicDistortionPoint#getThirdHD()
	 * @see #getHarmonicDistortionPoint()
	 * @generated
	 */
	EAttribute getHarmonicDistortionPoint_ThirdHD();

	/**
	 * Returns the meta object for class '{@link realear.HIMSARemStandardType <em>HIMSA Rem Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIMSA Rem Standard Type</em>'.
	 * @see realear.HIMSARemStandardType
	 * @generated
	 */
	EClass getHIMSARemStandardType();

	/**
	 * Returns the meta object for the containment reference '{@link realear.HIMSARemStandardType#getRealEarData <em>Real Ear Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Ear Data</em>'.
	 * @see realear.HIMSARemStandardType#getRealEarData()
	 * @see #getHIMSARemStandardType()
	 * @generated
	 */
	EReference getHIMSARemStandardType_RealEarData();

	/**
	 * Returns the meta object for the attribute '{@link realear.HIMSARemStandardType#getPrivateREM <em>Private REM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private REM</em>'.
	 * @see realear.HIMSARemStandardType#getPrivateREM()
	 * @see #getHIMSARemStandardType()
	 * @generated
	 */
	EAttribute getHIMSARemStandardType_PrivateREM();

	/**
	 * Returns the meta object for the attribute '{@link realear.HIMSARemStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see realear.HIMSARemStandardType#getConvertedFromDataStandard()
	 * @see #getHIMSARemStandardType()
	 * @generated
	 */
	EAttribute getHIMSARemStandardType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link realear.HIMSARemStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see realear.HIMSARemStandardType#isValidatedByNOAH()
	 * @see #getHIMSARemStandardType()
	 * @generated
	 */
	EAttribute getHIMSARemStandardType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link realear.HIMSARemStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see realear.HIMSARemStandardType#getVersion()
	 * @see #getHIMSARemStandardType()
	 * @generated
	 */
	EAttribute getHIMSARemStandardType_Version();

	/**
	 * Returns the meta object for class '{@link realear.InputOutputMeasurement <em>Input Output Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Measurement</em>'.
	 * @see realear.InputOutputMeasurement
	 * @generated
	 */
	EClass getInputOutputMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.InputOutputMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.InputOutputMeasurement#getMeasurementConditions()
	 * @see #getInputOutputMeasurement()
	 * @generated
	 */
	EReference getInputOutputMeasurement_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.InputOutputMeasurement#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see realear.InputOutputMeasurement#getPoint()
	 * @see #getInputOutputMeasurement()
	 * @generated
	 */
	EReference getInputOutputMeasurement_Point();

	/**
	 * Returns the meta object for class '{@link realear.InputOutputPoint <em>Input Output Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Point</em>'.
	 * @see realear.InputOutputPoint
	 * @generated
	 */
	EClass getInputOutputPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.InputOutputPoint#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see realear.InputOutputPoint#getInput()
	 * @see #getInputOutputPoint()
	 * @generated
	 */
	EAttribute getInputOutputPoint_Input();

	/**
	 * Returns the meta object for the attribute '{@link realear.InputOutputPoint#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see realear.InputOutputPoint#getOutput()
	 * @see #getInputOutputPoint()
	 * @generated
	 */
	EAttribute getInputOutputPoint_Output();

	/**
	 * Returns the meta object for class '{@link realear.IntermodulationDistortionMeasurement <em>Intermodulation Distortion Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermodulation Distortion Measurement</em>'.
	 * @see realear.IntermodulationDistortionMeasurement
	 * @generated
	 */
	EClass getIntermodulationDistortionMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.IntermodulationDistortionMeasurement#getMeasurementCondition <em>Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Condition</em>'.
	 * @see realear.IntermodulationDistortionMeasurement#getMeasurementCondition()
	 * @see #getIntermodulationDistortionMeasurement()
	 * @generated
	 */
	EReference getIntermodulationDistortionMeasurement_MeasurementCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.IntermodulationDistortionMeasurement#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see realear.IntermodulationDistortionMeasurement#getPoint()
	 * @see #getIntermodulationDistortionMeasurement()
	 * @generated
	 */
	EReference getIntermodulationDistortionMeasurement_Point();

	/**
	 * Returns the meta object for class '{@link realear.IntermodulationDistortionPoint <em>Intermodulation Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermodulation Distortion Point</em>'.
	 * @see realear.IntermodulationDistortionPoint
	 * @generated
	 */
	EClass getIntermodulationDistortionPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getFreq1 <em>Freq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq1</em>'.
	 * @see realear.IntermodulationDistortionPoint#getFreq1()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Freq1();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getFreq2 <em>Freq2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq2</em>'.
	 * @see realear.IntermodulationDistortionPoint#getFreq2()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Freq2();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getInput1 <em>Input1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input1</em>'.
	 * @see realear.IntermodulationDistortionPoint#getInput1()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Input1();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getInput2 <em>Input2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input2</em>'.
	 * @see realear.IntermodulationDistortionPoint#getInput2()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Input2();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getOutput1 <em>Output1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output1</em>'.
	 * @see realear.IntermodulationDistortionPoint#getOutput1()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Output1();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getOutput2 <em>Output2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output2</em>'.
	 * @see realear.IntermodulationDistortionPoint#getOutput2()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_Output2();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getOutputDiff1 <em>Output Diff1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Diff1</em>'.
	 * @see realear.IntermodulationDistortionPoint#getOutputDiff1()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_OutputDiff1();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getOutputDiff2 <em>Output Diff2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Diff2</em>'.
	 * @see realear.IntermodulationDistortionPoint#getOutputDiff2()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_OutputDiff2();

	/**
	 * Returns the meta object for the attribute '{@link realear.IntermodulationDistortionPoint#getTIDistortion <em>TI Distortion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TI Distortion</em>'.
	 * @see realear.IntermodulationDistortionPoint#getTIDistortion()
	 * @see #getIntermodulationDistortionPoint()
	 * @generated
	 */
	EAttribute getIntermodulationDistortionPoint_TIDistortion();

	/**
	 * Returns the meta object for class '{@link realear.MeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Conditions</em>'.
	 * @see realear.MeasurementConditions
	 * @generated
	 */
	EClass getMeasurementConditions();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getManufacturerCode <em>Manufacturer Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer Code</em>'.
	 * @see realear.MeasurementConditions#getManufacturerCode()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_ManufacturerCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getDevTypeCode <em>Dev Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Type Code</em>'.
	 * @see realear.MeasurementConditions#getDevTypeCode()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_DevTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see realear.MeasurementConditions#getSignalType()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_SignalType();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getSignalOutput <em>Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Output</em>'.
	 * @see realear.MeasurementConditions#getSignalOutput()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_SignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getSignalLevel <em>Signal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Level</em>'.
	 * @see realear.MeasurementConditions#getSignalLevel()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_SignalLevel();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getSignalFrequency <em>Signal Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Frequency</em>'.
	 * @see realear.MeasurementConditions#getSignalFrequency()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_SignalFrequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getBatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type</em>'.
	 * @see realear.MeasurementConditions#getBatteryType()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_BatteryType();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Pill Type</em>'.
	 * @see realear.MeasurementConditions#getBatteryPillType()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_BatteryPillType();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getBatteryVoltage <em>Battery Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Voltage</em>'.
	 * @see realear.MeasurementConditions#getBatteryVoltage()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_BatteryVoltage();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getBatteryImpedance <em>Battery Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Impedance</em>'.
	 * @see realear.MeasurementConditions#getBatteryImpedance()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_BatteryImpedance();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Real Ear Coupler</em>'.
	 * @see realear.MeasurementConditions#isUseRealEarCoupler()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_UseRealEarCoupler();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Mode</em>'.
	 * @see realear.MeasurementConditions#getMeasurementMode()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_MeasurementMode();

	/**
	 * Returns the meta object for the attribute '{@link realear.MeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Identification</em>'.
	 * @see realear.MeasurementConditions#getMeasurementIdentification()
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	EAttribute getMeasurementConditions_MeasurementIdentification();

	/**
	 * Returns the meta object for class '{@link realear.OcclusionEffects <em>Occlusion Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occlusion Effects</em>'.
	 * @see realear.OcclusionEffects
	 * @generated
	 */
	EClass getOcclusionEffects();

	/**
	 * Returns the meta object for the containment reference '{@link realear.OcclusionEffects#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.OcclusionEffects#getMeasurementConditions()
	 * @see #getOcclusionEffects()
	 * @generated
	 */
	EReference getOcclusionEffects_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.OcclusionEffects#getREUR <em>REUR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>REUR</em>'.
	 * @see realear.OcclusionEffects#getREUR()
	 * @see #getOcclusionEffects()
	 * @generated
	 */
	EReference getOcclusionEffects_REUR();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.OcclusionEffects#getREOR <em>REOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>REOR</em>'.
	 * @see realear.OcclusionEffects#getREOR()
	 * @see #getOcclusionEffects()
	 * @generated
	 */
	EReference getOcclusionEffects_REOR();

	/**
	 * Returns the meta object for class '{@link realear.RealEarCouplerDifference <em>Real Ear Coupler Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Ear Coupler Difference</em>'.
	 * @see realear.RealEarCouplerDifference
	 * @generated
	 */
	EClass getRealEarCouplerDifference();

	/**
	 * Returns the meta object for the containment reference '{@link realear.RealEarCouplerDifference#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.RealEarCouplerDifference#getMeasurementConditions()
	 * @see #getRealEarCouplerDifference()
	 * @generated
	 */
	EReference getRealEarCouplerDifference_MeasurementConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarCouplerDifference#getRECD <em>RECD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RECD</em>'.
	 * @see realear.RealEarCouplerDifference#getRECD()
	 * @see #getRealEarCouplerDifference()
	 * @generated
	 */
	EReference getRealEarCouplerDifference_RECD();

	/**
	 * Returns the meta object for class '{@link realear.RealEarDataType <em>Real Ear Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Ear Data Type</em>'.
	 * @see realear.RealEarDataType
	 * @generated
	 */
	EClass getRealEarDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see realear.RealEarDataType#getTargets()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link realear.RealEarDataType#getRealEarUnaidedResponse <em>Real Ear Unaided Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Ear Unaided Response</em>'.
	 * @see realear.RealEarDataType#getRealEarUnaidedResponse()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_RealEarUnaidedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link realear.RealEarDataType#getRealEarOccludedResponse <em>Real Ear Occluded Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Ear Occluded Response</em>'.
	 * @see realear.RealEarDataType#getRealEarOccludedResponse()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_RealEarOccludedResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getRealEarInsertionResponse <em>Real Ear Insertion Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Ear Insertion Response</em>'.
	 * @see realear.RealEarDataType#getRealEarInsertionResponse()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_RealEarInsertionResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getRealEarAidedResponse <em>Real Ear Aided Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Ear Aided Response</em>'.
	 * @see realear.RealEarDataType#getRealEarAidedResponse()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_RealEarAidedResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getInputOutputMeasurement <em>Input Output Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Output Measurement</em>'.
	 * @see realear.RealEarDataType#getInputOutputMeasurement()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_InputOutputMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getTotalHarmonicDistortionMeasurement <em>Total Harmonic Distortion Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Harmonic Distortion Measurement</em>'.
	 * @see realear.RealEarDataType#getTotalHarmonicDistortionMeasurement()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_TotalHarmonicDistortionMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link realear.RealEarDataType#getOcclusionMeasurement <em>Occlusion Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occlusion Measurement</em>'.
	 * @see realear.RealEarDataType#getOcclusionMeasurement()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_OcclusionMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.RealEarDataType#getRealEarCoupler <em>Real Ear Coupler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Ear Coupler</em>'.
	 * @see realear.RealEarDataType#getRealEarCoupler()
	 * @see #getRealEarDataType()
	 * @generated
	 */
	EReference getRealEarDataType_RealEarCoupler();

	/**
	 * Returns the meta object for class '{@link realear.TargetCurve <em>Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Curve</em>'.
	 * @see realear.TargetCurve
	 * @generated
	 */
	EClass getTargetCurve();

	/**
	 * Returns the meta object for the containment reference '{@link realear.TargetCurve#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Curve</em>'.
	 * @see realear.TargetCurve#getCurve()
	 * @see #getTargetCurve()
	 * @generated
	 */
	EReference getTargetCurve_Curve();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetCurve#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see realear.TargetCurve#getResult()
	 * @see #getTargetCurve()
	 * @generated
	 */
	EAttribute getTargetCurve_Result();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetCurve#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see realear.TargetCurve#getResolution()
	 * @see #getTargetCurve()
	 * @generated
	 */
	EAttribute getTargetCurve_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetCurve#getPreDelay <em>Pre Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Delay</em>'.
	 * @see realear.TargetCurve#getPreDelay()
	 * @see #getTargetCurve()
	 * @generated
	 */
	EAttribute getTargetCurve_PreDelay();

	/**
	 * Returns the meta object for class '{@link realear.TargetMeasurement <em>Target Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Measurement</em>'.
	 * @see realear.TargetMeasurement
	 * @generated
	 */
	EClass getTargetMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link realear.TargetMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Conditions</em>'.
	 * @see realear.TargetMeasurement#getMeasurementConditions()
	 * @see #getTargetMeasurement()
	 * @generated
	 */
	EReference getTargetMeasurement_MeasurementConditions();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetMeasurement#getLevelStep <em>Level Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Step</em>'.
	 * @see realear.TargetMeasurement#getLevelStep()
	 * @see #getTargetMeasurement()
	 * @generated
	 */
	EAttribute getTargetMeasurement_LevelStep();

	/**
	 * Returns the meta object for the containment reference '{@link realear.TargetMeasurement#getAttackCurve <em>Attack Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attack Curve</em>'.
	 * @see realear.TargetMeasurement#getAttackCurve()
	 * @see #getTargetMeasurement()
	 * @generated
	 */
	EReference getTargetMeasurement_AttackCurve();

	/**
	 * Returns the meta object for the containment reference '{@link realear.TargetMeasurement#getReleaseCurve <em>Release Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Curve</em>'.
	 * @see realear.TargetMeasurement#getReleaseCurve()
	 * @see #getTargetMeasurement()
	 * @generated
	 */
	EReference getTargetMeasurement_ReleaseCurve();

	/**
	 * Returns the meta object for class '{@link realear.TargetMeasurementPoint <em>Target Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Measurement Point</em>'.
	 * @see realear.TargetMeasurementPoint
	 * @generated
	 */
	EClass getTargetMeasurementPoint();

	/**
	 * Returns the meta object for the attribute list '{@link realear.TargetMeasurementPoint#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output</em>'.
	 * @see realear.TargetMeasurementPoint#getOutput()
	 * @see #getTargetMeasurementPoint()
	 * @generated
	 */
	EAttribute getTargetMeasurementPoint_Output();

	/**
	 * Returns the meta object for class '{@link realear.TargetPoint <em>Target Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Point</em>'.
	 * @see realear.TargetPoint
	 * @generated
	 */
	EClass getTargetPoint();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetPoint#getTargetFrequency <em>Target Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Frequency</em>'.
	 * @see realear.TargetPoint#getTargetFrequency()
	 * @see #getTargetPoint()
	 * @generated
	 */
	EAttribute getTargetPoint_TargetFrequency();

	/**
	 * Returns the meta object for the attribute '{@link realear.TargetPoint#getTargetGain <em>Target Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Gain</em>'.
	 * @see realear.TargetPoint#getTargetGain()
	 * @see #getTargetPoint()
	 * @generated
	 */
	EAttribute getTargetPoint_TargetGain();

	/**
	 * Returns the meta object for enum '{@link realear.BatteryPillType <em>Battery Pill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery Pill Type</em>'.
	 * @see realear.BatteryPillType
	 * @generated
	 */
	EEnum getBatteryPillType();

	/**
	 * Returns the meta object for enum '{@link realear.BatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery Type</em>'.
	 * @see realear.BatteryType
	 * @generated
	 */
	EEnum getBatteryType();

	/**
	 * Returns the meta object for enum '{@link realear.CouplerType <em>Coupler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coupler Type</em>'.
	 * @see realear.CouplerType
	 * @generated
	 */
	EEnum getCouplerType();

	/**
	 * Returns the meta object for enum '{@link realear.FittingRule <em>Fitting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fitting Rule</em>'.
	 * @see realear.FittingRule
	 * @generated
	 */
	EEnum getFittingRule();

	/**
	 * Returns the meta object for enum '{@link realear.HearingInstrumentType <em>Hearing Instrument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hearing Instrument Type</em>'.
	 * @see realear.HearingInstrumentType
	 * @generated
	 */
	EEnum getHearingInstrumentType();

	/**
	 * Returns the meta object for enum '{@link realear.MeasurementIdentification <em>Measurement Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement Identification</em>'.
	 * @see realear.MeasurementIdentification
	 * @generated
	 */
	EEnum getMeasurementIdentification();

	/**
	 * Returns the meta object for enum '{@link realear.MeasurementMode <em>Measurement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement Mode</em>'.
	 * @see realear.MeasurementMode
	 * @generated
	 */
	EEnum getMeasurementMode();

	/**
	 * Returns the meta object for enum '{@link realear.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see realear.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link realear.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see realear.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Attack Release Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attack Release Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='AttackReleaseTime_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='.000' fractionDigits='3'"
	 * @generated
	 */
	EDataType getAttackReleaseTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Battery Impedance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Impedance Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='BatteryImpedance_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3'"
	 * @generated
	 */
	EDataType getBatteryImpedanceType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Battery Impedance Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Impedance Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='BatteryImpedance_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3'"
	 * @generated
	 */
	EDataType getBatteryImpedanceType1();

	/**
	 * Returns the meta object for data type '{@link realear.BatteryPillType <em>Battery Pill Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Pill Type Object</em>'.
	 * @see realear.BatteryPillType
	 * @model instanceClass="realear.BatteryPillType"
	 *        extendedMetaData="name='BatteryPillType:Object' baseType='BatteryPillType'"
	 * @generated
	 */
	EDataType getBatteryPillTypeObject();

	/**
	 * Returns the meta object for data type '{@link realear.BatteryType <em>Battery Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Type Object</em>'.
	 * @see realear.BatteryType
	 * @model instanceClass="realear.BatteryType"
	 *        extendedMetaData="name='BatteryType:Object' baseType='BatteryType'"
	 * @generated
	 */
	EDataType getBatteryTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Battery Voltage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Voltage Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='BatteryVoltage_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3'"
	 * @generated
	 */
	EDataType getBatteryVoltageType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Battery Voltage Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Voltage Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='BatteryVoltage_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3'"
	 * @generated
	 */
	EDataType getBatteryVoltageType1();

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
	 * Returns the meta object for data type '{@link realear.CouplerType <em>Coupler Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coupler Type Object</em>'.
	 * @see realear.CouplerType
	 * @model instanceClass="realear.CouplerType"
	 *        extendedMetaData="name='CouplerType:Object' baseType='CouplerType'"
	 * @generated
	 */
	EDataType getCouplerTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Current Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Current Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Current_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2'"
	 * @generated
	 */
	EDataType getCurrentType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Equivalent Root Mean Square Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Equivalent Root Mean Square Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='EquivalentRootMeanSquare_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getEquivalentRootMeanSquareType();

	/**
	 * Returns the meta object for data type '{@link realear.FittingRule <em>Fitting Rule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fitting Rule Object</em>'.
	 * @see realear.FittingRule
	 * @model instanceClass="realear.FittingRule"
	 *        extendedMetaData="name='FittingRule:Object' baseType='FittingRule'"
	 * @generated
	 */
	EDataType getFittingRuleObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fx1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fx1 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Fx1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getFx1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fx2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fx2 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Fx2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getFx2Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Fx3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fx3 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Fx3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getFx3Type();

	/**
	 * Returns the meta object for data type '{@link realear.HearingInstrumentType <em>Hearing Instrument Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hearing Instrument Type Object</em>'.
	 * @see realear.HearingInstrumentType
	 * @model instanceClass="realear.HearingInstrumentType"
	 *        extendedMetaData="name='HearingInstrumentType:Object' baseType='HearingInstrumentType'"
	 * @generated
	 */
	EDataType getHearingInstrumentTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Input1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input1 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Input1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getInput1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Input2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input2 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Input2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getInput2Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Input_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getInputType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Input Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Input_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getInputType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Input Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Input_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getInputType2();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Level Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Level Step Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='LevelStep_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getLevelStepType();

	/**
	 * Returns the meta object for data type '{@link realear.MeasurementIdentification <em>Measurement Identification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measurement Identification Object</em>'.
	 * @see realear.MeasurementIdentification
	 * @model instanceClass="realear.MeasurementIdentification"
	 *        extendedMetaData="name='MeasurementIdentification:Object' baseType='MeasurementIdentification'"
	 * @generated
	 */
	EDataType getMeasurementIdentificationObject();

	/**
	 * Returns the meta object for data type '{@link realear.MeasurementMode <em>Measurement Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measurement Mode Object</em>'.
	 * @see realear.MeasurementMode
	 * @model instanceClass="realear.MeasurementMode"
	 *        extendedMetaData="name='MeasurementMode:Object' baseType='MeasurementMode'"
	 * @generated
	 */
	EDataType getMeasurementModeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output1 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutput1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output2 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutput2Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Diff1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Diff1 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='OutputDiff1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutputDiff1Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Diff2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Diff2 Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='OutputDiff2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutputDiff2Type();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' totalDigits='1'"
	 * @generated
	 */
	EDataType getOutputType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutputType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutputType2();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Output Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Type3</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Output_._3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getOutputType3();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Reserve Gain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reserve Gain Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ReserveGain_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getReserveGainType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Rule Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rule Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RuleName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='51'"
	 * @generated
	 */
	EDataType getRuleNameType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signal Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Level Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SignalLevel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getSignalLevelType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signal Level Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Level Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SignalLevel_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getSignalLevelType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Signal Level Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Level Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SignalLevel_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getSignalLevelType2();

	/**
	 * Returns the meta object for data type '{@link realear.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see realear.SignalOutputType
	 * @model instanceClass="realear.SignalOutputType"
	 *        extendedMetaData="name='SignalOutputType:Object' baseType='SignalOutputType'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link realear.SignalType <em>Signal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Object</em>'.
	 * @see realear.SignalType
	 * @model instanceClass="realear.SignalType"
	 *        extendedMetaData="name='SignalType:Object' baseType='SignalType'"
	 * @generated
	 */
	EDataType getSignalTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Target Gain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Target Gain Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TargetGain_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getTargetGainType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Third HD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Third HD Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='ThirdHD_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2'"
	 * @generated
	 */
	EDataType getThirdHDType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>TI Distortion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TI Distortion Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TIDistortion_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2'"
	 * @generated
	 */
	EDataType getTIDistortionType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Vent Canal Diameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vent Canal Diameter Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='VentCanalDiameter_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getVentCanalDiameterType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Vent Canal Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vent Canal Length Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='VentCanalLength_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getVentCanalLengthType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
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
	RealearFactory getRealearFactory();

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
		 * The meta object literal for the '{@link realear.impl.AttackReleaseMeasurementPointImpl <em>Attack Release Measurement Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.AttackReleaseMeasurementPointImpl
		 * @see realear.impl.RealearPackageImpl#getAttackReleaseMeasurementPoint()
		 * @generated
		 */
		EClass ATTACK_RELEASE_MEASUREMENT_POINT = eINSTANCE.getAttackReleaseMeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT = eINSTANCE.getAttackReleaseMeasurementPoint_Output();

		/**
		 * The meta object literal for the '<em><b>Attack Release Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME = eINSTANCE.getAttackReleaseMeasurementPoint_AttackReleaseTime();

		/**
		 * The meta object literal for the '{@link realear.impl.BatteryCurrentMeasurementImpl <em>Battery Current Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.BatteryCurrentMeasurementImpl
		 * @see realear.impl.RealearPackageImpl#getBatteryCurrentMeasurement()
		 * @generated
		 */
		EClass BATTERY_CURRENT_MEASUREMENT = eINSTANCE.getBatteryCurrentMeasurement();

		/**
		 * The meta object literal for the '<em><b>Battery Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS = eINSTANCE.getBatteryCurrentMeasurement_BatteryConditions();

		/**
		 * The meta object literal for the '<em><b>Battery Curve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE = eINSTANCE.getBatteryCurrentMeasurement_BatteryCurve();

		/**
		 * The meta object literal for the '{@link realear.impl.BatteryMeasurementConditionsImpl <em>Battery Measurement Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.BatteryMeasurementConditionsImpl
		 * @see realear.impl.RealearPackageImpl#getBatteryMeasurementConditions()
		 * @generated
		 */
		EClass BATTERY_MEASUREMENT_CONDITIONS = eINSTANCE.getBatteryMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Manufacturer Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE = eINSTANCE.getBatteryMeasurementConditions_ManufacturerCode();

		/**
		 * The meta object literal for the '<em><b>Dev Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE = eINSTANCE.getBatteryMeasurementConditions_DevTypeCode();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE = eINSTANCE.getBatteryMeasurementConditions_SignalType();

		/**
		 * The meta object literal for the '<em><b>Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT = eINSTANCE.getBatteryMeasurementConditions_SignalOutput();

		/**
		 * The meta object literal for the '<em><b>Signal Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL = eINSTANCE.getBatteryMeasurementConditions_SignalLevel();

		/**
		 * The meta object literal for the '<em><b>Signal Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY = eINSTANCE.getBatteryMeasurementConditions_SignalFrequency();

		/**
		 * The meta object literal for the '<em><b>Battery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE = eINSTANCE.getBatteryMeasurementConditions_BatteryType();

		/**
		 * The meta object literal for the '<em><b>Battery Pill Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE = eINSTANCE.getBatteryMeasurementConditions_BatteryPillType();

		/**
		 * The meta object literal for the '<em><b>Battery Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE = eINSTANCE.getBatteryMeasurementConditions_BatteryVoltage();

		/**
		 * The meta object literal for the '<em><b>Battery Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE = eINSTANCE.getBatteryMeasurementConditions_BatteryImpedance();

		/**
		 * The meta object literal for the '<em><b>Use Real Ear Coupler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER = eINSTANCE.getBatteryMeasurementConditions_UseRealEarCoupler();

		/**
		 * The meta object literal for the '<em><b>Measurement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE = eINSTANCE.getBatteryMeasurementConditions_MeasurementMode();

		/**
		 * The meta object literal for the '<em><b>Measurement Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION = eINSTANCE.getBatteryMeasurementConditions_MeasurementIdentification();

		/**
		 * The meta object literal for the '{@link realear.impl.BatteryMeasurementPointImpl <em>Battery Measurement Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.BatteryMeasurementPointImpl
		 * @see realear.impl.RealearPackageImpl#getBatteryMeasurementPoint()
		 * @generated
		 */
		EClass BATTERY_MEASUREMENT_POINT = eINSTANCE.getBatteryMeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_POINT__FREQUENCY = eINSTANCE.getBatteryMeasurementPoint_Frequency();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_MEASUREMENT_POINT__CURRENT = eINSTANCE.getBatteryMeasurementPoint_Current();

		/**
		 * The meta object literal for the '{@link realear.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.DocumentRootImpl
		 * @see realear.impl.RealearPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>HIMSA Rem Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIMSA_REM_STANDARD = eINSTANCE.getDocumentRoot_HIMSARemStandard();

		/**
		 * The meta object literal for the '{@link realear.impl.EquivalentInputNoiseImpl <em>Equivalent Input Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.EquivalentInputNoiseImpl
		 * @see realear.impl.RealearPackageImpl#getEquivalentInputNoise()
		 * @generated
		 */
		EClass EQUIVALENT_INPUT_NOISE = eINSTANCE.getEquivalentInputNoise();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS = eINSTANCE.getEquivalentInputNoise_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_INPUT_NOISE__POINT = eINSTANCE.getEquivalentInputNoise_Point();

		/**
		 * The meta object literal for the '<em><b>Equivalent Root Mean Square</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE = eINSTANCE.getEquivalentInputNoise_EquivalentRootMeanSquare();

		/**
		 * The meta object literal for the '{@link realear.impl.FrequencyMeasurementImpl <em>Frequency Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.FrequencyMeasurementImpl
		 * @see realear.impl.RealearPackageImpl#getFrequencyMeasurement()
		 * @generated
		 */
		EClass FREQUENCY_MEASUREMENT = eINSTANCE.getFrequencyMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_MEASUREMENT__MEASUREMENT_CONDITIONS = eINSTANCE.getFrequencyMeasurement_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_MEASUREMENT__POINT = eINSTANCE.getFrequencyMeasurement_Point();

		/**
		 * The meta object literal for the '{@link realear.impl.FrequencyMeasurementPointImpl <em>Frequency Measurement Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.FrequencyMeasurementPointImpl
		 * @see realear.impl.RealearPackageImpl#getFrequencyMeasurementPoint()
		 * @generated
		 */
		EClass FREQUENCY_MEASUREMENT_POINT = eINSTANCE.getFrequencyMeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_MEASUREMENT_POINT__FREQUENCY = eINSTANCE.getFrequencyMeasurementPoint_Frequency();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_MEASUREMENT_POINT__INPUT = eINSTANCE.getFrequencyMeasurementPoint_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_MEASUREMENT_POINT__OUTPUT = eINSTANCE.getFrequencyMeasurementPoint_Output();

		/**
		 * The meta object literal for the '{@link realear.impl.FullTargetCurveImpl <em>Full Target Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.FullTargetCurveImpl
		 * @see realear.impl.RealearPackageImpl#getFullTargetCurve()
		 * @generated
		 */
		EClass FULL_TARGET_CURVE = eINSTANCE.getFullTargetCurve();

		/**
		 * The meta object literal for the '<em><b>Manufacturers Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__MANUFACTURERS_CODE = eINSTANCE.getFullTargetCurve_ManufacturersCode();

		/**
		 * The meta object literal for the '<em><b>Device Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__DEVICE_TYPE_CODE = eINSTANCE.getFullTargetCurve_DeviceTypeCode();

		/**
		 * The meta object literal for the '<em><b>Fitting Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__FITTING_RULE = eINSTANCE.getFullTargetCurve_FittingRule();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE = eINSTANCE.getFullTargetCurve_HearingInstrumentType();

		/**
		 * The meta object literal for the '<em><b>Vent Canal Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__VENT_CANAL_DIAMETER = eINSTANCE.getFullTargetCurve_VentCanalDiameter();

		/**
		 * The meta object literal for the '<em><b>Vent Canal Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__VENT_CANAL_LENGTH = eINSTANCE.getFullTargetCurve_VentCanalLength();

		/**
		 * The meta object literal for the '<em><b>Reserve Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__RESERVE_GAIN = eINSTANCE.getFullTargetCurve_ReserveGain();

		/**
		 * The meta object literal for the '<em><b>Coupler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__COUPLER_TYPE = eINSTANCE.getFullTargetCurve_CouplerType();

		/**
		 * The meta object literal for the '<em><b>Signal Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__SIGNAL_LEVEL = eINSTANCE.getFullTargetCurve_SignalLevel();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULL_TARGET_CURVE__TARGET = eINSTANCE.getFullTargetCurve_Target();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULL_TARGET_CURVE__RULE_NAME = eINSTANCE.getFullTargetCurve_RuleName();

		/**
		 * The meta object literal for the '{@link realear.impl.HarmonicDistortionMeasurementCurveImpl <em>Harmonic Distortion Measurement Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.HarmonicDistortionMeasurementCurveImpl
		 * @see realear.impl.RealearPackageImpl#getHarmonicDistortionMeasurementCurve()
		 * @generated
		 */
		EClass HARMONIC_DISTORTION_MEASUREMENT_CURVE = eINSTANCE.getHarmonicDistortionMeasurementCurve();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS = eINSTANCE.getHarmonicDistortionMeasurementCurve_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT = eINSTANCE.getHarmonicDistortionMeasurementCurve_Point();

		/**
		 * The meta object literal for the '{@link realear.impl.HarmonicDistortionPointImpl <em>Harmonic Distortion Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.HarmonicDistortionPointImpl
		 * @see realear.impl.RealearPackageImpl#getHarmonicDistortionPoint()
		 * @generated
		 */
		EClass HARMONIC_DISTORTION_POINT = eINSTANCE.getHarmonicDistortionPoint();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__FREQUENCY = eINSTANCE.getHarmonicDistortionPoint_Frequency();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__INPUT = eINSTANCE.getHarmonicDistortionPoint_Input();

		/**
		 * The meta object literal for the '<em><b>Fx1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__FX1 = eINSTANCE.getHarmonicDistortionPoint_Fx1();

		/**
		 * The meta object literal for the '<em><b>Fx2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__FX2 = eINSTANCE.getHarmonicDistortionPoint_Fx2();

		/**
		 * The meta object literal for the '<em><b>Fx3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__FX3 = eINSTANCE.getHarmonicDistortionPoint_Fx3();

		/**
		 * The meta object literal for the '<em><b>Third HD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARMONIC_DISTORTION_POINT__THIRD_HD = eINSTANCE.getHarmonicDistortionPoint_ThirdHD();

		/**
		 * The meta object literal for the '{@link realear.impl.HIMSARemStandardTypeImpl <em>HIMSA Rem Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.HIMSARemStandardTypeImpl
		 * @see realear.impl.RealearPackageImpl#getHIMSARemStandardType()
		 * @generated
		 */
		EClass HIMSA_REM_STANDARD_TYPE = eINSTANCE.getHIMSARemStandardType();

		/**
		 * The meta object literal for the '<em><b>Real Ear Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_REM_STANDARD_TYPE__REAL_EAR_DATA = eINSTANCE.getHIMSARemStandardType_RealEarData();

		/**
		 * The meta object literal for the '<em><b>Private REM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_REM_STANDARD_TYPE__PRIVATE_REM = eINSTANCE.getHIMSARemStandardType_PrivateREM();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_REM_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getHIMSARemStandardType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_REM_STANDARD_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getHIMSARemStandardType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_REM_STANDARD_TYPE__VERSION = eINSTANCE.getHIMSARemStandardType_Version();

		/**
		 * The meta object literal for the '{@link realear.impl.InputOutputMeasurementImpl <em>Input Output Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.InputOutputMeasurementImpl
		 * @see realear.impl.RealearPackageImpl#getInputOutputMeasurement()
		 * @generated
		 */
		EClass INPUT_OUTPUT_MEASUREMENT = eINSTANCE.getInputOutputMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_MEASUREMENT__MEASUREMENT_CONDITIONS = eINSTANCE.getInputOutputMeasurement_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_MEASUREMENT__POINT = eINSTANCE.getInputOutputMeasurement_Point();

		/**
		 * The meta object literal for the '{@link realear.impl.InputOutputPointImpl <em>Input Output Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.InputOutputPointImpl
		 * @see realear.impl.RealearPackageImpl#getInputOutputPoint()
		 * @generated
		 */
		EClass INPUT_OUTPUT_POINT = eINSTANCE.getInputOutputPoint();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_OUTPUT_POINT__INPUT = eINSTANCE.getInputOutputPoint_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_OUTPUT_POINT__OUTPUT = eINSTANCE.getInputOutputPoint_Output();

		/**
		 * The meta object literal for the '{@link realear.impl.IntermodulationDistortionMeasurementImpl <em>Intermodulation Distortion Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.IntermodulationDistortionMeasurementImpl
		 * @see realear.impl.RealearPackageImpl#getIntermodulationDistortionMeasurement()
		 * @generated
		 */
		EClass INTERMODULATION_DISTORTION_MEASUREMENT = eINSTANCE.getIntermodulationDistortionMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurement Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION = eINSTANCE.getIntermodulationDistortionMeasurement_MeasurementCondition();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMODULATION_DISTORTION_MEASUREMENT__POINT = eINSTANCE.getIntermodulationDistortionMeasurement_Point();

		/**
		 * The meta object literal for the '{@link realear.impl.IntermodulationDistortionPointImpl <em>Intermodulation Distortion Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.IntermodulationDistortionPointImpl
		 * @see realear.impl.RealearPackageImpl#getIntermodulationDistortionPoint()
		 * @generated
		 */
		EClass INTERMODULATION_DISTORTION_POINT = eINSTANCE.getIntermodulationDistortionPoint();

		/**
		 * The meta object literal for the '<em><b>Freq1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__FREQ1 = eINSTANCE.getIntermodulationDistortionPoint_Freq1();

		/**
		 * The meta object literal for the '<em><b>Freq2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__FREQ2 = eINSTANCE.getIntermodulationDistortionPoint_Freq2();

		/**
		 * The meta object literal for the '<em><b>Input1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__INPUT1 = eINSTANCE.getIntermodulationDistortionPoint_Input1();

		/**
		 * The meta object literal for the '<em><b>Input2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__INPUT2 = eINSTANCE.getIntermodulationDistortionPoint_Input2();

		/**
		 * The meta object literal for the '<em><b>Output1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__OUTPUT1 = eINSTANCE.getIntermodulationDistortionPoint_Output1();

		/**
		 * The meta object literal for the '<em><b>Output2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__OUTPUT2 = eINSTANCE.getIntermodulationDistortionPoint_Output2();

		/**
		 * The meta object literal for the '<em><b>Output Diff1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1 = eINSTANCE.getIntermodulationDistortionPoint_OutputDiff1();

		/**
		 * The meta object literal for the '<em><b>Output Diff2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2 = eINSTANCE.getIntermodulationDistortionPoint_OutputDiff2();

		/**
		 * The meta object literal for the '<em><b>TI Distortion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMODULATION_DISTORTION_POINT__TI_DISTORTION = eINSTANCE.getIntermodulationDistortionPoint_TIDistortion();

		/**
		 * The meta object literal for the '{@link realear.impl.MeasurementConditionsImpl <em>Measurement Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.MeasurementConditionsImpl
		 * @see realear.impl.RealearPackageImpl#getMeasurementConditions()
		 * @generated
		 */
		EClass MEASUREMENT_CONDITIONS = eINSTANCE.getMeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Manufacturer Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__MANUFACTURER_CODE = eINSTANCE.getMeasurementConditions_ManufacturerCode();

		/**
		 * The meta object literal for the '<em><b>Dev Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__DEV_TYPE_CODE = eINSTANCE.getMeasurementConditions_DevTypeCode();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__SIGNAL_TYPE = eINSTANCE.getMeasurementConditions_SignalType();

		/**
		 * The meta object literal for the '<em><b>Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT = eINSTANCE.getMeasurementConditions_SignalOutput();

		/**
		 * The meta object literal for the '<em><b>Signal Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__SIGNAL_LEVEL = eINSTANCE.getMeasurementConditions_SignalLevel();

		/**
		 * The meta object literal for the '<em><b>Signal Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY = eINSTANCE.getMeasurementConditions_SignalFrequency();

		/**
		 * The meta object literal for the '<em><b>Battery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__BATTERY_TYPE = eINSTANCE.getMeasurementConditions_BatteryType();

		/**
		 * The meta object literal for the '<em><b>Battery Pill Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE = eINSTANCE.getMeasurementConditions_BatteryPillType();

		/**
		 * The meta object literal for the '<em><b>Battery Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE = eINSTANCE.getMeasurementConditions_BatteryVoltage();

		/**
		 * The meta object literal for the '<em><b>Battery Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE = eINSTANCE.getMeasurementConditions_BatteryImpedance();

		/**
		 * The meta object literal for the '<em><b>Use Real Ear Coupler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER = eINSTANCE.getMeasurementConditions_UseRealEarCoupler();

		/**
		 * The meta object literal for the '<em><b>Measurement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__MEASUREMENT_MODE = eINSTANCE.getMeasurementConditions_MeasurementMode();

		/**
		 * The meta object literal for the '<em><b>Measurement Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION = eINSTANCE.getMeasurementConditions_MeasurementIdentification();

		/**
		 * The meta object literal for the '{@link realear.impl.OcclusionEffectsImpl <em>Occlusion Effects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.OcclusionEffectsImpl
		 * @see realear.impl.RealearPackageImpl#getOcclusionEffects()
		 * @generated
		 */
		EClass OCCLUSION_EFFECTS = eINSTANCE.getOcclusionEffects();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS = eINSTANCE.getOcclusionEffects_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>REUR</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCLUSION_EFFECTS__REUR = eINSTANCE.getOcclusionEffects_REUR();

		/**
		 * The meta object literal for the '<em><b>REOR</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCLUSION_EFFECTS__REOR = eINSTANCE.getOcclusionEffects_REOR();

		/**
		 * The meta object literal for the '{@link realear.impl.RealEarCouplerDifferenceImpl <em>Real Ear Coupler Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.RealEarCouplerDifferenceImpl
		 * @see realear.impl.RealearPackageImpl#getRealEarCouplerDifference()
		 * @generated
		 */
		EClass REAL_EAR_COUPLER_DIFFERENCE = eINSTANCE.getRealEarCouplerDifference();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS = eINSTANCE.getRealEarCouplerDifference_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>RECD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_COUPLER_DIFFERENCE__RECD = eINSTANCE.getRealEarCouplerDifference_RECD();

		/**
		 * The meta object literal for the '{@link realear.impl.RealEarDataTypeImpl <em>Real Ear Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.RealEarDataTypeImpl
		 * @see realear.impl.RealearPackageImpl#getRealEarDataType()
		 * @generated
		 */
		EClass REAL_EAR_DATA_TYPE = eINSTANCE.getRealEarDataType();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__TARGETS = eINSTANCE.getRealEarDataType_Targets();

		/**
		 * The meta object literal for the '<em><b>Real Ear Unaided Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE = eINSTANCE.getRealEarDataType_RealEarUnaidedResponse();

		/**
		 * The meta object literal for the '<em><b>Real Ear Occluded Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE = eINSTANCE.getRealEarDataType_RealEarOccludedResponse();

		/**
		 * The meta object literal for the '<em><b>Real Ear Insertion Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE = eINSTANCE.getRealEarDataType_RealEarInsertionResponse();

		/**
		 * The meta object literal for the '<em><b>Real Ear Aided Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE = eINSTANCE.getRealEarDataType_RealEarAidedResponse();

		/**
		 * The meta object literal for the '<em><b>Input Output Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT = eINSTANCE.getRealEarDataType_InputOutputMeasurement();

		/**
		 * The meta object literal for the '<em><b>Total Harmonic Distortion Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT = eINSTANCE.getRealEarDataType_TotalHarmonicDistortionMeasurement();

		/**
		 * The meta object literal for the '<em><b>Occlusion Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT = eINSTANCE.getRealEarDataType_OcclusionMeasurement();

		/**
		 * The meta object literal for the '<em><b>Real Ear Coupler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER = eINSTANCE.getRealEarDataType_RealEarCoupler();

		/**
		 * The meta object literal for the '{@link realear.impl.TargetCurveImpl <em>Target Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.TargetCurveImpl
		 * @see realear.impl.RealearPackageImpl#getTargetCurve()
		 * @generated
		 */
		EClass TARGET_CURVE = eINSTANCE.getTargetCurve();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_CURVE__CURVE = eINSTANCE.getTargetCurve_Curve();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_CURVE__RESULT = eINSTANCE.getTargetCurve_Result();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_CURVE__RESOLUTION = eINSTANCE.getTargetCurve_Resolution();

		/**
		 * The meta object literal for the '<em><b>Pre Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_CURVE__PRE_DELAY = eINSTANCE.getTargetCurve_PreDelay();

		/**
		 * The meta object literal for the '{@link realear.impl.TargetMeasurementImpl <em>Target Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.TargetMeasurementImpl
		 * @see realear.impl.RealearPackageImpl#getTargetMeasurement()
		 * @generated
		 */
		EClass TARGET_MEASUREMENT = eINSTANCE.getTargetMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurement Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS = eINSTANCE.getTargetMeasurement_MeasurementConditions();

		/**
		 * The meta object literal for the '<em><b>Level Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_MEASUREMENT__LEVEL_STEP = eINSTANCE.getTargetMeasurement_LevelStep();

		/**
		 * The meta object literal for the '<em><b>Attack Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MEASUREMENT__ATTACK_CURVE = eINSTANCE.getTargetMeasurement_AttackCurve();

		/**
		 * The meta object literal for the '<em><b>Release Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MEASUREMENT__RELEASE_CURVE = eINSTANCE.getTargetMeasurement_ReleaseCurve();

		/**
		 * The meta object literal for the '{@link realear.impl.TargetMeasurementPointImpl <em>Target Measurement Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.TargetMeasurementPointImpl
		 * @see realear.impl.RealearPackageImpl#getTargetMeasurementPoint()
		 * @generated
		 */
		EClass TARGET_MEASUREMENT_POINT = eINSTANCE.getTargetMeasurementPoint();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_MEASUREMENT_POINT__OUTPUT = eINSTANCE.getTargetMeasurementPoint_Output();

		/**
		 * The meta object literal for the '{@link realear.impl.TargetPointImpl <em>Target Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.impl.TargetPointImpl
		 * @see realear.impl.RealearPackageImpl#getTargetPoint()
		 * @generated
		 */
		EClass TARGET_POINT = eINSTANCE.getTargetPoint();

		/**
		 * The meta object literal for the '<em><b>Target Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_POINT__TARGET_FREQUENCY = eINSTANCE.getTargetPoint_TargetFrequency();

		/**
		 * The meta object literal for the '<em><b>Target Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_POINT__TARGET_GAIN = eINSTANCE.getTargetPoint_TargetGain();

		/**
		 * The meta object literal for the '{@link realear.BatteryPillType <em>Battery Pill Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.BatteryPillType
		 * @see realear.impl.RealearPackageImpl#getBatteryPillType()
		 * @generated
		 */
		EEnum BATTERY_PILL_TYPE = eINSTANCE.getBatteryPillType();

		/**
		 * The meta object literal for the '{@link realear.BatteryType <em>Battery Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.BatteryType
		 * @see realear.impl.RealearPackageImpl#getBatteryType()
		 * @generated
		 */
		EEnum BATTERY_TYPE = eINSTANCE.getBatteryType();

		/**
		 * The meta object literal for the '{@link realear.CouplerType <em>Coupler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.CouplerType
		 * @see realear.impl.RealearPackageImpl#getCouplerType()
		 * @generated
		 */
		EEnum COUPLER_TYPE = eINSTANCE.getCouplerType();

		/**
		 * The meta object literal for the '{@link realear.FittingRule <em>Fitting Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.FittingRule
		 * @see realear.impl.RealearPackageImpl#getFittingRule()
		 * @generated
		 */
		EEnum FITTING_RULE = eINSTANCE.getFittingRule();

		/**
		 * The meta object literal for the '{@link realear.HearingInstrumentType <em>Hearing Instrument Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.HearingInstrumentType
		 * @see realear.impl.RealearPackageImpl#getHearingInstrumentType()
		 * @generated
		 */
		EEnum HEARING_INSTRUMENT_TYPE = eINSTANCE.getHearingInstrumentType();

		/**
		 * The meta object literal for the '{@link realear.MeasurementIdentification <em>Measurement Identification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.MeasurementIdentification
		 * @see realear.impl.RealearPackageImpl#getMeasurementIdentification()
		 * @generated
		 */
		EEnum MEASUREMENT_IDENTIFICATION = eINSTANCE.getMeasurementIdentification();

		/**
		 * The meta object literal for the '{@link realear.MeasurementMode <em>Measurement Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.MeasurementMode
		 * @see realear.impl.RealearPackageImpl#getMeasurementMode()
		 * @generated
		 */
		EEnum MEASUREMENT_MODE = eINSTANCE.getMeasurementMode();

		/**
		 * The meta object literal for the '{@link realear.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.SignalOutputType
		 * @see realear.impl.RealearPackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link realear.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.SignalType
		 * @see realear.impl.RealearPackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '<em>Attack Release Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getAttackReleaseTimeType()
		 * @generated
		 */
		EDataType ATTACK_RELEASE_TIME_TYPE = eINSTANCE.getAttackReleaseTimeType();

		/**
		 * The meta object literal for the '<em>Battery Impedance Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getBatteryImpedanceType()
		 * @generated
		 */
		EDataType BATTERY_IMPEDANCE_TYPE = eINSTANCE.getBatteryImpedanceType();

		/**
		 * The meta object literal for the '<em>Battery Impedance Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getBatteryImpedanceType1()
		 * @generated
		 */
		EDataType BATTERY_IMPEDANCE_TYPE1 = eINSTANCE.getBatteryImpedanceType1();

		/**
		 * The meta object literal for the '<em>Battery Pill Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.BatteryPillType
		 * @see realear.impl.RealearPackageImpl#getBatteryPillTypeObject()
		 * @generated
		 */
		EDataType BATTERY_PILL_TYPE_OBJECT = eINSTANCE.getBatteryPillTypeObject();

		/**
		 * The meta object literal for the '<em>Battery Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.BatteryType
		 * @see realear.impl.RealearPackageImpl#getBatteryTypeObject()
		 * @generated
		 */
		EDataType BATTERY_TYPE_OBJECT = eINSTANCE.getBatteryTypeObject();

		/**
		 * The meta object literal for the '<em>Battery Voltage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getBatteryVoltageType()
		 * @generated
		 */
		EDataType BATTERY_VOLTAGE_TYPE = eINSTANCE.getBatteryVoltageType();

		/**
		 * The meta object literal for the '<em>Battery Voltage Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getBatteryVoltageType1()
		 * @generated
		 */
		EDataType BATTERY_VOLTAGE_TYPE1 = eINSTANCE.getBatteryVoltageType1();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see realear.impl.RealearPackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Coupler Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.CouplerType
		 * @see realear.impl.RealearPackageImpl#getCouplerTypeObject()
		 * @generated
		 */
		EDataType COUPLER_TYPE_OBJECT = eINSTANCE.getCouplerTypeObject();

		/**
		 * The meta object literal for the '<em>Current Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getCurrentType()
		 * @generated
		 */
		EDataType CURRENT_TYPE = eINSTANCE.getCurrentType();

		/**
		 * The meta object literal for the '<em>Equivalent Root Mean Square Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getEquivalentRootMeanSquareType()
		 * @generated
		 */
		EDataType EQUIVALENT_ROOT_MEAN_SQUARE_TYPE = eINSTANCE.getEquivalentRootMeanSquareType();

		/**
		 * The meta object literal for the '<em>Fitting Rule Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.FittingRule
		 * @see realear.impl.RealearPackageImpl#getFittingRuleObject()
		 * @generated
		 */
		EDataType FITTING_RULE_OBJECT = eINSTANCE.getFittingRuleObject();

		/**
		 * The meta object literal for the '<em>Fx1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getFx1Type()
		 * @generated
		 */
		EDataType FX1_TYPE = eINSTANCE.getFx1Type();

		/**
		 * The meta object literal for the '<em>Fx2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getFx2Type()
		 * @generated
		 */
		EDataType FX2_TYPE = eINSTANCE.getFx2Type();

		/**
		 * The meta object literal for the '<em>Fx3 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getFx3Type()
		 * @generated
		 */
		EDataType FX3_TYPE = eINSTANCE.getFx3Type();

		/**
		 * The meta object literal for the '<em>Hearing Instrument Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.HearingInstrumentType
		 * @see realear.impl.RealearPackageImpl#getHearingInstrumentTypeObject()
		 * @generated
		 */
		EDataType HEARING_INSTRUMENT_TYPE_OBJECT = eINSTANCE.getHearingInstrumentTypeObject();

		/**
		 * The meta object literal for the '<em>Input1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getInput1Type()
		 * @generated
		 */
		EDataType INPUT1_TYPE = eINSTANCE.getInput1Type();

		/**
		 * The meta object literal for the '<em>Input2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getInput2Type()
		 * @generated
		 */
		EDataType INPUT2_TYPE = eINSTANCE.getInput2Type();

		/**
		 * The meta object literal for the '<em>Input Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getInputType()
		 * @generated
		 */
		EDataType INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em>Input Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getInputType1()
		 * @generated
		 */
		EDataType INPUT_TYPE1 = eINSTANCE.getInputType1();

		/**
		 * The meta object literal for the '<em>Input Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getInputType2()
		 * @generated
		 */
		EDataType INPUT_TYPE2 = eINSTANCE.getInputType2();

		/**
		 * The meta object literal for the '<em>Level Step Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getLevelStepType()
		 * @generated
		 */
		EDataType LEVEL_STEP_TYPE = eINSTANCE.getLevelStepType();

		/**
		 * The meta object literal for the '<em>Measurement Identification Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.MeasurementIdentification
		 * @see realear.impl.RealearPackageImpl#getMeasurementIdentificationObject()
		 * @generated
		 */
		EDataType MEASUREMENT_IDENTIFICATION_OBJECT = eINSTANCE.getMeasurementIdentificationObject();

		/**
		 * The meta object literal for the '<em>Measurement Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.MeasurementMode
		 * @see realear.impl.RealearPackageImpl#getMeasurementModeObject()
		 * @generated
		 */
		EDataType MEASUREMENT_MODE_OBJECT = eINSTANCE.getMeasurementModeObject();

		/**
		 * The meta object literal for the '<em>Output1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutput1Type()
		 * @generated
		 */
		EDataType OUTPUT1_TYPE = eINSTANCE.getOutput1Type();

		/**
		 * The meta object literal for the '<em>Output2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutput2Type()
		 * @generated
		 */
		EDataType OUTPUT2_TYPE = eINSTANCE.getOutput2Type();

		/**
		 * The meta object literal for the '<em>Output Diff1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputDiff1Type()
		 * @generated
		 */
		EDataType OUTPUT_DIFF1_TYPE = eINSTANCE.getOutputDiff1Type();

		/**
		 * The meta object literal for the '<em>Output Diff2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputDiff2Type()
		 * @generated
		 */
		EDataType OUTPUT_DIFF2_TYPE = eINSTANCE.getOutputDiff2Type();

		/**
		 * The meta object literal for the '<em>Output Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputType()
		 * @generated
		 */
		EDataType OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '<em>Output Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputType1()
		 * @generated
		 */
		EDataType OUTPUT_TYPE1 = eINSTANCE.getOutputType1();

		/**
		 * The meta object literal for the '<em>Output Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputType2()
		 * @generated
		 */
		EDataType OUTPUT_TYPE2 = eINSTANCE.getOutputType2();

		/**
		 * The meta object literal for the '<em>Output Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getOutputType3()
		 * @generated
		 */
		EDataType OUTPUT_TYPE3 = eINSTANCE.getOutputType3();

		/**
		 * The meta object literal for the '<em>Reserve Gain Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getReserveGainType()
		 * @generated
		 */
		EDataType RESERVE_GAIN_TYPE = eINSTANCE.getReserveGainType();

		/**
		 * The meta object literal for the '<em>Rule Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see realear.impl.RealearPackageImpl#getRuleNameType()
		 * @generated
		 */
		EDataType RULE_NAME_TYPE = eINSTANCE.getRuleNameType();

		/**
		 * The meta object literal for the '<em>Signal Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getSignalLevelType()
		 * @generated
		 */
		EDataType SIGNAL_LEVEL_TYPE = eINSTANCE.getSignalLevelType();

		/**
		 * The meta object literal for the '<em>Signal Level Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getSignalLevelType1()
		 * @generated
		 */
		EDataType SIGNAL_LEVEL_TYPE1 = eINSTANCE.getSignalLevelType1();

		/**
		 * The meta object literal for the '<em>Signal Level Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getSignalLevelType2()
		 * @generated
		 */
		EDataType SIGNAL_LEVEL_TYPE2 = eINSTANCE.getSignalLevelType2();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.SignalOutputType
		 * @see realear.impl.RealearPackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see realear.SignalType
		 * @see realear.impl.RealearPackageImpl#getSignalTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_OBJECT = eINSTANCE.getSignalTypeObject();

		/**
		 * The meta object literal for the '<em>Target Gain Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getTargetGainType()
		 * @generated
		 */
		EDataType TARGET_GAIN_TYPE = eINSTANCE.getTargetGainType();

		/**
		 * The meta object literal for the '<em>Third HD Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getThirdHDType()
		 * @generated
		 */
		EDataType THIRD_HD_TYPE = eINSTANCE.getThirdHDType();

		/**
		 * The meta object literal for the '<em>TI Distortion Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getTIDistortionType()
		 * @generated
		 */
		EDataType TI_DISTORTION_TYPE = eINSTANCE.getTIDistortionType();

		/**
		 * The meta object literal for the '<em>Vent Canal Diameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getVentCanalDiameterType()
		 * @generated
		 */
		EDataType VENT_CANAL_DIAMETER_TYPE = eINSTANCE.getVentCanalDiameterType();

		/**
		 * The meta object literal for the '<em>Vent Canal Length Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see realear.impl.RealearPackageImpl#getVentCanalLengthType()
		 * @generated
		 */
		EDataType VENT_CANAL_LENGTH_TYPE = eINSTANCE.getVentCanalLengthType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see realear.impl.RealearPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //RealearPackage
