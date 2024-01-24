/**
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

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

import com.himsa.measurement.audiogram.metadata._500.AMCLASSType;
import com.himsa.measurement.audiogram.metadata._500.AMCLASSType1;
import com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType;
import com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType;
import com.himsa.measurement.audiogram.metadata._500.DefinedValueType;
import com.himsa.measurement.audiogram.metadata._500.DefinedValueType1;
import com.himsa.measurement.audiogram.metadata._500.DocumentRoot;
import com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType;
import com.himsa.measurement.audiogram.metadata._500.NonStandardizedType;
import com.himsa.measurement.audiogram.metadata._500.OtherType;
import com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType;
import com.himsa.measurement.audiogram.metadata._500.QualindType;
import com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType;
import com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.SymmetryType;
import com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType;
import com.himsa.measurement.audiogram.metadata._500._500Factory;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import com.himsa.measurement.audiogram.metadata._500.util._500Validator;

import com.himsa.measurement.hearing.instrument.test.TestPackage;

import com.himsa.measurement.hearing.instrument.test.impl.TestPackageImpl;

import com.himsa.measurement.impedance.ImpedancePackage;

import com.himsa.measurement.impedance.impl.ImpedancePackageImpl;

import com.himsa.measurement.real.ear.EarPackage;

import com.himsa.measurement.real.ear.impl.EarPackageImpl;

import com.himsa.patient.export.patient.export.ExportPackage;

import com.himsa.patient.export.patient.export.impl.ExportPackageImpl;

import com.himsa.scan.scan.meta.data.DataPackage;

import com.himsa.scan.scan.meta.data.impl.DataPackageImpl;

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
public class _500PackageImpl extends EPackageImpl implements _500Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amclassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amclassType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audiogramClassificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSeverityChoiceTypeEClass = null;

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
	private EClass himsaAudiogramMetadataStandardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonStandardizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictedAccuraciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definedValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definedValueType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flatHearingLossTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum peakedHearingLossTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum risingHearingLossTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siteOfLesionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slopingHearingLossTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symmetryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum troughShapedHearingLossTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definedValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definedValueTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flatHearingLossTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType otherTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType peakedHearingLossTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType risingHearingLossTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType siteOfLesionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType slopingHearingLossTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symmetryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType troughShapedHearingLossTypeObjectEDataType = null;

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
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _500PackageImpl() {
		super(eNS_URI, _500Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _500Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _500Package init() {
		if (isInited) return (_500Package)EPackage.Registry.INSTANCE.getEPackage(_500Package.eNS_URI);

		// Obtain or create and register package
		Object registered_500Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		_500PackageImpl the_500Package = registered_500Package instanceof _500PackageImpl ? (_500PackageImpl)registered_500Package : new _500PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_501Package.eNS_URI);
		_501PackageImpl the_501Package = (_501PackageImpl)(registeredPackage instanceof _501PackageImpl ? registeredPackage : _501Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImpedancePackage.eNS_URI);
		ImpedancePackageImpl theImpedancePackage = (ImpedancePackageImpl)(registeredPackage instanceof ImpedancePackageImpl ? registeredPackage : ImpedancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AudiogramPackage.eNS_URI);
		AudiogramPackageImpl theAudiogramPackage = (AudiogramPackageImpl)(registeredPackage instanceof AudiogramPackageImpl ? registeredPackage : AudiogramPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_502Package.eNS_URI);
		_502PackageImpl the_502Package = (_502PackageImpl)(registeredPackage instanceof _502PackageImpl ? registeredPackage : _502Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.cochlear.implant.sound.processor.selection._500._500Package.eNS_URI);
		com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl the_500Package_1 = (com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl ? registeredPackage : com.himsa.cochlear.implant.sound.processor.selection._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FittingPackage.eNS_URI);
		FittingPackageImpl theFittingPackage = (FittingPackageImpl)(registeredPackage instanceof FittingPackageImpl ? registeredPackage : FittingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(registeredPackage instanceof SelectionPackageImpl ? registeredPackage : SelectionPackage.eINSTANCE);
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
		the_500Package.createPackageContents();
		the_501Package.createPackageContents();
		theImpedancePackage.createPackageContents();
		theAudiogramPackage.createPackageContents();
		the_502Package.createPackageContents();
		the_500Package_1.createPackageContents();
		theFittingPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theTestPackage.createPackageContents();
		the_500Package_2.createPackageContents();
		theEarPackage.createPackageContents();
		the_500Package_3.createPackageContents();
		theExportPackage.createPackageContents();
		theControlPackage.createPackageContents();
		the_500Package_4.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		the_500Package.initializePackageContents();
		the_501Package.initializePackageContents();
		theImpedancePackage.initializePackageContents();
		theAudiogramPackage.initializePackageContents();
		the_502Package.initializePackageContents();
		the_500Package_1.initializePackageContents();
		theFittingPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
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
			(the_500Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return _500Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_500Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_500Package.eNS_URI, the_500Package);
		return the_500Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAMCLASSType() {
		return amclassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAMCLASSType_SiteOfLesion() {
		return (EAttribute)amclassTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAMCLASSType_ConfigurationSeverityChoice() {
		return (EReference)amclassTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAMCLASSType1() {
		return amclassType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAMCLASSType1_Symmetry() {
		return (EAttribute)amclassType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAMCLASSType1_RightEar() {
		return (EReference)amclassType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAMCLASSType1_LeftEar() {
		return (EReference)amclassType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudiogramClassificationsType() {
		return audiogramClassificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAudiogramClassificationsType_AMCLASS() {
		return (EReference)audiogramClassificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudiogramClassificationsType_NonStandardized() {
		return (EAttribute)audiogramClassificationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationSeverityChoiceType() {
		return configurationSeverityChoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_NormalHearing() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_FlatHearingLoss() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_SlopingHearingLoss() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_RisingHearingLoss() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_TroughShapedHearingLoss() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_PeakedHearingLoss() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationSeverityChoiceType_Other() {
		return (EAttribute)configurationSeverityChoiceTypeEClass.getEStructuralFeatures().get(6);
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
	public EReference getDocumentRoot_HIMSAAudiogramMetadataStandard() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIMSAAudiogramMetadataStandardType() {
		return himsaAudiogramMetadataStandardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement() {
		return (EAttribute)himsaAudiogramMetadataStandardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiogramMetadataStandardType_PredictedAccuracies() {
		return (EReference)himsaAudiogramMetadataStandardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHIMSAAudiogramMetadataStandardType_AudiogramClassifications() {
		return (EReference)himsaAudiogramMetadataStandardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIMSAAudiogramMetadataStandardType_Version() {
		return (EAttribute)himsaAudiogramMetadataStandardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonStandardizedType() {
		return nonStandardizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonStandardizedType_DefinedValue() {
		return (EAttribute)nonStandardizedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonStandardizedType_CustomValue() {
		return (EAttribute)nonStandardizedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredictedAccuraciesType() {
		return predictedAccuraciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredictedAccuraciesType_Qualind() {
		return (EReference)predictedAccuraciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredictedAccuraciesType_NonStandardized() {
		return (EReference)predictedAccuraciesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualindType() {
		return qualindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualindType_DefinedValue() {
		return (EAttribute)qualindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualindType_Disagree() {
		return (EAttribute)qualindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefinedValueType() {
		return definedValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefinedValueType1() {
		return definedValueType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlatHearingLossType() {
		return flatHearingLossTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOtherType() {
		return otherTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPeakedHearingLossType() {
		return peakedHearingLossTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRisingHearingLossType() {
		return risingHearingLossTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSiteOfLesionType() {
		return siteOfLesionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSlopingHearingLossType() {
		return slopingHearingLossTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSymmetryType() {
		return symmetryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTroughShapedHearingLossType() {
		return troughShapedHearingLossTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDefinedValueTypeObject() {
		return definedValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDefinedValueTypeObject1() {
		return definedValueTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFlatHearingLossTypeObject() {
		return flatHearingLossTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOtherTypeObject() {
		return otherTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPeakedHearingLossTypeObject() {
		return peakedHearingLossTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRisingHearingLossTypeObject() {
		return risingHearingLossTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSiteOfLesionTypeObject() {
		return siteOfLesionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSlopingHearingLossTypeObject() {
		return slopingHearingLossTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSymmetryTypeObject() {
		return symmetryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTroughShapedHearingLossTypeObject() {
		return troughShapedHearingLossTypeObjectEDataType;
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
	public _500Factory get_500Factory() {
		return (_500Factory)getEFactoryInstance();
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
		amclassTypeEClass = createEClass(AMCLASS_TYPE);
		createEAttribute(amclassTypeEClass, AMCLASS_TYPE__SITE_OF_LESION);
		createEReference(amclassTypeEClass, AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE);

		amclassType1EClass = createEClass(AMCLASS_TYPE1);
		createEAttribute(amclassType1EClass, AMCLASS_TYPE1__SYMMETRY);
		createEReference(amclassType1EClass, AMCLASS_TYPE1__RIGHT_EAR);
		createEReference(amclassType1EClass, AMCLASS_TYPE1__LEFT_EAR);

		audiogramClassificationsTypeEClass = createEClass(AUDIOGRAM_CLASSIFICATIONS_TYPE);
		createEReference(audiogramClassificationsTypeEClass, AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS);
		createEAttribute(audiogramClassificationsTypeEClass, AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED);

		configurationSeverityChoiceTypeEClass = createEClass(CONFIGURATION_SEVERITY_CHOICE_TYPE);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS);
		createEAttribute(configurationSeverityChoiceTypeEClass, CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIMSA_AUDIOGRAM_METADATA_STANDARD);

		himsaAudiogramMetadataStandardTypeEClass = createEClass(HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE);
		createEAttribute(himsaAudiogramMetadataStandardTypeEClass, HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT);
		createEReference(himsaAudiogramMetadataStandardTypeEClass, HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES);
		createEReference(himsaAudiogramMetadataStandardTypeEClass, HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS);
		createEAttribute(himsaAudiogramMetadataStandardTypeEClass, HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION);

		nonStandardizedTypeEClass = createEClass(NON_STANDARDIZED_TYPE);
		createEAttribute(nonStandardizedTypeEClass, NON_STANDARDIZED_TYPE__DEFINED_VALUE);
		createEAttribute(nonStandardizedTypeEClass, NON_STANDARDIZED_TYPE__CUSTOM_VALUE);

		predictedAccuraciesTypeEClass = createEClass(PREDICTED_ACCURACIES_TYPE);
		createEReference(predictedAccuraciesTypeEClass, PREDICTED_ACCURACIES_TYPE__QUALIND);
		createEReference(predictedAccuraciesTypeEClass, PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED);

		qualindTypeEClass = createEClass(QUALIND_TYPE);
		createEAttribute(qualindTypeEClass, QUALIND_TYPE__DEFINED_VALUE);
		createEAttribute(qualindTypeEClass, QUALIND_TYPE__DISAGREE);

		// Create enums
		definedValueTypeEEnum = createEEnum(DEFINED_VALUE_TYPE);
		definedValueType1EEnum = createEEnum(DEFINED_VALUE_TYPE1);
		flatHearingLossTypeEEnum = createEEnum(FLAT_HEARING_LOSS_TYPE);
		otherTypeEEnum = createEEnum(OTHER_TYPE);
		peakedHearingLossTypeEEnum = createEEnum(PEAKED_HEARING_LOSS_TYPE);
		risingHearingLossTypeEEnum = createEEnum(RISING_HEARING_LOSS_TYPE);
		siteOfLesionTypeEEnum = createEEnum(SITE_OF_LESION_TYPE);
		slopingHearingLossTypeEEnum = createEEnum(SLOPING_HEARING_LOSS_TYPE);
		symmetryTypeEEnum = createEEnum(SYMMETRY_TYPE);
		troughShapedHearingLossTypeEEnum = createEEnum(TROUGH_SHAPED_HEARING_LOSS_TYPE);

		// Create data types
		definedValueTypeObjectEDataType = createEDataType(DEFINED_VALUE_TYPE_OBJECT);
		definedValueTypeObject1EDataType = createEDataType(DEFINED_VALUE_TYPE_OBJECT1);
		flatHearingLossTypeObjectEDataType = createEDataType(FLAT_HEARING_LOSS_TYPE_OBJECT);
		otherTypeObjectEDataType = createEDataType(OTHER_TYPE_OBJECT);
		peakedHearingLossTypeObjectEDataType = createEDataType(PEAKED_HEARING_LOSS_TYPE_OBJECT);
		risingHearingLossTypeObjectEDataType = createEDataType(RISING_HEARING_LOSS_TYPE_OBJECT);
		siteOfLesionTypeObjectEDataType = createEDataType(SITE_OF_LESION_TYPE_OBJECT);
		slopingHearingLossTypeObjectEDataType = createEDataType(SLOPING_HEARING_LOSS_TYPE_OBJECT);
		symmetryTypeObjectEDataType = createEDataType(SYMMETRY_TYPE_OBJECT);
		troughShapedHearingLossTypeObjectEDataType = createEDataType(TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT);
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
		initEClass(amclassTypeEClass, AMCLASSType.class, "AMCLASSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAMCLASSType_SiteOfLesion(), this.getSiteOfLesionType(), "siteOfLesion", null, 1, 1, AMCLASSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMCLASSType_ConfigurationSeverityChoice(), this.getConfigurationSeverityChoiceType(), null, "configurationSeverityChoice", null, 1, 1, AMCLASSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amclassType1EClass, AMCLASSType1.class, "AMCLASSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAMCLASSType1_Symmetry(), this.getSymmetryType(), "symmetry", null, 0, 1, AMCLASSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMCLASSType1_RightEar(), this.getAMCLASSType(), null, "rightEar", null, 0, 1, AMCLASSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMCLASSType1_LeftEar(), this.getAMCLASSType(), null, "leftEar", null, 0, 1, AMCLASSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audiogramClassificationsTypeEClass, AudiogramClassificationsType.class, "AudiogramClassificationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudiogramClassificationsType_AMCLASS(), this.getAMCLASSType1(), null, "aMCLASS", null, 0, 1, AudiogramClassificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudiogramClassificationsType_NonStandardized(), theXMLTypePackage.getString(), "nonStandardized", null, 0, 1, AudiogramClassificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSeverityChoiceTypeEClass, ConfigurationSeverityChoiceType.class, "ConfigurationSeverityChoiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationSeverityChoiceType_NormalHearing(), theXMLTypePackage.getBoolean(), "normalHearing", "true", 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_FlatHearingLoss(), this.getFlatHearingLossType(), "flatHearingLoss", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_SlopingHearingLoss(), this.getSlopingHearingLossType(), "slopingHearingLoss", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_RisingHearingLoss(), this.getRisingHearingLossType(), "risingHearingLoss", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_TroughShapedHearingLoss(), this.getTroughShapedHearingLossType(), "troughShapedHearingLoss", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_PeakedHearingLoss(), this.getPeakedHearingLossType(), "peakedHearingLoss", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSeverityChoiceType_Other(), this.getOtherType(), "other", null, 0, 1, ConfigurationSeverityChoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HIMSAAudiogramMetadataStandard(), this.getHIMSAAudiogramMetadataStandardType(), null, "hIMSAAudiogramMetadataStandard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(himsaAudiogramMetadataStandardTypeEClass, HIMSAAudiogramMetadataStandardType.class, "HIMSAAudiogramMetadataStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement(), theXMLTypePackage.getBoolean(), "automatedMeasurement", null, 0, 1, HIMSAAudiogramMetadataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiogramMetadataStandardType_PredictedAccuracies(), this.getPredictedAccuraciesType(), null, "predictedAccuracies", null, 0, -1, HIMSAAudiogramMetadataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIMSAAudiogramMetadataStandardType_AudiogramClassifications(), this.getAudiogramClassificationsType(), null, "audiogramClassifications", null, 0, -1, HIMSAAudiogramMetadataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIMSAAudiogramMetadataStandardType_Version(), this.getVersionType(), "version", "500", 1, 1, HIMSAAudiogramMetadataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonStandardizedTypeEClass, NonStandardizedType.class, "NonStandardizedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonStandardizedType_DefinedValue(), this.getDefinedValueType(), "definedValue", null, 0, 1, NonStandardizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonStandardizedType_CustomValue(), theXMLTypePackage.getString(), "customValue", null, 0, 1, NonStandardizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictedAccuraciesTypeEClass, PredictedAccuraciesType.class, "PredictedAccuraciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredictedAccuraciesType_Qualind(), this.getQualindType(), null, "qualind", null, 0, 1, PredictedAccuraciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredictedAccuraciesType_NonStandardized(), this.getNonStandardizedType(), null, "nonStandardized", null, 0, 1, PredictedAccuraciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualindTypeEClass, QualindType.class, "QualindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualindType_DefinedValue(), this.getDefinedValueType1(), "definedValue", null, 1, 1, QualindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualindType_Disagree(), theXMLTypePackage.getString(), "disagree", null, 0, 1, QualindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(definedValueTypeEEnum, DefinedValueType.class, "DefinedValueType");
		addEEnumLiteral(definedValueTypeEEnum, DefinedValueType.GOOD);
		addEEnumLiteral(definedValueTypeEEnum, DefinedValueType.FAIR);
		addEEnumLiteral(definedValueTypeEEnum, DefinedValueType.POOR);

		initEEnum(definedValueType1EEnum, DefinedValueType1.class, "DefinedValueType1");
		addEEnumLiteral(definedValueType1EEnum, DefinedValueType1.GOOD);
		addEEnumLiteral(definedValueType1EEnum, DefinedValueType1.FAIR);
		addEEnumLiteral(definedValueType1EEnum, DefinedValueType1.POOR);

		initEEnum(flatHearingLossTypeEEnum, FlatHearingLossType.class, "FlatHearingLossType");
		addEEnumLiteral(flatHearingLossTypeEEnum, FlatHearingLossType.MILD);
		addEEnumLiteral(flatHearingLossTypeEEnum, FlatHearingLossType.MODERATE);
		addEEnumLiteral(flatHearingLossTypeEEnum, FlatHearingLossType.SEVERE);
		addEEnumLiteral(flatHearingLossTypeEEnum, FlatHearingLossType.PROFOUND);

		initEEnum(otherTypeEEnum, OtherType.class, "OtherType");
		addEEnumLiteral(otherTypeEEnum, OtherType.MILD);
		addEEnumLiteral(otherTypeEEnum, OtherType.MODERATE);
		addEEnumLiteral(otherTypeEEnum, OtherType.SEVERE);

		initEEnum(peakedHearingLossTypeEEnum, PeakedHearingLossType.class, "PeakedHearingLossType");
		addEEnumLiteral(peakedHearingLossTypeEEnum, PeakedHearingLossType.MILD);
		addEEnumLiteral(peakedHearingLossTypeEEnum, PeakedHearingLossType.MODERATE);
		addEEnumLiteral(peakedHearingLossTypeEEnum, PeakedHearingLossType.SEVERE);

		initEEnum(risingHearingLossTypeEEnum, RisingHearingLossType.class, "RisingHearingLossType");
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.MILD_NORMAL);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.MODERATE_NORMAL);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.MODERATE_MILD);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.SEVERE_NORMAL);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.SEVERE_MILD);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.SEVERE_MODERATE);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.PROFOUND_SEVERE);
		addEEnumLiteral(risingHearingLossTypeEEnum, RisingHearingLossType.PROFOUND);

		initEEnum(siteOfLesionTypeEEnum, SiteOfLesionType.class, "SiteOfLesionType");
		addEEnumLiteral(siteOfLesionTypeEEnum, SiteOfLesionType.CONDUCTIVE);
		addEEnumLiteral(siteOfLesionTypeEEnum, SiteOfLesionType.SENSORINEURAL);
		addEEnumLiteral(siteOfLesionTypeEEnum, SiteOfLesionType.MIXED);
		addEEnumLiteral(siteOfLesionTypeEEnum, SiteOfLesionType.SENSORINEURAL_OR_MIXED);

		initEEnum(slopingHearingLossTypeEEnum, SlopingHearingLossType.class, "SlopingHearingLossType");
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.NORMAL_MILD);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.NORMAL_MODERATE);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.NORMAL_SEVERE);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.MILD_MODERATE);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.MILD_SEVERE);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.MODERATE_SEVERE);
		addEEnumLiteral(slopingHearingLossTypeEEnum, SlopingHearingLossType.PROFOUND);

		initEEnum(symmetryTypeEEnum, SymmetryType.class, "SymmetryType");
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.SYMMETRICAL_HEARING_LOSS);
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.ASYMMETRICAL_HEARING_LOSS);

		initEEnum(troughShapedHearingLossTypeEEnum, TroughShapedHearingLossType.class, "TroughShapedHearingLossType");
		addEEnumLiteral(troughShapedHearingLossTypeEEnum, TroughShapedHearingLossType.MILD);
		addEEnumLiteral(troughShapedHearingLossTypeEEnum, TroughShapedHearingLossType.MODERATE);
		addEEnumLiteral(troughShapedHearingLossTypeEEnum, TroughShapedHearingLossType.SEVERE);

		// Initialize data types
		initEDataType(definedValueTypeObjectEDataType, DefinedValueType.class, "DefinedValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(definedValueTypeObject1EDataType, DefinedValueType1.class, "DefinedValueTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(flatHearingLossTypeObjectEDataType, FlatHearingLossType.class, "FlatHearingLossTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(otherTypeObjectEDataType, OtherType.class, "OtherTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(peakedHearingLossTypeObjectEDataType, PeakedHearingLossType.class, "PeakedHearingLossTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(risingHearingLossTypeObjectEDataType, RisingHearingLossType.class, "RisingHearingLossTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(siteOfLesionTypeObjectEDataType, SiteOfLesionType.class, "SiteOfLesionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(slopingHearingLossTypeObjectEDataType, SlopingHearingLossType.class, "SlopingHearingLossTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symmetryTypeObjectEDataType, SymmetryType.class, "SymmetryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(troughShapedHearingLossTypeObjectEDataType, TroughShapedHearingLossType.class, "TroughShapedHearingLossTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
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
		  (amclassTypeEClass,
		   source,
		   new String[] {
			   "name", "AMCLASS_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAMCLASSType_SiteOfLesion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SiteOfLesion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAMCLASSType_ConfigurationSeverityChoice(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConfigurationSeverityChoice",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (amclassType1EClass,
		   source,
		   new String[] {
			   "name", "AMCLASS_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAMCLASSType1_Symmetry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Symmetry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAMCLASSType1_RightEar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RightEar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAMCLASSType1_LeftEar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LeftEar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (audiogramClassificationsTypeEClass,
		   source,
		   new String[] {
			   "name", "AudiogramClassifications_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAudiogramClassificationsType_AMCLASS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AMCLASS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAudiogramClassificationsType_NonStandardized(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NonStandardized",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (configurationSeverityChoiceTypeEClass,
		   source,
		   new String[] {
			   "name", "ConfigurationSeverityChoice_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_NormalHearing(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NormalHearing",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_FlatHearingLoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FlatHearingLoss",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_SlopingHearingLoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SlopingHearingLoss",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_RisingHearingLoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RisingHearingLoss",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_TroughShapedHearingLoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TroughShapedHearingLoss",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_PeakedHearingLoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeakedHearingLoss",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationSeverityChoiceType_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Other",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (definedValueTypeEEnum,
		   source,
		   new String[] {
			   "name", "DefinedValue_._type"
		   });
		addAnnotation
		  (definedValueType1EEnum,
		   source,
		   new String[] {
			   "name", "DefinedValue_._1_._type"
		   });
		addAnnotation
		  (definedValueTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DefinedValue_._type:Object",
			   "baseType", "DefinedValue_._type"
		   });
		addAnnotation
		  (definedValueTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "DefinedValue_._1_._type:Object",
			   "baseType", "DefinedValue_._1_._type"
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
		  (getDocumentRoot_HIMSAAudiogramMetadataStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAAudiogramMetadataStandard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (flatHearingLossTypeEEnum,
		   source,
		   new String[] {
			   "name", "FlatHearingLoss_._type"
		   });
		addAnnotation
		  (flatHearingLossTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "FlatHearingLoss_._type:Object",
			   "baseType", "FlatHearingLoss_._type"
		   });
		addAnnotation
		  (himsaAudiogramMetadataStandardTypeEClass,
		   source,
		   new String[] {
			   "name", "HIMSAAudiogramMetadataStandard_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AutomatedMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiogramMetadataStandardType_PredictedAccuracies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PredictedAccuracies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiogramMetadataStandardType_AudiogramClassifications(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AudiogramClassifications",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHIMSAAudiogramMetadataStandardType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (nonStandardizedTypeEClass,
		   source,
		   new String[] {
			   "name", "NonStandardized_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNonStandardizedType_DefinedValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefinedValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNonStandardizedType_CustomValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CustomValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (otherTypeEEnum,
		   source,
		   new String[] {
			   "name", "Other_._type"
		   });
		addAnnotation
		  (otherTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Other_._type:Object",
			   "baseType", "Other_._type"
		   });
		addAnnotation
		  (peakedHearingLossTypeEEnum,
		   source,
		   new String[] {
			   "name", "PeakedHearingLoss_._type"
		   });
		addAnnotation
		  (peakedHearingLossTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "PeakedHearingLoss_._type:Object",
			   "baseType", "PeakedHearingLoss_._type"
		   });
		addAnnotation
		  (predictedAccuraciesTypeEClass,
		   source,
		   new String[] {
			   "name", "PredictedAccuracies_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPredictedAccuraciesType_Qualind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Qualind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPredictedAccuraciesType_NonStandardized(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NonStandardized",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (qualindTypeEClass,
		   source,
		   new String[] {
			   "name", "Qualind_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQualindType_DefinedValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefinedValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQualindType_Disagree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Disagree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (risingHearingLossTypeEEnum,
		   source,
		   new String[] {
			   "name", "RisingHearingLoss_._type"
		   });
		addAnnotation
		  (risingHearingLossTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "RisingHearingLoss_._type:Object",
			   "baseType", "RisingHearingLoss_._type"
		   });
		addAnnotation
		  (siteOfLesionTypeEEnum,
		   source,
		   new String[] {
			   "name", "SiteOfLesion_._type"
		   });
		addAnnotation
		  (siteOfLesionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SiteOfLesion_._type:Object",
			   "baseType", "SiteOfLesion_._type"
		   });
		addAnnotation
		  (slopingHearingLossTypeEEnum,
		   source,
		   new String[] {
			   "name", "SlopingHearingLoss_._type"
		   });
		addAnnotation
		  (slopingHearingLossTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SlopingHearingLoss_._type:Object",
			   "baseType", "SlopingHearingLoss_._type"
		   });
		addAnnotation
		  (symmetryTypeEEnum,
		   source,
		   new String[] {
			   "name", "Symmetry_._type"
		   });
		addAnnotation
		  (symmetryTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Symmetry_._type:Object",
			   "baseType", "Symmetry_._type"
		   });
		addAnnotation
		  (troughShapedHearingLossTypeEEnum,
		   source,
		   new String[] {
			   "name", "TroughShapedHearingLoss_._type"
		   });
		addAnnotation
		  (troughShapedHearingLossTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TroughShapedHearingLoss_._type:Object",
			   "baseType", "TroughShapedHearingLoss_._type"
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

} //_500PackageImpl
