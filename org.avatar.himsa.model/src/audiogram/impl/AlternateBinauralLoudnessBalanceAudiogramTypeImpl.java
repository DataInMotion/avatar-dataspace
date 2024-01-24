/*
 */
package audiogram.impl;

import audiogram.AlternateBinauralLoudnessBalanceAudiogramType;
import audiogram.AudioMetricMeasurementConditionsType;
import audiogram.AudiogramPackage;
import audiogram.TonePointsType;

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
 * An implementation of the model object '<em><b>Alternate Binaural Loudness Balance Audiogram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram.impl.AlternateBinauralLoudnessBalanceAudiogramTypeImpl#getAlternateBinauralLoudnessBalancePoints <em>Alternate Binaural Loudness Balance Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternateBinauralLoudnessBalanceAudiogramTypeImpl extends MinimalEObjectImpl.Container implements AlternateBinauralLoudnessBalanceAudiogramType {
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
	 * The cached value of the '{@link #getAlternateBinauralLoudnessBalancePoints() <em>Alternate Binaural Loudness Balance Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateBinauralLoudnessBalancePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TonePointsType> alternateBinauralLoudnessBalancePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternateBinauralLoudnessBalanceAudiogramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TonePointsType> getAlternateBinauralLoudnessBalancePoints() {
		if (alternateBinauralLoudnessBalancePoints == null) {
			alternateBinauralLoudnessBalancePoints = new EObjectContainmentEList<TonePointsType>(TonePointsType.class, this, AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS);
		}
		return alternateBinauralLoudnessBalancePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS:
				return ((InternalEList<?>)getAlternateBinauralLoudnessBalancePoints()).basicRemove(otherEnd, msgs);
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
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS:
				return getAlternateBinauralLoudnessBalancePoints();
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
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS:
				getAlternateBinauralLoudnessBalancePoints().clear();
				getAlternateBinauralLoudnessBalancePoints().addAll((Collection<? extends TonePointsType>)newValue);
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
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS:
				getAlternateBinauralLoudnessBalancePoints().clear();
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
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case AudiogramPackage.ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_POINTS:
				return alternateBinauralLoudnessBalancePoints != null && !alternateBinauralLoudnessBalancePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlternateBinauralLoudnessBalanceAudiogramTypeImpl
