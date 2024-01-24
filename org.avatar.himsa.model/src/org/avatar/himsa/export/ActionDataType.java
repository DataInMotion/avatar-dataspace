/*
 */
package org.avatar.himsa.export;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getTypeOfData <em>Type Of Data</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getActionDate <em>Action Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getPublicData <em>Public Data</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getModuleId <em>Module Id</em>}</li>
 *   <li>{@link org.avatar.himsa.export.ActionDataType#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType()
 * @model extendedMetaData="name='Action_Data_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActionDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Of Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.avatar.himsa.export.TypeOfDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Data</em>' attribute.
	 * @see org.avatar.himsa.export.TypeOfDataType
	 * @see #isSetTypeOfData()
	 * @see #unsetTypeOfData()
	 * @see #setTypeOfData(TypeOfDataType)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_TypeOfData()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeOfData' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeOfDataType getTypeOfData();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getTypeOfData <em>Type Of Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Data</em>' attribute.
	 * @see org.avatar.himsa.export.TypeOfDataType
	 * @see #isSetTypeOfData()
	 * @see #unsetTypeOfData()
	 * @see #getTypeOfData()
	 * @generated
	 */
	void setTypeOfData(TypeOfDataType value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getTypeOfData <em>Type Of Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOfData()
	 * @see #getTypeOfData()
	 * @see #setTypeOfData(TypeOfDataType)
	 * @generated
	 */
	void unsetTypeOfData();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getTypeOfData <em>Type Of Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Of Data</em>' attribute is set.
	 * @see #unsetTypeOfData()
	 * @see #getTypeOfData()
	 * @see #setTypeOfData(TypeOfDataType)
	 * @generated
	 */
	boolean isSetTypeOfData();

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(BigInteger)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_DataFormat()
	 * @model dataType="org.avatar.himsa.export.DataFormatType" required="true"
	 *        extendedMetaData="kind='element' name='DataFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDataFormat();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_Description()
	 * @model dataType="org.avatar.himsa.export.DescriptionType" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Action Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Date</em>' attribute.
	 * @see #setActionDate(XMLGregorianCalendar)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_ActionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='ActionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActionDate();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getActionDate <em>Action Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Date</em>' attribute.
	 * @see #getActionDate()
	 * @generated
	 */
	void setActionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #setLastModifiedDate(XMLGregorianCalendar)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_LastModifiedDate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LastModifiedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetLastModifiedDate();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getLastModifiedDate <em>Last Modified Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modified Date</em>' attribute is set.
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetLastModifiedDate();

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NOAH user that created the data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_UserId()
	 * @model dataType="org.avatar.himsa.export.UserIdType" required="true"
	 *        extendedMetaData="kind='element' name='UserId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Public Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Data</em>' containment reference.
	 * @see #isSetPublicData()
	 * @see #unsetPublicData()
	 * @see #setPublicData(PubliclyFormattedData)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_PublicData()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PublicData' namespace='##targetNamespace'"
	 * @generated
	 */
	PubliclyFormattedData getPublicData();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getPublicData <em>Public Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Data</em>' containment reference.
	 * @see #isSetPublicData()
	 * @see #unsetPublicData()
	 * @see #getPublicData()
	 * @generated
	 */
	void setPublicData(PubliclyFormattedData value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getPublicData <em>Public Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublicData()
	 * @see #getPublicData()
	 * @see #setPublicData(PubliclyFormattedData)
	 * @generated
	 */
	void unsetPublicData();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getPublicData <em>Public Data</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Public Data</em>' containment reference is set.
	 * @see #unsetPublicData()
	 * @see #getPublicData()
	 * @see #setPublicData(PubliclyFormattedData)
	 * @generated
	 */
	boolean isSetPublicData();

	/**
	 * Returns the value of the '<em><b>Action Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used to group actions that are grouped together.  A common example of this would be left hearing instrument selection action and a right being stored with the same actiongroup so that it is known that the patient was fit at the same time with these two instruments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Group</em>' attribute.
	 * @see #isSetActionGroup()
	 * @see #unsetActionGroup()
	 * @see #setActionGroup(XMLGregorianCalendar)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_ActionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ActionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActionGroup();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getActionGroup <em>Action Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Group</em>' attribute.
	 * @see #isSetActionGroup()
	 * @see #unsetActionGroup()
	 * @see #getActionGroup()
	 * @generated
	 */
	void setActionGroup(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getActionGroup <em>Action Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionGroup()
	 * @see #getActionGroup()
	 * @see #setActionGroup(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetActionGroup();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getActionGroup <em>Action Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Group</em>' attribute is set.
	 * @see #unsetActionGroup()
	 * @see #getActionGroup()
	 * @see #setActionGroup(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetActionGroup();

	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see #isSetDeviceType()
	 * @see #unsetDeviceType()
	 * @see #setDeviceType(int)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_DeviceType()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.DeviceTypeType"
	 *        extendedMetaData="kind='element' name='DeviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDeviceType();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see #isSetDeviceType()
	 * @see #unsetDeviceType()
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(int value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceType()
	 * @see #getDeviceType()
	 * @see #setDeviceType(int)
	 * @generated
	 */
	void unsetDeviceType();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getDeviceType <em>Device Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Type</em>' attribute is set.
	 * @see #unsetDeviceType()
	 * @see #getDeviceType()
	 * @see #setDeviceType(int)
	 * @generated
	 */
	boolean isSetDeviceType();

	/**
	 * Returns the value of the '<em><b>Module Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Id</em>' attribute.
	 * @see #setModuleId(BigInteger)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_ModuleId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ModuleId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getModuleId();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getModuleId <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Id</em>' attribute.
	 * @see #getModuleId()
	 * @generated
	 */
	void setModuleId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.avatar.himsa.export.OperationTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.avatar.himsa.export.OperationTYPE
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #setOperation(OperationTYPE)
	 * @see org.avatar.himsa.export.PatientExportPackage#getActionDataType_Operation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='operation'"
	 * @generated
	 */
	OperationTYPE getOperation();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.ActionDataType#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.avatar.himsa.export.OperationTYPE
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationTYPE value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.ActionDataType#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OperationTYPE)
	 * @generated
	 */
	void unsetOperation();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.ActionDataType#getOperation <em>Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation</em>' attribute is set.
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OperationTYPE)
	 * @generated
	 */
	boolean isSetOperation();

} // ActionDataType
