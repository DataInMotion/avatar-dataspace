/**
 */
package audiogram.util;

import audiogram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see audiogram.AudiogramPackage
 * @generated
 */
public class AudiogramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AudiogramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogramSwitch() {
		if (modelPackage == null) {
			modelPackage = AudiogramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE: {
				AlternateBinauralLoudnessBalanceAudiogramType alternateBinauralLoudnessBalanceAudiogramType = (AlternateBinauralLoudnessBalanceAudiogramType)theEObject;
				T result = caseAlternateBinauralLoudnessBalanceAudiogramType(alternateBinauralLoudnessBalanceAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE: {
				AudioMetricMeasurementConditionsType audioMetricMeasurementConditionsType = (AudioMetricMeasurementConditionsType)theEObject;
				T result = caseAudioMetricMeasurementConditionsType(audioMetricMeasurementConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DECAY_AUDIOGRAM_TYPE: {
				DecayAudiogramType decayAudiogramType = (DecayAudiogramType)theEObject;
				T result = caseDecayAudiogramType(decayAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DECAY_POINT_TYPE: {
				DecayPointType decayPointType = (DecayPointType)theEObject;
				T result = caseDecayPointType(decayPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE: {
				DifferenceLimenFrequencyPointType differenceLimenFrequencyPointType = (DifferenceLimenFrequencyPointType)theEObject;
				T result = caseDifferenceLimenFrequencyPointType(differenceLimenFrequencyPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DIFFERENCE_LIMEN_FREQUENCY_TYPE: {
				DifferenceLimenFrequencyType differenceLimenFrequencyType = (DifferenceLimenFrequencyType)theEObject;
				T result = caseDifferenceLimenFrequencyType(differenceLimenFrequencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE: {
				DifferenceLimenIntensityPointType differenceLimenIntensityPointType = (DifferenceLimenIntensityPointType)theEObject;
				T result = caseDifferenceLimenIntensityPointType(differenceLimenIntensityPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_TYPE: {
				DifferenceLimenIntensityType differenceLimenIntensityType = (DifferenceLimenIntensityType)theEObject;
				T result = caseDifferenceLimenIntensityType(differenceLimenIntensityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE: {
				FrequenciesUsedForToneAverageType frequenciesUsedForToneAverageType = (FrequenciesUsedForToneAverageType)theEObject;
				T result = caseFrequenciesUsedForToneAverageType(frequenciesUsedForToneAverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE: {
				HIMSAAudiometricStandardType himsaAudiometricStandardType = (HIMSAAudiometricStandardType)theEObject;
				T result = caseHIMSAAudiometricStandardType(himsaAudiometricStandardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE: {
				MeasurementNotesType measurementNotesType = (MeasurementNotesType)theEObject;
				T result = caseMeasurementNotesType(measurementNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.MOST_COMFORTABLE_LEVEL_TYPE: {
				MostComfortableLevelType mostComfortableLevelType = (MostComfortableLevelType)theEObject;
				T result = caseMostComfortableLevelType(mostComfortableLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT: {
				ShortIncrementSensitivityIndexPoint shortIncrementSensitivityIndexPoint = (ShortIncrementSensitivityIndexPoint)theEObject;
				T result = caseShortIncrementSensitivityIndexPoint(shortIncrementSensitivityIndexPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE: {
				ShortIncrementSensitivityIndexType shortIncrementSensitivityIndexType = (ShortIncrementSensitivityIndexType)theEObject;
				T result = caseShortIncrementSensitivityIndexType(shortIncrementSensitivityIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE: {
				SpeechDiscriminationAudiogramType speechDiscriminationAudiogramType = (SpeechDiscriminationAudiogramType)theEObject;
				T result = caseSpeechDiscriminationAudiogramType(speechDiscriminationAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE: {
				SpeechMostComfortableLevelType speechMostComfortableLevelType = (SpeechMostComfortableLevelType)theEObject;
				T result = caseSpeechMostComfortableLevelType(speechMostComfortableLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE: {
				SpeechReceptionThresholdAudiogramType speechReceptionThresholdAudiogramType = (SpeechReceptionThresholdAudiogramType)theEObject;
				T result = caseSpeechReceptionThresholdAudiogramType(speechReceptionThresholdAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE: {
				SpeechScorePointType speechScorePointType = (SpeechScorePointType)theEObject;
				T result = caseSpeechScorePointType(speechScorePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE: {
				SpeechUncomfortableLevelType speechUncomfortableLevelType = (SpeechUncomfortableLevelType)theEObject;
				T result = caseSpeechUncomfortableLevelType(speechUncomfortableLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.STENGER_AUDIOGRAM_TYPE: {
				StengerAudiogramType stengerAudiogramType = (StengerAudiogramType)theEObject;
				T result = caseStengerAudiogramType(stengerAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.TONE_POINTS_TYPE: {
				TonePointsType tonePointsType = (TonePointsType)theEObject;
				T result = caseTonePointsType(tonePointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.TONE_THRESHOLD_AUDIOGRAM_TYPE: {
				ToneThresholdAudiogramType toneThresholdAudiogramType = (ToneThresholdAudiogramType)theEObject;
				T result = caseToneThresholdAudiogramType(toneThresholdAudiogramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogramPackage.UNCOMFORTABLE_LEVEL_TYPE: {
				UncomfortableLevelType uncomfortableLevelType = (UncomfortableLevelType)theEObject;
				T result = caseUncomfortableLevelType(uncomfortableLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Binaural Loudness Balance Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Binaural Loudness Balance Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternateBinauralLoudnessBalanceAudiogramType(AlternateBinauralLoudnessBalanceAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Metric Measurement Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Metric Measurement Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioMetricMeasurementConditionsType(AudioMetricMeasurementConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decay Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decay Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecayAudiogramType(DecayAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decay Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decay Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecayPointType(DecayPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difference Limen Frequency Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difference Limen Frequency Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferenceLimenFrequencyPointType(DifferenceLimenFrequencyPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difference Limen Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difference Limen Frequency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferenceLimenFrequencyType(DifferenceLimenFrequencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difference Limen Intensity Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difference Limen Intensity Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferenceLimenIntensityPointType(DifferenceLimenIntensityPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difference Limen Intensity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difference Limen Intensity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferenceLimenIntensityType(DifferenceLimenIntensityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequencies Used For Tone Average Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequencies Used For Tone Average Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequenciesUsedForToneAverageType(FrequenciesUsedForToneAverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIMSA Audiometric Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIMSA Audiometric Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIMSAAudiometricStandardType(HIMSAAudiometricStandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementNotesType(MeasurementNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Most Comfortable Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Most Comfortable Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMostComfortableLevelType(MostComfortableLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Increment Sensitivity Index Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Increment Sensitivity Index Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortIncrementSensitivityIndexPoint(ShortIncrementSensitivityIndexPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Increment Sensitivity Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Increment Sensitivity Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortIncrementSensitivityIndexType(ShortIncrementSensitivityIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Discrimination Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Discrimination Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechDiscriminationAudiogramType(SpeechDiscriminationAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Most Comfortable Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Most Comfortable Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechMostComfortableLevelType(SpeechMostComfortableLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Reception Threshold Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Reception Threshold Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechReceptionThresholdAudiogramType(SpeechReceptionThresholdAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Score Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Score Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechScorePointType(SpeechScorePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Uncomfortable Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Uncomfortable Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechUncomfortableLevelType(SpeechUncomfortableLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stenger Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stenger Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStengerAudiogramType(StengerAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tone Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tone Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTonePointsType(TonePointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tone Threshold Audiogram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tone Threshold Audiogram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToneThresholdAudiogramType(ToneThresholdAudiogramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uncomfortable Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uncomfortable Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUncomfortableLevelType(UncomfortableLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AudiogramSwitch
