/*
 */
package test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## TTargetPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.TargetPoint#getTargetFrequency <em>Target Frequency</em>}</li>
 *   <li>{@link test.TargetPoint#getTargetGain <em>Target Gain</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getTargetPoint()
 * @model extendedMetaData="name='TargetPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Frequency.
	 * 
	 * ##targetFreq##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Frequency</em>' attribute.
	 * @see #setTargetFrequency(BigInteger)
	 * @see test.TestPackage#getTargetPoint_TargetFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='TargetFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTargetFrequency();

	/**
	 * Sets the value of the '{@link test.TargetPoint#getTargetFrequency <em>Target Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Frequency</em>' attribute.
	 * @see #getTargetFrequency()
	 * @generated
	 */
	void setTargetFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Target Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Gain. 
	 * 
	 * ##targetGain##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Gain</em>' attribute.
	 * @see #setTargetGain(BigDecimal)
	 * @see test.TestPackage#getTargetPoint_TargetGain()
	 * @model dataType="test.TargetGainType" required="true"
	 *        extendedMetaData="kind='element' name='TargetGain' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTargetGain();

	/**
	 * Sets the value of the '{@link test.TargetPoint#getTargetGain <em>Target Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Gain</em>' attribute.
	 * @see #getTargetGain()
	 * @generated
	 */
	void setTargetGain(BigDecimal value);

} // TargetPoint
