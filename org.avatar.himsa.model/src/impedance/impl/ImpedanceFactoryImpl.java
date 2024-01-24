/**
 */
package impedance.impl;

import impedance.*;

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
public class ImpedanceFactoryImpl extends EFactoryImpl implements ImpedanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImpedanceFactory init() {
		try {
			ImpedanceFactory theImpedanceFactory = (ImpedanceFactory)EPackage.Registry.INSTANCE.getEFactory(ImpedancePackage.eNS_URI);
			if (theImpedanceFactory != null) {
				return theImpedanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImpedanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceFactoryImpl() {
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE: return createAcousticImpedanceCompleteMeasurementType();
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE: return createComplianceCurveType();
			case ImpedancePackage.COMPLIANCE_POINT_TYPE: return createCompliancePointType();
			case ImpedancePackage.COMPLIANCE_TYPE: return createComplianceType();
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE: return createComplianceUnitType();
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE: return createComplianceValueType();
			case ImpedancePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST: return createEustachianTubeFunctionIntactEarDrumTest();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST: return createEustachianTubeFunctionPerforatedEarDrumTest();
			case ImpedancePackage.GRADIENT_TYPE: return createGradientType();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE: return createImpedanceMeasurementConditionType();
			case ImpedancePackage.PRESSURE_POINT_TYPE: return createPressurePointType();
			case ImpedancePackage.REFLEX_CURVE_TYPE: return createReflexCurveType();
			case ImpedancePackage.REFLEX_POINT_TYPE: return createReflexPointType();
			case ImpedancePackage.REFLEX_TEST_TYPE: return createReflexTestType();
			case ImpedancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE: return createTympanogramMeasurementConditionsType();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE: return createTympanogramTestType();
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
			case ImpedancePackage.RECORDING_MODE_TYPE:
				return createRecordingModeTypeFromString(eDataType, initialValue);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE:
				return createReflexTestTypeTypeFromString(eDataType, initialValue);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE:
				return createSignalOutputTypeFromString(eDataType, initialValue);
			case ImpedancePackage.SIGNAL_TYPE_TYPE:
				return createSignalTypeTypeFromString(eDataType, initialValue);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE:
				return createTympanogramResultTypeFromString(eDataType, initialValue);
			case ImpedancePackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case ImpedancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return createConvertedFromDataStandardTypeFromString(eDataType, initialValue);
			case ImpedancePackage.RECORDING_MODE_TYPE_OBJECT:
				return createRecordingModeTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return createReflexTestTypeTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.SIGNAL_LEVEL_TYPE:
				return createSignalLevelTypeFromString(eDataType, initialValue);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return createSignalOutputTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return createSignalTypeTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.TIME_BASE_TYPE:
				return createTimeBaseTypeFromString(eDataType, initialValue);
			case ImpedancePackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case ImpedancePackage.TIME_TYPE1:
				return createTimeType1FromString(eDataType, initialValue);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return createTympanogramResultTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case ImpedancePackage.VERSION_TYPE:
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
			case ImpedancePackage.RECORDING_MODE_TYPE:
				return convertRecordingModeTypeToString(eDataType, instanceValue);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE:
				return convertReflexTestTypeTypeToString(eDataType, instanceValue);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE:
				return convertSignalOutputTypeToString(eDataType, instanceValue);
			case ImpedancePackage.SIGNAL_TYPE_TYPE:
				return convertSignalTypeTypeToString(eDataType, instanceValue);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE:
				return convertTympanogramResultTypeToString(eDataType, instanceValue);
			case ImpedancePackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case ImpedancePackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return convertConvertedFromDataStandardTypeToString(eDataType, instanceValue);
			case ImpedancePackage.RECORDING_MODE_TYPE_OBJECT:
				return convertRecordingModeTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.REFLEX_TEST_TYPE_TYPE_OBJECT:
				return convertReflexTestTypeTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.SIGNAL_LEVEL_TYPE:
				return convertSignalLevelTypeToString(eDataType, instanceValue);
			case ImpedancePackage.SIGNAL_OUTPUT_TYPE_OBJECT:
				return convertSignalOutputTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.SIGNAL_TYPE_TYPE_OBJECT:
				return convertSignalTypeTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.TIME_BASE_TYPE:
				return convertTimeBaseTypeToString(eDataType, instanceValue);
			case ImpedancePackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case ImpedancePackage.TIME_TYPE1:
				return convertTimeType1ToString(eDataType, instanceValue);
			case ImpedancePackage.TYMPANOGRAM_RESULT_TYPE_OBJECT:
				return convertTympanogramResultTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case ImpedancePackage.VERSION_TYPE:
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
	public AcousticImpedanceCompleteMeasurementType createAcousticImpedanceCompleteMeasurementType() {
		AcousticImpedanceCompleteMeasurementTypeImpl acousticImpedanceCompleteMeasurementType = new AcousticImpedanceCompleteMeasurementTypeImpl();
		return acousticImpedanceCompleteMeasurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceCurveType createComplianceCurveType() {
		ComplianceCurveTypeImpl complianceCurveType = new ComplianceCurveTypeImpl();
		return complianceCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompliancePointType createCompliancePointType() {
		CompliancePointTypeImpl compliancePointType = new CompliancePointTypeImpl();
		return compliancePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceType createComplianceType() {
		ComplianceTypeImpl complianceType = new ComplianceTypeImpl();
		return complianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceUnitType createComplianceUnitType() {
		ComplianceUnitTypeImpl complianceUnitType = new ComplianceUnitTypeImpl();
		return complianceUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceValueType createComplianceValueType() {
		ComplianceValueTypeImpl complianceValueType = new ComplianceValueTypeImpl();
		return complianceValueType;
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
	public ImpedanceMeasurementConditionType createImpedanceMeasurementConditionType() {
		ImpedanceMeasurementConditionTypeImpl impedanceMeasurementConditionType = new ImpedanceMeasurementConditionTypeImpl();
		return impedanceMeasurementConditionType;
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
	public ReflexPointType createReflexPointType() {
		ReflexPointTypeImpl reflexPointType = new ReflexPointTypeImpl();
		return reflexPointType;
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
	public RecordingModeType createRecordingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRecordingModeTypeFromString(ImpedancePackage.Literals.RECORDING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRecordingModeTypeToString(ImpedancePackage.Literals.RECORDING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTestTypeType createReflexTestTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReflexTestTypeTypeFromString(ImpedancePackage.Literals.REFLEX_TEST_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexTestTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReflexTestTypeTypeToString(ImpedancePackage.Literals.REFLEX_TEST_TYPE_TYPE, instanceValue);
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
	public SignalOutputType createSignalOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalOutputTypeFromString(ImpedancePackage.Literals.SIGNAL_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalOutputTypeToString(ImpedancePackage.Literals.SIGNAL_OUTPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTypeType createSignalTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignalTypeTypeFromString(ImpedancePackage.Literals.SIGNAL_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignalTypeTypeToString(ImpedancePackage.Literals.SIGNAL_TYPE_TYPE, instanceValue);
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
	public TympanogramResultType createTympanogramResultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTympanogramResultTypeFromString(ImpedancePackage.Literals.TYMPANOGRAM_RESULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTympanogramResultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTympanogramResultTypeToString(ImpedancePackage.Literals.TYMPANOGRAM_RESULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(ImpedancePackage.Literals.UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(ImpedancePackage.Literals.UNIT_TYPE, instanceValue);
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
	public ImpedancePackage getImpedancePackage() {
		return (ImpedancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImpedancePackage getPackage() {
		return ImpedancePackage.eINSTANCE;
	}

} //ImpedanceFactoryImpl
