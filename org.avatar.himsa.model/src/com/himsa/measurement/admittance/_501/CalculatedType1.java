/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.CalculatedType1#getCalculatedAdmittancePoints <em>Calculated Admittance Points</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.CalculatedType1#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getCalculatedType1()
 * @model extendedMetaData="name='Calculated_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CalculatedType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculated Admittance Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Admittance Points</em>' containment reference.
	 * @see #setCalculatedAdmittancePoints(CalculatedAdmittancePointsType)
	 * @see com.himsa.measurement.admittance._501._501Package#getCalculatedType1_CalculatedAdmittancePoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedAdmittancePoints' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedAdmittancePointsType getCalculatedAdmittancePoints();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.CalculatedType1#getCalculatedAdmittancePoints <em>Calculated Admittance Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Admittance Points</em>' containment reference.
	 * @see #getCalculatedAdmittancePoints()
	 * @generated
	 */
	void setCalculatedAdmittancePoints(CalculatedAdmittancePointsType value);

	/**
	 * Returns the value of the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType)
	 * @see com.himsa.measurement.admittance._501._501Package#getCalculatedType1_CalculatedAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitCalculatedType getCalculatedAdmittanceUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.CalculatedType1#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #getCalculatedAdmittanceUnit()
	 * @generated
	 */
	void setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType value);

} // CalculatedType1
