/*
 */
package com.himsa.scan.scan.meta.data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scans Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScansType#getScannerHardware <em>Scanner Hardware</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScansType#getScanProperties <em>Scan Properties</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScansType#getScanAnnotations <em>Scan Annotations</em>}</li>
 * </ul>
 *
 * @see com.himsa.scan.scan.meta.data.DataPackage#getScansType()
 * @model extendedMetaData="name='Scans_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScansType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scanner Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In most cases, when there is more then one scan, the scanner hardware will be the same.  However, it is technically possible that scans could come from multiple scanners.  To ensure that no assumptions are made each scan must have an assoiciated Scanner Hardware Element populated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scanner Hardware</em>' containment reference.
	 * @see #setScannerHardware(ScannerHardwareType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScansType_ScannerHardware()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ScannerHardware' namespace='##targetNamespace'"
	 * @generated
	 */
	ScannerHardwareType getScannerHardware();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.ScansType#getScannerHardware <em>Scanner Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scanner Hardware</em>' containment reference.
	 * @see #getScannerHardware()
	 * @generated
	 */
	void setScannerHardware(ScannerHardwareType value);

	/**
	 * Returns the value of the '<em><b>Scan Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Properties</em>' containment reference.
	 * @see #setScanProperties(ScanPropertiesType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScansType_ScanProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ScanProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ScanPropertiesType getScanProperties();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.ScansType#getScanProperties <em>Scan Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Properties</em>' containment reference.
	 * @see #getScanProperties()
	 * @generated
	 */
	void setScanProperties(ScanPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Scan Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information for a scan.   The annotations provide additional information to a 3D object not to a picture of a scan.   
	 * 
	 * Q: How do the 3D Scan Annotations apply or relate to the annotations defined in the HPS scan format annotations?
	 * 
	 * A: HPS uses annotations defined in 2D vs 3D.  If HIMSA Meta Scan Standard Annotations and HPS scan format annotations happen to both be present for a specific scan then the HIMSA Meta Scan Standard annotations will override the HPS annotations.  
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Annotations</em>' containment reference.
	 * @see #setScanAnnotations(ScanAnnotations3DType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScansType_ScanAnnotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScanAnnotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ScanAnnotations3DType getScanAnnotations();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.ScansType#getScanAnnotations <em>Scan Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Annotations</em>' containment reference.
	 * @see #getScanAnnotations()
	 * @generated
	 */
	void setScanAnnotations(ScanAnnotations3DType value);

} // ScansType
