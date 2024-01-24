/**
 */
package admittance.impl;

import admittance.AcousticImmittanceAssessmentType;
import admittance.AdmittanceCurveType;
import admittance.AdmittanceFactory;
import admittance.AdmittanceMeasurementConditionType;
import admittance.AdmittancePackage;
import admittance.AdmittanceType;
import admittance.AdmittanceUnitCalculatedType;
import admittance.AdmittanceUnitMeasuredType;
import admittance.AdmittanceUnitType;
import admittance.AdmittanceValueCalculatedType;
import admittance.AdmittanceValueMeasuredType;
import admittance.AdmittanceValuePointCalculatedType;
import admittance.AdmittanceValuePointMeasuredType;
import admittance.AdmittanceValueType;
import admittance.CalculatedAdmittancePointsType;
import admittance.CalculatedType;
import admittance.CalculatedType1;
import admittance.DecayBasicResultType;
import admittance.DeltaYPointsType;
import admittance.DeltaYType;
import admittance.DocumentRoot;
import admittance.EarType;
import admittance.EustachianTubeFunctionIntactEarDrumTest;
import admittance.EustachianTubeFunctionPerforatedEarDrumTest;
import admittance.FrequencyOtherType;
import admittance.GradientType;
import admittance.InformationType;
import admittance.MeasuredAdmittancePointsType;
import admittance.MeasuredType;
import admittance.MeasuredType1;
import admittance.MeasurementNotesType;
import admittance.NumericDeltaType;
import admittance.NumericDeltaYPointsType;
import admittance.PressurePointType;
import admittance.ProbeFrequencyType;
import admittance.RecordingModeType;
import admittance.ReflexCurveType;
import admittance.ReflexTestResponseType;
import admittance.ReflexTestType;
import admittance.ReflexTestTypeType;
import admittance.ReflexValuePointCalculatedType;
import admittance.ReflexValuePointMeasuredType;
import admittance.ResultOfReflexTestType;
import admittance.SignalLevelType;
import admittance.SignalOutputType;
import admittance.SignalTypeType;
import admittance.StaticAdmittanceType;
import admittance.SupplementaryDataType;
import admittance.TympanogramMeasurementConditionsType;
import admittance.TympanogramResultType;
import admittance.TympanogramTestType;
import admittance.UnitType;

import admittance.util.AdmittanceValidator;

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

import test.TestPackage;

import test.impl.TestPackageImpl;

import tinnitus.TinnitusPackage;

import tinnitus.impl.TinnitusPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdmittancePackageImpl extends EPackageImpl implements AdmittancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acousticImmittanceAssessmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceMeasurementConditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceUnitCalculatedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceUnitMeasuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceValueCalculatedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceValueMeasuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceValuePointCalculatedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceValuePointMeasuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admittanceValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedAdmittancePointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaYPointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaYTypeEClass = null;

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
	private EClass eustachianTubeFunctionIntactEarDrumTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eustachianTubeFunctionPerforatedEarDrumTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredAdmittancePointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementNotesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDeltaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDeltaYPointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressurePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probeFrequencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexTestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexValuePointCalculatedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexValuePointMeasuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultOfReflexTestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticAdmittanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplementaryDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tympanogramMeasurementConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tympanogramTestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decayBasicResultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum earTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyOtherTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordingModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reflexTestResponseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reflexTestTypeTypeEEnum = null;

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
	private EEnum signalTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tympanogramResultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

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
	private EDataType decayBasicResultTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType earTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyOtherTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType recordingModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reflexTestResponseTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reflexTestTypeTypeObjectEDataType = null;

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
	private EDataType signalTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeBaseTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tympanogramResultTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tympanometerMakeModelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tympanometerSerialNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionType1EDataType = null;

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
	 * @see admittance.AdmittancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdmittancePackageImpl() {
		super(eNS_URI, AdmittanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdmittancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdmittancePackage init() {
		if (isInited) return (AdmittancePackage)EPackage.Registry.INSTANCE.getEPackage(AdmittancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdmittancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdmittancePackageImpl theAdmittancePackage = registeredAdmittancePackage instanceof AdmittancePackageImpl ? (AdmittancePackageImpl)registeredAdmittancePackage : new AdmittancePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Audiogram502Package.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);
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
		theAdmittancePackage.createPackageContents();
		theAudiogram502Package.createPackageContents();
		theAudiogramPackage.createPackageContents();
		theAudiogrammetadataPackage.createPackageContents();
		theCochlearPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theImpedancePackage.createPackageContents();
		theFittingPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theJournalPackage.createPackageContents();
		theNotificationPackage.createPackageContents();
		thePatientExportPackage.createPackageContents();
		theRealearPackage.createPackageContents();
		theRemotecontrolPackage.createPackageContents();
		theTinnitusPackage.createPackageContents();

		// Initialize created meta-data
		theAdmittancePackage.initializePackageContents();
		theAudiogram502Package.initializePackageContents();
		theAudiogramPackage.initializePackageContents();
		theAudiogrammetadataPackage.initializePackageContents();
		theCochlearPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theImpedancePackage.initializePackageContents();
		theFittingPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theJournalPackage.initializePackageContents();
		theNotificationPackage.initializePackageContents();
		thePatientExportPackage.initializePackageContents();
		theRealearPackage.initializePackageContents();
		theRemotecontrolPackage.initializePackageContents();
		theTinnitusPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAdmittancePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AdmittanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAdmittancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdmittancePackage.eNS_URI, theAdmittancePackage);
		return theAdmittancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcousticImmittanceAssessmentType() {
		return acousticImmittanceAssessmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_TympanogramTest() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_ReflexTest() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_SupplementaryData() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImmittanceAssessmentType_Notes() {
		return (EReference)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImmittanceAssessmentType_ConvertedFromDataStandard() {
		return (EAttribute)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImmittanceAssessmentType_ValidatedByNOAH() {
		return (EAttribute)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImmittanceAssessmentType_Version() {
		return (EAttribute)acousticImmittanceAssessmentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceCurveType() {
		return admittanceCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceCurveType_Calculated() {
		return (EReference)admittanceCurveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceCurveType_Measured() {
		return (EReference)admittanceCurveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceMeasurementConditionType() {
		return admittanceMeasurementConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceMeasurementConditionType_SignalLevel() {
		return (EReference)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_SignalType() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_SignalOutput() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_Frequency() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_Pressure() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_ProbeFrequency() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceMeasurementConditionType_TestType() {
		return (EAttribute)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceMeasurementConditionType_CanalVolume() {
		return (EReference)admittanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceType() {
		return admittanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceType_Calculated() {
		return (EReference)admittanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceType_Measured() {
		return (EReference)admittanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceUnitCalculatedType() {
		return admittanceUnitCalculatedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceUnitCalculatedType_YUnit() {
		return (EAttribute)admittanceUnitCalculatedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceUnitMeasuredType() {
		return admittanceUnitMeasuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceUnitMeasuredType_GUnit() {
		return (EAttribute)admittanceUnitMeasuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceUnitMeasuredType_BUnit() {
		return (EAttribute)admittanceUnitMeasuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceUnitType() {
		return admittanceUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceUnitType_AdmittanceUnitCalculated() {
		return (EReference)admittanceUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceUnitType_AdmittanceUnitMeasured() {
		return (EReference)admittanceUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceValueCalculatedType() {
		return admittanceValueCalculatedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValueCalculatedType_Y() {
		return (EAttribute)admittanceValueCalculatedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceValueMeasuredType() {
		return admittanceValueMeasuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValueMeasuredType_G() {
		return (EAttribute)admittanceValueMeasuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValueMeasuredType_B() {
		return (EAttribute)admittanceValueMeasuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceValuePointCalculatedType() {
		return admittanceValuePointCalculatedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValuePointCalculatedType_Pressure() {
		return (EAttribute)admittanceValuePointCalculatedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValuePointCalculatedType_Y() {
		return (EAttribute)admittanceValuePointCalculatedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceValuePointMeasuredType() {
		return admittanceValuePointMeasuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValuePointMeasuredType_Pressure() {
		return (EAttribute)admittanceValuePointMeasuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValuePointMeasuredType_G() {
		return (EAttribute)admittanceValuePointMeasuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmittanceValuePointMeasuredType_B() {
		return (EAttribute)admittanceValuePointMeasuredTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmittanceValueType() {
		return admittanceValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceValueType_ValueCalculated() {
		return (EReference)admittanceValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmittanceValueType_Measured() {
		return (EReference)admittanceValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculatedAdmittancePointsType() {
		return calculatedAdmittancePointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculatedAdmittancePointsType_Pt() {
		return (EReference)calculatedAdmittancePointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculatedType() {
		return calculatedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculatedType_AdmittanceValueCalculated() {
		return (EReference)calculatedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculatedType_CalculatedAdmittanceUnit() {
		return (EReference)calculatedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculatedType1() {
		return calculatedType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculatedType1_CalculatedAdmittancePoints() {
		return (EReference)calculatedType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculatedType1_CalculatedAdmittanceUnit() {
		return (EReference)calculatedType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeltaYPointsType() {
		return deltaYPointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeltaYPointsType_Pt() {
		return (EReference)deltaYPointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeltaYType() {
		return deltaYTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeltaYType_DeltaYPoints() {
		return (EReference)deltaYTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeltaYType_G0() {
		return (EAttribute)deltaYTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeltaYType_B0() {
		return (EAttribute)deltaYTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeltaYType_MeasuredAdmittanceUnit() {
		return (EReference)deltaYTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_AcousticImmittanceAssessment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEustachianTubeFunctionIntactEarDrumTest() {
		return eustachianTubeFunctionIntactEarDrumTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve() {
		return (EReference)eustachianTubeFunctionIntactEarDrumTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEustachianTubeFunctionIntactEarDrumTest_Pressure() {
		return (EAttribute)eustachianTubeFunctionIntactEarDrumTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEustachianTubeFunctionIntactEarDrumTest_CanalVolume() {
		return (EReference)eustachianTubeFunctionIntactEarDrumTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition() {
		return (EReference)eustachianTubeFunctionIntactEarDrumTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEustachianTubeFunctionPerforatedEarDrumTest() {
		return eustachianTubeFunctionPerforatedEarDrumTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint() {
		return (EReference)eustachianTubeFunctionPerforatedEarDrumTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint() {
		return (EAttribute)eustachianTubeFunctionPerforatedEarDrumTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint() {
		return (EAttribute)eustachianTubeFunctionPerforatedEarDrumTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase() {
		return (EAttribute)eustachianTubeFunctionPerforatedEarDrumTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGradientType() {
		return gradientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGradientType_GradientValue() {
		return (EReference)gradientTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGradientType_GradientUnit() {
		return (EReference)gradientTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationType() {
		return informationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationType_Comments() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationType_Version() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasuredAdmittancePointsType() {
		return measuredAdmittancePointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredAdmittancePointsType_Pt() {
		return (EReference)measuredAdmittancePointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasuredType() {
		return measuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredType_AdmittancePointMeasured() {
		return (EReference)measuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredType_AdmittanceUnitMeasured() {
		return (EReference)measuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasuredType1() {
		return measuredType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredType1_MeasuredAdmittancePoints() {
		return (EReference)measuredType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredType1_MeasuredAdmittanceUnit() {
		return (EReference)measuredType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementNotesType() {
		return measurementNotesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_TympanometerMakeModel() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_TympanometerSerialNumber() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_TympanometerLastCalibration() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_IsDeaf() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericDeltaType() {
		return numericDeltaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericDeltaType_NumericDeltaYPoints() {
		return (EReference)numericDeltaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericDeltaType_CalculatedAdmittanceUnit() {
		return (EReference)numericDeltaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericDeltaYPointsType() {
		return numericDeltaYPointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericDeltaYPointsType_Pt() {
		return (EReference)numericDeltaYPointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPressurePointType() {
		return pressurePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPressurePointType_Time() {
		return (EAttribute)pressurePointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPressurePointType_Pressure() {
		return (EAttribute)pressurePointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbeFrequencyType() {
		return probeFrequencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProbeFrequencyType_Frequency() {
		return (EAttribute)probeFrequencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProbeFrequencyType_Other() {
		return (EAttribute)probeFrequencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexCurveType() {
		return reflexCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexCurveType_NumericDelta() {
		return (EReference)reflexCurveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexCurveType_DeltaY() {
		return (EReference)reflexCurveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexTestType() {
		return reflexTestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexTestType_ReflexCurve() {
		return (EReference)reflexTestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexTestType_ResultOfReflexTest() {
		return (EReference)reflexTestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexTestType_AdmittanceMeasurementCondition() {
		return (EReference)reflexTestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexValuePointCalculatedType() {
		return reflexValuePointCalculatedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexValuePointCalculatedType_Time() {
		return (EAttribute)reflexValuePointCalculatedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexValuePointCalculatedType_NumericDeltaY() {
		return (EAttribute)reflexValuePointCalculatedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexValuePointMeasuredType() {
		return reflexValuePointMeasuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexValuePointMeasuredType_Time() {
		return (EAttribute)reflexValuePointMeasuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexValuePointMeasuredType_DeltaG() {
		return (EAttribute)reflexValuePointMeasuredTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexValuePointMeasuredType_DeltaB() {
		return (EAttribute)reflexValuePointMeasuredTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultOfReflexTestType() {
		return resultOfReflexTestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultOfReflexTestType_ReflexDetected() {
		return (EAttribute)resultOfReflexTestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultOfReflexTestType_DecayBasicResult() {
		return (EAttribute)resultOfReflexTestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultOfReflexTestType_DecayPercent() {
		return (EAttribute)resultOfReflexTestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultOfReflexTestType_LatencyTime() {
		return (EAttribute)resultOfReflexTestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalLevelType() {
		return signalLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalLevelType_StimulusLevel() {
		return (EAttribute)signalLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalLevelType_Response() {
		return (EAttribute)signalLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticAdmittanceType() {
		return staticAdmittanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticAdmittanceType_StaticAdmittanceValue() {
		return (EReference)staticAdmittanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticAdmittanceType_StaticAdmittanceUnit() {
		return (EReference)staticAdmittanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplementaryDataType() {
		return supplementaryDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupplementaryDataType_Information() {
		return (EReference)supplementaryDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplementaryDataType_Any() {
		return (EAttribute)supplementaryDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTympanogramMeasurementConditionsType() {
		return tympanogramMeasurementConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTympanogramMeasurementConditionsType_SweepSpeed() {
		return (EAttribute)tympanogramMeasurementConditionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTympanogramMeasurementConditionsType_RecordMode() {
		return (EAttribute)tympanogramMeasurementConditionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramMeasurementConditionsType_ProbeFrequency() {
		return (EReference)tympanogramMeasurementConditionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTympanogramTestType() {
		return tympanogramTestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_AdmittanceCurve() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_MaximumAdmittance() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_CanalVolume() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_Gradient() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTympanogramTestType_Pressure() {
		return (EAttribute)tympanogramTestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTympanogramTestType_ResonanceFrequency() {
		return (EAttribute)tympanogramTestTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTympanogramTestType_Result() {
		return (EAttribute)tympanogramTestTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_MeasurementCondition() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_StaticAdmittance() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecayBasicResultType() {
		return decayBasicResultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEarType() {
		return earTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrequencyOtherType() {
		return frequencyOtherTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRecordingModeType() {
		return recordingModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReflexTestResponseType() {
		return reflexTestResponseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReflexTestTypeType() {
		return reflexTestTypeTypeEEnum;
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
	public EEnum getSignalTypeType() {
		return signalTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTympanogramResultType() {
		return tympanogramResultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitType() {
		return unitTypeEEnum;
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
	public EDataType getDecayBasicResultTypeObject() {
		return decayBasicResultTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEarTypeObject() {
		return earTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFrequencyOtherTypeObject() {
		return frequencyOtherTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRecordingModeTypeObject() {
		return recordingModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReflexTestResponseTypeObject() {
		return reflexTestResponseTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReflexTestTypeTypeObject() {
		return reflexTestTypeTypeObjectEDataType;
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
	public EDataType getSignalTypeTypeObject() {
		return signalTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType() {
		return stimulusLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeBaseType() {
		return timeBaseTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeType() {
		return timeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeType1() {
		return timeType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeType2() {
		return timeType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTympanogramResultTypeObject() {
		return tympanogramResultTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTympanometerMakeModelType() {
		return tympanometerMakeModelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTympanometerSerialNumberType() {
		return tympanometerSerialNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitTypeObject() {
		return unitTypeObjectEDataType;
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
	public EDataType getVersionType1() {
		return versionType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceFactory getAdmittanceFactory() {
		return (AdmittanceFactory)getEFactoryInstance();
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
		acousticImmittanceAssessmentTypeEClass = createEClass(ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA);
		createEReference(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES);
		createEAttribute(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD);
		createEAttribute(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH);
		createEAttribute(acousticImmittanceAssessmentTypeEClass, ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION);

		admittanceCurveTypeEClass = createEClass(ADMITTANCE_CURVE_TYPE);
		createEReference(admittanceCurveTypeEClass, ADMITTANCE_CURVE_TYPE__CALCULATED);
		createEReference(admittanceCurveTypeEClass, ADMITTANCE_CURVE_TYPE__MEASURED);

		admittanceMeasurementConditionTypeEClass = createEClass(ADMITTANCE_MEASUREMENT_CONDITION_TYPE);
		createEReference(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY);
		createEAttribute(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE);
		createEReference(admittanceMeasurementConditionTypeEClass, ADMITTANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME);

		admittanceTypeEClass = createEClass(ADMITTANCE_TYPE);
		createEReference(admittanceTypeEClass, ADMITTANCE_TYPE__CALCULATED);
		createEReference(admittanceTypeEClass, ADMITTANCE_TYPE__MEASURED);

		admittanceUnitCalculatedTypeEClass = createEClass(ADMITTANCE_UNIT_CALCULATED_TYPE);
		createEAttribute(admittanceUnitCalculatedTypeEClass, ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT);

		admittanceUnitMeasuredTypeEClass = createEClass(ADMITTANCE_UNIT_MEASURED_TYPE);
		createEAttribute(admittanceUnitMeasuredTypeEClass, ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT);
		createEAttribute(admittanceUnitMeasuredTypeEClass, ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT);

		admittanceUnitTypeEClass = createEClass(ADMITTANCE_UNIT_TYPE);
		createEReference(admittanceUnitTypeEClass, ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED);
		createEReference(admittanceUnitTypeEClass, ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED);

		admittanceValueCalculatedTypeEClass = createEClass(ADMITTANCE_VALUE_CALCULATED_TYPE);
		createEAttribute(admittanceValueCalculatedTypeEClass, ADMITTANCE_VALUE_CALCULATED_TYPE__Y);

		admittanceValueMeasuredTypeEClass = createEClass(ADMITTANCE_VALUE_MEASURED_TYPE);
		createEAttribute(admittanceValueMeasuredTypeEClass, ADMITTANCE_VALUE_MEASURED_TYPE__G);
		createEAttribute(admittanceValueMeasuredTypeEClass, ADMITTANCE_VALUE_MEASURED_TYPE__B);

		admittanceValuePointCalculatedTypeEClass = createEClass(ADMITTANCE_VALUE_POINT_CALCULATED_TYPE);
		createEAttribute(admittanceValuePointCalculatedTypeEClass, ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__PRESSURE);
		createEAttribute(admittanceValuePointCalculatedTypeEClass, ADMITTANCE_VALUE_POINT_CALCULATED_TYPE__Y);

		admittanceValuePointMeasuredTypeEClass = createEClass(ADMITTANCE_VALUE_POINT_MEASURED_TYPE);
		createEAttribute(admittanceValuePointMeasuredTypeEClass, ADMITTANCE_VALUE_POINT_MEASURED_TYPE__PRESSURE);
		createEAttribute(admittanceValuePointMeasuredTypeEClass, ADMITTANCE_VALUE_POINT_MEASURED_TYPE__G);
		createEAttribute(admittanceValuePointMeasuredTypeEClass, ADMITTANCE_VALUE_POINT_MEASURED_TYPE__B);

		admittanceValueTypeEClass = createEClass(ADMITTANCE_VALUE_TYPE);
		createEReference(admittanceValueTypeEClass, ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED);
		createEReference(admittanceValueTypeEClass, ADMITTANCE_VALUE_TYPE__MEASURED);

		calculatedAdmittancePointsTypeEClass = createEClass(CALCULATED_ADMITTANCE_POINTS_TYPE);
		createEReference(calculatedAdmittancePointsTypeEClass, CALCULATED_ADMITTANCE_POINTS_TYPE__PT);

		calculatedTypeEClass = createEClass(CALCULATED_TYPE);
		createEReference(calculatedTypeEClass, CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED);
		createEReference(calculatedTypeEClass, CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT);

		calculatedType1EClass = createEClass(CALCULATED_TYPE1);
		createEReference(calculatedType1EClass, CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS);
		createEReference(calculatedType1EClass, CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT);

		deltaYPointsTypeEClass = createEClass(DELTA_YPOINTS_TYPE);
		createEReference(deltaYPointsTypeEClass, DELTA_YPOINTS_TYPE__PT);

		deltaYTypeEClass = createEClass(DELTA_YTYPE);
		createEReference(deltaYTypeEClass, DELTA_YTYPE__DELTA_YPOINTS);
		createEAttribute(deltaYTypeEClass, DELTA_YTYPE__G0);
		createEAttribute(deltaYTypeEClass, DELTA_YTYPE__B0);
		createEReference(deltaYTypeEClass, DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACOUSTIC_IMMITTANCE_ASSESSMENT);

		eustachianTubeFunctionIntactEarDrumTestEClass = createEClass(EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST);
		createEReference(eustachianTubeFunctionIntactEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE);
		createEAttribute(eustachianTubeFunctionIntactEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE);
		createEReference(eustachianTubeFunctionIntactEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME);
		createEReference(eustachianTubeFunctionIntactEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION);

		eustachianTubeFunctionPerforatedEarDrumTestEClass = createEClass(EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST);
		createEReference(eustachianTubeFunctionPerforatedEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT);
		createEAttribute(eustachianTubeFunctionPerforatedEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT);
		createEAttribute(eustachianTubeFunctionPerforatedEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT);
		createEAttribute(eustachianTubeFunctionPerforatedEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE);

		gradientTypeEClass = createEClass(GRADIENT_TYPE);
		createEReference(gradientTypeEClass, GRADIENT_TYPE__GRADIENT_VALUE);
		createEReference(gradientTypeEClass, GRADIENT_TYPE__GRADIENT_UNIT);

		informationTypeEClass = createEClass(INFORMATION_TYPE);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__COMMENTS);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__VERSION);

		measuredAdmittancePointsTypeEClass = createEClass(MEASURED_ADMITTANCE_POINTS_TYPE);
		createEReference(measuredAdmittancePointsTypeEClass, MEASURED_ADMITTANCE_POINTS_TYPE__PT);

		measuredTypeEClass = createEClass(MEASURED_TYPE);
		createEReference(measuredTypeEClass, MEASURED_TYPE__ADMITTANCE_POINT_MEASURED);
		createEReference(measuredTypeEClass, MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED);

		measuredType1EClass = createEClass(MEASURED_TYPE1);
		createEReference(measuredType1EClass, MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS);
		createEReference(measuredType1EClass, MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT);

		measurementNotesTypeEClass = createEClass(MEASUREMENT_NOTES_TYPE);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__IS_DEAF);

		numericDeltaTypeEClass = createEClass(NUMERIC_DELTA_TYPE);
		createEReference(numericDeltaTypeEClass, NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS);
		createEReference(numericDeltaTypeEClass, NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT);

		numericDeltaYPointsTypeEClass = createEClass(NUMERIC_DELTA_YPOINTS_TYPE);
		createEReference(numericDeltaYPointsTypeEClass, NUMERIC_DELTA_YPOINTS_TYPE__PT);

		pressurePointTypeEClass = createEClass(PRESSURE_POINT_TYPE);
		createEAttribute(pressurePointTypeEClass, PRESSURE_POINT_TYPE__TIME);
		createEAttribute(pressurePointTypeEClass, PRESSURE_POINT_TYPE__PRESSURE);

		probeFrequencyTypeEClass = createEClass(PROBE_FREQUENCY_TYPE);
		createEAttribute(probeFrequencyTypeEClass, PROBE_FREQUENCY_TYPE__FREQUENCY);
		createEAttribute(probeFrequencyTypeEClass, PROBE_FREQUENCY_TYPE__OTHER);

		reflexCurveTypeEClass = createEClass(REFLEX_CURVE_TYPE);
		createEReference(reflexCurveTypeEClass, REFLEX_CURVE_TYPE__NUMERIC_DELTA);
		createEReference(reflexCurveTypeEClass, REFLEX_CURVE_TYPE__DELTA_Y);

		reflexTestTypeEClass = createEClass(REFLEX_TEST_TYPE);
		createEReference(reflexTestTypeEClass, REFLEX_TEST_TYPE__REFLEX_CURVE);
		createEReference(reflexTestTypeEClass, REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST);
		createEReference(reflexTestTypeEClass, REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION);

		reflexValuePointCalculatedTypeEClass = createEClass(REFLEX_VALUE_POINT_CALCULATED_TYPE);
		createEAttribute(reflexValuePointCalculatedTypeEClass, REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME);
		createEAttribute(reflexValuePointCalculatedTypeEClass, REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y);

		reflexValuePointMeasuredTypeEClass = createEClass(REFLEX_VALUE_POINT_MEASURED_TYPE);
		createEAttribute(reflexValuePointMeasuredTypeEClass, REFLEX_VALUE_POINT_MEASURED_TYPE__TIME);
		createEAttribute(reflexValuePointMeasuredTypeEClass, REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G);
		createEAttribute(reflexValuePointMeasuredTypeEClass, REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B);

		resultOfReflexTestTypeEClass = createEClass(RESULT_OF_REFLEX_TEST_TYPE);
		createEAttribute(resultOfReflexTestTypeEClass, RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED);
		createEAttribute(resultOfReflexTestTypeEClass, RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT);
		createEAttribute(resultOfReflexTestTypeEClass, RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT);
		createEAttribute(resultOfReflexTestTypeEClass, RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME);

		signalLevelTypeEClass = createEClass(SIGNAL_LEVEL_TYPE);
		createEAttribute(signalLevelTypeEClass, SIGNAL_LEVEL_TYPE__STIMULUS_LEVEL);
		createEAttribute(signalLevelTypeEClass, SIGNAL_LEVEL_TYPE__RESPONSE);

		staticAdmittanceTypeEClass = createEClass(STATIC_ADMITTANCE_TYPE);
		createEReference(staticAdmittanceTypeEClass, STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE);
		createEReference(staticAdmittanceTypeEClass, STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT);

		supplementaryDataTypeEClass = createEClass(SUPPLEMENTARY_DATA_TYPE);
		createEReference(supplementaryDataTypeEClass, SUPPLEMENTARY_DATA_TYPE__INFORMATION);
		createEAttribute(supplementaryDataTypeEClass, SUPPLEMENTARY_DATA_TYPE__ANY);

		tympanogramMeasurementConditionsTypeEClass = createEClass(TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE);
		createEAttribute(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED);
		createEAttribute(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE);
		createEReference(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY);

		tympanogramTestTypeEClass = createEClass(TYMPANOGRAM_TEST_TYPE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__GRADIENT);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__PRESSURE);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__RESULT);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE);

		// Create enums
		decayBasicResultTypeEEnum = createEEnum(DECAY_BASIC_RESULT_TYPE);
		earTypeEEnum = createEEnum(EAR_TYPE);
		frequencyOtherTypeEEnum = createEEnum(FREQUENCY_OTHER_TYPE);
		recordingModeTypeEEnum = createEEnum(RECORDING_MODE_TYPE);
		reflexTestResponseTypeEEnum = createEEnum(REFLEX_TEST_RESPONSE_TYPE);
		reflexTestTypeTypeEEnum = createEEnum(REFLEX_TEST_TYPE_TYPE);
		signalOutputTypeEEnum = createEEnum(SIGNAL_OUTPUT_TYPE);
		signalTypeTypeEEnum = createEEnum(SIGNAL_TYPE_TYPE);
		tympanogramResultTypeEEnum = createEEnum(TYMPANOGRAM_RESULT_TYPE);
		unitTypeEEnum = createEEnum(UNIT_TYPE);

		// Create data types
		convertedFromDataStandardTypeEDataType = createEDataType(CONVERTED_FROM_DATA_STANDARD_TYPE);
		decayBasicResultTypeObjectEDataType = createEDataType(DECAY_BASIC_RESULT_TYPE_OBJECT);
		earTypeObjectEDataType = createEDataType(EAR_TYPE_OBJECT);
		frequencyOtherTypeObjectEDataType = createEDataType(FREQUENCY_OTHER_TYPE_OBJECT);
		recordingModeTypeObjectEDataType = createEDataType(RECORDING_MODE_TYPE_OBJECT);
		reflexTestResponseTypeObjectEDataType = createEDataType(REFLEX_TEST_RESPONSE_TYPE_OBJECT);
		reflexTestTypeTypeObjectEDataType = createEDataType(REFLEX_TEST_TYPE_TYPE_OBJECT);
		signalOutputTypeObjectEDataType = createEDataType(SIGNAL_OUTPUT_TYPE_OBJECT);
		signalTypeTypeObjectEDataType = createEDataType(SIGNAL_TYPE_TYPE_OBJECT);
		stimulusLevelTypeEDataType = createEDataType(STIMULUS_LEVEL_TYPE);
		timeBaseTypeEDataType = createEDataType(TIME_BASE_TYPE);
		timeTypeEDataType = createEDataType(TIME_TYPE);
		timeType1EDataType = createEDataType(TIME_TYPE1);
		timeType2EDataType = createEDataType(TIME_TYPE2);
		tympanogramResultTypeObjectEDataType = createEDataType(TYMPANOGRAM_RESULT_TYPE_OBJECT);
		tympanometerMakeModelTypeEDataType = createEDataType(TYMPANOMETER_MAKE_MODEL_TYPE);
		tympanometerSerialNumberTypeEDataType = createEDataType(TYMPANOMETER_SERIAL_NUMBER_TYPE);
		unitTypeObjectEDataType = createEDataType(UNIT_TYPE_OBJECT);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
		versionType1EDataType = createEDataType(VERSION_TYPE1);
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
		initEClass(acousticImmittanceAssessmentTypeEClass, AcousticImmittanceAssessmentType.class, "AcousticImmittanceAssessmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcousticImmittanceAssessmentType_TympanogramTest(), this.getTympanogramTestType(), null, "tympanogramTest", null, 0, -1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImmittanceAssessmentType_ReflexTest(), this.getReflexTestType(), null, "reflexTest", null, 0, -1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest(), this.getEustachianTubeFunctionIntactEarDrumTest(), null, "eustachianTubeFunctionIntactEarDrumTest", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest(), this.getEustachianTubeFunctionPerforatedEarDrumTest(), null, "eustachianTubeFunctionPerforatedEarDrumTest", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImmittanceAssessmentType_SupplementaryData(), this.getSupplementaryDataType(), null, "supplementaryData", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImmittanceAssessmentType_Notes(), this.getMeasurementNotesType(), null, "notes", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImmittanceAssessmentType_ConvertedFromDataStandard(), this.getConvertedFromDataStandardType(), "convertedFromDataStandard", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImmittanceAssessmentType_ValidatedByNOAH(), theXMLTypePackage.getBoolean(), "validatedByNOAH", null, 0, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImmittanceAssessmentType_Version(), this.getVersionType(), "version", "501", 1, 1, AcousticImmittanceAssessmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceCurveTypeEClass, AdmittanceCurveType.class, "AdmittanceCurveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmittanceCurveType_Calculated(), this.getCalculatedType1(), null, "calculated", null, 0, 1, AdmittanceCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmittanceCurveType_Measured(), this.getMeasuredType1(), null, "measured", null, 0, 1, AdmittanceCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceMeasurementConditionTypeEClass, AdmittanceMeasurementConditionType.class, "AdmittanceMeasurementConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmittanceMeasurementConditionType_SignalLevel(), this.getSignalLevelType(), null, "signalLevel", null, 0, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_SignalType(), this.getSignalTypeType(), "signalType", null, 1, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_SignalOutput(), this.getSignalOutputType(), "signalOutput", null, 1, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_Frequency(), theXMLTypePackage.getInteger(), "frequency", null, 0, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 0, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_ProbeFrequency(), theXMLTypePackage.getInteger(), "probeFrequency", null, 1, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceMeasurementConditionType_TestType(), this.getReflexTestTypeType(), "testType", null, 1, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmittanceMeasurementConditionType_CanalVolume(), this.getAdmittanceType(), null, "canalVolume", null, 0, 1, AdmittanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceTypeEClass, AdmittanceType.class, "AdmittanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmittanceType_Calculated(), this.getCalculatedType(), null, "calculated", null, 0, 1, AdmittanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmittanceType_Measured(), this.getMeasuredType(), null, "measured", null, 0, 1, AdmittanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceUnitCalculatedTypeEClass, AdmittanceUnitCalculatedType.class, "AdmittanceUnitCalculatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceUnitCalculatedType_YUnit(), this.getUnitType(), "yUnit", null, 1, 1, AdmittanceUnitCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceUnitMeasuredTypeEClass, AdmittanceUnitMeasuredType.class, "AdmittanceUnitMeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceUnitMeasuredType_GUnit(), this.getUnitType(), "gUnit", null, 1, 1, AdmittanceUnitMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceUnitMeasuredType_BUnit(), this.getUnitType(), "bUnit", null, 1, 1, AdmittanceUnitMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceUnitTypeEClass, AdmittanceUnitType.class, "AdmittanceUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmittanceUnitType_AdmittanceUnitCalculated(), this.getAdmittanceUnitCalculatedType(), null, "admittanceUnitCalculated", null, 0, 1, AdmittanceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmittanceUnitType_AdmittanceUnitMeasured(), this.getAdmittanceUnitMeasuredType(), null, "admittanceUnitMeasured", null, 0, 1, AdmittanceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceValueCalculatedTypeEClass, AdmittanceValueCalculatedType.class, "AdmittanceValueCalculatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceValueCalculatedType_Y(), theXMLTypePackage.getDecimal(), "y", null, 1, 1, AdmittanceValueCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceValueMeasuredTypeEClass, AdmittanceValueMeasuredType.class, "AdmittanceValueMeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceValueMeasuredType_G(), theXMLTypePackage.getDecimal(), "g", null, 1, 1, AdmittanceValueMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceValueMeasuredType_B(), theXMLTypePackage.getDecimal(), "b", null, 1, 1, AdmittanceValueMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceValuePointCalculatedTypeEClass, AdmittanceValuePointCalculatedType.class, "AdmittanceValuePointCalculatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceValuePointCalculatedType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, AdmittanceValuePointCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceValuePointCalculatedType_Y(), theXMLTypePackage.getDecimal(), "y", null, 1, 1, AdmittanceValuePointCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceValuePointMeasuredTypeEClass, AdmittanceValuePointMeasuredType.class, "AdmittanceValuePointMeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmittanceValuePointMeasuredType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, AdmittanceValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceValuePointMeasuredType_G(), theXMLTypePackage.getDecimal(), "g", null, 1, 1, AdmittanceValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdmittanceValuePointMeasuredType_B(), theXMLTypePackage.getDecimal(), "b", null, 1, 1, AdmittanceValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admittanceValueTypeEClass, AdmittanceValueType.class, "AdmittanceValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmittanceValueType_ValueCalculated(), this.getAdmittanceValueCalculatedType(), null, "valueCalculated", null, 0, 1, AdmittanceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmittanceValueType_Measured(), this.getAdmittanceValueMeasuredType(), null, "measured", null, 0, 1, AdmittanceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculatedAdmittancePointsTypeEClass, CalculatedAdmittancePointsType.class, "CalculatedAdmittancePointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculatedAdmittancePointsType_Pt(), this.getAdmittanceValuePointCalculatedType(), null, "pt", null, 1, -1, CalculatedAdmittancePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculatedTypeEClass, CalculatedType.class, "CalculatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculatedType_AdmittanceValueCalculated(), this.getAdmittanceValueCalculatedType(), null, "admittanceValueCalculated", null, 1, 1, CalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalculatedType_CalculatedAdmittanceUnit(), this.getAdmittanceUnitCalculatedType(), null, "calculatedAdmittanceUnit", null, 1, 1, CalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculatedType1EClass, CalculatedType1.class, "CalculatedType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculatedType1_CalculatedAdmittancePoints(), this.getCalculatedAdmittancePointsType(), null, "calculatedAdmittancePoints", null, 1, 1, CalculatedType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalculatedType1_CalculatedAdmittanceUnit(), this.getAdmittanceUnitCalculatedType(), null, "calculatedAdmittanceUnit", null, 1, 1, CalculatedType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deltaYPointsTypeEClass, DeltaYPointsType.class, "DeltaYPointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeltaYPointsType_Pt(), this.getReflexValuePointMeasuredType(), null, "pt", null, 1, -1, DeltaYPointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deltaYTypeEClass, DeltaYType.class, "DeltaYType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeltaYType_DeltaYPoints(), this.getDeltaYPointsType(), null, "deltaYPoints", null, 1, 1, DeltaYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeltaYType_G0(), theXMLTypePackage.getDecimal(), "g0", null, 1, 1, DeltaYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeltaYType_B0(), theXMLTypePackage.getDecimal(), "b0", null, 1, 1, DeltaYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeltaYType_MeasuredAdmittanceUnit(), this.getAdmittanceUnitMeasuredType(), null, "measuredAdmittanceUnit", null, 1, 1, DeltaYType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AcousticImmittanceAssessment(), this.getAcousticImmittanceAssessmentType(), null, "acousticImmittanceAssessment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eustachianTubeFunctionIntactEarDrumTestEClass, EustachianTubeFunctionIntactEarDrumTest.class, "EustachianTubeFunctionIntactEarDrumTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve(), this.getAdmittanceCurveType(), null, "admittanceCurve", null, 1, -1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionIntactEarDrumTest_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, -1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_CanalVolume(), this.getAdmittanceType(), null, "canalVolume", null, 1, 1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition(), this.getTympanogramMeasurementConditionsType(), null, "measurementCondition", null, 1, 1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eustachianTubeFunctionPerforatedEarDrumTestEClass, EustachianTubeFunctionPerforatedEarDrumTest.class, "EustachianTubeFunctionPerforatedEarDrumTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint(), this.getPressurePointType(), null, "pressurePoint", null, 1, -1, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint(), theXMLTypePackage.getInteger(), "openPoint", null, 0, -1, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint(), theXMLTypePackage.getInteger(), "closePoint", null, 0, -1, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase(), this.getTimeBaseType(), "timeBase", null, 0, 1, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientTypeEClass, GradientType.class, "GradientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientType_GradientValue(), this.getAdmittanceValueType(), null, "gradientValue", null, 1, 1, GradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGradientType_GradientUnit(), this.getAdmittanceUnitType(), null, "gradientUnit", null, 1, 1, GradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTypeEClass, InformationType.class, "InformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationType_Comments(), theXMLTypePackage.getAnySimpleType(), "comments", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationType_Version(), this.getVersionType1(), "version", null, 1, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measuredAdmittancePointsTypeEClass, MeasuredAdmittancePointsType.class, "MeasuredAdmittancePointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasuredAdmittancePointsType_Pt(), this.getAdmittanceValuePointMeasuredType(), null, "pt", null, 1, -1, MeasuredAdmittancePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measuredTypeEClass, MeasuredType.class, "MeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasuredType_AdmittancePointMeasured(), this.getAdmittanceValueMeasuredType(), null, "admittancePointMeasured", null, 1, 1, MeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasuredType_AdmittanceUnitMeasured(), this.getAdmittanceUnitMeasuredType(), null, "admittanceUnitMeasured", null, 1, 1, MeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measuredType1EClass, MeasuredType1.class, "MeasuredType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasuredType1_MeasuredAdmittancePoints(), this.getMeasuredAdmittancePointsType(), null, "measuredAdmittancePoints", null, 1, 1, MeasuredType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasuredType1_MeasuredAdmittanceUnit(), this.getAdmittanceUnitMeasuredType(), null, "measuredAdmittanceUnit", null, 1, 1, MeasuredType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementNotesTypeEClass, MeasurementNotesType.class, "MeasurementNotesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementNotesType_TympanometerMakeModel(), this.getTympanometerMakeModelType(), "tympanometerMakeModel", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_TympanometerSerialNumber(), this.getTympanometerSerialNumberType(), "tympanometerSerialNumber", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_TympanometerLastCalibration(), theXMLTypePackage.getDateTime(), "tympanometerLastCalibration", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_IsDeaf(), this.getEarType(), "isDeaf", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericDeltaTypeEClass, NumericDeltaType.class, "NumericDeltaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericDeltaType_NumericDeltaYPoints(), this.getNumericDeltaYPointsType(), null, "numericDeltaYPoints", null, 1, 1, NumericDeltaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericDeltaType_CalculatedAdmittanceUnit(), this.getAdmittanceUnitCalculatedType(), null, "calculatedAdmittanceUnit", null, 1, 1, NumericDeltaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericDeltaYPointsTypeEClass, NumericDeltaYPointsType.class, "NumericDeltaYPointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericDeltaYPointsType_Pt(), this.getReflexValuePointCalculatedType(), null, "pt", null, 1, -1, NumericDeltaYPointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressurePointTypeEClass, PressurePointType.class, "PressurePointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressurePointType_Time(), this.getTimeType(), "time", null, 1, 1, PressurePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPressurePointType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, PressurePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probeFrequencyTypeEClass, ProbeFrequencyType.class, "ProbeFrequencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbeFrequencyType_Frequency(), theXMLTypePackage.getInteger(), "frequency", "226", 0, 1, ProbeFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbeFrequencyType_Other(), this.getFrequencyOtherType(), "other", "Other", 0, 1, ProbeFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexCurveTypeEClass, ReflexCurveType.class, "ReflexCurveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexCurveType_NumericDelta(), this.getNumericDeltaType(), null, "numericDelta", null, 0, 1, ReflexCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexCurveType_DeltaY(), this.getDeltaYType(), null, "deltaY", null, 0, 1, ReflexCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexTestTypeEClass, ReflexTestType.class, "ReflexTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexTestType_ReflexCurve(), this.getReflexCurveType(), null, "reflexCurve", null, 0, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexTestType_ResultOfReflexTest(), this.getResultOfReflexTestType(), null, "resultOfReflexTest", null, 0, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexTestType_AdmittanceMeasurementCondition(), this.getAdmittanceMeasurementConditionType(), null, "admittanceMeasurementCondition", null, 1, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexValuePointCalculatedTypeEClass, ReflexValuePointCalculatedType.class, "ReflexValuePointCalculatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReflexValuePointCalculatedType_Time(), this.getTimeType2(), "time", null, 1, 1, ReflexValuePointCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflexValuePointCalculatedType_NumericDeltaY(), theXMLTypePackage.getDecimal(), "numericDeltaY", null, 0, 1, ReflexValuePointCalculatedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexValuePointMeasuredTypeEClass, ReflexValuePointMeasuredType.class, "ReflexValuePointMeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReflexValuePointMeasuredType_Time(), this.getTimeType1(), "time", null, 1, 1, ReflexValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflexValuePointMeasuredType_DeltaG(), theXMLTypePackage.getDecimal(), "deltaG", null, 1, 1, ReflexValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflexValuePointMeasuredType_DeltaB(), theXMLTypePackage.getDecimal(), "deltaB", null, 1, 1, ReflexValuePointMeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultOfReflexTestTypeEClass, ResultOfReflexTestType.class, "ResultOfReflexTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultOfReflexTestType_ReflexDetected(), theXMLTypePackage.getBoolean(), "reflexDetected", null, 0, 1, ResultOfReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultOfReflexTestType_DecayBasicResult(), this.getDecayBasicResultType(), "decayBasicResult", null, 0, 1, ResultOfReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultOfReflexTestType_DecayPercent(), theXMLTypePackage.getInteger(), "decayPercent", null, 0, 1, ResultOfReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultOfReflexTestType_LatencyTime(), theXMLTypePackage.getInteger(), "latencyTime", null, 0, 1, ResultOfReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalLevelTypeEClass, SignalLevelType.class, "SignalLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalLevelType_StimulusLevel(), this.getStimulusLevelType(), "stimulusLevel", null, 0, 1, SignalLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalLevelType_Response(), this.getReflexTestResponseType(), "response", null, 0, 1, SignalLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticAdmittanceTypeEClass, StaticAdmittanceType.class, "StaticAdmittanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticAdmittanceType_StaticAdmittanceValue(), this.getAdmittanceValueType(), null, "staticAdmittanceValue", null, 1, 1, StaticAdmittanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticAdmittanceType_StaticAdmittanceUnit(), this.getAdmittanceUnitType(), null, "staticAdmittanceUnit", null, 1, 1, StaticAdmittanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplementaryDataTypeEClass, SupplementaryDataType.class, "SupplementaryDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplementaryDataType_Information(), this.getInformationType(), null, "information", null, 1, 1, SupplementaryDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplementaryDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, SupplementaryDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tympanogramMeasurementConditionsTypeEClass, TympanogramMeasurementConditionsType.class, "TympanogramMeasurementConditionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTympanogramMeasurementConditionsType_SweepSpeed(), theXMLTypePackage.getInteger(), "sweepSpeed", null, 0, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramMeasurementConditionsType_RecordMode(), this.getRecordingModeType(), "recordMode", null, 1, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramMeasurementConditionsType_ProbeFrequency(), this.getProbeFrequencyType(), null, "probeFrequency", null, 1, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tympanogramTestTypeEClass, TympanogramTestType.class, "TympanogramTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTympanogramTestType_AdmittanceCurve(), this.getAdmittanceCurveType(), null, "admittanceCurve", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_MaximumAdmittance(), this.getAdmittanceType(), null, "maximumAdmittance", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_CanalVolume(), this.getAdmittanceType(), null, "canalVolume", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_Gradient(), this.getGradientType(), null, "gradient", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_ResonanceFrequency(), theXMLTypePackage.getInteger(), "resonanceFrequency", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_Result(), this.getTympanogramResultType(), "result", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_MeasurementCondition(), this.getTympanogramMeasurementConditionsType(), null, "measurementCondition", null, 1, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_StaticAdmittance(), this.getStaticAdmittanceType(), null, "staticAdmittance", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(decayBasicResultTypeEEnum, DecayBasicResultType.class, "DecayBasicResultType");
		addEEnumLiteral(decayBasicResultTypeEEnum, DecayBasicResultType.POSITIVE);
		addEEnumLiteral(decayBasicResultTypeEEnum, DecayBasicResultType.NEGATIVE);

		initEEnum(earTypeEEnum, EarType.class, "EarType");
		addEEnumLiteral(earTypeEEnum, EarType.RIGHT);
		addEEnumLiteral(earTypeEEnum, EarType.LEFT);
		addEEnumLiteral(earTypeEEnum, EarType.BINAURAL);

		initEEnum(frequencyOtherTypeEEnum, FrequencyOtherType.class, "FrequencyOtherType");
		addEEnumLiteral(frequencyOtherTypeEEnum, FrequencyOtherType.OTHER);

		initEEnum(recordingModeTypeEEnum, RecordingModeType.class, "RecordingModeType");
		addEEnumLiteral(recordingModeTypeEEnum, RecordingModeType.COMPENSATED);
		addEEnumLiteral(recordingModeTypeEEnum, RecordingModeType.NON_COMPENSATED);

		initEEnum(reflexTestResponseTypeEEnum, ReflexTestResponseType.class, "ReflexTestResponseType");
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NORMAL);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NO_RESPONSE);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.COULD_NOT_SEAL);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.DID_NOT_TEST);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.COULD_NOT_TEST);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NR_AT100);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NR_AT105);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NR_AT110);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NR_AT115);
		addEEnumLiteral(reflexTestResponseTypeEEnum, ReflexTestResponseType.NR_AT120);

		initEEnum(reflexTestTypeTypeEEnum, ReflexTestTypeType.class, "ReflexTestTypeType");
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.FIXED_LEVEL);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.AUTO_THRESHOLD_SEARCH);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.SEQUENCE);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.MULTIPLEXED);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.REFLEX);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.DECAY);
		addEEnumLiteral(reflexTestTypeTypeEEnum, ReflexTestTypeType.LATENCY);

		initEEnum(signalOutputTypeEEnum, SignalOutputType.class, "SignalOutputType");
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.IPSILATERAL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.CONTRALATERAL);

		initEEnum(signalTypeTypeEEnum, SignalTypeType.class, "SignalTypeType");
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.PURE_TONE);
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.MULTI_TONE);
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.NARROW_BAND_NOISE);
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.BROAD_BAND_NOISE);
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.LOW_PASS_NOISE);
		addEEnumLiteral(signalTypeTypeEEnum, SignalTypeType.HIGH_PASS_NOISE);

		initEEnum(tympanogramResultTypeEEnum, TympanogramResultType.class, "TympanogramResultType");
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.A);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.AD);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.AS);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.B);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.C);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.D);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.E);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.COULD_NOT_SEAL);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.DID_NOT_TEST);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.COULD_NOT_TEST);
		addEEnumLiteral(tympanogramResultTypeEEnum, TympanogramResultType.OTHER);

		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.CUBIC_CENTIMETER);
		addEEnumLiteral(unitTypeEEnum, UnitType.MILLI_LITER);
		addEEnumLiteral(unitTypeEEnum, UnitType.MILLI_MHO);
		addEEnumLiteral(unitTypeEEnum, UnitType.DEGREE);
		addEEnumLiteral(unitTypeEEnum, UnitType.DEKA_PASCAL);

		// Initialize data types
		initEDataType(convertedFromDataStandardTypeEDataType, BigInteger.class, "ConvertedFromDataStandardType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decayBasicResultTypeObjectEDataType, DecayBasicResultType.class, "DecayBasicResultTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(earTypeObjectEDataType, EarType.class, "EarTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(frequencyOtherTypeObjectEDataType, FrequencyOtherType.class, "FrequencyOtherTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(recordingModeTypeObjectEDataType, RecordingModeType.class, "RecordingModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reflexTestResponseTypeObjectEDataType, ReflexTestResponseType.class, "ReflexTestResponseTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reflexTestTypeTypeObjectEDataType, ReflexTestTypeType.class, "ReflexTestTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalOutputTypeObjectEDataType, SignalOutputType.class, "SignalOutputTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalTypeTypeObjectEDataType, SignalTypeType.class, "SignalTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelTypeEDataType, BigDecimal.class, "StimulusLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeBaseTypeEDataType, BigDecimal.class, "TimeBaseType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeTypeEDataType, BigDecimal.class, "TimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeType1EDataType, BigDecimal.class, "TimeType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeType2EDataType, BigDecimal.class, "TimeType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tympanogramResultTypeObjectEDataType, TympanogramResultType.class, "TympanogramResultTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tympanometerMakeModelTypeEDataType, String.class, "TympanometerMakeModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tympanometerSerialNumberTypeEDataType, String.class, "TympanometerSerialNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitTypeObjectEDataType, UnitType.class, "UnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, BigInteger.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionType1EDataType, BigInteger.class, "VersionType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (acousticImmittanceAssessmentTypeEClass,
		   source,
		   new String[] {
			   "name", "AcousticImmittanceAssessment_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_TympanogramTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TympanogramTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_ReflexTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReflexTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_EustachianTubeFunctionIntactEarDrumTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EustachianTubeFunctionIntactEarDrumTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_EustachianTubeFunctionPerforatedEarDrumTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EustachianTubeFunctionPerforatedEarDrumTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_SupplementaryData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SupplementaryData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_Notes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Notes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_ConvertedFromDataStandard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConvertedFromDataStandard"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_ValidatedByNOAH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValidatedByNOAH"
		   });
		addAnnotation
		  (getAcousticImmittanceAssessmentType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (admittanceCurveTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceCurve_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceCurveType_Calculated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Calculated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceCurveType_Measured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Measured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceMeasurementConditionTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceMeasurementCondition_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_SignalLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_SignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_SignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_ProbeFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProbeFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_TestType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TestType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceMeasurementConditionType_CanalVolume(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CanalVolume",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceTypeEClass,
		   source,
		   new String[] {
			   "name", "Admittance_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceType_Calculated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Calculated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceType_Measured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Measured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceUnitCalculatedTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceUnitCalculated_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceUnitCalculatedType_YUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "YUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceUnitMeasuredTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceUnitMeasured_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceUnitMeasuredType_GUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceUnitMeasuredType_BUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceUnitTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceUnit_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceUnitType_AdmittanceUnitCalculated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceUnitCalculated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceUnitType_AdmittanceUnitMeasured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceUnitMeasured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceValueCalculatedTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceValueCalculated_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceValueCalculatedType_Y(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Y",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceValueMeasuredTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceValueMeasured_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceValueMeasuredType_G(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "G",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceValueMeasuredType_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "B",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceValuePointCalculatedTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceValuePointCalculated_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceValuePointCalculatedType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceValuePointCalculatedType_Y(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Y",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceValuePointMeasuredTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceValuePointMeasured_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceValuePointMeasuredType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceValuePointMeasuredType_G(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "G",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceValuePointMeasuredType_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "B",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (admittanceValueTypeEClass,
		   source,
		   new String[] {
			   "name", "AdmittanceValue_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdmittanceValueType_ValueCalculated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ValueCalculated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdmittanceValueType_Measured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Measured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (calculatedAdmittancePointsTypeEClass,
		   source,
		   new String[] {
			   "name", "CalculatedAdmittancePoints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCalculatedAdmittancePointsType_Pt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (calculatedTypeEClass,
		   source,
		   new String[] {
			   "name", "Calculated_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCalculatedType_AdmittanceValueCalculated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceValueCalculated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCalculatedType_CalculatedAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CalculatedAdmittanceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (calculatedType1EClass,
		   source,
		   new String[] {
			   "name", "Calculated_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCalculatedType1_CalculatedAdmittancePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CalculatedAdmittancePoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCalculatedType1_CalculatedAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CalculatedAdmittanceUnit",
			   "namespace", "##targetNamespace"
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
		  (decayBasicResultTypeEEnum,
		   source,
		   new String[] {
			   "name", "DecayBasicResult_._type"
		   });
		addAnnotation
		  (decayBasicResultTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DecayBasicResult_._type:Object",
			   "baseType", "DecayBasicResult_._type"
		   });
		addAnnotation
		  (deltaYPointsTypeEClass,
		   source,
		   new String[] {
			   "name", "DeltaYPoints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeltaYPointsType_Pt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deltaYTypeEClass,
		   source,
		   new String[] {
			   "name", "DeltaY_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeltaYType_DeltaYPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeltaYPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeltaYType_G0(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "G0",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeltaYType_B0(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "B0",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeltaYType_MeasuredAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasuredAdmittanceUnit",
			   "namespace", "##targetNamespace"
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
		  (getDocumentRoot_AcousticImmittanceAssessment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AcousticImmittanceAssessment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (earTypeEEnum,
		   source,
		   new String[] {
			   "name", "Ear_Type"
		   });
		addAnnotation
		  (earTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Ear_Type:Object",
			   "baseType", "Ear_Type"
		   });
		addAnnotation
		  (eustachianTubeFunctionIntactEarDrumTestEClass,
		   source,
		   new String[] {
			   "name", "EustachianTubeFunctionIntactEarDrumTest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionIntactEarDrumTest_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionIntactEarDrumTest_CanalVolume(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CanalVolume",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementCondition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (eustachianTubeFunctionPerforatedEarDrumTestEClass,
		   source,
		   new String[] {
			   "name", "EustachianTubeFunctionPerforatedEarDrumTest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PressurePoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OpenPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ClosePoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeBase",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (frequencyOtherTypeEEnum,
		   source,
		   new String[] {
			   "name", "FrequencyOther_Type"
		   });
		addAnnotation
		  (frequencyOtherTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "FrequencyOther_Type:Object",
			   "baseType", "FrequencyOther_Type"
		   });
		addAnnotation
		  (gradientTypeEClass,
		   source,
		   new String[] {
			   "name", "Gradient_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGradientType_GradientValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GradientValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGradientType_GradientUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GradientUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (informationTypeEClass,
		   source,
		   new String[] {
			   "name", "Information_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getInformationType_Comments(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Comments"
		   });
		addAnnotation
		  (getInformationType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (measuredAdmittancePointsTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasuredAdmittancePoints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasuredAdmittancePointsType_Pt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measuredTypeEClass,
		   source,
		   new String[] {
			   "name", "Measured_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasuredType_AdmittancePointMeasured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittancePointMeasured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasuredType_AdmittanceUnitMeasured(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceUnitMeasured",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measuredType1EClass,
		   source,
		   new String[] {
			   "name", "Measured_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasuredType1_MeasuredAdmittancePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasuredAdmittancePoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasuredType1_MeasuredAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasuredAdmittanceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurementNotesTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementNotes_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementNotesType_TympanometerMakeModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TympanometerMakeModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_TympanometerSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TympanometerSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_TympanometerLastCalibration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TympanometerLastCalibration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_IsDeaf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsDeaf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (numericDeltaTypeEClass,
		   source,
		   new String[] {
			   "name", "NumericDelta_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNumericDeltaType_NumericDeltaYPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumericDeltaYPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNumericDeltaType_CalculatedAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CalculatedAdmittanceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (numericDeltaYPointsTypeEClass,
		   source,
		   new String[] {
			   "name", "NumericDeltaYPoints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNumericDeltaYPointsType_Pt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pressurePointTypeEClass,
		   source,
		   new String[] {
			   "name", "PressurePoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPressurePointType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPressurePointType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (probeFrequencyTypeEClass,
		   source,
		   new String[] {
			   "name", "ProbeFrequency_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProbeFrequencyType_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProbeFrequencyType_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Other",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (recordingModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "RecordingMode_Type"
		   });
		addAnnotation
		  (recordingModeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "RecordingMode_Type:Object",
			   "baseType", "RecordingMode_Type"
		   });
		addAnnotation
		  (reflexCurveTypeEClass,
		   source,
		   new String[] {
			   "name", "ReflexCurve_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReflexCurveType_NumericDelta(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumericDelta",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexCurveType_DeltaY(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeltaY",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reflexTestResponseTypeEEnum,
		   source,
		   new String[] {
			   "name", "ReflexTestResponse_Type"
		   });
		addAnnotation
		  (reflexTestResponseTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ReflexTestResponse_Type:Object",
			   "baseType", "ReflexTestResponse_Type"
		   });
		addAnnotation
		  (reflexTestTypeEClass,
		   source,
		   new String[] {
			   "name", "ReflexTest_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReflexTestType_ReflexCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReflexCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexTestType_ResultOfReflexTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ResultOfReflexTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexTestType_AdmittanceMeasurementCondition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceMeasurementCondition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reflexTestTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ReflexTestType_Type"
		   });
		addAnnotation
		  (reflexTestTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ReflexTestType_Type:Object",
			   "baseType", "ReflexTestType_Type"
		   });
		addAnnotation
		  (reflexValuePointCalculatedTypeEClass,
		   source,
		   new String[] {
			   "name", "ReflexValuePointCalculated_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReflexValuePointCalculatedType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexValuePointCalculatedType_NumericDeltaY(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumericDeltaY",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reflexValuePointMeasuredTypeEClass,
		   source,
		   new String[] {
			   "name", "ReflexValuePointMeasured_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReflexValuePointMeasuredType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexValuePointMeasuredType_DeltaG(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeltaG",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexValuePointMeasuredType_DeltaB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeltaB",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resultOfReflexTestTypeEClass,
		   source,
		   new String[] {
			   "name", "ResultOfReflexTest_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResultOfReflexTestType_ReflexDetected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReflexDetected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultOfReflexTestType_DecayBasicResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DecayBasicResult",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultOfReflexTestType_DecayPercent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DecayPercent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResultOfReflexTestType_LatencyTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LatencyTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (signalLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "SignalLevel_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalLevelType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignalLevelType_Response(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Response",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (signalOutputTypeEEnum,
		   source,
		   new String[] {
			   "name", "SignalOutput_Type"
		   });
		addAnnotation
		  (signalOutputTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SignalOutput_Type:Object",
			   "baseType", "SignalOutput_Type"
		   });
		addAnnotation
		  (signalTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "SignalType_Type"
		   });
		addAnnotation
		  (signalTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SignalType_Type:Object",
			   "baseType", "SignalType_Type"
		   });
		addAnnotation
		  (staticAdmittanceTypeEClass,
		   source,
		   new String[] {
			   "name", "StaticAdmittance_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStaticAdmittanceType_StaticAdmittanceValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StaticAdmittanceValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStaticAdmittanceType_StaticAdmittanceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StaticAdmittanceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stimulusLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (supplementaryDataTypeEClass,
		   source,
		   new String[] {
			   "name", "SupplementaryData_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSupplementaryDataType_Information(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Information",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSupplementaryDataType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "skip"
		   });
		addAnnotation
		  (timeBaseTypeEDataType,
		   source,
		   new String[] {
			   "name", "TimeBase_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2",
			   "minInclusive", "0.00"
		   });
		addAnnotation
		  (timeTypeEDataType,
		   source,
		   new String[] {
			   "name", "Time_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2",
			   "minInclusive", "0.00"
		   });
		addAnnotation
		  (timeType1EDataType,
		   source,
		   new String[] {
			   "name", "Time_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
		addAnnotation
		  (timeType2EDataType,
		   source,
		   new String[] {
			   "name", "Time_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
		addAnnotation
		  (tympanogramMeasurementConditionsTypeEClass,
		   source,
		   new String[] {
			   "name", "TympanogramMeasurementConditions_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTympanogramMeasurementConditionsType_SweepSpeed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SweepSpeed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramMeasurementConditionsType_RecordMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramMeasurementConditionsType_ProbeFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProbeFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tympanogramResultTypeEEnum,
		   source,
		   new String[] {
			   "name", "TympanogramResult_Type"
		   });
		addAnnotation
		  (tympanogramResultTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TympanogramResult_Type:Object",
			   "baseType", "TympanogramResult_Type"
		   });
		addAnnotation
		  (tympanogramTestTypeEClass,
		   source,
		   new String[] {
			   "name", "TympanogramTest_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTympanogramTestType_AdmittanceCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdmittanceCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_MaximumAdmittance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaximumAdmittance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_CanalVolume(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CanalVolume",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_Gradient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gradient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_ResonanceFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ResonanceFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_Result(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Result",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_MeasurementCondition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementCondition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_StaticAdmittance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StaticAdmittance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tympanometerMakeModelTypeEDataType,
		   source,
		   new String[] {
			   "name", "TympanometerMakeModel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (tympanometerSerialNumberTypeEDataType,
		   source,
		   new String[] {
			   "name", "TympanometerSerialNumber_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (unitTypeEEnum,
		   source,
		   new String[] {
			   "name", "Unit_Type"
		   });
		addAnnotation
		  (unitTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Unit_Type:Object",
			   "baseType", "Unit_Type"
		   });
		addAnnotation
		  (versionTypeEDataType,
		   source,
		   new String[] {
			   "name", "Version_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minInclusive", "500"
		   });
		addAnnotation
		  (versionType1EDataType,
		   source,
		   new String[] {
			   "name", "Version_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
	}

} //AdmittancePackageImpl
