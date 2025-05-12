/*
 */
package org.avatar.ds.model.asset;

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
 *   <li>{@link org.avatar.ds.model.asset.PolicyContext#getOdrl <em>Odrl</em>}</li>
 * </ul>
 *
 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicyContext()
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
	 * @see org.avatar.ds.model.asset.DataSpaceAssetPackage#getPolicyContext_Odrl()
	 * @model
	 * @generated
	 */
	String getOdrl();

	/**
	 * Sets the value of the '{@link org.avatar.ds.model.asset.PolicyContext#getOdrl <em>Odrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odrl</em>' attribute.
	 * @see #getOdrl()
	 * @generated
	 */
	void setOdrl(String value);

} // PolicyContext
