/**
 */
package admittance.impl;

import admittance.*;

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
public class AdmittanceFactoryImpl extends EFactoryImpl implements AdmittanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdmittanceFactory init() {
		try {
			AdmittanceFactory theAdmittanceFactory = (AdmittanceFactory)EPackage.Registry.INSTANCE.getEFactory(AdmittancePackage.eNS_URI);
			if (theAdmittanceFactory != null) {
				return theAdmittanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdmittanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmittanceFactoryImpl() {
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE: return createAcousticImmittanceAssessmentType();
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE: return createAdmittanceCurveType();
			case AdmittancePackage.ADMITTANCE_MEASUREMENT_CONDITION_TYPE: return createAdmittanceMeasurementConditionType();
			case AdmittancePackage.ADMITTANCE_TYPE: return createAdmittanceType();
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE: return createAdmittanceUnitCalculatedType();
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE: return createAdmittanceUnitMeasuredType();
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE: return createAdmittanceUnitType();
			case AdmittancePackage.ADMITTANCE_VALUE_CALCULATED_TYPE: return createAdmittanceValueCalculatedType();
			case AdmittancePackage.ADMITTANCE_VALUE_MEASURED_TYPE: return createAdmittanceValueMeasuredType();
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_CALCULATED_TYPE: return createAdmittanceValuePointCalculatedType();
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_MEASURED_TYPE: return createAdmittanceValuePointMeasuredType();
			case AdmittancePackage.ADMITTANCE_VALUE_TYPE: return createAdmittanceValueType();
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE: return createCalculatedAdmittancePointsType();
			case AdmittancePackage.CALCULATED_TYPE: return createCalculatedType();
			case AdmittancePackage.CALCULATED_TYPE1: return createCalculatedType1();
			case AdmittancePackage.DELTA_YPOINTS_TYPE: return createDeltaYPointsType();
			case AdmittancePackage.DELTA_YTYPE: return createDeltaYType();
			case AdmittancePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST: return createEustachianTubeFunctionIntactEarDrumTest();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST: return createEustachianTubeFunctionPerforatedEarDrumTest();
			case AdmittancePackage.GRADIENT_TYPE: return createGradientType();
			case AdmittancePackage.INFORMATION_TYPE: return createInformationType();
			case AdmittancePackage.MEASURED_ADMITTANCE_POINTS_TYPE: return createMeasuredAdmittancePointsType();
			case AdmittancePackage.MEASURED_TYPE: return createMeasuredType();
			case AdmittancePackage.MEASURED_TYPE1: return createMeasuredType1();
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE: return createMeasurementNotesType();
			case AdmittancePackage.NUMERIC_DELTA_TYPE: return createNumericDeltaType();
			case AdmittancePackage.NUMERIC_DELTA_YPOINTS_TYPE: return createNumericDeltaYPointsType();
			case AdmittancePackage.PRESSURE_POINT_TYPE: return createPressurePointType();
			case AdmittancePackage.PROBE_FREQUENCY_TYPE: return createProbeFrequencyType();
			case AdmittancePackage.REFLEX_CURVE_TYPE: return createReflexCurveType();
			case AdmittancePackage.REFLEX_TEST_TYPE: return createReflexTestType();
			case AdmittancePackage.REFLEX_VALUE_POINT_CALCULATED_TYPE: return createReflexValuePointCalculatedType();
			case AdmittancePackage.REFLEX_VALUE_POINT_MEASURED_TYPE: return createReflexValuePointMeasuredType();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE: return createResultOfReflexTestType();
			case AdmittancePackage.SIGNAL_LEVEL_TYPE: return createSignalLevelType();
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE: return createStaticAdmittanceType();
			case AdmittancePackage.SUPPLEMENTARY_DATA_TYPE: return createSupplementaryDataType();
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE: return createTympanogramMeasurementConditionsType();
			case AdmittancePackage.TYMPANOGRAM_TEST_TYPE: return createTympanogramTestType();
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
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE:
				return createDecayBasicResultTypeFromString(eDataType, initialValue);
			case AdmittancePackage.EAR_TYPE:
				return createEarTypeFromString(eDataType, initialValue);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE:
				return createFrequencyOtherTypeFromString(eDataType, initialValue);
			case AdmittancePackage.RECORDING_MODE_TYPE:
				return createRecordingModeTypeFromString(eDataType, initialValue);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE:
				return createReflexTestResponseTypeFromString(eDataType, initialValue);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE:
				return createReflexTestTypeTypeFromString(eDataType, initialValue);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case AdmittancePackage.SIGNAL_TYPE_TYPE:
				return createSignalTypeTypeFromString(eDataType, initialValue);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE:
				return createTympanogramResultTypeFromString(eDataType, initialValue);
			case AdmittancePackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case AdmittancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return createConvertedFromDataStandardTypeFromString(eDataType, initialValue);
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE_OBJECT:
				return createDecayBasicResultTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.EAR_TYPE_OBJECT:
				return createEarTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE_OBJECT:
				return createFrequencyOtherTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.RECORDING_MODE_TYPE_OBJECT:
				return createRecordingModeTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE_OBJECT:
				return createReflexTestResponseTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return createReflexTestTypeTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return createSignalTypeTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.STIMULUS_LEVEL_TYPE:
				return createStimulusLevelTypeFromString(eDataType, initialValue);
			case AdmittancePackage.TIME_BASE_TYPE:
				return createTimeBaseTypeFromString(eDataType, initialValue);
			case AdmittancePackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case AdmittancePackage.TIME_TYPE1:
				return createTimeType1FromString(eDataType, initialValue);
			case AdmittancePackage.TIME_TYPE2:
				return createTimeType2FromString(eDataType, initialValue);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return createTympanogramResultTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.TYMPANOMETER_MAKE_MODEL_TYPE:
				return createTympanometerMakeModelTypeFromString(eDataType, initialValue);
			case AdmittancePackage.TYMPANOMETER_SERIAL_NUMBER_TYPE:
				return createTympanometerSerialNumberTypeFromString(eDataType, initialValue);
			case AdmittancePackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case AdmittancePackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case AdmittancePackage.VERSION_TYPE1:
				return createVersionType1FromString(eDataType, initialValue);
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
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE:
				return convertDecayBasicResultTypeToString(eDataType, instanceValue);
			case AdmittancePackage.EAR_TYPE:
				return convertEarTypeToString(eDataType, instanceValue);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE:
				return convertFrequencyOtherTypeToString(eDataType, instanceValue);
			case AdmittancePackage.RECORDING_MODE_TYPE:
				return convertRecordingModeTypeToString(eDataType, instanceValue);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE:
				return convertReflexTestResponseTypeToString(eDataType, instanceValue);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE:
				return convertReflexTestTypeTypeToString(eDataType, instanceValue);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case AdmittancePackage.SIGNAL_TYPE_TYPE:
				return convertSignalTypeTypeToString(eDataType, instanceValue);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE:
				return convertTympanogramResultTypeToString(eDataType, instanceValue);
			case AdmittancePackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case AdmittancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return convertConvertedFromDataStandardTypeToString(eDataType, instanceValue);
			case AdmittancePackage.DECAY_BASIC_RESULT_TYPE_OBJECT:
				return convertDecayBasicResultTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.EAR_TYPE_OBJECT:
				return convertEarTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.FREQUENCY_OTHER_TYPE_OBJECT:
				return convertFrequencyOtherTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.RECORDING_MODE_TYPE_OBJECT:
				return convertRecordingModeTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.REFLEX_TEST_RESPONSE_TYPE_OBJECT:
				return convertReflexTestResponseTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return convertReflexTestTypeTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return convertSignalTypeTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.STIMULUS_LEVEL_TYPE:
				return convertStimulusLevelTypeToString(eDataType, instanceValue);
			case AdmittancePackage.TIME_BASE_TYPE:
				return convertTimeBaseTypeToString(eDataType, instanceValue);
			case AdmittancePackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case AdmittancePackage.TIME_TYPE1:
				return convertTimeType1ToString(eDataType, instanceValue);
			case AdmittancePackage.TIME_TYPE2:
				return convertTimeType2ToString(eDataType, instanceValue);
			case AdmittancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return convertTympanogramResultTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.TYMPANOMETER_MAKE_MODEL_TYPE:
				return convertTympanometerMakeModelTypeToString(eDataType, instanceValue);
			case AdmittancePackage.TYMPANOMETER_SERIAL_NUMBER_TYPE:
				return convertTympanometerSerialNumberTypeToString(eDataType, instanceValue);
			case AdmittancePackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case AdmittancePackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case AdmittancePackage.VERSION_TYPE1:
				return convertVersionType1ToString(eDataType, instanceValue);
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
	public AcousticImmittanceAssessmentType createAcousticImmittanceAssessmentType() {
		AcousticImmittanceAssessmentTypeImpl acousticImmittanceAssessmentType = new AcousticImmittanceAssessmentTypeImpl();
		return acousticImmittanceAssessmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceCurveType createAdmittanceCurveType() {
		AdmittanceCurveTypeImpl admittanceCurveType = new AdmittanceCurveTypeImpl();
		return admittanceCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceMeasurementConditionType createAdmittanceMeasurementConditionType() {
		AdmittanceMeasurementConditionTypeImpl admittanceMeasurementConditionType = new AdmittanceMeasurementConditionTypeImpl();
		return admittanceMeasurementConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceType createAdmittanceType() {
		AdmittanceTypeImpl admittanceType = new AdmittanceTypeImpl();
		return admittanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitCalculatedType createAdmittanceUnitCalculatedType() {
		AdmittanceUnitCalculatedTypeImpl admittanceUnitCalculatedType = new AdmittanceUnitCalculatedTypeImpl();
		return admittanceUnitCalculatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitMeasuredType createAdmittanceUnitMeasuredType() {
		AdmittanceUnitMeasuredTypeImpl admittanceUnitMeasuredType = new AdmittanceUnitMeasuredTypeImpl();
		return admittanceUnitMeasuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitType createAdmittanceUnitType() {
		AdmittanceUnitTypeImpl admittanceUnitType = new AdmittanceUnitTypeImpl();
		return admittanceUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueCalculatedType createAdmittanceValueCalculatedType() {
		AdmittanceValueCalculatedTypeImpl admittanceValueCalculatedType = new AdmittanceValueCalculatedTypeImpl();
		return admittanceValueCalculatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueMeasuredType createAdmittanceValueMeasuredType() {
		AdmittanceValueMeasuredTypeImpl admittanceValueMeasuredType = new AdmittanceValueMeasuredTypeImpl();
		return admittanceValueMeasuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValuePointCalculatedType createAdmittanceValuePointCalculatedType() {
		AdmittanceValuePointCalculatedTypeImpl admittanceValuePointCalculatedType = new AdmittanceValuePointCalculatedTypeImpl();
		return admittanceValuePointCalculatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValuePointMeasuredType createAdmittanceValuePointMeasuredType() {
		AdmittanceValuePointMeasuredTypeImpl admittanceValuePointMeasuredType = new AdmittanceValuePointMeasuredTypeImpl();
		return admittanceValuePointMeasuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueType createAdmittanceValueType() {
		AdmittanceValueTypeImpl admittanceValueType = new AdmittanceValueTypeImpl();
		return admittanceValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedAdmittancePointsType createCalculatedAdmittancePointsType() {
		CalculatedAdmittancePointsTypeImpl calculatedAdmittancePointsType = new CalculatedAdmittancePointsTypeImpl();
		return calculatedAdmittancePointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedType createCalculatedType() {
		CalculatedTypeImpl calculatedType = new CalculatedTypeImpl();
		return calculatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedType1 createCalculatedType1() {
		CalculatedType1Impl calculatedType1 = new CalculatedType1Impl();
		return calculatedType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaYPointsType createDeltaYPointsType() {
		DeltaYPointsTypeImpl deltaYPointsType = new DeltaYPointsTypeImpl();
		return deltaYPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaYType createDeltaYType() {
		DeltaYTypeImpl deltaYType = new DeltaYTypeImpl();
		return deltaYType;
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
	public EustachianTubeFunctionIntactEarDrumTest createEustachianTubeFunctionIntactEarDrumTest() {
		EustachianTubeFunctionIntactEarDrumTestImpl eustachianTubeFunctionIntactEarDrumTest = new EustachianTubeFunctionIntactEarDrumTestImpl();
		return eustachianTubeFunctionIntactEarDrumTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EustachianTubeFunctionPerforatedEarDrumTest createEustachianTubeFunctionPerforatedEarDrumTest() {
		EustachianTubeFunctionPerforatedEarDrumTestImpl eustachianTubeFunctionPerforatedEarDrumTest = new EustachianTubeFunctionPerforatedEarDrumTestImpl();
		return eustachianTubeFunctionPerforatedEarDrumTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradientType createGradientType() {
		GradientTypeImpl gradientType = new GradientTypeImpl();
		return gradientType;
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
	public MeasuredAdmittancePointsType createMeasuredAdmittancePointsType() {
		MeasuredAdmittancePointsTypeImpl measuredAdmittancePointsType = new MeasuredAdmittancePointsTypeImpl();
		return measuredAdmittancePointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasuredType createMeasuredType() {
		MeasuredTypeImpl measuredType = new MeasuredTypeImpl();
		return measuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasuredType1 createMeasuredType1() {
		MeasuredType1Impl measuredType1 = new MeasuredType1Impl();
		return measuredType1;
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
	public NumericDeltaType createNumericDeltaType() {
		NumericDeltaTypeImpl numericDeltaType = new NumericDeltaTypeImpl();
		return numericDeltaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericDeltaYPointsType createNumericDeltaYPointsType() {
		NumericDeltaYPointsTypeImpl numericDeltaYPointsType = new NumericDeltaYPointsTypeImpl();
		return numericDeltaYPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressurePointType createPressurePointType() {
		PressurePointTypeImpl pressurePointType = new PressurePointTypeImpl();
		return pressurePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbeFrequencyType createProbeFrequencyType() {
		ProbeFrequencyTypeImpl probeFrequencyType = new ProbeFrequencyTypeImpl();
		return probeFrequencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexCurveType createReflexCurveType() {
		ReflexCurveTypeImpl reflexCurveType = new ReflexCurveTypeImpl();
		return reflexCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexTestType createReflexTestType() {
		ReflexTestTypeImpl reflexTestType = new ReflexTestTypeImpl();
		return reflexTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexValuePointCalculatedType createReflexValuePointCalculatedType() {
		ReflexValuePointCalculatedTypeImpl reflexValuePointCalculatedType = new ReflexValuePointCalculatedTypeImpl();
		return reflexValuePointCalculatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexValuePointMeasuredType createReflexValuePointMeasuredType() {
		ReflexValuePointMeasuredTypeImpl reflexValuePointMeasuredType = new ReflexValuePointMeasuredTypeImpl();
		return reflexValuePointMeasuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOfReflexTestType createResultOfReflexTestType() {
		ResultOfReflexTestTypeImpl resultOfReflexTestType = new ResultOfReflexTestTypeImpl();
		return resultOfReflexTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalLevelType createSignalLevelType() {
		SignalLevelTypeImpl signalLevelType = new SignalLevelTypeImpl();
		return signalLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticAdmittanceType createStaticAdmittanceType() {
		StaticAdmittanceTypeImpl staticAdmittanceType = new StaticAdmittanceTypeImpl();
		return staticAdmittanceType;
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
	public TympanogramMeasurementConditionsType createTympanogramMeasurementConditionsType() {
		TympanogramMeasurementConditionsTypeImpl tympanogramMeasurementConditionsType = new TympanogramMeasurementConditionsTypeImpl();
		return tympanogramMeasurementConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TympanogramTestType createTympanogramTestType() {
		TympanogramTestTypeImpl tympanogramTestType = new TympanogramTestTypeImpl();
		return tympanogramTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecayBasicResultType createDecayBasicResultTypeFromString(EDataType eDataType, String initialValue) {
		DecayBasicResultType result = DecayBasicResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecayBasicResultTypeToString(EDataType eDataType, Object instanceValue) {
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
	public FrequencyOtherType createFrequencyOtherTypeFromString(EDataType eDataType, String initialValue) {
		FrequencyOtherType result = FrequencyOtherType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyOtherTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingModeType createRecordingModeTypeFromString(EDataType eDataType, String initialValue) {
		RecordingModeType result = RecordingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTestResponseType createReflexTestResponseTypeFromString(EDataType eDataType, String initialValue) {
		ReflexTestResponseType result = ReflexTestResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexTestResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTestTypeType createReflexTestTypeTypeFromString(EDataType eDataType, String initialValue) {
		ReflexTestTypeType result = ReflexTestTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexTestTypeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public SignalTypeType createSignalTypeTypeFromString(EDataType eDataType, String initialValue) {
		SignalTypeType result = SignalTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TympanogramResultType createTympanogramResultTypeFromString(EDataType eDataType, String initialValue) {
		TympanogramResultType result = TympanogramResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTympanogramResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public DecayBasicResultType createDecayBasicResultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDecayBasicResultTypeFromString(AdmittancePackage.Literals.DECAY_BASIC_RESULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecayBasicResultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDecayBasicResultTypeToString(AdmittancePackage.Literals.DECAY_BASIC_RESULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarType createEarTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEarTypeFromString(AdmittancePackage.Literals.EAR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEarTypeToString(AdmittancePackage.Literals.EAR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyOtherType createFrequencyOtherTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFrequencyOtherTypeFromString(AdmittancePackage.Literals.FREQUENCY_OTHER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyOtherTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrequencyOtherTypeToString(AdmittancePackage.Literals.FREQUENCY_OTHER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingModeType createRecordingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRecordingModeTypeFromString(AdmittancePackage.Literals.RECORDING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRecordingModeTypeToString(AdmittancePackage.Literals.RECORDING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTestResponseType createReflexTestResponseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReflexTestResponseTypeFromString(AdmittancePackage.Literals.REFLEX_TEST_RESPONSE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexTestResponseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReflexTestResponseTypeToString(AdmittancePackage.Literals.REFLEX_TEST_RESPONSE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTestTypeType createReflexTestTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReflexTestTypeTypeFromString(AdmittancePackage.Literals.REFLEX_TEST_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexTestTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReflexTestTypeTypeToString(AdmittancePackage.Literals.REFLEX_TEST_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOutputType createSignalOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalOutputTypeFromString(AdmittancePackage.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(AdmittancePackage.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTypeType createSignalTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeTypeFromString(AdmittancePackage.Literals.SIGNAL_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeTypeToString(AdmittancePackage.Literals.SIGNAL_TYPE_TYPE, instanceValue);
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
	public BigDecimal createTimeBaseTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeBaseTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTimeType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTimeType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TympanogramResultType createTympanogramResultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTympanogramResultTypeFromString(AdmittancePackage.Literals.TYMPANOGRAM_RESULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTympanogramResultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTympanogramResultTypeToString(AdmittancePackage.Literals.TYMPANOGRAM_RESULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTympanometerMakeModelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTympanometerMakeModelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTympanometerSerialNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTympanometerSerialNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(AdmittancePackage.Literals.UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(AdmittancePackage.Literals.UNIT_TYPE, instanceValue);
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
	@Override
	public AdmittancePackage getAdmittancePackage() {
		return (AdmittancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdmittancePackage getPackage() {
		return AdmittancePackage.eINSTANCE;
	}

} //AdmittanceFactoryImpl
