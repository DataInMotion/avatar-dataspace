/*
 */
package admittance;


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
 * @see admittance.AdmittanceFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AdmittancePackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/admittance.ecore", ecoreSourceLocations="/model/admittance.ecore")
public interface AdmittancePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "admittance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/Admittance/501";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "admit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdmittancePackage eINSTANCE = admittance.impl.AdmittancePackageImpl.init();

	/**
	 * The meta object id for the '{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl <em>Acoustic Immittance Assessment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AcousticImmittanceAssessmentTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tympanogram Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST = 0;

	/**
	 * The feature id for the '<em><b>Reflex Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST = 1;

	/**
	 * The feature id for the '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = 2;

	/**
	 * The feature id for the '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = 3;

	/**
	 * The feature id for the '<em><b>Supplementary Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA = 4;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES = 5;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD = 6;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION = 8;

	/**
	 * The number of structural features of the '<em>Acoustic Immittance Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Acoustic Immittance Assessment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceCurveTypeImpl <em>Curve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceCurveTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceCurveType()
	 * @generated
	 */
	int ADMITTANCE_CURVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_CURVE_TYPE__CALCULATED = 0;

	/**
	 * The feature id for the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_CURVE_TYPE__MEASURED = 1;

	/**
	 * The number of structural features of the '<em>Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_CURVE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_CURVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceMeasurementConditionTypeImpl <em>Measurement Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceMeasurementConditionTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Signal Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY = 3;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE = 4;

	/**
	 * The feature id for the '<em><b>Probe Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME = 7;

	/**
	 * The number of structural features of the '<em>Measurement Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Measurement Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_MEASUREMENT_CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceType()
	 * @generated
	 */
	int ADMITTANCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_TYPE__CALCULATED = 0;

	/**
	 * The feature id for the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_TYPE__MEASURED = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceUnitCalculatedTypeImpl <em>Unit Calculated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceUnitCalculatedTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitCalculatedType()
	 * @generated
	 */
	int ADMITTANCE_UNIT_CALCULATED_TYPE = 4;

	/**
	 * The feature id for the '<em><b>YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_CALCULATED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_CALCULATED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceUnitMeasuredTypeImpl <em>Unit Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceUnitMeasuredTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitMeasuredType()
	 * @generated
	 */
	int ADMITTANCE_UNIT_MEASURED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>GUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT = 0;

	/**
	 * The feature id for the '<em><b>BUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_MEASURED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_MEASURED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceUnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceUnitTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitType()
	 * @generated
	 */
	int ADMITTANCE_UNIT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Admittance Unit Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED = 0;

	/**
	 * The feature id for the '<em><b>Admittance Unit Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED = 1;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceValueCalculatedTypeImpl <em>Value Calculated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceValueCalculatedTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueCalculatedType()
	 * @generated
	 */
	int ADMITTANCE_VALUE_CALCULATED_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_CALCULATED_TYPE__Y = 0;

	/**
	 * The number of structural features of the '<em>Value Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_CALCULATED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_CALCULATED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceValueMeasuredTypeImpl <em>Value Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceValueMeasuredTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueMeasuredType()
	 * @generated
	 */
	int ADMITTANCE_VALUE_MEASURED_TYPE = 8;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_MEASURED_TYPE__G = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_MEASURED_TYPE__B = 1;

	/**
	 * The number of structural features of the '<em>Value Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_MEASURED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_MEASURED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceValuePointCalculatedTypeImpl <em>Value Point Calculated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceValuePointCalculatedTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValuePointCalculatedType()
	 * @generated
	 */
	int ADMITTANCE_VALUE_POINT_CALCULATED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__PRESSURE = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__Y = 1;

	/**
	 * The number of structural features of the '<em>Value Point Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_CALCULATED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Point Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_CALCULATED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceValuePointMeasuredTypeImpl <em>Value Point Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceValuePointMeasuredTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValuePointMeasuredType()
	 * @generated
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE__PRESSURE = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE__B = 2;

	/**
	 * The number of structural features of the '<em>Value Point Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Point Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_POINT_MEASURED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.AdmittanceValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.AdmittanceValueTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueType()
	 * @generated
	 */
	int ADMITTANCE_VALUE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED = 0;

	/**
	 * The feature id for the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_TYPE__MEASURED = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMITTANCE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.CalculatedAdmittancePointsTypeImpl <em>Calculated Admittance Points Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.CalculatedAdmittancePointsTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getCalculatedAdmittancePointsType()
	 * @generated
	 */
	int CALCULATED_ADMITTANCE_POINTS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_ADMITTANCE_POINTS_TYPE__PT = 0;

	/**
	 * The number of structural features of the '<em>Calculated Admittance Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_ADMITTANCE_POINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Calculated Admittance Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_ADMITTANCE_POINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.CalculatedTypeImpl <em>Calculated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.CalculatedTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getCalculatedType()
	 * @generated
	 */
	int CALCULATED_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Admittance Value Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED = 0;

	/**
	 * The feature id for the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.CalculatedType1Impl <em>Calculated Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.CalculatedType1Impl
	 * @see admittance.impl.AdmittancePackageImpl#getCalculatedType1()
	 * @generated
	 */
	int CALCULATED_TYPE1 = 14;

	/**
	 * The feature id for the '<em><b>Calculated Admittance Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Calculated Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calculated Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.DeltaYPointsTypeImpl <em>Delta YPoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.DeltaYPointsTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getDeltaYPointsType()
	 * @generated
	 */
	int DELTA_YPOINTS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YPOINTS_TYPE__PT = 0;

	/**
	 * The number of structural features of the '<em>Delta YPoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YPOINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Delta YPoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YPOINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.DeltaYTypeImpl <em>Delta YType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.DeltaYTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getDeltaYType()
	 * @generated
	 */
	int DELTA_YTYPE = 16;

	/**
	 * The feature id for the '<em><b>Delta YPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE__DELTA_YPOINTS = 0;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE__G0 = 1;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE__B0 = 2;

	/**
	 * The feature id for the '<em><b>Measured Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Delta YType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delta YType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_YTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.DocumentRootImpl
	 * @see admittance.impl.AdmittancePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 17;

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
	 * The feature id for the '<em><b>Acoustic Immittance Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACOUSTIC_IMMITTANCE_ASSESSMENT = 3;

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
	 * The meta object id for the '{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl <em>Eustachian Tube Function Intact Ear Drum Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl
	 * @see admittance.impl.AdmittancePackageImpl#getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = 18;

	/**
	 * The feature id for the '<em><b>Admittance Curve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE = 0;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE = 1;

	/**
	 * The feature id for the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Eustachian Tube Function Intact Ear Drum Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Eustachian Tube Function Intact Ear Drum Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl
	 * @see admittance.impl.AdmittancePackageImpl#getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = 19;

	/**
	 * The feature id for the '<em><b>Pressure Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT = 0;

	/**
	 * The feature id for the '<em><b>Open Point</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT = 1;

	/**
	 * The feature id for the '<em><b>Close Point</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Time Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE = 3;

	/**
	 * The number of structural features of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Eustachian Tube Function Perforated Ear Drum Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.GradientTypeImpl <em>Gradient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.GradientTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getGradientType()
	 * @generated
	 */
	int GRADIENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Gradient Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__GRADIENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gradient Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__GRADIENT_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Gradient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gradient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.InformationTypeImpl <em>Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.InformationTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getInformationType()
	 * @generated
	 */
	int INFORMATION_TYPE = 21;

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
	 * The meta object id for the '{@link admittance.impl.MeasuredAdmittancePointsTypeImpl <em>Measured Admittance Points Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.MeasuredAdmittancePointsTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getMeasuredAdmittancePointsType()
	 * @generated
	 */
	int MEASURED_ADMITTANCE_POINTS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_ADMITTANCE_POINTS_TYPE__PT = 0;

	/**
	 * The number of structural features of the '<em>Measured Admittance Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_ADMITTANCE_POINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measured Admittance Points Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_ADMITTANCE_POINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.MeasuredTypeImpl <em>Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.MeasuredTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getMeasuredType()
	 * @generated
	 */
	int MEASURED_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Admittance Point Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__ADMITTANCE_POINT_MEASURED = 0;

	/**
	 * The feature id for the '<em><b>Admittance Unit Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED = 1;

	/**
	 * The number of structural features of the '<em>Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.MeasuredType1Impl <em>Measured Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.MeasuredType1Impl
	 * @see admittance.impl.AdmittancePackageImpl#getMeasuredType1()
	 * @generated
	 */
	int MEASURED_TYPE1 = 24;

	/**
	 * The feature id for the '<em><b>Measured Admittance Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Measured Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Measured Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measured Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.MeasurementNotesTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getMeasurementNotesType()
	 * @generated
	 */
	int MEASUREMENT_NOTES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Tympanometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tympanometer Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Tympanometer Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION = 2;

	/**
	 * The feature id for the '<em><b>Is Deaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE__IS_DEAF = 3;

	/**
	 * The number of structural features of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Measurement Notes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.NumericDeltaTypeImpl <em>Numeric Delta Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.NumericDeltaTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getNumericDeltaType()
	 * @generated
	 */
	int NUMERIC_DELTA_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Numeric Delta YPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Numeric Delta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Numeric Delta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.NumericDeltaYPointsTypeImpl <em>Numeric Delta YPoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.NumericDeltaYPointsTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getNumericDeltaYPointsType()
	 * @generated
	 */
	int NUMERIC_DELTA_YPOINTS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_YPOINTS_TYPE__PT = 0;

	/**
	 * The number of structural features of the '<em>Numeric Delta YPoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_YPOINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Numeric Delta YPoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DELTA_YPOINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.PressurePointTypeImpl <em>Pressure Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.PressurePointTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getPressurePointType()
	 * @generated
	 */
	int PRESSURE_POINT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_POINT_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_POINT_TYPE__PRESSURE = 1;

	/**
	 * The number of structural features of the '<em>Pressure Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_POINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pressure Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ProbeFrequencyTypeImpl <em>Probe Frequency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ProbeFrequencyTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getProbeFrequencyType()
	 * @generated
	 */
	int PROBE_FREQUENCY_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FREQUENCY_TYPE__FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FREQUENCY_TYPE__OTHER = 1;

	/**
	 * The number of structural features of the '<em>Probe Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FREQUENCY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Probe Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FREQUENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ReflexCurveTypeImpl <em>Reflex Curve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ReflexCurveTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getReflexCurveType()
	 * @generated
	 */
	int REFLEX_CURVE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Numeric Delta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE__NUMERIC_DELTA = 0;

	/**
	 * The feature id for the '<em><b>Delta Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE__DELTA_Y = 1;

	/**
	 * The number of structural features of the '<em>Reflex Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reflex Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ReflexTestTypeImpl <em>Reflex Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ReflexTestTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getReflexTestType()
	 * @generated
	 */
	int REFLEX_TEST_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Reflex Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__REFLEX_CURVE = 0;

	/**
	 * The feature id for the '<em><b>Result Of Reflex Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST = 1;

	/**
	 * The feature id for the '<em><b>Admittance Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Reflex Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reflex Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ReflexValuePointCalculatedTypeImpl <em>Reflex Value Point Calculated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ReflexValuePointCalculatedTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getReflexValuePointCalculatedType()
	 * @generated
	 */
	int REFLEX_VALUE_POINT_CALCULATED_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Numeric Delta Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y = 1;

	/**
	 * The number of structural features of the '<em>Reflex Value Point Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_CALCULATED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reflex Value Point Calculated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_CALCULATED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ReflexValuePointMeasuredTypeImpl <em>Reflex Value Point Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ReflexValuePointMeasuredTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getReflexValuePointMeasuredType()
	 * @generated
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Delta G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G = 1;

	/**
	 * The feature id for the '<em><b>Delta B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B = 2;

	/**
	 * The number of structural features of the '<em>Reflex Value Point Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reflex Value Point Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_VALUE_POINT_MEASURED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.ResultOfReflexTestTypeImpl <em>Result Of Reflex Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.ResultOfReflexTestTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getResultOfReflexTestType()
	 * @generated
	 */
	int RESULT_OF_REFLEX_TEST_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Reflex Detected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED = 0;

	/**
	 * The feature id for the '<em><b>Decay Basic Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Decay Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT = 2;

	/**
	 * The feature id for the '<em><b>Latency Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME = 3;

	/**
	 * The number of structural features of the '<em>Result Of Reflex Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Result Of Reflex Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OF_REFLEX_TEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.SignalLevelTypeImpl <em>Signal Level Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.SignalLevelTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getSignalLevelType()
	 * @generated
	 */
	int SIGNAL_LEVEL_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_LEVEL_TYPE__STIMULUS_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_LEVEL_TYPE__RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Signal Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_LEVEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signal Level Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.StaticAdmittanceTypeImpl <em>Static Admittance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.StaticAdmittanceTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getStaticAdmittanceType()
	 * @generated
	 */
	int STATIC_ADMITTANCE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Static Admittance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Static Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Static Admittance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ADMITTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Static Admittance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ADMITTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.SupplementaryDataTypeImpl <em>Supplementary Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.SupplementaryDataTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getSupplementaryDataType()
	 * @generated
	 */
	int SUPPLEMENTARY_DATA_TYPE = 37;

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
	 * The meta object id for the '{@link admittance.impl.TympanogramMeasurementConditionsTypeImpl <em>Tympanogram Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.TympanogramMeasurementConditionsTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Sweep Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED = 0;

	/**
	 * The feature id for the '<em><b>Record Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE = 1;

	/**
	 * The feature id for the '<em><b>Probe Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY = 2;

	/**
	 * The number of structural features of the '<em>Tympanogram Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tympanogram Measurement Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.impl.TympanogramTestTypeImpl <em>Tympanogram Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.impl.TympanogramTestTypeImpl
	 * @see admittance.impl.AdmittancePackageImpl#getTympanogramTestType()
	 * @generated
	 */
	int TYMPANOGRAM_TEST_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Admittance Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Admittance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE = 1;

	/**
	 * The feature id for the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__GRADIENT = 3;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__PRESSURE = 4;

	/**
	 * The feature id for the '<em><b>Resonance Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__RESULT = 6;

	/**
	 * The feature id for the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Static Admittance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE = 8;

	/**
	 * The number of structural features of the '<em>Tympanogram Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Tympanogram Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link admittance.DecayBasicResultType <em>Decay Basic Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.DecayBasicResultType
	 * @see admittance.impl.AdmittancePackageImpl#getDecayBasicResultType()
	 * @generated
	 */
	int DECAY_BASIC_RESULT_TYPE = 40;

	/**
	 * The meta object id for the '{@link admittance.EarType <em>Ear Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.EarType
	 * @see admittance.impl.AdmittancePackageImpl#getEarType()
	 * @generated
	 */
	int EAR_TYPE = 41;

	/**
	 * The meta object id for the '{@link admittance.FrequencyOtherType <em>Frequency Other Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.FrequencyOtherType
	 * @see admittance.impl.AdmittancePackageImpl#getFrequencyOtherType()
	 * @generated
	 */
	int FREQUENCY_OTHER_TYPE = 42;

	/**
	 * The meta object id for the '{@link admittance.RecordingModeType <em>Recording Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.RecordingModeType
	 * @see admittance.impl.AdmittancePackageImpl#getRecordingModeType()
	 * @generated
	 */
	int RECORDING_MODE_TYPE = 43;

	/**
	 * The meta object id for the '{@link admittance.ReflexTestResponseType <em>Reflex Test Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.ReflexTestResponseType
	 * @see admittance.impl.AdmittancePackageImpl#getReflexTestResponseType()
	 * @generated
	 */
	int REFLEX_TEST_RESPONSE_TYPE = 44;

	/**
	 * The meta object id for the '{@link admittance.ReflexTestTypeType <em>Reflex Test Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.ReflexTestTypeType
	 * @see admittance.impl.AdmittancePackageImpl#getReflexTestTypeType()
	 * @generated
	 */
	int REFLEX_TEST_TYPE_TYPE = 45;

	/**
	 * The meta object id for the '{@link admittance.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.SignalOutputType
	 * @see admittance.impl.AdmittancePackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 46;

	/**
	 * The meta object id for the '{@link admittance.SignalTypeType <em>Signal Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.SignalTypeType
	 * @see admittance.impl.AdmittancePackageImpl#getSignalTypeType()
	 * @generated
	 */
	int SIGNAL_TYPE_TYPE = 47;

	/**
	 * The meta object id for the '{@link admittance.TympanogramResultType <em>Tympanogram Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.TympanogramResultType
	 * @see admittance.impl.AdmittancePackageImpl#getTympanogramResultType()
	 * @generated
	 */
	int TYMPANOGRAM_RESULT_TYPE = 48;

	/**
	 * The meta object id for the '{@link admittance.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.UnitType
	 * @see admittance.impl.AdmittancePackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 49;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see admittance.impl.AdmittancePackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 50;

	/**
	 * The meta object id for the '<em>Decay Basic Result Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.DecayBasicResultType
	 * @see admittance.impl.AdmittancePackageImpl#getDecayBasicResultTypeObject()
	 * @generated
	 */
	int DECAY_BASIC_RESULT_TYPE_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Ear Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.EarType
	 * @see admittance.impl.AdmittancePackageImpl#getEarTypeObject()
	 * @generated
	 */
	int EAR_TYPE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Frequency Other Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.FrequencyOtherType
	 * @see admittance.impl.AdmittancePackageImpl#getFrequencyOtherTypeObject()
	 * @generated
	 */
	int FREQUENCY_OTHER_TYPE_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Recording Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.RecordingModeType
	 * @see admittance.impl.AdmittancePackageImpl#getRecordingModeTypeObject()
	 * @generated
	 */
	int RECORDING_MODE_TYPE_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Reflex Test Response Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.ReflexTestResponseType
	 * @see admittance.impl.AdmittancePackageImpl#getReflexTestResponseTypeObject()
	 * @generated
	 */
	int REFLEX_TEST_RESPONSE_TYPE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Reflex Test Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.ReflexTestTypeType
	 * @see admittance.impl.AdmittancePackageImpl#getReflexTestTypeTypeObject()
	 * @generated
	 */
	int REFLEX_TEST_TYPE_TYPE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.SignalOutputType
	 * @see admittance.impl.AdmittancePackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 57;

	/**
	 * The meta object id for the '<em>Signal Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.SignalTypeType
	 * @see admittance.impl.AdmittancePackageImpl#getSignalTypeTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_TYPE_OBJECT = 58;

	/**
	 * The meta object id for the '<em>Stimulus Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see admittance.impl.AdmittancePackageImpl#getStimulusLevelType()
	 * @generated
	 */
	int STIMULUS_LEVEL_TYPE = 59;

	/**
	 * The meta object id for the '<em>Time Base Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see admittance.impl.AdmittancePackageImpl#getTimeBaseType()
	 * @generated
	 */
	int TIME_BASE_TYPE = 60;

	/**
	 * The meta object id for the '<em>Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see admittance.impl.AdmittancePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 61;

	/**
	 * The meta object id for the '<em>Time Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see admittance.impl.AdmittancePackageImpl#getTimeType1()
	 * @generated
	 */
	int TIME_TYPE1 = 62;

	/**
	 * The meta object id for the '<em>Time Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see admittance.impl.AdmittancePackageImpl#getTimeType2()
	 * @generated
	 */
	int TIME_TYPE2 = 63;

	/**
	 * The meta object id for the '<em>Tympanogram Result Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.TympanogramResultType
	 * @see admittance.impl.AdmittancePackageImpl#getTympanogramResultTypeObject()
	 * @generated
	 */
	int TYMPANOGRAM_RESULT_TYPE_OBJECT = 64;

	/**
	 * The meta object id for the '<em>Tympanometer Make Model Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see admittance.impl.AdmittancePackageImpl#getTympanometerMakeModelType()
	 * @generated
	 */
	int TYMPANOMETER_MAKE_MODEL_TYPE = 65;

	/**
	 * The meta object id for the '<em>Tympanometer Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see admittance.impl.AdmittancePackageImpl#getTympanometerSerialNumberType()
	 * @generated
	 */
	int TYMPANOMETER_SERIAL_NUMBER_TYPE = 66;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see admittance.UnitType
	 * @see admittance.impl.AdmittancePackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see admittance.impl.AdmittancePackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 68;

	/**
	 * The meta object id for the '<em>Version Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see admittance.impl.AdmittancePackageImpl#getVersionType1()
	 * @generated
	 */
	int VERSION_TYPE1 = 69;


	/**
	 * Returns the meta object for class '{@link admittance.AcousticImmittanceAssessmentType <em>Acoustic Immittance Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acoustic Immittance Assessment Type</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType
	 * @generated
	 */
	EClass getAcousticImmittanceAssessmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.AcousticImmittanceAssessmentType#getTympanogramTest <em>Tympanogram Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tympanogram Test</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getTympanogramTest()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_TympanogramTest();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.AcousticImmittanceAssessmentType#getReflexTest <em>Reflex Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reflex Test</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getReflexTest()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_ReflexTest();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AcousticImmittanceAssessmentType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getEustachianTubeFunctionIntactEarDrumTest()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AcousticImmittanceAssessmentType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AcousticImmittanceAssessmentType#getSupplementaryData <em>Supplementary Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplementary Data</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getSupplementaryData()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_SupplementaryData();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AcousticImmittanceAssessmentType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notes</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getNotes()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EReference getAcousticImmittanceAssessmentType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AcousticImmittanceAssessmentType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getConvertedFromDataStandard()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EAttribute getAcousticImmittanceAssessmentType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AcousticImmittanceAssessmentType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#isValidatedByNOAH()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EAttribute getAcousticImmittanceAssessmentType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AcousticImmittanceAssessmentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see admittance.AcousticImmittanceAssessmentType#getVersion()
	 * @see #getAcousticImmittanceAssessmentType()
	 * @generated
	 */
	EAttribute getAcousticImmittanceAssessmentType_Version();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceCurveType <em>Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Type</em>'.
	 * @see admittance.AdmittanceCurveType
	 * @generated
	 */
	EClass getAdmittanceCurveType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceCurveType#getCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated</em>'.
	 * @see admittance.AdmittanceCurveType#getCalculated()
	 * @see #getAdmittanceCurveType()
	 * @generated
	 */
	EReference getAdmittanceCurveType_Calculated();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceCurveType#getMeasured <em>Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured</em>'.
	 * @see admittance.AdmittanceCurveType#getMeasured()
	 * @see #getAdmittanceCurveType()
	 * @generated
	 */
	EReference getAdmittanceCurveType_Measured();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceMeasurementConditionType <em>Measurement Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Condition Type</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType
	 * @generated
	 */
	EClass getAdmittanceMeasurementConditionType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceMeasurementConditionType#getSignalLevel <em>Signal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Level</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getSignalLevel()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EReference getAdmittanceMeasurementConditionType_SignalLevel();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getSignalType()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_SignalType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Output</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getSignalOutput()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_SignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getFrequency()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getPressure()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getProbeFrequency <em>Probe Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Frequency</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getProbeFrequency()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_ProbeFrequency();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceMeasurementConditionType#getTestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Type</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getTestType()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getAdmittanceMeasurementConditionType_TestType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceMeasurementConditionType#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see admittance.AdmittanceMeasurementConditionType#getCanalVolume()
	 * @see #getAdmittanceMeasurementConditionType()
	 * @generated
	 */
	EReference getAdmittanceMeasurementConditionType_CanalVolume();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see admittance.AdmittanceType
	 * @generated
	 */
	EClass getAdmittanceType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceType#getCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated</em>'.
	 * @see admittance.AdmittanceType#getCalculated()
	 * @see #getAdmittanceType()
	 * @generated
	 */
	EReference getAdmittanceType_Calculated();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceType#getMeasured <em>Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured</em>'.
	 * @see admittance.AdmittanceType#getMeasured()
	 * @see #getAdmittanceType()
	 * @generated
	 */
	EReference getAdmittanceType_Measured();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceUnitCalculatedType <em>Unit Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Calculated Type</em>'.
	 * @see admittance.AdmittanceUnitCalculatedType
	 * @generated
	 */
	EClass getAdmittanceUnitCalculatedType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceUnitCalculatedType#getYUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YUnit</em>'.
	 * @see admittance.AdmittanceUnitCalculatedType#getYUnit()
	 * @see #getAdmittanceUnitCalculatedType()
	 * @generated
	 */
	EAttribute getAdmittanceUnitCalculatedType_YUnit();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceUnitMeasuredType <em>Unit Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Measured Type</em>'.
	 * @see admittance.AdmittanceUnitMeasuredType
	 * @generated
	 */
	EClass getAdmittanceUnitMeasuredType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceUnitMeasuredType#getGUnit <em>GUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GUnit</em>'.
	 * @see admittance.AdmittanceUnitMeasuredType#getGUnit()
	 * @see #getAdmittanceUnitMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceUnitMeasuredType_GUnit();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceUnitMeasuredType#getBUnit <em>BUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUnit</em>'.
	 * @see admittance.AdmittanceUnitMeasuredType#getBUnit()
	 * @see #getAdmittanceUnitMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceUnitMeasuredType_BUnit();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see admittance.AdmittanceUnitType
	 * @generated
	 */
	EClass getAdmittanceUnitType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceUnitType#getAdmittanceUnitCalculated <em>Admittance Unit Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Unit Calculated</em>'.
	 * @see admittance.AdmittanceUnitType#getAdmittanceUnitCalculated()
	 * @see #getAdmittanceUnitType()
	 * @generated
	 */
	EReference getAdmittanceUnitType_AdmittanceUnitCalculated();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceUnitType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Unit Measured</em>'.
	 * @see admittance.AdmittanceUnitType#getAdmittanceUnitMeasured()
	 * @see #getAdmittanceUnitType()
	 * @generated
	 */
	EReference getAdmittanceUnitType_AdmittanceUnitMeasured();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceValueCalculatedType <em>Value Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Calculated Type</em>'.
	 * @see admittance.AdmittanceValueCalculatedType
	 * @generated
	 */
	EClass getAdmittanceValueCalculatedType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValueCalculatedType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see admittance.AdmittanceValueCalculatedType#getY()
	 * @see #getAdmittanceValueCalculatedType()
	 * @generated
	 */
	EAttribute getAdmittanceValueCalculatedType_Y();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceValueMeasuredType <em>Value Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Measured Type</em>'.
	 * @see admittance.AdmittanceValueMeasuredType
	 * @generated
	 */
	EClass getAdmittanceValueMeasuredType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValueMeasuredType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see admittance.AdmittanceValueMeasuredType#getG()
	 * @see #getAdmittanceValueMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceValueMeasuredType_G();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValueMeasuredType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see admittance.AdmittanceValueMeasuredType#getB()
	 * @see #getAdmittanceValueMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceValueMeasuredType_B();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceValuePointCalculatedType <em>Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Point Calculated Type</em>'.
	 * @see admittance.AdmittanceValuePointCalculatedType
	 * @generated
	 */
	EClass getAdmittanceValuePointCalculatedType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValuePointCalculatedType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see admittance.AdmittanceValuePointCalculatedType#getPressure()
	 * @see #getAdmittanceValuePointCalculatedType()
	 * @generated
	 */
	EAttribute getAdmittanceValuePointCalculatedType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValuePointCalculatedType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see admittance.AdmittanceValuePointCalculatedType#getY()
	 * @see #getAdmittanceValuePointCalculatedType()
	 * @generated
	 */
	EAttribute getAdmittanceValuePointCalculatedType_Y();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceValuePointMeasuredType <em>Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Point Measured Type</em>'.
	 * @see admittance.AdmittanceValuePointMeasuredType
	 * @generated
	 */
	EClass getAdmittanceValuePointMeasuredType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValuePointMeasuredType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see admittance.AdmittanceValuePointMeasuredType#getPressure()
	 * @see #getAdmittanceValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceValuePointMeasuredType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValuePointMeasuredType#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see admittance.AdmittanceValuePointMeasuredType#getG()
	 * @see #getAdmittanceValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceValuePointMeasuredType_G();

	/**
	 * Returns the meta object for the attribute '{@link admittance.AdmittanceValuePointMeasuredType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see admittance.AdmittanceValuePointMeasuredType#getB()
	 * @see #getAdmittanceValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getAdmittanceValuePointMeasuredType_B();

	/**
	 * Returns the meta object for class '{@link admittance.AdmittanceValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see admittance.AdmittanceValueType
	 * @generated
	 */
	EClass getAdmittanceValueType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceValueType#getValueCalculated <em>Value Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Calculated</em>'.
	 * @see admittance.AdmittanceValueType#getValueCalculated()
	 * @see #getAdmittanceValueType()
	 * @generated
	 */
	EReference getAdmittanceValueType_ValueCalculated();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.AdmittanceValueType#getMeasured <em>Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured</em>'.
	 * @see admittance.AdmittanceValueType#getMeasured()
	 * @see #getAdmittanceValueType()
	 * @generated
	 */
	EReference getAdmittanceValueType_Measured();

	/**
	 * Returns the meta object for class '{@link admittance.CalculatedAdmittancePointsType <em>Calculated Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Admittance Points Type</em>'.
	 * @see admittance.CalculatedAdmittancePointsType
	 * @generated
	 */
	EClass getCalculatedAdmittancePointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.CalculatedAdmittancePointsType#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pt</em>'.
	 * @see admittance.CalculatedAdmittancePointsType#getPt()
	 * @see #getCalculatedAdmittancePointsType()
	 * @generated
	 */
	EReference getCalculatedAdmittancePointsType_Pt();

	/**
	 * Returns the meta object for class '{@link admittance.CalculatedType <em>Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Type</em>'.
	 * @see admittance.CalculatedType
	 * @generated
	 */
	EClass getCalculatedType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.CalculatedType#getAdmittanceValueCalculated <em>Admittance Value Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Value Calculated</em>'.
	 * @see admittance.CalculatedType#getAdmittanceValueCalculated()
	 * @see #getCalculatedType()
	 * @generated
	 */
	EReference getCalculatedType_AdmittanceValueCalculated();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.CalculatedType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated Admittance Unit</em>'.
	 * @see admittance.CalculatedType#getCalculatedAdmittanceUnit()
	 * @see #getCalculatedType()
	 * @generated
	 */
	EReference getCalculatedType_CalculatedAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.CalculatedType1 <em>Calculated Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Type1</em>'.
	 * @see admittance.CalculatedType1
	 * @generated
	 */
	EClass getCalculatedType1();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.CalculatedType1#getCalculatedAdmittancePoints <em>Calculated Admittance Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated Admittance Points</em>'.
	 * @see admittance.CalculatedType1#getCalculatedAdmittancePoints()
	 * @see #getCalculatedType1()
	 * @generated
	 */
	EReference getCalculatedType1_CalculatedAdmittancePoints();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.CalculatedType1#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated Admittance Unit</em>'.
	 * @see admittance.CalculatedType1#getCalculatedAdmittanceUnit()
	 * @see #getCalculatedType1()
	 * @generated
	 */
	EReference getCalculatedType1_CalculatedAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.DeltaYPointsType <em>Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta YPoints Type</em>'.
	 * @see admittance.DeltaYPointsType
	 * @generated
	 */
	EClass getDeltaYPointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.DeltaYPointsType#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pt</em>'.
	 * @see admittance.DeltaYPointsType#getPt()
	 * @see #getDeltaYPointsType()
	 * @generated
	 */
	EReference getDeltaYPointsType_Pt();

	/**
	 * Returns the meta object for class '{@link admittance.DeltaYType <em>Delta YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta YType</em>'.
	 * @see admittance.DeltaYType
	 * @generated
	 */
	EClass getDeltaYType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.DeltaYType#getDeltaYPoints <em>Delta YPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delta YPoints</em>'.
	 * @see admittance.DeltaYType#getDeltaYPoints()
	 * @see #getDeltaYType()
	 * @generated
	 */
	EReference getDeltaYType_DeltaYPoints();

	/**
	 * Returns the meta object for the attribute '{@link admittance.DeltaYType#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see admittance.DeltaYType#getG0()
	 * @see #getDeltaYType()
	 * @generated
	 */
	EAttribute getDeltaYType_G0();

	/**
	 * Returns the meta object for the attribute '{@link admittance.DeltaYType#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see admittance.DeltaYType#getB0()
	 * @see #getDeltaYType()
	 * @generated
	 */
	EAttribute getDeltaYType_B0();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.DeltaYType#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured Admittance Unit</em>'.
	 * @see admittance.DeltaYType#getMeasuredAdmittanceUnit()
	 * @see #getDeltaYType()
	 * @generated
	 */
	EReference getDeltaYType_MeasuredAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see admittance.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link admittance.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see admittance.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link admittance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see admittance.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link admittance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see admittance.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.DocumentRoot#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acoustic Immittance Assessment</em>'.
	 * @see admittance.DocumentRoot#getAcousticImmittanceAssessment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AcousticImmittanceAssessment();

	/**
	 * Returns the meta object for class '{@link admittance.EustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest
	 * @generated
	 */
	EClass getEustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getAdmittanceCurve <em>Admittance Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admittance Curve</em>'.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest#getAdmittanceCurve()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve();

	/**
	 * Returns the meta object for the attribute list '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pressure</em>'.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest#getPressure()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionIntactEarDrumTest_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_CanalVolume();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Condition</em>'.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition();

	/**
	 * Returns the meta object for class '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest
	 * @generated
	 */
	EClass getEustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint <em>Pressure Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pressure Point</em>'.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint();

	/**
	 * Returns the meta object for the attribute list '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint <em>Open Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Open Point</em>'.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint();

	/**
	 * Returns the meta object for the attribute list '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint <em>Close Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Close Point</em>'.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint();

	/**
	 * Returns the meta object for the attribute '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Base</em>'.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase();

	/**
	 * Returns the meta object for class '{@link admittance.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Type</em>'.
	 * @see admittance.GradientType
	 * @generated
	 */
	EClass getGradientType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.GradientType#getGradientValue <em>Gradient Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient Value</em>'.
	 * @see admittance.GradientType#getGradientValue()
	 * @see #getGradientType()
	 * @generated
	 */
	EReference getGradientType_GradientValue();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.GradientType#getGradientUnit <em>Gradient Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient Unit</em>'.
	 * @see admittance.GradientType#getGradientUnit()
	 * @see #getGradientType()
	 * @generated
	 */
	EReference getGradientType_GradientUnit();

	/**
	 * Returns the meta object for class '{@link admittance.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type</em>'.
	 * @see admittance.InformationType
	 * @generated
	 */
	EClass getInformationType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.InformationType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see admittance.InformationType#getComments()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Comments();

	/**
	 * Returns the meta object for the attribute '{@link admittance.InformationType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see admittance.InformationType#getVersion()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Version();

	/**
	 * Returns the meta object for class '{@link admittance.MeasuredAdmittancePointsType <em>Measured Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Admittance Points Type</em>'.
	 * @see admittance.MeasuredAdmittancePointsType
	 * @generated
	 */
	EClass getMeasuredAdmittancePointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.MeasuredAdmittancePointsType#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pt</em>'.
	 * @see admittance.MeasuredAdmittancePointsType#getPt()
	 * @see #getMeasuredAdmittancePointsType()
	 * @generated
	 */
	EReference getMeasuredAdmittancePointsType_Pt();

	/**
	 * Returns the meta object for class '{@link admittance.MeasuredType <em>Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Type</em>'.
	 * @see admittance.MeasuredType
	 * @generated
	 */
	EClass getMeasuredType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.MeasuredType#getAdmittancePointMeasured <em>Admittance Point Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Point Measured</em>'.
	 * @see admittance.MeasuredType#getAdmittancePointMeasured()
	 * @see #getMeasuredType()
	 * @generated
	 */
	EReference getMeasuredType_AdmittancePointMeasured();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.MeasuredType#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Unit Measured</em>'.
	 * @see admittance.MeasuredType#getAdmittanceUnitMeasured()
	 * @see #getMeasuredType()
	 * @generated
	 */
	EReference getMeasuredType_AdmittanceUnitMeasured();

	/**
	 * Returns the meta object for class '{@link admittance.MeasuredType1 <em>Measured Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Type1</em>'.
	 * @see admittance.MeasuredType1
	 * @generated
	 */
	EClass getMeasuredType1();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.MeasuredType1#getMeasuredAdmittancePoints <em>Measured Admittance Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured Admittance Points</em>'.
	 * @see admittance.MeasuredType1#getMeasuredAdmittancePoints()
	 * @see #getMeasuredType1()
	 * @generated
	 */
	EReference getMeasuredType1_MeasuredAdmittancePoints();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.MeasuredType1#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured Admittance Unit</em>'.
	 * @see admittance.MeasuredType1#getMeasuredAdmittanceUnit()
	 * @see #getMeasuredType1()
	 * @generated
	 */
	EReference getMeasuredType1_MeasuredAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Notes Type</em>'.
	 * @see admittance.MeasurementNotesType
	 * @generated
	 */
	EClass getMeasurementNotesType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.MeasurementNotesType#getTympanometerMakeModel <em>Tympanometer Make Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tympanometer Make Model</em>'.
	 * @see admittance.MeasurementNotesType#getTympanometerMakeModel()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TympanometerMakeModel();

	/**
	 * Returns the meta object for the attribute '{@link admittance.MeasurementNotesType#getTympanometerSerialNumber <em>Tympanometer Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tympanometer Serial Number</em>'.
	 * @see admittance.MeasurementNotesType#getTympanometerSerialNumber()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TympanometerSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link admittance.MeasurementNotesType#getTympanometerLastCalibration <em>Tympanometer Last Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tympanometer Last Calibration</em>'.
	 * @see admittance.MeasurementNotesType#getTympanometerLastCalibration()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_TympanometerLastCalibration();

	/**
	 * Returns the meta object for the attribute '{@link admittance.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deaf</em>'.
	 * @see admittance.MeasurementNotesType#getIsDeaf()
	 * @see #getMeasurementNotesType()
	 * @generated
	 */
	EAttribute getMeasurementNotesType_IsDeaf();

	/**
	 * Returns the meta object for class '{@link admittance.NumericDeltaType <em>Numeric Delta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Delta Type</em>'.
	 * @see admittance.NumericDeltaType
	 * @generated
	 */
	EClass getNumericDeltaType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.NumericDeltaType#getNumericDeltaYPoints <em>Numeric Delta YPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric Delta YPoints</em>'.
	 * @see admittance.NumericDeltaType#getNumericDeltaYPoints()
	 * @see #getNumericDeltaType()
	 * @generated
	 */
	EReference getNumericDeltaType_NumericDeltaYPoints();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.NumericDeltaType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated Admittance Unit</em>'.
	 * @see admittance.NumericDeltaType#getCalculatedAdmittanceUnit()
	 * @see #getNumericDeltaType()
	 * @generated
	 */
	EReference getNumericDeltaType_CalculatedAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.NumericDeltaYPointsType <em>Numeric Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Delta YPoints Type</em>'.
	 * @see admittance.NumericDeltaYPointsType
	 * @generated
	 */
	EClass getNumericDeltaYPointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link admittance.NumericDeltaYPointsType#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pt</em>'.
	 * @see admittance.NumericDeltaYPointsType#getPt()
	 * @see #getNumericDeltaYPointsType()
	 * @generated
	 */
	EReference getNumericDeltaYPointsType_Pt();

	/**
	 * Returns the meta object for class '{@link admittance.PressurePointType <em>Pressure Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Point Type</em>'.
	 * @see admittance.PressurePointType
	 * @generated
	 */
	EClass getPressurePointType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.PressurePointType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see admittance.PressurePointType#getTime()
	 * @see #getPressurePointType()
	 * @generated
	 */
	EAttribute getPressurePointType_Time();

	/**
	 * Returns the meta object for the attribute '{@link admittance.PressurePointType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see admittance.PressurePointType#getPressure()
	 * @see #getPressurePointType()
	 * @generated
	 */
	EAttribute getPressurePointType_Pressure();

	/**
	 * Returns the meta object for class '{@link admittance.ProbeFrequencyType <em>Probe Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe Frequency Type</em>'.
	 * @see admittance.ProbeFrequencyType
	 * @generated
	 */
	EClass getProbeFrequencyType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ProbeFrequencyType#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see admittance.ProbeFrequencyType#getFrequency()
	 * @see #getProbeFrequencyType()
	 * @generated
	 */
	EAttribute getProbeFrequencyType_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ProbeFrequencyType#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see admittance.ProbeFrequencyType#getOther()
	 * @see #getProbeFrequencyType()
	 * @generated
	 */
	EAttribute getProbeFrequencyType_Other();

	/**
	 * Returns the meta object for class '{@link admittance.ReflexCurveType <em>Reflex Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Curve Type</em>'.
	 * @see admittance.ReflexCurveType
	 * @generated
	 */
	EClass getReflexCurveType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.ReflexCurveType#getNumericDelta <em>Numeric Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric Delta</em>'.
	 * @see admittance.ReflexCurveType#getNumericDelta()
	 * @see #getReflexCurveType()
	 * @generated
	 */
	EReference getReflexCurveType_NumericDelta();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.ReflexCurveType#getDeltaY <em>Delta Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delta Y</em>'.
	 * @see admittance.ReflexCurveType#getDeltaY()
	 * @see #getReflexCurveType()
	 * @generated
	 */
	EReference getReflexCurveType_DeltaY();

	/**
	 * Returns the meta object for class '{@link admittance.ReflexTestType <em>Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Test Type</em>'.
	 * @see admittance.ReflexTestType
	 * @generated
	 */
	EClass getReflexTestType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reflex Curve</em>'.
	 * @see admittance.ReflexTestType#getReflexCurve()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EReference getReflexTestType_ReflexCurve();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Of Reflex Test</em>'.
	 * @see admittance.ReflexTestType#getResultOfReflexTest()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EReference getReflexTestType_ResultOfReflexTest();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.ReflexTestType#getAdmittanceMeasurementCondition <em>Admittance Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Measurement Condition</em>'.
	 * @see admittance.ReflexTestType#getAdmittanceMeasurementCondition()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EReference getReflexTestType_AdmittanceMeasurementCondition();

	/**
	 * Returns the meta object for class '{@link admittance.ReflexValuePointCalculatedType <em>Reflex Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Value Point Calculated Type</em>'.
	 * @see admittance.ReflexValuePointCalculatedType
	 * @generated
	 */
	EClass getReflexValuePointCalculatedType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ReflexValuePointCalculatedType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see admittance.ReflexValuePointCalculatedType#getTime()
	 * @see #getReflexValuePointCalculatedType()
	 * @generated
	 */
	EAttribute getReflexValuePointCalculatedType_Time();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ReflexValuePointCalculatedType#getNumericDeltaY <em>Numeric Delta Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Delta Y</em>'.
	 * @see admittance.ReflexValuePointCalculatedType#getNumericDeltaY()
	 * @see #getReflexValuePointCalculatedType()
	 * @generated
	 */
	EAttribute getReflexValuePointCalculatedType_NumericDeltaY();

	/**
	 * Returns the meta object for class '{@link admittance.ReflexValuePointMeasuredType <em>Reflex Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Value Point Measured Type</em>'.
	 * @see admittance.ReflexValuePointMeasuredType
	 * @generated
	 */
	EClass getReflexValuePointMeasuredType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ReflexValuePointMeasuredType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see admittance.ReflexValuePointMeasuredType#getTime()
	 * @see #getReflexValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getReflexValuePointMeasuredType_Time();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ReflexValuePointMeasuredType#getDeltaG <em>Delta G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta G</em>'.
	 * @see admittance.ReflexValuePointMeasuredType#getDeltaG()
	 * @see #getReflexValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getReflexValuePointMeasuredType_DeltaG();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ReflexValuePointMeasuredType#getDeltaB <em>Delta B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta B</em>'.
	 * @see admittance.ReflexValuePointMeasuredType#getDeltaB()
	 * @see #getReflexValuePointMeasuredType()
	 * @generated
	 */
	EAttribute getReflexValuePointMeasuredType_DeltaB();

	/**
	 * Returns the meta object for class '{@link admittance.ResultOfReflexTestType <em>Result Of Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Of Reflex Test Type</em>'.
	 * @see admittance.ResultOfReflexTestType
	 * @generated
	 */
	EClass getResultOfReflexTestType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ResultOfReflexTestType#isReflexDetected <em>Reflex Detected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reflex Detected</em>'.
	 * @see admittance.ResultOfReflexTestType#isReflexDetected()
	 * @see #getResultOfReflexTestType()
	 * @generated
	 */
	EAttribute getResultOfReflexTestType_ReflexDetected();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ResultOfReflexTestType#getDecayBasicResult <em>Decay Basic Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay Basic Result</em>'.
	 * @see admittance.ResultOfReflexTestType#getDecayBasicResult()
	 * @see #getResultOfReflexTestType()
	 * @generated
	 */
	EAttribute getResultOfReflexTestType_DecayBasicResult();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ResultOfReflexTestType#getDecayPercent <em>Decay Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay Percent</em>'.
	 * @see admittance.ResultOfReflexTestType#getDecayPercent()
	 * @see #getResultOfReflexTestType()
	 * @generated
	 */
	EAttribute getResultOfReflexTestType_DecayPercent();

	/**
	 * Returns the meta object for the attribute '{@link admittance.ResultOfReflexTestType#getLatencyTime <em>Latency Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Time</em>'.
	 * @see admittance.ResultOfReflexTestType#getLatencyTime()
	 * @see #getResultOfReflexTestType()
	 * @generated
	 */
	EAttribute getResultOfReflexTestType_LatencyTime();

	/**
	 * Returns the meta object for class '{@link admittance.SignalLevelType <em>Signal Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Level Type</em>'.
	 * @see admittance.SignalLevelType
	 * @generated
	 */
	EClass getSignalLevelType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.SignalLevelType#getStimulusLevel <em>Stimulus Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus Level</em>'.
	 * @see admittance.SignalLevelType#getStimulusLevel()
	 * @see #getSignalLevelType()
	 * @generated
	 */
	EAttribute getSignalLevelType_StimulusLevel();

	/**
	 * Returns the meta object for the attribute '{@link admittance.SignalLevelType#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see admittance.SignalLevelType#getResponse()
	 * @see #getSignalLevelType()
	 * @generated
	 */
	EAttribute getSignalLevelType_Response();

	/**
	 * Returns the meta object for class '{@link admittance.StaticAdmittanceType <em>Static Admittance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Admittance Type</em>'.
	 * @see admittance.StaticAdmittanceType
	 * @generated
	 */
	EClass getStaticAdmittanceType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.StaticAdmittanceType#getStaticAdmittanceValue <em>Static Admittance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Admittance Value</em>'.
	 * @see admittance.StaticAdmittanceType#getStaticAdmittanceValue()
	 * @see #getStaticAdmittanceType()
	 * @generated
	 */
	EReference getStaticAdmittanceType_StaticAdmittanceValue();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.StaticAdmittanceType#getStaticAdmittanceUnit <em>Static Admittance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Admittance Unit</em>'.
	 * @see admittance.StaticAdmittanceType#getStaticAdmittanceUnit()
	 * @see #getStaticAdmittanceType()
	 * @generated
	 */
	EReference getStaticAdmittanceType_StaticAdmittanceUnit();

	/**
	 * Returns the meta object for class '{@link admittance.SupplementaryDataType <em>Supplementary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplementary Data Type</em>'.
	 * @see admittance.SupplementaryDataType
	 * @generated
	 */
	EClass getSupplementaryDataType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.SupplementaryDataType#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information</em>'.
	 * @see admittance.SupplementaryDataType#getInformation()
	 * @see #getSupplementaryDataType()
	 * @generated
	 */
	EReference getSupplementaryDataType_Information();

	/**
	 * Returns the meta object for the attribute list '{@link admittance.SupplementaryDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see admittance.SupplementaryDataType#getAny()
	 * @see #getSupplementaryDataType()
	 * @generated
	 */
	EAttribute getSupplementaryDataType_Any();

	/**
	 * Returns the meta object for class '{@link admittance.TympanogramMeasurementConditionsType <em>Tympanogram Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tympanogram Measurement Conditions Type</em>'.
	 * @see admittance.TympanogramMeasurementConditionsType
	 * @generated
	 */
	EClass getTympanogramMeasurementConditionsType();

	/**
	 * Returns the meta object for the attribute '{@link admittance.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sweep Speed</em>'.
	 * @see admittance.TympanogramMeasurementConditionsType#getSweepSpeed()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getTympanogramMeasurementConditionsType_SweepSpeed();

	/**
	 * Returns the meta object for the attribute '{@link admittance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Mode</em>'.
	 * @see admittance.TympanogramMeasurementConditionsType#getRecordMode()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getTympanogramMeasurementConditionsType_RecordMode();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probe Frequency</em>'.
	 * @see admittance.TympanogramMeasurementConditionsType#getProbeFrequency()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EReference getTympanogramMeasurementConditionsType_ProbeFrequency();

	/**
	 * Returns the meta object for class '{@link admittance.TympanogramTestType <em>Tympanogram Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tympanogram Test Type</em>'.
	 * @see admittance.TympanogramTestType
	 * @generated
	 */
	EClass getTympanogramTestType();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getAdmittanceCurve <em>Admittance Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admittance Curve</em>'.
	 * @see admittance.TympanogramTestType#getAdmittanceCurve()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_AdmittanceCurve();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getMaximumAdmittance <em>Maximum Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Admittance</em>'.
	 * @see admittance.TympanogramTestType#getMaximumAdmittance()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_MaximumAdmittance();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see admittance.TympanogramTestType#getCanalVolume()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_CanalVolume();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient</em>'.
	 * @see admittance.TympanogramTestType#getGradient()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link admittance.TympanogramTestType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see admittance.TympanogramTestType#getPressure()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link admittance.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resonance Frequency</em>'.
	 * @see admittance.TympanogramTestType#getResonanceFrequency()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_ResonanceFrequency();

	/**
	 * Returns the meta object for the attribute '{@link admittance.TympanogramTestType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see admittance.TympanogramTestType#getResult()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_Result();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Condition</em>'.
	 * @see admittance.TympanogramTestType#getMeasurementCondition()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_MeasurementCondition();

	/**
	 * Returns the meta object for the containment reference '{@link admittance.TympanogramTestType#getStaticAdmittance <em>Static Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Admittance</em>'.
	 * @see admittance.TympanogramTestType#getStaticAdmittance()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_StaticAdmittance();

	/**
	 * Returns the meta object for enum '{@link admittance.DecayBasicResultType <em>Decay Basic Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decay Basic Result Type</em>'.
	 * @see admittance.DecayBasicResultType
	 * @generated
	 */
	EEnum getDecayBasicResultType();

	/**
	 * Returns the meta object for enum '{@link admittance.EarType <em>Ear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ear Type</em>'.
	 * @see admittance.EarType
	 * @generated
	 */
	EEnum getEarType();

	/**
	 * Returns the meta object for enum '{@link admittance.FrequencyOtherType <em>Frequency Other Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Other Type</em>'.
	 * @see admittance.FrequencyOtherType
	 * @generated
	 */
	EEnum getFrequencyOtherType();

	/**
	 * Returns the meta object for enum '{@link admittance.RecordingModeType <em>Recording Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recording Mode Type</em>'.
	 * @see admittance.RecordingModeType
	 * @generated
	 */
	EEnum getRecordingModeType();

	/**
	 * Returns the meta object for enum '{@link admittance.ReflexTestResponseType <em>Reflex Test Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reflex Test Response Type</em>'.
	 * @see admittance.ReflexTestResponseType
	 * @generated
	 */
	EEnum getReflexTestResponseType();

	/**
	 * Returns the meta object for enum '{@link admittance.ReflexTestTypeType <em>Reflex Test Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reflex Test Type Type</em>'.
	 * @see admittance.ReflexTestTypeType
	 * @generated
	 */
	EEnum getReflexTestTypeType();

	/**
	 * Returns the meta object for enum '{@link admittance.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see admittance.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link admittance.SignalTypeType <em>Signal Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type Type</em>'.
	 * @see admittance.SignalTypeType
	 * @generated
	 */
	EEnum getSignalTypeType();

	/**
	 * Returns the meta object for enum '{@link admittance.TympanogramResultType <em>Tympanogram Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tympanogram Result Type</em>'.
	 * @see admittance.TympanogramResultType
	 * @generated
	 */
	EEnum getTympanogramResultType();

	/**
	 * Returns the meta object for enum '{@link admittance.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see admittance.UnitType
	 * @generated
	 */
	EEnum getUnitType();

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
	 * Returns the meta object for data type '{@link admittance.DecayBasicResultType <em>Decay Basic Result Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decay Basic Result Type Object</em>'.
	 * @see admittance.DecayBasicResultType
	 * @model instanceClass="admittance.DecayBasicResultType"
	 *        extendedMetaData="name='DecayBasicResult_._type:Object' baseType='DecayBasicResult_._type'"
	 * @generated
	 */
	EDataType getDecayBasicResultTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.EarType <em>Ear Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ear Type Object</em>'.
	 * @see admittance.EarType
	 * @model instanceClass="admittance.EarType"
	 *        extendedMetaData="name='Ear_Type:Object' baseType='Ear_Type'"
	 * @generated
	 */
	EDataType getEarTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.FrequencyOtherType <em>Frequency Other Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Other Type Object</em>'.
	 * @see admittance.FrequencyOtherType
	 * @model instanceClass="admittance.FrequencyOtherType"
	 *        extendedMetaData="name='FrequencyOther_Type:Object' baseType='FrequencyOther_Type'"
	 * @generated
	 */
	EDataType getFrequencyOtherTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.RecordingModeType <em>Recording Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Recording Mode Type Object</em>'.
	 * @see admittance.RecordingModeType
	 * @model instanceClass="admittance.RecordingModeType"
	 *        extendedMetaData="name='RecordingMode_Type:Object' baseType='RecordingMode_Type'"
	 * @generated
	 */
	EDataType getRecordingModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.ReflexTestResponseType <em>Reflex Test Response Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reflex Test Response Type Object</em>'.
	 * @see admittance.ReflexTestResponseType
	 * @model instanceClass="admittance.ReflexTestResponseType"
	 *        extendedMetaData="name='ReflexTestResponse_Type:Object' baseType='ReflexTestResponse_Type'"
	 * @generated
	 */
	EDataType getReflexTestResponseTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.ReflexTestTypeType <em>Reflex Test Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reflex Test Type Type Object</em>'.
	 * @see admittance.ReflexTestTypeType
	 * @model instanceClass="admittance.ReflexTestTypeType"
	 *        extendedMetaData="name='ReflexTestType_Type:Object' baseType='ReflexTestType_Type'"
	 * @generated
	 */
	EDataType getReflexTestTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see admittance.SignalOutputType
	 * @model instanceClass="admittance.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link admittance.SignalTypeType <em>Signal Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Type Object</em>'.
	 * @see admittance.SignalTypeType
	 * @model instanceClass="admittance.SignalTypeType"
	 *        extendedMetaData="name='SignalType_Type:Object' baseType='SignalType_Type'"
	 * @generated
	 */
	EDataType getSignalTypeTypeObject();

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
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Base Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='TimeBase_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getTimeBaseType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Time_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='2' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getTimeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Time Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Type1</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Time_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getTimeType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Time Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Type2</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Time_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getTimeType2();

	/**
	 * Returns the meta object for data type '{@link admittance.TympanogramResultType <em>Tympanogram Result Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tympanogram Result Type Object</em>'.
	 * @see admittance.TympanogramResultType
	 * @model instanceClass="admittance.TympanogramResultType"
	 *        extendedMetaData="name='TympanogramResult_Type:Object' baseType='TympanogramResult_Type'"
	 * @generated
	 */
	EDataType getTympanogramResultTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tympanometer Make Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tympanometer Make Model Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TympanometerMakeModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getTympanometerMakeModelType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tympanometer Serial Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tympanometer Serial Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TympanometerSerialNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getTympanometerSerialNumberType();

	/**
	 * Returns the meta object for data type '{@link admittance.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see admittance.UnitType
	 * @model instanceClass="admittance.UnitType"
	 *        extendedMetaData="name='Unit_Type:Object' baseType='Unit_Type'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdmittanceFactory getAdmittanceFactory();

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
		 * The meta object literal for the '{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl <em>Acoustic Immittance Assessment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AcousticImmittanceAssessmentTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAcousticImmittanceAssessmentType()
		 * @generated
		 */
		EClass ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE = eINSTANCE.getAcousticImmittanceAssessmentType();

		/**
		 * The meta object literal for the '<em><b>Tympanogram Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST = eINSTANCE.getAcousticImmittanceAssessmentType_TympanogramTest();

		/**
		 * The meta object literal for the '<em><b>Reflex Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST = eINSTANCE.getAcousticImmittanceAssessmentType_ReflexTest();

		/**
		 * The meta object literal for the '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = eINSTANCE.getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = eINSTANCE.getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Supplementary Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA = eINSTANCE.getAcousticImmittanceAssessmentType_SupplementaryData();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES = eINSTANCE.getAcousticImmittanceAssessmentType_Notes();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getAcousticImmittanceAssessmentType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getAcousticImmittanceAssessmentType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION = eINSTANCE.getAcousticImmittanceAssessmentType_Version();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceCurveTypeImpl <em>Curve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceCurveTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceCurveType()
		 * @generated
		 */
		EClass ADMITTANCE_CURVE_TYPE = eINSTANCE.getAdmittanceCurveType();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_CURVE_TYPE__CALCULATED = eINSTANCE.getAdmittanceCurveType_Calculated();

		/**
		 * The meta object literal for the '<em><b>Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_CURVE_TYPE__MEASURED = eINSTANCE.getAdmittanceCurveType_Measured();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceMeasurementConditionTypeImpl <em>Measurement Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceMeasurementConditionTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceMeasurementConditionType()
		 * @generated
		 */
		EClass ADMITTANCE_MEASUREMENT_CONDITION_TYPE = eINSTANCE.getAdmittanceMeasurementConditionType();

		/**
		 * The meta object literal for the '<em><b>Signal Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL = eINSTANCE.getAdmittanceMeasurementConditionType_SignalLevel();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE = eINSTANCE.getAdmittanceMeasurementConditionType_SignalType();

		/**
		 * The meta object literal for the '<em><b>Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT = eINSTANCE.getAdmittanceMeasurementConditionType_SignalOutput();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY = eINSTANCE.getAdmittanceMeasurementConditionType_Frequency();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE = eINSTANCE.getAdmittanceMeasurementConditionType_Pressure();

		/**
		 * The meta object literal for the '<em><b>Probe Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY = eINSTANCE.getAdmittanceMeasurementConditionType_ProbeFrequency();

		/**
		 * The meta object literal for the '<em><b>Test Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE = eINSTANCE.getAdmittanceMeasurementConditionType_TestType();

		/**
		 * The meta object literal for the '<em><b>Canal Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME = eINSTANCE.getAdmittanceMeasurementConditionType_CanalVolume();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceType()
		 * @generated
		 */
		EClass ADMITTANCE_TYPE = eINSTANCE.getAdmittanceType();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_TYPE__CALCULATED = eINSTANCE.getAdmittanceType_Calculated();

		/**
		 * The meta object literal for the '<em><b>Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_TYPE__MEASURED = eINSTANCE.getAdmittanceType_Measured();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceUnitCalculatedTypeImpl <em>Unit Calculated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceUnitCalculatedTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitCalculatedType()
		 * @generated
		 */
		EClass ADMITTANCE_UNIT_CALCULATED_TYPE = eINSTANCE.getAdmittanceUnitCalculatedType();

		/**
		 * The meta object literal for the '<em><b>YUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT = eINSTANCE.getAdmittanceUnitCalculatedType_YUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceUnitMeasuredTypeImpl <em>Unit Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceUnitMeasuredTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitMeasuredType()
		 * @generated
		 */
		EClass ADMITTANCE_UNIT_MEASURED_TYPE = eINSTANCE.getAdmittanceUnitMeasuredType();

		/**
		 * The meta object literal for the '<em><b>GUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT = eINSTANCE.getAdmittanceUnitMeasuredType_GUnit();

		/**
		 * The meta object literal for the '<em><b>BUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT = eINSTANCE.getAdmittanceUnitMeasuredType_BUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceUnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceUnitTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceUnitType()
		 * @generated
		 */
		EClass ADMITTANCE_UNIT_TYPE = eINSTANCE.getAdmittanceUnitType();

		/**
		 * The meta object literal for the '<em><b>Admittance Unit Calculated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED = eINSTANCE.getAdmittanceUnitType_AdmittanceUnitCalculated();

		/**
		 * The meta object literal for the '<em><b>Admittance Unit Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED = eINSTANCE.getAdmittanceUnitType_AdmittanceUnitMeasured();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceValueCalculatedTypeImpl <em>Value Calculated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceValueCalculatedTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueCalculatedType()
		 * @generated
		 */
		EClass ADMITTANCE_VALUE_CALCULATED_TYPE = eINSTANCE.getAdmittanceValueCalculatedType();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_CALCULATED_TYPE__Y = eINSTANCE.getAdmittanceValueCalculatedType_Y();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceValueMeasuredTypeImpl <em>Value Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceValueMeasuredTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueMeasuredType()
		 * @generated
		 */
		EClass ADMITTANCE_VALUE_MEASURED_TYPE = eINSTANCE.getAdmittanceValueMeasuredType();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_MEASURED_TYPE__G = eINSTANCE.getAdmittanceValueMeasuredType_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_MEASURED_TYPE__B = eINSTANCE.getAdmittanceValueMeasuredType_B();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceValuePointCalculatedTypeImpl <em>Value Point Calculated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceValuePointCalculatedTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValuePointCalculatedType()
		 * @generated
		 */
		EClass ADMITTANCE_VALUE_POINT_CALCULATED_TYPE = eINSTANCE.getAdmittanceValuePointCalculatedType();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__PRESSURE = eINSTANCE.getAdmittanceValuePointCalculatedType_Pressure();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__Y = eINSTANCE.getAdmittanceValuePointCalculatedType_Y();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceValuePointMeasuredTypeImpl <em>Value Point Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceValuePointMeasuredTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValuePointMeasuredType()
		 * @generated
		 */
		EClass ADMITTANCE_VALUE_POINT_MEASURED_TYPE = eINSTANCE.getAdmittanceValuePointMeasuredType();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_POINT_MEASURED_TYPE__PRESSURE = eINSTANCE.getAdmittanceValuePointMeasuredType_Pressure();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_POINT_MEASURED_TYPE__G = eINSTANCE.getAdmittanceValuePointMeasuredType_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMITTANCE_VALUE_POINT_MEASURED_TYPE__B = eINSTANCE.getAdmittanceValuePointMeasuredType_B();

		/**
		 * The meta object literal for the '{@link admittance.impl.AdmittanceValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.AdmittanceValueTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getAdmittanceValueType()
		 * @generated
		 */
		EClass ADMITTANCE_VALUE_TYPE = eINSTANCE.getAdmittanceValueType();

		/**
		 * The meta object literal for the '<em><b>Value Calculated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED = eINSTANCE.getAdmittanceValueType_ValueCalculated();

		/**
		 * The meta object literal for the '<em><b>Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMITTANCE_VALUE_TYPE__MEASURED = eINSTANCE.getAdmittanceValueType_Measured();

		/**
		 * The meta object literal for the '{@link admittance.impl.CalculatedAdmittancePointsTypeImpl <em>Calculated Admittance Points Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.CalculatedAdmittancePointsTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getCalculatedAdmittancePointsType()
		 * @generated
		 */
		EClass CALCULATED_ADMITTANCE_POINTS_TYPE = eINSTANCE.getCalculatedAdmittancePointsType();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED_ADMITTANCE_POINTS_TYPE__PT = eINSTANCE.getCalculatedAdmittancePointsType_Pt();

		/**
		 * The meta object literal for the '{@link admittance.impl.CalculatedTypeImpl <em>Calculated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.CalculatedTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getCalculatedType()
		 * @generated
		 */
		EClass CALCULATED_TYPE = eINSTANCE.getCalculatedType();

		/**
		 * The meta object literal for the '<em><b>Admittance Value Calculated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED = eINSTANCE.getCalculatedType_AdmittanceValueCalculated();

		/**
		 * The meta object literal for the '<em><b>Calculated Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT = eINSTANCE.getCalculatedType_CalculatedAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.CalculatedType1Impl <em>Calculated Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.CalculatedType1Impl
		 * @see admittance.impl.AdmittancePackageImpl#getCalculatedType1()
		 * @generated
		 */
		EClass CALCULATED_TYPE1 = eINSTANCE.getCalculatedType1();

		/**
		 * The meta object literal for the '<em><b>Calculated Admittance Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS = eINSTANCE.getCalculatedType1_CalculatedAdmittancePoints();

		/**
		 * The meta object literal for the '<em><b>Calculated Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT = eINSTANCE.getCalculatedType1_CalculatedAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.DeltaYPointsTypeImpl <em>Delta YPoints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.DeltaYPointsTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getDeltaYPointsType()
		 * @generated
		 */
		EClass DELTA_YPOINTS_TYPE = eINSTANCE.getDeltaYPointsType();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_YPOINTS_TYPE__PT = eINSTANCE.getDeltaYPointsType_Pt();

		/**
		 * The meta object literal for the '{@link admittance.impl.DeltaYTypeImpl <em>Delta YType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.DeltaYTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getDeltaYType()
		 * @generated
		 */
		EClass DELTA_YTYPE = eINSTANCE.getDeltaYType();

		/**
		 * The meta object literal for the '<em><b>Delta YPoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_YTYPE__DELTA_YPOINTS = eINSTANCE.getDeltaYType_DeltaYPoints();

		/**
		 * The meta object literal for the '<em><b>G0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELTA_YTYPE__G0 = eINSTANCE.getDeltaYType_G0();

		/**
		 * The meta object literal for the '<em><b>B0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELTA_YTYPE__B0 = eINSTANCE.getDeltaYType_B0();

		/**
		 * The meta object literal for the '<em><b>Measured Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT = eINSTANCE.getDeltaYType_MeasuredAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.DocumentRootImpl
		 * @see admittance.impl.AdmittancePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Acoustic Immittance Assessment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACOUSTIC_IMMITTANCE_ASSESSMENT = eINSTANCE.getDocumentRoot_AcousticImmittanceAssessment();

		/**
		 * The meta object literal for the '{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl <em>Eustachian Tube Function Intact Ear Drum Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl
		 * @see admittance.impl.AdmittancePackageImpl#getEustachianTubeFunctionIntactEarDrumTest()
		 * @generated
		 */
		EClass EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Admittance Curve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest_Pressure();

		/**
		 * The meta object literal for the '<em><b>Canal Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest_CanalVolume();

		/**
		 * The meta object literal for the '<em><b>Measurement Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition();

		/**
		 * The meta object literal for the '{@link admittance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl
		 * @see admittance.impl.AdmittancePackageImpl#getEustachianTubeFunctionPerforatedEarDrumTest()
		 * @generated
		 */
		EClass EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = eINSTANCE.getEustachianTubeFunctionPerforatedEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Pressure Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT = eINSTANCE.getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint();

		/**
		 * The meta object literal for the '<em><b>Open Point</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT = eINSTANCE.getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint();

		/**
		 * The meta object literal for the '<em><b>Close Point</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT = eINSTANCE.getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint();

		/**
		 * The meta object literal for the '<em><b>Time Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE = eINSTANCE.getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase();

		/**
		 * The meta object literal for the '{@link admittance.impl.GradientTypeImpl <em>Gradient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.GradientTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getGradientType()
		 * @generated
		 */
		EClass GRADIENT_TYPE = eINSTANCE.getGradientType();

		/**
		 * The meta object literal for the '<em><b>Gradient Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADIENT_TYPE__GRADIENT_VALUE = eINSTANCE.getGradientType_GradientValue();

		/**
		 * The meta object literal for the '<em><b>Gradient Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADIENT_TYPE__GRADIENT_UNIT = eINSTANCE.getGradientType_GradientUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.InformationTypeImpl <em>Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.InformationTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getInformationType()
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
		 * The meta object literal for the '{@link admittance.impl.MeasuredAdmittancePointsTypeImpl <em>Measured Admittance Points Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.MeasuredAdmittancePointsTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getMeasuredAdmittancePointsType()
		 * @generated
		 */
		EClass MEASURED_ADMITTANCE_POINTS_TYPE = eINSTANCE.getMeasuredAdmittancePointsType();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_ADMITTANCE_POINTS_TYPE__PT = eINSTANCE.getMeasuredAdmittancePointsType_Pt();

		/**
		 * The meta object literal for the '{@link admittance.impl.MeasuredTypeImpl <em>Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.MeasuredTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getMeasuredType()
		 * @generated
		 */
		EClass MEASURED_TYPE = eINSTANCE.getMeasuredType();

		/**
		 * The meta object literal for the '<em><b>Admittance Point Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_TYPE__ADMITTANCE_POINT_MEASURED = eINSTANCE.getMeasuredType_AdmittancePointMeasured();

		/**
		 * The meta object literal for the '<em><b>Admittance Unit Measured</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED = eINSTANCE.getMeasuredType_AdmittanceUnitMeasured();

		/**
		 * The meta object literal for the '{@link admittance.impl.MeasuredType1Impl <em>Measured Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.MeasuredType1Impl
		 * @see admittance.impl.AdmittancePackageImpl#getMeasuredType1()
		 * @generated
		 */
		EClass MEASURED_TYPE1 = eINSTANCE.getMeasuredType1();

		/**
		 * The meta object literal for the '<em><b>Measured Admittance Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS = eINSTANCE.getMeasuredType1_MeasuredAdmittancePoints();

		/**
		 * The meta object literal for the '<em><b>Measured Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT = eINSTANCE.getMeasuredType1_MeasuredAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.MeasurementNotesTypeImpl <em>Measurement Notes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.MeasurementNotesTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getMeasurementNotesType()
		 * @generated
		 */
		EClass MEASUREMENT_NOTES_TYPE = eINSTANCE.getMeasurementNotesType();

		/**
		 * The meta object literal for the '<em><b>Tympanometer Make Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL = eINSTANCE.getMeasurementNotesType_TympanometerMakeModel();

		/**
		 * The meta object literal for the '<em><b>Tympanometer Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER = eINSTANCE.getMeasurementNotesType_TympanometerSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Tympanometer Last Calibration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION = eINSTANCE.getMeasurementNotesType_TympanometerLastCalibration();

		/**
		 * The meta object literal for the '<em><b>Is Deaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTES_TYPE__IS_DEAF = eINSTANCE.getMeasurementNotesType_IsDeaf();

		/**
		 * The meta object literal for the '{@link admittance.impl.NumericDeltaTypeImpl <em>Numeric Delta Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.NumericDeltaTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getNumericDeltaType()
		 * @generated
		 */
		EClass NUMERIC_DELTA_TYPE = eINSTANCE.getNumericDeltaType();

		/**
		 * The meta object literal for the '<em><b>Numeric Delta YPoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS = eINSTANCE.getNumericDeltaType_NumericDeltaYPoints();

		/**
		 * The meta object literal for the '<em><b>Calculated Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT = eINSTANCE.getNumericDeltaType_CalculatedAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.NumericDeltaYPointsTypeImpl <em>Numeric Delta YPoints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.NumericDeltaYPointsTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getNumericDeltaYPointsType()
		 * @generated
		 */
		EClass NUMERIC_DELTA_YPOINTS_TYPE = eINSTANCE.getNumericDeltaYPointsType();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_DELTA_YPOINTS_TYPE__PT = eINSTANCE.getNumericDeltaYPointsType_Pt();

		/**
		 * The meta object literal for the '{@link admittance.impl.PressurePointTypeImpl <em>Pressure Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.PressurePointTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getPressurePointType()
		 * @generated
		 */
		EClass PRESSURE_POINT_TYPE = eINSTANCE.getPressurePointType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_POINT_TYPE__TIME = eINSTANCE.getPressurePointType_Time();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSURE_POINT_TYPE__PRESSURE = eINSTANCE.getPressurePointType_Pressure();

		/**
		 * The meta object literal for the '{@link admittance.impl.ProbeFrequencyTypeImpl <em>Probe Frequency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ProbeFrequencyTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getProbeFrequencyType()
		 * @generated
		 */
		EClass PROBE_FREQUENCY_TYPE = eINSTANCE.getProbeFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE_FREQUENCY_TYPE__FREQUENCY = eINSTANCE.getProbeFrequencyType_Frequency();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE_FREQUENCY_TYPE__OTHER = eINSTANCE.getProbeFrequencyType_Other();

		/**
		 * The meta object literal for the '{@link admittance.impl.ReflexCurveTypeImpl <em>Reflex Curve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ReflexCurveTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getReflexCurveType()
		 * @generated
		 */
		EClass REFLEX_CURVE_TYPE = eINSTANCE.getReflexCurveType();

		/**
		 * The meta object literal for the '<em><b>Numeric Delta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_CURVE_TYPE__NUMERIC_DELTA = eINSTANCE.getReflexCurveType_NumericDelta();

		/**
		 * The meta object literal for the '<em><b>Delta Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_CURVE_TYPE__DELTA_Y = eINSTANCE.getReflexCurveType_DeltaY();

		/**
		 * The meta object literal for the '{@link admittance.impl.ReflexTestTypeImpl <em>Reflex Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ReflexTestTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getReflexTestType()
		 * @generated
		 */
		EClass REFLEX_TEST_TYPE = eINSTANCE.getReflexTestType();

		/**
		 * The meta object literal for the '<em><b>Reflex Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_TEST_TYPE__REFLEX_CURVE = eINSTANCE.getReflexTestType_ReflexCurve();

		/**
		 * The meta object literal for the '<em><b>Result Of Reflex Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST = eINSTANCE.getReflexTestType_ResultOfReflexTest();

		/**
		 * The meta object literal for the '<em><b>Admittance Measurement Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION = eINSTANCE.getReflexTestType_AdmittanceMeasurementCondition();

		/**
		 * The meta object literal for the '{@link admittance.impl.ReflexValuePointCalculatedTypeImpl <em>Reflex Value Point Calculated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ReflexValuePointCalculatedTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getReflexValuePointCalculatedType()
		 * @generated
		 */
		EClass REFLEX_VALUE_POINT_CALCULATED_TYPE = eINSTANCE.getReflexValuePointCalculatedType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME = eINSTANCE.getReflexValuePointCalculatedType_Time();

		/**
		 * The meta object literal for the '<em><b>Numeric Delta Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y = eINSTANCE.getReflexValuePointCalculatedType_NumericDeltaY();

		/**
		 * The meta object literal for the '{@link admittance.impl.ReflexValuePointMeasuredTypeImpl <em>Reflex Value Point Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ReflexValuePointMeasuredTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getReflexValuePointMeasuredType()
		 * @generated
		 */
		EClass REFLEX_VALUE_POINT_MEASURED_TYPE = eINSTANCE.getReflexValuePointMeasuredType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_VALUE_POINT_MEASURED_TYPE__TIME = eINSTANCE.getReflexValuePointMeasuredType_Time();

		/**
		 * The meta object literal for the '<em><b>Delta G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G = eINSTANCE.getReflexValuePointMeasuredType_DeltaG();

		/**
		 * The meta object literal for the '<em><b>Delta B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B = eINSTANCE.getReflexValuePointMeasuredType_DeltaB();

		/**
		 * The meta object literal for the '{@link admittance.impl.ResultOfReflexTestTypeImpl <em>Result Of Reflex Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.ResultOfReflexTestTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getResultOfReflexTestType()
		 * @generated
		 */
		EClass RESULT_OF_REFLEX_TEST_TYPE = eINSTANCE.getResultOfReflexTestType();

		/**
		 * The meta object literal for the '<em><b>Reflex Detected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED = eINSTANCE.getResultOfReflexTestType_ReflexDetected();

		/**
		 * The meta object literal for the '<em><b>Decay Basic Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT = eINSTANCE.getResultOfReflexTestType_DecayBasicResult();

		/**
		 * The meta object literal for the '<em><b>Decay Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT = eINSTANCE.getResultOfReflexTestType_DecayPercent();

		/**
		 * The meta object literal for the '<em><b>Latency Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME = eINSTANCE.getResultOfReflexTestType_LatencyTime();

		/**
		 * The meta object literal for the '{@link admittance.impl.SignalLevelTypeImpl <em>Signal Level Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.SignalLevelTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getSignalLevelType()
		 * @generated
		 */
		EClass SIGNAL_LEVEL_TYPE = eINSTANCE.getSignalLevelType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_LEVEL_TYPE__STIMULUS_LEVEL = eINSTANCE.getSignalLevelType_StimulusLevel();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_LEVEL_TYPE__RESPONSE = eINSTANCE.getSignalLevelType_Response();

		/**
		 * The meta object literal for the '{@link admittance.impl.StaticAdmittanceTypeImpl <em>Static Admittance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.StaticAdmittanceTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getStaticAdmittanceType()
		 * @generated
		 */
		EClass STATIC_ADMITTANCE_TYPE = eINSTANCE.getStaticAdmittanceType();

		/**
		 * The meta object literal for the '<em><b>Static Admittance Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE = eINSTANCE.getStaticAdmittanceType_StaticAdmittanceValue();

		/**
		 * The meta object literal for the '<em><b>Static Admittance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT = eINSTANCE.getStaticAdmittanceType_StaticAdmittanceUnit();

		/**
		 * The meta object literal for the '{@link admittance.impl.SupplementaryDataTypeImpl <em>Supplementary Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.SupplementaryDataTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getSupplementaryDataType()
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
		 * The meta object literal for the '{@link admittance.impl.TympanogramMeasurementConditionsTypeImpl <em>Tympanogram Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.TympanogramMeasurementConditionsTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getTympanogramMeasurementConditionsType()
		 * @generated
		 */
		EClass TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE = eINSTANCE.getTympanogramMeasurementConditionsType();

		/**
		 * The meta object literal for the '<em><b>Sweep Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED = eINSTANCE.getTympanogramMeasurementConditionsType_SweepSpeed();

		/**
		 * The meta object literal for the '<em><b>Record Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE = eINSTANCE.getTympanogramMeasurementConditionsType_RecordMode();

		/**
		 * The meta object literal for the '<em><b>Probe Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY = eINSTANCE.getTympanogramMeasurementConditionsType_ProbeFrequency();

		/**
		 * The meta object literal for the '{@link admittance.impl.TympanogramTestTypeImpl <em>Tympanogram Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.impl.TympanogramTestTypeImpl
		 * @see admittance.impl.AdmittancePackageImpl#getTympanogramTestType()
		 * @generated
		 */
		EClass TYMPANOGRAM_TEST_TYPE = eINSTANCE.getTympanogramTestType();

		/**
		 * The meta object literal for the '<em><b>Admittance Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE = eINSTANCE.getTympanogramTestType_AdmittanceCurve();

		/**
		 * The meta object literal for the '<em><b>Maximum Admittance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE = eINSTANCE.getTympanogramTestType_MaximumAdmittance();

		/**
		 * The meta object literal for the '<em><b>Canal Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME = eINSTANCE.getTympanogramTestType_CanalVolume();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__GRADIENT = eINSTANCE.getTympanogramTestType_Gradient();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_TEST_TYPE__PRESSURE = eINSTANCE.getTympanogramTestType_Pressure();

		/**
		 * The meta object literal for the '<em><b>Resonance Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY = eINSTANCE.getTympanogramTestType_ResonanceFrequency();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_TEST_TYPE__RESULT = eINSTANCE.getTympanogramTestType_Result();

		/**
		 * The meta object literal for the '<em><b>Measurement Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION = eINSTANCE.getTympanogramTestType_MeasurementCondition();

		/**
		 * The meta object literal for the '<em><b>Static Admittance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE = eINSTANCE.getTympanogramTestType_StaticAdmittance();

		/**
		 * The meta object literal for the '{@link admittance.DecayBasicResultType <em>Decay Basic Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.DecayBasicResultType
		 * @see admittance.impl.AdmittancePackageImpl#getDecayBasicResultType()
		 * @generated
		 */
		EEnum DECAY_BASIC_RESULT_TYPE = eINSTANCE.getDecayBasicResultType();

		/**
		 * The meta object literal for the '{@link admittance.EarType <em>Ear Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.EarType
		 * @see admittance.impl.AdmittancePackageImpl#getEarType()
		 * @generated
		 */
		EEnum EAR_TYPE = eINSTANCE.getEarType();

		/**
		 * The meta object literal for the '{@link admittance.FrequencyOtherType <em>Frequency Other Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.FrequencyOtherType
		 * @see admittance.impl.AdmittancePackageImpl#getFrequencyOtherType()
		 * @generated
		 */
		EEnum FREQUENCY_OTHER_TYPE = eINSTANCE.getFrequencyOtherType();

		/**
		 * The meta object literal for the '{@link admittance.RecordingModeType <em>Recording Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.RecordingModeType
		 * @see admittance.impl.AdmittancePackageImpl#getRecordingModeType()
		 * @generated
		 */
		EEnum RECORDING_MODE_TYPE = eINSTANCE.getRecordingModeType();

		/**
		 * The meta object literal for the '{@link admittance.ReflexTestResponseType <em>Reflex Test Response Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.ReflexTestResponseType
		 * @see admittance.impl.AdmittancePackageImpl#getReflexTestResponseType()
		 * @generated
		 */
		EEnum REFLEX_TEST_RESPONSE_TYPE = eINSTANCE.getReflexTestResponseType();

		/**
		 * The meta object literal for the '{@link admittance.ReflexTestTypeType <em>Reflex Test Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.ReflexTestTypeType
		 * @see admittance.impl.AdmittancePackageImpl#getReflexTestTypeType()
		 * @generated
		 */
		EEnum REFLEX_TEST_TYPE_TYPE = eINSTANCE.getReflexTestTypeType();

		/**
		 * The meta object literal for the '{@link admittance.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.SignalOutputType
		 * @see admittance.impl.AdmittancePackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link admittance.SignalTypeType <em>Signal Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.SignalTypeType
		 * @see admittance.impl.AdmittancePackageImpl#getSignalTypeType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE_TYPE = eINSTANCE.getSignalTypeType();

		/**
		 * The meta object literal for the '{@link admittance.TympanogramResultType <em>Tympanogram Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.TympanogramResultType
		 * @see admittance.impl.AdmittancePackageImpl#getTympanogramResultType()
		 * @generated
		 */
		EEnum TYMPANOGRAM_RESULT_TYPE = eINSTANCE.getTympanogramResultType();

		/**
		 * The meta object literal for the '{@link admittance.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.UnitType
		 * @see admittance.impl.AdmittancePackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see admittance.impl.AdmittancePackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Decay Basic Result Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.DecayBasicResultType
		 * @see admittance.impl.AdmittancePackageImpl#getDecayBasicResultTypeObject()
		 * @generated
		 */
		EDataType DECAY_BASIC_RESULT_TYPE_OBJECT = eINSTANCE.getDecayBasicResultTypeObject();

		/**
		 * The meta object literal for the '<em>Ear Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.EarType
		 * @see admittance.impl.AdmittancePackageImpl#getEarTypeObject()
		 * @generated
		 */
		EDataType EAR_TYPE_OBJECT = eINSTANCE.getEarTypeObject();

		/**
		 * The meta object literal for the '<em>Frequency Other Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.FrequencyOtherType
		 * @see admittance.impl.AdmittancePackageImpl#getFrequencyOtherTypeObject()
		 * @generated
		 */
		EDataType FREQUENCY_OTHER_TYPE_OBJECT = eINSTANCE.getFrequencyOtherTypeObject();

		/**
		 * The meta object literal for the '<em>Recording Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.RecordingModeType
		 * @see admittance.impl.AdmittancePackageImpl#getRecordingModeTypeObject()
		 * @generated
		 */
		EDataType RECORDING_MODE_TYPE_OBJECT = eINSTANCE.getRecordingModeTypeObject();

		/**
		 * The meta object literal for the '<em>Reflex Test Response Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.ReflexTestResponseType
		 * @see admittance.impl.AdmittancePackageImpl#getReflexTestResponseTypeObject()
		 * @generated
		 */
		EDataType REFLEX_TEST_RESPONSE_TYPE_OBJECT = eINSTANCE.getReflexTestResponseTypeObject();

		/**
		 * The meta object literal for the '<em>Reflex Test Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.ReflexTestTypeType
		 * @see admittance.impl.AdmittancePackageImpl#getReflexTestTypeTypeObject()
		 * @generated
		 */
		EDataType REFLEX_TEST_TYPE_TYPE_OBJECT = eINSTANCE.getReflexTestTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.SignalOutputType
		 * @see admittance.impl.AdmittancePackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.SignalTypeType
		 * @see admittance.impl.AdmittancePackageImpl#getSignalTypeTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_TYPE_OBJECT = eINSTANCE.getSignalTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Stimulus Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see admittance.impl.AdmittancePackageImpl#getStimulusLevelType()
		 * @generated
		 */
		EDataType STIMULUS_LEVEL_TYPE = eINSTANCE.getStimulusLevelType();

		/**
		 * The meta object literal for the '<em>Time Base Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see admittance.impl.AdmittancePackageImpl#getTimeBaseType()
		 * @generated
		 */
		EDataType TIME_BASE_TYPE = eINSTANCE.getTimeBaseType();

		/**
		 * The meta object literal for the '<em>Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see admittance.impl.AdmittancePackageImpl#getTimeType()
		 * @generated
		 */
		EDataType TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '<em>Time Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see admittance.impl.AdmittancePackageImpl#getTimeType1()
		 * @generated
		 */
		EDataType TIME_TYPE1 = eINSTANCE.getTimeType1();

		/**
		 * The meta object literal for the '<em>Time Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see admittance.impl.AdmittancePackageImpl#getTimeType2()
		 * @generated
		 */
		EDataType TIME_TYPE2 = eINSTANCE.getTimeType2();

		/**
		 * The meta object literal for the '<em>Tympanogram Result Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.TympanogramResultType
		 * @see admittance.impl.AdmittancePackageImpl#getTympanogramResultTypeObject()
		 * @generated
		 */
		EDataType TYMPANOGRAM_RESULT_TYPE_OBJECT = eINSTANCE.getTympanogramResultTypeObject();

		/**
		 * The meta object literal for the '<em>Tympanometer Make Model Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see admittance.impl.AdmittancePackageImpl#getTympanometerMakeModelType()
		 * @generated
		 */
		EDataType TYMPANOMETER_MAKE_MODEL_TYPE = eINSTANCE.getTympanometerMakeModelType();

		/**
		 * The meta object literal for the '<em>Tympanometer Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see admittance.impl.AdmittancePackageImpl#getTympanometerSerialNumberType()
		 * @generated
		 */
		EDataType TYMPANOMETER_SERIAL_NUMBER_TYPE = eINSTANCE.getTympanometerSerialNumberType();

		/**
		 * The meta object literal for the '<em>Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see admittance.UnitType
		 * @see admittance.impl.AdmittancePackageImpl#getUnitTypeObject()
		 * @generated
		 */
		EDataType UNIT_TYPE_OBJECT = eINSTANCE.getUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see admittance.impl.AdmittancePackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em>Version Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see admittance.impl.AdmittancePackageImpl#getVersionType1()
		 * @generated
		 */
		EDataType VERSION_TYPE1 = eINSTANCE.getVersionType1();

	}

} //AdmittancePackage
