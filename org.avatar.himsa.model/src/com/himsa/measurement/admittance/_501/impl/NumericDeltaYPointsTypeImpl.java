/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.NumericDeltaYPointsType;
import com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType;
import com.himsa.measurement.admittance._501._501Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Delta YPoints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.NumericDeltaYPointsTypeImpl#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericDeltaYPointsTypeImpl extends MinimalEObjectImpl.Container implements NumericDeltaYPointsType {
	/**
	 * The cached value of the '{@link #getPt() <em>Pt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt()
	 * @generated
	 * @ordered
	 */
	protected EList<ReflexValuePointCalculatedType> pt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericDeltaYPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.NUMERIC_DELTA_YPOINTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReflexValuePointCalculatedType> getPt() {
		if (pt == null) {
			pt = new EObjectContainmentEList<ReflexValuePointCalculatedType>(ReflexValuePointCalculatedType.class, this, _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT);
		}
		return pt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT:
				return ((InternalEList<?>)getPt()).basicRemove(otherEnd, msgs);
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
			case _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT:
				return getPt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT:
				getPt().clear();
				getPt().addAll((Collection<? extends ReflexValuePointCalculatedType>)newValue);
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
			case _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT:
				getPt().clear();
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
			case _501Package.NUMERIC_DELTA_YPOINTS_TYPE__PT:
				return pt != null && !pt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NumericDeltaYPointsTypeImpl
