/**
 * Guithreadinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Guithreadinfo  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int cbSize;

    private int flags;

    private org.sirius.client.win32.core.types.Hwnd hwndActive;

    private org.sirius.client.win32.core.types.Hwnd hwndFocus;

    private org.sirius.client.win32.core.types.Hwnd hwndCapture;

    private org.sirius.client.win32.core.types.Hwnd hwndMenuOwner;

    private org.sirius.client.win32.core.types.Hwnd hwndMoveSize;

    private org.sirius.client.win32.core.types.Hwnd hwndCaret;

    private org.sirius.client.win32.core.types.Rect rcCaret;

    public Guithreadinfo() {
    }

    public Guithreadinfo(
           boolean autoRead,
           boolean autoWrite,
           int cbSize,
           int flags,
           org.sirius.client.win32.core.types.Hwnd hwndActive,
           org.sirius.client.win32.core.types.Hwnd hwndFocus,
           org.sirius.client.win32.core.types.Hwnd hwndCapture,
           org.sirius.client.win32.core.types.Hwnd hwndMenuOwner,
           org.sirius.client.win32.core.types.Hwnd hwndMoveSize,
           org.sirius.client.win32.core.types.Hwnd hwndCaret,
           org.sirius.client.win32.core.types.Rect rcCaret) {
        super(
            autoRead,
            autoWrite);
        this.cbSize = cbSize;
        this.flags = flags;
        this.hwndActive = hwndActive;
        this.hwndFocus = hwndFocus;
        this.hwndCapture = hwndCapture;
        this.hwndMenuOwner = hwndMenuOwner;
        this.hwndMoveSize = hwndMoveSize;
        this.hwndCaret = hwndCaret;
        this.rcCaret = rcCaret;
    }


    /**
     * Gets the cbSize value for this Guithreadinfo.
     * 
     * @return cbSize
     */
    public int getCbSize() {
        return cbSize;
    }


    /**
     * Sets the cbSize value for this Guithreadinfo.
     * 
     * @param cbSize
     */
    public void setCbSize(int cbSize) {
        this.cbSize = cbSize;
    }


    /**
     * Gets the flags value for this Guithreadinfo.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Guithreadinfo.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }


    /**
     * Gets the hwndActive value for this Guithreadinfo.
     * 
     * @return hwndActive
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndActive() {
        return hwndActive;
    }


    /**
     * Sets the hwndActive value for this Guithreadinfo.
     * 
     * @param hwndActive
     */
    public void setHwndActive(org.sirius.client.win32.core.types.Hwnd hwndActive) {
        this.hwndActive = hwndActive;
    }


    /**
     * Gets the hwndFocus value for this Guithreadinfo.
     * 
     * @return hwndFocus
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndFocus() {
        return hwndFocus;
    }


    /**
     * Sets the hwndFocus value for this Guithreadinfo.
     * 
     * @param hwndFocus
     */
    public void setHwndFocus(org.sirius.client.win32.core.types.Hwnd hwndFocus) {
        this.hwndFocus = hwndFocus;
    }


    /**
     * Gets the hwndCapture value for this Guithreadinfo.
     * 
     * @return hwndCapture
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndCapture() {
        return hwndCapture;
    }


    /**
     * Sets the hwndCapture value for this Guithreadinfo.
     * 
     * @param hwndCapture
     */
    public void setHwndCapture(org.sirius.client.win32.core.types.Hwnd hwndCapture) {
        this.hwndCapture = hwndCapture;
    }


    /**
     * Gets the hwndMenuOwner value for this Guithreadinfo.
     * 
     * @return hwndMenuOwner
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndMenuOwner() {
        return hwndMenuOwner;
    }


    /**
     * Sets the hwndMenuOwner value for this Guithreadinfo.
     * 
     * @param hwndMenuOwner
     */
    public void setHwndMenuOwner(org.sirius.client.win32.core.types.Hwnd hwndMenuOwner) {
        this.hwndMenuOwner = hwndMenuOwner;
    }


    /**
     * Gets the hwndMoveSize value for this Guithreadinfo.
     * 
     * @return hwndMoveSize
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndMoveSize() {
        return hwndMoveSize;
    }


    /**
     * Sets the hwndMoveSize value for this Guithreadinfo.
     * 
     * @param hwndMoveSize
     */
    public void setHwndMoveSize(org.sirius.client.win32.core.types.Hwnd hwndMoveSize) {
        this.hwndMoveSize = hwndMoveSize;
    }


    /**
     * Gets the hwndCaret value for this Guithreadinfo.
     * 
     * @return hwndCaret
     */
    public org.sirius.client.win32.core.types.Hwnd getHwndCaret() {
        return hwndCaret;
    }


    /**
     * Sets the hwndCaret value for this Guithreadinfo.
     * 
     * @param hwndCaret
     */
    public void setHwndCaret(org.sirius.client.win32.core.types.Hwnd hwndCaret) {
        this.hwndCaret = hwndCaret;
    }


    /**
     * Gets the rcCaret value for this Guithreadinfo.
     * 
     * @return rcCaret
     */
    public org.sirius.client.win32.core.types.Rect getRcCaret() {
        return rcCaret;
    }


    /**
     * Sets the rcCaret value for this Guithreadinfo.
     * 
     * @param rcCaret
     */
    public void setRcCaret(org.sirius.client.win32.core.types.Rect rcCaret) {
        this.rcCaret = rcCaret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Guithreadinfo)) return false;
        Guithreadinfo other = (Guithreadinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cbSize == other.getCbSize() &&
            this.flags == other.getFlags() &&
            ((this.hwndActive==null && other.getHwndActive()==null) || 
             (this.hwndActive!=null &&
              this.hwndActive.equals(other.getHwndActive()))) &&
            ((this.hwndFocus==null && other.getHwndFocus()==null) || 
             (this.hwndFocus!=null &&
              this.hwndFocus.equals(other.getHwndFocus()))) &&
            ((this.hwndCapture==null && other.getHwndCapture()==null) || 
             (this.hwndCapture!=null &&
              this.hwndCapture.equals(other.getHwndCapture()))) &&
            ((this.hwndMenuOwner==null && other.getHwndMenuOwner()==null) || 
             (this.hwndMenuOwner!=null &&
              this.hwndMenuOwner.equals(other.getHwndMenuOwner()))) &&
            ((this.hwndMoveSize==null && other.getHwndMoveSize()==null) || 
             (this.hwndMoveSize!=null &&
              this.hwndMoveSize.equals(other.getHwndMoveSize()))) &&
            ((this.hwndCaret==null && other.getHwndCaret()==null) || 
             (this.hwndCaret!=null &&
              this.hwndCaret.equals(other.getHwndCaret()))) &&
            ((this.rcCaret==null && other.getRcCaret()==null) || 
             (this.rcCaret!=null &&
              this.rcCaret.equals(other.getRcCaret())));
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
        _hashCode += getFlags();
        if (getHwndActive() != null) {
            _hashCode += getHwndActive().hashCode();
        }
        if (getHwndFocus() != null) {
            _hashCode += getHwndFocus().hashCode();
        }
        if (getHwndCapture() != null) {
            _hashCode += getHwndCapture().hashCode();
        }
        if (getHwndMenuOwner() != null) {
            _hashCode += getHwndMenuOwner().hashCode();
        }
        if (getHwndMoveSize() != null) {
            _hashCode += getHwndMoveSize().hashCode();
        }
        if (getHwndCaret() != null) {
            _hashCode += getHwndCaret().hashCode();
        }
        if (getRcCaret() != null) {
            _hashCode += getRcCaret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Guithreadinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "guithreadinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndFocus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndFocus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndCapture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndCapture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndMenuOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndMenuOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndMoveSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndMoveSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwndCaret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwndCaret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hwnd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCaret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcCaret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "rect"));
        elemField.setMinOccurs(0);
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
