/*
 */
package com.himsa.instrument.selection;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Instrument Selection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getDeviceCategory <em>Device Category</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVentType <em>Vent Type</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldForm <em>Ear Mold Form</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldText <em>Ear Mold Text</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSoundCanalType <em>Sound Canal Type</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType()
 * @model extendedMetaData="name='HearingInstrumentSelection_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HearingInstrumentSelectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instrument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Instrument Type Name is defined by the manufacturer as a string value and not a publicly shared value across all HIMSA Manufacturers.  A typical entry would be a model name of the instrument
	 * 
	 * ## TypeName ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instrument Type Name</em>' attribute.
	 * @see #setInstrumentTypeName(String)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_InstrumentTypeName()
	 * @model dataType="com.himsa.instrument.selection.InstrumentTypeNameType"
	 *        extendedMetaData="kind='element' name='InstrumentTypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstrumentTypeName();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument Type Name</em>' attribute.
	 * @see #getInstrumentTypeName()
	 * @generated
	 */
	void setInstrumentTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Device Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## TDeviceCategory ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Category</em>' containment reference.
	 * @see #setDeviceCategory(DeviceCategoryType)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_DeviceCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceCategoryType getDeviceCategory();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getDeviceCategory <em>Device Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Category</em>' containment reference.
	 * @see #getDeviceCategory()
	 * @generated
	 */
	void setDeviceCategory(DeviceCategoryType value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Serial Number of the Instrument
	 * 
	 * ## SerialNo ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_SerialNumber()
	 * @model dataType="com.himsa.instrument.selection.SerialNumberType"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vent Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
	 * 
	 * ##  TVentType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vent Type</em>' attribute.
	 * @see #setVentType(BigInteger)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_VentType()
	 * @model dataType="com.himsa.instrument.selection.VentType"
	 *        extendedMetaData="kind='element' name='VentType' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVentType();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVentType <em>Vent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vent Type</em>' attribute.
	 * @see #getVentType()
	 * @generated
	 */
	void setVentType(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ear Mold Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EarMoldForm Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
	 * 
	 * ## TEarMoldForm ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ear Mold Form</em>' attribute.
	 * @see #setEarMoldForm(BigInteger)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_EarMoldForm()
	 * @model dataType="com.himsa.instrument.selection.EarMoldFormType"
	 *        extendedMetaData="kind='element' name='EarMoldForm' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEarMoldForm();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldForm <em>Ear Mold Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ear Mold Form</em>' attribute.
	 * @see #getEarMoldForm()
	 * @generated
	 */
	void setEarMoldForm(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ear Mold Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free from notes about the Ear mold (e.g. type of material  or color)
	 * 
	 * ## EarMoldText ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ear Mold Text</em>' attribute.
	 * @see #setEarMoldText(String)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_EarMoldText()
	 * @model dataType="com.himsa.instrument.selection.EarMoldTextType"
	 *        extendedMetaData="kind='element' name='EarMoldText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEarMoldText();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldText <em>Ear Mold Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ear Mold Text</em>' attribute.
	 * @see #getEarMoldText()
	 * @generated
	 */
	void setEarMoldText(String value);

	/**
	 * Returns the value of the '<em><b>Sound Canal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SoundCanal Type Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
	 * 
	 * ## TSoundCanalType ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sound Canal Type</em>' attribute.
	 * @see #setSoundCanalType(BigInteger)
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_SoundCanalType()
	 * @model dataType="com.himsa.instrument.selection.SoundCanalType"
	 *        extendedMetaData="kind='element' name='SoundCanalType' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSoundCanalType();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSoundCanalType <em>Sound Canal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Canal Type</em>' attribute.
	 * @see #getSoundCanalType()
	 * @generated
	 */
	void setSoundCanalType(BigInteger value);

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
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_BatteryType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BatteryType' namespace='##targetNamespace'"
	 * @generated
	 */
	BatteryType getBatteryType();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getBatteryType <em>Battery Type</em>}' containment reference.
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
	 * Do not use this element to store data.
	 * 
	 * This element was originally defined in format 100 and not clearly defined.  HIMSA will translate any format 100 values to format 500 but does not allow any data storage for formats 500+
	 * 
	 * ## Reserved ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_Reserved()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getReserved <em>Reserved</em>}' attribute.
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
	 * This data will never be converted back to an earlier version of a Hearing Instrument Selection data standard.  For example, if an hearing instrument selection action format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the data (causing a conversion down to format 100) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Selection Data</em>' attribute.
	 * @see #setPrivateSelectionData(byte[])
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_PrivateSelectionData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateSelectionData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateSelectionData();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}' attribute.
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
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_ConvertedFromDataStandard()
	 * @model dataType="com.himsa.instrument.selection.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
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
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
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
	 * Unsets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
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
	 * @see com.himsa.instrument.selection.SelectionPackage#getHearingInstrumentSelectionType_Version()
	 * @model default="500" unsettable="true" dataType="com.himsa.instrument.selection.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HearingInstrumentSelectionType
