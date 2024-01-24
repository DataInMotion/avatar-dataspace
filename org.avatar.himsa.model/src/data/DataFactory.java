/*
 */
package data;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.DataPackage
 * @generated
 */
@ProviderType
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Type</em>'.
	 * @generated
	 */
	AreaType createAreaType();

	/**
	 * Returns a new object of class '<em>Area Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Type1</em>'.
	 * @generated
	 */
	AreaType1 createAreaType1();

	/**
	 * Returns a new object of class '<em>Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction Type</em>'.
	 * @generated
	 */
	DirectionType createDirectionType();

	/**
	 * Returns a new object of class '<em>Direction Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction Type1</em>'.
	 * @generated
	 */
	DirectionType1 createDirectionType1();

	/**
	 * Returns a new object of class '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Type</em>'.
	 * @generated
	 */
	PackageType createPackageType();

	/**
	 * Returns a new object of class '<em>Plane Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plane Type</em>'.
	 * @generated
	 */
	PlaneType createPlaneType();

	/**
	 * Returns a new object of class '<em>Plane Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plane Type1</em>'.
	 * @generated
	 */
	PlaneType1 createPlaneType1();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Point Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type1</em>'.
	 * @generated
	 */
	PointType1 createPointType1();

	/**
	 * Returns a new object of class '<em>Scan Annotations3 DType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Annotations3 DType</em>'.
	 * @generated
	 */
	ScanAnnotations3DType createScanAnnotations3DType();

	/**
	 * Returns a new object of class '<em>Scan Meta Data Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Meta Data Standard Type</em>'.
	 * @generated
	 */
	ScanMetaDataStandardType createScanMetaDataStandardType();

	/**
	 * Returns a new object of class '<em>Scanner Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanner Hardware Type</em>'.
	 * @generated
	 */
	ScannerHardwareType createScannerHardwareType();

	/**
	 * Returns a new object of class '<em>Scan Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Properties Type</em>'.
	 * @generated
	 */
	ScanPropertiesType createScanPropertiesType();

	/**
	 * Returns a new object of class '<em>Scans Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scans Type</em>'.
	 * @generated
	 */
	ScansType createScansType();

	/**
	 * Returns a new object of class '<em>Stored In Noah Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stored In Noah Type</em>'.
	 * @generated
	 */
	StoredInNoahType createStoredInNoahType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
