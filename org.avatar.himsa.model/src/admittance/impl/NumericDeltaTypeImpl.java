/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitCalculatedType;
import admittance.NumericDeltaType;
import admittance.NumericDeltaYPointsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Delta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.NumericDeltaTypeImpl#getNumericDeltaYPoints <em>Numeric Delta YPoints</em>}</li>
 *   <li>{@link admittance.impl.NumericDeltaTypeImpl#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericDeltaTypeImpl extends MinimalEObjectImpl.Container implements NumericDeltaType {
	/**
	 * The cached value of the '{@link #getNumericDeltaYPoints() <em>Numeric Delta YPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericDeltaYPoints()
	 * @generated
	 * @ordered
	 */
	protected NumericDeltaYPointsType numericDeltaYPoints;

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
	protected NumericDeltaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.NUMERIC_DELTA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericDeltaYPointsType getNumericDeltaYPoints() {
		return numericDeltaYPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumericDeltaYPoints(NumericDeltaYPointsType newNumericDeltaYPoints, NotificationChain msgs) {
		NumericDeltaYPointsType oldNumericDeltaYPoints = numericDeltaYPoints;
		numericDeltaYPoints = newNumericDeltaYPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS, oldNumericDeltaYPoints, newNumericDeltaYPoints);
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
	public void setNumericDeltaYPoints(NumericDeltaYPointsType newNumericDeltaYPoints) {
		if (newNumericDeltaYPoints != numericDeltaYPoints) {
			NotificationChain msgs = null;
			if (numericDeltaYPoints != null)
				msgs = ((InternalEObject)numericDeltaYPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS, null, msgs);
			if (newNumericDeltaYPoints != null)
				msgs = ((InternalEObject)newNumericDeltaYPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS, null, msgs);
			msgs = basicSetNumericDeltaYPoints(newNumericDeltaYPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS, newNumericDeltaYPoints, newNumericDeltaYPoints));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT, oldCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit);
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
				msgs = ((InternalEObject)calculatedAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			if (newCalculatedAdmittanceUnit != null)
				msgs = ((InternalEObject)newCalculatedAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetCalculatedAdmittanceUnit(newCalculatedAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT, newCalculatedAdmittanceUnit, newCalculatedAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS:
				return basicSetNumericDeltaYPoints(null, msgs);
			case AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT:
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
			case AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS:
				return getNumericDeltaYPoints();
			case AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT:
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
			case AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS:
				setNumericDeltaYPoints((NumericDeltaYPointsType)newValue);
				return;
			case AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT:
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
			case AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS:
				setNumericDeltaYPoints((NumericDeltaYPointsType)null);
				return;
			case AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT:
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
			case AdmittancePackage.NUMERIC_DELTA_TYPE__NUMERIC_DELTA_YPOINTS:
				return numericDeltaYPoints != null;
			case AdmittancePackage.NUMERIC_DELTA_TYPE__CALCULATED_ADMITTANCE_UNIT:
				return calculatedAdmittanceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //NumericDeltaTypeImpl
