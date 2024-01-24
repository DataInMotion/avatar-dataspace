/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitCalculatedType;
import admittance.CalculatedAdmittancePointsType;
import admittance.CalculatedType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.CalculatedType1Impl#getCalculatedAdmittancePoints <em>Calculated Admittance Points</em>}</li>
 *   <li>{@link admittance.impl.CalculatedType1Impl#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedType1Impl extends MinimalEObjectImpl.Container implements CalculatedType1 {
	/**
	 * The cached value of the '{@link #getCalculatedAdmittancePoints() <em>Calculated Admittance Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedAdmittancePoints()
	 * @generated
	 * @ordered
	 */
	protected CalculatedAdmittancePointsType calculatedAdmittancePoints;

	/**
	 * The cached value of the '{@link #getCalculatedAdmittanceUnit() <em>Calculated Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedAdmittanceUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitCalculatedType calculatedAdmittanceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.CALCULATED_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedAdmittancePointsType getCalculatedAdmittancePoints() {
		return calculatedAdmittancePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedAdmittancePoints(CalculatedAdmittancePointsType newCalculatedAdmittancePoints, NotificationChain msgs) {
		CalculatedAdmittancePointsType oldCalculatedAdmittancePoints = calculatedAdmittancePoints;
		calculatedAdmittancePoints = newCalculatedAdmittancePoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS, oldCalculatedAdmittancePoints, newCalculatedAdmittancePoints);
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
	public void setCalculatedAdmittancePoints(CalculatedAdmittancePointsType newCalculatedAdmittancePoints) {
		if (newCalculatedAdmittancePoints != calculatedAdmittancePoints) {
			NotificationChain msgs = null;
			if (calculatedAdmittancePoints != null)
				msgs = ((InternalEObject)calculatedAdmittancePoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS, null, msgs);
			if (newCalculatedAdmittancePoints != null)
				msgs = ((InternalEObject)newCalculatedAdmittancePoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS, null, msgs);
			msgs = basicSetCalculatedAdmittancePoints(newCalculatedAdmittancePoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS, newCalculatedAdmittancePoints, newCalculatedAdmittancePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitCalculatedType getCalculatedAdmittanceUnit() {
		return calculatedAdmittanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType newCalculatedAdmittanceUnit, NotificationChain msgs) {
		AdmittanceUnitCalculatedType oldCalculatedAdmittanceUnit = calculatedAdmittanceUnit;
		calculatedAdmittanceUnit = newCalculatedAdmittanceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT, oldCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit);
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
	public void setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType newCalculatedAdmittanceUnit) {
		if (newCalculatedAdmittanceUnit != calculatedAdmittanceUnit) {
			NotificationChain msgs = null;
			if (calculatedAdmittanceUnit != null)
				msgs = ((InternalEObject)calculatedAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			if (newCalculatedAdmittanceUnit != null)
				msgs = ((InternalEObject)newCalculatedAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetCalculatedAdmittanceUnit(newCalculatedAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT, newCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS:
				return basicSetCalculatedAdmittancePoints(null, msgs);
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT:
				return basicSetCalculatedAdmittanceUnit(null, msgs);
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
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS:
				return getCalculatedAdmittancePoints();
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT:
				return getCalculatedAdmittanceUnit();
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
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS:
				setCalculatedAdmittancePoints((CalculatedAdmittancePointsType)newValue);
				return;
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT:
				setCalculatedAdmittanceUnit((AdmittanceUnitCalculatedType)newValue);
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
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS:
				setCalculatedAdmittancePoints((CalculatedAdmittancePointsType)null);
				return;
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT:
				setCalculatedAdmittanceUnit((AdmittanceUnitCalculatedType)null);
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
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_POINTS:
				return calculatedAdmittancePoints != null;
			case AdmittancePackage.CALCULATED_TYPE1__CALCULATED_ADMITTANCE_UNIT:
				return calculatedAdmittanceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //CalculatedType1Impl
