/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Delta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.NumericDeltaType#getNumericDeltaYPoints <em>Numeric Delta YPoints</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.NumericDeltaType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getNumericDeltaType()
 * @model extendedMetaData="name='NumericDelta_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NumericDeltaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Numeric Delta YPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Delta YPoints</em>' containment reference.
	 * @see #setNumericDeltaYPoints(NumericDeltaYPointsType)
	 * @see com.himsa.measurement.admittance._501._501Package#getNumericDeltaType_NumericDeltaYPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NumericDeltaYPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	NumericDeltaYPointsType getNumericDeltaYPoints();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.NumericDeltaType#getNumericDeltaYPoints <em>Numeric Delta YPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Delta YPoints</em>' containment reference.
	 * @see #getNumericDeltaYPoints()
	 * @generated
	 */
	void setNumericDeltaYPoints(NumericDeltaYPointsType value);

	/**
	 * Returns the value of the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculated value was first introduced in version 501.  When converting down it will be necessary to map the Y value to ArgumentUnit1 AND also ArgumentUnit2.  
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType)
	 * @see com.himsa.measurement.admittance._501._501Package#getNumericDeltaType_CalculatedAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitCalculatedType getCalculatedAdmittanceUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.NumericDeltaType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #getCalculatedAdmittanceUnit()
	 * @generated
	 */
	void setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType value);

} // NumericDeltaType
