/*
 */
package com.himsa.instrument.selection.impl;

import com.himsa.instrument.selection.DeviceCategoryType;
import com.himsa.instrument.selection.SelectionPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Category Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl#getDeviceCategoryTypeCode <em>Device Category Type Code</em>}</li>
 *   <li>{@link com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl#getDeviceCategoryText <em>Device Category Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceCategoryTypeImpl extends MinimalEObjectImpl.Container implements DeviceCategoryType {
	/**
	 * The default value of the '{@link #getDeviceCategoryTypeCode() <em>Device Category Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategoryTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEVICE_CATEGORY_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceCategoryTypeCode() <em>Device Category Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategoryTypeCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deviceCategoryTypeCode = DEVICE_CATEGORY_TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceCategoryText() <em>Device Category Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategoryText()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_CATEGORY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceCategoryText() <em>Device Category Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategoryText()
	 * @generated
	 * @ordered
	 */
	protected String deviceCategoryText = DEVICE_CATEGORY_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceCategoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.DEVICE_CATEGORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDeviceCategoryTypeCode() {
		return deviceCategoryTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceCategoryTypeCode(BigInteger newDeviceCategoryTypeCode) {
		BigInteger oldDeviceCategoryTypeCode = deviceCategoryTypeCode;
		deviceCategoryTypeCode = newDeviceCategoryTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE, oldDeviceCategoryTypeCode, deviceCategoryTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceCategoryText() {
		return deviceCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceCategoryText(String newDeviceCategoryText) {
		String oldDeviceCategoryText = deviceCategoryText;
		deviceCategoryText = newDeviceCategoryText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT, oldDeviceCategoryText, deviceCategoryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE:
				return getDeviceCategoryTypeCode();
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT:
				return getDeviceCategoryText();
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
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE:
				setDeviceCategoryTypeCode((BigInteger)newValue);
				return;
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT:
				setDeviceCategoryText((String)newValue);
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
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE:
				setDeviceCategoryTypeCode(DEVICE_CATEGORY_TYPE_CODE_EDEFAULT);
				return;
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT:
				setDeviceCategoryText(DEVICE_CATEGORY_TEXT_EDEFAULT);
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
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE:
				return DEVICE_CATEGORY_TYPE_CODE_EDEFAULT == null ? deviceCategoryTypeCode != null : !DEVICE_CATEGORY_TYPE_CODE_EDEFAULT.equals(deviceCategoryTypeCode);
			case SelectionPackage.DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT:
				return DEVICE_CATEGORY_TEXT_EDEFAULT == null ? deviceCategoryText != null : !DEVICE_CATEGORY_TEXT_EDEFAULT.equals(deviceCategoryText);
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
		result.append(" (deviceCategoryTypeCode: ");
		result.append(deviceCategoryTypeCode);
		result.append(", deviceCategoryText: ");
		result.append(deviceCategoryText);
		result.append(')');
		return result.toString();
	}

} //DeviceCategoryTypeImpl
