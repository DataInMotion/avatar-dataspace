/*
 */
package fitting;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Instrument Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fitting.HearingInstrumentFittingType#getDateOfAudiogram <em>Date Of Audiogram</em>}</li>
 *   <li>{@link fitting.HearingInstrumentFittingType#getReserved <em>Reserved</em>}</li>
 *   <li>{@link fitting.HearingInstrumentFittingType#getPrivateFittingData <em>Private Fitting Data</em>}</li>
 *   <li>{@link fitting.HearingInstrumentFittingType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link fitting.HearingInstrumentFittingType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link fitting.HearingInstrumentFittingType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fitting.FittingPackage#getHearingInstrumentFittingType()
 * @model extendedMetaData="name='HearingInstrumentFitting_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HearingInstrumentFittingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Of Audiogram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of Audiogram that was used for the hearing instrument fitting
	 * 
	 * With NOAH 3 and newer this element is irrelevant.  When a fitting module saves a fitting action it will create a reference to the audiogram action (a referenced action).  This information can be found at the level of the action and not in the public data area of the actual action. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of Audiogram</em>' attribute.
	 * @see #setDateOfAudiogram(XMLGregorianCalendar)
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_DateOfAudiogram()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='DateOfAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfAudiogram();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#getDateOfAudiogram <em>Date Of Audiogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Audiogram</em>' attribute.
	 * @see #getDateOfAudiogram()
	 * @generated
	 */
	void setDateOfAudiogram(XMLGregorianCalendar value);

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
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_Reserved()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='Reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>Private Fitting Data</b></em>' attribute.
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
	 * This data will never be converted back to an earlier version of a Hearing Instrument Fitting data standard.  For example, if an fitting actions format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the Audiogram (causing a conversion down to format 100) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Fitting Data</em>' attribute.
	 * @see #setPrivateFittingData(byte[])
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_PrivateFittingData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateFittingData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateFittingData();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#getPrivateFittingData <em>Private Fitting Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Fitting Data</em>' attribute.
	 * @see #getPrivateFittingData()
	 * @generated
	 */
	void setPrivateFittingData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is present the value of the data standard version will be entered here.  This value will only be used by NOAH software which converts data.  The version numbers are typically 100,200 ect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_ConvertedFromDataStandard()
	 * @model dataType="fitting.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
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
	 * NOAH Software is the only software package allowed to enter or change the entry in this element.  HIMSA will consider any other software packages altering this value as data corruption and thus result in a critical certification issue.
	 * 
	 * NOAH 4 will add a new feature which will validate data created using this schema file (i.e. a module saves data in XML format).  When saving data NOAH will also validate it against the schema file, if the validation passes the value of True will be entered.  A true value for this element will assure other software developers that the data has indeed been validated against the schema file.
	 * 
	 * Please note that data being presented in XML but being up converted from another older version (e.g. format 100 or 200) will NOT be validated by HIMSA and the value will set to false.  In this event the "ConvertedFromDataStandard" element will be properly set by NOAH as well.
	 * 
	 * @@When data is converted the converter DLL must entered a value of false as it will not be validating @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
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
	 * Unsets the value of the '{@link fitting.HearingInstrumentFittingType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link fitting.HearingInstrumentFittingType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
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
	 * @see fitting.FittingPackage#getHearingInstrumentFittingType_Version()
	 * @model default="500" unsettable="true" dataType="fitting.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link fitting.HearingInstrumentFittingType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link fitting.HearingInstrumentFittingType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link fitting.HearingInstrumentFittingType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HearingInstrumentFittingType
