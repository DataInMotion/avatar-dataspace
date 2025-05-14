/*
 */
package org.avatar.ds.model.dataspace.impl;

import java.util.Collection;

import org.avatar.ds.model.dataspace.DataspacePackage;
import org.avatar.ds.model.dataspace.Policy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getProhibition <em>Prohibition</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.PolicyImpl#getObligation <em>Obligation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<String> permission;

	/**
	 * The cached value of the '{@link #getProhibition() <em>Prohibition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProhibition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> prohibition;

	/**
	 * The cached value of the '{@link #getObligation() <em>Obligation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> obligation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataspacePackage.Literals.POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.POLICY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.POLICY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.POLICY__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPermission() {
		if (permission == null) {
			permission = new EDataTypeUniqueEList<String>(String.class, this, DataspacePackage.POLICY__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProhibition() {
		if (prohibition == null) {
			prohibition = new EDataTypeUniqueEList<String>(String.class, this, DataspacePackage.POLICY__PROHIBITION);
		}
		return prohibition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObligation() {
		if (obligation == null) {
			obligation = new EDataTypeUniqueEList<String>(String.class, this, DataspacePackage.POLICY__OBLIGATION);
		}
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataspacePackage.POLICY__ID:
				return getId();
			case DataspacePackage.POLICY__TYPE:
				return getType();
			case DataspacePackage.POLICY__CONTEXT:
				return getContext();
			case DataspacePackage.POLICY__PERMISSION:
				return getPermission();
			case DataspacePackage.POLICY__PROHIBITION:
				return getProhibition();
			case DataspacePackage.POLICY__OBLIGATION:
				return getObligation();
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
			case DataspacePackage.POLICY__ID:
				setId((String)newValue);
				return;
			case DataspacePackage.POLICY__TYPE:
				setType((String)newValue);
				return;
			case DataspacePackage.POLICY__CONTEXT:
				setContext((String)newValue);
				return;
			case DataspacePackage.POLICY__PERMISSION:
				getPermission().clear();
				getPermission().addAll((Collection<? extends String>)newValue);
				return;
			case DataspacePackage.POLICY__PROHIBITION:
				getProhibition().clear();
				getProhibition().addAll((Collection<? extends String>)newValue);
				return;
			case DataspacePackage.POLICY__OBLIGATION:
				getObligation().clear();
				getObligation().addAll((Collection<? extends String>)newValue);
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
			case DataspacePackage.POLICY__ID:
				setId(ID_EDEFAULT);
				return;
			case DataspacePackage.POLICY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataspacePackage.POLICY__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case DataspacePackage.POLICY__PERMISSION:
				getPermission().clear();
				return;
			case DataspacePackage.POLICY__PROHIBITION:
				getProhibition().clear();
				return;
			case DataspacePackage.POLICY__OBLIGATION:
				getObligation().clear();
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
			case DataspacePackage.POLICY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DataspacePackage.POLICY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DataspacePackage.POLICY__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case DataspacePackage.POLICY__PERMISSION:
				return permission != null && !permission.isEmpty();
			case DataspacePackage.POLICY__PROHIBITION:
				return prohibition != null && !prohibition.isEmpty();
			case DataspacePackage.POLICY__OBLIGATION:
				return obligation != null && !obligation.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", context: ");
		result.append(context);
		result.append(", permission: ");
		result.append(permission);
		result.append(", prohibition: ");
		result.append(prohibition);
		result.append(", obligation: ");
		result.append(obligation);
		result.append(')');
		return result.toString();
	}

} //PolicyImpl
