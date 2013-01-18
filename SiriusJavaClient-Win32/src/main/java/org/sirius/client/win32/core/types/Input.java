/**
 * Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Input  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private org.sirius.client.win32.core.types.Dword type;

    private org.sirius.client.win32.core.types.InputUNION input;

    public Input() {
    }

    public Input(
           boolean autoRead,
           boolean autoWrite,
           org.sirius.client.win32.core.types.Dword type,
           org.sirius.client.win32.core.types.InputUNION input) {
        super(
            autoRead,
            autoWrite);
        this.type = type;
        this.input = input;
    }


    /**
     * Gets the type value for this Input.
     * 
     * @return type
     */
    public org.sirius.client.win32.core.types.Dword getType() {
        return type;
    }


    /**
     * Sets the type value for this Input.
     * 
     * @param type
     */
    public void setType(org.sirius.client.win32.core.types.Dword type) {
        this.type = type;
    }


    /**
     * Gets the input value for this Input.
     * 
     * @return input
     */
    public org.sirius.client.win32.core.types.InputUNION getInput() {
        return input;
    }


    /**
     * Sets the input value for this Input.
     * 
     * @param input
     */
    public void setInput(org.sirius.client.win32.core.types.InputUNION input) {
        this.input = input;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Input)) return false;
        Input other = (Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "dword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "inputUNION"));
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
