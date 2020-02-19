/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.Entity#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link de.dc.spring.mm.Entity#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.Entity#isGenerateRepository <em>Generate Repository</em>}</li>
 *   <li>{@link de.dc.spring.mm.Entity#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Entity)
	 * @see de.dc.spring.mm.MmPackage#getEntity_SuperClass()
	 * @model
	 * @generated
	 */
	Entity getSuperClass();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Entity#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Entity value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.spring.mm.MmPackage#getEntity_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generate Repository</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Repository</em>' attribute.
	 * @see #setGenerateRepository(boolean)
	 * @see de.dc.spring.mm.MmPackage#getEntity_GenerateRepository()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateRepository();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.Entity#isGenerateRepository <em>Generate Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Repository</em>' attribute.
	 * @see #isGenerateRepository()
	 * @generated
	 */
	void setGenerateRepository(boolean value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.mm.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.dc.spring.mm.MmPackage#getEntity_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Entity
