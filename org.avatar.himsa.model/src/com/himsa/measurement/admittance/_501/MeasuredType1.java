/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.MeasuredType1#getMeasuredAdmittancePoints <em>Measured Admittance Points</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.MeasuredType1#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType1()
 * @model extendedMetaData="name='Measured_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasuredType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Measured Admittance Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Admittance Points</em>' containment reference.
	 * @see #setMeasuredAdmittancePoints(MeasuredAdmittancePointsType)
	 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType1_MeasuredAdmittancePoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasuredAdmittancePoints' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasuredAdmittancePointsType getMeasuredAdmittancePoints();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.MeasuredType1#getMeasuredAdmittancePoints <em>Measured Admittance Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Admittance Points</em>' containment reference.
	 * @see #getMeasuredAdmittancePoints()
	 * @generated
	 */
	void setMeasuredAdmittancePoints(MeasuredAdmittancePointsType value);

	/**
	 * Returns the value of the '<em><b>Measured Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The Measured value was first introduced in version 501. 
	 * When converting down it will be necessary to map the G value to ArgumentUnit1 AND B value to ArgumentUnit2.  
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured Admittance Unit</em>' containment reference.
	 * @see #setMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getMeasuredType1_MeasuredAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasuredAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitMeasuredType getMeasuredAdmittanceUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.MeasuredType1#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Admittance Unit</em>' containment reference.
	 * @see #getMeasuredAdmittanceUnit()
	 * @generated
	 */
	void setMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType value);

} // MeasuredType1
