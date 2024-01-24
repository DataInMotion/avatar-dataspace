/*
 */
package com.himsa.alert.dashboard.notification._500;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.himsa.alert.dashboard.notification._500._500Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = _500Package.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/notification.ecore", ecoreSourceLocations="/model/notification.ecore")
public interface _500Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_500";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/AlertDashboard/Notification/500";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_500";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_500Package eINSTANCE = com.himsa.alert.dashboard.notification._500.impl._500PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.alert.dashboard.notification._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.alert.dashboard.notification._500.impl.DocumentRootImpl
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Notification Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTIFICATION_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl <em>Notification Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getNotificationActionType()
	 * @generated
	 */
	int NOTIFICATION_ACTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Action GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__ACTION_GUID = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__URL = 3;

	/**
	 * The feature id for the '<em><b>Module ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__MODULE_ID = 4;

	/**
	 * The feature id for the '<em><b>Module Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__ICON_URL = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__GROUP = 7;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Notification Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Notification Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Action GUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getActionGUIDType()
	 * @generated
	 */
	int ACTION_GUID_TYPE = 2;

	/**
	 * The meta object id for the '<em>Category Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 3;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 4;

	/**
	 * The meta object id for the '<em>Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 5;

	/**
	 * The meta object id for the '<em>Group Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 6;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link com.himsa.alert.dashboard.notification._500.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.alert.dashboard.notification._500.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.alert.dashboard.notification._500.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.alert.dashboard.notification._500.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.alert.dashboard.notification._500.DocumentRoot#getNotificationAction <em>Notification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Action</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.DocumentRoot#getNotificationAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NotificationAction();

	/**
	 * Returns the meta object for class '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType <em>Notification Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Action Type</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType
	 * @generated
	 */
	EClass getNotificationActionType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getCategory()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_Category();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getDescription()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getActionGUID <em>Action GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action GUID</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getActionGUID()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_ActionGUID();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getUrl()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_Url();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getModuleID <em>Module ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module ID</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getModuleID()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_ModuleID();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getModuleParameter <em>Module Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Parameter</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getModuleParameter()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_ModuleParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getIconUrl()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getGroup()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_Group();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getConvertedFromDataStandard()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.alert.dashboard.notification._500.NotificationActionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.alert.dashboard.notification._500.NotificationActionType#getVersion()
	 * @see #getNotificationActionType()
	 * @generated
	 */
	EAttribute getNotificationActionType_Version();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Action GUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action GUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ActionGUID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}'"
	 * @generated
	 */
	EDataType getActionGUIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Category Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Category_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCategoryType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Converted From Data Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Converted From Data Standard Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ConvertedFromDataStandard_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='100'"
	 * @generated
	 */
	EDataType getConvertedFromDataStandardType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDescriptionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Group_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}'"
	 * @generated
	 */
	EDataType getGroupType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_500Factory get_500Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.himsa.alert.dashboard.notification._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.alert.dashboard.notification._500.impl.DocumentRootImpl
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Notification Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTIFICATION_ACTION = eINSTANCE.getDocumentRoot_NotificationAction();

		/**
		 * The meta object literal for the '{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl <em>Notification Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getNotificationActionType()
		 * @generated
		 */
		EClass NOTIFICATION_ACTION_TYPE = eINSTANCE.getNotificationActionType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__CATEGORY = eINSTANCE.getNotificationActionType_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__DESCRIPTION = eINSTANCE.getNotificationActionType_Description();

		/**
		 * The meta object literal for the '<em><b>Action GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__ACTION_GUID = eINSTANCE.getNotificationActionType_ActionGUID();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__URL = eINSTANCE.getNotificationActionType_Url();

		/**
		 * The meta object literal for the '<em><b>Module ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__MODULE_ID = eINSTANCE.getNotificationActionType_ModuleID();

		/**
		 * The meta object literal for the '<em><b>Module Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER = eINSTANCE.getNotificationActionType_ModuleParameter();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__ICON_URL = eINSTANCE.getNotificationActionType_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__GROUP = eINSTANCE.getNotificationActionType_Group();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getNotificationActionType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_ACTION_TYPE__VERSION = eINSTANCE.getNotificationActionType_Version();

		/**
		 * The meta object literal for the '<em>Action GUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getActionGUIDType()
		 * @generated
		 */
		EDataType ACTION_GUID_TYPE = eINSTANCE.getActionGUIDType();

		/**
		 * The meta object literal for the '<em>Category Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getCategoryType()
		 * @generated
		 */
		EDataType CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getDescriptionType()
		 * @generated
		 */
		EDataType DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em>Group Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getGroupType()
		 * @generated
		 */
		EDataType GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.alert.dashboard.notification._500.impl._500PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //_500Package
