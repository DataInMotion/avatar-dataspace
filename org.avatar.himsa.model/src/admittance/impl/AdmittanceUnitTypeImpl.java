/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitCalculatedType;
import admittance.AdmittanceUnitMeasuredType;
import admittance.AdmittanceUnitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.AdmittanceUnitTypeImpl#getAdmittanceUnitCalculated <em>Admittance Unit Calculated</em>}</li>
 *   <li>{@link admittance.impl.AdmittanceUnitTypeImpl#getAdmittanceUnitMeasured <em>Admittance Unit Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceUnitTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceUnitType {
	/**
	 * The cached value of the '{@link #getAdmittanceUnitCalculated() <em>Admittance Unit Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceUnitCalculated()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitCalculatedType admittanceUnitCalculated;

	/**
	 * The cached value of the '{@link #getAdmittanceUnitMeasured() <em>Admittance Unit Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceUnitMeasured()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceUnitMeasuredType admittanceUnitMeasured;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.ADMITTANCE_UNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitCalculatedType getAdmittanceUnitCalculated() {
		return admittanceUnitCalculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceUnitCalculated(AdmittanceUnitCalculatedType newAdmittanceUnitCalculated, NotificationChain msgs) {
		AdmittanceUnitCalculatedType oldAdmittanceUnitCalculated = admittanceUnitCalculated;
		admittanceUnitCalculated = newAdmittanceUnitCalculated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED, oldAdmittanceUnitCalculated, newAdmittanceUnitCalculated);
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
	public void setAdmittanceUnitCalculated(AdmittanceUnitCalculatedType newAdmittanceUnitCalculated) {
		if (newAdmittanceUnitCalculated != admittanceUnitCalculated) {
			NotificationChain msgs = null;
			if (admittanceUnitCalculated != null)
				msgs = ((InternalEObject)admittanceUnitCalculated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED, null, msgs);
			if (newAdmittanceUnitCalculated != null)
				msgs = ((InternalEObject)newAdmittanceUnitCalculated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED, null, msgs);
			msgs = basicSetAdmittanceUnitCalculated(newAdmittanceUnitCalculated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED, newAdmittanceUnitCalculated, newAdmittanceUnitCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceUnitMeasuredType getAdmittanceUnitMeasured() {
		return admittanceUnitMeasured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceUnitMeasured(AdmittanceUnitMeasuredType newAdmittanceUnitMeasured, NotificationChain msgs) {
		AdmittanceUnitMeasuredType oldAdmittanceUnitMeasured = admittanceUnitMeasured;
		admittanceUnitMeasured = newAdmittanceUnitMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED, oldAdmittanceUnitMeasured, newAdmittanceUnitMeasured);
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
	public void setAdmittanceUnitMeasured(AdmittanceUnitMeasuredType newAdmittanceUnitMeasured) {
		if (newAdmittanceUnitMeasured != admittanceUnitMeasured) {
			NotificationChain msgs = null;
			if (admittanceUnitMeasured != null)
				msgs = ((InternalEObject)admittanceUnitMeasured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED, null, msgs);
			if (newAdmittanceUnitMeasured != null)
				msgs = ((InternalEObject)newAdmittanceUnitMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED, null, msgs);
			msgs = basicSetAdmittanceUnitMeasured(newAdmittanceUnitMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED, newAdmittanceUnitMeasured, newAdmittanceUnitMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED:
				return basicSetAdmittanceUnitCalculated(null, msgs);
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED:
				return basicSetAdmittanceUnitMeasured(null, msgs);
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
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED:
				return getAdmittanceUnitCalculated();
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED:
				return getAdmittanceUnitMeasured();
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
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED:
				setAdmittanceUnitCalculated((AdmittanceUnitCalculatedType)newValue);
				return;
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED:
				setAdmittanceUnitMeasured((AdmittanceUnitMeasuredType)newValue);
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
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED:
				setAdmittanceUnitCalculated((AdmittanceUnitCalculatedType)null);
				return;
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED:
				setAdmittanceUnitMeasured((AdmittanceUnitMeasuredType)null);
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
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_CALCULATED:
				return admittanceUnitCalculated != null;
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE__ADMITTANCE_UNIT_MEASURED:
				return admittanceUnitMeasured != null;
		}
		return super.eIsSet(featureID);
	}

} //AdmittanceUnitTypeImpl
