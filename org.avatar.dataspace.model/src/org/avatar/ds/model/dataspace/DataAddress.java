/*
 */
package org.avatar.ds.model.dataspace;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.DataAddress#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataAddress#getName <em>Name</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataAddress#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataAddress#isProxyPath <em>Proxy Path</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataAddress()
 * @model
 * @generated
 */
@ProviderType
public interface DataAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataAddress_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataAddress#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataAddress_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataAddress#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataAddress_BaseUrl()
	 * @model
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataAddress#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Path</em>' attribute.
	 * @see #setProxyPath(boolean)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataAddress_ProxyPath()
	 * @model
	 * @generated
	 */
	boolean isProxyPath();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataAddress#isProxyPath <em>Proxy Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Path</em>' attribute.
	 * @see #isProxyPath()
	 * @generated
	 */
	void setProxyPath(boolean value);

} // DataAddress
