/**
 */
package data.impl;

import data.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataPackage.AREA_TYPE: return createAreaType();
			case DataPackage.AREA_TYPE1: return createAreaType1();
			case DataPackage.DIRECTION_TYPE: return createDirectionType();
			case DataPackage.DIRECTION_TYPE1: return createDirectionType1();
			case DataPackage.PACKAGE_TYPE: return createPackageType();
			case DataPackage.PLANE_TYPE: return createPlaneType();
			case DataPackage.PLANE_TYPE1: return createPlaneType1();
			case DataPackage.POINT_TYPE: return createPointType();
			case DataPackage.POINT_TYPE1: return createPointType1();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE: return createScanAnnotations3DType();
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE: return createScanMetaDataStandardType();
			case DataPackage.SCANNER_HARDWARE_TYPE: return createScannerHardwareType();
			case DataPackage.SCAN_PROPERTIES_TYPE: return createScanPropertiesType();
			case DataPackage.SCANS_TYPE: return createScansType();
			case DataPackage.STORED_IN_NOAH_TYPE: return createStoredInNoahType();
			case DataPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataPackage.EAR_TYPE:
				return createEarTypeFromString(eDataType, initialValue);
			case DataPackage.JAW_POSITION_TYPE:
				return createJawPositionTypeFromString(eDataType, initialValue);
			case DataPackage.SCAN_FORMAT_TYPE:
				return createScanFormatTypeFromString(eDataType, initialValue);
			case DataPackage.SCANNER_TYPE_TYPE:
				return createScannerTypeTypeFromString(eDataType, initialValue);
			case DataPackage.STORED_PUBLIC_OR_PRIVATE_TYPE:
				return createStoredPublicOrPrivateTypeFromString(eDataType, initialValue);
			case DataPackage.COORDINATE_TYPE:
				return createCoordinateTypeFromString(eDataType, initialValue);
			case DataPackage.COORDINATE_TYPE_OBJECT:
				return createCoordinateTypeObjectFromString(eDataType, initialValue);
			case DataPackage.EAR_TYPE_OBJECT:
				return createEarTypeObjectFromString(eDataType, initialValue);
			case DataPackage.JAW_POSITION_TYPE_OBJECT:
				return createJawPositionTypeObjectFromString(eDataType, initialValue);
			case DataPackage.SCAN_FORMAT_TYPE_OBJECT:
				return createScanFormatTypeObjectFromString(eDataType, initialValue);
			case DataPackage.SCANNER_TYPE_TYPE_OBJECT:
				return createScannerTypeTypeObjectFromString(eDataType, initialValue);
			case DataPackage.STORED_PUBLIC_OR_PRIVATE_TYPE_OBJECT:
				return createStoredPublicOrPrivateTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataPackage.EAR_TYPE:
				return convertEarTypeToString(eDataType, instanceValue);
			case DataPackage.JAW_POSITION_TYPE:
				return convertJawPositionTypeToString(eDataType, instanceValue);
			case DataPackage.SCAN_FORMAT_TYPE:
				return convertScanFormatTypeToString(eDataType, instanceValue);
			case DataPackage.SCANNER_TYPE_TYPE:
				return convertScannerTypeTypeToString(eDataType, instanceValue);
			case DataPackage.STORED_PUBLIC_OR_PRIVATE_TYPE:
				return convertStoredPublicOrPrivateTypeToString(eDataType, instanceValue);
			case DataPackage.COORDINATE_TYPE:
				return convertCoordinateTypeToString(eDataType, instanceValue);
			case DataPackage.COORDINATE_TYPE_OBJECT:
				return convertCoordinateTypeObjectToString(eDataType, instanceValue);
			case DataPackage.EAR_TYPE_OBJECT:
				return convertEarTypeObjectToString(eDataType, instanceValue);
			case DataPackage.JAW_POSITION_TYPE_OBJECT:
				return convertJawPositionTypeObjectToString(eDataType, instanceValue);
			case DataPackage.SCAN_FORMAT_TYPE_OBJECT:
				return convertScanFormatTypeObjectToString(eDataType, instanceValue);
			case DataPackage.SCANNER_TYPE_TYPE_OBJECT:
				return convertScannerTypeTypeObjectToString(eDataType, instanceValue);
			case DataPackage.STORED_PUBLIC_OR_PRIVATE_TYPE_OBJECT:
				return convertStoredPublicOrPrivateTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType1 createAreaType1() {
		AreaType1Impl areaType1 = new AreaType1Impl();
		return areaType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType createDirectionType() {
		DirectionTypeImpl directionType = new DirectionTypeImpl();
		return directionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType1 createDirectionType1() {
		DirectionType1Impl directionType1 = new DirectionType1Impl();
		return directionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaneType createPlaneType() {
		PlaneTypeImpl planeType = new PlaneTypeImpl();
		return planeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaneType1 createPlaneType1() {
		PlaneType1Impl planeType1 = new PlaneType1Impl();
		return planeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType1 createPointType1() {
		PointType1Impl pointType1 = new PointType1Impl();
		return pointType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanAnnotations3DType createScanAnnotations3DType() {
		ScanAnnotations3DTypeImpl scanAnnotations3DType = new ScanAnnotations3DTypeImpl();
		return scanAnnotations3DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanMetaDataStandardType createScanMetaDataStandardType() {
		ScanMetaDataStandardTypeImpl scanMetaDataStandardType = new ScanMetaDataStandardTypeImpl();
		return scanMetaDataStandardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScannerHardwareType createScannerHardwareType() {
		ScannerHardwareTypeImpl scannerHardwareType = new ScannerHardwareTypeImpl();
		return scannerHardwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanPropertiesType createScanPropertiesType() {
		ScanPropertiesTypeImpl scanPropertiesType = new ScanPropertiesTypeImpl();
		return scanPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScansType createScansType() {
		ScansTypeImpl scansType = new ScansTypeImpl();
		return scansType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredInNoahType createStoredInNoahType() {
		StoredInNoahTypeImpl storedInNoahType = new StoredInNoahTypeImpl();
		return storedInNoahType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarType createEarTypeFromString(EDataType eDataType, String initialValue) {
		EarType result = EarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JawPositionType createJawPositionTypeFromString(EDataType eDataType, String initialValue) {
		JawPositionType result = JawPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJawPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanFormatType createScanFormatTypeFromString(EDataType eDataType, String initialValue) {
		ScanFormatType result = ScanFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScanFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScannerTypeType createScannerTypeTypeFromString(EDataType eDataType, String initialValue) {
		ScannerTypeType result = ScannerTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScannerTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredPublicOrPrivateType createStoredPublicOrPrivateTypeFromString(EDataType eDataType, String initialValue) {
		StoredPublicOrPrivateType result = StoredPublicOrPrivateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoredPublicOrPrivateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCoordinateTypeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinateTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCoordinateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCoordinateTypeFromString(DataPackage.Literals.COORDINATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCoordinateTypeToString(DataPackage.Literals.COORDINATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarType createEarTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEarTypeFromString(DataPackage.Literals.EAR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEarTypeToString(DataPackage.Literals.EAR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JawPositionType createJawPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createJawPositionTypeFromString(DataPackage.Literals.JAW_POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJawPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJawPositionTypeToString(DataPackage.Literals.JAW_POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanFormatType createScanFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScanFormatTypeFromString(DataPackage.Literals.SCAN_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScanFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScanFormatTypeToString(DataPackage.Literals.SCAN_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScannerTypeType createScannerTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScannerTypeTypeFromString(DataPackage.Literals.SCANNER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScannerTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScannerTypeTypeToString(DataPackage.Literals.SCANNER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredPublicOrPrivateType createStoredPublicOrPrivateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStoredPublicOrPrivateTypeFromString(DataPackage.Literals.STORED_PUBLIC_OR_PRIVATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoredPublicOrPrivateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStoredPublicOrPrivateTypeToString(DataPackage.Literals.STORED_PUBLIC_OR_PRIVATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
