/*
 */
package audiogram;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Uncomfortable Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.SpeechUncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint <em>Speech Uncomfortable Point</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getSpeechUncomfortableLevelType()
 * @model extendedMetaData="name='SpeechUncomfortableLevel_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpeechUncomfortableLevelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global Element used throughout this standard - see AudioMetricMeasurementConditions_Type for more details
	 * 
	 * The same set of measurement conditions are used for all Audiogram curves.
	 * The Audiogram measurement conditions are very versatile and expandable in such a way that whenever new measurement methods are discovered they can be added to the existing ones.
	 * 
	 * They are meant to be used both by the ENT (Ear, Nose, Throat) for diagnostics purposes and for fitting hearing instruments as well. It is very important to realize that combinations of measurement conditions that make perfect sense to the ENT can be meaningless when programming hearing instruments. It is therefore important to examine all measurement conditions to ascertain whether they are useful for the intended purpose.
	 * 
	 * The measurement conditions have initial (default) values that must be filled in.
	 * 
	 * The following elements are mandatory and have initial values set:
	 * StimulusSignalType, MaskingSignalType
	 * StimulusSignalOutput, MaskingSignalOutput
	 * StimulusdBWeighting, MaskingdBWeighting
	 * 
	 * In addition to the initial default values listed above recording the following audiogram test requires the following elements be set (even though they are listed as optional in the XSD schema file)
	 * 
	 * For tone audiograms these are:
	 * StimulusPresentationType, MaskingPresentationType
	 * 
	 * For speech audiograms these are:
	 * StimulusAuxiliary
	 * MaskingAuxiliary
	 * 
	 * ## TMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see audiogram.AudiogramPackage#getSpeechUncomfortableLevelType_AudMeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link audiogram.SpeechUncomfortableLevelType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #getAudMeasurementConditions()
	 * @generated
	 */
	void setAudMeasurementConditions(AudioMetricMeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Speech Uncomfortable Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speech Uncomfortable Point</em>' containment reference.
	 * @see #setSpeechUncomfortablePoint(SpeechScorePointType)
	 * @see audiogram.AudiogramPackage#getSpeechUncomfortableLevelType_SpeechUncomfortablePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SpeechUncomfortablePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechScorePointType getSpeechUncomfortablePoint();

	/**
	 * Sets the value of the '{@link audiogram.SpeechUncomfortableLevelType#getSpeechUncomfortablePoint <em>Speech Uncomfortable Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Uncomfortable Point</em>' containment reference.
	 * @see #getSpeechUncomfortablePoint()
	 * @generated
	 */
	void setSpeechUncomfortablePoint(SpeechScorePointType value);

} // SpeechUncomfortableLevelType
