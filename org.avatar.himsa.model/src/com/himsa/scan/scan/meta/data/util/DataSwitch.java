/**
 */
package com.himsa.scan.scan.meta.data.util;

import com.himsa.scan.scan.meta.data.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.himsa.scan.scan.meta.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataPackage.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.AREA_TYPE1: {
				AreaType1 areaType1 = (AreaType1)theEObject;
				T result = caseAreaType1(areaType1);
				if (result == null) result = caseAreaType(areaType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DIRECTION_TYPE: {
				DirectionType directionType = (DirectionType)theEObject;
				T result = caseDirectionType(directionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DIRECTION_TYPE1: {
				DirectionType1 directionType1 = (DirectionType1)theEObject;
				T result = caseDirectionType1(directionType1);
				if (result == null) result = caseDirectionType(directionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PACKAGE_TYPE: {
				PackageType packageType = (PackageType)theEObject;
				T result = casePackageType(packageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PLANE_TYPE: {
				PlaneType planeType = (PlaneType)theEObject;
				T result = casePlaneType(planeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PLANE_TYPE1: {
				PlaneType1 planeType1 = (PlaneType1)theEObject;
				T result = casePlaneType1(planeType1);
				if (result == null) result = casePlaneType(planeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.POINT_TYPE1: {
				PointType1 pointType1 = (PointType1)theEObject;
				T result = casePointType1(pointType1);
				if (result == null) result = casePointType(pointType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE: {
				ScanAnnotations3DType scanAnnotations3DType = (ScanAnnotations3DType)theEObject;
				T result = caseScanAnnotations3DType(scanAnnotations3DType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE: {
				ScanMetaDataStandardType scanMetaDataStandardType = (ScanMetaDataStandardType)theEObject;
				T result = caseScanMetaDataStandardType(scanMetaDataStandardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SCANNER_HARDWARE_TYPE: {
				ScannerHardwareType scannerHardwareType = (ScannerHardwareType)theEObject;
				T result = caseScannerHardwareType(scannerHardwareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SCAN_PROPERTIES_TYPE: {
				ScanPropertiesType scanPropertiesType = (ScanPropertiesType)theEObject;
				T result = caseScanPropertiesType(scanPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SCANS_TYPE: {
				ScansType scansType = (ScansType)theEObject;
				T result = caseScansType(scansType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.STORED_IN_NOAH_TYPE: {
				StoredInNoahType storedInNoahType = (StoredInNoahType)theEObject;
				T result = caseStoredInNoahType(storedInNoahType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType1(AreaType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionType(DirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionType1(DirectionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageType(PackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaneType(PlaneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaneType1(PlaneType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType1(PointType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Annotations3 DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Annotations3 DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanAnnotations3DType(ScanAnnotations3DType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Meta Data Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Meta Data Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanMetaDataStandardType(ScanMetaDataStandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scanner Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanner Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScannerHardwareType(ScannerHardwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanPropertiesType(ScanPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scans Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scans Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScansType(ScansType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored In Noah Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored In Noah Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredInNoahType(StoredInNoahType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataSwitch
