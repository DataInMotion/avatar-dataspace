/*
 */
package org.avatar.ds.model.dataspace.impl;

import java.util.Collection;

import org.avatar.ds.model.dataspace.ContractDefinition;
import org.avatar.ds.model.dataspace.DataspacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getAccessPolicyId <em>Access Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getContractPolicyId <em>Contract Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getAssetsSelector <em>Assets Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractDefinitionImpl extends DataSpaceResponseImpl implements ContractDefinition {
	/**
	 * The default value of the '{@link #getAccessPolicyId() <em>Access Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_POLICY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPolicyId() <em>Access Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicyId()
	 * @generated
	 * @ordered
	 */
	protected String accessPolicyId = ACCESS_POLICY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContractPolicyId() <em>Contract Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractPolicyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_POLICY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractPolicyId() <em>Contract Policy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractPolicyId()
	 * @generated
	 * @ordered
	 */
	protected String contractPolicyId = CONTRACT_POLICY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetsSelector() <em>Assets Selector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetsSelector()
	 * @generated
	 * @ordered
	 */
	protected EList<String> assetsSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataspacePackage.Literals.CONTRACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPolicyId() {
		return accessPolicyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPolicyId(String newAccessPolicyId) {
		String oldAccessPolicyId = accessPolicyId;
		accessPolicyId = newAccessPolicyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.CONTRACT_DEFINITION__ACCESS_POLICY_ID, oldAccessPolicyId, accessPolicyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContractPolicyId() {
		return contractPolicyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractPolicyId(String newContractPolicyId) {
		String oldContractPolicyId = contractPolicyId;
		contractPolicyId = newContractPolicyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.CONTRACT_DEFINITION__CONTRACT_POLICY_ID, oldContractPolicyId, contractPolicyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAssetsSelector() {
		if (assetsSelector == null) {
			assetsSelector = new EDataTypeUniqueEList<String>(String.class, this, DataspacePackage.CONTRACT_DEFINITION__ASSETS_SELECTOR);
		}
		return assetsSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__ACCESS_POLICY_ID:
				return getAccessPolicyId();
			case DataspacePackage.CONTRACT_DEFINITION__CONTRACT_POLICY_ID:
				return getContractPolicyId();
			case DataspacePackage.CONTRACT_DEFINITION__ASSETS_SELECTOR:
				return getAssetsSelector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__ACCESS_POLICY_ID:
				setAccessPolicyId((String)newValue);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__CONTRACT_POLICY_ID:
				setContractPolicyId((String)newValue);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__ASSETS_SELECTOR:
				getAssetsSelector().clear();
				getAssetsSelector().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__ACCESS_POLICY_ID:
				setAccessPolicyId(ACCESS_POLICY_ID_EDEFAULT);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__CONTRACT_POLICY_ID:
				setContractPolicyId(CONTRACT_POLICY_ID_EDEFAULT);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__ASSETS_SELECTOR:
				getAssetsSelector().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__ACCESS_POLICY_ID:
				return ACCESS_POLICY_ID_EDEFAULT == null ? accessPolicyId != null : !ACCESS_POLICY_ID_EDEFAULT.equals(accessPolicyId);
			case DataspacePackage.CONTRACT_DEFINITION__CONTRACT_POLICY_ID:
				return CONTRACT_POLICY_ID_EDEFAULT == null ? contractPolicyId != null : !CONTRACT_POLICY_ID_EDEFAULT.equals(contractPolicyId);
			case DataspacePackage.CONTRACT_DEFINITION__ASSETS_SELECTOR:
				return assetsSelector != null && !assetsSelector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (accessPolicyId: ");
		result.append(accessPolicyId);
		result.append(", contractPolicyId: ");
		result.append(contractPolicyId);
		result.append(", assetsSelector: ");
		result.append(assetsSelector);
		result.append(')');
		return result.toString();
	}

} //ContractDefinitionImpl
