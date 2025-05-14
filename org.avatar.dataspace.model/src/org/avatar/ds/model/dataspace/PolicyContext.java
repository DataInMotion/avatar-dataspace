/*
 */
package org.avatar.ds.model.dataspace;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.PolicyContext#getOdrl <em>Odrl</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.PolicyContext#getEdc <em>Edc</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getPolicyContext()
 * @model
 * @generated
 */
@ProviderType
public interface PolicyContext extends Context {
	/**
	 * Returns the value of the '<em><b>Odrl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odrl</em>' attribute.
	 * @see #setOdrl(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getPolicyContext_Odrl()
	 * @model
	 * @generated
	 */
	String getOdrl();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.PolicyContext#getOdrl <em>Odrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odrl</em>' attribute.
	 * @see #getOdrl()
	 * @generated
	 */
	void setOdrl(String value);

	/**
	 * Returns the value of the '<em><b>Edc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edc</em>' attribute.
	 * @see #setEdc(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getPolicyContext_Edc()
	 * @model
	 * @generated
	 */
	String getEdc();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.PolicyContext#getEdc <em>Edc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edc</em>' attribute.
	 * @see #getEdc()
	 * @generated
	 */
	void setEdc(String value);

} // PolicyContext
