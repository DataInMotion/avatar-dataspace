/*
 */
package journal;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIMSA Journal Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link journal.HIMSAJournalStandardType#getBody <em>Body</em>}</li>
 *   <li>{@link journal.HIMSAJournalStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link journal.HIMSAJournalStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see journal.JournalPackage#getHIMSAJournalStandardType()
 * @model extendedMetaData="name='HIMSAJournalStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HIMSAJournalStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft RTF format.
	 * 
	 * GUI elements such as the WPF RichTextBox can display RTF encoding, and allow for the use of different fonts, textFormatting, textsize, tabulations, textcolor, etc.
	 * In most cases Journal entries will be shown without any problem – but any RTF control will only show the data that is supported by the used RTF specification. This means that a specific RTF control may not show extended data that was created in a newer RTF control with a newer version of RTF.
	 * Note: The Noah 4 Journal module uses the RTF version that is available with WPF.
	 * 
	 * Q: Where can a subject or heading for a journal be saved?
	 * A: the journal standard does not support this but rather relies upon the Noah action description to save this.  Noah compatible software will need to save a subject or heading as part of the Noah action description.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(byte[])
	 * @see journal.JournalPackage#getHIMSAJournalStandardType_Body()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBody();

	/**
	 * Sets the value of the '{@link journal.HIMSAJournalStandardType#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(byte[] value);

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is present the value of the data standard version will be entered here.  This value will only be entered by NOAH software which converts data.  The version numbers are typically 100,200 ect.
	 * 
	 * This data is presented as a source of information and at this time does not have a specific meaning.  As older data standards will not be validated by NOAH it is possible that some variations of data may be presented from old data.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see journal.JournalPackage#getHIMSAJournalStandardType_ConvertedFromDataStandard()
	 * @model dataType="journal.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link journal.HIMSAJournalStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 */
	void setConvertedFromDataStandard(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see journal.JournalPackage#getHIMSAJournalStandardType_Version()
	 * @model default="500" unsettable="true" dataType="journal.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link journal.HIMSAJournalStandardType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link journal.HIMSAJournalStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link journal.HIMSAJournalStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HIMSAJournalStandardType
