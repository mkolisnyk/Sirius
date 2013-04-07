/**
 * TcITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.tabcontrol;

public class TcITEM extends org.sirius.client.win32.core.types.Structure
        implements java.io.Serializable {
    private int                                       mask;

    private int                                       dwState;

    private int                                       dwStateMask;

    private org.apache.axis.types.UnsignedShort[]     pszText;

    private int                                       cchTextMax;

    private int                                       iImage;

    private org.sirius.client.win32.core.types.Lparam lParam;

    public TcITEM() {
    }

    public TcITEM(boolean autoRead, boolean autoWrite, int mask, int dwState,
            int dwStateMask, org.apache.axis.types.UnsignedShort[] pszText,
            int cchTextMax, int iImage,
            org.sirius.client.win32.core.types.Lparam lParam) {
        super(autoRead, autoWrite);
        this.mask = mask;
        this.dwState = dwState;
        this.dwStateMask = dwStateMask;
        this.pszText = pszText;
        this.cchTextMax = cchTextMax;
        this.iImage = iImage;
        this.lParam = lParam;
    }

    /**
     * Gets the mask value for this TcITEM.
     * 
     * @return mask
     */
    public int getMask() {
        return mask;
    }

    /**
     * Sets the mask value for this TcITEM.
     * 
     * @param mask
     */
    public void setMask(int mask) {
        this.mask = mask;
    }

    /**
     * Gets the dwState value for this TcITEM.
     * 
     * @return dwState
     */
    public int getDwState() {
        return dwState;
    }

    /**
     * Sets the dwState value for this TcITEM.
     * 
     * @param dwState
     */
    public void setDwState(int dwState) {
        this.dwState = dwState;
    }

    /**
     * Gets the dwStateMask value for this TcITEM.
     * 
     * @return dwStateMask
     */
    public int getDwStateMask() {
        return dwStateMask;
    }

    /**
     * Sets the dwStateMask value for this TcITEM.
     * 
     * @param dwStateMask
     */
    public void setDwStateMask(int dwStateMask) {
        this.dwStateMask = dwStateMask;
    }

    /**
     * Gets the pszText value for this TcITEM.
     * 
     * @return pszText
     */
    public org.apache.axis.types.UnsignedShort[] getPszText() {
        return pszText;
    }

    /**
     * Sets the pszText value for this TcITEM.
     * 
     * @param pszText
     */
    public void setPszText(org.apache.axis.types.UnsignedShort[] pszText) {
        this.pszText = pszText;
    }

    public org.apache.axis.types.UnsignedShort getPszText(int i) {
        return this.pszText[i];
    }

    public void setPszText(int i, org.apache.axis.types.UnsignedShort _value) {
        this.pszText[i] = _value;
    }

    /**
     * Gets the cchTextMax value for this TcITEM.
     * 
     * @return cchTextMax
     */
    public int getCchTextMax() {
        return cchTextMax;
    }

    /**
     * Sets the cchTextMax value for this TcITEM.
     * 
     * @param cchTextMax
     */
    public void setCchTextMax(int cchTextMax) {
        this.cchTextMax = cchTextMax;
    }

    /**
     * Gets the iImage value for this TcITEM.
     * 
     * @return iImage
     */
    public int getIImage() {
        return iImage;
    }

    /**
     * Sets the iImage value for this TcITEM.
     * 
     * @param iImage
     */
    public void setIImage(int iImage) {
        this.iImage = iImage;
    }

    /**
     * Gets the lParam value for this TcITEM.
     * 
     * @return lParam
     */
    public org.sirius.client.win32.core.types.Lparam getLParam() {
        return lParam;
    }

    /**
     * Sets the lParam value for this TcITEM.
     * 
     * @param lParam
     */
    public void setLParam(org.sirius.client.win32.core.types.Lparam lParam) {
        this.lParam = lParam;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TcITEM))
            return false;
        TcITEM other = (TcITEM) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj)
                && this.mask == other.getMask()
                && this.dwState == other.getDwState()
                && this.dwStateMask == other.getDwStateMask()
                && ((this.pszText == null && other.getPszText() == null) || (this.pszText != null && java.util.Arrays
                        .equals(this.pszText, other.getPszText())))
                && this.cchTextMax == other.getCchTextMax()
                && this.iImage == other.getIImage()
                && ((this.lParam == null && other.getLParam() == null) || (this.lParam != null && this.lParam
                        .equals(other.getLParam())));
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
        _hashCode += getMask();
        _hashCode += getDwState();
        _hashCode += getDwStateMask();
        if (getPszText() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getPszText()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(
                        getPszText(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCchTextMax();
        _hashCode += getIImage();
        if (getLParam() != null) {
            _hashCode += getLParam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
                                                                         TcITEM.class,
                                                                         true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "tcITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mask"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwState"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwStateMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwStateMask"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pszText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pszText"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cchTextMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cchTextMax"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iImage"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lParam"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "lparam"));
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
            java.lang.String mechType, java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
                _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType, java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
                _xmlType, typeDesc);
    }

}
