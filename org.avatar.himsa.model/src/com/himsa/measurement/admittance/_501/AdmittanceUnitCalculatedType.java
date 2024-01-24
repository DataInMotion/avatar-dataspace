/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admittance Unit Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Y-values of the admittance Curve can have different units (cc, ml, mmho..
 * etc), which depends of the instrument type.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType#getYUnit <em>YUnit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceUnitCalculatedType()
 * @model extendedMetaData="name='AdmittanceUnitCalculated_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceUnitCalculatedType extends EObject {
	/**
	 * Returns the value of the '<em><b>YUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.admittance._501.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculated value was first introduced in version 501.  When converting down it will be necessary to map the Y value to ArgumentUnit1 AND also ArgumentUnit2.  
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YUnit</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.UnitType
	 * @see #isSetYUnit()
	 * @see #unsetYUnit()
	 * @see #setYUnit(UnitType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceUnitCalculatedType_YUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='YUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getYUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType#getYUnit <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUnit</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.UnitType
	 * @see #isSetYUnit()
	 * @see #unsetYUnit()
	 * @see #getYUnit()
	 * @generated
	 */
	void setYUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType#getYUnit <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYUnit()
	 * @see #getYUnit()
	 * @see #setYUnit(UnitType)
	 * @generated
	 */
	void unsetYUnit();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType#getYUnit <em>YUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YUnit</em>' attribute is set.
	 * @see #unsetYUnit()
	 * @see #getYUnit()
	 * @see #setYUnit(UnitType)
	 * @generated
	 */
	boolean isSetYUnit();

} // AdmittanceUnitCalculatedType
