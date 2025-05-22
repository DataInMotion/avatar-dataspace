/*
 */
package org.avatar.ds.model.dataspace;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.Asset#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.Asset#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.Asset#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.Asset#getDataAddress <em>Data Address</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.Asset#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset()
 * @model
 * @generated
 */
@ProviderType
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset_Id()
	 * @model annotation="JsonProperty value='@id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.Asset#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset_Type()
	 * @model annotation="JsonProperty value='@type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.Asset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset_Context()
	 * @model containment="true"
	 *        annotation="JsonProperty value='@context'"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.Asset#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Data Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Address</em>' containment reference.
	 * @see #setDataAddress(DataAddress)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset_DataAddress()
	 * @model containment="true"
	 * @generated
	 */
	DataAddress getDataAddress();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.Asset#getDataAddress <em>Data Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Address</em>' containment reference.
	 * @see #getDataAddress()
	 * @generated
	 */
	void setDataAddress(DataAddress value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getAsset_Properties()
	 * @model mapType="org.avatar.ds.model.dataspace.PropertyMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getProperties();

} // Asset
