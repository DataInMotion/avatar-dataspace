/**
 */
package com.himsa.scan.scan.meta.data.impl;

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

import com.himsa.measurement.impedance.ImpedancePackage;

import com.himsa.measurement.impedance.impl.ImpedancePackageImpl;

import com.himsa.measurement.real.ear.EarPackage;

import com.himsa.measurement.real.ear.impl.EarPackageImpl;

import com.himsa.patient.export.patient.export.ExportPackage;

import com.himsa.patient.export.patient.export.impl.ExportPackageImpl;

import com.himsa.scan.scan.meta.data.AreaType;
import com.himsa.scan.scan.meta.data.AreaType1;
import com.himsa.scan.scan.meta.data.DataFactory;
import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.DirectionType;
import com.himsa.scan.scan.meta.data.DirectionType1;
import com.himsa.scan.scan.meta.data.DocumentRoot;
import com.himsa.scan.scan.meta.data.EarType;
import com.himsa.scan.scan.meta.data.JawPositionType;
import com.himsa.scan.scan.meta.data.PackageType;
import com.himsa.scan.scan.meta.data.PlaneType;
import com.himsa.scan.scan.meta.data.PlaneType1;
import com.himsa.scan.scan.meta.data.PointType;
import com.himsa.scan.scan.meta.data.PointType1;
import com.himsa.scan.scan.meta.data.ScanAnnotations3DType;
import com.himsa.scan.scan.meta.data.ScanFormatType;
import com.himsa.scan.scan.meta.data.ScanMetaDataStandardType;
import com.himsa.scan.scan.meta.data.ScanPropertiesType;
import com.himsa.scan.scan.meta.data.ScannerHardwareType;
import com.himsa.scan.scan.meta.data.ScannerTypeType;
import com.himsa.scan.scan.meta.data.ScansType;
import com.himsa.scan.scan.meta.data.StoredInNoahType;
import com.himsa.scan.scan.meta.data.StoredPublicOrPrivateType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanAnnotations3DTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanMetaDataStandardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scannerHardwareTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scansTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storedInNoahTypeEClass = null;

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
	private EEnum earTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jawPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scanFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scannerTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storedPublicOrPrivateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinateTypeObjectEDataType = null;

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
	private EDataType jawPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scanFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scannerTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType storedPublicOrPrivateTypeObjectEDataType = null;

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
	 * @see com.himsa.scan.scan.meta.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataPackageImpl theDataPackage = registeredDataPackage instanceof DataPackageImpl ? (DataPackageImpl)registeredDataPackage : new DataPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);
		ControlPackageImpl theControlPackage = (ControlPackageImpl)(registeredPackage instanceof ControlPackageImpl ? registeredPackage : ControlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(com.himsa.measurement.tinnitus._500._500Package.eNS_URI);
		com.himsa.measurement.tinnitus._500.impl._500PackageImpl the_500Package_4 = (com.himsa.measurement.tinnitus._500.impl._500PackageImpl)(registeredPackage instanceof com.himsa.measurement.tinnitus._500.impl._500PackageImpl ? registeredPackage : com.himsa.measurement.tinnitus._500._500Package.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
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
		theControlPackage.createPackageContents();
		the_500Package_4.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
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
		theControlPackage.initializePackageContents();
		the_500Package_4.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaType() {
		return areaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaType_Points() {
		return (EReference)areaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaType1() {
		return areaType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaType1_AnnotationComment() {
		return (EAttribute)areaType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectionType() {
		return directionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectionType_Point() {
		return (EReference)directionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectionType_Vector() {
		return (EReference)directionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectionType1() {
		return directionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectionType1_AnnotationComment() {
		return (EAttribute)directionType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageType() {
		return packageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageType_PackageLocation() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageType_PackageID() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaneType() {
		return planeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaneType_Plane() {
		return (EReference)planeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaneType1() {
		return planeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType1_AnnotationComment() {
		return (EAttribute)planeType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointType() {
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType_X() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType_Y() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType_Z() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointType1() {
		return pointType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType1_AnnotationComment() {
		return (EAttribute)pointType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScanAnnotations3DType() {
		return scanAnnotations3DTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanAnnotations3DType_Point() {
		return (EReference)scanAnnotations3DTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanAnnotations3DType_Direction() {
		return (EReference)scanAnnotations3DTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanAnnotations3DType_Plane() {
		return (EReference)scanAnnotations3DTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanAnnotations3DType_Area() {
		return (EReference)scanAnnotations3DTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScanMetaDataStandardType() {
		return scanMetaDataStandardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanMetaDataStandardType_ScanPackage() {
		return (EReference)scanMetaDataStandardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanMetaDataStandardType_Scans() {
		return (EReference)scanMetaDataStandardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanMetaDataStandardType_Version() {
		return (EAttribute)scanMetaDataStandardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScannerHardwareType() {
		return scannerHardwareTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScannerHardwareType_ScannerProvider() {
		return (EAttribute)scannerHardwareTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScannerHardwareType_ScannerModel() {
		return (EAttribute)scannerHardwareTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScannerHardwareType_ScannerFirmware() {
		return (EAttribute)scannerHardwareTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScannerHardwareType_ScannerType() {
		return (EAttribute)scannerHardwareTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScannerHardwareType_UniqueScannerID() {
		return (EAttribute)scannerHardwareTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScanPropertiesType() {
		return scanPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_Group() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_ScanTimeStamp() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_Ear() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_JawPosition() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_ScanFormat() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_ScanComment() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScanPropertiesType_ScanFileAndLocation() {
		return (EAttribute)scanPropertiesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScanPropertiesType_ScanStoredInNoah() {
		return (EReference)scanPropertiesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScansType() {
		return scansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScansType_ScannerHardware() {
		return (EReference)scansTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScansType_ScanProperties() {
		return (EReference)scansTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScansType_ScanAnnotations() {
		return (EReference)scansTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoredInNoahType() {
		return storedInNoahTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoredInNoahType_StoredPublicOrPrivate() {
		return (EAttribute)storedInNoahTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoredInNoahType_ActionDateTimeStamp() {
		return (EAttribute)storedInNoahTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_ScanMetaDataStandard() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
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
	public EEnum getJawPositionType() {
		return jawPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScanFormatType() {
		return scanFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScannerTypeType() {
		return scannerTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStoredPublicOrPrivateType() {
		return storedPublicOrPrivateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoordinateType() {
		return coordinateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoordinateTypeObject() {
		return coordinateTypeObjectEDataType;
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
	public EDataType getJawPositionTypeObject() {
		return jawPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScanFormatTypeObject() {
		return scanFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScannerTypeTypeObject() {
		return scannerTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStoredPublicOrPrivateTypeObject() {
		return storedPublicOrPrivateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
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
		areaTypeEClass = createEClass(AREA_TYPE);
		createEReference(areaTypeEClass, AREA_TYPE__POINTS);

		areaType1EClass = createEClass(AREA_TYPE1);
		createEAttribute(areaType1EClass, AREA_TYPE1__ANNOTATION_COMMENT);

		directionTypeEClass = createEClass(DIRECTION_TYPE);
		createEReference(directionTypeEClass, DIRECTION_TYPE__POINT);
		createEReference(directionTypeEClass, DIRECTION_TYPE__VECTOR);

		directionType1EClass = createEClass(DIRECTION_TYPE1);
		createEAttribute(directionType1EClass, DIRECTION_TYPE1__ANNOTATION_COMMENT);

		packageTypeEClass = createEClass(PACKAGE_TYPE);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__PACKAGE_LOCATION);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__PACKAGE_ID);

		planeTypeEClass = createEClass(PLANE_TYPE);
		createEReference(planeTypeEClass, PLANE_TYPE__PLANE);

		planeType1EClass = createEClass(PLANE_TYPE1);
		createEAttribute(planeType1EClass, PLANE_TYPE1__ANNOTATION_COMMENT);

		pointTypeEClass = createEClass(POINT_TYPE);
		createEAttribute(pointTypeEClass, POINT_TYPE__X);
		createEAttribute(pointTypeEClass, POINT_TYPE__Y);
		createEAttribute(pointTypeEClass, POINT_TYPE__Z);

		pointType1EClass = createEClass(POINT_TYPE1);
		createEAttribute(pointType1EClass, POINT_TYPE1__ANNOTATION_COMMENT);

		scanAnnotations3DTypeEClass = createEClass(SCAN_ANNOTATIONS3_DTYPE);
		createEReference(scanAnnotations3DTypeEClass, SCAN_ANNOTATIONS3_DTYPE__POINT);
		createEReference(scanAnnotations3DTypeEClass, SCAN_ANNOTATIONS3_DTYPE__DIRECTION);
		createEReference(scanAnnotations3DTypeEClass, SCAN_ANNOTATIONS3_DTYPE__PLANE);
		createEReference(scanAnnotations3DTypeEClass, SCAN_ANNOTATIONS3_DTYPE__AREA);

		scanMetaDataStandardTypeEClass = createEClass(SCAN_META_DATA_STANDARD_TYPE);
		createEReference(scanMetaDataStandardTypeEClass, SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE);
		createEReference(scanMetaDataStandardTypeEClass, SCAN_META_DATA_STANDARD_TYPE__SCANS);
		createEAttribute(scanMetaDataStandardTypeEClass, SCAN_META_DATA_STANDARD_TYPE__VERSION);

		scannerHardwareTypeEClass = createEClass(SCANNER_HARDWARE_TYPE);
		createEAttribute(scannerHardwareTypeEClass, SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER);
		createEAttribute(scannerHardwareTypeEClass, SCANNER_HARDWARE_TYPE__SCANNER_MODEL);
		createEAttribute(scannerHardwareTypeEClass, SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE);
		createEAttribute(scannerHardwareTypeEClass, SCANNER_HARDWARE_TYPE__SCANNER_TYPE);
		createEAttribute(scannerHardwareTypeEClass, SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID);

		scanPropertiesTypeEClass = createEClass(SCAN_PROPERTIES_TYPE);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__GROUP);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__EAR);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__JAW_POSITION);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__SCAN_FORMAT);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__SCAN_COMMENT);
		createEAttribute(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION);
		createEReference(scanPropertiesTypeEClass, SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH);

		scansTypeEClass = createEClass(SCANS_TYPE);
		createEReference(scansTypeEClass, SCANS_TYPE__SCANNER_HARDWARE);
		createEReference(scansTypeEClass, SCANS_TYPE__SCAN_PROPERTIES);
		createEReference(scansTypeEClass, SCANS_TYPE__SCAN_ANNOTATIONS);

		storedInNoahTypeEClass = createEClass(STORED_IN_NOAH_TYPE);
		createEAttribute(storedInNoahTypeEClass, STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE);
		createEAttribute(storedInNoahTypeEClass, STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCAN_META_DATA_STANDARD);

		// Create enums
		earTypeEEnum = createEEnum(EAR_TYPE);
		jawPositionTypeEEnum = createEEnum(JAW_POSITION_TYPE);
		scanFormatTypeEEnum = createEEnum(SCAN_FORMAT_TYPE);
		scannerTypeTypeEEnum = createEEnum(SCANNER_TYPE_TYPE);
		storedPublicOrPrivateTypeEEnum = createEEnum(STORED_PUBLIC_OR_PRIVATE_TYPE);

		// Create data types
		coordinateTypeEDataType = createEDataType(COORDINATE_TYPE);
		coordinateTypeObjectEDataType = createEDataType(COORDINATE_TYPE_OBJECT);
		earTypeObjectEDataType = createEDataType(EAR_TYPE_OBJECT);
		jawPositionTypeObjectEDataType = createEDataType(JAW_POSITION_TYPE_OBJECT);
		scanFormatTypeObjectEDataType = createEDataType(SCAN_FORMAT_TYPE_OBJECT);
		scannerTypeTypeObjectEDataType = createEDataType(SCANNER_TYPE_TYPE_OBJECT);
		storedPublicOrPrivateTypeObjectEDataType = createEDataType(STORED_PUBLIC_OR_PRIVATE_TYPE_OBJECT);
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
		areaType1EClass.getESuperTypes().add(this.getAreaType());
		directionType1EClass.getESuperTypes().add(this.getDirectionType());
		planeType1EClass.getESuperTypes().add(this.getPlaneType());
		pointType1EClass.getESuperTypes().add(this.getPointType());

		// Initialize classes, features, and operations; add parameters
		initEClass(areaTypeEClass, AreaType.class, "AreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaType_Points(), this.getPointType(), null, "points", null, 3, -1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaType1EClass, AreaType1.class, "AreaType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAreaType1_AnnotationComment(), theXMLTypePackage.getString(), "annotationComment", null, 0, 1, AreaType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionTypeEClass, DirectionType.class, "DirectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectionType_Point(), this.getPointType(), null, "point", null, 1, 1, DirectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectionType_Vector(), this.getPointType(), null, "vector", null, 1, 1, DirectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionType1EClass, DirectionType1.class, "DirectionType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectionType1_AnnotationComment(), theXMLTypePackage.getString(), "annotationComment", null, 0, 1, DirectionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageTypeEClass, PackageType.class, "PackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageType_PackageLocation(), theXMLTypePackage.getAnyURI(), "packageLocation", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_PackageID(), theXMLTypePackage.getString(), "packageID", null, 0, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planeTypeEClass, PlaneType.class, "PlaneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaneType_Plane(), this.getDirectionType(), null, "plane", null, 1, 1, PlaneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planeType1EClass, PlaneType1.class, "PlaneType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaneType1_AnnotationComment(), theXMLTypePackage.getString(), "annotationComment", null, 0, 1, PlaneType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointTypeEClass, PointType.class, "PointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointType_X(), this.getCoordinateType(), "x", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Y(), this.getCoordinateType(), "y", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Z(), this.getCoordinateType(), "z", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointType1EClass, PointType1.class, "PointType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointType1_AnnotationComment(), theXMLTypePackage.getString(), "annotationComment", null, 0, 1, PointType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanAnnotations3DTypeEClass, ScanAnnotations3DType.class, "ScanAnnotations3DType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScanAnnotations3DType_Point(), this.getPointType1(), null, "point", null, 0, -1, ScanAnnotations3DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScanAnnotations3DType_Direction(), this.getDirectionType1(), null, "direction", null, 0, -1, ScanAnnotations3DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScanAnnotations3DType_Plane(), this.getPlaneType1(), null, "plane", null, 0, -1, ScanAnnotations3DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScanAnnotations3DType_Area(), this.getAreaType1(), null, "area", null, 0, -1, ScanAnnotations3DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanMetaDataStandardTypeEClass, ScanMetaDataStandardType.class, "ScanMetaDataStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScanMetaDataStandardType_ScanPackage(), this.getPackageType(), null, "scanPackage", null, 0, 1, ScanMetaDataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScanMetaDataStandardType_Scans(), this.getScansType(), null, "scans", null, 1, -1, ScanMetaDataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanMetaDataStandardType_Version(), theXMLTypePackage.getString(), "version", "500", 1, 1, ScanMetaDataStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scannerHardwareTypeEClass, ScannerHardwareType.class, "ScannerHardwareType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScannerHardwareType_ScannerProvider(), theXMLTypePackage.getString(), "scannerProvider", null, 1, 1, ScannerHardwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScannerHardwareType_ScannerModel(), theXMLTypePackage.getString(), "scannerModel", null, 1, 1, ScannerHardwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScannerHardwareType_ScannerFirmware(), theXMLTypePackage.getString(), "scannerFirmware", null, 0, 1, ScannerHardwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScannerHardwareType_ScannerType(), this.getScannerTypeType(), "scannerType", null, 1, 1, ScannerHardwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScannerHardwareType_UniqueScannerID(), theXMLTypePackage.getString(), "uniqueScannerID", null, 1, 1, ScannerHardwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanPropertiesTypeEClass, ScanPropertiesType.class, "ScanPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScanPropertiesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ScanPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_ScanTimeStamp(), theXMLTypePackage.getDateTime(), "scanTimeStamp", null, 1, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_Ear(), this.getEarType(), "ear", null, 1, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_JawPosition(), this.getJawPositionType(), "jawPosition", null, 0, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_ScanFormat(), this.getScanFormatType(), "scanFormat", null, 1, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_ScanComment(), theXMLTypePackage.getString(), "scanComment", null, 0, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScanPropertiesType_ScanFileAndLocation(), theXMLTypePackage.getAnyURI(), "scanFileAndLocation", null, 0, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getScanPropertiesType_ScanStoredInNoah(), this.getStoredInNoahType(), null, "scanStoredInNoah", null, 0, -1, ScanPropertiesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(scansTypeEClass, ScansType.class, "ScansType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScansType_ScannerHardware(), this.getScannerHardwareType(), null, "scannerHardware", null, 1, 1, ScansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScansType_ScanProperties(), this.getScanPropertiesType(), null, "scanProperties", null, 1, 1, ScansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScansType_ScanAnnotations(), this.getScanAnnotations3DType(), null, "scanAnnotations", null, 0, 1, ScansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storedInNoahTypeEClass, StoredInNoahType.class, "StoredInNoahType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoredInNoahType_StoredPublicOrPrivate(), this.getStoredPublicOrPrivateType(), "storedPublicOrPrivate", null, 1, 1, StoredInNoahType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoredInNoahType_ActionDateTimeStamp(), theXMLTypePackage.getDateTime(), "actionDateTimeStamp", null, 1, 1, StoredInNoahType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScanMetaDataStandard(), this.getScanMetaDataStandardType(), null, "scanMetaDataStandard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(earTypeEEnum, EarType.class, "EarType");
		addEEnumLiteral(earTypeEEnum, EarType.LEFT);
		addEEnumLiteral(earTypeEEnum, EarType.RIGHT);

		initEEnum(jawPositionTypeEEnum, JawPositionType.class, "JawPositionType");
		addEEnumLiteral(jawPositionTypeEEnum, JawPositionType.CLOSED);
		addEEnumLiteral(jawPositionTypeEEnum, JawPositionType.OPEN);
		addEEnumLiteral(jawPositionTypeEEnum, JawPositionType.BITE_BLOCK);
		addEEnumLiteral(jawPositionTypeEEnum, JawPositionType.UNKNOWN);

		initEEnum(scanFormatTypeEEnum, ScanFormatType.class, "ScanFormatType");
		addEEnumLiteral(scanFormatTypeEEnum, ScanFormatType.HPS);
		addEEnumLiteral(scanFormatTypeEEnum, ScanFormatType.STL_BINARY);
		addEEnumLiteral(scanFormatTypeEEnum, ScanFormatType.ASC);

		initEEnum(scannerTypeTypeEEnum, ScannerTypeType.class, "ScannerTypeType");
		addEEnumLiteral(scannerTypeTypeEEnum, ScannerTypeType.IMPRESSION);
		addEEnumLiteral(scannerTypeTypeEEnum, ScannerTypeType.INTRA_AURAL);

		initEEnum(storedPublicOrPrivateTypeEEnum, StoredPublicOrPrivateType.class, "StoredPublicOrPrivateType");
		addEEnumLiteral(storedPublicOrPrivateTypeEEnum, StoredPublicOrPrivateType.PUBLIC);
		addEEnumLiteral(storedPublicOrPrivateTypeEEnum, StoredPublicOrPrivateType.PRIVATE);

		// Initialize data types
		initEDataType(coordinateTypeEDataType, float.class, "CoordinateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordinateTypeObjectEDataType, Float.class, "CoordinateTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(earTypeObjectEDataType, EarType.class, "EarTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jawPositionTypeObjectEDataType, JawPositionType.class, "JawPositionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scanFormatTypeObjectEDataType, ScanFormatType.class, "ScanFormatTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scannerTypeTypeObjectEDataType, ScannerTypeType.class, "ScannerTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(storedPublicOrPrivateTypeObjectEDataType, StoredPublicOrPrivateType.class, "StoredPublicOrPrivateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (areaTypeEClass,
		   source,
		   new String[] {
			   "name", "Area_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAreaType_Points(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Points",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (areaType1EClass,
		   source,
		   new String[] {
			   "name", "Area_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAreaType1_AnnotationComment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AnnotationComment"
		   });
		addAnnotation
		  (coordinateTypeEDataType,
		   source,
		   new String[] {
			   "name", "Coordinate_Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#float"
		   });
		addAnnotation
		  (coordinateTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Coordinate_Type:Object",
			   "baseType", "Coordinate_Type"
		   });
		addAnnotation
		  (directionTypeEClass,
		   source,
		   new String[] {
			   "name", "Direction_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDirectionType_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDirectionType_Vector(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vector",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (directionType1EClass,
		   source,
		   new String[] {
			   "name", "Direction_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDirectionType1_AnnotationComment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AnnotationComment"
		   });
		addAnnotation
		  (earTypeEEnum,
		   source,
		   new String[] {
			   "name", "Ear_._type"
		   });
		addAnnotation
		  (earTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Ear_._type:Object",
			   "baseType", "Ear_._type"
		   });
		addAnnotation
		  (jawPositionTypeEEnum,
		   source,
		   new String[] {
			   "name", "JawPosition_._type"
		   });
		addAnnotation
		  (jawPositionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "JawPosition_._type:Object",
			   "baseType", "JawPosition_._type"
		   });
		addAnnotation
		  (packageTypeEClass,
		   source,
		   new String[] {
			   "name", "Package_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPackageType_PackageLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackageLocation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPackageType_PackageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackageID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (planeTypeEClass,
		   source,
		   new String[] {
			   "name", "Plane_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlaneType_Plane(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plane",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (planeType1EClass,
		   source,
		   new String[] {
			   "name", "Plane_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlaneType1_AnnotationComment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AnnotationComment"
		   });
		addAnnotation
		  (pointTypeEClass,
		   source,
		   new String[] {
			   "name", "Point_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointType_X(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "X",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_Y(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Y",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_Z(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Z",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointType1EClass,
		   source,
		   new String[] {
			   "name", "Point_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointType1_AnnotationComment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AnnotationComment"
		   });
		addAnnotation
		  (scanAnnotations3DTypeEClass,
		   source,
		   new String[] {
			   "name", "ScanAnnotations3D_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScanAnnotations3DType_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScanAnnotations3DType_Direction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Direction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScanAnnotations3DType_Plane(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plane",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScanAnnotations3DType_Area(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Area",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (scanFormatTypeEEnum,
		   source,
		   new String[] {
			   "name", "ScanFormat_._type"
		   });
		addAnnotation
		  (scanFormatTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ScanFormat_._type:Object",
			   "baseType", "ScanFormat_._type"
		   });
		addAnnotation
		  (scanMetaDataStandardTypeEClass,
		   source,
		   new String[] {
			   "name", "ScanMetaDataStandard_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScanMetaDataStandardType_ScanPackage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanPackage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScanMetaDataStandardType_Scans(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Scans",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScanMetaDataStandardType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (scannerHardwareTypeEClass,
		   source,
		   new String[] {
			   "name", "ScannerHardware_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScannerHardwareType_ScannerProvider(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScannerProvider",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScannerHardwareType_ScannerModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScannerModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScannerHardwareType_ScannerFirmware(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScannerFirmware",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScannerHardwareType_ScannerType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScannerType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScannerHardwareType_UniqueScannerID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UniqueScannerID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (scannerTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ScannerType_._type"
		   });
		addAnnotation
		  (scannerTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ScannerType_._type:Object",
			   "baseType", "ScannerType_._type"
		   });
		addAnnotation
		  (scanPropertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "ScanProperties_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScanPropertiesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_ScanTimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanTimeStamp",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_Ear(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ear",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_JawPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JawPosition",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_ScanFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanFormat",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_ScanComment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanComment",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_ScanFileAndLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanFileAndLocation",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getScanPropertiesType_ScanStoredInNoah(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanStoredInNoah",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (scansTypeEClass,
		   source,
		   new String[] {
			   "name", "Scans_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getScansType_ScannerHardware(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScannerHardware",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScansType_ScanProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanProperties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getScansType_ScanAnnotations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanAnnotations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (storedInNoahTypeEClass,
		   source,
		   new String[] {
			   "name", "StoredInNoah_Type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStoredInNoahType_StoredPublicOrPrivate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StoredPublicOrPrivate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStoredInNoahType_ActionDateTimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ActionDateTimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (storedPublicOrPrivateTypeEEnum,
		   source,
		   new String[] {
			   "name", "StoredPublicOrPrivate_._type"
		   });
		addAnnotation
		  (storedPublicOrPrivateTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "StoredPublicOrPrivate_._type:Object",
			   "baseType", "StoredPublicOrPrivate_._type"
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
		  (getDocumentRoot_ScanMetaDataStandard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScanMetaDataStandard",
			   "namespace", "##targetNamespace"
		   });
	}

} //DataPackageImpl
