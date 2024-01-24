/*
 */
package com.himsa.measurement.audiogram._502;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tone Threshold Audiogram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.ToneThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.ToneThresholdAudiogramType#getTonePoints <em>Tone Points</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getToneThresholdAudiogramType()
 * @model extendedMetaData="name='ToneThresholdAudiogram_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ToneThresholdAudiogramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Global Element used throughout this standard - see AudioMetricMeasurementConditions_Type for more details
	 * 
	 * The same set of measurement conditions are used for all Audiogram curves.
	 * The Audiogram measurement conditions are very versatile and expandable in such a way that whenever new measurement methods are discovered they can be added to the existing ones.
	 * 
	 * They are meant to be used both by the ENT (Ear, Nose, Throat) for diagnostics purposes and for fitting hearing instruments as well. It is very important to realize that combinations of measurement conditions that make perfect sense to the ENT can be meaningless when programming hearing instruments. It is therefore important to examine all measurement conditions to ascertain whether they are useful for the intended purpose.
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getToneThresholdAudiogramType_AudMeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.ToneThresholdAudiogramType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #getAudMeasurementConditions()
	 * @generated
	 */
	void setAudMeasurementConditions(AudioMetricMeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Tone Points</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.audiogram._502.TonePointsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tone Points</em>' containment reference list.
	 * @see com.himsa.measurement.audiogram._502._502Package#getToneThresholdAudiogramType_TonePoints()
	 * @model containment="true" required="true" upper="24"
	 *        extendedMetaData="kind='element' name='TonePoints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TonePointsType> getTonePoints();

} // ToneThresholdAudiogramType
