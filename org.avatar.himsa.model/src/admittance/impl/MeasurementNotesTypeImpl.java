/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.EarType;
import admittance.MeasurementNotesType;

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
 *   <li>{@link admittance.impl.MeasurementNotesTypeImpl#getTympanometerMakeModel <em>Tympanometer Make Model</em>}</li>
 *   <li>{@link admittance.impl.MeasurementNotesTypeImpl#getTympanometerSerialNumber <em>Tympanometer Serial Number</em>}</li>
 *   <li>{@link admittance.impl.MeasurementNotesTypeImpl#getTympanometerLastCalibration <em>Tympanometer Last Calibration</em>}</li>
 *   <li>{@link admittance.impl.MeasurementNotesTypeImpl#getIsDeaf <em>Is Deaf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementNotesTypeImpl extends MinimalEObjectImpl.Container implements MeasurementNotesType {
	/**
	 * The default value of the '{@link #getTympanometerMakeModel() <em>Tympanometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerMakeModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TYMPANOMETER_MAKE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTympanometerMakeModel() <em>Tympanometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerMakeModel()
	 * @generated
	 * @ordered
	 */
	protected String tympanometerMakeModel = TYMPANOMETER_MAKE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTympanometerSerialNumber() <em>Tympanometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TYMPANOMETER_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTympanometerSerialNumber() <em>Tympanometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String tympanometerSerialNumber = TYMPANOMETER_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTympanometerLastCalibration() <em>Tympanometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TYMPANOMETER_LAST_CALIBRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTympanometerLastCalibration() <em>Tympanometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanometerLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar tympanometerLastCalibration = TYMPANOMETER_LAST_CALIBRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDeaf() <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeaf()
	 * @generated
	 * @ordered
	 */
	protected static final EarType IS_DEAF_EDEFAULT = EarType.RIGHT;

	/**
	 * The cached value of the '{@link #getIsDeaf() <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeaf()
	 * @generated
	 * @ordered
	 */
	protected EarType isDeaf = IS_DEAF_EDEFAULT;

	/**
	 * This is true if the Is Deaf attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDeafESet;

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
		return AdmittancePackage.Literals.MEASUREMENT_NOTES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTympanometerMakeModel() {
		return tympanometerMakeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTympanometerMakeModel(String newTympanometerMakeModel) {
		String oldTympanometerMakeModel = tympanometerMakeModel;
		tympanometerMakeModel = newTympanometerMakeModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL, oldTympanometerMakeModel, tympanometerMakeModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTympanometerSerialNumber() {
		return tympanometerSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTympanometerSerialNumber(String newTympanometerSerialNumber) {
		String oldTympanometerSerialNumber = tympanometerSerialNumber;
		tympanometerSerialNumber = newTympanometerSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER, oldTympanometerSerialNumber, tympanometerSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTympanometerLastCalibration() {
		return tympanometerLastCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTympanometerLastCalibration(XMLGregorianCalendar newTympanometerLastCalibration) {
		XMLGregorianCalendar oldTympanometerLastCalibration = tympanometerLastCalibration;
		tympanometerLastCalibration = newTympanometerLastCalibration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION, oldTympanometerLastCalibration, tympanometerLastCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EarType getIsDeaf() {
		return isDeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDeaf(EarType newIsDeaf) {
		EarType oldIsDeaf = isDeaf;
		isDeaf = newIsDeaf == null ? IS_DEAF_EDEFAULT : newIsDeaf;
		boolean oldIsDeafESet = isDeafESet;
		isDeafESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF, oldIsDeaf, isDeaf, !oldIsDeafESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsDeaf() {
		EarType oldIsDeaf = isDeaf;
		boolean oldIsDeafESet = isDeafESet;
		isDeaf = IS_DEAF_EDEFAULT;
		isDeafESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF, oldIsDeaf, IS_DEAF_EDEFAULT, oldIsDeafESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsDeaf() {
		return isDeafESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL:
				return getTympanometerMakeModel();
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER:
				return getTympanometerSerialNumber();
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION:
				return getTympanometerLastCalibration();
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF:
				return getIsDeaf();
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
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL:
				setTympanometerMakeModel((String)newValue);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER:
				setTympanometerSerialNumber((String)newValue);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION:
				setTympanometerLastCalibration((XMLGregorianCalendar)newValue);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF:
				setIsDeaf((EarType)newValue);
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
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL:
				setTympanometerMakeModel(TYMPANOMETER_MAKE_MODEL_EDEFAULT);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER:
				setTympanometerSerialNumber(TYMPANOMETER_SERIAL_NUMBER_EDEFAULT);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION:
				setTympanometerLastCalibration(TYMPANOMETER_LAST_CALIBRATION_EDEFAULT);
				return;
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF:
				unsetIsDeaf();
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
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_MAKE_MODEL:
				return TYMPANOMETER_MAKE_MODEL_EDEFAULT == null ? tympanometerMakeModel != null : !TYMPANOMETER_MAKE_MODEL_EDEFAULT.equals(tympanometerMakeModel);
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_SERIAL_NUMBER:
				return TYMPANOMETER_SERIAL_NUMBER_EDEFAULT == null ? tympanometerSerialNumber != null : !TYMPANOMETER_SERIAL_NUMBER_EDEFAULT.equals(tympanometerSerialNumber);
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__TYMPANOMETER_LAST_CALIBRATION:
				return TYMPANOMETER_LAST_CALIBRATION_EDEFAULT == null ? tympanometerLastCalibration != null : !TYMPANOMETER_LAST_CALIBRATION_EDEFAULT.equals(tympanometerLastCalibration);
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE__IS_DEAF:
				return isSetIsDeaf();
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
		result.append(" (tympanometerMakeModel: ");
		result.append(tympanometerMakeModel);
		result.append(", tympanometerSerialNumber: ");
		result.append(tympanometerSerialNumber);
		result.append(", tympanometerLastCalibration: ");
		result.append(tympanometerLastCalibration);
		result.append(", isDeaf: ");
		if (isDeafESet) result.append(isDeaf); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MeasurementNotesTypeImpl
