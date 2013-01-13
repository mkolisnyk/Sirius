/**
 * Size.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class Size extends org.sirius.client.win32.core.user32.Structure
		implements java.io.Serializable {
	private int cx;

	private int cy;

	public Size() {
	}

	public Size(boolean autoRead, boolean autoWrite, int cx, int cy) {
		super(autoRead, autoWrite);
		this.cx = cx;
		this.cy = cy;
	}

	/**
	 * Gets the cx value for this Size.
	 * 
	 * @return cx
	 */
	public int getCx() {
		return cx;
	}

	/**
	 * Sets the cx value for this Size.
	 * 
	 * @param cx
	 */
	public void setCx(int cx) {
		this.cx = cx;
	}

	/**
	 * Gets the cy value for this Size.
	 * 
	 * @return cy
	 */
	public int getCy() {
		return cy;
	}

	/**
	 * Sets the cy value for this Size.
	 * 
	 * @param cy
	 */
	public void setCy(int cy) {
		this.cy = cy;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Size))
			return false;
		Size other = (Size) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj) && this.cx == other.getCx()
				&& this.cy == other.getCy();
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
		_hashCode += getCx();
		_hashCode += getCy();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Size.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "size"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cx");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cx"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cy");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cy"));
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
