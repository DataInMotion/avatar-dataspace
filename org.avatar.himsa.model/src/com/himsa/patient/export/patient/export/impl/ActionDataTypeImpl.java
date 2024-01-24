/*
 */
package com.himsa.patient.export.patient.export.impl;

import com.himsa.patient.export.patient.export.ActionDataType;
import com.himsa.patient.export.patient.export.ExportPackage;
import com.himsa.patient.export.patient.export.OperationTYPE;
import com.himsa.patient.export.patient.export.PubliclyFormattedData;
import com.himsa.patient.export.patient.export.TypeOfDataType;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getTypeOfData <em>Type Of Data</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getActionDate <em>Action Date</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getPublicData <em>Public Data</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getModuleId <em>Module Id</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDataTypeImpl extends MinimalEObjectImpl.Container implements ActionDataType {
	/**
	 * The default value of the '{@link #getTypeOfData() <em>Type Of Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfData()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfDataType TYPE_OF_DATA_EDEFAULT = TypeOfDataType.AUDIOGRAM;

	/**
	 * The cached value of the '{@link #getTypeOfData() <em>Type Of Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfData()
	 * @generated
	 * @ordered
	 */
	protected TypeOfDataType typeOfData = TYPE_OF_DATA_EDEFAULT;

	/**
	 * This is true if the Type Of Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeOfDataESet;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dataFormat = DATA_FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getActionDate() <em>Action Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionDate() <em>Action Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actionDate = ACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * This is true if the Last Modified Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifiedDateESet;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublicData() <em>Public Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicData()
	 * @generated
	 * @ordered
	 */
	protected PubliclyFormattedData publicData;

	/**
	 * This is true if the Public Data containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publicDataESet;

	/**
	 * The default value of the '{@link #getActionGroup() <em>Action Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTION_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionGroup() <em>Action Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGroup()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actionGroup = ACTION_GROUP_EDEFAULT;

	/**
	 * This is true if the Action Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionGroupESet;

	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final int DEVICE_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected int deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * This is true if the Device Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceTypeESet;

	/**
	 * The default value of the '{@link #getModuleId() <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleId() <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger moduleId = MODULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final OperationTYPE OPERATION_EDEFAULT = OperationTYPE.DELETED;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationTYPE operation = OPERATION_EDEFAULT;

	/**
	 * This is true if the Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExportPackage.Literals.ACTION_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfDataType getTypeOfData() {
		return typeOfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfData(TypeOfDataType newTypeOfData) {
		TypeOfDataType oldTypeOfData = typeOfData;
		typeOfData = newTypeOfData == null ? TYPE_OF_DATA_EDEFAULT : newTypeOfData;
		boolean oldTypeOfDataESet = typeOfDataESet;
		typeOfDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA, oldTypeOfData, typeOfData, !oldTypeOfDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTypeOfData() {
		TypeOfDataType oldTypeOfData = typeOfData;
		boolean oldTypeOfDataESet = typeOfDataESet;
		typeOfData = TYPE_OF_DATA_EDEFAULT;
		typeOfDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA, oldTypeOfData, TYPE_OF_DATA_EDEFAULT, oldTypeOfDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTypeOfData() {
		return typeOfDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormat(BigInteger newDataFormat) {
		BigInteger oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__DATA_FORMAT, oldDataFormat, dataFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getActionDate() {
		return actionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionDate(XMLGregorianCalendar newActionDate) {
		XMLGregorianCalendar oldActionDate = actionDate;
		actionDate = newActionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__ACTION_DATE, oldActionDate, actionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(XMLGregorianCalendar newLastModifiedDate) {
		XMLGregorianCalendar oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		boolean oldLastModifiedDateESet = lastModifiedDateESet;
		lastModifiedDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate, !oldLastModifiedDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLastModifiedDate() {
		XMLGregorianCalendar oldLastModifiedDate = lastModifiedDate;
		boolean oldLastModifiedDateESet = lastModifiedDateESet;
		lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;
		lastModifiedDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE, oldLastModifiedDate, LAST_MODIFIED_DATE_EDEFAULT, oldLastModifiedDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLastModifiedDate() {
		return lastModifiedDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubliclyFormattedData getPublicData() {
		return publicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicData(PubliclyFormattedData newPublicData, NotificationChain msgs) {
		PubliclyFormattedData oldPublicData = publicData;
		publicData = newPublicData;
		boolean oldPublicDataESet = publicDataESet;
		publicDataESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, oldPublicData, newPublicData, !oldPublicDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicData(PubliclyFormattedData newPublicData) {
		if (newPublicData != publicData) {
			NotificationChain msgs = null;
			if (publicData != null)
				msgs = ((InternalEObject)publicData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, null, msgs);
			if (newPublicData != null)
				msgs = ((InternalEObject)newPublicData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, null, msgs);
			msgs = basicSetPublicData(newPublicData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublicDataESet = publicDataESet;
			publicDataESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, newPublicData, newPublicData, !oldPublicDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPublicData(NotificationChain msgs) {
		PubliclyFormattedData oldPublicData = publicData;
		publicData = null;
		boolean oldPublicDataESet = publicDataESet;
		publicDataESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, oldPublicData, null, oldPublicDataESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPublicData() {
		if (publicData != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)publicData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, null, msgs);
			msgs = basicUnsetPublicData(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPublicDataESet = publicDataESet;
			publicDataESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA, null, null, oldPublicDataESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPublicData() {
		return publicDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getActionGroup() {
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionGroup(XMLGregorianCalendar newActionGroup) {
		XMLGregorianCalendar oldActionGroup = actionGroup;
		actionGroup = newActionGroup;
		boolean oldActionGroupESet = actionGroupESet;
		actionGroupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP, oldActionGroup, actionGroup, !oldActionGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActionGroup() {
		XMLGregorianCalendar oldActionGroup = actionGroup;
		boolean oldActionGroupESet = actionGroupESet;
		actionGroup = ACTION_GROUP_EDEFAULT;
		actionGroupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP, oldActionGroup, ACTION_GROUP_EDEFAULT, oldActionGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActionGroup() {
		return actionGroupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceType(int newDeviceType) {
		int oldDeviceType = deviceType;
		deviceType = newDeviceType;
		boolean oldDeviceTypeESet = deviceTypeESet;
		deviceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE, oldDeviceType, deviceType, !oldDeviceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceType() {
		int oldDeviceType = deviceType;
		boolean oldDeviceTypeESet = deviceTypeESet;
		deviceType = DEVICE_TYPE_EDEFAULT;
		deviceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE, oldDeviceType, DEVICE_TYPE_EDEFAULT, oldDeviceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceType() {
		return deviceTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getModuleId() {
		return moduleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleId(BigInteger newModuleId) {
		BigInteger oldModuleId = moduleId;
		moduleId = newModuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__MODULE_ID, oldModuleId, moduleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationTYPE getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(OperationTYPE newOperation) {
		OperationTYPE oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		boolean oldOperationESet = operationESet;
		operationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.ACTION_DATA_TYPE__OPERATION, oldOperation, operation, !oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOperation() {
		OperationTYPE oldOperation = operation;
		boolean oldOperationESet = operationESet;
		operation = OPERATION_EDEFAULT;
		operationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.ACTION_DATA_TYPE__OPERATION, oldOperation, OPERATION_EDEFAULT, oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOperation() {
		return operationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA:
				return basicUnsetPublicData(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA:
				return getTypeOfData();
			case ExportPackage.ACTION_DATA_TYPE__DATA_FORMAT:
				return getDataFormat();
			case ExportPackage.ACTION_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case ExportPackage.ACTION_DATA_TYPE__ACTION_DATE:
				return getActionDate();
			case ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ExportPackage.ACTION_DATA_TYPE__USER_ID:
				return getUserId();
			case ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA:
				return getPublicData();
			case ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP:
				return getActionGroup();
			case ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE:
				return getDeviceType();
			case ExportPackage.ACTION_DATA_TYPE__MODULE_ID:
				return getModuleId();
			case ExportPackage.ACTION_DATA_TYPE__OPERATION:
				return getOperation();
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
			case ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA:
				setTypeOfData((TypeOfDataType)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__DATA_FORMAT:
				setDataFormat((BigInteger)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__ACTION_DATE:
				setActionDate((XMLGregorianCalendar)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE:
				setLastModifiedDate((XMLGregorianCalendar)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__USER_ID:
				setUserId((String)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA:
				setPublicData((PubliclyFormattedData)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP:
				setActionGroup((XMLGregorianCalendar)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE:
				setDeviceType((Integer)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__MODULE_ID:
				setModuleId((BigInteger)newValue);
				return;
			case ExportPackage.ACTION_DATA_TYPE__OPERATION:
				setOperation((OperationTYPE)newValue);
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
			case ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA:
				unsetTypeOfData();
				return;
			case ExportPackage.ACTION_DATA_TYPE__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case ExportPackage.ACTION_DATA_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExportPackage.ACTION_DATA_TYPE__ACTION_DATE:
				setActionDate(ACTION_DATE_EDEFAULT);
				return;
			case ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE:
				unsetLastModifiedDate();
				return;
			case ExportPackage.ACTION_DATA_TYPE__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA:
				unsetPublicData();
				return;
			case ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP:
				unsetActionGroup();
				return;
			case ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE:
				unsetDeviceType();
				return;
			case ExportPackage.ACTION_DATA_TYPE__MODULE_ID:
				setModuleId(MODULE_ID_EDEFAULT);
				return;
			case ExportPackage.ACTION_DATA_TYPE__OPERATION:
				unsetOperation();
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
			case ExportPackage.ACTION_DATA_TYPE__TYPE_OF_DATA:
				return isSetTypeOfData();
			case ExportPackage.ACTION_DATA_TYPE__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case ExportPackage.ACTION_DATA_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExportPackage.ACTION_DATA_TYPE__ACTION_DATE:
				return ACTION_DATE_EDEFAULT == null ? actionDate != null : !ACTION_DATE_EDEFAULT.equals(actionDate);
			case ExportPackage.ACTION_DATA_TYPE__LAST_MODIFIED_DATE:
				return isSetLastModifiedDate();
			case ExportPackage.ACTION_DATA_TYPE__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ExportPackage.ACTION_DATA_TYPE__PUBLIC_DATA:
				return isSetPublicData();
			case ExportPackage.ACTION_DATA_TYPE__ACTION_GROUP:
				return isSetActionGroup();
			case ExportPackage.ACTION_DATA_TYPE__DEVICE_TYPE:
				return isSetDeviceType();
			case ExportPackage.ACTION_DATA_TYPE__MODULE_ID:
				return MODULE_ID_EDEFAULT == null ? moduleId != null : !MODULE_ID_EDEFAULT.equals(moduleId);
			case ExportPackage.ACTION_DATA_TYPE__OPERATION:
				return isSetOperation();
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
		result.append(" (typeOfData: ");
		if (typeOfDataESet) result.append(typeOfData); else result.append("<unset>");
		result.append(", dataFormat: ");
		result.append(dataFormat);
		result.append(", description: ");
		result.append(description);
		result.append(", actionDate: ");
		result.append(actionDate);
		result.append(", lastModifiedDate: ");
		if (lastModifiedDateESet) result.append(lastModifiedDate); else result.append("<unset>");
		result.append(", userId: ");
		result.append(userId);
		result.append(", actionGroup: ");
		if (actionGroupESet) result.append(actionGroup); else result.append("<unset>");
		result.append(", deviceType: ");
		if (deviceTypeESet) result.append(deviceType); else result.append("<unset>");
		result.append(", moduleId: ");
		result.append(moduleId);
		result.append(", operation: ");
		if (operationESet) result.append(operation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ActionDataTypeImpl
