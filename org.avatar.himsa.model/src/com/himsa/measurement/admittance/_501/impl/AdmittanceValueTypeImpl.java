/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceValueCalculatedType;
import com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType;
import com.himsa.measurement.admittance._501.AdmittanceValueType;
import com.himsa.measurement.admittance._501._501Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admittance Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.AdmittanceValueTypeImpl#getValueCalculated <em>Value Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.AdmittanceValueTypeImpl#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceValueTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceValueType {
	/**
	 * The cached value of the '{@link #getValueCalculated() <em>Value Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCalculated()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueCalculatedType valueCalculated;

	/**
	 * The cached value of the '{@link #getMeasured() <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueMeasuredType measured;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.ADMITTANCE_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueCalculatedType getValueCalculated() {
		return valueCalculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCalculated(AdmittanceValueCalculatedType newValueCalculated, NotificationChain msgs) {
		AdmittanceValueCalculatedType oldValueCalculated = valueCalculated;
		valueCalculated = newValueCalculated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED, oldValueCalculated, newValueCalculated);
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
	public void setValueCalculated(AdmittanceValueCalculatedType newValueCalculated) {
		if (newValueCalculated != valueCalculated) {
			NotificationChain msgs = null;
			if (valueCalculated != null)
				msgs = ((InternalEObject)valueCalculated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED, null, msgs);
			if (newValueCalculated != null)
				msgs = ((InternalEObject)newValueCalculated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED, null, msgs);
			msgs = basicSetValueCalculated(newValueCalculated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED, newValueCalculated, newValueCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueMeasuredType getMeasured() {
		return measured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasured(AdmittanceValueMeasuredType newMeasured, NotificationChain msgs) {
		AdmittanceValueMeasuredType oldMeasured = measured;
		measured = newMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_VALUE_TYPE__MEASURED, oldMeasured, newMeasured);
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
	public void setMeasured(AdmittanceValueMeasuredType newMeasured) {
		if (newMeasured != measured) {
			NotificationChain msgs = null;
			if (measured != null)
				msgs = ((InternalEObject)measured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_VALUE_TYPE__MEASURED, null, msgs);
			if (newMeasured != null)
				msgs = ((InternalEObject)newMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_VALUE_TYPE__MEASURED, null, msgs);
			msgs = basicSetMeasured(newMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_VALUE_TYPE__MEASURED, newMeasured, newMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED:
				return basicSetValueCalculated(null, msgs);
			case _501Package.ADMITTANCE_VALUE_TYPE__MEASURED:
				return basicSetMeasured(null, msgs);
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
			case _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED:
				return getValueCalculated();
			case _501Package.ADMITTANCE_VALUE_TYPE__MEASURED:
				return getMeasured();
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
			case _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED:
				setValueCalculated((AdmittanceValueCalculatedType)newValue);
				return;
			case _501Package.ADMITTANCE_VALUE_TYPE__MEASURED:
				setMeasured((AdmittanceValueMeasuredType)newValue);
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
			case _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED:
				setValueCalculated((AdmittanceValueCalculatedType)null);
				return;
			case _501Package.ADMITTANCE_VALUE_TYPE__MEASURED:
				setMeasured((AdmittanceValueMeasuredType)null);
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
			case _501Package.ADMITTANCE_VALUE_TYPE__VALUE_CALCULATED:
				return valueCalculated != null;
			case _501Package.ADMITTANCE_VALUE_TYPE__MEASURED:
				return measured != null;
		}
		return super.eIsSet(featureID);
	}

} //AdmittanceValueTypeImpl
