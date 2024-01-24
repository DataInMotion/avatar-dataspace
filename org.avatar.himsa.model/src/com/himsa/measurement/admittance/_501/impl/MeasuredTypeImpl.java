/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceUnitMeasuredType;
import com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType;
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
 * An implementation of the model object '<em><b>Measured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.MeasuredTypeImpl#getAdmittancePointMeasured <em>Admittance Point Measured</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.MeasuredTypeImpl#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasuredTypeImpl extends MinimalEObjectImpl.Container implements MeasuredType {
	/**
	 * The cached value of the '{@link #getAdmittancePointMeasured() <em>Admittance Point Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittancePointMeasured()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueMeasuredType admittancePointMeasured;

	/**
	 * The cached value of the '{@link #getAdmittanceUnitMeasured() <em>Admittance Unit Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceUnitMeasured()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitMeasuredType admittanceUnitMeasured;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.MEASURED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueMeasuredType getAdmittancePointMeasured() {
		return admittancePointMeasured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittancePointMeasured(AdmittanceValueMeasuredType newAdmittancePointMeasured, NotificationChain msgs) {
		AdmittanceValueMeasuredType oldAdmittancePointMeasured = admittancePointMeasured;
		admittancePointMeasured = newAdmittancePointMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED, oldAdmittancePointMeasured, newAdmittancePointMeasured);
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
	public void setAdmittancePointMeasured(AdmittanceValueMeasuredType newAdmittancePointMeasured) {
		if (newAdmittancePointMeasured != admittancePointMeasured) {
			NotificationChain msgs = null;
			if (admittancePointMeasured != null)
				msgs = ((InternalEObject)admittancePointMeasured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED, null, msgs);
			if (newAdmittancePointMeasured != null)
				msgs = ((InternalEObject)newAdmittancePointMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED, null, msgs);
			msgs = basicSetAdmittancePointMeasured(newAdmittancePointMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED, newAdmittancePointMeasured, newAdmittancePointMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitMeasuredType getAdmittanceUnitMeasured() {
		return admittanceUnitMeasured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceUnitMeasured(AdmittanceUnitMeasuredType newAdmittanceUnitMeasured, NotificationChain msgs) {
		AdmittanceUnitMeasuredType oldAdmittanceUnitMeasured = admittanceUnitMeasured;
		admittanceUnitMeasured = newAdmittanceUnitMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED, oldAdmittanceUnitMeasured, newAdmittanceUnitMeasured);
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
	public void setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType newAdmittanceUnitMeasured) {
		if (newAdmittanceUnitMeasured != admittanceUnitMeasured) {
			NotificationChain msgs = null;
			if (admittanceUnitMeasured != null)
				msgs = ((InternalEObject)admittanceUnitMeasured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED, null, msgs);
			if (newAdmittanceUnitMeasured != null)
				msgs = ((InternalEObject)newAdmittanceUnitMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED, null, msgs);
			msgs = basicSetAdmittanceUnitMeasured(newAdmittanceUnitMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED, newAdmittanceUnitMeasured, newAdmittanceUnitMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED:
				return basicSetAdmittancePointMeasured(null, msgs);
			case _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED:
				return basicSetAdmittanceUnitMeasured(null, msgs);
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
			case _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED:
				return getAdmittancePointMeasured();
			case _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED:
				return getAdmittanceUnitMeasured();
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
			case _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED:
				setAdmittancePointMeasured((AdmittanceValueMeasuredType)newValue);
				return;
			case _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED:
				setAdmittanceUnitMeasured((AdmittanceUnitMeasuredType)newValue);
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
			case _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED:
				setAdmittancePointMeasured((AdmittanceValueMeasuredType)null);
				return;
			case _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED:
				setAdmittanceUnitMeasured((AdmittanceUnitMeasuredType)null);
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
			case _501Package.MEASURED_TYPE__ADMITTANCE_POINT_MEASURED:
				return admittancePointMeasured != null;
			case _501Package.MEASURED_TYPE__ADMITTANCE_UNIT_MEASURED:
				return admittanceUnitMeasured != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasuredTypeImpl
