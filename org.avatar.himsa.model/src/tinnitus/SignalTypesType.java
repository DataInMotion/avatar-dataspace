/*
 */
package tinnitus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Signal Types Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of Signal used in the measurement. The Other type should be specified in the OtherSignalType element. 
 * <!-- end-model-doc -->
 * @see tinnitus.TinnitusPackage#getSignalTypesType()
 * @model extendedMetaData="name='Signal_Types_._type'"
 * @generated
 */
@ProviderType
public enum SignalTypesType implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown or unlisted signal type
	 * <!-- end-model-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>No Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No signal applied
	 * <!-- end-model-doc -->
	 * @see #NO_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SIGNAL(1, "NoSignal", "NoSignal"),

	/**
	 * The '<em><b>Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sinusoidal tone
	 * <!-- end-model-doc -->
	 * @see #TONE_VALUE
	 * @generated
	 * @ordered
	 */
	TONE(2, "Tone", "Tone"),

	/**
	 * The '<em><b>Warble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #WARBLE_VALUE
	 * @generated
	 * @ordered
	 */
	WARBLE(3, "Warble", "Warble"),

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrow Band Noise
	 * <!-- end-model-doc -->
	 * @see #NARROW_BAND_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	NARROW_BAND_NOISE(4, "NarrowBandNoise", "NarrowBandNoise"),

	/**
	 * The '<em><b>Two Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_TONE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_TONE(5, "TwoTone", "TwoTone"),

	/**
	 * The '<em><b>White Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * white noise, constant power spectral density
	 * <!-- end-model-doc -->
	 * @see #WHITE_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_NOISE(6, "WhiteNoise", "WhiteNoise"),

	/**
	 * The '<em><b>Pink Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pink Noise, each octave have an equal amount of noise power
	 * <!-- end-model-doc -->
	 * @see #PINK_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	PINK_NOISE(7, "PinkNoise", "PinkNoise"),

	/**
	 * The '<em><b>Rainbow Passage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rainbow Passage signal
	 * <!-- end-model-doc -->
	 * @see #RAINBOW_PASSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RAINBOW_PASSAGE(8, "RainbowPassage", "RainbowPassage"),

	/**
	 * The '<em><b>Speech Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech with Noise
	 * <!-- end-model-doc -->
	 * @see #SPEECH_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_NOISE(9, "SpeechNoise", "SpeechNoise"),

	/**
	 * The '<em><b>Speech Like</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Like signal
	 * <!-- end-model-doc -->
	 * @see #SPEECH_LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_LIKE(10, "SpeechLike", "SpeechLike"),

	/**
	 * The '<em><b>Loud Speech</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loud Speech
	 * <!-- end-model-doc -->
	 * @see #LOUD_SPEECH_VALUE
	 * @generated
	 * @ordered
	 */
	LOUD_SPEECH(11, "LoudSpeech", "LoudSpeech"),

	/**
	 * The '<em><b>Own Voice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patients own voice
	 * <!-- end-model-doc -->
	 * @see #OWN_VOICE_VALUE
	 * @generated
	 * @ordered
	 */
	OWN_VOICE(12, "OwnVoice", "OwnVoice"),

	/**
	 * The '<em><b>Icra2pb1f1mn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology,  2 persons babble, 1 female, 1 male, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA2PB1F1MN_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA2PB1F1MN(13, "Icra2pb1f1mn", "Icra2pb1f1mn"),

	/**
	 * The '<em><b>Icra3bsmnfn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 3 band speech modulated noise, Female weighted, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA3BSMNFN_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA3BSMNFN(14, "Icra3bsmnfn", "Icra3bsmnfn"),

	/**
	 * The '<em><b>Icra3bsmnmn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 3 band speech modulated noise, Male weighted, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA3BSMNMN_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA3BSMNMN(15, "Icra3bsmnmn", "Icra3bsmnmn"),

	/**
	 * The '<em><b>Icra6pbl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Loud effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBL_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA6PBL(16, "Icra6pbl", "Icra6pbl"),

	/**
	 * The '<em><b>Icra6pbn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Normal effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBN_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA6PBN(17, "Icra6pbn", "Icra6pbn"),

	/**
	 * The '<em><b>Icra6pbr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Raised effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBR_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA6PBR(18, "Icra6pbr", "Icra6pbr"),

	/**
	 * The '<em><b>Icra Urgnml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Loud effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNML_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA_URGNML(19, "IcraUrgnml", "IcraUrgnml"),

	/**
	 * The '<em><b>Icra Urgnmn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Normal effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNMN_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA_URGNMN(20, "IcraUrgnmn", "IcraUrgnmn"),

	/**
	 * The '<em><b>Icra Urgnmr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Raised effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNMR_VALUE
	 * @generated
	 * @ordered
	 */
	ICRA_URGNMR(21, "IcraUrgnmr", "IcraUrgnmr"),

	/**
	 * The '<em><b>Speech Noise ILTASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Noise, the international long-term average speech spectrum 
	 * <!-- end-model-doc -->
	 * @see #SPEECH_NOISE_ILTASS_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_NOISE_ILTASS(22, "SpeechNoiseILTASS", "SpeechNoiseILTASS"),

	/**
	 * The '<em><b>Aurins</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #AURINS_VALUE
	 * @generated
	 * @ordered
	 */
	AURINS(23, "Aurins", "Aurins"),

	/**
	 * The '<em><b>ISTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Speech Test Signal
	 * <!-- end-model-doc -->
	 * @see #ISTS_VALUE
	 * @generated
	 * @ordered
	 */
	ISTS(24, "ISTS", "ISTS"),

	/**
	 * The '<em><b>EUHAMPO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISTS presented at 55 dB SPL together with short, loud sequential sinusoids.
	 * <!-- end-model-doc -->
	 * @see #EUHAMPO_VALUE
	 * @generated
	 * @ordered
	 */
	EUHAMPO(25, "EUHAMPO", "EUHA-MPO"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(26, "Other", "Other");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown or unlisted signal type
	 * <!-- end-model-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>No Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No signal applied
	 * <!-- end-model-doc -->
	 * @see #NO_SIGNAL
	 * @model name="NoSignal"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SIGNAL_VALUE = 1;

	/**
	 * The '<em><b>Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sinusoidal tone
	 * <!-- end-model-doc -->
	 * @see #TONE
	 * @model name="Tone"
	 * @generated
	 * @ordered
	 */
	public static final int TONE_VALUE = 2;

	/**
	 * The '<em><b>Warble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #WARBLE
	 * @model name="Warble"
	 * @generated
	 * @ordered
	 */
	public static final int WARBLE_VALUE = 3;

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrow Band Noise
	 * <!-- end-model-doc -->
	 * @see #NARROW_BAND_NOISE
	 * @model name="NarrowBandNoise"
	 * @generated
	 * @ordered
	 */
	public static final int NARROW_BAND_NOISE_VALUE = 4;

	/**
	 * The '<em><b>Two Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_TONE
	 * @model name="TwoTone"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_TONE_VALUE = 5;

	/**
	 * The '<em><b>White Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * white noise, constant power spectral density
	 * <!-- end-model-doc -->
	 * @see #WHITE_NOISE
	 * @model name="WhiteNoise"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_NOISE_VALUE = 6;

	/**
	 * The '<em><b>Pink Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pink Noise, each octave have an equal amount of noise power
	 * <!-- end-model-doc -->
	 * @see #PINK_NOISE
	 * @model name="PinkNoise"
	 * @generated
	 * @ordered
	 */
	public static final int PINK_NOISE_VALUE = 7;

	/**
	 * The '<em><b>Rainbow Passage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rainbow Passage signal
	 * <!-- end-model-doc -->
	 * @see #RAINBOW_PASSAGE
	 * @model name="RainbowPassage"
	 * @generated
	 * @ordered
	 */
	public static final int RAINBOW_PASSAGE_VALUE = 8;

	/**
	 * The '<em><b>Speech Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech with Noise
	 * <!-- end-model-doc -->
	 * @see #SPEECH_NOISE
	 * @model name="SpeechNoise"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_NOISE_VALUE = 9;

	/**
	 * The '<em><b>Speech Like</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Like signal
	 * <!-- end-model-doc -->
	 * @see #SPEECH_LIKE
	 * @model name="SpeechLike"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_LIKE_VALUE = 10;

	/**
	 * The '<em><b>Loud Speech</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loud Speech
	 * <!-- end-model-doc -->
	 * @see #LOUD_SPEECH
	 * @model name="LoudSpeech"
	 * @generated
	 * @ordered
	 */
	public static final int LOUD_SPEECH_VALUE = 11;

	/**
	 * The '<em><b>Own Voice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patients own voice
	 * <!-- end-model-doc -->
	 * @see #OWN_VOICE
	 * @model name="OwnVoice"
	 * @generated
	 * @ordered
	 */
	public static final int OWN_VOICE_VALUE = 12;

	/**
	 * The '<em><b>Icra2pb1f1mn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology,  2 persons babble, 1 female, 1 male, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA2PB1F1MN
	 * @model name="Icra2pb1f1mn"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA2PB1F1MN_VALUE = 13;

	/**
	 * The '<em><b>Icra3bsmnfn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 3 band speech modulated noise, Female weighted, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA3BSMNFN
	 * @model name="Icra3bsmnfn"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA3BSMNFN_VALUE = 14;

	/**
	 * The '<em><b>Icra3bsmnmn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 3 band speech modulated noise, Male weighted, Normal effort.
	 * <!-- end-model-doc -->
	 * @see #ICRA3BSMNMN
	 * @model name="Icra3bsmnmn"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA3BSMNMN_VALUE = 15;

	/**
	 * The '<em><b>Icra6pbl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Loud effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBL
	 * @model name="Icra6pbl"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA6PBL_VALUE = 16;

	/**
	 * The '<em><b>Icra6pbn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Normal effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBN
	 * @model name="Icra6pbn"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA6PBN_VALUE = 17;

	/**
	 * The '<em><b>Icra6pbr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, 6 persons babble, Raised effort
	 * <!-- end-model-doc -->
	 * @see #ICRA6PBR
	 * @model name="Icra6pbr"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA6PBR_VALUE = 18;

	/**
	 * The '<em><b>Icra Urgnml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Loud effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNML
	 * @model name="IcraUrgnml"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA_URGNML_VALUE = 19;

	/**
	 * The '<em><b>Icra Urgnmn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Normal effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNMN
	 * @model name="IcraUrgnmn"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA_URGNMN_VALUE = 20;

	/**
	 * The '<em><b>Icra Urgnmr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Collegium of Rehabilitative Audiology, Unmodulated random gaussian noise. Male weighted, Raised effort
	 * <!-- end-model-doc -->
	 * @see #ICRA_URGNMR
	 * @model name="IcraUrgnmr"
	 * @generated
	 * @ordered
	 */
	public static final int ICRA_URGNMR_VALUE = 21;

	/**
	 * The '<em><b>Speech Noise ILTASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speech Noise, the international long-term average speech spectrum 
	 * <!-- end-model-doc -->
	 * @see #SPEECH_NOISE_ILTASS
	 * @model name="SpeechNoiseILTASS"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_NOISE_ILTASS_VALUE = 22;

	/**
	 * The '<em><b>Aurins</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #AURINS
	 * @model name="Aurins"
	 * @generated
	 * @ordered
	 */
	public static final int AURINS_VALUE = 23;

	/**
	 * The '<em><b>ISTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * International Speech Test Signal
	 * <!-- end-model-doc -->
	 * @see #ISTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISTS_VALUE = 24;

	/**
	 * The '<em><b>EUHAMPO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISTS presented at 55 dB SPL together with short, loud sequential sinusoids.
	 * <!-- end-model-doc -->
	 * @see #EUHAMPO
	 * @model literal="EUHA-MPO"
	 * @generated
	 * @ordered
	 */
	public static final int EUHAMPO_VALUE = 25;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 26;

	/**
	 * An array of all the '<em><b>Signal Types Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalTypesType[] VALUES_ARRAY =
		new SignalTypesType[] {
			UNDEFINED,
			NO_SIGNAL,
			TONE,
			WARBLE,
			NARROW_BAND_NOISE,
			TWO_TONE,
			WHITE_NOISE,
			PINK_NOISE,
			RAINBOW_PASSAGE,
			SPEECH_NOISE,
			SPEECH_LIKE,
			LOUD_SPEECH,
			OWN_VOICE,
			ICRA2PB1F1MN,
			ICRA3BSMNFN,
			ICRA3BSMNMN,
			ICRA6PBL,
			ICRA6PBN,
			ICRA6PBR,
			ICRA_URGNML,
			ICRA_URGNMN,
			ICRA_URGNMR,
			SPEECH_NOISE_ILTASS,
			AURINS,
			ISTS,
			EUHAMPO,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Types Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalTypesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Types Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalTypesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Types Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalTypesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Types Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypesType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case NO_SIGNAL_VALUE: return NO_SIGNAL;
			case TONE_VALUE: return TONE;
			case WARBLE_VALUE: return WARBLE;
			case NARROW_BAND_NOISE_VALUE: return NARROW_BAND_NOISE;
			case TWO_TONE_VALUE: return TWO_TONE;
			case WHITE_NOISE_VALUE: return WHITE_NOISE;
			case PINK_NOISE_VALUE: return PINK_NOISE;
			case RAINBOW_PASSAGE_VALUE: return RAINBOW_PASSAGE;
			case SPEECH_NOISE_VALUE: return SPEECH_NOISE;
			case SPEECH_LIKE_VALUE: return SPEECH_LIKE;
			case LOUD_SPEECH_VALUE: return LOUD_SPEECH;
			case OWN_VOICE_VALUE: return OWN_VOICE;
			case ICRA2PB1F1MN_VALUE: return ICRA2PB1F1MN;
			case ICRA3BSMNFN_VALUE: return ICRA3BSMNFN;
			case ICRA3BSMNMN_VALUE: return ICRA3BSMNMN;
			case ICRA6PBL_VALUE: return ICRA6PBL;
			case ICRA6PBN_VALUE: return ICRA6PBN;
			case ICRA6PBR_VALUE: return ICRA6PBR;
			case ICRA_URGNML_VALUE: return ICRA_URGNML;
			case ICRA_URGNMN_VALUE: return ICRA_URGNMN;
			case ICRA_URGNMR_VALUE: return ICRA_URGNMR;
			case SPEECH_NOISE_ILTASS_VALUE: return SPEECH_NOISE_ILTASS;
			case AURINS_VALUE: return AURINS;
			case ISTS_VALUE: return ISTS;
			case EUHAMPO_VALUE: return EUHAMPO;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SignalTypesType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SignalTypesType
