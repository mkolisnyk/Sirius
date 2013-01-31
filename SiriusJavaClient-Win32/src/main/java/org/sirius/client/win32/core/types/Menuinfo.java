/**
 * Menuinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Menuinfo extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private int cbSize;

	private org.sirius.client.win32.core.types.Dword fMask;

	private org.sirius.client.win32.core.types.Dword dwStyle;

	private org.sirius.client.win32.core.types.Uint cyMax;

	private org.sirius.client.win32.core.types.Hbrush hbrBack;

	private org.sirius.client.win32.core.types.Dword dwContextHelpID;

	private org.sirius.client.win32.core.types.UlongPTR dwMenuData;

	public Menuinfo() {
	}

	public Menuinfo(boolean autoRead, boolean autoWrite, int cbSize,
			org.sirius.client.win32.core.types.Dword fMask,
			org.sirius.client.win32.core.types.Dword dwStyle,
			org.sirius.client.win32.core.types.Uint cyMax,
			org.sirius.client.win32.core.types.Hbrush hbrBack,
			org.sirius.client.win32.core.types.Dword dwContextHelpID,
			org.sirius.client.win32.core.types.UlongPTR dwMenuData) {
		super(autoRead, autoWrite);
		this.cbSize = cbSize;
		this.fMask = fMask;
		this.dwStyle = dwStyle;
		this.cyMax = cyMax;
		this.hbrBack = hbrBack;
		this.dwContextHelpID = dwContextHelpID;
		this.dwMenuData = dwMenuData;
	}

	/**
	 * Gets the cbSize value for this Menuinfo.
	 * 
	 * @return cbSize
	 */
	public int getCbSize() {
		return cbSize;
	}

	/**
	 * Sets the cbSize value for this Menuinfo.
	 * 
	 * @param cbSize
	 */
	public void setCbSize(int cbSize) {
		this.cbSize = cbSize;
	}

	/**
	 * Gets the fMask value for this Menuinfo.
	 * 
	 * @return fMask
	 */
	public org.sirius.client.win32.core.types.Dword getFMask() {
		return fMask;
	}

	/**
	 * Sets the fMask value for this Menuinfo.
	 * 
	 * @param fMask
	 */
	public void setFMask(org.sirius.client.win32.core.types.Dword fMask) {
		this.fMask = fMask;
	}

	/**
	 * Gets the dwStyle value for this Menuinfo.
	 * 
	 * @return dwStyle
	 */
	public org.sirius.client.win32.core.types.Dword getDwStyle() {
		return dwStyle;
	}

	/**
	 * Sets the dwStyle value for this Menuinfo.
	 * 
	 * @param dwStyle
	 */
	public void setDwStyle(org.sirius.client.win32.core.types.Dword dwStyle) {
		this.dwStyle = dwStyle;
	}

	/**
	 * Gets the cyMax value for this Menuinfo.
	 * 
	 * @return cyMax
	 */
	public org.sirius.client.win32.core.types.Uint getCyMax() {
		return cyMax;
	}

	/**
	 * Sets the cyMax value for this Menuinfo.
	 * 
	 * @param cyMax
	 */
	public void setCyMax(org.sirius.client.win32.core.types.Uint cyMax) {
		this.cyMax = cyMax;
	}

	/**
	 * Gets the hbrBack value for this Menuinfo.
	 * 
	 * @return hbrBack
	 */
	public org.sirius.client.win32.core.types.Hbrush getHbrBack() {
		return hbrBack;
	}

	/**
	 * Sets the hbrBack value for this Menuinfo.
	 * 
	 * @param hbrBack
	 */
	public void setHbrBack(org.sirius.client.win32.core.types.Hbrush hbrBack) {
		this.hbrBack = hbrBack;
	}

	/**
	 * Gets the dwContextHelpID value for this Menuinfo.
	 * 
	 * @return dwContextHelpID
	 */
	public org.sirius.client.win32.core.types.Dword getDwContextHelpID() {
		return dwContextHelpID;
	}

	/**
	 * Sets the dwContextHelpID value for this Menuinfo.
	 * 
	 * @param dwContextHelpID
	 */
	public void setDwContextHelpID(
			org.sirius.client.win32.core.types.Dword dwContextHelpID) {
		this.dwContextHelpID = dwContextHelpID;
	}

	/**
	 * Gets the dwMenuData value for this Menuinfo.
	 * 
	 * @return dwMenuData
	 */
	public org.sirius.client.win32.core.types.UlongPTR getDwMenuData() {
		return dwMenuData;
	}

	/**
	 * Sets the dwMenuData value for this Menuinfo.
	 * 
	 * @param dwMenuData
	 */
	public void setDwMenuData(
			org.sirius.client.win32.core.types.UlongPTR dwMenuData) {
		this.dwMenuData = dwMenuData;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Menuinfo))
			return false;
		Menuinfo other = (Menuinfo) obj;
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
				&& this.cbSize == other.getCbSize()
				&& ((this.fMask == null && other.getFMask() == null) || (this.fMask != null && this.fMask
						.equals(other.getFMask())))
				&& ((this.dwStyle == null && other.getDwStyle() == null) || (this.dwStyle != null && this.dwStyle
						.equals(other.getDwStyle())))
				&& ((this.cyMax == null && other.getCyMax() == null) || (this.cyMax != null && this.cyMax
						.equals(other.getCyMax())))
				&& ((this.hbrBack == null && other.getHbrBack() == null) || (this.hbrBack != null && this.hbrBack
						.equals(other.getHbrBack())))
				&& ((this.dwContextHelpID == null && other.getDwContextHelpID() == null) || (this.dwContextHelpID != null && this.dwContextHelpID
						.equals(other.getDwContextHelpID())))
				&& ((this.dwMenuData == null && other.getDwMenuData() == null) || (this.dwMenuData != null && this.dwMenuData
						.equals(other.getDwMenuData())));
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
		if (getDwStyle() != null) {
			_hashCode += getDwStyle().hashCode();
		}
		if (getCyMax() != null) {
			_hashCode += getCyMax().hashCode();
		}
		if (getHbrBack() != null) {
			_hashCode += getHbrBack().hashCode();
		}
		if (getDwContextHelpID() != null) {
			_hashCode += getDwContextHelpID().hashCode();
		}
		if (getDwMenuData() != null) {
			_hashCode += getDwMenuData().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Menuinfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "menuinfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cbSize");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FMask");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwStyle");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwStyle"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cyMax");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cyMax"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "uint"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hbrBack");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hbrBack"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "hbrush"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwContextHelpID");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"dwContextHelpID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwMenuData");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwMenuData"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "ulongPTR"));
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
