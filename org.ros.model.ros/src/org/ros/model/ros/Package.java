/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros;

import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ros.model.ros.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getNode <em>Node</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getLicense <em>License</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getDepend <em>Depend</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getUrl <em>Url</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getRosdep <em>Rosdep</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getService <em>Service</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getTypesLibrary <em>Types Library</em>}</li>
 *   <li>{@link org.ros.model.ros.Package#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ros.model.ros.RosPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getPackage_Node()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Depend</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend</em>' attribute list.
	 * @see org.ros.model.ros.RosPackage#getPackage_Depend()
	 * @model
	 * @generated
	 */
	EList<String> getDepend();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Rosdep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rosdep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rosdep</em>' attribute.
	 * @see #setRosdep(String)
	 * @see org.ros.model.ros.RosPackage#getPackage_Rosdep()
	 * @model
	 * @generated
	 */
	String getRosdep();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getRosdep <em>Rosdep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rosdep</em>' attribute.
	 * @see #getRosdep()
	 * @generated
	 */
	void setRosdep(String value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getPackage_Topic()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Topic> getTopic();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getPackage_Service()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Types Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Library</em>' reference.
	 * @see #setTypesLibrary(TypesLibrary)
	 * @see org.ros.model.ros.RosPackage#getPackage_TypesLibrary()
	 * @model required="true"
	 * @generated
	 */
	TypesLibrary getTypesLibrary();

	/**
	 * Sets the value of the '{@link org.ros.model.ros.Package#getTypesLibrary <em>Types Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Library</em>' reference.
	 * @see #getTypesLibrary()
	 * @generated
	 */
	void setTypesLibrary(TypesLibrary value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.ros.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.ros.model.ros.RosPackage#getPackage_Action()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Package
