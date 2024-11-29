/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Current Policy States For Signer Ids Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentPolicyStatesForSignerIdsResponse()
 * @model extendedMetaData="name='getCurrentPolicyStatesForSignerIdsResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCurrentPolicyStatesForSignerIdsResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(ReturnType9)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentPolicyStatesForSignerIdsResponse_Return()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ReturnType9 getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType9 value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType9)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' containment reference is set.
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType9)
	 * @generated
	 */
	boolean isSetReturn();

} // GetCurrentPolicyStatesForSignerIdsResponse
