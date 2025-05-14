/*
 */
package org.avatar.ds.model.dataspace;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.Context#getVocab <em>Vocab</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContext()
 * @model
 * @generated
 */
@ProviderType
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocab</em>' attribute.
	 * @see #setVocab(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContext_Vocab()
	 * @model annotation="JsonProperty value='@vocab'"
	 * @generated
	 */
	String getVocab();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.Context#getVocab <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocab</em>' attribute.
	 * @see #getVocab()
	 * @generated
	 */
	void setVocab(String value);

} // Context
