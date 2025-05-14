/*
 */
package org.avatar.ds.model.asset;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.asset.AssetPolicy#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.AssetPolicy#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.AssetPolicy#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.AssetPolicy#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.AssetPolicy#getCreatedAt <em>Created At</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy()
 * @model
 * @generated
 */
@ProviderType
public interface AssetPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy_Id()
	 * @model annotation="JsonProperty value='@id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.AssetPolicy#getId <em>Id</em>}' attribute.
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
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy_Type()
	 * @model annotation="JsonProperty value='@type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.AssetPolicy#getType <em>Type</em>}' attribute.
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
	 * @see #setContext(PolicyContext)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy_Context()
	 * @model containment="true"
	 *        annotation="JsonProperty value='@context'"
	 * @generated
	 */
	PolicyContext getContext();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.AssetPolicy#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(PolicyContext value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(Policy)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy_Policy()
	 * @model containment="true"
	 * @generated
	 */
	Policy getPolicy();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.AssetPolicy#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Policy value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(long)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getAssetPolicy_CreatedAt()
	 * @model
	 * @generated
	 */
	long getCreatedAt();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.AssetPolicy#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(long value);

} // AssetPolicy
