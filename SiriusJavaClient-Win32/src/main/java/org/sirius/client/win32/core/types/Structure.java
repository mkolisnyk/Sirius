/**
 * Structure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public abstract class Structure implements java.io.Serializable {
	private boolean autoRead;

	private boolean autoWrite;

	public Structure() {
	}

	public Structure(boolean autoRead, boolean autoWrite) {
		this.autoRead = autoRead;
		this.autoWrite = autoWrite;
	}

	/**
	 * Gets the autoRead value for this Structure.
	 * 
	 * @return autoRead
	 */
	public boolean isAutoRead() {
		return autoRead;
	}

	/**
	 * Sets the autoRead value for this Structure.
	 * 
	 * @param autoRead
	 */
	public void setAutoRead(boolean autoRead) {
		this.autoRead = autoRead;
	}

	/**
	 * Gets the autoWrite value for this Structure.
	 * 
	 * @return autoWrite
	 */
	public boolean isAutoWrite() {
		return autoWrite;
	}

	/**
	 * Sets the autoWrite value for this Structure.
	 * 
	 * @param autoWrite
	 */
	public void setAutoWrite(boolean autoWrite) {
		this.autoWrite = autoWrite;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Structure))
			return false;
		Structure other = (Structure) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.autoRead == other.isAutoRead()
				&& this.autoWrite == other.isAutoWrite();
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
		_hashCode += (isAutoRead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isAutoWrite() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Structure.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "structure"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoRead");
		elemField.setXmlName(new javax.xml.namespace.QName("", "autoRead"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoWrite");
		elemField.setXmlName(new javax.xml.namespace.QName("", "autoWrite"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
