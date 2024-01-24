/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.MeasurementEquipmentType;
import com.himsa.measurement.tinnitus._500._500Package;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Equipment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl#getAudiometerMakeModel <em>Audiometer Make Model</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementEquipmentTypeImpl#getAudiometerLastCalibrationDate <em>Audiometer Last Calibration Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementEquipmentTypeImpl extends MinimalEObjectImpl.Container implements MeasurementEquipmentType {
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
	 * The default value of the '{@link #getAudiometerLastCalibrationDate() <em>Audiometer Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AUDIOMETER_LAST_CALIBRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudiometerLastCalibrationDate() <em>Audiometer Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiometerLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar audiometerLastCalibrationDate = AUDIOMETER_LAST_CALIBRATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementEquipmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.MEASUREMENT_EQUIPMENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL, oldAudiometerMakeModel, audiometerMakeModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER, oldAudiometerSerialNumber, audiometerSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAudiometerLastCalibrationDate() {
		return audiometerLastCalibrationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudiometerLastCalibrationDate(XMLGregorianCalendar newAudiometerLastCalibrationDate) {
		XMLGregorianCalendar oldAudiometerLastCalibrationDate = audiometerLastCalibrationDate;
		audiometerLastCalibrationDate = newAudiometerLastCalibrationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE, oldAudiometerLastCalibrationDate, audiometerLastCalibrationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL:
				return getAudiometerMakeModel();
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER:
				return getAudiometerSerialNumber();
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE:
				return getAudiometerLastCalibrationDate();
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
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL:
				setAudiometerMakeModel((String)newValue);
				return;
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER:
				setAudiometerSerialNumber((String)newValue);
				return;
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE:
				setAudiometerLastCalibrationDate((XMLGregorianCalendar)newValue);
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
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL:
				setAudiometerMakeModel(AUDIOMETER_MAKE_MODEL_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER:
				setAudiometerSerialNumber(AUDIOMETER_SERIAL_NUMBER_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE:
				setAudiometerLastCalibrationDate(AUDIOMETER_LAST_CALIBRATION_DATE_EDEFAULT);
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
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_MAKE_MODEL:
				return AUDIOMETER_MAKE_MODEL_EDEFAULT == null ? audiometerMakeModel != null : !AUDIOMETER_MAKE_MODEL_EDEFAULT.equals(audiometerMakeModel);
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_SERIAL_NUMBER:
				return AUDIOMETER_SERIAL_NUMBER_EDEFAULT == null ? audiometerSerialNumber != null : !AUDIOMETER_SERIAL_NUMBER_EDEFAULT.equals(audiometerSerialNumber);
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE__AUDIOMETER_LAST_CALIBRATION_DATE:
				return AUDIOMETER_LAST_CALIBRATION_DATE_EDEFAULT == null ? audiometerLastCalibrationDate != null : !AUDIOMETER_LAST_CALIBRATION_DATE_EDEFAULT.equals(audiometerLastCalibrationDate);
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
		result.append(", audiometerLastCalibrationDate: ");
		result.append(audiometerLastCalibrationDate);
		result.append(')');
		return result.toString();
	}

} //MeasurementEquipmentTypeImpl
