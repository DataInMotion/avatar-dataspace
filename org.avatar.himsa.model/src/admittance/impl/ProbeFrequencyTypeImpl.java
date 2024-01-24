/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.FrequencyOtherType;
import admittance.ProbeFrequencyType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe Frequency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.ProbeFrequencyTypeImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link admittance.impl.ProbeFrequencyTypeImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbeFrequencyTypeImpl extends MinimalEObjectImpl.Container implements ProbeFrequencyType {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQUENCY_EDEFAULT = new BigInteger("226");

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frequency = FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyESet;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final FrequencyOtherType OTHER_EDEFAULT = FrequencyOtherType.OTHER;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected FrequencyOtherType other = OTHER_EDEFAULT;

	/**
	 * This is true if the Other attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean otherESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbeFrequencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.PROBE_FREQUENCY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(BigInteger newFrequency) {
		BigInteger oldFrequency = frequency;
		frequency = newFrequency;
		boolean oldFrequencyESet = frequencyESet;
		frequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY, oldFrequency, frequency, !oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrequency() {
		BigInteger oldFrequency = frequency;
		boolean oldFrequencyESet = frequencyESet;
		frequency = FREQUENCY_EDEFAULT;
		frequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY, oldFrequency, FREQUENCY_EDEFAULT, oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrequency() {
		return frequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyOtherType getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(FrequencyOtherType newOther) {
		FrequencyOtherType oldOther = other;
		other = newOther == null ? OTHER_EDEFAULT : newOther;
		boolean oldOtherESet = otherESet;
		otherESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER, oldOther, other, !oldOtherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOther() {
		FrequencyOtherType oldOther = other;
		boolean oldOtherESet = otherESet;
		other = OTHER_EDEFAULT;
		otherESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER, oldOther, OTHER_EDEFAULT, oldOtherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOther() {
		return otherESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY:
				return getFrequency();
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER:
				return getOther();
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
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY:
				setFrequency((BigInteger)newValue);
				return;
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER:
				setOther((FrequencyOtherType)newValue);
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
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY:
				unsetFrequency();
				return;
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER:
				unsetOther();
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
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__FREQUENCY:
				return isSetFrequency();
			case AdmittancePackage.PROBE_FREQUENCY_TYPE__OTHER:
				return isSetOther();
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
		result.append(" (frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", other: ");
		if (otherESet) result.append(other); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProbeFrequencyTypeImpl
