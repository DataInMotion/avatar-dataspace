/**
 */
package tinnitus.impl;

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

import test.TestPackage;

import test.impl.TestPackageImpl;

import tinnitus.BandwidthType;
import tinnitus.DocumentRoot;
import tinnitus.IntensityType1;
import tinnitus.MeasurementConditionsType;
import tinnitus.MeasurementEquipmentType;
import tinnitus.MeasurementFrequencyPointType;
import tinnitus.MeasurementIntensityPointType;
import tinnitus.MinimumMaskingLevelType;
import tinnitus.ResidualInhibitionType;
import tinnitus.SignalOutputType;
import tinnitus.SignalType;
import tinnitus.SignalTypesType;
import tinnitus.SignalUnitType;
import tinnitus.TinnitusFactory;
import tinnitus.TinnitusInhibitionSucessType;
import tinnitus.TinnitusLoudnessMatchType;
import tinnitus.TinnitusMatchSucessType;
import tinnitus.TinnitusMeasurementDataType;
import tinnitus.TinnitusMeasurementNotesType;
import tinnitus.TinnitusPackage;
import tinnitus.TinnitusPerceptionLocationType;
import tinnitus.TinnitusPitchMatchType;
import tinnitus.TinnitusTemporalCharacteristicType;
import tinnitus.TransducerType;

import tinnitus.util.TinnitusValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TinnitusPackageImpl extends EPackageImpl implements TinnitusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intensityType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEquipmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementFrequencyPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementIntensityPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumMaskingLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass residualInhibitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tinnitusLoudnessMatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tinnitusMeasurementDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tinnitusMeasurementNotesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tinnitusPitchMatchTypeEClass = null;

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
	private EEnum signalOutputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalTypesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tinnitusInhibitionSucessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tinnitusMatchSucessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tinnitusPerceptionLocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tinnitusTemporalCharacteristicTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transducerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType audiometerMakeModelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType audiometerSerialNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gapDurationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inhibitionTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intensityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lowerLimitTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lowerSlopeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingAmplitudeModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingBandwidthModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingFrequencyModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingFrequencyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingFrequencyType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingTransducerDescriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberOfCyclesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType otherMeasurementNotesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType otherSignalSpecificationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plateauSlopeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pulseDurationTypeEDataType = null;

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
	private EDataType signalTypesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalUnitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusAmplitudeModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusBandwidthModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusExposureTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusFrequencyModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusFrequencyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusFrequencyType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusPulseDurationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusTransducerDescriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tinnitusInhibitionSucessTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tinnitusMatchSucessTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tinnitusPerceptionLocationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tinnitusTemporalCharacteristicTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transducerTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperLimitTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperSlopeTypeEDataType = null;

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
	 * @see tinnitus.TinnitusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TinnitusPackageImpl() {
		super(eNS_URI, TinnitusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TinnitusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TinnitusPackage init() {
		if (isInited) return (TinnitusPackage)EPackage.Registry.INSTANCE.getEPackage(TinnitusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTinnitusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TinnitusPackageImpl theTinnitusPackage = registeredTinnitusPackage instanceof TinnitusPackageImpl ? (TinnitusPackageImpl)registeredTinnitusPackage : new TinnitusPackageImpl();

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

		// Create package meta-data objects
		theTinnitusPackage.createPackageContents();
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

		// Initialize created meta-data
		theTinnitusPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTinnitusPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return TinnitusValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTinnitusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TinnitusPackage.eNS_URI, theTinnitusPackage);
		return theTinnitusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidthType() {
		return bandwidthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidthType_UpperLimit() {
		return (EAttribute)bandwidthTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidthType_UpperSlope() {
		return (EAttribute)bandwidthTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidthType_PlateauSlope() {
		return (EAttribute)bandwidthTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidthType_LowerLimit() {
		return (EAttribute)bandwidthTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidthType_LowerSlope() {
		return (EAttribute)bandwidthTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntensityType1() {
		return intensityType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntensityType1_Intensity() {
		return (EAttribute)intensityType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntensityType1_Unit() {
		return (EAttribute)intensityType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementConditionsType() {
		return measurementConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementConditionsType_StimulusSignalType() {
		return (EReference)measurementConditionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusSignalOutput() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementConditionsType_MaskingSignalType() {
		return (EReference)measurementConditionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingUnit() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingSignalOutput() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusTransducerType() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingTransducerType() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusTransducerDescription() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingTransducerDescription() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusAmplitudeModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingAmplitudeModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusBandwidthModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingBandwidthModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_StimulusFrequencyModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementConditionsType_MaskingFrequencyModulation() {
		return (EAttribute)measurementConditionsTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementEquipmentType() {
		return measurementEquipmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementEquipmentType_AudiometerMakeModel() {
		return (EAttribute)measurementEquipmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementEquipmentType_AudiometerSerialNumber() {
		return (EAttribute)measurementEquipmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementEquipmentType_AudiometerLastCalibrationDate() {
		return (EAttribute)measurementEquipmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementFrequencyPointType() {
		return measurementFrequencyPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementFrequencyPointType_StimulusFrequency() {
		return (EAttribute)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementFrequencyPointType_StimulusIntensity() {
		return (EReference)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementFrequencyPointType_StimulusBandwidth() {
		return (EReference)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementFrequencyPointType_StimulusPulseDuration() {
		return (EAttribute)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementFrequencyPointType_MaskingFrequency() {
		return (EAttribute)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementFrequencyPointType_MaskingIntensity() {
		return (EReference)measurementFrequencyPointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementIntensityPointType() {
		return measurementIntensityPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementIntensityPointType_StimulusIntensity() {
		return (EReference)measurementIntensityPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementIntensityPointType_StimulusFrequency() {
		return (EAttribute)measurementIntensityPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementIntensityPointType_MaskingFrequency() {
		return (EAttribute)measurementIntensityPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementIntensityPointType_MaskingIntensity() {
		return (EReference)measurementIntensityPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinimumMaskingLevelType() {
		return minimumMaskingLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinimumMaskingLevelType_MeasurementConditions() {
		return (EReference)minimumMaskingLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinimumMaskingLevelType_MeasurementPoint() {
		return (EReference)minimumMaskingLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinimumMaskingLevelType_MatchingSuccess() {
		return (EAttribute)minimumMaskingLevelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResidualInhibitionType() {
		return residualInhibitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResidualInhibitionType_MeasurementConditions() {
		return (EReference)residualInhibitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResidualInhibitionType_SignalIntensity() {
		return (EReference)residualInhibitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_StimulusExposureTime() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_InhibitionTime() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_PulseDuration() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_GapDuration() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_NumberOfCycles() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_InhibitionSuccess() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResidualInhibitionType_PerceptionLocation() {
		return (EAttribute)residualInhibitionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalType() {
		return signalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalType_SignalTypes() {
		return (EAttribute)signalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalType_OtherSignalSpecification() {
		return (EAttribute)signalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTinnitusLoudnessMatchType() {
		return tinnitusLoudnessMatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusLoudnessMatchType_MeasurementConditions() {
		return (EReference)tinnitusLoudnessMatchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusLoudnessMatchType_MeasurementPoint() {
		return (EReference)tinnitusLoudnessMatchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusLoudnessMatchType_MatchingSuccess() {
		return (EAttribute)tinnitusLoudnessMatchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTinnitusMeasurementDataType() {
		return tinnitusMeasurementDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_TinnitusMeasurementNotes() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_TinnitusMeasurementEquipment() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_TinnitusPitchMatch() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_TinnitusLoudnessMatch() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_MinimumMaskingLevel() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusMeasurementDataType_ResidualInhibition() {
		return (EReference)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusMeasurementDataType_Version() {
		return (EAttribute)tinnitusMeasurementDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTinnitusMeasurementNotesType() {
		return tinnitusMeasurementNotesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusMeasurementNotesType_TinnitusPerceptionLocation() {
		return (EAttribute)tinnitusMeasurementNotesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic() {
		return (EAttribute)tinnitusMeasurementNotesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusMeasurementNotesType_OtherMeasurementNotes() {
		return (EAttribute)tinnitusMeasurementNotesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTinnitusPitchMatchType() {
		return tinnitusPitchMatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusPitchMatchType_MeasurementConditions() {
		return (EReference)tinnitusPitchMatchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTinnitusPitchMatchType_MeasurementPoint() {
		return (EReference)tinnitusPitchMatchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTinnitusPitchMatchType_MatchingSuccess() {
		return (EAttribute)tinnitusPitchMatchTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_TinnitusMeasurementData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
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
	public EEnum getSignalTypesType() {
		return signalTypesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSignalUnitType() {
		return signalUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTinnitusInhibitionSucessType() {
		return tinnitusInhibitionSucessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTinnitusMatchSucessType() {
		return tinnitusMatchSucessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTinnitusPerceptionLocationType() {
		return tinnitusPerceptionLocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTinnitusTemporalCharacteristicType() {
		return tinnitusTemporalCharacteristicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransducerType() {
		return transducerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAudiometerMakeModelType() {
		return audiometerMakeModelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAudiometerSerialNumberType() {
		return audiometerSerialNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGapDurationType() {
		return gapDurationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInhibitionTimeType() {
		return inhibitionTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIntensityType() {
		return intensityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLowerLimitType() {
		return lowerLimitTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLowerSlopeType() {
		return lowerSlopeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingAmplitudeModulationType() {
		return maskingAmplitudeModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingBandwidthModulationType() {
		return maskingBandwidthModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingFrequencyModulationType() {
		return maskingFrequencyModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingFrequencyType() {
		return maskingFrequencyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingFrequencyType1() {
		return maskingFrequencyType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingTransducerDescriptionType() {
		return maskingTransducerDescriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNumberOfCyclesType() {
		return numberOfCyclesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOtherMeasurementNotesType() {
		return otherMeasurementNotesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOtherSignalSpecificationType() {
		return otherSignalSpecificationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlateauSlopeType() {
		return plateauSlopeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPulseDurationType() {
		return pulseDurationTypeEDataType;
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
	public EDataType getSignalTypesTypeObject() {
		return signalTypesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalUnitTypeObject() {
		return signalUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusAmplitudeModulationType() {
		return stimulusAmplitudeModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusBandwidthModulationType() {
		return stimulusBandwidthModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusExposureTimeType() {
		return stimulusExposureTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusFrequencyModulationType() {
		return stimulusFrequencyModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusFrequencyType() {
		return stimulusFrequencyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusFrequencyType1() {
		return stimulusFrequencyType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusPulseDurationType() {
		return stimulusPulseDurationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusTransducerDescriptionType() {
		return stimulusTransducerDescriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTinnitusInhibitionSucessTypeObject() {
		return tinnitusInhibitionSucessTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTinnitusMatchSucessTypeObject() {
		return tinnitusMatchSucessTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTinnitusPerceptionLocationTypeObject() {
		return tinnitusPerceptionLocationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTinnitusTemporalCharacteristicTypeObject() {
		return tinnitusTemporalCharacteristicTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTransducerTypeObject() {
		return transducerTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpperLimitType() {
		return upperLimitTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpperSlopeType() {
		return upperSlopeTypeEDataType;
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
	public TinnitusFactory getTinnitusFactory() {
		return (TinnitusFactory)getEFactoryInstance();
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
		bandwidthTypeEClass = createEClass(BANDWIDTH_TYPE);
		createEAttribute(bandwidthTypeEClass, BANDWIDTH_TYPE__UPPER_LIMIT);
		createEAttribute(bandwidthTypeEClass, BANDWIDTH_TYPE__UPPER_SLOPE);
		createEAttribute(bandwidthTypeEClass, BANDWIDTH_TYPE__PLATEAU_SLOPE);
		createEAttribute(bandwidthTypeEClass, BANDWIDTH_TYPE__LOWER_LIMIT);
		createEAttribute(bandwidthTypeEClass, BANDWIDTH_TYPE__LOWER_SLOPE);

		intensityType1EClass = createEClass(INTENSITY_TYPE1);
		createEAttribute(intensityType1EClass, INTENSITY_TYPE1__INTENSITY);
		createEAttribute(intensityType1EClass, INTENSITY_TYPE1__UNIT);

		measurementConditionsTypeEClass = createEClass(MEASUREMENT_CONDITIONS_TYPE);
		createEReference(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT);
		createEReference(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION);
		createEAttribute(measurementConditionsTypeEClass, MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION);

		measurementEquipmentTypeEClass = createEClass(MEASUREMENT_EQUIPMENT_TYPE);
		createEAttribute(measurementEquipmentTypeEClass, MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL);
		createEAttribute(measurementEquipmentTypeEClass, MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER);
		createEAttribute(measurementEquipmentTypeEClass, MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE);

		measurementFrequencyPointTypeEClass = createEClass(MEASUREMENT_FREQUENCY_POINT_TYPE);
		createEAttribute(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY);
		createEReference(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY);
		createEReference(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH);
		createEAttribute(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION);
		createEAttribute(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY);
		createEReference(measurementFrequencyPointTypeEClass, MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY);

		measurementIntensityPointTypeEClass = createEClass(MEASUREMENT_INTENSITY_POINT_TYPE);
		createEReference(measurementIntensityPointTypeEClass, MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY);
		createEAttribute(measurementIntensityPointTypeEClass, MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(measurementIntensityPointTypeEClass, MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY);
		createEReference(measurementIntensityPointTypeEClass, MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY);

		minimumMaskingLevelTypeEClass = createEClass(MINIMUM_MASKING_LEVEL_TYPE);
		createEReference(minimumMaskingLevelTypeEClass, MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS);
		createEReference(minimumMaskingLevelTypeEClass, MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT);
		createEAttribute(minimumMaskingLevelTypeEClass, MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS);

		residualInhibitionTypeEClass = createEClass(RESIDUAL_INHIBITION_TYPE);
		createEReference(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS);
		createEReference(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__PULSE_DURATION);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__GAP_DURATION);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS);
		createEAttribute(residualInhibitionTypeEClass, RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION);

		signalTypeEClass = createEClass(SIGNAL_TYPE);
		createEAttribute(signalTypeEClass, SIGNAL_TYPE__SIGNAL_TYPES);
		createEAttribute(signalTypeEClass, SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION);

		tinnitusLoudnessMatchTypeEClass = createEClass(TINNITUS_LOUDNESS_MATCH_TYPE);
		createEReference(tinnitusLoudnessMatchTypeEClass, TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_CONDITIONS);
		createEReference(tinnitusLoudnessMatchTypeEClass, TINNITUS_LOUDNESS_MATCH_TYPE__MEASUREMENT_POINT);
		createEAttribute(tinnitusLoudnessMatchTypeEClass, TINNITUS_LOUDNESS_MATCH_TYPE__MATCHING_SUCCESS);

		tinnitusMeasurementDataTypeEClass = createEClass(TINNITUS_MEASUREMENT_DATA_TYPE);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL);
		createEReference(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION);
		createEAttribute(tinnitusMeasurementDataTypeEClass, TINNITUS_MEASUREMENT_DATA_TYPE__VERSION);

		tinnitusMeasurementNotesTypeEClass = createEClass(TINNITUS_MEASUREMENT_NOTES_TYPE);
		createEAttribute(tinnitusMeasurementNotesTypeEClass, TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION);
		createEAttribute(tinnitusMeasurementNotesTypeEClass, TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC);
		createEAttribute(tinnitusMeasurementNotesTypeEClass, TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES);

		tinnitusPitchMatchTypeEClass = createEClass(TINNITUS_PITCH_MATCH_TYPE);
		createEReference(tinnitusPitchMatchTypeEClass, TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS);
		createEReference(tinnitusPitchMatchTypeEClass, TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT);
		createEAttribute(tinnitusPitchMatchTypeEClass, TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TINNITUS_MEASUREMENT_DATA);

		// Create enums
		signalOutputTypeEEnum = createEEnum(SIGNAL_OUTPUT_TYPE);
		signalTypesTypeEEnum = createEEnum(SIGNAL_TYPES_TYPE);
		signalUnitTypeEEnum = createEEnum(SIGNAL_UNIT_TYPE);
		tinnitusInhibitionSucessTypeEEnum = createEEnum(TINNITUS_INHIBITION_SUCESS_TYPE);
		tinnitusMatchSucessTypeEEnum = createEEnum(TINNITUS_MATCH_SUCESS_TYPE);
		tinnitusPerceptionLocationTypeEEnum = createEEnum(TINNITUS_PERCEPTION_LOCATION_TYPE);
		tinnitusTemporalCharacteristicTypeEEnum = createEEnum(TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE);
		transducerTypeEEnum = createEEnum(TRANSDUCER_TYPE);

		// Create data types
		audiometerMakeModelTypeEDataType = createEDataType(AUDIOMETER_MAKE_MODEL_TYPE);
		audiometerSerialNumberTypeEDataType = createEDataType(AUDIOMETER_SERIAL_NUMBER_TYPE);
		gapDurationTypeEDataType = createEDataType(GAP_DURATION_TYPE);
		inhibitionTimeTypeEDataType = createEDataType(INHIBITION_TIME_TYPE);
		intensityTypeEDataType = createEDataType(INTENSITY_TYPE);
		lowerLimitTypeEDataType = createEDataType(LOWER_LIMIT_TYPE);
		lowerSlopeTypeEDataType = createEDataType(LOWER_SLOPE_TYPE);
		maskingAmplitudeModulationTypeEDataType = createEDataType(MASKING_AMPLITUDE_MODULATION_TYPE);
		maskingBandwidthModulationTypeEDataType = createEDataType(MASKING_BANDWIDTH_MODULATION_TYPE);
		maskingFrequencyModulationTypeEDataType = createEDataType(MASKING_FREQUENCY_MODULATION_TYPE);
		maskingFrequencyTypeEDataType = createEDataType(MASKING_FREQUENCY_TYPE);
		maskingFrequencyType1EDataType = createEDataType(MASKING_FREQUENCY_TYPE1);
		maskingTransducerDescriptionTypeEDataType = createEDataType(MASKING_TRANSDUCER_DESCRIPTION_TYPE);
		numberOfCyclesTypeEDataType = createEDataType(NUMBER_OF_CYCLES_TYPE);
		otherMeasurementNotesTypeEDataType = createEDataType(OTHER_MEASUREMENT_NOTES_TYPE);
		otherSignalSpecificationTypeEDataType = createEDataType(OTHER_SIGNAL_SPECIFICATION_TYPE);
		plateauSlopeTypeEDataType = createEDataType(PLATEAU_SLOPE_TYPE);
		pulseDurationTypeEDataType = createEDataType(PULSE_DURATION_TYPE);
		signalOutputTypeObjectEDataType = createEDataType(SIGNAL_OUTPUT_TYPE_OBJECT);
		signalTypesTypeObjectEDataType = createEDataType(SIGNAL_TYPES_TYPE_OBJECT);
		signalUnitTypeObjectEDataType = createEDataType(SIGNAL_UNIT_TYPE_OBJECT);
		stimulusAmplitudeModulationTypeEDataType = createEDataType(STIMULUS_AMPLITUDE_MODULATION_TYPE);
		stimulusBandwidthModulationTypeEDataType = createEDataType(STIMULUS_BANDWIDTH_MODULATION_TYPE);
		stimulusExposureTimeTypeEDataType = createEDataType(STIMULUS_EXPOSURE_TIME_TYPE);
		stimulusFrequencyModulationTypeEDataType = createEDataType(STIMULUS_FREQUENCY_MODULATION_TYPE);
		stimulusFrequencyTypeEDataType = createEDataType(STIMULUS_FREQUENCY_TYPE);
		stimulusFrequencyType1EDataType = createEDataType(STIMULUS_FREQUENCY_TYPE1);
		stimulusPulseDurationTypeEDataType = createEDataType(STIMULUS_PULSE_DURATION_TYPE);
		stimulusTransducerDescriptionTypeEDataType = createEDataType(STIMULUS_TRANSDUCER_DESCRIPTION_TYPE);
		tinnitusInhibitionSucessTypeObjectEDataType = createEDataType(TINNITUS_INHIBITION_SUCESS_TYPE_OBJECT);
		tinnitusMatchSucessTypeObjectEDataType = createEDataType(TINNITUS_MATCH_SUCESS_TYPE_OBJECT);
		tinnitusPerceptionLocationTypeObjectEDataType = createEDataType(TINNITUS_PERCEPTION_LOCATION_TYPE_OBJECT);
		tinnitusTemporalCharacteristicTypeObjectEDataType = createEDataType(TINNITUS_TEMPORAL_CHARACTERISTIC_TYPE_OBJECT);
		transducerTypeObjectEDataType = createEDataType(TRANSDUCER_TYPE_OBJECT);
		upperLimitTypeEDataType = createEDataType(UPPER_LIMIT_TYPE);
		upperSlopeTypeEDataType = createEDataType(UPPER_SLOPE_TYPE);
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
		initEClass(bandwidthTypeEClass, BandwidthType.class, "BandwidthType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandwidthType_UpperLimit(), this.getUpperLimitType(), "upperLimit", null, 0, 1, BandwidthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandwidthType_UpperSlope(), this.getUpperSlopeType(), "upperSlope", null, 1, 1, BandwidthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandwidthType_PlateauSlope(), this.getPlateauSlopeType(), "plateauSlope", null, 0, 1, BandwidthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandwidthType_LowerLimit(), this.getLowerLimitType(), "lowerLimit", null, 0, 1, BandwidthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandwidthType_LowerSlope(), this.getLowerSlopeType(), "lowerSlope", null, 1, 1, BandwidthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intensityType1EClass, IntensityType1.class, "IntensityType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntensityType1_Intensity(), this.getIntensityType(), "intensity", null, 1, 1, IntensityType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntensityType1_Unit(), this.getSignalUnitType(), "unit", null, 1, 1, IntensityType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementConditionsTypeEClass, MeasurementConditionsType.class, "MeasurementConditionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementConditionsType_StimulusSignalType(), this.getSignalType(), null, "stimulusSignalType", null, 1, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusSignalOutput(), this.getSignalOutputType(), "stimulusSignalOutput", null, 1, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementConditionsType_MaskingSignalType(), this.getSignalType(), null, "maskingSignalType", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingUnit(), this.getSignalUnitType(), "maskingUnit", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingSignalOutput(), this.getSignalOutputType(), "maskingSignalOutput", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusTransducerType(), this.getTransducerType(), "stimulusTransducerType", "NoTransducer", 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingTransducerType(), this.getTransducerType(), "maskingTransducerType", "NoTransducer", 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusTransducerDescription(), this.getStimulusTransducerDescriptionType(), "stimulusTransducerDescription", "", 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingTransducerDescription(), this.getMaskingTransducerDescriptionType(), "maskingTransducerDescription", "", 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusAmplitudeModulation(), this.getStimulusAmplitudeModulationType(), "stimulusAmplitudeModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingAmplitudeModulation(), this.getMaskingAmplitudeModulationType(), "maskingAmplitudeModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusBandwidthModulation(), this.getStimulusBandwidthModulationType(), "stimulusBandwidthModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingBandwidthModulation(), this.getMaskingBandwidthModulationType(), "maskingBandwidthModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_StimulusFrequencyModulation(), this.getStimulusFrequencyModulationType(), "stimulusFrequencyModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConditionsType_MaskingFrequencyModulation(), this.getMaskingFrequencyModulationType(), "maskingFrequencyModulation", null, 0, 1, MeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEquipmentTypeEClass, MeasurementEquipmentType.class, "MeasurementEquipmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementEquipmentType_AudiometerMakeModel(), this.getAudiometerMakeModelType(), "audiometerMakeModel", null, 0, 1, MeasurementEquipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementEquipmentType_AudiometerSerialNumber(), this.getAudiometerSerialNumberType(), "audiometerSerialNumber", null, 0, 1, MeasurementEquipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementEquipmentType_AudiometerLastCalibrationDate(), theXMLTypePackage.getDateTime(), "audiometerLastCalibrationDate", null, 0, 1, MeasurementEquipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementFrequencyPointTypeEClass, MeasurementFrequencyPointType.class, "MeasurementFrequencyPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementFrequencyPointType_StimulusFrequency(), this.getStimulusFrequencyType1(), "stimulusFrequency", null, 1, 1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementFrequencyPointType_StimulusIntensity(), this.getIntensityType1(), null, "stimulusIntensity", null, 0, -1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementFrequencyPointType_StimulusBandwidth(), this.getBandwidthType(), null, "stimulusBandwidth", null, 0, 1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementFrequencyPointType_StimulusPulseDuration(), this.getStimulusPulseDurationType(), "stimulusPulseDuration", null, 0, 1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementFrequencyPointType_MaskingFrequency(), this.getMaskingFrequencyType1(), "maskingFrequency", null, 0, 1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementFrequencyPointType_MaskingIntensity(), this.getIntensityType1(), null, "maskingIntensity", null, 0, -1, MeasurementFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementIntensityPointTypeEClass, MeasurementIntensityPointType.class, "MeasurementIntensityPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementIntensityPointType_StimulusIntensity(), this.getIntensityType1(), null, "stimulusIntensity", null, 1, -1, MeasurementIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementIntensityPointType_StimulusFrequency(), this.getStimulusFrequencyType(), "stimulusFrequency", null, 0, 1, MeasurementIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementIntensityPointType_MaskingFrequency(), this.getMaskingFrequencyType(), "maskingFrequency", null, 0, 1, MeasurementIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementIntensityPointType_MaskingIntensity(), this.getIntensityType1(), null, "maskingIntensity", null, 0, -1, MeasurementIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumMaskingLevelTypeEClass, MinimumMaskingLevelType.class, "MinimumMaskingLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinimumMaskingLevelType_MeasurementConditions(), this.getMeasurementConditionsType(), null, "measurementConditions", null, 0, 1, MinimumMaskingLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinimumMaskingLevelType_MeasurementPoint(), this.getMeasurementIntensityPointType(), null, "measurementPoint", null, 0, 1, MinimumMaskingLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinimumMaskingLevelType_MatchingSuccess(), this.getTinnitusMatchSucessType(), "matchingSuccess", null, 0, 1, MinimumMaskingLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(residualInhibitionTypeEClass, ResidualInhibitionType.class, "ResidualInhibitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResidualInhibitionType_MeasurementConditions(), this.getMeasurementConditionsType(), null, "measurementConditions", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResidualInhibitionType_SignalIntensity(), this.getMeasurementIntensityPointType(), null, "signalIntensity", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_StimulusExposureTime(), this.getStimulusExposureTimeType(), "stimulusExposureTime", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_InhibitionTime(), this.getInhibitionTimeType(), "inhibitionTime", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_PulseDuration(), this.getPulseDurationType(), "pulseDuration", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_GapDuration(), this.getGapDurationType(), "gapDuration", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_NumberOfCycles(), this.getNumberOfCyclesType(), "numberOfCycles", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_InhibitionSuccess(), this.getTinnitusInhibitionSucessType(), "inhibitionSuccess", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResidualInhibitionType_PerceptionLocation(), this.getTinnitusPerceptionLocationType(), "perceptionLocation", null, 0, 1, ResidualInhibitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalTypeEClass, SignalType.class, "SignalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalType_SignalTypes(), this.getSignalTypesType(), "signalTypes", null, 1, 1, SignalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalType_OtherSignalSpecification(), this.getOtherSignalSpecificationType(), "otherSignalSpecification", null, 0, 1, SignalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tinnitusLoudnessMatchTypeEClass, TinnitusLoudnessMatchType.class, "TinnitusLoudnessMatchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTinnitusLoudnessMatchType_MeasurementConditions(), this.getMeasurementConditionsType(), null, "measurementConditions", null, 0, 1, TinnitusLoudnessMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusLoudnessMatchType_MeasurementPoint(), this.getMeasurementIntensityPointType(), null, "measurementPoint", null, 0, 1, TinnitusLoudnessMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTinnitusLoudnessMatchType_MatchingSuccess(), this.getTinnitusMatchSucessType(), "matchingSuccess", null, 0, 1, TinnitusLoudnessMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tinnitusMeasurementDataTypeEClass, TinnitusMeasurementDataType.class, "TinnitusMeasurementDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTinnitusMeasurementDataType_TinnitusMeasurementNotes(), this.getTinnitusMeasurementNotesType(), null, "tinnitusMeasurementNotes", null, 0, 1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusMeasurementDataType_TinnitusMeasurementEquipment(), this.getMeasurementEquipmentType(), null, "tinnitusMeasurementEquipment", null, 0, 1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusMeasurementDataType_TinnitusPitchMatch(), this.getTinnitusPitchMatchType(), null, "tinnitusPitchMatch", null, 0, -1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusMeasurementDataType_TinnitusLoudnessMatch(), this.getTinnitusLoudnessMatchType(), null, "tinnitusLoudnessMatch", null, 0, -1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusMeasurementDataType_MinimumMaskingLevel(), this.getMinimumMaskingLevelType(), null, "minimumMaskingLevel", null, 0, -1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusMeasurementDataType_ResidualInhibition(), this.getResidualInhibitionType(), null, "residualInhibition", null, 0, -1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTinnitusMeasurementDataType_Version(), this.getVersionType(), "version", "500", 1, 1, TinnitusMeasurementDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tinnitusMeasurementNotesTypeEClass, TinnitusMeasurementNotesType.class, "TinnitusMeasurementNotesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTinnitusMeasurementNotesType_TinnitusPerceptionLocation(), this.getTinnitusPerceptionLocationType(), "tinnitusPerceptionLocation", null, 0, 1, TinnitusMeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic(), this.getTinnitusTemporalCharacteristicType(), "tinnitusTemporalCharacteristic", null, 0, 1, TinnitusMeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTinnitusMeasurementNotesType_OtherMeasurementNotes(), this.getOtherMeasurementNotesType(), "otherMeasurementNotes", null, 0, 1, TinnitusMeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tinnitusPitchMatchTypeEClass, TinnitusPitchMatchType.class, "TinnitusPitchMatchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTinnitusPitchMatchType_MeasurementConditions(), this.getMeasurementConditionsType(), null, "measurementConditions", null, 0, 1, TinnitusPitchMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTinnitusPitchMatchType_MeasurementPoint(), this.getMeasurementFrequencyPointType(), null, "measurementPoint", null, 0, 1, TinnitusPitchMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTinnitusPitchMatchType_MatchingSuccess(), this.getTinnitusMatchSucessType(), "matchingSuccess", null, 0, 1, TinnitusPitchMatchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TinnitusMeasurementData(), this.getTinnitusMeasurementDataType(), null, "tinnitusMeasurementData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalOutputTypeEEnum, SignalOutputType.class, "SignalOutputType");
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.UNKNOWN);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.NO_SIGNAL_OUTPUT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.AIR_CONDUCTOR_LEFT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.AIR_CONDUCTOR_RIGHT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.AIR_CONDUCTOR_BINAURAL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.BONE_CONDUCTOR_LEFT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.BONE_CONDUCTOR_RIGHT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.BONE_CONDUCTOR_BINAURAL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.FREE_FIELD_LEFT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.FREE_FIELD_RIGHT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.FREE_FIELD_BINAURAL);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.INSERT_PHONE_LEFT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.INSERT_PHONE_RIGHT);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.INSERT_PHONE_BINAURAL);

		initEEnum(signalTypesTypeEEnum, SignalTypesType.class, "SignalTypesType");
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.UNDEFINED);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.NO_SIGNAL);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.TONE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.WARBLE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.NARROW_BAND_NOISE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.TWO_TONE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.WHITE_NOISE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.PINK_NOISE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.RAINBOW_PASSAGE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.SPEECH_NOISE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.SPEECH_LIKE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.LOUD_SPEECH);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.OWN_VOICE);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA2PB1F1MN);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA3BSMNFN);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA3BSMNMN);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA6PBL);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA6PBN);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA6PBR);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA_URGNML);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA_URGNMN);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ICRA_URGNMR);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.SPEECH_NOISE_ILTASS);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.AURINS);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.ISTS);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.EUHAMPO);
		addEEnumLiteral(signalTypesTypeEEnum, SignalTypesType.OTHER);

		initEEnum(signalUnitTypeEEnum, SignalUnitType.class, "SignalUnitType");
		addEEnumLiteral(signalUnitTypeEEnum, SignalUnitType.HL);
		addEEnumLiteral(signalUnitTypeEEnum, SignalUnitType.SL);
		addEEnumLiteral(signalUnitTypeEEnum, SignalUnitType.SPL);
		addEEnumLiteral(signalUnitTypeEEnum, SignalUnitType.ABS);

		initEEnum(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.class, "TinnitusInhibitionSucessType");
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.PARTIAL);
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.COMPLETE);
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.COMBINATION);
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.EXACERBATION);
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.NO_RESPONSE);
		addEEnumLiteral(tinnitusInhibitionSucessTypeEEnum, TinnitusInhibitionSucessType.COULD_NOT_TEST);

		initEEnum(tinnitusMatchSucessTypeEEnum, TinnitusMatchSucessType.class, "TinnitusMatchSucessType");
		addEEnumLiteral(tinnitusMatchSucessTypeEEnum, TinnitusMatchSucessType.PARTIAL);
		addEEnumLiteral(tinnitusMatchSucessTypeEEnum, TinnitusMatchSucessType.COMPLETE);
		addEEnumLiteral(tinnitusMatchSucessTypeEEnum, TinnitusMatchSucessType.NO_RESPONSE);
		addEEnumLiteral(tinnitusMatchSucessTypeEEnum, TinnitusMatchSucessType.COULD_NOT_TEST);

		initEEnum(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.class, "TinnitusPerceptionLocationType");
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.CENTRAL);
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.BINAURAL);
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.MONAURAL_RIGHT);
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.MONAURAL_LEFT);
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.VARIABLE_LOCATION);
		addEEnumLiteral(tinnitusPerceptionLocationTypeEEnum, TinnitusPerceptionLocationType.UNKNOWN);

		initEEnum(tinnitusTemporalCharacteristicTypeEEnum, TinnitusTemporalCharacteristicType.class, "TinnitusTemporalCharacteristicType");
		addEEnumLiteral(tinnitusTemporalCharacteristicTypeEEnum, TinnitusTemporalCharacteristicType.STEADY);
		addEEnumLiteral(tinnitusTemporalCharacteristicTypeEEnum, TinnitusTemporalCharacteristicType.PULSATILE);
		addEEnumLiteral(tinnitusTemporalCharacteristicTypeEEnum, TinnitusTemporalCharacteristicType.FLUCTUATING);
		addEEnumLiteral(tinnitusTemporalCharacteristicTypeEEnum, TinnitusTemporalCharacteristicType.UNKNOWN);

		initEEnum(transducerTypeEEnum, TransducerType.class, "TransducerType");
		addEEnumLiteral(transducerTypeEEnum, TransducerType.UNKNOWN);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.NO_TRANSDUCER);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.OTHER);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HEARING_INSTRUMENT);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH39);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HDA200);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE3A);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DT48);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH49);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B71);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B72);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.BEOTON);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMBERG);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE5A);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE3_AABR);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH50);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.IP30);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.IP3010_OHM);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.IP3050_OHM);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD45);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD450);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B81);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD65);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD6_5V2);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMCO_PD81);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMCO_PD95);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HDA280);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HDA300);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.BC1);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.BC2);

		// Initialize data types
		initEDataType(audiometerMakeModelTypeEDataType, String.class, "AudiometerMakeModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(audiometerSerialNumberTypeEDataType, String.class, "AudiometerSerialNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gapDurationTypeEDataType, BigDecimal.class, "GapDurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inhibitionTimeTypeEDataType, BigDecimal.class, "InhibitionTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intensityTypeEDataType, BigDecimal.class, "IntensityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lowerLimitTypeEDataType, BigDecimal.class, "LowerLimitType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lowerSlopeTypeEDataType, BigDecimal.class, "LowerSlopeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingAmplitudeModulationTypeEDataType, BigDecimal.class, "MaskingAmplitudeModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingBandwidthModulationTypeEDataType, BigDecimal.class, "MaskingBandwidthModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingFrequencyModulationTypeEDataType, BigDecimal.class, "MaskingFrequencyModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingFrequencyTypeEDataType, BigInteger.class, "MaskingFrequencyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingFrequencyType1EDataType, BigInteger.class, "MaskingFrequencyType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingTransducerDescriptionTypeEDataType, String.class, "MaskingTransducerDescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberOfCyclesTypeEDataType, BigInteger.class, "NumberOfCyclesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(otherMeasurementNotesTypeEDataType, String.class, "OtherMeasurementNotesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(otherSignalSpecificationTypeEDataType, String.class, "OtherSignalSpecificationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(plateauSlopeTypeEDataType, BigDecimal.class, "PlateauSlopeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pulseDurationTypeEDataType, BigDecimal.class, "PulseDurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalOutputTypeObjectEDataType, SignalOutputType.class, "SignalOutputTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalTypesTypeObjectEDataType, SignalTypesType.class, "SignalTypesTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalUnitTypeObjectEDataType, SignalUnitType.class, "SignalUnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusAmplitudeModulationTypeEDataType, BigDecimal.class, "StimulusAmplitudeModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusBandwidthModulationTypeEDataType, BigDecimal.class, "StimulusBandwidthModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusExposureTimeTypeEDataType, BigDecimal.class, "StimulusExposureTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusFrequencyModulationTypeEDataType, BigDecimal.class, "StimulusFrequencyModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusFrequencyTypeEDataType, BigInteger.class, "StimulusFrequencyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusFrequencyType1EDataType, BigInteger.class, "StimulusFrequencyType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusPulseDurationTypeEDataType, BigDecimal.class, "StimulusPulseDurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusTransducerDescriptionTypeEDataType, String.class, "StimulusTransducerDescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tinnitusInhibitionSucessTypeObjectEDataType, TinnitusInhibitionSucessType.class, "TinnitusInhibitionSucessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tinnitusMatchSucessTypeObjectEDataType, TinnitusMatchSucessType.class, "TinnitusMatchSucessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tinnitusPerceptionLocationTypeObjectEDataType, TinnitusPerceptionLocationType.class, "TinnitusPerceptionLocationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tinnitusTemporalCharacteristicTypeObjectEDataType, TinnitusTemporalCharacteristicType.class, "TinnitusTemporalCharacteristicTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transducerTypeObjectEDataType, TransducerType.class, "TransducerTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperLimitTypeEDataType, BigDecimal.class, "UpperLimitType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperSlopeTypeEDataType, BigDecimal.class, "UpperSlopeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (audiometerMakeModelTypeEDataType,
		   source,
		   new String[] {
			   "name", "AudiometerMakeModel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (audiometerSerialNumberTypeEDataType,
		   source,
		   new String[] {
			   "name", "AudiometerSerialNumber_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (bandwidthTypeEClass,
		   source,
		   new String[] {
			   "name", "Bandwidth_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBandwidthType_UpperLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpperLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBandwidthType_UpperSlope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpperSlope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBandwidthType_PlateauSlope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlateauSlope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBandwidthType_LowerLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LowerLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBandwidthType_LowerSlope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LowerSlope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (gapDurationTypeEDataType,
		   source,
		   new String[] {
			   "name", "GapDuration_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (inhibitionTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "InhibitionTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (intensityTypeEDataType,
		   source,
		   new String[] {
			   "name", "Intensity_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (intensityType1EClass,
		   source,
		   new String[] {
			   "name", "Intensity_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIntensityType1_Intensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Intensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIntensityType1_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lowerLimitTypeEDataType,
		   source,
		   new String[] {
			   "name", "LowerLimit_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (lowerSlopeTypeEDataType,
		   source,
		   new String[] {
			   "name", "LowerSlope_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (maskingAmplitudeModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingAmplitudeModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingBandwidthModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingBandwidthModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingFrequencyModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingFrequencyModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (maskingFrequencyTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingFrequency_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (maskingFrequencyType1EDataType,
		   source,
		   new String[] {
			   "name", "MaskingFrequency_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (maskingTransducerDescriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingTransducerDescription_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (measurementConditionsTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementConditions_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusSignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusSignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusSignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusSignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingSignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingSignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingSignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingSignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusTransducerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusTransducerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingTransducerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingTransducerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusTransducerDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusTransducerDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingTransducerDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingTransducerDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusAmplitudeModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusAmplitudeModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingAmplitudeModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingAmplitudeModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusBandwidthModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusBandwidthModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingBandwidthModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingBandwidthModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_StimulusFrequencyModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequencyModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementConditionsType_MaskingFrequencyModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequencyModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurementEquipmentTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementEquipment_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementEquipmentType_AudiometerMakeModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerMakeModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementEquipmentType_AudiometerSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementEquipmentType_AudiometerLastCalibrationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerLastCalibrationDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurementFrequencyPointTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementFrequencyPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_StimulusIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_StimulusBandwidth(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusBandwidth",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_StimulusPulseDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusPulseDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementFrequencyPointType_MaskingIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (measurementIntensityPointTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementIntensityPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementIntensityPointType_StimulusIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementIntensityPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementIntensityPointType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementIntensityPointType_MaskingIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (minimumMaskingLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "MinimumMaskingLevel_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMinimumMaskingLevelType_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMinimumMaskingLevelType_MeasurementPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMinimumMaskingLevelType_MatchingSuccess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MatchingSuccess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (numberOfCyclesTypeEDataType,
		   source,
		   new String[] {
			   "name", "NumberOfCycles_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (otherMeasurementNotesTypeEDataType,
		   source,
		   new String[] {
			   "name", "OtherMeasurementNotes_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (otherSignalSpecificationTypeEDataType,
		   source,
		   new String[] {
			   "name", "OtherSignalSpecification_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (plateauSlopeTypeEDataType,
		   source,
		   new String[] {
			   "name", "PlateauSlope_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (pulseDurationTypeEDataType,
		   source,
		   new String[] {
			   "name", "PulseDuration_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (residualInhibitionTypeEClass,
		   source,
		   new String[] {
			   "name", "ResidualInhibition_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResidualInhibitionType_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_SignalIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_StimulusExposureTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusExposureTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_InhibitionTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InhibitionTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_PulseDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PulseDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_GapDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GapDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_NumberOfCycles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfCycles",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_InhibitionSuccess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InhibitionSuccess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResidualInhibitionType_PerceptionLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PerceptionLocation",
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
		  (signalTypeEClass,
		   source,
		   new String[] {
			   "name", "Signal_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalType_SignalTypes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signal_Types",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignalType_OtherSignalSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OtherSignalSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (signalTypesTypeEEnum,
		   source,
		   new String[] {
			   "name", "Signal_Types_._type"
		   });
		addAnnotation
		  (signalTypesTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Signal_Types_._type:Object",
			   "baseType", "Signal_Types_._type"
		   });
		addAnnotation
		  (signalUnitTypeEEnum,
		   source,
		   new String[] {
			   "name", "SignalUnit_Type"
		   });
		addAnnotation
		  (signalUnitTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SignalUnit_Type:Object",
			   "baseType", "SignalUnit_Type"
		   });
		addAnnotation
		  (stimulusAmplitudeModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusAmplitudeModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusBandwidthModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusBandwidthModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusExposureTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusExposureTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (stimulusFrequencyModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusFrequencyModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (stimulusFrequencyTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusFrequency_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (stimulusFrequencyType1EDataType,
		   source,
		   new String[] {
			   "name", "StimulusFrequency_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (stimulusPulseDurationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusPulseDuration_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (stimulusTransducerDescriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusTransducerDescription_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (tinnitusInhibitionSucessTypeEEnum,
		   source,
		   new String[] {
			   "name", "TinnitusInhibitionSucess_Type"
		   });
		addAnnotation
		  (tinnitusInhibitionSucessTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TinnitusInhibitionSucess_Type:Object",
			   "baseType", "TinnitusInhibitionSucess_Type"
		   });
		addAnnotation
		  (tinnitusLoudnessMatchTypeEClass,
		   source,
		   new String[] {
			   "name", "TinnitusLoudnessMatch_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTinnitusLoudnessMatchType_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusLoudnessMatchType_MeasurementPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusLoudnessMatchType_MatchingSuccess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MatchingSuccess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tinnitusMatchSucessTypeEEnum,
		   source,
		   new String[] {
			   "name", "TinnitusMatchSucess_Type"
		   });
		addAnnotation
		  (tinnitusMatchSucessTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TinnitusMatchSucess_Type:Object",
			   "baseType", "TinnitusMatchSucess_Type"
		   });
		addAnnotation
		  (tinnitusMeasurementDataTypeEClass,
		   source,
		   new String[] {
			   "name", "TinnitusMeasurementData_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_TinnitusMeasurementNotes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusMeasurementNotes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_TinnitusMeasurementEquipment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusMeasurementEquipment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_TinnitusPitchMatch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusPitchMatch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_TinnitusLoudnessMatch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusLoudnessMatch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_MinimumMaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MinimumMaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_ResidualInhibition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ResidualInhibition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementDataType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (tinnitusMeasurementNotesTypeEClass,
		   source,
		   new String[] {
			   "name", "TinnitusMeasurementNotes_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTinnitusMeasurementNotesType_TinnitusPerceptionLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusPerceptionLocation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusTemporalCharacteristic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusMeasurementNotesType_OtherMeasurementNotes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OtherMeasurementNotes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tinnitusPerceptionLocationTypeEEnum,
		   source,
		   new String[] {
			   "name", "TinnitusPerceptionLocation_Type"
		   });
		addAnnotation
		  (tinnitusPerceptionLocationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TinnitusPerceptionLocation_Type:Object",
			   "baseType", "TinnitusPerceptionLocation_Type"
		   });
		addAnnotation
		  (tinnitusPitchMatchTypeEClass,
		   source,
		   new String[] {
			   "name", "TinnitusPitchMatch_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTinnitusPitchMatchType_MeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusPitchMatchType_MeasurementPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MeasurementPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTinnitusPitchMatchType_MatchingSuccess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MatchingSuccess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tinnitusTemporalCharacteristicTypeEEnum,
		   source,
		   new String[] {
			   "name", "TinnitusTemporalCharacteristic_Type"
		   });
		addAnnotation
		  (tinnitusTemporalCharacteristicTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TinnitusTemporalCharacteristic_Type:Object",
			   "baseType", "TinnitusTemporalCharacteristic_Type"
		   });
		addAnnotation
		  (transducerTypeEEnum,
		   source,
		   new String[] {
			   "name", "Transducer_Type"
		   });
		addAnnotation
		  (transducerTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Transducer_Type:Object",
			   "baseType", "Transducer_Type"
		   });
		addAnnotation
		  (upperLimitTypeEDataType,
		   source,
		   new String[] {
			   "name", "UpperLimit_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (upperSlopeTypeEDataType,
		   source,
		   new String[] {
			   "name", "UpperSlope_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minExclusive", "0"
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
		  (getDocumentRoot_TinnitusMeasurementData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusMeasurementData",
			   "namespace", "##targetNamespace"
		   });
	}

} //TinnitusPackageImpl
