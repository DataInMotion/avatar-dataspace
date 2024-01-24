/*
 */
package notification;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notification.NotificationActionType#getCategory <em>Category</em>}</li>
 *   <li>{@link notification.NotificationActionType#getDescription <em>Description</em>}</li>
 *   <li>{@link notification.NotificationActionType#getActionGUID <em>Action GUID</em>}</li>
 *   <li>{@link notification.NotificationActionType#getUrl <em>Url</em>}</li>
 *   <li>{@link notification.NotificationActionType#getModuleID <em>Module ID</em>}</li>
 *   <li>{@link notification.NotificationActionType#getModuleParameter <em>Module Parameter</em>}</li>
 *   <li>{@link notification.NotificationActionType#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link notification.NotificationActionType#getGroup <em>Group</em>}</li>
 *   <li>{@link notification.NotificationActionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link notification.NotificationActionType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see notification.NotificationPackage#getNotificationActionType()
 * @model extendedMetaData="name='NotificationAction_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NotificationActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must be one of the pre-defined values.  The string will be verified to see if it matches one of the pre-defined valid strings. These strings are defined in the cloud but will dynamically be retrieved by NoahServer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see notification.NotificationPackage#getNotificationActionType_Category()
	 * @model dataType="notification.CategoryType" required="true"
	 *        extendedMetaData="kind='element' name='Category' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Notification Description.  The notification description is not be confused with Action Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see notification.NotificationPackage#getNotificationActionType_Description()
	 * @model dataType="notification.DescriptionType" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Action GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to reference the action that was sent, or referenced, in the same Notification (if any)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action GUID</em>' attribute.
	 * @see #isSetActionGUID()
	 * @see #unsetActionGUID()
	 * @see #setActionGUID(String)
	 * @see notification.NotificationPackage#getNotificationActionType_ActionGUID()
	 * @model unsettable="true" dataType="notification.ActionGUIDType"
	 *        extendedMetaData="kind='element' name='ActionGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActionGUID();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getActionGUID <em>Action GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action GUID</em>' attribute.
	 * @see #isSetActionGUID()
	 * @see #unsetActionGUID()
	 * @see #getActionGUID()
	 * @generated
	 */
	void setActionGUID(String value);

	/**
	 * Unsets the value of the '{@link notification.NotificationActionType#getActionGUID <em>Action GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionGUID()
	 * @see #getActionGUID()
	 * @see #setActionGUID(String)
	 * @generated
	 */
	void unsetActionGUID();

	/**
	 * Returns whether the value of the '{@link notification.NotificationActionType#getActionGUID <em>Action GUID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action GUID</em>' attribute is set.
	 * @see #unsetActionGUID()
	 * @see #getActionGUID()
	 * @see #setActionGUID(String)
	 * @generated
	 */
	boolean isSetActionGUID();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If provided Noah will use this link to open the default web browser when the user selects the notification action in the GUI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see notification.NotificationPackage#getNotificationActionType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Module ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If provided Noah will open this module when the user selects the notification action in the GUI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module ID</em>' attribute.
	 * @see #isSetModuleID()
	 * @see #unsetModuleID()
	 * @see #setModuleID(Integer)
	 * @see notification.NotificationPackage#getNotificationActionType_ModuleID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 *        extendedMetaData="kind='element' name='ModuleID' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getModuleID();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getModuleID <em>Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module ID</em>' attribute.
	 * @see #isSetModuleID()
	 * @see #unsetModuleID()
	 * @see #getModuleID()
	 * @generated
	 */
	void setModuleID(Integer value);

	/**
	 * Unsets the value of the '{@link notification.NotificationActionType#getModuleID <em>Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModuleID()
	 * @see #getModuleID()
	 * @see #setModuleID(Integer)
	 * @generated
	 */
	void unsetModuleID();

	/**
	 * Returns whether the value of the '{@link notification.NotificationActionType#getModuleID <em>Module ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Module ID</em>' attribute is set.
	 * @see #unsetModuleID()
	 * @see #getModuleID()
	 * @see #setModuleID(Integer)
	 * @generated
	 */
	boolean isSetModuleID();

	/**
	 * Returns the value of the '<em><b>Module Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * command line argument when opening a module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Parameter</em>' attribute.
	 * @see #setModuleParameter(String)
	 * @see notification.NotificationPackage#getNotificationActionType_ModuleParameter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ModuleParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModuleParameter();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getModuleParameter <em>Module Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Parameter</em>' attribute.
	 * @see #getModuleParameter()
	 * @generated
	 */
	void setModuleParameter(String value);

	/**
	 * Returns the value of the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * url address to icon resource. Used in conjunction with URL
	 * 
	 * If this value isn’t provided and the ’Url’ value is provided – then a default icon will be displayed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon Url</em>' attribute.
	 * @see #setIconUrl(String)
	 * @see notification.NotificationPackage#getNotificationActionType_IconUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='IconUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIconUrl();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getIconUrl <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Url</em>' attribute.
	 * @see #getIconUrl()
	 * @generated
	 */
	void setIconUrl(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to mark a notification action/alert as a part of a series of notification actions/alerts with the same Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #isSetGroup()
	 * @see #unsetGroup()
	 * @see #setGroup(String)
	 * @see notification.NotificationPackage#getNotificationActionType_Group()
	 * @model unsettable="true" dataType="notification.GroupType"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #isSetGroup()
	 * @see #unsetGroup()
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Unsets the value of the '{@link notification.NotificationActionType#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroup()
	 * @see #getGroup()
	 * @see #setGroup(String)
	 * @generated
	 */
	void unsetGroup();

	/**
	 * Returns whether the value of the '{@link notification.NotificationActionType#getGroup <em>Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group</em>' attribute is set.
	 * @see #unsetGroup()
	 * @see #getGroup()
	 * @see #setGroup(String)
	 * @generated
	 */
	boolean isSetGroup();

	/**
	 * Returns the value of the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software saving data formatted via this XSD file should not use this element for storage.  The intention is for Noah data convertors to fill in an appropriate value for runtime conversions - not permanent storage.
	 * 
	 * Please note that values less than 500 mean that the data was originally stored in a format which was not validated by Noah before storage.  This could mean that the data will not validated against this version
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #setConvertedFromDataStandard(BigInteger)
	 * @see notification.NotificationPackage#getNotificationActionType_ConvertedFromDataStandard()
	 * @model dataType="notification.ConvertedFromDataStandardType"
	 *        extendedMetaData="kind='attribute' name='ConvertedFromDataStandard'"
	 * @generated
	 */
	BigInteger getConvertedFromDataStandard();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted From Data Standard</em>' attribute.
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 */
	void setConvertedFromDataStandard(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of this data standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see notification.NotificationPackage#getNotificationActionType_Version()
	 * @model default="500" unsettable="true" dataType="notification.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link notification.NotificationActionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link notification.NotificationActionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link notification.NotificationActionType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

} // NotificationActionType
