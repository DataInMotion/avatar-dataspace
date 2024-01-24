/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceUnitType;
import com.himsa.measurement.admittance._501.AdmittanceValueType;
import com.himsa.measurement.admittance._501.GradientType;
import com.himsa.measurement.admittance._501._501Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.GradientTypeImpl#getGradientValue <em>Gradient Value</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.GradientTypeImpl#getGradientUnit <em>Gradient Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradientTypeImpl extends MinimalEObjectImpl.Container implements GradientType {
	/**
	 * The cached value of the '{@link #getGradientValue() <em>Gradient Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientValue()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueType gradientValue;

	/**
	 * The cached value of the '{@link #getGradientUnit() <em>Gradient Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitType gradientUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.GRADIENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueType getGradientValue() {
		return gradientValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradientValue(AdmittanceValueType newGradientValue, NotificationChain msgs) {
		AdmittanceValueType oldGradientValue = gradientValue;
		gradientValue = newGradientValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.GRADIENT_TYPE__GRADIENT_VALUE, oldGradientValue, newGradientValue);
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
	public void setGradientValue(AdmittanceValueType newGradientValue) {
		if (newGradientValue != gradientValue) {
			NotificationChain msgs = null;
			if (gradientValue != null)
				msgs = ((InternalEObject)gradientValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.GRADIENT_TYPE__GRADIENT_VALUE, null, msgs);
			if (newGradientValue != null)
				msgs = ((InternalEObject)newGradientValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.GRADIENT_TYPE__GRADIENT_VALUE, null, msgs);
			msgs = basicSetGradientValue(newGradientValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.GRADIENT_TYPE__GRADIENT_VALUE, newGradientValue, newGradientValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitType getGradientUnit() {
		return gradientUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradientUnit(AdmittanceUnitType newGradientUnit, NotificationChain msgs) {
		AdmittanceUnitType oldGradientUnit = gradientUnit;
		gradientUnit = newGradientUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.GRADIENT_TYPE__GRADIENT_UNIT, oldGradientUnit, newGradientUnit);
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
	public void setGradientUnit(AdmittanceUnitType newGradientUnit) {
		if (newGradientUnit != gradientUnit) {
			NotificationChain msgs = null;
			if (gradientUnit != null)
				msgs = ((InternalEObject)gradientUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.GRADIENT_TYPE__GRADIENT_UNIT, null, msgs);
			if (newGradientUnit != null)
				msgs = ((InternalEObject)newGradientUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.GRADIENT_TYPE__GRADIENT_UNIT, null, msgs);
			msgs = basicSetGradientUnit(newGradientUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.GRADIENT_TYPE__GRADIENT_UNIT, newGradientUnit, newGradientUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.GRADIENT_TYPE__GRADIENT_VALUE:
				return basicSetGradientValue(null, msgs);
			case _501Package.GRADIENT_TYPE__GRADIENT_UNIT:
				return basicSetGradientUnit(null, msgs);
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
			case _501Package.GRADIENT_TYPE__GRADIENT_VALUE:
				return getGradientValue();
			case _501Package.GRADIENT_TYPE__GRADIENT_UNIT:
				return getGradientUnit();
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
			case _501Package.GRADIENT_TYPE__GRADIENT_VALUE:
				setGradientValue((AdmittanceValueType)newValue);
				return;
			case _501Package.GRADIENT_TYPE__GRADIENT_UNIT:
				setGradientUnit((AdmittanceUnitType)newValue);
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
			case _501Package.GRADIENT_TYPE__GRADIENT_VALUE:
				setGradientValue((AdmittanceValueType)null);
				return;
			case _501Package.GRADIENT_TYPE__GRADIENT_UNIT:
				setGradientUnit((AdmittanceUnitType)null);
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
			case _501Package.GRADIENT_TYPE__GRADIENT_VALUE:
				return gradientValue != null;
			case _501Package.GRADIENT_TYPE__GRADIENT_UNIT:
				return gradientUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //GradientTypeImpl
