/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.PostMapping#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getPostMapping()
 * @model
 * @generated
 */
public interface PostMapping extends RestMapping {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.mm.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.dc.spring.mm.MmPackage#getPostMapping_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getParameters();

} // PostMapping
