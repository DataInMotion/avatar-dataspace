/*
 */
package realear;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIMSA Rem Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realear.HIMSARemStandardType#getRealEarData <em>Real Ear Data</em>}</li>
 *   <li>{@link realear.HIMSARemStandardType#getPrivateREM <em>Private REM</em>}</li>
 *   <li>{@link realear.HIMSARemStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link realear.HIMSARemStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link realear.HIMSARemStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getHIMSARemStandardType()
 * @model extendedMetaData="name='HIMSARemStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HIMSARemStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real Ear Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real Ear Measurement Data. 
	 * ##RemData##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Data</em>' containment reference.
	 * @see #setRealEarData(RealEarDataType)
	 * @see realear.RealearPackage#getHIMSARemStandardType_RealEarData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEarData' namespace='##targetNamespace'"
	 * @generated
	 */
	RealEarDataType getRealEarData();

	/**
	 * Sets the value of the '{@link realear.HIMSARemStandardType#getRealEarData <em>Real Ear Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Ear Data</em>' containment reference.
	 * @see #getRealEarData()
	 * @generated
	 */
	void setRealEarData(RealEarDataType value);

	/**
	 * Returns the value of the '<em><b>Private REM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the past it was allowed by HIMSA to save privately formatted data in the unused section of the public storage area of a NOAH action.  This usage was used mainly because more space was allocated for public storage versus private.  At present this is no longer an issue as equal storage is allocated to both public and private data storage.
	 * 
	 * This elements primary function is to pass along any private data stored in the public area as base64 encoded data.  NOAH is not performing any translation or conversion of data.
	 * 
	 * This data will never be converted back to an earlier version of a Audiogram data standard.  For example, if an REM format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the REM (causing a conversion down to format 200) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private REM</em>' attribute.
	 * @see #setPrivateREM(byte[])
	 * @see realear.RealearPackage#getHIMSARemStandardType_PrivateREM()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateREM' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateREM();

	/**
	 * Sets the value of the '{@link realear.HIMSARemStandardType#getPrivateREM <em>Private REM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private REM</em>' attribute.
	 * @see #getPrivateREM()
	 * @generated
	 */
	void setPrivateREM(byte[] value);

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
	 * @see realear.RealearPackage#getHIMSARemStandardType_ConvertedFromDataStandard()
	 * @model dataType="realear.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link realear.HIMSARemStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
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
	 * @see realear.RealearPackage#getHIMSARemStandardType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link realear.HIMSARemStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
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
	 * Unsets the value of the '{@link realear.HIMSARemStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link realear.HIMSARemStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
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
	 * @see realear.RealearPackage#getHIMSARemStandardType_Version()
	 * @model default="500" unsettable="true" dataType="realear.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link realear.HIMSARemStandardType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link realear.HIMSARemStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link realear.HIMSARemStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HIMSARemStandardType
