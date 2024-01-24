/*
 */
package data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to identify an area of interest. Defined by 3 or more points 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.AreaType#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getAreaType()
 * @model extendedMetaData="name='Area_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AreaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link data.PointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see data.DataPackage#getAreaType_Points()
	 * @model containment="true" lower="3"
	 *        extendedMetaData="kind='element' name='Points' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointType> getPoints();

} // AreaType
