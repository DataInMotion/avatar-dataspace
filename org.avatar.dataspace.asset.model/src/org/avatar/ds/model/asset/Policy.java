/*
 */
package org.avatar.ds.model.asset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.asset.Policy#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.Policy#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.Policy#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.Policy#getProhibition <em>Prohibition</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.Policy#getObligation <em>Obligation</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy()
 * @model
 * @generated
 */
@ProviderType
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy_Context()
	 * @model annotation="JsonProperty value='@context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.Policy#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy_Type()
	 * @model annotation="JsonProperty value='@type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.Policy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute list.
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy_Permission()
	 * @model
	 * @generated
	 */
	EList<String> getPermission();

	/**
	 * Returns the value of the '<em><b>Prohibition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prohibition</em>' attribute list.
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy_Prohibition()
	 * @model
	 * @generated
	 */
	EList<String> getProhibition();

	/**
	 * Returns the value of the '<em><b>Obligation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligation</em>' attribute list.
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicy_Obligation()
	 * @model
	 * @generated
	 */
	EList<String> getObligation();

} // Policy
