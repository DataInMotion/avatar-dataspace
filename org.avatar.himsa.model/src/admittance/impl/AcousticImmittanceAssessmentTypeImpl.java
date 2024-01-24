/*
 */
package admittance.impl;

import admittance.AcousticImmittanceAssessmentType;
import admittance.AdmittancePackage;
import admittance.EustachianTubeFunctionIntactEarDrumTest;
import admittance.EustachianTubeFunctionPerforatedEarDrumTest;
import admittance.MeasurementNotesType;
import admittance.ReflexTestType;
import admittance.SupplementaryDataType;
import admittance.TympanogramTestType;

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
 * An implementation of the model object '<em><b>Acoustic Immittance Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getTympanogramTest <em>Tympanogram Test</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getReflexTest <em>Reflex Test</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getEustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getEustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getSupplementaryData <em>Supplementary Data</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link admittance.impl.AcousticImmittanceAssessmentTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcousticImmittanceAssessmentTypeImpl extends MinimalEObjectImpl.Container implements AcousticImmittanceAssessmentType {
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
	 * The cached value of the '{@link #getSupplementaryData() <em>Supplementary Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementaryData()
	 * @generated
	 * @ordered
	 */
	protected SupplementaryDataType supplementaryData;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected MeasurementNotesType notes;

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
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("501");

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
	protected AcousticImmittanceAssessmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TympanogramTestType> getTympanogramTest() {
		if (tympanogramTest == null) {
			tympanogramTest = new EObjectContainmentEList<TympanogramTestType>(TympanogramTestType.class, this, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST);
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
			reflexTest = new EObjectContainmentEList<ReflexTestType>(ReflexTestType.class, this, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, oldEustachianTubeFunctionIntactEarDrumTest, newEustachianTubeFunctionIntactEarDrumTest);
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
				msgs = ((InternalEObject)eustachianTubeFunctionIntactEarDrumTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, null, msgs);
			if (newEustachianTubeFunctionIntactEarDrumTest != null)
				msgs = ((InternalEObject)newEustachianTubeFunctionIntactEarDrumTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, null, msgs);
			msgs = basicSetEustachianTubeFunctionIntactEarDrumTest(newEustachianTubeFunctionIntactEarDrumTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST, newEustachianTubeFunctionIntactEarDrumTest, newEustachianTubeFunctionIntactEarDrumTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, oldEustachianTubeFunctionPerforatedEarDrumTest, newEustachianTubeFunctionPerforatedEarDrumTest);
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
				msgs = ((InternalEObject)eustachianTubeFunctionPerforatedEarDrumTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, null, msgs);
			if (newEustachianTubeFunctionPerforatedEarDrumTest != null)
				msgs = ((InternalEObject)newEustachianTubeFunctionPerforatedEarDrumTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, null, msgs);
			msgs = basicSetEustachianTubeFunctionPerforatedEarDrumTest(newEustachianTubeFunctionPerforatedEarDrumTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST, newEustachianTubeFunctionPerforatedEarDrumTest, newEustachianTubeFunctionPerforatedEarDrumTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementaryDataType getSupplementaryData() {
		return supplementaryData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplementaryData(SupplementaryDataType newSupplementaryData, NotificationChain msgs) {
		SupplementaryDataType oldSupplementaryData = supplementaryData;
		supplementaryData = newSupplementaryData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA, oldSupplementaryData, newSupplementaryData);
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
	public void setSupplementaryData(SupplementaryDataType newSupplementaryData) {
		if (newSupplementaryData != supplementaryData) {
			NotificationChain msgs = null;
			if (supplementaryData != null)
				msgs = ((InternalEObject)supplementaryData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA, null, msgs);
			if (newSupplementaryData != null)
				msgs = ((InternalEObject)newSupplementaryData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA, null, msgs);
			msgs = basicSetSupplementaryData(newSupplementaryData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA, newSupplementaryData, newSupplementaryData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementNotesType getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(MeasurementNotesType newNotes, NotificationChain msgs) {
		MeasurementNotesType oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES, oldNotes, newNotes);
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
	public void setNotes(MeasurementNotesType newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES, newNotes, newNotes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST:
				return ((InternalEList<?>)getTympanogramTest()).basicRemove(otherEnd, msgs);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST:
				return ((InternalEList<?>)getReflexTest()).basicRemove(otherEnd, msgs);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return basicSetEustachianTubeFunctionIntactEarDrumTest(null, msgs);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return basicSetEustachianTubeFunctionPerforatedEarDrumTest(null, msgs);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA:
				return basicSetSupplementaryData(null, msgs);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES:
				return basicSetNotes(null, msgs);
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST:
				return getTympanogramTest();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST:
				return getReflexTest();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return getEustachianTubeFunctionIntactEarDrumTest();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return getEustachianTubeFunctionPerforatedEarDrumTest();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA:
				return getSupplementaryData();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES:
				return getNotes();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION:
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST:
				getTympanogramTest().clear();
				getTympanogramTest().addAll((Collection<? extends TympanogramTestType>)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST:
				getReflexTest().clear();
				getReflexTest().addAll((Collection<? extends ReflexTestType>)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				setEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				setEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA:
				setSupplementaryData((SupplementaryDataType)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES:
				setNotes((MeasurementNotesType)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION:
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST:
				getTympanogramTest().clear();
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST:
				getReflexTest().clear();
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				setEustachianTubeFunctionIntactEarDrumTest((EustachianTubeFunctionIntactEarDrumTest)null);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				setEustachianTubeFunctionPerforatedEarDrumTest((EustachianTubeFunctionPerforatedEarDrumTest)null);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA:
				setSupplementaryData((SupplementaryDataType)null);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES:
				setNotes((MeasurementNotesType)null);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION:
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__TYMPANOGRAM_TEST:
				return tympanogramTest != null && !tympanogramTest.isEmpty();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__REFLEX_TEST:
				return reflexTest != null && !reflexTest.isEmpty();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST:
				return eustachianTubeFunctionIntactEarDrumTest != null;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST:
				return eustachianTubeFunctionPerforatedEarDrumTest != null;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__SUPPLEMENTARY_DATA:
				return supplementaryData != null;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__NOTES:
				return notes != null;
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE__VERSION:
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
		result.append(" (convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AcousticImmittanceAssessmentTypeImpl
