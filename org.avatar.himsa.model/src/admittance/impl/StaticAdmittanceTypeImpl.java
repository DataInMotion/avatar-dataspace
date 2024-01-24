/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitType;
import admittance.AdmittanceValueType;
import admittance.StaticAdmittanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Admittance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.StaticAdmittanceTypeImpl#getStaticAdmittanceValue <em>Static Admittance Value</em>}</li>
 *   <li>{@link admittance.impl.StaticAdmittanceTypeImpl#getStaticAdmittanceUnit <em>Static Admittance Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticAdmittanceTypeImpl extends MinimalEObjectImpl.Container implements StaticAdmittanceType {
	/**
	 * The cached value of the '{@link #getStaticAdmittanceValue() <em>Static Admittance Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticAdmittanceValue()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceValueType staticAdmittanceValue;

	/**
	 * The cached value of the '{@link #getStaticAdmittanceUnit() <em>Static Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticAdmittanceUnit()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitType staticAdmittanceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticAdmittanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.STATIC_ADMITTANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceValueType getStaticAdmittanceValue() {
		return staticAdmittanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticAdmittanceValue(AdmittanceValueType newStaticAdmittanceValue, NotificationChain msgs) {
		AdmittanceValueType oldStaticAdmittanceValue = staticAdmittanceValue;
		staticAdmittanceValue = newStaticAdmittanceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE, oldStaticAdmittanceValue, newStaticAdmittanceValue);
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
	public void setStaticAdmittanceValue(AdmittanceValueType newStaticAdmittanceValue) {
		if (newStaticAdmittanceValue != staticAdmittanceValue) {
			NotificationChain msgs = null;
			if (staticAdmittanceValue != null)
				msgs = ((InternalEObject)staticAdmittanceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE, null, msgs);
			if (newStaticAdmittanceValue != null)
				msgs = ((InternalEObject)newStaticAdmittanceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE, null, msgs);
			msgs = basicSetStaticAdmittanceValue(newStaticAdmittanceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE, newStaticAdmittanceValue, newStaticAdmittanceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitType getStaticAdmittanceUnit() {
		return staticAdmittanceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticAdmittanceUnit(AdmittanceUnitType newStaticAdmittanceUnit, NotificationChain msgs) {
		AdmittanceUnitType oldStaticAdmittanceUnit = staticAdmittanceUnit;
		staticAdmittanceUnit = newStaticAdmittanceUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT, oldStaticAdmittanceUnit, newStaticAdmittanceUnit);
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
	public void setStaticAdmittanceUnit(AdmittanceUnitType newStaticAdmittanceUnit) {
		if (newStaticAdmittanceUnit != staticAdmittanceUnit) {
			NotificationChain msgs = null;
			if (staticAdmittanceUnit != null)
				msgs = ((InternalEObject)staticAdmittanceUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT, null, msgs);
			if (newStaticAdmittanceUnit != null)
				msgs = ((InternalEObject)newStaticAdmittanceUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT, null, msgs);
			msgs = basicSetStaticAdmittanceUnit(newStaticAdmittanceUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT, newStaticAdmittanceUnit, newStaticAdmittanceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE:
				return basicSetStaticAdmittanceValue(null, msgs);
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT:
				return basicSetStaticAdmittanceUnit(null, msgs);
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
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE:
				return getStaticAdmittanceValue();
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT:
				return getStaticAdmittanceUnit();
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
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE:
				setStaticAdmittanceValue((AdmittanceValueType)newValue);
				return;
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT:
				setStaticAdmittanceUnit((AdmittanceUnitType)newValue);
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
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE:
				setStaticAdmittanceValue((AdmittanceValueType)null);
				return;
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT:
				setStaticAdmittanceUnit((AdmittanceUnitType)null);
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
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_VALUE:
				return staticAdmittanceValue != null;
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE__STATIC_ADMITTANCE_UNIT:
				return staticAdmittanceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //StaticAdmittanceTypeImpl
