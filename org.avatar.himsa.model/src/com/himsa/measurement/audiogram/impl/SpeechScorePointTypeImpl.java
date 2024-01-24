/*
 */
package com.himsa.measurement.audiogram.impl;

import com.himsa.measurement.audiogram.AudiogramPackage;
import com.himsa.measurement.audiogram.SpeechScorePointType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Score Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl#getScorePercent <em>Score Percent</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.impl.SpeechScorePointTypeImpl#getNumberOfWords <em>Number Of Words</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeechScorePointTypeImpl extends MinimalEObjectImpl.Container implements SpeechScorePointType {
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
	 * The default value of the '{@link #getScorePercent() <em>Score Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScorePercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCORE_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScorePercent() <em>Score Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScorePercent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal scorePercent = SCORE_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfWords() <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWords()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_WORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfWords() <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWords()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfWords = NUMBER_OF_WORDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechScorePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.SPEECH_SCORE_POINT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL, oldMaskingLevel, maskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScorePercent() {
		return scorePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScorePercent(BigDecimal newScorePercent) {
		BigDecimal oldScorePercent = scorePercent;
		scorePercent = newScorePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT, oldScorePercent, scorePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumberOfWords() {
		return numberOfWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfWords(BigInteger newNumberOfWords) {
		BigInteger oldNumberOfWords = numberOfWords;
		numberOfWords = newNumberOfWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS, oldNumberOfWords, numberOfWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				return getStimulusLevel();
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				return getMaskingLevel();
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				return getScorePercent();
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				return getNumberOfWords();
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
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				setScorePercent((BigDecimal)newValue);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				setNumberOfWords((BigInteger)newValue);
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
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel(MASKING_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				setScorePercent(SCORE_PERCENT_EDEFAULT);
				return;
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				setNumberOfWords(NUMBER_OF_WORDS_EDEFAULT);
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
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				return MASKING_LEVEL_EDEFAULT == null ? maskingLevel != null : !MASKING_LEVEL_EDEFAULT.equals(maskingLevel);
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				return SCORE_PERCENT_EDEFAULT == null ? scorePercent != null : !SCORE_PERCENT_EDEFAULT.equals(scorePercent);
			case AudiogramPackage.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				return NUMBER_OF_WORDS_EDEFAULT == null ? numberOfWords != null : !NUMBER_OF_WORDS_EDEFAULT.equals(numberOfWords);
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
		result.append(" (stimulusLevel: ");
		result.append(stimulusLevel);
		result.append(", maskingLevel: ");
		result.append(maskingLevel);
		result.append(", scorePercent: ");
		result.append(scorePercent);
		result.append(", numberOfWords: ");
		result.append(numberOfWords);
		result.append(')');
		return result.toString();
	}

} //SpeechScorePointTypeImpl
