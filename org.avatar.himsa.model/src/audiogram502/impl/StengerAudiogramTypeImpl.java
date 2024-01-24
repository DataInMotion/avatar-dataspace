/*
 */
package audiogram502.impl;

import audiogram502.AudioMetricMeasurementConditionsType;
import audiogram502.Audiogram502Package;
import audiogram502.StengerAudiogramType;
import audiogram502.TonePointsType;

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
 * An implementation of the model object '<em><b>Stenger Audiogram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.impl.StengerAudiogramTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram502.impl.StengerAudiogramTypeImpl#getStengerPoints <em>Stenger Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StengerAudiogramTypeImpl extends MinimalEObjectImpl.Container implements StengerAudiogramType {
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
	 * The cached value of the '{@link #getStengerPoints() <em>Stenger Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStengerPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TonePointsType> stengerPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StengerAudiogramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Audiogram502Package.Literals.STENGER_AUDIOGRAM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TonePointsType> getStengerPoints() {
		if (stengerPoints == null) {
			stengerPoints = new EObjectContainmentEList<TonePointsType>(TonePointsType.class, this, Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS);
		}
		return stengerPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS:
				return ((InternalEList<?>)getStengerPoints()).basicRemove(otherEnd, msgs);
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
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS:
				return getStengerPoints();
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
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS:
				getStengerPoints().clear();
				getStengerPoints().addAll((Collection<? extends TonePointsType>)newValue);
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
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS:
				getStengerPoints().clear();
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
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case Audiogram502Package.STENGER_AUDIOGRAM_TYPE__STENGER_POINTS:
				return stengerPoints != null && !stengerPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StengerAudiogramTypeImpl