/*
 */
package com.himsa.measurement.audiogram.impl;

import com.himsa.measurement.audiogram.AudiogramPackage;
import com.himsa.measurement.audiogram.MeasurementNotesType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl#getAudiometerMakeModel <em>Audiometer Make Model</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl#getTestMethod <em>Test Method</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.MeasurementNotesTypeImpl#getTestReliability <em>Test Reliability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementNotesTypeImpl extends MinimalEObjectImpl.Container implements MeasurementNotesType {
	/**
	 * The default value of the '{@link #getAudiometerMakeModel() <em>Audiometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerMakeModel()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIOMETER_MAKE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudiometerMakeModel() <em>Audiometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerMakeModel()
	 * @generated
	 * @ordered
	 */
	protected String audiometerMakeModel = AUDIOMETER_MAKE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudiometerSerialNumber() <em>Audiometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIOMETER_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudiometerSerialNumber() <em>Audiometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String audiometerSerialNumber = AUDIOMETER_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudiometerLastCalibration() <em>Audiometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AUDIOMETER_LAST_CALIBRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudiometerLastCalibration() <em>Audiometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar audiometerLastCalibration = AUDIOMETER_LAST_CALIBRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestMethod() <em>Test Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestMethod() <em>Test Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMethod()
	 * @generated
	 * @ordered
	 */
	protected String testMethod = TEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestReliability() <em>Test Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReliability()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_RELIABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestReliability() <em>Test Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReliability()
	 * @generated
	 * @ordered
	 */
	protected String testReliability = TEST_RELIABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementNotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.MEASUREMENT_NOTES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAudiometerMakeModel() {
		return audiometerMakeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudiometerMakeModel(String newAudiometerMakeModel) {
		String oldAudiometerMakeModel = audiometerMakeModel;
		audiometerMakeModel = newAudiometerMakeModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL, oldAudiometerMakeModel, audiometerMakeModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAudiometerSerialNumber() {
		return audiometerSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudiometerSerialNumber(String newAudiometerSerialNumber) {
		String oldAudiometerSerialNumber = audiometerSerialNumber;
		audiometerSerialNumber = newAudiometerSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER, oldAudiometerSerialNumber, audiometerSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAudiometerLastCalibration() {
		return audiometerLastCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudiometerLastCalibration(XMLGregorianCalendar newAudiometerLastCalibration) {
		XMLGregorianCalendar oldAudiometerLastCalibration = audiometerLastCalibration;
		audiometerLastCalibration = newAudiometerLastCalibration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION, oldAudiometerLastCalibration, audiometerLastCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestMethod() {
		return testMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMethod(String newTestMethod) {
		String oldTestMethod = testMethod;
		testMethod = newTestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_METHOD, oldTestMethod, testMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestReliability() {
		return testReliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestReliability(String newTestReliability) {
		String oldTestReliability = testReliability;
		testReliability = newTestReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY, oldTestReliability, testReliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL:
				return getAudiometerMakeModel();
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER:
				return getAudiometerSerialNumber();
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION:
				return getAudiometerLastCalibration();
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_METHOD:
				return getTestMethod();
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY:
				return getTestReliability();
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
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL:
				setAudiometerMakeModel((String)newValue);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER:
				setAudiometerSerialNumber((String)newValue);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION:
				setAudiometerLastCalibration((XMLGregorianCalendar)newValue);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_METHOD:
				setTestMethod((String)newValue);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY:
				setTestReliability((String)newValue);
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
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL:
				setAudiometerMakeModel(AUDIOMETER_MAKE_MODEL_EDEFAULT);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER:
				setAudiometerSerialNumber(AUDIOMETER_SERIAL_NUMBER_EDEFAULT);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION:
				setAudiometerLastCalibration(AUDIOMETER_LAST_CALIBRATION_EDEFAULT);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_METHOD:
				setTestMethod(TEST_METHOD_EDEFAULT);
				return;
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY:
				setTestReliability(TEST_RELIABILITY_EDEFAULT);
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
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_MAKE_MODEL:
				return AUDIOMETER_MAKE_MODEL_EDEFAULT == null ? audiometerMakeModel != null : !AUDIOMETER_MAKE_MODEL_EDEFAULT.equals(audiometerMakeModel);
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_SERIAL_NUMBER:
				return AUDIOMETER_SERIAL_NUMBER_EDEFAULT == null ? audiometerSerialNumber != null : !AUDIOMETER_SERIAL_NUMBER_EDEFAULT.equals(audiometerSerialNumber);
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__AUDIOMETER_LAST_CALIBRATION:
				return AUDIOMETER_LAST_CALIBRATION_EDEFAULT == null ? audiometerLastCalibration != null : !AUDIOMETER_LAST_CALIBRATION_EDEFAULT.equals(audiometerLastCalibration);
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_METHOD:
				return TEST_METHOD_EDEFAULT == null ? testMethod != null : !TEST_METHOD_EDEFAULT.equals(testMethod);
			case AudiogramPackage.MEASUREMENT_NOTES_TYPE__TEST_RELIABILITY:
				return TEST_RELIABILITY_EDEFAULT == null ? testReliability != null : !TEST_RELIABILITY_EDEFAULT.equals(testReliability);
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
		result.append(" (audiometerMakeModel: ");
		result.append(audiometerMakeModel);
		result.append(", audiometerSerialNumber: ");
		result.append(audiometerSerialNumber);
		result.append(", audiometerLastCalibration: ");
		result.append(audiometerLastCalibration);
		result.append(", testMethod: ");
		result.append(testMethod);
		result.append(", testReliability: ");
		result.append(testReliability);
		result.append(')');
		return result.toString();
	}

} //MeasurementNotesTypeImpl
