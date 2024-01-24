/**
 */
package audiogram502.util;

import audiogram502.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see audiogram502.Audiogram502Package
 * @generated
 */
public class Audiogram502AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Audiogram502Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audiogram502AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Audiogram502Package.eINSTANCE;
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
	protected Audiogram502Switch<Adapter> modelSwitch =
		new Audiogram502Switch<Adapter>() {
			@Override
			public Adapter caseAdditionalMasking2Type(AdditionalMasking2Type object) {
				return createAdditionalMasking2TypeAdapter();
			}
			@Override
			public Adapter caseAdditionalMaskingType(AdditionalMaskingType object) {
				return createAdditionalMaskingTypeAdapter();
			}
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
			public Adapter caseDeviceSolutionsType(DeviceSolutionsType object) {
				return createDeviceSolutionsTypeAdapter();
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
			public Adapter caseInformationType(InformationType object) {
				return createInformationTypeAdapter();
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
			public Adapter caseSupplementaryDataType(SupplementaryDataType object) {
				return createSupplementaryDataTypeAdapter();
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
			public Adapter caseWeberPointsType(WeberPointsType object) {
				return createWeberPointsTypeAdapter();
			}
			@Override
			public Adapter caseWeberPointType(WeberPointType object) {
				return createWeberPointTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link audiogram502.AdditionalMasking2Type <em>Additional Masking2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.AdditionalMasking2Type
	 * @generated
	 */
	public Adapter createAdditionalMasking2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.AdditionalMaskingType <em>Additional Masking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.AdditionalMaskingType
	 * @generated
	 */
	public Adapter createAdditionalMaskingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.AlternateBinauralLoudnessBalanceAudiogramType <em>Alternate Binaural Loudness Balance Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.AlternateBinauralLoudnessBalanceAudiogramType
	 * @generated
	 */
	public Adapter createAlternateBinauralLoudnessBalanceAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.AudioMetricMeasurementConditionsType <em>Audio Metric Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.AudioMetricMeasurementConditionsType
	 * @generated
	 */
	public Adapter createAudioMetricMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DecayAudiogramType <em>Decay Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DecayAudiogramType
	 * @generated
	 */
	public Adapter createDecayAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DecayPointType <em>Decay Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DecayPointType
	 * @generated
	 */
	public Adapter createDecayPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DeviceSolutionsType <em>Device Solutions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DeviceSolutionsType
	 * @generated
	 */
	public Adapter createDeviceSolutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DifferenceLimenFrequencyPointType <em>Difference Limen Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DifferenceLimenFrequencyPointType
	 * @generated
	 */
	public Adapter createDifferenceLimenFrequencyPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DifferenceLimenFrequencyType <em>Difference Limen Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DifferenceLimenFrequencyType
	 * @generated
	 */
	public Adapter createDifferenceLimenFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DifferenceLimenIntensityPointType <em>Difference Limen Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DifferenceLimenIntensityPointType
	 * @generated
	 */
	public Adapter createDifferenceLimenIntensityPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DifferenceLimenIntensityType <em>Difference Limen Intensity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DifferenceLimenIntensityType
	 * @generated
	 */
	public Adapter createDifferenceLimenIntensityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.FrequenciesUsedForToneAverageType <em>Frequencies Used For Tone Average Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.FrequenciesUsedForToneAverageType
	 * @generated
	 */
	public Adapter createFrequenciesUsedForToneAverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.HIMSAAudiometricStandardType <em>HIMSA Audiometric Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.HIMSAAudiometricStandardType
	 * @generated
	 */
	public Adapter createHIMSAAudiometricStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.MeasurementNotesType
	 * @generated
	 */
	public Adapter createMeasurementNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.MostComfortableLevelType <em>Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.MostComfortableLevelType
	 * @generated
	 */
	public Adapter createMostComfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.ShortIncrementSensitivityIndexPoint <em>Short Increment Sensitivity Index Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.ShortIncrementSensitivityIndexPoint
	 * @generated
	 */
	public Adapter createShortIncrementSensitivityIndexPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.ShortIncrementSensitivityIndexType <em>Short Increment Sensitivity Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.ShortIncrementSensitivityIndexType
	 * @generated
	 */
	public Adapter createShortIncrementSensitivityIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SpeechDiscriminationAudiogramType <em>Speech Discrimination Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SpeechDiscriminationAudiogramType
	 * @generated
	 */
	public Adapter createSpeechDiscriminationAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SpeechMostComfortableLevelType <em>Speech Most Comfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SpeechMostComfortableLevelType
	 * @generated
	 */
	public Adapter createSpeechMostComfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SpeechReceptionThresholdAudiogramType <em>Speech Reception Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SpeechReceptionThresholdAudiogramType
	 * @generated
	 */
	public Adapter createSpeechReceptionThresholdAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SpeechScorePointType <em>Speech Score Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SpeechScorePointType
	 * @generated
	 */
	public Adapter createSpeechScorePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SpeechUncomfortableLevelType <em>Speech Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SpeechUncomfortableLevelType
	 * @generated
	 */
	public Adapter createSpeechUncomfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.StengerAudiogramType <em>Stenger Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.StengerAudiogramType
	 * @generated
	 */
	public Adapter createStengerAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.SupplementaryDataType <em>Supplementary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.SupplementaryDataType
	 * @generated
	 */
	public Adapter createSupplementaryDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.TonePointsType <em>Tone Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.TonePointsType
	 * @generated
	 */
	public Adapter createTonePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.ToneThresholdAudiogramType <em>Tone Threshold Audiogram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.ToneThresholdAudiogramType
	 * @generated
	 */
	public Adapter createToneThresholdAudiogramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.UncomfortableLevelType <em>Uncomfortable Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.UncomfortableLevelType
	 * @generated
	 */
	public Adapter createUncomfortableLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.WeberPointsType <em>Weber Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.WeberPointsType
	 * @generated
	 */
	public Adapter createWeberPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link audiogram502.WeberPointType <em>Weber Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see audiogram502.WeberPointType
	 * @generated
	 */
	public Adapter createWeberPointTypeAdapter() {
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

} //Audiogram502AdapterFactory
