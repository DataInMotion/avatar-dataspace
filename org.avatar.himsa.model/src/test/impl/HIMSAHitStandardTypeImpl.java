/*
 */
package test.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import test.HIMSAHitStandardType;
import test.HearingInstrumentTestType;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIMSA Hit Standard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.HIMSAHitStandardTypeImpl#getHearingInstrumentTest <em>Hearing Instrument Test</em>}</li>
 *   <li>{@link test.impl.HIMSAHitStandardTypeImpl#getPrivateHIT <em>Private HIT</em>}</li>
 *   <li>{@link test.impl.HIMSAHitStandardTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link test.impl.HIMSAHitStandardTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link test.impl.HIMSAHitStandardTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HIMSAHitStandardTypeImpl extends MinimalEObjectImpl.Container implements HIMSAHitStandardType {
	/**
	 * The cached value of the '{@link #getHearingInstrumentTest() <em>Hearing Instrument Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentTest()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentTestType hearingInstrumentTest;

	/**
	 * The default value of the '{@link #getPrivateHIT() <em>Private HIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateHIT()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PRIVATE_HIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateHIT() <em>Private HIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateHIT()
	 * @generated
	 * @ordered
	 */
	protected byte[] privateHIT = PRIVATE_HIT_EDEFAULT;

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
	protected HIMSAHitStandardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.HIMSA_HIT_STANDARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentTestType getHearingInstrumentTest() {
		return hearingInstrumentTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHearingInstrumentTest(HearingInstrumentTestType newHearingInstrumentTest, NotificationChain msgs) {
		HearingInstrumentTestType oldHearingInstrumentTest = hearingInstrumentTest;
		hearingInstrumentTest = newHearingInstrumentTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST, oldHearingInstrumentTest, newHearingInstrumentTest);
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
	public void setHearingInstrumentTest(HearingInstrumentTestType newHearingInstrumentTest) {
		if (newHearingInstrumentTest != hearingInstrumentTest) {
			NotificationChain msgs = null;
			if (hearingInstrumentTest != null)
				msgs = ((InternalEObject)hearingInstrumentTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST, null, msgs);
			if (newHearingInstrumentTest != null)
				msgs = ((InternalEObject)newHearingInstrumentTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST, null, msgs);
			msgs = basicSetHearingInstrumentTest(newHearingInstrumentTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST, newHearingInstrumentTest, newHearingInstrumentTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPrivateHIT() {
		return privateHIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateHIT(byte[] newPrivateHIT) {
		byte[] oldPrivateHIT = privateHIT;
		privateHIT = newPrivateHIT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT, oldPrivateHIT, privateHIT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST:
				return basicSetHearingInstrumentTest(null, msgs);
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
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST:
				return getHearingInstrumentTest();
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT:
				return getPrivateHIT();
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION:
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
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST:
				setHearingInstrumentTest((HearingInstrumentTestType)newValue);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT:
				setPrivateHIT((byte[])newValue);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION:
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
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST:
				setHearingInstrumentTest((HearingInstrumentTestType)null);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT:
				setPrivateHIT(PRIVATE_HIT_EDEFAULT);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION:
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
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__HEARING_INSTRUMENT_TEST:
				return hearingInstrumentTest != null;
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__PRIVATE_HIT:
				return PRIVATE_HIT_EDEFAULT == null ? privateHIT != null : !PRIVATE_HIT_EDEFAULT.equals(privateHIT);
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case TestPackage.HIMSA_HIT_STANDARD_TYPE__VERSION:
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
		result.append(" (privateHIT: ");
		result.append(privateHIT);
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HIMSAHitStandardTypeImpl
