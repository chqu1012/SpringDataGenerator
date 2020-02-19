/**
 */
package de.dc.spring.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.ManyToMany#getCascade <em>Cascade</em>}</li>
 *   <li>{@link de.dc.spring.mm.ManyToMany#getJoinTableName <em>Join Table Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.ManyToMany#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link de.dc.spring.mm.ManyToMany#getInverseJoinColumns <em>Inverse Join Columns</em>}</li>
 *   <li>{@link de.dc.spring.mm.ManyToMany#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getManyToMany()
 * @model
 * @generated
 */
public interface ManyToMany extends MappingType {
	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * The default value is <code>"ALL"</code>.
	 * The literals are from the enumeration {@link de.dc.spring.mm.Cascade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see de.dc.spring.mm.Cascade
	 * @see #setCascade(Cascade)
	 * @see de.dc.spring.mm.MmPackage#getManyToMany_Cascade()
	 * @model default="ALL" unique="false"
	 * @generated
	 */
	Cascade getCascade();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.ManyToMany#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see de.dc.spring.mm.Cascade
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(Cascade value);

	/**
	 * Returns the value of the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table Name</em>' attribute.
	 * @see #setJoinTableName(String)
	 * @see de.dc.spring.mm.MmPackage#getManyToMany_JoinTableName()
	 * @model unique="false"
	 * @generated
	 */
	String getJoinTableName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.ManyToMany#getJoinTableName <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Table Name</em>' attribute.
	 * @see #getJoinTableName()
	 * @generated
	 */
	void setJoinTableName(String value);

	/**
	 * Returns the value of the '<em><b>Join Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Columns</em>' attribute.
	 * @see #setJoinColumns(String)
	 * @see de.dc.spring.mm.MmPackage#getManyToMany_JoinColumns()
	 * @model unique="false"
	 * @generated
	 */
	String getJoinColumns();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.ManyToMany#getJoinColumns <em>Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Columns</em>' attribute.
	 * @see #getJoinColumns()
	 * @generated
	 */
	void setJoinColumns(String value);

	/**
	 * Returns the value of the '<em><b>Inverse Join Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Join Columns</em>' attribute.
	 * @see #setInverseJoinColumns(String)
	 * @see de.dc.spring.mm.MmPackage#getManyToMany_InverseJoinColumns()
	 * @model unique="false"
	 * @generated
	 */
	String getInverseJoinColumns();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.ManyToMany#getInverseJoinColumns <em>Inverse Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Join Columns</em>' attribute.
	 * @see #getInverseJoinColumns()
	 * @generated
	 */
	void setInverseJoinColumns(String value);

	/**
	 * Returns the value of the '<em><b>Mapped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped By</em>' reference.
	 * @see #setMappedBy(Entity)
	 * @see de.dc.spring.mm.MmPackage#getManyToMany_MappedBy()
	 * @model
	 * @generated
	 */
	Entity getMappedBy();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.ManyToMany#getMappedBy <em>Mapped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' reference.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(Entity value);

} // ManyToMany
