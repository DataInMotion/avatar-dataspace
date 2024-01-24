/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.ComplianceCurveType;
import com.himsa.measurement.impedance.ComplianceType;
import com.himsa.measurement.impedance.EustachianTubeFunctionIntactEarDrumTest;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.TympanogramMeasurementConditionsType;

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
 * An implementation of the model object '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getComplianceCurve <em>Compliance Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EustachianTubeFunctionIntactEarDrumTestImpl extends MinimalEObjectImpl.Container implements EustachianTubeFunctionIntactEarDrumTest {
	/**
	 * The cached value of the '{@link #getComplianceCurve() <em>Compliance Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplianceCurveType> complianceCurve;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> pressure;

	/**
	 * The cached value of the '{@link #getCanalVolume() <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalVolume()
	 * @generated
	 * @ordered
	 */
	protected ComplianceType canalVolume;

	/**
	 * The cached value of the '{@link #getMeasurementCondition() <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementCondition()
	 * @generated
	 * @ordered
	 */
	protected TympanogramMeasurementConditionsType measurementCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EustachianTubeFunctionIntactEarDrumTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplianceCurveType> getComplianceCurve() {
		if (complianceCurve == null) {
			complianceCurve = new EObjectContainmentEList<ComplianceCurveType>(ComplianceCurveType.class, this, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE);
		}
		return complianceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getPressure() {
		if (pressure == null) {
			pressure = new EDataTypeEList<BigInteger>(BigInteger.class, this, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE);
		}
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceType getCanalVolume() {
		return canalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanalVolume(ComplianceType newCanalVolume, NotificationChain msgs) {
		ComplianceType oldCanalVolume = canalVolume;
		canalVolume = newCanalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, oldCanalVolume, newCanalVolume);
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
	public void setCanalVolume(ComplianceType newCanalVolume) {
		if (newCanalVolume != canalVolume) {
			NotificationChain msgs = null;
			if (canalVolume != null)
				msgs = ((InternalEObject)canalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, null, msgs);
			if (newCanalVolume != null)
				msgs = ((InternalEObject)newCanalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, null, msgs);
			msgs = basicSetCanalVolume(newCanalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, newCanalVolume, newCanalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TympanogramMeasurementConditionsType getMeasurementCondition() {
		return measurementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementCondition(TympanogramMeasurementConditionsType newMeasurementCondition, NotificationChain msgs) {
		TympanogramMeasurementConditionsType oldMeasurementCondition = measurementCondition;
		measurementCondition = newMeasurementCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, oldMeasurementCondition, newMeasurementCondition);
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
	public void setMeasurementCondition(TympanogramMeasurementConditionsType newMeasurementCondition) {
		if (newMeasurementCondition != measurementCondition) {
			NotificationChain msgs = null;
			if (measurementCondition != null)
				msgs = ((InternalEObject)measurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, null, msgs);
			if (newMeasurementCondition != null)
				msgs = ((InternalEObject)newMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetMeasurementCondition(newMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, newMeasurementCondition, newMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE:
				return ((InternalEList<?>)getComplianceCurve()).basicRemove(otherEnd, msgs);
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return basicSetCanalVolume(null, msgs);
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
				return basicSetMeasurementCondition(null, msgs);
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
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE:
				return getComplianceCurve();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				return getPressure();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return getCanalVolume();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
				return getMeasurementCondition();
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
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE:
				getComplianceCurve().clear();
				getComplianceCurve().addAll((Collection<? extends ComplianceCurveType>)newValue);
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				getPressure().clear();
				getPressure().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				setCanalVolume((ComplianceType)newValue);
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)newValue);
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
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE:
				getComplianceCurve().clear();
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				getPressure().clear();
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				setCanalVolume((ComplianceType)null);
				return;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)null);
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
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__COMPLIANCE_CURVE:
				return complianceCurve != null && !complianceCurve.isEmpty();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				return pressure != null && !pressure.isEmpty();
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return canalVolume != null;
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
				return measurementCondition != null;
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

} //EustachianTubeFunctionIntactEarDrumTestImpl
