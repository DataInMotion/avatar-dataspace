/**
 */
package admittance.util;

import admittance.*;

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
 * @see admittance.AdmittancePackage
 * @generated
 */
public class AdmittanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AdmittanceValidator INSTANCE = new AdmittanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "admittance";

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
	public AdmittanceValidator() {
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
	  return AdmittancePackage.eINSTANCE;
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE:
				return validateAcousticImmittanceAssessmentType((AcousticImmittanceAssessmentType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE:
				return validateAdmittanceCurveType((AdmittanceCurveType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_MEASUREMENT_CONDITION_TYPE:
				return validateAdmittanceMeasurementConditionType((AdmittanceMeasurementConditionType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_TYPE:
				return validateAdmittanceType((AdmittanceType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE:
				return validateAdmittanceUnitCalculatedType((AdmittanceUnitCalculatedType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE:
				return validateAdmittanceUnitMeasuredType((AdmittanceUnitMeasuredType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE:
				return validateAdmittanceUnitType((AdmittanceUnitType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_VALUE_CALCULATED_TYPE:
				return validateAdmittanceValueCalculatedType((AdmittanceValueCalculatedType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_VALUE_MEASURED_TYPE:
				return validateAdmittanceValueMeasuredType((AdmittanceValueMeasuredType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_CALCULATED_TYPE:
				return validateAdmittanceValuePointCalculatedType((AdmittanceValuePointCalculatedType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_MEASURED_TYPE:
				return validateAdmittanceValuePointMeasuredType((AdmittanceValuePointMeasuredType)value, diagnostics, context);
			case AdmittancePackage.ADMITTANCE_VALUE_TYPE:
				return validateAdmittanceValueType((AdmittanceValueType)value, diagnostics, context);
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE:
				return validateCalculatedAdmittancePointsType((CalculatedAdmittancePointsType)value, diagnostics, context);
			case AdmittancePackage.CALCULATED_TYPE:
				return validateCalculatedType((CalculatedType)value, diagnostics, context);
			case AdmittancePackage.CALCULATED_TYPE1:
				return validateCalculatedType1((CalculatedType1)value, diagnostics, context);
			case AdmittancePackage.DELTA_YPOINTS_TYPE:
				return validateDeltaYPointsType((DeltaYPointsType)value, diagnostics, context);
			case AdmittancePackage.DELTA_YTYPE:
				return validateDeltaYType((DeltaYType)value, diagnostics, context);
			case AdmittancePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return validateEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)value, diagnostics, context);
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return validateEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)value, diagnostics, context);
			case AdmittancePackage.GRADIENT_TYPE:
				return validateGradientType((GradientType)value, diagnostics, context);
			case AdmittancePackage.INFORMATION_TYPE:
				return validateInformationType((InformationType)value, diagnostics, context);
			case AdmittancePackage.MEASURED_ADMITTANCE_POINTS_TYPE:
				return validateMeasuredAdmittancePointsType((MeasuredAdmittancePointsType)value, diagnostics, context);
			case AdmittancePackage.MEASURED_TYPE:
				return validateMeasuredType((MeasuredType)value, diagnostics, context);
			case AdmittancePackage.MEASURED_TYPE1:
				return validateMeasuredType1((MeasuredType1)value, diagnostics, context);
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE:
				return validateMeasurementNotesType((MeasurementNotesType)value, diagnostics, context);
			case AdmittancePackage.NUMERIC_DELTA_TYPE:
				return validateNumericDeltaType((NumericDeltaType)value, diagnostics, context);
			case AdmittancePackage.NUMERIC_DELTA_YPOINTS_TYPE:
				return validateNumericDeltaYPointsType((NumericDeltaYPointsType)value, diagnostics, context);
			case AdmittancePackage.PRESSURE_POINT_TYPE:
				return validatePressurePointType((PressurePointType)value, diagnostics, context);
			case AdmittancePackage.PROBE_FREQUENCY_TYPE:
				return validateProbeFrequencyType((ProbeFrequencyType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_CURVE_TYPE:
				return validateReflexCurveType((ReflexCurveType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_TEST_TYPE:
				return validateReflexTestType((ReflexTestType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_VALUE_POINT_CALCULATED_TYPE:
				return validateReflexValuePointCalculatedType((ReflexValuePointCalculatedType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_VALUE_POINT_MEASURED_TYPE:
				return validateReflexValuePointMeasuredType((ReflexValuePointMeasuredType)value, diagnostics, context);
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE:
				return validateResultOfReflexTestType((ResultOfReflexTestType)value, diagnostics, context);
			case AdmittancePackage.SIGNAL_LEVEL_TYPE:
				return validateSignalLevelType((SignalLevelType)value, diagnostics, context);
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE:
				return validateStaticAdmittanceType((StaticAdmittanceType)value, diagnostics, context);
			case AdmittancePackage.SUPPLEMENTARY_DATA_TYPE:
				return validateSupplementaryDataType((SupplementaryDataType)value, diagnostics, context);
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE:
				return validateTympanogramMeasurementConditionsType((TympanogramMeasurementConditionsType)value, diagnostics, context);
			case AdmittancePackage.TYMPANOGRAM_TEST_TYPE:
				return validateTympanogramTestType((TympanogramTestType)value, diagnostics, context);
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE:
				return validateDecayBasicResultType((DecayBasicResultType)value, diagnostics, context);
			case AdmittancePackage.EAR_TYPE:
				return validateEarType((EarType)value, diagnostics, context);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE:
				return validateFrequencyOtherType((FrequencyOtherType)value, diagnostics, context);
			case AdmittancePackage.RECORDING_MODE_TYPE:
				return validateRecordingModeType((RecordingModeType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE:
				return validateReflexTestResponseType((ReflexTestResponseType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE:
				return validateReflexTestTypeType((ReflexTestTypeType)value, diagnostics, context);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE:
				return validateSignalOutputType((SignalOutputType)value, diagnostics, context);
			case AdmittancePackage.SIGNAL_TYPE_TYPE:
				return validateSignalTypeType((SignalTypeType)value, diagnostics, context);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE:
				return validateTympanogramResultType((TympanogramResultType)value, diagnostics, context);
			case AdmittancePackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case AdmittancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return validateConvertedFromDataStandardType((BigInteger)value, diagnostics, context);
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE_OBJECT:
				return validateDecayBasicResultTypeObject((DecayBasicResultType)value, diagnostics, context);
			case AdmittancePackage.EAR_TYPE_OBJECT:
				return validateEarTypeObject((EarType)value, diagnostics, context);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE_OBJECT:
				return validateFrequencyOtherTypeObject((FrequencyOtherType)value, diagnostics, context);
			case AdmittancePackage.RECORDING_MODE_TYPE_OBJECT:
				return validateRecordingModeTypeObject((RecordingModeType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE_OBJECT:
				return validateReflexTestResponseTypeObject((ReflexTestResponseType)value, diagnostics, context);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return validateReflexTestTypeTypeObject((ReflexTestTypeType)value, diagnostics, context);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return validateSignalOutputTypeObject((SignalOutputType)value, diagnostics, context);
			case AdmittancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return validateSignalTypeTypeObject((SignalTypeType)value, diagnostics, context);
			case AdmittancePackage.STIMULUS_LEVEL_TYPE:
				return validateStimulusLevelType((BigDecimal)value, diagnostics, context);
			case AdmittancePackage.TIME_BASE_TYPE:
				return validateTimeBaseType((BigDecimal)value, diagnostics, context);
			case AdmittancePackage.TIME_TYPE:
				return validateTimeType((BigDecimal)value, diagnostics, context);
			case AdmittancePackage.TIME_TYPE1:
				return validateTimeType1((BigDecimal)value, diagnostics, context);
			case AdmittancePackage.TIME_TYPE2:
				return validateTimeType2((BigDecimal)value, diagnostics, context);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return validateTympanogramResultTypeObject((TympanogramResultType)value, diagnostics, context);
			case AdmittancePackage.TYMPANOMETER_MAKE_MODEL_TYPE:
				return validateTympanometerMakeModelType((String)value, diagnostics, context);
			case AdmittancePackage.TYMPANOMETER_SERIAL_NUMBER_TYPE:
				return validateTympanometerSerialNumberType((String)value, diagnostics, context);
			case AdmittancePackage.UNIT_TYPE_OBJECT:
				return validateUnitTypeObject((UnitType)value, diagnostics, context);
			case AdmittancePackage.VERSION_TYPE:
				return validateVersionType((BigInteger)value, diagnostics, context);
			case AdmittancePackage.VERSION_TYPE1:
				return validateVersionType1((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcousticImmittanceAssessmentType(AcousticImmittanceAssessmentType acousticImmittanceAssessmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acousticImmittanceAssessmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceCurveType(AdmittanceCurveType admittanceCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceMeasurementConditionType(AdmittanceMeasurementConditionType admittanceMeasurementConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceMeasurementConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceType(AdmittanceType admittanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceUnitCalculatedType(AdmittanceUnitCalculatedType admittanceUnitCalculatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceUnitCalculatedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceUnitMeasuredType(AdmittanceUnitMeasuredType admittanceUnitMeasuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceUnitMeasuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceUnitType(AdmittanceUnitType admittanceUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceValueCalculatedType(AdmittanceValueCalculatedType admittanceValueCalculatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceValueCalculatedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceValueMeasuredType(AdmittanceValueMeasuredType admittanceValueMeasuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceValueMeasuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceValuePointCalculatedType(AdmittanceValuePointCalculatedType admittanceValuePointCalculatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceValuePointCalculatedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceValuePointMeasuredType(AdmittanceValuePointMeasuredType admittanceValuePointMeasuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceValuePointMeasuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmittanceValueType(AdmittanceValueType admittanceValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admittanceValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatedAdmittancePointsType(CalculatedAdmittancePointsType calculatedAdmittancePointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatedAdmittancePointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatedType(CalculatedType calculatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatedType1(CalculatedType1 calculatedType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatedType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeltaYPointsType(DeltaYPointsType deltaYPointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deltaYPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeltaYType(DeltaYType deltaYType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deltaYType, diagnostics, context);
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
	public boolean validateInformationType(InformationType informationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredAdmittancePointsType(MeasuredAdmittancePointsType measuredAdmittancePointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuredAdmittancePointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredType(MeasuredType measuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredType1(MeasuredType1 measuredType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuredType1, diagnostics, context);
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
	public boolean validateNumericDeltaType(NumericDeltaType numericDeltaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericDeltaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericDeltaYPointsType(NumericDeltaYPointsType numericDeltaYPointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericDeltaYPointsType, diagnostics, context);
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
	public boolean validateProbeFrequencyType(ProbeFrequencyType probeFrequencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(probeFrequencyType, diagnostics, context);
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
	public boolean validateReflexTestType(ReflexTestType reflexTestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexTestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexValuePointCalculatedType(ReflexValuePointCalculatedType reflexValuePointCalculatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexValuePointCalculatedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexValuePointMeasuredType(ReflexValuePointMeasuredType reflexValuePointMeasuredType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexValuePointMeasuredType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOfReflexTestType(ResultOfReflexTestType resultOfReflexTestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultOfReflexTestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalLevelType(SignalLevelType signalLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticAdmittanceType(StaticAdmittanceType staticAdmittanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticAdmittanceType, diagnostics, context);
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
	public boolean validateDecayBasicResultType(DecayBasicResultType decayBasicResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateFrequencyOtherType(FrequencyOtherType frequencyOtherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateReflexTestResponseType(ReflexTestResponseType reflexTestResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportMinViolation(AdmittancePackage.Literals.CONVERTED_FROM_DATA_STANDARD_TYPE, convertedFromDataStandardType, CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecayBasicResultTypeObject(DecayBasicResultType decayBasicResultTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateFrequencyOtherTypeObject(FrequencyOtherType frequencyOtherTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateReflexTestResponseTypeObject(ReflexTestResponseType reflexTestResponseTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportFractionDigitsViolation(AdmittancePackage.Literals.STIMULUS_LEVEL_TYPE, stimulusLevelType, 1, diagnostics, context);
		return result;
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
			reportFractionDigitsViolation(AdmittancePackage.Literals.TIME_BASE_TYPE, timeBaseType, 2, diagnostics, context);
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
			reportMinViolation(AdmittancePackage.Literals.TIME_BASE_TYPE, timeBaseType, TIME_BASE_TYPE__MIN__VALUE, true, diagnostics, context);
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
			reportFractionDigitsViolation(AdmittancePackage.Literals.TIME_TYPE, timeType, 2, diagnostics, context);
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
			reportMinViolation(AdmittancePackage.Literals.TIME_TYPE, timeType, TIME_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType1(BigDecimal timeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType2(BigDecimal timeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateTympanometerMakeModelType(String tympanometerMakeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTympanometerMakeModelType_MaxLength(tympanometerMakeModelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tympanometer Make Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanometerMakeModelType_MaxLength(String tympanometerMakeModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tympanometerMakeModelType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AdmittancePackage.Literals.TYMPANOMETER_MAKE_MODEL_TYPE, tympanometerMakeModelType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanometerSerialNumberType(String tympanometerSerialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTympanometerSerialNumberType_MaxLength(tympanometerSerialNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tympanometer Serial Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTympanometerSerialNumberType_MaxLength(String tympanometerSerialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tympanometerSerialNumberType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AdmittancePackage.Literals.TYMPANOMETER_SERIAL_NUMBER_TYPE, tympanometerSerialNumberType, length, 41, diagnostics, context);
		return result;
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
			reportMinViolation(AdmittancePackage.Literals.VERSION_TYPE, versionType, VERSION_TYPE__MIN__VALUE, true, diagnostics, context);
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

} //AdmittanceValidator
