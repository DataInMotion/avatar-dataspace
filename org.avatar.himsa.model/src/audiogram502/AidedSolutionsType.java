/*
 */
package audiogram502;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aided Solutions Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 * + None / no solution operational
 * 
 * + EarOccluded / ear canal occluded with use of headphone, foam insert, insert phone
 * 
 * + AcousticHearingAid / hearing aid delivering sound to the ear canal using air conduction
 * 			+ BoneConductionHearing Aid / 	hearing aid delivering sound to the cochlea using bone conduction (not surgically implanted)
 * 
 * + BoneAnchoredHearing Aid / implanted hearing aid delivering sound to the cochlea using bone conduction
 * 
 * + CochlearImplant / device implanted in the cochlea allowing electrical stimulation of the auditory nerve 
 * 
 * + ElectroacousticStimulation / Device that combines an acoustic hearing aid with a cochlear implant resulting in partial acoustic stimulation and partial electrical stimulation of the auditory nerve, eg. MedEl Synchrony EAS, Cochlear Nucleus Hybrid
 * 
 * + MiddleEarImplant / o	Device implanted in the middle ear that mechanically drives the ossicles, eg. Envoy Medical Esteem, MedEl Vibrant Soundbridge
 * 			+ AuditoryBrainstemImplant / Device implanted in the brainstem that stimulates the cochlear nucleus, eg. MedEl ABI, Cochlear Nucleus ABI
 * 
 * <!-- end-model-doc -->
 * @see audiogram502.Audiogram502Package#getAidedSolutionsType()
 * @model extendedMetaData="name='AidedSolutions_Type'"
 * @generated
 */
@ProviderType
public enum AidedSolutionsType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Ear Occluded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAR_OCCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	EAR_OCCLUDED(1, "EarOccluded", "EarOccluded"),

	/**
	 * The '<em><b>Acoustic Hearing Aid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_HEARING_AID_VALUE
	 * @generated
	 * @ordered
	 */
	ACOUSTIC_HEARING_AID(2, "AcousticHearingAid", "AcousticHearingAid"),

	/**
	 * The '<em><b>Bone Conduction Hearing Aid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTION_HEARING_AID_VALUE
	 * @generated
	 * @ordered
	 */
	BONE_CONDUCTION_HEARING_AID(3, "BoneConductionHearingAid", "BoneConductionHearingAid"),

	/**
	 * The '<em><b>Bone Anchored Hearing Aid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_ANCHORED_HEARING_AID_VALUE
	 * @generated
	 * @ordered
	 */
	BONE_ANCHORED_HEARING_AID(4, "BoneAnchoredHearingAid", "BoneAnchoredHearingAid"),

	/**
	 * The '<em><b>Cochlear Implant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT_VALUE
	 * @generated
	 * @ordered
	 */
	COCHLEAR_IMPLANT(5, "CochlearImplant", "CochlearImplant"),

	/**
	 * The '<em><b>Electroacoustic Stimulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTROACOUSTIC_STIMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTROACOUSTIC_STIMULATION(6, "ElectroacousticStimulation", "ElectroacousticStimulation"),

	/**
	 * The '<em><b>Middle Ear Implant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_EAR_IMPLANT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_EAR_IMPLANT(7, "MiddleEarImplant", "MiddleEarImplant"),

	/**
	 * The '<em><b>Auditory Brainstem Implant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITORY_BRAINSTEM_IMPLANT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDITORY_BRAINSTEM_IMPLANT(8, "AuditoryBrainstemImplant", "AuditoryBrainstemImplant");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Ear Occluded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAR_OCCLUDED
	 * @model name="EarOccluded"
	 * @generated
	 * @ordered
	 */
	public static final int EAR_OCCLUDED_VALUE = 1;

	/**
	 * The '<em><b>Acoustic Hearing Aid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_HEARING_AID
	 * @model name="AcousticHearingAid"
	 * @generated
	 * @ordered
	 */
	public static final int ACOUSTIC_HEARING_AID_VALUE = 2;

	/**
	 * The '<em><b>Bone Conduction Hearing Aid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTION_HEARING_AID
	 * @model name="BoneConductionHearingAid"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_CONDUCTION_HEARING_AID_VALUE = 3;

	/**
	 * The '<em><b>Bone Anchored Hearing Aid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_ANCHORED_HEARING_AID
	 * @model name="BoneAnchoredHearingAid"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_ANCHORED_HEARING_AID_VALUE = 4;

	/**
	 * The '<em><b>Cochlear Implant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT
	 * @model name="CochlearImplant"
	 * @generated
	 * @ordered
	 */
	public static final int COCHLEAR_IMPLANT_VALUE = 5;

	/**
	 * The '<em><b>Electroacoustic Stimulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTROACOUSTIC_STIMULATION
	 * @model name="ElectroacousticStimulation"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTROACOUSTIC_STIMULATION_VALUE = 6;

	/**
	 * The '<em><b>Middle Ear Implant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_EAR_IMPLANT
	 * @model name="MiddleEarImplant"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_EAR_IMPLANT_VALUE = 7;

	/**
	 * The '<em><b>Auditory Brainstem Implant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITORY_BRAINSTEM_IMPLANT
	 * @model name="AuditoryBrainstemImplant"
	 * @generated
	 * @ordered
	 */
	public static final int AUDITORY_BRAINSTEM_IMPLANT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Aided Solutions Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AidedSolutionsType[] VALUES_ARRAY =
		new AidedSolutionsType[] {
			NONE,
			EAR_OCCLUDED,
			ACOUSTIC_HEARING_AID,
			BONE_CONDUCTION_HEARING_AID,
			BONE_ANCHORED_HEARING_AID,
			COCHLEAR_IMPLANT,
			ELECTROACOUSTIC_STIMULATION,
			MIDDLE_EAR_IMPLANT,
			AUDITORY_BRAINSTEM_IMPLANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Aided Solutions Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AidedSolutionsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aided Solutions Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AidedSolutionsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AidedSolutionsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aided Solutions Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AidedSolutionsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AidedSolutionsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aided Solutions Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AidedSolutionsType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case EAR_OCCLUDED_VALUE: return EAR_OCCLUDED;
			case ACOUSTIC_HEARING_AID_VALUE: return ACOUSTIC_HEARING_AID;
			case BONE_CONDUCTION_HEARING_AID_VALUE: return BONE_CONDUCTION_HEARING_AID;
			case BONE_ANCHORED_HEARING_AID_VALUE: return BONE_ANCHORED_HEARING_AID;
			case COCHLEAR_IMPLANT_VALUE: return COCHLEAR_IMPLANT;
			case ELECTROACOUSTIC_STIMULATION_VALUE: return ELECTROACOUSTIC_STIMULATION;
			case MIDDLE_EAR_IMPLANT_VALUE: return MIDDLE_EAR_IMPLANT;
			case AUDITORY_BRAINSTEM_IMPLANT_VALUE: return AUDITORY_BRAINSTEM_IMPLANT;
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
	private AidedSolutionsType(int value, String name, String literal) {
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
	
} //AidedSolutionsType
