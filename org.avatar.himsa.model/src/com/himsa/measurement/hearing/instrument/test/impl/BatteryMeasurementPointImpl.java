/*
 */
package com.himsa.measurement.hearing.instrument.test.impl;

import com.himsa.measurement.hearing.instrument.test.BatteryMeasurementPoint;
import com.himsa.measurement.hearing.instrument.test.TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.BatteryMeasurementPointImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.BatteryMeasurementPointImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryMeasurementPointImpl extends MinimalEObjectImpl.Container implements BatteryMeasurementPoint {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal current = CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryMeasurementPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.BATTERY_MEASUREMENT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(BigInteger newFrequency) {
		BigInteger oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.BATTERY_MEASUREMENT_POINT__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent(BigDecimal newCurrent) {
		BigDecimal oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.BATTERY_MEASUREMENT_POINT__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.BATTERY_MEASUREMENT_POINT__FREQUENCY:
				return getFrequency();
			case TestPackage.BATTERY_MEASUREMENT_POINT__CURRENT:
				return getCurrent();
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
			case TestPackage.BATTERY_MEASUREMENT_POINT__FREQUENCY:
				setFrequency((BigInteger)newValue);
				return;
			case TestPackage.BATTERY_MEASUREMENT_POINT__CURRENT:
				setCurrent((BigDecimal)newValue);
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
			case TestPackage.BATTERY_MEASUREMENT_POINT__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case TestPackage.BATTERY_MEASUREMENT_POINT__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
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
			case TestPackage.BATTERY_MEASUREMENT_POINT__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case TestPackage.BATTERY_MEASUREMENT_POINT__CURRENT:
				return CURRENT_EDEFAULT == null ? current != null : !CURRENT_EDEFAULT.equals(current);
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", current: ");
		result.append(current);
		result.append(')');
		return result.toString();
	}

} //BatteryMeasurementPointImpl
