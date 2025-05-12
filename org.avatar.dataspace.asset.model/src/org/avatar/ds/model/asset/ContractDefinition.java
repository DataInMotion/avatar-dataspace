/*
 */
package org.avatar.ds.model.asset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.asset.ContractDefinition#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.ContractDefinition#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.ContractDefinition#getAssetsSelector <em>Assets Selector</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition()
 * @model
 * @generated
 */
@ProviderType
public interface ContractDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition_Id()
	 * @model annotation="JsonProperty value='@id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.ContractDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition_Context()
	 * @model containment="true"
	 *        annotation="JsonProperty value='@context'"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.ContractDefinition#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Access Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policy Id</em>' attribute.
	 * @see #setAccessPolicyId(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition_AccessPolicyId()
	 * @model
	 * @generated
	 */
	String getAccessPolicyId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Policy Id</em>' attribute.
	 * @see #getAccessPolicyId()
	 * @generated
	 */
	void setAccessPolicyId(String value);

	/**
	 * Returns the value of the '<em><b>Contract Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Policy Id</em>' attribute.
	 * @see #setContractPolicyId(String)
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition_ContractPolicyId()
	 * @model
	 * @generated
	 */
	String getContractPolicyId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Policy Id</em>' attribute.
	 * @see #getContractPolicyId()
	 * @generated
	 */
	void setContractPolicyId(String value);

	/**
	 * Returns the value of the '<em><b>Assets Selector</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an empty list is provided, every asset will be associated with the specified policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets Selector</em>' attribute list.
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getContractDefinition_AssetsSelector()
	 * @model
	 * @generated
	 */
	EList<String> getAssetsSelector();

} // ContractDefinition
