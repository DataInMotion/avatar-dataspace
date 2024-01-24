/*
 */
package com.himsa.alert.dashboard.notification._500.impl;

import com.himsa.alert.dashboard.notification._500.NotificationActionType;
import com.himsa.alert.dashboard.notification._500._500Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getActionGUID <em>Action GUID</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getModuleID <em>Module ID</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getModuleParameter <em>Module Parameter</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.alert.dashboard.notification._500.impl.NotificationActionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationActionTypeImpl extends MinimalEObjectImpl.Container implements NotificationActionType {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionGUID() <em>Action GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionGUID() <em>Action GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGUID()
	 * @generated
	 * @ordered
	 */
	protected String actionGUID = ACTION_GUID_EDEFAULT;

	/**
	 * This is true if the Action GUID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionGUIDESet;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleID() <em>Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleID() <em>Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleID()
	 * @generated
	 * @ordered
	 */
	protected Integer moduleID = MODULE_ID_EDEFAULT;

	/**
	 * This is true if the Module ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moduleIDESet;

	/**
	 * The default value of the '{@link #getModuleParameter() <em>Module Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleParameter() <em>Module Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleParameter()
	 * @generated
	 * @ordered
	 */
	protected String moduleParameter = MODULE_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected String iconUrl = ICON_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * This is true if the Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupESet;

	/**
	 * The default value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONVERTED_FROM_DATA_STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected BigInteger convertedFromDataStandard = CONVERTED_FROM_DATA_STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("500");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.NOTIFICATION_ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionGUID() {
		return actionGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionGUID(String newActionGUID) {
		String oldActionGUID = actionGUID;
		actionGUID = newActionGUID;
		boolean oldActionGUIDESet = actionGUIDESet;
		actionGUIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID, oldActionGUID, actionGUID, !oldActionGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActionGUID() {
		String oldActionGUID = actionGUID;
		boolean oldActionGUIDESet = actionGUIDESet;
		actionGUID = ACTION_GUID_EDEFAULT;
		actionGUIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID, oldActionGUID, ACTION_GUID_EDEFAULT, oldActionGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActionGUID() {
		return actionGUIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getModuleID() {
		return moduleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleID(Integer newModuleID) {
		Integer oldModuleID = moduleID;
		moduleID = newModuleID;
		boolean oldModuleIDESet = moduleIDESet;
		moduleIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID, oldModuleID, moduleID, !oldModuleIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetModuleID() {
		Integer oldModuleID = moduleID;
		boolean oldModuleIDESet = moduleIDESet;
		moduleID = MODULE_ID_EDEFAULT;
		moduleIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID, oldModuleID, MODULE_ID_EDEFAULT, oldModuleIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetModuleID() {
		return moduleIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleParameter() {
		return moduleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleParameter(String newModuleParameter) {
		String oldModuleParameter = moduleParameter;
		moduleParameter = newModuleParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER, oldModuleParameter, moduleParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUrl(String newIconUrl) {
		String oldIconUrl = iconUrl;
		iconUrl = newIconUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__ICON_URL, oldIconUrl, iconUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		boolean oldGroupESet = groupESet;
		groupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__GROUP, oldGroup, group, !oldGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGroup() {
		String oldGroup = group;
		boolean oldGroupESet = groupESet;
		group = GROUP_EDEFAULT;
		groupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.NOTIFICATION_ACTION_TYPE__GROUP, oldGroup, GROUP_EDEFAULT, oldGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGroup() {
		return groupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getConvertedFromDataStandard() {
		return convertedFromDataStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertedFromDataStandard(BigInteger newConvertedFromDataStandard) {
		BigInteger oldConvertedFromDataStandard = convertedFromDataStandard;
		convertedFromDataStandard = newConvertedFromDataStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigInteger newVersion) {
		BigInteger oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.NOTIFICATION_ACTION_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		BigInteger oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.NOTIFICATION_ACTION_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.NOTIFICATION_ACTION_TYPE__CATEGORY:
				return getCategory();
			case _500Package.NOTIFICATION_ACTION_TYPE__DESCRIPTION:
				return getDescription();
			case _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID:
				return getActionGUID();
			case _500Package.NOTIFICATION_ACTION_TYPE__URL:
				return getUrl();
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID:
				return getModuleID();
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER:
				return getModuleParameter();
			case _500Package.NOTIFICATION_ACTION_TYPE__ICON_URL:
				return getIconUrl();
			case _500Package.NOTIFICATION_ACTION_TYPE__GROUP:
				return getGroup();
			case _500Package.NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case _500Package.NOTIFICATION_ACTION_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _500Package.NOTIFICATION_ACTION_TYPE__CATEGORY:
				setCategory((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID:
				setActionGUID((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__URL:
				setUrl((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID:
				setModuleID((Integer)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER:
				setModuleParameter((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__ICON_URL:
				setIconUrl((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__GROUP:
				setGroup((String)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__VERSION:
				setVersion((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _500Package.NOTIFICATION_ACTION_TYPE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID:
				unsetActionGUID();
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID:
				unsetModuleID();
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER:
				setModuleParameter(MODULE_PARAMETER_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__ICON_URL:
				setIconUrl(ICON_URL_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__GROUP:
				unsetGroup();
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case _500Package.NOTIFICATION_ACTION_TYPE__VERSION:
				unsetVersion();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _500Package.NOTIFICATION_ACTION_TYPE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case _500Package.NOTIFICATION_ACTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _500Package.NOTIFICATION_ACTION_TYPE__ACTION_GUID:
				return isSetActionGUID();
			case _500Package.NOTIFICATION_ACTION_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_ID:
				return isSetModuleID();
			case _500Package.NOTIFICATION_ACTION_TYPE__MODULE_PARAMETER:
				return MODULE_PARAMETER_EDEFAULT == null ? moduleParameter != null : !MODULE_PARAMETER_EDEFAULT.equals(moduleParameter);
			case _500Package.NOTIFICATION_ACTION_TYPE__ICON_URL:
				return ICON_URL_EDEFAULT == null ? iconUrl != null : !ICON_URL_EDEFAULT.equals(iconUrl);
			case _500Package.NOTIFICATION_ACTION_TYPE__GROUP:
				return isSetGroup();
			case _500Package.NOTIFICATION_ACTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case _500Package.NOTIFICATION_ACTION_TYPE__VERSION:
				return isSetVersion();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", description: ");
		result.append(description);
		result.append(", actionGUID: ");
		if (actionGUIDESet) result.append(actionGUID); else result.append("<unset>");
		result.append(", url: ");
		result.append(url);
		result.append(", moduleID: ");
		if (moduleIDESet) result.append(moduleID); else result.append("<unset>");
		result.append(", moduleParameter: ");
		result.append(moduleParameter);
		result.append(", iconUrl: ");
		result.append(iconUrl);
		result.append(", group: ");
		if (groupESet) result.append(group); else result.append("<unset>");
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NotificationActionTypeImpl
