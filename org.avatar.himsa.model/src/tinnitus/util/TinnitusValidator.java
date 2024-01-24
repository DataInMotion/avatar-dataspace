/**
 */
package tinnitus.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import tinnitus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tinnitus.TinnitusPackage
 * @generated
 */
public class TinnitusValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TinnitusValidator INSTANCE = new TinnitusValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tinnitus";

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
	public TinnitusValidator() {
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
	  return TinnitusPackage.eINSTANCE;
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
			case TinnitusPackage.BANDWIDTH_TYPE:
				return validateBandwidthType((BandwidthType)value, diagnostics, context);
			case TinnitusPackage.INTENSITY_TYPE1:
				return validateIntensityType1((IntensityType1)value, diagnostics, context);
			case TinnitusPackage.MEASUREMENT_CONDITIONS_TYPE:
				return validateMeasurementConditionsType((MeasurementConditionsType)value, diagnostics, context);
			case TinnitusPackage.MEASUREMENT_EQUIPMENT_TYPE:
				return validateMeasurementEquipmentType((MeasurementEquipmentType)value, diagnostics, context);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE:
				return validateMeasurementFrequencyPointType((MeasurementFrequencyPointType)value, diagnostics, context);
			case TinnitusPackage.MEASUREMENT_INTENSITY_POINT_TYPE:
				return validateMeasurementIntensityPointType((MeasurementIntensityPointType)value, diagnostics, context);
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE:
				return validateMinimumMaskingLevelType((MinimumMaskingLevelType)value, diagnostics, context);
			case TinnitusPackage.RESIDUAL_INHIBITION_TYPE:
				return validateResidualInhibitionType((ResidualInhibitionType)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_TYPE:
				return validateSignalType((SignalType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_LOUDNESS_MATCH_TYPE:
				return validateTinnitusLoudnessMatchType((TinnitusLoudnessMatchType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE:
				return validateTinnitusMeasurementDataType((TinnitusMeasurementDataType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE:
				return validateTinnitusMeasurementNotesType((TinnitusMeasurementNotesType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_PITCH_MATCH_TYPE:
				return validateTinnitusPitchMatchType((TinnitusPitchMatchType)value, diagnostics, context);
			case TinnitusPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE:
				return validateSignalOutputType((SignalOutputType)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_TYPES_TYPE:
				return validateSignalTypesType((SignalTypesType)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_UNIT_TYPE:
				return validateSignalUnitType((SignalUnitType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE:
				return validateTinnitusInhibitionSucessType((TinnitusInhibitionSucessType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE:
				return validateTinnitusMatchSucessType((TinnitusMatchSucessType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE:
				return validateTinnitusPerceptionLocationType((TinnitusPerceptionLocationType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE:
				return validateTinnitusTemporalCharacteristicType((TinnitusTemporalCharacteristicType)value, diagnostics, context);
			case TinnitusPackage.TRANSDUCER_TYPE:
				return validateTransducerType((TransducerType)value, diagnostics, context);
			case TinnitusPackage.AUDIOMETER_MAKE_MODEL_TYPE:
				return validateAudiometerMakeModelType((String)value, diagnostics, context);
			case TinnitusPackage.AUDIOMETER_SERIAL_NUMBER_TYPE:
				return validateAudiometerSerialNumberType((String)value, diagnostics, context);
			case TinnitusPackage.GAP_DURATION_TYPE:
				return validateGapDurationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.INHIBITION_TIME_TYPE:
				return validateInhibitionTimeType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.INTENSITY_TYPE:
				return validateIntensityType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.LOWER_LIMIT_TYPE:
				return validateLowerLimitType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.LOWER_SLOPE_TYPE:
				return validateLowerSlopeType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.MASKING_AMPLITUDE_MODULATION_TYPE:
				return validateMaskingAmplitudeModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.MASKING_BANDWIDTH_MODULATION_TYPE:
				return validateMaskingBandwidthModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.MASKING_FREQUENCY_MODULATION_TYPE:
				return validateMaskingFrequencyModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE:
				return validateMaskingFrequencyType((BigInteger)value, diagnostics, context);
			case TinnitusPackage.MASKING_FREQUENCY_TYPE1:
				return validateMaskingFrequencyType1((BigInteger)value, diagnostics, context);
			case TinnitusPackage.MASKING_TRANSDUCER_DESCRIPTION_TYPE:
				return validateMaskingTransducerDescriptionType((String)value, diagnostics, context);
			case TinnitusPackage.NUMBER_OF_CYCLES_TYPE:
				return validateNumberOfCyclesType((BigInteger)value, diagnostics, context);
			case TinnitusPackage.OTHER_MEASUREMENT_NOTES_TYPE:
				return validateOtherMeasurementNotesType((String)value, diagnostics, context);
			case TinnitusPackage.OTHER_SIGNAL_SPECIFICATION_TYPE:
				return validateOtherSignalSpecificationType((String)value, diagnostics, context);
			case TinnitusPackage.PLATEAU_SLOPE_TYPE:
				return validatePlateauSlopeType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.PULSE_DURATION_TYPE:
				return validatePulseDurationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return validateSignalOutputTypeObject((SignalOutputType)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_TYPES_TYPE_OBJECT:
				return validateSignalTypesTypeObject((SignalTypesType)value, diagnostics, context);
			case TinnitusPackage.SIGNAL_UNIT_TYPE_OBJECT:
				return validateSignalUnitTypeObject((SignalUnitType)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_AMPLITUDE_MODULATION_TYPE:
				return validateStimulusAmplitudeModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_BANDWIDTH_MODULATION_TYPE:
				return validateStimulusBandwidthModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_EXPOSURE_TIME_TYPE:
				return validateStimulusExposureTimeType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_FREQUENCY_MODULATION_TYPE:
				return validateStimulusFrequencyModulationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE:
				return validateStimulusFrequencyType((BigInteger)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_FREQUENCY_TYPE1:
				return validateStimulusFrequencyType1((BigInteger)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_PULSE_DURATION_TYPE:
				return validateStimulusPulseDurationType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE:
				return validateStimulusTransducerDescriptionType((String)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT:
				return validateTinnitusInhibitionSucessTypeObject((TinnitusInhibitionSucessType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_MATCH_SUCESS_TYPE_OBJECT:
				return validateTinnitusMatchSucessTypeObject((TinnitusMatchSucessType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT:
				return validateTinnitusPerceptionLocationTypeObject((TinnitusPerceptionLocationType)value, diagnostics, context);
			case TinnitusPackage.TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT:
				return validateTinnitusTemporalCharacteristicTypeObject((TinnitusTemporalCharacteristicType)value, diagnostics, context);
			case TinnitusPackage.TRANSDUCER_TYPE_OBJECT:
				return validateTransducerTypeObject((TransducerType)value, diagnostics, context);
			case TinnitusPackage.UPPER_LIMIT_TYPE:
				return validateUpperLimitType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.UPPER_SLOPE_TYPE:
				return validateUpperSlopeType((BigDecimal)value, diagnostics, context);
			case TinnitusPackage.VERSION_TYPE:
				return validateVersionType((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandwidthType(BandwidthType bandwidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bandwidthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntensityType1(IntensityType1 intensityType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intensityType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementConditionsType(MeasurementConditionsType measurementConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementEquipmentType(MeasurementEquipmentType measurementEquipmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementEquipmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementFrequencyPointType(MeasurementFrequencyPointType measurementFrequencyPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementFrequencyPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementIntensityPointType(MeasurementIntensityPointType measurementIntensityPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementIntensityPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimumMaskingLevelType(MinimumMaskingLevelType minimumMaskingLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minimumMaskingLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResidualInhibitionType(ResidualInhibitionType residualInhibitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(residualInhibitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalType(SignalType signalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusLoudnessMatchType(TinnitusLoudnessMatchType tinnitusLoudnessMatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tinnitusLoudnessMatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusMeasurementDataType(TinnitusMeasurementDataType tinnitusMeasurementDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tinnitusMeasurementDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusMeasurementNotesType(TinnitusMeasurementNotesType tinnitusMeasurementNotesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tinnitusMeasurementNotesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusPitchMatchType(TinnitusPitchMatchType tinnitusPitchMatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tinnitusPitchMatchType, diagnostics, context);
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
	public boolean validateSignalOutputType(SignalOutputType signalOutputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalTypesType(SignalTypesType signalTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalUnitType(SignalUnitType signalUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusInhibitionSucessType(TinnitusInhibitionSucessType tinnitusInhibitionSucessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusMatchSucessType(TinnitusMatchSucessType tinnitusMatchSucessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusPerceptionLocationType(TinnitusPerceptionLocationType tinnitusPerceptionLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusTemporalCharacteristicType(TinnitusTemporalCharacteristicType tinnitusTemporalCharacteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TinnitusPackage.Literals.AUDIOMETER_MAKE_MODEL_TYPE, audiometerMakeModelType, length, 255, diagnostics, context);
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
			reportMaxLengthViolation(TinnitusPackage.Literals.AUDIOMETER_SERIAL_NUMBER_TYPE, audiometerSerialNumberType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapDurationType(BigDecimal gapDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGapDurationType_Min(gapDurationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGapDurationType_Min
	 */
	public static final BigDecimal GAP_DURATION_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Gap Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapDurationType_Min(BigDecimal gapDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gapDurationType.compareTo(GAP_DURATION_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.GAP_DURATION_TYPE, gapDurationType, GAP_DURATION_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInhibitionTimeType(BigDecimal inhibitionTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInhibitionTimeType_Min(inhibitionTimeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInhibitionTimeType_Min
	 */
	public static final BigDecimal INHIBITION_TIME_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Inhibition Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInhibitionTimeType_Min(BigDecimal inhibitionTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = inhibitionTimeType.compareTo(INHIBITION_TIME_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.INHIBITION_TIME_TYPE, inhibitionTimeType, INHIBITION_TIME_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntensityType(BigDecimal intensityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntensityType_FractionDigits(intensityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Intensity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntensityType_FractionDigits(BigDecimal intensityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = intensityType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TinnitusPackage.Literals.INTENSITY_TYPE, intensityType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerLimitType(BigDecimal lowerLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLowerLimitType_Min(lowerLimitType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLowerLimitType_Min
	 */
	public static final BigDecimal LOWER_LIMIT_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Lower Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerLimitType_Min(BigDecimal lowerLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lowerLimitType.compareTo(LOWER_LIMIT_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.LOWER_LIMIT_TYPE, lowerLimitType, LOWER_LIMIT_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerSlopeType(BigDecimal lowerSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLowerSlopeType_Min(lowerSlopeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLowerSlopeType_Min
	 */
	public static final BigDecimal LOWER_SLOPE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Lower Slope Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerSlopeType_Min(BigDecimal lowerSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lowerSlopeType.compareTo(LOWER_SLOPE_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.LOWER_SLOPE_TYPE, lowerSlopeType, LOWER_SLOPE_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
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
			reportFractionDigitsViolation(TinnitusPackage.Literals.MASKING_AMPLITUDE_MODULATION_TYPE, maskingAmplitudeModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingBandwidthModulationType(BigDecimal maskingBandwidthModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingBandwidthModulationType_FractionDigits(maskingBandwidthModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Masking Bandwidth Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingBandwidthModulationType_FractionDigits(BigDecimal maskingBandwidthModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingBandwidthModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TinnitusPackage.Literals.MASKING_BANDWIDTH_MODULATION_TYPE, maskingBandwidthModulationType, 1, diagnostics, context);
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
			reportFractionDigitsViolation(TinnitusPackage.Literals.MASKING_FREQUENCY_MODULATION_TYPE, maskingFrequencyModulationType, 2, diagnostics, context);
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
			reportMinViolation(TinnitusPackage.Literals.MASKING_FREQUENCY_MODULATION_TYPE, maskingFrequencyModulationType, MASKING_FREQUENCY_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyType(BigInteger maskingFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingFrequencyType_Min(maskingFrequencyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingFrequencyType_Min
	 */
	public static final BigInteger MASKING_FREQUENCY_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Masking Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyType_Min(BigInteger maskingFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingFrequencyType.compareTo(MASKING_FREQUENCY_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.MASKING_FREQUENCY_TYPE, maskingFrequencyType, MASKING_FREQUENCY_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyType1(BigInteger maskingFrequencyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingFrequencyType1_Min(maskingFrequencyType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaskingFrequencyType1_Min
	 */
	public static final BigInteger MASKING_FREQUENCY_TYPE1__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Masking Frequency Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingFrequencyType1_Min(BigInteger maskingFrequencyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maskingFrequencyType1.compareTo(MASKING_FREQUENCY_TYPE1__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.MASKING_FREQUENCY_TYPE1, maskingFrequencyType1, MASKING_FREQUENCY_TYPE1__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingTransducerDescriptionType(String maskingTransducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaskingTransducerDescriptionType_MaxLength(maskingTransducerDescriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Masking Transducer Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskingTransducerDescriptionType_MaxLength(String maskingTransducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = maskingTransducerDescriptionType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TinnitusPackage.Literals.MASKING_TRANSDUCER_DESCRIPTION_TYPE, maskingTransducerDescriptionType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfCyclesType(BigInteger numberOfCyclesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumberOfCyclesType_Min(numberOfCyclesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumberOfCyclesType_Min
	 */
	public static final BigInteger NUMBER_OF_CYCLES_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Number Of Cycles Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfCyclesType_Min(BigInteger numberOfCyclesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = numberOfCyclesType.compareTo(NUMBER_OF_CYCLES_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.NUMBER_OF_CYCLES_TYPE, numberOfCyclesType, NUMBER_OF_CYCLES_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherMeasurementNotesType(String otherMeasurementNotesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOtherMeasurementNotesType_MaxLength(otherMeasurementNotesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Other Measurement Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherMeasurementNotesType_MaxLength(String otherMeasurementNotesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = otherMeasurementNotesType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TinnitusPackage.Literals.OTHER_MEASUREMENT_NOTES_TYPE, otherMeasurementNotesType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSignalSpecificationType(String otherSignalSpecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOtherSignalSpecificationType_MaxLength(otherSignalSpecificationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Other Signal Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherSignalSpecificationType_MaxLength(String otherSignalSpecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = otherSignalSpecificationType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TinnitusPackage.Literals.OTHER_SIGNAL_SPECIFICATION_TYPE, otherSignalSpecificationType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateauSlopeType(BigDecimal plateauSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePlateauSlopeType_Min(plateauSlopeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePlateauSlopeType_Min
	 */
	public static final BigDecimal PLATEAU_SLOPE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Plateau Slope Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateauSlopeType_Min(BigDecimal plateauSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = plateauSlopeType.compareTo(PLATEAU_SLOPE_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.PLATEAU_SLOPE_TYPE, plateauSlopeType, PLATEAU_SLOPE_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulseDurationType(BigDecimal pulseDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePulseDurationType_Min(pulseDurationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePulseDurationType_Min
	 */
	public static final BigDecimal PULSE_DURATION_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Pulse Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulseDurationType_Min(BigDecimal pulseDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = pulseDurationType.compareTo(PULSE_DURATION_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.PULSE_DURATION_TYPE, pulseDurationType, PULSE_DURATION_TYPE__MIN__VALUE, false, diagnostics, context);
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
	public boolean validateSignalTypesTypeObject(SignalTypesType signalTypesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalUnitTypeObject(SignalUnitType signalUnitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
			reportFractionDigitsViolation(TinnitusPackage.Literals.STIMULUS_AMPLITUDE_MODULATION_TYPE, stimulusAmplitudeModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusBandwidthModulationType(BigDecimal stimulusBandwidthModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusBandwidthModulationType_FractionDigits(stimulusBandwidthModulationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Stimulus Bandwidth Modulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusBandwidthModulationType_FractionDigits(BigDecimal stimulusBandwidthModulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusBandwidthModulationType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TinnitusPackage.Literals.STIMULUS_BANDWIDTH_MODULATION_TYPE, stimulusBandwidthModulationType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusExposureTimeType(BigDecimal stimulusExposureTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusExposureTimeType_Min(stimulusExposureTimeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusExposureTimeType_Min
	 */
	public static final BigDecimal STIMULUS_EXPOSURE_TIME_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Stimulus Exposure Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusExposureTimeType_Min(BigDecimal stimulusExposureTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusExposureTimeType.compareTo(STIMULUS_EXPOSURE_TIME_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.STIMULUS_EXPOSURE_TIME_TYPE, stimulusExposureTimeType, STIMULUS_EXPOSURE_TIME_TYPE__MIN__VALUE, false, diagnostics, context);
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
			reportFractionDigitsViolation(TinnitusPackage.Literals.STIMULUS_FREQUENCY_MODULATION_TYPE, stimulusFrequencyModulationType, 2, diagnostics, context);
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
			reportMinViolation(TinnitusPackage.Literals.STIMULUS_FREQUENCY_MODULATION_TYPE, stimulusFrequencyModulationType, STIMULUS_FREQUENCY_MODULATION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyType(BigInteger stimulusFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusFrequencyType_Min(stimulusFrequencyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusFrequencyType_Min
	 */
	public static final BigInteger STIMULUS_FREQUENCY_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Stimulus Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyType_Min(BigInteger stimulusFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusFrequencyType.compareTo(STIMULUS_FREQUENCY_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.STIMULUS_FREQUENCY_TYPE, stimulusFrequencyType, STIMULUS_FREQUENCY_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyType1(BigInteger stimulusFrequencyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusFrequencyType1_Min(stimulusFrequencyType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusFrequencyType1_Min
	 */
	public static final BigInteger STIMULUS_FREQUENCY_TYPE1__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Stimulus Frequency Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusFrequencyType1_Min(BigInteger stimulusFrequencyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusFrequencyType1.compareTo(STIMULUS_FREQUENCY_TYPE1__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.STIMULUS_FREQUENCY_TYPE1, stimulusFrequencyType1, STIMULUS_FREQUENCY_TYPE1__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseDurationType(BigDecimal stimulusPulseDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusPulseDurationType_Min(stimulusPulseDurationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStimulusPulseDurationType_Min
	 */
	public static final BigDecimal STIMULUS_PULSE_DURATION_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Stimulus Pulse Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusPulseDurationType_Min(BigDecimal stimulusPulseDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stimulusPulseDurationType.compareTo(STIMULUS_PULSE_DURATION_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.STIMULUS_PULSE_DURATION_TYPE, stimulusPulseDurationType, STIMULUS_PULSE_DURATION_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusTransducerDescriptionType(String stimulusTransducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStimulusTransducerDescriptionType_MaxLength(stimulusTransducerDescriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Stimulus Transducer Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusTransducerDescriptionType_MaxLength(String stimulusTransducerDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stimulusTransducerDescriptionType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TinnitusPackage.Literals.STIMULUS_TRANSDUCER_DESCRIPTION_TYPE, stimulusTransducerDescriptionType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusInhibitionSucessTypeObject(TinnitusInhibitionSucessType tinnitusInhibitionSucessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusMatchSucessTypeObject(TinnitusMatchSucessType tinnitusMatchSucessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusPerceptionLocationTypeObject(TinnitusPerceptionLocationType tinnitusPerceptionLocationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinnitusTemporalCharacteristicTypeObject(TinnitusTemporalCharacteristicType tinnitusTemporalCharacteristicTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateUpperLimitType(BigDecimal upperLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperLimitType_Min(upperLimitType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUpperLimitType_Min
	 */
	public static final BigDecimal UPPER_LIMIT_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Upper Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperLimitType_Min(BigDecimal upperLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = upperLimitType.compareTo(UPPER_LIMIT_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.UPPER_LIMIT_TYPE, upperLimitType, UPPER_LIMIT_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperSlopeType(BigDecimal upperSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperSlopeType_Min(upperSlopeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUpperSlopeType_Min
	 */
	public static final BigDecimal UPPER_SLOPE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Upper Slope Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperSlopeType_Min(BigDecimal upperSlopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = upperSlopeType.compareTo(UPPER_SLOPE_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(TinnitusPackage.Literals.UPPER_SLOPE_TYPE, upperSlopeType, UPPER_SLOPE_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
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
			reportMinViolation(TinnitusPackage.Literals.VERSION_TYPE, versionType, VERSION_TYPE__MIN__VALUE, true, diagnostics, context);
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

} //TinnitusValidator
