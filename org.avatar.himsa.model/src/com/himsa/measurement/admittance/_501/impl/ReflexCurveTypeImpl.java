/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.DeltaYType;
import com.himsa.measurement.admittance._501.NumericDeltaType;
import com.himsa.measurement.admittance._501.ReflexCurveType;
import com.himsa.measurement.admittance._501._501Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexCurveTypeImpl#getNumericDelta <em>Numeric Delta</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.ReflexCurveTypeImpl#getDeltaY <em>Delta Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexCurveTypeImpl extends MinimalEObjectImpl.Container implements ReflexCurveType {
	/**
	 * The cached value of the '{@link #getNumericDelta() <em>Numeric Delta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericDelta()
	 * @generated
	 * @ordered
	 */
	protected NumericDeltaType numericDelta;

	/**
	 * The cached value of the '{@link #getDeltaY() <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaY()
	 * @generated
	 * @ordered
	 */
	protected DeltaYType deltaY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.REFLEX_CURVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericDeltaType getNumericDelta() {
		return numericDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumericDelta(NumericDeltaType newNumericDelta, NotificationChain msgs) {
		NumericDeltaType oldNumericDelta = numericDelta;
		numericDelta = newNumericDelta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA, oldNumericDelta, newNumericDelta);
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
	public void setNumericDelta(NumericDeltaType newNumericDelta) {
		if (newNumericDelta != numericDelta) {
			NotificationChain msgs = null;
			if (numericDelta != null)
				msgs = ((InternalEObject)numericDelta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA, null, msgs);
			if (newNumericDelta != null)
				msgs = ((InternalEObject)newNumericDelta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA, null, msgs);
			msgs = basicSetNumericDelta(newNumericDelta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA, newNumericDelta, newNumericDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaYType getDeltaY() {
		return deltaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaY(DeltaYType newDeltaY, NotificationChain msgs) {
		DeltaYType oldDeltaY = deltaY;
		deltaY = newDeltaY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_CURVE_TYPE__DELTA_Y, oldDeltaY, newDeltaY);
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
	public void setDeltaY(DeltaYType newDeltaY) {
		if (newDeltaY != deltaY) {
			NotificationChain msgs = null;
			if (deltaY != null)
				msgs = ((InternalEObject)deltaY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.REFLEX_CURVE_TYPE__DELTA_Y, null, msgs);
			if (newDeltaY != null)
				msgs = ((InternalEObject)newDeltaY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.REFLEX_CURVE_TYPE__DELTA_Y, null, msgs);
			msgs = basicSetDeltaY(newDeltaY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.REFLEX_CURVE_TYPE__DELTA_Y, newDeltaY, newDeltaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA:
				return basicSetNumericDelta(null, msgs);
			case _501Package.REFLEX_CURVE_TYPE__DELTA_Y:
				return basicSetDeltaY(null, msgs);
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
			case _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA:
				return getNumericDelta();
			case _501Package.REFLEX_CURVE_TYPE__DELTA_Y:
				return getDeltaY();
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
			case _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA:
				setNumericDelta((NumericDeltaType)newValue);
				return;
			case _501Package.REFLEX_CURVE_TYPE__DELTA_Y:
				setDeltaY((DeltaYType)newValue);
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
			case _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA:
				setNumericDelta((NumericDeltaType)null);
				return;
			case _501Package.REFLEX_CURVE_TYPE__DELTA_Y:
				setDeltaY((DeltaYType)null);
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
			case _501Package.REFLEX_CURVE_TYPE__NUMERIC_DELTA:
				return numericDelta != null;
			case _501Package.REFLEX_CURVE_TYPE__DELTA_Y:
				return deltaY != null;
		}
		return super.eIsSet(featureID);
	}

} //ReflexCurveTypeImpl
