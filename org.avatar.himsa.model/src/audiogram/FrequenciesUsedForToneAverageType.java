/*
 */
package audiogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequencies Used For Tone Average Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## TToneAvgCalcValues; ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.FrequenciesUsedForToneAverageType#getLeftEar1 <em>Left Ear1</em>}</li>
 *   <li>{@link audiogram.FrequenciesUsedForToneAverageType#getLeftEar2 <em>Left Ear2</em>}</li>
 *   <li>{@link audiogram.FrequenciesUsedForToneAverageType#getRightEar1 <em>Right Ear1</em>}</li>
 *   <li>{@link audiogram.FrequenciesUsedForToneAverageType#getRightEar2 <em>Right Ear2</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getFrequenciesUsedForToneAverageType()
 * @model extendedMetaData="name='FrequenciesUsedForToneAverage_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FrequenciesUsedForToneAverageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Ear1</b></em>' attribute list.
	 * The list contents are of type {@link audiogram.ToneAverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequencies used to calculate the average for LeftEar1
	 * 
	 * ## TToneAvg ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Ear1</em>' attribute list.
	 * @see audiogram.AudiogramPackage#getFrequenciesUsedForToneAverageType_LeftEar1()
	 * @model unique="false" dataType="audiogram.LeftEar1Type" upper="13"
	 *        extendedMetaData="kind='element' name='LeftEar1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToneAverageType> getLeftEar1();

	/**
	 * Returns the value of the '<em><b>Left Ear2</b></em>' attribute list.
	 * The list contents are of type {@link audiogram.ToneAverageType}.
	 * The literals are from the enumeration {@link audiogram.ToneAverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequencies used to calculate the average for LeftEar2
	 * 
	 * ## TToneAvg ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Ear2</em>' attribute list.
	 * @see audiogram.ToneAverageType
	 * @see audiogram.AudiogramPackage#getFrequenciesUsedForToneAverageType_LeftEar2()
	 * @model unique="false" upper="13"
	 *        extendedMetaData="kind='element' name='LeftEar2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToneAverageType> getLeftEar2();

	/**
	 * Returns the value of the '<em><b>Right Ear1</b></em>' attribute list.
	 * The list contents are of type {@link audiogram.ToneAverageType}.
	 * The literals are from the enumeration {@link audiogram.ToneAverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequencies used to calculate the average for RightEar1
	 * 
	 * ## TToneAvg ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Ear1</em>' attribute list.
	 * @see audiogram.ToneAverageType
	 * @see audiogram.AudiogramPackage#getFrequenciesUsedForToneAverageType_RightEar1()
	 * @model unique="false" upper="13"
	 *        extendedMetaData="kind='element' name='RightEar1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToneAverageType> getRightEar1();

	/**
	 * Returns the value of the '<em><b>Right Ear2</b></em>' attribute list.
	 * The list contents are of type {@link audiogram.ToneAverageType}.
	 * The literals are from the enumeration {@link audiogram.ToneAverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequencies used to calculate the average for RightEar2
	 * 
	 * ## TToneAvg ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Ear2</em>' attribute list.
	 * @see audiogram.ToneAverageType
	 * @see audiogram.AudiogramPackage#getFrequenciesUsedForToneAverageType_RightEar2()
	 * @model unique="false" upper="13"
	 *        extendedMetaData="kind='element' name='RightEar2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToneAverageType> getRightEar2();

} // FrequenciesUsedForToneAverageType
