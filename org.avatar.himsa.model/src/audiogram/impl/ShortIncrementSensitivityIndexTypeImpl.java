/*
 */
package audiogram.impl;

import audiogram.AudioMetricMeasurementConditionsType;
import audiogram.AudiogramPackage;
import audiogram.ShortIncrementSensitivityIndexPoint;
import audiogram.ShortIncrementSensitivityIndexType;

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
 * An implementation of the model object '<em><b>Short Increment Sensitivity Index Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.ShortIncrementSensitivityIndexTypeImpl#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram.impl.ShortIncrementSensitivityIndexTypeImpl#getShortIncrementSensitivityIndexPoints <em>Short Increment Sensitivity Index Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortIncrementSensitivityIndexTypeImpl extends MinimalEObjectImpl.Container implements ShortIncrementSensitivityIndexType {
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
	 * The cached value of the '{@link #getShortIncrementSensitivityIndexPoints() <em>Short Increment Sensitivity Index Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortIncrementSensitivityIndexPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortIncrementSensitivityIndexPoint> shortIncrementSensitivityIndexPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortIncrementSensitivityIndexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS, oldAudMeasurementConditions, newAudMeasurementConditions);
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
				msgs = ((InternalEObject)audMeasurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			if (newAudMeasurementConditions != null)
				msgs = ((InternalEObject)newAudMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetAudMeasurementConditions(newAudMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS, newAudMeasurementConditions, newAudMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortIncrementSensitivityIndexPoint> getShortIncrementSensitivityIndexPoints() {
		if (shortIncrementSensitivityIndexPoints == null) {
			shortIncrementSensitivityIndexPoints = new EObjectContainmentEList<ShortIncrementSensitivityIndexPoint>(ShortIncrementSensitivityIndexPoint.class, this, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS);
		}
		return shortIncrementSensitivityIndexPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return basicSetAudMeasurementConditions(null, msgs);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS:
				return ((InternalEList<?>)getShortIncrementSensitivityIndexPoints()).basicRemove(otherEnd, msgs);
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return getAudMeasurementConditions();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS:
				return getShortIncrementSensitivityIndexPoints();
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS:
				getShortIncrementSensitivityIndexPoints().clear();
				getShortIncrementSensitivityIndexPoints().addAll((Collection<? extends ShortIncrementSensitivityIndexPoint>)newValue);
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS:
				setAudMeasurementConditions((AudioMetricMeasurementConditionsType)null);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS:
				getShortIncrementSensitivityIndexPoints().clear();
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__AUD_MEASUREMENT_CONDITIONS:
				return audMeasurementConditions != null;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX_POINTS:
				return shortIncrementSensitivityIndexPoints != null && !shortIncrementSensitivityIndexPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShortIncrementSensitivityIndexTypeImpl
