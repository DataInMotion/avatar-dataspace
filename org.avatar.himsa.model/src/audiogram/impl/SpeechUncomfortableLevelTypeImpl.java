/*
 */
package audiogram.impl;

import audiogram.AudioMetricMeasurementConditionsType;
import audiogram.AudiogramPackage;
import audiogram.SpeechScorePointType;
import audiogram.SpeechUncomfortableLevelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Uncomfortable Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.SpeechUncomfortableLevelTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram.impl.SpeechUncomfortableLevelTypeImpl#getSpeechUncomfortablePoint <em>Speech Uncomfortable Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechUncomfortableLevelTypeImpl extends MinimalEObjectImpl.Container implements SpeechUncomfortableLevelType {
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
	 * The cached value of the '{@link #getSpeechUncomfortablePoint() <em>Speech Uncomfortable Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechUncomfortablePoint()
	 * @generated
	 * @ordered
	 */
	protected SpeechScorePointType speechUncomfortablePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechUncomfortableLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.SPEECH_UNCOMFORTABLE_LEVEL_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeechScorePointType getSpeechUncomfortablePoint() {
		return speechUncomfortablePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechUncomfortablePoint(SpeechScorePointType newSpeechUncomfortablePoint, NotificationChain msgs) {
		SpeechScorePointType oldSpeechUncomfortablePoint = speechUncomfortablePoint;
		speechUncomfortablePoint = newSpeechUncomfortablePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT, oldSpeechUncomfortablePoint, newSpeechUncomfortablePoint);
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
	public void setSpeechUncomfortablePoint(SpeechScorePointType newSpeechUncomfortablePoint) {
		if (newSpeechUncomfortablePoint != speechUncomfortablePoint) {
			NotificationChain msgs = null;
			if (speechUncomfortablePoint != null)
				msgs = ((InternalEObject)speechUncomfortablePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT, null, msgs);
			if (newSpeechUncomfortablePoint != null)
				msgs = ((InternalEObject)newSpeechUncomfortablePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT, null, msgs);
			msgs = basicSetSpeechUncomfortablePoint(newSpeechUncomfortablePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT, newSpeechUncomfortablePoint, newSpeechUncomfortablePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT:
				return basicSetSpeechUncomfortablePoint(null, msgs);
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
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT:
				return getSpeechUncomfortablePoint();
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
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT:
				setSpeechUncomfortablePoint((SpeechScorePointType)newValue);
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
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT:
				setSpeechUncomfortablePoint((SpeechScorePointType)null);
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
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case AudiogramPackage.SPEECH_UNCOMFORTABLE_LEVEL_TYPE__SPEECH_UNCOMFORTABLE_POINT:
				return speechUncomfortablePoint != null;
		}
		return super.eIsSet(featureID);
	}

} //SpeechUncomfortableLevelTypeImpl
