/*
 */
package test;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIMSA Hit Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.HIMSAHitStandardType#getHearingInstrumentTest <em>Hearing Instrument Test</em>}</li>
 *   <li>{@link test.HIMSAHitStandardType#getPrivateHIT <em>Private HIT</em>}</li>
 *   <li>{@link test.HIMSAHitStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link test.HIMSAHitStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link test.HIMSAHitStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getHIMSAHitStandardType()
 * @model extendedMetaData="name='HIMSAHitStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HIMSAHitStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hearing Instrument Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines structure for storing a Hearing Instrument Test.
	 * 
	 * 
	 * ##HitData##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument Test</em>' containment reference.
	 * @see #setHearingInstrumentTest(HearingInstrumentTestType)
	 * @see test.TestPackage#getHIMSAHitStandardType_HearingInstrumentTest()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HearingInstrumentTest' namespace='##targetNamespace'"
	 * @generated
	 */
	HearingInstrumentTestType getHearingInstrumentTest();

	/**
	 * Sets the value of the '{@link test.HIMSAHitStandardType#getHearingInstrumentTest <em>Hearing Instrument Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument Test</em>' containment reference.
	 * @see #getHearingInstrumentTest()
	 * @generated
	 */
	void setHearingInstrumentTest(HearingInstrumentTestType value);

	/**
	 * Returns the value of the '<em><b>Private HIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the past it was allowed by HIMSA to save privately formatted data in the unused section of the public storage area of a NOAH action.  This usage was used mainly because more space was allocated for public storage versus private.  At present this is no longer an issue as equal storage is allocated to both public and private data storage.
	 * 
	 * This elements primary function is to pass along any private data stored in the public area as base64 encoded data.  NOAH is not performing any translation or conversion of data.
	 * 
	 * This data will never be converted back to an earlier version of a Audiogram data standard.  For example, if an HIT format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the HIT (causing a conversion down to format 200) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private HIT</em>' attribute.
	 * @see #setPrivateHIT(byte[])
	 * @see test.TestPackage#getHIMSAHitStandardType_PrivateHIT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateHIT' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateHIT();

	/**
	 * Sets the value of the '{@link test.HIMSAHitStandardType#getPrivateHIT <em>Private HIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private HIT</em>' attribute.
	 * @see #getPrivateHIT()
	 * @generated
	 */
	void setPrivateHIT(byte[] value);

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
	 * @see test.TestPackage#getHIMSAHitStandardType_ConvertedFromDataStandard()
	 * @model dataType="test.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link test.HIMSAHitStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
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
	 * @see test.TestPackage#getHIMSAHitStandardType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link test.HIMSAHitStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
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
	 * Unsets the value of the '{@link test.HIMSAHitStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link test.HIMSAHitStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
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
	 * @see test.TestPackage#getHIMSAHitStandardType_Version()
	 * @model default="500" unsettable="true" dataType="test.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link test.HIMSAHitStandardType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link test.HIMSAHitStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link test.HIMSAHitStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HIMSAHitStandardType
