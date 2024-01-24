/**
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.*;

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
public class _500FactoryImpl extends EFactoryImpl implements _500Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _500Factory init() {
		try {
			_500Factory the_500Factory = (_500Factory)EPackage.Registry.INSTANCE.getEFactory(_500Package.eNS_URI);
			if (the_500Factory != null) {
				return the_500Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _500FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _500FactoryImpl() {
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
			case _500Package.BANDWIDTH_TYPE: return createBandwidthType();
			case _500Package.INTENSITY_TYPE1: return createIntensityType1();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE: return createMeasurementConditionsType();
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE: return createMeasurementEquipmentType();
			case _500Package.MEASUREMENT_FREQUENCY_POINT_TYPE: return createMeasurementFrequencyPointType();
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE: return createMeasurementIntensityPointType();
			case _500Package.MINIMUM_MASKING_LEVEL_TYPE: return createMinimumMaskingLevelType();
			case _500Package.RESIDUAL_INHIBITION_TYPE: return createResidualInhibitionType();
			case _500Package.SIGNAL_TYPE: return createSignalType();
			case _500Package.TINNITUS_LOUDNESS_MATCH_TYPE: return createTinnitusLoudnessMatchType();
			case _500Package.TINNITUS_MEASUREMENT_DATA_TYPE: return createTinnitusMeasurementDataType();
			case _500Package.TINNITUS_MEASUREMENT_NOTES_TYPE: return createTinnitusMeasurementNotesType();
			case _500Package.TINNITUS_PITCH_MATCH_TYPE: return createTinnitusPitchMatchType();
			case _500Package.DOCUMENT_ROOT: return createDocumentRoot();
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
			case _500Package.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case _500Package.SIGNAL_TYPES_TYPE:
				return createSignalTypesTypeFromString(eDataType, initialValue);
			case _500Package.SIGNAL_UNIT_TYPE:
				return createSignalUnitTypeFromString(eDataType, initialValue);
			case _500Package.TINNITUS_INHIBITION_SUCESS_TYPE:
				return createTinnitusInhibitionSucessTypeFromString(eDataType, initialValue);
			case _500Package.TINNITUS_MATCH_SUCESS_TYPE:
				return createTinnitusMatchSucessTypeFromString(eDataType, initialValue);
			case _500Package.TINNITUS_PERCEPTION_LOCATION_TYPE:
				return createTinnitusPerceptionLocationTypeFromString(eDataType, initialValue);
			case _500Package.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE:
				return createTinnitusTemporalCharacteristicTypeFromString(eDataType, initialValue);
			case _500Package.TRANSDUCER_TYPE:
				return createTransducerTypeFromString(eDataType, initialValue);
			case _500Package.AUDIOMETER_MAKE_MODEL_TYPE:
				return createAudiometerMakeModelTypeFromString(eDataType, initialValue);
			case _500Package.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return createAudiometerSerialNumberTypeFromString(eDataType, initialValue);
			case _500Package.GAP_DURATION_TYPE:
				return createGapDurationTypeFromString(eDataType, initialValue);
			case _500Package.INHIBITION_TIME_TYPE:
				return createInhibitionTimeTypeFromString(eDataType, initialValue);
			case _500Package.INTENSITY_TYPE:
				return createIntensityTypeFromString(eDataType, initialValue);
			case _500Package.LOWER_LIMIT_TYPE:
				return createLowerLimitTypeFromString(eDataType, initialValue);
			case _500Package.LOWER_SLOPE_TYPE:
				return createLowerSlopeTypeFromString(eDataType, initialValue);
			case _500Package.MASKING_AMPLITUDE_MODULATION_TYPE:
				return createMaskingAmplitudeModulationTypeFromString(eDataType, initialValue);
			case _500Package.MASKING_BANDWIDTH_MODULATION_TYPE:
				return createMaskingBandwidthModulationTypeFromString(eDataType, initialValue);
			case _500Package.MASKING_FREQUENCY_MODULATION_TYPE:
				return createMaskingFrequencyModulationTypeFromString(eDataType, initialValue);
			case _500Package.MASKING_FREQUENCY_TYPE:
				return createMaskingFrequencyTypeFromString(eDataType, initialValue);
			case _500Package.MASKING_FREQUENCY_TYPE1:
				return createMaskingFrequencyType1FromString(eDataType, initialValue);
			case _500Package.MASKING_TRANSDUCER_DESCRIPTION_TYPE:
				return createMaskingTransducerDescriptionTypeFromString(eDataType, initialValue);
			case _500Package.NUMBER_OF_CYCLES_TYPE:
				return createNumberOfCyclesTypeFromString(eDataType, initialValue);
			case _500Package.OTHER_MEASUREMENT_NOTES_TYPE:
				return createOtherMeasurementNotesTypeFromString(eDataType, initialValue);
			case _500Package.OTHER_SIGNAL_SPECIFICATION_TYPE:
				return createOtherSignalSpecificationTypeFromString(eDataType, initialValue);
			case _500Package.PLATEAU_SLOPE_TYPE:
				return createPlateauSlopeTypeFromString(eDataType, initialValue);
			case _500Package.PULSE_DURATION_TYPE:
				return createPulseDurationTypeFromString(eDataType, initialValue);
			case _500Package.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case _500Package.SIGNAL_TYPES_TYPE_OBJECT:
				return createSignalTypesTypeObjectFromString(eDataType, initialValue);
			case _500Package.SIGNAL_UNIT_TYPE_OBJECT:
				return createSignalUnitTypeObjectFromString(eDataType, initialValue);
			case _500Package.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return createStimulusAmplitudeModulationTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_BANDWIDTH_MODULATION_TYPE:
				return createStimulusBandwidthModulationTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_EXPOSURE_TIME_TYPE:
				return createStimulusExposureTimeTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return createStimulusFrequencyModulationTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_FREQUENCY_TYPE:
				return createStimulusFrequencyTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_FREQUENCY_TYPE1:
				return createStimulusFrequencyType1FromString(eDataType, initialValue);
			case _500Package.STIMULUS_PULSE_DURATION_TYPE:
				return createStimulusPulseDurationTypeFromString(eDataType, initialValue);
			case _500Package.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE:
				return createStimulusTransducerDescriptionTypeFromString(eDataType, initialValue);
			case _500Package.TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT:
				return createTinnitusInhibitionSucessTypeObjectFromString(eDataType, initialValue);
			case _500Package.TINNITUS_MATCH_SUCESS_TYPE_OBJECT:
				return createTinnitusMatchSucessTypeObjectFromString(eDataType, initialValue);
			case _500Package.TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT:
				return createTinnitusPerceptionLocationTypeObjectFromString(eDataType, initialValue);
			case _500Package.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT:
				return createTinnitusTemporalCharacteristicTypeObjectFromString(eDataType, initialValue);
			case _500Package.TRANSDUCER_TYPE_OBJECT:
				return createTransducerTypeObjectFromString(eDataType, initialValue);
			case _500Package.UPPER_LIMIT_TYPE:
				return createUpperLimitTypeFromString(eDataType, initialValue);
			case _500Package.UPPER_SLOPE_TYPE:
				return createUpperSlopeTypeFromString(eDataType, initialValue);
			case _500Package.VERSION_TYPE:
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
			case _500Package.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case _500Package.SIGNAL_TYPES_TYPE:
				return convertSignalTypesTypeToString(eDataType, instanceValue);
			case _500Package.SIGNAL_UNIT_TYPE:
				return convertSignalUnitTypeToString(eDataType, instanceValue);
			case _500Package.TINNITUS_INHIBITION_SUCESS_TYPE:
				return convertTinnitusInhibitionSucessTypeToString(eDataType, instanceValue);
			case _500Package.TINNITUS_MATCH_SUCESS_TYPE:
				return convertTinnitusMatchSucessTypeToString(eDataType, instanceValue);
			case _500Package.TINNITUS_PERCEPTION_LOCATION_TYPE:
				return convertTinnitusPerceptionLocationTypeToString(eDataType, instanceValue);
			case _500Package.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE:
				return convertTinnitusTemporalCharacteristicTypeToString(eDataType, instanceValue);
			case _500Package.TRANSDUCER_TYPE:
				return convertTransducerTypeToString(eDataType, instanceValue);
			case _500Package.AUDIOMETER_MAKE_MODEL_TYPE:
				return convertAudiometerMakeModelTypeToString(eDataType, instanceValue);
			case _500Package.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return convertAudiometerSerialNumberTypeToString(eDataType, instanceValue);
			case _500Package.GAP_DURATION_TYPE:
				return convertGapDurationTypeToString(eDataType, instanceValue);
			case _500Package.INHIBITION_TIME_TYPE:
				return convertInhibitionTimeTypeToString(eDataType, instanceValue);
			case _500Package.INTENSITY_TYPE:
				return convertIntensityTypeToString(eDataType, instanceValue);
			case _500Package.LOWER_LIMIT_TYPE:
				return convertLowerLimitTypeToString(eDataType, instanceValue);
			case _500Package.LOWER_SLOPE_TYPE:
				return convertLowerSlopeTypeToString(eDataType, instanceValue);
			case _500Package.MASKING_AMPLITUDE_MODULATION_TYPE:
				return convertMaskingAmplitudeModulationTypeToString(eDataType, instanceValue);
			case _500Package.MASKING_BANDWIDTH_MODULATION_TYPE:
				return convertMaskingBandwidthModulationTypeToString(eDataType, instanceValue);
			case _500Package.MASKING_FREQUENCY_MODULATION_TYPE:
				return convertMaskingFrequencyModulationTypeToString(eDataType, instanceValue);
			case _500Package.MASKING_FREQUENCY_TYPE:
				return convertMaskingFrequencyTypeToString(eDataType, instanceValue);
			case _500Package.MASKING_FREQUENCY_TYPE1:
				return convertMaskingFrequencyType1ToString(eDataType, instanceValue);
			case _500Package.MASKING_TRANSDUCER_DESCRIPTION_TYPE:
				return convertMaskingTransducerDescriptionTypeToString(eDataType, instanceValue);
			case _500Package.NUMBER_OF_CYCLES_TYPE:
				return convertNumberOfCyclesTypeToString(eDataType, instanceValue);
			case _500Package.OTHER_MEASUREMENT_NOTES_TYPE:
				return convertOtherMeasurementNotesTypeToString(eDataType, instanceValue);
			case _500Package.OTHER_SIGNAL_SPECIFICATION_TYPE:
				return convertOtherSignalSpecificationTypeToString(eDataType, instanceValue);
			case _500Package.PLATEAU_SLOPE_TYPE:
				return convertPlateauSlopeTypeToString(eDataType, instanceValue);
			case _500Package.PULSE_DURATION_TYPE:
				return convertPulseDurationTypeToString(eDataType, instanceValue);
			case _500Package.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case _500Package.SIGNAL_TYPES_TYPE_OBJECT:
				return convertSignalTypesTypeObjectToString(eDataType, instanceValue);
			case _500Package.SIGNAL_UNIT_TYPE_OBJECT:
				return convertSignalUnitTypeObjectToString(eDataType, instanceValue);
			case _500Package.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return convertStimulusAmplitudeModulationTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_BANDWIDTH_MODULATION_TYPE:
				return convertStimulusBandwidthModulationTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_EXPOSURE_TIME_TYPE:
				return convertStimulusExposureTimeTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return convertStimulusFrequencyModulationTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_FREQUENCY_TYPE:
				return convertStimulusFrequencyTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_FREQUENCY_TYPE1:
				return convertStimulusFrequencyType1ToString(eDataType, instanceValue);
			case _500Package.STIMULUS_PULSE_DURATION_TYPE:
				return convertStimulusPulseDurationTypeToString(eDataType, instanceValue);
			case _500Package.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE:
				return convertStimulusTransducerDescriptionTypeToString(eDataType, instanceValue);
			case _500Package.TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT:
				return convertTinnitusInhibitionSucessTypeObjectToString(eDataType, instanceValue);
			case _500Package.TINNITUS_MATCH_SUCESS_TYPE_OBJECT:
				return convertTinnitusMatchSucessTypeObjectToString(eDataType, instanceValue);
			case _500Package.TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT:
				return convertTinnitusPerceptionLocationTypeObjectToString(eDataType, instanceValue);
			case _500Package.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT:
				return convertTinnitusTemporalCharacteristicTypeObjectToString(eDataType, instanceValue);
			case _500Package.TRANSDUCER_TYPE_OBJECT:
				return convertTransducerTypeObjectToString(eDataType, instanceValue);
			case _500Package.UPPER_LIMIT_TYPE:
				return convertUpperLimitTypeToString(eDataType, instanceValue);
			case _500Package.UPPER_SLOPE_TYPE:
				return convertUpperSlopeTypeToString(eDataType, instanceValue);
			case _500Package.VERSION_TYPE:
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
		return createSignalOutputTypeFromString(_500Package.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(_500Package.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTypesType createSignalTypesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypesTypeFromString(_500Package.Literals.SIGNAL_TYPES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypesTypeToString(_500Package.Literals.SIGNAL_TYPES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalUnitType createSignalUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalUnitTypeFromString(_500Package.Literals.SIGNAL_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalUnitTypeToString(_500Package.Literals.SIGNAL_UNIT_TYPE, instanceValue);
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
		return createTinnitusInhibitionSucessTypeFromString(_500Package.Literals.TINNITUS_INHIBITION_SUCESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusInhibitionSucessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusInhibitionSucessTypeToString(_500Package.Literals.TINNITUS_INHIBITION_SUCESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusMatchSucessType createTinnitusMatchSucessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusMatchSucessTypeFromString(_500Package.Literals.TINNITUS_MATCH_SUCESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusMatchSucessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusMatchSucessTypeToString(_500Package.Literals.TINNITUS_MATCH_SUCESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusPerceptionLocationType createTinnitusPerceptionLocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusPerceptionLocationTypeFromString(_500Package.Literals.TINNITUS_PERCEPTION_LOCATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusPerceptionLocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusPerceptionLocationTypeToString(_500Package.Literals.TINNITUS_PERCEPTION_LOCATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusTemporalCharacteristicType createTinnitusTemporalCharacteristicTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTinnitusTemporalCharacteristicTypeFromString(_500Package.Literals.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTinnitusTemporalCharacteristicTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTinnitusTemporalCharacteristicTypeToString(_500Package.Literals.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransducerType createTransducerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransducerTypeFromString(_500Package.Literals.TRANSDUCER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransducerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransducerTypeToString(_500Package.Literals.TRANSDUCER_TYPE, instanceValue);
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
	public _500Package get_500Package() {
		return (_500Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _500Package getPackage() {
		return _500Package.eINSTANCE;
	}

} //_500FactoryImpl
