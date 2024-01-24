/*
 */
package tinnitus;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intensity Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus intensity and unit applied
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.IntensityType1#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link tinnitus.IntensityType1#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getIntensityType1()
 * @model extendedMetaData="name='Intensity_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IntensityType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal intensity 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see #setIntensity(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getIntensityType1_Intensity()
	 * @model dataType="tinnitus.IntensityType" required="true"
	 *        extendedMetaData="kind='element' name='Intensity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getIntensity();

	/**
	 * Sets the value of the '{@link tinnitus.IntensityType1#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.SignalUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit used for the signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see tinnitus.SignalUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(SignalUnitType)
	 * @see tinnitus.TinnitusPackage#getIntensityType1_Unit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Unit' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalUnitType getUnit();

	/**
	 * Sets the value of the '{@link tinnitus.IntensityType1#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see tinnitus.SignalUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(SignalUnitType value);

	/**
	 * Unsets the value of the '{@link tinnitus.IntensityType1#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(SignalUnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link tinnitus.IntensityType1#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(SignalUnitType)
	 * @generated
	 */
	boolean isSetUnit();

} // IntensityType1
