/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.EarPackage;
import com.himsa.measurement.real.ear.FrequencyMeasurementPoint;
import com.himsa.measurement.real.ear.MeasurementConditions;
import com.himsa.measurement.real.ear.OcclusionEffects;

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
 * An implementation of the model object '<em><b>Occlusion Effects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.OcclusionEffectsImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.OcclusionEffectsImpl#getREUR <em>REUR</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.OcclusionEffectsImpl#getREOR <em>REOR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OcclusionEffectsImpl extends MinimalEObjectImpl.Container implements OcclusionEffects {
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
	 * The cached value of the '{@link #getREUR() <em>REUR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREUR()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurementPoint> rEUR;

	/**
	 * The cached value of the '{@link #getREOR() <em>REOR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREOR()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurementPoint> rEOR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcclusionEffectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.OCCLUSION_EFFECTS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurementPoint> getREUR() {
		if (rEUR == null) {
			rEUR = new EObjectContainmentEList<FrequencyMeasurementPoint>(FrequencyMeasurementPoint.class, this, EarPackage.OCCLUSION_EFFECTS__REUR);
		}
		return rEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurementPoint> getREOR() {
		if (rEOR == null) {
			rEOR = new EObjectContainmentEList<FrequencyMeasurementPoint>(FrequencyMeasurementPoint.class, this, EarPackage.OCCLUSION_EFFECTS__REOR);
		}
		return rEOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case EarPackage.OCCLUSION_EFFECTS__REUR:
				return ((InternalEList<?>)getREUR()).basicRemove(otherEnd, msgs);
			case EarPackage.OCCLUSION_EFFECTS__REOR:
				return ((InternalEList<?>)getREOR()).basicRemove(otherEnd, msgs);
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
			case EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case EarPackage.OCCLUSION_EFFECTS__REUR:
				return getREUR();
			case EarPackage.OCCLUSION_EFFECTS__REOR:
				return getREOR();
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
			case EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)newValue);
				return;
			case EarPackage.OCCLUSION_EFFECTS__REUR:
				getREUR().clear();
				getREUR().addAll((Collection<? extends FrequencyMeasurementPoint>)newValue);
				return;
			case EarPackage.OCCLUSION_EFFECTS__REOR:
				getREOR().clear();
				getREOR().addAll((Collection<? extends FrequencyMeasurementPoint>)newValue);
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
			case EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)null);
				return;
			case EarPackage.OCCLUSION_EFFECTS__REUR:
				getREUR().clear();
				return;
			case EarPackage.OCCLUSION_EFFECTS__REOR:
				getREOR().clear();
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
			case EarPackage.OCCLUSION_EFFECTS__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case EarPackage.OCCLUSION_EFFECTS__REUR:
				return rEUR != null && !rEUR.isEmpty();
			case EarPackage.OCCLUSION_EFFECTS__REOR:
				return rEOR != null && !rEOR.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OcclusionEffectsImpl
