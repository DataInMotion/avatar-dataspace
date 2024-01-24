/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceType;
import com.himsa.measurement.admittance._501.CalculatedType;
import com.himsa.measurement.admittance._501.MeasuredType;
import com.himsa.measurement.admittance._501._501Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admittance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.AdmittanceTypeImpl#getCalculated <em>Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.AdmittanceTypeImpl#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceType {
	/**
	 * The cached value of the '{@link #getCalculated() <em>Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculated()
	 * @generated
	 * @ordered
	 */
	protected CalculatedType calculated;

	/**
	 * The cached value of the '{@link #getMeasured() <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured()
	 * @generated
	 * @ordered
	 */
	protected MeasuredType measured;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.ADMITTANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedType getCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculated(CalculatedType newCalculated, NotificationChain msgs) {
		CalculatedType oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_TYPE__CALCULATED, oldCalculated, newCalculated);
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
	public void setCalculated(CalculatedType newCalculated) {
		if (newCalculated != calculated) {
			NotificationChain msgs = null;
			if (calculated != null)
				msgs = ((InternalEObject)calculated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_TYPE__CALCULATED, null, msgs);
			if (newCalculated != null)
				msgs = ((InternalEObject)newCalculated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_TYPE__CALCULATED, null, msgs);
			msgs = basicSetCalculated(newCalculated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_TYPE__CALCULATED, newCalculated, newCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasuredType getMeasured() {
		return measured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasured(MeasuredType newMeasured, NotificationChain msgs) {
		MeasuredType oldMeasured = measured;
		measured = newMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_TYPE__MEASURED, oldMeasured, newMeasured);
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
	public void setMeasured(MeasuredType newMeasured) {
		if (newMeasured != measured) {
			NotificationChain msgs = null;
			if (measured != null)
				msgs = ((InternalEObject)measured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_TYPE__MEASURED, null, msgs);
			if (newMeasured != null)
				msgs = ((InternalEObject)newMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.ADMITTANCE_TYPE__MEASURED, null, msgs);
			msgs = basicSetMeasured(newMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.ADMITTANCE_TYPE__MEASURED, newMeasured, newMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.ADMITTANCE_TYPE__CALCULATED:
				return basicSetCalculated(null, msgs);
			case _501Package.ADMITTANCE_TYPE__MEASURED:
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
			case _501Package.ADMITTANCE_TYPE__CALCULATED:
				return getCalculated();
			case _501Package.ADMITTANCE_TYPE__MEASURED:
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
			case _501Package.ADMITTANCE_TYPE__CALCULATED:
				setCalculated((CalculatedType)newValue);
				return;
			case _501Package.ADMITTANCE_TYPE__MEASURED:
				setMeasured((MeasuredType)newValue);
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
			case _501Package.ADMITTANCE_TYPE__CALCULATED:
				setCalculated((CalculatedType)null);
				return;
			case _501Package.ADMITTANCE_TYPE__MEASURED:
				setMeasured((MeasuredType)null);
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
			case _501Package.ADMITTANCE_TYPE__CALCULATED:
				return calculated != null;
			case _501Package.ADMITTANCE_TYPE__MEASURED:
				return measured != null;
		}
		return super.eIsSet(featureID);
	}

} //AdmittanceTypeImpl
