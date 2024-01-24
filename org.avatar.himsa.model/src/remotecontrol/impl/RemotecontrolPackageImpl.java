/**
 */
package remotecontrol.impl;

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

import journal.JournalPackage;

import journal.impl.JournalPackageImpl;

import notification.NotificationPackage;

import notification.impl.NotificationPackageImpl;

import org.avatar.himsa.export.PatientExportPackage;

import org.avatar.himsa.export.impl.PatientExportPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import realear.RealearPackage;

import realear.impl.RealearPackageImpl;

import remotecontrol.BatteryType;
import remotecontrol.DocumentRoot;
import remotecontrol.RemoteControlSelectionType;
import remotecontrol.RemotecontrolFactory;
import remotecontrol.RemotecontrolPackage;

import remotecontrol.util.RemotecontrolValidator;

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
public class RemotecontrolPackageImpl extends EPackageImpl implements RemotecontrolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteControlSelectionTypeEClass = null;

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
	private EDataType batteryTypeTextTypeEDataType = null;

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
	private EDataType instrumentTypeNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serialNumberTypeEDataType = null;

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
	 * @see remotecontrol.RemotecontrolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RemotecontrolPackageImpl() {
		super(eNS_URI, RemotecontrolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RemotecontrolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RemotecontrolPackage init() {
		if (isInited) return (RemotecontrolPackage)EPackage.Registry.INSTANCE.getEPackage(RemotecontrolPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRemotecontrolPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RemotecontrolPackageImpl theRemotecontrolPackage = registeredRemotecontrolPackage instanceof RemotecontrolPackageImpl ? (RemotecontrolPackageImpl)registeredRemotecontrolPackage : new RemotecontrolPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TinnitusPackage.eNS_URI);
		TinnitusPackageImpl theTinnitusPackage = (TinnitusPackageImpl)(registeredPackage instanceof TinnitusPackageImpl ? registeredPackage : TinnitusPackage.eINSTANCE);

		// Create package meta-data objects
		theRemotecontrolPackage.createPackageContents();
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
		theTinnitusPackage.createPackageContents();

		// Initialize created meta-data
		theRemotecontrolPackage.initializePackageContents();
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
		theTinnitusPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRemotecontrolPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RemotecontrolValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRemotecontrolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RemotecontrolPackage.eNS_URI, theRemotecontrolPackage);
		return theRemotecontrolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatteryType() {
		return batteryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryType_BatteryTypeCode() {
		return (EAttribute)batteryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBatteryType_BatteryTypeText() {
		return (EAttribute)batteryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteControlSelectionType() {
		return remoteControlSelectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_InstrumentTypeName() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_SerialNumber() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoteControlSelectionType_BatteryType() {
		return (EReference)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_Reserved() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_PrivateSelectionData() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_ConvertedFromDataStandard() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_ValidatedByNOAH() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteControlSelectionType_Version() {
		return (EAttribute)remoteControlSelectionTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getDocumentRoot_RemoteControlSelection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBatteryTypeTextType() {
		return batteryTypeTextTypeEDataType;
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
	public EDataType getInstrumentTypeNameType() {
		return instrumentTypeNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSerialNumberType() {
		return serialNumberTypeEDataType;
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
	public RemotecontrolFactory getRemotecontrolFactory() {
		return (RemotecontrolFactory)getEFactoryInstance();
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
		batteryTypeEClass = createEClass(BATTERY_TYPE);
		createEAttribute(batteryTypeEClass, BATTERY_TYPE__BATTERY_TYPE_CODE);
		createEAttribute(batteryTypeEClass, BATTERY_TYPE__BATTERY_TYPE_TEXT);

		remoteControlSelectionTypeEClass = createEClass(REMOTE_CONTROL_SELECTION_TYPE);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER);
		createEReference(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__RESERVED);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH);
		createEAttribute(remoteControlSelectionTypeEClass, REMOTE_CONTROL_SELECTION_TYPE__VERSION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_CONTROL_SELECTION);

		// Create data types
		batteryTypeTextTypeEDataType = createEDataType(BATTERY_TYPE_TEXT_TYPE);
		convertedFromDataStandardTypeEDataType = createEDataType(CONVERTED_FROM_DATA_STANDARD_TYPE);
		instrumentTypeNameTypeEDataType = createEDataType(INSTRUMENT_TYPE_NAME_TYPE);
		serialNumberTypeEDataType = createEDataType(SERIAL_NUMBER_TYPE);
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
		initEClass(batteryTypeEClass, BatteryType.class, "BatteryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryType_BatteryTypeCode(), theXMLTypePackage.getInteger(), "batteryTypeCode", null, 0, 1, BatteryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryType_BatteryTypeText(), this.getBatteryTypeTextType(), "batteryTypeText", null, 0, 1, BatteryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteControlSelectionTypeEClass, RemoteControlSelectionType.class, "RemoteControlSelectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteControlSelectionType_InstrumentTypeName(), this.getInstrumentTypeNameType(), "instrumentTypeName", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_SerialNumber(), this.getSerialNumberType(), "serialNumber", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteControlSelectionType_BatteryType(), this.getBatteryType(), null, "batteryType", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_Reserved(), theXMLTypePackage.getBase64Binary(), "reserved", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_PrivateSelectionData(), theXMLTypePackage.getBase64Binary(), "privateSelectionData", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_ConvertedFromDataStandard(), this.getConvertedFromDataStandardType(), "convertedFromDataStandard", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_ValidatedByNOAH(), theXMLTypePackage.getBoolean(), "validatedByNOAH", null, 0, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteControlSelectionType_Version(), this.getVersionType(), "version", "500", 1, 1, RemoteControlSelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteControlSelection(), this.getRemoteControlSelectionType(), null, "remoteControlSelection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(batteryTypeTextTypeEDataType, String.class, "BatteryTypeTextType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(convertedFromDataStandardTypeEDataType, BigInteger.class, "ConvertedFromDataStandardType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instrumentTypeNameTypeEDataType, String.class, "InstrumentTypeNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serialNumberTypeEDataType, String.class, "SerialNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (batteryTypeEClass,
		   source,
		   new String[] {
			   "name", "Battery_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBatteryType_BatteryTypeCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryTypeCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBatteryType_BatteryTypeText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryTypeText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (batteryTypeTextTypeEDataType,
		   source,
		   new String[] {
			   "name", "BatteryTypeText_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "21"
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
		  (instrumentTypeNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "InstrumentTypeName_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "41"
		   });
		addAnnotation
		  (remoteControlSelectionTypeEClass,
		   source,
		   new String[] {
			   "name", "RemoteControlSelection_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_InstrumentTypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InstrumentTypeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_SerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_BatteryType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BatteryType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_Reserved(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Reserved",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_PrivateSelectionData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PrivateSelectionData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_ConvertedFromDataStandard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConvertedFromDataStandard"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_ValidatedByNOAH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ValidatedByNOAH"
		   });
		addAnnotation
		  (getRemoteControlSelectionType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (serialNumberTypeEDataType,
		   source,
		   new String[] {
			   "name", "SerialNumber_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "21"
		   });
		addAnnotation
		  (versionTypeEDataType,
		   source,
		   new String[] {
			   "name", "Version_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
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
		  (getDocumentRoot_RemoteControlSelection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RemoteControlSelection",
			   "namespace", "##targetNamespace"
		   });
	}

} //RemotecontrolPackageImpl
