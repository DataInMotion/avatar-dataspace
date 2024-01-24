/*
 */
package com.himsa.measurement.hearing.instrument.test.impl;

import com.himsa.measurement.hearing.instrument.test.HarmonicDistortionMeasurementCurve;
import com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint;
import com.himsa.measurement.hearing.instrument.test.MeasurementConditions;
import com.himsa.measurement.hearing.instrument.test.TestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Harmonic Distortion Measurement Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.HarmonicDistortionMeasurementCurveImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.HarmonicDistortionMeasurementCurveImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HarmonicDistortionMeasurementCurveImpl extends MinimalEObjectImpl.Container implements HarmonicDistortionMeasurementCurve {
	/**
	 * The cached value of the '{@link #getMeasurementConditions() <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementConditions()
	 * @generated
	 * @ordered
	 */
	protected MeasurementConditions measurementConditions;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<HarmonicDistortionPoint> point;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HarmonicDistortionMeasurementCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.HARMONIC_DISTORTION_MEASUREMENT_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditions getMeasurementConditions() {
		return measurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementConditions(MeasurementConditions newMeasurementConditions, NotificationChain msgs) {
		MeasurementConditions oldMeasurementConditions = measurementConditions;
		measurementConditions = newMeasurementConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
	public void setMeasurementConditions(MeasurementConditions newMeasurementConditions) {
		if (newMeasurementConditions != measurementConditions) {
			NotificationChain msgs = null;
			if (measurementConditions != null)
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HarmonicDistortionPoint> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<HarmonicDistortionPoint>(HarmonicDistortionPoint.class, this, TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT:
				return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
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
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT:
				return getPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)newValue);
				return;
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends HarmonicDistortionPoint>)newValue);
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
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)null);
				return;
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT:
				getPoint().clear();
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
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE__POINT:
				return point != null && !point.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HarmonicDistortionMeasurementCurveImpl
