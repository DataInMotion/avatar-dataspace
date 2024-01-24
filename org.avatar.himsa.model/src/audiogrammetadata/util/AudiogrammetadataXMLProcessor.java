/**
 */
package audiogrammetadata.util;

import audiogrammetadata.AudiogrammetadataPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AudiogrammetadataXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogrammetadataXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AudiogrammetadataPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AudiogrammetadataResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AudiogrammetadataResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AudiogrammetadataResourceFactoryImpl());
		}
		return registrations;
	}

} //AudiogrammetadataXMLProcessor
