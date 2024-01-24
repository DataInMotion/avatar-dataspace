/*
 */
package com.himsa.scan.scan.meta.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scan Annotations3 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Additional information for a scan.   The annotations provide additional information to a 3D object not to a picture of a scan.   
 * 
 * !!need to make it clear that it is intentional that type of annotations are not strongly defined but rather descirbed by geometry types and an annotiation comment, in other words there are not specific enumerated choices!!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScanAnnotations3DType#getPoint <em>Point</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScanAnnotations3DType#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScanAnnotations3DType#getPlane <em>Plane</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.ScanAnnotations3DType#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanAnnotations3DType()
 * @model extendedMetaData="name='ScanAnnotations3D_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScanAnnotations3DType extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.scan.scan.meta.data.PointType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single point.  For an annotation the point will typically be on the surface of the impression object.  In theory it could be possible for the point to be inside or outside of the impression object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanAnnotations3DType_Point()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointType1> getPoint();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.scan.scan.meta.data.DirectionType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direction / Indicates direction.  An example of usage could be to indicate placement of directional microphone(s). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference list.
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanAnnotations3DType_Direction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Direction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectionType1> getDirection();

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.scan.scan.meta.data.PlaneType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plane / Indicates a plane which could be used to define items such as a cut plane for a faceplate or tip.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference list.
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanAnnotations3DType_Plane()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plane' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlaneType1> getPlane();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.scan.scan.meta.data.AreaType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Area of interest (e.g. describe anomalies of the ear)
	 * 
	 * Defined by 3 or more points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanAnnotations3DType_Area()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Area' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AreaType1> getArea();

} // ScanAnnotations3DType
