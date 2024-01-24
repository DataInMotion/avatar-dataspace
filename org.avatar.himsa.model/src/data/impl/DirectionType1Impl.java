/*
 */
package data.impl;

import data.DataPackage;
import data.DirectionType1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.DirectionType1Impl#getAnnotationComment <em>Annotation Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectionType1Impl extends DirectionTypeImpl implements DirectionType1 {
	/**
	 * The default value of the '{@link #getAnnotationComment() <em>Annotation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationComment()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationComment() <em>Annotation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationComment()
	 * @generated
	 * @ordered
	 */
	protected String annotationComment = ANNOTATION_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectionType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DIRECTION_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnotationComment() {
		return annotationComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationComment(String newAnnotationComment) {
		String oldAnnotationComment = annotationComment;
		annotationComment = newAnnotationComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DIRECTION_TYPE1__ANNOTATION_COMMENT, oldAnnotationComment, annotationComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DIRECTION_TYPE1__ANNOTATION_COMMENT:
				return getAnnotationComment();
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
			case DataPackage.DIRECTION_TYPE1__ANNOTATION_COMMENT:
				setAnnotationComment((String)newValue);
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
			case DataPackage.DIRECTION_TYPE1__ANNOTATION_COMMENT:
				setAnnotationComment(ANNOTATION_COMMENT_EDEFAULT);
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
			case DataPackage.DIRECTION_TYPE1__ANNOTATION_COMMENT:
				return ANNOTATION_COMMENT_EDEFAULT == null ? annotationComment != null : !ANNOTATION_COMMENT_EDEFAULT.equals(annotationComment);
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
		result.append(" (annotationComment: ");
		result.append(annotationComment);
		result.append(')');
		return result.toString();
	}

} //DirectionType1Impl
