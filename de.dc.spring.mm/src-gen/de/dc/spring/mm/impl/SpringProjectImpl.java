/**
 */
package de.dc.spring.mm.impl;

import de.dc.spring.mm.DBSource;
import de.dc.spring.mm.Entity;
import de.dc.spring.mm.MmPackage;
import de.dc.spring.mm.RestController;
import de.dc.spring.mm.SpringProject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.impl.SpringProjectImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.SpringProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.SpringProjectImpl#getDbSource <em>Db Source</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.SpringProjectImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.SpringProjectImpl#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpringProjectImpl extends MinimalEObjectImpl.Container implements SpringProject {
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getDbSource() <em>Db Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbSource()
	 * @generated
	 * @ordered
	 */
	protected DBSource dbSource;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<RestController> controllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.SPRING_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SPRING_PROJECT__BASE_PACKAGE,
					oldBasePackage, basePackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SPRING_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBSource getDbSource() {
		return dbSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbSource(DBSource newDbSource, NotificationChain msgs) {
		DBSource oldDbSource = dbSource;
		dbSource = newDbSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.SPRING_PROJECT__DB_SOURCE, oldDbSource, newDbSource);
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
	public void setDbSource(DBSource newDbSource) {
		if (newDbSource != dbSource) {
			NotificationChain msgs = null;
			if (dbSource != null)
				msgs = ((InternalEObject) dbSource).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.SPRING_PROJECT__DB_SOURCE, null, msgs);
			if (newDbSource != null)
				msgs = ((InternalEObject) newDbSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.SPRING_PROJECT__DB_SOURCE, null, msgs);
			msgs = basicSetDbSource(newDbSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SPRING_PROJECT__DB_SOURCE, newDbSource,
					newDbSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, MmPackage.SPRING_PROJECT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestController> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<RestController>(RestController.class, this,
					MmPackage.SPRING_PROJECT__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.SPRING_PROJECT__DB_SOURCE:
			return basicSetDbSource(null, msgs);
		case MmPackage.SPRING_PROJECT__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case MmPackage.SPRING_PROJECT__CONTROLLERS:
			return ((InternalEList<?>) getControllers()).basicRemove(otherEnd, msgs);
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
		case MmPackage.SPRING_PROJECT__BASE_PACKAGE:
			return getBasePackage();
		case MmPackage.SPRING_PROJECT__NAME:
			return getName();
		case MmPackage.SPRING_PROJECT__DB_SOURCE:
			return getDbSource();
		case MmPackage.SPRING_PROJECT__ENTITIES:
			return getEntities();
		case MmPackage.SPRING_PROJECT__CONTROLLERS:
			return getControllers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.SPRING_PROJECT__BASE_PACKAGE:
			setBasePackage((String) newValue);
			return;
		case MmPackage.SPRING_PROJECT__NAME:
			setName((String) newValue);
			return;
		case MmPackage.SPRING_PROJECT__DB_SOURCE:
			setDbSource((DBSource) newValue);
			return;
		case MmPackage.SPRING_PROJECT__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case MmPackage.SPRING_PROJECT__CONTROLLERS:
			getControllers().clear();
			getControllers().addAll((Collection<? extends RestController>) newValue);
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
		case MmPackage.SPRING_PROJECT__BASE_PACKAGE:
			setBasePackage(BASE_PACKAGE_EDEFAULT);
			return;
		case MmPackage.SPRING_PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.SPRING_PROJECT__DB_SOURCE:
			setDbSource((DBSource) null);
			return;
		case MmPackage.SPRING_PROJECT__ENTITIES:
			getEntities().clear();
			return;
		case MmPackage.SPRING_PROJECT__CONTROLLERS:
			getControllers().clear();
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
		case MmPackage.SPRING_PROJECT__BASE_PACKAGE:
			return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
		case MmPackage.SPRING_PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.SPRING_PROJECT__DB_SOURCE:
			return dbSource != null;
		case MmPackage.SPRING_PROJECT__ENTITIES:
			return entities != null && !entities.isEmpty();
		case MmPackage.SPRING_PROJECT__CONTROLLERS:
			return controllers != null && !controllers.isEmpty();
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpringProjectImpl
