/*
 */
package admittance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe Frequency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.ProbeFrequencyType#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link admittance.ProbeFrequencyType#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getProbeFrequencyType()
 * @model extendedMetaData="name='ProbeFrequency_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProbeFrequencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The default value is <code>"226"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #setFrequency(BigInteger)
	 * @see admittance.AdmittancePackage#getProbeFrequencyType_Frequency()
	 * @model default="226" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link admittance.ProbeFrequencyType#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(BigInteger value);

	/**
	 * Unsets the value of the '{@link admittance.ProbeFrequencyType#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(BigInteger)
	 * @generated
	 */
	void unsetFrequency();

	/**
	 * Returns whether the value of the '{@link admittance.ProbeFrequencyType#getFrequency <em>Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency</em>' attribute is set.
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(BigInteger)
	 * @generated
	 */
	boolean isSetFrequency();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * The default value is <code>"Other"</code>.
	 * The literals are from the enumeration {@link admittance.FrequencyOtherType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other or unknow frequency
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see admittance.FrequencyOtherType
	 * @see #isSetOther()
	 * @see #unsetOther()
	 * @see #setOther(FrequencyOtherType)
	 * @see admittance.AdmittancePackage#getProbeFrequencyType_Other()
	 * @model default="Other" unsettable="true"
	 *        extendedMetaData="kind='element' name='Other' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyOtherType getOther();

	/**
	 * Sets the value of the '{@link admittance.ProbeFrequencyType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see admittance.FrequencyOtherType
	 * @see #isSetOther()
	 * @see #unsetOther()
	 * @see #getOther()
	 * @generated
	 */
	void setOther(FrequencyOtherType value);

	/**
	 * Unsets the value of the '{@link admittance.ProbeFrequencyType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOther()
	 * @see #getOther()
	 * @see #setOther(FrequencyOtherType)
	 * @generated
	 */
	void unsetOther();

	/**
	 * Returns whether the value of the '{@link admittance.ProbeFrequencyType#getOther <em>Other</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Other</em>' attribute is set.
	 * @see #unsetOther()
	 * @see #getOther()
	 * @see #setOther(FrequencyOtherType)
	 * @generated
	 */
	boolean isSetOther();

} // ProbeFrequencyType
