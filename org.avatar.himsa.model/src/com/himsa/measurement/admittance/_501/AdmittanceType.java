/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admittance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The admittance value is saved with a reference to the definition of a
 * complex value and a reference to the definition of the unit for the value.
 * 
 * @@ 500 to 501 name change
 * admittance_Type to Admittance_Type 
 * @@
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceType#getCalculated <em>Calculated</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceType#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceType()
 * @model extendedMetaData="name='Admittance_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * The calculaed value was first introduced in version 501.  When converting down it will be necessary to move the Y value to Measured > G AND then place a 0 (zero) in the B Element.  HIMSA has tried very hard not to use zero in this case since the migration to XSD based formats.  However, in this case, this is the only option and previous to format 501 the use off zero in B was commonly used to denote that the point was a calculated point.
	 * 
	 * @@
	 * 
	 * 
	 * @@ Convert UP from 500 to 501
	 * 
	 * IF there is one point or value AND argument2 is set to 0 then it is possible to map Argument 1 to Y
	 * 
	 * If there is more than one point or value then argument1 will map to G and argument2 will map to B
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated</em>' containment reference.
	 * @see #setCalculated(CalculatedType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceType_Calculated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Calculated' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedType getCalculated();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceType#getCalculated <em>Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' containment reference.
	 * @see #getCalculated()
	 * @generated
	 */
	void setCalculated(CalculatedType value);

	/**
	 * Returns the value of the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * @@ Convert 501  500
	 * The Measured element is new in 501
	 * When converting down the Measured values will be mapped to their respective Argumentadmittance1 and 2 values, see further down in this structure for more details
	 * @@
	 * 
	 * 
	 * @@ Convert UP from 500 to 501
	 * 
	 * IF there is one point or value AND argument2 is set to 0 then it is possible to map Argument 1 to Y
	 * 
	 * If there is more than one point or value then argument1 will map to G and argument2 will map to B
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured</em>' containment reference.
	 * @see #setMeasured(MeasuredType)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceType_Measured()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measured' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasuredType getMeasured();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceType#getMeasured <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured</em>' containment reference.
	 * @see #getMeasured()
	 * @generated
	 */
	void setMeasured(MeasuredType value);

} // AdmittanceType
