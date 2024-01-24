/*
 */
package audiogram502;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weber Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.WeberPointsType#getWeberPoint <em>Weber Point</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getWeberPointsType()
 * @model extendedMetaData="name='WeberPoints_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeberPointsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Weber Point</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram502.WeberPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weber Point</em>' containment reference list.
	 * @see audiogram502.Audiogram502Package#getWeberPointsType_WeberPoint()
	 * @model containment="true" required="true" upper="8"
	 *        extendedMetaData="kind='element' name='WeberPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeberPointType> getWeberPoint();

} // WeberPointsType
