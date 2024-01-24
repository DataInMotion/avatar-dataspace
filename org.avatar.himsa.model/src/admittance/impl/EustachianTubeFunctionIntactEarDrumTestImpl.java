/*
 */
package admittance.impl;

import admittance.AdmittanceCurveType;
import admittance.AdmittancePackage;
import admittance.AdmittanceType;
import admittance.EustachianTubeFunctionIntactEarDrumTest;
import admittance.TympanogramMeasurementConditionsType;

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
 *   <li>{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getAdmittanceCurve <em>Admittance Curve</em>}</li>
 *   <li>{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link admittance.impl.EustachianTubeFunctionIntactEarDrumTestImpl#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EustachianTubeFunctionIntactEarDrumTestImpl extends MinimalEObjectImpl.Container implements EustachianTubeFunctionIntactEarDrumTest {
	/**
	 * The cached value of the '{@link #getAdmittanceCurve() <em>Admittance Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<AdmittanceCurveType> admittanceCurve;

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
	protected AdmittanceType canalVolume;

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
		return AdmittancePackage.Literals.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdmittanceCurveType> getAdmittanceCurve() {
		if (admittanceCurve == null) {
			admittanceCurve = new EObjectContainmentEList<AdmittanceCurveType>(AdmittanceCurveType.class, this, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE);
		}
		return admittanceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getPressure() {
		if (pressure == null) {
			pressure = new EDataTypeEList<BigInteger>(BigInteger.class, this, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE);
		}
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceType getCanalVolume() {
		return canalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanalVolume(AdmittanceType newCanalVolume, NotificationChain msgs) {
		AdmittanceType oldCanalVolume = canalVolume;
		canalVolume = newCanalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, oldCanalVolume, newCanalVolume);
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
	public void setCanalVolume(AdmittanceType newCanalVolume) {
		if (newCanalVolume != canalVolume) {
			NotificationChain msgs = null;
			if (canalVolume != null)
				msgs = ((InternalEObject)canalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, null, msgs);
			if (newCanalVolume != null)
				msgs = ((InternalEObject)newCanalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, null, msgs);
			msgs = basicSetCanalVolume(newCanalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME, newCanalVolume, newCanalVolume));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, oldMeasurementCondition, newMeasurementCondition);
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
				msgs = ((InternalEObject)measurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, null, msgs);
			if (newMeasurementCondition != null)
				msgs = ((InternalEObject)newMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetMeasurementCondition(newMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION, newMeasurementCondition, newMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE:
				return ((InternalEList<?>)getAdmittanceCurve()).basicRemove(otherEnd, msgs);
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return basicSetCanalVolume(null, msgs);
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
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
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE:
				return getAdmittanceCurve();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				return getPressure();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return getCanalVolume();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
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
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE:
				getAdmittanceCurve().clear();
				getAdmittanceCurve().addAll((Collection<? extends AdmittanceCurveType>)newValue);
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				getPressure().clear();
				getPressure().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				setCanalVolume((AdmittanceType)newValue);
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
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
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE:
				getAdmittanceCurve().clear();
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				getPressure().clear();
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				setCanalVolume((AdmittanceType)null);
				return;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
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
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__ADMITTANCE_CURVE:
				return admittanceCurve != null && !admittanceCurve.isEmpty();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__PRESSURE:
				return pressure != null && !pressure.isEmpty();
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__CANAL_VOLUME:
				return canalVolume != null;
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST__MEASUREMENT_CONDITION:
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
