/**
 */
package audiogram502.impl;

import admittance.AdmittancePackage;

import admittance.impl.AdmittancePackageImpl;

import audiogram.AudiogramPackage;

import audiogram.impl.AudiogramPackageImpl;

import audiogram502.AdditionalMasking2Type;
import audiogram502.AdditionalMaskingType;
import audiogram502.AidedSolutionsType;
import audiogram502.AlternateBinauralLoudnessBalanceAudiogramType;
import audiogram502.AudioMetricMeasurementConditionsType;
import audiogram502.Audiogram502Factory;
import audiogram502.Audiogram502Package;
import audiogram502.AuxiliaryParameterType;
import audiogram502.DBweightingType;
import audiogram502.DecayAudiogramType;
import audiogram502.DecayPointType;
import audiogram502.DeviceSolutionsType;
import audiogram502.DifferenceLimenFrequencyPointType;
import audiogram502.DifferenceLimenFrequencyType;
import audiogram502.DifferenceLimenIntensityPointType;
import audiogram502.DifferenceLimenIntensityType;
import audiogram502.DocumentRoot;
import audiogram502.EarType;
import audiogram502.EstimatedResultByType;
import audiogram502.FrequenciesUsedForToneAverageType;
import audiogram502.HIMSAAudiometricStandardType;
import audiogram502.HearingInstrumentConditionType;
import audiogram502.InformationType;
import audiogram502.MeasurementNotesType;
import audiogram502.MostComfortableLevelType;
import audiogram502.PointStatusType;
import audiogram502.PresentationType;
import audiogram502.ShortIncrementSensitivityIndexPoint;
import audiogram502.ShortIncrementSensitivityIndexType;
import audiogram502.SignalOutputType;
import audiogram502.SignalType;
import audiogram502.SpeechDiscriminationAudiogramType;
import audiogram502.SpeechMostComfortableLevelType;
import audiogram502.SpeechReceptionThresholdAudiogramType;
import audiogram502.SpeechScorePointType;
import audiogram502.SpeechThresholdType;
import audiogram502.SpeechUncomfortableLevelType;
import audiogram502.StengerAudiogramType;
import audiogram502.SupplementaryDataType;
import audiogram502.ToneAverageType;
import audiogram502.TonePointsType;
import audiogram502.ToneThresholdAudiogramType;
import audiogram502.TransducerCalibrationStandardType;
import audiogram502.TransducerType;
import audiogram502.UncomfortableLevelType;
import audiogram502.WeberPointStatusType;
import audiogram502.WeberPointType;
import audiogram502.WeberPointsType;

import audiogram502.util.Audiogram502Validator;

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
public class Audiogram502PackageImpl extends EPackageImpl implements Audiogram502Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalMasking2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalMaskingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternateBinauralLoudnessBalanceAudiogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioMetricMeasurementConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decayAudiogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decayPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSolutionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceLimenFrequencyPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceLimenFrequencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceLimenIntensityPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceLimenIntensityTypeEClass = null;

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
	private EClass frequenciesUsedForToneAverageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass himsaAudiometricStandardTypeEClass = null;

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
	private EClass measurementNotesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mostComfortableLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortIncrementSensitivityIndexPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortIncrementSensitivityIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechDiscriminationAudiogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechMostComfortableLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechReceptionThresholdAudiogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechScorePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechUncomfortableLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stengerAudiogramTypeEClass = null;

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
	private EClass tonePointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toneThresholdAudiogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncomfortableLevelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weberPointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weberPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aidedSolutionsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auxiliaryParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dBweightingTypeEEnum = null;

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
	private EEnum estimatedResultByTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hearingInstrumentConditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pointStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationTypeEEnum = null;

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
	private EEnum speechThresholdTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toneAverageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transducerCalibrationStandardTypeEEnum = null;

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
	private EEnum weberPointStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType additionalMaskingLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType additionalMaskingLevelType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType additionalStimulusLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType additionalStimulusLevelType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aidedSolutionsTypeObjectEDataType = null;

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
	private EDataType auxiliaryParameterDescriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auxiliaryParameterTypeObjectEDataType = null;

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
	private EDataType dBweightingTypeObjectEDataType = null;

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
	private EDataType endTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType estimatedResultByTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hearingInstrumentConditionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hearingInstrumentDescriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leftEar1TypeEDataType = null;

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
	private EDataType maskingFrequencyModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingLevelType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingOffTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingOnTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingPulseCycleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingPulseModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingSiSiParameterTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maskingWarbleModulationSizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modulationSizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modulationSizeType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modulationSizeType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scorePercentTypeEDataType = null;

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
	private EDataType speechThresholdTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startTimeTypeEDataType = null;

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
	private EDataType stimulusFrequencyModulationTypeEDataType = null;

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
	private EDataType stimulusLevelType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusLevelType6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusOffTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusOnTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusPresentationTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusPulseCycleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusPulseModulationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusSignalTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusSiSiParameterTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stimulusWarbleModulationSizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testMethodTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testReliabilityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType toneAverageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transducerCalibrationStandardTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transducerDescriptionTypeEDataType = null;

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
	private EDataType versionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weberPointStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wordListNameTypeEDataType = null;

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
	 * @see audiogram502.Audiogram502Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Audiogram502PackageImpl() {
		super(eNS_URI, Audiogram502Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Audiogram502Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Audiogram502Package init() {
		if (isInited) return (Audiogram502Package)EPackage.Registry.INSTANCE.getEPackage(Audiogram502Package.eNS_URI);

		// Obtain or create and register package
		Object registeredAudiogram502Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Audiogram502PackageImpl theAudiogram502Package = registeredAudiogram502Package instanceof Audiogram502PackageImpl ? (Audiogram502PackageImpl)registeredAudiogram502Package : new Audiogram502PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdmittancePackage.eNS_URI);
		AdmittancePackageImpl theAdmittancePackage = (AdmittancePackageImpl)(registeredPackage instanceof AdmittancePackageImpl ? registeredPackage : AdmittancePackage.eINSTANCE);
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
		theAudiogram502Package.createPackageContents();
		theAdmittancePackage.createPackageContents();
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
		theAudiogram502Package.initializePackageContents();
		theAdmittancePackage.initializePackageContents();
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
			(theAudiogram502Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Audiogram502Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAudiogram502Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Audiogram502Package.eNS_URI, theAudiogram502Package);
		return theAudiogram502Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalMasking2Type() {
		return additionalMasking2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalMasking2Type_AdditionalStimulusLevel() {
		return (EAttribute)additionalMasking2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalMasking2Type_AdditionalMaskingLevel() {
		return (EAttribute)additionalMasking2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalMaskingType() {
		return additionalMaskingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalMaskingType_AdditionalStimulusLevel() {
		return (EAttribute)additionalMaskingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalMaskingType_AdditionalMaskingLevel() {
		return (EAttribute)additionalMaskingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalMaskingType_AdditionalMaskingPointStatus() {
		return (EAttribute)additionalMaskingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternateBinauralLoudnessBalanceAudiogramType() {
		return alternateBinauralLoudnessBalanceAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions() {
		return (EReference)alternateBinauralLoudnessBalanceAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints() {
		return (EReference)alternateBinauralLoudnessBalanceAudiogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioMetricMeasurementConditionsType() {
		return audioMetricMeasurementConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusSignalOutput() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingSignalOutput() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusdBWeighting() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingdBWeighting() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusPresentationType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingPresentationType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_TransducerDescription() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument1Condition() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_HearingInstrument2Condition() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_HearingInstrumentDescription() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusAuxiliary() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingAuxiliary() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_WordListName() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_SpeechThresholdType() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusOnTime() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingOnTime() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusOffTime() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingOffTime() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusSiSiParameter() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingSiSiParameter() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseModulation() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_StimulusPulseCycle() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_MaskingPulseCycle() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudioMetricMeasurementConditionsType_EstimatedResult() {
		return (EAttribute)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAudioMetricMeasurementConditionsType_DeviceSolutions() {
		return (EReference)audioMetricMeasurementConditionsTypeEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecayAudiogramType() {
		return decayAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecayAudiogramType_AudMeasurementConditions() {
		return (EReference)decayAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecayAudiogramType_DecayPoints() {
		return (EReference)decayAudiogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecayPointType() {
		return decayPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_StimulusFrequency() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_StimulusLevel() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_MaskingFrequency() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_MaskingLevel() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_StartTime() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecayPointType_EndTime() {
		return (EAttribute)decayPointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecayPointType_AdditionalMaskingPoint() {
		return (EReference)decayPointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSolutionsType() {
		return deviceSolutionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSolutionsType_RightEarDevice() {
		return (EAttribute)deviceSolutionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSolutionsType_LeftEarDevice() {
		return (EAttribute)deviceSolutionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifferenceLimenFrequencyPointType() {
		return differenceLimenFrequencyPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_StimulusFrequency() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_StimulusLevel() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_MaskingFrequency() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_MaskingLevel() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_ModulationSize() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus() {
		return (EAttribute)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenFrequencyPointType_AdditionalMaskingPoint() {
		return (EReference)differenceLimenFrequencyPointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifferenceLimenFrequencyType() {
		return differenceLimenFrequencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenFrequencyType_AudMeasurementConditions() {
		return (EReference)differenceLimenFrequencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints() {
		return (EReference)differenceLimenFrequencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifferenceLimenIntensityPointType() {
		return differenceLimenIntensityPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_StimulusFrequency() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_StimulusLevel() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_MaskingFrequency() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_MaskingLevel() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_ModulationSize() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus() {
		return (EAttribute)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenIntensityPointType_AdditionalMaskingPoint() {
		return (EReference)differenceLimenIntensityPointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifferenceLimenIntensityType() {
		return differenceLimenIntensityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenIntensityType_AudMeasurementConditions() {
		return (EReference)differenceLimenIntensityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints() {
		return (EReference)differenceLimenIntensityTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AudMeasurementConditions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HIMSAAudiometricStandard() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequenciesUsedForToneAverageType() {
		return frequenciesUsedForToneAverageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequenciesUsedForToneAverageType_LeftEar1() {
		return (EAttribute)frequenciesUsedForToneAverageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequenciesUsedForToneAverageType_LeftEar2() {
		return (EAttribute)frequenciesUsedForToneAverageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequenciesUsedForToneAverageType_RightEar1() {
		return (EAttribute)frequenciesUsedForToneAverageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequenciesUsedForToneAverageType_RightEar2() {
		return (EAttribute)frequenciesUsedForToneAverageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIMSAAudiometricStandardType() {
		return himsaAudiometricStandardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_ToneThresholdAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_UncomfortableLevel() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_MostComfortableLevel() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SpeechMostComfortableLevel() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SpeechUncomfortableLevel() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_ToneNotes() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SpeechNotes() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_DecayAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_StengerAudiogram() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_DifferenceLimenIntensity() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_DifferenceLimenFrequency() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiometricStandardType_PrivateAudiogramData() {
		return (EAttribute)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_WeberPoints() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiometricStandardType_SupplementaryData() {
		return (EReference)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiometricStandardType_ConvertedFromDataStandard() {
		return (EAttribute)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiometricStandardType_ValidatedByNOAH() {
		return (EAttribute)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiometricStandardType_Version() {
		return (EAttribute)himsaAudiometricStandardTypeEClass.getEStructuralFeatures().get(21);
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
	public EClass getMeasurementNotesType() {
		return measurementNotesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_AudiometerMakeModel() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_AudiometerSerialNumber() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_AudiometerLastCalibration() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_TestMethod() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_TestReliability() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotesType_IsDeaf() {
		return (EAttribute)measurementNotesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMostComfortableLevelType() {
		return mostComfortableLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMostComfortableLevelType_AudMeasurementConditions() {
		return (EReference)mostComfortableLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMostComfortableLevelType_TonePoints() {
		return (EReference)mostComfortableLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortIncrementSensitivityIndexPoint() {
		return shortIncrementSensitivityIndexPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_StimulusFrequency() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_StimulusLevel() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_MaskingFrequency() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_MaskingLevel() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_ModulationSize() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_NumberOfAnswers() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShortIncrementSensitivityIndexPoint_NumberOfIncrements() {
		return (EAttribute)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint() {
		return (EReference)shortIncrementSensitivityIndexPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortIncrementSensitivityIndexType() {
		return shortIncrementSensitivityIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortIncrementSensitivityIndexType_AudMeasurementConditions() {
		return (EReference)shortIncrementSensitivityIndexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints() {
		return (EReference)shortIncrementSensitivityIndexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechDiscriminationAudiogramType() {
		return speechDiscriminationAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechDiscriminationAudiogramType_AudMeasurementConditions() {
		return (EReference)speechDiscriminationAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints() {
		return (EReference)speechDiscriminationAudiogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechMostComfortableLevelType() {
		return speechMostComfortableLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechMostComfortableLevelType_AudMeasurementConditions() {
		return (EReference)speechMostComfortableLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechMostComfortableLevelType_SpeechMostComfortablePoint() {
		return (EReference)speechMostComfortableLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechReceptionThresholdAudiogramType() {
		return speechReceptionThresholdAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions() {
		return (EReference)speechReceptionThresholdAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints() {
		return (EReference)speechReceptionThresholdAudiogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechScorePointType() {
		return speechScorePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechScorePointType_StimulusLevel() {
		return (EAttribute)speechScorePointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechScorePointType_MaskingLevel() {
		return (EAttribute)speechScorePointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechScorePointType_ScorePercent() {
		return (EAttribute)speechScorePointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechScorePointType_NumberOfWords() {
		return (EAttribute)speechScorePointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeechScorePointType_SpeechPointStatus() {
		return (EAttribute)speechScorePointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechScorePointType_AdditionalMaskingPoint() {
		return (EReference)speechScorePointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeechUncomfortableLevelType() {
		return speechUncomfortableLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechUncomfortableLevelType_AudMeasurementConditions() {
		return (EReference)speechUncomfortableLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpeechUncomfortableLevelType_SpeechUncomfortablePoint() {
		return (EReference)speechUncomfortableLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStengerAudiogramType() {
		return stengerAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStengerAudiogramType_AudMeasurementConditions() {
		return (EReference)stengerAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStengerAudiogramType_StengerPoints() {
		return (EReference)stengerAudiogramTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getTonePointsType() {
		return tonePointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTonePointsType_StimulusFrequency() {
		return (EAttribute)tonePointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTonePointsType_StimulusLevel() {
		return (EAttribute)tonePointsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTonePointsType_MaskingFrequency() {
		return (EAttribute)tonePointsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTonePointsType_MaskingLevel() {
		return (EAttribute)tonePointsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTonePointsType_TonePointStatus() {
		return (EAttribute)tonePointsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTonePointsType_AdditionalMaskingPoint() {
		return (EReference)tonePointsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToneThresholdAudiogramType() {
		return toneThresholdAudiogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToneThresholdAudiogramType_AudMeasurementConditions() {
		return (EReference)toneThresholdAudiogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToneThresholdAudiogramType_TonePoints() {
		return (EReference)toneThresholdAudiogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUncomfortableLevelType() {
		return uncomfortableLevelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUncomfortableLevelType_AudMeasurementConditions() {
		return (EReference)uncomfortableLevelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUncomfortableLevelType_TonePoints() {
		return (EReference)uncomfortableLevelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeberPointsType() {
		return weberPointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeberPointsType_WeberPoint() {
		return (EReference)weberPointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeberPointType() {
		return weberPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeberPointType_StimulusFrequency() {
		return (EAttribute)weberPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeberPointType_StimulusLevel() {
		return (EAttribute)weberPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeberPointType_PointStatus() {
		return (EAttribute)weberPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAidedSolutionsType() {
		return aidedSolutionsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuxiliaryParameterType() {
		return auxiliaryParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDBweightingType() {
		return dBweightingTypeEEnum;
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
	public EEnum getEstimatedResultByType() {
		return estimatedResultByTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHearingInstrumentConditionType() {
		return hearingInstrumentConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPointStatusType() {
		return pointStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPresentationType() {
		return presentationTypeEEnum;
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
	public EEnum getSpeechThresholdType() {
		return speechThresholdTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getToneAverageType() {
		return toneAverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransducerCalibrationStandardType() {
		return transducerCalibrationStandardTypeEEnum;
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
	public EEnum getWeberPointStatusType() {
		return weberPointStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdditionalMaskingLevelType() {
		return additionalMaskingLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdditionalMaskingLevelType1() {
		return additionalMaskingLevelType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdditionalStimulusLevelType() {
		return additionalStimulusLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdditionalStimulusLevelType1() {
		return additionalStimulusLevelType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAidedSolutionsTypeObject() {
		return aidedSolutionsTypeObjectEDataType;
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
	public EDataType getAuxiliaryParameterDescriptionType() {
		return auxiliaryParameterDescriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuxiliaryParameterTypeObject() {
		return auxiliaryParameterTypeObjectEDataType;
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
	public EDataType getDBweightingTypeObject() {
		return dBweightingTypeObjectEDataType;
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
	public EDataType getEndTimeType() {
		return endTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEstimatedResultByTypeObject() {
		return estimatedResultByTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHearingInstrumentConditionTypeObject() {
		return hearingInstrumentConditionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHearingInstrumentDescriptionType() {
		return hearingInstrumentDescriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLeftEar1Type() {
		return leftEar1TypeEDataType;
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
	public EDataType getMaskingFrequencyModulationType() {
		return maskingFrequencyModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType() {
		return maskingLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType1() {
		return maskingLevelType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType2() {
		return maskingLevelType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType3() {
		return maskingLevelType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType4() {
		return maskingLevelType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingLevelType5() {
		return maskingLevelType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingOffTimeType() {
		return maskingOffTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingOnTimeType() {
		return maskingOnTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingPulseCycleType() {
		return maskingPulseCycleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingPulseModulationType() {
		return maskingPulseModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingSiSiParameterType() {
		return maskingSiSiParameterTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMaskingWarbleModulationSizeType() {
		return maskingWarbleModulationSizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModulationSizeType() {
		return modulationSizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModulationSizeType1() {
		return modulationSizeType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModulationSizeType2() {
		return modulationSizeType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPointStatusTypeObject() {
		return pointStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPresentationTypeObject() {
		return presentationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScorePercentType() {
		return scorePercentTypeEDataType;
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
	public EDataType getSpeechThresholdTypeObject() {
		return speechThresholdTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStartTimeType() {
		return startTimeTypeEDataType;
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
	public EDataType getStimulusFrequencyModulationType() {
		return stimulusFrequencyModulationTypeEDataType;
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
	public EDataType getStimulusLevelType1() {
		return stimulusLevelType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType2() {
		return stimulusLevelType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType3() {
		return stimulusLevelType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType4() {
		return stimulusLevelType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType5() {
		return stimulusLevelType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusLevelType6() {
		return stimulusLevelType6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusOffTimeType() {
		return stimulusOffTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusOnTimeType() {
		return stimulusOnTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusPresentationTypeType() {
		return stimulusPresentationTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusPulseCycleType() {
		return stimulusPulseCycleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusPulseModulationType() {
		return stimulusPulseModulationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusSignalTypeType() {
		return stimulusSignalTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusSiSiParameterType() {
		return stimulusSiSiParameterTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStimulusWarbleModulationSizeType() {
		return stimulusWarbleModulationSizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTestMethodType() {
		return testMethodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTestReliabilityType() {
		return testReliabilityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getToneAverageTypeObject() {
		return toneAverageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTransducerCalibrationStandardTypeObject() {
		return transducerCalibrationStandardTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTransducerDescriptionType() {
		return transducerDescriptionTypeEDataType;
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
	public EDataType getWeberPointStatusTypeObject() {
		return weberPointStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWordListNameType() {
		return wordListNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Audiogram502Factory getAudiogram502Factory() {
		return (Audiogram502Factory)getEFactoryInstance();
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
		additionalMasking2TypeEClass = createEClass(ADDITIONAL_MASKING2_TYPE);
		createEAttribute(additionalMasking2TypeEClass, ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL);
		createEAttribute(additionalMasking2TypeEClass, ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL);

		additionalMaskingTypeEClass = createEClass(ADDITIONAL_MASKING_TYPE);
		createEAttribute(additionalMaskingTypeEClass, ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL);
		createEAttribute(additionalMaskingTypeEClass, ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL);
		createEAttribute(additionalMaskingTypeEClass, ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS);

		alternateBinauralLoudnessBalanceAudiogramTypeEClass = createEClass(ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE);
		createEReference(alternateBinauralLoudnessBalanceAudiogramTypeEClass, ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(alternateBinauralLoudnessBalanceAudiogramTypeEClass, ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS);

		audioMetricMeasurementConditionsTypeEClass = createEClass(AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUSD_BWEIGHTING);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKINGD_BWEIGHTING);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PRESENTATION_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PRESENTATION_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__TRANSDUCER_DESCRIPTION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_CALIBRATION_STANDARD);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_CALIBRATION_STANDARD);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT1_CONDITION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT2_CONDITION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__HEARING_INSTRUMENT_DESCRIPTION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AUXILIARY);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AUXILIARY);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__WORD_LIST_NAME);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__AUXILIARY_PARAMETER_DESCRIPTION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__SPEECH_THRESHOLD_TYPE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_ON_TIME);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_ON_TIME);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_OFF_TIME);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_OFF_TIME);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SI_SI_PARAMETER);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_SI_SI_PARAMETER);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_WARBLE_MODULATION_SIZE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_WARBLE_MODULATION_SIZE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_MODULATION);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__STIMULUS_PULSE_CYCLE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__MASKING_PULSE_CYCLE);
		createEAttribute(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__ESTIMATED_RESULT);
		createEReference(audioMetricMeasurementConditionsTypeEClass, AUDIO_METRIC_MEASUREMENT_CONDITIONS_TYPE__DEVICE_SOLUTIONS);

		decayAudiogramTypeEClass = createEClass(DECAY_AUDIOGRAM_TYPE);
		createEReference(decayAudiogramTypeEClass, DECAY_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(decayAudiogramTypeEClass, DECAY_AUDIOGRAM_TYPE__DECAY_POINTS);

		decayPointTypeEClass = createEClass(DECAY_POINT_TYPE);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__STIMULUS_LEVEL);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__MASKING_FREQUENCY);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__MASKING_LEVEL);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__START_TIME);
		createEAttribute(decayPointTypeEClass, DECAY_POINT_TYPE__END_TIME);
		createEReference(decayPointTypeEClass, DECAY_POINT_TYPE__ADDITIONAL_MASKING_POINT);

		deviceSolutionsTypeEClass = createEClass(DEVICE_SOLUTIONS_TYPE);
		createEAttribute(deviceSolutionsTypeEClass, DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE);
		createEAttribute(deviceSolutionsTypeEClass, DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE);

		differenceLimenFrequencyPointTypeEClass = createEClass(DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__STIMULUS_LEVEL);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MASKING_LEVEL);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__MODULATION_SIZE);
		createEAttribute(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINT_STATUS);
		createEReference(differenceLimenFrequencyPointTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_POINT_TYPE__ADDITIONAL_MASKING_POINT);

		differenceLimenFrequencyTypeEClass = createEClass(DIFFERENCE_LIMEN_FREQUENCY_TYPE);
		createEReference(differenceLimenFrequencyTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(differenceLimenFrequencyTypeEClass, DIFFERENCE_LIMEN_FREQUENCY_TYPE__DIFFERENCE_LIMEN_FREQUENCY_POINTS);

		differenceLimenIntensityPointTypeEClass = createEClass(DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE);
		createEAttribute(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS);
		createEReference(differenceLimenIntensityPointTypeEClass, DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__ADDITIONAL_MASKING_POINT);

		differenceLimenIntensityTypeEClass = createEClass(DIFFERENCE_LIMEN_INTENSITY_TYPE);
		createEReference(differenceLimenIntensityTypeEClass, DIFFERENCE_LIMEN_INTENSITY_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(differenceLimenIntensityTypeEClass, DIFFERENCE_LIMEN_INTENSITY_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINTS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUD_MEASUREMENT_CONDITIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIMSA_AUDIOMETRIC_STANDARD);

		frequenciesUsedForToneAverageTypeEClass = createEClass(FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE);
		createEAttribute(frequenciesUsedForToneAverageTypeEClass, FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1);
		createEAttribute(frequenciesUsedForToneAverageTypeEClass, FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2);
		createEAttribute(frequenciesUsedForToneAverageTypeEClass, FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1);
		createEAttribute(frequenciesUsedForToneAverageTypeEClass, FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2);

		himsaAudiometricStandardTypeEClass = createEClass(HIMSA_AUDIOMETRIC_STANDARD_TYPE);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX);
		createEAttribute(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__WEBER_POINTS);
		createEReference(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__SUPPLEMENTARY_DATA);
		createEAttribute(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD);
		createEAttribute(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH);
		createEAttribute(himsaAudiometricStandardTypeEClass, HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION);

		informationTypeEClass = createEClass(INFORMATION_TYPE);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__COMMENTS);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__VERSION);

		measurementNotesTypeEClass = createEClass(MEASUREMENT_NOTES_TYPE);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__TEST_METHOD);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY);
		createEAttribute(measurementNotesTypeEClass, MEASUREMENT_NOTES_TYPE__IS_DEAF);

		mostComfortableLevelTypeEClass = createEClass(MOST_COMFORTABLE_LEVEL_TYPE);
		createEReference(mostComfortableLevelTypeEClass, MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(mostComfortableLevelTypeEClass, MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS);

		shortIncrementSensitivityIndexPointEClass = createEClass(SHORT_INCREMENT_SENSITIVITY_INDEX_POINT);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS);
		createEAttribute(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS);
		createEReference(shortIncrementSensitivityIndexPointEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__ADDITIONAL_MASKING_POINT);

		shortIncrementSensitivityIndexTypeEClass = createEClass(SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE);
		createEReference(shortIncrementSensitivityIndexTypeEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(shortIncrementSensitivityIndexTypeEClass, SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS);

		speechDiscriminationAudiogramTypeEClass = createEClass(SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE);
		createEReference(speechDiscriminationAudiogramTypeEClass, SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(speechDiscriminationAudiogramTypeEClass, SPEECH_DISCRIMINATION_AUDIOGRAM_TYPE__SPEECH_DISCRIMINATION_POINTS);

		speechMostComfortableLevelTypeEClass = createEClass(SPEECH_MOST_COMFORTABLE_LEVEL_TYPE);
		createEReference(speechMostComfortableLevelTypeEClass, SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(speechMostComfortableLevelTypeEClass, SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT);

		speechReceptionThresholdAudiogramTypeEClass = createEClass(SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE);
		createEReference(speechReceptionThresholdAudiogramTypeEClass, SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(speechReceptionThresholdAudiogramTypeEClass, SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS);

		speechScorePointTypeEClass = createEClass(SPEECH_SCORE_POINT_TYPE);
		createEAttribute(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL);
		createEAttribute(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL);
		createEAttribute(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT);
		createEAttribute(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS);
		createEAttribute(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS);
		createEReference(speechScorePointTypeEClass, SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT);

		speechUncomfortableLevelTypeEClass = createEClass(SPEECH_UNCOMFORTABLE_LEVEL_TYPE);
		createEReference(speechUncomfortableLevelTypeEClass, SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(speechUncomfortableLevelTypeEClass, SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT);

		stengerAudiogramTypeEClass = createEClass(STENGER_AUDIOGRAM_TYPE);
		createEReference(stengerAudiogramTypeEClass, STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(stengerAudiogramTypeEClass, STENGER_AUDIOGRAM_TYPE__STENGER_POINTS);

		supplementaryDataTypeEClass = createEClass(SUPPLEMENTARY_DATA_TYPE);
		createEReference(supplementaryDataTypeEClass, SUPPLEMENTARY_DATA_TYPE__INFORMATION);
		createEAttribute(supplementaryDataTypeEClass, SUPPLEMENTARY_DATA_TYPE__ANY);

		tonePointsTypeEClass = createEClass(TONE_POINTS_TYPE);
		createEAttribute(tonePointsTypeEClass, TONE_POINTS_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(tonePointsTypeEClass, TONE_POINTS_TYPE__STIMULUS_LEVEL);
		createEAttribute(tonePointsTypeEClass, TONE_POINTS_TYPE__MASKING_FREQUENCY);
		createEAttribute(tonePointsTypeEClass, TONE_POINTS_TYPE__MASKING_LEVEL);
		createEAttribute(tonePointsTypeEClass, TONE_POINTS_TYPE__TONE_POINT_STATUS);
		createEReference(tonePointsTypeEClass, TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT);

		toneThresholdAudiogramTypeEClass = createEClass(TONE_THRESHOLD_AUDIOGRAM_TYPE);
		createEReference(toneThresholdAudiogramTypeEClass, TONE_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(toneThresholdAudiogramTypeEClass, TONE_THRESHOLD_AUDIOGRAM_TYPE__TONE_POINTS);

		uncomfortableLevelTypeEClass = createEClass(UNCOMFORTABLE_LEVEL_TYPE);
		createEReference(uncomfortableLevelTypeEClass, UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS);
		createEReference(uncomfortableLevelTypeEClass, UNCOMFORTABLE_LEVEL_TYPE__TONE_POINTS);

		weberPointsTypeEClass = createEClass(WEBER_POINTS_TYPE);
		createEReference(weberPointsTypeEClass, WEBER_POINTS_TYPE__WEBER_POINT);

		weberPointTypeEClass = createEClass(WEBER_POINT_TYPE);
		createEAttribute(weberPointTypeEClass, WEBER_POINT_TYPE__STIMULUS_FREQUENCY);
		createEAttribute(weberPointTypeEClass, WEBER_POINT_TYPE__STIMULUS_LEVEL);
		createEAttribute(weberPointTypeEClass, WEBER_POINT_TYPE__POINT_STATUS);

		// Create enums
		aidedSolutionsTypeEEnum = createEEnum(AIDED_SOLUTIONS_TYPE);
		auxiliaryParameterTypeEEnum = createEEnum(AUXILIARY_PARAMETER_TYPE);
		dBweightingTypeEEnum = createEEnum(DBWEIGHTING_TYPE);
		earTypeEEnum = createEEnum(EAR_TYPE);
		estimatedResultByTypeEEnum = createEEnum(ESTIMATED_RESULT_BY_TYPE);
		hearingInstrumentConditionTypeEEnum = createEEnum(HEARING_INSTRUMENT_CONDITION_TYPE);
		pointStatusTypeEEnum = createEEnum(POINT_STATUS_TYPE);
		presentationTypeEEnum = createEEnum(PRESENTATION_TYPE);
		signalOutputTypeEEnum = createEEnum(SIGNAL_OUTPUT_TYPE);
		signalTypeEEnum = createEEnum(SIGNAL_TYPE);
		speechThresholdTypeEEnum = createEEnum(SPEECH_THRESHOLD_TYPE);
		toneAverageTypeEEnum = createEEnum(TONE_AVERAGE_TYPE);
		transducerCalibrationStandardTypeEEnum = createEEnum(TRANSDUCER_CALIBRATION_STANDARD_TYPE);
		transducerTypeEEnum = createEEnum(TRANSDUCER_TYPE);
		weberPointStatusTypeEEnum = createEEnum(WEBER_POINT_STATUS_TYPE);

		// Create data types
		additionalMaskingLevelTypeEDataType = createEDataType(ADDITIONAL_MASKING_LEVEL_TYPE);
		additionalMaskingLevelType1EDataType = createEDataType(ADDITIONAL_MASKING_LEVEL_TYPE1);
		additionalStimulusLevelTypeEDataType = createEDataType(ADDITIONAL_STIMULUS_LEVEL_TYPE);
		additionalStimulusLevelType1EDataType = createEDataType(ADDITIONAL_STIMULUS_LEVEL_TYPE1);
		aidedSolutionsTypeObjectEDataType = createEDataType(AIDED_SOLUTIONS_TYPE_OBJECT);
		audiometerMakeModelTypeEDataType = createEDataType(AUDIOMETER_MAKE_MODEL_TYPE);
		audiometerSerialNumberTypeEDataType = createEDataType(AUDIOMETER_SERIAL_NUMBER_TYPE);
		auxiliaryParameterDescriptionTypeEDataType = createEDataType(AUXILIARY_PARAMETER_DESCRIPTION_TYPE);
		auxiliaryParameterTypeObjectEDataType = createEDataType(AUXILIARY_PARAMETER_TYPE_OBJECT);
		convertedFromDataStandardTypeEDataType = createEDataType(CONVERTED_FROM_DATA_STANDARD_TYPE);
		dBweightingTypeObjectEDataType = createEDataType(DBWEIGHTING_TYPE_OBJECT);
		earTypeObjectEDataType = createEDataType(EAR_TYPE_OBJECT);
		endTimeTypeEDataType = createEDataType(END_TIME_TYPE);
		estimatedResultByTypeObjectEDataType = createEDataType(ESTIMATED_RESULT_BY_TYPE_OBJECT);
		hearingInstrumentConditionTypeObjectEDataType = createEDataType(HEARING_INSTRUMENT_CONDITION_TYPE_OBJECT);
		hearingInstrumentDescriptionTypeEDataType = createEDataType(HEARING_INSTRUMENT_DESCRIPTION_TYPE);
		leftEar1TypeEDataType = createEDataType(LEFT_EAR1_TYPE);
		maskingAmplitudeModulationTypeEDataType = createEDataType(MASKING_AMPLITUDE_MODULATION_TYPE);
		maskingFrequencyModulationTypeEDataType = createEDataType(MASKING_FREQUENCY_MODULATION_TYPE);
		maskingLevelTypeEDataType = createEDataType(MASKING_LEVEL_TYPE);
		maskingLevelType1EDataType = createEDataType(MASKING_LEVEL_TYPE1);
		maskingLevelType2EDataType = createEDataType(MASKING_LEVEL_TYPE2);
		maskingLevelType3EDataType = createEDataType(MASKING_LEVEL_TYPE3);
		maskingLevelType4EDataType = createEDataType(MASKING_LEVEL_TYPE4);
		maskingLevelType5EDataType = createEDataType(MASKING_LEVEL_TYPE5);
		maskingOffTimeTypeEDataType = createEDataType(MASKING_OFF_TIME_TYPE);
		maskingOnTimeTypeEDataType = createEDataType(MASKING_ON_TIME_TYPE);
		maskingPulseCycleTypeEDataType = createEDataType(MASKING_PULSE_CYCLE_TYPE);
		maskingPulseModulationTypeEDataType = createEDataType(MASKING_PULSE_MODULATION_TYPE);
		maskingSiSiParameterTypeEDataType = createEDataType(MASKING_SI_SI_PARAMETER_TYPE);
		maskingWarbleModulationSizeTypeEDataType = createEDataType(MASKING_WARBLE_MODULATION_SIZE_TYPE);
		modulationSizeTypeEDataType = createEDataType(MODULATION_SIZE_TYPE);
		modulationSizeType1EDataType = createEDataType(MODULATION_SIZE_TYPE1);
		modulationSizeType2EDataType = createEDataType(MODULATION_SIZE_TYPE2);
		pointStatusTypeObjectEDataType = createEDataType(POINT_STATUS_TYPE_OBJECT);
		presentationTypeObjectEDataType = createEDataType(PRESENTATION_TYPE_OBJECT);
		scorePercentTypeEDataType = createEDataType(SCORE_PERCENT_TYPE);
		signalOutputTypeObjectEDataType = createEDataType(SIGNAL_OUTPUT_TYPE_OBJECT);
		signalTypeObjectEDataType = createEDataType(SIGNAL_TYPE_OBJECT);
		speechThresholdTypeObjectEDataType = createEDataType(SPEECH_THRESHOLD_TYPE_OBJECT);
		startTimeTypeEDataType = createEDataType(START_TIME_TYPE);
		stimulusAmplitudeModulationTypeEDataType = createEDataType(STIMULUS_AMPLITUDE_MODULATION_TYPE);
		stimulusFrequencyModulationTypeEDataType = createEDataType(STIMULUS_FREQUENCY_MODULATION_TYPE);
		stimulusLevelTypeEDataType = createEDataType(STIMULUS_LEVEL_TYPE);
		stimulusLevelType1EDataType = createEDataType(STIMULUS_LEVEL_TYPE1);
		stimulusLevelType2EDataType = createEDataType(STIMULUS_LEVEL_TYPE2);
		stimulusLevelType3EDataType = createEDataType(STIMULUS_LEVEL_TYPE3);
		stimulusLevelType4EDataType = createEDataType(STIMULUS_LEVEL_TYPE4);
		stimulusLevelType5EDataType = createEDataType(STIMULUS_LEVEL_TYPE5);
		stimulusLevelType6EDataType = createEDataType(STIMULUS_LEVEL_TYPE6);
		stimulusOffTimeTypeEDataType = createEDataType(STIMULUS_OFF_TIME_TYPE);
		stimulusOnTimeTypeEDataType = createEDataType(STIMULUS_ON_TIME_TYPE);
		stimulusPresentationTypeTypeEDataType = createEDataType(STIMULUS_PRESENTATION_TYPE_TYPE);
		stimulusPulseCycleTypeEDataType = createEDataType(STIMULUS_PULSE_CYCLE_TYPE);
		stimulusPulseModulationTypeEDataType = createEDataType(STIMULUS_PULSE_MODULATION_TYPE);
		stimulusSignalTypeTypeEDataType = createEDataType(STIMULUS_SIGNAL_TYPE_TYPE);
		stimulusSiSiParameterTypeEDataType = createEDataType(STIMULUS_SI_SI_PARAMETER_TYPE);
		stimulusWarbleModulationSizeTypeEDataType = createEDataType(STIMULUS_WARBLE_MODULATION_SIZE_TYPE);
		testMethodTypeEDataType = createEDataType(TEST_METHOD_TYPE);
		testReliabilityTypeEDataType = createEDataType(TEST_RELIABILITY_TYPE);
		toneAverageTypeObjectEDataType = createEDataType(TONE_AVERAGE_TYPE_OBJECT);
		transducerCalibrationStandardTypeObjectEDataType = createEDataType(TRANSDUCER_CALIBRATION_STANDARD_TYPE_OBJECT);
		transducerDescriptionTypeEDataType = createEDataType(TRANSDUCER_DESCRIPTION_TYPE);
		transducerTypeObjectEDataType = createEDataType(TRANSDUCER_TYPE_OBJECT);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
		versionType1EDataType = createEDataType(VERSION_TYPE1);
		weberPointStatusTypeObjectEDataType = createEDataType(WEBER_POINT_STATUS_TYPE_OBJECT);
		wordListNameTypeEDataType = createEDataType(WORD_LIST_NAME_TYPE);
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
		initEClass(additionalMasking2TypeEClass, AdditionalMasking2Type.class, "AdditionalMasking2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalMasking2Type_AdditionalStimulusLevel(), this.getAdditionalStimulusLevelType(), "additionalStimulusLevel", null, 1, 1, AdditionalMasking2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdditionalMasking2Type_AdditionalMaskingLevel(), this.getAdditionalMaskingLevelType(), "additionalMaskingLevel", null, 1, 1, AdditionalMasking2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalMaskingTypeEClass, AdditionalMaskingType.class, "AdditionalMaskingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalMaskingType_AdditionalStimulusLevel(), this.getAdditionalStimulusLevelType1(), "additionalStimulusLevel", null, 1, 1, AdditionalMaskingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdditionalMaskingType_AdditionalMaskingLevel(), this.getAdditionalMaskingLevelType1(), "additionalMaskingLevel", null, 1, 1, AdditionalMaskingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdditionalMaskingType_AdditionalMaskingPointStatus(), this.getPointStatusType(), "additionalMaskingPointStatus", null, 1, 1, AdditionalMaskingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternateBinauralLoudnessBalanceAudiogramTypeEClass, AlternateBinauralLoudnessBalanceAudiogramType.class, "AlternateBinauralLoudnessBalanceAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, AlternateBinauralLoudnessBalanceAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints(), this.getTonePointsType(), null, "alternateBinauralLoudnessBalancePoints", null, 1, 192, AlternateBinauralLoudnessBalanceAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioMetricMeasurementConditionsTypeEClass, AudioMetricMeasurementConditionsType.class, "AudioMetricMeasurementConditionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusSignalType(), this.getStimulusSignalTypeType(), "stimulusSignalType", "NoSignalApplied", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingSignalType(), this.getSignalType(), "maskingSignalType", "NoSignalApplied", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusSignalOutput(), this.getSignalOutputType(), "stimulusSignalOutput", "NoSignalOutput", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingSignalOutput(), this.getSignalOutputType(), "maskingSignalOutput", "NoSignalOutput", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusdBWeighting(), this.getDBweightingType(), "stimulusdBWeighting", "NodBWeighting", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingdBWeighting(), this.getDBweightingType(), "maskingdBWeighting", "NodBWeighting", 1, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusPresentationType(), this.getStimulusPresentationTypeType(), "stimulusPresentationType", "NoPresentationType", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingPresentationType(), this.getPresentationType(), "maskingPresentationType", "NoPresentationType", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusTransducerType(), this.getTransducerType(), "stimulusTransducerType", "NoTransducerType", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingTransducerType(), this.getTransducerType(), "maskingTransducerType", "NoTransducerType", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_TransducerDescription(), this.getTransducerDescriptionType(), "transducerDescription", "", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard(), this.getTransducerCalibrationStandardType(), "stimulusTransducerCalibrationStandard", "NoTransducerCalibrationStandard", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard(), this.getTransducerCalibrationStandardType(), "maskingTransducerCalibrationStandard", "NoTransducerCalibrationStandard", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_HearingInstrument1Condition(), this.getHearingInstrumentConditionType(), "hearingInstrument1Condition", "NoCondition", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_HearingInstrument2Condition(), this.getHearingInstrumentConditionType(), "hearingInstrument2Condition", "NoCondition", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_HearingInstrumentDescription(), this.getHearingInstrumentDescriptionType(), "hearingInstrumentDescription", "", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusAuxiliary(), this.getAuxiliaryParameterType(), "stimulusAuxiliary", "NoAuxiliaryParameter", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingAuxiliary(), this.getAuxiliaryParameterType(), "maskingAuxiliary", "NoAuxiliaryParameter", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_WordListName(), this.getWordListNameType(), "wordListName", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription(), this.getAuxiliaryParameterDescriptionType(), "auxiliaryParameterDescription", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_SpeechThresholdType(), this.getSpeechThresholdType(), "speechThresholdType", "NotUsed", 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusOnTime(), this.getStimulusOnTimeType(), "stimulusOnTime", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingOnTime(), this.getMaskingOnTimeType(), "maskingOnTime", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusOffTime(), this.getStimulusOffTimeType(), "stimulusOffTime", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingOffTime(), this.getMaskingOffTimeType(), "maskingOffTime", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusSiSiParameter(), this.getStimulusSiSiParameterType(), "stimulusSiSiParameter", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingSiSiParameter(), this.getMaskingSiSiParameterType(), "maskingSiSiParameter", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusWarbleModulation(), theXMLTypePackage.getInteger(), "stimulusWarbleModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingWarbleModulation(), theXMLTypePackage.getInteger(), "maskingWarbleModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize(), this.getStimulusWarbleModulationSizeType(), "stimulusWarbleModulationSize", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize(), this.getMaskingWarbleModulationSizeType(), "maskingWarbleModulationSize", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation(), this.getStimulusFrequencyModulationType(), "stimulusFrequencyModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation(), this.getMaskingFrequencyModulationType(), "maskingFrequencyModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation(), this.getStimulusAmplitudeModulationType(), "stimulusAmplitudeModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation(), this.getMaskingAmplitudeModulationType(), "maskingAmplitudeModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusPulseModulation(), this.getStimulusPulseModulationType(), "stimulusPulseModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingPulseModulation(), this.getMaskingPulseModulationType(), "maskingPulseModulation", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_StimulusPulseCycle(), this.getStimulusPulseCycleType(), "stimulusPulseCycle", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_MaskingPulseCycle(), this.getMaskingPulseCycleType(), "maskingPulseCycle", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioMetricMeasurementConditionsType_EstimatedResult(), this.getEstimatedResultByType(), "estimatedResult", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioMetricMeasurementConditionsType_DeviceSolutions(), this.getDeviceSolutionsType(), null, "deviceSolutions", null, 0, 1, AudioMetricMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decayAudiogramTypeEClass, DecayAudiogramType.class, "DecayAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecayAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, DecayAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecayAudiogramType_DecayPoints(), this.getDecayPointType(), null, "decayPoints", null, 1, 50, DecayAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decayPointTypeEClass, DecayPointType.class, "DecayPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecayPointType_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecayPointType_StimulusLevel(), this.getStimulusLevelType3(), "stimulusLevel", null, 1, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecayPointType_MaskingFrequency(), theXMLTypePackage.getInteger(), "maskingFrequency", null, 0, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecayPointType_MaskingLevel(), this.getMaskingLevelType1(), "maskingLevel", null, 0, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecayPointType_StartTime(), this.getStartTimeType(), "startTime", null, 1, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecayPointType_EndTime(), this.getEndTimeType(), "endTime", null, 1, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecayPointType_AdditionalMaskingPoint(), this.getAdditionalMasking2Type(), null, "additionalMaskingPoint", null, 0, 1, DecayPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSolutionsTypeEClass, DeviceSolutionsType.class, "DeviceSolutionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceSolutionsType_RightEarDevice(), this.getAidedSolutionsType(), "rightEarDevice", "None ", 1, 1, DeviceSolutionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceSolutionsType_LeftEarDevice(), this.getAidedSolutionsType(), "leftEarDevice", "None ", 1, 1, DeviceSolutionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differenceLimenFrequencyPointTypeEClass, DifferenceLimenFrequencyPointType.class, "DifferenceLimenFrequencyPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifferenceLimenFrequencyPointType_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenFrequencyPointType_StimulusLevel(), this.getStimulusLevelType1(), "stimulusLevel", null, 1, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenFrequencyPointType_MaskingFrequency(), theXMLTypePackage.getInteger(), "maskingFrequency", null, 0, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenFrequencyPointType_MaskingLevel(), this.getMaskingLevelType4(), "maskingLevel", null, 0, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenFrequencyPointType_ModulationSize(), this.getModulationSizeType1(), "modulationSize", null, 1, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus(), this.getPointStatusType(), "differenceLimenFrequencyPointStatus", null, 1, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferenceLimenFrequencyPointType_AdditionalMaskingPoint(), this.getAdditionalMaskingType(), null, "additionalMaskingPoint", null, 0, 1, DifferenceLimenFrequencyPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differenceLimenFrequencyTypeEClass, DifferenceLimenFrequencyType.class, "DifferenceLimenFrequencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferenceLimenFrequencyType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, DifferenceLimenFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints(), this.getDifferenceLimenFrequencyPointType(), null, "differenceLimenFrequencyPoints", null, 1, 24, DifferenceLimenFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differenceLimenIntensityPointTypeEClass, DifferenceLimenIntensityPointType.class, "DifferenceLimenIntensityPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifferenceLimenIntensityPointType_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenIntensityPointType_StimulusLevel(), this.getStimulusLevelType4(), "stimulusLevel", null, 1, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenIntensityPointType_MaskingFrequency(), theXMLTypePackage.getInteger(), "maskingFrequency", null, 0, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenIntensityPointType_MaskingLevel(), this.getMaskingLevelType(), "maskingLevel", null, 0, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenIntensityPointType_ModulationSize(), this.getModulationSizeType2(), "modulationSize", null, 1, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus(), this.getPointStatusType(), "differenceLimenIntensityPointStatus", null, 1, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferenceLimenIntensityPointType_AdditionalMaskingPoint(), this.getAdditionalMaskingType(), null, "additionalMaskingPoint", null, 0, 1, DifferenceLimenIntensityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differenceLimenIntensityTypeEClass, DifferenceLimenIntensityType.class, "DifferenceLimenIntensityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferenceLimenIntensityType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, DifferenceLimenIntensityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints(), this.getDifferenceLimenIntensityPointType(), null, "differenceLimenIntensityPoints", null, 1, 24, DifferenceLimenIntensityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HIMSAAudiometricStandard(), this.getHIMSAAudiometricStandardType(), null, "hIMSAAudiometricStandard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(frequenciesUsedForToneAverageTypeEClass, FrequenciesUsedForToneAverageType.class, "FrequenciesUsedForToneAverageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequenciesUsedForToneAverageType_LeftEar1(), this.getLeftEar1Type(), "leftEar1", null, 0, 13, FrequenciesUsedForToneAverageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequenciesUsedForToneAverageType_LeftEar2(), this.getToneAverageType(), "leftEar2", null, 0, 13, FrequenciesUsedForToneAverageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequenciesUsedForToneAverageType_RightEar1(), this.getToneAverageType(), "rightEar1", null, 0, 13, FrequenciesUsedForToneAverageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequenciesUsedForToneAverageType_RightEar2(), this.getToneAverageType(), "rightEar2", null, 0, 13, FrequenciesUsedForToneAverageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(himsaAudiometricStandardTypeEClass, HIMSAAudiometricStandardType.class, "HIMSAAudiometricStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHIMSAAudiometricStandardType_ToneThresholdAudiogram(), this.getToneThresholdAudiogramType(), null, "toneThresholdAudiogram", null, 0, 18, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_UncomfortableLevel(), this.getUncomfortableLevelType(), null, "uncomfortableLevel", null, 0, 6, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_MostComfortableLevel(), this.getMostComfortableLevelType(), null, "mostComfortableLevel", null, 0, 6, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram(), this.getSpeechDiscriminationAudiogramType(), null, "speechDiscriminationAudiogram", null, 0, 12, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram(), this.getSpeechReceptionThresholdAudiogramType(), null, "speechReceptionThresholdAudiogram", null, 0, 12, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SpeechMostComfortableLevel(), this.getSpeechMostComfortableLevelType(), null, "speechMostComfortableLevel", null, 0, 12, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SpeechUncomfortableLevel(), this.getSpeechUncomfortableLevelType(), null, "speechUncomfortableLevel", null, 0, 12, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_ToneNotes(), this.getMeasurementNotesType(), null, "toneNotes", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SpeechNotes(), this.getMeasurementNotesType(), null, "speechNotes", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage(), this.getFrequenciesUsedForToneAverageType(), null, "frequenciesUsedForToneAverage", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_DecayAudiogram(), this.getDecayAudiogramType(), null, "decayAudiogram", null, 0, 2, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram(), this.getAlternateBinauralLoudnessBalanceAudiogramType(), null, "alternateBinauralLoudnessBalanceAudiogram", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_StengerAudiogram(), this.getStengerAudiogramType(), null, "stengerAudiogram", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_DifferenceLimenIntensity(), this.getDifferenceLimenIntensityType(), null, "differenceLimenIntensity", null, 0, 2, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_DifferenceLimenFrequency(), this.getDifferenceLimenFrequencyType(), null, "differenceLimenFrequency", null, 0, 2, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex(), this.getShortIncrementSensitivityIndexType(), null, "shortIncrementSensitivityIndex", null, 0, 2, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAAudiometricStandardType_PrivateAudiogramData(), theXMLTypePackage.getBase64Binary(), "privateAudiogramData", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_WeberPoints(), this.getWeberPointsType(), null, "weberPoints", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiometricStandardType_SupplementaryData(), this.getSupplementaryDataType(), null, "supplementaryData", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAAudiometricStandardType_ConvertedFromDataStandard(), this.getConvertedFromDataStandardType(), "convertedFromDataStandard", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAAudiometricStandardType_ValidatedByNOAH(), theXMLTypePackage.getBoolean(), "validatedByNOAH", null, 0, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAAudiometricStandardType_Version(), this.getVersionType(), "version", "502", 1, 1, HIMSAAudiometricStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTypeEClass, InformationType.class, "InformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationType_Comments(), theXMLTypePackage.getAnySimpleType(), "comments", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationType_Version(), this.getVersionType1(), "version", null, 1, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementNotesTypeEClass, MeasurementNotesType.class, "MeasurementNotesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementNotesType_AudiometerMakeModel(), this.getAudiometerMakeModelType(), "audiometerMakeModel", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_AudiometerSerialNumber(), this.getAudiometerSerialNumberType(), "audiometerSerialNumber", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_AudiometerLastCalibration(), theXMLTypePackage.getDateTime(), "audiometerLastCalibration", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_TestMethod(), this.getTestMethodType(), "testMethod", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_TestReliability(), this.getTestReliabilityType(), "testReliability", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotesType_IsDeaf(), this.getEarType(), "isDeaf", null, 0, 1, MeasurementNotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mostComfortableLevelTypeEClass, MostComfortableLevelType.class, "MostComfortableLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMostComfortableLevelType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, MostComfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMostComfortableLevelType_TonePoints(), this.getTonePointsType(), null, "tonePoints", null, 1, 24, MostComfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortIncrementSensitivityIndexPointEClass, ShortIncrementSensitivityIndexPoint.class, "ShortIncrementSensitivityIndexPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortIncrementSensitivityIndexPoint_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_StimulusLevel(), this.getStimulusLevelType(), "stimulusLevel", null, 1, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_MaskingFrequency(), theXMLTypePackage.getInteger(), "maskingFrequency", null, 0, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_MaskingLevel(), this.getMaskingLevelType2(), "maskingLevel", null, 0, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_ModulationSize(), this.getModulationSizeType(), "modulationSize", null, 1, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_NumberOfAnswers(), theXMLTypePackage.getInteger(), "numberOfAnswers", null, 1, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIncrementSensitivityIndexPoint_NumberOfIncrements(), theXMLTypePackage.getInteger(), "numberOfIncrements", null, 1, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint(), this.getAdditionalMasking2Type(), null, "additionalMaskingPoint", null, 0, 1, ShortIncrementSensitivityIndexPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortIncrementSensitivityIndexTypeEClass, ShortIncrementSensitivityIndexType.class, "ShortIncrementSensitivityIndexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortIncrementSensitivityIndexType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, ShortIncrementSensitivityIndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints(), this.getShortIncrementSensitivityIndexPoint(), null, "shortIncrementSensitivityIndexPoints", null, 1, 24, ShortIncrementSensitivityIndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechDiscriminationAudiogramTypeEClass, SpeechDiscriminationAudiogramType.class, "SpeechDiscriminationAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeechDiscriminationAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, SpeechDiscriminationAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints(), this.getSpeechScorePointType(), null, "speechDiscriminationPoints", null, 1, 24, SpeechDiscriminationAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechMostComfortableLevelTypeEClass, SpeechMostComfortableLevelType.class, "SpeechMostComfortableLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeechMostComfortableLevelType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, SpeechMostComfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechMostComfortableLevelType_SpeechMostComfortablePoint(), this.getSpeechScorePointType(), null, "speechMostComfortablePoint", null, 1, 1, SpeechMostComfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechReceptionThresholdAudiogramTypeEClass, SpeechReceptionThresholdAudiogramType.class, "SpeechReceptionThresholdAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, SpeechReceptionThresholdAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints(), this.getSpeechScorePointType(), null, "speechReceptionPoints", null, 1, 24, SpeechReceptionThresholdAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechScorePointTypeEClass, SpeechScorePointType.class, "SpeechScorePointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechScorePointType_StimulusLevel(), this.getStimulusLevelType5(), "stimulusLevel", null, 1, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechScorePointType_MaskingLevel(), this.getMaskingLevelType3(), "maskingLevel", null, 0, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechScorePointType_ScorePercent(), this.getScorePercentType(), "scorePercent", null, 1, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechScorePointType_NumberOfWords(), theXMLTypePackage.getInteger(), "numberOfWords", null, 0, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechScorePointType_SpeechPointStatus(), this.getPointStatusType(), "speechPointStatus", null, 1, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechScorePointType_AdditionalMaskingPoint(), this.getAdditionalMaskingType(), null, "additionalMaskingPoint", null, 0, 1, SpeechScorePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechUncomfortableLevelTypeEClass, SpeechUncomfortableLevelType.class, "SpeechUncomfortableLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeechUncomfortableLevelType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, SpeechUncomfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeechUncomfortableLevelType_SpeechUncomfortablePoint(), this.getSpeechScorePointType(), null, "speechUncomfortablePoint", null, 1, 1, SpeechUncomfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stengerAudiogramTypeEClass, StengerAudiogramType.class, "StengerAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStengerAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, StengerAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStengerAudiogramType_StengerPoints(), this.getTonePointsType(), null, "stengerPoints", null, 1, 24, StengerAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplementaryDataTypeEClass, SupplementaryDataType.class, "SupplementaryDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplementaryDataType_Information(), this.getInformationType(), null, "information", null, 1, 1, SupplementaryDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplementaryDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, SupplementaryDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tonePointsTypeEClass, TonePointsType.class, "TonePointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTonePointsType_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTonePointsType_StimulusLevel(), this.getStimulusLevelType6(), "stimulusLevel", null, 1, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTonePointsType_MaskingFrequency(), theXMLTypePackage.getInteger(), "maskingFrequency", null, 0, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTonePointsType_MaskingLevel(), this.getMaskingLevelType5(), "maskingLevel", null, 0, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTonePointsType_TonePointStatus(), this.getPointStatusType(), "tonePointStatus", null, 1, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTonePointsType_AdditionalMaskingPoint(), this.getAdditionalMaskingType(), null, "additionalMaskingPoint", null, 0, 1, TonePointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toneThresholdAudiogramTypeEClass, ToneThresholdAudiogramType.class, "ToneThresholdAudiogramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToneThresholdAudiogramType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, ToneThresholdAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToneThresholdAudiogramType_TonePoints(), this.getTonePointsType(), null, "tonePoints", null, 1, 24, ToneThresholdAudiogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncomfortableLevelTypeEClass, UncomfortableLevelType.class, "UncomfortableLevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUncomfortableLevelType_AudMeasurementConditions(), this.getAudioMetricMeasurementConditionsType(), null, "audMeasurementConditions", null, 1, 1, UncomfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncomfortableLevelType_TonePoints(), this.getTonePointsType(), null, "tonePoints", null, 1, 24, UncomfortableLevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weberPointsTypeEClass, WeberPointsType.class, "WeberPointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeberPointsType_WeberPoint(), this.getWeberPointType(), null, "weberPoint", null, 1, 8, WeberPointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weberPointTypeEClass, WeberPointType.class, "WeberPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeberPointType_StimulusFrequency(), theXMLTypePackage.getInteger(), "stimulusFrequency", null, 1, 1, WeberPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeberPointType_StimulusLevel(), this.getStimulusLevelType2(), "stimulusLevel", null, 1, 1, WeberPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeberPointType_PointStatus(), this.getWeberPointStatusType(), "pointStatus", null, 1, 1, WeberPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aidedSolutionsTypeEEnum, AidedSolutionsType.class, "AidedSolutionsType");
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.NONE);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.EAR_OCCLUDED);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.ACOUSTIC_HEARING_AID);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.BONE_CONDUCTION_HEARING_AID);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.BONE_ANCHORED_HEARING_AID);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.COCHLEAR_IMPLANT);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.ELECTROACOUSTIC_STIMULATION);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.MIDDLE_EAR_IMPLANT);
		addEEnumLiteral(aidedSolutionsTypeEEnum, AidedSolutionsType.AUDITORY_BRAINSTEM_IMPLANT);

		initEEnum(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.class, "AuxiliaryParameterType");
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.UNKNOWN);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.NO_AUXILIARY_PARAMETER);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.MONO_SYLLABIC_WORDS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.MULTI_SYLLABIC_WORDS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.DICHOTIC_WORDS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.FREIBURGER);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.REIM);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.NUMERALS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.SPONDAIC_WORDS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.CONVERSATIONAL_SPEECH);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.PHONETICALLY_BALANCED);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.SENTENCE_MATERIAL);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.BODY_PARTS);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.USER1);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.USER2);
		addEEnumLiteral(auxiliaryParameterTypeEEnum, AuxiliaryParameterType.USER3);

		initEEnum(dBweightingTypeEEnum, DBweightingType.class, "DBweightingType");
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.UNKNOWN);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.NOD_BWEIGHTING);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.HL);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.SPL);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.ABS);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.CSL);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.USER1);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.USER2);
		addEEnumLiteral(dBweightingTypeEEnum, DBweightingType.USER3);

		initEEnum(earTypeEEnum, EarType.class, "EarType");
		addEEnumLiteral(earTypeEEnum, EarType.RIGHT);
		addEEnumLiteral(earTypeEEnum, EarType.LEFT);
		addEEnumLiteral(earTypeEEnum, EarType.BINAURAL);

		initEEnum(estimatedResultByTypeEEnum, EstimatedResultByType.class, "EstimatedResultByType");
		addEEnumLiteral(estimatedResultByTypeEEnum, EstimatedResultByType.ASSR);
		addEEnumLiteral(estimatedResultByTypeEEnum, EstimatedResultByType.ABR);
		addEEnumLiteral(estimatedResultByTypeEEnum, EstimatedResultByType.OTHER);

		initEEnum(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.class, "HearingInstrumentConditionType");
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.UNKNOWN);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.NO_CONDITION);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.UN_AIDED);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.AIDED1);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.AIDED2);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.USER1);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.USER2);
		addEEnumLiteral(hearingInstrumentConditionTypeEEnum, HearingInstrumentConditionType.USER3);

		initEEnum(pointStatusTypeEEnum, PointStatusType.class, "PointStatusType");
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.UNKNOWN);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.NORMAL);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.ALWAYS_RESPONSE);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.NO_RESPONSE);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.NOT_MEASURABLE);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.DID_NOT_TEST);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.COULD_NOT_TEST);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.USER1);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.USER2);
		addEEnumLiteral(pointStatusTypeEEnum, PointStatusType.USER3);

		initEEnum(presentationTypeEEnum, PresentationType.class, "PresentationType");
		addEEnumLiteral(presentationTypeEEnum, PresentationType.UNKNOWN);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.NO_PRESENTATION_TYPE);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.CONTINUOUS);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.PULSED_PRESENTATION);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.ALTERNATING);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.AMPLITUDE_MODULATED);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.STEPWISE_FREQUENCY_MODULATED);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.IMPULSE);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.SI_SI_SIGNAL);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.USER1);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.USER2);
		addEEnumLiteral(presentationTypeEEnum, PresentationType.USER3);

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
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER1);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER2);
		addEEnumLiteral(signalOutputTypeEEnum, SignalOutputType.USER3);

		initEEnum(signalTypeEEnum, SignalType.class, "SignalType");
		addEEnumLiteral(signalTypeEEnum, SignalType.UNKNOWN);
		addEEnumLiteral(signalTypeEEnum, SignalType.NO_SIGNAL_APPLIED);
		addEEnumLiteral(signalTypeEEnum, SignalType.PURE_TONE);
		addEEnumLiteral(signalTypeEEnum, SignalType.WARBLE);
		addEEnumLiteral(signalTypeEEnum, SignalType.NARROW_BAND_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.SPEECH_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.WHITE_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.PINK_NOISE);
		addEEnumLiteral(signalTypeEEnum, SignalType.AUXILIARY_SIGNAL);
		addEEnumLiteral(signalTypeEEnum, SignalType.MICROPHONE);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER1);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER2);
		addEEnumLiteral(signalTypeEEnum, SignalType.USER3);

		initEEnum(speechThresholdTypeEEnum, SpeechThresholdType.class, "SpeechThresholdType");
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.UNKNOWN);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.NOT_USED);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.SRT);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.SDT);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.SAT);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.USER1);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.USER2);
		addEEnumLiteral(speechThresholdTypeEEnum, SpeechThresholdType.USER3);

		initEEnum(toneAverageTypeEEnum, ToneAverageType.class, "ToneAverageType");
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._125);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._250);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._500);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._750);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._1000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._1500);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._2000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._3000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._4000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._6000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._8000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._12000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType._16000);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType.USER1);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType.USER2);
		addEEnumLiteral(toneAverageTypeEEnum, ToneAverageType.USER3);

		initEEnum(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.class, "TransducerCalibrationStandardType");
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.UNKNOWN);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.NO_TRANSDUCER_CALIBRATION_STANDARD);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO389);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO389FFEQ);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO7566);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO7566FFEQ);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO8798);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO8798FFEQ);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO226);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ISO226FFEQ);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ANSIS36);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.ANSIS36FFEQ);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.USER1);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.USER2);
		addEEnumLiteral(transducerCalibrationStandardTypeEEnum, TransducerCalibrationStandardType.USER3);

		initEEnum(transducerTypeEEnum, TransducerType.class, "TransducerType");
		addEEnumLiteral(transducerTypeEEnum, TransducerType.UNKNOWN);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.NO_TRANSDUCER_TYPE);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH39);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HDA200);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE3A);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DT48);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH49);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B71);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B72);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.BEOTON);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMBERG);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.USER1);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.USER2);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.USER3);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE5A);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.EARTONE3_AABR);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.TDH50);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.IP30);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD45);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.B81);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.DD65);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMCO_PD81);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HOLMCO_PD95);
		addEEnumLiteral(transducerTypeEEnum, TransducerType.HDA280);

		initEEnum(weberPointStatusTypeEEnum, WeberPointStatusType.class, "WeberPointStatusType");
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.RIGHT);
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.LEFT);
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.CENTER);
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.NO_RESPONSE);
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.NOT_AUDIBLE);
		addEEnumLiteral(weberPointStatusTypeEEnum, WeberPointStatusType.AUDIBLE_BUT_CANT_TELL_WHICH_SIDE);

		// Initialize data types
		initEDataType(additionalMaskingLevelTypeEDataType, BigDecimal.class, "AdditionalMaskingLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(additionalMaskingLevelType1EDataType, BigDecimal.class, "AdditionalMaskingLevelType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(additionalStimulusLevelTypeEDataType, BigDecimal.class, "AdditionalStimulusLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(additionalStimulusLevelType1EDataType, BigDecimal.class, "AdditionalStimulusLevelType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(aidedSolutionsTypeObjectEDataType, AidedSolutionsType.class, "AidedSolutionsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(audiometerMakeModelTypeEDataType, String.class, "AudiometerMakeModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(audiometerSerialNumberTypeEDataType, String.class, "AudiometerSerialNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(auxiliaryParameterDescriptionTypeEDataType, String.class, "AuxiliaryParameterDescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(auxiliaryParameterTypeObjectEDataType, AuxiliaryParameterType.class, "AuxiliaryParameterTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(convertedFromDataStandardTypeEDataType, BigInteger.class, "ConvertedFromDataStandardType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dBweightingTypeObjectEDataType, DBweightingType.class, "DBweightingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(earTypeObjectEDataType, EarType.class, "EarTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endTimeTypeEDataType, BigDecimal.class, "EndTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(estimatedResultByTypeObjectEDataType, EstimatedResultByType.class, "EstimatedResultByTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hearingInstrumentConditionTypeObjectEDataType, HearingInstrumentConditionType.class, "HearingInstrumentConditionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hearingInstrumentDescriptionTypeEDataType, String.class, "HearingInstrumentDescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(leftEar1TypeEDataType, ToneAverageType.class, "LeftEar1Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingAmplitudeModulationTypeEDataType, BigDecimal.class, "MaskingAmplitudeModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingFrequencyModulationTypeEDataType, BigDecimal.class, "MaskingFrequencyModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelTypeEDataType, BigDecimal.class, "MaskingLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelType1EDataType, BigDecimal.class, "MaskingLevelType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelType2EDataType, BigDecimal.class, "MaskingLevelType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelType3EDataType, BigDecimal.class, "MaskingLevelType3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelType4EDataType, BigDecimal.class, "MaskingLevelType4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingLevelType5EDataType, BigDecimal.class, "MaskingLevelType5", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingOffTimeTypeEDataType, BigDecimal.class, "MaskingOffTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingOnTimeTypeEDataType, BigDecimal.class, "MaskingOnTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingPulseCycleTypeEDataType, BigDecimal.class, "MaskingPulseCycleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingPulseModulationTypeEDataType, BigDecimal.class, "MaskingPulseModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingSiSiParameterTypeEDataType, BigDecimal.class, "MaskingSiSiParameterType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maskingWarbleModulationSizeTypeEDataType, BigDecimal.class, "MaskingWarbleModulationSizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modulationSizeTypeEDataType, BigDecimal.class, "ModulationSizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modulationSizeType1EDataType, BigDecimal.class, "ModulationSizeType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modulationSizeType2EDataType, BigDecimal.class, "ModulationSizeType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointStatusTypeObjectEDataType, PointStatusType.class, "PointStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(presentationTypeObjectEDataType, PresentationType.class, "PresentationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scorePercentTypeEDataType, BigDecimal.class, "ScorePercentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalOutputTypeObjectEDataType, SignalOutputType.class, "SignalOutputTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalTypeObjectEDataType, SignalType.class, "SignalTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(speechThresholdTypeObjectEDataType, SpeechThresholdType.class, "SpeechThresholdTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(startTimeTypeEDataType, BigDecimal.class, "StartTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusAmplitudeModulationTypeEDataType, BigDecimal.class, "StimulusAmplitudeModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusFrequencyModulationTypeEDataType, BigDecimal.class, "StimulusFrequencyModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelTypeEDataType, BigDecimal.class, "StimulusLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType1EDataType, BigDecimal.class, "StimulusLevelType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType2EDataType, BigDecimal.class, "StimulusLevelType2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType3EDataType, BigDecimal.class, "StimulusLevelType3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType4EDataType, BigDecimal.class, "StimulusLevelType4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType5EDataType, BigDecimal.class, "StimulusLevelType5", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusLevelType6EDataType, BigDecimal.class, "StimulusLevelType6", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusOffTimeTypeEDataType, BigDecimal.class, "StimulusOffTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusOnTimeTypeEDataType, BigDecimal.class, "StimulusOnTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusPresentationTypeTypeEDataType, PresentationType.class, "StimulusPresentationTypeType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusPulseCycleTypeEDataType, BigDecimal.class, "StimulusPulseCycleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusPulseModulationTypeEDataType, BigDecimal.class, "StimulusPulseModulationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusSignalTypeTypeEDataType, SignalType.class, "StimulusSignalTypeType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusSiSiParameterTypeEDataType, BigDecimal.class, "StimulusSiSiParameterType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stimulusWarbleModulationSizeTypeEDataType, BigDecimal.class, "StimulusWarbleModulationSizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(testMethodTypeEDataType, String.class, "TestMethodType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(testReliabilityTypeEDataType, String.class, "TestReliabilityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(toneAverageTypeObjectEDataType, ToneAverageType.class, "ToneAverageTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transducerCalibrationStandardTypeObjectEDataType, TransducerCalibrationStandardType.class, "TransducerCalibrationStandardTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transducerDescriptionTypeEDataType, String.class, "TransducerDescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transducerTypeObjectEDataType, TransducerType.class, "TransducerTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, BigInteger.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionType1EDataType, BigInteger.class, "VersionType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(weberPointStatusTypeObjectEDataType, WeberPointStatusType.class, "WeberPointStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wordListNameTypeEDataType, String.class, "WordListNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (additionalMasking2TypeEClass,
		   source,
		   new String[] {
			   "name", "AdditionalMasking2_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdditionalMasking2Type_AdditionalStimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalStimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalMasking2Type_AdditionalMaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (additionalMaskingLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "AdditionalMaskingLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (additionalMaskingLevelType1EDataType,
		   source,
		   new String[] {
			   "name", "AdditionalMaskingLevel_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (additionalMaskingTypeEClass,
		   source,
		   new String[] {
			   "name", "AdditionalMasking_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdditionalMaskingType_AdditionalStimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalStimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalMaskingType_AdditionalMaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalMaskingType_AdditionalMaskingPointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (additionalStimulusLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "AdditionalStimulusLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (additionalStimulusLevelType1EDataType,
		   source,
		   new String[] {
			   "name", "AdditionalStimulusLevel_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (aidedSolutionsTypeEEnum,
		   source,
		   new String[] {
			   "name", "AidedSolutions_Type"
		   });
		addAnnotation
		  (aidedSolutionsTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "AidedSolutions_Type:Object",
			   "baseType", "AidedSolutions_Type"
		   });
		addAnnotation
		  (alternateBinauralLoudnessBalanceAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "AlternateBinauralLoudnessBalanceAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAlternateBinauralLoudnessBalanceAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlternateBinauralLoudnessBalanceAudiogramType_AlternateBinauralLoudnessBalancePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlternateBinauralLoudnessBalancePoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (audiometerMakeModelTypeEDataType,
		   source,
		   new String[] {
			   "name", "AudiometerMakeModel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
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
		  (audioMetricMeasurementConditionsTypeEClass,
		   source,
		   new String[] {
			   "name", "AudioMetricMeasurementConditions_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusSignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusSignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingSignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingSignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusSignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusSignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingSignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingSignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusdBWeighting(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusdBWeighting",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingdBWeighting(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingdBWeighting",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusPresentationType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusPresentationType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingPresentationType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingPresentationType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusTransducerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusTransducerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingTransducerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingTransducerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_TransducerDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransducerDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusTransducerCalibrationStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusTransducerCalibrationStandard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingTransducerCalibrationStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingTransducerCalibrationStandard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_HearingInstrument1Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrument_1_Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_HearingInstrument2Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrument_2_Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_HearingInstrumentDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrumentDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusAuxiliary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusAuxiliary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingAuxiliary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingAuxiliary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_WordListName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WordListName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_AuxiliaryParameterDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AuxiliaryParameterDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_SpeechThresholdType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechThresholdType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusOnTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusOnTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingOnTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingOnTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusOffTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusOffTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingOffTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingOffTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusSiSiParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusSiSiParameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingSiSiParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingSiSiParameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusWarbleModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusWarbleModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingWarbleModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingWarbleModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusWarbleModulationSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusWarbleModulationSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingWarbleModulationSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingWarbleModulationSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusFrequencyModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequencyModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingFrequencyModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequencyModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusAmplitudeModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusAmplitudeModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingAmplitudeModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingAmplitudeModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusPulseModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusPulseModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingPulseModulation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingPulseModulation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_StimulusPulseCycle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusPulseCycle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_MaskingPulseCycle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingPulseCycle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_EstimatedResult(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EstimatedResult",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudioMetricMeasurementConditionsType_DeviceSolutions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSolutions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (auxiliaryParameterDescriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "AuxiliaryParameterDescription_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "16"
		   });
		addAnnotation
		  (auxiliaryParameterTypeEEnum,
		   source,
		   new String[] {
			   "name", "AuxiliaryParameter_Type"
		   });
		addAnnotation
		  (auxiliaryParameterTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "AuxiliaryParameter_Type:Object",
			   "baseType", "AuxiliaryParameter_Type"
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
		  (dBweightingTypeEEnum,
		   source,
		   new String[] {
			   "name", "dBweighting_Type"
		   });
		addAnnotation
		  (dBweightingTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "dBweighting_Type:Object",
			   "baseType", "dBweighting_Type"
		   });
		addAnnotation
		  (decayAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "DecayAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDecayAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayAudiogramType_DecayPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DecayPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (decayPointTypeEClass,
		   source,
		   new String[] {
			   "name", "DecayPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDecayPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_StartTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StartTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_EndTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EndTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecayPointType_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSolutionsTypeEClass,
		   source,
		   new String[] {
			   "name", "DeviceSolutions_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSolutionsType_RightEarDevice(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RightEarDevice",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceSolutionsType_LeftEarDevice(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LeftEarDevice",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (differenceLimenFrequencyPointTypeEClass,
		   source,
		   new String[] {
			   "name", "DifferenceLimenFrequencyPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_ModulationSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ModulationSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_DifferenceLimenFrequencyPointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenFrequencyPointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyPointType_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (differenceLimenFrequencyTypeEClass,
		   source,
		   new String[] {
			   "name", "DifferenceLimenFrequency_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenFrequencyPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (differenceLimenIntensityPointTypeEClass,
		   source,
		   new String[] {
			   "name", "DifferenceLimenIntensityPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_ModulationSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ModulationSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenIntensityPointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityPointType_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (differenceLimenIntensityTypeEClass,
		   source,
		   new String[] {
			   "name", "DifferenceLimenIntensity_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenIntensityPoints",
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
		  (getDocumentRoot_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HIMSAAudiometricStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAAudiometricStandard",
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
		  (endTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "EndTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (estimatedResultByTypeEEnum,
		   source,
		   new String[] {
			   "name", "EstimatedResultBy_Type"
		   });
		addAnnotation
		  (estimatedResultByTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "EstimatedResultBy_Type:Object",
			   "baseType", "EstimatedResultBy_Type"
		   });
		addAnnotation
		  (frequenciesUsedForToneAverageTypeEClass,
		   source,
		   new String[] {
			   "name", "FrequenciesUsedForToneAverage_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFrequenciesUsedForToneAverageType_LeftEar1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LeftEar1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequenciesUsedForToneAverageType_LeftEar2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LeftEar2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequenciesUsedForToneAverageType_RightEar1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RightEar1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequenciesUsedForToneAverageType_RightEar2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RightEar2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hearingInstrumentConditionTypeEEnum,
		   source,
		   new String[] {
			   "name", "HearingInstrumentCondition_Type"
		   });
		addAnnotation
		  (hearingInstrumentConditionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "HearingInstrumentCondition_Type:Object",
			   "baseType", "HearingInstrumentCondition_Type"
		   });
		addAnnotation
		  (hearingInstrumentDescriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "HearingInstrumentDescription_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "16"
		   });
		addAnnotation
		  (himsaAudiometricStandardTypeEClass,
		   source,
		   new String[] {
			   "name", "HIMSAAudiometricStandard_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_ToneThresholdAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ToneThresholdAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_UncomfortableLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UncomfortableLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_MostComfortableLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MostComfortableLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechDiscriminationAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechReceptionThresholdAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SpeechMostComfortableLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechMostComfortableLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SpeechUncomfortableLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechUncomfortableLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_ToneNotes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ToneNotes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SpeechNotes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechNotes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FrequenciesUsedForToneAverage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_DecayAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DecayAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlternateBinauralLoudnessBalanceAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_StengerAudiogram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StengerAudiogram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_DifferenceLimenIntensity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenIntensity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_DifferenceLimenFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DifferenceLimenFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortIncrementSensitivityIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_PrivateAudiogramData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PrivateAudiogramData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_WeberPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WeberPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_SupplementaryData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SupplementaryData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_ConvertedFromDataStandard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConvertedFromDataStandard"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_ValidatedByNOAH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValidatedByNOAH"
		   });
		addAnnotation
		  (getHIMSAAudiometricStandardType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
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
		  (leftEar1TypeEDataType,
		   source,
		   new String[] {
			   "name", "LeftEar1_._type",
			   "baseType", "ToneAverage_Type"
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
		  (maskingFrequencyModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingFrequencyModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (maskingLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingLevelType1EDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingLevelType2EDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingLevelType3EDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._3_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingLevelType4EDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._4_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingLevelType5EDataType,
		   source,
		   new String[] {
			   "name", "MaskingLevel_._5_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingOffTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingOffTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3",
			   "minInclusive", "0.000"
		   });
		addAnnotation
		  (maskingOnTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingOnTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.000",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (maskingPulseCycleTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingPulseCycle_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (maskingPulseModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingPulseModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.0",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingSiSiParameterTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingSiSiParameter_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (maskingWarbleModulationSizeTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaskingWarbleModulationSize_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (measurementNotesTypeEClass,
		   source,
		   new String[] {
			   "name", "MeasurementNotes_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeasurementNotesType_AudiometerMakeModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerMakeModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_AudiometerSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_AudiometerLastCalibration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiometerLastCalibration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_TestMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TestMethod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeasurementNotesType_TestReliability(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TestReliability",
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
		  (modulationSizeTypeEDataType,
		   source,
		   new String[] {
			   "name", "ModulationSize_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (modulationSizeType1EDataType,
		   source,
		   new String[] {
			   "name", "ModulationSize_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "totalDigits", "2"
		   });
		addAnnotation
		  (modulationSizeType2EDataType,
		   source,
		   new String[] {
			   "name", "ModulationSize_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1",
			   "minInclusive", "0.0"
		   });
		addAnnotation
		  (mostComfortableLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "MostComfortableLevel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMostComfortableLevelType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMostComfortableLevelType_TonePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TonePoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointStatusTypeEEnum,
		   source,
		   new String[] {
			   "name", "PointStatus_Type"
		   });
		addAnnotation
		  (pointStatusTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "PointStatus_Type:Object",
			   "baseType", "PointStatus_Type"
		   });
		addAnnotation
		  (presentationTypeEEnum,
		   source,
		   new String[] {
			   "name", "Presentation_Type"
		   });
		addAnnotation
		  (presentationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Presentation_Type:Object",
			   "baseType", "Presentation_Type"
		   });
		addAnnotation
		  (scorePercentTypeEDataType,
		   source,
		   new String[] {
			   "name", "ScorePercent_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2",
			   "minInclusive", "0.00"
		   });
		addAnnotation
		  (shortIncrementSensitivityIndexPointEClass,
		   source,
		   new String[] {
			   "name", "ShortIncrementSensitivityIndexPoint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_ModulationSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ModulationSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_NumberOfAnswers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfAnswers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_NumberOfIncrements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfIncrements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (shortIncrementSensitivityIndexTypeEClass,
		   source,
		   new String[] {
			   "name", "ShortIncrementSensitivityIndex_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortIncrementSensitivityIndexType_ShortIncrementSensitivityIndexPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortIncrementSensitivityIndexPoints",
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
		  (signalTypeEEnum,
		   source,
		   new String[] {
			   "name", "Signal_Type"
		   });
		addAnnotation
		  (signalTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Signal_Type:Object",
			   "baseType", "Signal_Type"
		   });
		addAnnotation
		  (speechDiscriminationAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "SpeechDiscriminationAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpeechDiscriminationAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechDiscriminationAudiogramType_SpeechDiscriminationPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechDiscriminationPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (speechMostComfortableLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "SpeechMostComfortableLevel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpeechMostComfortableLevelType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechMostComfortableLevelType_SpeechMostComfortablePoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechMostComfortablePoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (speechReceptionThresholdAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "SpeechReceptionThresholdAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpeechReceptionThresholdAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechReceptionThresholdAudiogramType_SpeechReceptionPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechReceptionPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (speechScorePointTypeEClass,
		   source,
		   new String[] {
			   "name", "SpeechScorePoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpeechScorePointType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechScorePointType_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechScorePointType_ScorePercent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScorePercent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechScorePointType_NumberOfWords(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfWords",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechScorePointType_SpeechPointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechPointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechScorePointType_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (speechThresholdTypeEEnum,
		   source,
		   new String[] {
			   "name", "SpeechThreshold_Type"
		   });
		addAnnotation
		  (speechThresholdTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SpeechThreshold_Type:Object",
			   "baseType", "SpeechThreshold_Type"
		   });
		addAnnotation
		  (speechUncomfortableLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "SpeechUncomfortableLevel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpeechUncomfortableLevelType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpeechUncomfortableLevelType_SpeechUncomfortablePoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeechUncomfortablePoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (startTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StartTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2",
			   "minInclusive", "0.00"
		   });
		addAnnotation
		  (stengerAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "StengerAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStengerAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStengerAudiogramType_StengerPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StengerPoints",
			   "namespace", "##targetNamespace"
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
		  (stimulusFrequencyModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusFrequencyModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
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
		  (stimulusLevelType1EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusLevelType2EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
		addAnnotation
		  (stimulusLevelType3EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._3_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusLevelType4EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._4_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusLevelType5EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._5_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusLevelType6EDataType,
		   source,
		   new String[] {
			   "name", "StimulusLevel_._6_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusOffTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusOffTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.000",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (stimulusOnTimeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusOnTime_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.000",
			   "fractionDigits", "3"
		   });
		addAnnotation
		  (stimulusPresentationTypeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusPresentationType_._type",
			   "baseType", "Presentation_Type"
		   });
		addAnnotation
		  (stimulusPulseCycleTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusPulseCycle_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.00",
			   "fractionDigits", "2"
		   });
		addAnnotation
		  (stimulusPulseModulationTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusPulseModulation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "minInclusive", "0.0",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusSignalTypeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusSignalType_._type",
			   "baseType", "Signal_Type"
		   });
		addAnnotation
		  (stimulusSiSiParameterTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusSiSiParameter_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (stimulusWarbleModulationSizeTypeEDataType,
		   source,
		   new String[] {
			   "name", "StimulusWarbleModulationSize_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "2",
			   "minInclusive", "0.00"
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
		  (testMethodTypeEDataType,
		   source,
		   new String[] {
			   "name", "TestMethod_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (testReliabilityTypeEDataType,
		   source,
		   new String[] {
			   "name", "TestReliability_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (toneAverageTypeEEnum,
		   source,
		   new String[] {
			   "name", "ToneAverage_Type"
		   });
		addAnnotation
		  (toneAverageTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ToneAverage_Type:Object",
			   "baseType", "ToneAverage_Type"
		   });
		addAnnotation
		  (tonePointsTypeEClass,
		   source,
		   new String[] {
			   "name", "TonePoints_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTonePointsType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTonePointsType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTonePointsType_MaskingFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTonePointsType_MaskingLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaskingLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTonePointsType_TonePointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TonePointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTonePointsType_AdditionalMaskingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalMaskingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (toneThresholdAudiogramTypeEClass,
		   source,
		   new String[] {
			   "name", "ToneThresholdAudiogram_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getToneThresholdAudiogramType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getToneThresholdAudiogramType_TonePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TonePoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transducerCalibrationStandardTypeEEnum,
		   source,
		   new String[] {
			   "name", "TransducerCalibrationStandard_Type"
		   });
		addAnnotation
		  (transducerCalibrationStandardTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TransducerCalibrationStandard_Type:Object",
			   "baseType", "TransducerCalibrationStandard_Type"
		   });
		addAnnotation
		  (transducerDescriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "TransducerDescription_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "16"
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
		  (uncomfortableLevelTypeEClass,
		   source,
		   new String[] {
			   "name", "UncomfortableLevel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUncomfortableLevelType_AudMeasurementConditions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudMeasurementConditions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUncomfortableLevelType_TonePoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TonePoints",
			   "namespace", "##targetNamespace"
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
		addAnnotation
		  (weberPointStatusTypeEEnum,
		   source,
		   new String[] {
			   "name", "WeberPointStatus_Type"
		   });
		addAnnotation
		  (weberPointStatusTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "WeberPointStatus_Type:Object",
			   "baseType", "WeberPointStatus_Type"
		   });
		addAnnotation
		  (weberPointsTypeEClass,
		   source,
		   new String[] {
			   "name", "WeberPoints_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeberPointsType_WeberPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WeberPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (weberPointTypeEClass,
		   source,
		   new String[] {
			   "name", "WeberPoint_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeberPointType_StimulusFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeberPointType_StimulusLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StimulusLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWeberPointType_PointStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (wordListNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "WordListName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "16"
		   });
	}

} //Audiogram502PackageImpl
