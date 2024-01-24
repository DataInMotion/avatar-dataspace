/*
 */
package cochlear;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implant Sound Processor Selection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cochlear.CochlearImplantSoundProcessorSelectionType#getSoundProcessor <em>Sound Processor</em>}</li>
 *   <li>{@link cochlear.CochlearImplantSoundProcessorSelectionType#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link cochlear.CochlearImplantSoundProcessorSelectionType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see cochlear.CochlearPackage#getCochlearImplantSoundProcessorSelectionType()
 * @model extendedMetaData="name='CochlearImplantSoundProcessorSelection_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CochlearImplantSoundProcessorSelectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sound Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model name
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sound Processor</em>' attribute.
	 * @see #setSoundProcessor(String)
	 * @see cochlear.CochlearPackage#getCochlearImplantSoundProcessorSelectionType_SoundProcessor()
	 * @model dataType="cochlear.SoundProcessorType"
	 *        extendedMetaData="kind='element' name='SoundProcessor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSoundProcessor();

	/**
	 * Sets the value of the '{@link cochlear.CochlearImplantSoundProcessorSelectionType#getSoundProcessor <em>Sound Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Processor</em>' attribute.
	 * @see #getSoundProcessor()
	 * @generated
	 */
	void setSoundProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Serial Number of the processor
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see cochlear.CochlearPackage#getCochlearImplantSoundProcessorSelectionType_SerialNumber()
	 * @model dataType="cochlear.SerialNumberType"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link cochlear.CochlearImplantSoundProcessorSelectionType#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

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
	 * @see cochlear.CochlearPackage#getCochlearImplantSoundProcessorSelectionType_Version()
	 * @model default="500" unsettable="true" dataType="cochlear.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link cochlear.CochlearImplantSoundProcessorSelectionType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link cochlear.CochlearImplantSoundProcessorSelectionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link cochlear.CochlearImplantSoundProcessorSelectionType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // CochlearImplantSoundProcessorSelectionType
