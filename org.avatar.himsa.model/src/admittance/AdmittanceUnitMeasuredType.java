/*
 */
package admittance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Measured Type</b></em>'.
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
 *   <li>{@link admittance.AdmittanceUnitMeasuredType#getGUnit <em>GUnit</em>}</li>
 *   <li>{@link admittance.AdmittanceUnitMeasuredType#getBUnit <em>BUnit</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getAdmittanceUnitMeasuredType()
 * @model extendedMetaData="name='AdmittanceUnitMeasured_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceUnitMeasuredType extends EObject {
	/**
	 * Returns the value of the '<em><b>GUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link admittance.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the real part
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUnit</em>' attribute.
	 * @see admittance.UnitType
	 * @see #isSetGUnit()
	 * @see #unsetGUnit()
	 * @see #setGUnit(UnitType)
	 * @see admittance.AdmittancePackage#getAdmittanceUnitMeasuredType_GUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getGUnit();

	/**
	 * Sets the value of the '{@link admittance.AdmittanceUnitMeasuredType#getGUnit <em>GUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUnit</em>' attribute.
	 * @see admittance.UnitType
	 * @see #isSetGUnit()
	 * @see #unsetGUnit()
	 * @see #getGUnit()
	 * @generated
	 */
	void setGUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link admittance.AdmittanceUnitMeasuredType#getGUnit <em>GUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGUnit()
	 * @see #getGUnit()
	 * @see #setGUnit(UnitType)
	 * @generated
	 */
	void unsetGUnit();

	/**
	 * Returns whether the value of the '{@link admittance.AdmittanceUnitMeasuredType#getGUnit <em>GUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GUnit</em>' attribute is set.
	 * @see #unsetGUnit()
	 * @see #getGUnit()
	 * @see #setGUnit(UnitType)
	 * @generated
	 */
	boolean isSetGUnit();

	/**
	 * Returns the value of the '<em><b>BUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link admittance.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the Imaginary part
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUnit</em>' attribute.
	 * @see admittance.UnitType
	 * @see #isSetBUnit()
	 * @see #unsetBUnit()
	 * @see #setBUnit(UnitType)
	 * @see admittance.AdmittancePackage#getAdmittanceUnitMeasuredType_BUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='BUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getBUnit();

	/**
	 * Sets the value of the '{@link admittance.AdmittanceUnitMeasuredType#getBUnit <em>BUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUnit</em>' attribute.
	 * @see admittance.UnitType
	 * @see #isSetBUnit()
	 * @see #unsetBUnit()
	 * @see #getBUnit()
	 * @generated
	 */
	void setBUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link admittance.AdmittanceUnitMeasuredType#getBUnit <em>BUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBUnit()
	 * @see #getBUnit()
	 * @see #setBUnit(UnitType)
	 * @generated
	 */
	void unsetBUnit();

	/**
	 * Returns whether the value of the '{@link admittance.AdmittanceUnitMeasuredType#getBUnit <em>BUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BUnit</em>' attribute is set.
	 * @see #unsetBUnit()
	 * @see #getBUnit()
	 * @see #setBUnit(UnitType)
	 * @generated
	 */
	boolean isSetBUnit();

} // AdmittanceUnitMeasuredType
