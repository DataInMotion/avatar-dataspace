/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.ReflexValuePointMeasuredType;
import com.himsa.measurement.admittance._501._501Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex Value Point Measured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexValuePointMeasuredTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexValuePointMeasuredTypeImpl#getDeltaG <em>Delta G</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexValuePointMeasuredTypeImpl#getDeltaB <em>Delta B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexValuePointMeasuredTypeImpl extends MinimalEObjectImpl.Container implements ReflexValuePointMeasuredType {
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
	 * The default value of the '{@link #getDeltaG() <em>Delta G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaG()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DELTA_G_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaG() <em>Delta G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaG()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal deltaG = DELTA_G_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaB() <em>Delta B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaB()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DELTA_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaB() <em>Delta B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaB()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal deltaB = DELTA_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexValuePointMeasuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.REFLEX_VALUE_POINT_MEASURED_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDeltaG() {
		return deltaG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaG(BigDecimal newDeltaG) {
		BigDecimal oldDeltaG = deltaG;
		deltaG = newDeltaG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G, oldDeltaG, deltaG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDeltaB() {
		return deltaB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaB(BigDecimal newDeltaB) {
		BigDecimal oldDeltaB = deltaB;
		deltaB = newDeltaB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B, oldDeltaB, deltaB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__TIME:
				return getTime();
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G:
				return getDeltaG();
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B:
				return getDeltaB();
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
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__TIME:
				setTime((BigDecimal)newValue);
				return;
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G:
				setDeltaG((BigDecimal)newValue);
				return;
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B:
				setDeltaB((BigDecimal)newValue);
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
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G:
				setDeltaG(DELTA_G_EDEFAULT);
				return;
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B:
				setDeltaB(DELTA_B_EDEFAULT);
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
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_G:
				return DELTA_G_EDEFAULT == null ? deltaG != null : !DELTA_G_EDEFAULT.equals(deltaG);
			case _501Package.REFLEX_VALUE_POINT_MEASURED_TYPE__DELTA_B:
				return DELTA_B_EDEFAULT == null ? deltaB != null : !DELTA_B_EDEFAULT.equals(deltaB);
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
		result.append(", deltaG: ");
		result.append(deltaG);
		result.append(", deltaB: ");
		result.append(deltaB);
		result.append(')');
		return result.toString();
	}

} //ReflexValuePointMeasuredTypeImpl
