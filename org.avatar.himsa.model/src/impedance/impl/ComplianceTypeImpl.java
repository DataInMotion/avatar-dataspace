/*
 */
package impedance.impl;

import impedance.ComplianceType;
import impedance.ComplianceUnitType;
import impedance.ComplianceValueType;
import impedance.ImpedancePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.ComplianceTypeImpl#getComplianceValue <em>Compliance Value</em>}</li>
 *   <li>{@link impedance.impl.ComplianceTypeImpl#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceTypeImpl extends MinimalEObjectImpl.Container implements ComplianceType {
	/**
	 * The cached value of the '{@link #getComplianceValue() <em>Compliance Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceValue()
	 * @generated
	 * @ordered
	 */
	protected ComplianceValueType complianceValue;

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
	protected ComplianceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.COMPLIANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceValueType getComplianceValue() {
		return complianceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplianceValue(ComplianceValueType newComplianceValue, NotificationChain msgs) {
		ComplianceValueType oldComplianceValue = complianceValue;
		complianceValue = newComplianceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE, oldComplianceValue, newComplianceValue);
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
	public void setComplianceValue(ComplianceValueType newComplianceValue) {
		if (newComplianceValue != complianceValue) {
			NotificationChain msgs = null;
			if (complianceValue != null)
				msgs = ((InternalEObject)complianceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE, null, msgs);
			if (newComplianceValue != null)
				msgs = ((InternalEObject)newComplianceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE, null, msgs);
			msgs = basicSetComplianceValue(newComplianceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE, newComplianceValue, newComplianceValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT, oldComplianceUnit, newComplianceUnit);
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
				msgs = ((InternalEObject)complianceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT, null, msgs);
			if (newComplianceUnit != null)
				msgs = ((InternalEObject)newComplianceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT, null, msgs);
			msgs = basicSetComplianceUnit(newComplianceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT, newComplianceUnit, newComplianceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE:
				return basicSetComplianceValue(null, msgs);
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE:
				return getComplianceValue();
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT:
				return getComplianceUnit();
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
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE:
				setComplianceValue((ComplianceValueType)newValue);
				return;
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE:
				setComplianceValue((ComplianceValueType)null);
				return;
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT:
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
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_VALUE:
				return complianceValue != null;
			case ImpedancePackage.COMPLIANCE_TYPE__COMPLIANCE_UNIT:
				return complianceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplianceTypeImpl
