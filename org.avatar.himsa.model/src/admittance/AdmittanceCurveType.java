/*
 */
package admittance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * @@ 500 to 501 name change
 * admittanceCurve_Type to AdmittanceCurve_Type
 * @@
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.AdmittanceCurveType#getCalculated <em>Calculated</em>}</li>
 *   <li>{@link admittance.AdmittanceCurveType#getMeasured <em>Measured</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getAdmittanceCurveType()
 * @model extendedMetaData="name='AdmittanceCurve_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated</em>' containment reference.
	 * @see #setCalculated(CalculatedType1)
	 * @see admittance.AdmittancePackage#getAdmittanceCurveType_Calculated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Calculated' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedType1 getCalculated();

	/**
	 * Sets the value of the '{@link admittance.AdmittanceCurveType#getCalculated <em>Calculated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' containment reference.
	 * @see #getCalculated()
	 * @generated
	 */
	void setCalculated(CalculatedType1 value);

	/**
	 * Returns the value of the '<em><b>Measured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured</em>' containment reference.
	 * @see #setMeasured(MeasuredType1)
	 * @see admittance.AdmittancePackage#getAdmittanceCurveType_Measured()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measured' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasuredType1 getMeasured();

	/**
	 * Sets the value of the '{@link admittance.AdmittanceCurveType#getMeasured <em>Measured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured</em>' containment reference.
	 * @see #getMeasured()
	 * @generated
	 */
	void setMeasured(MeasuredType1 value);

} // AdmittanceCurveType
