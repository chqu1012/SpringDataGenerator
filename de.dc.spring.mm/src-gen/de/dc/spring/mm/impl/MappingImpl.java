/**
 */
package de.dc.spring.mm.impl;

import de.dc.spring.mm.Entity;
import de.dc.spring.mm.Mapping;
import de.dc.spring.mm.MappingType;
import de.dc.spring.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.impl.MappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.MappingImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.MappingImpl#isIsList <em>Is List</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.MappingImpl#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The default value of the '{@link #isIsList() <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LIST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsList() <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsList()
	 * @generated
	 * @ordered
	 */
	protected boolean isList = IS_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappingType() <em>Mapping Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected MappingType mappingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmPackage.MAPPING__ENTITY, oldEntity,
							entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MAPPING__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsList() {
		return isList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsList(boolean newIsList) {
		boolean oldIsList = isList;
		isList = newIsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MAPPING__IS_LIST, oldIsList, isList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingType getMappingType() {
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingType(MappingType newMappingType, NotificationChain msgs) {
		MappingType oldMappingType = mappingType;
		mappingType = newMappingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.MAPPING__MAPPING_TYPE, oldMappingType, newMappingType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingType(MappingType newMappingType) {
		if (newMappingType != mappingType) {
			NotificationChain msgs = null;
			if (mappingType != null)
				msgs = ((InternalEObject) mappingType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.MAPPING__MAPPING_TYPE, null, msgs);
			if (newMappingType != null)
				msgs = ((InternalEObject) newMappingType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.MAPPING__MAPPING_TYPE, null, msgs);
			msgs = basicSetMappingType(newMappingType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MAPPING__MAPPING_TYPE, newMappingType,
					newMappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.MAPPING__MAPPING_TYPE:
			return basicSetMappingType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.MAPPING__NAME:
			return getName();
		case MmPackage.MAPPING__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case MmPackage.MAPPING__IS_LIST:
			return isIsList();
		case MmPackage.MAPPING__MAPPING_TYPE:
			return getMappingType();
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
		case MmPackage.MAPPING__NAME:
			setName((String) newValue);
			return;
		case MmPackage.MAPPING__ENTITY:
			setEntity((Entity) newValue);
			return;
		case MmPackage.MAPPING__IS_LIST:
			setIsList((Boolean) newValue);
			return;
		case MmPackage.MAPPING__MAPPING_TYPE:
			setMappingType((MappingType) newValue);
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
		case MmPackage.MAPPING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.MAPPING__ENTITY:
			setEntity((Entity) null);
			return;
		case MmPackage.MAPPING__IS_LIST:
			setIsList(IS_LIST_EDEFAULT);
			return;
		case MmPackage.MAPPING__MAPPING_TYPE:
			setMappingType((MappingType) null);
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
		case MmPackage.MAPPING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.MAPPING__ENTITY:
			return entity != null;
		case MmPackage.MAPPING__IS_LIST:
			return isList != IS_LIST_EDEFAULT;
		case MmPackage.MAPPING__MAPPING_TYPE:
			return mappingType != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isList: ");
		result.append(isList);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
