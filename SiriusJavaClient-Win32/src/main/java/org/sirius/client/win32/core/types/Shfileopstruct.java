/**
 * Shfileopstruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Shfileopstruct extends
		org.sirius.client.win32.core.types.Structure implements
		java.io.Serializable {
	private org.sirius.client.win32.core.types.Handle hwnd;

	private int wFunc;

	private org.sirius.client.win32.core.types.WString pFrom;

	private org.sirius.client.win32.core.types.WString pTo;

	private short fFlags;

	private boolean fAnyOperationsAborted;

	private org.sirius.client.win32.core.types.Pointer pNameMappings;

	private org.sirius.client.win32.core.types.WString lpszProgressTitle;

	public Shfileopstruct() {
	}

	public Shfileopstruct(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.types.Handle hwnd, int wFunc,
			org.sirius.client.win32.core.types.WString pFrom,
			org.sirius.client.win32.core.types.WString pTo, short fFlags,
			boolean fAnyOperationsAborted,
			org.sirius.client.win32.core.types.Pointer pNameMappings,
			org.sirius.client.win32.core.types.WString lpszProgressTitle) {
		super(autoRead, autoWrite);
		this.hwnd = hwnd;
		this.wFunc = wFunc;
		this.pFrom = pFrom;
		this.pTo = pTo;
		this.fFlags = fFlags;
		this.fAnyOperationsAborted = fAnyOperationsAborted;
		this.pNameMappings = pNameMappings;
		this.lpszProgressTitle = lpszProgressTitle;
	}

	/**
	 * Gets the hwnd value for this Shfileopstruct.
	 * 
	 * @return hwnd
	 */
	public org.sirius.client.win32.core.types.Handle getHwnd() {
		return hwnd;
	}

	/**
	 * Sets the hwnd value for this Shfileopstruct.
	 * 
	 * @param hwnd
	 */
	public void setHwnd(org.sirius.client.win32.core.types.Handle hwnd) {
		this.hwnd = hwnd;
	}

	/**
	 * Gets the wFunc value for this Shfileopstruct.
	 * 
	 * @return wFunc
	 */
	public int getWFunc() {
		return wFunc;
	}

	/**
	 * Sets the wFunc value for this Shfileopstruct.
	 * 
	 * @param wFunc
	 */
	public void setWFunc(int wFunc) {
		this.wFunc = wFunc;
	}

	/**
	 * Gets the pFrom value for this Shfileopstruct.
	 * 
	 * @return pFrom
	 */
	public org.sirius.client.win32.core.types.WString getPFrom() {
		return pFrom;
	}

	/**
	 * Sets the pFrom value for this Shfileopstruct.
	 * 
	 * @param pFrom
	 */
	public void setPFrom(org.sirius.client.win32.core.types.WString pFrom) {
		this.pFrom = pFrom;
	}

	/**
	 * Gets the pTo value for this Shfileopstruct.
	 * 
	 * @return pTo
	 */
	public org.sirius.client.win32.core.types.WString getPTo() {
		return pTo;
	}

	/**
	 * Sets the pTo value for this Shfileopstruct.
	 * 
	 * @param pTo
	 */
	public void setPTo(org.sirius.client.win32.core.types.WString pTo) {
		this.pTo = pTo;
	}

	/**
	 * Gets the fFlags value for this Shfileopstruct.
	 * 
	 * @return fFlags
	 */
	public short getFFlags() {
		return fFlags;
	}

	/**
	 * Sets the fFlags value for this Shfileopstruct.
	 * 
	 * @param fFlags
	 */
	public void setFFlags(short fFlags) {
		this.fFlags = fFlags;
	}

	/**
	 * Gets the fAnyOperationsAborted value for this Shfileopstruct.
	 * 
	 * @return fAnyOperationsAborted
	 */
	public boolean isFAnyOperationsAborted() {
		return fAnyOperationsAborted;
	}

	/**
	 * Sets the fAnyOperationsAborted value for this Shfileopstruct.
	 * 
	 * @param fAnyOperationsAborted
	 */
	public void setFAnyOperationsAborted(boolean fAnyOperationsAborted) {
		this.fAnyOperationsAborted = fAnyOperationsAborted;
	}

	/**
	 * Gets the pNameMappings value for this Shfileopstruct.
	 * 
	 * @return pNameMappings
	 */
	public org.sirius.client.win32.core.types.Pointer getPNameMappings() {
		return pNameMappings;
	}

	/**
	 * Sets the pNameMappings value for this Shfileopstruct.
	 * 
	 * @param pNameMappings
	 */
	public void setPNameMappings(
			org.sirius.client.win32.core.types.Pointer pNameMappings) {
		this.pNameMappings = pNameMappings;
	}

	/**
	 * Gets the lpszProgressTitle value for this Shfileopstruct.
	 * 
	 * @return lpszProgressTitle
	 */
	public org.sirius.client.win32.core.types.WString getLpszProgressTitle() {
		return lpszProgressTitle;
	}

	/**
	 * Sets the lpszProgressTitle value for this Shfileopstruct.
	 * 
	 * @param lpszProgressTitle
	 */
	public void setLpszProgressTitle(
			org.sirius.client.win32.core.types.WString lpszProgressTitle) {
		this.lpszProgressTitle = lpszProgressTitle;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Shfileopstruct))
			return false;
		Shfileopstruct other = (Shfileopstruct) obj;
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
				&& ((this.hwnd == null && other.getHwnd() == null) || (this.hwnd != null && this.hwnd
						.equals(other.getHwnd())))
				&& this.wFunc == other.getWFunc()
				&& ((this.pFrom == null && other.getPFrom() == null) || (this.pFrom != null && this.pFrom
						.equals(other.getPFrom())))
				&& ((this.pTo == null && other.getPTo() == null) || (this.pTo != null && this.pTo
						.equals(other.getPTo())))
				&& this.fFlags == other.getFFlags()
				&& this.fAnyOperationsAborted == other
						.isFAnyOperationsAborted()
				&& ((this.pNameMappings == null && other.getPNameMappings() == null) || (this.pNameMappings != null && this.pNameMappings
						.equals(other.getPNameMappings())))
				&& ((this.lpszProgressTitle == null && other
						.getLpszProgressTitle() == null) || (this.lpszProgressTitle != null && this.lpszProgressTitle
						.equals(other.getLpszProgressTitle())));
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
		if (getHwnd() != null) {
			_hashCode += getHwnd().hashCode();
		}
		_hashCode += getWFunc();
		if (getPFrom() != null) {
			_hashCode += getPFrom().hashCode();
		}
		if (getPTo() != null) {
			_hashCode += getPTo().hashCode();
		}
		_hashCode += getFFlags();
		_hashCode += (isFAnyOperationsAborted() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getPNameMappings() != null) {
			_hashCode += getPNameMappings().hashCode();
		}
		if (getLpszProgressTitle() != null) {
			_hashCode += getLpszProgressTitle().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Shfileopstruct.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "shfileopstruct"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hwnd");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hwnd"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "handle"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WFunc");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wFunc"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("PFrom");
		elemField.setXmlName(new javax.xml.namespace.QName("", "pFrom"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "wString"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("PTo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "pTo"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "wString"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FFlags");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fFlags"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("FAnyOperationsAborted");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"fAnyOperationsAborted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("PNameMappings");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "pNameMappings"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "pointer"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lpszProgressTitle");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"lpszProgressTitle"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "wString"));
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
