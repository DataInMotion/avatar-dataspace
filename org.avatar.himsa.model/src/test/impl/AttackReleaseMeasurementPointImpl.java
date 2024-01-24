/*
 */
package test.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import test.AttackReleaseMeasurementPoint;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Release Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.AttackReleaseMeasurementPointImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link test.impl.AttackReleaseMeasurementPointImpl#getAttackReleaseTime <em>Attack Release Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackReleaseMeasurementPointImpl extends MinimalEObjectImpl.Container implements AttackReleaseMeasurementPoint {
	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackReleaseTime() <em>Attack Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ATTACK_RELEASE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackReleaseTime() <em>Attack Release Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal attackReleaseTime = ATTACK_RELEASE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackReleaseMeasurementPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.ATTACK_RELEASE_MEASUREMENT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(BigDecimal newOutput) {
		BigDecimal oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAttackReleaseTime() {
		return attackReleaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttackReleaseTime(BigDecimal newAttackReleaseTime) {
		BigDecimal oldAttackReleaseTime = attackReleaseTime;
		attackReleaseTime = newAttackReleaseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME, oldAttackReleaseTime, attackReleaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT:
				return getOutput();
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME:
				return getAttackReleaseTime();
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
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT:
				setOutput((BigDecimal)newValue);
				return;
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME:
				setAttackReleaseTime((BigDecimal)newValue);
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
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME:
				setAttackReleaseTime(ATTACK_RELEASE_TIME_EDEFAULT);
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
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT__ATTACK_RELEASE_TIME:
				return ATTACK_RELEASE_TIME_EDEFAULT == null ? attackReleaseTime != null : !ATTACK_RELEASE_TIME_EDEFAULT.equals(attackReleaseTime);
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
		result.append(" (output: ");
		result.append(output);
		result.append(", attackReleaseTime: ");
		result.append(attackReleaseTime);
		result.append(')');
		return result.toString();
	}

} //AttackReleaseMeasurementPointImpl
