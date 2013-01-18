/**
 * Menubarinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Menubarinfo  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int cbSize;

    private org.sirius.client.win32.core.types.Rect rcBar;

    private org.sirius.client.win32.core.types.Hmenu hMenu;

    private org.sirius.client.win32.core.types.Hwnd hwndMenu;

    private boolean fBarFocused;

    private boolean fFocused;

    public Menubarinfo() {
    }

    public Menubarinfo(
           boolean autoRead,
           boolean autoWrite,
           int cbSize,
           org.sirius.client.win32.core.types.Rect rcBar,
           org.sirius.client.win32.core.types.Hmenu hMenu,
           org.sirius.client.win32.core.types.Hwnd hwndMenu,
           boolean fBarFocused,
           boolean fFocused) {
        super(
            autoRead,
            autoWrite);
        this.cbSize = cbSize;
        this.rcBar = rcBar;
        this.hMenu = hMenu;
        this.hwndMenu = hwndMenu;
        this.fBarFocused = fBarFocused;
        this.fFocused = fFocused;
    }


    /**
     * Gets the cbSize value for this Menubarinfo.
     * 
     * @return cbSize
     */
    public int getCbSize() {
        return cbSize;
    }


    /**
     * Sets the cbSize value for this Menubarinfo.
     * 
     * @param cbSize
     */
    public void setCbSize(int cbSize) {
        this.cbSize = cbSize;
    }


    /**
     * Gets the rcBar value for this Menubarinfo.
     * 
     * @return rcBar
     */
    public org.sirius.client.win32.core.types.Rect getRcBar() {
        return rcBar;
    }


    /**
     * Sets the rcBar value for this Menubarinfo.
     * 
     * @param rcBar
     */
    public void setRcBar(org.sirius.client.win32.core.types.Rect rcBar) {
        this.rcBar = rcBar;
    }


    /**
     * Gets the hMenu value for this Menubarinfo.
     * 
     * @return hMenu
     */
    public org.sirius.client.win32.core.types.Hmenu getHMenu() {
        return hMenu;
    }


    /**
     * Sets the hMenu value for this Menubarinfo.
     * 
     * @param hMenu
     */
    public void setHMenu(org.sirius.client.win32.core.types.Hmenu hMenu) {
        this.hMenu = hMenu;
    }


    /**
     * Gets the hwndMenu value for this Menubarinfo.
     * 
     * @return hwndMenu
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndMenu() {
        return hwndMenu;
    }


    /**
     * Sets the hwndMenu value for this Menubarinfo.
     * 
     * @param hwndMenu
     */
    public void setHwndMenu(org.sirius.client.win32.core.types.Hwnd hwndMenu) {
        this.hwndMenu = hwndMenu;
    }


    /**
     * Gets the fBarFocused value for this Menubarinfo.
     * 
     * @return fBarFocused
     */
    public boolean isFBarFocused() {
        return fBarFocused;
    }


    /**
     * Sets the fBarFocused value for this Menubarinfo.
     * 
     * @param fBarFocused
     */
    public void setFBarFocused(boolean fBarFocused) {
        this.fBarFocused = fBarFocused;
    }


    /**
     * Gets the fFocused value for this Menubarinfo.
     * 
     * @return fFocused
     */
    public boolean isFFocused() {
        return fFocused;
    }


    /**
     * Sets the fFocused value for this Menubarinfo.
     * 
     * @param fFocused
     */
    public void setFFocused(boolean fFocused) {
        this.fFocused = fFocused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menubarinfo)) return false;
        Menubarinfo other = (Menubarinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cbSize == other.getCbSize() &&
            ((this.rcBar==null && other.getRcBar()==null) || 
             (this.rcBar!=null &&
              this.rcBar.equals(other.getRcBar()))) &&
            ((this.hMenu==null && other.getHMenu()==null) || 
             (this.hMenu!=null &&
              this.hMenu.equals(other.getHMenu()))) &&
            ((this.hwndMenu==null && other.getHwndMenu()==null) || 
             (this.hwndMenu!=null &&
              this.hwndMenu.equals(other.getHwndMenu()))) &&
            this.fBarFocused == other.isFBarFocused() &&
            this.fFocused == other.isFFocused();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getCbSize();
        if (getRcBar() != null) {
            _hashCode += getRcBar().hashCode();
        }
        if (getHMenu() != null) {
            _hashCode += getHMenu().hashCode();
        }
        if (getHwndMenu() != null) {
            _hashCode += getHwndMenu().hashCode();
        }
        _hashCode += (isFBarFocused() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFFocused() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Menubarinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "menubarinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "rect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hmenu"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FBarFocused");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fBarFocused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FFocused");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fFocused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
