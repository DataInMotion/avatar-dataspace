/*
 */
package data;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scan Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.ScanPropertiesType#getGroup <em>Group</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getScanTimeStamp <em>Scan Time Stamp</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getEar <em>Ear</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getJawPosition <em>Jaw Position</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getScanFormat <em>Scan Format</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getScanComment <em>Scan Comment</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getScanFileAndLocation <em>Scan File And Location</em>}</li>
 *   <li>{@link data.ScanPropertiesType#getScanStoredInNoah <em>Scan Stored In Noah</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getScanPropertiesType()
 * @model extendedMetaData="name='ScanProperties_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScanPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see data.DataPackage#getScanPropertiesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Scan Time Stamp</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data and Time that the scan was obtained from the patient.  This is the date and time obtained not the date/time that the data was saved
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Time Stamp</em>' attribute list.
	 * @see data.DataPackage#getScanPropertiesType_ScanTimeStamp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScanTimeStamp' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getScanTimeStamp();

	/**
	 * Returns the value of the '<em><b>Ear</b></em>' attribute list.
	 * The list contents are of type {@link data.EarType}.
	 * The literals are from the enumeration {@link data.EarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ear Side
	 * 
	 * + Right
	 * + Left
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ear</em>' attribute list.
	 * @see data.EarType
	 * @see data.DataPackage#getScanPropertiesType_Ear()
	 * @model unique="false" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ear' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EarType> getEar();

	/**
	 * Returns the value of the '<em><b>Jaw Position</b></em>' attribute list.
	 * The list contents are of type {@link data.JawPositionType}.
	 * The literals are from the enumeration {@link data.JawPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the patient’s jaw while the scan was obtained
	 * + Closed – jaw is closed so that upper and lower teeth are in contact with each other
	 * + Open – The jaw is open as far as possible without discomfort
	 * + Bite-Block - Material placed on molars. Patient bites down while impression or scan is taken. 
	 * + Unknown - The jaw position is unknown.  If no jaw position is listed it is also implied to be unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jaw Position</em>' attribute list.
	 * @see data.JawPositionType
	 * @see data.DataPackage#getScanPropertiesType_JawPosition()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JawPosition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JawPositionType> getJawPosition();

	/**
	 * Returns the value of the '<em><b>Scan Format</b></em>' attribute list.
	 * The list contents are of type {@link data.ScanFormatType}.
	 * The literals are from the enumeration {@link data.ScanFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format in which the scan (Geometry Points) 
	 * +HPS
	 * +STL Binary
	 * +ASC
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Format</em>' attribute list.
	 * @see data.ScanFormatType
	 * @see data.DataPackage#getScanPropertiesType_ScanFormat()
	 * @model unique="false" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScanFormat' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ScanFormatType> getScanFormat();

	/**
	 * Returns the value of the '<em><b>Scan Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general comment from the user of the scan solution to the manufacturer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Comment</em>' attribute list.
	 * @see data.DataPackage#getScanPropertiesType_ScanComment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScanComment' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getScanComment();

	/**
	 * Returns the value of the '<em><b>Scan File And Location</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A computer name or network address which includes the specific file name of the scan.  
	 * Legal Examples:
	 * •	ScanFile.stl
	 * •	\\localServerName\Path\ScanLeft.hps
	 * •	https://www.scanprovider.com/rightscan98349kdskddks.stl
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan File And Location</em>' attribute list.
	 * @see data.DataPackage#getScanPropertiesType_ScanFileAndLocation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScanFileAndLocation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getScanFileAndLocation();

	/**
	 * Returns the value of the '<em><b>Scan Stored In Noah</b></em>' containment reference list.
	 * The list contents are of type {@link data.StoredInNoahType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the ear scan(s) are stored in Noah as Noah actions this element is used to help find and read the data in Noah
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Stored In Noah</em>' containment reference list.
	 * @see data.DataPackage#getScanPropertiesType_ScanStoredInNoah()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScanStoredInNoah' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StoredInNoahType> getScanStoredInNoah();

} // ScanPropertiesType
