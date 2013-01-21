/**
 * PointerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public abstract class PointerType  implements java.io.Serializable {
    private org.sirius.client.win32.core.types.Pointer pointer;

    public PointerType() {
    }

    public PointerType(
           org.sirius.client.win32.core.types.Pointer pointer) {
           this.pointer = pointer;
    }


    /**
     * Gets the pointer value for this PointerType.
     * 
     * @return pointer
     */
    public org.sirius.client.win32.core.types.Pointer getPointer() {
        return pointer;
    }


    /**
     * Sets the pointer value for this PointerType.
     * 
     * @param pointer
     */
    public void setPointer(org.sirius.client.win32.core.types.Pointer pointer) {
        this.pointer = pointer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PointerType)) return false;
        PointerType other = (PointerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pointer==null && other.getPointer()==null) || 
             (this.pointer!=null &&
              this.pointer.equals(other.getPointer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPointer() != null) {
            _hashCode += getPointer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PointerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "pointerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "pointer"));
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
