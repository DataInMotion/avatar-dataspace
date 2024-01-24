/*
 */
package tinnitus.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinnitus.MeasurementEquipmentType;
import tinnitus.MinimumMaskingLevelType;
import tinnitus.ResidualInhibitionType;
import tinnitus.TinnitusLoudnessMatchType;
import tinnitus.TinnitusMeasurementDataType;
import tinnitus.TinnitusMeasurementNotesType;
import tinnitus.TinnitusPackage;
import tinnitus.TinnitusPitchMatchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getTinnitusMeasurementNotes <em>Tinnitus Measurement Notes</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getTinnitusMeasurementEquipment <em>Tinnitus Measurement Equipment</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getTinnitusPitchMatch <em>Tinnitus Pitch Match</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getTinnitusLoudnessMatch <em>Tinnitus Loudness Match</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getMinimumMaskingLevel <em>Minimum Masking Level</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getResidualInhibition <em>Residual Inhibition</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementDataTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TinnitusMeasurementDataTypeImpl extends MinimalEObjectImpl.Container implements TinnitusMeasurementDataType {
	/**
	 * The cached value of the '{@link #getTinnitusMeasurementNotes() <em>Tinnitus Measurement Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusMeasurementNotes()
	 * @generated
	 * @ordered
	 */
	protected TinnitusMeasurementNotesType tinnitusMeasurementNotes;

	/**
	 * The cached value of the '{@link #getTinnitusMeasurementEquipment() <em>Tinnitus Measurement Equipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusMeasurementEquipment()
	 * @generated
	 * @ordered
	 */
	protected MeasurementEquipmentType tinnitusMeasurementEquipment;

	/**
	 * The cached value of the '{@link #getTinnitusPitchMatch() <em>Tinnitus Pitch Match</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusPitchMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<TinnitusPitchMatchType> tinnitusPitchMatch;

	/**
	 * The cached value of the '{@link #getTinnitusLoudnessMatch() <em>Tinnitus Loudness Match</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusLoudnessMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<TinnitusLoudnessMatchType> tinnitusLoudnessMatch;

	/**
	 * The cached value of the '{@link #getMinimumMaskingLevel() <em>Minimum Masking Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<MinimumMaskingLevelType> minimumMaskingLevel;

	/**
	 * The cached value of the '{@link #getResidualInhibition() <em>Residual Inhibition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualInhibition()
	 * @generated
	 * @ordered
	 */
	protected EList<ResidualInhibitionType> residualInhibition;

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
	protected TinnitusMeasurementDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinnitusPackage.Literals.TINNITUS_MEASUREMENT_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusMeasurementNotesType getTinnitusMeasurementNotes() {
		return tinnitusMeasurementNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTinnitusMeasurementNotes(TinnitusMeasurementNotesType newTinnitusMeasurementNotes, NotificationChain msgs) {
		TinnitusMeasurementNotesType oldTinnitusMeasurementNotes = tinnitusMeasurementNotes;
		tinnitusMeasurementNotes = newTinnitusMeasurementNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES, oldTinnitusMeasurementNotes, newTinnitusMeasurementNotes);
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
	public void setTinnitusMeasurementNotes(TinnitusMeasurementNotesType newTinnitusMeasurementNotes) {
		if (newTinnitusMeasurementNotes != tinnitusMeasurementNotes) {
			NotificationChain msgs = null;
			if (tinnitusMeasurementNotes != null)
				msgs = ((InternalEObject)tinnitusMeasurementNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES, null, msgs);
			if (newTinnitusMeasurementNotes != null)
				msgs = ((InternalEObject)newTinnitusMeasurementNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES, null, msgs);
			msgs = basicSetTinnitusMeasurementNotes(newTinnitusMeasurementNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES, newTinnitusMeasurementNotes, newTinnitusMeasurementNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementEquipmentType getTinnitusMeasurementEquipment() {
		return tinnitusMeasurementEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTinnitusMeasurementEquipment(MeasurementEquipmentType newTinnitusMeasurementEquipment, NotificationChain msgs) {
		MeasurementEquipmentType oldTinnitusMeasurementEquipment = tinnitusMeasurementEquipment;
		tinnitusMeasurementEquipment = newTinnitusMeasurementEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT, oldTinnitusMeasurementEquipment, newTinnitusMeasurementEquipment);
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
	public void setTinnitusMeasurementEquipment(MeasurementEquipmentType newTinnitusMeasurementEquipment) {
		if (newTinnitusMeasurementEquipment != tinnitusMeasurementEquipment) {
			NotificationChain msgs = null;
			if (tinnitusMeasurementEquipment != null)
				msgs = ((InternalEObject)tinnitusMeasurementEquipment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT, null, msgs);
			if (newTinnitusMeasurementEquipment != null)
				msgs = ((InternalEObject)newTinnitusMeasurementEquipment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT, null, msgs);
			msgs = basicSetTinnitusMeasurementEquipment(newTinnitusMeasurementEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT, newTinnitusMeasurementEquipment, newTinnitusMeasurementEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TinnitusPitchMatchType> getTinnitusPitchMatch() {
		if (tinnitusPitchMatch == null) {
			tinnitusPitchMatch = new EObjectContainmentEList<TinnitusPitchMatchType>(TinnitusPitchMatchType.class, this, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH);
		}
		return tinnitusPitchMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TinnitusLoudnessMatchType> getTinnitusLoudnessMatch() {
		if (tinnitusLoudnessMatch == null) {
			tinnitusLoudnessMatch = new EObjectContainmentEList<TinnitusLoudnessMatchType>(TinnitusLoudnessMatchType.class, this, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH);
		}
		return tinnitusLoudnessMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MinimumMaskingLevelType> getMinimumMaskingLevel() {
		if (minimumMaskingLevel == null) {
			minimumMaskingLevel = new EObjectContainmentEList<MinimumMaskingLevelType>(MinimumMaskingLevelType.class, this, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL);
		}
		return minimumMaskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResidualInhibitionType> getResidualInhibition() {
		if (residualInhibition == null) {
			residualInhibition = new EObjectContainmentEList<ResidualInhibitionType>(ResidualInhibitionType.class, this, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION);
		}
		return residualInhibition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES:
				return basicSetTinnitusMeasurementNotes(null, msgs);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT:
				return basicSetTinnitusMeasurementEquipment(null, msgs);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH:
				return ((InternalEList<?>)getTinnitusPitchMatch()).basicRemove(otherEnd, msgs);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH:
				return ((InternalEList<?>)getTinnitusLoudnessMatch()).basicRemove(otherEnd, msgs);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL:
				return ((InternalEList<?>)getMinimumMaskingLevel()).basicRemove(otherEnd, msgs);
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION:
				return ((InternalEList<?>)getResidualInhibition()).basicRemove(otherEnd, msgs);
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES:
				return getTinnitusMeasurementNotes();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT:
				return getTinnitusMeasurementEquipment();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH:
				return getTinnitusPitchMatch();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH:
				return getTinnitusLoudnessMatch();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL:
				return getMinimumMaskingLevel();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION:
				return getResidualInhibition();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES:
				setTinnitusMeasurementNotes((TinnitusMeasurementNotesType)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT:
				setTinnitusMeasurementEquipment((MeasurementEquipmentType)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH:
				getTinnitusPitchMatch().clear();
				getTinnitusPitchMatch().addAll((Collection<? extends TinnitusPitchMatchType>)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH:
				getTinnitusLoudnessMatch().clear();
				getTinnitusLoudnessMatch().addAll((Collection<? extends TinnitusLoudnessMatchType>)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL:
				getMinimumMaskingLevel().clear();
				getMinimumMaskingLevel().addAll((Collection<? extends MinimumMaskingLevelType>)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION:
				getResidualInhibition().clear();
				getResidualInhibition().addAll((Collection<? extends ResidualInhibitionType>)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION:
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES:
				setTinnitusMeasurementNotes((TinnitusMeasurementNotesType)null);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT:
				setTinnitusMeasurementEquipment((MeasurementEquipmentType)null);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH:
				getTinnitusPitchMatch().clear();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH:
				getTinnitusLoudnessMatch().clear();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL:
				getMinimumMaskingLevel().clear();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION:
				getResidualInhibition().clear();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION:
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_NOTES:
				return tinnitusMeasurementNotes != null;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_MEASUREMENT_EQUIPMENT:
				return tinnitusMeasurementEquipment != null;
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_PITCH_MATCH:
				return tinnitusPitchMatch != null && !tinnitusPitchMatch.isEmpty();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__TINNITUS_LOUDNESS_MATCH:
				return tinnitusLoudnessMatch != null && !tinnitusLoudnessMatch.isEmpty();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__MINIMUM_MASKING_LEVEL:
				return minimumMaskingLevel != null && !minimumMaskingLevel.isEmpty();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__RESIDUAL_INHIBITION:
				return residualInhibition != null && !residualInhibition.isEmpty();
			case TinnitusPackage.TINNITUS_MEASUREMENT_DATA_TYPE__VERSION:
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
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TinnitusMeasurementDataTypeImpl
