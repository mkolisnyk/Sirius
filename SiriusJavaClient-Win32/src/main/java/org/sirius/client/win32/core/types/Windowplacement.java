/**
 * Windowplacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Windowplacement  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int length;

    private int flags;

    private int showCmd;

    private org.sirius.client.win32.core.types.Point ptMinPosition;

    private org.sirius.client.win32.core.types.Point ptMaxPosition;

    private org.sirius.client.win32.core.types.Rect rcNormalPosition;

    public Windowplacement() {
    }

    public Windowplacement(
           boolean autoRead,
           boolean autoWrite,
           int length,
           int flags,
           int showCmd,
           org.sirius.client.win32.core.types.Point ptMinPosition,
           org.sirius.client.win32.core.types.Point ptMaxPosition,
           org.sirius.client.win32.core.types.Rect rcNormalPosition) {
        super(
            autoRead,
            autoWrite);
        this.length = length;
        this.flags = flags;
        this.showCmd = showCmd;
        this.ptMinPosition = ptMinPosition;
        this.ptMaxPosition = ptMaxPosition;
        this.rcNormalPosition = rcNormalPosition;
    }


    /**
     * Gets the length value for this Windowplacement.
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this Windowplacement.
     * 
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the flags value for this Windowplacement.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Windowplacement.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }


    /**
     * Gets the showCmd value for this Windowplacement.
     * 
     * @return showCmd
     */
    public int getShowCmd() {
        return showCmd;
    }


    /**
     * Sets the showCmd value for this Windowplacement.
     * 
     * @param showCmd
     */
    public void setShowCmd(int showCmd) {
        this.showCmd = showCmd;
    }


    /**
     * Gets the ptMinPosition value for this Windowplacement.
     * 
     * @return ptMinPosition
     */
    public org.sirius.client.win32.core.types.Point getPtMinPosition() {
        return ptMinPosition;
    }


    /**
     * Sets the ptMinPosition value for this Windowplacement.
     * 
     * @param ptMinPosition
     */
    public void setPtMinPosition(org.sirius.client.win32.core.types.Point ptMinPosition) {
        this.ptMinPosition = ptMinPosition;
    }


    /**
     * Gets the ptMaxPosition value for this Windowplacement.
     * 
     * @return ptMaxPosition
     */
    public org.sirius.client.win32.core.types.Point getPtMaxPosition() {
        return ptMaxPosition;
    }


    /**
     * Sets the ptMaxPosition value for this Windowplacement.
     * 
     * @param ptMaxPosition
     */
    public void setPtMaxPosition(org.sirius.client.win32.core.types.Point ptMaxPosition) {
        this.ptMaxPosition = ptMaxPosition;
    }


    /**
     * Gets the rcNormalPosition value for this Windowplacement.
     * 
     * @return rcNormalPosition
     */
    public org.sirius.client.win32.core.types.Rect getRcNormalPosition() {
        return rcNormalPosition;
    }


    /**
     * Sets the rcNormalPosition value for this Windowplacement.
     * 
     * @param rcNormalPosition
     */
    public void setRcNormalPosition(org.sirius.client.win32.core.types.Rect rcNormalPosition) {
        this.rcNormalPosition = rcNormalPosition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Windowplacement)) return false;
        Windowplacement other = (Windowplacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.length == other.getLength() &&
            this.flags == other.getFlags() &&
            this.showCmd == other.getShowCmd() &&
            ((this.ptMinPosition==null && other.getPtMinPosition()==null) || 
             (this.ptMinPosition!=null &&
              this.ptMinPosition.equals(other.getPtMinPosition()))) &&
            ((this.ptMaxPosition==null && other.getPtMaxPosition()==null) || 
             (this.ptMaxPosition!=null &&
              this.ptMaxPosition.equals(other.getPtMaxPosition()))) &&
            ((this.rcNormalPosition==null && other.getRcNormalPosition()==null) || 
             (this.rcNormalPosition!=null &&
              this.rcNormalPosition.equals(other.getRcNormalPosition())));
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
        _hashCode += getLength();
        _hashCode += getFlags();
        _hashCode += getShowCmd();
        if (getPtMinPosition() != null) {
            _hashCode += getPtMinPosition().hashCode();
        }
        if (getPtMaxPosition() != null) {
            _hashCode += getPtMaxPosition().hashCode();
        }
        if (getRcNormalPosition() != null) {
            _hashCode += getRcNormalPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Windowplacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "windowplacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
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
        elemField.setFieldName("showCmd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showCmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptMinPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptMinPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptMaxPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptMaxPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcNormalPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcNormalPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "rect"));
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
