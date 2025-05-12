/*
 */
package org.avatar.ds.model.asset.impl;

import org.avatar.ds.model.asset.DataSpaceAssetPackage;
import org.avatar.ds.model.asset.PolicyContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.asset.impl.PolicyContextImpl#getOdrl <em>Odrl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyContextImpl extends ContextImpl implements PolicyContext {
	/**
	 * The default value of the '{@link #getOdrl() <em>Odrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ODRL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOdrl() <em>Odrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdrl()
	 * @generated
	 * @ordered
	 */
	protected String odrl = ODRL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpaceAssetPackage.Literals.POLICY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOdrl() {
		return odrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOdrl(String newOdrl) {
		String oldOdrl = odrl;
		odrl = newOdrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpaceAssetPackage.POLICY_CONTEXT__ODRL, oldOdrl, odrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpaceAssetPackage.POLICY_CONTEXT__ODRL:
				return getOdrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataSpaceAssetPackage.POLICY_CONTEXT__ODRL:
				setOdrl((String)newValue);
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
			case DataSpaceAssetPackage.POLICY_CONTEXT__ODRL:
				setOdrl(ODRL_EDEFAULT);
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
			case DataSpaceAssetPackage.POLICY_CONTEXT__ODRL:
				return ODRL_EDEFAULT == null ? odrl != null : !ODRL_EDEFAULT.equals(odrl);
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
		result.append(" (odrl: ");
		result.append(odrl);
		result.append(')');
		return result.toString();
	}

} //PolicyContextImpl
