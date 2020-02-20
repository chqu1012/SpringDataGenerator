/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.MappingType#getCascade <em>Cascade</em>}</li>
 *   <li>{@link de.dc.spring.mm.MappingType#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getMappingType()
 * @model abstract="true"
 * @generated
 */
public interface MappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * The default value is <code>"ALL"</code>.
	 * The literals are from the enumeration {@link de.dc.spring.mm.Cascade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see de.dc.spring.mm.Cascade
	 * @see #setCascade(Cascade)
	 * @see de.dc.spring.mm.MmPackage#getMappingType_Cascade()
	 * @model default="ALL" unique="false"
	 * @generated
	 */
	Cascade getCascade();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.MappingType#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see de.dc.spring.mm.Cascade
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(Cascade value);

	/**
	 * Returns the value of the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped By</em>' reference.
	 * @see #setMappedBy(Entity)
	 * @see de.dc.spring.mm.MmPackage#getMappingType_MappedBy()
	 * @model
	 * @generated
	 */
	Entity getMappedBy();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.MappingType#getMappedBy <em>Mapped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' reference.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(Entity value);

} // MappingType
