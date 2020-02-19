/**
 */
package de.dc.spring.mm.impl;

import de.dc.spring.mm.Cascade;
import de.dc.spring.mm.Entity;
import de.dc.spring.mm.ManyToMany;
import de.dc.spring.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getJoinTableName <em>Join Table Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getInverseJoinColumns <em>Inverse Join Columns</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManyToManyImpl extends MappingTypeImpl implements ManyToMany {
	/**
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final Cascade CASCADE_EDEFAULT = Cascade.ALL;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected Cascade cascade = CASCADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected String joinTableName = JOIN_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinColumns() <em>Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinColumns() <em>Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected String joinColumns = JOIN_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInverseJoinColumns() <em>Inverse Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERSE_JOIN_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverseJoinColumns() <em>Inverse Join Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected String inverseJoinColumns = INVERSE_JOIN_COLUMNS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedBy()
	 * @generated
	 * @ordered
	 */
	protected Entity mappedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.MANY_TO_MANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cascade getCascade() {
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade(Cascade newCascade) {
		Cascade oldCascade = cascade;
		cascade = newCascade == null ? CASCADE_EDEFAULT : newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MANY_TO_MANY__CASCADE, oldCascade,
					cascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJoinTableName() {
		return joinTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinTableName(String newJoinTableName) {
		String oldJoinTableName = joinTableName;
		joinTableName = newJoinTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME,
					oldJoinTableName, joinTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJoinColumns() {
		return joinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinColumns(String newJoinColumns) {
		String oldJoinColumns = joinColumns;
		joinColumns = newJoinColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MANY_TO_MANY__JOIN_COLUMNS, oldJoinColumns,
					joinColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInverseJoinColumns() {
		return inverseJoinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverseJoinColumns(String newInverseJoinColumns) {
		String oldInverseJoinColumns = inverseJoinColumns;
		inverseJoinColumns = newInverseJoinColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS,
					oldInverseJoinColumns, inverseJoinColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getMappedBy() {
		if (mappedBy != null && mappedBy.eIsProxy()) {
			InternalEObject oldMappedBy = (InternalEObject) mappedBy;
			mappedBy = (Entity) eResolveProxy(oldMappedBy);
			if (mappedBy != oldMappedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmPackage.MANY_TO_MANY__MAPPED_BY,
							oldMappedBy, mappedBy));
			}
		}
		return mappedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetMappedBy() {
		return mappedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedBy(Entity newMappedBy) {
		Entity oldMappedBy = mappedBy;
		mappedBy = newMappedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MANY_TO_MANY__MAPPED_BY, oldMappedBy,
					mappedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.MANY_TO_MANY__CASCADE:
			return getCascade();
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			return getJoinTableName();
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			return getJoinColumns();
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			return getInverseJoinColumns();
		case MmPackage.MANY_TO_MANY__MAPPED_BY:
			if (resolve)
				return getMappedBy();
			return basicGetMappedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.MANY_TO_MANY__CASCADE:
			setCascade((Cascade) newValue);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			setJoinTableName((String) newValue);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			setJoinColumns((String) newValue);
			return;
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			setInverseJoinColumns((String) newValue);
			return;
		case MmPackage.MANY_TO_MANY__MAPPED_BY:
			setMappedBy((Entity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MmPackage.MANY_TO_MANY__CASCADE:
			setCascade(CASCADE_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			setJoinTableName(JOIN_TABLE_NAME_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			setJoinColumns(JOIN_COLUMNS_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			setInverseJoinColumns(INVERSE_JOIN_COLUMNS_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__MAPPED_BY:
			setMappedBy((Entity) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MmPackage.MANY_TO_MANY__CASCADE:
			return cascade != CASCADE_EDEFAULT;
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			return JOIN_TABLE_NAME_EDEFAULT == null ? joinTableName != null
					: !JOIN_TABLE_NAME_EDEFAULT.equals(joinTableName);
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			return JOIN_COLUMNS_EDEFAULT == null ? joinColumns != null : !JOIN_COLUMNS_EDEFAULT.equals(joinColumns);
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			return INVERSE_JOIN_COLUMNS_EDEFAULT == null ? inverseJoinColumns != null
					: !INVERSE_JOIN_COLUMNS_EDEFAULT.equals(inverseJoinColumns);
		case MmPackage.MANY_TO_MANY__MAPPED_BY:
			return mappedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cascade: ");
		result.append(cascade);
		result.append(", joinTableName: ");
		result.append(joinTableName);
		result.append(", joinColumns: ");
		result.append(joinColumns);
		result.append(", inverseJoinColumns: ");
		result.append(inverseJoinColumns);
		result.append(')');
		return result.toString();
	}

} //ManyToManyImpl
