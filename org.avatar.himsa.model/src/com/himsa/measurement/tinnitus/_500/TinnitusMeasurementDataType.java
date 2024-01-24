/*
 */
package com.himsa.measurement.tinnitus._500;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tinnitus Measurement Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementNotes <em>Tinnitus Measurement Notes</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment <em>Tinnitus Measurement Equipment</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusPitchMatch <em>Tinnitus Pitch Match</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusLoudnessMatch <em>Tinnitus Loudness Match</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getMinimumMaskingLevel <em>Minimum Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getResidualInhibition <em>Residual Inhibition</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType()
 * @model extendedMetaData="name='TinnitusMeasurementData_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TinnitusMeasurementDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tinnitus Measurement Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes added to the Tinnitus Measurement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Measurement Notes</em>' containment reference.
	 * @see #setTinnitusMeasurementNotes(TinnitusMeasurementNotesType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_TinnitusMeasurementNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TinnitusMeasurementNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusMeasurementNotesType getTinnitusMeasurementNotes();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementNotes <em>Tinnitus Measurement Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Measurement Notes</em>' containment reference.
	 * @see #getTinnitusMeasurementNotes()
	 * @generated
	 */
	void setTinnitusMeasurementNotes(TinnitusMeasurementNotesType value);

	/**
	 * Returns the value of the '<em><b>Tinnitus Measurement Equipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Tinnitus Measurement Equipment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Measurement Equipment</em>' containment reference.
	 * @see #setTinnitusMeasurementEquipment(MeasurementEquipmentType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_TinnitusMeasurementEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TinnitusMeasurementEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementEquipmentType getTinnitusMeasurementEquipment();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getTinnitusMeasurementEquipment <em>Tinnitus Measurement Equipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Measurement Equipment</em>' containment reference.
	 * @see #getTinnitusMeasurementEquipment()
	 * @generated
	 */
	void setTinnitusMeasurementEquipment(MeasurementEquipmentType value);

	/**
	 * Returns the value of the '<em><b>Tinnitus Pitch Match</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (TPM) Test attempt to determine the frequency best matching the tinnitus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Pitch Match</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_TinnitusPitchMatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TinnitusPitchMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TinnitusPitchMatchType> getTinnitusPitchMatch();

	/**
	 * Returns the value of the '<em><b>Tinnitus Loudness Match</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.TinnitusLoudnessMatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (TLM) Test attempt to determine loudness of the tinnitus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Loudness Match</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_TinnitusLoudnessMatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TinnitusLoudnessMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TinnitusLoudnessMatchType> getTinnitusLoudnessMatch();

	/**
	 * Returns the value of the '<em><b>Minimum Masking Level</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum level to mask Tinnitus (MML). Test attempt to determine the lowest level at which a standard band of noise "covered" the tinnitus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Masking Level</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_MinimumMaskingLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MinimumMaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MinimumMaskingLevelType> getMinimumMaskingLevel();

	/**
	 * Returns the value of the '<em><b>Residual Inhibition</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.tinnitus._500.ResidualInhibitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus loudness suppression after exposure to a stimulus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residual Inhibition</em>' containment reference list.
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_ResidualInhibition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidualInhibition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResidualInhibitionType> getResidualInhibition();

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
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementDataType_Version()
	 * @model default="500" unsettable="true" dataType="com.himsa.measurement.tinnitus._500.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // TinnitusMeasurementDataType
