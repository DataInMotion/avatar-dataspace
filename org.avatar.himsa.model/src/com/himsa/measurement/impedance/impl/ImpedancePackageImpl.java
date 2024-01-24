/**
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.cochlear.implant.sound.processor.selection._500._500Package;

import com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl;

import com.himsa.instrument.fitting.FittingPackage;

import com.himsa.instrument.fitting.impl.FittingPackageImpl;

import com.himsa.instrument.remote.control.ControlPackage;

import com.himsa.instrument.remote.control.impl.ControlPackageImpl;

import com.himsa.instrument.selection.SelectionPackage;

import com.himsa.instrument.selection.impl.SelectionPackageImpl;

import com.himsa.measurement.admittance._501._501Package;

import com.himsa.measurement.admittance._501.impl._501PackageImpl;

import com.himsa.measurement.audiogram.AudiogramPackage;

import com.himsa.measurement.audiogram._502._502Package;

import com.himsa.measurement.audiogram._502.impl._502PackageImpl;

import com.himsa.measurement.audiogram.impl.AudiogramPackageImpl;

import com.himsa.measurement.hearing.instrument.test.TestPackage;

import com.himsa.measurement.hearing.instrument.test.impl.TestPackageImpl;

import com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType;
import com.himsa.measurement.impedance.ComplianceCurveType;
import com.himsa.measurement.impedance.CompliancePointType;
import com.himsa.measurement.impedance.ComplianceType;
import com.himsa.measurement.impedance.ComplianceUnitType;
import com.himsa.measurement.impedance.ComplianceValueType;
import com.himsa.measurement.impedance.DocumentRoot;
import com.himsa.measurement.impedance.EustachianTubeFunctionIntactEarDrumTest;
import com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest;
import com.himsa.measurement.impedance.GradientType;
import com.himsa.measurement.impedance.ImpedanceFactory;
import com.himsa.measurement.impedance.ImpedanceMeasurementConditionType;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.PressurePointType;
import com.himsa.measurement.impedance.RecordingModeType;
import com.himsa.measurement.impedance.ReflexCurveType;
import com.himsa.measurement.impedance.ReflexPointType;
import com.himsa.measurement.impedance.ReflexTestType;
import com.himsa.measurement.impedance.ReflexTestTypeType;
import com.himsa.measurement.impedance.SignalOutputType;
import com.himsa.measurement.impedance.SignalTypeType;
import com.himsa.measurement.impedance.TympanogramMeasurementConditionsType;
import com.himsa.measurement.impedance.TympanogramResultType;
import com.himsa.measurement.impedance.TympanogramTestType;
import com.himsa.measurement.impedance.UnitType;

import com.himsa.measurement.impedance.util.ImpedanceValidator;

import com.himsa.measurement.real.ear.EarPackage;

import com.himsa.measurement.real.ear.impl.EarPackageImpl;

import com.himsa.patient.export.patient.export.ExportPackage;

import com.himsa.patient.export.patient.export.impl.ExportPackageImpl;

import com.himsa.scan.scan.meta.data.DataPackage;

import com.himsa.scan.scan.meta.data.impl.DataPackageImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImpedancePackageImpl extends EPackageImpl implements ImpedancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acousticImpedanceCompleteMeasurementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compliancePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceValueTypeEClass = null;

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
	private EClass impedanceMeasurementConditionTypeEClass = null;

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
	private EClass reflexCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexPointTypeEClass = null;

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
	private EEnum recordingModeTypeEEnum = null;

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
	private EDataType recordingModeTypeObjectEDataType = null;

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
	private EDataType signalLevelTypeEDataType = null;

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
	private EDataType tympanogramResultTypeObjectEDataType = null;

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
	 * @see com.himsa.measurement.impedance.ImpedancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImpedancePackageImpl() {
		super(eNS_URI, ImpedanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImpedancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImpedancePackage init() {
		if (isInited) return (ImpedancePackage)EPackage.Registry.INSTANCE.getEPackage(ImpedancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImpedancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImpedancePackageImpl theImpedancePackage = registeredImpedancePackage instanceof ImpedancePackageImpl ? (ImpedancePackageImpl)registeredImpedancePackage : new ImpedancePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_501Package.eNS_URI);
		_501PackageImpl the_501Package = (_501PackageImpl)(registeredPackage instanceof _501PackageImpl ? registeredPackage : _501Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AudiogramPackage.eNS_URI);
		AudiogramPackageImpl theAudiogramPackage = (AudiogramPackageImpl)(registeredPackage instanceof AudiogramPackageImpl ? registeredPackage : AudiogramPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_502Package.eNS_URI);
		_502PackageImpl the_502Package = (_502PackageImpl)(registeredPackage instanceof _502PackageImpl ? registeredPackage : _502Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_500Package.eNS_URI);
		_500PackageImpl the_500Package = (_500PackageImpl)(registeredPackage instanceof _500PackageImpl ? registeredPackage : _500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FittingPackage.eNS_URI);
		FittingPackageImpl theFittingPackage = (FittingPackageImpl)(registeredPackage instanceof FittingPackageImpl ? registeredPackage : FittingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(registeredPackage instanceof SelectionPackageImpl ? registeredPackage : SelectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.measurement.audiogram.metadata._500._500Package.eNS_URI);
		com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl the_500Package_1 = (com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl ? registeredPackage : com.himsa.measurement.audiogram.metadata._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.other.journal._500._500Package.eNS_URI);
		com.himsa.other.journal._500.impl._500PackageImpl the_500Package_2 = (com.himsa.other.journal._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.other.journal._500.impl._500PackageImpl ? registeredPackage : com.himsa.other.journal._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EarPackage.eNS_URI);
		EarPackageImpl theEarPackage = (EarPackageImpl)(registeredPackage instanceof EarPackageImpl ? registeredPackage : EarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.alert.dashboard.notification._500._500Package.eNS_URI);
		com.himsa.alert.dashboard.notification._500.impl._500PackageImpl the_500Package_3 = (com.himsa.alert.dashboard.notification._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.alert.dashboard.notification._500.impl._500PackageImpl ? registeredPackage : com.himsa.alert.dashboard.notification._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExportPackage.eNS_URI);
		ExportPackageImpl theExportPackage = (ExportPackageImpl)(registeredPackage instanceof ExportPackageImpl ? registeredPackage : ExportPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);
		ControlPackageImpl theControlPackage = (ControlPackageImpl)(registeredPackage instanceof ControlPackageImpl ? registeredPackage : ControlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.measurement.tinnitus._500._500Package.eNS_URI);
		com.himsa.measurement.tinnitus._500.impl._500PackageImpl the_500Package_4 = (com.himsa.measurement.tinnitus._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.measurement.tinnitus._500.impl._500PackageImpl ? registeredPackage : com.himsa.measurement.tinnitus._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theImpedancePackage.createPackageContents();
		the_501Package.createPackageContents();
		theAudiogramPackage.createPackageContents();
		the_502Package.createPackageContents();
		the_500Package.createPackageContents();
		theFittingPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		the_500Package_1.createPackageContents();
		theTestPackage.createPackageContents();
		the_500Package_2.createPackageContents();
		theEarPackage.createPackageContents();
		the_500Package_3.createPackageContents();
		theExportPackage.createPackageContents();
		theControlPackage.createPackageContents();
		the_500Package_4.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theImpedancePackage.initializePackageContents();
		the_501Package.initializePackageContents();
		theAudiogramPackage.initializePackageContents();
		the_502Package.initializePackageContents();
		the_500Package.initializePackageContents();
		theFittingPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		the_500Package_1.initializePackageContents();
		theTestPackage.initializePackageContents();
		the_500Package_2.initializePackageContents();
		theEarPackage.initializePackageContents();
		the_500Package_3.initializePackageContents();
		theExportPackage.initializePackageContents();
		theControlPackage.initializePackageContents();
		the_500Package_4.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theImpedancePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ImpedanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theImpedancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImpedancePackage.eNS_URI, theImpedancePackage);
		return theImpedancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcousticImpedanceCompleteMeasurementType() {
		return acousticImpedanceCompleteMeasurementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImpedanceCompleteMeasurementType_TympanogramTest() {
		return (EReference)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImpedanceCompleteMeasurementType_ReflexTest() {
		return (EReference)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest() {
		return (EReference)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest() {
		return (EReference)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData() {
		return (EAttribute)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard() {
		return (EAttribute)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH() {
		return (EAttribute)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcousticImpedanceCompleteMeasurementType_Version() {
		return (EAttribute)acousticImpedanceCompleteMeasurementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceCurveType() {
		return complianceCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceCurveType_CompliancePoint() {
		return (EReference)complianceCurveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceCurveType_ComplianceUnit() {
		return (EReference)complianceCurveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompliancePointType() {
		return compliancePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompliancePointType_Pressure() {
		return (EAttribute)compliancePointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompliancePointType_Compliance() {
		return (EReference)compliancePointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceType() {
		return complianceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceType_ComplianceValue() {
		return (EReference)complianceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceType_ComplianceUnit() {
		return (EReference)complianceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceUnitType() {
		return complianceUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceUnitType_ArgumentUnit1() {
		return (EAttribute)complianceUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceUnitType_ArgumentUnit2() {
		return (EAttribute)complianceUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceValueType() {
		return complianceValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceValueType_ArgumentCompliance1() {
		return (EAttribute)complianceValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceValueType_ArgumentCompliance2() {
		return (EAttribute)complianceValueTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AcousticImpedanceCompleteMeasurement() {
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
	public EReference getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve() {
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
	public EAttribute getGradientType_GradientUnit() {
		return (EAttribute)gradientTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpedanceMeasurementConditionType() {
		return impedanceMeasurementConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_SignalLevel() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_SignalType() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_SignalOutput() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_Frequency() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_Pressure() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_ProbeFrequency() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpedanceMeasurementConditionType_TestType() {
		return (EAttribute)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpedanceMeasurementConditionType_CanalVolume() {
		return (EReference)impedanceMeasurementConditionTypeEClass.getEStructuralFeatures().get(7);
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
	public EClass getReflexCurveType() {
		return reflexCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexCurveType_ReflexPoint() {
		return (EReference)reflexCurveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexCurveType_ComplianceUnit() {
		return (EReference)reflexCurveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexPointType() {
		return reflexPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReflexPointType_Time() {
		return (EAttribute)reflexPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexPointType_Compliance() {
		return (EReference)reflexPointTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getReflexTestType_ResultOfReflexTest() {
		return (EAttribute)reflexTestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReflexTestType_ImpedanceMeasurementCondition() {
		return (EReference)reflexTestTypeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTympanogramMeasurementConditionsType_ProbeFrequency() {
		return (EAttribute)tympanogramMeasurementConditionsTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getTympanogramTestType_ComplianceCurve() {
		return (EReference)tympanogramTestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTympanogramTestType_MaximumCompliance() {
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
	public EEnum getRecordingModeType() {
		return recordingModeTypeEEnum;
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
	public EDataType getRecordingModeTypeObject() {
		return recordingModeTypeObjectEDataType;
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
	public EDataType getSignalLevelType() {
		return signalLevelTypeEDataType;
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
	public EDataType getTympanogramResultTypeObject() {
		return tympanogramResultTypeObjectEDataType;
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
	public ImpedanceFactory getImpedanceFactory() {
		return (ImpedanceFactory)getEFactoryInstance();
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
		acousticImpedanceCompleteMeasurementTypeEClass = createEClass(ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE);
		createEReference(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST);
		createEReference(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST);
		createEReference(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST);
		createEReference(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST);
		createEAttribute(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA);
		createEAttribute(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD);
		createEAttribute(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH);
		createEAttribute(acousticImpedanceCompleteMeasurementTypeEClass, ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION);

		complianceCurveTypeEClass = createEClass(COMPLIANCE_CURVE_TYPE);
		createEReference(complianceCurveTypeEClass, COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT);
		createEReference(complianceCurveTypeEClass, COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT);

		compliancePointTypeEClass = createEClass(COMPLIANCE_POINT_TYPE);
		createEAttribute(compliancePointTypeEClass, COMPLIANCE_POINT_TYPE__PRESSURE);
		createEReference(compliancePointTypeEClass, COMPLIANCE_POINT_TYPE__COMPLIANCE);

		complianceTypeEClass = createEClass(COMPLIANCE_TYPE);
		createEReference(complianceTypeEClass, COMPLIANCE_TYPE__COMPLIANCE_VALUE);
		createEReference(complianceTypeEClass, COMPLIANCE_TYPE__COMPLIANCE_UNIT);

		complianceUnitTypeEClass = createEClass(COMPLIANCE_UNIT_TYPE);
		createEAttribute(complianceUnitTypeEClass, COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1);
		createEAttribute(complianceUnitTypeEClass, COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2);

		complianceValueTypeEClass = createEClass(COMPLIANCE_VALUE_TYPE);
		createEAttribute(complianceValueTypeEClass, COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1);
		createEAttribute(complianceValueTypeEClass, COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT);

		eustachianTubeFunctionIntactEarDrumTestEClass = createEClass(EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST);
		createEReference(eustachianTubeFunctionIntactEarDrumTestEClass, EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE);
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
		createEAttribute(gradientTypeEClass, GRADIENT_TYPE__GRADIENT_UNIT);

		impedanceMeasurementConditionTypeEClass = createEClass(IMPEDANCE_MEASUREMENT_CONDITION_TYPE);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY);
		createEAttribute(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE);
		createEReference(impedanceMeasurementConditionTypeEClass, IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME);

		pressurePointTypeEClass = createEClass(PRESSURE_POINT_TYPE);
		createEAttribute(pressurePointTypeEClass, PRESSURE_POINT_TYPE__TIME);
		createEAttribute(pressurePointTypeEClass, PRESSURE_POINT_TYPE__PRESSURE);

		reflexCurveTypeEClass = createEClass(REFLEX_CURVE_TYPE);
		createEReference(reflexCurveTypeEClass, REFLEX_CURVE_TYPE__REFLEX_POINT);
		createEReference(reflexCurveTypeEClass, REFLEX_CURVE_TYPE__COMPLIANCE_UNIT);

		reflexPointTypeEClass = createEClass(REFLEX_POINT_TYPE);
		createEAttribute(reflexPointTypeEClass, REFLEX_POINT_TYPE__TIME);
		createEReference(reflexPointTypeEClass, REFLEX_POINT_TYPE__COMPLIANCE);

		reflexTestTypeEClass = createEClass(REFLEX_TEST_TYPE);
		createEReference(reflexTestTypeEClass, REFLEX_TEST_TYPE__REFLEX_CURVE);
		createEAttribute(reflexTestTypeEClass, REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST);
		createEReference(reflexTestTypeEClass, REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION);

		tympanogramMeasurementConditionsTypeEClass = createEClass(TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE);
		createEAttribute(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED);
		createEAttribute(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE);
		createEAttribute(tympanogramMeasurementConditionsTypeEClass, TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY);

		tympanogramTestTypeEClass = createEClass(TYMPANOGRAM_TEST_TYPE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__GRADIENT);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__PRESSURE);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY);
		createEAttribute(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__RESULT);
		createEReference(tympanogramTestTypeEClass, TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION);

		// Create enums
		recordingModeTypeEEnum = createEEnum(RECORDING_MODE_TYPE);
		reflexTestTypeTypeEEnum = createEEnum(REFLEX_TEST_TYPE_TYPE);
		signalOutputTypeEEnum = createEEnum(SIGNAL_OUTPUT_TYPE);
		signalTypeTypeEEnum = createEEnum(SIGNAL_TYPE_TYPE);
		tympanogramResultTypeEEnum = createEEnum(TYMPANOGRAM_RESULT_TYPE);
		unitTypeEEnum = createEEnum(UNIT_TYPE);

		// Create data types
		convertedFromDataStandardTypeEDataType = createEDataType(CONVERTED_FROM_DATA_STANDARD_TYPE);
		recordingModeTypeObjectEDataType = createEDataType(RECORDING_MODE_TYPE_OBJECT);
		reflexTestTypeTypeObjectEDataType = createEDataType(REFLEX_TEST_TYPE_TYPE_OBJECT);
		signalLevelTypeEDataType = createEDataType(SIGNAL_LEVEL_TYPE);
		signalOutputTypeObjectEDataType = createEDataType(SIGNAL_OUTPUT_TYPE_OBJECT);
		signalTypeTypeObjectEDataType = createEDataType(SIGNAL_TYPE_TYPE_OBJECT);
		timeBaseTypeEDataType = createEDataType(TIME_BASE_TYPE);
		timeTypeEDataType = createEDataType(TIME_TYPE);
		timeType1EDataType = createEDataType(TIME_TYPE1);
		tympanogramResultTypeObjectEDataType = createEDataType(TYMPANOGRAM_RESULT_TYPE_OBJECT);
		unitTypeObjectEDataType = createEDataType(UNIT_TYPE_OBJECT);
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
		initEClass(acousticImpedanceCompleteMeasurementTypeEClass, AcousticImpedanceCompleteMeasurementType.class, "AcousticImpedanceCompleteMeasurementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcousticImpedanceCompleteMeasurementType_TympanogramTest(), this.getTympanogramTestType(), null, "tympanogramTest", null, 0, 3, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImpedanceCompleteMeasurementType_ReflexTest(), this.getReflexTestType(), null, "reflexTest", null, 0, 16, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest(), this.getEustachianTubeFunctionIntactEarDrumTest(), null, "eustachianTubeFunctionIntactEarDrumTest", null, 0, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest(), this.getEustachianTubeFunctionPerforatedEarDrumTest(), null, "eustachianTubeFunctionPerforatedEarDrumTest", null, 0, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData(), theXMLTypePackage.getBase64Binary(), "privateImpedanceData", null, 0, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard(), this.getConvertedFromDataStandardType(), "convertedFromDataStandard", null, 0, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH(), theXMLTypePackage.getBoolean(), "validatedByNOAH", null, 0, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcousticImpedanceCompleteMeasurementType_Version(), this.getVersionType(), "version", "500", 1, 1, AcousticImpedanceCompleteMeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceCurveTypeEClass, ComplianceCurveType.class, "ComplianceCurveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplianceCurveType_CompliancePoint(), this.getCompliancePointType(), null, "compliancePoint", null, 1, 250, ComplianceCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceCurveType_ComplianceUnit(), this.getComplianceUnitType(), null, "complianceUnit", null, 1, 1, ComplianceCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compliancePointTypeEClass, CompliancePointType.class, "CompliancePointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompliancePointType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, CompliancePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompliancePointType_Compliance(), this.getComplianceValueType(), null, "compliance", null, 1, 1, CompliancePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceTypeEClass, ComplianceType.class, "ComplianceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplianceType_ComplianceValue(), this.getComplianceValueType(), null, "complianceValue", null, 0, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceType_ComplianceUnit(), this.getComplianceUnitType(), null, "complianceUnit", null, 1, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceUnitTypeEClass, ComplianceUnitType.class, "ComplianceUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceUnitType_ArgumentUnit1(), this.getUnitType(), "argumentUnit1", null, 1, 1, ComplianceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceUnitType_ArgumentUnit2(), this.getUnitType(), "argumentUnit2", null, 1, 1, ComplianceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceValueTypeEClass, ComplianceValueType.class, "ComplianceValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceValueType_ArgumentCompliance1(), theXMLTypePackage.getInteger(), "argumentCompliance1", null, 1, 1, ComplianceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceValueType_ArgumentCompliance2(), theXMLTypePackage.getInteger(), "argumentCompliance2", null, 1, 1, ComplianceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AcousticImpedanceCompleteMeasurement(), this.getAcousticImpedanceCompleteMeasurementType(), null, "acousticImpedanceCompleteMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eustachianTubeFunctionIntactEarDrumTestEClass, EustachianTubeFunctionIntactEarDrumTest.class, "EustachianTubeFunctionIntactEarDrumTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve(), this.getComplianceCurveType(), null, "complianceCurve", null, 1, 3, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionIntactEarDrumTest_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 3, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_CanalVolume(), this.getComplianceType(), null, "canalVolume", null, 1, 1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition(), this.getTympanogramMeasurementConditionsType(), null, "measurementCondition", null, 1, 1, EustachianTubeFunctionIntactEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eustachianTubeFunctionPerforatedEarDrumTestEClass, EustachianTubeFunctionPerforatedEarDrumTest.class, "EustachianTubeFunctionPerforatedEarDrumTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint(), this.getPressurePointType(), null, "pressurePoint", null, 1, 200, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint(), theXMLTypePackage.getInteger(), "openPoint", null, 0, 3, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint(), theXMLTypePackage.getInteger(), "closePoint", null, 0, 3, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase(), this.getTimeBaseType(), "timeBase", null, 0, 1, EustachianTubeFunctionPerforatedEarDrumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientTypeEClass, GradientType.class, "GradientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientType_GradientValue(), this.getComplianceValueType(), null, "gradientValue", null, 1, 1, GradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientType_GradientUnit(), this.getUnitType(), "gradientUnit", null, 1, 1, GradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impedanceMeasurementConditionTypeEClass, ImpedanceMeasurementConditionType.class, "ImpedanceMeasurementConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImpedanceMeasurementConditionType_SignalLevel(), this.getSignalLevelType(), "signalLevel", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_SignalType(), this.getSignalTypeType(), "signalType", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_SignalOutput(), this.getSignalOutputType(), "signalOutput", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_Frequency(), theXMLTypePackage.getInteger(), "frequency", null, 0, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_ProbeFrequency(), theXMLTypePackage.getInteger(), "probeFrequency", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpedanceMeasurementConditionType_TestType(), this.getReflexTestTypeType(), "testType", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpedanceMeasurementConditionType_CanalVolume(), this.getComplianceType(), null, "canalVolume", null, 1, 1, ImpedanceMeasurementConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressurePointTypeEClass, PressurePointType.class, "PressurePointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressurePointType_Time(), this.getTimeType(), "time", null, 1, 1, PressurePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPressurePointType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 1, 1, PressurePointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexCurveTypeEClass, ReflexCurveType.class, "ReflexCurveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexCurveType_ReflexPoint(), this.getReflexPointType(), null, "reflexPoint", null, 1, 128, ReflexCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexCurveType_ComplianceUnit(), this.getComplianceUnitType(), null, "complianceUnit", null, 0, 1, ReflexCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexPointTypeEClass, ReflexPointType.class, "ReflexPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReflexPointType_Time(), this.getTimeType1(), "time", null, 1, 1, ReflexPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexPointType_Compliance(), this.getComplianceValueType(), null, "compliance", null, 0, 1, ReflexPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexTestTypeEClass, ReflexTestType.class, "ReflexTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexTestType_ReflexCurve(), this.getReflexCurveType(), null, "reflexCurve", null, 1, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflexTestType_ResultOfReflexTest(), theXMLTypePackage.getInteger(), "resultOfReflexTest", null, 0, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReflexTestType_ImpedanceMeasurementCondition(), this.getImpedanceMeasurementConditionType(), null, "impedanceMeasurementCondition", null, 1, 1, ReflexTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tympanogramMeasurementConditionsTypeEClass, TympanogramMeasurementConditionsType.class, "TympanogramMeasurementConditionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTympanogramMeasurementConditionsType_SweepSpeed(), theXMLTypePackage.getInteger(), "sweepSpeed", null, 1, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramMeasurementConditionsType_RecordMode(), this.getRecordingModeType(), "recordMode", null, 1, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramMeasurementConditionsType_ProbeFrequency(), theXMLTypePackage.getInteger(), "probeFrequency", "226", 1, 1, TympanogramMeasurementConditionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tympanogramTestTypeEClass, TympanogramTestType.class, "TympanogramTestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTympanogramTestType_ComplianceCurve(), this.getComplianceCurveType(), null, "complianceCurve", null, 1, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_MaximumCompliance(), this.getComplianceType(), null, "maximumCompliance", null, 1, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_CanalVolume(), this.getComplianceType(), null, "canalVolume", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_Gradient(), this.getGradientType(), null, "gradient", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_Pressure(), theXMLTypePackage.getInteger(), "pressure", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_ResonanceFrequency(), theXMLTypePackage.getInteger(), "resonanceFrequency", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTympanogramTestType_Result(), this.getTympanogramResultType(), "result", null, 0, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTympanogramTestType_MeasurementCondition(), this.getTympanogramMeasurementConditionsType(), null, "measurementCondition", null, 1, 1, TympanogramTestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recordingModeTypeEEnum, RecordingModeType.class, "RecordingModeType");
		addEEnumLiteral(recordingModeTypeEEnum, RecordingModeType.COMPENSATED);
		addEEnumLiteral(recordingModeTypeEEnum, RecordingModeType.NON_COMPENSATED);

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

		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.CUBIC_CENTIMETRER);
		addEEnumLiteral(unitTypeEEnum, UnitType.MILLI_LITER);
		addEEnumLiteral(unitTypeEEnum, UnitType.MILLI_MHO);
		addEEnumLiteral(unitTypeEEnum, UnitType.DEGREE);
		addEEnumLiteral(unitTypeEEnum, UnitType.DEKA_PASCAL);

		// Initialize data types
		initEDataType(convertedFromDataStandardTypeEDataType, BigInteger.class, "ConvertedFromDataStandardType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(recordingModeTypeObjectEDataType, RecordingModeType.class, "RecordingModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reflexTestTypeTypeObjectEDataType, ReflexTestTypeType.class, "ReflexTestTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalLevelTypeEDataType, BigDecimal.class, "SignalLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalOutputTypeObjectEDataType, SignalOutputType.class, "SignalOutputTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalTypeTypeObjectEDataType, SignalTypeType.class, "SignalTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeBaseTypeEDataType, BigDecimal.class, "TimeBaseType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeTypeEDataType, BigDecimal.class, "TimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeType1EDataType, BigDecimal.class, "TimeType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tympanogramResultTypeObjectEDataType, TympanogramResultType.class, "TympanogramResultTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitTypeObjectEDataType, UnitType.class, "UnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
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
		  (acousticImpedanceCompleteMeasurementTypeEClass,
		   source,
		   new String[] {
			   "name", "AcousticImpedanceCompleteMeasurement_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_TympanogramTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TympanogramTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_ReflexTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReflexTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionIntactEarDrumTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EustachianTubeFunctionIntactEarDrumTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_EustachianTubeFunctionPerforatedEarDrumTest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EustachianTubeFunctionPerforatedEarDrumTest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_PrivateImpedanceData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PrivateImpedanceData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_ConvertedFromDataStandard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConvertedFromDataStandard"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_ValidatedByNOAH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValidatedByNOAH"
		   });
		addAnnotation
		  (getAcousticImpedanceCompleteMeasurementType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (complianceCurveTypeEClass,
		   source,
		   new String[] {
			   "name", "ComplianceCurve_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComplianceCurveType_CompliancePoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CompliancePoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComplianceCurveType_ComplianceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (compliancePointTypeEClass,
		   source,
		   new String[] {
			   "name", "CompliancePoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCompliancePointType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompliancePointType_Compliance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Compliance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (complianceTypeEClass,
		   source,
		   new String[] {
			   "name", "Compliance_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComplianceType_ComplianceValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComplianceType_ComplianceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (complianceUnitTypeEClass,
		   source,
		   new String[] {
			   "name", "ComplianceUnit_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComplianceUnitType_ArgumentUnit1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArgumentUnit1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComplianceUnitType_ArgumentUnit2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArgumentUnit2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (complianceValueTypeEClass,
		   source,
		   new String[] {
			   "name", "ComplianceValue_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComplianceValueType_ArgumentCompliance1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArgumentCompliance1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComplianceValueType_ArgumentCompliance2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArgumentCompliance2",
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
		  (getDocumentRoot_AcousticImpedanceCompleteMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AcousticImpedanceCompleteMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (eustachianTubeFunctionIntactEarDrumTestEClass,
		   source,
		   new String[] {
			   "name", "EustachianTubeFunctionIntactEarDrumTest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceCurve",
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
		  (impedanceMeasurementConditionTypeEClass,
		   source,
		   new String[] {
			   "name", "ImpedanceMeasurementCondition_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_SignalLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_SignalType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_SignalOutput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignalOutput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_Pressure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pressure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_ProbeFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProbeFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_TestType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TestType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getImpedanceMeasurementConditionType_CanalVolume(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CanalVolume",
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
		  (getReflexCurveType_ReflexPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReflexPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexCurveType_ComplianceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reflexPointTypeEClass,
		   source,
		   new String[] {
			   "name", "ReflexPoint_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReflexPointType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReflexPointType_Compliance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Compliance",
			   "namespace", "##targetNamespace"
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
		  (getReflexTestType_ImpedanceMeasurementCondition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImpedanceMeasurementCondition",
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
		  (signalLevelTypeEDataType,
		   source,
		   new String[] {
			   "name", "SignalLevel_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
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
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "3",
			   "minInclusive", "0.000"
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
		  (getTympanogramTestType_ComplianceCurve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComplianceCurve",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTympanogramTestType_MaximumCompliance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaximumCompliance",
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
	}

} //ImpedancePackageImpl
