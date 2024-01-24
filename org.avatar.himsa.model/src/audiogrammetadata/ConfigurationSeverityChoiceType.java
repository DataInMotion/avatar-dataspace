/*
 */
package audiogrammetadata;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Severity Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}</li>
 *   <li>{@link audiogrammetadata.ConfigurationSeverityChoiceType#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType()
 * @model extendedMetaData="name='ConfigurationSeverityChoice_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConfigurationSeverityChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Normal Hearing</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If to be stored this value is set to True as a fixed choice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Hearing</em>' attribute.
	 * @see #isSetNormalHearing()
	 * @see #unsetNormalHearing()
	 * @see #setNormalHearing(boolean)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_NormalHearing()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='NormalHearing' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNormalHearing();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Hearing</em>' attribute.
	 * @see #isSetNormalHearing()
	 * @see #unsetNormalHearing()
	 * @see #isNormalHearing()
	 * @generated
	 */
	void setNormalHearing(boolean value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalHearing()
	 * @see #isNormalHearing()
	 * @see #setNormalHearing(boolean)
	 * @generated
	 */
	void unsetNormalHearing();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Hearing</em>' attribute is set.
	 * @see #unsetNormalHearing()
	 * @see #isNormalHearing()
	 * @see #setNormalHearing(boolean)
	 * @generated
	 */
	boolean isSetNormalHearing();

	/**
	 * Returns the value of the '<em><b>Flat Hearing Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.FlatHearingLossType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.FlatHearingLossType
	 * @see #isSetFlatHearingLoss()
	 * @see #unsetFlatHearingLoss()
	 * @see #setFlatHearingLoss(FlatHearingLossType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_FlatHearingLoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FlatHearingLoss' namespace='##targetNamespace'"
	 * @generated
	 */
	FlatHearingLossType getFlatHearingLoss();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flat Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.FlatHearingLossType
	 * @see #isSetFlatHearingLoss()
	 * @see #unsetFlatHearingLoss()
	 * @see #getFlatHearingLoss()
	 * @generated
	 */
	void setFlatHearingLoss(FlatHearingLossType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlatHearingLoss()
	 * @see #getFlatHearingLoss()
	 * @see #setFlatHearingLoss(FlatHearingLossType)
	 * @generated
	 */
	void unsetFlatHearingLoss();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flat Hearing Loss</em>' attribute is set.
	 * @see #unsetFlatHearingLoss()
	 * @see #getFlatHearingLoss()
	 * @see #setFlatHearingLoss(FlatHearingLossType)
	 * @generated
	 */
	boolean isSetFlatHearingLoss();

	/**
	 * Returns the value of the '<em><b>Sloping Hearing Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.SlopingHearingLossType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sloping Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @see #isSetSlopingHearingLoss()
	 * @see #unsetSlopingHearingLoss()
	 * @see #setSlopingHearingLoss(SlopingHearingLossType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_SlopingHearingLoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SlopingHearingLoss' namespace='##targetNamespace'"
	 * @generated
	 */
	SlopingHearingLossType getSlopingHearingLoss();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sloping Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @see #isSetSlopingHearingLoss()
	 * @see #unsetSlopingHearingLoss()
	 * @see #getSlopingHearingLoss()
	 * @generated
	 */
	void setSlopingHearingLoss(SlopingHearingLossType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlopingHearingLoss()
	 * @see #getSlopingHearingLoss()
	 * @see #setSlopingHearingLoss(SlopingHearingLossType)
	 * @generated
	 */
	void unsetSlopingHearingLoss();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sloping Hearing Loss</em>' attribute is set.
	 * @see #unsetSlopingHearingLoss()
	 * @see #getSlopingHearingLoss()
	 * @see #setSlopingHearingLoss(SlopingHearingLossType)
	 * @generated
	 */
	boolean isSetSlopingHearingLoss();

	/**
	 * Returns the value of the '<em><b>Rising Hearing Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.RisingHearingLossType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rising Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.RisingHearingLossType
	 * @see #isSetRisingHearingLoss()
	 * @see #unsetRisingHearingLoss()
	 * @see #setRisingHearingLoss(RisingHearingLossType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_RisingHearingLoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RisingHearingLoss' namespace='##targetNamespace'"
	 * @generated
	 */
	RisingHearingLossType getRisingHearingLoss();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rising Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.RisingHearingLossType
	 * @see #isSetRisingHearingLoss()
	 * @see #unsetRisingHearingLoss()
	 * @see #getRisingHearingLoss()
	 * @generated
	 */
	void setRisingHearingLoss(RisingHearingLossType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRisingHearingLoss()
	 * @see #getRisingHearingLoss()
	 * @see #setRisingHearingLoss(RisingHearingLossType)
	 * @generated
	 */
	void unsetRisingHearingLoss();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rising Hearing Loss</em>' attribute is set.
	 * @see #unsetRisingHearingLoss()
	 * @see #getRisingHearingLoss()
	 * @see #setRisingHearingLoss(RisingHearingLossType)
	 * @generated
	 */
	boolean isSetRisingHearingLoss();

	/**
	 * Returns the value of the '<em><b>Trough Shaped Hearing Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.TroughShapedHearingLossType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trough Shaped Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @see #isSetTroughShapedHearingLoss()
	 * @see #unsetTroughShapedHearingLoss()
	 * @see #setTroughShapedHearingLoss(TroughShapedHearingLossType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_TroughShapedHearingLoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TroughShapedHearingLoss' namespace='##targetNamespace'"
	 * @generated
	 */
	TroughShapedHearingLossType getTroughShapedHearingLoss();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trough Shaped Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @see #isSetTroughShapedHearingLoss()
	 * @see #unsetTroughShapedHearingLoss()
	 * @see #getTroughShapedHearingLoss()
	 * @generated
	 */
	void setTroughShapedHearingLoss(TroughShapedHearingLossType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTroughShapedHearingLoss()
	 * @see #getTroughShapedHearingLoss()
	 * @see #setTroughShapedHearingLoss(TroughShapedHearingLossType)
	 * @generated
	 */
	void unsetTroughShapedHearingLoss();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trough Shaped Hearing Loss</em>' attribute is set.
	 * @see #unsetTroughShapedHearingLoss()
	 * @see #getTroughShapedHearingLoss()
	 * @see #setTroughShapedHearingLoss(TroughShapedHearingLossType)
	 * @generated
	 */
	boolean isSetTroughShapedHearingLoss();

	/**
	 * Returns the value of the '<em><b>Peaked Hearing Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.PeakedHearingLossType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peaked Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @see #isSetPeakedHearingLoss()
	 * @see #unsetPeakedHearingLoss()
	 * @see #setPeakedHearingLoss(PeakedHearingLossType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_PeakedHearingLoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PeakedHearingLoss' namespace='##targetNamespace'"
	 * @generated
	 */
	PeakedHearingLossType getPeakedHearingLoss();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peaked Hearing Loss</em>' attribute.
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @see #isSetPeakedHearingLoss()
	 * @see #unsetPeakedHearingLoss()
	 * @see #getPeakedHearingLoss()
	 * @generated
	 */
	void setPeakedHearingLoss(PeakedHearingLossType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeakedHearingLoss()
	 * @see #getPeakedHearingLoss()
	 * @see #setPeakedHearingLoss(PeakedHearingLossType)
	 * @generated
	 */
	void unsetPeakedHearingLoss();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Peaked Hearing Loss</em>' attribute is set.
	 * @see #unsetPeakedHearingLoss()
	 * @see #getPeakedHearingLoss()
	 * @see #setPeakedHearingLoss(PeakedHearingLossType)
	 * @generated
	 */
	boolean isSetPeakedHearingLoss();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * The literals are from the enumeration {@link audiogrammetadata.OtherType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see audiogrammetadata.OtherType
	 * @see #isSetOther()
	 * @see #unsetOther()
	 * @see #setOther(OtherType)
	 * @see audiogrammetadata.AudiogrammetadataPackage#getConfigurationSeverityChoiceType_Other()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Other' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherType getOther();

	/**
	 * Sets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see audiogrammetadata.OtherType
	 * @see #isSetOther()
	 * @see #unsetOther()
	 * @see #getOther()
	 * @generated
	 */
	void setOther(OtherType value);

	/**
	 * Unsets the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOther()
	 * @see #getOther()
	 * @see #setOther(OtherType)
	 * @generated
	 */
	void unsetOther();

	/**
	 * Returns whether the value of the '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getOther <em>Other</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Other</em>' attribute is set.
	 * @see #unsetOther()
	 * @see #getOther()
	 * @see #setOther(OtherType)
	 * @generated
	 */
	boolean isSetOther();

} // ConfigurationSeverityChoiceType
