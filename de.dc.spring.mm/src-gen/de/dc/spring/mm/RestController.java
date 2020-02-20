/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.RestController#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestController#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestController#getUsedEntities <em>Used Entities</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestController#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getRestController()
 * @model
 * @generated
 */
public interface RestController extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.spring.mm.MmPackage#getRestController_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.dc.spring.mm.MmPackage#getRestController_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestController#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Used Entities</b></em>' reference list.
	 * The list contents are of type {@link de.dc.spring.mm.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Entities</em>' reference list.
	 * @see de.dc.spring.mm.MmPackage#getRestController_UsedEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getUsedEntities();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.mm.RestMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see de.dc.spring.mm.MmPackage#getRestController_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestMapping> getMappings();

} // RestController
