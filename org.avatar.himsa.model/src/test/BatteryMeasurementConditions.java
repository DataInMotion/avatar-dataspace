/*
 */
package test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Measurement Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Battery Measurement Conditions.
 * 
 * ## TRHMeasCond ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.BatteryMeasurementConditions#getManufacturerCode <em>Manufacturer Code</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getDevTypeCode <em>Dev Type Code</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getSignalType <em>Signal Type</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getSignalOutput <em>Signal Output</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getSignalFrequency <em>Signal Frequency</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getBatteryVoltage <em>Battery Voltage</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getBatteryImpedance <em>Battery Impedance</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}</li>
 *   <li>{@link test.BatteryMeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getBatteryMeasurementConditions()
 * @model extendedMetaData="name='BatteryMeasurementConditions' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BatteryMeasurementConditions extends EObject {
	/**
	 * Returns the value of the '<em><b>Manufacturer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each HIMSA Member company which can create a module is assigned numerical code.  Manufacturer of the measuring equipment
	 * 
	 * ## TManufCode ## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Code</em>' attribute.
	 * @see #setManufacturerCode(BigInteger)
	 * @see test.TestPackage#getBatteryMeasurementConditions_ManufacturerCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ManufacturerCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getManufacturerCode();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getManufacturerCode <em>Manufacturer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Code</em>' attribute.
	 * @see #getManufacturerCode()
	 * @generated
	 */
	void setManufacturerCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dev Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device type code of the measuring equipment
	 * 
	 * ## devTypeCode ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dev Type Code</em>' attribute.
	 * @see #setDevTypeCode(BigInteger)
	 * @see test.TestPackage#getBatteryMeasurementConditions_DevTypeCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='DevTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDevTypeCode();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getDevTypeCode <em>Dev Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Type Code</em>' attribute.
	 * @see #getDevTypeCode()
	 * @generated
	 */
	void setDevTypeCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' attribute.
	 * The literals are from the enumeration {@link test.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal type used during the measurement.
	 * 
	 * ##TSignalType##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Type</em>' attribute.
	 * @see test.SignalType
	 * @see #isSetSignalType()
	 * @see #unsetSignalType()
	 * @see #setSignalType(SignalType)
	 * @see test.TestPackage#getBatteryMeasurementConditions_SignalType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignalType' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalType getSignalType();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getSignalType <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Type</em>' attribute.
	 * @see test.SignalType
	 * @see #isSetSignalType()
	 * @see #unsetSignalType()
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(SignalType value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getSignalType <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalType()
	 * @see #getSignalType()
	 * @see #setSignalType(SignalType)
	 * @generated
	 */
	void unsetSignalType();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getSignalType <em>Signal Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Type</em>' attribute is set.
	 * @see #unsetSignalType()
	 * @see #getSignalType()
	 * @see #setSignalType(SignalType)
	 * @generated
	 */
	boolean isSetSignalType();

	/**
	 * Returns the value of the '<em><b>Signal Output</b></em>' attribute.
	 * The literals are from the enumeration {@link test.SignalOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The channel/media used to present the signal/stimulus.
	 * 
	 * ##TSignalOutput##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Output</em>' attribute.
	 * @see test.SignalOutputType
	 * @see #isSetSignalOutput()
	 * @see #unsetSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @see test.TestPackage#getBatteryMeasurementConditions_SignalOutput()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignalOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SignalOutputType getSignalOutput();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getSignalOutput <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Output</em>' attribute.
	 * @see test.SignalOutputType
	 * @see #isSetSignalOutput()
	 * @see #unsetSignalOutput()
	 * @see #getSignalOutput()
	 * @generated
	 */
	void setSignalOutput(SignalOutputType value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getSignalOutput <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalOutput()
	 * @see #getSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @generated
	 */
	void unsetSignalOutput();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getSignalOutput <em>Signal Output</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Output</em>' attribute is set.
	 * @see #unsetSignalOutput()
	 * @see #getSignalOutput()
	 * @see #setSignalOutput(SignalOutputType)
	 * @generated
	 */
	boolean isSetSignalOutput();

	/**
	 * Returns the value of the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this field to state the signal level if target curve relates to a specific signal level.
	 * 
	 * ## SignalLevel ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Level</em>' attribute.
	 * @see #setSignalLevel(BigDecimal)
	 * @see test.TestPackage#getBatteryMeasurementConditions_SignalLevel()
	 * @model dataType="test.SignalLevelType" required="true"
	 *        extendedMetaData="kind='element' name='SignalLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSignalLevel();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getSignalLevel <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Level</em>' attribute.
	 * @see #getSignalLevel()
	 * @generated
	 */
	void setSignalLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Signal Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal Frequency
	 * 
	 * ## SignalFreq ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Frequency</em>' attribute.
	 * @see #setSignalFrequency(BigInteger)
	 * @see test.TestPackage#getBatteryMeasurementConditions_SignalFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SignalFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSignalFrequency();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getSignalFrequency <em>Signal Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Frequency</em>' attribute.
	 * @see #getSignalFrequency()
	 * @generated
	 */
	void setSignalFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Battery Type</b></em>' attribute.
	 * The literals are from the enumeration {@link test.BatteryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The battery type used.
	 * 
	 * ##TBattType##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Type</em>' attribute.
	 * @see test.BatteryType
	 * @see #isSetBatteryType()
	 * @see #unsetBatteryType()
	 * @see #setBatteryType(BatteryType)
	 * @see test.TestPackage#getBatteryMeasurementConditions_BatteryType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='BatteryType' namespace='##targetNamespace'"
	 * @generated
	 */
	BatteryType getBatteryType();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getBatteryType <em>Battery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Type</em>' attribute.
	 * @see test.BatteryType
	 * @see #isSetBatteryType()
	 * @see #unsetBatteryType()
	 * @see #getBatteryType()
	 * @generated
	 */
	void setBatteryType(BatteryType value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getBatteryType <em>Battery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBatteryType()
	 * @see #getBatteryType()
	 * @see #setBatteryType(BatteryType)
	 * @generated
	 */
	void unsetBatteryType();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getBatteryType <em>Battery Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Battery Type</em>' attribute is set.
	 * @see #unsetBatteryType()
	 * @see #getBatteryType()
	 * @see #setBatteryType(BatteryType)
	 * @generated
	 */
	boolean isSetBatteryType();

	/**
	 * Returns the value of the '<em><b>Battery Pill Type</b></em>' attribute.
	 * The literals are from the enumeration {@link test.BatteryPillType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of battery pill.
	 * 
	 * ##TBattPill##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Pill Type</em>' attribute.
	 * @see test.BatteryPillType
	 * @see #isSetBatteryPillType()
	 * @see #unsetBatteryPillType()
	 * @see #setBatteryPillType(BatteryPillType)
	 * @see test.TestPackage#getBatteryMeasurementConditions_BatteryPillType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='BatteryPillType' namespace='##targetNamespace'"
	 * @generated
	 */
	BatteryPillType getBatteryPillType();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Pill Type</em>' attribute.
	 * @see test.BatteryPillType
	 * @see #isSetBatteryPillType()
	 * @see #unsetBatteryPillType()
	 * @see #getBatteryPillType()
	 * @generated
	 */
	void setBatteryPillType(BatteryPillType value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBatteryPillType()
	 * @see #getBatteryPillType()
	 * @see #setBatteryPillType(BatteryPillType)
	 * @generated
	 */
	void unsetBatteryPillType();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getBatteryPillType <em>Battery Pill Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Battery Pill Type</em>' attribute is set.
	 * @see #unsetBatteryPillType()
	 * @see #getBatteryPillType()
	 * @see #setBatteryPillType(BatteryPillType)
	 * @generated
	 */
	boolean isSetBatteryPillType();

	/**
	 * Returns the value of the '<em><b>Battery Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voltage of the battery in milliVolts
	 * 
	 * ##TBattVoltage##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Voltage</em>' attribute.
	 * @see #setBatteryVoltage(BigDecimal)
	 * @see test.TestPackage#getBatteryMeasurementConditions_BatteryVoltage()
	 * @model dataType="test.BatteryVoltageType" required="true"
	 *        extendedMetaData="kind='element' name='BatteryVoltage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getBatteryVoltage();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getBatteryVoltage <em>Battery Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Voltage</em>' attribute.
	 * @see #getBatteryVoltage()
	 * @generated
	 */
	void setBatteryVoltage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Battery Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The impedance of the battery in milliOhms
	 * 
	 * ## TBattImp##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Impedance</em>' attribute.
	 * @see #setBatteryImpedance(BigDecimal)
	 * @see test.TestPackage#getBatteryMeasurementConditions_BatteryImpedance()
	 * @model dataType="test.BatteryImpedanceType" required="true"
	 *        extendedMetaData="kind='element' name='BatteryImpedance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getBatteryImpedance();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getBatteryImpedance <em>Battery Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Impedance</em>' attribute.
	 * @see #getBatteryImpedance()
	 * @generated
	 */
	void setBatteryImpedance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Use Real Ear Coupler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the measurement is done using a coupler instead of a Real Ear. This method can be valuable for example if the patient is a child. Use the value TRUE, if the measurement is done using Real Ear to Coupler Difference
	 * 
	 * ## UseRECoupler  ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Real Ear Coupler</em>' attribute.
	 * @see #isSetUseRealEarCoupler()
	 * @see #unsetUseRealEarCoupler()
	 * @see #setUseRealEarCoupler(boolean)
	 * @see test.TestPackage#getBatteryMeasurementConditions_UseRealEarCoupler()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UseRealEarCoupler' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseRealEarCoupler();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Real Ear Coupler</em>' attribute.
	 * @see #isSetUseRealEarCoupler()
	 * @see #unsetUseRealEarCoupler()
	 * @see #isUseRealEarCoupler()
	 * @generated
	 */
	void setUseRealEarCoupler(boolean value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseRealEarCoupler()
	 * @see #isUseRealEarCoupler()
	 * @see #setUseRealEarCoupler(boolean)
	 * @generated
	 */
	void unsetUseRealEarCoupler();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Real Ear Coupler</em>' attribute is set.
	 * @see #unsetUseRealEarCoupler()
	 * @see #isUseRealEarCoupler()
	 * @see #setUseRealEarCoupler(boolean)
	 * @generated
	 */
	boolean isSetUseRealEarCoupler();

	/**
	 * Returns the value of the '<em><b>Measurement Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link test.MeasurementMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measurement mode was used during the measurement.
	 * 
	 * ##TMeasMode##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Mode</em>' attribute.
	 * @see test.MeasurementMode
	 * @see #isSetMeasurementMode()
	 * @see #unsetMeasurementMode()
	 * @see #setMeasurementMode(MeasurementMode)
	 * @see test.TestPackage#getBatteryMeasurementConditions_MeasurementMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MeasurementMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementMode getMeasurementMode();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Mode</em>' attribute.
	 * @see test.MeasurementMode
	 * @see #isSetMeasurementMode()
	 * @see #unsetMeasurementMode()
	 * @see #getMeasurementMode()
	 * @generated
	 */
	void setMeasurementMode(MeasurementMode value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeasurementMode()
	 * @see #getMeasurementMode()
	 * @see #setMeasurementMode(MeasurementMode)
	 * @generated
	 */
	void unsetMeasurementMode();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getMeasurementMode <em>Measurement Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measurement Mode</em>' attribute is set.
	 * @see #unsetMeasurementMode()
	 * @see #getMeasurementMode()
	 * @see #setMeasurementMode(MeasurementMode)
	 * @generated
	 */
	boolean isSetMeasurementMode();

	/**
	 * Returns the value of the '<em><b>Measurement Identification</b></em>' attribute.
	 * The literals are from the enumeration {@link test.MeasurementIdentification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the measurement
	 * 
	 * ##TMeasurement##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Identification</em>' attribute.
	 * @see test.MeasurementIdentification
	 * @see #isSetMeasurementIdentification()
	 * @see #unsetMeasurementIdentification()
	 * @see #setMeasurementIdentification(MeasurementIdentification)
	 * @see test.TestPackage#getBatteryMeasurementConditions_MeasurementIdentification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MeasurementIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementIdentification getMeasurementIdentification();

	/**
	 * Sets the value of the '{@link test.BatteryMeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Identification</em>' attribute.
	 * @see test.MeasurementIdentification
	 * @see #isSetMeasurementIdentification()
	 * @see #unsetMeasurementIdentification()
	 * @see #getMeasurementIdentification()
	 * @generated
	 */
	void setMeasurementIdentification(MeasurementIdentification value);

	/**
	 * Unsets the value of the '{@link test.BatteryMeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeasurementIdentification()
	 * @see #getMeasurementIdentification()
	 * @see #setMeasurementIdentification(MeasurementIdentification)
	 * @generated
	 */
	void unsetMeasurementIdentification();

	/**
	 * Returns whether the value of the '{@link test.BatteryMeasurementConditions#getMeasurementIdentification <em>Measurement Identification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measurement Identification</em>' attribute is set.
	 * @see #unsetMeasurementIdentification()
	 * @see #getMeasurementIdentification()
	 * @see #setMeasurementIdentification(MeasurementIdentification)
	 * @generated
	 */
	boolean isSetMeasurementIdentification();

} // BatteryMeasurementConditions
