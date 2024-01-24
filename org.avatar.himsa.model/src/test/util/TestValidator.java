/**
 */
package test.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see test.TestPackage
 * @generated
 */
public class TestValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestValidator INSTANCE = new TestValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "test";

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
	public TestValidator() {
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
	  return TestPackage.eINSTANCE;
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
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT:
				return validateAttackReleaseMeasurementPoint((AttackReleaseMeasurementPoint)value, diagnostics, context);
			case TestPackage.BATTERY_CURRENT_MEASUREMENT:
				return validateBatteryCurrentMeasurement((BatteryCurrentMeasurement)value, diagnostics, context);
			case TestPackage.BATTERY_MEASUREMENT_CONDITIONS:
				return validateBatteryMeasurementConditions((BatteryMeasurementConditions)value, diagnostics, context);
			case TestPackage.BATTERY_MEASUREMENT_POINT:
				return validateBatteryMeasurementPoint((BatteryMeasurementPoint)value, diagnostics, context);
			case TestPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TestPackage.EQUIVALENT_INPUT_NOISE:
				return validateEquivalentInputNoise((EquivalentInputNoise)value, diagnostics, context);
			case TestPackage.FREQUENCY_MEASUREMENT:
				return validateFrequencyMeasurement((FrequencyMeasurement)value, diagnostics, context);
			case TestPackage.FREQUENCY_MEASUREMENT_POINT:
				return validateFrequencyMeasurementPoint((FrequencyMeasurementPoint)value, diagnostics, context);
			case TestPackage.FULL_TARGET_CURVE:
				return validateFullTargetCurve((FullTargetCurve)value, diagnostics, context);
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE:
				return validateHarmonicDistortionMeasurementCurve((HarmonicDistortionMeasurementCurve)value, diagnostics, context);
			case TestPackage.HARMONIC_DISTORTION_POINT:
				return validateHarmonicDistortionPoint((HarmonicDistortionPoint)value, diagnostics, context);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE:
				return validateHearingInstrumentTestType((HearingInstrumentTestType)value, diagnostics, context);
			case TestPackage.HIMSA_HIT_STANDARD_TYPE:
				return validateHIMSAHitStandardType((HIMSAHitStandardType)value, diagnostics, context);
			case TestPackage.INPUT_OUTPUT_MEASUREMENT:
				return validateInputOutputMeasurement((InputOutputMeasurement)value, diagnostics, context);
			case TestPackage.INPUT_OUTPUT_POINT:
				return validateInputOutputPoint((InputOutputPoint)value, diagnostics, context);
			case TestPackage.INTERMODULATION_DISTORTION_MEASUREMENT:
				return validateIntermodulationDistortionMeasurement((IntermodulationDistortionMeasurement)value, diagnostics, context);
			case TestPackage.INTERMODULATION_DISTORTION_POINT:
				return validateIntermodulationDistortionPoint((IntermodulationDistortionPoint)value, diagnostics, context);
			case TestPackage.MEASUREMENT_CONDITIONS:
				return validateMeasurementConditions((MeasurementConditions)value, diagnostics, context);
			case TestPackage.OCCLUSION_EFFECTS:
				return validateOcclusionEffects((OcclusionEffects)value, diagnostics, context);
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE:
				return validateRealEarCouplerDifference((RealEarCouplerDifference)value, diagnostics, context);
			case TestPackage.TARGET_CURVE:
				return validateTargetCurve((TargetCurve)value, diagnostics, context);
			case TestPackage.TARGET_MEASUREMENT:
				return validateTargetMeasurement((TargetMeasurement)value, diagnostics, context);
			case TestPackage.TARGET_MEASUREMENT_POINT:
				return validateTargetMeasurementPoint((TargetMeasurementPoint)value, diagnostics, context);
			case TestPackage.TARGET_POINT:
				return validateTargetPoint((TargetPoint)value, diagnostics, context);
			case TestPackage.BATTERY_PILL_TYPE:
				return validateBatteryPillType((BatteryPillType)value, diagnostics, context);
			case TestPackage.BATTERY_TYPE:
				return validateBatteryType((BatteryType)value, diagnostics, context);
			case TestPackage.COUPLER_TYPE:
				return validateCouplerType((CouplerType)value, diagnostics, context);
			case TestPackage.FITTING_RULE:
				return validateFittingRule((FittingRule)value, diagnostics, context);
			case TestPackage.HEARING_INSTRUMENT_TYPE:
				return validateHearingInstrumentType((HearingInstrumentType)value, diagnostics, context);
			case TestPackage.MEASUREMENT_IDENTIFICATION:
				return validateMeasurementIdentification((MeasurementIdentification)value, diagnostics, context);
			case TestPackage.MEASUREMENT_MODE:
				return validateMeasurementMode((MeasurementMode)value, diagnostics, context);
			case TestPackage.SIGNAL_OUTPUT_TYPE:
				return validateSignalOutputType((SignalOutputType)value, diagnostics, context);
			case TestPackage.SIGNAL_TYPE:
				return validateSignalType((SignalType)value, diagnostics, context);
			case TestPackage.ATTACK_RELEASE_TIME_TYPE:
				return validateAttackReleaseTimeType((BigDecimal)value, diagnostics, context);
			case TestPackage.BATTERY_IMPEDANCE_TYPE:
				return validateBatteryImpedanceType((BigDecimal)value, diagnostics, context);
			case TestPackage.BATTERY_IMPEDANCE_TYPE1:
				return validateBatteryImpedanceType1((BigDecimal)value, diagnostics, context);
			case TestPackage.BATTERY_PILL_TYPE_OBJECT:
				return validateBatteryPillTypeObject((BatteryPillType)value, diagnostics, context);
			case TestPackage.BATTERY_TYPE_OBJECT:
				return validateBatteryTypeObject((BatteryType)value, diagnostics, context);
			case TestPackage.BATTERY_VOLTAGE_TYPE:
				return validateBatteryVoltageType((BigDecimal)value, diagnostics, context);
			case TestPackage.BATTERY_VOLTAGE_TYPE1:
				return validateBatteryVoltageType1((BigDecimal)value, diagnostics, context);
			case TestPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return validateConvertedFromDataStandardType((BigInteger)value, diagnostics, context);
			case TestPackage.COUPLER_TYPE_OBJECT:
				return validateCouplerTypeObject((CouplerType)value, diagnostics, context);
			case TestPackage.CURRENT_TYPE:
				return validateCurrentType((BigDecimal)value, diagnostics, context);
			case TestPackage.EQUIVALENT_ROOT_MEAN_SQUARE_TYPE:
				return validateEquivalentRootMeanSquareType((BigDecimal)value, diagnostics, context);
			case TestPackage.FITTING_RULE_OBJECT:
				return validateFittingRuleObject((FittingRule)value, diagnostics, context);
			case TestPackage.FX1_TYPE:
				return validateFx1Type((BigDecimal)value, diagnostics, context);
			case TestPackage.FX2_TYPE:
				return validateFx2Type((BigDecimal)value, diagnostics, context);
			case TestPackage.FX3_TYPE:
				return validateFx3Type((BigDecimal)value, diagnostics, context);
			case TestPackage.HEARING_INSTRUMENT_TYPE_OBJECT:
				return validateHearingInstrumentTypeObject((HearingInstrumentType)value, diagnostics, context);
			case TestPackage.INPUT1_TYPE:
				return validateInput1Type((BigDecimal)value, diagnostics, context);
			case TestPackage.INPUT2_TYPE:
				return validateInput2Type((BigDecimal)value, diagnostics, context);
			case TestPackage.INPUT_TYPE:
				return validateInputType((BigDecimal)value, diagnostics, context);
			case TestPackage.INPUT_TYPE1:
				return validateInputType1((BigDecimal)value, diagnostics, context);
			case TestPackage.INPUT_TYPE2:
				return validateInputType2((BigDecimal)value, diagnostics, context);
			case TestPackage.LEVEL_STEP_TYPE:
				return validateLevelStepType((BigDecimal)value, diagnostics, context);
			case TestPackage.MEASUREMENT_IDENTIFICATION_OBJECT:
				return validateMeasurementIdentificationObject((MeasurementIdentification)value, diagnostics, context);
			case TestPackage.MEASUREMENT_MODE_OBJECT:
				return validateMeasurementModeObject((MeasurementMode)value, diagnostics, context);
			case TestPackage.OUTPUT1_TYPE:
				return validateOutput1Type((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT2_TYPE:
				return validateOutput2Type((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_DIFF1_TYPE:
				return validateOutputDiff1Type((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_DIFF2_TYPE:
				return validateOutputDiff2Type((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_TYPE:
				return validateOutputType((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_TYPE1:
				return validateOutputType1((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_TYPE2:
				return validateOutputType2((BigDecimal)value, diagnostics, context);
			case TestPackage.OUTPUT_TYPE3:
				return validateOutputType3((BigDecimal)value, diagnostics, context);
			case TestPackage.RESERVE_GAIN_TYPE:
				return validateReserveGainType((BigDecimal)value, diagnostics, context);
			case TestPackage.RULE_NAME_TYPE:
				return validateRuleNameType((String)value, diagnostics, context);
			case TestPackage.SIGNAL_LEVEL_TYPE:
				return validateSignalLevelType((BigDecimal)value, diagnostics, context);
			case TestPackage.SIGNAL_LEVEL_TYPE1:
				return validateSignalLevelType1((BigDecimal)value, diagnostics, context);
			case TestPackage.SIGNAL_LEVEL_TYPE2:
				return validateSignalLevelType2((BigDecimal)value, diagnostics, context);
			case TestPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return validateSignalOutputTypeObject((SignalOutputType)value, diagnostics, context);
			case TestPackage.SIGNAL_TYPE_OBJECT:
				return validateSignalTypeObject((SignalType)value, diagnostics, context);
			case TestPackage.TARGET_GAIN_TYPE:
				return validateTargetGainType((BigDecimal)value, diagnostics, context);
			case TestPackage.THIRD_HD_TYPE:
				return validateThirdHDType((BigDecimal)value, diagnostics, context);
			case TestPackage.TI_DISTORTION_TYPE:
				return validateTIDistortionType((BigDecimal)value, diagnostics, context);
			case TestPackage.VENT_CANAL_DIAMETER_TYPE:
				return validateVentCanalDiameterType((BigDecimal)value, diagnostics, context);
			case TestPackage.VENT_CANAL_LENGTH_TYPE:
				return validateVentCanalLengthType((BigDecimal)value, diagnostics, context);
			case TestPackage.VERSION_TYPE:
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
	public boolean validateAttackReleaseMeasurementPoint(AttackReleaseMeasurementPoint attackReleaseMeasurementPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attackReleaseMeasurementPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryCurrentMeasurement(BatteryCurrentMeasurement batteryCurrentMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batteryCurrentMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryMeasurementConditions(BatteryMeasurementConditions batteryMeasurementConditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batteryMeasurementConditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryMeasurementPoint(BatteryMeasurementPoint batteryMeasurementPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batteryMeasurementPoint, diagnostics, context);
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
	public boolean validateEquivalentInputNoise(EquivalentInputNoise equivalentInputNoise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equivalentInputNoise, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyMeasurement(FrequencyMeasurement frequencyMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyMeasurementPoint(FrequencyMeasurementPoint frequencyMeasurementPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyMeasurementPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullTargetCurve(FullTargetCurve fullTargetCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fullTargetCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarmonicDistortionMeasurementCurve(HarmonicDistortionMeasurementCurve harmonicDistortionMeasurementCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(harmonicDistortionMeasurementCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarmonicDistortionPoint(HarmonicDistortionPoint harmonicDistortionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(harmonicDistortionPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentTestType(HearingInstrumentTestType hearingInstrumentTestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hearingInstrumentTestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIMSAHitStandardType(HIMSAHitStandardType himsaHitStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(himsaHitStandardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputMeasurement(InputOutputMeasurement inputOutputMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputPoint(InputOutputPoint inputOutputPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermodulationDistortionMeasurement(IntermodulationDistortionMeasurement intermodulationDistortionMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intermodulationDistortionMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermodulationDistortionPoint(IntermodulationDistortionPoint intermodulationDistortionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intermodulationDistortionPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementConditions(MeasurementConditions measurementConditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementConditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcclusionEffects(OcclusionEffects occlusionEffects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(occlusionEffects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealEarCouplerDifference(RealEarCouplerDifference realEarCouplerDifference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realEarCouplerDifference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetCurve(TargetCurve targetCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetMeasurement(TargetMeasurement targetMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetMeasurementPoint(TargetMeasurementPoint targetMeasurementPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetMeasurementPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetPoint(TargetPoint targetPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryPillType(BatteryPillType batteryPillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryType(BatteryType batteryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCouplerType(CouplerType couplerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFittingRule(FittingRule fittingRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentType(HearingInstrumentType hearingInstrumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementIdentification(MeasurementIdentification measurementIdentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementMode(MeasurementMode measurementMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateAttackReleaseTimeType(BigDecimal attackReleaseTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAttackReleaseTimeType_FractionDigits(attackReleaseTimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttackReleaseTimeType_Min(attackReleaseTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Attack Release Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackReleaseTimeType_FractionDigits(BigDecimal attackReleaseTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = attackReleaseTimeType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.ATTACK_RELEASE_TIME_TYPE, attackReleaseTimeType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAttackReleaseTimeType_Min
	 */
	public static final BigDecimal ATTACK_RELEASE_TIME_TYPE__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Attack Release Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackReleaseTimeType_Min(BigDecimal attackReleaseTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = attackReleaseTimeType.compareTo(ATTACK_RELEASE_TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(TestPackage.Literals.ATTACK_RELEASE_TIME_TYPE, attackReleaseTimeType, ATTACK_RELEASE_TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryImpedanceType(BigDecimal batteryImpedanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBatteryImpedanceType_FractionDigits(batteryImpedanceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Battery Impedance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryImpedanceType_FractionDigits(BigDecimal batteryImpedanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = batteryImpedanceType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.BATTERY_IMPEDANCE_TYPE, batteryImpedanceType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryImpedanceType1(BigDecimal batteryImpedanceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBatteryImpedanceType1_FractionDigits(batteryImpedanceType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Battery Impedance Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryImpedanceType1_FractionDigits(BigDecimal batteryImpedanceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = batteryImpedanceType1.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.BATTERY_IMPEDANCE_TYPE1, batteryImpedanceType1, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryPillTypeObject(BatteryPillType batteryPillTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryTypeObject(BatteryType batteryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryVoltageType(BigDecimal batteryVoltageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBatteryVoltageType_FractionDigits(batteryVoltageType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Battery Voltage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryVoltageType_FractionDigits(BigDecimal batteryVoltageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = batteryVoltageType.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.BATTERY_VOLTAGE_TYPE, batteryVoltageType, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryVoltageType1(BigDecimal batteryVoltageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBatteryVoltageType1_FractionDigits(batteryVoltageType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Battery Voltage Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryVoltageType1_FractionDigits(BigDecimal batteryVoltageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = batteryVoltageType1.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.BATTERY_VOLTAGE_TYPE1, batteryVoltageType1, 3, diagnostics, context);
		return result;
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
			reportMinViolation(TestPackage.Literals.CONVERTED_FROM_DATA_STANDARD_TYPE, convertedFromDataStandardType, CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCouplerTypeObject(CouplerType couplerTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentType(BigDecimal currentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCurrentType_FractionDigits(currentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Current Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentType_FractionDigits(BigDecimal currentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = currentType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.CURRENT_TYPE, currentType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentRootMeanSquareType(BigDecimal equivalentRootMeanSquareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEquivalentRootMeanSquareType_FractionDigits(equivalentRootMeanSquareType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Equivalent Root Mean Square Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentRootMeanSquareType_FractionDigits(BigDecimal equivalentRootMeanSquareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = equivalentRootMeanSquareType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.EQUIVALENT_ROOT_MEAN_SQUARE_TYPE, equivalentRootMeanSquareType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFittingRuleObject(FittingRule fittingRuleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx1Type(BigDecimal fx1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFx1Type_FractionDigits(fx1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Fx1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx1Type_FractionDigits(BigDecimal fx1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fx1Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.FX1_TYPE, fx1Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx2Type(BigDecimal fx2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFx2Type_FractionDigits(fx2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Fx2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx2Type_FractionDigits(BigDecimal fx2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fx2Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.FX2_TYPE, fx2Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx3Type(BigDecimal fx3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFx3Type_FractionDigits(fx3Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Fx3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFx3Type_FractionDigits(BigDecimal fx3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fx3Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.FX3_TYPE, fx3Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHearingInstrumentTypeObject(HearingInstrumentType hearingInstrumentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput1Type(BigDecimal input1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInput1Type_FractionDigits(input1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Input1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput1Type_FractionDigits(BigDecimal input1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = input1Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.INPUT1_TYPE, input1Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput2Type(BigDecimal input2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInput2Type_FractionDigits(input2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Input2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput2Type_FractionDigits(BigDecimal input2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = input2Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.INPUT2_TYPE, input2Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(BigDecimal inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInputType_FractionDigits(inputType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType_FractionDigits(BigDecimal inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = inputType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.INPUT_TYPE, inputType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType1(BigDecimal inputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInputType1_FractionDigits(inputType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Input Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType1_FractionDigits(BigDecimal inputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = inputType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.INPUT_TYPE1, inputType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType2(BigDecimal inputType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInputType2_FractionDigits(inputType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Input Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType2_FractionDigits(BigDecimal inputType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = inputType2.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.INPUT_TYPE2, inputType2, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelStepType(BigDecimal levelStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLevelStepType_FractionDigits(levelStepType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Level Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelStepType_FractionDigits(BigDecimal levelStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = levelStepType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.LEVEL_STEP_TYPE, levelStepType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementIdentificationObject(MeasurementIdentification measurementIdentificationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementModeObject(MeasurementMode measurementModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput1Type(BigDecimal output1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutput1Type_FractionDigits(output1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput1Type_FractionDigits(BigDecimal output1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = output1Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT1_TYPE, output1Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput2Type(BigDecimal output2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutput2Type_FractionDigits(output2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput2Type_FractionDigits(BigDecimal output2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = output2Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT2_TYPE, output2Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDiff1Type(BigDecimal outputDiff1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputDiff1Type_FractionDigits(outputDiff1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output Diff1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDiff1Type_FractionDigits(BigDecimal outputDiff1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = outputDiff1Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT_DIFF1_TYPE, outputDiff1Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDiff2Type(BigDecimal outputDiff2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputDiff2Type_FractionDigits(outputDiff2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output Diff2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDiff2Type_FractionDigits(BigDecimal outputDiff2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = outputDiff2Type.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT_DIFF2_TYPE, outputDiff2Type, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(BigDecimal outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputType_FractionDigits(outputType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType_FractionDigits(BigDecimal outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = outputType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT_TYPE, outputType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType1(BigDecimal outputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputType1_TotalDigits(outputType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TotalDigits constraint of '<em>Output Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType1_TotalDigits(BigDecimal outputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int scale = outputType1.scale();
		int totalDigits = scale < 0 ? outputType1.precision() - scale : outputType1.precision();
		boolean result = totalDigits <= 1;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(TestPackage.Literals.OUTPUT_TYPE1, outputType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType2(BigDecimal outputType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputType2_FractionDigits(outputType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType2_FractionDigits(BigDecimal outputType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = outputType2.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT_TYPE2, outputType2, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType3(BigDecimal outputType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutputType3_FractionDigits(outputType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Output Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType3_FractionDigits(BigDecimal outputType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = outputType3.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.OUTPUT_TYPE3, outputType3, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveGainType(BigDecimal reserveGainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReserveGainType_FractionDigits(reserveGainType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Reserve Gain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveGainType_FractionDigits(BigDecimal reserveGainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = reserveGainType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.RESERVE_GAIN_TYPE, reserveGainType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleNameType(String ruleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRuleNameType_MaxLength(ruleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Rule Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleNameType_MaxLength(String ruleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ruleNameType.length();
		boolean result = length <= 51;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TestPackage.Literals.RULE_NAME_TYPE, ruleNameType, length, 51, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType(BigDecimal signalLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalLevelType_FractionDigits(signalLevelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Signal Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType_FractionDigits(BigDecimal signalLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = signalLevelType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.SIGNAL_LEVEL_TYPE, signalLevelType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType1(BigDecimal signalLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalLevelType1_FractionDigits(signalLevelType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Signal Level Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType1_FractionDigits(BigDecimal signalLevelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = signalLevelType1.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.SIGNAL_LEVEL_TYPE1, signalLevelType1, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType2(BigDecimal signalLevelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalLevelType2_FractionDigits(signalLevelType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Signal Level Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType2_FractionDigits(BigDecimal signalLevelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = signalLevelType2.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.SIGNAL_LEVEL_TYPE2, signalLevelType2, 1, diagnostics, context);
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
	public boolean validateTargetGainType(BigDecimal targetGainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTargetGainType_FractionDigits(targetGainType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Target Gain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetGainType_FractionDigits(BigDecimal targetGainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = targetGainType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.TARGET_GAIN_TYPE, targetGainType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThirdHDType(BigDecimal thirdHDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateThirdHDType_FractionDigits(thirdHDType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Third HD Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThirdHDType_FractionDigits(BigDecimal thirdHDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = thirdHDType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.THIRD_HD_TYPE, thirdHDType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIDistortionType(BigDecimal tiDistortionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTIDistortionType_FractionDigits(tiDistortionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>TI Distortion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIDistortionType_FractionDigits(BigDecimal tiDistortionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tiDistortionType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.TI_DISTORTION_TYPE, tiDistortionType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVentCanalDiameterType(BigDecimal ventCanalDiameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVentCanalDiameterType_FractionDigits(ventCanalDiameterType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Vent Canal Diameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVentCanalDiameterType_FractionDigits(BigDecimal ventCanalDiameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ventCanalDiameterType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.VENT_CANAL_DIAMETER_TYPE, ventCanalDiameterType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVentCanalLengthType(BigDecimal ventCanalLengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVentCanalLengthType_FractionDigits(ventCanalLengthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Vent Canal Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVentCanalLengthType_FractionDigits(BigDecimal ventCanalLengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = ventCanalLengthType.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(TestPackage.Literals.VENT_CANAL_LENGTH_TYPE, ventCanalLengthType, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //TestValidator
