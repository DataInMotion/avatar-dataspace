/*
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plane is defined by a single point and direction (a vector) of the normal to the plane.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.PlaneType#getPlane <em>Plane</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getPlaneType()
 * @model extendedMetaData="name='Plane_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlaneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(DirectionType)
	 * @see data.DataPackage#getPlaneType_Plane()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plane' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getPlane();

	/**
	 * Sets the value of the '{@link data.PlaneType#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(DirectionType value);

} // PlaneType
