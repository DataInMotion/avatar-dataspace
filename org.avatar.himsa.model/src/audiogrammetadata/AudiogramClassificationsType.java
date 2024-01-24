/*
 */
package audiogrammetadata;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audiogram Classifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.AudiogramClassificationsType#getAMCLASS <em>AMCLASS</em>}</li>
 *   <li>{@link audiogrammetadata.AudiogramClassificationsType#getNonStandardized <em>Non Standardized</em>}</li>
 * </ul>
 *
 * @see audiogrammetadata.AudiogrammetadataPackage#getAudiogramClassificationsType()
 * @model extendedMetaData="name='AudiogramClassifications_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AudiogramClassificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>AMCLASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMCLASS ™
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AMCLASS</em>' containment reference.
	 * @see #setAMCLASS(AMCLASSType1)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getAudiogramClassificationsType_AMCLASS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AMCLASS' namespace='##targetNamespace'"
	 * @generated
	 */
	AMCLASSType1 getAMCLASS();

	/**
	 * Sets the value of the '{@link audiogrammetadata.AudiogramClassificationsType#getAMCLASS <em>AMCLASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AMCLASS</em>' containment reference.
	 * @see #getAMCLASS()
	 * @generated
	 */
	void setAMCLASS(AMCLASSType1 value);

	/**
	 * Returns the value of the '<em><b>Non Standardized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that is not defined by a published standard.  The information is assumed to be understood by the creator of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Standardized</em>' attribute.
	 * @see #setNonStandardized(String)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getAudiogramClassificationsType_NonStandardized()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NonStandardized' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNonStandardized();

	/**
	 * Sets the value of the '{@link audiogrammetadata.AudiogramClassificationsType#getNonStandardized <em>Non Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Standardized</em>' attribute.
	 * @see #getNonStandardized()
	 * @generated
	 */
	void setNonStandardized(String value);

} // AudiogramClassificationsType
