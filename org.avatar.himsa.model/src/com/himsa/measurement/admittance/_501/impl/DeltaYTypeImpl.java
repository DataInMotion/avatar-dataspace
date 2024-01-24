/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceUnitMeasuredType;
import com.himsa.measurement.admittance._501.DeltaYPointsType;
import com.himsa.measurement.admittance._501.DeltaYType;
import com.himsa.measurement.admittance._501._501Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta YType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.DeltaYTypeImpl#getDeltaYPoints <em>Delta YPoints</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.DeltaYTypeImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.DeltaYTypeImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.DeltaYTypeImpl#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaYTypeImpl extends MinimalEObjectImpl.Container implements DeltaYType {
	/**
	 * The cached value of the '{@link #getDeltaYPoints() <em>Delta YPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaYPoints()
	 * @generated
	 * @ordered
	 */
	protected DeltaYPointsType deltaYPoints;

	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal G0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal g0 = G0_EDEFAULT;

	/**
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal B0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal b0 = B0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasuredAdmittanceUnit() <em>Measured Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredAdmittanceUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitMeasuredType measuredAdmittanceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaYTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.DELTA_YTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaYPointsType getDeltaYPoints() {
		return deltaYPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaYPoints(DeltaYPointsType newDeltaYPoints, NotificationChain msgs) {
		DeltaYPointsType oldDeltaYPoints = deltaYPoints;
		deltaYPoints = newDeltaYPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__DELTA_YPOINTS, oldDeltaYPoints, newDeltaYPoints);
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
	public void setDeltaYPoints(DeltaYPointsType newDeltaYPoints) {
		if (newDeltaYPoints != deltaYPoints) {
			NotificationChain msgs = null;
			if (deltaYPoints != null)
				msgs = ((InternalEObject)deltaYPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.DELTA_YTYPE__DELTA_YPOINTS, null, msgs);
			if (newDeltaYPoints != null)
				msgs = ((InternalEObject)newDeltaYPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.DELTA_YTYPE__DELTA_YPOINTS, null, msgs);
			msgs = basicSetDeltaYPoints(newDeltaYPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__DELTA_YPOINTS, newDeltaYPoints, newDeltaYPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getG0() {
		return g0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setG0(BigDecimal newG0) {
		BigDecimal oldG0 = g0;
		g0 = newG0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__G0, oldG0, g0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getB0() {
		return b0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setB0(BigDecimal newB0) {
		BigDecimal oldB0 = b0;
		b0 = newB0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__B0, oldB0, b0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitMeasuredType getMeasuredAdmittanceUnit() {
		return measuredAdmittanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType newMeasuredAdmittanceUnit, NotificationChain msgs) {
		AdmittanceUnitMeasuredType oldMeasuredAdmittanceUnit = measuredAdmittanceUnit;
		measuredAdmittanceUnit = newMeasuredAdmittanceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT, oldMeasuredAdmittanceUnit, newMeasuredAdmittanceUnit);
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
	public void setMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType newMeasuredAdmittanceUnit) {
		if (newMeasuredAdmittanceUnit != measuredAdmittanceUnit) {
			NotificationChain msgs = null;
			if (measuredAdmittanceUnit != null)
				msgs = ((InternalEObject)measuredAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT, null, msgs);
			if (newMeasuredAdmittanceUnit != null)
				msgs = ((InternalEObject)newMeasuredAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetMeasuredAdmittanceUnit(newMeasuredAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT, newMeasuredAdmittanceUnit, newMeasuredAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.DELTA_YTYPE__DELTA_YPOINTS:
				return basicSetDeltaYPoints(null, msgs);
			case _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT:
				return basicSetMeasuredAdmittanceUnit(null, msgs);
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
			case _501Package.DELTA_YTYPE__DELTA_YPOINTS:
				return getDeltaYPoints();
			case _501Package.DELTA_YTYPE__G0:
				return getG0();
			case _501Package.DELTA_YTYPE__B0:
				return getB0();
			case _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT:
				return getMeasuredAdmittanceUnit();
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
			case _501Package.DELTA_YTYPE__DELTA_YPOINTS:
				setDeltaYPoints((DeltaYPointsType)newValue);
				return;
			case _501Package.DELTA_YTYPE__G0:
				setG0((BigDecimal)newValue);
				return;
			case _501Package.DELTA_YTYPE__B0:
				setB0((BigDecimal)newValue);
				return;
			case _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT:
				setMeasuredAdmittanceUnit((AdmittanceUnitMeasuredType)newValue);
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
			case _501Package.DELTA_YTYPE__DELTA_YPOINTS:
				setDeltaYPoints((DeltaYPointsType)null);
				return;
			case _501Package.DELTA_YTYPE__G0:
				setG0(G0_EDEFAULT);
				return;
			case _501Package.DELTA_YTYPE__B0:
				setB0(B0_EDEFAULT);
				return;
			case _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT:
				setMeasuredAdmittanceUnit((AdmittanceUnitMeasuredType)null);
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
			case _501Package.DELTA_YTYPE__DELTA_YPOINTS:
				return deltaYPoints != null;
			case _501Package.DELTA_YTYPE__G0:
				return G0_EDEFAULT == null ? g0 != null : !G0_EDEFAULT.equals(g0);
			case _501Package.DELTA_YTYPE__B0:
				return B0_EDEFAULT == null ? b0 != null : !B0_EDEFAULT.equals(b0);
			case _501Package.DELTA_YTYPE__MEASURED_ADMITTANCE_UNIT:
				return measuredAdmittanceUnit != null;
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
		result.append(" (g0: ");
		result.append(g0);
		result.append(", b0: ");
		result.append(b0);
		result.append(')');
		return result.toString();
	}

} //DeltaYTypeImpl
