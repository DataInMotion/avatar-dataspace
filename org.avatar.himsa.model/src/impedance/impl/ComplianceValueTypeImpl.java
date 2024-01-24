/*
 */
package impedance.impl;

import impedance.ComplianceValueType;
import impedance.ImpedancePackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.ComplianceValueTypeImpl#getArgumentCompliance1 <em>Argument Compliance1</em>}</li>
 *   <li>{@link impedance.impl.ComplianceValueTypeImpl#getArgumentCompliance2 <em>Argument Compliance2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceValueTypeImpl extends MinimalEObjectImpl.Container implements ComplianceValueType {
	/**
	 * The default value of the '{@link #getArgumentCompliance1() <em>Argument Compliance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentCompliance1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ARGUMENT_COMPLIANCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentCompliance1() <em>Argument Compliance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentCompliance1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger argumentCompliance1 = ARGUMENT_COMPLIANCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgumentCompliance2() <em>Argument Compliance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentCompliance2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ARGUMENT_COMPLIANCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentCompliance2() <em>Argument Compliance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentCompliance2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger argumentCompliance2 = ARGUMENT_COMPLIANCE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.COMPLIANCE_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getArgumentCompliance1() {
		return argumentCompliance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentCompliance1(BigInteger newArgumentCompliance1) {
		BigInteger oldArgumentCompliance1 = argumentCompliance1;
		argumentCompliance1 = newArgumentCompliance1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1, oldArgumentCompliance1, argumentCompliance1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getArgumentCompliance2() {
		return argumentCompliance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentCompliance2(BigInteger newArgumentCompliance2) {
		BigInteger oldArgumentCompliance2 = argumentCompliance2;
		argumentCompliance2 = newArgumentCompliance2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2, oldArgumentCompliance2, argumentCompliance2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1:
				return getArgumentCompliance1();
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2:
				return getArgumentCompliance2();
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
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1:
				setArgumentCompliance1((BigInteger)newValue);
				return;
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2:
				setArgumentCompliance2((BigInteger)newValue);
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
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1:
				setArgumentCompliance1(ARGUMENT_COMPLIANCE1_EDEFAULT);
				return;
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2:
				setArgumentCompliance2(ARGUMENT_COMPLIANCE2_EDEFAULT);
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
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE1:
				return ARGUMENT_COMPLIANCE1_EDEFAULT == null ? argumentCompliance1 != null : !ARGUMENT_COMPLIANCE1_EDEFAULT.equals(argumentCompliance1);
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE__ARGUMENT_COMPLIANCE2:
				return ARGUMENT_COMPLIANCE2_EDEFAULT == null ? argumentCompliance2 != null : !ARGUMENT_COMPLIANCE2_EDEFAULT.equals(argumentCompliance2);
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
		result.append(" (argumentCompliance1: ");
		result.append(argumentCompliance1);
		result.append(", argumentCompliance2: ");
		result.append(argumentCompliance2);
		result.append(')');
		return result.toString();
	}

} //ComplianceValueTypeImpl
