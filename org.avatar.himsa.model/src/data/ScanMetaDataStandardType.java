/*
 */
package data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scan Meta Data Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.ScanMetaDataStandardType#getScanPackage <em>Scan Package</em>}</li>
 *   <li>{@link data.ScanMetaDataStandardType#getScans <em>Scans</em>}</li>
 *   <li>{@link data.ScanMetaDataStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getScanMetaDataStandardType()
 * @model extendedMetaData="name='ScanMetaDataStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScanMetaDataStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scan Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Scan Package must only contains scans for 1 unique order for patient. Creating a (1) package which contains scans for multiple orders or patients will be confusing for readers of data (e.g. a hearing instrument manufacturer).
	 * 
	 * The Scan Package is a collection of individual scans (e.g. 3D scan files) as well as XML files, formatted via this standard, which provide Meta data about the scans.  The package that contains the XML and scan files may also contain other types of files (e.g. picture files) but other types of files are not defined with this Meta data standard.
	 * 
	 * The use of a Scan Package is optional as it may not always make sense to use it.  A good example of not using the Scan Package would be if scan data is saved in Noah as a scan action.  In this case each scan is defined to be stored as a separate action.  Further actions in Noah are “packaged” by using the ability to an action grouping or reference feature.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Package</em>' containment reference.
	 * @see #setScanPackage(PackageType)
	 * @see data.DataPackage#getScanMetaDataStandardType_ScanPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScanPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageType getScanPackage();

	/**
	 * Sets the value of the '{@link data.ScanMetaDataStandardType#getScanPackage <em>Scan Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Package</em>' containment reference.
	 * @see #getScanPackage()
	 * @generated
	 */
	void setScanPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Scans</b></em>' containment reference list.
	 * The list contents are of type {@link data.ScansType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scans</em>' containment reference list.
	 * @see data.DataPackage#getScanMetaDataStandardType_Scans()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Scans' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScansType> getScans();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version number of the Scanning Solutions Standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see data.DataPackage#getScanMetaDataStandardType_Version()
	 * @model default="500" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link data.ScanMetaDataStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link data.ScanMetaDataStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link data.ScanMetaDataStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // ScanMetaDataStandardType
