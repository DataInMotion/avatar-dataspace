/*
 */
package com.himsa.measurement.impedance.impl;

import com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType;
import com.himsa.measurement.impedance.EustachianTubeFunctionIntactEarDrumTest;
import com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest;
import com.himsa.measurement.impedance.ImpedancePackage;
import com.himsa.measurement.impedance.ReflexTestType;
import com.himsa.measurement.impedance.TympanogramTestType;

import java.math.BigInteger;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acoustic Impedance Complete Measurement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getTympanogramTest <em>Tympanogram Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getReflexTest <em>Reflex Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getPrivateImpedanceData <em>Private Impedance Data</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.impl.AcousticImpedanceCompleteMeasurementTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcousticImpedanceCompleteMeasurementTypeImpl extends MinimalEObjectImpl.Container implements AcousticImpedanceCompleteMeasurementType {
	/**
	 * The cached value of the '{@link #getTympanogramTest() <em>Tympanogram Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTympanogramTest()
	 * @generated
	 * @ordered
	 */
	protected EList<TympanogramTestType> tympanogramTest;

	/**
	 * The cached value of the '{@link #getReflexTest() <em>Reflex Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ReflexTestType> reflexTest;

	/**
	 * The cached value of the '{@link #getEustachianTubeFunctionIntactEarDrumTest() <em>Eustachian Tube Function Intact Ear Drum Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEustachianTubeFunctionIntactEarDrumTest()
	 * @generated
	 * @ordered
	 */
	protected EustachianTubeFunctionIntactEarDrumTest eustachianTubeFunctionIntactEarDrumTest;

	/**
	 * The cached value of the '{@link #getEustachianTubeFunctionPerforatedEarDrumTest() <em>Eustachian Tube Function Perforated Ear Drum Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEustachianTubeFunctionPerforatedEarDrumTest()
	 * @generated
	 * @ordered
	 */
	protected EustachianTubeFunctionPerforatedEarDrumTest eustachianTubeFunctionPerforatedEarDrumTest;

	/**
	 * The default value of the '{@link #getPrivateImpedanceData() <em>Private Impedance Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateImpedanceData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PRIVATE_IMPEDANCE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateImpedanceData() <em>Private Impedance Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateImpedanceData()
	 * @generated
	 * @ordered
	 */
	protected byte[] privateImpedanceData = PRIVATE_IMPEDANCE_DATA_EDEFAULT;

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
	protected AcousticImpedanceCompleteMeasurementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TympanogramTestType> getTympanogramTest() {
		if (tympanogramTest == null) {
			tympanogramTest = new EObjectContainmentEList<TympanogramTestType>(TympanogramTestType.class, this, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST);
		}
		return tympanogramTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReflexTestType> getReflexTest() {
		if (reflexTest == null) {
			reflexTest = new EObjectContainmentEList<ReflexTestType>(ReflexTestType.class, this, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST);
		}
		return reflexTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EustachianTubeFunctionIntactEarDrumTest getEustachianTubeFunctionIntactEarDrumTest() {
		return eustachianTubeFunctionIntactEarDrumTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest newEustachianTubeFunctionIntactEarDrumTest, NotificationChain msgs) {
		EustachianTubeFunctionIntactEarDrumTest oldEustachianTubeFunctionIntactEarDrumTest = eustachianTubeFunctionIntactEarDrumTest;
		eustachianTubeFunctionIntactEarDrumTest = newEustachianTubeFunctionIntactEarDrumTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, oldEustachianTubeFunctionIntactEarDrumTest, newEustachianTubeFunctionIntactEarDrumTest);
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
	public void setEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest newEustachianTubeFunctionIntactEarDrumTest) {
		if (newEustachianTubeFunctionIntactEarDrumTest != eustachianTubeFunctionIntactEarDrumTest) {
			NotificationChain msgs = null;
			if (eustachianTubeFunctionIntactEarDrumTest != null)
				msgs = ((InternalEObject)eustachianTubeFunctionIntactEarDrumTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, null, msgs);
			if (newEustachianTubeFunctionIntactEarDrumTest != null)
				msgs = ((InternalEObject)newEustachianTubeFunctionIntactEarDrumTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, null, msgs);
			msgs = basicSetEustachianTubeFunctionIntactEarDrumTest(newEustachianTubeFunctionIntactEarDrumTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, newEustachianTubeFunctionIntactEarDrumTest, newEustachianTubeFunctionIntactEarDrumTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EustachianTubeFunctionPerforatedEarDrumTest getEustachianTubeFunctionPerforatedEarDrumTest() {
		return eustachianTubeFunctionPerforatedEarDrumTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest newEustachianTubeFunctionPerforatedEarDrumTest, NotificationChain msgs) {
		EustachianTubeFunctionPerforatedEarDrumTest oldEustachianTubeFunctionPerforatedEarDrumTest = eustachianTubeFunctionPerforatedEarDrumTest;
		eustachianTubeFunctionPerforatedEarDrumTest = newEustachianTubeFunctionPerforatedEarDrumTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, oldEustachianTubeFunctionPerforatedEarDrumTest, newEustachianTubeFunctionPerforatedEarDrumTest);
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
	public void setEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest newEustachianTubeFunctionPerforatedEarDrumTest) {
		if (newEustachianTubeFunctionPerforatedEarDrumTest != eustachianTubeFunctionPerforatedEarDrumTest) {
			NotificationChain msgs = null;
			if (eustachianTubeFunctionPerforatedEarDrumTest != null)
				msgs = ((InternalEObject)eustachianTubeFunctionPerforatedEarDrumTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, null, msgs);
			if (newEustachianTubeFunctionPerforatedEarDrumTest != null)
				msgs = ((InternalEObject)newEustachianTubeFunctionPerforatedEarDrumTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, null, msgs);
			msgs = basicSetEustachianTubeFunctionPerforatedEarDrumTest(newEustachianTubeFunctionPerforatedEarDrumTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, newEustachianTubeFunctionPerforatedEarDrumTest, newEustachianTubeFunctionPerforatedEarDrumTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPrivateImpedanceData() {
		return privateImpedanceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateImpedanceData(byte[] newPrivateImpedanceData) {
		byte[] oldPrivateImpedanceData = privateImpedanceData;
		privateImpedanceData = newPrivateImpedanceData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA, oldPrivateImpedanceData, privateImpedanceData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST:
				return ((InternalEList<?>)getTympanogramTest()).basicRemove(otherEnd, msgs);
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST:
				return ((InternalEList<?>)getReflexTest()).basicRemove(otherEnd, msgs);
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return basicSetEustachianTubeFunctionIntactEarDrumTest(null, msgs);
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return basicSetEustachianTubeFunctionPerforatedEarDrumTest(null, msgs);
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST:
				return getTympanogramTest();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST:
				return getReflexTest();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return getEustachianTubeFunctionIntactEarDrumTest();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return getEustachianTubeFunctionPerforatedEarDrumTest();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA:
				return getPrivateImpedanceData();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION:
				return getVersion();
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST:
				getTympanogramTest().clear();
				getTympanogramTest().addAll((Collection<? extends TympanogramTestType>)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST:
				getReflexTest().clear();
				getReflexTest().addAll((Collection<? extends ReflexTestType>)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				setEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				setEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA:
				setPrivateImpedanceData((byte[])newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION:
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST:
				getTympanogramTest().clear();
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST:
				getReflexTest().clear();
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				setEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)null);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				setEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)null);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA:
				setPrivateImpedanceData(PRIVATE_IMPEDANCE_DATA_EDEFAULT);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION:
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__TYMPANOGRAM_TEST:
				return tympanogramTest != null && !tympanogramTest.isEmpty();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__REFLEX_TEST:
				return reflexTest != null && !reflexTest.isEmpty();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return eustachianTubeFunctionIntactEarDrumTest != null;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return eustachianTubeFunctionPerforatedEarDrumTest != null;
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__PRIVATE_IMPEDANCE_DATA:
				return PRIVATE_IMPEDANCE_DATA_EDEFAULT == null ? privateImpedanceData != null : !PRIVATE_IMPEDANCE_DATA_EDEFAULT.equals(privateImpedanceData);
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE__VERSION:
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
		result.append(" (privateImpedanceData: ");
		result.append(privateImpedanceData);
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AcousticImpedanceCompleteMeasurementTypeImpl
