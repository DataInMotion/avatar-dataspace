/*
 */
package impedance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Acoustic Reflex (stapedius reflex) measurement. The reflexPoints saves
 * [time, compliance] values, and the compliance unit saves the unit of the data. 
 * 
 * ## TReflexCrv ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.ReflexCurveType#getReflexPoint <em>Reflex Point</em>}</li>
 *   <li>{@link impedance.ReflexCurveType#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getReflexCurveType()
 * @model extendedMetaData="name='ReflexCurve_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reflex Point</b></em>' containment reference list.
	 * The list contents are of type {@link impedance.ReflexPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measuring reflex point
	 * 
	 * ## reflexPoint ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Point</em>' containment reference list.
	 * @see impedance.ImpedancePackage#getReflexCurveType_ReflexPoint()
	 * @model containment="true" required="true" upper="128"
	 *        extendedMetaData="kind='element' name='ReflexPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReflexPointType> getReflexPoint();

	/**
	 * Returns the value of the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of compliance data
	 * 
	 * ## complUnit ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #setComplianceUnit(ComplianceUnitType)
	 * @see impedance.ImpedancePackage#getReflexCurveType_ComplianceUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComplianceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceUnitType getComplianceUnit();

	/**
	 * Sets the value of the '{@link impedance.ReflexCurveType#getComplianceUnit <em>Compliance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #getComplianceUnit()
	 * @generated
	 */
	void setComplianceUnit(ComplianceUnitType value);

} // ReflexCurveType
