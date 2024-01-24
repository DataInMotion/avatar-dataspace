/*
 */
package audiogram;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIMSA Audiometric Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getToneThresholdAudiogram <em>Tone Threshold Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getUncomfortableLevel <em>Uncomfortable Level</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getMostComfortableLevel <em>Most Comfortable Level</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getSpeechDiscriminationAudiogram <em>Speech Discrimination Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getSpeechReceptionThresholdAudiogram <em>Speech Reception Threshold Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getSpeechMostComfortableLevel <em>Speech Most Comfortable Level</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getSpeechUncomfortableLevel <em>Speech Uncomfortable Level</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getToneNotes <em>Tone Notes</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getSpeechNotes <em>Speech Notes</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage <em>Frequencies Used For Tone Average</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getDecayAudiogram <em>Decay Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram <em>Alternate Binaural Loudness Balance Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getStengerAudiogram <em>Stenger Audiogram</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getDifferenceLimenIntensity <em>Difference Limen Intensity</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getDifferenceLimenFrequency <em>Difference Limen Frequency</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getShortIncrementSensitivityIndex <em>Short Increment Sensitivity Index</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getPrivateAudiogramData <em>Private Audiogram Data</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link audiogram.HIMSAAudiometricStandardType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType()
 * @model extendedMetaData="name='HIMSAAudiometricStandard_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HIMSAAudiometricStandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tone Threshold Audiogram</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.ToneThresholdAudiogramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Tone Hearing Threshold (THR) Audiogram. This is the basic audiogram for
	 * recording the patient’s Hearing Threshold Level (HTL).
	 * 
	 * Method: Presentation of Pure tone stimulus via transducer. Masking in the opposite ear is
	 * frequently used. Threshold is defined as the 50% response level (softest level at which
	 * patient responds to tone 50% of the time).
	 * 
	 * Note that the max. 24 curve points can come in any order as [frequency, intensity] pairs.
	 * Each point is properly identified by its standard frequency for which the intensity is
	 * recorded.
	 * 
	 * Ref. [HOCA-5, Chapter 5, page 71: Puretone Evaluation ]
	 * 
	 * ## TToneTHRAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tone Threshold Audiogram</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_ToneThresholdAudiogram()
	 * @model containment="true" upper="18"
	 *        extendedMetaData="kind='element' name='ToneThresholdAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToneThresholdAudiogramType> getToneThresholdAudiogram();

	/**
	 * Returns the value of the '<em><b>Uncomfortable Level</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.UncomfortableLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uncomfortable Level Audiogram
	 * 
	 * The lowest signal level, in each ear, which is judged to be uncomfortably loud by the patient. The measurement is usually done with pure tones at audiometric frequencies but may be performed using speech-weighted noise; the signal level has to be expressed relative to a reference value, e.g. as hearing level.
	 * 
	 * Note that the max. 24 curve points can come in any order as [frequency, intensity] pairs.
	 * Each point is properly identified by its standard frequency for which the intensity is
	 * recorded.
	 * 
	 * Ref. [HOCA-5, Chapter 5, page 71: Puretone Evaluation]
	 * 
	 * ## TToneUCLAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uncomfortable Level</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_UncomfortableLevel()
	 * @model containment="true" upper="6"
	 *        extendedMetaData="kind='element' name='UncomfortableLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UncomfortableLevelType> getUncomfortableLevel();

	/**
	 * Returns the value of the '<em><b>Most Comfortable Level</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.MostComfortableLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Most Comfortable Level (MCL) Audiogram
	 * 
	 * This is an area within the residual hearing in which sounds are perceived as comfortable by the patient. 
	 * Tones presented during this test are pure tones and the patient is asked to respond when they find the sound comfortable. Generally audiologists now try to test to find this area of hearing by concentrating on finding the upper and lower levels of comfort.
	 * 
	 * Note that the max. 24 curve points can come in any order as [frequency, intensity] pairs.
	 * Each point is properly identified by its standard frequency for which the intensity is
	 * recorded.
	 * 
	 * Ref. [HOCA-5, Chapter 5, page 71: Puretone Evaluation]
	 * 
	 * ## TToneMCLAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Most Comfortable Level</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_MostComfortableLevel()
	 * @model containment="true" upper="6"
	 *        extendedMetaData="kind='element' name='MostComfortableLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MostComfortableLevelType> getMostComfortableLevel();

	/**
	 * Returns the value of the '<em><b>Speech Discrimination Audiogram</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.SpeechDiscriminationAudiogramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Discrimination is tested by having the speaker present a one syllable word, usually with a lead in sentence such as ’say the word..’ in lists of 25 or 50, which the listener repeats. These lists are standardized and weighted using all of the speech sounds heard in the chosen language. The percentage of words the listener repeats correctly is the discrimination score. The percentage correct is influenced by the type and degree of hearing loss present. This audiogram plots the results of this test against hearing level
	 * 
	 * Ref. [HOCA-5, Chapter 5, page 71: Speech Audiometry]
	 * 
	 * Note for individuals familiar with earlier versions of this data standard:
	 * In previous versions of this standard this Audiogram was documented as a discrimination loss audiogram.  The documentation implied that the score would represent the loss not the score.  However, this description was in conflict with the definition of the percent score.  To correct this documentation error HIMSA has changed the name and description.  
	 * 
	 * ## TSpeechDLAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Discrimination Audiogram</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_SpeechDiscriminationAudiogram()
	 * @model containment="true" upper="12"
	 *        extendedMetaData="kind='element' name='SpeechDiscriminationAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpeechDiscriminationAudiogramType> getSpeechDiscriminationAudiogram();

	/**
	 * Returns the value of the '<em><b>Speech Reception Threshold Audiogram</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.SpeechReceptionThresholdAudiogramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stucture for SRT, SDT, and SAT tests
	 * 
	 * SRT - Speech Reception Threshold Audiogram The SRT is also defined as the Threshold
	 * of Intelligibility (TI). It is defined as the presentation level (in dB HL) necessary for the
	 * patient to reach a score of 50 % when presented for a series of easily understandable
	 * phonemes. The SRT can be compared with the tone audiometry thresholds at the
	 * frequencies [500, 100, 2000] Hz.
	 * 
	 * The SRT measurement can be carried out as a validation of the Tone Threshold Audiogram.
	 * 
	 * SDT - Speech Detection threshold test / A single word is presented repeatedly and the intensity is increased in 5dB steps and decreased in 10dB steps (like pure tone audiometry) until the point where the patient indicates they can detect, but not repeat the speech heard. Threshold (again like pure tone audiometry) is taken as the level where the patient responds 2 out of 3 or 2 out of 4 times.
	 * 
	 * SAT - Speech Awareness Threshold Test / Same Description as of SDT
	 * 
	 * Set SpeechThreshold_Type to indicate the type of test
	 * 
	 * Ref. [HOCA-5, Chapter 7, page 96: Speech Audiometry]
	 * Ref. [HOCA-5, Chapter 32, page 584: Pseudohypacusis] 
	 * 
	 * ## TSpeechSRTAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Reception Threshold Audiogram</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_SpeechReceptionThresholdAudiogram()
	 * @model containment="true" upper="12"
	 *        extendedMetaData="kind='element' name='SpeechReceptionThresholdAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpeechReceptionThresholdAudiogramType> getSpeechReceptionThresholdAudiogram();

	/**
	 * Returns the value of the '<em><b>Speech Most Comfortable Level</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.SpeechMostComfortableLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Most Comfortable Level (MCL) Audiogram. Measurement of Discrimination
	 * Loss is done at Most Comfortable Loudness for the patient, normally 30-40 dB above the
	 * Speech Reception Threshold (SRT).
	 * 
	 * Some patients might find this level too high (recruitment present). This may make it
	 * difficult to find the correct level for recording the MCL speech audiogram. In such cases a
	 * complete speech audiogram curve should be recorded.  NOTE: only the very MCL point of the speech audiogram can be saved.
	 * 
	 * Ref. [HOCA-5, Chapter 7, page 96: Speech Audiometry]
	 * 
	 * ## TSpeechMCLAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Most Comfortable Level</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_SpeechMostComfortableLevel()
	 * @model containment="true" upper="12"
	 *        extendedMetaData="kind='element' name='SpeechMostComfortableLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpeechMostComfortableLevelType> getSpeechMostComfortableLevel();

	/**
	 * Returns the value of the '<em><b>Speech Uncomfortable Level</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.SpeechUncomfortableLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech UnComfortable Level (UCL) Audiogram. The SRT, MCL and UCL for speech
	 * audiograms are saved as a single intensity value.
	 * 
	 * A complete speech audiogram curve would show the whole range from Speech Reception Threshold
	 * (SRT), to Most Comfortable Level (MCL) to Uncomfortable Level (UCL)
	 * 
	 * Ref. [HOCA-5, Chapter 7, page 96: Speech Audiometry]
	 * 
	 * ## TSpeechUCLAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Uncomfortable Level</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_SpeechUncomfortableLevel()
	 * @model containment="true" upper="12"
	 *        extendedMetaData="kind='element' name='SpeechUncomfortableLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpeechUncomfortableLevelType> getSpeechUncomfortableLevel();

	/**
	 * Returns the value of the '<em><b>Tone Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes added to the Tone Audiogram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tone Notes</em>' containment reference.
	 * @see #setToneNotes(MeasurementNotesType)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_ToneNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ToneNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementNotesType getToneNotes();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getToneNotes <em>Tone Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone Notes</em>' containment reference.
	 * @see #getToneNotes()
	 * @generated
	 */
	void setToneNotes(MeasurementNotesType value);

	/**
	 * Returns the value of the '<em><b>Speech Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes added to the Speech Audiogram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Notes</em>' containment reference.
	 * @see #setSpeechNotes(MeasurementNotesType)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_SpeechNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpeechNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementNotesType getSpeechNotes();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getSpeechNotes <em>Speech Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Notes</em>' containment reference.
	 * @see #getSpeechNotes()
	 * @generated
	 */
	void setSpeechNotes(MeasurementNotesType value);

	/**
	 * Returns the value of the '<em><b>Frequencies Used For Tone Average</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This structure allows specification of certain frequencies at which the pure tone average should be calculated. Each ear has two average values to allow for “double-weighting” of certain values as required in certain countries like Japan.
	 * 
	 * The average calculation method is applied to all averages for the given ear, so there is no
	 * opportunity to specify a different pure tone average calculation method for bone
	 * conduction than is used for air conduction, etc.
	 * 
	 * The rationale behind only a single set of information for each of left and right ears is that it
	 * really does not make sense to calculate the average differently between two different tests.
	 * 
	 * A note on the double weighting: Essentially, if the set specifies to weight averages at
	 * 500,1000,1500 Hz and the second specifies 1000 Hz, then the average would be calculated
	 * as follows:
	 * 
	 * (ValueAt(500) + (2 * ValueAt(1000)) + ValueAt(1500)) / 4
	 * 
	 * If the ValueAt(1000) for the left ear is maybe unreliable, a better average is sought for
	 * that ear but you can still leave the right ear calculation unchanged.
	 * 
	 * Ref. [HOCA-5, Chapter 5, page 71: Puretone Evaluation ]
	 * 
	 * ## TToneAvgCalcValues ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequencies Used For Tone Average</em>' containment reference.
	 * @see #setFrequenciesUsedForToneAverage(FrequenciesUsedForToneAverageType)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_FrequenciesUsedForToneAverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FrequenciesUsedForToneAverage' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequenciesUsedForToneAverageType getFrequenciesUsedForToneAverage();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getFrequenciesUsedForToneAverage <em>Frequencies Used For Tone Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequencies Used For Tone Average</em>' containment reference.
	 * @see #getFrequenciesUsedForToneAverage()
	 * @generated
	 */
	void setFrequenciesUsedForToneAverage(FrequenciesUsedForToneAverageType value);

	/**
	 * Returns the value of the '<em><b>Decay Audiogram</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.DecayAudiogramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Testing involves the presentation of a sustained pure tone at or above the patient’s hearing threshold. The patient indicates when the tone is heard and when it disappears. The tone is presented at increasing levels until it is continuously heard for a set amount of time.
	 * 
	 * Tone decay is defined as a reduction in the ability to hear a sustained tone, and is indicative of a retrocochlear hearing loss. 
	 * 
	 * Tone decay can be carried out at any frequency, and methods including the presentation levels vary in the research literature.
	 * 
	 * 
	 * Ref. [HOCA-5, Chapter 8, page 111: Cochlear and Retrocochlear Behavioral Tests ]
	 * 
	 * ## TDecayAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decay Audiogram</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_DecayAudiogram()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='DecayAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DecayAudiogramType> getDecayAudiogram();

	/**
	 * Returns the value of the '<em><b>Alternate Binaural Loudness Balance Audiogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sound of constant intensity is presented to the patient’s good ear for a few seconds. A sound is then presented to the patient’s bad ear. The patient is asked to judge if the sounds are of equal loudness. The sound in the bad ear is varied until a loudness match with the good ear is found.
	 * 
	 * The level of the tone presented to the good ear is then increased and the procedure repeated.
	 * At each frequency tested a graph is produced where equal loudness judgments are connected with a straight line.
	 * 
	 * Abnormal growth of loudness is an indication of cochlear hearing loss and is termed recruitment.
	 * 
	 * Ref. [HOCA-5, Chapter 8, page 111: Cochlear and Retrocochlear Behavioral Tests ]
	 * 
	 * ## TABLBAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Binaural Loudness Balance Audiogram</em>' containment reference.
	 * @see #setAlternateBinauralLoudnessBalanceAudiogram(AlternateBinauralLoudnessBalanceAudiogramType)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_AlternateBinauralLoudnessBalanceAudiogram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlternateBinauralLoudnessBalanceAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	AlternateBinauralLoudnessBalanceAudiogramType getAlternateBinauralLoudnessBalanceAudiogram();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getAlternateBinauralLoudnessBalanceAudiogram <em>Alternate Binaural Loudness Balance Audiogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Binaural Loudness Balance Audiogram</em>' containment reference.
	 * @see #getAlternateBinauralLoudnessBalanceAudiogram()
	 * @generated
	 */
	void setAlternateBinauralLoudnessBalanceAudiogram(AlternateBinauralLoudnessBalanceAudiogramType value);

	/**
	 * Returns the value of the '<em><b>Stenger Audiogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Stenger test is used when a patient claims that his hearing is impaired in one ear but the Audiologists does not believe them.  
	 * 
	 * This test can only be performed if the difference in thresholds between ears is ≥ 20 dB. It involves presentation of a tone of one frequency to both ears and is based on the principle that when 2 tones of the same frequency are introduced simultaneously to both ears, only the louder tone will be perceived. The audiometer should allow separate intensity control for each channel.
	 * 
	 * The tone is first introduced to the good ear at a level which is 5-10 dB above the known
	 * threshold. The same frequency tone is then simultaneously presented to the “bad” ear at a
	 * level 10 dB below the (admitted) threshold. If the patient is simulating a hearing loss he
	 * would hear the tone louder in the bad ear, and would, therefore, not respond to the tone,
	 * since he/she does not want to admit to hearing in the bad ear and is unaware of the tone in
	 * the good ear.
	 * 
	 * If the patient has a loss in the bad ear as measured, he/she will respond to the tone in the
	 * good ear.  If the patient was found to be dishonest then a new audiogram would be saved.
	 * 
	 * Note that the max. 24 curve points can come in any order as [frequency, intensity] pairs.
	 * Each point is properly identified by its standard frequency for which the intensity is
	 * recorded.
	 * 
	 * Ref. [HOCA-5 chapter 32, page 584: Pseudohypacusis] 
	 * 
	 * ## TSTStengerAudiogram#
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stenger Audiogram</em>' containment reference.
	 * @see #setStengerAudiogram(StengerAudiogramType)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_StengerAudiogram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StengerAudiogram' namespace='##targetNamespace'"
	 * @generated
	 */
	StengerAudiogramType getStengerAudiogram();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getStengerAudiogram <em>Stenger Audiogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stenger Audiogram</em>' containment reference.
	 * @see #getStengerAudiogram()
	 * @generated
	 */
	void setStengerAudiogram(StengerAudiogramType value);

	/**
	 * Returns the value of the '<em><b>Difference Limen Intensity</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.DifferenceLimenIntensityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Difference Limen Intensity Audiogram also called Amplitude Modulation (AM) Test or
	 * the Lüscher-Zwislocki test. In this audiogram, an Amplitude Modulation is added to a
	 * steady tone, and the patient is asked to indicate the smallest variation he can detect.
	 * 
	 * The result is then recorded in dB. The most significant level of recording is found to be
	 * approx. 40 dB above the hearing threshold.
	 * 
	 * Ref. [HOCA-5 chapter 3, page 33: Pseudohypacusis] 
	 * 
	 * ## TDLIAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difference Limen Intensity</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_DifferenceLimenIntensity()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='DifferenceLimenIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DifferenceLimenIntensityType> getDifferenceLimenIntensity();

	/**
	 * Returns the value of the '<em><b>Difference Limen Frequency</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.DifferenceLimenFrequencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Difference Limen Frequency Audiogram also called Frequency Modulation (FM) Test. In
	 * this audiogram, a Frequency Modulation is added to a steady tone, and the patient is asked
	 * to indicate the smallest variation he can detect. This test is used to diagnose abnormal growth of loudness in cochlear hearing losses.
	 * 
	 * The result is then recorded in percentage.  
	 * 
	 * Ref. [HOCA-5 chapter 8, page 111: Cochlear and Retrocochlear Behavioral Tests ] 
	 * Ref. [HOCA-5 chapter 3, page 33: Pseudohypacusis] 
	 * 
	 * ## TDLFAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difference Limen Frequency</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_DifferenceLimenFrequency()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='DifferenceLimenFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DifferenceLimenFrequencyType> getDifferenceLimenFrequency();

	/**
	 * Returns the value of the '<em><b>Short Increment Sensitivity Index</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram.ShortIncrementSensitivityIndexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short increment sensitivity index testing is where a continuous tone is presented 20dB above HTL and every 5 seconds the intensity of that tone increases by 1 dB and is held at that level for one- fifth of a second before reducing back to the original level. The patient signals if the rise is heard. 20 rises are presented and the score then multiplied by 5 to give a percentage score. People with cochlear losses are likely to score above 70% where as normal hearing and other losses typically score less than 30% 
	 * 
	 * Ref. [HOCA-5 chapter 8, page 111: Cochlear and Retrocochlear Behavioral Tests] 
	 * 
	 * ## TSISIAudiogram ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Increment Sensitivity Index</em>' containment reference list.
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_ShortIncrementSensitivityIndex()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='ShortIncrementSensitivityIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShortIncrementSensitivityIndexType> getShortIncrementSensitivityIndex();

	/**
	 * Returns the value of the '<em><b>Private Audiogram Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the past it was allowed by HIMSA to save privately formatted data in the unused section of the public storage area of a NOAH action.  This usage was used mainly because more space was allocated for public storage versus private.  At present this is no longer an issue as equal storage is allocated to both public and private data storage.
	 * 
	 * This elements primary function is to pass along any private data stored in the public area as base64 encoded data.  NOAH is not performing any translation or conversion of data.
	 * 
	 * This data will never be converted back to an earlier version of a Audiogram data standard.  For example, if an audiogram format 500 is saved with this element populated and then an older NOAH compatible fitting module tries to read the Audiogram (causing a conversion down to format 200) this data will be ignored by the converter process.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Audiogram Data</em>' attribute.
	 * @see #setPrivateAudiogramData(byte[])
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_PrivateAudiogramData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PrivateAudiogramData' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPrivateAudiogramData();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getPrivateAudiogramData <em>Private Audiogram Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Audiogram Data</em>' attribute.
	 * @see #getPrivateAudiogramData()
	 * @generated
	 */
	void setPrivateAudiogramData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software saving data formatted via this XSD file should not use this element for storage.  The intention is for Noah data convertors to fill in an appropriate value for runtime conversions - not permanent storage.
	 * 
	 * Please note that values less than 500 mean that the data was originally stored in a format which was not validated by Noah before storage.  This could mean that the data will not validated against this version
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_ConvertedFromDataStandard()
	 * @model dataType="audiogram.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 */
	void setConvertedFromDataStandard(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is no longer in use.  The original intention was for Noah to fill in the value but the idea was never fully implemented and not needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_ValidatedByNOAH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ValidatedByNOAH'"
	 * @generated
	 */
	boolean isValidatedByNOAH();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated By NOAH</em>' attribute.
	 * @see #isSetValidatedByNOAH()
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @generated
	 */
	void setValidatedByNOAH(boolean value);

	/**
	 * Unsets the value of the '{@link audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	void unsetValidatedByNOAH();

	/**
	 * Returns whether the value of the '{@link audiogram.HIMSAAudiometricStandardType#isValidatedByNOAH <em>Validated By NOAH</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validated By NOAH</em>' attribute is set.
	 * @see #unsetValidatedByNOAH()
	 * @see #isValidatedByNOAH()
	 * @see #setValidatedByNOAH(boolean)
	 * @generated
	 */
	boolean isSetValidatedByNOAH();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see audiogram.AudiogramPackage#getHIMSAAudiometricStandardType_Version()
	 * @model default="500" unsettable="true" dataType="audiogram.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link audiogram.HIMSAAudiometricStandardType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link audiogram.HIMSAAudiometricStandardType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // HIMSAAudiometricStandardType
