/**
 * Menuiteminfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Menuiteminfo  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private int cbSize;

    private org.sirius.client.win32.core.types.Uint fMask;

    private org.sirius.client.win32.core.types.Uint fType;

    private org.sirius.client.win32.core.types.Uint fState;

    private org.sirius.client.win32.core.types.Uint wID;

    private org.sirius.client.win32.core.types.Hmenu hSubMenu;

    private org.sirius.client.win32.core.types.Hbitmap hbmpChecked;

    private org.sirius.client.win32.core.types.Hbitmap hbmpUnchecked;

    private org.sirius.client.win32.core.types.UlongPTR dwItemData;

    private java.lang.String dwTypeData;

    private org.sirius.client.win32.core.types.Uint cch;

    private org.sirius.client.win32.core.types.Hbitmap hbmpItem;

    public Menuiteminfo() {
    }

    public Menuiteminfo(
           boolean autoRead,
           boolean autoWrite,
           int cbSize,
           org.sirius.client.win32.core.types.Uint fMask,
           org.sirius.client.win32.core.types.Uint fType,
           org.sirius.client.win32.core.types.Uint fState,
           org.sirius.client.win32.core.types.Uint wID,
           org.sirius.client.win32.core.types.Hmenu hSubMenu,
           org.sirius.client.win32.core.types.Hbitmap hbmpChecked,
           org.sirius.client.win32.core.types.Hbitmap hbmpUnchecked,
           org.sirius.client.win32.core.types.UlongPTR dwItemData,
           java.lang.String dwTypeData,
           org.sirius.client.win32.core.types.Uint cch,
           org.sirius.client.win32.core.types.Hbitmap hbmpItem) {
        super(
            autoRead,
            autoWrite);
        this.cbSize = cbSize;
        this.fMask = fMask;
        this.fType = fType;
        this.fState = fState;
        this.wID = wID;
        this.hSubMenu = hSubMenu;
        this.hbmpChecked = hbmpChecked;
        this.hbmpUnchecked = hbmpUnchecked;
        this.dwItemData = dwItemData;
        this.dwTypeData = dwTypeData;
        this.cch = cch;
        this.hbmpItem = hbmpItem;
    }


    /**
     * Gets the cbSize value for this Menuiteminfo.
     * 
     * @return cbSize
     */
    public int getCbSize() {
        return cbSize;
    }


    /**
     * Sets the cbSize value for this Menuiteminfo.
     * 
     * @param cbSize
     */
    public void setCbSize(int cbSize) {
        this.cbSize = cbSize;
    }


    /**
     * Gets the fMask value for this Menuiteminfo.
     * 
     * @return fMask
     */
    public org.sirius.client.win32.core.types.Uint getFMask() {
        return fMask;
    }


    /**
     * Sets the fMask value for this Menuiteminfo.
     * 
     * @param fMask
     */
    public void setFMask(org.sirius.client.win32.core.types.Uint fMask) {
        this.fMask = fMask;
    }


    /**
     * Gets the fType value for this Menuiteminfo.
     * 
     * @return fType
     */
    public org.sirius.client.win32.core.types.Uint getFType() {
        return fType;
    }


    /**
     * Sets the fType value for this Menuiteminfo.
     * 
     * @param fType
     */
    public void setFType(org.sirius.client.win32.core.types.Uint fType) {
        this.fType = fType;
    }


    /**
     * Gets the fState value for this Menuiteminfo.
     * 
     * @return fState
     */
    public org.sirius.client.win32.core.types.Uint getFState() {
        return fState;
    }


    /**
     * Sets the fState value for this Menuiteminfo.
     * 
     * @param fState
     */
    public void setFState(org.sirius.client.win32.core.types.Uint fState) {
        this.fState = fState;
    }


    /**
     * Gets the wID value for this Menuiteminfo.
     * 
     * @return wID
     */
    public org.sirius.client.win32.core.types.Uint getWID() {
        return wID;
    }


    /**
     * Sets the wID value for this Menuiteminfo.
     * 
     * @param wID
     */
    public void setWID(org.sirius.client.win32.core.types.Uint wID) {
        this.wID = wID;
    }


    /**
     * Gets the hSubMenu value for this Menuiteminfo.
     * 
     * @return hSubMenu
     */
    public org.sirius.client.win32.core.types.Hmenu getHSubMenu() {
        return hSubMenu;
    }


    /**
     * Sets the hSubMenu value for this Menuiteminfo.
     * 
     * @param hSubMenu
     */
    public void setHSubMenu(org.sirius.client.win32.core.types.Hmenu hSubMenu) {
        this.hSubMenu = hSubMenu;
    }


    /**
     * Gets the hbmpChecked value for this Menuiteminfo.
     * 
     * @return hbmpChecked
     */
    public org.sirius.client.win32.core.types.Hbitmap getHbmpChecked() {
        return hbmpChecked;
    }


    /**
     * Sets the hbmpChecked value for this Menuiteminfo.
     * 
     * @param hbmpChecked
     */
    public void setHbmpChecked(org.sirius.client.win32.core.types.Hbitmap hbmpChecked) {
        this.hbmpChecked = hbmpChecked;
    }


    /**
     * Gets the hbmpUnchecked value for this Menuiteminfo.
     * 
     * @return hbmpUnchecked
     */
    public org.sirius.client.win32.core.types.Hbitmap getHbmpUnchecked() {
        return hbmpUnchecked;
    }


    /**
     * Sets the hbmpUnchecked value for this Menuiteminfo.
     * 
     * @param hbmpUnchecked
     */
    public void setHbmpUnchecked(org.sirius.client.win32.core.types.Hbitmap hbmpUnchecked) {
        this.hbmpUnchecked = hbmpUnchecked;
    }


    /**
     * Gets the dwItemData value for this Menuiteminfo.
     * 
     * @return dwItemData
     */
    public org.sirius.client.win32.core.types.UlongPTR getDwItemData() {
        return dwItemData;
    }


    /**
     * Sets the dwItemData value for this Menuiteminfo.
     * 
     * @param dwItemData
     */
    public void setDwItemData(org.sirius.client.win32.core.types.UlongPTR dwItemData) {
        this.dwItemData = dwItemData;
    }


    /**
     * Gets the dwTypeData value for this Menuiteminfo.
     * 
     * @return dwTypeData
     */
    public java.lang.String getDwTypeData() {
        return dwTypeData;
    }


    /**
     * Sets the dwTypeData value for this Menuiteminfo.
     * 
     * @param dwTypeData
     */
    public void setDwTypeData(java.lang.String dwTypeData) {
        this.dwTypeData = dwTypeData;
    }


    /**
     * Gets the cch value for this Menuiteminfo.
     * 
     * @return cch
     */
    public org.sirius.client.win32.core.types.Uint getCch() {
        return cch;
    }


    /**
     * Sets the cch value for this Menuiteminfo.
     * 
     * @param cch
     */
    public void setCch(org.sirius.client.win32.core.types.Uint cch) {
        this.cch = cch;
    }


    /**
     * Gets the hbmpItem value for this Menuiteminfo.
     * 
     * @return hbmpItem
     */
    public org.sirius.client.win32.core.types.Hbitmap getHbmpItem() {
        return hbmpItem;
    }


    /**
     * Sets the hbmpItem value for this Menuiteminfo.
     * 
     * @param hbmpItem
     */
    public void setHbmpItem(org.sirius.client.win32.core.types.Hbitmap hbmpItem) {
        this.hbmpItem = hbmpItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menuiteminfo)) return false;
        Menuiteminfo other = (Menuiteminfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cbSize == other.getCbSize() &&
            ((this.fMask==null && other.getFMask()==null) || 
             (this.fMask!=null &&
              this.fMask.equals(other.getFMask()))) &&
            ((this.fType==null && other.getFType()==null) || 
             (this.fType!=null &&
              this.fType.equals(other.getFType()))) &&
            ((this.fState==null && other.getFState()==null) || 
             (this.fState!=null &&
              this.fState.equals(other.getFState()))) &&
            ((this.wID==null && other.getWID()==null) || 
             (this.wID!=null &&
              this.wID.equals(other.getWID()))) &&
            ((this.hSubMenu==null && other.getHSubMenu()==null) || 
             (this.hSubMenu!=null &&
              this.hSubMenu.equals(other.getHSubMenu()))) &&
            ((this.hbmpChecked==null && other.getHbmpChecked()==null) || 
             (this.hbmpChecked!=null &&
              this.hbmpChecked.equals(other.getHbmpChecked()))) &&
            ((this.hbmpUnchecked==null && other.getHbmpUnchecked()==null) || 
             (this.hbmpUnchecked!=null &&
              this.hbmpUnchecked.equals(other.getHbmpUnchecked()))) &&
            ((this.dwItemData==null && other.getDwItemData()==null) || 
             (this.dwItemData!=null &&
              this.dwItemData.equals(other.getDwItemData()))) &&
            ((this.dwTypeData==null && other.getDwTypeData()==null) || 
             (this.dwTypeData!=null &&
              this.dwTypeData.equals(other.getDwTypeData()))) &&
            ((this.cch==null && other.getCch()==null) || 
             (this.cch!=null &&
              this.cch.equals(other.getCch()))) &&
            ((this.hbmpItem==null && other.getHbmpItem()==null) || 
             (this.hbmpItem!=null &&
              this.hbmpItem.equals(other.getHbmpItem())));
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
        if (getFMask() != null) {
            _hashCode += getFMask().hashCode();
        }
        if (getFType() != null) {
            _hashCode += getFType().hashCode();
        }
        if (getFState() != null) {
            _hashCode += getFState().hashCode();
        }
        if (getWID() != null) {
            _hashCode += getWID().hashCode();
        }
        if (getHSubMenu() != null) {
            _hashCode += getHSubMenu().hashCode();
        }
        if (getHbmpChecked() != null) {
            _hashCode += getHbmpChecked().hashCode();
        }
        if (getHbmpUnchecked() != null) {
            _hashCode += getHbmpUnchecked().hashCode();
        }
        if (getDwItemData() != null) {
            _hashCode += getDwItemData().hashCode();
        }
        if (getDwTypeData() != null) {
            _hashCode += getDwTypeData().hashCode();
        }
        if (getCch() != null) {
            _hashCode += getCch().hashCode();
        }
        if (getHbmpItem() != null) {
            _hashCode += getHbmpItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Menuiteminfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "menuiteminfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "uint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "uint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "uint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "uint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSubMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hSubMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "hmenu"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbmpChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hbmpChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "hbitmap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbmpUnchecked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hbmpUnchecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "hbitmap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "ulongPTR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwTypeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwTypeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "uint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbmpItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hbmpItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://classes.win32.server.sirius.org/", "hbitmap"));
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
