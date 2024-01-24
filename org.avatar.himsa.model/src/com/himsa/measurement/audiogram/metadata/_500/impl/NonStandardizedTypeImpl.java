/*
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.DefinedValueType;
import com.himsa.measurement.audiogram.metadata._500.NonStandardizedType;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Standardized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl#getDefinedValue <em>Defined Value</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl#getCustomValue <em>Custom Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonStandardizedTypeImpl extends MinimalEObjectImpl.Container implements NonStandardizedType {
	/**
	 * The default value of the '{@link #getDefinedValue() <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValue()
	 * @generated
	 * @ordered
	 */
	protected static final DefinedValueType DEFINED_VALUE_EDEFAULT = DefinedValueType.GOOD;

	/**
	 * The cached value of the '{@link #getDefinedValue() <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValue()
	 * @generated
	 * @ordered
	 */
	protected DefinedValueType definedValue = DEFINED_VALUE_EDEFAULT;

	/**
	 * This is true if the Defined Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definedValueESet;

	/**
	 * The default value of the '{@link #getCustomValue() <em>Custom Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomValue() <em>Custom Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomValue()
	 * @generated
	 * @ordered
	 */
	protected String customValue = CUSTOM_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonStandardizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.NON_STANDARDIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedValueType getDefinedValue() {
		return definedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinedValue(DefinedValueType newDefinedValue) {
		DefinedValueType oldDefinedValue = definedValue;
		definedValue = newDefinedValue == null ? DEFINED_VALUE_EDEFAULT : newDefinedValue;
		boolean oldDefinedValueESet = definedValueESet;
		definedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE, oldDefinedValue, definedValue, !oldDefinedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefinedValue() {
		DefinedValueType oldDefinedValue = definedValue;
		boolean oldDefinedValueESet = definedValueESet;
		definedValue = DEFINED_VALUE_EDEFAULT;
		definedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE, oldDefinedValue, DEFINED_VALUE_EDEFAULT, oldDefinedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefinedValue() {
		return definedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomValue() {
		return customValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomValue(String newCustomValue) {
		String oldCustomValue = customValue;
		customValue = newCustomValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NON_STANDARDIZED_TYPE__CUSTOM_VALUE, oldCustomValue, customValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE:
				return getDefinedValue();
			case _500Package.NON_STANDARDIZED_TYPE__CUSTOM_VALUE:
				return getCustomValue();
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
			case _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE:
				setDefinedValue((DefinedValueType)newValue);
				return;
			case _500Package.NON_STANDARDIZED_TYPE__CUSTOM_VALUE:
				setCustomValue((String)newValue);
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
			case _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE:
				unsetDefinedValue();
				return;
			case _500Package.NON_STANDARDIZED_TYPE__CUSTOM_VALUE:
				setCustomValue(CUSTOM_VALUE_EDEFAULT);
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
			case _500Package.NON_STANDARDIZED_TYPE__DEFINED_VALUE:
				return isSetDefinedValue();
			case _500Package.NON_STANDARDIZED_TYPE__CUSTOM_VALUE:
				return CUSTOM_VALUE_EDEFAULT == null ? customValue != null : !CUSTOM_VALUE_EDEFAULT.equals(customValue);
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
		result.append(" (definedValue: ");
		if (definedValueESet) result.append(definedValue); else result.append("<unset>");
		result.append(", customValue: ");
		result.append(customValue);
		result.append(')');
		return result.toString();
	}

} //NonStandardizedTypeImpl
