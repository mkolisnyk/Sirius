/**
 * Lastinputinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class Lastinputinfo extends
		org.sirius.client.win32.core.user32.Structure implements
		java.io.Serializable {
	private int cbSize;

	private int dwTime;

	public Lastinputinfo() {
	}

	public Lastinputinfo(boolean autoRead, boolean autoWrite, int cbSize,
			int dwTime) {
		super(autoRead, autoWrite);
		this.cbSize = cbSize;
		this.dwTime = dwTime;
	}

	/**
	 * Gets the cbSize value for this Lastinputinfo.
	 * 
	 * @return cbSize
	 */
	public int getCbSize() {
		return cbSize;
	}

	/**
	 * Sets the cbSize value for this Lastinputinfo.
	 * 
	 * @param cbSize
	 */
	public void setCbSize(int cbSize) {
		this.cbSize = cbSize;
	}

	/**
	 * Gets the dwTime value for this Lastinputinfo.
	 * 
	 * @return dwTime
	 */
	public int getDwTime() {
		return dwTime;
	}

	/**
	 * Sets the dwTime value for this Lastinputinfo.
	 * 
	 * @param dwTime
	 */
	public void setDwTime(int dwTime) {
		this.dwTime = dwTime;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Lastinputinfo))
			return false;
		Lastinputinfo other = (Lastinputinfo) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj) && this.cbSize == other.getCbSize()
				&& this.dwTime == other.getDwTime();
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
		_hashCode += getDwTime();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Lastinputinfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "lastinputinfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cbSize");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cbSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwTime");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwTime"));
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
