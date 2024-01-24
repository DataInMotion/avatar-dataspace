/*
 */
package tinnitus;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of Signal used in the measurement. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.SignalType#getSignalTypes <em>Signal Types</em>}</li>
 *   <li>{@link tinnitus.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getSignalType()
 * @model extendedMetaData="name='Signal_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Types</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.SignalTypesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Other type should be specified in the OtherSignalType element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Types</em>' attribute.
	 * @see tinnitus.SignalTypesType
	 * @see #isSetSignalTypes()
	 * @see #unsetSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @see tinnitus.TinnitusPackage#getSignalType_SignalTypes()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Types' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalTypesType getSignalTypes();

	/**
	 * Sets the value of the '{@link tinnitus.SignalType#getSignalTypes <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Types</em>' attribute.
	 * @see tinnitus.SignalTypesType
	 * @see #isSetSignalTypes()
	 * @see #unsetSignalTypes()
	 * @see #getSignalTypes()
	 * @generated
	 */
	void setSignalTypes(SignalTypesType value);

	/**
	 * Unsets the value of the '{@link tinnitus.SignalType#getSignalTypes <em>Signal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalTypes()
	 * @see #getSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @generated
	 */
	void unsetSignalTypes();

	/**
	 * Returns whether the value of the '{@link tinnitus.SignalType#getSignalTypes <em>Signal Types</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Types</em>' attribute is set.
	 * @see #unsetSignalTypes()
	 * @see #getSignalTypes()
	 * @see #setSignalTypes(SignalTypesType)
	 * @generated
	 */
	boolean isSetSignalTypes();

	/**
	 * Returns the value of the '<em><b>Other Signal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the Signal used when referring to "Other" signal type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Signal Specification</em>' attribute.
	 * @see #setOtherSignalSpecification(String)
	 * @see tinnitus.TinnitusPackage#getSignalType_OtherSignalSpecification()
	 * @model dataType="tinnitus.OtherSignalSpecificationType"
	 *        extendedMetaData="kind='element' name='OtherSignalSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOtherSignalSpecification();

	/**
	 * Sets the value of the '{@link tinnitus.SignalType#getOtherSignalSpecification <em>Other Signal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Signal Specification</em>' attribute.
	 * @see #getOtherSignalSpecification()
	 * @generated
	 */
	void setOtherSignalSpecification(String value);

} // SignalType
