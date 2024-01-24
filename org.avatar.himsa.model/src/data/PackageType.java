/*
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides information on the package which will include 1 to many files.  The package will contain Scan specific data but may also contain any type of file
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.PackageType#getPackageLocation <em>Package Location</em>}</li>
 *   <li>{@link data.PackageType#getPackageID <em>Package ID</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getPackageType()
 * @model extendedMetaData="name='Package_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PackageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A computer name or network address which may include the specific file name of the package file
	 * Legal Examples:
	 * •	https://www.scanprovider.com
	 * •	https://www.scanprovider.com/1234567AAA.zip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Location</em>' attribute.
	 * @see #setPackageLocation(String)
	 * @see data.DataPackage#getPackageType_PackageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='PackageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackageLocation();

	/**
	 * Sets the value of the '{@link data.PackageType#getPackageLocation <em>Package Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Location</em>' attribute.
	 * @see #getPackageLocation()
	 * @generated
	 */
	void setPackageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ID created by the scan solution provider.  The ID is used to reference the correct package.
	 * 
	 * In most cases it is assumed that the PackageID is present but it is not declared as mandatory. If the package location contains an actual file name then the ID may not be necessary
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package ID</em>' attribute.
	 * @see #setPackageID(String)
	 * @see data.DataPackage#getPackageType_PackageID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PackageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackageID();

	/**
	 * Sets the value of the '{@link data.PackageType#getPackageID <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package ID</em>' attribute.
	 * @see #getPackageID()
	 * @generated
	 */
	void setPackageID(String value);

} // PackageType
