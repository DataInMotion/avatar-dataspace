/*
 */
package impedance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## TComplCrv ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.ComplianceCurveType#getCompliancePoint <em>Compliance Point</em>}</li>
 *   <li>{@link impedance.ComplianceCurveType#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getComplianceCurveType()
 * @model extendedMetaData="name='ComplianceCurve_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComplianceCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Point</b></em>' containment reference list.
	 * The list contents are of type {@link impedance.CompliancePointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measuring points 
	 * 
	 * ## ComplPoint ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Point</em>' containment reference list.
	 * @see impedance.ImpedancePackage#getComplianceCurveType_CompliancePoint()
	 * @model containment="true" required="true" upper="250"
	 *        extendedMetaData="kind='element' name='CompliancePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompliancePointType> getCompliancePoint();

	/**
	 * Returns the value of the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compliance can be recorded in different units such as cc, ml or mmho depending on the equipment used. This field denotes the units used in this measurement.
	 * 
	 * ## ComplUnit ##
	 * 
	 * @@ REV 5 Converter Change 100>500
	 * If undefined, will be given the default value. The default value is CubicCentimetrer
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #setComplianceUnit(ComplianceUnitType)
	 * @see impedance.ImpedancePackage#getComplianceCurveType_ComplianceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComplianceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceUnitType getComplianceUnit();

	/**
	 * Sets the value of the '{@link impedance.ComplianceCurveType#getComplianceUnit <em>Compliance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #getComplianceUnit()
	 * @generated
	 */
	void setComplianceUnit(ComplianceUnitType value);

} // ComplianceCurveType
