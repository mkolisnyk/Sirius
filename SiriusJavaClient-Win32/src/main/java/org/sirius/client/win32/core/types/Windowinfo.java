/**
 * Windowinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Windowinfo  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int cbSize;

    private org.sirius.client.win32.core.types.Rect rcWindow;

    private org.sirius.client.win32.core.types.Rect rcClient;

    private int dwStyle;

    private int dwExStyle;

    private int dwWindowStatus;

    private int cxWindowBorders;

    private int cyWindowBorders;

    private short atomWindowType;

    private short wCreatorVersion;

    public Windowinfo() {
    }

    public Windowinfo(
           boolean autoRead,
           boolean autoWrite,
           int cbSize,
           org.sirius.client.win32.core.types.Rect rcWindow,
           org.sirius.client.win32.core.types.Rect rcClient,
           int dwStyle,
           int dwExStyle,
           int dwWindowStatus,
           int cxWindowBorders,
           int cyWindowBorders,
           short atomWindowType,
           short wCreatorVersion) {
        super(
            autoRead,
            autoWrite);
        this.cbSize = cbSize;
        this.rcWindow = rcWindow;
        this.rcClient = rcClient;
        this.dwStyle = dwStyle;
        this.dwExStyle = dwExStyle;
        this.dwWindowStatus = dwWindowStatus;
        this.cxWindowBorders = cxWindowBorders;
        this.cyWindowBorders = cyWindowBorders;
        this.atomWindowType = atomWindowType;
        this.wCreatorVersion = wCreatorVersion;
    }


    /**
     * Gets the cbSize value for this Windowinfo.
     * 
     * @return cbSize
     */
    public int getCbSize() {
        return cbSize;
    }


    /**
     * Sets the cbSize value for this Windowinfo.
     * 
     * @param cbSize
     */
    public void setCbSize(int cbSize) {
        this.cbSize = cbSize;
    }


    /**
     * Gets the rcWindow value for this Windowinfo.
     * 
     * @return rcWindow
     */
    public org.sirius.client.win32.core.types.Rect getRcWindow() {
        return rcWindow;
    }


    /**
     * Sets the rcWindow value for this Windowinfo.
     * 
     * @param rcWindow
     */
    public void setRcWindow(org.sirius.client.win32.core.types.Rect rcWindow) {
        this.rcWindow = rcWindow;
    }


    /**
     * Gets the rcClient value for this Windowinfo.
     * 
     * @return rcClient
     */
    public org.sirius.client.win32.core.types.Rect getRcClient() {
        return rcClient;
    }


    /**
     * Sets the rcClient value for this Windowinfo.
     * 
     * @param rcClient
     */
    public void setRcClient(org.sirius.client.win32.core.types.Rect rcClient) {
        this.rcClient = rcClient;
    }


    /**
     * Gets the dwStyle value for this Windowinfo.
     * 
     * @return dwStyle
     */
    public int getDwStyle() {
        return dwStyle;
    }


    /**
     * Sets the dwStyle value for this Windowinfo.
     * 
     * @param dwStyle
     */
    public void setDwStyle(int dwStyle) {
        this.dwStyle = dwStyle;
    }


    /**
     * Gets the dwExStyle value for this Windowinfo.
     * 
     * @return dwExStyle
     */
    public int getDwExStyle() {
        return dwExStyle;
    }


    /**
     * Sets the dwExStyle value for this Windowinfo.
     * 
     * @param dwExStyle
     */
    public void setDwExStyle(int dwExStyle) {
        this.dwExStyle = dwExStyle;
    }


    /**
     * Gets the dwWindowStatus value for this Windowinfo.
     * 
     * @return dwWindowStatus
     */
    public int getDwWindowStatus() {
        return dwWindowStatus;
    }


    /**
     * Sets the dwWindowStatus value for this Windowinfo.
     * 
     * @param dwWindowStatus
     */
    public void setDwWindowStatus(int dwWindowStatus) {
        this.dwWindowStatus = dwWindowStatus;
    }


    /**
     * Gets the cxWindowBorders value for this Windowinfo.
     * 
     * @return cxWindowBorders
     */
    public int getCxWindowBorders() {
        return cxWindowBorders;
    }


    /**
     * Sets the cxWindowBorders value for this Windowinfo.
     * 
     * @param cxWindowBorders
     */
    public void setCxWindowBorders(int cxWindowBorders) {
        this.cxWindowBorders = cxWindowBorders;
    }


    /**
     * Gets the cyWindowBorders value for this Windowinfo.
     * 
     * @return cyWindowBorders
     */
    public int getCyWindowBorders() {
        return cyWindowBorders;
    }


    /**
     * Sets the cyWindowBorders value for this Windowinfo.
     * 
     * @param cyWindowBorders
     */
    public void setCyWindowBorders(int cyWindowBorders) {
        this.cyWindowBorders = cyWindowBorders;
    }


    /**
     * Gets the atomWindowType value for this Windowinfo.
     * 
     * @return atomWindowType
     */
    public short getAtomWindowType() {
        return atomWindowType;
    }


    /**
     * Sets the atomWindowType value for this Windowinfo.
     * 
     * @param atomWindowType
     */
    public void setAtomWindowType(short atomWindowType) {
        this.atomWindowType = atomWindowType;
    }


    /**
     * Gets the wCreatorVersion value for this Windowinfo.
     * 
     * @return wCreatorVersion
     */
    public short getWCreatorVersion() {
        return wCreatorVersion;
    }


    /**
     * Sets the wCreatorVersion value for this Windowinfo.
     * 
     * @param wCreatorVersion
     */
    public void setWCreatorVersion(short wCreatorVersion) {
        this.wCreatorVersion = wCreatorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Windowinfo)) return false;
        Windowinfo other = (Windowinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cbSize == other.getCbSize() &&
            ((this.rcWindow==null && other.getRcWindow()==null) || 
             (this.rcWindow!=null &&
              this.rcWindow.equals(other.getRcWindow()))) &&
            ((this.rcClient==null && other.getRcClient()==null) || 
             (this.rcClient!=null &&
              this.rcClient.equals(other.getRcClient()))) &&
            this.dwStyle == other.getDwStyle() &&
            this.dwExStyle == other.getDwExStyle() &&
            this.dwWindowStatus == other.getDwWindowStatus() &&
            this.cxWindowBorders == other.getCxWindowBorders() &&
            this.cyWindowBorders == other.getCyWindowBorders() &&
            this.atomWindowType == other.getAtomWindowType() &&
            this.wCreatorVersion == other.getWCreatorVersion();
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
        if (getRcWindow() != null) {
            _hashCode += getRcWindow().hashCode();
        }
        if (getRcClient() != null) {
            _hashCode += getRcClient().hashCode();
        }
        _hashCode += getDwStyle();
        _hashCode += getDwExStyle();
        _hashCode += getDwWindowStatus();
        _hashCode += getCxWindowBorders();
        _hashCode += getCyWindowBorders();
        _hashCode += getAtomWindowType();
        _hashCode += getWCreatorVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Windowinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "windowinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "rect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "rect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwExStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwExStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwWindowStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwWindowStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cxWindowBorders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cxWindowBorders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cyWindowBorders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cyWindowBorders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomWindowType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atomWindowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WCreatorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wCreatorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
