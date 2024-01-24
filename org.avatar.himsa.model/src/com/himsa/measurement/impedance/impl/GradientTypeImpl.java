/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.ComplianceValueType;
import com.himsa.measurement.impedance.GradientType;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.UnitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.GradientTypeImpl#getGradientValue <em>Gradient Value</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.GradientTypeImpl#getGradientUnit <em>Gradient Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradientTypeImpl extends MinimalEObjectImpl.Container implements GradientType {
	/**
	 * The cached value of the '{@link #getGradientValue() <em>Gradient Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientValue()
	 * @generated
	 * @ordered
	 */
	protected ComplianceValueType gradientValue;

	/**
	 * The default value of the '{@link #getGradientUnit() <em>Gradient Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType GRADIENT_UNIT_EDEFAULT = UnitType.CUBIC_CENTIMETRER;

	/**
	 * The cached value of the '{@link #getGradientUnit() <em>Gradient Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType gradientUnit = GRADIENT_UNIT_EDEFAULT;

	/**
	 * This is true if the Gradient Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.GRADIENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceValueType getGradientValue() {
		return gradientValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradientValue(ComplianceValueType newGradientValue, NotificationChain msgs) {
		ComplianceValueType oldGradientValue = gradientValue;
		gradientValue = newGradientValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE, oldGradientValue, newGradientValue);
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
	public void setGradientValue(ComplianceValueType newGradientValue) {
		if (newGradientValue != gradientValue) {
			NotificationChain msgs = null;
			if (gradientValue != null)
				msgs = ((InternalEObject)gradientValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE, null, msgs);
			if (newGradientValue != null)
				msgs = ((InternalEObject)newGradientValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE, null, msgs);
			msgs = basicSetGradientValue(newGradientValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE, newGradientValue, newGradientValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getGradientUnit() {
		return gradientUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradientUnit(UnitType newGradientUnit) {
		UnitType oldGradientUnit = gradientUnit;
		gradientUnit = newGradientUnit == null ? GRADIENT_UNIT_EDEFAULT : newGradientUnit;
		boolean oldGradientUnitESet = gradientUnitESet;
		gradientUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT, oldGradientUnit, gradientUnit, !oldGradientUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGradientUnit() {
		UnitType oldGradientUnit = gradientUnit;
		boolean oldGradientUnitESet = gradientUnitESet;
		gradientUnit = GRADIENT_UNIT_EDEFAULT;
		gradientUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT, oldGradientUnit, GRADIENT_UNIT_EDEFAULT, oldGradientUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGradientUnit() {
		return gradientUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE:
				return basicSetGradientValue(null, msgs);
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
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE:
				return getGradientValue();
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT:
				return getGradientUnit();
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
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE:
				setGradientValue((ComplianceValueType)newValue);
				return;
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT:
				setGradientUnit((UnitType)newValue);
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
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE:
				setGradientValue((ComplianceValueType)null);
				return;
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT:
				unsetGradientUnit();
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
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_VALUE:
				return gradientValue != null;
			case ImpedancePackage.GRADIENT_TYPE__GRADIENT_UNIT:
				return isSetGradientUnit();
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
		result.append(" (gradientUnit: ");
		if (gradientUnitESet) result.append(gradientUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GradientTypeImpl
