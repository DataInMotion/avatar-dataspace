/*
 */
package remotecontrol;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link remotecontrol.BatteryType#getBatteryTypeCode <em>Battery Type Code</em>}</li>
 *   <li>{@link remotecontrol.BatteryType#getBatteryTypeText <em>Battery Type Text</em>}</li>
 * </ul>
 *
 * @see remotecontrol.RemotecontrolPackage#getBatteryType()
 * @model extendedMetaData="name='Battery_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BatteryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Battery Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is solely determined by the manufacturer.  The values are not publicly defined to shared across all industry manufacturers
	 * 
	 * ## BatTypeCode ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Type Code</em>' attribute.
	 * @see #setBatteryTypeCode(BigInteger)
	 * @see remotecontrol.RemotecontrolPackage#getBatteryType_BatteryTypeCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='BatteryTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBatteryTypeCode();

	/**
	 * Sets the value of the '{@link remotecontrol.BatteryType#getBatteryTypeCode <em>Battery Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Type Code</em>' attribute.
	 * @see #getBatteryTypeCode()
	 * @generated
	 */
	void setBatteryTypeCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Battery Type Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free form text to describe the battery (eg. r13 r14)
	 * 
	 * ## BatTypeText ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Type Text</em>' attribute.
	 * @see #setBatteryTypeText(String)
	 * @see remotecontrol.RemotecontrolPackage#getBatteryType_BatteryTypeText()
	 * @model dataType="remotecontrol.BatteryTypeTextType"
	 *        extendedMetaData="kind='element' name='BatteryTypeText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBatteryTypeText();

	/**
	 * Sets the value of the '{@link remotecontrol.BatteryType#getBatteryTypeText <em>Battery Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Type Text</em>' attribute.
	 * @see #getBatteryTypeText()
	 * @generated
	 */
	void setBatteryTypeText(String value);

} // BatteryType
