/*
 */
package remotecontrol;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Control Selection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getReserved <em>Reserved</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link remotecontrol.RemoteControlSelectionType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType()
 * @model extendedMetaData="name='RemoteControlSelection_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RemoteControlSelectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instrument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Instrument Type Name is defined by the manufacturer as a string value and not a publicly shared value across all HIMSA Manufacturers.  A typical entry would be a model name of the Remote Control
	 * 
	 * ## TypeName ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instrument Type Name</em>' attribute.
	 * @see #setInstrumentTypeName(String)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_InstrumentTypeName()
	 * @model dataType="remotecontrol.InstrumentTypeNameType"
	 *        extendedMetaData="kind='element' name='InstrumentTypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstrumentTypeName();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument Type Name</em>' attribute.
	 * @see #getInstrumentTypeName()
	 * @generated
	 */
	void setInstrumentTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The serial number of the remote control
	 * ## SerialNo ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_SerialNumber()
	 * @model dataType="remotecontrol.SerialNumberType"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Battery Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * ## TBatteryType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Type</em>' containment reference.
	 * @see #setBatteryType(BatteryType)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_BatteryType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BatteryType' namespace='##targetNamespace'"
	 * @generated
	 */
	BatteryType getBatteryType();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getBatteryType <em>Battery Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Type</em>' containment reference.
	 * @see #getBatteryType()
	 * @generated
	 */
	void setBatteryType(BatteryType value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do not use this element to store data.  This element was originally defined in format 100 and not clearly defined.  HIMSA will translate any format 100 values to format 500 but does not allow any data storage for formats 500+
	 * 
	 * ## Reserved ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_Reserved()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>Private Selection Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIMSA does not support using this element for storage in format 500+
	 * 
	 * In the past it was allowed by HIMSA to save privately formatted data in the unused section of the public storage area of a NOAH action.  This usage was used mainly because more space was allocated for public storage versus private.  At present this is no longer an issue as equal storage is allocated to both public and private data storage.
	 * 
	 * This elements primary function is to pass along any private data stored in the public area as base64 encoded data.  NOAH is not performing any translation or conversion of data.
	 * 
	 * The data will be upconverted from format 100 to format 500
	 * 
	 * This data will never be converted back to an earlier version of a Remote Control Selection data standard.  For example, if an remote control selection action format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the data (causing a conversion down to format 100) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Selection Data</em>' attribute.
	 * @see #setPrivateSelectionData(byte[])
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_PrivateSelectionData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateSelectionData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateSelectionData();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Selection Data</em>' attribute.
	 * @see #getPrivateSelectionData()
	 * @generated
	 */
	void setPrivateSelectionData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software saving data formatted via this XSD file should not use this element for storage.  The intention is for Noah data convertors to fill in an appropriate value for runtime conversions - not permanent storage.
	 * 
	 * Please note that values less than 500 mean that the data was originally stored in a format which was not validated by Noah before storage.  This could mean that the data will not validated against this version
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_ConvertedFromDataStandard()
	 * @model dataType="remotecontrol.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 */
	void setConvertedFromDataStandard(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is no longer in use.  The original intention was for Noah to fill in the value but the idea was never fully implemented and not needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @generated
	 */
	void setValidatedByNOAH(boolean value);

	/**
	 * Unsets the value of the '{@link remotecontrol.RemoteControlSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link remotecontrol.RemoteControlSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validated By NOAH</em>' attribute is set.
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	boolean isSetValidatedByNOAH();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see remotecontrol.RemotecontrolPackage#getRemoteControlSelectionType_Version()
	 * @model default="500" unsettable="true" dataType="remotecontrol.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link remotecontrol.RemoteControlSelectionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link remotecontrol.RemoteControlSelectionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link remotecontrol.RemoteControlSelectionType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // RemoteControlSelectionType
