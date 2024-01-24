/*
 */
package audiogrammetadata;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIMSA Audiogram Metadata Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}</li>
 *   <li>{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getPredictedAccuracies <em>Predicted Accuracies</em>}</li>
 *   <li>{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getAudiogramClassifications <em>Audiogram Classifications</em>}</li>
 *   <li>{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see audiogrammetadata.AudiogrammetadataPackage#getHIMSAAudiogramMetadataStandardType()
 * @model extendedMetaData="name='HIMSAAudiogramMetadataStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HIMSAAudiogramMetadataStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Automated Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True means that the measurement was collected via in an automated fashion.   The measurement system defines if the test was automated.  This standard does not consider if the measurement was 100% or partial automated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automated Measurement</em>' attribute.
	 * @see #isSetAutomatedMeasurement()
	 * @see #unsetAutomatedMeasurement()
	 * @see #setAutomatedMeasurement(boolean)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AutomatedMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAutomatedMeasurement();

	/**
	 * Sets the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automated Measurement</em>' attribute.
	 * @see #isSetAutomatedMeasurement()
	 * @see #unsetAutomatedMeasurement()
	 * @see #isAutomatedMeasurement()
	 * @generated
	 */
	void setAutomatedMeasurement(boolean value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomatedMeasurement()
	 * @see #isAutomatedMeasurement()
	 * @see #setAutomatedMeasurement(boolean)
	 * @generated
	 */
	void unsetAutomatedMeasurement();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automated Measurement</em>' attribute is set.
	 * @see #unsetAutomatedMeasurement()
	 * @see #isAutomatedMeasurement()
	 * @see #setAutomatedMeasurement(boolean)
	 * @generated
	 */
	boolean isSetAutomatedMeasurement();

	/**
	 * Returns the value of the '<em><b>Predicted Accuracies</b></em>' containment reference list.
	 * The list contents are of type {@link audiogrammetadata.PredictedAccuraciesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicted Accuracies</em>' containment reference list.
	 * @see audiogrammetadata.AudiogrammetadataPackage#getHIMSAAudiogramMetadataStandardType_PredictedAccuracies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PredictedAccuracies' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PredictedAccuraciesType> getPredictedAccuracies();

	/**
	 * Returns the value of the '<em><b>Audiogram Classifications</b></em>' containment reference list.
	 * The list contents are of type {@link audiogrammetadata.AudiogramClassificationsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Audiogramgram Classifications are optional to be stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiogram Classifications</em>' containment reference list.
	 * @see audiogrammetadata.AudiogrammetadataPackage#getHIMSAAudiogramMetadataStandardType_AudiogramClassifications()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AudiogramClassifications' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AudiogramClassificationsType> getAudiogramClassifications();

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
	 * @see audiogrammetadata.AudiogrammetadataPackage#getHIMSAAudiogramMetadataStandardType_Version()
	 * @model default="500" unsettable="true" dataType="audiogrammetadata.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HIMSAAudiogramMetadataStandardType
