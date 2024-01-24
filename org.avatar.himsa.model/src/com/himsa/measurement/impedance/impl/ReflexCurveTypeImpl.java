/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.ComplianceUnitType;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.ReflexCurveType;
import com.himsa.measurement.impedance.ReflexPointType;

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
 * An implementation of the model object '<em><b>Reflex Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.ReflexCurveTypeImpl#getReflexPoint <em>Reflex Point</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.ReflexCurveTypeImpl#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexCurveTypeImpl extends MinimalEObjectImpl.Container implements ReflexCurveType {
	/**
	 * The cached value of the '{@link #getReflexPoint() <em>Reflex Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ReflexPointType> reflexPoint;

	/**
	 * The cached value of the '{@link #getComplianceUnit() <em>Compliance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceUnit()
	 * @generated
	 * @ordered
	 */
	protected ComplianceUnitType complianceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.REFLEX_CURVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReflexPointType> getReflexPoint() {
		if (reflexPoint == null) {
			reflexPoint = new EObjectContainmentEList<ReflexPointType>(ReflexPointType.class, this, ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT);
		}
		return reflexPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceUnitType getComplianceUnit() {
		return complianceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplianceUnit(ComplianceUnitType newComplianceUnit, NotificationChain msgs) {
		ComplianceUnitType oldComplianceUnit = complianceUnit;
		complianceUnit = newComplianceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT, oldComplianceUnit, newComplianceUnit);
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
	public void setComplianceUnit(ComplianceUnitType newComplianceUnit) {
		if (newComplianceUnit != complianceUnit) {
			NotificationChain msgs = null;
			if (complianceUnit != null)
				msgs = ((InternalEObject)complianceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT, null, msgs);
			if (newComplianceUnit != null)
				msgs = ((InternalEObject)newComplianceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT, null, msgs);
			msgs = basicSetComplianceUnit(newComplianceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT, newComplianceUnit, newComplianceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT:
				return ((InternalEList<?>)getReflexPoint()).basicRemove(otherEnd, msgs);
			case ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT:
				return basicSetComplianceUnit(null, msgs);
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
			case ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT:
				return getReflexPoint();
			case ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT:
				return getComplianceUnit();
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
			case ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT:
				getReflexPoint().clear();
				getReflexPoint().addAll((Collection<? extends ReflexPointType>)newValue);
				return;
			case ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT:
				setComplianceUnit((ComplianceUnitType)newValue);
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
			case ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT:
				getReflexPoint().clear();
				return;
			case ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT:
				setComplianceUnit((ComplianceUnitType)null);
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
			case ImpedancePackage.REFLEX_CURVE_TYPE__REFLEX_POINT:
				return reflexPoint != null && !reflexPoint.isEmpty();
			case ImpedancePackage.REFLEX_CURVE_TYPE__COMPLIANCE_UNIT:
				return complianceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ReflexCurveTypeImpl
