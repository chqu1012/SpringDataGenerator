/**
 */
package de.dc.spring.mm.impl;

import de.dc.spring.mm.DBSource;
import de.dc.spring.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#isEnableConsole <em>Enable Console</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#isWebAllowOothers <em>Web Allow Oothers</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getConsolePath <em>Console Path</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getUser <em>User</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getDriveClassName <em>Drive Class Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.impl.DBSourceImpl#getServerPort <em>Server Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBSourceImpl extends MinimalEObjectImpl.Container implements DBSource {
	/**
	 * The default value of the '{@link #isEnableConsole() <em>Enable Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableConsole()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CONSOLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableConsole() <em>Enable Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableConsole()
	 * @generated
	 * @ordered
	 */
	protected boolean enableConsole = ENABLE_CONSOLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWebAllowOothers() <em>Web Allow Oothers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebAllowOothers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEB_ALLOW_OOTHERS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWebAllowOothers() <em>Web Allow Oothers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebAllowOothers()
	 * @generated
	 * @ordered
	 */
	protected boolean webAllowOothers = WEB_ALLOW_OOTHERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsolePath() <em>Console Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolePath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSOLE_PATH_EDEFAULT = "/h2-console";

	/**
	 * The cached value of the '{@link #getConsolePath() <em>Console Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolePath()
	 * @generated
	 * @ordered
	 */
	protected String consolePath = CONSOLE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = "jdbc:h2:file:./data/Repository;DB_CLOSE_ON_EXIT=true;";

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = "SA";

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = "SA";

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriveClassName() <em>Drive Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_CLASS_NAME_EDEFAULT = "org.h2.Driver";

	/**
	 * The cached value of the '{@link #getDriveClassName() <em>Drive Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveClassName()
	 * @generated
	 * @ordered
	 */
	protected String driveClassName = DRIVE_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_PORT_EDEFAULT = "2001";

	/**
	 * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected String serverPort = SERVER_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.DB_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableConsole() {
		return enableConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableConsole(boolean newEnableConsole) {
		boolean oldEnableConsole = enableConsole;
		enableConsole = newEnableConsole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__ENABLE_CONSOLE, oldEnableConsole,
					enableConsole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWebAllowOothers() {
		return webAllowOothers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAllowOothers(boolean newWebAllowOothers) {
		boolean oldWebAllowOothers = webAllowOothers;
		webAllowOothers = newWebAllowOothers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__WEB_ALLOW_OOTHERS,
					oldWebAllowOothers, webAllowOothers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsolePath() {
		return consolePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsolePath(String newConsolePath) {
		String oldConsolePath = consolePath;
		consolePath = newConsolePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__CONSOLE_PATH, oldConsolePath,
					consolePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveClassName() {
		return driveClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveClassName(String newDriveClassName) {
		String oldDriveClassName = driveClassName;
		driveClassName = newDriveClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__DRIVE_CLASS_NAME,
					oldDriveClassName, driveClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerPort() {
		return serverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerPort(String newServerPort) {
		String oldServerPort = serverPort;
		serverPort = newServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.DB_SOURCE__SERVER_PORT, oldServerPort,
					serverPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.DB_SOURCE__ENABLE_CONSOLE:
			return isEnableConsole();
		case MmPackage.DB_SOURCE__WEB_ALLOW_OOTHERS:
			return isWebAllowOothers();
		case MmPackage.DB_SOURCE__CONSOLE_PATH:
			return getConsolePath();
		case MmPackage.DB_SOURCE__URL:
			return getUrl();
		case MmPackage.DB_SOURCE__USER:
			return getUser();
		case MmPackage.DB_SOURCE__PASSWORD:
			return getPassword();
		case MmPackage.DB_SOURCE__DRIVE_CLASS_NAME:
			return getDriveClassName();
		case MmPackage.DB_SOURCE__SERVER_PORT:
			return getServerPort();
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
		case MmPackage.DB_SOURCE__ENABLE_CONSOLE:
			setEnableConsole((Boolean) newValue);
			return;
		case MmPackage.DB_SOURCE__WEB_ALLOW_OOTHERS:
			setWebAllowOothers((Boolean) newValue);
			return;
		case MmPackage.DB_SOURCE__CONSOLE_PATH:
			setConsolePath((String) newValue);
			return;
		case MmPackage.DB_SOURCE__URL:
			setUrl((String) newValue);
			return;
		case MmPackage.DB_SOURCE__USER:
			setUser((String) newValue);
			return;
		case MmPackage.DB_SOURCE__PASSWORD:
			setPassword((String) newValue);
			return;
		case MmPackage.DB_SOURCE__DRIVE_CLASS_NAME:
			setDriveClassName((String) newValue);
			return;
		case MmPackage.DB_SOURCE__SERVER_PORT:
			setServerPort((String) newValue);
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
		case MmPackage.DB_SOURCE__ENABLE_CONSOLE:
			setEnableConsole(ENABLE_CONSOLE_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__WEB_ALLOW_OOTHERS:
			setWebAllowOothers(WEB_ALLOW_OOTHERS_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__CONSOLE_PATH:
			setConsolePath(CONSOLE_PATH_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__URL:
			setUrl(URL_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__USER:
			setUser(USER_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__DRIVE_CLASS_NAME:
			setDriveClassName(DRIVE_CLASS_NAME_EDEFAULT);
			return;
		case MmPackage.DB_SOURCE__SERVER_PORT:
			setServerPort(SERVER_PORT_EDEFAULT);
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
		case MmPackage.DB_SOURCE__ENABLE_CONSOLE:
			return enableConsole != ENABLE_CONSOLE_EDEFAULT;
		case MmPackage.DB_SOURCE__WEB_ALLOW_OOTHERS:
			return webAllowOothers != WEB_ALLOW_OOTHERS_EDEFAULT;
		case MmPackage.DB_SOURCE__CONSOLE_PATH:
			return CONSOLE_PATH_EDEFAULT == null ? consolePath != null : !CONSOLE_PATH_EDEFAULT.equals(consolePath);
		case MmPackage.DB_SOURCE__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case MmPackage.DB_SOURCE__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
		case MmPackage.DB_SOURCE__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case MmPackage.DB_SOURCE__DRIVE_CLASS_NAME:
			return DRIVE_CLASS_NAME_EDEFAULT == null ? driveClassName != null
					: !DRIVE_CLASS_NAME_EDEFAULT.equals(driveClassName);
		case MmPackage.DB_SOURCE__SERVER_PORT:
			return SERVER_PORT_EDEFAULT == null ? serverPort != null : !SERVER_PORT_EDEFAULT.equals(serverPort);
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
		result.append(" (enableConsole: ");
		result.append(enableConsole);
		result.append(", webAllowOothers: ");
		result.append(webAllowOothers);
		result.append(", consolePath: ");
		result.append(consolePath);
		result.append(", url: ");
		result.append(url);
		result.append(", user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", driveClassName: ");
		result.append(driveClassName);
		result.append(", serverPort: ");
		result.append(serverPort);
		result.append(')');
		return result.toString();
	}

} //DBSourceImpl
