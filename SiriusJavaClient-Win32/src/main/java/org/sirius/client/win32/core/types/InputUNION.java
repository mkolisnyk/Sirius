/**
 * InputUNION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class InputUNION  extends org.sirius.client.win32.core.types.Union  implements java.io.Serializable {
    private org.sirius.client.win32.core.types.Mouseinput mi;

    private org.sirius.client.win32.core.types.Keybdinput ki;

    private org.sirius.client.win32.core.types.Hardwareinput hi;

    public InputUNION() {
    }

    public InputUNION(
           boolean autoRead,
           boolean autoWrite,
           org.sirius.client.win32.core.types.Mouseinput mi,
           org.sirius.client.win32.core.types.Keybdinput ki,
           org.sirius.client.win32.core.types.Hardwareinput hi) {
        super(
            autoRead,
            autoWrite);
        this.mi = mi;
        this.ki = ki;
        this.hi = hi;
    }


    /**
     * Gets the mi value for this InputUNION.
     * 
     * @return mi
     */
    public org.sirius.client.win32.core.types.Mouseinput getMi() {
        return mi;
    }


    /**
     * Sets the mi value for this InputUNION.
     * 
     * @param mi
     */
    public void setMi(org.sirius.client.win32.core.types.Mouseinput mi) {
        this.mi = mi;
    }


    /**
     * Gets the ki value for this InputUNION.
     * 
     * @return ki
     */
    public org.sirius.client.win32.core.types.Keybdinput getKi() {
        return ki;
    }


    /**
     * Sets the ki value for this InputUNION.
     * 
     * @param ki
     */
    public void setKi(org.sirius.client.win32.core.types.Keybdinput ki) {
        this.ki = ki;
    }


    /**
     * Gets the hi value for this InputUNION.
     * 
     * @return hi
     */
    public org.sirius.client.win32.core.types.Hardwareinput getHi() {
        return hi;
    }


    /**
     * Sets the hi value for this InputUNION.
     * 
     * @param hi
     */
    public void setHi(org.sirius.client.win32.core.types.Hardwareinput hi) {
        this.hi = hi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InputUNION)) return false;
        InputUNION other = (InputUNION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mi==null && other.getMi()==null) || 
             (this.mi!=null &&
              this.mi.equals(other.getMi()))) &&
            ((this.ki==null && other.getKi()==null) || 
             (this.ki!=null &&
              this.ki.equals(other.getKi()))) &&
            ((this.hi==null && other.getHi()==null) || 
             (this.hi!=null &&
              this.hi.equals(other.getHi())));
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
        if (getMi() != null) {
            _hashCode += getMi().hashCode();
        }
        if (getKi() != null) {
            _hashCode += getKi().hashCode();
        }
        if (getHi() != null) {
            _hashCode += getHi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InputUNION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "inputUNION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "mouseinput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ki");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ki"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "keybdinput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "hardwareinput"));
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
