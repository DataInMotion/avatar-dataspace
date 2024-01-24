/**
 */
package impedance.util;

import impedance.*;

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
 * @see impedance.ImpedancePackage
 * @generated
 */
public class ImpedanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ImpedanceValidator INSTANCE = new ImpedanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "impedance";

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
	public ImpedanceValidator() {
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
	  return ImpedancePackage.eINSTANCE;
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE:
				return validateAcousticImpedanceCompleteMeasurementType((AcousticImpedanceCompleteMeasurementType)value, diagnostics, context);
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE:
				return validateComplianceCurveType((ComplianceCurveType)value, diagnostics, context);
			case ImpedancePackage.COMPLIANCE_POINT_TYPE:
				return validateCompliancePointType((CompliancePointType)value, diagnostics, context);
			case ImpedancePackage.COMPLIANCE_TYPE:
				return validateComplianceType((ComplianceType)value, diagnostics, context);
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE:
				return validateComplianceUnitType((ComplianceUnitType)value, diagnostics, context);
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE:
				return validateComplianceValueType((ComplianceValueType)value, diagnostics, context);
			case ImpedancePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return validateEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)value, diagnostics, context);
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return validateEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)value, diagnostics, context);
			case ImpedancePackage.GRADIENT_TYPE:
				return validateGradientType((GradientType)value, diagnostics, context);
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE:
				return validateImpedanceMeasurementConditionType((ImpedanceMeasurementConditionType)value, diagnostics, context);
			case ImpedancePackage.PRESSURE_POINT_TYPE:
				return validatePressurePointType((PressurePointType)value, diagnostics, context);
			case ImpedancePackage.REFLEX_CURVE_TYPE:
				return validateReflexCurveType((ReflexCurveType)value, diagnostics, context);
			case ImpedancePackage.REFLEX_POINT_TYPE:
				return validateReflexPointType((ReflexPointType)value, diagnostics, context);
			case ImpedancePackage.REFLEX_TEST_TYPE:
				return validateReflexTestType((ReflexTestType)value, diagnostics, context);
			case ImpedancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE:
				return validateTympanogramMeasurementConditionsType((TympanogramMeasurementConditionsType)value, diagnostics, context);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE:
				return validateTympanogramTestType((TympanogramTestType)value, diagnostics, context);
			case ImpedancePackage.RECORDING_MODE_TYPE:
				return validateRecordingModeType((RecordingModeType)value, diagnostics, context);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE:
				return validateReflexTestTypeType((ReflexTestTypeType)value, diagnostics, context);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE:
				return validateSignalOutputType((SignalOutputType)value, diagnostics, context);
			case ImpedancePackage.SIGNAL_TYPE_TYPE:
				return validateSignalTypeType((SignalTypeType)value, diagnostics, context);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE:
				return validateTympanogramResultType((TympanogramResultType)value, diagnostics, context);
			case ImpedancePackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case ImpedancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return validateConvertedFromDataStandardType((BigInteger)value, diagnostics, context);
			case ImpedancePackage.RECORDING_MODE_TYPE_OBJECT:
				return validateRecordingModeTypeObject((RecordingModeType)value, diagnostics, context);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return validateReflexTestTypeTypeObject((ReflexTestTypeType)value, diagnostics, context);
			case ImpedancePackage.SIGNAL_LEVEL_TYPE:
				return validateSignalLevelType((BigDecimal)value, diagnostics, context);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return validateSignalOutputTypeObject((SignalOutputType)value, diagnostics, context);
			case ImpedancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return validateSignalTypeTypeObject((SignalTypeType)value, diagnostics, context);
			case ImpedancePackage.TIME_BASE_TYPE:
				return validateTimeBaseType((BigDecimal)value, diagnostics, context);
			case ImpedancePackage.TIME_TYPE:
				return validateTimeType((BigDecimal)value, diagnostics, context);
			case ImpedancePackage.TIME_TYPE1:
				return validateTimeType1((BigDecimal)value, diagnostics, context);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return validateTympanogramResultTypeObject((TympanogramResultType)value, diagnostics, context);
			case ImpedancePackage.UNIT_TYPE_OBJECT:
				return validateUnitTypeObject((UnitType)value, diagnostics, context);
			case ImpedancePackage.VERSION_TYPE:
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
	public boolean validateAcousticImpedanceCompleteMeasurementType(AcousticImpedanceCompleteMeasurementType acousticImpedanceCompleteMeasurementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acousticImpedanceCompleteMeasurementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplianceCurveType(ComplianceCurveType complianceCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complianceCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompliancePointType(CompliancePointType compliancePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compliancePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplianceType(ComplianceType complianceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complianceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplianceUnitType(ComplianceUnitType complianceUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complianceUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplianceValueType(ComplianceValueType complianceValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complianceValueType, diagnostics, context);
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
	public boolean validateEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest eustachianTubeFunctionIntactEarDrumTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eustachianTubeFunctionIntactEarDrumTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest eustachianTubeFunctionPerforatedEarDrumTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eustachianTubeFunctionPerforatedEarDrumTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientType(GradientType gradientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gradientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpedanceMeasurementConditionType(ImpedanceMeasurementConditionType impedanceMeasurementConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impedanceMeasurementConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressurePointType(PressurePointType pressurePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressurePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexCurveType(ReflexCurveType reflexCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexPointType(ReflexPointType reflexPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexTestType(ReflexTestType reflexTestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexTestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanogramMeasurementConditionsType(TympanogramMeasurementConditionsType tympanogramMeasurementConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tympanogramMeasurementConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanogramTestType(TympanogramTestType tympanogramTestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tympanogramTestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordingModeType(RecordingModeType recordingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexTestTypeType(ReflexTestTypeType reflexTestTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSignalTypeType(SignalTypeType signalTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanogramResultType(TympanogramResultType tympanogramResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportMinViolation(ImpedancePackage.Literals.CONVERTED_FROM_DATA_STANDARD_TYPE, convertedFromDataStandardType, CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordingModeTypeObject(RecordingModeType recordingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexTestTypeTypeObject(ReflexTestTypeType reflexTestTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
			reportFractionDigitsViolation(ImpedancePackage.Literals.SIGNAL_LEVEL_TYPE, signalLevelType, 1, diagnostics, context);
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
	public boolean validateSignalTypeTypeObject(SignalTypeType signalTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBaseType(BigDecimal timeBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeBaseType_FractionDigits(timeBaseType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeBaseType_Min(timeBaseType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBaseType_FractionDigits(BigDecimal timeBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeBaseType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(ImpedancePackage.Literals.TIME_BASE_TYPE, timeBaseType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeBaseType_Min
	 */
	public static final BigDecimal TIME_BASE_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBaseType_Min(BigDecimal timeBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeBaseType.compareTo(TIME_BASE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ImpedancePackage.Literals.TIME_BASE_TYPE, timeBaseType, TIME_BASE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(BigDecimal timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeType_FractionDigits(timeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeType_Min(timeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType_FractionDigits(BigDecimal timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeType.scale() <= 2;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(ImpedancePackage.Literals.TIME_TYPE, timeType, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeType_Min
	 */
	public static final BigDecimal TIME_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType_Min(BigDecimal timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeType.compareTo(TIME_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ImpedancePackage.Literals.TIME_TYPE, timeType, TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType1(BigDecimal timeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeType1_FractionDigits(timeType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeType1_Min(timeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Time Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType1_FractionDigits(BigDecimal timeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeType1.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(ImpedancePackage.Literals.TIME_TYPE1, timeType1, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeType1_Min
	 */
	public static final BigDecimal TIME_TYPE1__MIN__VALUE = new BigDecimal("0.000");

	/**
	 * Validates the Min constraint of '<em>Time Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType1_Min(BigDecimal timeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeType1.compareTo(TIME_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ImpedancePackage.Literals.TIME_TYPE1, timeType1, TIME_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanogramResultTypeObject(TympanogramResultType tympanogramResultTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitTypeObject(UnitType unitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportMinViolation(ImpedancePackage.Literals.VERSION_TYPE, versionType, VERSION_TYPE__MIN__VALUE, true, diagnostics, context);
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

} //ImpedanceValidator
