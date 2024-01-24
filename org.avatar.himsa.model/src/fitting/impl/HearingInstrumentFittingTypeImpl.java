/*
 */
package fitting.impl;

import fitting.FittingPackage;
import fitting.HearingInstrumentFittingType;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Instrument Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#getDateOfAudiogram <em>Date Of Audiogram</em>}</li>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#getPrivateFittingData <em>Private Fitting Data</em>}</li>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link fitting.impl.HearingInstrumentFittingTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HearingInstrumentFittingTypeImpl extends MinimalEObjectImpl.Container implements HearingInstrumentFittingType {
	/**
	 * The default value of the '{@link #getDateOfAudiogram() <em>Date Of Audiogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfAudiogram()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_AUDIOGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfAudiogram() <em>Date Of Audiogram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfAudiogram()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfAudiogram = DATE_OF_AUDIOGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateFittingData() <em>Private Fitting Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateFittingData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PRIVATE_FITTING_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateFittingData() <em>Private Fitting Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateFittingData()
	 * @generated
	 * @ordered
	 */
	protected byte[] privateFittingData = PRIVATE_FITTING_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONVERTED_FROM_DATA_STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected BigInteger convertedFromDataStandard = CONVERTED_FROM_DATA_STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidatedByNOAH() <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedByNOAH()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_BY_NOAH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidatedByNOAH() <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedByNOAH()
	 * @generated
	 * @ordered
	 */
	protected boolean validatedByNOAH = VALIDATED_BY_NOAH_EDEFAULT;

	/**
	 * This is true if the Validated By NOAH attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validatedByNOAHESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("500");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HearingInstrumentFittingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FittingPackage.Literals.HEARING_INSTRUMENT_FITTING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDateOfAudiogram() {
		return dateOfAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateOfAudiogram(XMLGregorianCalendar newDateOfAudiogram) {
		XMLGregorianCalendar oldDateOfAudiogram = dateOfAudiogram;
		dateOfAudiogram = newDateOfAudiogram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM, oldDateOfAudiogram, dateOfAudiogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPrivateFittingData() {
		return privateFittingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateFittingData(byte[] newPrivateFittingData) {
		byte[] oldPrivateFittingData = privateFittingData;
		privateFittingData = newPrivateFittingData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA, oldPrivateFittingData, privateFittingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getConvertedFromDataStandard() {
		return convertedFromDataStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertedFromDataStandard(BigInteger newConvertedFromDataStandard) {
		BigInteger oldConvertedFromDataStandard = convertedFromDataStandard;
		convertedFromDataStandard = newConvertedFromDataStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidatedByNOAH() {
		return validatedByNOAH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidatedByNOAH(boolean newValidatedByNOAH) {
		boolean oldValidatedByNOAH = validatedByNOAH;
		validatedByNOAH = newValidatedByNOAH;
		boolean oldValidatedByNOAHESet = validatedByNOAHESet;
		validatedByNOAHESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValidatedByNOAH() {
		boolean oldValidatedByNOAH = validatedByNOAH;
		boolean oldValidatedByNOAHESet = validatedByNOAHESet;
		validatedByNOAH = VALIDATED_BY_NOAH_EDEFAULT;
		validatedByNOAHESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValidatedByNOAH() {
		return validatedByNOAHESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigInteger newVersion) {
		BigInteger oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		BigInteger oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM:
				return getDateOfAudiogram();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__RESERVED:
				return getReserved();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA:
				return getPrivateFittingData();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION:
				return getVersion();
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
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM:
				setDateOfAudiogram((XMLGregorianCalendar)newValue);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__RESERVED:
				setReserved((byte[])newValue);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA:
				setPrivateFittingData((byte[])newValue);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION:
				setVersion((BigInteger)newValue);
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
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM:
				setDateOfAudiogram(DATE_OF_AUDIOGRAM_EDEFAULT);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA:
				setPrivateFittingData(PRIVATE_FITTING_DATA_EDEFAULT);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION:
				unsetVersion();
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
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM:
				return DATE_OF_AUDIOGRAM_EDEFAULT == null ? dateOfAudiogram != null : !DATE_OF_AUDIOGRAM_EDEFAULT.equals(dateOfAudiogram);
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA:
				return PRIVATE_FITTING_DATA_EDEFAULT == null ? privateFittingData != null : !PRIVATE_FITTING_DATA_EDEFAULT.equals(privateFittingData);
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case FittingPackage.HEARING_INSTRUMENT_FITTING_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (dateOfAudiogram: ");
		result.append(dateOfAudiogram);
		result.append(", reserved: ");
		result.append(reserved);
		result.append(", privateFittingData: ");
		result.append(privateFittingData);
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HearingInstrumentFittingTypeImpl
