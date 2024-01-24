/*
 */
package audiogram502;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.InformationType#getComments <em>Comments</em>}</li>
 *   <li>{@link audiogram502.InformationType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getInformationType()
 * @model extendedMetaData="name='Information_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface InformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General Comments about  the data from the developer of the data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(Object)
	 * @see audiogram502.Audiogram502Package#getInformationType_Comments()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Comments'"
	 * @generated
	 */
	Object getComments();

	/**
	 * Sets the value of the '{@link audiogram502.InformationType#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(BigInteger)
	 * @see audiogram502.Audiogram502Package#getInformationType_Version()
	 * @model dataType="audiogram502.VersionType1" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link audiogram502.InformationType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

} // InformationType
