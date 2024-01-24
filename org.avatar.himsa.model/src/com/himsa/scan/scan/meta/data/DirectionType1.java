/*
 */
package com.himsa.scan.scan.meta.data;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.DirectionType1#getAnnotationComment <em>Annotation Comment</em>}</li>
 * </ul>
 *
 * @see com.himsa.scan.scan.meta.data.DataPackage#getDirectionType1()
 * @model extendedMetaData="name='Direction_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DirectionType1 extends DirectionType {
	/**
	 * Returns the value of the '<em><b>Annotation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comment is used to describe the direction in more detail.  There are no specifically defined enumerated values at this time.  
	 * 
	 * The assumed purposes of the annotation is that it will be read by a human and not a computer system where it could be incorporated into an automation process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Comment</em>' attribute.
	 * @see #setAnnotationComment(String)
	 * @see com.himsa.scan.scan.meta.data.DataPackage#getDirectionType1_AnnotationComment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AnnotationComment'"
	 * @generated
	 */
	String getAnnotationComment();

	/**
	 * Sets the value of the '{@link com.himsa.scan.scan.meta.data.DirectionType1#getAnnotationComment <em>Annotation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Comment</em>' attribute.
	 * @see #getAnnotationComment()
	 * @generated
	 */
	void setAnnotationComment(String value);

} // DirectionType1
