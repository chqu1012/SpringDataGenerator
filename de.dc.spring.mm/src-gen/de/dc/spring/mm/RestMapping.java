/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.RestMapping#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestMapping#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestMapping#getUsedEntity <em>Used Entity</em>}</li>
 *   <li>{@link de.dc.spring.mm.RestMapping#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getRestMapping()
 * @model abstract="true"
 * @generated
 */
public interface RestMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.dc.spring.mm.MmPackage#getRestMapping_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestMapping#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.spring.mm.MmPackage#getRestMapping_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Used Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Entity</em>' reference.
	 * @see #setUsedEntity(Entity)
	 * @see de.dc.spring.mm.MmPackage#getRestMapping_UsedEntity()
	 * @model
	 * @generated
	 */
	Entity getUsedEntity();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestMapping#getUsedEntity <em>Used Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Entity</em>' reference.
	 * @see #getUsedEntity()
	 * @generated
	 */
	void setUsedEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see de.dc.spring.mm.MmPackage#getRestMapping_Body()
	 * @model unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.RestMapping#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // RestMapping
