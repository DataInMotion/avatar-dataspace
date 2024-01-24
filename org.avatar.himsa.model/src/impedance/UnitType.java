/*
 */
package impedance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Attaches to a saved value and describes the unit used.
 * 
 * + cubicCentiMetre / In [IEC 60645-5 2005] is referred a rule of thumb:
 * + milliLitre / The acoustic admittance of an air-filled cavity of volume 1 cubic cm at standard atmospheric conditions (barometric air pressure 100 kPa, temperature 20 degrees Celsius) is:
 * 
 * + milli_mho / This size is per definition 1 cgs acoustic millimho.
 * Since 1 cubic cm is equal to 1 ml, the three admittance units therefore
 * should yield the same numeric values.
 * 
 * + degree_3600 / If polar notation of the complex admittance is preferred, this measure expresses the phase angle in tenths of a degree.
 * 
 * + deka_Pascal / Pressure in tens of Pascal, daPa, Pa/10. 1 daPa equals 1 mm of water.
 * 
 * 6/25/2012 Annotation
 * 
 * The IMP standard format 100 defined the possible values in the following manner 
 * •	cubicCentiMetre_100 	-- Cubic Centi Metre x 100 
 * •	milliLitre_100 		-- Milli Litre x 100
 * •	milli_mho		-- Milli mho  x 100  i.e. "SI-mho"
 * •	degree_3600		-- Phase in degrees x 10
 * •	deka_Pascal		-- Pressure in deka Pascal (daPa or tens of Pa)
 * 
 * This means that a module saving data would set the compliance unit, using the list above, but would also have to save the compliance value accordingly.  For example, if the unit was cubiccenterMetre then the value would have to be X 100.  This concept was used as the original header file did not have the ability to use decimal values.
 * 
 * While HIMSA migrated this standard (format 500) to XML we in almost all cases defined the xml element as a decimal where the format value was defined as “value”X100 ect.
 * 
 * In this case we are not able to make this similar type of change as value will in some cases by X100, X10, or nothing.
 * 
 * If a module is saving data using format 500 then it is mandatory that the developer save the value as an integer by multiplying the value according to the list of values above.
 * 
 * Conversely, a module reading data must divide the integer accordingly.
 * End of 6/25/2012 Annotation
 * 
 * 
 * ## TUnit ##
 * <!-- end-model-doc -->
 * @see impedance.ImpedancePackage#getUnitType()
 * @model extendedMetaData="name='Unit_Type'"
 * @generated
 */
@ProviderType
public enum UnitType implements Enumerator {
	/**
	 * The '<em><b>Cubic Centimetrer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBIC_CENTIMETRER_VALUE
	 * @generated
	 * @ordered
	 */
	CUBIC_CENTIMETRER(0, "CubicCentimetrer", "CubicCentimetrer"),

	/**
	 * The '<em><b>Milli Liter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_LITER_VALUE
	 * @generated
	 * @ordered
	 */
	MILLI_LITER(1, "MilliLiter", "MilliLiter"),

	/**
	 * The '<em><b>Milli Mho</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_MHO_VALUE
	 * @generated
	 * @ordered
	 */
	MILLI_MHO(2, "MilliMho", "MilliMho"),

	/**
	 * The '<em><b>Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	DEGREE(3, "Degree", "Degree"),

	/**
	 * The '<em><b>Deka Pascal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEKA_PASCAL_VALUE
	 * @generated
	 * @ordered
	 */
	DEKA_PASCAL(4, "DekaPascal", "DekaPascal");

	/**
	 * The '<em><b>Cubic Centimetrer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBIC_CENTIMETRER
	 * @model name="CubicCentimetrer"
	 * @generated
	 * @ordered
	 */
	public static final int CUBIC_CENTIMETRER_VALUE = 0;

	/**
	 * The '<em><b>Milli Liter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_LITER
	 * @model name="MilliLiter"
	 * @generated
	 * @ordered
	 */
	public static final int MILLI_LITER_VALUE = 1;

	/**
	 * The '<em><b>Milli Mho</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLI_MHO
	 * @model name="MilliMho"
	 * @generated
	 * @ordered
	 */
	public static final int MILLI_MHO_VALUE = 2;

	/**
	 * The '<em><b>Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGREE
	 * @model name="Degree"
	 * @generated
	 * @ordered
	 */
	public static final int DEGREE_VALUE = 3;

	/**
	 * The '<em><b>Deka Pascal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEKA_PASCAL
	 * @model name="DekaPascal"
	 * @generated
	 * @ordered
	 */
	public static final int DEKA_PASCAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitType[] VALUES_ARRAY =
		new UnitType[] {
			CUBIC_CENTIMETRER,
			MILLI_LITER,
			MILLI_MHO,
			DEGREE,
			DEKA_PASCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(int value) {
		switch (value) {
			case CUBIC_CENTIMETRER_VALUE: return CUBIC_CENTIMETRER;
			case MILLI_LITER_VALUE: return MILLI_LITER;
			case MILLI_MHO_VALUE: return MILLI_MHO;
			case DEGREE_VALUE: return DEGREE;
			case DEKA_PASCAL_VALUE: return DEKA_PASCAL;
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
	private UnitType(int value, String name, String literal) {
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
	
} //UnitType
