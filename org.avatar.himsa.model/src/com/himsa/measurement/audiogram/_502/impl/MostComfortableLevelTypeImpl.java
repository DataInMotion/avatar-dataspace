/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.AudioMetricMeasurementConditionsType;
import com.himsa.measurement.audiogram._502.MostComfortableLevelType;
import com.himsa.measurement.audiogram._502.TonePointsType;
import com.himsa.measurement.audiogram._502._502Package;

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
 * An implementation of the model object '<em><b>Most Comfortable Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.MostComfortableLevelTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.MostComfortableLevelTypeImpl#getTonePoints <em>Tone Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MostComfortableLevelTypeImpl extends MinimalEObjectImpl.Container implements MostComfortableLevelType {
	/**
	 * The cached value of the '{@link #getAudMeasurementConditions() <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudMeasurementConditions()
	 * @generated
	 * @ordered
	 */
	protected AudioMetricMeasurementConditionsType audMeasurementConditions;

	/**
	 * The cached value of the '{@link #getTonePoints() <em>Tone Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TonePointsType> tonePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MostComfortableLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.MOST_COMFORTABLE_LEVEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioMetricMeasurementConditionsType getAudMeasurementConditions() {
		return audMeasurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudMeasurementConditions(AudioMetricMeasurementConditionsType newAudMeasurementConditions, NotificationChain msgs) {
		AudioMetricMeasurementConditionsType oldAudMeasurementConditions = audMeasurementConditions;
		audMeasurementConditions = newAudMeasurementConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
	public void setAudMeasurementConditions(AudioMetricMeasurementConditionsType newAudMeasurementConditions) {
		if (newAudMeasurementConditions != audMeasurementConditions) {
			NotificationChain msgs = null;
			if (audMeasurementConditions != null)
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TonePointsType> getTonePoints() {
		if (tonePoints == null) {
			tonePoints = new EObjectContainmentEList<TonePointsType>(TonePointsType.class, this, _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS);
		}
		return tonePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS:
				return ((InternalEList<?>)getTonePoints()).basicRemove(otherEnd, msgs);
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
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS:
				return getTonePoints();
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
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS:
				getTonePoints().clear();
				getTonePoints().addAll((Collection<? extends TonePointsType>)newValue);
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
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS:
				getTonePoints().clear();
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
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case _502Package.MOST_COMFORTABLE_LEVEL_TYPE__TONE_POINTS:
				return tonePoints != null && !tonePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MostComfortableLevelTypeImpl