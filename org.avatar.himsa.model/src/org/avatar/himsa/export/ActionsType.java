/*
 */
package org.avatar.himsa.export;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.himsa.export.ActionsType#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.avatar.himsa.export.PatientExportPackage#getActionsType()
 * @model extendedMetaData="name='Actions_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.avatar.himsa.export.ActionDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionsType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionDataType> getAction();

} // ActionsType
