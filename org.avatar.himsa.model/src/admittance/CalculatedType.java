/*
 */
package admittance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.CalculatedType#getAdmittanceValueCalculated <em>Admittance Value Calculated</em>}</li>
 *   <li>{@link admittance.CalculatedType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getCalculatedType()
 * @model extendedMetaData="name='Calculated_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CalculatedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Admittance Value Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admittance Value Calculated</em>' containment reference.
	 * @see #setAdmittanceValueCalculated(AdmittanceValueCalculatedType)
	 * @see admittance.AdmittancePackage#getCalculatedType_AdmittanceValueCalculated()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdmittanceValueCalculated' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceValueCalculatedType getAdmittanceValueCalculated();

	/**
	 * Sets the value of the '{@link admittance.CalculatedType#getAdmittanceValueCalculated <em>Admittance Value Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Value Calculated</em>' containment reference.
	 * @see #getAdmittanceValueCalculated()
	 * @generated
	 */
	void setAdmittanceValueCalculated(AdmittanceValueCalculatedType value);

	/**
	 * Returns the value of the '<em><b>Calculated Admittance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * admittance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType)
	 * @see admittance.AdmittancePackage#getCalculatedType_CalculatedAdmittanceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedAdmittanceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceUnitCalculatedType getCalculatedAdmittanceUnit();

	/**
	 * Sets the value of the '{@link admittance.CalculatedType#getCalculatedAdmittanceUnit <em>Calculated Admittance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Admittance Unit</em>' containment reference.
	 * @see #getCalculatedAdmittanceUnit()
	 * @generated
	 */
	void setCalculatedAdmittanceUnit(AdmittanceUnitCalculatedType value);

} // CalculatedType
