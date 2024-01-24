/*
 */
package data;


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
 * @see data.DataFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DataPackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/data.ecore", ecoreSourceLocations="/model/data.ecore")
public interface DataPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Scan/ScanMetaData";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link data.impl.AreaTypeImpl <em>Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.AreaTypeImpl
	 * @see data.impl.DataPackageImpl#getAreaType()
	 * @generated
	 */
	int AREA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE__POINTS = 0;

	/**
	 * The number of structural features of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.AreaType1Impl <em>Area Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.AreaType1Impl
	 * @see data.impl.DataPackageImpl#getAreaType1()
	 * @generated
	 */
	int AREA_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE1__POINTS = AREA_TYPE__POINTS;

	/**
	 * The feature id for the '<em><b>Annotation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE1__ANNOTATION_COMMENT = AREA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Area Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE1_FEATURE_COUNT = AREA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Area Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_TYPE1_OPERATION_COUNT = AREA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.DirectionTypeImpl <em>Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DirectionTypeImpl
	 * @see data.impl.DataPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE__VECTOR = 1;

	/**
	 * The number of structural features of the '<em>Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.DirectionType1Impl <em>Direction Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DirectionType1Impl
	 * @see data.impl.DataPackageImpl#getDirectionType1()
	 * @generated
	 */
	int DIRECTION_TYPE1 = 3;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE1__POINT = DIRECTION_TYPE__POINT;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE1__VECTOR = DIRECTION_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Annotation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE1__ANNOTATION_COMMENT = DIRECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direction Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE1_FEATURE_COUNT = DIRECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direction Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_TYPE1_OPERATION_COUNT = DIRECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.PackageTypeImpl <em>Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.PackageTypeImpl
	 * @see data.impl.DataPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Package Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__PACKAGE_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__PACKAGE_ID = 1;

	/**
	 * The number of structural features of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.PlaneTypeImpl <em>Plane Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.PlaneTypeImpl
	 * @see data.impl.DataPackageImpl#getPlaneType()
	 * @generated
	 */
	int PLANE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE__PLANE = 0;

	/**
	 * The number of structural features of the '<em>Plane Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plane Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.PlaneType1Impl <em>Plane Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.PlaneType1Impl
	 * @see data.impl.DataPackageImpl#getPlaneType1()
	 * @generated
	 */
	int PLANE_TYPE1 = 6;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE1__PLANE = PLANE_TYPE__PLANE;

	/**
	 * The feature id for the '<em><b>Annotation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE1__ANNOTATION_COMMENT = PLANE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plane Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE1_FEATURE_COUNT = PLANE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plane Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_TYPE1_OPERATION_COUNT = PLANE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.PointTypeImpl
	 * @see data.impl.DataPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Z = 2;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.PointType1Impl <em>Point Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.PointType1Impl
	 * @see data.impl.DataPackageImpl#getPointType1()
	 * @generated
	 */
	int POINT_TYPE1 = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1__X = POINT_TYPE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1__Y = POINT_TYPE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1__Z = POINT_TYPE__Z;

	/**
	 * The feature id for the '<em><b>Annotation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1__ANNOTATION_COMMENT = POINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1_FEATURE_COUNT = POINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE1_OPERATION_COUNT = POINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.impl.ScanAnnotations3DTypeImpl <em>Scan Annotations3 DType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ScanAnnotations3DTypeImpl
	 * @see data.impl.DataPackageImpl#getScanAnnotations3DType()
	 * @generated
	 */
	int SCAN_ANNOTATIONS3_DTYPE = 9;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE__PLANE = 2;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE__AREA = 3;

	/**
	 * The number of structural features of the '<em>Scan Annotations3 DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scan Annotations3 DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ANNOTATIONS3_DTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.ScanMetaDataStandardTypeImpl <em>Scan Meta Data Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ScanMetaDataStandardTypeImpl
	 * @see data.impl.DataPackageImpl#getScanMetaDataStandardType()
	 * @generated
	 */
	int SCAN_META_DATA_STANDARD_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Scan Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Scans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_META_DATA_STANDARD_TYPE__SCANS = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_META_DATA_STANDARD_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Scan Meta Data Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_META_DATA_STANDARD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scan Meta Data Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_META_DATA_STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.ScannerHardwareTypeImpl <em>Scanner Hardware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ScannerHardwareTypeImpl
	 * @see data.impl.DataPackageImpl#getScannerHardwareType()
	 * @generated
	 */
	int SCANNER_HARDWARE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Scanner Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Scanner Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE__SCANNER_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Scanner Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE = 2;

	/**
	 * The feature id for the '<em><b>Scanner Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE__SCANNER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unique Scanner ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID = 4;

	/**
	 * The number of structural features of the '<em>Scanner Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scanner Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNER_HARDWARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.ScanPropertiesTypeImpl <em>Scan Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ScanPropertiesTypeImpl
	 * @see data.impl.DataPackageImpl#getScanPropertiesType()
	 * @generated
	 */
	int SCAN_PROPERTIES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Scan Time Stamp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Ear</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__EAR = 2;

	/**
	 * The feature id for the '<em><b>Jaw Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__JAW_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Scan Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__SCAN_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Scan Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__SCAN_COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Scan File And Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Scan Stored In Noah</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH = 7;

	/**
	 * The number of structural features of the '<em>Scan Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Scan Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.ScansTypeImpl <em>Scans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.ScansTypeImpl
	 * @see data.impl.DataPackageImpl#getScansType()
	 * @generated
	 */
	int SCANS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Scanner Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_TYPE__SCANNER_HARDWARE = 0;

	/**
	 * The feature id for the '<em><b>Scan Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_TYPE__SCAN_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Scan Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_TYPE__SCAN_ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Scans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.StoredInNoahTypeImpl <em>Stored In Noah Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.StoredInNoahTypeImpl
	 * @see data.impl.DataPackageImpl#getStoredInNoahType()
	 * @generated
	 */
	int STORED_IN_NOAH_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Stored Public Or Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE = 0;

	/**
	 * The feature id for the '<em><b>Action Date Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Stored In Noah Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_IN_NOAH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stored In Noah Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_IN_NOAH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DocumentRootImpl
	 * @see data.impl.DataPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 15;

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
	 * The feature id for the '<em><b>Scan Meta Data Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCAN_META_DATA_STANDARD = 3;

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
	 * The meta object id for the '{@link data.EarType <em>Ear Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.EarType
	 * @see data.impl.DataPackageImpl#getEarType()
	 * @generated
	 */
	int EAR_TYPE = 16;

	/**
	 * The meta object id for the '{@link data.JawPositionType <em>Jaw Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.JawPositionType
	 * @see data.impl.DataPackageImpl#getJawPositionType()
	 * @generated
	 */
	int JAW_POSITION_TYPE = 17;

	/**
	 * The meta object id for the '{@link data.ScanFormatType <em>Scan Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.ScanFormatType
	 * @see data.impl.DataPackageImpl#getScanFormatType()
	 * @generated
	 */
	int SCAN_FORMAT_TYPE = 18;

	/**
	 * The meta object id for the '{@link data.ScannerTypeType <em>Scanner Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.ScannerTypeType
	 * @see data.impl.DataPackageImpl#getScannerTypeType()
	 * @generated
	 */
	int SCANNER_TYPE_TYPE = 19;

	/**
	 * The meta object id for the '{@link data.StoredPublicOrPrivateType <em>Stored Public Or Private Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.StoredPublicOrPrivateType
	 * @see data.impl.DataPackageImpl#getStoredPublicOrPrivateType()
	 * @generated
	 */
	int STORED_PUBLIC_OR_PRIVATE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Coordinate Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.impl.DataPackageImpl#getCoordinateType()
	 * @generated
	 */
	int COORDINATE_TYPE = 21;

	/**
	 * The meta object id for the '<em>Coordinate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see data.impl.DataPackageImpl#getCoordinateTypeObject()
	 * @generated
	 */
	int COORDINATE_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Ear Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.EarType
	 * @see data.impl.DataPackageImpl#getEarTypeObject()
	 * @generated
	 */
	int EAR_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Jaw Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.JawPositionType
	 * @see data.impl.DataPackageImpl#getJawPositionTypeObject()
	 * @generated
	 */
	int JAW_POSITION_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Scan Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.ScanFormatType
	 * @see data.impl.DataPackageImpl#getScanFormatTypeObject()
	 * @generated
	 */
	int SCAN_FORMAT_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Scanner Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.ScannerTypeType
	 * @see data.impl.DataPackageImpl#getScannerTypeTypeObject()
	 * @generated
	 */
	int SCANNER_TYPE_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Stored Public Or Private Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.StoredPublicOrPrivateType
	 * @see data.impl.DataPackageImpl#getStoredPublicOrPrivateTypeObject()
	 * @generated
	 */
	int STORED_PUBLIC_OR_PRIVATE_TYPE_OBJECT = 27;


	/**
	 * Returns the meta object for class '{@link data.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Type</em>'.
	 * @see data.AreaType
	 * @generated
	 */
	EClass getAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link data.AreaType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see data.AreaType#getPoints()
	 * @see #getAreaType()
	 * @generated
	 */
	EReference getAreaType_Points();

	/**
	 * Returns the meta object for class '{@link data.AreaType1 <em>Area Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Type1</em>'.
	 * @see data.AreaType1
	 * @generated
	 */
	EClass getAreaType1();

	/**
	 * Returns the meta object for the attribute '{@link data.AreaType1#getAnnotationComment <em>Annotation Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Comment</em>'.
	 * @see data.AreaType1#getAnnotationComment()
	 * @see #getAreaType1()
	 * @generated
	 */
	EAttribute getAreaType1_AnnotationComment();

	/**
	 * Returns the meta object for class '{@link data.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Type</em>'.
	 * @see data.DirectionType
	 * @generated
	 */
	EClass getDirectionType();

	/**
	 * Returns the meta object for the containment reference '{@link data.DirectionType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see data.DirectionType#getPoint()
	 * @see #getDirectionType()
	 * @generated
	 */
	EReference getDirectionType_Point();

	/**
	 * Returns the meta object for the containment reference '{@link data.DirectionType#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector</em>'.
	 * @see data.DirectionType#getVector()
	 * @see #getDirectionType()
	 * @generated
	 */
	EReference getDirectionType_Vector();

	/**
	 * Returns the meta object for class '{@link data.DirectionType1 <em>Direction Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Type1</em>'.
	 * @see data.DirectionType1
	 * @generated
	 */
	EClass getDirectionType1();

	/**
	 * Returns the meta object for the attribute '{@link data.DirectionType1#getAnnotationComment <em>Annotation Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Comment</em>'.
	 * @see data.DirectionType1#getAnnotationComment()
	 * @see #getDirectionType1()
	 * @generated
	 */
	EAttribute getDirectionType1_AnnotationComment();

	/**
	 * Returns the meta object for class '{@link data.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Type</em>'.
	 * @see data.PackageType
	 * @generated
	 */
	EClass getPackageType();

	/**
	 * Returns the meta object for the attribute '{@link data.PackageType#getPackageLocation <em>Package Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Location</em>'.
	 * @see data.PackageType#getPackageLocation()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_PackageLocation();

	/**
	 * Returns the meta object for the attribute '{@link data.PackageType#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see data.PackageType#getPackageID()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_PackageID();

	/**
	 * Returns the meta object for class '{@link data.PlaneType <em>Plane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane Type</em>'.
	 * @see data.PlaneType
	 * @generated
	 */
	EClass getPlaneType();

	/**
	 * Returns the meta object for the containment reference '{@link data.PlaneType#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plane</em>'.
	 * @see data.PlaneType#getPlane()
	 * @see #getPlaneType()
	 * @generated
	 */
	EReference getPlaneType_Plane();

	/**
	 * Returns the meta object for class '{@link data.PlaneType1 <em>Plane Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane Type1</em>'.
	 * @see data.PlaneType1
	 * @generated
	 */
	EClass getPlaneType1();

	/**
	 * Returns the meta object for the attribute '{@link data.PlaneType1#getAnnotationComment <em>Annotation Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Comment</em>'.
	 * @see data.PlaneType1#getAnnotationComment()
	 * @see #getPlaneType1()
	 * @generated
	 */
	EAttribute getPlaneType1_AnnotationComment();

	/**
	 * Returns the meta object for class '{@link data.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see data.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link data.PointType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see data.PointType#getX()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_X();

	/**
	 * Returns the meta object for the attribute '{@link data.PointType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see data.PointType#getY()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Y();

	/**
	 * Returns the meta object for the attribute '{@link data.PointType#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see data.PointType#getZ()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Z();

	/**
	 * Returns the meta object for class '{@link data.PointType1 <em>Point Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type1</em>'.
	 * @see data.PointType1
	 * @generated
	 */
	EClass getPointType1();

	/**
	 * Returns the meta object for the attribute '{@link data.PointType1#getAnnotationComment <em>Annotation Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Comment</em>'.
	 * @see data.PointType1#getAnnotationComment()
	 * @see #getPointType1()
	 * @generated
	 */
	EAttribute getPointType1_AnnotationComment();

	/**
	 * Returns the meta object for class '{@link data.ScanAnnotations3DType <em>Scan Annotations3 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Annotations3 DType</em>'.
	 * @see data.ScanAnnotations3DType
	 * @generated
	 */
	EClass getScanAnnotations3DType();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanAnnotations3DType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see data.ScanAnnotations3DType#getPoint()
	 * @see #getScanAnnotations3DType()
	 * @generated
	 */
	EReference getScanAnnotations3DType_Point();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanAnnotations3DType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Direction</em>'.
	 * @see data.ScanAnnotations3DType#getDirection()
	 * @see #getScanAnnotations3DType()
	 * @generated
	 */
	EReference getScanAnnotations3DType_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanAnnotations3DType#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plane</em>'.
	 * @see data.ScanAnnotations3DType#getPlane()
	 * @see #getScanAnnotations3DType()
	 * @generated
	 */
	EReference getScanAnnotations3DType_Plane();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanAnnotations3DType#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see data.ScanAnnotations3DType#getArea()
	 * @see #getScanAnnotations3DType()
	 * @generated
	 */
	EReference getScanAnnotations3DType_Area();

	/**
	 * Returns the meta object for class '{@link data.ScanMetaDataStandardType <em>Scan Meta Data Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Meta Data Standard Type</em>'.
	 * @see data.ScanMetaDataStandardType
	 * @generated
	 */
	EClass getScanMetaDataStandardType();

	/**
	 * Returns the meta object for the containment reference '{@link data.ScanMetaDataStandardType#getScanPackage <em>Scan Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Package</em>'.
	 * @see data.ScanMetaDataStandardType#getScanPackage()
	 * @see #getScanMetaDataStandardType()
	 * @generated
	 */
	EReference getScanMetaDataStandardType_ScanPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanMetaDataStandardType#getScans <em>Scans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scans</em>'.
	 * @see data.ScanMetaDataStandardType#getScans()
	 * @see #getScanMetaDataStandardType()
	 * @generated
	 */
	EReference getScanMetaDataStandardType_Scans();

	/**
	 * Returns the meta object for the attribute '{@link data.ScanMetaDataStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see data.ScanMetaDataStandardType#getVersion()
	 * @see #getScanMetaDataStandardType()
	 * @generated
	 */
	EAttribute getScanMetaDataStandardType_Version();

	/**
	 * Returns the meta object for class '{@link data.ScannerHardwareType <em>Scanner Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanner Hardware Type</em>'.
	 * @see data.ScannerHardwareType
	 * @generated
	 */
	EClass getScannerHardwareType();

	/**
	 * Returns the meta object for the attribute '{@link data.ScannerHardwareType#getScannerProvider <em>Scanner Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scanner Provider</em>'.
	 * @see data.ScannerHardwareType#getScannerProvider()
	 * @see #getScannerHardwareType()
	 * @generated
	 */
	EAttribute getScannerHardwareType_ScannerProvider();

	/**
	 * Returns the meta object for the attribute '{@link data.ScannerHardwareType#getScannerModel <em>Scanner Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scanner Model</em>'.
	 * @see data.ScannerHardwareType#getScannerModel()
	 * @see #getScannerHardwareType()
	 * @generated
	 */
	EAttribute getScannerHardwareType_ScannerModel();

	/**
	 * Returns the meta object for the attribute '{@link data.ScannerHardwareType#getScannerFirmware <em>Scanner Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scanner Firmware</em>'.
	 * @see data.ScannerHardwareType#getScannerFirmware()
	 * @see #getScannerHardwareType()
	 * @generated
	 */
	EAttribute getScannerHardwareType_ScannerFirmware();

	/**
	 * Returns the meta object for the attribute '{@link data.ScannerHardwareType#getScannerType <em>Scanner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scanner Type</em>'.
	 * @see data.ScannerHardwareType#getScannerType()
	 * @see #getScannerHardwareType()
	 * @generated
	 */
	EAttribute getScannerHardwareType_ScannerType();

	/**
	 * Returns the meta object for the attribute '{@link data.ScannerHardwareType#getUniqueScannerID <em>Unique Scanner ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Scanner ID</em>'.
	 * @see data.ScannerHardwareType#getUniqueScannerID()
	 * @see #getScannerHardwareType()
	 * @generated
	 */
	EAttribute getScannerHardwareType_UniqueScannerID();

	/**
	 * Returns the meta object for class '{@link data.ScanPropertiesType <em>Scan Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Properties Type</em>'.
	 * @see data.ScanPropertiesType
	 * @generated
	 */
	EClass getScanPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see data.ScanPropertiesType#getGroup()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getScanTimeStamp <em>Scan Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scan Time Stamp</em>'.
	 * @see data.ScanPropertiesType#getScanTimeStamp()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_ScanTimeStamp();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getEar <em>Ear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ear</em>'.
	 * @see data.ScanPropertiesType#getEar()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_Ear();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getJawPosition <em>Jaw Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jaw Position</em>'.
	 * @see data.ScanPropertiesType#getJawPosition()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_JawPosition();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getScanFormat <em>Scan Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scan Format</em>'.
	 * @see data.ScanPropertiesType#getScanFormat()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_ScanFormat();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getScanComment <em>Scan Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scan Comment</em>'.
	 * @see data.ScanPropertiesType#getScanComment()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_ScanComment();

	/**
	 * Returns the meta object for the attribute list '{@link data.ScanPropertiesType#getScanFileAndLocation <em>Scan File And Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scan File And Location</em>'.
	 * @see data.ScanPropertiesType#getScanFileAndLocation()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EAttribute getScanPropertiesType_ScanFileAndLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link data.ScanPropertiesType#getScanStoredInNoah <em>Scan Stored In Noah</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scan Stored In Noah</em>'.
	 * @see data.ScanPropertiesType#getScanStoredInNoah()
	 * @see #getScanPropertiesType()
	 * @generated
	 */
	EReference getScanPropertiesType_ScanStoredInNoah();

	/**
	 * Returns the meta object for class '{@link data.ScansType <em>Scans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scans Type</em>'.
	 * @see data.ScansType
	 * @generated
	 */
	EClass getScansType();

	/**
	 * Returns the meta object for the containment reference '{@link data.ScansType#getScannerHardware <em>Scanner Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scanner Hardware</em>'.
	 * @see data.ScansType#getScannerHardware()
	 * @see #getScansType()
	 * @generated
	 */
	EReference getScansType_ScannerHardware();

	/**
	 * Returns the meta object for the containment reference '{@link data.ScansType#getScanProperties <em>Scan Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Properties</em>'.
	 * @see data.ScansType#getScanProperties()
	 * @see #getScansType()
	 * @generated
	 */
	EReference getScansType_ScanProperties();

	/**
	 * Returns the meta object for the containment reference '{@link data.ScansType#getScanAnnotations <em>Scan Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Annotations</em>'.
	 * @see data.ScansType#getScanAnnotations()
	 * @see #getScansType()
	 * @generated
	 */
	EReference getScansType_ScanAnnotations();

	/**
	 * Returns the meta object for class '{@link data.StoredInNoahType <em>Stored In Noah Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored In Noah Type</em>'.
	 * @see data.StoredInNoahType
	 * @generated
	 */
	EClass getStoredInNoahType();

	/**
	 * Returns the meta object for the attribute '{@link data.StoredInNoahType#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stored Public Or Private</em>'.
	 * @see data.StoredInNoahType#getStoredPublicOrPrivate()
	 * @see #getStoredInNoahType()
	 * @generated
	 */
	EAttribute getStoredInNoahType_StoredPublicOrPrivate();

	/**
	 * Returns the meta object for the attribute '{@link data.StoredInNoahType#getActionDateTimeStamp <em>Action Date Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Date Time Stamp</em>'.
	 * @see data.StoredInNoahType#getActionDateTimeStamp()
	 * @see #getStoredInNoahType()
	 * @generated
	 */
	EAttribute getStoredInNoahType_ActionDateTimeStamp();

	/**
	 * Returns the meta object for class '{@link data.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see data.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link data.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see data.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link data.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see data.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link data.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see data.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link data.DocumentRoot#getScanMetaDataStandard <em>Scan Meta Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Meta Data Standard</em>'.
	 * @see data.DocumentRoot#getScanMetaDataStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScanMetaDataStandard();

	/**
	 * Returns the meta object for enum '{@link data.EarType <em>Ear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ear Type</em>'.
	 * @see data.EarType
	 * @generated
	 */
	EEnum getEarType();

	/**
	 * Returns the meta object for enum '{@link data.JawPositionType <em>Jaw Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jaw Position Type</em>'.
	 * @see data.JawPositionType
	 * @generated
	 */
	EEnum getJawPositionType();

	/**
	 * Returns the meta object for enum '{@link data.ScanFormatType <em>Scan Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scan Format Type</em>'.
	 * @see data.ScanFormatType
	 * @generated
	 */
	EEnum getScanFormatType();

	/**
	 * Returns the meta object for enum '{@link data.ScannerTypeType <em>Scanner Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scanner Type Type</em>'.
	 * @see data.ScannerTypeType
	 * @generated
	 */
	EEnum getScannerTypeType();

	/**
	 * Returns the meta object for enum '{@link data.StoredPublicOrPrivateType <em>Stored Public Or Private Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stored Public Or Private Type</em>'.
	 * @see data.StoredPublicOrPrivateType
	 * @generated
	 */
	EEnum getStoredPublicOrPrivateType();

	/**
	 * Returns the meta object for data type '<em>Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  Floating Point
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Coordinate Type</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Coordinate_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#float'"
	 * @generated
	 */
	EDataType getCoordinateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Coordinate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coordinate Type Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Coordinate_Type:Object' baseType='Coordinate_Type'"
	 * @generated
	 */
	EDataType getCoordinateTypeObject();

	/**
	 * Returns the meta object for data type '{@link data.EarType <em>Ear Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ear Type Object</em>'.
	 * @see data.EarType
	 * @model instanceClass="data.EarType"
	 *        extendedMetaData="name='Ear_._type:Object' baseType='Ear_._type'"
	 * @generated
	 */
	EDataType getEarTypeObject();

	/**
	 * Returns the meta object for data type '{@link data.JawPositionType <em>Jaw Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jaw Position Type Object</em>'.
	 * @see data.JawPositionType
	 * @model instanceClass="data.JawPositionType"
	 *        extendedMetaData="name='JawPosition_._type:Object' baseType='JawPosition_._type'"
	 * @generated
	 */
	EDataType getJawPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link data.ScanFormatType <em>Scan Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scan Format Type Object</em>'.
	 * @see data.ScanFormatType
	 * @model instanceClass="data.ScanFormatType"
	 *        extendedMetaData="name='ScanFormat_._type:Object' baseType='ScanFormat_._type'"
	 * @generated
	 */
	EDataType getScanFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link data.ScannerTypeType <em>Scanner Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scanner Type Type Object</em>'.
	 * @see data.ScannerTypeType
	 * @model instanceClass="data.ScannerTypeType"
	 *        extendedMetaData="name='ScannerType_._type:Object' baseType='ScannerType_._type'"
	 * @generated
	 */
	EDataType getScannerTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link data.StoredPublicOrPrivateType <em>Stored Public Or Private Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stored Public Or Private Type Object</em>'.
	 * @see data.StoredPublicOrPrivateType
	 * @model instanceClass="data.StoredPublicOrPrivateType"
	 *        extendedMetaData="name='StoredPublicOrPrivate_._type:Object' baseType='StoredPublicOrPrivate_._type'"
	 * @generated
	 */
	EDataType getStoredPublicOrPrivateTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link data.impl.AreaTypeImpl <em>Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.AreaTypeImpl
		 * @see data.impl.DataPackageImpl#getAreaType()
		 * @generated
		 */
		EClass AREA_TYPE = eINSTANCE.getAreaType();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_TYPE__POINTS = eINSTANCE.getAreaType_Points();

		/**
		 * The meta object literal for the '{@link data.impl.AreaType1Impl <em>Area Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.AreaType1Impl
		 * @see data.impl.DataPackageImpl#getAreaType1()
		 * @generated
		 */
		EClass AREA_TYPE1 = eINSTANCE.getAreaType1();

		/**
		 * The meta object literal for the '<em><b>Annotation Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_TYPE1__ANNOTATION_COMMENT = eINSTANCE.getAreaType1_AnnotationComment();

		/**
		 * The meta object literal for the '{@link data.impl.DirectionTypeImpl <em>Direction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DirectionTypeImpl
		 * @see data.impl.DataPackageImpl#getDirectionType()
		 * @generated
		 */
		EClass DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTION_TYPE__POINT = eINSTANCE.getDirectionType_Point();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTION_TYPE__VECTOR = eINSTANCE.getDirectionType_Vector();

		/**
		 * The meta object literal for the '{@link data.impl.DirectionType1Impl <em>Direction Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DirectionType1Impl
		 * @see data.impl.DataPackageImpl#getDirectionType1()
		 * @generated
		 */
		EClass DIRECTION_TYPE1 = eINSTANCE.getDirectionType1();

		/**
		 * The meta object literal for the '<em><b>Annotation Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_TYPE1__ANNOTATION_COMMENT = eINSTANCE.getDirectionType1_AnnotationComment();

		/**
		 * The meta object literal for the '{@link data.impl.PackageTypeImpl <em>Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.PackageTypeImpl
		 * @see data.impl.DataPackageImpl#getPackageType()
		 * @generated
		 */
		EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '<em><b>Package Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__PACKAGE_LOCATION = eINSTANCE.getPackageType_PackageLocation();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__PACKAGE_ID = eINSTANCE.getPackageType_PackageID();

		/**
		 * The meta object literal for the '{@link data.impl.PlaneTypeImpl <em>Plane Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.PlaneTypeImpl
		 * @see data.impl.DataPackageImpl#getPlaneType()
		 * @generated
		 */
		EClass PLANE_TYPE = eINSTANCE.getPlaneType();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE_TYPE__PLANE = eINSTANCE.getPlaneType_Plane();

		/**
		 * The meta object literal for the '{@link data.impl.PlaneType1Impl <em>Plane Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.PlaneType1Impl
		 * @see data.impl.DataPackageImpl#getPlaneType1()
		 * @generated
		 */
		EClass PLANE_TYPE1 = eINSTANCE.getPlaneType1();

		/**
		 * The meta object literal for the '<em><b>Annotation Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE_TYPE1__ANNOTATION_COMMENT = eINSTANCE.getPlaneType1_AnnotationComment();

		/**
		 * The meta object literal for the '{@link data.impl.PointTypeImpl <em>Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.PointTypeImpl
		 * @see data.impl.DataPackageImpl#getPointType()
		 * @generated
		 */
		EClass POINT_TYPE = eINSTANCE.getPointType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__X = eINSTANCE.getPointType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__Y = eINSTANCE.getPointType_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__Z = eINSTANCE.getPointType_Z();

		/**
		 * The meta object literal for the '{@link data.impl.PointType1Impl <em>Point Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.PointType1Impl
		 * @see data.impl.DataPackageImpl#getPointType1()
		 * @generated
		 */
		EClass POINT_TYPE1 = eINSTANCE.getPointType1();

		/**
		 * The meta object literal for the '<em><b>Annotation Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE1__ANNOTATION_COMMENT = eINSTANCE.getPointType1_AnnotationComment();

		/**
		 * The meta object literal for the '{@link data.impl.ScanAnnotations3DTypeImpl <em>Scan Annotations3 DType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ScanAnnotations3DTypeImpl
		 * @see data.impl.DataPackageImpl#getScanAnnotations3DType()
		 * @generated
		 */
		EClass SCAN_ANNOTATIONS3_DTYPE = eINSTANCE.getScanAnnotations3DType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_ANNOTATIONS3_DTYPE__POINT = eINSTANCE.getScanAnnotations3DType_Point();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_ANNOTATIONS3_DTYPE__DIRECTION = eINSTANCE.getScanAnnotations3DType_Direction();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_ANNOTATIONS3_DTYPE__PLANE = eINSTANCE.getScanAnnotations3DType_Plane();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_ANNOTATIONS3_DTYPE__AREA = eINSTANCE.getScanAnnotations3DType_Area();

		/**
		 * The meta object literal for the '{@link data.impl.ScanMetaDataStandardTypeImpl <em>Scan Meta Data Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ScanMetaDataStandardTypeImpl
		 * @see data.impl.DataPackageImpl#getScanMetaDataStandardType()
		 * @generated
		 */
		EClass SCAN_META_DATA_STANDARD_TYPE = eINSTANCE.getScanMetaDataStandardType();

		/**
		 * The meta object literal for the '<em><b>Scan Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE = eINSTANCE.getScanMetaDataStandardType_ScanPackage();

		/**
		 * The meta object literal for the '<em><b>Scans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_META_DATA_STANDARD_TYPE__SCANS = eINSTANCE.getScanMetaDataStandardType_Scans();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_META_DATA_STANDARD_TYPE__VERSION = eINSTANCE.getScanMetaDataStandardType_Version();

		/**
		 * The meta object literal for the '{@link data.impl.ScannerHardwareTypeImpl <em>Scanner Hardware Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ScannerHardwareTypeImpl
		 * @see data.impl.DataPackageImpl#getScannerHardwareType()
		 * @generated
		 */
		EClass SCANNER_HARDWARE_TYPE = eINSTANCE.getScannerHardwareType();

		/**
		 * The meta object literal for the '<em><b>Scanner Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER = eINSTANCE.getScannerHardwareType_ScannerProvider();

		/**
		 * The meta object literal for the '<em><b>Scanner Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANNER_HARDWARE_TYPE__SCANNER_MODEL = eINSTANCE.getScannerHardwareType_ScannerModel();

		/**
		 * The meta object literal for the '<em><b>Scanner Firmware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE = eINSTANCE.getScannerHardwareType_ScannerFirmware();

		/**
		 * The meta object literal for the '<em><b>Scanner Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANNER_HARDWARE_TYPE__SCANNER_TYPE = eINSTANCE.getScannerHardwareType_ScannerType();

		/**
		 * The meta object literal for the '<em><b>Unique Scanner ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID = eINSTANCE.getScannerHardwareType_UniqueScannerID();

		/**
		 * The meta object literal for the '{@link data.impl.ScanPropertiesTypeImpl <em>Scan Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ScanPropertiesTypeImpl
		 * @see data.impl.DataPackageImpl#getScanPropertiesType()
		 * @generated
		 */
		EClass SCAN_PROPERTIES_TYPE = eINSTANCE.getScanPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__GROUP = eINSTANCE.getScanPropertiesType_Group();

		/**
		 * The meta object literal for the '<em><b>Scan Time Stamp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP = eINSTANCE.getScanPropertiesType_ScanTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Ear</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__EAR = eINSTANCE.getScanPropertiesType_Ear();

		/**
		 * The meta object literal for the '<em><b>Jaw Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__JAW_POSITION = eINSTANCE.getScanPropertiesType_JawPosition();

		/**
		 * The meta object literal for the '<em><b>Scan Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__SCAN_FORMAT = eINSTANCE.getScanPropertiesType_ScanFormat();

		/**
		 * The meta object literal for the '<em><b>Scan Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__SCAN_COMMENT = eINSTANCE.getScanPropertiesType_ScanComment();

		/**
		 * The meta object literal for the '<em><b>Scan File And Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION = eINSTANCE.getScanPropertiesType_ScanFileAndLocation();

		/**
		 * The meta object literal for the '<em><b>Scan Stored In Noah</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH = eINSTANCE.getScanPropertiesType_ScanStoredInNoah();

		/**
		 * The meta object literal for the '{@link data.impl.ScansTypeImpl <em>Scans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.ScansTypeImpl
		 * @see data.impl.DataPackageImpl#getScansType()
		 * @generated
		 */
		EClass SCANS_TYPE = eINSTANCE.getScansType();

		/**
		 * The meta object literal for the '<em><b>Scanner Hardware</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCANS_TYPE__SCANNER_HARDWARE = eINSTANCE.getScansType_ScannerHardware();

		/**
		 * The meta object literal for the '<em><b>Scan Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCANS_TYPE__SCAN_PROPERTIES = eINSTANCE.getScansType_ScanProperties();

		/**
		 * The meta object literal for the '<em><b>Scan Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCANS_TYPE__SCAN_ANNOTATIONS = eINSTANCE.getScansType_ScanAnnotations();

		/**
		 * The meta object literal for the '{@link data.impl.StoredInNoahTypeImpl <em>Stored In Noah Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.StoredInNoahTypeImpl
		 * @see data.impl.DataPackageImpl#getStoredInNoahType()
		 * @generated
		 */
		EClass STORED_IN_NOAH_TYPE = eINSTANCE.getStoredInNoahType();

		/**
		 * The meta object literal for the '<em><b>Stored Public Or Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE = eINSTANCE.getStoredInNoahType_StoredPublicOrPrivate();

		/**
		 * The meta object literal for the '<em><b>Action Date Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP = eINSTANCE.getStoredInNoahType_ActionDateTimeStamp();

		/**
		 * The meta object literal for the '{@link data.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DocumentRootImpl
		 * @see data.impl.DataPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Scan Meta Data Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCAN_META_DATA_STANDARD = eINSTANCE.getDocumentRoot_ScanMetaDataStandard();

		/**
		 * The meta object literal for the '{@link data.EarType <em>Ear Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.EarType
		 * @see data.impl.DataPackageImpl#getEarType()
		 * @generated
		 */
		EEnum EAR_TYPE = eINSTANCE.getEarType();

		/**
		 * The meta object literal for the '{@link data.JawPositionType <em>Jaw Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.JawPositionType
		 * @see data.impl.DataPackageImpl#getJawPositionType()
		 * @generated
		 */
		EEnum JAW_POSITION_TYPE = eINSTANCE.getJawPositionType();

		/**
		 * The meta object literal for the '{@link data.ScanFormatType <em>Scan Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.ScanFormatType
		 * @see data.impl.DataPackageImpl#getScanFormatType()
		 * @generated
		 */
		EEnum SCAN_FORMAT_TYPE = eINSTANCE.getScanFormatType();

		/**
		 * The meta object literal for the '{@link data.ScannerTypeType <em>Scanner Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.ScannerTypeType
		 * @see data.impl.DataPackageImpl#getScannerTypeType()
		 * @generated
		 */
		EEnum SCANNER_TYPE_TYPE = eINSTANCE.getScannerTypeType();

		/**
		 * The meta object literal for the '{@link data.StoredPublicOrPrivateType <em>Stored Public Or Private Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.StoredPublicOrPrivateType
		 * @see data.impl.DataPackageImpl#getStoredPublicOrPrivateType()
		 * @generated
		 */
		EEnum STORED_PUBLIC_OR_PRIVATE_TYPE = eINSTANCE.getStoredPublicOrPrivateType();

		/**
		 * The meta object literal for the '<em>Coordinate Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.impl.DataPackageImpl#getCoordinateType()
		 * @generated
		 */
		EDataType COORDINATE_TYPE = eINSTANCE.getCoordinateType();

		/**
		 * The meta object literal for the '<em>Coordinate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see data.impl.DataPackageImpl#getCoordinateTypeObject()
		 * @generated
		 */
		EDataType COORDINATE_TYPE_OBJECT = eINSTANCE.getCoordinateTypeObject();

		/**
		 * The meta object literal for the '<em>Ear Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.EarType
		 * @see data.impl.DataPackageImpl#getEarTypeObject()
		 * @generated
		 */
		EDataType EAR_TYPE_OBJECT = eINSTANCE.getEarTypeObject();

		/**
		 * The meta object literal for the '<em>Jaw Position Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.JawPositionType
		 * @see data.impl.DataPackageImpl#getJawPositionTypeObject()
		 * @generated
		 */
		EDataType JAW_POSITION_TYPE_OBJECT = eINSTANCE.getJawPositionTypeObject();

		/**
		 * The meta object literal for the '<em>Scan Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.ScanFormatType
		 * @see data.impl.DataPackageImpl#getScanFormatTypeObject()
		 * @generated
		 */
		EDataType SCAN_FORMAT_TYPE_OBJECT = eINSTANCE.getScanFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Scanner Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.ScannerTypeType
		 * @see data.impl.DataPackageImpl#getScannerTypeTypeObject()
		 * @generated
		 */
		EDataType SCANNER_TYPE_TYPE_OBJECT = eINSTANCE.getScannerTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Stored Public Or Private Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.StoredPublicOrPrivateType
		 * @see data.impl.DataPackageImpl#getStoredPublicOrPrivateTypeObject()
		 * @generated
		 */
		EDataType STORED_PUBLIC_OR_PRIVATE_TYPE_OBJECT = eINSTANCE.getStoredPublicOrPrivateTypeObject();

	}

} //DataPackage
