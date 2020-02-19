/**
 */
package de.dc.spring.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.mm.DBSource#isEnableConsole <em>Enable Console</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#isWebAllowOothers <em>Web Allow Oothers</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getConsolePath <em>Console Path</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getUrl <em>Url</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getUser <em>User</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getPassword <em>Password</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getDriveClassName <em>Drive Class Name</em>}</li>
 *   <li>{@link de.dc.spring.mm.DBSource#getServerPort <em>Server Port</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.mm.MmPackage#getDBSource()
 * @model
 * @generated
 */
public interface DBSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable Console</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Console</em>' attribute.
	 * @see #setEnableConsole(boolean)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_EnableConsole()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnableConsole();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#isEnableConsole <em>Enable Console</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Console</em>' attribute.
	 * @see #isEnableConsole()
	 * @generated
	 */
	void setEnableConsole(boolean value);

	/**
	 * Returns the value of the '<em><b>Web Allow Oothers</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Allow Oothers</em>' attribute.
	 * @see #setWebAllowOothers(boolean)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_WebAllowOothers()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isWebAllowOothers();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#isWebAllowOothers <em>Web Allow Oothers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Allow Oothers</em>' attribute.
	 * @see #isWebAllowOothers()
	 * @generated
	 */
	void setWebAllowOothers(boolean value);

	/**
	 * Returns the value of the '<em><b>Console Path</b></em>' attribute.
	 * The default value is <code>"/h2-console"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Console Path</em>' attribute.
	 * @see #setConsolePath(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_ConsolePath()
	 * @model default="/h2-console" unique="false"
	 * @generated
	 */
	String getConsolePath();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getConsolePath <em>Console Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Console Path</em>' attribute.
	 * @see #getConsolePath()
	 * @generated
	 */
	void setConsolePath(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * The default value is <code>"jdbc:h2:file:./data/Repository;DB_CLOSE_ON_EXIT=true;"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_Url()
	 * @model default="jdbc:h2:file:./data/Repository;DB_CLOSE_ON_EXIT=true;" unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * The default value is <code>"SA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_User()
	 * @model default="SA" unique="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"SA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_Password()
	 * @model default="SA" unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Drive Class Name</b></em>' attribute.
	 * The default value is <code>"org.h2.Driver"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Class Name</em>' attribute.
	 * @see #setDriveClassName(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_DriveClassName()
	 * @model default="org.h2.Driver" unique="false"
	 * @generated
	 */
	String getDriveClassName();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getDriveClassName <em>Drive Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Class Name</em>' attribute.
	 * @see #getDriveClassName()
	 * @generated
	 */
	void setDriveClassName(String value);

	/**
	 * Returns the value of the '<em><b>Server Port</b></em>' attribute.
	 * The default value is <code>"2001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Port</em>' attribute.
	 * @see #setServerPort(String)
	 * @see de.dc.spring.mm.MmPackage#getDBSource_ServerPort()
	 * @model default="2001" unique="false"
	 * @generated
	 */
	String getServerPort();

	/**
	 * Sets the value of the '{@link de.dc.spring.mm.DBSource#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port</em>' attribute.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(String value);

} // DBSource
