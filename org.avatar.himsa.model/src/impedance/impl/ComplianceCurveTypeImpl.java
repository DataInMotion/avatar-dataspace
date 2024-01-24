/*
 */
package impedance.impl;

import impedance.ComplianceCurveType;
import impedance.CompliancePointType;
import impedance.ComplianceUnitType;
import impedance.ImpedancePackage;

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
 * An implementation of the model object '<em><b>Compliance Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.ComplianceCurveTypeImpl#getCompliancePoint <em>Compliance Point</em>}</li>
 *   <li>{@link impedance.impl.ComplianceCurveTypeImpl#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceCurveTypeImpl extends MinimalEObjectImpl.Container implements ComplianceCurveType {
	/**
	 * The cached value of the '{@link #getCompliancePoint() <em>Compliance Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliancePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<CompliancePointType> compliancePoint;

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
	protected ComplianceCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.COMPLIANCE_CURVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompliancePointType> getCompliancePoint() {
		if (compliancePoint == null) {
			compliancePoint = new EObjectContainmentEList<CompliancePointType>(CompliancePointType.class, this, ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT);
		}
		return compliancePoint;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT, oldComplianceUnit, newComplianceUnit);
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
				msgs = ((InternalEObject)complianceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT, null, msgs);
			if (newComplianceUnit != null)
				msgs = ((InternalEObject)newComplianceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT, null, msgs);
			msgs = basicSetComplianceUnit(newComplianceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT, newComplianceUnit, newComplianceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT:
				return ((InternalEList<?>)getCompliancePoint()).basicRemove(otherEnd, msgs);
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT:
				return getCompliancePoint();
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT:
				getCompliancePoint().clear();
				getCompliancePoint().addAll((Collection<? extends CompliancePointType>)newValue);
				return;
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT:
				getCompliancePoint().clear();
				return;
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_POINT:
				return compliancePoint != null && !compliancePoint.isEmpty();
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE__COMPLIANCE_UNIT:
				return complianceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplianceCurveTypeImpl
