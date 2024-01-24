/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.SignalType;
import com.himsa.measurement.tinnitus._500.SignalTypesType;
import com.himsa.measurement.tinnitus._500._500Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl#getSignalTypes <em>Signal Types</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.SignalTypeImpl#getOtherSignalSpecification <em>Other Signal Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalTypeImpl extends MinimalEObjectImpl.Container implements SignalType {
	/**
	 * The default value of the '{@link #getSignalTypes() <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalTypes()
	 * @generated
	 * @ordered
	 */
	protected static final SignalTypesType SIGNAL_TYPES_EDEFAULT = SignalTypesType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSignalTypes() <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalTypes()
	 * @generated
	 * @ordered
	 */
	protected SignalTypesType signalTypes = SIGNAL_TYPES_EDEFAULT;

	/**
	 * This is true if the Signal Types attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalTypesESet;

	/**
	 * The default value of the '{@link #getOtherSignalSpecification() <em>Other Signal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSignalSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SIGNAL_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSignalSpecification() <em>Other Signal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSignalSpecification()
	 * @generated
	 * @ordered
	 */
	protected String otherSignalSpecification = OTHER_SIGNAL_SPECIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.SIGNAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalTypesType getSignalTypes() {
		return signalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalTypes(SignalTypesType newSignalTypes) {
		SignalTypesType oldSignalTypes = signalTypes;
		signalTypes = newSignalTypes == null ? SIGNAL_TYPES_EDEFAULT : newSignalTypes;
		boolean oldSignalTypesESet = signalTypesESet;
		signalTypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.SIGNAL_TYPE__SIGNAL_TYPES, oldSignalTypes, signalTypes, !oldSignalTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalTypes() {
		SignalTypesType oldSignalTypes = signalTypes;
		boolean oldSignalTypesESet = signalTypesESet;
		signalTypes = SIGNAL_TYPES_EDEFAULT;
		signalTypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.SIGNAL_TYPE__SIGNAL_TYPES, oldSignalTypes, SIGNAL_TYPES_EDEFAULT, oldSignalTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalTypes() {
		return signalTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSignalSpecification() {
		return otherSignalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSignalSpecification(String newOtherSignalSpecification) {
		String oldOtherSignalSpecification = otherSignalSpecification;
		otherSignalSpecification = newOtherSignalSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION, oldOtherSignalSpecification, otherSignalSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.SIGNAL_TYPE__SIGNAL_TYPES:
				return getSignalTypes();
			case _500Package.SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION:
				return getOtherSignalSpecification();
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
			case _500Package.SIGNAL_TYPE__SIGNAL_TYPES:
				setSignalTypes((SignalTypesType)newValue);
				return;
			case _500Package.SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION:
				setOtherSignalSpecification((String)newValue);
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
			case _500Package.SIGNAL_TYPE__SIGNAL_TYPES:
				unsetSignalTypes();
				return;
			case _500Package.SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION:
				setOtherSignalSpecification(OTHER_SIGNAL_SPECIFICATION_EDEFAULT);
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
			case _500Package.SIGNAL_TYPE__SIGNAL_TYPES:
				return isSetSignalTypes();
			case _500Package.SIGNAL_TYPE__OTHER_SIGNAL_SPECIFICATION:
				return OTHER_SIGNAL_SPECIFICATION_EDEFAULT == null ? otherSignalSpecification != null : !OTHER_SIGNAL_SPECIFICATION_EDEFAULT.equals(otherSignalSpecification);
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
		result.append(" (signalTypes: ");
		if (signalTypesESet) result.append(signalTypes); else result.append("<unset>");
		result.append(", otherSignalSpecification: ");
		result.append(otherSignalSpecification);
		result.append(')');
		return result.toString();
	}

} //SignalTypeImpl
