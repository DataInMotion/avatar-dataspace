/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType;
import com.himsa.measurement.admittance._501._501Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex Value Point Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexValuePointCalculatedTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexValuePointCalculatedTypeImpl#getNumericDeltaY <em>Numeric Delta Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexValuePointCalculatedTypeImpl extends MinimalEObjectImpl.Container implements ReflexValuePointCalculatedType {
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
	 * The default value of the '{@link #getNumericDeltaY() <em>Numeric Delta Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericDeltaY()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMERIC_DELTA_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumericDeltaY() <em>Numeric Delta Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericDeltaY()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numericDeltaY = NUMERIC_DELTA_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexValuePointCalculatedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.REFLEX_VALUE_POINT_CALCULATED_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getNumericDeltaY() {
		return numericDeltaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericDeltaY(BigDecimal newNumericDeltaY) {
		BigDecimal oldNumericDeltaY = numericDeltaY;
		numericDeltaY = newNumericDeltaY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y, oldNumericDeltaY, numericDeltaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME:
				return getTime();
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y:
				return getNumericDeltaY();
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
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME:
				setTime((BigDecimal)newValue);
				return;
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y:
				setNumericDeltaY((BigDecimal)newValue);
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
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y:
				setNumericDeltaY(NUMERIC_DELTA_Y_EDEFAULT);
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
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case _501Package.REFLEX_VALUE_POINT_CALCULATED_TYPE__NUMERIC_DELTA_Y:
				return NUMERIC_DELTA_Y_EDEFAULT == null ? numericDeltaY != null : !NUMERIC_DELTA_Y_EDEFAULT.equals(numericDeltaY);
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
		result.append(", numericDeltaY: ");
		result.append(numericDeltaY);
		result.append(')');
		return result.toString();
	}

} //ReflexValuePointCalculatedTypeImpl
