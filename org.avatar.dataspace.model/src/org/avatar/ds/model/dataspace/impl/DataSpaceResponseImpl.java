/*
 */
package org.avatar.ds.model.dataspace.impl;

import org.avatar.ds.model.dataspace.Context;
import org.avatar.ds.model.dataspace.DataSpaceResponse;
import org.avatar.ds.model.dataspace.DataspacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Space Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl#getInvalidValue <em>Invalid Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSpaceResponseImpl extends MinimalEObjectImpl.Container implements DataSpaceResponse {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected String responseType = RESPONSE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATED_AT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected long createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidValue() <em>Invalid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INVALID_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidValue() <em>Invalid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected String invalidValue = INVALID_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpaceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataspacePackage.Literals.DATA_SPACE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT, oldContext, newContext);
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
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(String newResponseType) {
		String oldResponseType = responseType;
		responseType = newResponseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__RESPONSE_TYPE, oldResponseType, responseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(long newCreatedAt) {
		long oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvalidValue() {
		return invalidValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidValue(String newInvalidValue) {
		String oldInvalidValue = invalidValue;
		invalidValue = newInvalidValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.DATA_SPACE_RESPONSE__INVALID_VALUE, oldInvalidValue, invalidValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT:
				return basicSetContext(null, msgs);
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
			case DataspacePackage.DATA_SPACE_RESPONSE__ID:
				return getId();
			case DataspacePackage.DATA_SPACE_RESPONSE__TYPE:
				return getType();
			case DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT:
				return getContext();
			case DataspacePackage.DATA_SPACE_RESPONSE__RESPONSE_TYPE:
				return getResponseType();
			case DataspacePackage.DATA_SPACE_RESPONSE__CREATED_AT:
				return getCreatedAt();
			case DataspacePackage.DATA_SPACE_RESPONSE__MESSAGE:
				return getMessage();
			case DataspacePackage.DATA_SPACE_RESPONSE__PATH:
				return getPath();
			case DataspacePackage.DATA_SPACE_RESPONSE__INVALID_VALUE:
				return getInvalidValue();
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
			case DataspacePackage.DATA_SPACE_RESPONSE__ID:
				setId((String)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__TYPE:
				setType((String)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT:
				setContext((Context)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__RESPONSE_TYPE:
				setResponseType((String)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__CREATED_AT:
				setCreatedAt((Long)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__MESSAGE:
				setMessage((String)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__PATH:
				setPath((String)newValue);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__INVALID_VALUE:
				setInvalidValue((String)newValue);
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
			case DataspacePackage.DATA_SPACE_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT:
				setContext((Context)null);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__RESPONSE_TYPE:
				setResponseType(RESPONSE_TYPE_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DataspacePackage.DATA_SPACE_RESPONSE__INVALID_VALUE:
				setInvalidValue(INVALID_VALUE_EDEFAULT);
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
			case DataspacePackage.DATA_SPACE_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DataspacePackage.DATA_SPACE_RESPONSE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DataspacePackage.DATA_SPACE_RESPONSE__CONTEXT:
				return context != null;
			case DataspacePackage.DATA_SPACE_RESPONSE__RESPONSE_TYPE:
				return RESPONSE_TYPE_EDEFAULT == null ? responseType != null : !RESPONSE_TYPE_EDEFAULT.equals(responseType);
			case DataspacePackage.DATA_SPACE_RESPONSE__CREATED_AT:
				return createdAt != CREATED_AT_EDEFAULT;
			case DataspacePackage.DATA_SPACE_RESPONSE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case DataspacePackage.DATA_SPACE_RESPONSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DataspacePackage.DATA_SPACE_RESPONSE__INVALID_VALUE:
				return INVALID_VALUE_EDEFAULT == null ? invalidValue != null : !INVALID_VALUE_EDEFAULT.equals(invalidValue);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", responseType: ");
		result.append(responseType);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", message: ");
		result.append(message);
		result.append(", path: ");
		result.append(path);
		result.append(", invalidValue: ");
		result.append(invalidValue);
		result.append(')');
		return result.toString();
	}

} //DataSpaceResponseImpl
