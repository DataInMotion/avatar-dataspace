/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType;
import com.himsa.measurement.admittance._501.AdmittanceValueCalculatedType;
import com.himsa.measurement.admittance._501.CalculatedType;
import com.himsa.measurement.admittance._501._501Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.CalculatedTypeImpl#getAdmittanceValueCalculated <em>Admittance Value Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.CalculatedTypeImpl#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedTypeImpl extends MinimalEObjectImpl.Container implements CalculatedType {
	/**
	 * The cached value of the '{@link #getAdmittanceValueCalculated() <em>Admittance Value Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceValueCalculated()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueCalculatedType admittanceValueCalculated;

	/**
	 * The cached value of the '{@link #getCalculatedAdmittanceUnit() <em>Calculated Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedAdmittanceUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitCalculatedType calculatedAdmittanceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.CALCULATED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueCalculatedType getAdmittanceValueCalculated() {
		return admittanceValueCalculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceValueCalculated(AdmittanceValueCalculatedType newAdmittanceValueCalculated, NotificationChain msgs) {
		AdmittanceValueCalculatedType oldAdmittanceValueCalculated = admittanceValueCalculated;
		admittanceValueCalculated = newAdmittanceValueCalculated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED, oldAdmittanceValueCalculated, newAdmittanceValueCalculated);
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
	public void setAdmittanceValueCalculated(AdmittanceValueCalculatedType newAdmittanceValueCalculated) {
		if (newAdmittanceValueCalculated != admittanceValueCalculated) {
			NotificationChain msgs = null;
			if (admittanceValueCalculated != null)
				msgs = ((InternalEObject)admittanceValueCalculated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED, null, msgs);
			if (newAdmittanceValueCalculated != null)
				msgs = ((InternalEObject)newAdmittanceValueCalculated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED, null, msgs);
			msgs = basicSetAdmittanceValueCalculated(newAdmittanceValueCalculated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED, newAdmittanceValueCalculated, newAdmittanceValueCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitCalculatedType getCalculatedAdmittanceUnit() {
		return calculatedAdmittanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType newCalculatedAdmittanceUnit, NotificationChain msgs) {
		AdmittanceUnitCalculatedType oldCalculatedAdmittanceUnit = calculatedAdmittanceUnit;
		calculatedAdmittanceUnit = newCalculatedAdmittanceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT, oldCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit);
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
	public void setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType newCalculatedAdmittanceUnit) {
		if (newCalculatedAdmittanceUnit != calculatedAdmittanceUnit) {
			NotificationChain msgs = null;
			if (calculatedAdmittanceUnit != null)
				msgs = ((InternalEObject)calculatedAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			if (newCalculatedAdmittanceUnit != null)
				msgs = ((InternalEObject)newCalculatedAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetCalculatedAdmittanceUnit(newCalculatedAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT, newCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED:
				return basicSetAdmittanceValueCalculated(null, msgs);
			case _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT:
				return basicSetCalculatedAdmittanceUnit(null, msgs);
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
			case _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED:
				return getAdmittanceValueCalculated();
			case _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT:
				return getCalculatedAdmittanceUnit();
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
			case _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED:
				setAdmittanceValueCalculated((AdmittanceValueCalculatedType)newValue);
				return;
			case _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT:
				setCalculatedAdmittanceUnit((AdmittanceUnitCalculatedType)newValue);
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
			case _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED:
				setAdmittanceValueCalculated((AdmittanceValueCalculatedType)null);
				return;
			case _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT:
				setCalculatedAdmittanceUnit((AdmittanceUnitCalculatedType)null);
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
			case _501Package.CALCULATED_TYPE__ADMITTANCE_VALUE_CALCULATED:
				return admittanceValueCalculated != null;
			case _501Package.CALCULATED_TYPE__CALCULATED_ADMITTANCE_UNIT:
				return calculatedAdmittanceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //CalculatedTypeImpl
