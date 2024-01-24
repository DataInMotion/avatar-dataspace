/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.BatteryCurrentMeasurement;
import com.himsa.measurement.real.ear.BatteryMeasurementConditions;
import com.himsa.measurement.real.ear.BatteryMeasurementPoint;
import com.himsa.measurement.real.ear.EarPackage;

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
 * An implementation of the model object '<em><b>Battery Current Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryCurrentMeasurementImpl#getBatteryConditions <em>Battery Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryCurrentMeasurementImpl#getBatteryCurve <em>Battery Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryCurrentMeasurementImpl extends MinimalEObjectImpl.Container implements BatteryCurrentMeasurement {
	/**
	 * The cached value of the '{@link #getBatteryConditions() <em>Battery Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryConditions()
	 * @generated
	 * @ordered
	 */
	protected BatteryMeasurementConditions batteryConditions;

	/**
	 * The cached value of the '{@link #getBatteryCurve() <em>Battery Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<BatteryMeasurementPoint> batteryCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryCurrentMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.BATTERY_CURRENT_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryMeasurementConditions getBatteryConditions() {
		return batteryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatteryConditions(BatteryMeasurementConditions newBatteryConditions, NotificationChain msgs) {
		BatteryMeasurementConditions oldBatteryConditions = batteryConditions;
		batteryConditions = newBatteryConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS, oldBatteryConditions, newBatteryConditions);
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
	public void setBatteryConditions(BatteryMeasurementConditions newBatteryConditions) {
		if (newBatteryConditions != batteryConditions) {
			NotificationChain msgs = null;
			if (batteryConditions != null)
				msgs = ((InternalEObject)batteryConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS, null, msgs);
			if (newBatteryConditions != null)
				msgs = ((InternalEObject)newBatteryConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS, null, msgs);
			msgs = basicSetBatteryConditions(newBatteryConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS, newBatteryConditions, newBatteryConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BatteryMeasurementPoint> getBatteryCurve() {
		if (batteryCurve == null) {
			batteryCurve = new EObjectContainmentEList<BatteryMeasurementPoint>(BatteryMeasurementPoint.class, this, EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE);
		}
		return batteryCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS:
				return basicSetBatteryConditions(null, msgs);
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE:
				return ((InternalEList<?>)getBatteryCurve()).basicRemove(otherEnd, msgs);
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
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS:
				return getBatteryConditions();
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE:
				return getBatteryCurve();
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
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS:
				setBatteryConditions((BatteryMeasurementConditions)newValue);
				return;
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE:
				getBatteryCurve().clear();
				getBatteryCurve().addAll((Collection<? extends BatteryMeasurementPoint>)newValue);
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
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS:
				setBatteryConditions((BatteryMeasurementConditions)null);
				return;
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE:
				getBatteryCurve().clear();
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
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CONDITIONS:
				return batteryConditions != null;
			case EarPackage.BATTERY_CURRENT_MEASUREMENT__BATTERY_CURVE:
				return batteryCurve != null && !batteryCurve.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BatteryCurrentMeasurementImpl
