/**
 */
package org.avatar.himsa.export.impl;

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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import journal.JournalPackage;

import journal.impl.JournalPackageImpl;

import notification.NotificationPackage;

import notification.impl.NotificationPackageImpl;

import org.avatar.himsa.export.ActionDataType;
import org.avatar.himsa.export.ActionsType;
import org.avatar.himsa.export.DocumentRoot;
import org.avatar.himsa.export.GenderType;
import org.avatar.himsa.export.OperationTYPE;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportFactory;
import org.avatar.himsa.export.PatientExportPackage;
import org.avatar.himsa.export.PatientType1;
import org.avatar.himsa.export.PatientsType;
import org.avatar.himsa.export.PubliclyFormattedData;
import org.avatar.himsa.export.TypeOfDataType;

import org.avatar.himsa.export.util.PatientExportValidator;

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
public class PatientExportPackageImpl extends EPackageImpl implements PatientExportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsTypeEClass = null;

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
	private EClass patientsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publiclyFormattedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOfDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType address1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType address2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType address3TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backEndSystemPatientIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType birthDateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createDateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataFormatTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMailTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firstNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType homeTelephoneTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType insurance1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType insurance2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lastNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType middleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mobileTelephoneTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationTYPEObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType other1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType other2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patientGUIDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patientNoTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType physicianTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType provinceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referralTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType salutationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ssNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType titleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeOfDataTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType userIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType userIdType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workTelephoneTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zipTypeEDataType = null;

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
	 * @see org.avatar.himsa.export.PatientExportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatientExportPackageImpl() {
		super(eNS_URI, PatientExportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatientExportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatientExportPackage init() {
		if (isInited) return (PatientExportPackage)EPackage.Registry.INSTANCE.getEPackage(PatientExportPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPatientExportPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PatientExportPackageImpl thePatientExportPackage = registeredPatientExportPackage instanceof PatientExportPackageImpl ? (PatientExportPackageImpl)registeredPatientExportPackage : new PatientExportPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RealearPackage.eNS_URI);
		RealearPackageImpl theRealearPackage = (RealearPackageImpl)(registeredPackage instanceof RealearPackageImpl ? registeredPackage : RealearPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RemotecontrolPackage.eNS_URI);
		RemotecontrolPackageImpl theRemotecontrolPackage = (RemotecontrolPackageImpl)(registeredPackage instanceof RemotecontrolPackageImpl ? registeredPackage : RemotecontrolPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TinnitusPackage.eNS_URI);
		TinnitusPackageImpl theTinnitusPackage = (TinnitusPackageImpl)(registeredPackage instanceof TinnitusPackageImpl ? registeredPackage : TinnitusPackage.eINSTANCE);

		// Create package meta-data objects
		thePatientExportPackage.createPackageContents();
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
		theRealearPackage.createPackageContents();
		theRemotecontrolPackage.createPackageContents();
		theTinnitusPackage.createPackageContents();

		// Initialize created meta-data
		thePatientExportPackage.initializePackageContents();
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
		theRealearPackage.initializePackageContents();
		theRemotecontrolPackage.initializePackageContents();
		theTinnitusPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatientExportPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PatientExportValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatientExportPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatientExportPackage.eNS_URI, thePatientExportPackage);
		return thePatientExportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionDataType() {
		return actionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_TypeOfData() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_DataFormat() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_Description() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_ActionDate() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_LastModifiedDate() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_UserId() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionDataType_PublicData() {
		return (EReference)actionDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_ActionGroup() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_DeviceType() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_ModuleId() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDataType_Operation() {
		return (EAttribute)actionDataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionsType() {
		return actionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionsType_Action() {
		return (EReference)actionsTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_Patients() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientsType() {
		return patientsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatientsType_Group() {
		return (EAttribute)patientsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientsType_Patient() {
		return (EReference)patientsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_PatientGUID() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_FirstName() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_LastName() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_MiddleName() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_PatientNo() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_ActivePatient() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Gender() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_BirthDate() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_UserId() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_CreateDate() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Address1() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Address2() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Address3() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Title() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Salutation() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_SSNumber() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Zip() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_City() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Province() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Country() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_EMail() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_HomeTelephone() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_WorkTelephone() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_MobileTelephone() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Insurance1() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Insurance2() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Physician() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Referral() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Other1() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Other2() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_BackEndSystemPatientId() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientType1() {
		return patientType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatientType1_Actions() {
		return (EReference)patientType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPubliclyFormattedData() {
		return publiclyFormattedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSAAudiometricStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSAAudiometricStandard1() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HearingInstrumentSelection() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HearingInstrumentFitting() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_RemoteControlSelection() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSARemStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSAHitStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_AcousticImmittanceAssessment() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_TinnitusMeasurementData() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSAAudiogramMetadataStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_CochlearImplantSoundProcessorSelection() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_HIMSAJournalStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_NotificationAction() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubliclyFormattedData_ScanMetaDataStandard() {
		return (EReference)publiclyFormattedDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGenderType() {
		return genderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationTYPE() {
		return operationTYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeOfDataType() {
		return typeOfDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAddress1Type() {
		return address1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAddress2Type() {
		return address2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAddress3Type() {
		return address3TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBackEndSystemPatientIdType() {
		return backEndSystemPatientIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBirthDateType() {
		return birthDateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCityType() {
		return cityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCountryType() {
		return countryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCreateDateType() {
		return createDateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataFormatType() {
		return dataFormatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType() {
		return descriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeviceTypeType() {
		return deviceTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeviceTypeTypeObject() {
		return deviceTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEMailType() {
		return eMailTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFirstNameType() {
		return firstNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGenderTypeObject() {
		return genderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHomeTelephoneType() {
		return homeTelephoneTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInsurance1Type() {
		return insurance1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInsurance2Type() {
		return insurance2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLastNameType() {
		return lastNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMiddleNameType() {
		return middleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMobileTelephoneType() {
		return mobileTelephoneTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOperationTYPEObject() {
		return operationTYPEObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOther1Type() {
		return other1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOther2Type() {
		return other2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPatientGUIDType() {
		return patientGUIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPatientNoType() {
		return patientNoTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPhysicianType() {
		return physicianTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProvinceType() {
		return provinceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferralType() {
		return referralTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSalutationType() {
		return salutationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSSNumberType() {
		return ssNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTitleType() {
		return titleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeOfDataTypeObject() {
		return typeOfDataTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUserIdType() {
		return userIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUserIdType1() {
		return userIdType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWorkTelephoneType() {
		return workTelephoneTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZipType() {
		return zipTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientExportFactory getPatientExportFactory() {
		return (PatientExportFactory)getEFactoryInstance();
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
		actionDataTypeEClass = createEClass(ACTION_DATA_TYPE);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__TYPE_OF_DATA);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__DATA_FORMAT);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__DESCRIPTION);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__ACTION_DATE);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__LAST_MODIFIED_DATE);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__USER_ID);
		createEReference(actionDataTypeEClass, ACTION_DATA_TYPE__PUBLIC_DATA);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__ACTION_GROUP);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__DEVICE_TYPE);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__MODULE_ID);
		createEAttribute(actionDataTypeEClass, ACTION_DATA_TYPE__OPERATION);

		actionsTypeEClass = createEClass(ACTIONS_TYPE);
		createEReference(actionsTypeEClass, ACTIONS_TYPE__ACTION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PATIENTS);

		patientsTypeEClass = createEClass(PATIENTS_TYPE);
		createEAttribute(patientsTypeEClass, PATIENTS_TYPE__GROUP);
		createEReference(patientsTypeEClass, PATIENTS_TYPE__PATIENT);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENT_GUID);
		createEAttribute(patientEClass, PATIENT__FIRST_NAME);
		createEAttribute(patientEClass, PATIENT__LAST_NAME);
		createEAttribute(patientEClass, PATIENT__MIDDLE_NAME);
		createEAttribute(patientEClass, PATIENT__PATIENT_NO);
		createEAttribute(patientEClass, PATIENT__ACTIVE_PATIENT);
		createEAttribute(patientEClass, PATIENT__GENDER);
		createEAttribute(patientEClass, PATIENT__BIRTH_DATE);
		createEAttribute(patientEClass, PATIENT__USER_ID);
		createEAttribute(patientEClass, PATIENT__CREATE_DATE);
		createEAttribute(patientEClass, PATIENT__ADDRESS1);
		createEAttribute(patientEClass, PATIENT__ADDRESS2);
		createEAttribute(patientEClass, PATIENT__ADDRESS3);
		createEAttribute(patientEClass, PATIENT__TITLE);
		createEAttribute(patientEClass, PATIENT__SALUTATION);
		createEAttribute(patientEClass, PATIENT__SS_NUMBER);
		createEAttribute(patientEClass, PATIENT__ZIP);
		createEAttribute(patientEClass, PATIENT__CITY);
		createEAttribute(patientEClass, PATIENT__PROVINCE);
		createEAttribute(patientEClass, PATIENT__COUNTRY);
		createEAttribute(patientEClass, PATIENT__EMAIL);
		createEAttribute(patientEClass, PATIENT__HOME_TELEPHONE);
		createEAttribute(patientEClass, PATIENT__WORK_TELEPHONE);
		createEAttribute(patientEClass, PATIENT__MOBILE_TELEPHONE);
		createEAttribute(patientEClass, PATIENT__INSURANCE1);
		createEAttribute(patientEClass, PATIENT__INSURANCE2);
		createEAttribute(patientEClass, PATIENT__PHYSICIAN);
		createEAttribute(patientEClass, PATIENT__REFERRAL);
		createEAttribute(patientEClass, PATIENT__OTHER1);
		createEAttribute(patientEClass, PATIENT__OTHER2);
		createEAttribute(patientEClass, PATIENT__BACK_END_SYSTEM_PATIENT_ID);

		patientType1EClass = createEClass(PATIENT_TYPE1);
		createEReference(patientType1EClass, PATIENT_TYPE1__ACTIONS);

		publiclyFormattedDataEClass = createEClass(PUBLICLY_FORMATTED_DATA);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION);
		createEReference(publiclyFormattedDataEClass, PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD);

		// Create enums
		genderTypeEEnum = createEEnum(GENDER_TYPE);
		operationTYPEEEnum = createEEnum(OPERATION_TYPE);
		typeOfDataTypeEEnum = createEEnum(TYPE_OF_DATA_TYPE);

		// Create data types
		address1TypeEDataType = createEDataType(ADDRESS1_TYPE);
		address2TypeEDataType = createEDataType(ADDRESS2_TYPE);
		address3TypeEDataType = createEDataType(ADDRESS3_TYPE);
		backEndSystemPatientIdTypeEDataType = createEDataType(BACK_END_SYSTEM_PATIENT_ID_TYPE);
		birthDateTypeEDataType = createEDataType(BIRTH_DATE_TYPE);
		cityTypeEDataType = createEDataType(CITY_TYPE);
		countryTypeEDataType = createEDataType(COUNTRY_TYPE);
		createDateTypeEDataType = createEDataType(CREATE_DATE_TYPE);
		dataFormatTypeEDataType = createEDataType(DATA_FORMAT_TYPE);
		descriptionTypeEDataType = createEDataType(DESCRIPTION_TYPE);
		deviceTypeTypeEDataType = createEDataType(DEVICE_TYPE_TYPE);
		deviceTypeTypeObjectEDataType = createEDataType(DEVICE_TYPE_TYPE_OBJECT);
		eMailTypeEDataType = createEDataType(EMAIL_TYPE);
		firstNameTypeEDataType = createEDataType(FIRST_NAME_TYPE);
		genderTypeObjectEDataType = createEDataType(GENDER_TYPE_OBJECT);
		homeTelephoneTypeEDataType = createEDataType(HOME_TELEPHONE_TYPE);
		insurance1TypeEDataType = createEDataType(INSURANCE1_TYPE);
		insurance2TypeEDataType = createEDataType(INSURANCE2_TYPE);
		lastNameTypeEDataType = createEDataType(LAST_NAME_TYPE);
		middleNameTypeEDataType = createEDataType(MIDDLE_NAME_TYPE);
		mobileTelephoneTypeEDataType = createEDataType(MOBILE_TELEPHONE_TYPE);
		operationTYPEObjectEDataType = createEDataType(OPERATION_TYPE_OBJECT);
		other1TypeEDataType = createEDataType(OTHER1_TYPE);
		other2TypeEDataType = createEDataType(OTHER2_TYPE);
		patientGUIDTypeEDataType = createEDataType(PATIENT_GUID_TYPE);
		patientNoTypeEDataType = createEDataType(PATIENT_NO_TYPE);
		physicianTypeEDataType = createEDataType(PHYSICIAN_TYPE);
		provinceTypeEDataType = createEDataType(PROVINCE_TYPE);
		referralTypeEDataType = createEDataType(REFERRAL_TYPE);
		salutationTypeEDataType = createEDataType(SALUTATION_TYPE);
		ssNumberTypeEDataType = createEDataType(SS_NUMBER_TYPE);
		titleTypeEDataType = createEDataType(TITLE_TYPE);
		typeOfDataTypeObjectEDataType = createEDataType(TYPE_OF_DATA_TYPE_OBJECT);
		userIdTypeEDataType = createEDataType(USER_ID_TYPE);
		userIdType1EDataType = createEDataType(USER_ID_TYPE1);
		workTelephoneTypeEDataType = createEDataType(WORK_TELEPHONE_TYPE);
		zipTypeEDataType = createEDataType(ZIP_TYPE);
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
		AudiogramPackage theAudiogramPackage = (AudiogramPackage)EPackage.Registry.INSTANCE.getEPackage(AudiogramPackage.eNS_URI);
		Audiogram502Package theAudiogram502Package = (Audiogram502Package)EPackage.Registry.INSTANCE.getEPackage(Audiogram502Package.eNS_URI);
		SelectionPackage theSelectionPackage = (SelectionPackage)EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);
		FittingPackage theFittingPackage = (FittingPackage)EPackage.Registry.INSTANCE.getEPackage(FittingPackage.eNS_URI);
		RemotecontrolPackage theRemotecontrolPackage = (RemotecontrolPackage)EPackage.Registry.INSTANCE.getEPackage(RemotecontrolPackage.eNS_URI);
		RealearPackage theRealearPackage = (RealearPackage)EPackage.Registry.INSTANCE.getEPackage(RealearPackage.eNS_URI);
		TestPackage theTestPackage = (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		ImpedancePackage theImpedancePackage = (ImpedancePackage)EPackage.Registry.INSTANCE.getEPackage(ImpedancePackage.eNS_URI);
		AdmittancePackage theAdmittancePackage = (AdmittancePackage)EPackage.Registry.INSTANCE.getEPackage(AdmittancePackage.eNS_URI);
		TinnitusPackage theTinnitusPackage = (TinnitusPackage)EPackage.Registry.INSTANCE.getEPackage(TinnitusPackage.eNS_URI);
		AudiogrammetadataPackage theAudiogrammetadataPackage = (AudiogrammetadataPackage)EPackage.Registry.INSTANCE.getEPackage(AudiogrammetadataPackage.eNS_URI);
		CochlearPackage theCochlearPackage = (CochlearPackage)EPackage.Registry.INSTANCE.getEPackage(CochlearPackage.eNS_URI);
		JournalPackage theJournalPackage = (JournalPackage)EPackage.Registry.INSTANCE.getEPackage(JournalPackage.eNS_URI);
		NotificationPackage theNotificationPackage = (NotificationPackage)EPackage.Registry.INSTANCE.getEPackage(NotificationPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patientType1EClass.getESuperTypes().add(this.getPatient());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionDataTypeEClass, ActionDataType.class, "ActionDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDataType_TypeOfData(), this.getTypeOfDataType(), "typeOfData", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_DataFormat(), this.getDataFormatType(), "dataFormat", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_Description(), this.getDescriptionType(), "description", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_ActionDate(), theXMLTypePackage.getDateTime(), "actionDate", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_LastModifiedDate(), theXMLTypePackage.getDateTime(), "lastModifiedDate", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_UserId(), this.getUserIdType(), "userId", null, 1, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDataType_PublicData(), this.getPubliclyFormattedData(), null, "publicData", null, 0, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_ActionGroup(), theXMLTypePackage.getDateTime(), "actionGroup", null, 0, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_DeviceType(), this.getDeviceTypeType(), "deviceType", null, 0, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_ModuleId(), theXMLTypePackage.getInteger(), "moduleId", null, 0, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDataType_Operation(), this.getOperationTYPE(), "operation", null, 0, 1, ActionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionsTypeEClass, ActionsType.class, "ActionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionsType_Action(), this.getActionDataType(), null, "action", null, 0, -1, ActionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Patients(), this.getPatientsType(), null, "patients", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(patientsTypeEClass, PatientsType.class, "PatientsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatientsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PatientsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatientsType_Patient(), this.getPatientType1(), null, "patient", null, 1, -1, PatientsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientGUID(), this.getPatientGUIDType(), "patientGUID", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_FirstName(), this.getFirstNameType(), "firstName", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_LastName(), this.getLastNameType(), "lastName", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_MiddleName(), this.getMiddleNameType(), "middleName", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_PatientNo(), this.getPatientNoType(), "patientNo", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_ActivePatient(), theXMLTypePackage.getBooleanObject(), "activePatient", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Gender(), this.getGenderTypeObject(), "gender", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_BirthDate(), this.getBirthDateType(), "birthDate", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_UserId(), this.getUserIdType1(), "userId", null, 1, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_CreateDate(), this.getCreateDateType(), "createDate", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Address1(), this.getAddress1Type(), "address1", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Address2(), this.getAddress2Type(), "address2", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Address3(), this.getAddress3Type(), "address3", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Title(), this.getTitleType(), "title", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Salutation(), this.getSalutationType(), "salutation", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_SSNumber(), this.getSSNumberType(), "sSNumber", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Zip(), this.getZipType(), "zip", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_City(), this.getCityType(), "city", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Province(), this.getProvinceType(), "province", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Country(), this.getCountryType(), "country", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_EMail(), this.getEMailType(), "eMail", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_HomeTelephone(), this.getHomeTelephoneType(), "homeTelephone", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_WorkTelephone(), this.getWorkTelephoneType(), "workTelephone", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_MobileTelephone(), this.getMobileTelephoneType(), "mobileTelephone", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Insurance1(), this.getInsurance1Type(), "insurance1", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Insurance2(), this.getInsurance2Type(), "insurance2", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Physician(), this.getPhysicianType(), "physician", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Referral(), this.getReferralType(), "referral", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Other1(), this.getOther1Type(), "other1", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Other2(), this.getOther2Type(), "other2", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_BackEndSystemPatientId(), this.getBackEndSystemPatientIdType(), "backEndSystemPatientId", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientType1EClass, PatientType1.class, "PatientType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatientType1_Actions(), this.getActionsType(), null, "actions", null, 0, 1, PatientType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publiclyFormattedDataEClass, PubliclyFormattedData.class, "PubliclyFormattedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPubliclyFormattedData_HIMSAAudiometricStandard(), theAudiogramPackage.getHIMSAAudiometricStandardType(), null, "hIMSAAudiometricStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HIMSAAudiometricStandard1(), theAudiogram502Package.getHIMSAAudiometricStandardType(), null, "hIMSAAudiometricStandard1", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HearingInstrumentSelection(), theSelectionPackage.getHearingInstrumentSelectionType(), null, "hearingInstrumentSelection", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HearingInstrumentFitting(), theFittingPackage.getHearingInstrumentFittingType(), null, "hearingInstrumentFitting", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_RemoteControlSelection(), theRemotecontrolPackage.getRemoteControlSelectionType(), null, "remoteControlSelection", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HIMSARemStandard(), theRealearPackage.getHIMSARemStandardType(), null, "hIMSARemStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HIMSAHitStandard(), theTestPackage.getHIMSAHitStandardType(), null, "hIMSAHitStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement(), theImpedancePackage.getAcousticImpedanceCompleteMeasurementType(), null, "acousticImpedanceCompleteMeasurement", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_AcousticImmittanceAssessment(), theAdmittancePackage.getAcousticImmittanceAssessmentType(), null, "acousticImmittanceAssessment", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_TinnitusMeasurementData(), theTinnitusPackage.getTinnitusMeasurementDataType(), null, "tinnitusMeasurementData", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HIMSAAudiogramMetadataStandard(), theAudiogrammetadataPackage.getHIMSAAudiogramMetadataStandardType(), null, "hIMSAAudiogramMetadataStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_CochlearImplantSoundProcessorSelection(), theCochlearPackage.getCochlearImplantSoundProcessorSelectionType(), null, "cochlearImplantSoundProcessorSelection", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_HIMSAJournalStandard(), theJournalPackage.getHIMSAJournalStandardType(), null, "hIMSAJournalStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_NotificationAction(), theNotificationPackage.getNotificationActionType(), null, "notificationAction", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliclyFormattedData_ScanMetaDataStandard(), theDataPackage.getScanMetaDataStandardType(), null, "scanMetaDataStandard", null, 0, 1, PubliclyFormattedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderTypeEEnum, GenderType.class, "GenderType");
		addEEnumLiteral(genderTypeEEnum, GenderType.MALE);
		addEEnumLiteral(genderTypeEEnum, GenderType.FEMALE);
		addEEnumLiteral(genderTypeEEnum, GenderType.NOT_RECORDED);

		initEEnum(operationTYPEEEnum, OperationTYPE.class, "OperationTYPE");
		addEEnumLiteral(operationTYPEEEnum, OperationTYPE.DELETED);

		initEEnum(typeOfDataTypeEEnum, TypeOfDataType.class, "TypeOfDataType");
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.AUDIOGRAM);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HEARING_INSTRUMENT_SELECTION_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HEARING_INSTRUMENT_SELECTION_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HEARING_INSTRUMENT_FITTING_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HEARING_INSTRUMENT_FITTING_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.REMOTE_CONTROL_SELECTION);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.IMPEDANCE_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.IMPEDANCE_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.REM_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.REM_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HIT_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.HIT_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.TINNITUS);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.AUDIOGRAM_METADATA);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.JOURNAL_DATA);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.NOTIFICATION_ACTION);
		addEEnumLiteral(typeOfDataTypeEEnum, TypeOfDataType.SCAN_META_DATA);

		// Initialize data types
		initEDataType(address1TypeEDataType, String.class, "Address1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(address2TypeEDataType, String.class, "Address2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(address3TypeEDataType, String.class, "Address3Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(backEndSystemPatientIdTypeEDataType, String.class, "BackEndSystemPatientIdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(birthDateTypeEDataType, XMLGregorianCalendar.class, "BirthDateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cityTypeEDataType, String.class, "CityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countryTypeEDataType, String.class, "CountryType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(createDateTypeEDataType, XMLGregorianCalendar.class, "CreateDateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataFormatTypeEDataType, BigInteger.class, "DataFormatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(descriptionTypeEDataType, String.class, "DescriptionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceTypeTypeEDataType, int.class, "DeviceTypeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceTypeTypeObjectEDataType, Integer.class, "DeviceTypeTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eMailTypeEDataType, String.class, "EMailType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(firstNameTypeEDataType, String.class, "FirstNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(genderTypeObjectEDataType, GenderType.class, "GenderTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(homeTelephoneTypeEDataType, String.class, "HomeTelephoneType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(insurance1TypeEDataType, String.class, "Insurance1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(insurance2TypeEDataType, String.class, "Insurance2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lastNameTypeEDataType, String.class, "LastNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(middleNameTypeEDataType, String.class, "MiddleNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mobileTelephoneTypeEDataType, String.class, "MobileTelephoneType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationTYPEObjectEDataType, OperationTYPE.class, "OperationTYPEObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(other1TypeEDataType, String.class, "Other1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(other2TypeEDataType, String.class, "Other2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(patientGUIDTypeEDataType, String.class, "PatientGUIDType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(patientNoTypeEDataType, String.class, "PatientNoType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(physicianTypeEDataType, String.class, "PhysicianType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(provinceTypeEDataType, String.class, "ProvinceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(referralTypeEDataType, String.class, "ReferralType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(salutationTypeEDataType, String.class, "SalutationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ssNumberTypeEDataType, String.class, "SSNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(titleTypeEDataType, String.class, "TitleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeOfDataTypeObjectEDataType, TypeOfDataType.class, "TypeOfDataTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(userIdTypeEDataType, String.class, "UserIdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(userIdType1EDataType, String.class, "UserIdType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(workTelephoneTypeEDataType, String.class, "WorkTelephoneType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zipTypeEDataType, String.class, "ZipType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (actionDataTypeEClass,
		   source,
		   new String[] {
			   "name", "Action_Data_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getActionDataType_TypeOfData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TypeOfData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_DataFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_ActionDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ActionDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_LastModifiedDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LastModifiedDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_UserId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UserId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_PublicData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PublicData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_ActionGroup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ActionGroup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_DeviceType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_ModuleId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ModuleId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionDataType_Operation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "operation"
		   });
		addAnnotation
		  (actionsTypeEClass,
		   source,
		   new String[] {
			   "name", "Actions_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getActionsType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (address1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Address1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (address2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Address2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (address3TypeEDataType,
		   source,
		   new String[] {
			   "name", "Address3_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (backEndSystemPatientIdTypeEDataType,
		   source,
		   new String[] {
			   "name", "BackEndSystemPatientId_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (birthDateTypeEDataType,
		   source,
		   new String[] {
			   "name", "BirthDate_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
		addAnnotation
		  (cityTypeEDataType,
		   source,
		   new String[] {
			   "name", "City_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (countryTypeEDataType,
		   source,
		   new String[] {
			   "name", "Country_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (createDateTypeEDataType,
		   source,
		   new String[] {
			   "name", "CreateDate_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
		addAnnotation
		  (dataFormatTypeEDataType,
		   source,
		   new String[] {
			   "name", "DataFormat_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (descriptionTypeEDataType,
		   source,
		   new String[] {
			   "name", "Description_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "60"
		   });
		addAnnotation
		  (deviceTypeTypeEDataType,
		   source,
		   new String[] {
			   "name", "DeviceType_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });
		addAnnotation
		  (deviceTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DeviceType_._type:Object",
			   "baseType", "DeviceType_._type"
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
		  (getDocumentRoot_Patients(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Patients",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (eMailTypeEDataType,
		   source,
		   new String[] {
			   "name", "EMail_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "50"
		   });
		addAnnotation
		  (firstNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "FirstName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (genderTypeEEnum,
		   source,
		   new String[] {
			   "name", "Gender_._type"
		   });
		addAnnotation
		  (genderTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Gender_._type:Object",
			   "baseType", "Gender_._type"
		   });
		addAnnotation
		  (homeTelephoneTypeEDataType,
		   source,
		   new String[] {
			   "name", "HomeTelephone_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (insurance1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Insurance1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (insurance2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Insurance2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (lastNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "LastName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (middleNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "MiddleName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (mobileTelephoneTypeEDataType,
		   source,
		   new String[] {
			   "name", "MobileTelephone_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (operationTYPEEEnum,
		   source,
		   new String[] {
			   "name", "operation_TYPE"
		   });
		addAnnotation
		  (operationTYPEObjectEDataType,
		   source,
		   new String[] {
			   "name", "operation_TYPE:Object",
			   "baseType", "operation_TYPE"
		   });
		addAnnotation
		  (other1TypeEDataType,
		   source,
		   new String[] {
			   "name", "Other1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (other2TypeEDataType,
		   source,
		   new String[] {
			   "name", "Other2_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (patientGUIDTypeEDataType,
		   source,
		   new String[] {
			   "name", "PatientGUID_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "\\{[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}\\}"
		   });
		addAnnotation
		  (patientNoTypeEDataType,
		   source,
		   new String[] {
			   "name", "PatientNo_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (patientsTypeEClass,
		   source,
		   new String[] {
			   "name", "Patients_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatientsType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getPatientsType_Patient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Patient",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (patientEClass,
		   source,
		   new String[] {
			   "name", "Patient_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatient_PatientGUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PatientGUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_FirstName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FirstName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_LastName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LastName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_MiddleName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MiddleName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_PatientNo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PatientNo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_ActivePatient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ActivePatient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Gender(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gender",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_BirthDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BirthDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_UserId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UserId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_CreateDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CreateDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Address1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Address2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Address3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Salutation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Salutation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_SSNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SSNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Zip(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zip",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_City(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "City",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Province(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Province",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Country(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Country",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_EMail(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EMail",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_HomeTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HomeTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_WorkTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WorkTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_MobileTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MobileTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Insurance1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Insurance1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Insurance2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Insurance2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Physician(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Physician",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Referral(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Referral",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Other1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Other1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_Other2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Other2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPatient_BackEndSystemPatientId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BackEndSystemPatientId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (patientType1EClass,
		   source,
		   new String[] {
			   "name", "Patient_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPatientType1_Actions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Actions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (physicianTypeEDataType,
		   source,
		   new String[] {
			   "name", "Physician_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (provinceTypeEDataType,
		   source,
		   new String[] {
			   "name", "Province_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (publiclyFormattedDataEClass,
		   source,
		   new String[] {
			   "name", "PubliclyFormattedData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSAAudiometricStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAAudiometricStandard",
			   "namespace", "http://www.himsa.com/Measurement/Audiogram"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSAAudiometricStandard1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAAudiometricStandard",
			   "namespace", "http://www.himsa.com/Measurement/Audiogram/502"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HearingInstrumentSelection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrumentSelection",
			   "namespace", "http://www.himsa.com/Instrument/Selection"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HearingInstrumentFitting(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HearingInstrumentFitting",
			   "namespace", "http://www.himsa.com/Instrument/Fitting"
		   });
		addAnnotation
		  (getPubliclyFormattedData_RemoteControlSelection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RemoteControlSelection",
			   "namespace", "http://www.himsa.com/Instrument/RemoteControl"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSARemStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSARemStandard",
			   "namespace", "http://www.himsa.com/Measurement/RealEar"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSAHitStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAHitStandard",
			   "namespace", "http://www.himsa.com/Measurement/HearingInstrumentTest"
		   });
		addAnnotation
		  (getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AcousticImpedanceCompleteMeasurement",
			   "namespace", "http://www.himsa.com/Measurement/Impedance"
		   });
		addAnnotation
		  (getPubliclyFormattedData_AcousticImmittanceAssessment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AcousticImmittanceAssessment",
			   "namespace", "http://www.himsa.com/Measurement/Admittance/501"
		   });
		addAnnotation
		  (getPubliclyFormattedData_TinnitusMeasurementData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TinnitusMeasurementData",
			   "namespace", "http://www.himsa.com/measurement/Tinnitus/500"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSAAudiogramMetadataStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAAudiogramMetadataStandard",
			   "namespace", "http://www.himsa.com/Measurement/AudiogramMetadata/500"
		   });
		addAnnotation
		  (getPubliclyFormattedData_CochlearImplantSoundProcessorSelection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CochlearImplantSoundProcessorSelection",
			   "namespace", "http://www.himsa.com/CochlearImplantSoundProcessorSelection/500"
		   });
		addAnnotation
		  (getPubliclyFormattedData_HIMSAJournalStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HIMSAJournalStandard",
			   "namespace", "http://www.himsa.com/other/Journal/500"
		   });
		addAnnotation
		  (getPubliclyFormattedData_NotificationAction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NotificationAction",
			   "namespace", "http://www.himsa.com/AlertDashboard/Notification/500"
		   });
		addAnnotation
		  (getPubliclyFormattedData_ScanMetaDataStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanMetaDataStandard",
			   "namespace", "http://www.himsa.com/Scan/ScanMetaData"
		   });
		addAnnotation
		  (referralTypeEDataType,
		   source,
		   new String[] {
			   "name", "Referral_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (salutationTypeEDataType,
		   source,
		   new String[] {
			   "name", "Salutation_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (ssNumberTypeEDataType,
		   source,
		   new String[] {
			   "name", "SSNumber_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
		addAnnotation
		  (titleTypeEDataType,
		   source,
		   new String[] {
			   "name", "Title_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (typeOfDataTypeEEnum,
		   source,
		   new String[] {
			   "name", "TypeOfData_._type"
		   });
		addAnnotation
		  (typeOfDataTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "TypeOfData_._type:Object",
			   "baseType", "TypeOfData_._type"
		   });
		addAnnotation
		  (userIdTypeEDataType,
		   source,
		   new String[] {
			   "name", "UserId_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "3"
		   });
		addAnnotation
		  (userIdType1EDataType,
		   source,
		   new String[] {
			   "name", "UserId_._1_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "3"
		   });
		addAnnotation
		  (workTelephoneTypeEDataType,
		   source,
		   new String[] {
			   "name", "WorkTelephone_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "30"
		   });
		addAnnotation
		  (zipTypeEDataType,
		   source,
		   new String[] {
			   "name", "Zip_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
	}

} //PatientExportPackageImpl
