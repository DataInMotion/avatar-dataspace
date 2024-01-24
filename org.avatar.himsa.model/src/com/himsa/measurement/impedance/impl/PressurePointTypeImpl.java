/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.PressurePointType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.PressurePointTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.PressurePointTypeImpl#getPressure <em>Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressurePointTypeImpl extends MinimalEObjectImpl.Container implements PressurePointType {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRESSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pressure = PRESSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressurePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.PRESSURE_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(BigDecimal newTime) {
		BigDecimal oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.PRESSURE_POINT_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressure(BigInteger newPressure) {
		BigInteger oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.PRESSURE_POINT_TYPE__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpedancePackage.PRESSURE_POINT_TYPE__TIME:
				return getTime();
			case ImpedancePackage.PRESSURE_POINT_TYPE__PRESSURE:
				return getPressure();
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
			case ImpedancePackage.PRESSURE_POINT_TYPE__TIME:
				setTime((BigDecimal)newValue);
				return;
			case ImpedancePackage.PRESSURE_POINT_TYPE__PRESSURE:
				setPressure((BigInteger)newValue);
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
			case ImpedancePackage.PRESSURE_POINT_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ImpedancePackage.PRESSURE_POINT_TYPE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
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
			case ImpedancePackage.PRESSURE_POINT_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ImpedancePackage.PRESSURE_POINT_TYPE__PRESSURE:
				return PRESSURE_EDEFAULT == null ? pressure != null : !PRESSURE_EDEFAULT.equals(pressure);
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
		result.append(" (time: ");
		result.append(time);
		result.append(", pressure: ");
		result.append(pressure);
		result.append(')');
		return result.toString();
	}

} //PressurePointTypeImpl
