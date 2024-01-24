/**
 */
package audiogram.util;

import audiogram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see audiogram.AudiogramPackage
 * @generated
 */
public class AudiogramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AudiogramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AudiogramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudiogramSwitch<Adapter> modelSwitch =
		new AudiogramSwitch<Adapter>() {
			@Override
			public Adapter caseAlternateBinauralLoudnessBalanceAudiogramType(AlternateBinauralLoudnessBalanceAudiogramType object) {
				return createAlternateBinauralLoudnessBalanceAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseAudioMetricMeasurementConditionsType(AudioMetricMeasurementConditionsType object) {
				return createAudioMetricMeasurementConditionsTypeAdapter();
			}
			@Override
			public Adapter caseDecayAudiogramType(DecayAudiogramType object) {
				return createDecayAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseDecayPointType(DecayPointType object) {
				return createDecayPointTypeAdapter();
			}
			@Override
			public Adapter caseDifferenceLimenFrequencyPointType(DifferenceLimenFrequencyPointType object) {
				return createDifferenceLimenFrequencyPointTypeAdapter();
			}
			@Override
			public Adapter caseDifferenceLimenFrequencyType(DifferenceLimenFrequencyType object) {
				return createDifferenceLimenFrequencyTypeAdapter();
			}
			@Override
			public Adapter caseDifferenceLimenIntensityPointType(DifferenceLimenIntensityPointType object) {
				return createDifferenceLimenIntensityPointTypeAdapter();
			}
			@Override
			public Adapter caseDifferenceLimenIntensityType(DifferenceLimenIntensityType object) {
				return createDifferenceLimenIntensityTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFrequenciesUsedForToneAverageType(FrequenciesUsedForToneAverageType object) {
				return createFrequenciesUsedForToneAverageTypeAdapter();
			}
			@Override
			public Adapter caseHIMSAAudiometricStandardType(HIMSAAudiometricStandardType object) {
				return createHIMSAAudiometricStandardTypeAdapter();
			}
			@Override
			public Adapter caseMeasurementNotesType(MeasurementNotesType object) {
				return createMeasurementNotesTypeAdapter();
			}
			@Override
			public Adapter caseMostComfortableLevelType(MostComfortableLevelType object) {
				return createMostComfortableLevelTypeAdapter();
			}
			@Override
			public Adapter caseShortIncrementSensitivityIndexPoint(ShortIncrementSensitivityIndexPoint object) {
				return createShortIncrementSensitivityIndexPointAdapter();
			}
			@Override
			public Adapter caseShortIncrementSensitivityIndexType(ShortIncrementSensitivityIndexType object) {
				return createShortIncrementSensitivityIndexTypeAdapter();
			}
			@Override
			public Adapter caseSpeechDiscriminationAudiogramType(SpeechDiscriminationAudiogramType object) {
				return createSpeechDiscriminationAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseSpeechMostComfortableLevelType(SpeechMostComfortableLevelType object) {
				return createSpeechMostComfortableLevelTypeAdapter();
			}
			@Override
			public Adapter caseSpeechReceptionThresholdAudiogramType(SpeechReceptionThresholdAudiogramType object) {
				return createSpeechReceptionThresholdAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseSpeechScorePointType(SpeechScorePointType object) {
				return createSpeechScorePointTypeAdapter();
			}
			@Override
			public Adapter caseSpeechUncomfortableLevelType(SpeechUncomfortableLevelType object) {
				return createSpeechUncomfortableLevelTypeAdapter();
			}
			@Override
			public Adapter caseStengerAudiogramType(StengerAudiogramType object) {
				return createStengerAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseTonePointsType(TonePointsType object) {
				return createTonePointsTypeAdapter();
			}
			@Override
			public Adapter caseToneThresholdAudiogramType(ToneThresholdAudiogramType object) {
				return createToneThresholdAudiogramTypeAdapter();
			}
			@Override
			public Adapter caseUncomfortableLevelType(UncomfortableLevelType object) {
				return createUncomfortableLevelTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link audiogram.AlternateBinauralLoudnessBalanceAudiogramType <em>Alternate Binaural Loudness Balance Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.AlternateBinauralLoudnessBalanceAudiogramType
	 * @generated
	 */
	public Adapter createAlternateBinauralLoudnessBalanceAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.AudioMetricMeasurementConditionsType <em>Audio Metric Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.AudioMetricMeasurementConditionsType
	 * @generated
	 */
	public Adapter createAudioMetricMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DecayAudiogramType <em>Decay Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DecayAudiogramType
	 * @generated
	 */
	public Adapter createDecayAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DecayPointType <em>Decay Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DecayPointType
	 * @generated
	 */
	public Adapter createDecayPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DifferenceLimenFrequencyPointType <em>Difference Limen Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DifferenceLimenFrequencyPointType
	 * @generated
	 */
	public Adapter createDifferenceLimenFrequencyPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DifferenceLimenFrequencyType <em>Difference Limen Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DifferenceLimenFrequencyType
	 * @generated
	 */
	public Adapter createDifferenceLimenFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DifferenceLimenIntensityPointType <em>Difference Limen Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DifferenceLimenIntensityPointType
	 * @generated
	 */
	public Adapter createDifferenceLimenIntensityPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DifferenceLimenIntensityType <em>Difference Limen Intensity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DifferenceLimenIntensityType
	 * @generated
	 */
	public Adapter createDifferenceLimenIntensityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.FrequenciesUsedForToneAverageType <em>Frequencies Used For Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.FrequenciesUsedForToneAverageType
	 * @generated
	 */
	public Adapter createFrequenciesUsedForToneAverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.HIMSAAudiometricStandardType <em>HIMSA Audiometric Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.HIMSAAudiometricStandardType
	 * @generated
	 */
	public Adapter createHIMSAAudiometricStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.MeasurementNotesType
	 * @generated
	 */
	public Adapter createMeasurementNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.MostComfortableLevelType <em>Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.MostComfortableLevelType
	 * @generated
	 */
	public Adapter createMostComfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.ShortIncrementSensitivityIndexPoint <em>Short Increment Sensitivity Index Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.ShortIncrementSensitivityIndexPoint
	 * @generated
	 */
	public Adapter createShortIncrementSensitivityIndexPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.ShortIncrementSensitivityIndexType <em>Short Increment Sensitivity Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.ShortIncrementSensitivityIndexType
	 * @generated
	 */
	public Adapter createShortIncrementSensitivityIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.SpeechDiscriminationAudiogramType <em>Speech Discrimination Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.SpeechDiscriminationAudiogramType
	 * @generated
	 */
	public Adapter createSpeechDiscriminationAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.SpeechMostComfortableLevelType <em>Speech Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.SpeechMostComfortableLevelType
	 * @generated
	 */
	public Adapter createSpeechMostComfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.SpeechReceptionThresholdAudiogramType <em>Speech Reception Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.SpeechReceptionThresholdAudiogramType
	 * @generated
	 */
	public Adapter createSpeechReceptionThresholdAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.SpeechScorePointType <em>Speech Score Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.SpeechScorePointType
	 * @generated
	 */
	public Adapter createSpeechScorePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.SpeechUncomfortableLevelType <em>Speech Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.SpeechUncomfortableLevelType
	 * @generated
	 */
	public Adapter createSpeechUncomfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.StengerAudiogramType <em>Stenger Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.StengerAudiogramType
	 * @generated
	 */
	public Adapter createStengerAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.TonePointsType <em>Tone Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.TonePointsType
	 * @generated
	 */
	public Adapter createTonePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.ToneThresholdAudiogramType <em>Tone Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.ToneThresholdAudiogramType
	 * @generated
	 */
	public Adapter createToneThresholdAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram.UncomfortableLevelType <em>Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram.UncomfortableLevelType
	 * @generated
	 */
	public Adapter createUncomfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AudiogramAdapterFactory
