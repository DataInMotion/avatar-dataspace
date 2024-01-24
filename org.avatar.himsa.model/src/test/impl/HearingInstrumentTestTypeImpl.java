/*
 */
package test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import test.BatteryCurrentMeasurement;
import test.EquivalentInputNoise;
import test.FrequencyMeasurement;
import test.HarmonicDistortionMeasurementCurve;
import test.HearingInstrumentTestType;
import test.InputOutputMeasurement;
import test.IntermodulationDistortionMeasurement;
import test.TargetMeasurement;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Instrument Test Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getSaturationResponse <em>Saturation Response</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getFullOnGain <em>Full On Gain</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getFrequencyResponse <em>Frequency Response</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getBatteryMeasurement <em>Battery Measurement</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getSecondThirdHarmonicDistortion <em>Second Third Harmonic Distortion</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getIntermodulationDistortionMeasurement <em>Intermodulation Distortion Measurement</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getEquivalentInputNoiseMeasurement <em>Equivalent Input Noise Measurement</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getAttackRecoverCurve <em>Attack Recover Curve</em>}</li>
 *   <li>{@link test.impl.HearingInstrumentTestTypeImpl#getInductionCoil <em>Induction Coil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HearingInstrumentTestTypeImpl extends MinimalEObjectImpl.Container implements HearingInstrumentTestType {
	/**
	 * The cached value of the '{@link #getSaturationResponse() <em>Saturation Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturationResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> saturationResponse;

	/**
	 * The cached value of the '{@link #getFullOnGain() <em>Full On Gain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullOnGain()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> fullOnGain;

	/**
	 * The cached value of the '{@link #getFrequencyResponse() <em>Frequency Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> frequencyResponse;

	/**
	 * The cached value of the '{@link #getBatteryMeasurement() <em>Battery Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<BatteryCurrentMeasurement> batteryMeasurement;

	/**
	 * The cached value of the '{@link #getSecondThirdHarmonicDistortion() <em>Second Third Harmonic Distortion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondThirdHarmonicDistortion()
	 * @generated
	 * @ordered
	 */
	protected EList<HarmonicDistortionMeasurementCurve> secondThirdHarmonicDistortion;

	/**
	 * The cached value of the '{@link #getIntermodulationDistortionMeasurement() <em>Intermodulation Distortion Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermodulationDistortionMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermodulationDistortionMeasurement> intermodulationDistortionMeasurement;

	/**
	 * The cached value of the '{@link #getEquivalentInputNoiseMeasurement() <em>Equivalent Input Noise Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentInputNoiseMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentInputNoise> equivalentInputNoiseMeasurement;

	/**
	 * The cached value of the '{@link #getInputOutput() <em>Input Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOutputMeasurement> inputOutput;

	/**
	 * The cached value of the '{@link #getAttackRecoverCurve() <em>Attack Recover Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackRecoverCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetMeasurement> attackRecoverCurve;

	/**
	 * The cached value of the '{@link #getInductionCoil() <em>Induction Coil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductionCoil()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> inductionCoil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HearingInstrumentTestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.HEARING_INSTRUMENT_TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getSaturationResponse() {
		if (saturationResponse == null) {
			saturationResponse = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE);
		}
		return saturationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getFullOnGain() {
		if (fullOnGain == null) {
			fullOnGain = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN);
		}
		return fullOnGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getFrequencyResponse() {
		if (frequencyResponse == null) {
			frequencyResponse = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE);
		}
		return frequencyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BatteryCurrentMeasurement> getBatteryMeasurement() {
		if (batteryMeasurement == null) {
			batteryMeasurement = new EObjectContainmentEList<BatteryCurrentMeasurement>(BatteryCurrentMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT);
		}
		return batteryMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HarmonicDistortionMeasurementCurve> getSecondThirdHarmonicDistortion() {
		if (secondThirdHarmonicDistortion == null) {
			secondThirdHarmonicDistortion = new EObjectContainmentEList<HarmonicDistortionMeasurementCurve>(HarmonicDistortionMeasurementCurve.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION);
		}
		return secondThirdHarmonicDistortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermodulationDistortionMeasurement> getIntermodulationDistortionMeasurement() {
		if (intermodulationDistortionMeasurement == null) {
			intermodulationDistortionMeasurement = new EObjectContainmentEList<IntermodulationDistortionMeasurement>(IntermodulationDistortionMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT);
		}
		return intermodulationDistortionMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EquivalentInputNoise> getEquivalentInputNoiseMeasurement() {
		if (equivalentInputNoiseMeasurement == null) {
			equivalentInputNoiseMeasurement = new EObjectContainmentEList<EquivalentInputNoise>(EquivalentInputNoise.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT);
		}
		return equivalentInputNoiseMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputOutputMeasurement> getInputOutput() {
		if (inputOutput == null) {
			inputOutput = new EObjectContainmentEList<InputOutputMeasurement>(InputOutputMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT);
		}
		return inputOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetMeasurement> getAttackRecoverCurve() {
		if (attackRecoverCurve == null) {
			attackRecoverCurve = new EObjectContainmentEList<TargetMeasurement>(TargetMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE);
		}
		return attackRecoverCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getInductionCoil() {
		if (inductionCoil == null) {
			inductionCoil = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL);
		}
		return inductionCoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE:
				return ((InternalEList<?>)getSaturationResponse()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN:
				return ((InternalEList<?>)getFullOnGain()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE:
				return ((InternalEList<?>)getFrequencyResponse()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT:
				return ((InternalEList<?>)getBatteryMeasurement()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION:
				return ((InternalEList<?>)getSecondThirdHarmonicDistortion()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT:
				return ((InternalEList<?>)getIntermodulationDistortionMeasurement()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT:
				return ((InternalEList<?>)getEquivalentInputNoiseMeasurement()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT:
				return ((InternalEList<?>)getInputOutput()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE:
				return ((InternalEList<?>)getAttackRecoverCurve()).basicRemove(otherEnd, msgs);
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL:
				return ((InternalEList<?>)getInductionCoil()).basicRemove(otherEnd, msgs);
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
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE:
				return getSaturationResponse();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN:
				return getFullOnGain();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE:
				return getFrequencyResponse();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT:
				return getBatteryMeasurement();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION:
				return getSecondThirdHarmonicDistortion();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT:
				return getIntermodulationDistortionMeasurement();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT:
				return getEquivalentInputNoiseMeasurement();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT:
				return getInputOutput();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE:
				return getAttackRecoverCurve();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL:
				return getInductionCoil();
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
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE:
				getSaturationResponse().clear();
				getSaturationResponse().addAll((Collection<? extends FrequencyMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN:
				getFullOnGain().clear();
				getFullOnGain().addAll((Collection<? extends FrequencyMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE:
				getFrequencyResponse().clear();
				getFrequencyResponse().addAll((Collection<? extends FrequencyMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT:
				getBatteryMeasurement().clear();
				getBatteryMeasurement().addAll((Collection<? extends BatteryCurrentMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION:
				getSecondThirdHarmonicDistortion().clear();
				getSecondThirdHarmonicDistortion().addAll((Collection<? extends HarmonicDistortionMeasurementCurve>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT:
				getIntermodulationDistortionMeasurement().clear();
				getIntermodulationDistortionMeasurement().addAll((Collection<? extends IntermodulationDistortionMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT:
				getEquivalentInputNoiseMeasurement().clear();
				getEquivalentInputNoiseMeasurement().addAll((Collection<? extends EquivalentInputNoise>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT:
				getInputOutput().clear();
				getInputOutput().addAll((Collection<? extends InputOutputMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE:
				getAttackRecoverCurve().clear();
				getAttackRecoverCurve().addAll((Collection<? extends TargetMeasurement>)newValue);
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL:
				getInductionCoil().clear();
				getInductionCoil().addAll((Collection<? extends FrequencyMeasurement>)newValue);
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
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE:
				getSaturationResponse().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN:
				getFullOnGain().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE:
				getFrequencyResponse().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT:
				getBatteryMeasurement().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION:
				getSecondThirdHarmonicDistortion().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT:
				getIntermodulationDistortionMeasurement().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT:
				getEquivalentInputNoiseMeasurement().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT:
				getInputOutput().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE:
				getAttackRecoverCurve().clear();
				return;
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL:
				getInductionCoil().clear();
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
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SATURATION_RESPONSE:
				return saturationResponse != null && !saturationResponse.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FULL_ON_GAIN:
				return fullOnGain != null && !fullOnGain.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__FREQUENCY_RESPONSE:
				return frequencyResponse != null && !frequencyResponse.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__BATTERY_MEASUREMENT:
				return batteryMeasurement != null && !batteryMeasurement.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__SECOND_THIRD_HARMONIC_DISTORTION:
				return secondThirdHarmonicDistortion != null && !secondThirdHarmonicDistortion.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INTERMODULATION_DISTORTION_MEASUREMENT:
				return intermodulationDistortionMeasurement != null && !intermodulationDistortionMeasurement.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__EQUIVALENT_INPUT_NOISE_MEASUREMENT:
				return equivalentInputNoiseMeasurement != null && !equivalentInputNoiseMeasurement.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INPUT_OUTPUT:
				return inputOutput != null && !inputOutput.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__ATTACK_RECOVER_CURVE:
				return attackRecoverCurve != null && !attackRecoverCurve.isEmpty();
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE__INDUCTION_COIL:
				return inductionCoil != null && !inductionCoil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HearingInstrumentTestTypeImpl
