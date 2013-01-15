/**
 * Filetime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Filetime extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private int dwLowDateTime;

	private int dwHighDateTime;

	public Filetime() {
	}

	public Filetime(boolean autoRead, boolean autoWrite, int dwLowDateTime,
			int dwHighDateTime) {
		super(autoRead, autoWrite);
		this.dwLowDateTime = dwLowDateTime;
		this.dwHighDateTime = dwHighDateTime;
	}

	/**
	 * Gets the dwLowDateTime value for this Filetime.
	 * 
	 * @return dwLowDateTime
	 */
	public int getDwLowDateTime() {
		return dwLowDateTime;
	}

	/**
	 * Sets the dwLowDateTime value for this Filetime.
	 * 
	 * @param dwLowDateTime
	 */
	public void setDwLowDateTime(int dwLowDateTime) {
		this.dwLowDateTime = dwLowDateTime;
	}

	/**
	 * Gets the dwHighDateTime value for this Filetime.
	 * 
	 * @return dwHighDateTime
	 */
	public int getDwHighDateTime() {
		return dwHighDateTime;
	}

	/**
	 * Sets the dwHighDateTime value for this Filetime.
	 * 
	 * @param dwHighDateTime
	 */
	public void setDwHighDateTime(int dwHighDateTime) {
		this.dwHighDateTime = dwHighDateTime;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Filetime))
			return false;
		Filetime other = (Filetime) obj;
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
				&& this.dwLowDateTime == other.getDwLowDateTime()
				&& this.dwHighDateTime == other.getDwHighDateTime();
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
		_hashCode += getDwLowDateTime();
		_hashCode += getDwHighDateTime();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Filetime.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "filetime"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwLowDateTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "dwLowDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwHighDateTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "dwHighDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
