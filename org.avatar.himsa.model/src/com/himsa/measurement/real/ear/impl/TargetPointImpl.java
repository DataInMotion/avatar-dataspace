/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.EarPackage;
import com.himsa.measurement.real.ear.TargetPoint;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetPointImpl#getTargetFrequency <em>Target Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetPointImpl#getTargetGain <em>Target Gain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetPointImpl extends MinimalEObjectImpl.Container implements TargetPoint {
	/**
	 * The default value of the '{@link #getTargetFrequency() <em>Target Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrequency() <em>Target Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger targetFrequency = TARGET_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetGain() <em>Target Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGain()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TARGET_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetGain() <em>Target Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGain()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal targetGain = TARGET_GAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.TARGET_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTargetFrequency() {
		return targetFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetFrequency(BigInteger newTargetFrequency) {
		BigInteger oldTargetFrequency = targetFrequency;
		targetFrequency = newTargetFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_POINT__TARGET_FREQUENCY, oldTargetFrequency, targetFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTargetGain() {
		return targetGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetGain(BigDecimal newTargetGain) {
		BigDecimal oldTargetGain = targetGain;
		targetGain = newTargetGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_POINT__TARGET_GAIN, oldTargetGain, targetGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarPackage.TARGET_POINT__TARGET_FREQUENCY:
				return getTargetFrequency();
			case EarPackage.TARGET_POINT__TARGET_GAIN:
				return getTargetGain();
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
			case EarPackage.TARGET_POINT__TARGET_FREQUENCY:
				setTargetFrequency((BigInteger)newValue);
				return;
			case EarPackage.TARGET_POINT__TARGET_GAIN:
				setTargetGain((BigDecimal)newValue);
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
			case EarPackage.TARGET_POINT__TARGET_FREQUENCY:
				setTargetFrequency(TARGET_FREQUENCY_EDEFAULT);
				return;
			case EarPackage.TARGET_POINT__TARGET_GAIN:
				setTargetGain(TARGET_GAIN_EDEFAULT);
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
			case EarPackage.TARGET_POINT__TARGET_FREQUENCY:
				return TARGET_FREQUENCY_EDEFAULT == null ? targetFrequency != null : !TARGET_FREQUENCY_EDEFAULT.equals(targetFrequency);
			case EarPackage.TARGET_POINT__TARGET_GAIN:
				return TARGET_GAIN_EDEFAULT == null ? targetGain != null : !TARGET_GAIN_EDEFAULT.equals(targetGain);
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
		result.append(" (targetFrequency: ");
		result.append(targetFrequency);
		result.append(", targetGain: ");
		result.append(targetGain);
		result.append(')');
		return result.toString();
	}

} //TargetPointImpl
