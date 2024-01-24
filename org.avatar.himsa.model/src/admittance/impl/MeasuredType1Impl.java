/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitMeasuredType;
import admittance.MeasuredAdmittancePointsType;
import admittance.MeasuredType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measured Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.MeasuredType1Impl#getMeasuredAdmittancePoints <em>Measured Admittance Points</em>}</li>
 *   <li>{@link admittance.impl.MeasuredType1Impl#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasuredType1Impl extends MinimalEObjectImpl.Container implements MeasuredType1 {
	/**
	 * The cached value of the '{@link #getMeasuredAdmittancePoints() <em>Measured Admittance Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredAdmittancePoints()
	 * @generated
	 * @ordered
	 */
	protected MeasuredAdmittancePointsType measuredAdmittancePoints;

	/**
	 * The cached value of the '{@link #getMeasuredAdmittanceUnit() <em>Measured Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredAdmittanceUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitMeasuredType measuredAdmittanceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.MEASURED_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasuredAdmittancePointsType getMeasuredAdmittancePoints() {
		return measuredAdmittancePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasuredAdmittancePoints(MeasuredAdmittancePointsType newMeasuredAdmittancePoints, NotificationChain msgs) {
		MeasuredAdmittancePointsType oldMeasuredAdmittancePoints = measuredAdmittancePoints;
		measuredAdmittancePoints = newMeasuredAdmittancePoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS, oldMeasuredAdmittancePoints, newMeasuredAdmittancePoints);
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
	public void setMeasuredAdmittancePoints(MeasuredAdmittancePointsType newMeasuredAdmittancePoints) {
		if (newMeasuredAdmittancePoints != measuredAdmittancePoints) {
			NotificationChain msgs = null;
			if (measuredAdmittancePoints != null)
				msgs = ((InternalEObject)measuredAdmittancePoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS, null, msgs);
			if (newMeasuredAdmittancePoints != null)
				msgs = ((InternalEObject)newMeasuredAdmittancePoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS, null, msgs);
			msgs = basicSetMeasuredAdmittancePoints(newMeasuredAdmittancePoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS, newMeasuredAdmittancePoints, newMeasuredAdmittancePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitMeasuredType getMeasuredAdmittanceUnit() {
		return measuredAdmittanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType newMeasuredAdmittanceUnit, NotificationChain msgs) {
		AdmittanceUnitMeasuredType oldMeasuredAdmittanceUnit = measuredAdmittanceUnit;
		measuredAdmittanceUnit = newMeasuredAdmittanceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT, oldMeasuredAdmittanceUnit, newMeasuredAdmittanceUnit);
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
	public void setMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType newMeasuredAdmittanceUnit) {
		if (newMeasuredAdmittanceUnit != measuredAdmittanceUnit) {
			NotificationChain msgs = null;
			if (measuredAdmittanceUnit != null)
				msgs = ((InternalEObject)measuredAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT, null, msgs);
			if (newMeasuredAdmittanceUnit != null)
				msgs = ((InternalEObject)newMeasuredAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetMeasuredAdmittanceUnit(newMeasuredAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT, newMeasuredAdmittanceUnit, newMeasuredAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS:
				return basicSetMeasuredAdmittancePoints(null, msgs);
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT:
				return basicSetMeasuredAdmittanceUnit(null, msgs);
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
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS:
				return getMeasuredAdmittancePoints();
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT:
				return getMeasuredAdmittanceUnit();
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
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS:
				setMeasuredAdmittancePoints((MeasuredAdmittancePointsType)newValue);
				return;
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT:
				setMeasuredAdmittanceUnit((AdmittanceUnitMeasuredType)newValue);
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
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS:
				setMeasuredAdmittancePoints((MeasuredAdmittancePointsType)null);
				return;
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT:
				setMeasuredAdmittanceUnit((AdmittanceUnitMeasuredType)null);
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
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_POINTS:
				return measuredAdmittancePoints != null;
			case AdmittancePackage.MEASURED_TYPE1__MEASURED_ADMITTANCE_UNIT:
				return measuredAdmittanceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasuredType1Impl
