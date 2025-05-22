/*
 */
package org.avatar.ds.model.dataspace;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.avatar.ds.model.dataspace.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.ContractDefinition#getAssetsSelector <em>Assets Selector</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContractDefinition()
 * @model
 * @generated
 */
@ProviderType
public interface ContractDefinition extends DataSpaceResponse {
	/**
	 * Returns the value of the '<em><b>Access Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policy Id</em>' attribute.
	 * @see #setAccessPolicyId(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContractDefinition_AccessPolicyId()
	 * @model
	 * @generated
	 */
	String getAccessPolicyId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}' attribute.
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
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContractDefinition_ContractPolicyId()
	 * @model
	 * @generated
	 */
	String getContractPolicyId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}' attribute.
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
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getContractDefinition_AssetsSelector()
	 * @model
	 * @generated
	 */
	EList<String> getAssetsSelector();

} // ContractDefinition
