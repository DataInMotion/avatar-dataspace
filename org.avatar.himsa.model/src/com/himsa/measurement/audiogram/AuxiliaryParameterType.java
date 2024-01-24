/*
 */
package com.himsa.measurement.audiogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Auxiliary Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Typically used with speech testing
 * 
 * Types of word list used to carry out speech testing. Some are used for speech discrimination testing but others are there for more specific tests of speech understanding in noise for example. This does not define the actual word list used by name just by the type
 * 
 * ## TAUXParm ##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getAuxiliaryParameterType()
 * @model extendedMetaData="name='AuxiliaryParameter_Type'"
 * @generated
 */
@ProviderType
public enum AuxiliaryParameterType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>No Auxiliary Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_AUXILIARY_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_AUXILIARY_PARAMETER(1, "NoAuxiliaryParameter", "NoAuxiliaryParameter"),

	/**
	 * The '<em><b>Mono Syllabic Words</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONO_SYLLABIC_WORDS_VALUE
	 * @generated
	 * @ordered
	 */
	MONO_SYLLABIC_WORDS(2, "MonoSyllabicWords", "MonoSyllabicWords"),

	/**
	 * The '<em><b>Multi Syllabic Words</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_SYLLABIC_WORDS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_SYLLABIC_WORDS(3, "MultiSyllabicWords", "MultiSyllabicWords"),

	/**
	 * The '<em><b>Dichotic Words</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICHOTIC_WORDS_VALUE
	 * @generated
	 * @ordered
	 */
	DICHOTIC_WORDS(4, "DichoticWords", "DichoticWords"),

	/**
	 * The '<em><b>Freiburger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER_VALUE
	 * @generated
	 * @ordered
	 */
	FREIBURGER(5, "Freiburger", "Freiburger"),

	/**
	 * The '<em><b>Reim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIM_VALUE
	 * @generated
	 * @ordered
	 */
	REIM(6, "Reim", "Reim"),

	/**
	 * The '<em><b>Numerals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERALS_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERALS(7, "Numerals", "Numerals"),

	/**
	 * The '<em><b>Spondaic Words</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONDAIC_WORDS_VALUE
	 * @generated
	 * @ordered
	 */
	SPONDAIC_WORDS(8, "SpondaicWords", "SpondaicWords"),

	/**
	 * The '<em><b>Conversational Speech</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSATIONAL_SPEECH_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERSATIONAL_SPEECH(9, "ConversationalSpeech", "ConversationalSpeech"),

	/**
	 * The '<em><b>Phonetically Balanced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONETICALLY_BALANCED_VALUE
	 * @generated
	 * @ordered
	 */
	PHONETICALLY_BALANCED(10, "PhoneticallyBalanced", "PhoneticallyBalanced"),

	/**
	 * The '<em><b>Sentence Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SENTENCE_MATERIAL(11, "SentenceMaterial", "SentenceMaterial"),

	/**
	 * The '<em><b>Body Parts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_PARTS_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_PARTS(12, "BodyParts", "BodyParts"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(13, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(14, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(15, "User3", "User3");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>No Auxiliary Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_AUXILIARY_PARAMETER
	 * @model name="NoAuxiliaryParameter"
	 * @generated
	 * @ordered
	 */
	public static final int NO_AUXILIARY_PARAMETER_VALUE = 1;

	/**
	 * The '<em><b>Mono Syllabic Words</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONO_SYLLABIC_WORDS
	 * @model name="MonoSyllabicWords"
	 * @generated
	 * @ordered
	 */
	public static final int MONO_SYLLABIC_WORDS_VALUE = 2;

	/**
	 * The '<em><b>Multi Syllabic Words</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_SYLLABIC_WORDS
	 * @model name="MultiSyllabicWords"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_SYLLABIC_WORDS_VALUE = 3;

	/**
	 * The '<em><b>Dichotic Words</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICHOTIC_WORDS
	 * @model name="DichoticWords"
	 * @generated
	 * @ordered
	 */
	public static final int DICHOTIC_WORDS_VALUE = 4;

	/**
	 * The '<em><b>Freiburger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER
	 * @model name="Freiburger"
	 * @generated
	 * @ordered
	 */
	public static final int FREIBURGER_VALUE = 5;

	/**
	 * The '<em><b>Reim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIM
	 * @model name="Reim"
	 * @generated
	 * @ordered
	 */
	public static final int REIM_VALUE = 6;

	/**
	 * The '<em><b>Numerals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERALS
	 * @model name="Numerals"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERALS_VALUE = 7;

	/**
	 * The '<em><b>Spondaic Words</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONDAIC_WORDS
	 * @model name="SpondaicWords"
	 * @generated
	 * @ordered
	 */
	public static final int SPONDAIC_WORDS_VALUE = 8;

	/**
	 * The '<em><b>Conversational Speech</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSATIONAL_SPEECH
	 * @model name="ConversationalSpeech"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERSATIONAL_SPEECH_VALUE = 9;

	/**
	 * The '<em><b>Phonetically Balanced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONETICALLY_BALANCED
	 * @model name="PhoneticallyBalanced"
	 * @generated
	 * @ordered
	 */
	public static final int PHONETICALLY_BALANCED_VALUE = 10;

	/**
	 * The '<em><b>Sentence Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_MATERIAL
	 * @model name="SentenceMaterial"
	 * @generated
	 * @ordered
	 */
	public static final int SENTENCE_MATERIAL_VALUE = 11;

	/**
	 * The '<em><b>Body Parts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_PARTS
	 * @model name="BodyParts"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_PARTS_VALUE = 12;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 13;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 14;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 15;

	/**
	 * An array of all the '<em><b>Auxiliary Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuxiliaryParameterType[] VALUES_ARRAY =
		new AuxiliaryParameterType[] {
			UNKNOWN,
			NO_AUXILIARY_PARAMETER,
			MONO_SYLLABIC_WORDS,
			MULTI_SYLLABIC_WORDS,
			DICHOTIC_WORDS,
			FREIBURGER,
			REIM,
			NUMERALS,
			SPONDAIC_WORDS,
			CONVERSATIONAL_SPEECH,
			PHONETICALLY_BALANCED,
			SENTENCE_MATERIAL,
			BODY_PARTS,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Auxiliary Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuxiliaryParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Auxiliary Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuxiliaryParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuxiliaryParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auxiliary Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuxiliaryParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuxiliaryParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auxiliary Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuxiliaryParameterType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_AUXILIARY_PARAMETER_VALUE: return NO_AUXILIARY_PARAMETER;
			case MONO_SYLLABIC_WORDS_VALUE: return MONO_SYLLABIC_WORDS;
			case MULTI_SYLLABIC_WORDS_VALUE: return MULTI_SYLLABIC_WORDS;
			case DICHOTIC_WORDS_VALUE: return DICHOTIC_WORDS;
			case FREIBURGER_VALUE: return FREIBURGER;
			case REIM_VALUE: return REIM;
			case NUMERALS_VALUE: return NUMERALS;
			case SPONDAIC_WORDS_VALUE: return SPONDAIC_WORDS;
			case CONVERSATIONAL_SPEECH_VALUE: return CONVERSATIONAL_SPEECH;
			case PHONETICALLY_BALANCED_VALUE: return PHONETICALLY_BALANCED;
			case SENTENCE_MATERIAL_VALUE: return SENTENCE_MATERIAL;
			case BODY_PARTS_VALUE: return BODY_PARTS;
			case USER1_VALUE: return USER1;
			case USER2_VALUE: return USER2;
			case USER3_VALUE: return USER3;
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
	private AuxiliaryParameterType(int value, String name, String literal) {
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
	
} //AuxiliaryParameterType
