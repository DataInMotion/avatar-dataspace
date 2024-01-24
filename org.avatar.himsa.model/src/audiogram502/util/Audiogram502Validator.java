/**
 */
package audiogram502.util;

import audiogram502.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see audiogram502.Audiogram502Package
 * @generated
 */
public class Audiogram502Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Audiogram502Validator INSTANCE = new Audiogram502Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "audiogram502";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audiogram502Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Audiogram502Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE:
				return validateAdditionalMasking2Type((AdditionalMasking2Type)value, diagnostics, context);
			case Audiogram502Package.ADDITIONAL_MASKING_TYPE:
				return validateAdditionalMaskingType((AdditionalMaskingType)value, diagnostics, context);
			case Audiogram502Package.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE:
				return validateAlternateBinauralLoudnessBalanceAudiogramType((AlternateBinauralLoudnessBalanceAudiogramType)value, diagnostics, context);
			case Audiogram502Package.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE:
				return validateAudioMetricMeasurementConditionsType((AudioMetricMeasurementConditionsType)value, diagnostics, context);
			case Audiogram502Package.DECAY_AUDIOGRAM_TYPE:
				return validateDecayAudiogramType((DecayAudiogramType)value, diagnostics, context);
			case Audiogram502Package.DECAY_POINT_TYPE:
				return validateDecayPointType((DecayPointType)value, diagnostics, context);
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE:
				return validateDeviceSolutionsType((DeviceSolutionsType)value, diagnostics, context);
			case Audiogram502Package.DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE:
				return validateDifferenceLimenFrequencyPointType((DifferenceLimenFrequencyPointType)value, diagnostics, context);
			case Audiogram502Package.DIFFERENCE_LIMEN_FREQUENCY_TYPE:
				return validateDifferenceLimenFrequencyType((DifferenceLimenFrequencyType)value, diagnostics, context);
			case Audiogram502Package.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE:
				return validateDifferenceLimenIntensityPointType((DifferenceLimenIntensityPointType)value, diagnostics, context);
			case Audiogram502Package.DIFFERENCE_LIMEN_INTENSITY_TYPE:
				return validateDifferenceLimenIntensityType((DifferenceLimenIntensityType)value, diagnostics, context);
			case Audiogram502Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Audiogram502Package.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE:
				return validateFrequenciesUsedForToneAverageType((FrequenciesUsedForToneAverageType)value, diagnostics, context);
			case Audiogram502Package.HIMSA_AUDIOMETRIC_STANDARD_TYPE:
				return validateHIMSAAudiometricStandardType((HIMSAAudiometricStandardType)value, diagnostics, context);
			case Audiogram502Package.INFORMATION_TYPE:
				return validateInformationType((InformationType)value, diagnostics, context);
			case Audiogram502Package.MEASUREMENT_NOTES_TYPE:
				return validateMeasurementNotesType((MeasurementNotesType)value, diagnostics, context);
			case Audiogram502Package.MOST_COMFORTABLE_LEVEL_TYPE:
				return validateMostComfortableLevelType((MostComfortableLevelType)value, diagnostics, context);
			case Audiogram502Package.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT:
				return validateShortIncrementSensitivityIndexPoint((ShortIncrementSensitivityIndexPoint)value, diagnostics, context);
			case Audiogram502Package.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE:
				return validateShortIncrementSensitivityIndexType((ShortIncrementSensitivityIndexType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE:
				return validateSpeechDiscriminationAudiogramType((SpeechDiscriminationAudiogramType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE:
				return validateSpeechMostComfortableLevelType((SpeechMostComfortableLevelType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE:
				return validateSpeechReceptionThresholdAudiogramType((SpeechReceptionThresholdAudiogramType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE:
				return validateSpeechScorePointType((SpeechScorePointType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_UNCOMFORTABLE_LEVEL_TYPE:
				return validateSpeechUncomfortableLevelType((SpeechUncomfortableLevelType)value, diagnostics, context);
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE:
				return validateStengerAudiogramType((StengerAudiogramType)value, diagnostics, context);
			case Audiogram502Package.SUPPLEMENTARY_DATA_TYPE:
				return validateSupplementaryDataType((SupplementaryDataType)value, diagnostics, context);
			case Audiogram502Package.TONE_POINTS_TYPE:
				return validateTonePointsType((TonePointsType)value, diagnostics, context);
			case Audiogram502Package.TONE_THRESHOLD_AUDIOGRAM_TYPE:
				return validateToneThresholdAudiogramType((ToneThresholdAudiogramType)value, diagnostics, context);
			case Audiogram502Package.UNCOMFORTABLE_LEVEL_TYPE:
				return validateUncomfortableLevelType((UncomfortableLevelType)value, diagnostics, context);
			case Audiogram502Package.WEBER_POINTS_TYPE:
				return validateWeberPointsType((WeberPointsType)value, diagnostics, context);
			case Audiogram502Package.WEBER_POINT_TYPE:
				return validateWeberPointType((WeberPointType)value, diagnostics, context);
			case Audiogram502Package.AIDED_SOLUTIONS_TYPE:
				return validateAidedSolutionsType((AidedSolutionsType)value, diagnostics, context);
			case Audiogram502Package.AUXILIARY_PARAMETER_TYPE:
				return validateAuxiliaryParameterType((AuxiliaryParameterType)value, diagnostics, context);
			case Audiogram502Package.DBWEIGHTING_TYPE:
				return validateDBweightingType((DBweightingType)value, diagnostics, context);
			case Audiogram502Package.EAR_TYPE:
				return validateEarType((EarType)value, diagnostics, context);
			case Audiogram502Package.ESTIMATED_RESULT_BY_TYPE:
				return validateEstimatedResultByType((EstimatedResultByType)value, diagnostics, context);
			case Audiogram502Package.HEARING_INSTRUMENT_CONDITION_TYPE:
				return validateHearingInstrumentConditionType((HearingInstrumentConditionType)value, diagnostics, context);
			case Audiogram502Package.POINT_STATUS_TYPE:
				return validatePointStatusType((PointStatusType)value, diagnostics, context);
			case Audiogram502Package.PRESENTATION_TYPE:
				return validatePresentationType((PresentationType)value, diagnostics, context);
			case Audiogram502Package.SIGNAL_OUTPUT_TYPE:
				return validateSignalOutputType((SignalOutputType)value, diagnostics, context);
			case Audiogram502Package.SIGNAL_TYPE:
				return validateSignalType((SignalType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_THRESHOLD_TYPE:
				return validateSpeechThresholdType((SpeechThresholdType)value, diagnostics, context);
			case Audiogram502Package.TONE_AVERAGE_TYPE:
				return validateToneAverageType((ToneAverageType)value, diagnostics, context);
			case Audiogram502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE:
				return validateTransducerCalibrationStandardType((TransducerCalibrationStandardType)value, diagnostics, context);
			case Audiogram502Package.TRANSDUCER_TYPE:
				return validateTransducerType((TransducerType)value, diagnostics, context);
			case Audiogram502Package.WEBER_POINT_STATUS_TYPE:
				return validateWeberPointStatusType((WeberPointStatusType)value, diagnostics, context);
			case Audiogram502Package.ADDITIONAL_MASKING_LEVEL_TYPE:
				return validateAdditionalMaskingLevelType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.ADDITIONAL_MASKING_LEVEL_TYPE1:
				return validateAdditionalMaskingLevelType1((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE:
				return validateAdditionalStimulusLevelType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE1:
				return validateAdditionalStimulusLevelType1((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.AIDED_SOLUTIONS_TYPE_OBJECT:
				return validateAidedSolutionsTypeObject((AidedSolutionsType)value, diagnostics, context);
			case Audiogram502Package.AUDIOMETER_MAKE_MODEL_TYPE:
				return validateAudiometerMakeModelType((String)value, diagnostics, context);
			case Audiogram502Package.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return validateAudiometerSerialNumberType((String)value, diagnostics, context);
			case Audiogram502Package.AUXILIARY_PARAMETER_DESCRIPTION_TYPE:
				return validateAuxiliaryParameterDescriptionType((String)value, diagnostics, context);
			case Audiogram502Package.AUXILIARY_PARAMETER_TYPE_OBJECT:
				return validateAuxiliaryParameterTypeObject((AuxiliaryParameterType)value, diagnostics, context);
			case Audiogram502Package.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return validateConvertedFromDataStandardType((BigInteger)value, diagnostics, context);
			case Audiogram502Package.DBWEIGHTING_TYPE_OBJECT:
				return validateDBweightingTypeObject((DBweightingType)value, diagnostics, context);
			case Audiogram502Package.EAR_TYPE_OBJECT:
				return validateEarTypeObject((EarType)value, diagnostics, context);
			case Audiogram502Package.END_TIME_TYPE:
				return validateEndTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.ESTIMATED_RESULT_BY_TYPE_OBJECT:
				return validateEstimatedResultByTypeObject((EstimatedResultByType)value, diagnostics, context);
			case Audiogram502Package.HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT:
				return validateHearingInstrumentConditionTypeObject((HearingInstrumentConditionType)value, diagnostics, context);
			case Audiogram502Package.HEARING_INSTRUMENT_DESCRIPTION_TYPE:
				return validateHearingInstrumentDescriptionType((String)value, diagnostics, context);
			case Audiogram502Package.LEFT_EAR1_TYPE:
				return validateLeftEar1Type((ToneAverageType)value, diagnostics, context);
			case Audiogram502Package.MASKING_AMPLITUDE_MODULATION_TYPE:
				return validateMaskingAmplitudeModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_FREQUENCY_MODULATION_TYPE:
				return validateMaskingFrequencyModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE:
				return validateMaskingLevelType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE1:
				return validateMaskingLevelType1((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE2:
				return validateMaskingLevelType2((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE3:
				return validateMaskingLevelType3((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE4:
				return validateMaskingLevelType4((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_LEVEL_TYPE5:
				return validateMaskingLevelType5((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_OFF_TIME_TYPE:
				return validateMaskingOffTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_ON_TIME_TYPE:
				return validateMaskingOnTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_PULSE_CYCLE_TYPE:
				return validateMaskingPulseCycleType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_PULSE_MODULATION_TYPE:
				return validateMaskingPulseModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_SI_SI_PARAMETER_TYPE:
				return validateMaskingSiSiParameterType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MASKING_WARBLE_MODULATION_SIZE_TYPE:
				return validateMaskingWarbleModulationSizeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MODULATION_SIZE_TYPE:
				return validateModulationSizeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MODULATION_SIZE_TYPE1:
				return validateModulationSizeType1((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.MODULATION_SIZE_TYPE2:
				return validateModulationSizeType2((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.POINT_STATUS_TYPE_OBJECT:
				return validatePointStatusTypeObject((PointStatusType)value, diagnostics, context);
			case Audiogram502Package.PRESENTATION_TYPE_OBJECT:
				return validatePresentationTypeObject((PresentationType)value, diagnostics, context);
			case Audiogram502Package.SCORE_PERCENT_TYPE:
				return validateScorePercentType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.SIGNAL_OUTPUT_TYPE_OBJECT:
				return validateSignalOutputTypeObject((SignalOutputType)value, diagnostics, context);
			case Audiogram502Package.SIGNAL_TYPE_OBJECT:
				return validateSignalTypeObject((SignalType)value, diagnostics, context);
			case Audiogram502Package.SPEECH_THRESHOLD_TYPE_OBJECT:
				return validateSpeechThresholdTypeObject((SpeechThresholdType)value, diagnostics, context);
			case Audiogram502Package.START_TIME_TYPE:
				return validateStartTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return validateStimulusAmplitudeModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return validateStimulusFrequencyModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE:
				return validateStimulusLevelType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE1:
				return validateStimulusLevelType1((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE2:
				return validateStimulusLevelType2((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE3:
				return validateStimulusLevelType3((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE4:
				return validateStimulusLevelType4((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE5:
				return validateStimulusLevelType5((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_LEVEL_TYPE6:
				return validateStimulusLevelType6((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_OFF_TIME_TYPE:
				return validateStimulusOffTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_ON_TIME_TYPE:
				return validateStimulusOnTimeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_PRESENTATION_TYPE_TYPE:
				return validateStimulusPresentationTypeType((PresentationType)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_PULSE_CYCLE_TYPE:
				return validateStimulusPulseCycleType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_PULSE_MODULATION_TYPE:
				return validateStimulusPulseModulationType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_SIGNAL_TYPE_TYPE:
				return validateStimulusSignalTypeType((SignalType)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_SI_SI_PARAMETER_TYPE:
				return validateStimulusSiSiParameterType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.STIMULUS_WARBLE_MODULATION_SIZE_TYPE:
				return validateStimulusWarbleModulationSizeType((BigDecimal)value, diagnostics, context);
			case Audiogram502Package.TEST_METHOD_TYPE:
				return validateTestMethodType((String)value, diagnostics, context);
			case Audiogram502Package.TEST_RELIABILITY_TYPE:
				return validateTestReliabilityType((String)value, diagnostics, context);
			case Audiogram502Package.TONE_AVERAGE_TYPE_OBJECT:
				return validateToneAverageTypeObject((ToneAverageType)value, diagnostics, context);
			case Audiogram502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT:
				return validateTransducerCalibrationStandardTypeObject((TransducerCalibrationStandardType)value, diagnostics, context);
			case Audiogram502Package.TRANSDUCER_DESCRIPTION_TYPE:
				return validateTransducerDescriptionType((String)value, diagnostics, context);
			case Audiogram502Package.TRANSDUCER_TYPE_OBJECT:
				return validateTransducerTypeObject((TransducerType)value, diagnostics, context);
			case Audiogram502Package.VERSION_TYPE:
				return validateVersionType((BigInteger)value, diagnostics, context);
			case Audiogram502Package.VERSION_TYPE1:
				return validateVersionType1((BigInteger)value, diagnostics, context);
			case Audiogram502Package.WEBER_POINT_STATUS_TYPE_OBJECT:
				return validateWeberPointStatusTypeObject((WeberPointStatusType)value, diagnostics, context);
			case Audiogram502Package.WORD_LIST_NAME_TYPE:
				return validateWordListNameType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMasking2Type(AdditionalMasking2Type additionalMasking2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalMasking2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMaskingType(AdditionalMaskingType additionalMaskingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalMaskingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternateBinauralLoudnessBalanceAudiogramType(AlternateBinauralLoudnessBalanceAudiogramType alternateBinauralLoudnessBalanceAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternateBinauralLoudnessBalanceAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudioMetricMeasurementConditionsType(AudioMetricMeasurementConditionsType audioMetricMeasurementConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audioMetricMeasurementConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecayAudiogramType(DecayAudiogramType decayAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decayAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecayPointType(DecayPointType decayPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decayPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceSolutionsType(DeviceSolutionsType deviceSolutionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceSolutionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferenceLimenFrequencyPointType(DifferenceLimenFrequencyPointType differenceLimenFrequencyPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differenceLimenFrequencyPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferenceLimenFrequencyType(DifferenceLimenFrequencyType differenceLimenFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differenceLimenFrequencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferenceLimenIntensityPointType(DifferenceLimenIntensityPointType differenceLimenIntensityPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differenceLimenIntensityPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferenceLimenIntensityType(DifferenceLimenIntensityType differenceLimenIntensityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differenceLimenIntensityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequenciesUsedForToneAverageType(FrequenciesUsedForToneAverageType frequenciesUsedForToneAverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequenciesUsedForToneAverageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIMSAAudiometricStandardType(HIMSAAudiometricStandardType himsaAudiometricStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(himsaAudiometricStandardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationType(InformationType informationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementNotesType(MeasurementNotesType measurementNotesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementNotesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostComfortableLevelType(MostComfortableLevelType mostComfortableLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mostComfortableLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortIncrementSensitivityIndexPoint(ShortIncrementSensitivityIndexPoint shortIncrementSensitivityIndexPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortIncrementSensitivityIndexPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortIncrementSensitivityIndexType(ShortIncrementSensitivityIndexType shortIncrementSensitivityIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortIncrementSensitivityIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechDiscriminationAudiogramType(SpeechDiscriminationAudiogramType speechDiscriminationAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechDiscriminationAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechMostComfortableLevelType(SpeechMostComfortableLevelType speechMostComfortableLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechMostComfortableLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechReceptionThresholdAudiogramType(SpeechReceptionThresholdAudiogramType speechReceptionThresholdAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechReceptionThresholdAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechScorePointType(SpeechScorePointType speechScorePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechScorePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechUncomfortableLevelType(SpeechUncomfortableLevelType speechUncomfortableLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechUncomfortableLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStengerAudiogramType(StengerAudiogramType stengerAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stengerAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplementaryDataType(SupplementaryDataType supplementaryDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplementaryDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTonePointsType(TonePointsType tonePointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tonePointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToneThresholdAudiogramType(ToneThresholdAudiogramType toneThresholdAudiogramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toneThresholdAudiogramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUncomfortableLevelType(UncomfortableLevelType uncomfortableLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uncomfortableLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeberPointsType(WeberPointsType weberPointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weberPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeberPointType(WeberPointType weberPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weberPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAidedSolutionsType(AidedSolutionsType aidedSolutionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuxiliaryParameterType(AuxiliaryParameterType auxiliaryParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBweightingType(DBweightingType dBweightingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarType(EarType earType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedResultByType(EstimatedResultByType estimatedResultByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentConditionType(HearingInstrumentConditionType hearingInstrumentConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointStatusType(PointStatusType pointStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationType(PresentationType presentationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalOutputType(SignalOutputType signalOutputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalType(SignalType signalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechThresholdType(SpeechThresholdType speechThresholdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToneAverageType(ToneAverageType toneAverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerCalibrationStandardType(TransducerCalibrationStandardType transducerCalibrationStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerType(TransducerType transducerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeberPointStatusType(WeberPointStatusType weberPointStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMaskingLevelType(BigDecimal additionalMaskingLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdditionalMaskingLevelType_FractionDigits(additionalMaskingLevelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Additional Masking Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMaskingLevelType_FractionDigits(BigDecimal additionalMaskingLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = additionalMaskingLevelType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.ADDITIONAL_MASKING_LEVEL_TYPE, additionalMaskingLevelType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMaskingLevelType1(BigDecimal additionalMaskingLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdditionalMaskingLevelType1_FractionDigits(additionalMaskingLevelType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Additional Masking Level Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalMaskingLevelType1_FractionDigits(BigDecimal additionalMaskingLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = additionalMaskingLevelType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.ADDITIONAL_MASKING_LEVEL_TYPE1, additionalMaskingLevelType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalStimulusLevelType(BigDecimal additionalStimulusLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdditionalStimulusLevelType_FractionDigits(additionalStimulusLevelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Additional Stimulus Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalStimulusLevelType_FractionDigits(BigDecimal additionalStimulusLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = additionalStimulusLevelType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.ADDITIONAL_STIMULUS_LEVEL_TYPE, additionalStimulusLevelType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalStimulusLevelType1(BigDecimal additionalStimulusLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdditionalStimulusLevelType1_FractionDigits(additionalStimulusLevelType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Additional Stimulus Level Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalStimulusLevelType1_FractionDigits(BigDecimal additionalStimulusLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = additionalStimulusLevelType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.ADDITIONAL_STIMULUS_LEVEL_TYPE1, additionalStimulusLevelType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAidedSolutionsTypeObject(AidedSolutionsType aidedSolutionsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudiometerMakeModelType(String audiometerMakeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAudiometerMakeModelType_MaxLength(audiometerMakeModelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Audiometer Make Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudiometerMakeModelType_MaxLength(String audiometerMakeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = audiometerMakeModelType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.AUDIOMETER_MAKE_MODEL_TYPE, audiometerMakeModelType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudiometerSerialNumberType(String audiometerSerialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAudiometerSerialNumberType_MaxLength(audiometerSerialNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Audiometer Serial Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudiometerSerialNumberType_MaxLength(String audiometerSerialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = audiometerSerialNumberType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.AUDIOMETER_SERIAL_NUMBER_TYPE, audiometerSerialNumberType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuxiliaryParameterDescriptionType(String auxiliaryParameterDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAuxiliaryParameterDescriptionType_MaxLength(auxiliaryParameterDescriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Auxiliary Parameter Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuxiliaryParameterDescriptionType_MaxLength(String auxiliaryParameterDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = auxiliaryParameterDescriptionType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.AUXILIARY_PARAMETER_DESCRIPTION_TYPE, auxiliaryParameterDescriptionType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuxiliaryParameterTypeObject(AuxiliaryParameterType auxiliaryParameterTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvertedFromDataStandardType(BigInteger convertedFromDataStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConvertedFromDataStandardType_Min(convertedFromDataStandardType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConvertedFromDataStandardType_Min
	 */
	public static final BigInteger CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE = new BigInteger("100");

	/**
	 * Validates the Min constraint of '<em>Converted From Data Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvertedFromDataStandardType_Min(BigInteger convertedFromDataStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = convertedFromDataStandardType.compareTo(CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.CONVERTED_FROM_DATA_STANDARD_TYPE, convertedFromDataStandardType, CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBweightingTypeObject(DBweightingType dBweightingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarTypeObject(EarType earTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTimeType(BigDecimal endTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEndTimeType_FractionDigits(endTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndTimeType_Min(endTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>End Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTimeType_FractionDigits(BigDecimal endTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = endTimeType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.END_TIME_TYPE, endTimeType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEndTimeType_Min
	 */
	public static final BigDecimal END_TIME_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>End Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTimeType_Min(BigDecimal endTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = endTimeType.compareTo(END_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.END_TIME_TYPE, endTimeType, END_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedResultByTypeObject(EstimatedResultByType estimatedResultByTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentConditionTypeObject(HearingInstrumentConditionType hearingInstrumentConditionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentDescriptionType(String hearingInstrumentDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHearingInstrumentDescriptionType_MaxLength(hearingInstrumentDescriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hearing Instrument Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentDescriptionType_MaxLength(String hearingInstrumentDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hearingInstrumentDescriptionType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.HEARING_INSTRUMENT_DESCRIPTION_TYPE, hearingInstrumentDescriptionType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftEar1Type(ToneAverageType leftEar1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingAmplitudeModulationType(BigDecimal maskingAmplitudeModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingAmplitudeModulationType_FractionDigits(maskingAmplitudeModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Amplitude Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingAmplitudeModulationType_FractionDigits(BigDecimal maskingAmplitudeModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingAmplitudeModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_AMPLITUDE_MODULATION_TYPE, maskingAmplitudeModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyModulationType(BigDecimal maskingFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingFrequencyModulationType_FractionDigits(maskingFrequencyModulationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingFrequencyModulationType_Min(maskingFrequencyModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Frequency Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyModulationType_FractionDigits(BigDecimal maskingFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingFrequencyModulationType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_FREQUENCY_MODULATION_TYPE, maskingFrequencyModulationType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingFrequencyModulationType_Min
	 */
	public static final BigDecimal MASKING_FREQUENCY_MODULATION_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Masking Frequency Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyModulationType_Min(BigDecimal maskingFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingFrequencyModulationType.compareTo(MASKING_FREQUENCY_MODULATION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_FREQUENCY_MODULATION_TYPE, maskingFrequencyModulationType, MASKING_FREQUENCY_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType(BigDecimal maskingLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType_FractionDigits(maskingLevelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType_FractionDigits(BigDecimal maskingLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE, maskingLevelType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType1(BigDecimal maskingLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType1_FractionDigits(maskingLevelType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType1_FractionDigits(BigDecimal maskingLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE1, maskingLevelType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType2(BigDecimal maskingLevelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType2_FractionDigits(maskingLevelType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType2_FractionDigits(BigDecimal maskingLevelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType2.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE2, maskingLevelType2, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType3(BigDecimal maskingLevelType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType3_FractionDigits(maskingLevelType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType3_FractionDigits(BigDecimal maskingLevelType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType3.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE3, maskingLevelType3, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType4(BigDecimal maskingLevelType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType4_FractionDigits(maskingLevelType4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType4_FractionDigits(BigDecimal maskingLevelType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType4.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE4, maskingLevelType4, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType5(BigDecimal maskingLevelType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingLevelType5_FractionDigits(maskingLevelType5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Level Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingLevelType5_FractionDigits(BigDecimal maskingLevelType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingLevelType5.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_LEVEL_TYPE5, maskingLevelType5, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOffTimeType(BigDecimal maskingOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingOffTimeType_FractionDigits(maskingOffTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingOffTimeType_Min(maskingOffTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Off Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOffTimeType_FractionDigits(BigDecimal maskingOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingOffTimeType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_OFF_TIME_TYPE, maskingOffTimeType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingOffTimeType_Min
	 */
	public static final BigDecimal MASKING_OFF_TIME_TYPE__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Masking Off Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOffTimeType_Min(BigDecimal maskingOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingOffTimeType.compareTo(MASKING_OFF_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_OFF_TIME_TYPE, maskingOffTimeType, MASKING_OFF_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOnTimeType(BigDecimal maskingOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingOnTimeType_FractionDigits(maskingOnTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingOnTimeType_Min(maskingOnTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking On Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOnTimeType_FractionDigits(BigDecimal maskingOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingOnTimeType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_ON_TIME_TYPE, maskingOnTimeType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingOnTimeType_Min
	 */
	public static final BigDecimal MASKING_ON_TIME_TYPE__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Masking On Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingOnTimeType_Min(BigDecimal maskingOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingOnTimeType.compareTo(MASKING_ON_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_ON_TIME_TYPE, maskingOnTimeType, MASKING_ON_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseCycleType(BigDecimal maskingPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingPulseCycleType_FractionDigits(maskingPulseCycleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingPulseCycleType_Min(maskingPulseCycleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Pulse Cycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseCycleType_FractionDigits(BigDecimal maskingPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingPulseCycleType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_PULSE_CYCLE_TYPE, maskingPulseCycleType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingPulseCycleType_Min
	 */
	public static final BigDecimal MASKING_PULSE_CYCLE_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Masking Pulse Cycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseCycleType_Min(BigDecimal maskingPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingPulseCycleType.compareTo(MASKING_PULSE_CYCLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_PULSE_CYCLE_TYPE, maskingPulseCycleType, MASKING_PULSE_CYCLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseModulationType(BigDecimal maskingPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingPulseModulationType_FractionDigits(maskingPulseModulationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingPulseModulationType_Min(maskingPulseModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Pulse Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseModulationType_FractionDigits(BigDecimal maskingPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingPulseModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_PULSE_MODULATION_TYPE, maskingPulseModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingPulseModulationType_Min
	 */
	public static final BigDecimal MASKING_PULSE_MODULATION_TYPE__MIN__VALUE = new BigDecimal("0.0");

	/**
	 * Validates the Min constraint of '<em>Masking Pulse Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingPulseModulationType_Min(BigDecimal maskingPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingPulseModulationType.compareTo(MASKING_PULSE_MODULATION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_PULSE_MODULATION_TYPE, maskingPulseModulationType, MASKING_PULSE_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingSiSiParameterType(BigDecimal maskingSiSiParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingSiSiParameterType_FractionDigits(maskingSiSiParameterType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Si Si Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingSiSiParameterType_FractionDigits(BigDecimal maskingSiSiParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingSiSiParameterType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_SI_SI_PARAMETER_TYPE, maskingSiSiParameterType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingWarbleModulationSizeType(BigDecimal maskingWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingWarbleModulationSizeType_FractionDigits(maskingWarbleModulationSizeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaskingWarbleModulationSizeType_Min(maskingWarbleModulationSizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Warble Modulation Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingWarbleModulationSizeType_FractionDigits(BigDecimal maskingWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingWarbleModulationSizeType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MASKING_WARBLE_MODULATION_SIZE_TYPE, maskingWarbleModulationSizeType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingWarbleModulationSizeType_Min
	 */
	public static final BigDecimal MASKING_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Masking Warble Modulation Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingWarbleModulationSizeType_Min(BigDecimal maskingWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingWarbleModulationSizeType.compareTo(MASKING_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MASKING_WARBLE_MODULATION_SIZE_TYPE, maskingWarbleModulationSizeType, MASKING_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType(BigDecimal modulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModulationSizeType_FractionDigits(modulationSizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Modulation Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType_FractionDigits(BigDecimal modulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = modulationSizeType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MODULATION_SIZE_TYPE, modulationSizeType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType1(BigDecimal modulationSizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModulationSizeType1_TotalDigits(modulationSizeType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateModulationSizeType1_Min(modulationSizeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TotalDigits constraint of '<em>Modulation Size Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType1_TotalDigits(BigDecimal modulationSizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int scale = modulationSizeType1.scale();
		int totalDigits = scale < 0 ? modulationSizeType1.precision() - scale : modulationSizeType1.precision();
		boolean result = totalDigits <= 2;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(Audiogram502Package.Literals.MODULATION_SIZE_TYPE1, modulationSizeType1, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateModulationSizeType1_Min
	 */
	public static final BigDecimal MODULATION_SIZE_TYPE1__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Modulation Size Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType1_Min(BigDecimal modulationSizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = modulationSizeType1.compareTo(MODULATION_SIZE_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MODULATION_SIZE_TYPE1, modulationSizeType1, MODULATION_SIZE_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType2(BigDecimal modulationSizeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModulationSizeType2_FractionDigits(modulationSizeType2, diagnostics, context);
		if (result || diagnostics != null) result &= validateModulationSizeType2_Min(modulationSizeType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Modulation Size Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType2_FractionDigits(BigDecimal modulationSizeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = modulationSizeType2.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.MODULATION_SIZE_TYPE2, modulationSizeType2, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateModulationSizeType2_Min
	 */
	public static final BigDecimal MODULATION_SIZE_TYPE2__MIN__VALUE = new BigDecimal("0.0");

	/**
	 * Validates the Min constraint of '<em>Modulation Size Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulationSizeType2_Min(BigDecimal modulationSizeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = modulationSizeType2.compareTo(MODULATION_SIZE_TYPE2__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.MODULATION_SIZE_TYPE2, modulationSizeType2, MODULATION_SIZE_TYPE2__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointStatusTypeObject(PointStatusType pointStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationTypeObject(PresentationType presentationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScorePercentType(BigDecimal scorePercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScorePercentType_FractionDigits(scorePercentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScorePercentType_Min(scorePercentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Score Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScorePercentType_FractionDigits(BigDecimal scorePercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scorePercentType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.SCORE_PERCENT_TYPE, scorePercentType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScorePercentType_Min
	 */
	public static final BigDecimal SCORE_PERCENT_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Score Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScorePercentType_Min(BigDecimal scorePercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scorePercentType.compareTo(SCORE_PERCENT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.SCORE_PERCENT_TYPE, scorePercentType, SCORE_PERCENT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalOutputTypeObject(SignalOutputType signalOutputTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalTypeObject(SignalType signalTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechThresholdTypeObject(SpeechThresholdType speechThresholdTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimeType(BigDecimal startTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStartTimeType_FractionDigits(startTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartTimeType_Min(startTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Start Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimeType_FractionDigits(BigDecimal startTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = startTimeType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.START_TIME_TYPE, startTimeType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStartTimeType_Min
	 */
	public static final BigDecimal START_TIME_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Start Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimeType_Min(BigDecimal startTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = startTimeType.compareTo(START_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.START_TIME_TYPE, startTimeType, START_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusAmplitudeModulationType(BigDecimal stimulusAmplitudeModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusAmplitudeModulationType_FractionDigits(stimulusAmplitudeModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Amplitude Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusAmplitudeModulationType_FractionDigits(BigDecimal stimulusAmplitudeModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusAmplitudeModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_AMPLITUDE_MODULATION_TYPE, stimulusAmplitudeModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyModulationType(BigDecimal stimulusFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusFrequencyModulationType_FractionDigits(stimulusFrequencyModulationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusFrequencyModulationType_Min(stimulusFrequencyModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Frequency Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyModulationType_FractionDigits(BigDecimal stimulusFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusFrequencyModulationType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_FREQUENCY_MODULATION_TYPE, stimulusFrequencyModulationType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusFrequencyModulationType_Min
	 */
	public static final BigDecimal STIMULUS_FREQUENCY_MODULATION_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Stimulus Frequency Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyModulationType_Min(BigDecimal stimulusFrequencyModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusFrequencyModulationType.compareTo(STIMULUS_FREQUENCY_MODULATION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_FREQUENCY_MODULATION_TYPE, stimulusFrequencyModulationType, STIMULUS_FREQUENCY_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType(BigDecimal stimulusLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType_FractionDigits(stimulusLevelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType_FractionDigits(BigDecimal stimulusLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE, stimulusLevelType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType1(BigDecimal stimulusLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType1_FractionDigits(stimulusLevelType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType1_FractionDigits(BigDecimal stimulusLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE1, stimulusLevelType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType2(BigDecimal stimulusLevelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType3(BigDecimal stimulusLevelType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType3_FractionDigits(stimulusLevelType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType3_FractionDigits(BigDecimal stimulusLevelType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType3.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE3, stimulusLevelType3, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType4(BigDecimal stimulusLevelType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType4_FractionDigits(stimulusLevelType4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType4_FractionDigits(BigDecimal stimulusLevelType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType4.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE4, stimulusLevelType4, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType5(BigDecimal stimulusLevelType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType5_FractionDigits(stimulusLevelType5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType5_FractionDigits(BigDecimal stimulusLevelType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType5.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE5, stimulusLevelType5, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType6(BigDecimal stimulusLevelType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusLevelType6_FractionDigits(stimulusLevelType6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Level Type6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusLevelType6_FractionDigits(BigDecimal stimulusLevelType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusLevelType6.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_LEVEL_TYPE6, stimulusLevelType6, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOffTimeType(BigDecimal stimulusOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusOffTimeType_FractionDigits(stimulusOffTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusOffTimeType_Min(stimulusOffTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Off Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOffTimeType_FractionDigits(BigDecimal stimulusOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusOffTimeType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_OFF_TIME_TYPE, stimulusOffTimeType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusOffTimeType_Min
	 */
	public static final BigDecimal STIMULUS_OFF_TIME_TYPE__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Stimulus Off Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOffTimeType_Min(BigDecimal stimulusOffTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusOffTimeType.compareTo(STIMULUS_OFF_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_OFF_TIME_TYPE, stimulusOffTimeType, STIMULUS_OFF_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOnTimeType(BigDecimal stimulusOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusOnTimeType_FractionDigits(stimulusOnTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusOnTimeType_Min(stimulusOnTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus On Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOnTimeType_FractionDigits(BigDecimal stimulusOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusOnTimeType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_ON_TIME_TYPE, stimulusOnTimeType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusOnTimeType_Min
	 */
	public static final BigDecimal STIMULUS_ON_TIME_TYPE__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Stimulus On Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusOnTimeType_Min(BigDecimal stimulusOnTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusOnTimeType.compareTo(STIMULUS_ON_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_ON_TIME_TYPE, stimulusOnTimeType, STIMULUS_ON_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPresentationTypeType(PresentationType stimulusPresentationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseCycleType(BigDecimal stimulusPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusPulseCycleType_FractionDigits(stimulusPulseCycleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusPulseCycleType_Min(stimulusPulseCycleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Pulse Cycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseCycleType_FractionDigits(BigDecimal stimulusPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusPulseCycleType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_PULSE_CYCLE_TYPE, stimulusPulseCycleType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusPulseCycleType_Min
	 */
	public static final BigDecimal STIMULUS_PULSE_CYCLE_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Stimulus Pulse Cycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseCycleType_Min(BigDecimal stimulusPulseCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusPulseCycleType.compareTo(STIMULUS_PULSE_CYCLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_PULSE_CYCLE_TYPE, stimulusPulseCycleType, STIMULUS_PULSE_CYCLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseModulationType(BigDecimal stimulusPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusPulseModulationType_FractionDigits(stimulusPulseModulationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusPulseModulationType_Min(stimulusPulseModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Pulse Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseModulationType_FractionDigits(BigDecimal stimulusPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusPulseModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_PULSE_MODULATION_TYPE, stimulusPulseModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusPulseModulationType_Min
	 */
	public static final BigDecimal STIMULUS_PULSE_MODULATION_TYPE__MIN__VALUE = new BigDecimal("0.0");

	/**
	 * Validates the Min constraint of '<em>Stimulus Pulse Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseModulationType_Min(BigDecimal stimulusPulseModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusPulseModulationType.compareTo(STIMULUS_PULSE_MODULATION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_PULSE_MODULATION_TYPE, stimulusPulseModulationType, STIMULUS_PULSE_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusSignalTypeType(SignalType stimulusSignalTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusSiSiParameterType(BigDecimal stimulusSiSiParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusSiSiParameterType_FractionDigits(stimulusSiSiParameterType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Si Si Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusSiSiParameterType_FractionDigits(BigDecimal stimulusSiSiParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusSiSiParameterType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_SI_SI_PARAMETER_TYPE, stimulusSiSiParameterType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusWarbleModulationSizeType(BigDecimal stimulusWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusWarbleModulationSizeType_FractionDigits(stimulusWarbleModulationSizeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStimulusWarbleModulationSizeType_Min(stimulusWarbleModulationSizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Warble Modulation Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusWarbleModulationSizeType_FractionDigits(BigDecimal stimulusWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusWarbleModulationSizeType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Audiogram502Package.Literals.STIMULUS_WARBLE_MODULATION_SIZE_TYPE, stimulusWarbleModulationSizeType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusWarbleModulationSizeType_Min
	 */
	public static final BigDecimal STIMULUS_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Stimulus Warble Modulation Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusWarbleModulationSizeType_Min(BigDecimal stimulusWarbleModulationSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusWarbleModulationSizeType.compareTo(STIMULUS_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.STIMULUS_WARBLE_MODULATION_SIZE_TYPE, stimulusWarbleModulationSizeType, STIMULUS_WARBLE_MODULATION_SIZE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestMethodType(String testMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTestMethodType_MaxLength(testMethodType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Test Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestMethodType_MaxLength(String testMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = testMethodType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.TEST_METHOD_TYPE, testMethodType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReliabilityType(String testReliabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTestReliabilityType_MaxLength(testReliabilityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Test Reliability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReliabilityType_MaxLength(String testReliabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = testReliabilityType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.TEST_RELIABILITY_TYPE, testReliabilityType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToneAverageTypeObject(ToneAverageType toneAverageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerCalibrationStandardTypeObject(TransducerCalibrationStandardType transducerCalibrationStandardTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerDescriptionType(String transducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTransducerDescriptionType_MaxLength(transducerDescriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Transducer Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerDescriptionType_MaxLength(String transducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transducerDescriptionType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.TRANSDUCER_DESCRIPTION_TYPE, transducerDescriptionType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransducerTypeObject(TransducerType transducerTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType_Min(versionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionType_Min
	 */
	public static final BigInteger VERSION_TYPE__MIN__VALUE = new BigInteger("500");

	/**
	 * Validates the Min constraint of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType_Min(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = versionType.compareTo(VERSION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Audiogram502Package.Literals.VERSION_TYPE, versionType, VERSION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType1(BigInteger versionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeberPointStatusTypeObject(WeberPointStatusType weberPointStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWordListNameType(String wordListNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWordListNameType_MaxLength(wordListNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Word List Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWordListNameType_MaxLength(String wordListNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = wordListNameType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Audiogram502Package.Literals.WORD_LIST_NAME_TYPE, wordListNameType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Audiogram502Validator
