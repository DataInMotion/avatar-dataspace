/*
 */
package test.impl;

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

import test.FrequencyMeasurementPoint;
import test.MeasurementConditions;
import test.RealEarCouplerDifference;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Ear Coupler Difference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.RealEarCouplerDifferenceImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link test.impl.RealEarCouplerDifferenceImpl#getRECD <em>RECD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealEarCouplerDifferenceImpl extends MinimalEObjectImpl.Container implements RealEarCouplerDifference {
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
	 * The cached value of the '{@link #getRECD() <em>RECD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRECD()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurementPoint> rECD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealEarCouplerDifferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.REAL_EAR_COUPLER_DIFFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurementPoint> getRECD() {
		if (rECD == null) {
			rECD = new EObjectContainmentEList<FrequencyMeasurementPoint>(FrequencyMeasurementPoint.class, this, TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD);
		}
		return rECD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD:
				return ((InternalEList<?>)getRECD()).basicRemove(otherEnd, msgs);
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
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD:
				return getRECD();
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
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)newValue);
				return;
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD:
				getRECD().clear();
				getRECD().addAll((Collection<? extends FrequencyMeasurementPoint>)newValue);
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
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)null);
				return;
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD:
				getRECD().clear();
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
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE__RECD:
				return rECD != null && !rECD.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealEarCouplerDifferenceImpl
