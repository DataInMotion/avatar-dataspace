/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.ComplianceUnitType;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.UnitType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.ComplianceUnitTypeImpl#getArgumentUnit1 <em>Argument Unit1</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.ComplianceUnitTypeImpl#getArgumentUnit2 <em>Argument Unit2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceUnitTypeImpl extends MinimalEObjectImpl.Container implements ComplianceUnitType {
	/**
	 * The default value of the '{@link #getArgumentUnit1() <em>Argument Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentUnit1()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType ARGUMENT_UNIT1_EDEFAULT = UnitType.CUBIC_CENTIMETRER;

	/**
	 * The cached value of the '{@link #getArgumentUnit1() <em>Argument Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentUnit1()
	 * @generated
	 * @ordered
	 */
	protected UnitType argumentUnit1 = ARGUMENT_UNIT1_EDEFAULT;

	/**
	 * This is true if the Argument Unit1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean argumentUnit1ESet;

	/**
	 * The default value of the '{@link #getArgumentUnit2() <em>Argument Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentUnit2()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType ARGUMENT_UNIT2_EDEFAULT = UnitType.CUBIC_CENTIMETRER;

	/**
	 * The cached value of the '{@link #getArgumentUnit2() <em>Argument Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentUnit2()
	 * @generated
	 * @ordered
	 */
	protected UnitType argumentUnit2 = ARGUMENT_UNIT2_EDEFAULT;

	/**
	 * This is true if the Argument Unit2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean argumentUnit2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.COMPLIANCE_UNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getArgumentUnit1() {
		return argumentUnit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentUnit1(UnitType newArgumentUnit1) {
		UnitType oldArgumentUnit1 = argumentUnit1;
		argumentUnit1 = newArgumentUnit1 == null ? ARGUMENT_UNIT1_EDEFAULT : newArgumentUnit1;
		boolean oldArgumentUnit1ESet = argumentUnit1ESet;
		argumentUnit1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1, oldArgumentUnit1, argumentUnit1, !oldArgumentUnit1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArgumentUnit1() {
		UnitType oldArgumentUnit1 = argumentUnit1;
		boolean oldArgumentUnit1ESet = argumentUnit1ESet;
		argumentUnit1 = ARGUMENT_UNIT1_EDEFAULT;
		argumentUnit1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1, oldArgumentUnit1, ARGUMENT_UNIT1_EDEFAULT, oldArgumentUnit1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArgumentUnit1() {
		return argumentUnit1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getArgumentUnit2() {
		return argumentUnit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentUnit2(UnitType newArgumentUnit2) {
		UnitType oldArgumentUnit2 = argumentUnit2;
		argumentUnit2 = newArgumentUnit2 == null ? ARGUMENT_UNIT2_EDEFAULT : newArgumentUnit2;
		boolean oldArgumentUnit2ESet = argumentUnit2ESet;
		argumentUnit2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2, oldArgumentUnit2, argumentUnit2, !oldArgumentUnit2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArgumentUnit2() {
		UnitType oldArgumentUnit2 = argumentUnit2;
		boolean oldArgumentUnit2ESet = argumentUnit2ESet;
		argumentUnit2 = ARGUMENT_UNIT2_EDEFAULT;
		argumentUnit2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2, oldArgumentUnit2, ARGUMENT_UNIT2_EDEFAULT, oldArgumentUnit2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArgumentUnit2() {
		return argumentUnit2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1:
				return getArgumentUnit1();
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2:
				return getArgumentUnit2();
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
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1:
				setArgumentUnit1((UnitType)newValue);
				return;
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2:
				setArgumentUnit2((UnitType)newValue);
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
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1:
				unsetArgumentUnit1();
				return;
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2:
				unsetArgumentUnit2();
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
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT1:
				return isSetArgumentUnit1();
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE__ARGUMENT_UNIT2:
				return isSetArgumentUnit2();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (argumentUnit1: ");
		if (argumentUnit1ESet) result.append(argumentUnit1); else result.append("<unset>");
		result.append(", argumentUnit2: ");
		if (argumentUnit2ESet) result.append(argumentUnit2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComplianceUnitTypeImpl
