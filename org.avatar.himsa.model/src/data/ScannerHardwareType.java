/*
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner Hardware Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.ScannerHardwareType#getScannerProvider <em>Scanner Provider</em>}</li>
 *   <li>{@link data.ScannerHardwareType#getScannerModel <em>Scanner Model</em>}</li>
 *   <li>{@link data.ScannerHardwareType#getScannerFirmware <em>Scanner Firmware</em>}</li>
 *   <li>{@link data.ScannerHardwareType#getScannerType <em>Scanner Type</em>}</li>
 *   <li>{@link data.ScannerHardwareType#getUniqueScannerID <em>Unique Scanner ID</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getScannerHardwareType()
 * @model extendedMetaData="name='ScannerHardware_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScannerHardwareType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scanner Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the company which manufactured or distributes the scanning device 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scanner Provider</em>' attribute.
	 * @see #setScannerProvider(String)
	 * @see data.DataPackage#getScannerHardwareType_ScannerProvider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ScannerProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScannerProvider();

	/**
	 * Sets the value of the '{@link data.ScannerHardwareType#getScannerProvider <em>Scanner Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner Provider</em>' attribute.
	 * @see #getScannerProvider()
	 * @generated
	 */
	void setScannerProvider(String value);

	/**
	 * Returns the value of the '<em><b>Scanner Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model name of the scanning device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scanner Model</em>' attribute.
	 * @see #setScannerModel(String)
	 * @see data.DataPackage#getScannerHardwareType_ScannerModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ScannerModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScannerModel();

	/**
	 * Sets the value of the '{@link data.ScannerHardwareType#getScannerModel <em>Scanner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner Model</em>' attribute.
	 * @see #getScannerModel()
	 * @generated
	 */
	void setScannerModel(String value);

	/**
	 * Returns the value of the '<em><b>Scanner Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The firmware version of the scanner.  
	 * 
	 * The firmware version would typically only be needed by the scan solution provider for troubleshooting purposes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scanner Firmware</em>' attribute.
	 * @see #setScannerFirmware(String)
	 * @see data.DataPackage#getScannerHardwareType_ScannerFirmware()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ScannerFirmware' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScannerFirmware();

	/**
	 * Sets the value of the '{@link data.ScannerHardwareType#getScannerFirmware <em>Scanner Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner Firmware</em>' attribute.
	 * @see #getScannerFirmware()
	 * @generated
	 */
	void setScannerFirmware(String value);

	/**
	 * Returns the value of the '<em><b>Scanner Type</b></em>' attribute.
	 * The literals are from the enumeration {@link data.ScannerTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of Scanner, impression or intra aural scanner
	 * 
	 * + Impression
	 * + IntraAural
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scanner Type</em>' attribute.
	 * @see data.ScannerTypeType
	 * @see #isSetScannerType()
	 * @see #unsetScannerType()
	 * @see #setScannerType(ScannerTypeType)
	 * @see data.DataPackage#getScannerHardwareType_ScannerType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ScannerType' namespace='##targetNamespace'"
	 * @generated
	 */
	ScannerTypeType getScannerType();

	/**
	 * Sets the value of the '{@link data.ScannerHardwareType#getScannerType <em>Scanner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner Type</em>' attribute.
	 * @see data.ScannerTypeType
	 * @see #isSetScannerType()
	 * @see #unsetScannerType()
	 * @see #getScannerType()
	 * @generated
	 */
	void setScannerType(ScannerTypeType value);

	/**
	 * Unsets the value of the '{@link data.ScannerHardwareType#getScannerType <em>Scanner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScannerType()
	 * @see #getScannerType()
	 * @see #setScannerType(ScannerTypeType)
	 * @generated
	 */
	void unsetScannerType();

	/**
	 * Returns whether the value of the '{@link data.ScannerHardwareType#getScannerType <em>Scanner Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scanner Type</em>' attribute is set.
	 * @see #unsetScannerType()
	 * @see #getScannerType()
	 * @see #setScannerType(ScannerTypeType)
	 * @generated
	 */
	boolean isSetScannerType();

	/**
	 * Returns the value of the '<em><b>Unique Scanner ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A serial number or other unique ID of the scanning device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Scanner ID</em>' attribute.
	 * @see #setUniqueScannerID(String)
	 * @see data.DataPackage#getScannerHardwareType_UniqueScannerID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='UniqueScannerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUniqueScannerID();

	/**
	 * Sets the value of the '{@link data.ScannerHardwareType#getUniqueScannerID <em>Unique Scanner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Scanner ID</em>' attribute.
	 * @see #getUniqueScannerID()
	 * @generated
	 */
	void setUniqueScannerID(String value);

} // ScannerHardwareType
