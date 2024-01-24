/*
 */
package audiogram502.impl;

import audiogram502.AdditionalMaskingType;
import audiogram502.Audiogram502Package;
import audiogram502.PointStatusType;
import audiogram502.SpeechScorePointType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getScorePercent <em>Score Percent</em>}</li>
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getNumberOfWords <em>Number Of Words</em>}</li>
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getSpeechPointStatus <em>Speech Point Status</em>}</li>
 *   <li>{@link audiogram502.impl.SpeechScorePointTypeImpl#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
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
	 * The default value of the '{@link #getSpeechPointStatus() <em>Speech Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechPointStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PointStatusType SPEECH_POINT_STATUS_EDEFAULT = PointStatusType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSpeechPointStatus() <em>Speech Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechPointStatus()
	 * @generated
	 * @ordered
	 */
	protected PointStatusType speechPointStatus = SPEECH_POINT_STATUS_EDEFAULT;

	/**
	 * This is true if the Speech Point Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speechPointStatusESet;

	/**
	 * The cached value of the '{@link #getAdditionalMaskingPoint() <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 * @ordered
	 */
	protected AdditionalMaskingType additionalMaskingPoint;

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
		return Audiogram502Package.Literals.SPEECH_SCORE_POINT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL, oldMaskingLevel, maskingLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT, oldScorePercent, scorePercent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS, oldNumberOfWords, numberOfWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointStatusType getSpeechPointStatus() {
		return speechPointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeechPointStatus(PointStatusType newSpeechPointStatus) {
		PointStatusType oldSpeechPointStatus = speechPointStatus;
		speechPointStatus = newSpeechPointStatus == null ? SPEECH_POINT_STATUS_EDEFAULT : newSpeechPointStatus;
		boolean oldSpeechPointStatusESet = speechPointStatusESet;
		speechPointStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS, oldSpeechPointStatus, speechPointStatus, !oldSpeechPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpeechPointStatus() {
		PointStatusType oldSpeechPointStatus = speechPointStatus;
		boolean oldSpeechPointStatusESet = speechPointStatusESet;
		speechPointStatus = SPEECH_POINT_STATUS_EDEFAULT;
		speechPointStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS, oldSpeechPointStatus, SPEECH_POINT_STATUS_EDEFAULT, oldSpeechPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpeechPointStatus() {
		return speechPointStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalMaskingType getAdditionalMaskingPoint() {
		return additionalMaskingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalMaskingPoint(AdditionalMaskingType newAdditionalMaskingPoint, NotificationChain msgs) {
		AdditionalMaskingType oldAdditionalMaskingPoint = additionalMaskingPoint;
		additionalMaskingPoint = newAdditionalMaskingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT, oldAdditionalMaskingPoint, newAdditionalMaskingPoint);
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
	public void setAdditionalMaskingPoint(AdditionalMaskingType newAdditionalMaskingPoint) {
		if (newAdditionalMaskingPoint != additionalMaskingPoint) {
			NotificationChain msgs = null;
			if (additionalMaskingPoint != null)
				msgs = ((InternalEObject)additionalMaskingPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT, null, msgs);
			if (newAdditionalMaskingPoint != null)
				msgs = ((InternalEObject)newAdditionalMaskingPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT, null, msgs);
			msgs = basicSetAdditionalMaskingPoint(newAdditionalMaskingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT, newAdditionalMaskingPoint, newAdditionalMaskingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT:
				return basicSetAdditionalMaskingPoint(null, msgs);
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
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				return getStimulusLevel();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				return getMaskingLevel();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				return getScorePercent();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				return getNumberOfWords();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS:
				return getSpeechPointStatus();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT:
				return getAdditionalMaskingPoint();
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
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel((BigDecimal)newValue);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				setScorePercent((BigDecimal)newValue);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				setNumberOfWords((BigInteger)newValue);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS:
				setSpeechPointStatus((PointStatusType)newValue);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT:
				setAdditionalMaskingPoint((AdditionalMaskingType)newValue);
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
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel(MASKING_LEVEL_EDEFAULT);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				setScorePercent(SCORE_PERCENT_EDEFAULT);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				setNumberOfWords(NUMBER_OF_WORDS_EDEFAULT);
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS:
				unsetSpeechPointStatus();
				return;
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT:
				setAdditionalMaskingPoint((AdditionalMaskingType)null);
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
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__MASKING_LEVEL:
				return MASKING_LEVEL_EDEFAULT == null ? maskingLevel != null : !MASKING_LEVEL_EDEFAULT.equals(maskingLevel);
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SCORE_PERCENT:
				return SCORE_PERCENT_EDEFAULT == null ? scorePercent != null : !SCORE_PERCENT_EDEFAULT.equals(scorePercent);
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__NUMBER_OF_WORDS:
				return NUMBER_OF_WORDS_EDEFAULT == null ? numberOfWords != null : !NUMBER_OF_WORDS_EDEFAULT.equals(numberOfWords);
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__SPEECH_POINT_STATUS:
				return isSetSpeechPointStatus();
			case Audiogram502Package.SPEECH_SCORE_POINT_TYPE__ADDITIONAL_MASKING_POINT:
				return additionalMaskingPoint != null;
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
		result.append(", speechPointStatus: ");
		if (speechPointStatusESet) result.append(speechPointStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpeechScorePointTypeImpl
