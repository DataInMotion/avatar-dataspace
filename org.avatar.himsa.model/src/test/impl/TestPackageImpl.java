/**
 */
package test.impl;

import admittance.AdmittancePackage;

import admittance.impl.AdmittancePackageImpl;

import audiogram.AudiogramPackage;

import audiogram.impl.AudiogramPackageImpl;

import audiogram502.Audiogram502Package;

import audiogram502.impl.Audiogram502PackageImpl;

import audiogrammetadata.AudiogrammetadataPackage;

import audiogrammetadata.impl.AudiogrammetadataPackageImpl;

import cochlear.CochlearPackage;

import cochlear.impl.CochlearPackageImpl;

import data.DataPackage;

import data.impl.DataPackageImpl;

import fitting.FittingPackage;

import fitting.impl.FittingPackageImpl;

import impedance.ImpedancePackage;

import impedance.impl.ImpedancePackageImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import journal.JournalPackage;

import journal.impl.JournalPackageImpl;

import notification.NotificationPackage;

import notification.impl.NotificationPackageImpl;

import org.avatar.himsa.export.PatientExportPackage;

import org.avatar.himsa.export.impl.PatientExportPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import realear.RealearPackage;

import realear.impl.RealearPackageImpl;

import remotecontrol.RemotecontrolPackage;

import remotecontrol.impl.RemotecontrolPackageImpl;

import selection.SelectionPackage;

import selection.impl.SelectionPackageImpl;

import test.AttackReleaseMeasurementPoint;
import test.BatteryCurrentMeasurement;
import test.BatteryMeasurementConditions;
import test.BatteryMeasurementPoint;
import test.BatteryPillType;
import test.BatteryType;
import test.CouplerType;
import test.DocumentRoot;
import test.EquivalentInputNoise;
import test.FittingRule;
import test.FrequencyMeasurement;
import test.FrequencyMeasurementPoint;
import test.FullTargetCurve;
import test.HIMSAHitStandardType;
import test.HarmonicDistortionMeasurementCurve;
import test.HarmonicDistortionPoint;
import test.HearingInstrumentTestType;
import test.HearingInstrumentType;
import test.InputOutputMeasurement;
import test.InputOutputPoint;
import test.IntermodulationDistortionMeasurement;
import test.IntermodulationDistortionPoint;
import test.MeasurementConditions;
import test.MeasurementIdentification;
import test.MeasurementMode;
import test.OcclusionEffects;
import test.RealEarCouplerDifference;
import test.SignalOutputType;
import test.SignalType;
import test.TargetCurve;
import test.TargetMeasurement;
import test.TargetMeasurementPoint;
import test.TargetPoint;
import test.TestFactory;
import test.TestPackage;

import test.util.TestValidator;

import tinnitus.TinnitusPackage;

import tinnitus.impl.TinnitusPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackReleaseMeasurementPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryCurrentMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryMeasurementConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryMeasurementPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentInputNoiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyMeasurementPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullTargetCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harmonicDistortionMeasurementCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harmonicDistortionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hearingInstrumentTestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass himsaHitStandardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermodulationDistortionMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermodulationDistortionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occlusionEffectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEarCouplerDifferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMeasurementPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum batteryPillTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum batteryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum couplerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fittingRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hearingInstrumentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementIdentificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalOutputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attackReleaseTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryImpedanceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryImpedanceType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryPillTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryVoltageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType batteryVoltageType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType convertedFromDataStandardTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType couplerTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType equivalentRootMeanSquareTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fittingRuleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fx1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fx2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fx3TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hearingInstrumentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType input1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType input2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelStepTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measurementIdentificationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measurementModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType output1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType output2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputDiff1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputDiff2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reserveGainTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ruleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalLevelType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalLevelType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalOutputTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetGainTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType thirdHDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tiDistortionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ventCanalDiameterTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ventCanalLengthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackageImpl theTestPackage = registeredTestPackage instanceof TestPackageImpl ? (TestPackageImpl)registeredTestPackage : new TestPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdmittancePackage.eNS_URI);
		AdmittancePackageImpl theAdmittancePackage = (AdmittancePackageImpl)(registeredPackage instanceof AdmittancePackageImpl ? registeredPackage : AdmittancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Audiogram502Package.eNS_URI);
		Audiogram502PackageImpl theAudiogram502Package = (Audiogram502PackageImpl)(registeredPackage instanceof Audiogram502PackageImpl ? registeredPackage : Audiogram502Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AudiogramPackage.eNS_URI);
		AudiogramPackageImpl theAudiogramPackage = (AudiogramPackageImpl)(registeredPackage instanceof AudiogramPackageImpl ? registeredPackage : AudiogramPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AudiogrammetadataPackage.eNS_URI);
		AudiogrammetadataPackageImpl theAudiogrammetadataPackage = (AudiogrammetadataPackageImpl)(registeredPackage instanceof AudiogrammetadataPackageImpl ? registeredPackage : AudiogrammetadataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CochlearPackage.eNS_URI);
		CochlearPackageImpl theCochlearPackage = (CochlearPackageImpl)(registeredPackage instanceof CochlearPackageImpl ? registeredPackage : CochlearPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImpedancePackage.eNS_URI);
		ImpedancePackageImpl theImpedancePackage = (ImpedancePackageImpl)(registeredPackage instanceof ImpedancePackageImpl ? registeredPackage : ImpedancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FittingPackage.eNS_URI);
		FittingPackageImpl theFittingPackage = (FittingPackageImpl)(registeredPackage instanceof FittingPackageImpl ? registeredPackage : FittingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(registeredPackage instanceof SelectionPackageImpl ? registeredPackage : SelectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JournalPackage.eNS_URI);
		JournalPackageImpl theJournalPackage = (JournalPackageImpl)(registeredPackage instanceof JournalPackageImpl ? registeredPackage : JournalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NotificationPackage.eNS_URI);
		NotificationPackageImpl theNotificationPackage = (NotificationPackageImpl)(registeredPackage instanceof NotificationPackageImpl ? registeredPackage : NotificationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatientExportPackage.eNS_URI);
		PatientExportPackageImpl thePatientExportPackage = (PatientExportPackageImpl)(registeredPackage instanceof PatientExportPackageImpl ? registeredPackage : PatientExportPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RealearPackage.eNS_URI);
		RealearPackageImpl theRealearPackage = (RealearPackageImpl)(registeredPackage instanceof RealearPackageImpl ? registeredPackage : RealearPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RemotecontrolPackage.eNS_URI);
		RemotecontrolPackageImpl theRemotecontrolPackage = (RemotecontrolPackageImpl)(registeredPackage instanceof RemotecontrolPackageImpl ? registeredPackage : RemotecontrolPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TinnitusPackage.eNS_URI);
		TinnitusPackageImpl theTinnitusPackage = (TinnitusPackageImpl)(registeredPackage instanceof TinnitusPackageImpl ? registeredPackage : TinnitusPackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackage.createPackageContents();
		theAdmittancePackage.createPackageContents();
		theAudiogram502Package.createPackageContents();
		theAudiogramPackage.createPackageContents();
		theAudiogrammetadataPackage.createPackageContents();
		theCochlearPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theImpedancePackage.createPackageContents();
		theFittingPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theJournalPackage.createPackageContents();
		theNotificationPackage.createPackageContents();
		thePatientExportPackage.createPackageContents();
		theRealearPackage.createPackageContents();
		theRemotecontrolPackage.createPackageContents();
		theTinnitusPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();
		theAdmittancePackage.initializePackageContents();
		theAudiogram502Package.initializePackageContents();
		theAudiogramPackage.initializePackageContents();
		theAudiogrammetadataPackage.initializePackageContents();
		theCochlearPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theImpedancePackage.initializePackageContents();
		theFittingPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theJournalPackage.initializePackageContents();
		theNotificationPackage.initializePackageContents();
		thePatientExportPackage.initializePackageContents();
		theRealearPackage.initializePackageContents();
		theRemotecontrolPackage.initializePackageContents();
		theTinnitusPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTestPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return TestValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttackReleaseMeasurementPoint() {
		return attackReleaseMeasurementPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackReleaseMeasurementPoint_Output() {
		return (EAttribute)attackReleaseMeasurementPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackReleaseMeasurementPoint_AttackReleaseTime() {
		return (EAttribute)attackReleaseMeasurementPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatteryCurrentMeasurement() {
		return batteryCurrentMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBatteryCurrentMeasurement_BatteryConditions() {
		return (EReference)batteryCurrentMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBatteryCurrentMeasurement_BatteryCurve() {
		return (EReference)batteryCurrentMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatteryMeasurementConditions() {
		return batteryMeasurementConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_ManufacturerCode() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_DevTypeCode() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_SignalType() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_SignalOutput() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_SignalLevel() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_SignalFrequency() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_BatteryType() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_BatteryPillType() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_BatteryVoltage() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_BatteryImpedance() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_UseRealEarCoupler() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_MeasurementMode() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementConditions_MeasurementIdentification() {
		return (EAttribute)batteryMeasurementConditionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatteryMeasurementPoint() {
		return batteryMeasurementPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementPoint_Frequency() {
		return (EAttribute)batteryMeasurementPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryMeasurementPoint_Current() {
		return (EAttribute)batteryMeasurementPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HIMSAHitStandard() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquivalentInputNoise() {
		return equivalentInputNoiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquivalentInputNoise_MeasurementConditions() {
		return (EReference)equivalentInputNoiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquivalentInputNoise_Point() {
		return (EReference)equivalentInputNoiseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquivalentInputNoise_EquivalentRootMeanSquare() {
		return (EAttribute)equivalentInputNoiseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyMeasurement() {
		return frequencyMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyMeasurement_MeasurementConditions() {
		return (EReference)frequencyMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyMeasurement_Point() {
		return (EReference)frequencyMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyMeasurementPoint() {
		return frequencyMeasurementPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyMeasurementPoint_Frequency() {
		return (EAttribute)frequencyMeasurementPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyMeasurementPoint_Input() {
		return (EAttribute)frequencyMeasurementPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyMeasurementPoint_Output() {
		return (EAttribute)frequencyMeasurementPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFullTargetCurve() {
		return fullTargetCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_ManufacturersCode() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_DeviceTypeCode() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_FittingRule() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_HearingInstrumentType() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_VentCanalDiameter() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_VentCanalLength() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_ReserveGain() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_CouplerType() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_SignalLevel() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFullTargetCurve_Target() {
		return (EReference)fullTargetCurveEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFullTargetCurve_RuleName() {
		return (EAttribute)fullTargetCurveEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHarmonicDistortionMeasurementCurve() {
		return harmonicDistortionMeasurementCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHarmonicDistortionMeasurementCurve_MeasurementConditions() {
		return (EReference)harmonicDistortionMeasurementCurveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHarmonicDistortionMeasurementCurve_Point() {
		return (EReference)harmonicDistortionMeasurementCurveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHarmonicDistortionPoint() {
		return harmonicDistortionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_Frequency() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_Input() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_Fx1() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_Fx2() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_Fx3() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarmonicDistortionPoint_ThirdHD() {
		return (EAttribute)harmonicDistortionPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHearingInstrumentTestType() {
		return hearingInstrumentTestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_SaturationResponse() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_FullOnGain() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_FrequencyResponse() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_BatteryMeasurement() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_SecondThirdHarmonicDistortion() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_IntermodulationDistortionMeasurement() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_EquivalentInputNoiseMeasurement() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_InputOutput() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_AttackRecoverCurve() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHearingInstrumentTestType_InductionCoil() {
		return (EReference)hearingInstrumentTestTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIMSAHitStandardType() {
		return himsaHitStandardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAHitStandardType_HearingInstrumentTest() {
		return (EReference)himsaHitStandardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAHitStandardType_PrivateHIT() {
		return (EAttribute)himsaHitStandardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAHitStandardType_ConvertedFromDataStandard() {
		return (EAttribute)himsaHitStandardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAHitStandardType_ValidatedByNOAH() {
		return (EAttribute)himsaHitStandardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAHitStandardType_Version() {
		return (EAttribute)himsaHitStandardTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputOutputMeasurement() {
		return inputOutputMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputOutputMeasurement_MeasurementConditions() {
		return (EReference)inputOutputMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputOutputMeasurement_Point() {
		return (EReference)inputOutputMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputOutputPoint() {
		return inputOutputPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputOutputPoint_Input() {
		return (EAttribute)inputOutputPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputOutputPoint_Output() {
		return (EAttribute)inputOutputPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermodulationDistortionMeasurement() {
		return intermodulationDistortionMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermodulationDistortionMeasurement_MeasurementCondition() {
		return (EReference)intermodulationDistortionMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermodulationDistortionMeasurement_Point() {
		return (EReference)intermodulationDistortionMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermodulationDistortionPoint() {
		return intermodulationDistortionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Freq1() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Freq2() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Input1() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Input2() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Output1() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_Output2() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_OutputDiff1() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_OutputDiff2() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermodulationDistortionPoint_TIDistortion() {
		return (EAttribute)intermodulationDistortionPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementConditions() {
		return measurementConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_ManufacturerCode() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_DevTypeCode() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_SignalType() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_SignalOutput() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_SignalLevel() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_SignalFrequency() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_BatteryType() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_BatteryPillType() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_BatteryVoltage() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_BatteryImpedance() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_UseRealEarCoupler() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_MeasurementMode() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditions_MeasurementIdentification() {
		return (EAttribute)measurementConditionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOcclusionEffects() {
		return occlusionEffectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOcclusionEffects_MeasurementConditions() {
		return (EReference)occlusionEffectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOcclusionEffects_REUR() {
		return (EReference)occlusionEffectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOcclusionEffects_REOR() {
		return (EReference)occlusionEffectsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealEarCouplerDifference() {
		return realEarCouplerDifferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealEarCouplerDifference_MeasurementConditions() {
		return (EReference)realEarCouplerDifferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealEarCouplerDifference_RECD() {
		return (EReference)realEarCouplerDifferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetCurve() {
		return targetCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetCurve_Curve() {
		return (EReference)targetCurveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetCurve_Result() {
		return (EAttribute)targetCurveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetCurve_Resolution() {
		return (EAttribute)targetCurveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetCurve_PreDelay() {
		return (EAttribute)targetCurveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetMeasurement() {
		return targetMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetMeasurement_MeasurementConditions() {
		return (EReference)targetMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetMeasurement_LevelStep() {
		return (EAttribute)targetMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetMeasurement_AttackCurve() {
		return (EReference)targetMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetMeasurement_ReleaseCurve() {
		return (EReference)targetMeasurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetMeasurementPoint() {
		return targetMeasurementPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetMeasurementPoint_Output() {
		return (EAttribute)targetMeasurementPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetPoint() {
		return targetPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPoint_TargetFrequency() {
		return (EAttribute)targetPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPoint_TargetGain() {
		return (EAttribute)targetPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBatteryPillType() {
		return batteryPillTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBatteryType() {
		return batteryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCouplerType() {
		return couplerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFittingRule() {
		return fittingRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHearingInstrumentType() {
		return hearingInstrumentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasurementIdentification() {
		return measurementIdentificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasurementMode() {
		return measurementModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSignalOutputType() {
		return signalOutputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSignalType() {
		return signalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAttackReleaseTimeType() {
		return attackReleaseTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryImpedanceType() {
		return batteryImpedanceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryImpedanceType1() {
		return batteryImpedanceType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryPillTypeObject() {
		return batteryPillTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryTypeObject() {
		return batteryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryVoltageType() {
		return batteryVoltageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryVoltageType1() {
		return batteryVoltageType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConvertedFromDataStandardType() {
		return convertedFromDataStandardTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCouplerTypeObject() {
		return couplerTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCurrentType() {
		return currentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEquivalentRootMeanSquareType() {
		return equivalentRootMeanSquareTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFittingRuleObject() {
		return fittingRuleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFx1Type() {
		return fx1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFx2Type() {
		return fx2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFx3Type() {
		return fx3TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHearingInstrumentTypeObject() {
		return hearingInstrumentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInput1Type() {
		return input1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInput2Type() {
		return input2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInputType() {
		return inputTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInputType1() {
		return inputType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInputType2() {
		return inputType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLevelStepType() {
		return levelStepTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeasurementIdentificationObject() {
		return measurementIdentificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeasurementModeObject() {
		return measurementModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutput1Type() {
		return output1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutput2Type() {
		return output2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputDiff1Type() {
		return outputDiff1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputDiff2Type() {
		return outputDiff2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputType() {
		return outputTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputType1() {
		return outputType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputType2() {
		return outputType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputType3() {
		return outputType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReserveGainType() {
		return reserveGainTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRuleNameType() {
		return ruleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalLevelType() {
		return signalLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalLevelType1() {
		return signalLevelType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalLevelType2() {
		return signalLevelType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalOutputTypeObject() {
		return signalOutputTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalTypeObject() {
		return signalTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTargetGainType() {
		return targetGainTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getThirdHDType() {
		return thirdHDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTIDistortionType() {
		return tiDistortionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVentCanalDiameterType() {
		return ventCanalDiameterTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVentCanalLengthType() {
		return ventCanalLengthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attackReleaseMeasurementPointEClass = createEClass(ATTACK_RELEASE_MEASUREMENT_POINT);
		createEAttribute(attackReleaseMeasurementPointEClass, ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT);
		createEAttribute(attackReleaseMeasurementPointEClass, ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME);

		batteryCurrentMeasurementEClass = createEClass(BATTERY_CURRENT_MEASUREMENT);
		createEReference(batteryCurrentMeasurementEClass, BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS);
		createEReference(batteryCurrentMeasurementEClass, BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE);

		batteryMeasurementConditionsEClass = createEClass(BATTERY_MEASUREMENT_CONDITIONS);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE);
		createEAttribute(batteryMeasurementConditionsEClass, BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION);

		batteryMeasurementPointEClass = createEClass(BATTERY_MEASUREMENT_POINT);
		createEAttribute(batteryMeasurementPointEClass, BATTERY_MEASUREMENT_POINT__FREQUENCY);
		createEAttribute(batteryMeasurementPointEClass, BATTERY_MEASUREMENT_POINT__CURRENT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIMSA_HIT_STANDARD);

		equivalentInputNoiseEClass = createEClass(EQUIVALENT_INPUT_NOISE);
		createEReference(equivalentInputNoiseEClass, EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS);
		createEReference(equivalentInputNoiseEClass, EQUIVALENT_INPUT_NOISE__POINT);
		createEAttribute(equivalentInputNoiseEClass, EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE);

		frequencyMeasurementEClass = createEClass(FREQUENCY_MEASUREMENT);
		createEReference(frequencyMeasurementEClass, FREQUENCY_MEASUREMENT__MEASUREMENT_CONDITIONS);
		createEReference(frequencyMeasurementEClass, FREQUENCY_MEASUREMENT__POINT);

		frequencyMeasurementPointEClass = createEClass(FREQUENCY_MEASUREMENT_POINT);
		createEAttribute(frequencyMeasurementPointEClass, FREQUENCY_MEASUREMENT_POINT__FREQUENCY);
		createEAttribute(frequencyMeasurementPointEClass, FREQUENCY_MEASUREMENT_POINT__INPUT);
		createEAttribute(frequencyMeasurementPointEClass, FREQUENCY_MEASUREMENT_POINT__OUTPUT);

		fullTargetCurveEClass = createEClass(FULL_TARGET_CURVE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__MANUFACTURERS_CODE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__DEVICE_TYPE_CODE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__FITTING_RULE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__VENT_CANAL_DIAMETER);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__VENT_CANAL_LENGTH);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__RESERVE_GAIN);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__COUPLER_TYPE);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__SIGNAL_LEVEL);
		createEReference(fullTargetCurveEClass, FULL_TARGET_CURVE__TARGET);
		createEAttribute(fullTargetCurveEClass, FULL_TARGET_CURVE__RULE_NAME);

		harmonicDistortionMeasurementCurveEClass = createEClass(HARMONIC_DISTORTION_MEASUREMENT_CURVE);
		createEReference(harmonicDistortionMeasurementCurveEClass, HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS);
		createEReference(harmonicDistortionMeasurementCurveEClass, HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT);

		harmonicDistortionPointEClass = createEClass(HARMONIC_DISTORTION_POINT);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__FREQUENCY);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__INPUT);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__FX1);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__FX2);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__FX3);
		createEAttribute(harmonicDistortionPointEClass, HARMONIC_DISTORTION_POINT__THIRD_HD);

		hearingInstrumentTestTypeEClass = createEClass(HEARING_INSTRUMENT_TEST_TYPE);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE);
		createEReference(hearingInstrumentTestTypeEClass, HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL);

		himsaHitStandardTypeEClass = createEClass(HIMSA_HIT_STANDARD_TYPE);
		createEReference(himsaHitStandardTypeEClass, HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST);
		createEAttribute(himsaHitStandardTypeEClass, HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT);
		createEAttribute(himsaHitStandardTypeEClass, HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD);
		createEAttribute(himsaHitStandardTypeEClass, HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH);
		createEAttribute(himsaHitStandardTypeEClass, HIMSA_HIT_STANDARD_TYPE__VERSION);

		inputOutputMeasurementEClass = createEClass(INPUT_OUTPUT_MEASUREMENT);
		createEReference(inputOutputMeasurementEClass, INPUT_OUTPUT_MEASUREMENT__MEASUREMENT_CONDITIONS);
		createEReference(inputOutputMeasurementEClass, INPUT_OUTPUT_MEASUREMENT__POINT);

		inputOutputPointEClass = createEClass(INPUT_OUTPUT_POINT);
		createEAttribute(inputOutputPointEClass, INPUT_OUTPUT_POINT__INPUT);
		createEAttribute(inputOutputPointEClass, INPUT_OUTPUT_POINT__OUTPUT);

		intermodulationDistortionMeasurementEClass = createEClass(INTERMODULATION_DISTORTION_MEASUREMENT);
		createEReference(intermodulationDistortionMeasurementEClass, INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION);
		createEReference(intermodulationDistortionMeasurementEClass, INTERMODULATION_DISTORTION_MEASUREMENT__POINT);

		intermodulationDistortionPointEClass = createEClass(INTERMODULATION_DISTORTION_POINT);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__FREQ1);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__FREQ2);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__INPUT1);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__INPUT2);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__OUTPUT1);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__OUTPUT2);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2);
		createEAttribute(intermodulationDistortionPointEClass, INTERMODULATION_DISTORTION_POINT__TI_DISTORTION);

		measurementConditionsEClass = createEClass(MEASUREMENT_CONDITIONS);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__MANUFACTURER_CODE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__DEV_TYPE_CODE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__SIGNAL_TYPE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__SIGNAL_LEVEL);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__BATTERY_TYPE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__MEASUREMENT_MODE);
		createEAttribute(measurementConditionsEClass, MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION);

		occlusionEffectsEClass = createEClass(OCCLUSION_EFFECTS);
		createEReference(occlusionEffectsEClass, OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS);
		createEReference(occlusionEffectsEClass, OCCLUSION_EFFECTS__REUR);
		createEReference(occlusionEffectsEClass, OCCLUSION_EFFECTS__REOR);

		realEarCouplerDifferenceEClass = createEClass(REAL_EAR_COUPLER_DIFFERENCE);
		createEReference(realEarCouplerDifferenceEClass, REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS);
		createEReference(realEarCouplerDifferenceEClass, REAL_EAR_COUPLER_DIFFERENCE__RECD);

		targetCurveEClass = createEClass(TARGET_CURVE);
		createEReference(targetCurveEClass, TARGET_CURVE__CURVE);
		createEAttribute(targetCurveEClass, TARGET_CURVE__RESULT);
		createEAttribute(targetCurveEClass, TARGET_CURVE__RESOLUTION);
		createEAttribute(targetCurveEClass, TARGET_CURVE__PRE_DELAY);

		targetMeasurementEClass = createEClass(TARGET_MEASUREMENT);
		createEReference(targetMeasurementEClass, TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS);
		createEAttribute(targetMeasurementEClass, TARGET_MEASUREMENT__LEVEL_STEP);
		createEReference(targetMeasurementEClass, TARGET_MEASUREMENT__ATTACK_CURVE);
		createEReference(targetMeasurementEClass, TARGET_MEASUREMENT__RELEASE_CURVE);

		targetMeasurementPointEClass = createEClass(TARGET_MEASUREMENT_POINT);
		createEAttribute(targetMeasurementPointEClass, TARGET_MEASUREMENT_POINT__OUTPUT);

		targetPointEClass = createEClass(TARGET_POINT);
		createEAttribute(targetPointEClass, TARGET_POINT__TARGET_FREQUENCY);
		createEAttribute(targetPointEClass, TARGET_POINT__TARGET_GAIN);

		// Create enums
		batteryPillTypeEEnum = createEEnum(BATTERY_PILL_TYPE);
		batteryTypeEEnum = createEEnum(BATTERY_TYPE);
		couplerTypeEEnum = createEEnum(COUPLER_TYPE);
		fittingRuleEEnum = createEEnum(FITTING_RULE);
		hearingInstrumentTypeEEnum = createEEnum(HEARING_INSTRUMENT_TYPE);
		measurementIdentificationEEnum = createEEnum(MEASUREMENT_IDENTIFICATION);
		measurementModeEEnum = createEEnum(MEASUREMENT_MODE);
		signalOutputTypeEEnum = createEEnum(SIGNAL_OUTPUT_TYPE);
		signalTypeEEnum = createEEnum(SIGNAL_TYPE);

		// Create data types
		attackReleaseTimeTypeEDataType = createEDataType(ATTACK_RELEASE_TIME_TYPE);
		batteryImpedanceTypeEDataType = createEDataType(BATTERY_IMPEDANCE_TYPE);
		batteryImpedanceType1EDataType = createEDataType(BATTERY_IMPEDANCE_TYPE1);
		batteryPillTypeObjectEDataType = createEDataType(BATTERY_PILL_TYPE_OBJECT);
		batteryTypeObjectEDataType = createEDataType(BATTERY_TYPE_OBJECT);
		batteryVoltageTypeEDataType = createEDataType(BATTERY_VOLTAGE_TYPE);
		batteryVoltageType1EDataType = createEDataType(BATTERY_VOLTAGE_TYPE1);
		convertedFromDataStandardTypeEDataType = createEDataType(CONVERTED_FROM_DATA_STANDARD_TYPE);
		couplerTypeObjectEDataType = createEDataType(COUPLER_TYPE_OBJECT);
		currentTypeEDataType = createEDataType(CURRENT_TYPE);
		equivalentRootMeanSquareTypeEDataType = createEDataType(EQUIVALENT_ROOT_MEAN_SQUARE_TYPE);
		fittingRuleObjectEDataType = createEDataType(FITTING_RULE_OBJECT);
		fx1TypeEDataType = createEDataType(FX1_TYPE);
		fx2TypeEDataType = createEDataType(FX2_TYPE);
		fx3TypeEDataType = createEDataType(FX3_TYPE);
		hearingInstrumentTypeObjectEDataType = createEDataType(HEARING_INSTRUMENT_TYPE_OBJECT);
		input1TypeEDataType = createEDataType(INPUT1_TYPE);
		input2TypeEDataType = createEDataType(INPUT2_TYPE);
		inputTypeEDataType = createEDataType(INPUT_TYPE);
		inputType1EDataType = createEDataType(INPUT_TYPE1);
		inputType2EDataType = createEDataType(INPUT_TYPE2);
		levelStepTypeEDataType = createEDataType(LEVEL_STEP_TYPE);
		measurementIdentificationObjectEDataType = createEDataType(MEASUREMENT_IDENTIFICATION_OBJECT);
		measurementModeObjectEDataType = createEDataType(MEASUREMENT_MODE_OBJECT);
		output1TypeEDataType = createEDataType(OUTPUT1_TYPE);
		output2TypeEDataType = createEDataType(OUTPUT2_TYPE);
		outputDiff1TypeEDataType = createEDataType(OUTPUT_DIFF1_TYPE);
		outputDiff2TypeEDataType = createEDataType(OUTPUT_DIFF2_TYPE);
		outputTypeEDataType = createEDataType(OUTPUT_TYPE);
		outputType1EDataType = createEDataType(OUTPUT_TYPE1);
		outputType2EDataType = createEDataType(OUTPUT_TYPE2);
		outputType3EDataType = createEDataType(OUTPUT_TYPE3);
		reserveGainTypeEDataType = createEDataType(RESERVE_GAIN_TYPE);
		ruleNameTypeEDataType = createEDataType(RULE_NAME_TYPE);
		signalLevelTypeEDataType = createEDataType(SIGNAL_LEVEL_TYPE);
		signalLevelType1EDataType = createEDataType(SIGNAL_LEVEL_TYPE1);
		signalLevelType2EDataType = createEDataType(SIGNAL_LEVEL_TYPE2);
		signalOutputTypeObjectEDataType = createEDataType(SIGNAL_OUTPUT_TYPE_OBJECT);
		signalTypeObjectEDataType = createEDataType(SIGNAL_TYPE_OBJECT);
		targetGainTypeEDataType = createEDataType(TARGET_GAIN_TYPE);
		thirdHDTypeEDataType = createEDataType(THIRD_HD_TYPE);
		tiDistortionTypeEDataType = createEDataType(TI_DISTORTION_TYPE);
		ventCanalDiameterTypeEDataType = createEDataType(VENT_CANAL_DIAMETER_TYPE);
		ventCanalLengthTypeEDataType = createEDataType(VENT_CANAL_LENGTH_TYPE);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attackReleaseMeasurementPointEClass, AttackReleaseMeasurementPoint.class, "AttackReleaseMeasurementPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackReleaseMeasurementPoint_Output(), this.getOutputType1(), "output", null, 1, 1, AttackReleaseMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackReleaseMeasurementPoint_AttackReleaseTime(), this.getAttackReleaseTimeType(), "attackReleaseTime", null, 1, 1, AttackReleaseMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryCurrentMeasurementEClass, BatteryCurrentMeasurement.class, "BatteryCurrentMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBatteryCurrentMeasurement_BatteryConditions(), this.getBatteryMeasurementConditions(), null, "batteryConditions", null, 1, 1, BatteryCurrentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatteryCurrentMeasurement_BatteryCurve(), this.getBatteryMeasurementPoint(), null, "batteryCurve", null, 1, 169, BatteryCurrentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryMeasurementConditionsEClass, BatteryMeasurementConditions.class, "BatteryMeasurementConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryMeasurementConditions_ManufacturerCode(), theXMLTypePackage.getInteger(), "manufacturerCode", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_DevTypeCode(), theXMLTypePackage.getInteger(), "devTypeCode", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_SignalType(), this.getSignalType(), "signalType", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_SignalOutput(), this.getSignalOutputType(), "signalOutput", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_SignalLevel(), this.getSignalLevelType(), "signalLevel", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_SignalFrequency(), theXMLTypePackage.getInteger(), "signalFrequency", null, 0, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_BatteryType(), this.getBatteryType(), "batteryType", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_BatteryPillType(), this.getBatteryPillType(), "batteryPillType", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_BatteryVoltage(), this.getBatteryVoltageType(), "batteryVoltage", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_BatteryImpedance(), this.getBatteryImpedanceType(), "batteryImpedance", null, 1, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_UseRealEarCoupler(), theXMLTypePackage.getBoolean(), "useRealEarCoupler", null, 0, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_MeasurementMode(), this.getMeasurementMode(), "measurementMode", null, 0, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementConditions_MeasurementIdentification(), this.getMeasurementIdentification(), "measurementIdentification", null, 0, 1, BatteryMeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryMeasurementPointEClass, BatteryMeasurementPoint.class, "BatteryMeasurementPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryMeasurementPoint_Frequency(), theXMLTypePackage.getInteger(), "frequency", null, 1, 1, BatteryMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryMeasurementPoint_Current(), this.getCurrentType(), "current", null, 1, 1, BatteryMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HIMSAHitStandard(), this.getHIMSAHitStandardType(), null, "hIMSAHitStandard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(equivalentInputNoiseEClass, EquivalentInputNoise.class, "EquivalentInputNoise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentInputNoise_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, EquivalentInputNoise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentInputNoise_Point(), this.getFrequencyMeasurementPoint(), null, "point", null, 1, 169, EquivalentInputNoise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquivalentInputNoise_EquivalentRootMeanSquare(), this.getEquivalentRootMeanSquareType(), "equivalentRootMeanSquare", null, 1, 1, EquivalentInputNoise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyMeasurementEClass, FrequencyMeasurement.class, "FrequencyMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrequencyMeasurement_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, FrequencyMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyMeasurement_Point(), this.getFrequencyMeasurementPoint(), null, "point", null, 1, 169, FrequencyMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyMeasurementPointEClass, FrequencyMeasurementPoint.class, "FrequencyMeasurementPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyMeasurementPoint_Frequency(), theXMLTypePackage.getInteger(), "frequency", null, 1, 1, FrequencyMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyMeasurementPoint_Input(), this.getInputType2(), "input", null, 1, 1, FrequencyMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyMeasurementPoint_Output(), this.getOutputType3(), "output", null, 1, 1, FrequencyMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fullTargetCurveEClass, FullTargetCurve.class, "FullTargetCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFullTargetCurve_ManufacturersCode(), theXMLTypePackage.getInteger(), "manufacturersCode", null, 1, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_DeviceTypeCode(), theXMLTypePackage.getInteger(), "deviceTypeCode", null, 1, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_FittingRule(), this.getFittingRule(), "fittingRule", null, 1, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_HearingInstrumentType(), this.getHearingInstrumentType(), "hearingInstrumentType", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_VentCanalDiameter(), this.getVentCanalDiameterType(), "ventCanalDiameter", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_VentCanalLength(), this.getVentCanalLengthType(), "ventCanalLength", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_ReserveGain(), this.getReserveGainType(), "reserveGain", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_CouplerType(), this.getCouplerType(), "couplerType", null, 1, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_SignalLevel(), this.getSignalLevelType1(), "signalLevel", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFullTargetCurve_Target(), this.getTargetPoint(), null, "target", null, 1, 24, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFullTargetCurve_RuleName(), this.getRuleNameType(), "ruleName", null, 0, 1, FullTargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(harmonicDistortionMeasurementCurveEClass, HarmonicDistortionMeasurementCurve.class, "HarmonicDistortionMeasurementCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHarmonicDistortionMeasurementCurve_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, HarmonicDistortionMeasurementCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHarmonicDistortionMeasurementCurve_Point(), this.getHarmonicDistortionPoint(), null, "point", null, 1, 161, HarmonicDistortionMeasurementCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(harmonicDistortionPointEClass, HarmonicDistortionPoint.class, "HarmonicDistortionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHarmonicDistortionPoint_Frequency(), theXMLTypePackage.getInteger(), "frequency", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHarmonicDistortionPoint_Input(), this.getInputType1(), "input", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHarmonicDistortionPoint_Fx1(), this.getFx1Type(), "fx1", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHarmonicDistortionPoint_Fx2(), this.getFx2Type(), "fx2", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHarmonicDistortionPoint_Fx3(), this.getFx3Type(), "fx3", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHarmonicDistortionPoint_ThirdHD(), this.getThirdHDType(), "thirdHD", null, 1, 1, HarmonicDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hearingInstrumentTestTypeEClass, HearingInstrumentTestType.class, "HearingInstrumentTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHearingInstrumentTestType_SaturationResponse(), this.getFrequencyMeasurement(), null, "saturationResponse", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_FullOnGain(), this.getFrequencyMeasurement(), null, "fullOnGain", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_FrequencyResponse(), this.getFrequencyMeasurement(), null, "frequencyResponse", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_BatteryMeasurement(), this.getBatteryCurrentMeasurement(), null, "batteryMeasurement", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_SecondThirdHarmonicDistortion(), this.getHarmonicDistortionMeasurementCurve(), null, "secondThirdHarmonicDistortion", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_IntermodulationDistortionMeasurement(), this.getIntermodulationDistortionMeasurement(), null, "intermodulationDistortionMeasurement", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_EquivalentInputNoiseMeasurement(), this.getEquivalentInputNoise(), null, "equivalentInputNoiseMeasurement", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_InputOutput(), this.getInputOutputMeasurement(), null, "inputOutput", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_AttackRecoverCurve(), this.getTargetMeasurement(), null, "attackRecoverCurve", null, 0, 4, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHearingInstrumentTestType_InductionCoil(), this.getFrequencyMeasurement(), null, "inductionCoil", null, 0, 2, HearingInstrumentTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(himsaHitStandardTypeEClass, HIMSAHitStandardType.class, "HIMSAHitStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHIMSAHitStandardType_HearingInstrumentTest(), this.getHearingInstrumentTestType(), null, "hearingInstrumentTest", null, 1, 1, HIMSAHitStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAHitStandardType_PrivateHIT(), theXMLTypePackage.getBase64Binary(), "privateHIT", null, 0, 1, HIMSAHitStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAHitStandardType_ConvertedFromDataStandard(), this.getConvertedFromDataStandardType(), "convertedFromDataStandard", null, 0, 1, HIMSAHitStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAHitStandardType_ValidatedByNOAH(), theXMLTypePackage.getBoolean(), "validatedByNOAH", null, 0, 1, HIMSAHitStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAHitStandardType_Version(), this.getVersionType(), "version", "500", 1, 1, HIMSAHitStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputOutputMeasurementEClass, InputOutputMeasurement.class, "InputOutputMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputOutputMeasurement_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, InputOutputMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputOutputMeasurement_Point(), this.getInputOutputPoint(), null, "point", null, 1, 61, InputOutputMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputOutputPointEClass, InputOutputPoint.class, "InputOutputPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputOutputPoint_Input(), this.getInputType(), "input", null, 1, 1, InputOutputPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputOutputPoint_Output(), this.getOutputType(), "output", null, 1, 1, InputOutputPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermodulationDistortionMeasurementEClass, IntermodulationDistortionMeasurement.class, "IntermodulationDistortionMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermodulationDistortionMeasurement_MeasurementCondition(), this.getMeasurementConditions(), null, "measurementCondition", null, 1, 1, IntermodulationDistortionMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermodulationDistortionMeasurement_Point(), this.getIntermodulationDistortionPoint(), null, "point", null, 1, 161, IntermodulationDistortionMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermodulationDistortionPointEClass, IntermodulationDistortionPoint.class, "IntermodulationDistortionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermodulationDistortionPoint_Freq1(), theXMLTypePackage.getInteger(), "freq1", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_Freq2(), theXMLTypePackage.getInteger(), "freq2", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_Input1(), this.getInput1Type(), "input1", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_Input2(), this.getInput2Type(), "input2", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_Output1(), this.getOutput1Type(), "output1", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_Output2(), this.getOutput2Type(), "output2", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_OutputDiff1(), this.getOutputDiff1Type(), "outputDiff1", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_OutputDiff2(), this.getOutputDiff2Type(), "outputDiff2", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermodulationDistortionPoint_TIDistortion(), this.getTIDistortionType(), "tIDistortion", null, 1, 1, IntermodulationDistortionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementConditionsEClass, MeasurementConditions.class, "MeasurementConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementConditions_ManufacturerCode(), theXMLTypePackage.getInteger(), "manufacturerCode", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_DevTypeCode(), theXMLTypePackage.getInteger(), "devTypeCode", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_SignalType(), this.getSignalType(), "signalType", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_SignalOutput(), this.getSignalOutputType(), "signalOutput", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_SignalLevel(), this.getSignalLevelType2(), "signalLevel", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_SignalFrequency(), theXMLTypePackage.getInteger(), "signalFrequency", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_BatteryType(), this.getBatteryType(), "batteryType", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_BatteryPillType(), this.getBatteryPillType(), "batteryPillType", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_BatteryVoltage(), this.getBatteryVoltageType1(), "batteryVoltage", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_BatteryImpedance(), this.getBatteryImpedanceType1(), "batteryImpedance", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_UseRealEarCoupler(), theXMLTypePackage.getBoolean(), "useRealEarCoupler", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_MeasurementMode(), this.getMeasurementMode(), "measurementMode", null, 0, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditions_MeasurementIdentification(), this.getMeasurementIdentification(), "measurementIdentification", null, 1, 1, MeasurementConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occlusionEffectsEClass, OcclusionEffects.class, "OcclusionEffects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOcclusionEffects_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, OcclusionEffects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOcclusionEffects_REUR(), this.getFrequencyMeasurementPoint(), null, "rEUR", null, 1, 169, OcclusionEffects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOcclusionEffects_REOR(), this.getFrequencyMeasurementPoint(), null, "rEOR", null, 1, 169, OcclusionEffects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realEarCouplerDifferenceEClass, RealEarCouplerDifference.class, "RealEarCouplerDifference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealEarCouplerDifference_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, RealEarCouplerDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealEarCouplerDifference_RECD(), this.getFrequencyMeasurementPoint(), null, "rECD", null, 1, 169, RealEarCouplerDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetCurveEClass, TargetCurve.class, "TargetCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetCurve_Curve(), this.getTargetMeasurementPoint(), null, "curve", null, 1, 1, TargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetCurve_Result(), theXMLTypePackage.getInteger(), "result", null, 1, 1, TargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetCurve_Resolution(), theXMLTypePackage.getInteger(), "resolution", null, 1, 1, TargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetCurve_PreDelay(), theXMLTypePackage.getInteger(), "preDelay", null, 1, 1, TargetCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetMeasurementEClass, TargetMeasurement.class, "TargetMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMeasurement_MeasurementConditions(), this.getMeasurementConditions(), null, "measurementConditions", null, 1, 1, TargetMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetMeasurement_LevelStep(), this.getLevelStepType(), "levelStep", null, 1, 1, TargetMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetMeasurement_AttackCurve(), this.getTargetCurve(), null, "attackCurve", null, 1, 1, TargetMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetMeasurement_ReleaseCurve(), this.getTargetCurve(), null, "releaseCurve", null, 1, 1, TargetMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetMeasurementPointEClass, TargetMeasurementPoint.class, "TargetMeasurementPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetMeasurementPoint_Output(), this.getOutputType2(), "output", null, 1, 256, TargetMeasurementPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPointEClass, TargetPoint.class, "TargetPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPoint_TargetFrequency(), theXMLTypePackage.getInteger(), "targetFrequency", null, 1, 1, TargetPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPoint_TargetGain(), this.getTargetGainType(), "targetGain", null, 1, 1, TargetPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(batteryPillTypeEEnum, BatteryPillType.class, "BatteryPillType");
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.UNDEFINED);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.NONE);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.BATTERY312);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.BATTERY13);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.BATTERY230);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.BATTERY675);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.USER1);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.USER2);
		addEEnumLiteral(batteryPillTypeEEnum, BatteryPillType.USER3);

		initEEnum(batteryTypeEEnum, BatteryType.class, "BatteryType");
		addEEnumLiteral(batteryTypeEEnum, BatteryType.UNDEFINED);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.NONE);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.MERCURY);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.ZINC_AIR);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.OTHER_TYPE);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.USER1);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.USER2);
		addEEnumLiteral(batteryTypeEEnum, BatteryType.USER3);

		initEEnum(couplerTypeEEnum, CouplerType.class, "CouplerType");
		addEEnumLiteral(couplerTypeEEnum, CouplerType.UNDEFINED);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.NONE);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.REAL_EAR);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.COUPLER711);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.COUPLER2CC);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.FREIBURGER_CONICAL_COUPLER);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.FREIBURGER_CONICAL_CHILDREN_COUPLER);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.USER1);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.USER2);
		addEEnumLiteral(couplerTypeEEnum, CouplerType.USER3);

		initEEnum(fittingRuleEEnum, FittingRule.class, "FittingRule");
		addEEnumLiteral(fittingRuleEEnum, FittingRule.UNDEFINED);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.POGO);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.POGOII);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.NAL);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.NAL_PROF);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.BERGER);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.HALF_GAIN);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.THIRD_GAIN);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.DSL);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.LIBBY);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.BYRNE);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.COX_MSU);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER1);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER2);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER3);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER4);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER5);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER6);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER7);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER8);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER9);
		addEEnumLiteral(fittingRuleEEnum, FittingRule.USER10);

		initEEnum(hearingInstrumentTypeEEnum, HearingInstrumentType.class, "HearingInstrumentType");
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.UNDEFINED);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.ITE);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.BTE);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.ITC);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.MITC);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.BODY);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.USER1);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.USER2);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.USER3);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.USER4);
		addEEnumLiteral(hearingInstrumentTypeEEnum, HearingInstrumentType.USER5);

		initEEnum(measurementIdentificationEEnum, MeasurementIdentification.class, "MeasurementIdentification");
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.UNDEFINED);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.AUDIOMETRY);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.TARGET_CURVE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.UNAIDED_RESPONSE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.OCCLUDED_RESPONSE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.INSERTION_RESPONSE_COMPENSATED);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.AIDED_RESPONSE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.INPUT_OUTPUT);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.HARMONIC_DISTORTION);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.OCCLUSION_EFFECT);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.REAL_EAR_TO_COUPLER_DIFFERENCE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.XSPL90);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.FULL_ON_GAIN);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.FREQUENCY_RESPONSE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.BATTERY_CURRENT);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.INTERMODULATION_DISTORTION);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.EQUIVALENT_INPUT_NOISE);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.ATTACK_RECOVERY);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.INDUCTION_COIL);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.USER1);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.USER2);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.USER3);
		addEEnumLiteral(measurementIdentificationEEnum, MeasurementIdentification.INSERTION_RESPONSE_UNCOMPENSATED);

		initEEnum(measurementModeEEnum, MeasurementMode.class, "MeasurementMode");
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.UNDEFINED);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.SWEEP);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.FAST_FOURIER_TRANSFORM);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.TIME_MEASUREMENT);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.BATTERY);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.USER1);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.USER2);
		addEEnumLiteral(measurementModeEEnum, MeasurementMode.USER3);

		initEEnum(signalOutputTypeEEnum, SignalOutputType.class, "SignalOutputType");
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.UNDEFINED);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.INTERNAL_BOX);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.EXTERNAL_BOX);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.FREE_FIELD);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.INTERNAL_BOX_COIL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.EXTERNAL_BOX_COIL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.FREE_FIELD_INDUCTION_COIL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.AIR_CONDUCTION);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER1);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER2);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER3);

		initEEnum(signalTypeEEnum, SignalType.class, "SignalType");
		addEEnumLiteral(signalTypeEEnum, SignalType.UNDEFINED);
		addEEnumLiteral(signalTypeEEnum, SignalType.TONE);
		addEEnumLiteral(signalTypeEEnum, SignalType.WARBLE);
		addEEnumLiteral(signalTypeEEnum, SignalType.NARR_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.TWO_TONE);
		addEEnumLiteral(signalTypeEEnum, SignalType.WHITE_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.PINK_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.SPEECH_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.PATIENT);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER1);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER2);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER3);

		// Initialize data types
		initEDataType(attackReleaseTimeTypeEDataType, BigDecimal.class, "AttackReleaseTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryImpedanceTypeEDataType, BigDecimal.class, "BatteryImpedanceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryImpedanceType1EDataType, BigDecimal.class, "BatteryImpedanceType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryPillTypeObjectEDataType, BatteryPillType.class, "BatteryPillTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryTypeObjectEDataType, BatteryType.class, "BatteryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryVoltageTypeEDataType, BigDecimal.class, "BatteryVoltageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(batteryVoltageType1EDataType, BigDecimal.class, "BatteryVoltageType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(convertedFromDataStandardTypeEDataType, BigInteger.class, "ConvertedFromDataStandardType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(couplerTypeObjectEDataType, CouplerType.class, "CouplerTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(currentTypeEDataType, BigDecimal.class, "CurrentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(equivalentRootMeanSquareTypeEDataType, BigDecimal.class, "EquivalentRootMeanSquareType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fittingRuleObjectEDataType, FittingRule.class, "FittingRuleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fx1TypeEDataType, BigDecimal.class, "Fx1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fx2TypeEDataType, BigDecimal.class, "Fx2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fx3TypeEDataType, BigDecimal.class, "Fx3Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hearingInstrumentTypeObjectEDataType, HearingInstrumentType.class, "HearingInstrumentTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(input1TypeEDataType, BigDecimal.class, "Input1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(input2TypeEDataType, BigDecimal.class, "Input2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputTypeEDataType, BigDecimal.class, "InputType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputType1EDataType, BigDecimal.class, "InputType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputType2EDataType, BigDecimal.class, "InputType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(levelStepTypeEDataType, BigDecimal.class, "LevelStepType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(measurementIdentificationObjectEDataType, MeasurementIdentification.class, "MeasurementIdentificationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(measurementModeObjectEDataType, MeasurementMode.class, "MeasurementModeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(output1TypeEDataType, BigDecimal.class, "Output1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(output2TypeEDataType, BigDecimal.class, "Output2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputDiff1TypeEDataType, BigDecimal.class, "OutputDiff1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputDiff2TypeEDataType, BigDecimal.class, "OutputDiff2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputTypeEDataType, BigDecimal.class, "OutputType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputType1EDataType, BigDecimal.class, "OutputType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputType2EDataType, BigDecimal.class, "OutputType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputType3EDataType, BigDecimal.class, "OutputType3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reserveGainTypeEDataType, BigDecimal.class, "ReserveGainType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ruleNameTypeEDataType, String.class, "RuleNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalLevelTypeEDataType, BigDecimal.class, "SignalLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalLevelType1EDataType, BigDecimal.class, "SignalLevelType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalLevelType2EDataType, BigDecimal.class, "SignalLevelType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalOutputTypeObjectEDataType, SignalOutputType.class, "SignalOutputTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalTypeObjectEDataType, SignalType.class, "SignalTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(targetGainTypeEDataType, BigDecimal.class, "TargetGainType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(thirdHDTypeEDataType, BigDecimal.class, "ThirdHDType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tiDistortionTypeEDataType, BigDecimal.class, "TIDistortionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ventCanalDiameterTypeEDataType, BigDecimal.class, "VentCanalDiameterType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ventCanalLengthTypeEDataType, BigDecimal.class, "VentCanalLengthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, BigInteger.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (attackReleaseMeasurementPointEClass,
		   source,
		   new String[] {
			   "name", "AttackReleaseMeasurementPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttackReleaseMeasurementPoint_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttackReleaseMeasurementPoint_AttackReleaseTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AttackReleaseTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (attackReleaseTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "AttackReleaseTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", ".000",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (batteryCurrentMeasurementEClass,
		   source,
		   new String[] {
			   "name", "BatteryCurrentMeasurement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBatteryCurrentMeasurement_BatteryConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryCurrentMeasurement_BatteryCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (batteryImpedanceTypeEDataType,
		   source,
		   new String[] {
			   "name", "BatteryImpedance_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (batteryImpedanceType1EDataType,
		   source,
		   new String[] {
			   "name", "BatteryImpedance_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (batteryMeasurementConditionsEClass,
		   source,
		   new String[] {
			   "name", "BatteryMeasurementConditions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_ManufacturerCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ManufacturerCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_DevTypeCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DevTypeCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_SignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_SignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_SignalLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_SignalFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_BatteryType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_BatteryPillType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryPillType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_BatteryVoltage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryVoltage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_BatteryImpedance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryImpedance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_UseRealEarCoupler(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UseRealEarCoupler",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_MeasurementMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementConditions_MeasurementIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (batteryMeasurementPointEClass,
		   source,
		   new String[] {
			   "name", "BatteryMeasurementPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBatteryMeasurementPoint_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryMeasurementPoint_Current(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Current",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (batteryPillTypeEEnum,
		   source,
		   new String[] {
			   "name", "BatteryPillType"
		   });
		addAnnotation
		  (batteryPillTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "BatteryPillType:Object",
			   "baseType", "BatteryPillType"
		   });
		addAnnotation
		  (batteryTypeEEnum,
		   source,
		   new String[] {
			   "name", "BatteryType"
		   });
		addAnnotation
		  (batteryTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "BatteryType:Object",
			   "baseType", "BatteryType"
		   });
		addAnnotation
		  (batteryVoltageTypeEDataType,
		   source,
		   new String[] {
			   "name", "BatteryVoltage_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (batteryVoltageType1EDataType,
		   source,
		   new String[] {
			   "name", "BatteryVoltage_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (convertedFromDataStandardTypeEDataType,
		   source,
		   new String[] {
			   "name", "ConvertedFromDataStandard_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minInclusive", "100"
		   });
		addAnnotation
		  (couplerTypeEEnum,
		   source,
		   new String[] {
			   "name", "CouplerType"
		   });
		addAnnotation
		  (couplerTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "CouplerType:Object",
			   "baseType", "CouplerType"
		   });
		addAnnotation
		  (currentTypeEDataType,
		   source,
		   new String[] {
			   "name", "Current_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_HIMSAHitStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAHitStandard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (equivalentInputNoiseEClass,
		   source,
		   new String[] {
			   "name", "EquivalentInputNoise",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEquivalentInputNoise_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEquivalentInputNoise_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEquivalentInputNoise_EquivalentRootMeanSquare(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EquivalentRootMeanSquare",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (equivalentRootMeanSquareTypeEDataType,
		   source,
		   new String[] {
			   "name", "EquivalentRootMeanSquare_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (fittingRuleEEnum,
		   source,
		   new String[] {
			   "name", "FittingRule"
		   });
		addAnnotation
		  (fittingRuleObjectEDataType,
		   source,
		   new String[] {
			   "name", "FittingRule:Object",
			   "baseType", "FittingRule"
		   });
		addAnnotation
		  (frequencyMeasurementEClass,
		   source,
		   new String[] {
			   "name", "FrequencyMeasurement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFrequencyMeasurement_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyMeasurement_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (frequencyMeasurementPointEClass,
		   source,
		   new String[] {
			   "name", "FrequencyMeasurementPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFrequencyMeasurementPoint_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyMeasurementPoint_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyMeasurementPoint_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fullTargetCurveEClass,
		   source,
		   new String[] {
			   "name", "FullTargetCurve",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFullTargetCurve_ManufacturersCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ManufacturersCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_DeviceTypeCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceTypeCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_FittingRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FittingRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_HearingInstrumentType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrumentType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_VentCanalDiameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VentCanalDiameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_VentCanalLength(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VentCanalLength",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_ReserveGain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReserveGain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_CouplerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CouplerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_SignalLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_Target(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Target",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFullTargetCurve_RuleName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RuleName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fx1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Fx1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (fx2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Fx2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (fx3TypeEDataType,
		   source,
		   new String[] {
			   "name", "Fx3_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (harmonicDistortionMeasurementCurveEClass,
		   source,
		   new String[] {
			   "name", "HarmonicDistortionMeasurementCurve",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHarmonicDistortionMeasurementCurve_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionMeasurementCurve_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (harmonicDistortionPointEClass,
		   source,
		   new String[] {
			   "name", "HarmonicDistortionPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_Fx1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fx1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_Fx2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fx2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_Fx3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fx3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHarmonicDistortionPoint_ThirdHD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ThirdHD",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hearingInstrumentTestTypeEClass,
		   source,
		   new String[] {
			   "name", "HearingInstrumentTest_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_SaturationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SaturationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_FullOnGain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FullOnGain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_FrequencyResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FrequencyResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_BatteryMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_SecondThirdHarmonicDistortion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SecondThirdHarmonicDistortion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_IntermodulationDistortionMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IntermodulationDistortionMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_EquivalentInputNoiseMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EquivalentInputNoiseMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_InputOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InputOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_AttackRecoverCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AttackRecoverCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHearingInstrumentTestType_InductionCoil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InductionCoil",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hearingInstrumentTypeEEnum,
		   source,
		   new String[] {
			   "name", "HearingInstrumentType"
		   });
		addAnnotation
		  (hearingInstrumentTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "HearingInstrumentType:Object",
			   "baseType", "HearingInstrumentType"
		   });
		addAnnotation
		  (himsaHitStandardTypeEClass,
		   source,
		   new String[] {
			   "name", "HIMSAHitStandard_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHIMSAHitStandardType_HearingInstrumentTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrumentTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAHitStandardType_PrivateHIT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PrivateHIT",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAHitStandardType_ConvertedFromDataStandard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConvertedFromDataStandard"
		   });
		addAnnotation
		  (getHIMSAHitStandardType_ValidatedByNOAH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValidatedByNOAH"
		   });
		addAnnotation
		  (getHIMSAHitStandardType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (input1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Input1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (input2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Input2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (inputOutputMeasurementEClass,
		   source,
		   new String[] {
			   "name", "InputOutputMeasurement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputOutputMeasurement_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInputOutputMeasurement_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputOutputPointEClass,
		   source,
		   new String[] {
			   "name", "InputOutputPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInputOutputPoint_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInputOutputPoint_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inputTypeEDataType,
		   source,
		   new String[] {
			   "name", "Input_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (inputType1EDataType,
		   source,
		   new String[] {
			   "name", "Input_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (inputType2EDataType,
		   source,
		   new String[] {
			   "name", "Input_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (intermodulationDistortionMeasurementEClass,
		   source,
		   new String[] {
			   "name", "IntermodulationDistortionMeasurement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIntermodulationDistortionMeasurement_MeasurementCondition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementCondition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionMeasurement_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (intermodulationDistortionPointEClass,
		   source,
		   new String[] {
			   "name", "IntermodulationDistortionPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Freq1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Freq1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Freq2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Freq2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Input1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Input2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Input2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Output1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_Output2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_OutputDiff1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OutputDiff1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_OutputDiff2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OutputDiff2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntermodulationDistortionPoint_TIDistortion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TIDistortion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (levelStepTypeEDataType,
		   source,
		   new String[] {
			   "name", "LevelStep_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (measurementConditionsEClass,
		   source,
		   new String[] {
			   "name", "MeasurementConditions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementConditions_ManufacturerCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ManufacturerCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_DevTypeCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DevTypeCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_SignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_SignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_SignalLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_SignalFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_BatteryType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_BatteryPillType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryPillType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_BatteryVoltage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryVoltage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_BatteryImpedance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryImpedance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_UseRealEarCoupler(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UseRealEarCoupler",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_MeasurementMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditions_MeasurementIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurementIdentificationEEnum,
		   source,
		   new String[] {
			   "name", "MeasurementIdentification"
		   });
		addAnnotation
		  (measurementIdentificationObjectEDataType,
		   source,
		   new String[] {
			   "name", "MeasurementIdentification:Object",
			   "baseType", "MeasurementIdentification"
		   });
		addAnnotation
		  (measurementModeEEnum,
		   source,
		   new String[] {
			   "name", "MeasurementMode"
		   });
		addAnnotation
		  (measurementModeObjectEDataType,
		   source,
		   new String[] {
			   "name", "MeasurementMode:Object",
			   "baseType", "MeasurementMode"
		   });
		addAnnotation
		  (occlusionEffectsEClass,
		   source,
		   new String[] {
			   "name", "OcclusionEffects",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOcclusionEffects_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOcclusionEffects_REUR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "REUR",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOcclusionEffects_REOR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "REOR",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (output1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Output1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (output2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Output2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (outputDiff1TypeEDataType,
		   source,
		   new String[] {
			   "name", "OutputDiff1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (outputDiff2TypeEDataType,
		   source,
		   new String[] {
			   "name", "OutputDiff2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (outputTypeEDataType,
		   source,
		   new String[] {
			   "name", "Output_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (outputType1EDataType,
		   source,
		   new String[] {
			   "name", "Output_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "totalDigits", "1"
		   });
		addAnnotation
		  (outputType2EDataType,
		   source,
		   new String[] {
			   "name", "Output_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (outputType3EDataType,
		   source,
		   new String[] {
			   "name", "Output_._3_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (realEarCouplerDifferenceEClass,
		   source,
		   new String[] {
			   "name", "RealEarCouplerDifference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealEarCouplerDifference_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRealEarCouplerDifference_RECD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RECD",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reserveGainTypeEDataType,
		   source,
		   new String[] {
			   "name", "ReserveGain_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (ruleNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "RuleName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "51"
		   });
		addAnnotation
		  (signalLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "SignalLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (signalLevelType1EDataType,
		   source,
		   new String[] {
			   "name", "SignalLevel_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (signalLevelType2EDataType,
		   source,
		   new String[] {
			   "name", "SignalLevel_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (signalOutputTypeEEnum,
		   source,
		   new String[] {
			   "name", "SignalOutputType"
		   });
		addAnnotation
		  (signalOutputTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SignalOutputType:Object",
			   "baseType", "SignalOutputType"
		   });
		addAnnotation
		  (signalTypeEEnum,
		   source,
		   new String[] {
			   "name", "SignalType"
		   });
		addAnnotation
		  (signalTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SignalType:Object",
			   "baseType", "SignalType"
		   });
		addAnnotation
		  (targetCurveEClass,
		   source,
		   new String[] {
			   "name", "TargetCurve",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTargetCurve_Curve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Curve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetCurve_Result(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Result",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetCurve_Resolution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Resolution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetCurve_PreDelay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PreDelay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (targetGainTypeEDataType,
		   source,
		   new String[] {
			   "name", "TargetGain_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (targetMeasurementEClass,
		   source,
		   new String[] {
			   "name", "TargetMeasurement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTargetMeasurement_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetMeasurement_LevelStep(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LevelStep",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetMeasurement_AttackCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AttackCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetMeasurement_ReleaseCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReleaseCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (targetMeasurementPointEClass,
		   source,
		   new String[] {
			   "name", "TargetMeasurementPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTargetMeasurementPoint_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (targetPointEClass,
		   source,
		   new String[] {
			   "name", "TargetPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTargetPoint_TargetFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TargetFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTargetPoint_TargetGain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TargetGain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (thirdHDTypeEDataType,
		   source,
		   new String[] {
			   "name", "ThirdHD_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (tiDistortionTypeEDataType,
		   source,
		   new String[] {
			   "name", "TIDistortion_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (ventCanalDiameterTypeEDataType,
		   source,
		   new String[] {
			   "name", "VentCanalDiameter_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (ventCanalLengthTypeEDataType,
		   source,
		   new String[] {
			   "name", "VentCanalLength_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (versionTypeEDataType,
		   source,
		   new String[] {
			   "name", "Version_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
	}

} //TestPackageImpl
