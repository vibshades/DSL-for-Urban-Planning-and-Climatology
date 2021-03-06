/**
 * generated by Xtext 2.18.0
 */
package org.xtext.fp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fp.FpPackage;
import org.xtext.fp.findtempDemolish;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>findtemp Demolish</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fp.impl.findtempDemolishImpl#getNo_of_buildings <em>No of buildings</em>}</li>
 *   <li>{@link org.xtext.fp.impl.findtempDemolishImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.fp.impl.findtempDemolishImpl#getBreadth <em>Breadth</em>}</li>
 *   <li>{@link org.xtext.fp.impl.findtempDemolishImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class findtempDemolishImpl extends QueryImpl implements findtempDemolish
{
  /**
   * The default value of the '{@link #getNo_of_buildings() <em>No of buildings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo_of_buildings()
   * @generated
   * @ordered
   */
  protected static final int NO_OF_BUILDINGS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNo_of_buildings() <em>No of buildings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo_of_buildings()
   * @generated
   * @ordered
   */
  protected int no_of_buildings = NO_OF_BUILDINGS_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final int LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected int length = LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getBreadth() <em>Breadth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreadth()
   * @generated
   * @ordered
   */
  protected static final int BREADTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBreadth() <em>Breadth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreadth()
   * @generated
   * @ordered
   */
  protected int breadth = BREADTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected findtempDemolishImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FpPackage.Literals.FINDTEMP_DEMOLISH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNo_of_buildings()
  {
    return no_of_buildings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNo_of_buildings(int newNo_of_buildings)
  {
    int oldNo_of_buildings = no_of_buildings;
    no_of_buildings = newNo_of_buildings;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FpPackage.FINDTEMP_DEMOLISH__NO_OF_BUILDINGS, oldNo_of_buildings, no_of_buildings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLength(int newLength)
  {
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FpPackage.FINDTEMP_DEMOLISH__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBreadth()
  {
    return breadth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBreadth(int newBreadth)
  {
    int oldBreadth = breadth;
    breadth = newBreadth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FpPackage.FINDTEMP_DEMOLISH__BREADTH, oldBreadth, breadth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FpPackage.FINDTEMP_DEMOLISH__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FpPackage.FINDTEMP_DEMOLISH__NO_OF_BUILDINGS:
        return getNo_of_buildings();
      case FpPackage.FINDTEMP_DEMOLISH__LENGTH:
        return getLength();
      case FpPackage.FINDTEMP_DEMOLISH__BREADTH:
        return getBreadth();
      case FpPackage.FINDTEMP_DEMOLISH__HEIGHT:
        return getHeight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FpPackage.FINDTEMP_DEMOLISH__NO_OF_BUILDINGS:
        setNo_of_buildings((Integer)newValue);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__LENGTH:
        setLength((Integer)newValue);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__BREADTH:
        setBreadth((Integer)newValue);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__HEIGHT:
        setHeight((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FpPackage.FINDTEMP_DEMOLISH__NO_OF_BUILDINGS:
        setNo_of_buildings(NO_OF_BUILDINGS_EDEFAULT);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__BREADTH:
        setBreadth(BREADTH_EDEFAULT);
        return;
      case FpPackage.FINDTEMP_DEMOLISH__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FpPackage.FINDTEMP_DEMOLISH__NO_OF_BUILDINGS:
        return no_of_buildings != NO_OF_BUILDINGS_EDEFAULT;
      case FpPackage.FINDTEMP_DEMOLISH__LENGTH:
        return length != LENGTH_EDEFAULT;
      case FpPackage.FINDTEMP_DEMOLISH__BREADTH:
        return breadth != BREADTH_EDEFAULT;
      case FpPackage.FINDTEMP_DEMOLISH__HEIGHT:
        return height != HEIGHT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (no_of_buildings: ");
    result.append(no_of_buildings);
    result.append(", length: ");
    result.append(length);
    result.append(", breadth: ");
    result.append(breadth);
    result.append(", height: ");
    result.append(height);
    result.append(')');
    return result.toString();
  }

} //findtempDemolishImpl
