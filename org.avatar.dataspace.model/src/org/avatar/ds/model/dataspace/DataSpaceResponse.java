/*
 */
package org.avatar.ds.model.dataspace;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Space Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getPath <em>Path</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getInvalidValue <em>Invalid Value</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse()
 * @model
 * @generated
 */
@ProviderType
public interface DataSpaceResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_Id()
	 * @model annotation="JsonProperty value='@id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_Type()
	 * @model annotation="JsonProperty value='@type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_Context()
	 * @model containment="true"
	 *        annotation="JsonProperty value='@context'"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Type</em>' attribute.
	 * @see #setResponseType(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_ResponseType()
	 * @model annotation="JsonProperty value='type'"
	 * @generated
	 */
	String getResponseType();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getResponseType <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Type</em>' attribute.
	 * @see #getResponseType()
	 * @generated
	 */
	void setResponseType(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(long)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_CreatedAt()
	 * @model
	 * @generated
	 */
	long getCreatedAt();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(long value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Invalid Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Value</em>' attribute.
	 * @see #setInvalidValue(String)
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#getDataSpaceResponse_InvalidValue()
	 * @model
	 * @generated
	 */
	String getInvalidValue();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getInvalidValue <em>Invalid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Value</em>' attribute.
	 * @see #getInvalidValue()
	 * @generated
	 */
	void setInvalidValue(String value);

} // DataSpaceResponse
