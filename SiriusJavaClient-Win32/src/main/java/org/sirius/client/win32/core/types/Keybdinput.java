/**
 * Keybdinput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Keybdinput extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private org.sirius.client.win32.core.types.Word wVk;

	private org.sirius.client.win32.core.types.Word wScan;

	private org.sirius.client.win32.core.types.Dword dwFlags;

	private org.sirius.client.win32.core.types.Dword time;

	private org.sirius.client.win32.core.types.UlongPTR dwExtraInfo;

	public Keybdinput() {
	}

	public Keybdinput(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.types.Word wVk,
			org.sirius.client.win32.core.types.Word wScan,
			org.sirius.client.win32.core.types.Dword dwFlags,
			org.sirius.client.win32.core.types.Dword time,
			org.sirius.client.win32.core.types.UlongPTR dwExtraInfo) {
		super(autoRead, autoWrite);
		this.wVk = wVk;
		this.wScan = wScan;
		this.dwFlags = dwFlags;
		this.time = time;
		this.dwExtraInfo = dwExtraInfo;
	}

	/**
	 * Gets the wVk value for this Keybdinput.
	 * 
	 * @return wVk
	 */
	public org.sirius.client.win32.core.types.Word getWVk() {
		return wVk;
	}

	/**
	 * Sets the wVk value for this Keybdinput.
	 * 
	 * @param wVk
	 */
	public void setWVk(org.sirius.client.win32.core.types.Word wVk) {
		this.wVk = wVk;
	}

	/**
	 * Gets the wScan value for this Keybdinput.
	 * 
	 * @return wScan
	 */
	public org.sirius.client.win32.core.types.Word getWScan() {
		return wScan;
	}

	/**
	 * Sets the wScan value for this Keybdinput.
	 * 
	 * @param wScan
	 */
	public void setWScan(org.sirius.client.win32.core.types.Word wScan) {
		this.wScan = wScan;
	}

	/**
	 * Gets the dwFlags value for this Keybdinput.
	 * 
	 * @return dwFlags
	 */
	public org.sirius.client.win32.core.types.Dword getDwFlags() {
		return dwFlags;
	}

	/**
	 * Sets the dwFlags value for this Keybdinput.
	 * 
	 * @param dwFlags
	 */
	public void setDwFlags(org.sirius.client.win32.core.types.Dword dwFlags) {
		this.dwFlags = dwFlags;
	}

	/**
	 * Gets the time value for this Keybdinput.
	 * 
	 * @return time
	 */
	public org.sirius.client.win32.core.types.Dword getTime() {
		return time;
	}

	/**
	 * Sets the time value for this Keybdinput.
	 * 
	 * @param time
	 */
	public void setTime(org.sirius.client.win32.core.types.Dword time) {
		this.time = time;
	}

	/**
	 * Gets the dwExtraInfo value for this Keybdinput.
	 * 
	 * @return dwExtraInfo
	 */
	public org.sirius.client.win32.core.types.UlongPTR getDwExtraInfo() {
		return dwExtraInfo;
	}

	/**
	 * Sets the dwExtraInfo value for this Keybdinput.
	 * 
	 * @param dwExtraInfo
	 */
	public void setDwExtraInfo(
			org.sirius.client.win32.core.types.UlongPTR dwExtraInfo) {
		this.dwExtraInfo = dwExtraInfo;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Keybdinput))
			return false;
		Keybdinput other = (Keybdinput) obj;
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
				&& ((this.wVk == null && other.getWVk() == null) || (this.wVk != null && this.wVk
						.equals(other.getWVk())))
				&& ((this.wScan == null && other.getWScan() == null) || (this.wScan != null && this.wScan
						.equals(other.getWScan())))
				&& ((this.dwFlags == null && other.getDwFlags() == null) || (this.dwFlags != null && this.dwFlags
						.equals(other.getDwFlags())))
				&& ((this.time == null && other.getTime() == null) || (this.time != null && this.time
						.equals(other.getTime())))
				&& ((this.dwExtraInfo == null && other.getDwExtraInfo() == null) || (this.dwExtraInfo != null && this.dwExtraInfo
						.equals(other.getDwExtraInfo())));
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
		if (getWVk() != null) {
			_hashCode += getWVk().hashCode();
		}
		if (getWScan() != null) {
			_hashCode += getWScan().hashCode();
		}
		if (getDwFlags() != null) {
			_hashCode += getDwFlags().hashCode();
		}
		if (getTime() != null) {
			_hashCode += getTime().hashCode();
		}
		if (getDwExtraInfo() != null) {
			_hashCode += getDwExtraInfo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Keybdinput.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "keybdinput"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WVk");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wVk"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "word"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WScan");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wScan"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "word"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwFlags");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwFlags"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time");
		elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwExtraInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwExtraInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "ulongPTR"));
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
