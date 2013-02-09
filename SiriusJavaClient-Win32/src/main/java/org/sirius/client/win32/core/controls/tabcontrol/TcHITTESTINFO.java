/**
 * TcHITTESTINFO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.tabcontrol;

public class TcHITTESTINFO  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private org.sirius.client.win32.core.types.Point pt;

    private int flags;

    public TcHITTESTINFO() {
    }

    public TcHITTESTINFO(
           boolean autoRead,
           boolean autoWrite,
           org.sirius.client.win32.core.types.Point pt,
           int flags) {
        super(
            autoRead,
            autoWrite);
        this.pt = pt;
        this.flags = flags;
    }


    /**
     * Gets the pt value for this TcHITTESTINFO.
     * 
     * @return pt
     */
    public org.sirius.client.win32.core.types.Point getPt() {
        return pt;
    }


    /**
     * Sets the pt value for this TcHITTESTINFO.
     * 
     * @param pt
     */
    public void setPt(org.sirius.client.win32.core.types.Point pt) {
        this.pt = pt;
    }


    /**
     * Gets the flags value for this TcHITTESTINFO.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this TcHITTESTINFO.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TcHITTESTINFO)) return false;
        TcHITTESTINFO other = (TcHITTESTINFO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pt==null && other.getPt()==null) || 
             (this.pt!=null &&
              this.pt.equals(other.getPt()))) &&
            this.flags == other.getFlags();
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
        if (getPt() != null) {
            _hashCode += getPt().hashCode();
        }
        _hashCode += getFlags();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TcHITTESTINFO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controls.classes.win32.server.sirius.org/", "tcHITTESTINFO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://controls.classes.win32.server.sirius.org/", "point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
