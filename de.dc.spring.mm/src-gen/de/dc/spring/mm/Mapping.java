/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.Mapping#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.dc.spring.mm.Mapping#isIsList <em>Is List</em>}</li>
 *   <li>{@link de.dc.spring.mm.Mapping#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.spring.mm.MmPackage#getMapping_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Mapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see de.dc.spring.mm.MmPackage#getMapping_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Mapping#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Is List</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is List</em>' attribute.
	 * @see #setIsList(boolean)
	 * @see de.dc.spring.mm.MmPackage#getMapping_IsList()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIsList();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Mapping#isIsList <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is List</em>' attribute.
	 * @see #isIsList()
	 * @generated
	 */
	void setIsList(boolean value);

	/**
	 * Returns the value of the '<em><b>Mapping Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Type</em>' containment reference.
	 * @see #setMappingType(MappingType)
	 * @see de.dc.spring.mm.MmPackage#getMapping_MappingType()
	 * @model containment="true"
	 * @generated
	 */
	MappingType getMappingType();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Mapping#getMappingType <em>Mapping Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Type</em>' containment reference.
	 * @see #getMappingType()
	 * @generated
	 */
	void setMappingType(MappingType value);

} // Mapping
