/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.SpringProject#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.spring.mm.SpringProject#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.SpringProject#getDbSource <em>Db Source</em>}</li>
 *   <li>{@link de.dc.spring.mm.SpringProject#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.dc.spring.mm.SpringProject#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getSpringProject()
 * @model
 * @generated
 */
public interface SpringProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see de.dc.spring.mm.MmPackage#getSpringProject_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.SpringProject#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.spring.mm.MmPackage#getSpringProject_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.SpringProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Db Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Source</em>' containment reference.
	 * @see #setDbSource(DBSource)
	 * @see de.dc.spring.mm.MmPackage#getSpringProject_DbSource()
	 * @model containment="true"
	 * @generated
	 */
	DBSource getDbSource();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.SpringProject#getDbSource <em>Db Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Source</em>' containment reference.
	 * @see #getDbSource()
	 * @generated
	 */
	void setDbSource(DBSource value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.mm.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see de.dc.spring.mm.MmPackage#getSpringProject_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.mm.RestController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see de.dc.spring.mm.MmPackage#getSpringProject_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestController> getControllers();

} // SpringProject
