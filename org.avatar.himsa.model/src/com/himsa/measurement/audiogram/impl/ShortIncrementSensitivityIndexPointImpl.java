/*
 */
package com.himsa.measurement.audiogram.impl;

import com.himsa.measurement.audiogram.AudiogramPackage;
import com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Increment Sensitivity Index Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getModulationSize <em>Modulation Size</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getNumberOfAnswers <em>Number Of Answers</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.ShortIncrementSensitivityIndexPointImpl#getNumberOfIncrements <em>Number Of Increments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortIncrementSensitivityIndexPointImpl extends MinimalEObjectImpl.Container implements ShortIncrementSensitivityIndexPoint {
	/**
	 * The default value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STIMULUS_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stimulusFrequency = STIMULUS_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusLevel = STIMULUS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MASKING_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maskingFrequency = MASKING_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingLevel = MASKING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulationSize() <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODULATION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulationSize() <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modulationSize = MODULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfAnswers() <em>Number Of Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ANSWERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfAnswers() <em>Number Of Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAnswers()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfAnswers = NUMBER_OF_ANSWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfIncrements() <em>Number Of Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIncrements()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_INCREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfIncrements() <em>Number Of Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIncrements()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfIncrements = NUMBER_OF_INCREMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortIncrementSensitivityIndexPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStimulusFrequency() {
		return stimulusFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusFrequency(BigInteger newStimulusFrequency) {
		BigInteger oldStimulusFrequency = stimulusFrequency;
		stimulusFrequency = newStimulusFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusLevel() {
		return stimulusLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusLevel(BigDecimal newStimulusLevel) {
		BigDecimal oldStimulusLevel = stimulusLevel;
		stimulusLevel = newStimulusLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaskingFrequency() {
		return maskingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingFrequency(BigInteger newMaskingFrequency) {
		BigInteger oldMaskingFrequency = maskingFrequency;
		maskingFrequency = newMaskingFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY, oldMaskingFrequency, maskingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingLevel() {
		return maskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingLevel(BigDecimal newMaskingLevel) {
		BigDecimal oldMaskingLevel = maskingLevel;
		maskingLevel = newMaskingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL, oldMaskingLevel, maskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModulationSize() {
		return modulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModulationSize(BigDecimal newModulationSize) {
		BigDecimal oldModulationSize = modulationSize;
		modulationSize = newModulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE, oldModulationSize, modulationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumberOfAnswers() {
		return numberOfAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfAnswers(BigInteger newNumberOfAnswers) {
		BigInteger oldNumberOfAnswers = numberOfAnswers;
		numberOfAnswers = newNumberOfAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS, oldNumberOfAnswers, numberOfAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumberOfIncrements() {
		return numberOfIncrements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfIncrements(BigInteger newNumberOfIncrements) {
		BigInteger oldNumberOfIncrements = numberOfIncrements;
		numberOfIncrements = newNumberOfIncrements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS, oldNumberOfIncrements, numberOfIncrements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL:
				return getStimulusLevel();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY:
				return getMaskingFrequency();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL:
				return getMaskingLevel();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE:
				return getModulationSize();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS:
				return getNumberOfAnswers();
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS:
				return getNumberOfIncrements();
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY:
				setMaskingFrequency((BigInteger)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL:
				setMaskingLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE:
				setModulationSize((BigDecimal)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS:
				setNumberOfAnswers((BigInteger)newValue);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS:
				setNumberOfIncrements((BigInteger)newValue);
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY:
				setMaskingFrequency(MASKING_FREQUENCY_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL:
				setMaskingLevel(MASKING_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE:
				setModulationSize(MODULATION_SIZE_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS:
				setNumberOfAnswers(NUMBER_OF_ANSWERS_EDEFAULT);
				return;
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS:
				setNumberOfIncrements(NUMBER_OF_INCREMENTS_EDEFAULT);
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
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_FREQUENCY:
				return MASKING_FREQUENCY_EDEFAULT == null ? maskingFrequency != null : !MASKING_FREQUENCY_EDEFAULT.equals(maskingFrequency);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MASKING_LEVEL:
				return MASKING_LEVEL_EDEFAULT == null ? maskingLevel != null : !MASKING_LEVEL_EDEFAULT.equals(maskingLevel);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__MODULATION_SIZE:
				return MODULATION_SIZE_EDEFAULT == null ? modulationSize != null : !MODULATION_SIZE_EDEFAULT.equals(modulationSize);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_ANSWERS:
				return NUMBER_OF_ANSWERS_EDEFAULT == null ? numberOfAnswers != null : !NUMBER_OF_ANSWERS_EDEFAULT.equals(numberOfAnswers);
			case AudiogramPackage.SHORT_INCREMENT_SENSITIVITY_INDEX_POINT__NUMBER_OF_INCREMENTS:
				return NUMBER_OF_INCREMENTS_EDEFAULT == null ? numberOfIncrements != null : !NUMBER_OF_INCREMENTS_EDEFAULT.equals(numberOfIncrements);
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
		result.append(" (stimulusFrequency: ");
		result.append(stimulusFrequency);
		result.append(", stimulusLevel: ");
		result.append(stimulusLevel);
		result.append(", maskingFrequency: ");
		result.append(maskingFrequency);
		result.append(", maskingLevel: ");
		result.append(maskingLevel);
		result.append(", modulationSize: ");
		result.append(modulationSize);
		result.append(", numberOfAnswers: ");
		result.append(numberOfAnswers);
		result.append(", numberOfIncrements: ");
		result.append(numberOfIncrements);
		result.append(')');
		return result.toString();
	}

} //ShortIncrementSensitivityIndexPointImpl
