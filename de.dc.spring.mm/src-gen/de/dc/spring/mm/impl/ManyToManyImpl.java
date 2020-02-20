/**
 */
package de.dc.spring.mm.impl;

import de.dc.spring.mm.ManyToMany;
import de.dc.spring.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getJoinTableName <em>Join Table Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.ManyToManyImpl#getInverseJoinColumns <em>Inverse Join Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManyToManyImpl extends MappingTypeImpl implements ManyToMany {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			return getJoinTableName();
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			return getJoinColumns();
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			return getInverseJoinColumns();
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
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			setJoinTableName((String) newValue);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			setJoinColumns((String) newValue);
			return;
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			setInverseJoinColumns((String) newValue);
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
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			setJoinTableName(JOIN_TABLE_NAME_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			setJoinColumns(JOIN_COLUMNS_EDEFAULT);
			return;
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			setInverseJoinColumns(INVERSE_JOIN_COLUMNS_EDEFAULT);
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
		case MmPackage.MANY_TO_MANY__JOIN_TABLE_NAME:
			return JOIN_TABLE_NAME_EDEFAULT == null ? joinTableName != null
					: !JOIN_TABLE_NAME_EDEFAULT.equals(joinTableName);
		case MmPackage.MANY_TO_MANY__JOIN_COLUMNS:
			return JOIN_COLUMNS_EDEFAULT == null ? joinColumns != null : !JOIN_COLUMNS_EDEFAULT.equals(joinColumns);
		case MmPackage.MANY_TO_MANY__INVERSE_JOIN_COLUMNS:
			return INVERSE_JOIN_COLUMNS_EDEFAULT == null ? inverseJoinColumns != null
					: !INVERSE_JOIN_COLUMNS_EDEFAULT.equals(inverseJoinColumns);
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
		result.append(" (joinTableName: ");
		result.append(joinTableName);
		result.append(", joinColumns: ");
		result.append(joinColumns);
		result.append(", inverseJoinColumns: ");
		result.append(inverseJoinColumns);
		result.append(')');
		return result.toString();
	}

} //ManyToManyImpl
