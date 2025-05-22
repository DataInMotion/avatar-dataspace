/*
 */
package org.avatar.ds.model.dataspace;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.avatar.ds.model.dataspace.DataspaceFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.avatar.ds.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = DataspacePackage.eNS_URI, genModel = "/model/dataspace.genmodel", genModelSourceLocations = {"model/dataspace.genmodel","org.avatar.dataspace.model/model/dataspace.genmodel"}, ecore="/model/dataspace.ecore", ecoreSourceLocations="/model/dataspace.ecore")
public interface DataspacePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataspace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://avatar.org/dataspace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataspace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataspacePackage eINSTANCE = org.avatar.ds.model.dataspace.impl.DataspacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.AssetImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Data Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DATA_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.DataAddressImpl <em>Data Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.DataAddressImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getDataAddress()
	 * @generated
	 */
	int DATA_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__BASE_URL = 2;

	/**
	 * The feature id for the '<em><b>Proxy Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__PROXY_PATH = 3;

	/**
	 * The number of structural features of the '<em>Data Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.PropertyMapImpl <em>Property Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.PropertyMapImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPropertyMap()
	 * @generated
	 */
	int PROPERTY_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.ContextImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VOCAB = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.AssetPolicyImpl <em>Asset Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.AssetPolicyImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getAssetPolicy()
	 * @generated
	 */
	int ASSET_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__POLICY = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__CREATED_AT = 4;

	/**
	 * The number of structural features of the '<em>Asset Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Asset Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.PolicyImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>Prohibition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PROHIBITION = 4;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__OBLIGATION = 5;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.PolicyContextImpl <em>Policy Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.PolicyContextImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPolicyContext()
	 * @generated
	 */
	int POLICY_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT__VOCAB = CONTEXT__VOCAB;

	/**
	 * The feature id for the '<em><b>Odrl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT__ODRL = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT__EDC = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Policy Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Policy Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getContractDefinition()
	 * @generated
	 */
	int CONTRACT_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Access Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ACCESS_POLICY_ID = 2;

	/**
	 * The feature id for the '<em><b>Contract Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__CONTRACT_POLICY_ID = 3;

	/**
	 * The feature id for the '<em><b>Assets Selector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ASSETS_SELECTOR = 4;

	/**
	 * The number of structural features of the '<em>Contract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl <em>Data Space Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl
	 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getDataSpaceResponse()
	 * @generated
	 */
	int DATA_SPACE_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__CREATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__MESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Data Space Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Space Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.avatar.ds.model.dataspace.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.Asset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.dataspace.Asset#getId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.Asset#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.Asset#getContext()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.Asset#getDataAddress <em>Data Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Address</em>'.
	 * @see org.avatar.ds.model.dataspace.Asset#getDataAddress()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_DataAddress();

	/**
	 * Returns the meta object for the map '{@link org.avatar.ds.model.dataspace.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.avatar.ds.model.dataspace.Asset#getProperties()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Properties();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.DataAddress <em>Data Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Address</em>'.
	 * @see org.avatar.ds.model.dataspace.DataAddress
	 * @generated
	 */
	EClass getDataAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataAddress#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.dataspace.DataAddress#getType()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.avatar.ds.model.dataspace.DataAddress#getName()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataAddress#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see org.avatar.ds.model.dataspace.DataAddress#getBaseUrl()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_BaseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataAddress#isProxyPath <em>Proxy Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Path</em>'.
	 * @see org.avatar.ds.model.dataspace.DataAddress#isProxyPath()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_ProxyPath();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Property Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getPropertyMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertyMap()
	 * @generated
	 */
	EAttribute getPropertyMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertyMap()
	 * @generated
	 */
	EAttribute getPropertyMap_Value();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.Context#getVocab <em>Vocab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vocab</em>'.
	 * @see org.avatar.ds.model.dataspace.Context#getVocab()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Vocab();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.AssetPolicy <em>Asset Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Policy</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy
	 * @generated
	 */
	EClass getAssetPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.AssetPolicy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy#getId()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EAttribute getAssetPolicy_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.AssetPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy#getType()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EAttribute getAssetPolicy_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.AssetPolicy#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy#getContext()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EReference getAssetPolicy_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.AssetPolicy#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy#getPolicy()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EReference getAssetPolicy_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.AssetPolicy#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.avatar.ds.model.dataspace.AssetPolicy#getCreatedAt()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EAttribute getAssetPolicy_CreatedAt();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.Policy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getId()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.Policy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getType()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.Policy#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getContext()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Context();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.dataspace.Policy#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permission</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getPermission()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Permission();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.dataspace.Policy#getProhibition <em>Prohibition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prohibition</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getProhibition()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Prohibition();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.dataspace.Policy#getObligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Obligation</em>'.
	 * @see org.avatar.ds.model.dataspace.Policy#getObligation()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Obligation();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.PolicyContext <em>Policy Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Context</em>'.
	 * @see org.avatar.ds.model.dataspace.PolicyContext
	 * @generated
	 */
	EClass getPolicyContext();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.PolicyContext#getOdrl <em>Odrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odrl</em>'.
	 * @see org.avatar.ds.model.dataspace.PolicyContext#getOdrl()
	 * @see #getPolicyContext()
	 * @generated
	 */
	EAttribute getPolicyContext_Odrl();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.PolicyContext#getEdc <em>Edc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edc</em>'.
	 * @see org.avatar.ds.model.dataspace.PolicyContext#getEdc()
	 * @see #getPolicyContext()
	 * @generated
	 */
	EAttribute getPolicyContext_Edc();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.ContractDefinition <em>Contract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Definition</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition
	 * @generated
	 */
	EClass getContractDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.ContractDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition#getId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.ContractDefinition#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition#getContext()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EReference getContractDefinition_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Policy Id</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition#getAccessPolicyId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_AccessPolicyId();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Policy Id</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition#getContractPolicyId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_ContractPolicyId();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.dataspace.ContractDefinition#getAssetsSelector <em>Assets Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Assets Selector</em>'.
	 * @see org.avatar.ds.model.dataspace.ContractDefinition#getAssetsSelector()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_AssetsSelector();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.dataspace.DataSpaceResponse <em>Data Space Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Space Response</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse
	 * @generated
	 */
	EClass getDataSpaceResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse#getId()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse#getType()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse#getContext()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EReference getDataSpaceResponse_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse#getCreatedAt()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.dataspace.DataSpaceResponse#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.avatar.ds.model.dataspace.DataSpaceResponse#getMessage()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_Message();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataspaceFactory getDataspaceFactory();

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
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.AssetImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CONTEXT = eINSTANCE.getAsset_Context();

		/**
		 * The meta object literal for the '<em><b>Data Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__DATA_ADDRESS = eINSTANCE.getAsset_DataAddress();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.DataAddressImpl <em>Data Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.DataAddressImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getDataAddress()
		 * @generated
		 */
		EClass DATA_ADDRESS = eINSTANCE.getDataAddress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__TYPE = eINSTANCE.getDataAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__NAME = eINSTANCE.getDataAddress_Name();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__BASE_URL = eINSTANCE.getDataAddress_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Proxy Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__PROXY_PATH = eINSTANCE.getDataAddress_ProxyPath();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.PropertyMapImpl <em>Property Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.PropertyMapImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPropertyMap()
		 * @generated
		 */
		EClass PROPERTY_MAP = eINSTANCE.getPropertyMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MAP__KEY = eINSTANCE.getPropertyMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MAP__VALUE = eINSTANCE.getPropertyMap_Value();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.ContextImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Vocab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__VOCAB = eINSTANCE.getContext_Vocab();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.AssetPolicyImpl <em>Asset Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.AssetPolicyImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getAssetPolicy()
		 * @generated
		 */
		EClass ASSET_POLICY = eINSTANCE.getAssetPolicy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_POLICY__ID = eINSTANCE.getAssetPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_POLICY__TYPE = eINSTANCE.getAssetPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_POLICY__CONTEXT = eINSTANCE.getAssetPolicy_Context();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_POLICY__POLICY = eINSTANCE.getAssetPolicy_Policy();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_POLICY__CREATED_AT = eINSTANCE.getAssetPolicy_CreatedAt();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.PolicyImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__ID = eINSTANCE.getPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__TYPE = eINSTANCE.getPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__CONTEXT = eINSTANCE.getPolicy_Context();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__PERMISSION = eINSTANCE.getPolicy_Permission();

		/**
		 * The meta object literal for the '<em><b>Prohibition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__PROHIBITION = eINSTANCE.getPolicy_Prohibition();

		/**
		 * The meta object literal for the '<em><b>Obligation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__OBLIGATION = eINSTANCE.getPolicy_Obligation();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.PolicyContextImpl <em>Policy Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.PolicyContextImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getPolicyContext()
		 * @generated
		 */
		EClass POLICY_CONTEXT = eINSTANCE.getPolicyContext();

		/**
		 * The meta object literal for the '<em><b>Odrl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_CONTEXT__ODRL = eINSTANCE.getPolicyContext_Odrl();

		/**
		 * The meta object literal for the '<em><b>Edc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_CONTEXT__EDC = eINSTANCE.getPolicyContext_Edc();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.ContractDefinitionImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getContractDefinition()
		 * @generated
		 */
		EClass CONTRACT_DEFINITION = eINSTANCE.getContractDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ID = eINSTANCE.getContractDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_DEFINITION__CONTEXT = eINSTANCE.getContractDefinition_Context();

		/**
		 * The meta object literal for the '<em><b>Access Policy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ACCESS_POLICY_ID = eINSTANCE.getContractDefinition_AccessPolicyId();

		/**
		 * The meta object literal for the '<em><b>Contract Policy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__CONTRACT_POLICY_ID = eINSTANCE.getContractDefinition_ContractPolicyId();

		/**
		 * The meta object literal for the '<em><b>Assets Selector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ASSETS_SELECTOR = eINSTANCE.getContractDefinition_AssetsSelector();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl <em>Data Space Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.dataspace.impl.DataSpaceResponseImpl
		 * @see org.avatar.ds.model.dataspace.impl.DataspacePackageImpl#getDataSpaceResponse()
		 * @generated
		 */
		EClass DATA_SPACE_RESPONSE = eINSTANCE.getDataSpaceResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__ID = eINSTANCE.getDataSpaceResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__TYPE = eINSTANCE.getDataSpaceResponse_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPACE_RESPONSE__CONTEXT = eINSTANCE.getDataSpaceResponse_Context();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__CREATED_AT = eINSTANCE.getDataSpaceResponse_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__MESSAGE = eINSTANCE.getDataSpaceResponse_Message();

	}

} //DataspacePackage
