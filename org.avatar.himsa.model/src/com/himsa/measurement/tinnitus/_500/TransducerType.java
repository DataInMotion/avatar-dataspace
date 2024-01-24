/*
 */
package com.himsa.measurement.tinnitus._500;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transducer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The device used to deliver sound (e.g. type of headphone TDH39)
 * A simple explanation for each type of device is provided below:
 * + TDH39 / Supra aural headphones for air conduction tests
 * + HDA200 / Supra aural headphones often used for extended high frequency air conduction testing
 * + EarTone 3A / Insert earphones 
 * + DT48 / Supra aural headphones for air conduction tests	
 * + TDH49 /  Supra aural headphones for air conduction tests
 * + B71 / Bone Conductor
 * + B72 / Bone conductor
 * + Beoton / specific set of headphones used with Beoton audiometers only 
 * + Holmberg / Supra aural headphones for air conduction tests usually used in noisier environments 
 * +EARTONE5A, 
 * +IP30,RadioEar  EARTONE3A version
 * +TDH50, 
 * +Holmco_PD81, 
 * +Holmco_PD95, 
 * +DD45, RadioEar
 * +DD65, RadioEar DD45 with Peltor
 * +B81, RadioEar
 * +HDA280
 * +Eartone3A-ABR  
 * +HDA300 / Sennheiser (now EOL, but has been used in the current years)
 * +IP30_10Ohm / ABR from RadioEar
 * +IP30_50Ohm / ABR from RadioEar
 * +DD65v2 / RadioEar
 * +DD450 / RadioEar
 * +TDH39 / Telephonics
 * +BC-1 / Bone conducoter from BHM
 * +BC-2 / Bone conducoter from BHM
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.tinnitus._500._500Package#getTransducerType()
 * @model extendedMetaData="name='Transducer_Type'"
 * @generated
 */
@ProviderType
public enum TransducerType implements Enumerator {
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
	 * The '<em><b>No Transducer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSDUCER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TRANSDUCER(1, "NoTransducer", "NoTransducer"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "Other", "Other"),

	/**
	 * The '<em><b>Hearing Instrument</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARING_INSTRUMENT(3, "HearingInstrument", "HearingInstrument"),

	/**
	 * The '<em><b>TDH39</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH39_VALUE
	 * @generated
	 * @ordered
	 */
	TDH39(4, "TDH39", "TDH39"),

	/**
	 * The '<em><b>HDA200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA200_VALUE
	 * @generated
	 * @ordered
	 */
	HDA200(5, "HDA200", "HDA200"),

	/**
	 * The '<em><b>EARTONE3A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3A_VALUE
	 * @generated
	 * @ordered
	 */
	EARTONE3A(6, "EARTONE3A", "EARTONE3A"),

	/**
	 * The '<em><b>DT48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT48_VALUE
	 * @generated
	 * @ordered
	 */
	DT48(7, "DT48", "DT48"),

	/**
	 * The '<em><b>TDH49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH49_VALUE
	 * @generated
	 * @ordered
	 */
	TDH49(8, "TDH49", "TDH49"),

	/**
	 * The '<em><b>B71</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B71_VALUE
	 * @generated
	 * @ordered
	 */
	B71(9, "B71", "B71"),

	/**
	 * The '<em><b>B72</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B72_VALUE
	 * @generated
	 * @ordered
	 */
	B72(10, "B72", "B72"),

	/**
	 * The '<em><b>Beoton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEOTON_VALUE
	 * @generated
	 * @ordered
	 */
	BEOTON(11, "Beoton", "Beoton"),

	/**
	 * The '<em><b>Holmberg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMBERG_VALUE
	 * @generated
	 * @ordered
	 */
	HOLMBERG(12, "Holmberg", "Holmberg"),

	/**
	 * The '<em><b>EARTONE5A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE5A_VALUE
	 * @generated
	 * @ordered
	 */
	EARTONE5A(13, "EARTONE5A", "EARTONE5A"),

	/**
	 * The '<em><b>Eartone3 AABR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3_AABR_VALUE
	 * @generated
	 * @ordered
	 */
	EARTONE3_AABR(14, "Eartone3AABR", "Eartone3A-ABR"),

	/**
	 * The '<em><b>TDH50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH50_VALUE
	 * @generated
	 * @ordered
	 */
	TDH50(15, "TDH50", "TDH50"),

	/**
	 * The '<em><b>IP30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP30_VALUE
	 * @generated
	 * @ordered
	 */
	IP30(16, "IP30", "IP30"),

	/**
	 * The '<em><b>IP3010 Ohm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP3010_OHM_VALUE
	 * @generated
	 * @ordered
	 */
	IP3010_OHM(17, "IP3010Ohm", "IP30_10Ohm"),

	/**
	 * The '<em><b>IP3050 Ohm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP3050_OHM_VALUE
	 * @generated
	 * @ordered
	 */
	IP3050_OHM(18, "IP3050Ohm", "IP30_50Ohm"),

	/**
	 * The '<em><b>DD45</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD45_VALUE
	 * @generated
	 * @ordered
	 */
	DD45(19, "DD45", "DD45"),

	/**
	 * The '<em><b>DD450</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD450_VALUE
	 * @generated
	 * @ordered
	 */
	DD450(20, "DD450", "DD450"),

	/**
	 * The '<em><b>B81</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B81_VALUE
	 * @generated
	 * @ordered
	 */
	B81(21, "B81", "B81"),

	/**
	 * The '<em><b>DD65</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD65_VALUE
	 * @generated
	 * @ordered
	 */
	DD65(22, "DD65", "DD65"),

	/**
	 * The '<em><b>DD6 5v2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD6_5V2_VALUE
	 * @generated
	 * @ordered
	 */
	DD6_5V2(23, "DD65v2", "DD65v2"),

	/**
	 * The '<em><b>Holmco PD81</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMCO_PD81_VALUE
	 * @generated
	 * @ordered
	 */
	HOLMCO_PD81(24, "HolmcoPD81", "Holmco_PD81"),

	/**
	 * The '<em><b>Holmco PD95</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMCO_PD95_VALUE
	 * @generated
	 * @ordered
	 */
	HOLMCO_PD95(25, "HolmcoPD95", "Holmco_PD95"),

	/**
	 * The '<em><b>HDA280</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA280_VALUE
	 * @generated
	 * @ordered
	 */
	HDA280(26, "HDA280", "HDA280"),

	/**
	 * The '<em><b>HDA300</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA300_VALUE
	 * @generated
	 * @ordered
	 */
	HDA300(27, "HDA300", "HDA300"),

	/**
	 * The '<em><b>BC1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC1_VALUE
	 * @generated
	 * @ordered
	 */
	BC1(28, "BC1", "BC-1"),

	/**
	 * The '<em><b>BC2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC2_VALUE
	 * @generated
	 * @ordered
	 */
	BC2(29, "BC2", "BC-2");

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
	 * The '<em><b>No Transducer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSDUCER
	 * @model name="NoTransducer"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRANSDUCER_VALUE = 1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Hearing Instrument</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT
	 * @model name="HearingInstrument"
	 * @generated
	 * @ordered
	 */
	public static final int HEARING_INSTRUMENT_VALUE = 3;

	/**
	 * The '<em><b>TDH39</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH39
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDH39_VALUE = 4;

	/**
	 * The '<em><b>HDA200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDA200_VALUE = 5;

	/**
	 * The '<em><b>EARTONE3A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTONE3A_VALUE = 6;

	/**
	 * The '<em><b>DT48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT48
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT48_VALUE = 7;

	/**
	 * The '<em><b>TDH49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH49
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDH49_VALUE = 8;

	/**
	 * The '<em><b>B71</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B71
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B71_VALUE = 9;

	/**
	 * The '<em><b>B72</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B72
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B72_VALUE = 10;

	/**
	 * The '<em><b>Beoton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEOTON
	 * @model name="Beoton"
	 * @generated
	 * @ordered
	 */
	public static final int BEOTON_VALUE = 11;

	/**
	 * The '<em><b>Holmberg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMBERG
	 * @model name="Holmberg"
	 * @generated
	 * @ordered
	 */
	public static final int HOLMBERG_VALUE = 12;

	/**
	 * The '<em><b>EARTONE5A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE5A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTONE5A_VALUE = 13;

	/**
	 * The '<em><b>Eartone3 AABR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3_AABR
	 * @model name="Eartone3AABR" literal="Eartone3A-ABR"
	 * @generated
	 * @ordered
	 */
	public static final int EARTONE3_AABR_VALUE = 14;

	/**
	 * The '<em><b>TDH50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH50
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDH50_VALUE = 15;

	/**
	 * The '<em><b>IP30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP30
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP30_VALUE = 16;

	/**
	 * The '<em><b>IP3010 Ohm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP3010_OHM
	 * @model name="IP3010Ohm" literal="IP30_10Ohm"
	 * @generated
	 * @ordered
	 */
	public static final int IP3010_OHM_VALUE = 17;

	/**
	 * The '<em><b>IP3050 Ohm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP3050_OHM
	 * @model name="IP3050Ohm" literal="IP30_50Ohm"
	 * @generated
	 * @ordered
	 */
	public static final int IP3050_OHM_VALUE = 18;

	/**
	 * The '<em><b>DD45</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD45
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD45_VALUE = 19;

	/**
	 * The '<em><b>DD450</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD450
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD450_VALUE = 20;

	/**
	 * The '<em><b>B81</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B81
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B81_VALUE = 21;

	/**
	 * The '<em><b>DD65</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD65
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD65_VALUE = 22;

	/**
	 * The '<em><b>DD6 5v2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD6_5V2
	 * @model name="DD65v2"
	 * @generated
	 * @ordered
	 */
	public static final int DD6_5V2_VALUE = 23;

	/**
	 * The '<em><b>Holmco PD81</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMCO_PD81
	 * @model name="HolmcoPD81" literal="Holmco_PD81"
	 * @generated
	 * @ordered
	 */
	public static final int HOLMCO_PD81_VALUE = 24;

	/**
	 * The '<em><b>Holmco PD95</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMCO_PD95
	 * @model name="HolmcoPD95" literal="Holmco_PD95"
	 * @generated
	 * @ordered
	 */
	public static final int HOLMCO_PD95_VALUE = 25;

	/**
	 * The '<em><b>HDA280</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA280
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDA280_VALUE = 26;

	/**
	 * The '<em><b>HDA300</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA300
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDA300_VALUE = 27;

	/**
	 * The '<em><b>BC1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC1
	 * @model literal="BC-1"
	 * @generated
	 * @ordered
	 */
	public static final int BC1_VALUE = 28;

	/**
	 * The '<em><b>BC2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC2
	 * @model literal="BC-2"
	 * @generated
	 * @ordered
	 */
	public static final int BC2_VALUE = 29;

	/**
	 * An array of all the '<em><b>Transducer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransducerType[] VALUES_ARRAY =
		new TransducerType[] {
			UNKNOWN,
			NO_TRANSDUCER,
			OTHER,
			HEARING_INSTRUMENT,
			TDH39,
			HDA200,
			EARTONE3A,
			DT48,
			TDH49,
			B71,
			B72,
			BEOTON,
			HOLMBERG,
			EARTONE5A,
			EARTONE3_AABR,
			TDH50,
			IP30,
			IP3010_OHM,
			IP3050_OHM,
			DD45,
			DD450,
			B81,
			DD65,
			DD6_5V2,
			HOLMCO_PD81,
			HOLMCO_PD95,
			HDA280,
			HDA300,
			BC1,
			BC2,
		};

	/**
	 * A public read-only list of all the '<em><b>Transducer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransducerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransducerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransducerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_TRANSDUCER_VALUE: return NO_TRANSDUCER;
			case OTHER_VALUE: return OTHER;
			case HEARING_INSTRUMENT_VALUE: return HEARING_INSTRUMENT;
			case TDH39_VALUE: return TDH39;
			case HDA200_VALUE: return HDA200;
			case EARTONE3A_VALUE: return EARTONE3A;
			case DT48_VALUE: return DT48;
			case TDH49_VALUE: return TDH49;
			case B71_VALUE: return B71;
			case B72_VALUE: return B72;
			case BEOTON_VALUE: return BEOTON;
			case HOLMBERG_VALUE: return HOLMBERG;
			case EARTONE5A_VALUE: return EARTONE5A;
			case EARTONE3_AABR_VALUE: return EARTONE3_AABR;
			case TDH50_VALUE: return TDH50;
			case IP30_VALUE: return IP30;
			case IP3010_OHM_VALUE: return IP3010_OHM;
			case IP3050_OHM_VALUE: return IP3050_OHM;
			case DD45_VALUE: return DD45;
			case DD450_VALUE: return DD450;
			case B81_VALUE: return B81;
			case DD65_VALUE: return DD65;
			case DD6_5V2_VALUE: return DD6_5V2;
			case HOLMCO_PD81_VALUE: return HOLMCO_PD81;
			case HOLMCO_PD95_VALUE: return HOLMCO_PD95;
			case HDA280_VALUE: return HDA280;
			case HDA300_VALUE: return HDA300;
			case BC1_VALUE: return BC1;
			case BC2_VALUE: return BC2;
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
	private TransducerType(int value, String name, String literal) {
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
	
} //TransducerType
