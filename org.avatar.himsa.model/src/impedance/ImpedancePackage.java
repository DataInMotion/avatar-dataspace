/*
 */
package impedance;


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
 * @see impedance.ImpedanceFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ImpedancePackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/impedance.ecore", ecoreSourceLocations="/model/impedance.ecore")
public interface ImpedancePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "impedance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/Impedance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "impedance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpedancePackage eINSTANCE = impedance.impl.ImpedancePackageImpl.init();

	/**
	 * The meta object id for the '{@link impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl <em>Acoustic Impedance Complete Measurement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tympanogram Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST = 0;

	/**
	 * The feature id for the '<em><b>Reflex Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST = 1;

	/**
	 * The feature id for the '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = 2;

	/**
	 * The feature id for the '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = 3;

	/**
	 * The feature id for the '<em><b>Private Impedance Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD = 5;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Acoustic Impedance Complete Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Acoustic Impedance Complete Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.ComplianceCurveTypeImpl <em>Compliance Curve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ComplianceCurveTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getComplianceCurveType()
	 * @generated
	 */
	int COMPLIANCE_CURVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Compliance Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT = 0;

	/**
	 * The feature id for the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Compliance Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CURVE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compliance Curve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CURVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.CompliancePointTypeImpl <em>Compliance Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.CompliancePointTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getCompliancePointType()
	 * @generated
	 */
	int COMPLIANCE_POINT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_POINT_TYPE__PRESSURE = 0;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_POINT_TYPE__COMPLIANCE = 1;

	/**
	 * The number of structural features of the '<em>Compliance Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_POINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compliance Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.ComplianceTypeImpl <em>Compliance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ComplianceTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getComplianceType()
	 * @generated
	 */
	int COMPLIANCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Compliance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__COMPLIANCE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__COMPLIANCE_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Compliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.ComplianceUnitTypeImpl <em>Compliance Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ComplianceUnitTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getComplianceUnitType()
	 * @generated
	 */
	int COMPLIANCE_UNIT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Argument Unit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1 = 0;

	/**
	 * The feature id for the '<em><b>Argument Unit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2 = 1;

	/**
	 * The number of structural features of the '<em>Compliance Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_UNIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compliance Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.ComplianceValueTypeImpl <em>Compliance Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ComplianceValueTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getComplianceValueType()
	 * @generated
	 */
	int COMPLIANCE_VALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Argument Compliance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1 = 0;

	/**
	 * The feature id for the '<em><b>Argument Compliance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2 = 1;

	/**
	 * The number of structural features of the '<em>Compliance Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compliance Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.DocumentRootImpl
	 * @see impedance.impl.ImpedancePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Acoustic Impedance Complete Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT = 3;

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
	 * The meta object id for the '{@link impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl <em>Eustachian Tube Function Intact Ear Drum Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl
	 * @see impedance.impl.ImpedancePackageImpl#getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = 7;

	/**
	 * The feature id for the '<em><b>Compliance Curve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE = 0;

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
	 * The meta object id for the '{@link impedance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl
	 * @see impedance.impl.ImpedancePackageImpl#getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	int EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = 8;

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
	 * The meta object id for the '{@link impedance.impl.GradientTypeImpl <em>Gradient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.GradientTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getGradientType()
	 * @generated
	 */
	int GRADIENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Gradient Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_TYPE__GRADIENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gradient Unit</b></em>' attribute.
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
	 * The meta object id for the '{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl <em>Measurement Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ImpedanceMeasurementConditionTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getImpedanceMeasurementConditionType()
	 * @generated
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Signal Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY = 3;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE = 4;

	/**
	 * The feature id for the '<em><b>Probe Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY = 5;

	/**
	 * The feature id for the '<em><b>Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME = 7;

	/**
	 * The number of structural features of the '<em>Measurement Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Measurement Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPEDANCE_MEASUREMENT_CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.PressurePointTypeImpl <em>Pressure Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.PressurePointTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getPressurePointType()
	 * @generated
	 */
	int PRESSURE_POINT_TYPE = 11;

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
	 * The meta object id for the '{@link impedance.impl.ReflexCurveTypeImpl <em>Reflex Curve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ReflexCurveTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getReflexCurveType()
	 * @generated
	 */
	int REFLEX_CURVE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Reflex Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE__REFLEX_POINT = 0;

	/**
	 * The feature id for the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_CURVE_TYPE__COMPLIANCE_UNIT = 1;

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
	 * The meta object id for the '{@link impedance.impl.ReflexPointTypeImpl <em>Reflex Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ReflexPointTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getReflexPointType()
	 * @generated
	 */
	int REFLEX_POINT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_POINT_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_POINT_TYPE__COMPLIANCE = 1;

	/**
	 * The number of structural features of the '<em>Reflex Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_POINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reflex Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.impl.ReflexTestTypeImpl <em>Reflex Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.ReflexTestTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getReflexTestType()
	 * @generated
	 */
	int REFLEX_TEST_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Reflex Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__REFLEX_CURVE = 0;

	/**
	 * The feature id for the '<em><b>Result Of Reflex Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST = 1;

	/**
	 * The feature id for the '<em><b>Impedance Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION = 2;

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
	 * The meta object id for the '{@link impedance.impl.TympanogramMeasurementConditionsTypeImpl <em>Tympanogram Measurement Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.TympanogramMeasurementConditionsTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	int TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE = 15;

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
	 * The feature id for the '<em><b>Probe Frequency</b></em>' attribute.
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
	 * The meta object id for the '{@link impedance.impl.TympanogramTestTypeImpl <em>Tympanogram Test Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.impl.TympanogramTestTypeImpl
	 * @see impedance.impl.ImpedancePackageImpl#getTympanogramTestType()
	 * @generated
	 */
	int TYMPANOGRAM_TEST_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Compliance Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE = 1;

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
	 * The number of structural features of the '<em>Tympanogram Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tympanogram Test Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYMPANOGRAM_TEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link impedance.RecordingModeType <em>Recording Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.RecordingModeType
	 * @see impedance.impl.ImpedancePackageImpl#getRecordingModeType()
	 * @generated
	 */
	int RECORDING_MODE_TYPE = 17;

	/**
	 * The meta object id for the '{@link impedance.ReflexTestTypeType <em>Reflex Test Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.ReflexTestTypeType
	 * @see impedance.impl.ImpedancePackageImpl#getReflexTestTypeType()
	 * @generated
	 */
	int REFLEX_TEST_TYPE_TYPE = 18;

	/**
	 * The meta object id for the '{@link impedance.SignalOutputType <em>Signal Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.SignalOutputType
	 * @see impedance.impl.ImpedancePackageImpl#getSignalOutputType()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE = 19;

	/**
	 * The meta object id for the '{@link impedance.SignalTypeType <em>Signal Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.SignalTypeType
	 * @see impedance.impl.ImpedancePackageImpl#getSignalTypeType()
	 * @generated
	 */
	int SIGNAL_TYPE_TYPE = 20;

	/**
	 * The meta object id for the '{@link impedance.TympanogramResultType <em>Tympanogram Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.TympanogramResultType
	 * @see impedance.impl.ImpedancePackageImpl#getTympanogramResultType()
	 * @generated
	 */
	int TYMPANOGRAM_RESULT_TYPE = 21;

	/**
	 * The meta object id for the '{@link impedance.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.UnitType
	 * @see impedance.impl.ImpedancePackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 22;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see impedance.impl.ImpedancePackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 23;

	/**
	 * The meta object id for the '<em>Recording Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.RecordingModeType
	 * @see impedance.impl.ImpedancePackageImpl#getRecordingModeTypeObject()
	 * @generated
	 */
	int RECORDING_MODE_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Reflex Test Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.ReflexTestTypeType
	 * @see impedance.impl.ImpedancePackageImpl#getReflexTestTypeTypeObject()
	 * @generated
	 */
	int REFLEX_TEST_TYPE_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Signal Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see impedance.impl.ImpedancePackageImpl#getSignalLevelType()
	 * @generated
	 */
	int SIGNAL_LEVEL_TYPE = 26;

	/**
	 * The meta object id for the '<em>Signal Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.SignalOutputType
	 * @see impedance.impl.ImpedancePackageImpl#getSignalOutputTypeObject()
	 * @generated
	 */
	int SIGNAL_OUTPUT_TYPE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Signal Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.SignalTypeType
	 * @see impedance.impl.ImpedancePackageImpl#getSignalTypeTypeObject()
	 * @generated
	 */
	int SIGNAL_TYPE_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Time Base Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see impedance.impl.ImpedancePackageImpl#getTimeBaseType()
	 * @generated
	 */
	int TIME_BASE_TYPE = 29;

	/**
	 * The meta object id for the '<em>Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see impedance.impl.ImpedancePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 30;

	/**
	 * The meta object id for the '<em>Time Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see impedance.impl.ImpedancePackageImpl#getTimeType1()
	 * @generated
	 */
	int TIME_TYPE1 = 31;

	/**
	 * The meta object id for the '<em>Tympanogram Result Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.TympanogramResultType
	 * @see impedance.impl.ImpedancePackageImpl#getTympanogramResultTypeObject()
	 * @generated
	 */
	int TYMPANOGRAM_RESULT_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impedance.UnitType
	 * @see impedance.impl.ImpedancePackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 33;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see impedance.impl.ImpedancePackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 34;


	/**
	 * Returns the meta object for class '{@link impedance.AcousticImpedanceCompleteMeasurementType <em>Acoustic Impedance Complete Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acoustic Impedance Complete Measurement Type</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType
	 * @generated
	 */
	EClass getAcousticImpedanceCompleteMeasurementType();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.AcousticImpedanceCompleteMeasurementType#getTympanogramTest <em>Tympanogram Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tympanogram Test</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getTympanogramTest()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EReference getAcousticImpedanceCompleteMeasurementType_TympanogramTest();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.AcousticImpedanceCompleteMeasurementType#getReflexTest <em>Reflex Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reflex Test</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getReflexTest()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EReference getAcousticImpedanceCompleteMeasurementType_ReflexTest();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionIntactEarDrumTest()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EReference getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EReference getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Returns the meta object for the attribute '{@link impedance.AcousticImpedanceCompleteMeasurementType#getPrivateImpedanceData <em>Private Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Impedance Data</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getPrivateImpedanceData()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EAttribute getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData();

	/**
	 * Returns the meta object for the attribute '{@link impedance.AcousticImpedanceCompleteMeasurementType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getConvertedFromDataStandard()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EAttribute getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#isValidatedByNOAH()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EAttribute getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link impedance.AcousticImpedanceCompleteMeasurementType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see impedance.AcousticImpedanceCompleteMeasurementType#getVersion()
	 * @see #getAcousticImpedanceCompleteMeasurementType()
	 * @generated
	 */
	EAttribute getAcousticImpedanceCompleteMeasurementType_Version();

	/**
	 * Returns the meta object for class '{@link impedance.ComplianceCurveType <em>Compliance Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Curve Type</em>'.
	 * @see impedance.ComplianceCurveType
	 * @generated
	 */
	EClass getComplianceCurveType();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.ComplianceCurveType#getCompliancePoint <em>Compliance Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliance Point</em>'.
	 * @see impedance.ComplianceCurveType#getCompliancePoint()
	 * @see #getComplianceCurveType()
	 * @generated
	 */
	EReference getComplianceCurveType_CompliancePoint();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ComplianceCurveType#getComplianceUnit <em>Compliance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance Unit</em>'.
	 * @see impedance.ComplianceCurveType#getComplianceUnit()
	 * @see #getComplianceCurveType()
	 * @generated
	 */
	EReference getComplianceCurveType_ComplianceUnit();

	/**
	 * Returns the meta object for class '{@link impedance.CompliancePointType <em>Compliance Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Point Type</em>'.
	 * @see impedance.CompliancePointType
	 * @generated
	 */
	EClass getCompliancePointType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.CompliancePointType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see impedance.CompliancePointType#getPressure()
	 * @see #getCompliancePointType()
	 * @generated
	 */
	EAttribute getCompliancePointType_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.CompliancePointType#getCompliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance</em>'.
	 * @see impedance.CompliancePointType#getCompliance()
	 * @see #getCompliancePointType()
	 * @generated
	 */
	EReference getCompliancePointType_Compliance();

	/**
	 * Returns the meta object for class '{@link impedance.ComplianceType <em>Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Type</em>'.
	 * @see impedance.ComplianceType
	 * @generated
	 */
	EClass getComplianceType();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ComplianceType#getComplianceValue <em>Compliance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance Value</em>'.
	 * @see impedance.ComplianceType#getComplianceValue()
	 * @see #getComplianceType()
	 * @generated
	 */
	EReference getComplianceType_ComplianceValue();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ComplianceType#getComplianceUnit <em>Compliance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance Unit</em>'.
	 * @see impedance.ComplianceType#getComplianceUnit()
	 * @see #getComplianceType()
	 * @generated
	 */
	EReference getComplianceType_ComplianceUnit();

	/**
	 * Returns the meta object for class '{@link impedance.ComplianceUnitType <em>Compliance Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Unit Type</em>'.
	 * @see impedance.ComplianceUnitType
	 * @generated
	 */
	EClass getComplianceUnitType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ComplianceUnitType#getArgumentUnit1 <em>Argument Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Unit1</em>'.
	 * @see impedance.ComplianceUnitType#getArgumentUnit1()
	 * @see #getComplianceUnitType()
	 * @generated
	 */
	EAttribute getComplianceUnitType_ArgumentUnit1();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ComplianceUnitType#getArgumentUnit2 <em>Argument Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Unit2</em>'.
	 * @see impedance.ComplianceUnitType#getArgumentUnit2()
	 * @see #getComplianceUnitType()
	 * @generated
	 */
	EAttribute getComplianceUnitType_ArgumentUnit2();

	/**
	 * Returns the meta object for class '{@link impedance.ComplianceValueType <em>Compliance Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Value Type</em>'.
	 * @see impedance.ComplianceValueType
	 * @generated
	 */
	EClass getComplianceValueType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ComplianceValueType#getArgumentCompliance1 <em>Argument Compliance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Compliance1</em>'.
	 * @see impedance.ComplianceValueType#getArgumentCompliance1()
	 * @see #getComplianceValueType()
	 * @generated
	 */
	EAttribute getComplianceValueType_ArgumentCompliance1();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ComplianceValueType#getArgumentCompliance2 <em>Argument Compliance2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Compliance2</em>'.
	 * @see impedance.ComplianceValueType#getArgumentCompliance2()
	 * @see #getComplianceValueType()
	 * @generated
	 */
	EAttribute getComplianceValueType_ArgumentCompliance2();

	/**
	 * Returns the meta object for class '{@link impedance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see impedance.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link impedance.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see impedance.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link impedance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see impedance.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link impedance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see impedance.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.DocumentRoot#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acoustic Impedance Complete Measurement</em>'.
	 * @see impedance.DocumentRoot#getAcousticImpedanceCompleteMeasurement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AcousticImpedanceCompleteMeasurement();

	/**
	 * Returns the meta object for class '{@link impedance.EustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @see impedance.EustachianTubeFunctionIntactEarDrumTest
	 * @generated
	 */
	EClass getEustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getComplianceCurve <em>Compliance Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliance Curve</em>'.
	 * @see impedance.EustachianTubeFunctionIntactEarDrumTest#getComplianceCurve()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve();

	/**
	 * Returns the meta object for the attribute list '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pressure</em>'.
	 * @see impedance.EustachianTubeFunctionIntactEarDrumTest#getPressure()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionIntactEarDrumTest_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see impedance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_CanalVolume();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Condition</em>'.
	 * @see impedance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition()
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition();

	/**
	 * Returns the meta object for class '{@link impedance.EustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @see impedance.EustachianTubeFunctionPerforatedEarDrumTest
	 * @generated
	 */
	EClass getEustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint <em>Pressure Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pressure Point</em>'.
	 * @see impedance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EReference getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint();

	/**
	 * Returns the meta object for the attribute list '{@link impedance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint <em>Open Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Open Point</em>'.
	 * @see impedance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint();

	/**
	 * Returns the meta object for the attribute list '{@link impedance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint <em>Close Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Close Point</em>'.
	 * @see impedance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint();

	/**
	 * Returns the meta object for the attribute '{@link impedance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Base</em>'.
	 * @see impedance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase()
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 */
	EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase();

	/**
	 * Returns the meta object for class '{@link impedance.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Type</em>'.
	 * @see impedance.GradientType
	 * @generated
	 */
	EClass getGradientType();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.GradientType#getGradientValue <em>Gradient Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient Value</em>'.
	 * @see impedance.GradientType#getGradientValue()
	 * @see #getGradientType()
	 * @generated
	 */
	EReference getGradientType_GradientValue();

	/**
	 * Returns the meta object for the attribute '{@link impedance.GradientType#getGradientUnit <em>Gradient Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Unit</em>'.
	 * @see impedance.GradientType#getGradientUnit()
	 * @see #getGradientType()
	 * @generated
	 */
	EAttribute getGradientType_GradientUnit();

	/**
	 * Returns the meta object for class '{@link impedance.ImpedanceMeasurementConditionType <em>Measurement Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Condition Type</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType
	 * @generated
	 */
	EClass getImpedanceMeasurementConditionType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getSignalLevel <em>Signal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Level</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getSignalLevel()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_SignalLevel();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getSignalType()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_SignalType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getSignalOutput <em>Signal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Output</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getSignalOutput()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_SignalOutput();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getFrequency()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getPressure()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getProbeFrequency <em>Probe Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Frequency</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getProbeFrequency()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_ProbeFrequency();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ImpedanceMeasurementConditionType#getTestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Type</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getTestType()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EAttribute getImpedanceMeasurementConditionType_TestType();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ImpedanceMeasurementConditionType#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see impedance.ImpedanceMeasurementConditionType#getCanalVolume()
	 * @see #getImpedanceMeasurementConditionType()
	 * @generated
	 */
	EReference getImpedanceMeasurementConditionType_CanalVolume();

	/**
	 * Returns the meta object for class '{@link impedance.PressurePointType <em>Pressure Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Point Type</em>'.
	 * @see impedance.PressurePointType
	 * @generated
	 */
	EClass getPressurePointType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.PressurePointType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see impedance.PressurePointType#getTime()
	 * @see #getPressurePointType()
	 * @generated
	 */
	EAttribute getPressurePointType_Time();

	/**
	 * Returns the meta object for the attribute '{@link impedance.PressurePointType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see impedance.PressurePointType#getPressure()
	 * @see #getPressurePointType()
	 * @generated
	 */
	EAttribute getPressurePointType_Pressure();

	/**
	 * Returns the meta object for class '{@link impedance.ReflexCurveType <em>Reflex Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Curve Type</em>'.
	 * @see impedance.ReflexCurveType
	 * @generated
	 */
	EClass getReflexCurveType();

	/**
	 * Returns the meta object for the containment reference list '{@link impedance.ReflexCurveType#getReflexPoint <em>Reflex Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reflex Point</em>'.
	 * @see impedance.ReflexCurveType#getReflexPoint()
	 * @see #getReflexCurveType()
	 * @generated
	 */
	EReference getReflexCurveType_ReflexPoint();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ReflexCurveType#getComplianceUnit <em>Compliance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance Unit</em>'.
	 * @see impedance.ReflexCurveType#getComplianceUnit()
	 * @see #getReflexCurveType()
	 * @generated
	 */
	EReference getReflexCurveType_ComplianceUnit();

	/**
	 * Returns the meta object for class '{@link impedance.ReflexPointType <em>Reflex Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Point Type</em>'.
	 * @see impedance.ReflexPointType
	 * @generated
	 */
	EClass getReflexPointType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ReflexPointType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see impedance.ReflexPointType#getTime()
	 * @see #getReflexPointType()
	 * @generated
	 */
	EAttribute getReflexPointType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ReflexPointType#getCompliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance</em>'.
	 * @see impedance.ReflexPointType#getCompliance()
	 * @see #getReflexPointType()
	 * @generated
	 */
	EReference getReflexPointType_Compliance();

	/**
	 * Returns the meta object for class '{@link impedance.ReflexTestType <em>Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex Test Type</em>'.
	 * @see impedance.ReflexTestType
	 * @generated
	 */
	EClass getReflexTestType();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reflex Curve</em>'.
	 * @see impedance.ReflexTestType#getReflexCurve()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EReference getReflexTestType_ReflexCurve();

	/**
	 * Returns the meta object for the attribute '{@link impedance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Of Reflex Test</em>'.
	 * @see impedance.ReflexTestType#getResultOfReflexTest()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EAttribute getReflexTestType_ResultOfReflexTest();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.ReflexTestType#getImpedanceMeasurementCondition <em>Impedance Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impedance Measurement Condition</em>'.
	 * @see impedance.ReflexTestType#getImpedanceMeasurementCondition()
	 * @see #getReflexTestType()
	 * @generated
	 */
	EReference getReflexTestType_ImpedanceMeasurementCondition();

	/**
	 * Returns the meta object for class '{@link impedance.TympanogramMeasurementConditionsType <em>Tympanogram Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tympanogram Measurement Conditions Type</em>'.
	 * @see impedance.TympanogramMeasurementConditionsType
	 * @generated
	 */
	EClass getTympanogramMeasurementConditionsType();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sweep Speed</em>'.
	 * @see impedance.TympanogramMeasurementConditionsType#getSweepSpeed()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getTympanogramMeasurementConditionsType_SweepSpeed();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Mode</em>'.
	 * @see impedance.TympanogramMeasurementConditionsType#getRecordMode()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getTympanogramMeasurementConditionsType_RecordMode();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probe Frequency</em>'.
	 * @see impedance.TympanogramMeasurementConditionsType#getProbeFrequency()
	 * @see #getTympanogramMeasurementConditionsType()
	 * @generated
	 */
	EAttribute getTympanogramMeasurementConditionsType_ProbeFrequency();

	/**
	 * Returns the meta object for class '{@link impedance.TympanogramTestType <em>Tympanogram Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tympanogram Test Type</em>'.
	 * @see impedance.TympanogramTestType
	 * @generated
	 */
	EClass getTympanogramTestType();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.TympanogramTestType#getComplianceCurve <em>Compliance Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compliance Curve</em>'.
	 * @see impedance.TympanogramTestType#getComplianceCurve()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_ComplianceCurve();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.TympanogramTestType#getMaximumCompliance <em>Maximum Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Compliance</em>'.
	 * @see impedance.TympanogramTestType#getMaximumCompliance()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_MaximumCompliance();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canal Volume</em>'.
	 * @see impedance.TympanogramTestType#getCanalVolume()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_CanalVolume();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.TympanogramTestType#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gradient</em>'.
	 * @see impedance.TympanogramTestType#getGradient()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramTestType#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see impedance.TympanogramTestType#getPressure()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resonance Frequency</em>'.
	 * @see impedance.TympanogramTestType#getResonanceFrequency()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_ResonanceFrequency();

	/**
	 * Returns the meta object for the attribute '{@link impedance.TympanogramTestType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see impedance.TympanogramTestType#getResult()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EAttribute getTympanogramTestType_Result();

	/**
	 * Returns the meta object for the containment reference '{@link impedance.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Condition</em>'.
	 * @see impedance.TympanogramTestType#getMeasurementCondition()
	 * @see #getTympanogramTestType()
	 * @generated
	 */
	EReference getTympanogramTestType_MeasurementCondition();

	/**
	 * Returns the meta object for enum '{@link impedance.RecordingModeType <em>Recording Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recording Mode Type</em>'.
	 * @see impedance.RecordingModeType
	 * @generated
	 */
	EEnum getRecordingModeType();

	/**
	 * Returns the meta object for enum '{@link impedance.ReflexTestTypeType <em>Reflex Test Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reflex Test Type Type</em>'.
	 * @see impedance.ReflexTestTypeType
	 * @generated
	 */
	EEnum getReflexTestTypeType();

	/**
	 * Returns the meta object for enum '{@link impedance.SignalOutputType <em>Signal Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Output Type</em>'.
	 * @see impedance.SignalOutputType
	 * @generated
	 */
	EEnum getSignalOutputType();

	/**
	 * Returns the meta object for enum '{@link impedance.SignalTypeType <em>Signal Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type Type</em>'.
	 * @see impedance.SignalTypeType
	 * @generated
	 */
	EEnum getSignalTypeType();

	/**
	 * Returns the meta object for enum '{@link impedance.TympanogramResultType <em>Tympanogram Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tympanogram Result Type</em>'.
	 * @see impedance.TympanogramResultType
	 * @generated
	 */
	EEnum getTympanogramResultType();

	/**
	 * Returns the meta object for enum '{@link impedance.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see impedance.UnitType
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
	 * Returns the meta object for data type '{@link impedance.RecordingModeType <em>Recording Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Recording Mode Type Object</em>'.
	 * @see impedance.RecordingModeType
	 * @model instanceClass="impedance.RecordingModeType"
	 *        extendedMetaData="name='RecordingMode_Type:Object' baseType='RecordingMode_Type'"
	 * @generated
	 */
	EDataType getRecordingModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link impedance.ReflexTestTypeType <em>Reflex Test Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reflex Test Type Type Object</em>'.
	 * @see impedance.ReflexTestTypeType
	 * @model instanceClass="impedance.ReflexTestTypeType"
	 *        extendedMetaData="name='ReflexTestType_Type:Object' baseType='ReflexTestType_Type'"
	 * @generated
	 */
	EDataType getReflexTestTypeTypeObject();

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
	 * Returns the meta object for data type '{@link impedance.SignalOutputType <em>Signal Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Output Type Object</em>'.
	 * @see impedance.SignalOutputType
	 * @model instanceClass="impedance.SignalOutputType"
	 *        extendedMetaData="name='SignalOutput_Type:Object' baseType='SignalOutput_Type'"
	 * @generated
	 */
	EDataType getSignalOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link impedance.SignalTypeType <em>Signal Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signal Type Type Object</em>'.
	 * @see impedance.SignalTypeType
	 * @model instanceClass="impedance.SignalTypeType"
	 *        extendedMetaData="name='SignalType_Type:Object' baseType='SignalType_Type'"
	 * @generated
	 */
	EDataType getSignalTypeTypeObject();

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
	 *        extendedMetaData="name='Time_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='3' minInclusive='0.000'"
	 * @generated
	 */
	EDataType getTimeType1();

	/**
	 * Returns the meta object for data type '{@link impedance.TympanogramResultType <em>Tympanogram Result Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tympanogram Result Type Object</em>'.
	 * @see impedance.TympanogramResultType
	 * @model instanceClass="impedance.TympanogramResultType"
	 *        extendedMetaData="name='TympanogramResult_Type:Object' baseType='TympanogramResult_Type'"
	 * @generated
	 */
	EDataType getTympanogramResultTypeObject();

	/**
	 * Returns the meta object for data type '{@link impedance.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see impedance.UnitType
	 * @model instanceClass="impedance.UnitType"
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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImpedanceFactory getImpedanceFactory();

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
		 * The meta object literal for the '{@link impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl <em>Acoustic Impedance Complete Measurement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getAcousticImpedanceCompleteMeasurementType()
		 * @generated
		 */
		EClass ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE = eINSTANCE.getAcousticImpedanceCompleteMeasurementType();

		/**
		 * The meta object literal for the '<em><b>Tympanogram Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_TympanogramTest();

		/**
		 * The meta object literal for the '<em><b>Reflex Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_ReflexTest();

		/**
		 * The meta object literal for the '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Private Impedance Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION = eINSTANCE.getAcousticImpedanceCompleteMeasurementType_Version();

		/**
		 * The meta object literal for the '{@link impedance.impl.ComplianceCurveTypeImpl <em>Compliance Curve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ComplianceCurveTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getComplianceCurveType()
		 * @generated
		 */
		EClass COMPLIANCE_CURVE_TYPE = eINSTANCE.getComplianceCurveType();

		/**
		 * The meta object literal for the '<em><b>Compliance Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT = eINSTANCE.getComplianceCurveType_CompliancePoint();

		/**
		 * The meta object literal for the '<em><b>Compliance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT = eINSTANCE.getComplianceCurveType_ComplianceUnit();

		/**
		 * The meta object literal for the '{@link impedance.impl.CompliancePointTypeImpl <em>Compliance Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.CompliancePointTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getCompliancePointType()
		 * @generated
		 */
		EClass COMPLIANCE_POINT_TYPE = eINSTANCE.getCompliancePointType();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_POINT_TYPE__PRESSURE = eINSTANCE.getCompliancePointType_Pressure();

		/**
		 * The meta object literal for the '<em><b>Compliance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_POINT_TYPE__COMPLIANCE = eINSTANCE.getCompliancePointType_Compliance();

		/**
		 * The meta object literal for the '{@link impedance.impl.ComplianceTypeImpl <em>Compliance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ComplianceTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getComplianceType()
		 * @generated
		 */
		EClass COMPLIANCE_TYPE = eINSTANCE.getComplianceType();

		/**
		 * The meta object literal for the '<em><b>Compliance Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_TYPE__COMPLIANCE_VALUE = eINSTANCE.getComplianceType_ComplianceValue();

		/**
		 * The meta object literal for the '<em><b>Compliance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_TYPE__COMPLIANCE_UNIT = eINSTANCE.getComplianceType_ComplianceUnit();

		/**
		 * The meta object literal for the '{@link impedance.impl.ComplianceUnitTypeImpl <em>Compliance Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ComplianceUnitTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getComplianceUnitType()
		 * @generated
		 */
		EClass COMPLIANCE_UNIT_TYPE = eINSTANCE.getComplianceUnitType();

		/**
		 * The meta object literal for the '<em><b>Argument Unit1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1 = eINSTANCE.getComplianceUnitType_ArgumentUnit1();

		/**
		 * The meta object literal for the '<em><b>Argument Unit2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2 = eINSTANCE.getComplianceUnitType_ArgumentUnit2();

		/**
		 * The meta object literal for the '{@link impedance.impl.ComplianceValueTypeImpl <em>Compliance Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ComplianceValueTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getComplianceValueType()
		 * @generated
		 */
		EClass COMPLIANCE_VALUE_TYPE = eINSTANCE.getComplianceValueType();

		/**
		 * The meta object literal for the '<em><b>Argument Compliance1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1 = eINSTANCE.getComplianceValueType_ArgumentCompliance1();

		/**
		 * The meta object literal for the '<em><b>Argument Compliance2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2 = eINSTANCE.getComplianceValueType_ArgumentCompliance2();

		/**
		 * The meta object literal for the '{@link impedance.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.DocumentRootImpl
		 * @see impedance.impl.ImpedancePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Acoustic Impedance Complete Measurement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT = eINSTANCE.getDocumentRoot_AcousticImpedanceCompleteMeasurement();

		/**
		 * The meta object literal for the '{@link impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl <em>Eustachian Tube Function Intact Ear Drum Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl
		 * @see impedance.impl.ImpedancePackageImpl#getEustachianTubeFunctionIntactEarDrumTest()
		 * @generated
		 */
		EClass EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest();

		/**
		 * The meta object literal for the '<em><b>Compliance Curve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE = eINSTANCE.getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve();

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
		 * The meta object literal for the '{@link impedance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl
		 * @see impedance.impl.ImpedancePackageImpl#getEustachianTubeFunctionPerforatedEarDrumTest()
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
		 * The meta object literal for the '{@link impedance.impl.GradientTypeImpl <em>Gradient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.GradientTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getGradientType()
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
		 * The meta object literal for the '<em><b>Gradient Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_TYPE__GRADIENT_UNIT = eINSTANCE.getGradientType_GradientUnit();

		/**
		 * The meta object literal for the '{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl <em>Measurement Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ImpedanceMeasurementConditionTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getImpedanceMeasurementConditionType()
		 * @generated
		 */
		EClass IMPEDANCE_MEASUREMENT_CONDITION_TYPE = eINSTANCE.getImpedanceMeasurementConditionType();

		/**
		 * The meta object literal for the '<em><b>Signal Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL = eINSTANCE.getImpedanceMeasurementConditionType_SignalLevel();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE = eINSTANCE.getImpedanceMeasurementConditionType_SignalType();

		/**
		 * The meta object literal for the '<em><b>Signal Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT = eINSTANCE.getImpedanceMeasurementConditionType_SignalOutput();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY = eINSTANCE.getImpedanceMeasurementConditionType_Frequency();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE = eINSTANCE.getImpedanceMeasurementConditionType_Pressure();

		/**
		 * The meta object literal for the '<em><b>Probe Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY = eINSTANCE.getImpedanceMeasurementConditionType_ProbeFrequency();

		/**
		 * The meta object literal for the '<em><b>Test Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE = eINSTANCE.getImpedanceMeasurementConditionType_TestType();

		/**
		 * The meta object literal for the '<em><b>Canal Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME = eINSTANCE.getImpedanceMeasurementConditionType_CanalVolume();

		/**
		 * The meta object literal for the '{@link impedance.impl.PressurePointTypeImpl <em>Pressure Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.PressurePointTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getPressurePointType()
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
		 * The meta object literal for the '{@link impedance.impl.ReflexCurveTypeImpl <em>Reflex Curve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ReflexCurveTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getReflexCurveType()
		 * @generated
		 */
		EClass REFLEX_CURVE_TYPE = eINSTANCE.getReflexCurveType();

		/**
		 * The meta object literal for the '<em><b>Reflex Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_CURVE_TYPE__REFLEX_POINT = eINSTANCE.getReflexCurveType_ReflexPoint();

		/**
		 * The meta object literal for the '<em><b>Compliance Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_CURVE_TYPE__COMPLIANCE_UNIT = eINSTANCE.getReflexCurveType_ComplianceUnit();

		/**
		 * The meta object literal for the '{@link impedance.impl.ReflexPointTypeImpl <em>Reflex Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ReflexPointTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getReflexPointType()
		 * @generated
		 */
		EClass REFLEX_POINT_TYPE = eINSTANCE.getReflexPointType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_POINT_TYPE__TIME = eINSTANCE.getReflexPointType_Time();

		/**
		 * The meta object literal for the '<em><b>Compliance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_POINT_TYPE__COMPLIANCE = eINSTANCE.getReflexPointType_Compliance();

		/**
		 * The meta object literal for the '{@link impedance.impl.ReflexTestTypeImpl <em>Reflex Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.ReflexTestTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getReflexTestType()
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
		 * The meta object literal for the '<em><b>Result Of Reflex Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST = eINSTANCE.getReflexTestType_ResultOfReflexTest();

		/**
		 * The meta object literal for the '<em><b>Impedance Measurement Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION = eINSTANCE.getReflexTestType_ImpedanceMeasurementCondition();

		/**
		 * The meta object literal for the '{@link impedance.impl.TympanogramMeasurementConditionsTypeImpl <em>Tympanogram Measurement Conditions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.TympanogramMeasurementConditionsTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getTympanogramMeasurementConditionsType()
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
		 * The meta object literal for the '<em><b>Probe Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY = eINSTANCE.getTympanogramMeasurementConditionsType_ProbeFrequency();

		/**
		 * The meta object literal for the '{@link impedance.impl.TympanogramTestTypeImpl <em>Tympanogram Test Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.impl.TympanogramTestTypeImpl
		 * @see impedance.impl.ImpedancePackageImpl#getTympanogramTestType()
		 * @generated
		 */
		EClass TYMPANOGRAM_TEST_TYPE = eINSTANCE.getTympanogramTestType();

		/**
		 * The meta object literal for the '<em><b>Compliance Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE = eINSTANCE.getTympanogramTestType_ComplianceCurve();

		/**
		 * The meta object literal for the '<em><b>Maximum Compliance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE = eINSTANCE.getTympanogramTestType_MaximumCompliance();

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
		 * The meta object literal for the '{@link impedance.RecordingModeType <em>Recording Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.RecordingModeType
		 * @see impedance.impl.ImpedancePackageImpl#getRecordingModeType()
		 * @generated
		 */
		EEnum RECORDING_MODE_TYPE = eINSTANCE.getRecordingModeType();

		/**
		 * The meta object literal for the '{@link impedance.ReflexTestTypeType <em>Reflex Test Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.ReflexTestTypeType
		 * @see impedance.impl.ImpedancePackageImpl#getReflexTestTypeType()
		 * @generated
		 */
		EEnum REFLEX_TEST_TYPE_TYPE = eINSTANCE.getReflexTestTypeType();

		/**
		 * The meta object literal for the '{@link impedance.SignalOutputType <em>Signal Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.SignalOutputType
		 * @see impedance.impl.ImpedancePackageImpl#getSignalOutputType()
		 * @generated
		 */
		EEnum SIGNAL_OUTPUT_TYPE = eINSTANCE.getSignalOutputType();

		/**
		 * The meta object literal for the '{@link impedance.SignalTypeType <em>Signal Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.SignalTypeType
		 * @see impedance.impl.ImpedancePackageImpl#getSignalTypeType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE_TYPE = eINSTANCE.getSignalTypeType();

		/**
		 * The meta object literal for the '{@link impedance.TympanogramResultType <em>Tympanogram Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.TympanogramResultType
		 * @see impedance.impl.ImpedancePackageImpl#getTympanogramResultType()
		 * @generated
		 */
		EEnum TYMPANOGRAM_RESULT_TYPE = eINSTANCE.getTympanogramResultType();

		/**
		 * The meta object literal for the '{@link impedance.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.UnitType
		 * @see impedance.impl.ImpedancePackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see impedance.impl.ImpedancePackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Recording Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.RecordingModeType
		 * @see impedance.impl.ImpedancePackageImpl#getRecordingModeTypeObject()
		 * @generated
		 */
		EDataType RECORDING_MODE_TYPE_OBJECT = eINSTANCE.getRecordingModeTypeObject();

		/**
		 * The meta object literal for the '<em>Reflex Test Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.ReflexTestTypeType
		 * @see impedance.impl.ImpedancePackageImpl#getReflexTestTypeTypeObject()
		 * @generated
		 */
		EDataType REFLEX_TEST_TYPE_TYPE_OBJECT = eINSTANCE.getReflexTestTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see impedance.impl.ImpedancePackageImpl#getSignalLevelType()
		 * @generated
		 */
		EDataType SIGNAL_LEVEL_TYPE = eINSTANCE.getSignalLevelType();

		/**
		 * The meta object literal for the '<em>Signal Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.SignalOutputType
		 * @see impedance.impl.ImpedancePackageImpl#getSignalOutputTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_OUTPUT_TYPE_OBJECT = eINSTANCE.getSignalOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Signal Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.SignalTypeType
		 * @see impedance.impl.ImpedancePackageImpl#getSignalTypeTypeObject()
		 * @generated
		 */
		EDataType SIGNAL_TYPE_TYPE_OBJECT = eINSTANCE.getSignalTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Time Base Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see impedance.impl.ImpedancePackageImpl#getTimeBaseType()
		 * @generated
		 */
		EDataType TIME_BASE_TYPE = eINSTANCE.getTimeBaseType();

		/**
		 * The meta object literal for the '<em>Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see impedance.impl.ImpedancePackageImpl#getTimeType()
		 * @generated
		 */
		EDataType TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '<em>Time Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see impedance.impl.ImpedancePackageImpl#getTimeType1()
		 * @generated
		 */
		EDataType TIME_TYPE1 = eINSTANCE.getTimeType1();

		/**
		 * The meta object literal for the '<em>Tympanogram Result Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.TympanogramResultType
		 * @see impedance.impl.ImpedancePackageImpl#getTympanogramResultTypeObject()
		 * @generated
		 */
		EDataType TYMPANOGRAM_RESULT_TYPE_OBJECT = eINSTANCE.getTympanogramResultTypeObject();

		/**
		 * The meta object literal for the '<em>Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impedance.UnitType
		 * @see impedance.impl.ImpedancePackageImpl#getUnitTypeObject()
		 * @generated
		 */
		EDataType UNIT_TYPE_OBJECT = eINSTANCE.getUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see impedance.impl.ImpedancePackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //ImpedancePackage
