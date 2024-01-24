/*
 */
package realear.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import realear.FrequencyMeasurement;
import realear.FullTargetCurve;
import realear.HarmonicDistortionMeasurementCurve;
import realear.InputOutputMeasurement;
import realear.OcclusionEffects;
import realear.RealEarCouplerDifference;
import realear.RealEarDataType;
import realear.RealearPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Ear Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getRealEarUnaidedResponse <em>Real Ear Unaided Response</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getRealEarOccludedResponse <em>Real Ear Occluded Response</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getRealEarInsertionResponse <em>Real Ear Insertion Response</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getRealEarAidedResponse <em>Real Ear Aided Response</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getInputOutputMeasurement <em>Input Output Measurement</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getTotalHarmonicDistortionMeasurement <em>Total Harmonic Distortion Measurement</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getOcclusionMeasurement <em>Occlusion Measurement</em>}</li>
 *   <li>{@link realear.impl.RealEarDataTypeImpl#getRealEarCoupler <em>Real Ear Coupler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealEarDataTypeImpl extends MinimalEObjectImpl.Container implements RealEarDataType {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<FullTargetCurve> targets;

	/**
	 * The cached value of the '{@link #getRealEarUnaidedResponse() <em>Real Ear Unaided Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEarUnaidedResponse()
	 * @generated
	 * @ordered
	 */
	protected FrequencyMeasurement realEarUnaidedResponse;

	/**
	 * The cached value of the '{@link #getRealEarOccludedResponse() <em>Real Ear Occluded Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEarOccludedResponse()
	 * @generated
	 * @ordered
	 */
	protected FrequencyMeasurement realEarOccludedResponse;

	/**
	 * The cached value of the '{@link #getRealEarInsertionResponse() <em>Real Ear Insertion Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEarInsertionResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> realEarInsertionResponse;

	/**
	 * The cached value of the '{@link #getRealEarAidedResponse() <em>Real Ear Aided Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEarAidedResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurement> realEarAidedResponse;

	/**
	 * The cached value of the '{@link #getInputOutputMeasurement() <em>Input Output Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutputMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOutputMeasurement> inputOutputMeasurement;

	/**
	 * The cached value of the '{@link #getTotalHarmonicDistortionMeasurement() <em>Total Harmonic Distortion Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHarmonicDistortionMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<HarmonicDistortionMeasurementCurve> totalHarmonicDistortionMeasurement;

	/**
	 * The cached value of the '{@link #getOcclusionMeasurement() <em>Occlusion Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcclusionMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<OcclusionEffects> occlusionMeasurement;

	/**
	 * The cached value of the '{@link #getRealEarCoupler() <em>Real Ear Coupler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEarCoupler()
	 * @generated
	 * @ordered
	 */
	protected RealEarCouplerDifference realEarCoupler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealEarDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealearPackage.Literals.REAL_EAR_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FullTargetCurve> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<FullTargetCurve>(FullTargetCurve.class, this, RealearPackage.REAL_EAR_DATA_TYPE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyMeasurement getRealEarUnaidedResponse() {
		return realEarUnaidedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealEarUnaidedResponse(FrequencyMeasurement newRealEarUnaidedResponse, NotificationChain msgs) {
		FrequencyMeasurement oldRealEarUnaidedResponse = realEarUnaidedResponse;
		realEarUnaidedResponse = newRealEarUnaidedResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE, oldRealEarUnaidedResponse, newRealEarUnaidedResponse);
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
	public void setRealEarUnaidedResponse(FrequencyMeasurement newRealEarUnaidedResponse) {
		if (newRealEarUnaidedResponse != realEarUnaidedResponse) {
			NotificationChain msgs = null;
			if (realEarUnaidedResponse != null)
				msgs = ((InternalEObject)realEarUnaidedResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE, null, msgs);
			if (newRealEarUnaidedResponse != null)
				msgs = ((InternalEObject)newRealEarUnaidedResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE, null, msgs);
			msgs = basicSetRealEarUnaidedResponse(newRealEarUnaidedResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE, newRealEarUnaidedResponse, newRealEarUnaidedResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyMeasurement getRealEarOccludedResponse() {
		return realEarOccludedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealEarOccludedResponse(FrequencyMeasurement newRealEarOccludedResponse, NotificationChain msgs) {
		FrequencyMeasurement oldRealEarOccludedResponse = realEarOccludedResponse;
		realEarOccludedResponse = newRealEarOccludedResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE, oldRealEarOccludedResponse, newRealEarOccludedResponse);
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
	public void setRealEarOccludedResponse(FrequencyMeasurement newRealEarOccludedResponse) {
		if (newRealEarOccludedResponse != realEarOccludedResponse) {
			NotificationChain msgs = null;
			if (realEarOccludedResponse != null)
				msgs = ((InternalEObject)realEarOccludedResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE, null, msgs);
			if (newRealEarOccludedResponse != null)
				msgs = ((InternalEObject)newRealEarOccludedResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE, null, msgs);
			msgs = basicSetRealEarOccludedResponse(newRealEarOccludedResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE, newRealEarOccludedResponse, newRealEarOccludedResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getRealEarInsertionResponse() {
		if (realEarInsertionResponse == null) {
			realEarInsertionResponse = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE);
		}
		return realEarInsertionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurement> getRealEarAidedResponse() {
		if (realEarAidedResponse == null) {
			realEarAidedResponse = new EObjectContainmentEList<FrequencyMeasurement>(FrequencyMeasurement.class, this, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE);
		}
		return realEarAidedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputOutputMeasurement> getInputOutputMeasurement() {
		if (inputOutputMeasurement == null) {
			inputOutputMeasurement = new EObjectContainmentEList<InputOutputMeasurement>(InputOutputMeasurement.class, this, RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT);
		}
		return inputOutputMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HarmonicDistortionMeasurementCurve> getTotalHarmonicDistortionMeasurement() {
		if (totalHarmonicDistortionMeasurement == null) {
			totalHarmonicDistortionMeasurement = new EObjectContainmentEList<HarmonicDistortionMeasurementCurve>(HarmonicDistortionMeasurementCurve.class, this, RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT);
		}
		return totalHarmonicDistortionMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OcclusionEffects> getOcclusionMeasurement() {
		if (occlusionMeasurement == null) {
			occlusionMeasurement = new EObjectContainmentEList<OcclusionEffects>(OcclusionEffects.class, this, RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT);
		}
		return occlusionMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealEarCouplerDifference getRealEarCoupler() {
		return realEarCoupler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealEarCoupler(RealEarCouplerDifference newRealEarCoupler, NotificationChain msgs) {
		RealEarCouplerDifference oldRealEarCoupler = realEarCoupler;
		realEarCoupler = newRealEarCoupler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER, oldRealEarCoupler, newRealEarCoupler);
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
	public void setRealEarCoupler(RealEarCouplerDifference newRealEarCoupler) {
		if (newRealEarCoupler != realEarCoupler) {
			NotificationChain msgs = null;
			if (realEarCoupler != null)
				msgs = ((InternalEObject)realEarCoupler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER, null, msgs);
			if (newRealEarCoupler != null)
				msgs = ((InternalEObject)newRealEarCoupler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER, null, msgs);
			msgs = basicSetRealEarCoupler(newRealEarCoupler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER, newRealEarCoupler, newRealEarCoupler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealearPackage.REAL_EAR_DATA_TYPE__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE:
				return basicSetRealEarUnaidedResponse(null, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE:
				return basicSetRealEarOccludedResponse(null, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE:
				return ((InternalEList<?>)getRealEarInsertionResponse()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE:
				return ((InternalEList<?>)getRealEarAidedResponse()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT:
				return ((InternalEList<?>)getInputOutputMeasurement()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT:
				return ((InternalEList<?>)getTotalHarmonicDistortionMeasurement()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT:
				return ((InternalEList<?>)getOcclusionMeasurement()).basicRemove(otherEnd, msgs);
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER:
				return basicSetRealEarCoupler(null, msgs);
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
			case RealearPackage.REAL_EAR_DATA_TYPE__TARGETS:
				return getTargets();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE:
				return getRealEarUnaidedResponse();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE:
				return getRealEarOccludedResponse();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE:
				return getRealEarInsertionResponse();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE:
				return getRealEarAidedResponse();
			case RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT:
				return getInputOutputMeasurement();
			case RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT:
				return getTotalHarmonicDistortionMeasurement();
			case RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT:
				return getOcclusionMeasurement();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER:
				return getRealEarCoupler();
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
			case RealearPackage.REAL_EAR_DATA_TYPE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends FullTargetCurve>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE:
				setRealEarUnaidedResponse((FrequencyMeasurement)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE:
				setRealEarOccludedResponse((FrequencyMeasurement)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE:
				getRealEarInsertionResponse().clear();
				getRealEarInsertionResponse().addAll((Collection<? extends FrequencyMeasurement>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE:
				getRealEarAidedResponse().clear();
				getRealEarAidedResponse().addAll((Collection<? extends FrequencyMeasurement>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT:
				getInputOutputMeasurement().clear();
				getInputOutputMeasurement().addAll((Collection<? extends InputOutputMeasurement>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT:
				getTotalHarmonicDistortionMeasurement().clear();
				getTotalHarmonicDistortionMeasurement().addAll((Collection<? extends HarmonicDistortionMeasurementCurve>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT:
				getOcclusionMeasurement().clear();
				getOcclusionMeasurement().addAll((Collection<? extends OcclusionEffects>)newValue);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER:
				setRealEarCoupler((RealEarCouplerDifference)newValue);
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
			case RealearPackage.REAL_EAR_DATA_TYPE__TARGETS:
				getTargets().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE:
				setRealEarUnaidedResponse((FrequencyMeasurement)null);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE:
				setRealEarOccludedResponse((FrequencyMeasurement)null);
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE:
				getRealEarInsertionResponse().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE:
				getRealEarAidedResponse().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT:
				getInputOutputMeasurement().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT:
				getTotalHarmonicDistortionMeasurement().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT:
				getOcclusionMeasurement().clear();
				return;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER:
				setRealEarCoupler((RealEarCouplerDifference)null);
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
			case RealearPackage.REAL_EAR_DATA_TYPE__TARGETS:
				return targets != null && !targets.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_UNAIDED_RESPONSE:
				return realEarUnaidedResponse != null;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_OCCLUDED_RESPONSE:
				return realEarOccludedResponse != null;
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_INSERTION_RESPONSE:
				return realEarInsertionResponse != null && !realEarInsertionResponse.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_AIDED_RESPONSE:
				return realEarAidedResponse != null && !realEarAidedResponse.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__INPUT_OUTPUT_MEASUREMENT:
				return inputOutputMeasurement != null && !inputOutputMeasurement.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__TOTAL_HARMONIC_DISTORTION_MEASUREMENT:
				return totalHarmonicDistortionMeasurement != null && !totalHarmonicDistortionMeasurement.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__OCCLUSION_MEASUREMENT:
				return occlusionMeasurement != null && !occlusionMeasurement.isEmpty();
			case RealearPackage.REAL_EAR_DATA_TYPE__REAL_EAR_COUPLER:
				return realEarCoupler != null;
		}
		return super.eIsSet(featureID);
	}

} //RealEarDataTypeImpl
