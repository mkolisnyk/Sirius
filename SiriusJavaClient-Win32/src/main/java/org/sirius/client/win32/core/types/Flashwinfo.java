/**
 * Flashwinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Flashwinfo  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int cbSize;

    private org.sirius.client.win32.core.types.Handle hWnd;

    private int dwFlags;

    private int uCount;

    private int dwTimeout;

    public Flashwinfo() {
    }

    public Flashwinfo(
           boolean autoRead,
           boolean autoWrite,
           int cbSize,
           org.sirius.client.win32.core.types.Handle hWnd,
           int dwFlags,
           int uCount,
           int dwTimeout) {
        super(
            autoRead,
            autoWrite);
        this.cbSize = cbSize;
        this.hWnd = hWnd;
        this.dwFlags = dwFlags;
        this.uCount = uCount;
        this.dwTimeout = dwTimeout;
    }


    /**
     * Gets the cbSize value for this Flashwinfo.
     * 
     * @return cbSize
     */
    public int getCbSize() {
        return cbSize;
    }


    /**
     * Sets the cbSize value for this Flashwinfo.
     * 
     * @param cbSize
     */
    public void setCbSize(int cbSize) {
        this.cbSize = cbSize;
    }


    /**
     * Gets the hWnd value for this Flashwinfo.
     * 
     * @return hWnd
     */
    public org.sirius.client.win32.core.types.Handle getHWnd() {
        return hWnd;
    }


    /**
     * Sets the hWnd value for this Flashwinfo.
     * 
     * @param hWnd
     */
    public void setHWnd(org.sirius.client.win32.core.types.Handle hWnd) {
        this.hWnd = hWnd;
    }


    /**
     * Gets the dwFlags value for this Flashwinfo.
     * 
     * @return dwFlags
     */
    public int getDwFlags() {
        return dwFlags;
    }


    /**
     * Sets the dwFlags value for this Flashwinfo.
     * 
     * @param dwFlags
     */
    public void setDwFlags(int dwFlags) {
        this.dwFlags = dwFlags;
    }


    /**
     * Gets the uCount value for this Flashwinfo.
     * 
     * @return uCount
     */
    public int getUCount() {
        return uCount;
    }


    /**
     * Sets the uCount value for this Flashwinfo.
     * 
     * @param uCount
     */
    public void setUCount(int uCount) {
        this.uCount = uCount;
    }


    /**
     * Gets the dwTimeout value for this Flashwinfo.
     * 
     * @return dwTimeout
     */
    public int getDwTimeout() {
        return dwTimeout;
    }


    /**
     * Sets the dwTimeout value for this Flashwinfo.
     * 
     * @param dwTimeout
     */
    public void setDwTimeout(int dwTimeout) {
        this.dwTimeout = dwTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flashwinfo)) return false;
        Flashwinfo other = (Flashwinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cbSize == other.getCbSize() &&
            ((this.hWnd==null && other.getHWnd()==null) || 
             (this.hWnd!=null &&
              this.hWnd.equals(other.getHWnd()))) &&
            this.dwFlags == other.getDwFlags() &&
            this.uCount == other.getUCount() &&
            this.dwTimeout == other.getDwTimeout();
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
        if (getHWnd() != null) {
            _hashCode += getHWnd().hashCode();
        }
        _hashCode += getDwFlags();
        _hashCode += getUCount();
        _hashCode += getDwTimeout();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Flashwinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "flashwinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HWnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hWnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "handle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwTimeout"));
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
