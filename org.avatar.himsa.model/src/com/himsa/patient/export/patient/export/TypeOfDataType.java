/*
 */
package com.himsa.patient.export.patient.export;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.himsa.patient.export.patient.export.ExportPackage#getTypeOfDataType()
 * @model extendedMetaData="name='TypeOfData_._type'"
 * @generated
 */
@ProviderType
public enum TypeOfDataType implements Enumerator {
	/**
	 * The '<em><b>Audiogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIOGRAM(0, "Audiogram", "Audiogram"),

	/**
	 * The '<em><b>Hearing Instrument Selection Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_SELECTION_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARING_INSTRUMENT_SELECTION_LEFT(1, "HearingInstrumentSelectionLeft", "HearingInstrumentSelectionLeft"),

	/**
	 * The '<em><b>Hearing Instrument Selection Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_SELECTION_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARING_INSTRUMENT_SELECTION_RIGHT(2, "HearingInstrumentSelectionRight", "HearingInstrumentSelectionRight"),

	/**
	 * The '<em><b>Hearing Instrument Fitting Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_FITTING_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARING_INSTRUMENT_FITTING_LEFT(3, "HearingInstrumentFittingLeft", "HearingInstrumentFittingLeft"),

	/**
	 * The '<em><b>Hearing Instrument Fitting Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_FITTING_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARING_INSTRUMENT_FITTING_RIGHT(4, "HearingInstrumentFittingRight", "HearingInstrumentFittingRight"),

	/**
	 * The '<em><b>Remote Control Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_CONTROL_SELECTION(5, "RemoteControlSelection", "RemoteControlSelection"),

	/**
	 * The '<em><b>Impedance Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDANCE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPEDANCE_LEFT(6, "ImpedanceLeft", "ImpedanceLeft"),

	/**
	 * The '<em><b>Impedance Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDANCE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPEDANCE_RIGHT(7, "ImpedanceRight", "ImpedanceRight"),

	/**
	 * The '<em><b>REM Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	REM_LEFT(8, "REMLeft", "REMLeft"),

	/**
	 * The '<em><b>REM Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	REM_RIGHT(9, "REMRight", "REMRight"),

	/**
	 * The '<em><b>HIT Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	HIT_LEFT(10, "HITLeft", "HITLeft"),

	/**
	 * The '<em><b>HIT Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HIT_RIGHT(11, "HITRight", "HITRight"),

	/**
	 * The '<em><b>Tinnitus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TINNITUS_VALUE
	 * @generated
	 * @ordered
	 */
	TINNITUS(12, "Tinnitus", "Tinnitus"),

	/**
	 * The '<em><b>Audiogram Metadata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOGRAM_METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIOGRAM_METADATA(13, "AudiogramMetadata", "AudiogramMetadata"),

	/**
	 * The '<em><b>Cochlear Implant Sound Processor Selection Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT(14, "CochlearImplantSoundProcessorSelectionLeft", "CochlearImplantSoundProcessorSelectionLeft"),

	/**
	 * The '<em><b>Cochlear Implant Sound Processor Selection Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT(15, "CochlearImplantSoundProcessorSelectionRight", "CochlearImplantSoundProcessorSelectionRight"),

	/**
	 * The '<em><b>Journal Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	JOURNAL_DATA(16, "JournalData", "JournalData"),

	/**
	 * The '<em><b>Notification Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION_ACTION(17, "NotificationAction", "NotificationAction"),

	/**
	 * The '<em><b>Scan Meta Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAN_META_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SCAN_META_DATA(18, "ScanMetaData", "ScanMetaData");

	/**
	 * The '<em><b>Audiogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOGRAM
	 * @model name="Audiogram"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIOGRAM_VALUE = 0;

	/**
	 * The '<em><b>Hearing Instrument Selection Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_SELECTION_LEFT
	 * @model name="HearingInstrumentSelectionLeft"
	 * @generated
	 * @ordered
	 */
	public static final int HEARING_INSTRUMENT_SELECTION_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Hearing Instrument Selection Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_SELECTION_RIGHT
	 * @model name="HearingInstrumentSelectionRight"
	 * @generated
	 * @ordered
	 */
	public static final int HEARING_INSTRUMENT_SELECTION_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Hearing Instrument Fitting Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_FITTING_LEFT
	 * @model name="HearingInstrumentFittingLeft"
	 * @generated
	 * @ordered
	 */
	public static final int HEARING_INSTRUMENT_FITTING_LEFT_VALUE = 3;

	/**
	 * The '<em><b>Hearing Instrument Fitting Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARING_INSTRUMENT_FITTING_RIGHT
	 * @model name="HearingInstrumentFittingRight"
	 * @generated
	 * @ordered
	 */
	public static final int HEARING_INSTRUMENT_FITTING_RIGHT_VALUE = 4;

	/**
	 * The '<em><b>Remote Control Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL_SELECTION
	 * @model name="RemoteControlSelection"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONTROL_SELECTION_VALUE = 5;

	/**
	 * The '<em><b>Impedance Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDANCE_LEFT
	 * @model name="ImpedanceLeft"
	 * @generated
	 * @ordered
	 */
	public static final int IMPEDANCE_LEFT_VALUE = 6;

	/**
	 * The '<em><b>Impedance Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDANCE_RIGHT
	 * @model name="ImpedanceRight"
	 * @generated
	 * @ordered
	 */
	public static final int IMPEDANCE_RIGHT_VALUE = 7;

	/**
	 * The '<em><b>REM Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REM_LEFT
	 * @model name="REMLeft"
	 * @generated
	 * @ordered
	 */
	public static final int REM_LEFT_VALUE = 8;

	/**
	 * The '<em><b>REM Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REM_RIGHT
	 * @model name="REMRight"
	 * @generated
	 * @ordered
	 */
	public static final int REM_RIGHT_VALUE = 9;

	/**
	 * The '<em><b>HIT Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_LEFT
	 * @model name="HITLeft"
	 * @generated
	 * @ordered
	 */
	public static final int HIT_LEFT_VALUE = 10;

	/**
	 * The '<em><b>HIT Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIT_RIGHT
	 * @model name="HITRight"
	 * @generated
	 * @ordered
	 */
	public static final int HIT_RIGHT_VALUE = 11;

	/**
	 * The '<em><b>Tinnitus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TINNITUS
	 * @model name="Tinnitus"
	 * @generated
	 * @ordered
	 */
	public static final int TINNITUS_VALUE = 12;

	/**
	 * The '<em><b>Audiogram Metadata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOGRAM_METADATA
	 * @model name="AudiogramMetadata"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIOGRAM_METADATA_VALUE = 13;

	/**
	 * The '<em><b>Cochlear Implant Sound Processor Selection Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT
	 * @model name="CochlearImplantSoundProcessorSelectionLeft"
	 * @generated
	 * @ordered
	 */
	public static final int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT_VALUE = 14;

	/**
	 * The '<em><b>Cochlear Implant Sound Processor Selection Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT
	 * @model name="CochlearImplantSoundProcessorSelectionRight"
	 * @generated
	 * @ordered
	 */
	public static final int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT_VALUE = 15;

	/**
	 * The '<em><b>Journal Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNAL_DATA
	 * @model name="JournalData"
	 * @generated
	 * @ordered
	 */
	public static final int JOURNAL_DATA_VALUE = 16;

	/**
	 * The '<em><b>Notification Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_ACTION
	 * @model name="NotificationAction"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_ACTION_VALUE = 17;

	/**
	 * The '<em><b>Scan Meta Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAN_META_DATA
	 * @model name="ScanMetaData"
	 * @generated
	 * @ordered
	 */
	public static final int SCAN_META_DATA_VALUE = 18;

	/**
	 * An array of all the '<em><b>Type Of Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfDataType[] VALUES_ARRAY =
		new TypeOfDataType[] {
			AUDIOGRAM,
			HEARING_INSTRUMENT_SELECTION_LEFT,
			HEARING_INSTRUMENT_SELECTION_RIGHT,
			HEARING_INSTRUMENT_FITTING_LEFT,
			HEARING_INSTRUMENT_FITTING_RIGHT,
			REMOTE_CONTROL_SELECTION,
			IMPEDANCE_LEFT,
			IMPEDANCE_RIGHT,
			REM_LEFT,
			REM_RIGHT,
			HIT_LEFT,
			HIT_RIGHT,
			TINNITUS,
			AUDIOGRAM_METADATA,
			COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT,
			COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT,
			JOURNAL_DATA,
			NOTIFICATION_ACTION,
			SCAN_META_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfDataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfDataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfDataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfDataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfDataType get(int value) {
		switch (value) {
			case AUDIOGRAM_VALUE: return AUDIOGRAM;
			case HEARING_INSTRUMENT_SELECTION_LEFT_VALUE: return HEARING_INSTRUMENT_SELECTION_LEFT;
			case HEARING_INSTRUMENT_SELECTION_RIGHT_VALUE: return HEARING_INSTRUMENT_SELECTION_RIGHT;
			case HEARING_INSTRUMENT_FITTING_LEFT_VALUE: return HEARING_INSTRUMENT_FITTING_LEFT;
			case HEARING_INSTRUMENT_FITTING_RIGHT_VALUE: return HEARING_INSTRUMENT_FITTING_RIGHT;
			case REMOTE_CONTROL_SELECTION_VALUE: return REMOTE_CONTROL_SELECTION;
			case IMPEDANCE_LEFT_VALUE: return IMPEDANCE_LEFT;
			case IMPEDANCE_RIGHT_VALUE: return IMPEDANCE_RIGHT;
			case REM_LEFT_VALUE: return REM_LEFT;
			case REM_RIGHT_VALUE: return REM_RIGHT;
			case HIT_LEFT_VALUE: return HIT_LEFT;
			case HIT_RIGHT_VALUE: return HIT_RIGHT;
			case TINNITUS_VALUE: return TINNITUS;
			case AUDIOGRAM_METADATA_VALUE: return AUDIOGRAM_METADATA;
			case COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT_VALUE: return COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_LEFT;
			case COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT_VALUE: return COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_RIGHT;
			case JOURNAL_DATA_VALUE: return JOURNAL_DATA;
			case NOTIFICATION_ACTION_VALUE: return NOTIFICATION_ACTION;
			case SCAN_META_DATA_VALUE: return SCAN_META_DATA;
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
	private TypeOfDataType(int value, String name, String literal) {
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
	
} //TypeOfDataType
