/**
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _502FactoryImpl extends EFactoryImpl implements _502Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _502Factory init() {
		try {
			_502Factory the_502Factory = (_502Factory)EPackage.Registry.INSTANCE.getEFactory(_502Package.eNS_URI);
			if (the_502Factory != null) {
				return the_502Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _502FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _502FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _502Package.ADDITIONAL_MASKING2_TYPE: return createAdditionalMasking2Type();
			case _502Package.ADDITIONAL_MASKING_TYPE: return createAdditionalMaskingType();
			case _502Package.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE: return createAlternateBinauralLoudnessBalanceAudiogramType();
			case _502Package.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE: return createAudioMetricMeasurementConditionsType();
			case _502Package.DECAY_AUDIOGRAM_TYPE: return createDecayAudiogramType();
			case _502Package.DECAY_POINT_TYPE: return createDecayPointType();
			case _502Package.DEVICE_SOLUTIONS_TYPE: return createDeviceSolutionsType();
			case _502Package.DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE: return createDifferenceLimenFrequencyPointType();
			case _502Package.DIFFERENCE_LIMEN_FREQUENCY_TYPE: return createDifferenceLimenFrequencyType();
			case _502Package.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE: return createDifferenceLimenIntensityPointType();
			case _502Package.DIFFERENCE_LIMEN_INTENSITY_TYPE: return createDifferenceLimenIntensityType();
			case _502Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _502Package.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE: return createFrequenciesUsedForToneAverageType();
			case _502Package.HIMSA_AUDIOMETRIC_STANDARD_TYPE: return createHIMSAAudiometricStandardType();
			case _502Package.INFORMATION_TYPE: return createInformationType();
			case _502Package.MEASUREMENT_NOTES_TYPE: return createMeasurementNotesType();
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE: return createMostComfortableLevelType();
			case _502Package.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT: return createShortIncrementSensitivityIndexPoint();
			case _502Package.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE: return createShortIncrementSensitivityIndexType();
			case _502Package.SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE: return createSpeechDiscriminationAudiogramType();
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE: return createSpeechMostComfortableLevelType();
			case _502Package.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE: return createSpeechReceptionThresholdAudiogramType();
			case _502Package.SPEECH_SCORE_POINT_TYPE: return createSpeechScorePointType();
			case _502Package.SPEECH_UNCOMFORTABLE_LEVEL_TYPE: return createSpeechUncomfortableLevelType();
			case _502Package.STENGER_AUDIOGRAM_TYPE: return createStengerAudiogramType();
			case _502Package.SUPPLEMENTARY_DATA_TYPE: return createSupplementaryDataType();
			case _502Package.TONE_POINTS_TYPE: return createTonePointsType();
			case _502Package.TONE_THRESHOLD_AUDIOGRAM_TYPE: return createToneThresholdAudiogramType();
			case _502Package.UNCOMFORTABLE_LEVEL_TYPE: return createUncomfortableLevelType();
			case _502Package.WEBER_POINTS_TYPE: return createWeberPointsType();
			case _502Package.WEBER_POINT_TYPE: return createWeberPointType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _502Package.AIDED_SOLUTIONS_TYPE:
				return createAidedSolutionsTypeFromString(eDataType, initialValue);
			case _502Package.AUXILIARY_PARAMETER_TYPE:
				return createAuxiliaryParameterTypeFromString(eDataType, initialValue);
			case _502Package.DBWEIGHTING_TYPE:
				return createDBweightingTypeFromString(eDataType, initialValue);
			case _502Package.EAR_TYPE:
				return createEarTypeFromString(eDataType, initialValue);
			case _502Package.ESTIMATED_RESULT_BY_TYPE:
				return createEstimatedResultByTypeFromString(eDataType, initialValue);
			case _502Package.HEARING_INSTRUMENT_CONDITION_TYPE:
				return createHearingInstrumentConditionTypeFromString(eDataType, initialValue);
			case _502Package.POINT_STATUS_TYPE:
				return createPointStatusTypeFromString(eDataType, initialValue);
			case _502Package.PRESENTATION_TYPE:
				return createPresentationTypeFromString(eDataType, initialValue);
			case _502Package.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case _502Package.SIGNAL_TYPE:
				return createSignalTypeFromString(eDataType, initialValue);
			case _502Package.SPEECH_THRESHOLD_TYPE:
				return createSpeechThresholdTypeFromString(eDataType, initialValue);
			case _502Package.TONE_AVERAGE_TYPE:
				return createToneAverageTypeFromString(eDataType, initialValue);
			case _502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE:
				return createTransducerCalibrationStandardTypeFromString(eDataType, initialValue);
			case _502Package.TRANSDUCER_TYPE:
				return createTransducerTypeFromString(eDataType, initialValue);
			case _502Package.WEBER_POINT_STATUS_TYPE:
				return createWeberPointStatusTypeFromString(eDataType, initialValue);
			case _502Package.ADDITIONAL_MASKING_LEVEL_TYPE:
				return createAdditionalMaskingLevelTypeFromString(eDataType, initialValue);
			case _502Package.ADDITIONAL_MASKING_LEVEL_TYPE1:
				return createAdditionalMaskingLevelType1FromString(eDataType, initialValue);
			case _502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE:
				return createAdditionalStimulusLevelTypeFromString(eDataType, initialValue);
			case _502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE1:
				return createAdditionalStimulusLevelType1FromString(eDataType, initialValue);
			case _502Package.AIDED_SOLUTIONS_TYPE_OBJECT:
				return createAidedSolutionsTypeObjectFromString(eDataType, initialValue);
			case _502Package.AUDIOMETER_MAKE_MODEL_TYPE:
				return createAudiometerMakeModelTypeFromString(eDataType, initialValue);
			case _502Package.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return createAudiometerSerialNumberTypeFromString(eDataType, initialValue);
			case _502Package.AUXILIARY_PARAMETER_DESCRIPTION_TYPE:
				return createAuxiliaryParameterDescriptionTypeFromString(eDataType, initialValue);
			case _502Package.AUXILIARY_PARAMETER_TYPE_OBJECT:
				return createAuxiliaryParameterTypeObjectFromString(eDataType, initialValue);
			case _502Package.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return createConvertedFromDataStandardTypeFromString(eDataType, initialValue);
			case _502Package.DBWEIGHTING_TYPE_OBJECT:
				return createDBweightingTypeObjectFromString(eDataType, initialValue);
			case _502Package.EAR_TYPE_OBJECT:
				return createEarTypeObjectFromString(eDataType, initialValue);
			case _502Package.END_TIME_TYPE:
				return createEndTimeTypeFromString(eDataType, initialValue);
			case _502Package.ESTIMATED_RESULT_BY_TYPE_OBJECT:
				return createEstimatedResultByTypeObjectFromString(eDataType, initialValue);
			case _502Package.HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT:
				return createHearingInstrumentConditionTypeObjectFromString(eDataType, initialValue);
			case _502Package.HEARING_INSTRUMENT_DESCRIPTION_TYPE:
				return createHearingInstrumentDescriptionTypeFromString(eDataType, initialValue);
			case _502Package.LEFT_EAR1_TYPE:
				return createLeftEar1TypeFromString(eDataType, initialValue);
			case _502Package.MASKING_AMPLITUDE_MODULATION_TYPE:
				return createMaskingAmplitudeModulationTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_FREQUENCY_MODULATION_TYPE:
				return createMaskingFrequencyModulationTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE:
				return createMaskingLevelTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE1:
				return createMaskingLevelType1FromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE2:
				return createMaskingLevelType2FromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE3:
				return createMaskingLevelType3FromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE4:
				return createMaskingLevelType4FromString(eDataType, initialValue);
			case _502Package.MASKING_LEVEL_TYPE5:
				return createMaskingLevelType5FromString(eDataType, initialValue);
			case _502Package.MASKING_OFF_TIME_TYPE:
				return createMaskingOffTimeTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_ON_TIME_TYPE:
				return createMaskingOnTimeTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_PULSE_CYCLE_TYPE:
				return createMaskingPulseCycleTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_PULSE_MODULATION_TYPE:
				return createMaskingPulseModulationTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_SI_SI_PARAMETER_TYPE:
				return createMaskingSiSiParameterTypeFromString(eDataType, initialValue);
			case _502Package.MASKING_WARBLE_MODULATION_SIZE_TYPE:
				return createMaskingWarbleModulationSizeTypeFromString(eDataType, initialValue);
			case _502Package.MODULATION_SIZE_TYPE:
				return createModulationSizeTypeFromString(eDataType, initialValue);
			case _502Package.MODULATION_SIZE_TYPE1:
				return createModulationSizeType1FromString(eDataType, initialValue);
			case _502Package.MODULATION_SIZE_TYPE2:
				return createModulationSizeType2FromString(eDataType, initialValue);
			case _502Package.POINT_STATUS_TYPE_OBJECT:
				return createPointStatusTypeObjectFromString(eDataType, initialValue);
			case _502Package.PRESENTATION_TYPE_OBJECT:
				return createPresentationTypeObjectFromString(eDataType, initialValue);
			case _502Package.SCORE_PERCENT_TYPE:
				return createScorePercentTypeFromString(eDataType, initialValue);
			case _502Package.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case _502Package.SIGNAL_TYPE_OBJECT:
				return createSignalTypeObjectFromString(eDataType, initialValue);
			case _502Package.SPEECH_THRESHOLD_TYPE_OBJECT:
				return createSpeechThresholdTypeObjectFromString(eDataType, initialValue);
			case _502Package.START_TIME_TYPE:
				return createStartTimeTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return createStimulusAmplitudeModulationTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return createStimulusFrequencyModulationTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE:
				return createStimulusLevelTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE1:
				return createStimulusLevelType1FromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE2:
				return createStimulusLevelType2FromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE3:
				return createStimulusLevelType3FromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE4:
				return createStimulusLevelType4FromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE5:
				return createStimulusLevelType5FromString(eDataType, initialValue);
			case _502Package.STIMULUS_LEVEL_TYPE6:
				return createStimulusLevelType6FromString(eDataType, initialValue);
			case _502Package.STIMULUS_OFF_TIME_TYPE:
				return createStimulusOffTimeTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_ON_TIME_TYPE:
				return createStimulusOnTimeTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_PRESENTATION_TYPE_TYPE:
				return createStimulusPresentationTypeTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_PULSE_CYCLE_TYPE:
				return createStimulusPulseCycleTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_PULSE_MODULATION_TYPE:
				return createStimulusPulseModulationTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_SIGNAL_TYPE_TYPE:
				return createStimulusSignalTypeTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_SI_SI_PARAMETER_TYPE:
				return createStimulusSiSiParameterTypeFromString(eDataType, initialValue);
			case _502Package.STIMULUS_WARBLE_MODULATION_SIZE_TYPE:
				return createStimulusWarbleModulationSizeTypeFromString(eDataType, initialValue);
			case _502Package.TEST_METHOD_TYPE:
				return createTestMethodTypeFromString(eDataType, initialValue);
			case _502Package.TEST_RELIABILITY_TYPE:
				return createTestReliabilityTypeFromString(eDataType, initialValue);
			case _502Package.TONE_AVERAGE_TYPE_OBJECT:
				return createToneAverageTypeObjectFromString(eDataType, initialValue);
			case _502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT:
				return createTransducerCalibrationStandardTypeObjectFromString(eDataType, initialValue);
			case _502Package.TRANSDUCER_DESCRIPTION_TYPE:
				return createTransducerDescriptionTypeFromString(eDataType, initialValue);
			case _502Package.TRANSDUCER_TYPE_OBJECT:
				return createTransducerTypeObjectFromString(eDataType, initialValue);
			case _502Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case _502Package.VERSION_TYPE1:
				return createVersionType1FromString(eDataType, initialValue);
			case _502Package.WEBER_POINT_STATUS_TYPE_OBJECT:
				return createWeberPointStatusTypeObjectFromString(eDataType, initialValue);
			case _502Package.WORD_LIST_NAME_TYPE:
				return createWordListNameTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _502Package.AIDED_SOLUTIONS_TYPE:
				return convertAidedSolutionsTypeToString(eDataType, instanceValue);
			case _502Package.AUXILIARY_PARAMETER_TYPE:
				return convertAuxiliaryParameterTypeToString(eDataType, instanceValue);
			case _502Package.DBWEIGHTING_TYPE:
				return convertDBweightingTypeToString(eDataType, instanceValue);
			case _502Package.EAR_TYPE:
				return convertEarTypeToString(eDataType, instanceValue);
			case _502Package.ESTIMATED_RESULT_BY_TYPE:
				return convertEstimatedResultByTypeToString(eDataType, instanceValue);
			case _502Package.HEARING_INSTRUMENT_CONDITION_TYPE:
				return convertHearingInstrumentConditionTypeToString(eDataType, instanceValue);
			case _502Package.POINT_STATUS_TYPE:
				return convertPointStatusTypeToString(eDataType, instanceValue);
			case _502Package.PRESENTATION_TYPE:
				return convertPresentationTypeToString(eDataType, instanceValue);
			case _502Package.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case _502Package.SIGNAL_TYPE:
				return convertSignalTypeToString(eDataType, instanceValue);
			case _502Package.SPEECH_THRESHOLD_TYPE:
				return convertSpeechThresholdTypeToString(eDataType, instanceValue);
			case _502Package.TONE_AVERAGE_TYPE:
				return convertToneAverageTypeToString(eDataType, instanceValue);
			case _502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE:
				return convertTransducerCalibrationStandardTypeToString(eDataType, instanceValue);
			case _502Package.TRANSDUCER_TYPE:
				return convertTransducerTypeToString(eDataType, instanceValue);
			case _502Package.WEBER_POINT_STATUS_TYPE:
				return convertWeberPointStatusTypeToString(eDataType, instanceValue);
			case _502Package.ADDITIONAL_MASKING_LEVEL_TYPE:
				return convertAdditionalMaskingLevelTypeToString(eDataType, instanceValue);
			case _502Package.ADDITIONAL_MASKING_LEVEL_TYPE1:
				return convertAdditionalMaskingLevelType1ToString(eDataType, instanceValue);
			case _502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE:
				return convertAdditionalStimulusLevelTypeToString(eDataType, instanceValue);
			case _502Package.ADDITIONAL_STIMULUS_LEVEL_TYPE1:
				return convertAdditionalStimulusLevelType1ToString(eDataType, instanceValue);
			case _502Package.AIDED_SOLUTIONS_TYPE_OBJECT:
				return convertAidedSolutionsTypeObjectToString(eDataType, instanceValue);
			case _502Package.AUDIOMETER_MAKE_MODEL_TYPE:
				return convertAudiometerMakeModelTypeToString(eDataType, instanceValue);
			case _502Package.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return convertAudiometerSerialNumberTypeToString(eDataType, instanceValue);
			case _502Package.AUXILIARY_PARAMETER_DESCRIPTION_TYPE:
				return convertAuxiliaryParameterDescriptionTypeToString(eDataType, instanceValue);
			case _502Package.AUXILIARY_PARAMETER_TYPE_OBJECT:
				return convertAuxiliaryParameterTypeObjectToString(eDataType, instanceValue);
			case _502Package.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return convertConvertedFromDataStandardTypeToString(eDataType, instanceValue);
			case _502Package.DBWEIGHTING_TYPE_OBJECT:
				return convertDBweightingTypeObjectToString(eDataType, instanceValue);
			case _502Package.EAR_TYPE_OBJECT:
				return convertEarTypeObjectToString(eDataType, instanceValue);
			case _502Package.END_TIME_TYPE:
				return convertEndTimeTypeToString(eDataType, instanceValue);
			case _502Package.ESTIMATED_RESULT_BY_TYPE_OBJECT:
				return convertEstimatedResultByTypeObjectToString(eDataType, instanceValue);
			case _502Package.HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT:
				return convertHearingInstrumentConditionTypeObjectToString(eDataType, instanceValue);
			case _502Package.HEARING_INSTRUMENT_DESCRIPTION_TYPE:
				return convertHearingInstrumentDescriptionTypeToString(eDataType, instanceValue);
			case _502Package.LEFT_EAR1_TYPE:
				return convertLeftEar1TypeToString(eDataType, instanceValue);
			case _502Package.MASKING_AMPLITUDE_MODULATION_TYPE:
				return convertMaskingAmplitudeModulationTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_FREQUENCY_MODULATION_TYPE:
				return convertMaskingFrequencyModulationTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE:
				return convertMaskingLevelTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE1:
				return convertMaskingLevelType1ToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE2:
				return convertMaskingLevelType2ToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE3:
				return convertMaskingLevelType3ToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE4:
				return convertMaskingLevelType4ToString(eDataType, instanceValue);
			case _502Package.MASKING_LEVEL_TYPE5:
				return convertMaskingLevelType5ToString(eDataType, instanceValue);
			case _502Package.MASKING_OFF_TIME_TYPE:
				return convertMaskingOffTimeTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_ON_TIME_TYPE:
				return convertMaskingOnTimeTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_PULSE_CYCLE_TYPE:
				return convertMaskingPulseCycleTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_PULSE_MODULATION_TYPE:
				return convertMaskingPulseModulationTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_SI_SI_PARAMETER_TYPE:
				return convertMaskingSiSiParameterTypeToString(eDataType, instanceValue);
			case _502Package.MASKING_WARBLE_MODULATION_SIZE_TYPE:
				return convertMaskingWarbleModulationSizeTypeToString(eDataType, instanceValue);
			case _502Package.MODULATION_SIZE_TYPE:
				return convertModulationSizeTypeToString(eDataType, instanceValue);
			case _502Package.MODULATION_SIZE_TYPE1:
				return convertModulationSizeType1ToString(eDataType, instanceValue);
			case _502Package.MODULATION_SIZE_TYPE2:
				return convertModulationSizeType2ToString(eDataType, instanceValue);
			case _502Package.POINT_STATUS_TYPE_OBJECT:
				return convertPointStatusTypeObjectToString(eDataType, instanceValue);
			case _502Package.PRESENTATION_TYPE_OBJECT:
				return convertPresentationTypeObjectToString(eDataType, instanceValue);
			case _502Package.SCORE_PERCENT_TYPE:
				return convertScorePercentTypeToString(eDataType, instanceValue);
			case _502Package.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case _502Package.SIGNAL_TYPE_OBJECT:
				return convertSignalTypeObjectToString(eDataType, instanceValue);
			case _502Package.SPEECH_THRESHOLD_TYPE_OBJECT:
				return convertSpeechThresholdTypeObjectToString(eDataType, instanceValue);
			case _502Package.START_TIME_TYPE:
				return convertStartTimeTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return convertStimulusAmplitudeModulationTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return convertStimulusFrequencyModulationTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE:
				return convertStimulusLevelTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE1:
				return convertStimulusLevelType1ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE2:
				return convertStimulusLevelType2ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE3:
				return convertStimulusLevelType3ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE4:
				return convertStimulusLevelType4ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE5:
				return convertStimulusLevelType5ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_LEVEL_TYPE6:
				return convertStimulusLevelType6ToString(eDataType, instanceValue);
			case _502Package.STIMULUS_OFF_TIME_TYPE:
				return convertStimulusOffTimeTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_ON_TIME_TYPE:
				return convertStimulusOnTimeTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_PRESENTATION_TYPE_TYPE:
				return convertStimulusPresentationTypeTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_PULSE_CYCLE_TYPE:
				return convertStimulusPulseCycleTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_PULSE_MODULATION_TYPE:
				return convertStimulusPulseModulationTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_SIGNAL_TYPE_TYPE:
				return convertStimulusSignalTypeTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_SI_SI_PARAMETER_TYPE:
				return convertStimulusSiSiParameterTypeToString(eDataType, instanceValue);
			case _502Package.STIMULUS_WARBLE_MODULATION_SIZE_TYPE:
				return convertStimulusWarbleModulationSizeTypeToString(eDataType, instanceValue);
			case _502Package.TEST_METHOD_TYPE:
				return convertTestMethodTypeToString(eDataType, instanceValue);
			case _502Package.TEST_RELIABILITY_TYPE:
				return convertTestReliabilityTypeToString(eDataType, instanceValue);
			case _502Package.TONE_AVERAGE_TYPE_OBJECT:
				return convertToneAverageTypeObjectToString(eDataType, instanceValue);
			case _502Package.TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT:
				return convertTransducerCalibrationStandardTypeObjectToString(eDataType, instanceValue);
			case _502Package.TRANSDUCER_DESCRIPTION_TYPE:
				return convertTransducerDescriptionTypeToString(eDataType, instanceValue);
			case _502Package.TRANSDUCER_TYPE_OBJECT:
				return convertTransducerTypeObjectToString(eDataType, instanceValue);
			case _502Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case _502Package.VERSION_TYPE1:
				return convertVersionType1ToString(eDataType, instanceValue);
			case _502Package.WEBER_POINT_STATUS_TYPE_OBJECT:
				return convertWeberPointStatusTypeObjectToString(eDataType, instanceValue);
			case _502Package.WORD_LIST_NAME_TYPE:
				return convertWordListNameTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalMasking2Type createAdditionalMasking2Type() {
		AdditionalMasking2TypeImpl additionalMasking2Type = new AdditionalMasking2TypeImpl();
		return additionalMasking2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalMaskingType createAdditionalMaskingType() {
		AdditionalMaskingTypeImpl additionalMaskingType = new AdditionalMaskingTypeImpl();
		return additionalMaskingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternateBinauralLoudnessBalanceAudiogramType createAlternateBinauralLoudnessBalanceAudiogramType() {
		AlternateBinauralLoudnessBalanceAudiogramTypeImpl alternateBinauralLoudnessBalanceAudiogramType = new AlternateBinauralLoudnessBalanceAudiogramTypeImpl();
		return alternateBinauralLoudnessBalanceAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioMetricMeasurementConditionsType createAudioMetricMeasurementConditionsType() {
		AudioMetricMeasurementConditionsTypeImpl audioMetricMeasurementConditionsType = new AudioMetricMeasurementConditionsTypeImpl();
		return audioMetricMeasurementConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecayAudiogramType createDecayAudiogramType() {
		DecayAudiogramTypeImpl decayAudiogramType = new DecayAudiogramTypeImpl();
		return decayAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecayPointType createDecayPointType() {
		DecayPointTypeImpl decayPointType = new DecayPointTypeImpl();
		return decayPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSolutionsType createDeviceSolutionsType() {
		DeviceSolutionsTypeImpl deviceSolutionsType = new DeviceSolutionsTypeImpl();
		return deviceSolutionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferenceLimenFrequencyPointType createDifferenceLimenFrequencyPointType() {
		DifferenceLimenFrequencyPointTypeImpl differenceLimenFrequencyPointType = new DifferenceLimenFrequencyPointTypeImpl();
		return differenceLimenFrequencyPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferenceLimenFrequencyType createDifferenceLimenFrequencyType() {
		DifferenceLimenFrequencyTypeImpl differenceLimenFrequencyType = new DifferenceLimenFrequencyTypeImpl();
		return differenceLimenFrequencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferenceLimenIntensityPointType createDifferenceLimenIntensityPointType() {
		DifferenceLimenIntensityPointTypeImpl differenceLimenIntensityPointType = new DifferenceLimenIntensityPointTypeImpl();
		return differenceLimenIntensityPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferenceLimenIntensityType createDifferenceLimenIntensityType() {
		DifferenceLimenIntensityTypeImpl differenceLimenIntensityType = new DifferenceLimenIntensityTypeImpl();
		return differenceLimenIntensityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequenciesUsedForToneAverageType createFrequenciesUsedForToneAverageType() {
		FrequenciesUsedForToneAverageTypeImpl frequenciesUsedForToneAverageType = new FrequenciesUsedForToneAverageTypeImpl();
		return frequenciesUsedForToneAverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSAAudiometricStandardType createHIMSAAudiometricStandardType() {
		HIMSAAudiometricStandardTypeImpl himsaAudiometricStandardType = new HIMSAAudiometricStandardTypeImpl();
		return himsaAudiometricStandardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationType createInformationType() {
		InformationTypeImpl informationType = new InformationTypeImpl();
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementNotesType createMeasurementNotesType() {
		MeasurementNotesTypeImpl measurementNotesType = new MeasurementNotesTypeImpl();
		return measurementNotesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MostComfortableLevelType createMostComfortableLevelType() {
		MostComfortableLevelTypeImpl mostComfortableLevelType = new MostComfortableLevelTypeImpl();
		return mostComfortableLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortIncrementSensitivityIndexPoint createShortIncrementSensitivityIndexPoint() {
		ShortIncrementSensitivityIndexPointImpl shortIncrementSensitivityIndexPoint = new ShortIncrementSensitivityIndexPointImpl();
		return shortIncrementSensitivityIndexPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortIncrementSensitivityIndexType createShortIncrementSensitivityIndexType() {
		ShortIncrementSensitivityIndexTypeImpl shortIncrementSensitivityIndexType = new ShortIncrementSensitivityIndexTypeImpl();
		return shortIncrementSensitivityIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechDiscriminationAudiogramType createSpeechDiscriminationAudiogramType() {
		SpeechDiscriminationAudiogramTypeImpl speechDiscriminationAudiogramType = new SpeechDiscriminationAudiogramTypeImpl();
		return speechDiscriminationAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechMostComfortableLevelType createSpeechMostComfortableLevelType() {
		SpeechMostComfortableLevelTypeImpl speechMostComfortableLevelType = new SpeechMostComfortableLevelTypeImpl();
		return speechMostComfortableLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechReceptionThresholdAudiogramType createSpeechReceptionThresholdAudiogramType() {
		SpeechReceptionThresholdAudiogramTypeImpl speechReceptionThresholdAudiogramType = new SpeechReceptionThresholdAudiogramTypeImpl();
		return speechReceptionThresholdAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechScorePointType createSpeechScorePointType() {
		SpeechScorePointTypeImpl speechScorePointType = new SpeechScorePointTypeImpl();
		return speechScorePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechUncomfortableLevelType createSpeechUncomfortableLevelType() {
		SpeechUncomfortableLevelTypeImpl speechUncomfortableLevelType = new SpeechUncomfortableLevelTypeImpl();
		return speechUncomfortableLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StengerAudiogramType createStengerAudiogramType() {
		StengerAudiogramTypeImpl stengerAudiogramType = new StengerAudiogramTypeImpl();
		return stengerAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementaryDataType createSupplementaryDataType() {
		SupplementaryDataTypeImpl supplementaryDataType = new SupplementaryDataTypeImpl();
		return supplementaryDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TonePointsType createTonePointsType() {
		TonePointsTypeImpl tonePointsType = new TonePointsTypeImpl();
		return tonePointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToneThresholdAudiogramType createToneThresholdAudiogramType() {
		ToneThresholdAudiogramTypeImpl toneThresholdAudiogramType = new ToneThresholdAudiogramTypeImpl();
		return toneThresholdAudiogramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UncomfortableLevelType createUncomfortableLevelType() {
		UncomfortableLevelTypeImpl uncomfortableLevelType = new UncomfortableLevelTypeImpl();
		return uncomfortableLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeberPointsType createWeberPointsType() {
		WeberPointsTypeImpl weberPointsType = new WeberPointsTypeImpl();
		return weberPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeberPointType createWeberPointType() {
		WeberPointTypeImpl weberPointType = new WeberPointTypeImpl();
		return weberPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AidedSolutionsType createAidedSolutionsTypeFromString(EDataType eDataType, String initialValue) {
		AidedSolutionsType result = AidedSolutionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAidedSolutionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryParameterType createAuxiliaryParameterTypeFromString(EDataType eDataType, String initialValue) {
		AuxiliaryParameterType result = AuxiliaryParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBweightingType createDBweightingTypeFromString(EDataType eDataType, String initialValue) {
		DBweightingType result = DBweightingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBweightingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarType createEarTypeFromString(EDataType eDataType, String initialValue) {
		EarType result = EarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedResultByType createEstimatedResultByTypeFromString(EDataType eDataType, String initialValue) {
		EstimatedResultByType result = EstimatedResultByType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstimatedResultByTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingInstrumentConditionType createHearingInstrumentConditionTypeFromString(EDataType eDataType, String initialValue) {
		HearingInstrumentConditionType result = HearingInstrumentConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointStatusType createPointStatusTypeFromString(EDataType eDataType, String initialValue) {
		PointStatusType result = PointStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createPresentationTypeFromString(EDataType eDataType, String initialValue) {
		PresentationType result = PresentationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOutputType createSignalOutputTypeFromString(EDataType eDataType, String initialValue) {
		SignalOutputType result = SignalOutputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeFromString(EDataType eDataType, String initialValue) {
		SignalType result = SignalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechThresholdType createSpeechThresholdTypeFromString(EDataType eDataType, String initialValue) {
		SpeechThresholdType result = SpeechThresholdType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechThresholdTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToneAverageType createToneAverageTypeFromString(EDataType eDataType, String initialValue) {
		ToneAverageType result = ToneAverageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToneAverageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerCalibrationStandardType createTransducerCalibrationStandardTypeFromString(EDataType eDataType, String initialValue) {
		TransducerCalibrationStandardType result = TransducerCalibrationStandardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerCalibrationStandardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerType createTransducerTypeFromString(EDataType eDataType, String initialValue) {
		TransducerType result = TransducerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeberPointStatusType createWeberPointStatusTypeFromString(EDataType eDataType, String initialValue) {
		WeberPointStatusType result = WeberPointStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeberPointStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAdditionalMaskingLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalMaskingLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAdditionalMaskingLevelType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalMaskingLevelType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAdditionalStimulusLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalStimulusLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAdditionalStimulusLevelType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalStimulusLevelType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AidedSolutionsType createAidedSolutionsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAidedSolutionsTypeFromString(_502Package.Literals.AIDED_SOLUTIONS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAidedSolutionsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAidedSolutionsTypeToString(_502Package.Literals.AIDED_SOLUTIONS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAudiometerMakeModelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudiometerMakeModelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAudiometerSerialNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudiometerSerialNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAuxiliaryParameterDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryParameterDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryParameterType createAuxiliaryParameterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAuxiliaryParameterTypeFromString(_502Package.Literals.AUXILIARY_PARAMETER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryParameterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuxiliaryParameterTypeToString(_502Package.Literals.AUXILIARY_PARAMETER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createConvertedFromDataStandardTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConvertedFromDataStandardTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBweightingType createDBweightingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDBweightingTypeFromString(_502Package.Literals.DBWEIGHTING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBweightingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDBweightingTypeToString(_502Package.Literals.DBWEIGHTING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarType createEarTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEarTypeFromString(_502Package.Literals.EAR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEarTypeToString(_502Package.Literals.EAR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEndTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedResultByType createEstimatedResultByTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEstimatedResultByTypeFromString(_502Package.Literals.ESTIMATED_RESULT_BY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstimatedResultByTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEstimatedResultByTypeToString(_502Package.Literals.ESTIMATED_RESULT_BY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingInstrumentConditionType createHearingInstrumentConditionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHearingInstrumentConditionTypeFromString(_502Package.Literals.HEARING_INSTRUMENT_CONDITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentConditionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHearingInstrumentConditionTypeToString(_502Package.Literals.HEARING_INSTRUMENT_CONDITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHearingInstrumentDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToneAverageType createLeftEar1TypeFromString(EDataType eDataType, String initialValue) {
		return createToneAverageTypeFromString(_502Package.Literals.TONE_AVERAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeftEar1TypeToString(EDataType eDataType, Object instanceValue) {
		return convertToneAverageTypeToString(_502Package.Literals.TONE_AVERAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingAmplitudeModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingAmplitudeModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingFrequencyModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingFrequencyModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelType3FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelType4FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingLevelType5FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingLevelType5ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingOffTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingOffTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingOnTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingOnTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingPulseCycleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingPulseCycleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingPulseModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingPulseModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingSiSiParameterTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingSiSiParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMaskingWarbleModulationSizeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingWarbleModulationSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createModulationSizeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModulationSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createModulationSizeType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModulationSizeType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createModulationSizeType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModulationSizeType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointStatusType createPointStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPointStatusTypeFromString(_502Package.Literals.POINT_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPointStatusTypeToString(_502Package.Literals.POINT_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createPresentationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationTypeFromString(_502Package.Literals.PRESENTATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationTypeToString(_502Package.Literals.PRESENTATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createScorePercentTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScorePercentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOutputType createSignalOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalOutputTypeFromString(_502Package.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(_502Package.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeFromString(_502Package.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(_502Package.Literals.SIGNAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechThresholdType createSpeechThresholdTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpeechThresholdTypeFromString(_502Package.Literals.SPEECH_THRESHOLD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechThresholdTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpeechThresholdTypeToString(_502Package.Literals.SPEECH_THRESHOLD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStartTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusAmplitudeModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusAmplitudeModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusFrequencyModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusFrequencyModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType3FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType4FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType5FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType5ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusLevelType6FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusLevelType6ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusOffTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusOffTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusOnTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusOnTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createStimulusPresentationTypeTypeFromString(EDataType eDataType, String initialValue) {
		return createPresentationTypeFromString(_502Package.Literals.PRESENTATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusPresentationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationTypeToString(_502Package.Literals.PRESENTATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusPulseCycleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusPulseCycleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusPulseModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusPulseModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createStimulusSignalTypeTypeFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeFromString(_502Package.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusSignalTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(_502Package.Literals.SIGNAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusSiSiParameterTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusSiSiParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusWarbleModulationSizeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusWarbleModulationSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTestMethodTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTestReliabilityTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReliabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToneAverageType createToneAverageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createToneAverageTypeFromString(_502Package.Literals.TONE_AVERAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToneAverageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertToneAverageTypeToString(_502Package.Literals.TONE_AVERAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerCalibrationStandardType createTransducerCalibrationStandardTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransducerCalibrationStandardTypeFromString(_502Package.Literals.TRANSDUCER_CALIBRATION_STANDARD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerCalibrationStandardTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerCalibrationStandardTypeToString(_502Package.Literals.TRANSDUCER_CALIBRATION_STANDARD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTransducerDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerType createTransducerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransducerTypeFromString(_502Package.Literals.TRANSDUCER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerTypeToString(_502Package.Literals.TRANSDUCER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVersionType1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeberPointStatusType createWeberPointStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWeberPointStatusTypeFromString(_502Package.Literals.WEBER_POINT_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeberPointStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWeberPointStatusTypeToString(_502Package.Literals.WEBER_POINT_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWordListNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWordListNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _502Package get_502Package() {
		return (_502Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _502Package getPackage() {
		return _502Package.eINSTANCE;
	}

} //_502FactoryImpl
