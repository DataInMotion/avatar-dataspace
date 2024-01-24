/*
 */
package audiogram.impl;

import audiogram.AlternateBinauralLoudnessBalanceAudiogramType;
import audiogram.AudiogramPackage;
import audiogram.DecayAudiogramType;
import audiogram.DifferenceLimenFrequencyType;
import audiogram.DifferenceLimenIntensityType;
import audiogram.FrequenciesUsedForToneAverageType;
import audiogram.HIMSAAudiometricStandardType;
import audiogram.MeasurementNotesType;
import audiogram.MostComfortableLevelType;
import audiogram.ShortIncrementSensitivityIndexType;
import audiogram.SpeechDiscriminationAudiogramType;
import audiogram.SpeechMostComfortableLevelType;
import audiogram.SpeechReceptionThresholdAudiogramType;
import audiogram.SpeechUncomfortableLevelType;
import audiogram.StengerAudiogramType;
import audiogram.ToneThresholdAudiogramType;
import audiogram.UncomfortableLevelType;

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
 * An implementation of the model object '<em><b>HIMSA Audiometric Standard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getToneThresholdAudiogram <em>Tone Threshold Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getUncomfortableLevel <em>Uncomfortable Level</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getMostComfortableLevel <em>Most Comfortable Level</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getSpeechDiscriminationAudiogram <em>Speech Discrimination Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getSpeechReceptionThresholdAudiogram <em>Speech Reception Threshold Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getSpeechMostComfortableLevel <em>Speech Most Comfortable Level</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getSpeechUncomfortableLevel <em>Speech Uncomfortable Level</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getToneNotes <em>Tone Notes</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getSpeechNotes <em>Speech Notes</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getFrequenciesUsedForToneAverage <em>Frequencies Used For Tone Average</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getDecayAudiogram <em>Decay Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getAlternateBinauralLoudnessBalanceAudiogram <em>Alternate Binaural Loudness Balance Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getStengerAudiogram <em>Stenger Audiogram</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getDifferenceLimenIntensity <em>Difference Limen Intensity</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getDifferenceLimenFrequency <em>Difference Limen Frequency</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getShortIncrementSensitivityIndex <em>Short Increment Sensitivity Index</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getPrivateAudiogramData <em>Private Audiogram Data</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link audiogram.impl.HIMSAAudiometricStandardTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HIMSAAudiometricStandardTypeImpl extends MinimalEObjectImpl.Container implements HIMSAAudiometricStandardType {
	/**
	 * The cached value of the '{@link #getToneThresholdAudiogram() <em>Tone Threshold Audiogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToneThresholdAudiogram()
	 * @generated
	 * @ordered
	 */
	protected EList<ToneThresholdAudiogramType> toneThresholdAudiogram;

	/**
	 * The cached value of the '{@link #getUncomfortableLevel() <em>Uncomfortable Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncomfortableLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<UncomfortableLevelType> uncomfortableLevel;

	/**
	 * The cached value of the '{@link #getMostComfortableLevel() <em>Most Comfortable Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostComfortableLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<MostComfortableLevelType> mostComfortableLevel;

	/**
	 * The cached value of the '{@link #getSpeechDiscriminationAudiogram() <em>Speech Discrimination Audiogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechDiscriminationAudiogram()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechDiscriminationAudiogramType> speechDiscriminationAudiogram;

	/**
	 * The cached value of the '{@link #getSpeechReceptionThresholdAudiogram() <em>Speech Reception Threshold Audiogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechReceptionThresholdAudiogram()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechReceptionThresholdAudiogramType> speechReceptionThresholdAudiogram;

	/**
	 * The cached value of the '{@link #getSpeechMostComfortableLevel() <em>Speech Most Comfortable Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechMostComfortableLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechMostComfortableLevelType> speechMostComfortableLevel;

	/**
	 * The cached value of the '{@link #getSpeechUncomfortableLevel() <em>Speech Uncomfortable Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechUncomfortableLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechUncomfortableLevelType> speechUncomfortableLevel;

	/**
	 * The cached value of the '{@link #getToneNotes() <em>Tone Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToneNotes()
	 * @generated
	 * @ordered
	 */
	protected MeasurementNotesType toneNotes;

	/**
	 * The cached value of the '{@link #getSpeechNotes() <em>Speech Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechNotes()
	 * @generated
	 * @ordered
	 */
	protected MeasurementNotesType speechNotes;

	/**
	 * The cached value of the '{@link #getFrequenciesUsedForToneAverage() <em>Frequencies Used For Tone Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequenciesUsedForToneAverage()
	 * @generated
	 * @ordered
	 */
	protected FrequenciesUsedForToneAverageType frequenciesUsedForToneAverage;

	/**
	 * The cached value of the '{@link #getDecayAudiogram() <em>Decay Audiogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecayAudiogram()
	 * @generated
	 * @ordered
	 */
	protected EList<DecayAudiogramType> decayAudiogram;

	/**
	 * The cached value of the '{@link #getAlternateBinauralLoudnessBalanceAudiogram() <em>Alternate Binaural Loudness Balance Audiogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateBinauralLoudnessBalanceAudiogram()
	 * @generated
	 * @ordered
	 */
	protected AlternateBinauralLoudnessBalanceAudiogramType alternateBinauralLoudnessBalanceAudiogram;

	/**
	 * The cached value of the '{@link #getStengerAudiogram() <em>Stenger Audiogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStengerAudiogram()
	 * @generated
	 * @ordered
	 */
	protected StengerAudiogramType stengerAudiogram;

	/**
	 * The cached value of the '{@link #getDifferenceLimenIntensity() <em>Difference Limen Intensity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferenceLimenIntensity()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferenceLimenIntensityType> differenceLimenIntensity;

	/**
	 * The cached value of the '{@link #getDifferenceLimenFrequency() <em>Difference Limen Frequency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferenceLimenFrequency()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferenceLimenFrequencyType> differenceLimenFrequency;

	/**
	 * The cached value of the '{@link #getShortIncrementSensitivityIndex() <em>Short Increment Sensitivity Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortIncrementSensitivityIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortIncrementSensitivityIndexType> shortIncrementSensitivityIndex;

	/**
	 * The default value of the '{@link #getPrivateAudiogramData() <em>Private Audiogram Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAudiogramData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PRIVATE_AUDIOGRAM_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateAudiogramData() <em>Private Audiogram Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAudiogramData()
	 * @generated
	 * @ordered
	 */
	protected byte[] privateAudiogramData = PRIVATE_AUDIOGRAM_DATA_EDEFAULT;

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
	protected HIMSAAudiometricStandardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.HIMSA_AUDIOMETRIC_STANDARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToneThresholdAudiogramType> getToneThresholdAudiogram() {
		if (toneThresholdAudiogram == null) {
			toneThresholdAudiogram = new EObjectContainmentEList<ToneThresholdAudiogramType>(ToneThresholdAudiogramType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM);
		}
		return toneThresholdAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UncomfortableLevelType> getUncomfortableLevel() {
		if (uncomfortableLevel == null) {
			uncomfortableLevel = new EObjectContainmentEList<UncomfortableLevelType>(UncomfortableLevelType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL);
		}
		return uncomfortableLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MostComfortableLevelType> getMostComfortableLevel() {
		if (mostComfortableLevel == null) {
			mostComfortableLevel = new EObjectContainmentEList<MostComfortableLevelType>(MostComfortableLevelType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL);
		}
		return mostComfortableLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechDiscriminationAudiogramType> getSpeechDiscriminationAudiogram() {
		if (speechDiscriminationAudiogram == null) {
			speechDiscriminationAudiogram = new EObjectContainmentEList<SpeechDiscriminationAudiogramType>(SpeechDiscriminationAudiogramType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM);
		}
		return speechDiscriminationAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechReceptionThresholdAudiogramType> getSpeechReceptionThresholdAudiogram() {
		if (speechReceptionThresholdAudiogram == null) {
			speechReceptionThresholdAudiogram = new EObjectContainmentEList<SpeechReceptionThresholdAudiogramType>(SpeechReceptionThresholdAudiogramType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM);
		}
		return speechReceptionThresholdAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechMostComfortableLevelType> getSpeechMostComfortableLevel() {
		if (speechMostComfortableLevel == null) {
			speechMostComfortableLevel = new EObjectContainmentEList<SpeechMostComfortableLevelType>(SpeechMostComfortableLevelType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL);
		}
		return speechMostComfortableLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechUncomfortableLevelType> getSpeechUncomfortableLevel() {
		if (speechUncomfortableLevel == null) {
			speechUncomfortableLevel = new EObjectContainmentEList<SpeechUncomfortableLevelType>(SpeechUncomfortableLevelType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL);
		}
		return speechUncomfortableLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementNotesType getToneNotes() {
		return toneNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToneNotes(MeasurementNotesType newToneNotes, NotificationChain msgs) {
		MeasurementNotesType oldToneNotes = toneNotes;
		toneNotes = newToneNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES, oldToneNotes, newToneNotes);
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
	public void setToneNotes(MeasurementNotesType newToneNotes) {
		if (newToneNotes != toneNotes) {
			NotificationChain msgs = null;
			if (toneNotes != null)
				msgs = ((InternalEObject)toneNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES, null, msgs);
			if (newToneNotes != null)
				msgs = ((InternalEObject)newToneNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES, null, msgs);
			msgs = basicSetToneNotes(newToneNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES, newToneNotes, newToneNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementNotesType getSpeechNotes() {
		return speechNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechNotes(MeasurementNotesType newSpeechNotes, NotificationChain msgs) {
		MeasurementNotesType oldSpeechNotes = speechNotes;
		speechNotes = newSpeechNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES, oldSpeechNotes, newSpeechNotes);
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
	public void setSpeechNotes(MeasurementNotesType newSpeechNotes) {
		if (newSpeechNotes != speechNotes) {
			NotificationChain msgs = null;
			if (speechNotes != null)
				msgs = ((InternalEObject)speechNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES, null, msgs);
			if (newSpeechNotes != null)
				msgs = ((InternalEObject)newSpeechNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES, null, msgs);
			msgs = basicSetSpeechNotes(newSpeechNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES, newSpeechNotes, newSpeechNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequenciesUsedForToneAverageType getFrequenciesUsedForToneAverage() {
		return frequenciesUsedForToneAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequenciesUsedForToneAverage(FrequenciesUsedForToneAverageType newFrequenciesUsedForToneAverage, NotificationChain msgs) {
		FrequenciesUsedForToneAverageType oldFrequenciesUsedForToneAverage = frequenciesUsedForToneAverage;
		frequenciesUsedForToneAverage = newFrequenciesUsedForToneAverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE, oldFrequenciesUsedForToneAverage, newFrequenciesUsedForToneAverage);
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
	public void setFrequenciesUsedForToneAverage(FrequenciesUsedForToneAverageType newFrequenciesUsedForToneAverage) {
		if (newFrequenciesUsedForToneAverage != frequenciesUsedForToneAverage) {
			NotificationChain msgs = null;
			if (frequenciesUsedForToneAverage != null)
				msgs = ((InternalEObject)frequenciesUsedForToneAverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE, null, msgs);
			if (newFrequenciesUsedForToneAverage != null)
				msgs = ((InternalEObject)newFrequenciesUsedForToneAverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE, null, msgs);
			msgs = basicSetFrequenciesUsedForToneAverage(newFrequenciesUsedForToneAverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE, newFrequenciesUsedForToneAverage, newFrequenciesUsedForToneAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DecayAudiogramType> getDecayAudiogram() {
		if (decayAudiogram == null) {
			decayAudiogram = new EObjectContainmentEList<DecayAudiogramType>(DecayAudiogramType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM);
		}
		return decayAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternateBinauralLoudnessBalanceAudiogramType getAlternateBinauralLoudnessBalanceAudiogram() {
		return alternateBinauralLoudnessBalanceAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternateBinauralLoudnessBalanceAudiogram(AlternateBinauralLoudnessBalanceAudiogramType newAlternateBinauralLoudnessBalanceAudiogram, NotificationChain msgs) {
		AlternateBinauralLoudnessBalanceAudiogramType oldAlternateBinauralLoudnessBalanceAudiogram = alternateBinauralLoudnessBalanceAudiogram;
		alternateBinauralLoudnessBalanceAudiogram = newAlternateBinauralLoudnessBalanceAudiogram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM, oldAlternateBinauralLoudnessBalanceAudiogram, newAlternateBinauralLoudnessBalanceAudiogram);
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
	public void setAlternateBinauralLoudnessBalanceAudiogram(AlternateBinauralLoudnessBalanceAudiogramType newAlternateBinauralLoudnessBalanceAudiogram) {
		if (newAlternateBinauralLoudnessBalanceAudiogram != alternateBinauralLoudnessBalanceAudiogram) {
			NotificationChain msgs = null;
			if (alternateBinauralLoudnessBalanceAudiogram != null)
				msgs = ((InternalEObject)alternateBinauralLoudnessBalanceAudiogram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM, null, msgs);
			if (newAlternateBinauralLoudnessBalanceAudiogram != null)
				msgs = ((InternalEObject)newAlternateBinauralLoudnessBalanceAudiogram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM, null, msgs);
			msgs = basicSetAlternateBinauralLoudnessBalanceAudiogram(newAlternateBinauralLoudnessBalanceAudiogram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM, newAlternateBinauralLoudnessBalanceAudiogram, newAlternateBinauralLoudnessBalanceAudiogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StengerAudiogramType getStengerAudiogram() {
		return stengerAudiogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStengerAudiogram(StengerAudiogramType newStengerAudiogram, NotificationChain msgs) {
		StengerAudiogramType oldStengerAudiogram = stengerAudiogram;
		stengerAudiogram = newStengerAudiogram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM, oldStengerAudiogram, newStengerAudiogram);
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
	public void setStengerAudiogram(StengerAudiogramType newStengerAudiogram) {
		if (newStengerAudiogram != stengerAudiogram) {
			NotificationChain msgs = null;
			if (stengerAudiogram != null)
				msgs = ((InternalEObject)stengerAudiogram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM, null, msgs);
			if (newStengerAudiogram != null)
				msgs = ((InternalEObject)newStengerAudiogram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM, null, msgs);
			msgs = basicSetStengerAudiogram(newStengerAudiogram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM, newStengerAudiogram, newStengerAudiogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifferenceLimenIntensityType> getDifferenceLimenIntensity() {
		if (differenceLimenIntensity == null) {
			differenceLimenIntensity = new EObjectContainmentEList<DifferenceLimenIntensityType>(DifferenceLimenIntensityType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY);
		}
		return differenceLimenIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifferenceLimenFrequencyType> getDifferenceLimenFrequency() {
		if (differenceLimenFrequency == null) {
			differenceLimenFrequency = new EObjectContainmentEList<DifferenceLimenFrequencyType>(DifferenceLimenFrequencyType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY);
		}
		return differenceLimenFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortIncrementSensitivityIndexType> getShortIncrementSensitivityIndex() {
		if (shortIncrementSensitivityIndex == null) {
			shortIncrementSensitivityIndex = new EObjectContainmentEList<ShortIncrementSensitivityIndexType>(ShortIncrementSensitivityIndexType.class, this, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX);
		}
		return shortIncrementSensitivityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPrivateAudiogramData() {
		return privateAudiogramData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateAudiogramData(byte[] newPrivateAudiogramData) {
		byte[] oldPrivateAudiogramData = privateAudiogramData;
		privateAudiogramData = newPrivateAudiogramData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA, oldPrivateAudiogramData, privateAudiogramData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM:
				return ((InternalEList<?>)getToneThresholdAudiogram()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL:
				return ((InternalEList<?>)getUncomfortableLevel()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL:
				return ((InternalEList<?>)getMostComfortableLevel()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM:
				return ((InternalEList<?>)getSpeechDiscriminationAudiogram()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM:
				return ((InternalEList<?>)getSpeechReceptionThresholdAudiogram()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL:
				return ((InternalEList<?>)getSpeechMostComfortableLevel()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL:
				return ((InternalEList<?>)getSpeechUncomfortableLevel()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES:
				return basicSetToneNotes(null, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES:
				return basicSetSpeechNotes(null, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE:
				return basicSetFrequenciesUsedForToneAverage(null, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM:
				return ((InternalEList<?>)getDecayAudiogram()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM:
				return basicSetAlternateBinauralLoudnessBalanceAudiogram(null, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM:
				return basicSetStengerAudiogram(null, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY:
				return ((InternalEList<?>)getDifferenceLimenIntensity()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY:
				return ((InternalEList<?>)getDifferenceLimenFrequency()).basicRemove(otherEnd, msgs);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX:
				return ((InternalEList<?>)getShortIncrementSensitivityIndex()).basicRemove(otherEnd, msgs);
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
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM:
				return getToneThresholdAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL:
				return getUncomfortableLevel();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL:
				return getMostComfortableLevel();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM:
				return getSpeechDiscriminationAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM:
				return getSpeechReceptionThresholdAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL:
				return getSpeechMostComfortableLevel();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL:
				return getSpeechUncomfortableLevel();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES:
				return getToneNotes();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES:
				return getSpeechNotes();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE:
				return getFrequenciesUsedForToneAverage();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM:
				return getDecayAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM:
				return getAlternateBinauralLoudnessBalanceAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM:
				return getStengerAudiogram();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY:
				return getDifferenceLimenIntensity();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY:
				return getDifferenceLimenFrequency();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX:
				return getShortIncrementSensitivityIndex();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA:
				return getPrivateAudiogramData();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION:
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
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM:
				getToneThresholdAudiogram().clear();
				getToneThresholdAudiogram().addAll((Collection<? extends ToneThresholdAudiogramType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL:
				getUncomfortableLevel().clear();
				getUncomfortableLevel().addAll((Collection<? extends UncomfortableLevelType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL:
				getMostComfortableLevel().clear();
				getMostComfortableLevel().addAll((Collection<? extends MostComfortableLevelType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM:
				getSpeechDiscriminationAudiogram().clear();
				getSpeechDiscriminationAudiogram().addAll((Collection<? extends SpeechDiscriminationAudiogramType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM:
				getSpeechReceptionThresholdAudiogram().clear();
				getSpeechReceptionThresholdAudiogram().addAll((Collection<? extends SpeechReceptionThresholdAudiogramType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL:
				getSpeechMostComfortableLevel().clear();
				getSpeechMostComfortableLevel().addAll((Collection<? extends SpeechMostComfortableLevelType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL:
				getSpeechUncomfortableLevel().clear();
				getSpeechUncomfortableLevel().addAll((Collection<? extends SpeechUncomfortableLevelType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES:
				setToneNotes((MeasurementNotesType)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES:
				setSpeechNotes((MeasurementNotesType)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE:
				setFrequenciesUsedForToneAverage((FrequenciesUsedForToneAverageType)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM:
				getDecayAudiogram().clear();
				getDecayAudiogram().addAll((Collection<? extends DecayAudiogramType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM:
				setAlternateBinauralLoudnessBalanceAudiogram((AlternateBinauralLoudnessBalanceAudiogramType)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM:
				setStengerAudiogram((StengerAudiogramType)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY:
				getDifferenceLimenIntensity().clear();
				getDifferenceLimenIntensity().addAll((Collection<? extends DifferenceLimenIntensityType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY:
				getDifferenceLimenFrequency().clear();
				getDifferenceLimenFrequency().addAll((Collection<? extends DifferenceLimenFrequencyType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX:
				getShortIncrementSensitivityIndex().clear();
				getShortIncrementSensitivityIndex().addAll((Collection<? extends ShortIncrementSensitivityIndexType>)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA:
				setPrivateAudiogramData((byte[])newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION:
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
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM:
				getToneThresholdAudiogram().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL:
				getUncomfortableLevel().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL:
				getMostComfortableLevel().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM:
				getSpeechDiscriminationAudiogram().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM:
				getSpeechReceptionThresholdAudiogram().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL:
				getSpeechMostComfortableLevel().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL:
				getSpeechUncomfortableLevel().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES:
				setToneNotes((MeasurementNotesType)null);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES:
				setSpeechNotes((MeasurementNotesType)null);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE:
				setFrequenciesUsedForToneAverage((FrequenciesUsedForToneAverageType)null);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM:
				getDecayAudiogram().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM:
				setAlternateBinauralLoudnessBalanceAudiogram((AlternateBinauralLoudnessBalanceAudiogramType)null);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM:
				setStengerAudiogram((StengerAudiogramType)null);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY:
				getDifferenceLimenIntensity().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY:
				getDifferenceLimenFrequency().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX:
				getShortIncrementSensitivityIndex().clear();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA:
				setPrivateAudiogramData(PRIVATE_AUDIOGRAM_DATA_EDEFAULT);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION:
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
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_THRESHOLD_AUDIOGRAM:
				return toneThresholdAudiogram != null && !toneThresholdAudiogram.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__UNCOMFORTABLE_LEVEL:
				return uncomfortableLevel != null && !uncomfortableLevel.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__MOST_COMFORTABLE_LEVEL:
				return mostComfortableLevel != null && !mostComfortableLevel.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_DISCRIMINATION_AUDIOGRAM:
				return speechDiscriminationAudiogram != null && !speechDiscriminationAudiogram.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_RECEPTION_THRESHOLD_AUDIOGRAM:
				return speechReceptionThresholdAudiogram != null && !speechReceptionThresholdAudiogram.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_MOST_COMFORTABLE_LEVEL:
				return speechMostComfortableLevel != null && !speechMostComfortableLevel.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_UNCOMFORTABLE_LEVEL:
				return speechUncomfortableLevel != null && !speechUncomfortableLevel.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__TONE_NOTES:
				return toneNotes != null;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SPEECH_NOTES:
				return speechNotes != null;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__FREQUENCIES_USED_FOR_TONE_AVERAGE:
				return frequenciesUsedForToneAverage != null;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DECAY_AUDIOGRAM:
				return decayAudiogram != null && !decayAudiogram.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__ALTERNATE_BINAURAL_LOUDNESS_BALANCE_AUDIOGRAM:
				return alternateBinauralLoudnessBalanceAudiogram != null;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__STENGER_AUDIOGRAM:
				return stengerAudiogram != null;
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_INTENSITY:
				return differenceLimenIntensity != null && !differenceLimenIntensity.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__DIFFERENCE_LIMEN_FREQUENCY:
				return differenceLimenFrequency != null && !differenceLimenFrequency.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__SHORT_INCREMENT_SENSITIVITY_INDEX:
				return shortIncrementSensitivityIndex != null && !shortIncrementSensitivityIndex.isEmpty();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__PRIVATE_AUDIOGRAM_DATA:
				return PRIVATE_AUDIOGRAM_DATA_EDEFAULT == null ? privateAudiogramData != null : !PRIVATE_AUDIOGRAM_DATA_EDEFAULT.equals(privateAudiogramData);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case AudiogramPackage.HIMSA_AUDIOMETRIC_STANDARD_TYPE__VERSION:
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
		result.append(" (privateAudiogramData: ");
		result.append(privateAudiogramData);
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HIMSAAudiometricStandardTypeImpl
