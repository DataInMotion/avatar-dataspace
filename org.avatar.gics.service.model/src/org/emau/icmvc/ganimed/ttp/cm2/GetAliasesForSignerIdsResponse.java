/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Aliases For Signer Ids Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerIdsResponse()
 * @model extendedMetaData="name='getAliasesForSignerIdsResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetAliasesForSignerIdsResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(ReturnType22)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerIdsResponse_Return()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ReturnType22 getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType22 value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType22)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIdsResponse#getReturn <em>Return</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' containment reference is set.
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType22)
	 * @generated
	 */
	boolean isSetReturn();

} // GetAliasesForSignerIdsResponse
