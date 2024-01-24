/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.AudioMetricMeasurementConditionsType;
import com.himsa.measurement.audiogram._502.SpeechMostComfortableLevelType;
import com.himsa.measurement.audiogram._502.SpeechScorePointType;
import com.himsa.measurement.audiogram._502._502Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Most Comfortable Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.SpeechMostComfortableLevelTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.SpeechMostComfortableLevelTypeImpl#getSpeechMostComfortablePoint <em>Speech Most Comfortable Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechMostComfortableLevelTypeImpl extends MinimalEObjectImpl.Container implements SpeechMostComfortableLevelType {
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
	 * The cached value of the '{@link #getSpeechMostComfortablePoint() <em>Speech Most Comfortable Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechMostComfortablePoint()
	 * @generated
	 * @ordered
	 */
	protected SpeechScorePointType speechMostComfortablePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechMostComfortableLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechScorePointType getSpeechMostComfortablePoint() {
		return speechMostComfortablePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechMostComfortablePoint(SpeechScorePointType newSpeechMostComfortablePoint, NotificationChain msgs) {
		SpeechScorePointType oldSpeechMostComfortablePoint = speechMostComfortablePoint;
		speechMostComfortablePoint = newSpeechMostComfortablePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT, oldSpeechMostComfortablePoint, newSpeechMostComfortablePoint);
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
	public void setSpeechMostComfortablePoint(SpeechScorePointType newSpeechMostComfortablePoint) {
		if (newSpeechMostComfortablePoint != speechMostComfortablePoint) {
			NotificationChain msgs = null;
			if (speechMostComfortablePoint != null)
				msgs = ((InternalEObject)speechMostComfortablePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT, null, msgs);
			if (newSpeechMostComfortablePoint != null)
				msgs = ((InternalEObject)newSpeechMostComfortablePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT, null, msgs);
			msgs = basicSetSpeechMostComfortablePoint(newSpeechMostComfortablePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT, newSpeechMostComfortablePoint, newSpeechMostComfortablePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT:
				return basicSetSpeechMostComfortablePoint(null, msgs);
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
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT:
				return getSpeechMostComfortablePoint();
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
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT:
				setSpeechMostComfortablePoint((SpeechScorePointType)newValue);
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
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT:
				setSpeechMostComfortablePoint((SpeechScorePointType)null);
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
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case _502Package.SPEECH_MOST_COMFORTABLE_LEVEL_TYPE__SPEECH_MOST_COMFORTABLE_POINT:
				return speechMostComfortablePoint != null;
		}
		return super.eIsSet(featureID);
	}

} //SpeechMostComfortableLevelTypeImpl
