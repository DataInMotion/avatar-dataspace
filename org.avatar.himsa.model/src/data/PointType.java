/*
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.PointType#getX <em>X</em>}</li>
 *   <li>{@link data.PointType#getY <em>Y</em>}</li>
 *   <li>{@link data.PointType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getPointType()
 * @model extendedMetaData="name='Point_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointType extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @see data.DataPackage#getPointType_X()
	 * @model unsettable="true" dataType="data.CoordinateType" required="true"
	 *        extendedMetaData="kind='element' name='X' namespace='##targetNamespace'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link data.PointType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Unsets the value of the '{@link data.PointType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link data.PointType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(float)
	 * @see data.DataPackage#getPointType_Y()
	 * @model unsettable="true" dataType="data.CoordinateType" required="true"
	 *        extendedMetaData="kind='element' name='Y' namespace='##targetNamespace'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link data.PointType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Unsets the value of the '{@link data.PointType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link data.PointType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #setZ(float)
	 * @see data.DataPackage#getPointType_Z()
	 * @model unsettable="true" dataType="data.CoordinateType" required="true"
	 *        extendedMetaData="kind='element' name='Z' namespace='##targetNamespace'"
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link data.PointType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

	/**
	 * Unsets the value of the '{@link data.PointType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZ()
	 * @see #getZ()
	 * @see #setZ(float)
	 * @generated
	 */
	void unsetZ();

	/**
	 * Returns whether the value of the '{@link data.PointType#getZ <em>Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Z</em>' attribute is set.
	 * @see #unsetZ()
	 * @see #getZ()
	 * @see #setZ(float)
	 * @generated
	 */
	boolean isSetZ();

} // PointType
