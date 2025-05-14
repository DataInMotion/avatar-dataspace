/*
 */
package org.avatar.ds.model.dataspace.impl;

import java.util.Collection;

import org.avatar.ds.model.dataspace.Context;
import org.avatar.ds.model.dataspace.ContractDefinition;
import org.avatar.ds.model.dataspace.DataspacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getAccessPolicyId <em>Access Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getContractPolicyId <em>Contract Policy Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl#getAssetsSelector <em>Assets Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractDefinitionImpl extends MinimalEObjectImpl.Container implements ContractDefinition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.CONTRACT_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataspacePackage.CONTRACT_DEFINITION__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.CONTRACT_DEFINITION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.CONTRACT_DEFINITION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.CONTRACT_DEFINITION__CONTEXT, newContext, newContext));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__CONTEXT:
				return basicSetContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataspacePackage.CONTRACT_DEFINITION__ID:
				return getId();
			case DataspacePackage.CONTRACT_DEFINITION__CONTEXT:
				return getContext();
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
			case DataspacePackage.CONTRACT_DEFINITION__ID:
				setId((String)newValue);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__CONTEXT:
				setContext((Context)newValue);
				return;
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
			case DataspacePackage.CONTRACT_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case DataspacePackage.CONTRACT_DEFINITION__CONTEXT:
				setContext((Context)null);
				return;
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
			case DataspacePackage.CONTRACT_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DataspacePackage.CONTRACT_DEFINITION__CONTEXT:
				return context != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", accessPolicyId: ");
		result.append(accessPolicyId);
		result.append(", contractPolicyId: ");
		result.append(contractPolicyId);
		result.append(", assetsSelector: ");
		result.append(assetsSelector);
		result.append(')');
		return result.toString();
	}

} //ContractDefinitionImpl
