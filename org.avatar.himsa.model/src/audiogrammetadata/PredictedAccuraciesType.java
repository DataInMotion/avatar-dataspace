/*
 */
package audiogrammetadata;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicted Accuracies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.PredictedAccuraciesType#getQualind <em>Qualind</em>}</li>
 *   <li>{@link audiogrammetadata.PredictedAccuraciesType#getNonStandardized <em>Non Standardized</em>}</li>
 * </ul>
 *
 * @see audiogrammetadata.AudiogrammetadataPackage#getPredictedAccuraciesType()
 * @model extendedMetaData="name='PredictedAccuracies_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PredictedAccuraciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualind ™
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualind</em>' containment reference.
	 * @see #setQualind(QualindType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getPredictedAccuraciesType_Qualind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Qualind' namespace='##targetNamespace'"
	 * @generated
	 */
	QualindType getQualind();

	/**
	 * Sets the value of the '{@link audiogrammetadata.PredictedAccuraciesType#getQualind <em>Qualind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualind</em>' containment reference.
	 * @see #getQualind()
	 * @generated
	 */
	void setQualind(QualindType value);

	/**
	 * Returns the value of the '<em><b>Non Standardized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that is not defined by a published standard.  The information is assumed to be understood by the creator of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Standardized</em>' containment reference.
	 * @see #setNonStandardized(NonStandardizedType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getPredictedAccuraciesType_NonStandardized()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NonStandardized' namespace='##targetNamespace'"
	 * @generated
	 */
	NonStandardizedType getNonStandardized();

	/**
	 * Sets the value of the '{@link audiogrammetadata.PredictedAccuraciesType#getNonStandardized <em>Non Standardized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Standardized</em>' containment reference.
	 * @see #getNonStandardized()
	 * @generated
	 */
	void setNonStandardized(NonStandardizedType value);

} // PredictedAccuraciesType
