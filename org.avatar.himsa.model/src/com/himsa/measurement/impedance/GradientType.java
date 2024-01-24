/*
 */
package com.himsa.measurement.impedance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Gradient of the Compliance Curve 
 * 
 * ## TGradient ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.GradientType#getGradientValue <em>Gradient Value</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.GradientType#getGradientUnit <em>Gradient Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getGradientType()
 * @model extendedMetaData="name='Gradient_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GradientType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gradient Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gradient of the compliance curve
	 * 
	 * ## GradientVal ## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient Value</em>' containment reference.
	 * @see #setGradientValue(ComplianceValueType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getGradientType_GradientValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GradientValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceValueType getGradientValue();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.GradientType#getGradientValue <em>Gradient Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Value</em>' containment reference.
	 * @see #getGradientValue()
	 * @generated
	 */
	void setGradientValue(ComplianceValueType value);

	/**
	 * Returns the value of the '<em><b>Gradient Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.impedance.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the gradient value either ml,cc, mmho or deka Pascal
	 * 
	 * ## gradientUnit ##
	 * 
	 * @@ REV 5 Converter Change 100>500
	 * If undefined, will be given the default value DekaPascal
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient Unit</em>' attribute.
	 * @see com.himsa.measurement.impedance.UnitType
	 * @see #isSetGradientUnit()
	 * @see #unsetGradientUnit()
	 * @see #setGradientUnit(UnitType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getGradientType_GradientUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GradientUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getGradientUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.GradientType#getGradientUnit <em>Gradient Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Unit</em>' attribute.
	 * @see com.himsa.measurement.impedance.UnitType
	 * @see #isSetGradientUnit()
	 * @see #unsetGradientUnit()
	 * @see #getGradientUnit()
	 * @generated
	 */
	void setGradientUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.GradientType#getGradientUnit <em>Gradient Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientUnit()
	 * @see #getGradientUnit()
	 * @see #setGradientUnit(UnitType)
	 * @generated
	 */
	void unsetGradientUnit();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.GradientType#getGradientUnit <em>Gradient Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gradient Unit</em>' attribute is set.
	 * @see #unsetGradientUnit()
	 * @see #getGradientUnit()
	 * @see #setGradientUnit(UnitType)
	 * @generated
	 */
	boolean isSetGradientUnit();

} // GradientType
