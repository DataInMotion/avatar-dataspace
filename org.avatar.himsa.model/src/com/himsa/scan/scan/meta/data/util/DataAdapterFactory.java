/**
 */
package com.himsa.scan.scan.meta.data.util;

import com.himsa.scan.scan.meta.data.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.scan.scan.meta.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseAreaType1(AreaType1 object) {
				return createAreaType1Adapter();
			}
			@Override
			public Adapter caseDirectionType(DirectionType object) {
				return createDirectionTypeAdapter();
			}
			@Override
			public Adapter caseDirectionType1(DirectionType1 object) {
				return createDirectionType1Adapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePlaneType(PlaneType object) {
				return createPlaneTypeAdapter();
			}
			@Override
			public Adapter casePlaneType1(PlaneType1 object) {
				return createPlaneType1Adapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePointType1(PointType1 object) {
				return createPointType1Adapter();
			}
			@Override
			public Adapter caseScanAnnotations3DType(ScanAnnotations3DType object) {
				return createScanAnnotations3DTypeAdapter();
			}
			@Override
			public Adapter caseScanMetaDataStandardType(ScanMetaDataStandardType object) {
				return createScanMetaDataStandardTypeAdapter();
			}
			@Override
			public Adapter caseScannerHardwareType(ScannerHardwareType object) {
				return createScannerHardwareTypeAdapter();
			}
			@Override
			public Adapter caseScanPropertiesType(ScanPropertiesType object) {
				return createScanPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseScansType(ScansType object) {
				return createScansTypeAdapter();
			}
			@Override
			public Adapter caseStoredInNoahType(StoredInNoahType object) {
				return createStoredInNoahTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.AreaType1 <em>Area Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.AreaType1
	 * @generated
	 */
	public Adapter createAreaType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.DirectionType
	 * @generated
	 */
	public Adapter createDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.DirectionType1 <em>Direction Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.DirectionType1
	 * @generated
	 */
	public Adapter createDirectionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.PlaneType <em>Plane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.PlaneType
	 * @generated
	 */
	public Adapter createPlaneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.PlaneType1 <em>Plane Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.PlaneType1
	 * @generated
	 */
	public Adapter createPlaneType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.PointType1 <em>Point Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.PointType1
	 * @generated
	 */
	public Adapter createPointType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.ScanAnnotations3DType <em>Scan Annotations3 DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.ScanAnnotations3DType
	 * @generated
	 */
	public Adapter createScanAnnotations3DTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.ScanMetaDataStandardType <em>Scan Meta Data Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.ScanMetaDataStandardType
	 * @generated
	 */
	public Adapter createScanMetaDataStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.ScannerHardwareType <em>Scanner Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.ScannerHardwareType
	 * @generated
	 */
	public Adapter createScannerHardwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.ScanPropertiesType <em>Scan Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.ScanPropertiesType
	 * @generated
	 */
	public Adapter createScanPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.ScansType <em>Scans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.ScansType
	 * @generated
	 */
	public Adapter createScansTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.StoredInNoahType <em>Stored In Noah Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.StoredInNoahType
	 * @generated
	 */
	public Adapter createStoredInNoahTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.scan.scan.meta.data.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.scan.scan.meta.data.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataAdapterFactory
