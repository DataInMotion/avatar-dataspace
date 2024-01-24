/*
 */
package com.himsa.scan.scan.meta.data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Direction is defined as a point with a corresponding vector (directional indicator).  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.DirectionType#getPoint <em>Point</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.DirectionType#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see com.himsa.scan.scan.meta.data.DataPackage#getDirectionType()
 * @model extendedMetaData="name='Direction_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DirectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Single point which can be on the surface, inside or outside the scan  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getDirectionType_Point()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.DirectionType#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Vector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(PointType)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getDirectionType_Vector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Vector' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getVector();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.DirectionType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(PointType value);

} // DirectionType
