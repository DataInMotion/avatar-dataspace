/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.CompliancePointType;
import com.himsa.measurement.impedance.ComplianceValueType;
import com.himsa.measurement.impedance.ImpedancePackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.CompliancePointTypeImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.CompliancePointTypeImpl#getCompliance <em>Compliance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompliancePointTypeImpl extends MinimalEObjectImpl.Container implements CompliancePointType {
	/**
	 * The default value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRESSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pressure = PRESSURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompliance() <em>Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected ComplianceValueType compliance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompliancePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.COMPLIANCE_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressure(BigInteger newPressure) {
		BigInteger oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_POINT_TYPE__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceValueType getCompliance() {
		return compliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompliance(ComplianceValueType newCompliance, NotificationChain msgs) {
		ComplianceValueType oldCompliance = compliance;
		compliance = newCompliance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE, oldCompliance, newCompliance);
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
	public void setCompliance(ComplianceValueType newCompliance) {
		if (newCompliance != compliance) {
			NotificationChain msgs = null;
			if (compliance != null)
				msgs = ((InternalEObject)compliance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE, null, msgs);
			if (newCompliance != null)
				msgs = ((InternalEObject)newCompliance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE, null, msgs);
			msgs = basicSetCompliance(newCompliance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE, newCompliance, newCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE:
				return basicSetCompliance(null, msgs);
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
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__PRESSURE:
				return getPressure();
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE:
				return getCompliance();
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
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__PRESSURE:
				setPressure((BigInteger)newValue);
				return;
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE:
				setCompliance((ComplianceValueType)newValue);
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
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE:
				setCompliance((ComplianceValueType)null);
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
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__PRESSURE:
				return PRESSURE_EDEFAULT == null ? pressure != null : !PRESSURE_EDEFAULT.equals(pressure);
			case ImpedancePackage.COMPLIANCE_POINT_TYPE__COMPLIANCE:
				return compliance != null;
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
		result.append(" (pressure: ");
		result.append(pressure);
		result.append(')');
		return result.toString();
	}

} //CompliancePointTypeImpl
