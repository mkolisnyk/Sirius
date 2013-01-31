/**
 * Rect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Rect extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private int left;

	private int top;

	private int right;

	private int bottom;

	public Rect() {
	}

	public Rect(boolean autoRead, boolean autoWrite, int left, int top,
			int right, int bottom) {
		super(autoRead, autoWrite);
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}

	/**
	 * Gets the left value for this Rect.
	 * 
	 * @return left
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * Sets the left value for this Rect.
	 * 
	 * @param left
	 */
	public void setLeft(int left) {
		this.left = left;
	}

	/**
	 * Gets the top value for this Rect.
	 * 
	 * @return top
	 */
	public int getTop() {
		return top;
	}

	/**
	 * Sets the top value for this Rect.
	 * 
	 * @param top
	 */
	public void setTop(int top) {
		this.top = top;
	}

	/**
	 * Gets the right value for this Rect.
	 * 
	 * @return right
	 */
	public int getRight() {
		return right;
	}

	/**
	 * Sets the right value for this Rect.
	 * 
	 * @param right
	 */
	public void setRight(int right) {
		this.right = right;
	}

	/**
	 * Gets the bottom value for this Rect.
	 * 
	 * @return bottom
	 */
	public int getBottom() {
		return bottom;
	}

	/**
	 * Sets the bottom value for this Rect.
	 * 
	 * @param bottom
	 */
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Rect))
			return false;
		Rect other = (Rect) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj) && this.left == other.getLeft()
				&& this.top == other.getTop() && this.right == other.getRight()
				&& this.bottom == other.getBottom();
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
		_hashCode += getLeft();
		_hashCode += getTop();
		_hashCode += getRight();
		_hashCode += getBottom();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Rect.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://classes.win32.server.sirius.org/", "rect"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("left");
		elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("top");
		elemField.setXmlName(new javax.xml.namespace.QName("", "top"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("right");
		elemField.setXmlName(new javax.xml.namespace.QName("", "right"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bottom");
		elemField.setXmlName(new javax.xml.namespace.QName("", "bottom"));
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
