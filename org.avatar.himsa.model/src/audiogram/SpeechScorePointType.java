/*
 */
package audiogram;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Score Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point for Speech Scores, used by all speech audiograms
 * 
 * ## TSpeechPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link audiogram.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link audiogram.SpeechScorePointType#getScorePercent <em>Score Percent</em>}</li>
 *   <li>{@link audiogram.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getSpeechScorePointType()
 * @model extendedMetaData="name='SpeechScorePoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpeechScorePointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus Level of the stimulus channel in dB
	 * 
	 * ## intensity1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see audiogram.AudiogramPackage#getSpeechScorePointType_StimulusLevel()
	 * @model dataType="audiogram.StimulusLevelType4" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link audiogram.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Level</em>' attribute.
	 * @see #getStimulusLevel()
	 * @generated
	 */
	void setStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Level of the masking channel in dB
	 * 
	 * ## intensity2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see audiogram.AudiogramPackage#getSpeechScorePointType_MaskingLevel()
	 * @model dataType="audiogram.MaskingLevelType4"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link audiogram.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Score Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of correct repeated phonemes (words, syllables…) in percent
	 * 
	 * ## scorePct ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score Percent</em>' attribute.
	 * @see #setScorePercent(BigDecimal)
	 * @see audiogram.AudiogramPackage#getSpeechScorePointType_ScorePercent()
	 * @model dataType="audiogram.ScorePercentType" required="true"
	 *        extendedMetaData="kind='element' name='ScorePercent' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScorePercent();

	/**
	 * Sets the value of the '{@link audiogram.SpeechScorePointType#getScorePercent <em>Score Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Percent</em>' attribute.
	 * @see #getScorePercent()
	 * @generated
	 */
	void setScorePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Of Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of correctly repeated phonemes (words, syllables…) 
	 * 
	 * ## words ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Words</em>' attribute.
	 * @see #setNumberOfWords(BigInteger)
	 * @see audiogram.AudiogramPackage#getSpeechScorePointType_NumberOfWords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='NumberOfWords' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfWords();

	/**
	 * Sets the value of the '{@link audiogram.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Words</em>' attribute.
	 * @see #getNumberOfWords()
	 * @generated
	 */
	void setNumberOfWords(BigInteger value);

} // SpeechScorePointType
