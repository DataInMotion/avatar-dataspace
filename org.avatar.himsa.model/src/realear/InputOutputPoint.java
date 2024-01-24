/*
 */
package realear;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a measurement point for Input/Output measurements,
 * 
 * Note: no frequency information in single points. This is common for all the measurement points and the value is stated in MeasCond.
 * 
 * ## TIOMeasPoint; ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realear.InputOutputPoint#getInput <em>Input</em>}</li>
 *   <li>{@link realear.InputOutputPoint#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getInputOutputPoint()
 * @model extendedMetaData="name='InputOutputPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InputOutputPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal Input Level
	 * 
	 * ##input##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(BigDecimal)
	 * @see realear.RealearPackage#getInputOutputPoint_Input()
	 * @model dataType="realear.InputType1" required="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInput();

	/**
	 * Sets the value of the '{@link realear.InputOutputPoint#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal Output Level
	 * 
	 * ##output##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(BigDecimal)
	 * @see realear.RealearPackage#getInputOutputPoint_Output()
	 * @model dataType="realear.OutputType2" required="true"
	 *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutput();

	/**
	 * Sets the value of the '{@link realear.InputOutputPoint#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(BigDecimal value);

} // InputOutputPoint
