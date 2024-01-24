/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta YType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.DeltaYType#getDeltaYPoints <em>Delta YPoints</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.DeltaYType#getG0 <em>G0</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.DeltaYType#getB0 <em>B0</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.DeltaYType#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYType()
 * @model extendedMetaData="name='DeltaY_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeltaYType extends EObject {
	/**
	 * Returns the value of the '<em><b>Delta YPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta YPoints</em>' containment reference.
	 * @see #setDeltaYPoints(DeltaYPointsType)
	 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYType_DeltaYPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeltaYPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	DeltaYPointsType getDeltaYPoints();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.DeltaYType#getDeltaYPoints <em>Delta YPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta YPoints</em>' containment reference.
	 * @see #getDeltaYPoints()
	 * @generated
	 */
	void setDeltaYPoints(DeltaYPointsType value);

	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Admittance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #setG0(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYType_G0()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='G0' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getG0();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.DeltaYType#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #getG0()
	 * @generated
	 */
	void setG0(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Admittance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #setB0(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYType_B0()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='B0' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getB0();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.DeltaYType#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #getB0()
	 * @generated
	 */
	void setB0(BigDecimal value);

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
	 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYType_MeasuredAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasuredAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitMeasuredType getMeasuredAdmittanceUnit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.DeltaYType#getMeasuredAdmittanceUnit <em>Measured Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Admittance Unit</em>' containment reference.
	 * @see #getMeasuredAdmittanceUnit()
	 * @generated
	 */
	void setMeasuredAdmittanceUnit(AdmittanceUnitMeasuredType value);

} // DeltaYType
