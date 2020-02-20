/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.dc.spring.mm.MmFactory
 * @model kind="package"
 * @generated
 */
public interface MmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/spring";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmPackage eINSTANCE = de.dc.spring.mm.impl.MmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.SpringProjectImpl <em>Spring Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.SpringProjectImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getSpringProject()
	 * @generated
	 */
	int SPRING_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Db Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT__DB_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT__ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT__CONTROLLERS = 4;

	/**
	 * The number of structural features of the '<em>Spring Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Spring Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.RestControllerImpl <em>Rest Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.RestControllerImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getRestController()
	 * @generated
	 */
	int REST_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__PATH = 1;

	/**
	 * The feature id for the '<em><b>Used Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__USED_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER__MAPPINGS = 3;

	/**
	 * The number of structural features of the '<em>Rest Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rest Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.RestMappingImpl <em>Rest Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.RestMappingImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getRestMapping()
	 * @generated
	 */
	int REST_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING__PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING__USED_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING__BODY = 3;

	/**
	 * The number of structural features of the '<em>Rest Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rest Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.GetMappingImpl <em>Get Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.GetMappingImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getGetMapping()
	 * @generated
	 */
	int GET_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__PATH = REST_MAPPING__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__NAME = REST_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__USED_ENTITY = REST_MAPPING__USED_ENTITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING__BODY = REST_MAPPING__BODY;

	/**
	 * The number of structural features of the '<em>Get Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING_FEATURE_COUNT = REST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAPPING_OPERATION_COUNT = REST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.PostMappingImpl <em>Post Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.PostMappingImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getPostMapping()
	 * @generated
	 */
	int POST_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__PATH = REST_MAPPING__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__NAME = REST_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__USED_ENTITY = REST_MAPPING__USED_ENTITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__BODY = REST_MAPPING__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING__PARAMETERS = REST_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Post Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING_FEATURE_COUNT = REST_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Post Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_MAPPING_OPERATION_COUNT = REST_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.EntityImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Generate Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERATE_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = 3;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MAPPING = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.MappingImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Is List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__IS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPING_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.MappingTypeImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getMappingType()
	 * @generated
	 */
	int MAPPING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__CASCADE = 0;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__MAPPED_BY = 1;

	/**
	 * The number of structural features of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.OneToManyImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CASCADE = MAPPING_TYPE__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAPPED_BY = MAPPING_TYPE__MAPPED_BY;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_OPERATION_COUNT = MAPPING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.ManyToOneImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 9;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = MAPPING_TYPE__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__MAPPED_BY = MAPPING_TYPE__MAPPED_BY;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_OPERATION_COUNT = MAPPING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.ManyToManyImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 10;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CASCADE = MAPPING_TYPE__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAPPED_BY = MAPPING_TYPE__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__JOIN_TABLE_NAME = MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__JOIN_COLUMNS = MAPPING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inverse Join Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__INVERSE_JOIN_COLUMNS = MAPPING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = MAPPING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_OPERATION_COUNT = MAPPING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.OneToOneImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 11;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = MAPPING_TYPE__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPPED_BY = MAPPING_TYPE__MAPPED_BY;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_OPERATION_COUNT = MAPPING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.FieldImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 12;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATATYPE = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.impl.DBSourceImpl <em>DB Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.impl.DBSourceImpl
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getDBSource()
	 * @generated
	 */
	int DB_SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Enable Console</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__ENABLE_CONSOLE = 0;

	/**
	 * The feature id for the '<em><b>Web Allow Oothers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__WEB_ALLOW_OOTHERS = 1;

	/**
	 * The feature id for the '<em><b>Console Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__CONSOLE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__URL = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__USER = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Drive Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__DRIVE_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE__SERVER_PORT = 7;

	/**
	 * The number of structural features of the '<em>DB Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DB Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.mm.Cascade <em>Cascade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.mm.Cascade
	 * @see de.dc.spring.mm.impl.MmPackageImpl#getCascade()
	 * @generated
	 */
	int CASCADE = 14;

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.SpringProject <em>Spring Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Project</em>'.
	 * @see de.dc.spring.mm.SpringProject
	 * @generated
	 */
	EClass getSpringProject();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.SpringProject#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see de.dc.spring.mm.SpringProject#getBasePackage()
	 * @see #getSpringProject()
	 * @generated
	 */
	EAttribute getSpringProject_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.SpringProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.SpringProject#getName()
	 * @see #getSpringProject()
	 * @generated
	 */
	EAttribute getSpringProject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.spring.mm.SpringProject#getDbSource <em>Db Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Db Source</em>'.
	 * @see de.dc.spring.mm.SpringProject#getDbSource()
	 * @see #getSpringProject()
	 * @generated
	 */
	EReference getSpringProject_DbSource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.SpringProject#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see de.dc.spring.mm.SpringProject#getEntities()
	 * @see #getSpringProject()
	 * @generated
	 */
	EReference getSpringProject_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.SpringProject#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see de.dc.spring.mm.SpringProject#getControllers()
	 * @see #getSpringProject()
	 * @generated
	 */
	EReference getSpringProject_Controllers();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.RestController <em>Rest Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Controller</em>'.
	 * @see de.dc.spring.mm.RestController
	 * @generated
	 */
	EClass getRestController();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.RestController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.RestController#getName()
	 * @see #getRestController()
	 * @generated
	 */
	EAttribute getRestController_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.RestController#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.dc.spring.mm.RestController#getPath()
	 * @see #getRestController()
	 * @generated
	 */
	EAttribute getRestController_Path();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.spring.mm.RestController#getUsedEntities <em>Used Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Entities</em>'.
	 * @see de.dc.spring.mm.RestController#getUsedEntities()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_UsedEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.RestController#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see de.dc.spring.mm.RestController#getMappings()
	 * @see #getRestController()
	 * @generated
	 */
	EReference getRestController_Mappings();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.RestMapping <em>Rest Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Mapping</em>'.
	 * @see de.dc.spring.mm.RestMapping
	 * @generated
	 */
	EClass getRestMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.RestMapping#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.dc.spring.mm.RestMapping#getPath()
	 * @see #getRestMapping()
	 * @generated
	 */
	EAttribute getRestMapping_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.RestMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.RestMapping#getName()
	 * @see #getRestMapping()
	 * @generated
	 */
	EAttribute getRestMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link de.dc.spring.mm.RestMapping#getUsedEntity <em>Used Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Entity</em>'.
	 * @see de.dc.spring.mm.RestMapping#getUsedEntity()
	 * @see #getRestMapping()
	 * @generated
	 */
	EReference getRestMapping_UsedEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.RestMapping#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.dc.spring.mm.RestMapping#getBody()
	 * @see #getRestMapping()
	 * @generated
	 */
	EAttribute getRestMapping_Body();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.GetMapping <em>Get Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Mapping</em>'.
	 * @see de.dc.spring.mm.GetMapping
	 * @generated
	 */
	EClass getGetMapping();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.PostMapping <em>Post Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Mapping</em>'.
	 * @see de.dc.spring.mm.PostMapping
	 * @generated
	 */
	EClass getPostMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.PostMapping#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.dc.spring.mm.PostMapping#getParameters()
	 * @see #getPostMapping()
	 * @generated
	 */
	EReference getPostMapping_Parameters();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dc.spring.mm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link de.dc.spring.mm.Entity#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see de.dc.spring.mm.Entity#getSuperClass()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Entity#isGenerateRepository <em>Generate Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Repository</em>'.
	 * @see de.dc.spring.mm.Entity#isGenerateRepository()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_GenerateRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.dc.spring.mm.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.mm.Entity#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see de.dc.spring.mm.Entity#getMapping()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Mapping();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see de.dc.spring.mm.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link de.dc.spring.mm.Mapping#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see de.dc.spring.mm.Mapping#getEntity()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Entity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Mapping#isIsList <em>Is List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is List</em>'.
	 * @see de.dc.spring.mm.Mapping#isIsList()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_IsList();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.spring.mm.Mapping#getMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Type</em>'.
	 * @see de.dc.spring.mm.Mapping#getMappingType()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MappingType();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Type</em>'.
	 * @see de.dc.spring.mm.MappingType
	 * @generated
	 */
	EClass getMappingType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.MappingType#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see de.dc.spring.mm.MappingType#getCascade()
	 * @see #getMappingType()
	 * @generated
	 */
	EAttribute getMappingType_Cascade();

	/**
	 * Returns the meta object for the reference '{@link de.dc.spring.mm.MappingType#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped By</em>'.
	 * @see de.dc.spring.mm.MappingType#getMappedBy()
	 * @see #getMappingType()
	 * @generated
	 */
	EReference getMappingType_MappedBy();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see de.dc.spring.mm.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see de.dc.spring.mm.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see de.dc.spring.mm.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.ManyToMany#getJoinTableName <em>Join Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Table Name</em>'.
	 * @see de.dc.spring.mm.ManyToMany#getJoinTableName()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_JoinTableName();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.ManyToMany#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Columns</em>'.
	 * @see de.dc.spring.mm.ManyToMany#getJoinColumns()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_JoinColumns();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.ManyToMany#getInverseJoinColumns <em>Inverse Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Join Columns</em>'.
	 * @see de.dc.spring.mm.ManyToMany#getInverseJoinColumns()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_InverseJoinColumns();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see de.dc.spring.mm.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see de.dc.spring.mm.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Field#isIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Id</em>'.
	 * @see de.dc.spring.mm.Field#isIsId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsId();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.spring.mm.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.Field#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.dc.spring.mm.Field#getDatatype()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Datatype();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.mm.DBSource <em>DB Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Source</em>'.
	 * @see de.dc.spring.mm.DBSource
	 * @generated
	 */
	EClass getDBSource();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#isEnableConsole <em>Enable Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Console</em>'.
	 * @see de.dc.spring.mm.DBSource#isEnableConsole()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_EnableConsole();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#isWebAllowOothers <em>Web Allow Oothers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Allow Oothers</em>'.
	 * @see de.dc.spring.mm.DBSource#isWebAllowOothers()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_WebAllowOothers();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getConsolePath <em>Console Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Console Path</em>'.
	 * @see de.dc.spring.mm.DBSource#getConsolePath()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_ConsolePath();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.dc.spring.mm.DBSource#getUrl()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see de.dc.spring.mm.DBSource#getUser()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_User();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see de.dc.spring.mm.DBSource#getPassword()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_Password();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getDriveClassName <em>Drive Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drive Class Name</em>'.
	 * @see de.dc.spring.mm.DBSource#getDriveClassName()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_DriveClassName();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.mm.DBSource#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see de.dc.spring.mm.DBSource#getServerPort()
	 * @see #getDBSource()
	 * @generated
	 */
	EAttribute getDBSource_ServerPort();

	/**
	 * Returns the meta object for enum '{@link de.dc.spring.mm.Cascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cascade</em>'.
	 * @see de.dc.spring.mm.Cascade
	 * @generated
	 */
	EEnum getCascade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmFactory getMmFactory();

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
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.SpringProjectImpl <em>Spring Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.SpringProjectImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getSpringProject()
		 * @generated
		 */
		EClass SPRING_PROJECT = eINSTANCE.getSpringProject();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_PROJECT__BASE_PACKAGE = eINSTANCE.getSpringProject_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_PROJECT__NAME = eINSTANCE.getSpringProject_Name();

		/**
		 * The meta object literal for the '<em><b>Db Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_PROJECT__DB_SOURCE = eINSTANCE.getSpringProject_DbSource();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_PROJECT__ENTITIES = eINSTANCE.getSpringProject_Entities();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_PROJECT__CONTROLLERS = eINSTANCE.getSpringProject_Controllers();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.RestControllerImpl <em>Rest Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.RestControllerImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getRestController()
		 * @generated
		 */
		EClass REST_CONTROLLER = eINSTANCE.getRestController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_CONTROLLER__NAME = eINSTANCE.getRestController_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_CONTROLLER__PATH = eINSTANCE.getRestController_Path();

		/**
		 * The meta object literal for the '<em><b>Used Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__USED_ENTITIES = eINSTANCE.getRestController_UsedEntities();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONTROLLER__MAPPINGS = eINSTANCE.getRestController_Mappings();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.RestMappingImpl <em>Rest Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.RestMappingImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getRestMapping()
		 * @generated
		 */
		EClass REST_MAPPING = eINSTANCE.getRestMapping();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_MAPPING__PATH = eINSTANCE.getRestMapping_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_MAPPING__NAME = eINSTANCE.getRestMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Used Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_MAPPING__USED_ENTITY = eINSTANCE.getRestMapping_UsedEntity();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_MAPPING__BODY = eINSTANCE.getRestMapping_Body();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.GetMappingImpl <em>Get Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.GetMappingImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getGetMapping()
		 * @generated
		 */
		EClass GET_MAPPING = eINSTANCE.getGetMapping();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.PostMappingImpl <em>Post Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.PostMappingImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getPostMapping()
		 * @generated
		 */
		EClass POST_MAPPING = eINSTANCE.getPostMapping();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_MAPPING__PARAMETERS = eINSTANCE.getPostMapping_Parameters();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.EntityImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_CLASS = eINSTANCE.getEntity_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Generate Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__GENERATE_REPOSITORY = eINSTANCE.getEntity_GenerateRepository();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__MAPPING = eINSTANCE.getEntity_Mapping();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.MappingImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ENTITY = eINSTANCE.getMapping_Entity();

		/**
		 * The meta object literal for the '<em><b>Is List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__IS_LIST = eINSTANCE.getMapping_IsList();

		/**
		 * The meta object literal for the '<em><b>Mapping Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPING_TYPE = eINSTANCE.getMapping_MappingType();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.MappingTypeImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getMappingType()
		 * @generated
		 */
		EClass MAPPING_TYPE = eINSTANCE.getMappingType();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_TYPE__CASCADE = eINSTANCE.getMappingType_Cascade();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TYPE__MAPPED_BY = eINSTANCE.getMappingType_MappedBy();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.OneToManyImpl <em>One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.OneToManyImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getOneToMany()
		 * @generated
		 */
		EClass ONE_TO_MANY = eINSTANCE.getOneToMany();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.ManyToOneImpl <em>Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.ManyToOneImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getManyToOne()
		 * @generated
		 */
		EClass MANY_TO_ONE = eINSTANCE.getManyToOne();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.ManyToManyImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getManyToMany()
		 * @generated
		 */
		EClass MANY_TO_MANY = eINSTANCE.getManyToMany();

		/**
		 * The meta object literal for the '<em><b>Join Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__JOIN_TABLE_NAME = eINSTANCE.getManyToMany_JoinTableName();

		/**
		 * The meta object literal for the '<em><b>Join Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__JOIN_COLUMNS = eINSTANCE.getManyToMany_JoinColumns();

		/**
		 * The meta object literal for the '<em><b>Inverse Join Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__INVERSE_JOIN_COLUMNS = eINSTANCE.getManyToMany_InverseJoinColumns();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.OneToOneImpl <em>One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.OneToOneImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getOneToOne()
		 * @generated
		 */
		EClass ONE_TO_ONE = eINSTANCE.getOneToOne();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.FieldImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_ID = eINSTANCE.getField_IsId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DATATYPE = eINSTANCE.getField_Datatype();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.impl.DBSourceImpl <em>DB Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.impl.DBSourceImpl
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getDBSource()
		 * @generated
		 */
		EClass DB_SOURCE = eINSTANCE.getDBSource();

		/**
		 * The meta object literal for the '<em><b>Enable Console</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__ENABLE_CONSOLE = eINSTANCE.getDBSource_EnableConsole();

		/**
		 * The meta object literal for the '<em><b>Web Allow Oothers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__WEB_ALLOW_OOTHERS = eINSTANCE.getDBSource_WebAllowOothers();

		/**
		 * The meta object literal for the '<em><b>Console Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__CONSOLE_PATH = eINSTANCE.getDBSource_ConsolePath();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__URL = eINSTANCE.getDBSource_Url();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__USER = eINSTANCE.getDBSource_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__PASSWORD = eINSTANCE.getDBSource_Password();

		/**
		 * The meta object literal for the '<em><b>Drive Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__DRIVE_CLASS_NAME = eINSTANCE.getDBSource_DriveClassName();

		/**
		 * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SOURCE__SERVER_PORT = eINSTANCE.getDBSource_ServerPort();

		/**
		 * The meta object literal for the '{@link de.dc.spring.mm.Cascade <em>Cascade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.mm.Cascade
		 * @see de.dc.spring.mm.impl.MmPackageImpl#getCascade()
		 * @generated
		 */
		EEnum CASCADE = eINSTANCE.getCascade();

	}

} //MmPackage
