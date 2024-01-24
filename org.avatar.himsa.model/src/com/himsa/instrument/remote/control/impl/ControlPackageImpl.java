/**
 */
package com.himsa.instrument.remote.control.impl;

import com.himsa.cochlear.implant.sound.processor.selection._500._500Package;

import com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl;

import com.himsa.instrument.fitting.FittingPackage;

import com.himsa.instrument.fitting.impl.FittingPackageImpl;

import com.himsa.instrument.remote.control.BatteryType;
import com.himsa.instrument.remote.control.ControlFactory;
import com.himsa.instrument.remote.control.ControlPackage;
import com.himsa.instrument.remote.control.DocumentRoot;
import com.himsa.instrument.remote.control.RemoteControlSelectionType;

import com.himsa.instrument.remote.control.util.ControlValidator;

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
public class ControlPackageImpl extends EPackageImpl implements ControlPackage {
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
	 * @see com.himsa.instrument.remote.control.ControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlPackageImpl() {
		super(eNS_URI, ControlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlPackage init() {
		if (isInited) return (ControlPackage)EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredControlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ControlPackageImpl theControlPackage = registeredControlPackage instanceof ControlPackageImpl ? (ControlPackageImpl)registeredControlPackage : new ControlPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.measurement.tinnitus._500._500Package.eNS_URI);
		com.himsa.measurement.tinnitus._500.impl._500PackageImpl the_500Package_4 = (com.himsa.measurement.tinnitus._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.measurement.tinnitus._500.impl._500PackageImpl ? registeredPackage : com.himsa.measurement.tinnitus._500._500Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theControlPackage.createPackageContents();
		the_501Package.createPackageContents();
		theImpedancePackage.createPackageContents();
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
		the_500Package_4.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theControlPackage.initializePackageContents();
		the_501Package.initializePackageContents();
		theImpedancePackage.initializePackageContents();
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
		the_500Package_4.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theControlPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ControlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theControlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlPackage.eNS_URI, theControlPackage);
		return theControlPackage;
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
	public ControlFactory getControlFactory() {
		return (ControlFactory)getEFactoryInstance();
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

} //ControlPackageImpl
