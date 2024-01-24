/**
 */
package tinnitus.impl;

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

import tinnitus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TinnitusFactoryImpl extends EFactoryImpl implements TinnitusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TinnitusFactory init() {
		try {
			TinnitusFactory theTinnitusFactory = (TinnitusFactory)EPackage.Registry.INSTANCE.getEFactory(TinnitusPackage.eNS_URI);
			if (theTinnitusFactory != null) {
				return theTinnitusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TinnitusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusFactoryImpl() {
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
			case TinnitusPackage.BANDWIDTH_TYPE: return createBandwidthType();
			case TinnitusPackage.INTENSITY_TYPE1: return createIntensityType1();
			case TinnitusPackage.MEASUREMENT_CONDITIONS_TYPE: return createMeasurementConditionsType();
			case TinnitusPackage.MEASUREMENT_EQUIPMENT_TYPE: return createMeasurementEquipmentType();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE: return createMeasurementFrequencyPointType();
			case TinnitusPackage.MEASUREMENT_INTENSITY_POINT_TYPE: return createMeasurementIntensityPointType();
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE: return createMinimumMaskingLevelType();
			case TinnitusPackage.RESIDUAL_INHIBITION_TYPE: return createResidualInhibitionType();
			case TinnitusPackage.SIGNAL_TYPE: return createSignalType();
			case TinnitusPackage.TINNITUS_LOUDNESS_MATCH_TYPE: return createTinnitusLoudnessMatchType();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE: return createTinnitusMeasurementDataType();
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE: return createTinnitusMeasurementNotesType();
			case TinnitusPackage.TINNITUS_PITCH_MATCH_TYPE: return createTinnitusPitchMatchType();
			case TinnitusPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case TinnitusPackage.SIGNAL_TYPES_TYPE:
				return createSignalTypesTypeFromString(eDataType, initialValue);
			case TinnitusPackage.SIGNAL_UNIT_TYPE:
				return createSignalUnitTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE:
				return createTinnitusInhibitionSucessTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE:
				return createTinnitusMatchSucessTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE:
				return createTinnitusPerceptionLocationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE:
				return createTinnitusTemporalCharacteristicTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TRANSDUCER_TYPE:
				return createTransducerTypeFromString(eDataType, initialValue);
			case TinnitusPackage.AUDIOMETER_MAKE_MODEL_TYPE:
				return createAudiometerMakeModelTypeFromString(eDataType, initialValue);
			case TinnitusPackage.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return createAudiometerSerialNumberTypeFromString(eDataType, initialValue);
			case TinnitusPackage.GAP_DURATION_TYPE:
				return createGapDurationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.INHIBITION_TIME_TYPE:
				return createInhibitionTimeTypeFromString(eDataType, initialValue);
			case TinnitusPackage.INTENSITY_TYPE:
				return createIntensityTypeFromString(eDataType, initialValue);
			case TinnitusPackage.LOWER_LIMIT_TYPE:
				return createLowerLimitTypeFromString(eDataType, initialValue);
			case TinnitusPackage.LOWER_SLOPE_TYPE:
				return createLowerSlopeTypeFromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_AMPLITUDE_MODULATION_TYPE:
				return createMaskingAmplitudeModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_BANDWIDTH_MODULATION_TYPE:
				return createMaskingBandwidthModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_FREQUENCY_MODULATION_TYPE:
				return createMaskingFrequencyModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE:
				return createMaskingFrequencyTypeFromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE1:
				return createMaskingFrequencyType1FromString(eDataType, initialValue);
			case TinnitusPackage.MASKING_TRANSDUCER_DESCRIPTION_TYPE:
				return createMaskingTransducerDescriptionTypeFromString(eDataType, initialValue);
			case TinnitusPackage.NUMBER_OF_CYCLES_TYPE:
				return createNumberOfCyclesTypeFromString(eDataType, initialValue);
			case TinnitusPackage.OTHER_MEASUREMENT_NOTES_TYPE:
				return createOtherMeasurementNotesTypeFromString(eDataType, initialValue);
			case TinnitusPackage.OTHER_SIGNAL_SPECIFICATION_TYPE:
				return createOtherSignalSpecificationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.PLATEAU_SLOPE_TYPE:
				return createPlateauSlopeTypeFromString(eDataType, initialValue);
			case TinnitusPackage.PULSE_DURATION_TYPE:
				return createPulseDurationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.SIGNAL_TYPES_TYPE_OBJECT:
				return createSignalTypesTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.SIGNAL_UNIT_TYPE_OBJECT:
				return createSignalUnitTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return createStimulusAmplitudeModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_BANDWIDTH_MODULATION_TYPE:
				return createStimulusBandwidthModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_EXPOSURE_TIME_TYPE:
				return createStimulusExposureTimeTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return createStimulusFrequencyModulationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE:
				return createStimulusFrequencyTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE1:
				return createStimulusFrequencyType1FromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_PULSE_DURATION_TYPE:
				return createStimulusPulseDurationTypeFromString(eDataType, initialValue);
			case TinnitusPackage.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE:
				return createStimulusTransducerDescriptionTypeFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT:
				return createTinnitusInhibitionSucessTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE_OBJECT:
				return createTinnitusMatchSucessTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT:
				return createTinnitusPerceptionLocationTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT:
				return createTinnitusTemporalCharacteristicTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.TRANSDUCER_TYPE_OBJECT:
				return createTransducerTypeObjectFromString(eDataType, initialValue);
			case TinnitusPackage.UPPER_LIMIT_TYPE:
				return createUpperLimitTypeFromString(eDataType, initialValue);
			case TinnitusPackage.UPPER_SLOPE_TYPE:
				return createUpperSlopeTypeFromString(eDataType, initialValue);
			case TinnitusPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
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
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case TinnitusPackage.SIGNAL_TYPES_TYPE:
				return convertSignalTypesTypeToString(eDataType, instanceValue);
			case TinnitusPackage.SIGNAL_UNIT_TYPE:
				return convertSignalUnitTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE:
				return convertTinnitusInhibitionSucessTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE:
				return convertTinnitusMatchSucessTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE:
				return convertTinnitusPerceptionLocationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE:
				return convertTinnitusTemporalCharacteristicTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TRANSDUCER_TYPE:
				return convertTransducerTypeToString(eDataType, instanceValue);
			case TinnitusPackage.AUDIOMETER_MAKE_MODEL_TYPE:
				return convertAudiometerMakeModelTypeToString(eDataType, instanceValue);
			case TinnitusPackage.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return convertAudiometerSerialNumberTypeToString(eDataType, instanceValue);
			case TinnitusPackage.GAP_DURATION_TYPE:
				return convertGapDurationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.INHIBITION_TIME_TYPE:
				return convertInhibitionTimeTypeToString(eDataType, instanceValue);
			case TinnitusPackage.INTENSITY_TYPE:
				return convertIntensityTypeToString(eDataType, instanceValue);
			case TinnitusPackage.LOWER_LIMIT_TYPE:
				return convertLowerLimitTypeToString(eDataType, instanceValue);
			case TinnitusPackage.LOWER_SLOPE_TYPE:
				return convertLowerSlopeTypeToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_AMPLITUDE_MODULATION_TYPE:
				return convertMaskingAmplitudeModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_BANDWIDTH_MODULATION_TYPE:
				return convertMaskingBandwidthModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_FREQUENCY_MODULATION_TYPE:
				return convertMaskingFrequencyModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE:
				return convertMaskingFrequencyTypeToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE1:
				return convertMaskingFrequencyType1ToString(eDataType, instanceValue);
			case TinnitusPackage.MASKING_TRANSDUCER_DESCRIPTION_TYPE:
				return convertMaskingTransducerDescriptionTypeToString(eDataType, instanceValue);
			case TinnitusPackage.NUMBER_OF_CYCLES_TYPE:
				return convertNumberOfCyclesTypeToString(eDataType, instanceValue);
			case TinnitusPackage.OTHER_MEASUREMENT_NOTES_TYPE:
				return convertOtherMeasurementNotesTypeToString(eDataType, instanceValue);
			case TinnitusPackage.OTHER_SIGNAL_SPECIFICATION_TYPE:
				return convertOtherSignalSpecificationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.PLATEAU_SLOPE_TYPE:
				return convertPlateauSlopeTypeToString(eDataType, instanceValue);
			case TinnitusPackage.PULSE_DURATION_TYPE:
				return convertPulseDurationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.SIGNAL_TYPES_TYPE_OBJECT:
				return convertSignalTypesTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.SIGNAL_UNIT_TYPE_OBJECT:
				return convertSignalUnitTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return convertStimulusAmplitudeModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_BANDWIDTH_MODULATION_TYPE:
				return convertStimulusBandwidthModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_EXPOSURE_TIME_TYPE:
				return convertStimulusExposureTimeTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return convertStimulusFrequencyModulationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE:
				return convertStimulusFrequencyTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE1:
				return convertStimulusFrequencyType1ToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_PULSE_DURATION_TYPE:
				return convertStimulusPulseDurationTypeToString(eDataType, instanceValue);
			case TinnitusPackage.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE:
				return convertStimulusTransducerDescriptionTypeToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT:
				return convertTinnitusInhibitionSucessTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE_OBJECT:
				return convertTinnitusMatchSucessTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT:
				return convertTinnitusPerceptionLocationTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT:
				return convertTinnitusTemporalCharacteristicTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.TRANSDUCER_TYPE_OBJECT:
				return convertTransducerTypeObjectToString(eDataType, instanceValue);
			case TinnitusPackage.UPPER_LIMIT_TYPE:
				return convertUpperLimitTypeToString(eDataType, instanceValue);
			case TinnitusPackage.UPPER_SLOPE_TYPE:
				return convertUpperSlopeTypeToString(eDataType, instanceValue);
			case TinnitusPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
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
	public BandwidthType createBandwidthType() {
		BandwidthTypeImpl bandwidthType = new BandwidthTypeImpl();
		return bandwidthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntensityType1 createIntensityType1() {
		IntensityType1Impl intensityType1 = new IntensityType1Impl();
		return intensityType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditionsType createMeasurementConditionsType() {
		MeasurementConditionsTypeImpl measurementConditionsType = new MeasurementConditionsTypeImpl();
		return measurementConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementEquipmentType createMeasurementEquipmentType() {
		MeasurementEquipmentTypeImpl measurementEquipmentType = new MeasurementEquipmentTypeImpl();
		return measurementEquipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementFrequencyPointType createMeasurementFrequencyPointType() {
		MeasurementFrequencyPointTypeImpl measurementFrequencyPointType = new MeasurementFrequencyPointTypeImpl();
		return measurementFrequencyPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementIntensityPointType createMeasurementIntensityPointType() {
		MeasurementIntensityPointTypeImpl measurementIntensityPointType = new MeasurementIntensityPointTypeImpl();
		return measurementIntensityPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinimumMaskingLevelType createMinimumMaskingLevelType() {
		MinimumMaskingLevelTypeImpl minimumMaskingLevelType = new MinimumMaskingLevelTypeImpl();
		return minimumMaskingLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResidualInhibitionType createResidualInhibitionType() {
		ResidualInhibitionTypeImpl residualInhibitionType = new ResidualInhibitionTypeImpl();
		return residualInhibitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType createSignalType() {
		SignalTypeImpl signalType = new SignalTypeImpl();
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusLoudnessMatchType createTinnitusLoudnessMatchType() {
		TinnitusLoudnessMatchTypeImpl tinnitusLoudnessMatchType = new TinnitusLoudnessMatchTypeImpl();
		return tinnitusLoudnessMatchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusMeasurementDataType createTinnitusMeasurementDataType() {
		TinnitusMeasurementDataTypeImpl tinnitusMeasurementDataType = new TinnitusMeasurementDataTypeImpl();
		return tinnitusMeasurementDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusMeasurementNotesType createTinnitusMeasurementNotesType() {
		TinnitusMeasurementNotesTypeImpl tinnitusMeasurementNotesType = new TinnitusMeasurementNotesTypeImpl();
		return tinnitusMeasurementNotesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusPitchMatchType createTinnitusPitchMatchType() {
		TinnitusPitchMatchTypeImpl tinnitusPitchMatchType = new TinnitusPitchMatchTypeImpl();
		return tinnitusPitchMatchType;
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
	public SignalTypesType createSignalTypesTypeFromString(EDataType eDataType, String initialValue) {
		SignalTypesType result = SignalTypesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalUnitType createSignalUnitTypeFromString(EDataType eDataType, String initialValue) {
		SignalUnitType result = SignalUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusInhibitionSucessType createTinnitusInhibitionSucessTypeFromString(EDataType eDataType, String initialValue) {
		TinnitusInhibitionSucessType result = TinnitusInhibitionSucessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusInhibitionSucessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusMatchSucessType createTinnitusMatchSucessTypeFromString(EDataType eDataType, String initialValue) {
		TinnitusMatchSucessType result = TinnitusMatchSucessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusMatchSucessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusPerceptionLocationType createTinnitusPerceptionLocationTypeFromString(EDataType eDataType, String initialValue) {
		TinnitusPerceptionLocationType result = TinnitusPerceptionLocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusPerceptionLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusTemporalCharacteristicType createTinnitusTemporalCharacteristicTypeFromString(EDataType eDataType, String initialValue) {
		TinnitusTemporalCharacteristicType result = TinnitusTemporalCharacteristicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusTemporalCharacteristicTypeToString(EDataType eDataType, Object instanceValue) {
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
	public BigDecimal createGapDurationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGapDurationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInhibitionTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInhibitionTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createIntensityTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntensityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLowerLimitTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowerLimitTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLowerSlopeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowerSlopeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
	public BigDecimal createMaskingBandwidthModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingBandwidthModulationTypeToString(EDataType eDataType, Object instanceValue) {
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
	public BigInteger createMaskingFrequencyTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingFrequencyTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMaskingFrequencyType1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingFrequencyType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMaskingTransducerDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskingTransducerDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNumberOfCyclesTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberOfCyclesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOtherMeasurementNotesTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherMeasurementNotesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOtherSignalSpecificationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherSignalSpecificationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPlateauSlopeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlateauSlopeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPulseDurationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPulseDurationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOutputType createSignalOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalOutputTypeFromString(TinnitusPackage.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(TinnitusPackage.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTypesType createSignalTypesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypesTypeFromString(TinnitusPackage.Literals.SIGNAL_TYPES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypesTypeToString(TinnitusPackage.Literals.SIGNAL_TYPES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalUnitType createSignalUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalUnitTypeFromString(TinnitusPackage.Literals.SIGNAL_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalUnitTypeToString(TinnitusPackage.Literals.SIGNAL_UNIT_TYPE, instanceValue);
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
	public BigDecimal createStimulusBandwidthModulationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusBandwidthModulationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusExposureTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusExposureTimeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public BigInteger createStimulusFrequencyTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusFrequencyTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createStimulusFrequencyType1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusFrequencyType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStimulusPulseDurationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusPulseDurationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStimulusTransducerDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStimulusTransducerDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusInhibitionSucessType createTinnitusInhibitionSucessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusInhibitionSucessTypeFromString(TinnitusPackage.Literals.TINNITUS_INHIBITION_SUCESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusInhibitionSucessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusInhibitionSucessTypeToString(TinnitusPackage.Literals.TINNITUS_INHIBITION_SUCESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusMatchSucessType createTinnitusMatchSucessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusMatchSucessTypeFromString(TinnitusPackage.Literals.TINNITUS_MATCH_SUCESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusMatchSucessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusMatchSucessTypeToString(TinnitusPackage.Literals.TINNITUS_MATCH_SUCESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusPerceptionLocationType createTinnitusPerceptionLocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusPerceptionLocationTypeFromString(TinnitusPackage.Literals.TINNITUS_PERCEPTION_LOCATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusPerceptionLocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusPerceptionLocationTypeToString(TinnitusPackage.Literals.TINNITUS_PERCEPTION_LOCATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusTemporalCharacteristicType createTinnitusTemporalCharacteristicTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusTemporalCharacteristicTypeFromString(TinnitusPackage.Literals.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusTemporalCharacteristicTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusTemporalCharacteristicTypeToString(TinnitusPackage.Literals.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerType createTransducerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransducerTypeFromString(TinnitusPackage.Literals.TRANSDUCER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerTypeToString(TinnitusPackage.Literals.TRANSDUCER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUpperLimitTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperLimitTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUpperSlopeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperSlopeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
	@Override
	public TinnitusPackage getTinnitusPackage() {
		return (TinnitusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TinnitusPackage getPackage() {
		return TinnitusPackage.eINSTANCE;
	}

} //TinnitusFactoryImpl
