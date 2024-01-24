/**
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.*;

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
public class EarFactoryImpl extends EFactoryImpl implements EarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EarFactory init() {
		try {
			EarFactory theEarFactory = (EarFactory)EPackage.Registry.INSTANCE.getEFactory(EarPackage.eNS_URI);
			if (theEarFactory != null) {
				return theEarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarFactoryImpl() {
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
			case EarPackage.ATTACK_RELEASE_MEASUREMENT_POINT: return createAttackReleaseMeasurementPoint();
			case EarPackage.BATTERY_CURRENT_MEASUREMENT: return createBatteryCurrentMeasurement();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS: return createBatteryMeasurementConditions();
			case EarPackage.BATTERY_MEASUREMENT_POINT: return createBatteryMeasurementPoint();
			case EarPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case EarPackage.EQUIVALENT_INPUT_NOISE: return createEquivalentInputNoise();
			case EarPackage.FREQUENCY_MEASUREMENT: return createFrequencyMeasurement();
			case EarPackage.FREQUENCY_MEASUREMENT_POINT: return createFrequencyMeasurementPoint();
			case EarPackage.FULL_TARGET_CURVE: return createFullTargetCurve();
			case EarPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE: return createHarmonicDistortionMeasurementCurve();
			case EarPackage.HARMONIC_DISTORTION_POINT: return createHarmonicDistortionPoint();
			case EarPackage.HIMSA_REM_STANDARD_TYPE: return createHIMSARemStandardType();
			case EarPackage.INPUT_OUTPUT_MEASUREMENT: return createInputOutputMeasurement();
			case EarPackage.INPUT_OUTPUT_POINT: return createInputOutputPoint();
			case EarPackage.INTERMODULATION_DISTORTION_MEASUREMENT: return createIntermodulationDistortionMeasurement();
			case EarPackage.INTERMODULATION_DISTORTION_POINT: return createIntermodulationDistortionPoint();
			case EarPackage.MEASUREMENT_CONDITIONS: return createMeasurementConditions();
			case EarPackage.OCCLUSION_EFFECTS: return createOcclusionEffects();
			case EarPackage.REAL_EAR_COUPLER_DIFFERENCE: return createRealEarCouplerDifference();
			case EarPackage.REAL_EAR_DATA_TYPE: return createRealEarDataType();
			case EarPackage.TARGET_CURVE: return createTargetCurve();
			case EarPackage.TARGET_MEASUREMENT: return createTargetMeasurement();
			case EarPackage.TARGET_MEASUREMENT_POINT: return createTargetMeasurementPoint();
			case EarPackage.TARGET_POINT: return createTargetPoint();
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
			case EarPackage.BATTERY_PILL_TYPE:
				return createBatteryPillTypeFromString(eDataType, initialValue);
			case EarPackage.BATTERY_TYPE:
				return createBatteryTypeFromString(eDataType, initialValue);
			case EarPackage.COUPLER_TYPE:
				return createCouplerTypeFromString(eDataType, initialValue);
			case EarPackage.FITTING_RULE:
				return createFittingRuleFromString(eDataType, initialValue);
			case EarPackage.HEARING_INSTRUMENT_TYPE:
				return createHearingInstrumentTypeFromString(eDataType, initialValue);
			case EarPackage.MEASUREMENT_IDENTIFICATION:
				return createMeasurementIdentificationFromString(eDataType, initialValue);
			case EarPackage.MEASUREMENT_MODE:
				return createMeasurementModeFromString(eDataType, initialValue);
			case EarPackage.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case EarPackage.SIGNAL_TYPE:
				return createSignalTypeFromString(eDataType, initialValue);
			case EarPackage.ATTACK_RELEASE_TIME_TYPE:
				return createAttackReleaseTimeTypeFromString(eDataType, initialValue);
			case EarPackage.BATTERY_IMPEDANCE_TYPE:
				return createBatteryImpedanceTypeFromString(eDataType, initialValue);
			case EarPackage.BATTERY_IMPEDANCE_TYPE1:
				return createBatteryImpedanceType1FromString(eDataType, initialValue);
			case EarPackage.BATTERY_PILL_TYPE_OBJECT:
				return createBatteryPillTypeObjectFromString(eDataType, initialValue);
			case EarPackage.BATTERY_TYPE_OBJECT:
				return createBatteryTypeObjectFromString(eDataType, initialValue);
			case EarPackage.BATTERY_VOLTAGE_TYPE:
				return createBatteryVoltageTypeFromString(eDataType, initialValue);
			case EarPackage.BATTERY_VOLTAGE_TYPE1:
				return createBatteryVoltageType1FromString(eDataType, initialValue);
			case EarPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return createConvertedFromDataStandardTypeFromString(eDataType, initialValue);
			case EarPackage.COUPLER_TYPE_OBJECT:
				return createCouplerTypeObjectFromString(eDataType, initialValue);
			case EarPackage.CURRENT_TYPE:
				return createCurrentTypeFromString(eDataType, initialValue);
			case EarPackage.EQUIVALENT_ROOT_MEAN_SQUARE_TYPE:
				return createEquivalentRootMeanSquareTypeFromString(eDataType, initialValue);
			case EarPackage.FITTING_RULE_OBJECT:
				return createFittingRuleObjectFromString(eDataType, initialValue);
			case EarPackage.FX1_TYPE:
				return createFx1TypeFromString(eDataType, initialValue);
			case EarPackage.FX2_TYPE:
				return createFx2TypeFromString(eDataType, initialValue);
			case EarPackage.FX3_TYPE:
				return createFx3TypeFromString(eDataType, initialValue);
			case EarPackage.HEARING_INSTRUMENT_TYPE_OBJECT:
				return createHearingInstrumentTypeObjectFromString(eDataType, initialValue);
			case EarPackage.INPUT1_TYPE:
				return createInput1TypeFromString(eDataType, initialValue);
			case EarPackage.INPUT2_TYPE:
				return createInput2TypeFromString(eDataType, initialValue);
			case EarPackage.INPUT_TYPE:
				return createInputTypeFromString(eDataType, initialValue);
			case EarPackage.INPUT_TYPE1:
				return createInputType1FromString(eDataType, initialValue);
			case EarPackage.INPUT_TYPE2:
				return createInputType2FromString(eDataType, initialValue);
			case EarPackage.LEVEL_STEP_TYPE:
				return createLevelStepTypeFromString(eDataType, initialValue);
			case EarPackage.MEASUREMENT_IDENTIFICATION_OBJECT:
				return createMeasurementIdentificationObjectFromString(eDataType, initialValue);
			case EarPackage.MEASUREMENT_MODE_OBJECT:
				return createMeasurementModeObjectFromString(eDataType, initialValue);
			case EarPackage.OUTPUT1_TYPE:
				return createOutput1TypeFromString(eDataType, initialValue);
			case EarPackage.OUTPUT2_TYPE:
				return createOutput2TypeFromString(eDataType, initialValue);
			case EarPackage.OUTPUT_DIFF1_TYPE:
				return createOutputDiff1TypeFromString(eDataType, initialValue);
			case EarPackage.OUTPUT_DIFF2_TYPE:
				return createOutputDiff2TypeFromString(eDataType, initialValue);
			case EarPackage.OUTPUT_TYPE:
				return createOutputTypeFromString(eDataType, initialValue);
			case EarPackage.OUTPUT_TYPE1:
				return createOutputType1FromString(eDataType, initialValue);
			case EarPackage.OUTPUT_TYPE2:
				return createOutputType2FromString(eDataType, initialValue);
			case EarPackage.OUTPUT_TYPE3:
				return createOutputType3FromString(eDataType, initialValue);
			case EarPackage.RESERVE_GAIN_TYPE:
				return createReserveGainTypeFromString(eDataType, initialValue);
			case EarPackage.RULE_NAME_TYPE:
				return createRuleNameTypeFromString(eDataType, initialValue);
			case EarPackage.SIGNAL_LEVEL_TYPE:
				return createSignalLevelTypeFromString(eDataType, initialValue);
			case EarPackage.SIGNAL_LEVEL_TYPE1:
				return createSignalLevelType1FromString(eDataType, initialValue);
			case EarPackage.SIGNAL_LEVEL_TYPE2:
				return createSignalLevelType2FromString(eDataType, initialValue);
			case EarPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case EarPackage.SIGNAL_TYPE_OBJECT:
				return createSignalTypeObjectFromString(eDataType, initialValue);
			case EarPackage.TARGET_GAIN_TYPE:
				return createTargetGainTypeFromString(eDataType, initialValue);
			case EarPackage.THIRD_HD_TYPE:
				return createThirdHDTypeFromString(eDataType, initialValue);
			case EarPackage.TI_DISTORTION_TYPE:
				return createTIDistortionTypeFromString(eDataType, initialValue);
			case EarPackage.VENT_CANAL_DIAMETER_TYPE:
				return createVentCanalDiameterTypeFromString(eDataType, initialValue);
			case EarPackage.VENT_CANAL_LENGTH_TYPE:
				return createVentCanalLengthTypeFromString(eDataType, initialValue);
			case EarPackage.VERSION_TYPE:
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
			case EarPackage.BATTERY_PILL_TYPE:
				return convertBatteryPillTypeToString(eDataType, instanceValue);
			case EarPackage.BATTERY_TYPE:
				return convertBatteryTypeToString(eDataType, instanceValue);
			case EarPackage.COUPLER_TYPE:
				return convertCouplerTypeToString(eDataType, instanceValue);
			case EarPackage.FITTING_RULE:
				return convertFittingRuleToString(eDataType, instanceValue);
			case EarPackage.HEARING_INSTRUMENT_TYPE:
				return convertHearingInstrumentTypeToString(eDataType, instanceValue);
			case EarPackage.MEASUREMENT_IDENTIFICATION:
				return convertMeasurementIdentificationToString(eDataType, instanceValue);
			case EarPackage.MEASUREMENT_MODE:
				return convertMeasurementModeToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_TYPE:
				return convertSignalTypeToString(eDataType, instanceValue);
			case EarPackage.ATTACK_RELEASE_TIME_TYPE:
				return convertAttackReleaseTimeTypeToString(eDataType, instanceValue);
			case EarPackage.BATTERY_IMPEDANCE_TYPE:
				return convertBatteryImpedanceTypeToString(eDataType, instanceValue);
			case EarPackage.BATTERY_IMPEDANCE_TYPE1:
				return convertBatteryImpedanceType1ToString(eDataType, instanceValue);
			case EarPackage.BATTERY_PILL_TYPE_OBJECT:
				return convertBatteryPillTypeObjectToString(eDataType, instanceValue);
			case EarPackage.BATTERY_TYPE_OBJECT:
				return convertBatteryTypeObjectToString(eDataType, instanceValue);
			case EarPackage.BATTERY_VOLTAGE_TYPE:
				return convertBatteryVoltageTypeToString(eDataType, instanceValue);
			case EarPackage.BATTERY_VOLTAGE_TYPE1:
				return convertBatteryVoltageType1ToString(eDataType, instanceValue);
			case EarPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return convertConvertedFromDataStandardTypeToString(eDataType, instanceValue);
			case EarPackage.COUPLER_TYPE_OBJECT:
				return convertCouplerTypeObjectToString(eDataType, instanceValue);
			case EarPackage.CURRENT_TYPE:
				return convertCurrentTypeToString(eDataType, instanceValue);
			case EarPackage.EQUIVALENT_ROOT_MEAN_SQUARE_TYPE:
				return convertEquivalentRootMeanSquareTypeToString(eDataType, instanceValue);
			case EarPackage.FITTING_RULE_OBJECT:
				return convertFittingRuleObjectToString(eDataType, instanceValue);
			case EarPackage.FX1_TYPE:
				return convertFx1TypeToString(eDataType, instanceValue);
			case EarPackage.FX2_TYPE:
				return convertFx2TypeToString(eDataType, instanceValue);
			case EarPackage.FX3_TYPE:
				return convertFx3TypeToString(eDataType, instanceValue);
			case EarPackage.HEARING_INSTRUMENT_TYPE_OBJECT:
				return convertHearingInstrumentTypeObjectToString(eDataType, instanceValue);
			case EarPackage.INPUT1_TYPE:
				return convertInput1TypeToString(eDataType, instanceValue);
			case EarPackage.INPUT2_TYPE:
				return convertInput2TypeToString(eDataType, instanceValue);
			case EarPackage.INPUT_TYPE:
				return convertInputTypeToString(eDataType, instanceValue);
			case EarPackage.INPUT_TYPE1:
				return convertInputType1ToString(eDataType, instanceValue);
			case EarPackage.INPUT_TYPE2:
				return convertInputType2ToString(eDataType, instanceValue);
			case EarPackage.LEVEL_STEP_TYPE:
				return convertLevelStepTypeToString(eDataType, instanceValue);
			case EarPackage.MEASUREMENT_IDENTIFICATION_OBJECT:
				return convertMeasurementIdentificationObjectToString(eDataType, instanceValue);
			case EarPackage.MEASUREMENT_MODE_OBJECT:
				return convertMeasurementModeObjectToString(eDataType, instanceValue);
			case EarPackage.OUTPUT1_TYPE:
				return convertOutput1TypeToString(eDataType, instanceValue);
			case EarPackage.OUTPUT2_TYPE:
				return convertOutput2TypeToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_DIFF1_TYPE:
				return convertOutputDiff1TypeToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_DIFF2_TYPE:
				return convertOutputDiff2TypeToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_TYPE:
				return convertOutputTypeToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_TYPE1:
				return convertOutputType1ToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_TYPE2:
				return convertOutputType2ToString(eDataType, instanceValue);
			case EarPackage.OUTPUT_TYPE3:
				return convertOutputType3ToString(eDataType, instanceValue);
			case EarPackage.RESERVE_GAIN_TYPE:
				return convertReserveGainTypeToString(eDataType, instanceValue);
			case EarPackage.RULE_NAME_TYPE:
				return convertRuleNameTypeToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_LEVEL_TYPE:
				return convertSignalLevelTypeToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_LEVEL_TYPE1:
				return convertSignalLevelType1ToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_LEVEL_TYPE2:
				return convertSignalLevelType2ToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case EarPackage.SIGNAL_TYPE_OBJECT:
				return convertSignalTypeObjectToString(eDataType, instanceValue);
			case EarPackage.TARGET_GAIN_TYPE:
				return convertTargetGainTypeToString(eDataType, instanceValue);
			case EarPackage.THIRD_HD_TYPE:
				return convertThirdHDTypeToString(eDataType, instanceValue);
			case EarPackage.TI_DISTORTION_TYPE:
				return convertTIDistortionTypeToString(eDataType, instanceValue);
			case EarPackage.VENT_CANAL_DIAMETER_TYPE:
				return convertVentCanalDiameterTypeToString(eDataType, instanceValue);
			case EarPackage.VENT_CANAL_LENGTH_TYPE:
				return convertVentCanalLengthTypeToString(eDataType, instanceValue);
			case EarPackage.VERSION_TYPE:
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
	public AttackReleaseMeasurementPoint createAttackReleaseMeasurementPoint() {
		AttackReleaseMeasurementPointImpl attackReleaseMeasurementPoint = new AttackReleaseMeasurementPointImpl();
		return attackReleaseMeasurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryCurrentMeasurement createBatteryCurrentMeasurement() {
		BatteryCurrentMeasurementImpl batteryCurrentMeasurement = new BatteryCurrentMeasurementImpl();
		return batteryCurrentMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryMeasurementConditions createBatteryMeasurementConditions() {
		BatteryMeasurementConditionsImpl batteryMeasurementConditions = new BatteryMeasurementConditionsImpl();
		return batteryMeasurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryMeasurementPoint createBatteryMeasurementPoint() {
		BatteryMeasurementPointImpl batteryMeasurementPoint = new BatteryMeasurementPointImpl();
		return batteryMeasurementPoint;
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
	public EquivalentInputNoise createEquivalentInputNoise() {
		EquivalentInputNoiseImpl equivalentInputNoise = new EquivalentInputNoiseImpl();
		return equivalentInputNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyMeasurement createFrequencyMeasurement() {
		FrequencyMeasurementImpl frequencyMeasurement = new FrequencyMeasurementImpl();
		return frequencyMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyMeasurementPoint createFrequencyMeasurementPoint() {
		FrequencyMeasurementPointImpl frequencyMeasurementPoint = new FrequencyMeasurementPointImpl();
		return frequencyMeasurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullTargetCurve createFullTargetCurve() {
		FullTargetCurveImpl fullTargetCurve = new FullTargetCurveImpl();
		return fullTargetCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HarmonicDistortionMeasurementCurve createHarmonicDistortionMeasurementCurve() {
		HarmonicDistortionMeasurementCurveImpl harmonicDistortionMeasurementCurve = new HarmonicDistortionMeasurementCurveImpl();
		return harmonicDistortionMeasurementCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HarmonicDistortionPoint createHarmonicDistortionPoint() {
		HarmonicDistortionPointImpl harmonicDistortionPoint = new HarmonicDistortionPointImpl();
		return harmonicDistortionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSARemStandardType createHIMSARemStandardType() {
		HIMSARemStandardTypeImpl himsaRemStandardType = new HIMSARemStandardTypeImpl();
		return himsaRemStandardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOutputMeasurement createInputOutputMeasurement() {
		InputOutputMeasurementImpl inputOutputMeasurement = new InputOutputMeasurementImpl();
		return inputOutputMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOutputPoint createInputOutputPoint() {
		InputOutputPointImpl inputOutputPoint = new InputOutputPointImpl();
		return inputOutputPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermodulationDistortionMeasurement createIntermodulationDistortionMeasurement() {
		IntermodulationDistortionMeasurementImpl intermodulationDistortionMeasurement = new IntermodulationDistortionMeasurementImpl();
		return intermodulationDistortionMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermodulationDistortionPoint createIntermodulationDistortionPoint() {
		IntermodulationDistortionPointImpl intermodulationDistortionPoint = new IntermodulationDistortionPointImpl();
		return intermodulationDistortionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditions createMeasurementConditions() {
		MeasurementConditionsImpl measurementConditions = new MeasurementConditionsImpl();
		return measurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcclusionEffects createOcclusionEffects() {
		OcclusionEffectsImpl occlusionEffects = new OcclusionEffectsImpl();
		return occlusionEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealEarCouplerDifference createRealEarCouplerDifference() {
		RealEarCouplerDifferenceImpl realEarCouplerDifference = new RealEarCouplerDifferenceImpl();
		return realEarCouplerDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealEarDataType createRealEarDataType() {
		RealEarDataTypeImpl realEarDataType = new RealEarDataTypeImpl();
		return realEarDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetCurve createTargetCurve() {
		TargetCurveImpl targetCurve = new TargetCurveImpl();
		return targetCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetMeasurement createTargetMeasurement() {
		TargetMeasurementImpl targetMeasurement = new TargetMeasurementImpl();
		return targetMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetMeasurementPoint createTargetMeasurementPoint() {
		TargetMeasurementPointImpl targetMeasurementPoint = new TargetMeasurementPointImpl();
		return targetMeasurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPoint createTargetPoint() {
		TargetPointImpl targetPoint = new TargetPointImpl();
		return targetPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryPillType createBatteryPillTypeFromString(EDataType eDataType, String initialValue) {
		BatteryPillType result = BatteryPillType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryPillTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryType createBatteryTypeFromString(EDataType eDataType, String initialValue) {
		BatteryType result = BatteryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouplerType createCouplerTypeFromString(EDataType eDataType, String initialValue) {
		CouplerType result = CouplerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCouplerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FittingRule createFittingRuleFromString(EDataType eDataType, String initialValue) {
		FittingRule result = FittingRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFittingRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingInstrumentType createHearingInstrumentTypeFromString(EDataType eDataType, String initialValue) {
		HearingInstrumentType result = HearingInstrumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementIdentification createMeasurementIdentificationFromString(EDataType eDataType, String initialValue) {
		MeasurementIdentification result = MeasurementIdentification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementIdentificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementMode createMeasurementModeFromString(EDataType eDataType, String initialValue) {
		MeasurementMode result = MeasurementMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementModeToString(EDataType eDataType, Object instanceValue) {
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
	public BigDecimal createAttackReleaseTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttackReleaseTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBatteryImpedanceTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryImpedanceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBatteryImpedanceType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryImpedanceType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryPillType createBatteryPillTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBatteryPillTypeFromString(EarPackage.Literals.BATTERY_PILL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryPillTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBatteryPillTypeToString(EarPackage.Literals.BATTERY_PILL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryType createBatteryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBatteryTypeFromString(EarPackage.Literals.BATTERY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBatteryTypeToString(EarPackage.Literals.BATTERY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBatteryVoltageTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryVoltageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBatteryVoltageType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryVoltageType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
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
	public CouplerType createCouplerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCouplerTypeFromString(EarPackage.Literals.COUPLER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCouplerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCouplerTypeToString(EarPackage.Literals.COUPLER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createCurrentTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEquivalentRootMeanSquareTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEquivalentRootMeanSquareTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FittingRule createFittingRuleObjectFromString(EDataType eDataType, String initialValue) {
		return createFittingRuleFromString(EarPackage.Literals.FITTING_RULE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFittingRuleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFittingRuleToString(EarPackage.Literals.FITTING_RULE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFx1TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFx1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFx2TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFx2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFx3TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFx3TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingInstrumentType createHearingInstrumentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHearingInstrumentTypeFromString(EarPackage.Literals.HEARING_INSTRUMENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHearingInstrumentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHearingInstrumentTypeToString(EarPackage.Literals.HEARING_INSTRUMENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInput1TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInput1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInput2TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInput2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInputTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInputType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createInputType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLevelStepTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelStepTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementIdentification createMeasurementIdentificationObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasurementIdentificationFromString(EarPackage.Literals.MEASUREMENT_IDENTIFICATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementIdentificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasurementIdentificationToString(EarPackage.Literals.MEASUREMENT_IDENTIFICATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementMode createMeasurementModeObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasurementModeFromString(EarPackage.Literals.MEASUREMENT_MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasurementModeToString(EarPackage.Literals.MEASUREMENT_MODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutput1TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutput1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutput2TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutput2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputDiff1TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputDiff1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputDiff2TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputDiff2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOutputType3FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createReserveGainTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReserveGainTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRuleNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalLevelType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalLevelType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalLevelType2FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalLevelType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalOutputType createSignalOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalOutputTypeFromString(EarPackage.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(EarPackage.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeFromString(EarPackage.Literals.SIGNAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeToString(EarPackage.Literals.SIGNAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTargetGainTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetGainTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createThirdHDTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThirdHDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTIDistortionTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIDistortionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createVentCanalDiameterTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVentCanalDiameterTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createVentCanalLengthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVentCanalLengthTypeToString(EDataType eDataType, Object instanceValue) {
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
	public EarPackage getEarPackage() {
		return (EarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EarPackage getPackage() {
		return EarPackage.eINSTANCE;
	}

} //EarFactoryImpl
