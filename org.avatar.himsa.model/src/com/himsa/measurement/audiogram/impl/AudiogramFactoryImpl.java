/**
 */
package com.himsa.measurement.audiogram.impl;

import com.himsa.measurement.audiogram.*;

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
public class AudiogramFactoryImpl extends EFactoryImpl implements AudiogramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AudiogramFactory init() {
		try {
			AudiogramFactory theAudiogramFactory = (AudiogramFactory)EPackage.Registry.INSTANCE.getEFactory(AudiogramPackage.eNS_URI);
			if (theAudiogramFactory != null) {
				return theAudiogramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AudiogramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogramFactoryImpl() {
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
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE: return createAlternateBinauralLoudnessBalanceAudiogramType();
			case AudiogramPackage.AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE: return createAudioMetricMeasurementConditionsType();
			case AudiogramPackage.DECAY_AUDIOGRAM_TYPE: return createDecayAudiogramType();
			case AudiogramPackage.DECAY_POINT_TYPE: return createDecayPointType();
			case AudiogramPackage.DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE: return createDifferenceLimenFrequencyPointType();
			case AudiogramPackage.DIFFERENCE_LIMEN_FREQUENCY_TYPE: return createDifferenceLimenFrequencyType();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE: return createDifferenceLimenIntensityPointType();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_TYPE: return createDifferenceLimenIntensityType();
			case AudiogramPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE: return createFrequenciesUsedForToneAverageType();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE: return createHIMSAAudiometricStandardType();
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE: return createMeasurementNotesType();
			case AudiogramPackage.MOST_COMFORTABLE_LEVEL_TYPE: return createMostComfortableLevelType();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT: return createShortIncrementSensitivityIndexPoint();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE: return createShortIncrementSensitivityIndexType();
			case AudiogramPackage.SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE: return createSpeechDiscriminationAudiogramType();
			case AudiogramPackage.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE: return createSpeechMostComfortableLevelType();
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE: return createSpeechReceptionThresholdAudiogramType();
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE: return createSpeechScorePointType();
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE: return createSpeechUncomfortableLevelType();
			case AudiogramPackage.STENGER_AUDIOGRAM_TYPE: return createStengerAudiogramType();
			case AudiogramPackage.TONE_POINTS_TYPE: return createTonePointsType();
			case AudiogramPackage.TONE_THRESHOLD_AUDIOGRAM_TYPE: return createToneThresholdAudiogramType();
			case AudiogramPackage.UNCOMFORTABLE_LEVEL_TYPE: return createUncomfortableLevelType();
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
			case AudiogramPackage.AUXILIARY_PARAMETER_TYPE:
				return createAuxiliaryParameterTypeFromString(eDataType, initialValue);
			case AudiogramPackage.DBWEIGHTING_TYPE:
				return createDBweightingTypeFromString(eDataType, initialValue);
			case AudiogramPackage.HEARING_INSTRUMENT_CONDITION_TYPE:
				return createHearingInstrumentConditionTypeFromString(eDataType, initialValue);
			case AudiogramPackage.POINT_STATUS_TYPE:
				return createPointStatusTypeFromString(eDataType, initialValue);
			case AudiogramPackage.PRESENTATION_TYPE:
				return createPresentationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case AudiogramPackage.SIGNAL_TYPE:
				return createSignalTypeFromString(eDataType, initialValue);
			case AudiogramPackage.SPEECH_THRESHOLD_TYPE:
				return createSpeechThresholdTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TONE_AVERAGE_TYPE:
				return createToneAverageTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TRANSDUCER_CALIBRATION_STANDARD_TYPE:
				return createTransducerCalibrationStandardTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TRANSDUCER_TYPE:
				return createTransducerTypeFromString(eDataType, initialValue);
			case AudiogramPackage.AUDIOMETER_MAKE_MODEL_TYPE:
				return createAudiometerMakeModelTypeFromString(eDataType, initialValue);
			case AudiogramPackage.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return createAudiometerSerialNumberTypeFromString(eDataType, initialValue);
			case AudiogramPackage.AUXILIARY_PARAMETER_DESCRIPTION_TYPE:
				return createAuxiliaryParameterDescriptionTypeFromString(eDataType, initialValue);
			case AudiogramPackage.AUXILIARY_PARAMETER_TYPE_OBJECT:
				return createAuxiliaryParameterTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return createConvertedFromDataStandardTypeFromString(eDataType, initialValue);
			case AudiogramPackage.DBWEIGHTING_TYPE_OBJECT:
				return createDBweightingTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.END_TIME_TYPE:
				return createEndTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT:
				return createHearingInstrumentConditionTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.HEARING_INSTRUMENT_DESCRIPTION_TYPE:
				return createHearingInstrumentDescriptionTypeFromString(eDataType, initialValue);
			case AudiogramPackage.LEFT_EAR1_TYPE:
				return createLeftEar1TypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_AMPLITUDE_MODULATION_TYPE:
				return createMaskingAmplitudeModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_FREQUENCY_MODULATION_TYPE:
				return createMaskingFrequencyModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE:
				return createMaskingLevelTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE1:
				return createMaskingLevelType1FromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE2:
				return createMaskingLevelType2FromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE3:
				return createMaskingLevelType3FromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE4:
				return createMaskingLevelType4FromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE5:
				return createMaskingLevelType5FromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_OFF_TIME_TYPE:
				return createMaskingOffTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_ON_TIME_TYPE:
				return createMaskingOnTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_PULSE_CYCLE_TYPE:
				return createMaskingPulseCycleTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_PULSE_MODULATION_TYPE:
				return createMaskingPulseModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_SI_SI_PARAMETER_TYPE:
				return createMaskingSiSiParameterTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MASKING_WARBLE_MODULATION_SIZE_TYPE:
				return createMaskingWarbleModulationSizeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE:
				return createModulationSizeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE1:
				return createModulationSizeType1FromString(eDataType, initialValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE2:
				return createModulationSizeType2FromString(eDataType, initialValue);
			case AudiogramPackage.POINT_STATUS_TYPE_OBJECT:
				return createPointStatusTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.PRESENTATION_TYPE_OBJECT:
				return createPresentationTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.SCORE_PERCENT_TYPE:
				return createScorePercentTypeFromString(eDataType, initialValue);
			case AudiogramPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.SIGNAL_TYPE_OBJECT:
				return createSignalTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.SPEECH_THRESHOLD_TYPE_OBJECT:
				return createSpeechThresholdTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.START_TIME_TYPE:
				return createStartTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return createStimulusAmplitudeModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return createStimulusFrequencyModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE:
				return createStimulusLevelTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE1:
				return createStimulusLevelType1FromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE2:
				return createStimulusLevelType2FromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE3:
				return createStimulusLevelType3FromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE4:
				return createStimulusLevelType4FromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE5:
				return createStimulusLevelType5FromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_OFF_TIME_TYPE:
				return createStimulusOffTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_ON_TIME_TYPE:
				return createStimulusOnTimeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_PRESENTATION_TYPE_TYPE:
				return createStimulusPresentationTypeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_PULSE_CYCLE_TYPE:
				return createStimulusPulseCycleTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_PULSE_MODULATION_TYPE:
				return createStimulusPulseModulationTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_SIGNAL_TYPE_TYPE:
				return createStimulusSignalTypeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_SI_SI_PARAMETER_TYPE:
				return createStimulusSiSiParameterTypeFromString(eDataType, initialValue);
			case AudiogramPackage.STIMULUS_WARBLE_MODULATION_SIZE_TYPE:
				return createStimulusWarbleModulationSizeTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TEST_METHOD_TYPE:
				return createTestMethodTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TEST_RELIABILITY_TYPE:
				return createTestReliabilityTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TONE_AVERAGE_TYPE_OBJECT:
				return createToneAverageTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT:
				return createTransducerCalibrationStandardTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.TRANSDUCER_DESCRIPTION_TYPE:
				return createTransducerDescriptionTypeFromString(eDataType, initialValue);
			case AudiogramPackage.TRANSDUCER_TYPE_OBJECT:
				return createTransducerTypeObjectFromString(eDataType, initialValue);
			case AudiogramPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case AudiogramPackage.WORD_LIST_NAME_TYPE:
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
			case AudiogramPackage.AUXILIARY_PARAMETER_TYPE:
				return convertAuxiliaryParameterTypeToString(eDataType, instanceValue);
			case AudiogramPackage.DBWEIGHTING_TYPE:
				return convertDBweightingTypeToString(eDataType, instanceValue);
			case AudiogramPackage.HEARING_INSTRUMENT_CONDITION_TYPE:
				return convertHearingInstrumentConditionTypeToString(eDataType, instanceValue);
			case AudiogramPackage.POINT_STATUS_TYPE:
				return convertPointStatusTypeToString(eDataType, instanceValue);
			case AudiogramPackage.PRESENTATION_TYPE:
				return convertPresentationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case AudiogramPackage.SIGNAL_TYPE:
				return convertSignalTypeToString(eDataType, instanceValue);
			case AudiogramPackage.SPEECH_THRESHOLD_TYPE:
				return convertSpeechThresholdTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TONE_AVERAGE_TYPE:
				return convertToneAverageTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TRANSDUCER_CALIBRATION_STANDARD_TYPE:
				return convertTransducerCalibrationStandardTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TRANSDUCER_TYPE:
				return convertTransducerTypeToString(eDataType, instanceValue);
			case AudiogramPackage.AUDIOMETER_MAKE_MODEL_TYPE:
				return convertAudiometerMakeModelTypeToString(eDataType, instanceValue);
			case AudiogramPackage.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return convertAudiometerSerialNumberTypeToString(eDataType, instanceValue);
			case AudiogramPackage.AUXILIARY_PARAMETER_DESCRIPTION_TYPE:
				return convertAuxiliaryParameterDescriptionTypeToString(eDataType, instanceValue);
			case AudiogramPackage.AUXILIARY_PARAMETER_TYPE_OBJECT:
				return convertAuxiliaryParameterTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return convertConvertedFromDataStandardTypeToString(eDataType, instanceValue);
			case AudiogramPackage.DBWEIGHTING_TYPE_OBJECT:
				return convertDBweightingTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.END_TIME_TYPE:
				return convertEndTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT:
				return convertHearingInstrumentConditionTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.HEARING_INSTRUMENT_DESCRIPTION_TYPE:
				return convertHearingInstrumentDescriptionTypeToString(eDataType, instanceValue);
			case AudiogramPackage.LEFT_EAR1_TYPE:
				return convertLeftEar1TypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_AMPLITUDE_MODULATION_TYPE:
				return convertMaskingAmplitudeModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_FREQUENCY_MODULATION_TYPE:
				return convertMaskingFrequencyModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE:
				return convertMaskingLevelTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE1:
				return convertMaskingLevelType1ToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE2:
				return convertMaskingLevelType2ToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE3:
				return convertMaskingLevelType3ToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE4:
				return convertMaskingLevelType4ToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_LEVEL_TYPE5:
				return convertMaskingLevelType5ToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_OFF_TIME_TYPE:
				return convertMaskingOffTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_ON_TIME_TYPE:
				return convertMaskingOnTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_PULSE_CYCLE_TYPE:
				return convertMaskingPulseCycleTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_PULSE_MODULATION_TYPE:
				return convertMaskingPulseModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_SI_SI_PARAMETER_TYPE:
				return convertMaskingSiSiParameterTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MASKING_WARBLE_MODULATION_SIZE_TYPE:
				return convertMaskingWarbleModulationSizeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE:
				return convertModulationSizeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE1:
				return convertModulationSizeType1ToString(eDataType, instanceValue);
			case AudiogramPackage.MODULATION_SIZE_TYPE2:
				return convertModulationSizeType2ToString(eDataType, instanceValue);
			case AudiogramPackage.POINT_STATUS_TYPE_OBJECT:
				return convertPointStatusTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.PRESENTATION_TYPE_OBJECT:
				return convertPresentationTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.SCORE_PERCENT_TYPE:
				return convertScorePercentTypeToString(eDataType, instanceValue);
			case AudiogramPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.SIGNAL_TYPE_OBJECT:
				return convertSignalTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.SPEECH_THRESHOLD_TYPE_OBJECT:
				return convertSpeechThresholdTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.START_TIME_TYPE:
				return convertStartTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return convertStimulusAmplitudeModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return convertStimulusFrequencyModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE:
				return convertStimulusLevelTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE1:
				return convertStimulusLevelType1ToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE2:
				return convertStimulusLevelType2ToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE3:
				return convertStimulusLevelType3ToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE4:
				return convertStimulusLevelType4ToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_LEVEL_TYPE5:
				return convertStimulusLevelType5ToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_OFF_TIME_TYPE:
				return convertStimulusOffTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_ON_TIME_TYPE:
				return convertStimulusOnTimeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_PRESENTATION_TYPE_TYPE:
				return convertStimulusPresentationTypeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_PULSE_CYCLE_TYPE:
				return convertStimulusPulseCycleTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_PULSE_MODULATION_TYPE:
				return convertStimulusPulseModulationTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_SIGNAL_TYPE_TYPE:
				return convertStimulusSignalTypeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_SI_SI_PARAMETER_TYPE:
				return convertStimulusSiSiParameterTypeToString(eDataType, instanceValue);
			case AudiogramPackage.STIMULUS_WARBLE_MODULATION_SIZE_TYPE:
				return convertStimulusWarbleModulationSizeTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TEST_METHOD_TYPE:
				return convertTestMethodTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TEST_RELIABILITY_TYPE:
				return convertTestReliabilityTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TONE_AVERAGE_TYPE_OBJECT:
				return convertToneAverageTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT:
				return convertTransducerCalibrationStandardTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.TRANSDUCER_DESCRIPTION_TYPE:
				return convertTransducerDescriptionTypeToString(eDataType, instanceValue);
			case AudiogramPackage.TRANSDUCER_TYPE_OBJECT:
				return convertTransducerTypeObjectToString(eDataType, instanceValue);
			case AudiogramPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case AudiogramPackage.WORD_LIST_NAME_TYPE:
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
		return createAuxiliaryParameterTypeFromString(AudiogramPackage.Literals.AUXILIARY_PARAMETER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryParameterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuxiliaryParameterTypeToString(AudiogramPackage.Literals.AUXILIARY_PARAMETER_TYPE, instanceValue);
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
		return createDBweightingTypeFromString(AudiogramPackage.Literals.DBWEIGHTING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBweightingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDBweightingTypeToString(AudiogramPackage.Literals.DBWEIGHTING_TYPE, instanceValue);
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
	public HearingInstrumentConditionType createHearingInstrumentConditionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHearingInstrumentConditionTypeFromString(AudiogramPackage.Literals.HEARING_INSTRUMENT_CONDITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentConditionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHearingInstrumentConditionTypeToString(AudiogramPackage.Literals.HEARING_INSTRUMENT_CONDITION_TYPE, instanceValue);
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
		return createToneAverageTypeFromString(AudiogramPackage.Literals.TONE_AVERAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeftEar1TypeToString(EDataType eDataType, Object instanceValue) {
		return convertToneAverageTypeToString(AudiogramPackage.Literals.TONE_AVERAGE_TYPE, instanceValue);
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
		return createPointStatusTypeFromString(AudiogramPackage.Literals.POINT_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPointStatusTypeToString(AudiogramPackage.Literals.POINT_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createPresentationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationTypeFromString(AudiogramPackage.Literals.PRESENTATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationTypeToString(AudiogramPackage.Literals.PRESENTATION_TYPE, instanceValue);
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
		return createSignalOutputTypeFromString(AudiogramPackage.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(AudiogramPackage.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeFromString(AudiogramPackage.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(AudiogramPackage.Literals.SIGNAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechThresholdType createSpeechThresholdTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpeechThresholdTypeFromString(AudiogramPackage.Literals.SPEECH_THRESHOLD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeechThresholdTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpeechThresholdTypeToString(AudiogramPackage.Literals.SPEECH_THRESHOLD_TYPE, instanceValue);
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
		return createPresentationTypeFromString(AudiogramPackage.Literals.PRESENTATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusPresentationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationTypeToString(AudiogramPackage.Literals.PRESENTATION_TYPE, instanceValue);
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
		return createSignalTypeFromString(AudiogramPackage.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusSignalTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(AudiogramPackage.Literals.SIGNAL_TYPE, instanceValue);
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
		return createToneAverageTypeFromString(AudiogramPackage.Literals.TONE_AVERAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToneAverageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertToneAverageTypeToString(AudiogramPackage.Literals.TONE_AVERAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerCalibrationStandardType createTransducerCalibrationStandardTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransducerCalibrationStandardTypeFromString(AudiogramPackage.Literals.TRANSDUCER_CALIBRATION_STANDARD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerCalibrationStandardTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerCalibrationStandardTypeToString(AudiogramPackage.Literals.TRANSDUCER_CALIBRATION_STANDARD_TYPE, instanceValue);
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
		return createTransducerTypeFromString(AudiogramPackage.Literals.TRANSDUCER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerTypeToString(AudiogramPackage.Literals.TRANSDUCER_TYPE, instanceValue);
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
	public AudiogramPackage getAudiogramPackage() {
		return (AudiogramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AudiogramPackage getPackage() {
		return AudiogramPackage.eINSTANCE;
	}

} //AudiogramFactoryImpl
