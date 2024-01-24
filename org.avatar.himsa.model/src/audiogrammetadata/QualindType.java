/*
 */
package audiogrammetadata;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.QualindType#getDefinedValue <em>Defined Value</em>}</li>
 *   <li>{@link audiogrammetadata.QualindType#getDisagree <em>Disagree</em>}</li>
 * </ul>
 *
 * @see audiogrammetadata.AudiogrammetadataPackage#getQualindType()
 * @model extendedMetaData="name='Qualind_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QualindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined Value</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.DefinedValueType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualind defined values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Value</em>' attribute.
	 * @see audiogrammetadata.DefinedValueType1
	 * @see #isSetDefinedValue()
	 * @see #unsetDefinedValue()
	 * @see #setDefinedValue(DefinedValueType1)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getQualindType_DefinedValue()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DefinedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinedValueType1 getDefinedValue();

	/**
	 * Sets the value of the '{@link audiogrammetadata.QualindType#getDefinedValue <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Value</em>' attribute.
	 * @see audiogrammetadata.DefinedValueType1
	 * @see #isSetDefinedValue()
	 * @see #unsetDefinedValue()
	 * @see #getDefinedValue()
	 * @generated
	 */
	void setDefinedValue(DefinedValueType1 value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.QualindType#getDefinedValue <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinedValue()
	 * @see #getDefinedValue()
	 * @see #setDefinedValue(DefinedValueType1)
	 * @generated
	 */
	void unsetDefinedValue();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.QualindType#getDefinedValue <em>Defined Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defined Value</em>' attribute is set.
	 * @see #unsetDefinedValue()
	 * @see #getDefinedValue()
	 * @see #setDefinedValue(DefinedValueType1)
	 * @generated
	 */
	boolean isSetDefinedValue();

	/**
	 * Returns the value of the '<em><b>Disagree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If text is stored in Disagree this means that the hearing care professional has disagreed with Qualind.  They will then be able enter their own free from text based value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disagree</em>' attribute.
	 * @see #setDisagree(String)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getQualindType_Disagree()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Disagree' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisagree();

	/**
	 * Sets the value of the '{@link audiogrammetadata.QualindType#getDisagree <em>Disagree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disagree</em>' attribute.
	 * @see #getDisagree()
	 * @generated
	 */
	void setDisagree(String value);

} // QualindType
