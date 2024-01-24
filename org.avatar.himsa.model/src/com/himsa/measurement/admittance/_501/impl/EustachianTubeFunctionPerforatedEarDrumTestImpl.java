/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.EustachianTubeFunctionPerforatedEarDrumTest;
import com.himsa.measurement.admittance._501.PressurePointType;
import com.himsa.measurement.admittance._501._501Package;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl#getPressurePoint <em>Pressure Point</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl#getOpenPoint <em>Open Point</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl#getClosePoint <em>Close Point</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.EustachianTubeFunctionPerforatedEarDrumTestImpl#getTimeBase <em>Time Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EustachianTubeFunctionPerforatedEarDrumTestImpl extends MinimalEObjectImpl.Container implements EustachianTubeFunctionPerforatedEarDrumTest {
	/**
	 * The cached value of the '{@link #getPressurePoint() <em>Pressure Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressurePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<PressurePointType> pressurePoint;

	/**
	 * The cached value of the '{@link #getOpenPoint() <em>Open Point</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> openPoint;

	/**
	 * The cached value of the '{@link #getClosePoint() <em>Close Point</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> closePoint;

	/**
	 * The default value of the '{@link #getTimeBase() <em>Time Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBase()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TIME_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBase() <em>Time Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBase()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal timeBase = TIME_BASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EustachianTubeFunctionPerforatedEarDrumTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _501Package.Literals.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PressurePointType> getPressurePoint() {
		if (pressurePoint == null) {
			pressurePoint = new EObjectContainmentEList<PressurePointType>(PressurePointType.class, this, _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT);
		}
		return pressurePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getOpenPoint() {
		if (openPoint == null) {
			openPoint = new EDataTypeEList<BigInteger>(BigInteger.class, this, _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT);
		}
		return openPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getClosePoint() {
		if (closePoint == null) {
			closePoint = new EDataTypeEList<BigInteger>(BigInteger.class, this, _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT);
		}
		return closePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTimeBase() {
		return timeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBase(BigDecimal newTimeBase) {
		BigDecimal oldTimeBase = timeBase;
		timeBase = newTimeBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE, oldTimeBase, timeBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT:
				return ((InternalEList<?>)getPressurePoint()).basicRemove(otherEnd, msgs);
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
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT:
				return getPressurePoint();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT:
				return getOpenPoint();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT:
				return getClosePoint();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE:
				return getTimeBase();
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
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT:
				getPressurePoint().clear();
				getPressurePoint().addAll((Collection<? extends PressurePointType>)newValue);
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT:
				getOpenPoint().clear();
				getOpenPoint().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT:
				getClosePoint().clear();
				getClosePoint().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE:
				setTimeBase((BigDecimal)newValue);
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
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT:
				getPressurePoint().clear();
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT:
				getOpenPoint().clear();
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT:
				getClosePoint().clear();
				return;
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE:
				setTimeBase(TIME_BASE_EDEFAULT);
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
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__PRESSURE_POINT:
				return pressurePoint != null && !pressurePoint.isEmpty();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__OPEN_POINT:
				return openPoint != null && !openPoint.isEmpty();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__CLOSE_POINT:
				return closePoint != null && !closePoint.isEmpty();
			case _501Package.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST__TIME_BASE:
				return TIME_BASE_EDEFAULT == null ? timeBase != null : !TIME_BASE_EDEFAULT.equals(timeBase);
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
		result.append(" (openPoint: ");
		result.append(openPoint);
		result.append(", closePoint: ");
		result.append(closePoint);
		result.append(", timeBase: ");
		result.append(timeBase);
		result.append(')');
		return result.toString();
	}

} //EustachianTubeFunctionPerforatedEarDrumTestImpl
