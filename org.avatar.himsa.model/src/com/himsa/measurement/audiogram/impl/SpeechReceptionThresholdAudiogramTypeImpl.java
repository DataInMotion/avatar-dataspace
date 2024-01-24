/*
 */
package com.himsa.measurement.audiogram.impl;

import com.himsa.measurement.audiogram.AudioMetricMeasurementConditionsType;
import com.himsa.measurement.audiogram.AudiogramPackage;
import com.himsa.measurement.audiogram.SpeechReceptionThresholdAudiogramType;
import com.himsa.measurement.audiogram.SpeechScorePointType;

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
 * An implementation of the model object '<em><b>Speech Reception Threshold Audiogram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechReceptionThresholdAudiogramTypeImpl#getSpeechReceptionPoints <em>Speech Reception Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechReceptionThresholdAudiogramTypeImpl extends MinimalEObjectImpl.Container implements SpeechReceptionThresholdAudiogramType {
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
	 * The cached value of the '{@link #getSpeechReceptionPoints() <em>Speech Reception Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechReceptionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechScorePointType> speechReceptionPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechReceptionThresholdAudiogramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechScorePointType> getSpeechReceptionPoints() {
		if (speechReceptionPoints == null) {
			speechReceptionPoints = new EObjectContainmentEList<SpeechScorePointType>(SpeechScorePointType.class, this, AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS);
		}
		return speechReceptionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS:
				return ((InternalEList<?>)getSpeechReceptionPoints()).basicRemove(otherEnd, msgs);
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
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS:
				return getSpeechReceptionPoints();
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
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS:
				getSpeechReceptionPoints().clear();
				getSpeechReceptionPoints().addAll((Collection<? extends SpeechScorePointType>)newValue);
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
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS:
				getSpeechReceptionPoints().clear();
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
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case AudiogramPackage.SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM_TYPE__SPEECH_RECEPTION_POINTS:
				return speechReceptionPoints != null && !speechReceptionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpeechReceptionThresholdAudiogramTypeImpl
