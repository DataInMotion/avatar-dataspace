/*
 */
package admittance.impl;

import admittance.AdmittanceCurveType;
import admittance.AdmittancePackage;
import admittance.CalculatedType1;
import admittance.MeasuredType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.AdmittanceCurveTypeImpl#getCalculated <em>Calculated</em>}</li>
 *   <li>{@link admittance.impl.AdmittanceCurveTypeImpl#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceCurveTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceCurveType {
	/**
	 * The cached value of the '{@link #getCalculated() <em>Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculated()
	 * @generated
	 * @ordered
	 */
	protected CalculatedType1 calculated;

	/**
	 * The cached value of the '{@link #getMeasured() <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured()
	 * @generated
	 * @ordered
	 */
	protected MeasuredType1 measured;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.ADMITTANCE_CURVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatedType1 getCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculated(CalculatedType1 newCalculated, NotificationChain msgs) {
		CalculatedType1 oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED, oldCalculated, newCalculated);
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
	public void setCalculated(CalculatedType1 newCalculated) {
		if (newCalculated != calculated) {
			NotificationChain msgs = null;
			if (calculated != null)
				msgs = ((InternalEObject)calculated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED, null, msgs);
			if (newCalculated != null)
				msgs = ((InternalEObject)newCalculated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED, null, msgs);
			msgs = basicSetCalculated(newCalculated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED, newCalculated, newCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasuredType1 getMeasured() {
		return measured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasured(MeasuredType1 newMeasured, NotificationChain msgs) {
		MeasuredType1 oldMeasured = measured;
		measured = newMeasured;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED, oldMeasured, newMeasured);
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
	public void setMeasured(MeasuredType1 newMeasured) {
		if (newMeasured != measured) {
			NotificationChain msgs = null;
			if (measured != null)
				msgs = ((InternalEObject)measured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED, null, msgs);
			if (newMeasured != null)
				msgs = ((InternalEObject)newMeasured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED, null, msgs);
			msgs = basicSetMeasured(newMeasured, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED, newMeasured, newMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED:
				return basicSetCalculated(null, msgs);
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED:
				return basicSetMeasured(null, msgs);
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
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED:
				return getCalculated();
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED:
				return getMeasured();
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
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED:
				setCalculated((CalculatedType1)newValue);
				return;
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED:
				setMeasured((MeasuredType1)newValue);
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
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED:
				setCalculated((CalculatedType1)null);
				return;
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED:
				setMeasured((MeasuredType1)null);
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
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__CALCULATED:
				return calculated != null;
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE__MEASURED:
				return measured != null;
		}
		return super.eIsSet(featureID);
	}

} //AdmittanceCurveTypeImpl
