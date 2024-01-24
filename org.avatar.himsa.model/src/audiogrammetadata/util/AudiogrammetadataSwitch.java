/**
 */
package audiogrammetadata.util;

import audiogrammetadata.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage
 * @generated
 */
public class AudiogrammetadataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AudiogrammetadataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogrammetadataSwitch() {
		if (modelPackage == null) {
			modelPackage = AudiogrammetadataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AudiogrammetadataPackage.AMCLASS_TYPE: {
				AMCLASSType amclassType = (AMCLASSType)theEObject;
				T result = caseAMCLASSType(amclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.AMCLASS_TYPE1: {
				AMCLASSType1 amclassType1 = (AMCLASSType1)theEObject;
				T result = caseAMCLASSType1(amclassType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.AUDIOGRAM_CLASSIFICATIONS_TYPE: {
				AudiogramClassificationsType audiogramClassificationsType = (AudiogramClassificationsType)theEObject;
				T result = caseAudiogramClassificationsType(audiogramClassificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.CONFIGURATION_SEVERITY_CHOICE_TYPE: {
				ConfigurationSeverityChoiceType configurationSeverityChoiceType = (ConfigurationSeverityChoiceType)theEObject;
				T result = caseConfigurationSeverityChoiceType(configurationSeverityChoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE: {
				HIMSAAudiogramMetadataStandardType himsaAudiogramMetadataStandardType = (HIMSAAudiogramMetadataStandardType)theEObject;
				T result = caseHIMSAAudiogramMetadataStandardType(himsaAudiogramMetadataStandardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.NON_STANDARDIZED_TYPE: {
				NonStandardizedType nonStandardizedType = (NonStandardizedType)theEObject;
				T result = caseNonStandardizedType(nonStandardizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE: {
				PredictedAccuraciesType predictedAccuraciesType = (PredictedAccuraciesType)theEObject;
				T result = casePredictedAccuraciesType(predictedAccuraciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AudiogrammetadataPackage.QUALIND_TYPE: {
				QualindType qualindType = (QualindType)theEObject;
				T result = caseQualindType(qualindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMCLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMCLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMCLASSType(AMCLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMCLASS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMCLASS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMCLASSType1(AMCLASSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audiogram Classifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audiogram Classifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudiogramClassificationsType(AudiogramClassificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Severity Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Severity Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSeverityChoiceType(ConfigurationSeverityChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIMSA Audiogram Metadata Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIMSA Audiogram Metadata Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIMSAAudiogramMetadataStandardType(HIMSAAudiogramMetadataStandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Standardized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Standardized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonStandardizedType(NonStandardizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicted Accuracies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicted Accuracies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictedAccuraciesType(PredictedAccuraciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualindType(QualindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AudiogrammetadataSwitch
