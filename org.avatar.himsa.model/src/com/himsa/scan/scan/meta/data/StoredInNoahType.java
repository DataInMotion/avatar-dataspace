/*
 */
package com.himsa.scan.scan.meta.data;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored In Noah Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getActionDateTimeStamp <em>Action Date Time Stamp</em>}</li>
 * </ul>
 *
 * @see com.himsa.scan.scan.meta.data.DataPackage#getStoredInNoahType()
 * @model extendedMetaData="name='StoredInNoah_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StoredInNoahType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stored Public Or Private</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.scan.scan.meta.data.StoredPublicOrPrivateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * + Public
	 * + Private
	 * 
	 * When data (in this case a scan) is stored in Noah the data is attached to an action as either public data or private data.  If attached as public data then the data should be ready to be used with nor further restrictions.
	 * 
	 * The data types defined for ear scans are EarScan_L and EarScan_R (“L=left, R=Right).  The STL or HPS formatted file would be saved in an action where the appropriate data type is set.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stored Public Or Private</em>' attribute.
	 * @see com.himsa.scan.scan.meta.data.StoredPublicOrPrivateType
	 * @see #isSetStoredPublicOrPrivate()
	 * @see #unsetStoredPublicOrPrivate()
	 * @see #setStoredPublicOrPrivate(StoredPublicOrPrivateType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getStoredInNoahType_StoredPublicOrPrivate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StoredPublicOrPrivate' namespace='##targetNamespace'"
	 * @generated
	 */
	StoredPublicOrPrivateType getStoredPublicOrPrivate();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored Public Or Private</em>' attribute.
	 * @see com.himsa.scan.scan.meta.data.StoredPublicOrPrivateType
	 * @see #isSetStoredPublicOrPrivate()
	 * @see #unsetStoredPublicOrPrivate()
	 * @see #getStoredPublicOrPrivate()
	 * @generated
	 */
	void setStoredPublicOrPrivate(StoredPublicOrPrivateType value);

	/**
	 * Unsets the value of the '{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStoredPublicOrPrivate()
	 * @see #getStoredPublicOrPrivate()
	 * @see #setStoredPublicOrPrivate(StoredPublicOrPrivateType)
	 * @generated
	 */
	void unsetStoredPublicOrPrivate();

	/**
	 * Returns whether the value of the '{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stored Public Or Private</em>' attribute is set.
	 * @see #unsetStoredPublicOrPrivate()
	 * @see #getStoredPublicOrPrivate()
	 * @see #setStoredPublicOrPrivate(StoredPublicOrPrivateType)
	 * @generated
	 */
	boolean isSetStoredPublicOrPrivate();

	/**
	 * Returns the value of the '<em><b>Action Date Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is set so that any Noah compatible application can find the appropriate scan by looking through the patient’s session list looking for an appropriate ear scan action that has the recorded date/timestamp.  Use of Noah referenced actions must not be used.
	 * 
	 * Q: Noah compatible applications usually would set references between actions to indicate what actions belong together.  Why is this not used?
	 * 
	 * A: In theory it would be possible to save an EarScan_R and and EarScan_L action to Noah.  Then after saving an action using the ScanMetaData Standard public data it would be possible to reference the ScanMetaData Standard action to the EarScan_R and EarScan_L.
	 * 
	 * However, the ScanMetaData standard provides for including Meta data for potentially many different scans for the same ear (e.g. Jaw Position). If references where used there would be potentially many multiple actions being referenced but with now clear way to figure out what is the correct matching (e.g. what EarScan_R action is the correct scan for the Open vs. Closed jaw position).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Date Time Stamp</em>' attribute.
	 * @see #setActionDateTimeStamp(XMLGregorianCalendar)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getStoredInNoahType_ActionDateTimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='ActionDateTimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActionDateTimeStamp();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.StoredInNoahType#getActionDateTimeStamp <em>Action Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Date Time Stamp</em>' attribute.
	 * @see #getActionDateTimeStamp()
	 * @generated
	 */
	void setActionDateTimeStamp(XMLGregorianCalendar value);

} // StoredInNoahType
