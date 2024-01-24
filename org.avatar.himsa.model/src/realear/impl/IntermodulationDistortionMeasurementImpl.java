/*
 */
package realear.impl;

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

import realear.IntermodulationDistortionMeasurement;
import realear.IntermodulationDistortionPoint;
import realear.MeasurementConditions;
import realear.RealearPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermodulation Distortion Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realear.impl.IntermodulationDistortionMeasurementImpl#getMeasurementCondition <em>Measurement Condition</em>}</li>
 *   <li>{@link realear.impl.IntermodulationDistortionMeasurementImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermodulationDistortionMeasurementImpl extends MinimalEObjectImpl.Container implements IntermodulationDistortionMeasurement {
	/**
	 * The cached value of the '{@link #getMeasurementCondition() <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementCondition()
	 * @generated
	 * @ordered
	 */
	protected MeasurementConditions measurementCondition;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermodulationDistortionPoint> point;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermodulationDistortionMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealearPackage.Literals.INTERMODULATION_DISTORTION_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditions getMeasurementCondition() {
		return measurementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementCondition(MeasurementConditions newMeasurementCondition, NotificationChain msgs) {
		MeasurementConditions oldMeasurementCondition = measurementCondition;
		measurementCondition = newMeasurementCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION, oldMeasurementCondition, newMeasurementCondition);
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
	public void setMeasurementCondition(MeasurementConditions newMeasurementCondition) {
		if (newMeasurementCondition != measurementCondition) {
			NotificationChain msgs = null;
			if (measurementCondition != null)
				msgs = ((InternalEObject)measurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION, null, msgs);
			if (newMeasurementCondition != null)
				msgs = ((InternalEObject)newMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetMeasurementCondition(newMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION, newMeasurementCondition, newMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermodulationDistortionPoint> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<IntermodulationDistortionPoint>(IntermodulationDistortionPoint.class, this, RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT);
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
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION:
				return basicSetMeasurementCondition(null, msgs);
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT:
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
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION:
				return getMeasurementCondition();
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT:
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
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION:
				setMeasurementCondition((MeasurementConditions)newValue);
				return;
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends IntermodulationDistortionPoint>)newValue);
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
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION:
				setMeasurementCondition((MeasurementConditions)null);
				return;
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT:
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
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__MEASUREMENT_CONDITION:
				return measurementCondition != null;
			case RealearPackage.INTERMODULATION_DISTORTION_MEASUREMENT__POINT:
				return point != null && !point.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntermodulationDistortionMeasurementImpl
