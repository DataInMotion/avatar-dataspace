/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.EarPackage;
import com.himsa.measurement.real.ear.TargetCurve;
import com.himsa.measurement.real.ear.TargetMeasurementPoint;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetCurveImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetCurveImpl#getResult <em>Result</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetCurveImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.TargetCurveImpl#getPreDelay <em>Pre Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetCurveImpl extends MinimalEObjectImpl.Container implements TargetCurve {
	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected TargetMeasurementPoint curve;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected BigInteger result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreDelay() <em>Pre Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDelay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRE_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreDelay() <em>Pre Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDelay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger preDelay = PRE_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.TARGET_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetMeasurementPoint getCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve(TargetMeasurementPoint newCurve, NotificationChain msgs) {
		TargetMeasurementPoint oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_CURVE__CURVE, oldCurve, newCurve);
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
	public void setCurve(TargetMeasurementPoint newCurve) {
		if (newCurve != curve) {
			NotificationChain msgs = null;
			if (curve != null)
				msgs = ((InternalEObject)curve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EarPackage.TARGET_CURVE__CURVE, null, msgs);
			if (newCurve != null)
				msgs = ((InternalEObject)newCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EarPackage.TARGET_CURVE__CURVE, null, msgs);
			msgs = basicSetCurve(newCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_CURVE__CURVE, newCurve, newCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(BigInteger newResult) {
		BigInteger oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_CURVE__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(BigInteger newResolution) {
		BigInteger oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_CURVE__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPreDelay() {
		return preDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreDelay(BigInteger newPreDelay) {
		BigInteger oldPreDelay = preDelay;
		preDelay = newPreDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.TARGET_CURVE__PRE_DELAY, oldPreDelay, preDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EarPackage.TARGET_CURVE__CURVE:
				return basicSetCurve(null, msgs);
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
			case EarPackage.TARGET_CURVE__CURVE:
				return getCurve();
			case EarPackage.TARGET_CURVE__RESULT:
				return getResult();
			case EarPackage.TARGET_CURVE__RESOLUTION:
				return getResolution();
			case EarPackage.TARGET_CURVE__PRE_DELAY:
				return getPreDelay();
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
			case EarPackage.TARGET_CURVE__CURVE:
				setCurve((TargetMeasurementPoint)newValue);
				return;
			case EarPackage.TARGET_CURVE__RESULT:
				setResult((BigInteger)newValue);
				return;
			case EarPackage.TARGET_CURVE__RESOLUTION:
				setResolution((BigInteger)newValue);
				return;
			case EarPackage.TARGET_CURVE__PRE_DELAY:
				setPreDelay((BigInteger)newValue);
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
			case EarPackage.TARGET_CURVE__CURVE:
				setCurve((TargetMeasurementPoint)null);
				return;
			case EarPackage.TARGET_CURVE__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case EarPackage.TARGET_CURVE__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case EarPackage.TARGET_CURVE__PRE_DELAY:
				setPreDelay(PRE_DELAY_EDEFAULT);
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
			case EarPackage.TARGET_CURVE__CURVE:
				return curve != null;
			case EarPackage.TARGET_CURVE__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case EarPackage.TARGET_CURVE__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case EarPackage.TARGET_CURVE__PRE_DELAY:
				return PRE_DELAY_EDEFAULT == null ? preDelay != null : !PRE_DELAY_EDEFAULT.equals(preDelay);
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
		result.append(" (result: ");
		result.append(result);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", preDelay: ");
		result.append(preDelay);
		result.append(')');
		return result.toString();
	}

} //TargetCurveImpl
