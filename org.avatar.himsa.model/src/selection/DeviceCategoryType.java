/*
 */
package selection;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link selection.DeviceCategoryType#getDeviceCategoryTypeCode <em>Device Category Type Code</em>}</li>
 *   <li>{@link selection.DeviceCategoryType#getDeviceCategoryText <em>Device Category Text</em>}</li>
 * </ul>
 *
 * @see selection.SelectionPackage#getDeviceCategoryType()
 * @model extendedMetaData="name='DeviceCategory_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceCategoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Category Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is solely determined by the manufacturer.  The values are not publicly defined to shared across all industry manufacturers.
	 * 
	 * ## DevCatCode ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Category Type Code</em>' attribute.
	 * @see #setDeviceCategoryTypeCode(BigInteger)
	 * @see selection.SelectionPackage#getDeviceCategoryType_DeviceCategoryTypeCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DeviceCategoryTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDeviceCategoryTypeCode();

	/**
	 * Sets the value of the '{@link selection.DeviceCategoryType#getDeviceCategoryTypeCode <em>Device Category Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Category Type Code</em>' attribute.
	 * @see #getDeviceCategoryTypeCode()
	 * @generated
	 */
	void setDeviceCategoryTypeCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Device Category Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is used to describe the type of instrument (e.g. BTE, ITE).  This value is not a fixed enumerated value.
	 * 
	 * ## DevCatText ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Category Text</em>' attribute.
	 * @see #setDeviceCategoryText(String)
	 * @see selection.SelectionPackage#getDeviceCategoryType_DeviceCategoryText()
	 * @model dataType="selection.DeviceCategoryTextType"
	 *        extendedMetaData="kind='element' name='DeviceCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeviceCategoryText();

	/**
	 * Sets the value of the '{@link selection.DeviceCategoryType#getDeviceCategoryText <em>Device Category Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Category Text</em>' attribute.
	 * @see #getDeviceCategoryText()
	 * @generated
	 */
	void setDeviceCategoryText(String value);

} // DeviceCategoryType
