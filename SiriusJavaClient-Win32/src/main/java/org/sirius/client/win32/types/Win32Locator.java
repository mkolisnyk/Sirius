/**
 * Win32Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.types;

import org.sirius.client.win32.core.types.Hwnd;

public class Win32Locator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8514140492560847736L;

	private java.lang.String caption;

	private org.sirius.client.win32.core.types.Hwnd hwnd;

	private int index;

	private org.sirius.client.win32.core.types.Hwnd parent;

	private java.lang.String winClass;

	public Win32Locator() {
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(Hwnd parent, String wndClass, int index) {
		this(parent, wndClass, "(.*)", index);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(Hwnd parent, String caption) {
		this(parent, "(.*)", caption);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(Hwnd parent, String winClass, String caption) {
		this(parent, winClass, caption, 0);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(String wndClass, int index) {
		this(null, wndClass, "(.*)", index);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(String caption) {
		this("(.*)", caption);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(String winClass, String caption) {
		this(null, winClass, caption, 0);
	}

	/**
	 * @param caption
	 * @param index
	 * @param winClass
	 */
	public Win32Locator(String winClass, String caption, int index) {
		this(null, winClass, caption, index);
	}

	/**
	 * @param caption
	 * @param index
	 * @param parent
	 * @param winClass
	 */
	public Win32Locator(Hwnd parent, String winClass, String caption, int index) {
		super();
		this.caption = caption;
		this.index = index;
		this.parent = parent;
		this.winClass = winClass;
	}

	/**
	 * Gets the caption value for this Win32Locator.
	 * 
	 * @return caption
	 */
	public java.lang.String getCaption() {
		return caption;
	}

	/**
	 * Sets the caption value for this Win32Locator.
	 * 
	 * @param caption
	 */
	public void setCaption(java.lang.String caption) {
		this.caption = caption;
	}

	/**
	 * Gets the hwnd value for this Win32Locator.
	 * 
	 * @return hwnd
	 */
	public org.sirius.client.win32.core.types.Hwnd getHwnd() {
		return hwnd;
	}

	/**
	 * Sets the hwnd value for this Win32Locator.
	 * 
	 * @param hwnd
	 */
	public void setHwnd(org.sirius.client.win32.core.types.Hwnd hwnd) {
		this.hwnd = hwnd;
	}

	/**
	 * Gets the index value for this Win32Locator.
	 * 
	 * @return index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index value for this Win32Locator.
	 * 
	 * @param index
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Gets the parent value for this Win32Locator.
	 * 
	 * @return parent
	 */
	public org.sirius.client.win32.core.types.Hwnd getParent() {
		return parent;
	}

	/**
	 * Sets the parent value for this Win32Locator.
	 * 
	 * @param parent
	 */
	public void setParent(org.sirius.client.win32.core.types.Hwnd parent) {
		this.parent = parent;
	}

	/**
	 * Gets the winClass value for this Win32Locator.
	 * 
	 * @return winClass
	 */
	public java.lang.String getWinClass() {
		return winClass;
	}

	/**
	 * Sets the winClass value for this Win32Locator.
	 * 
	 * @param winClass
	 */
	public void setWinClass(java.lang.String winClass) {
		this.winClass = winClass;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Win32Locator))
			return false;
		Win32Locator other = (Win32Locator) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.caption == null && other.getCaption() == null) || (this.caption != null && this.caption
						.equals(other.getCaption())))
				&& ((this.hwnd == null && other.getHwnd() == null) || (this.hwnd != null && this.hwnd
						.equals(other.getHwnd())))
				&& this.index == other.getIndex()
				&& ((this.parent == null && other.getParent() == null) || (this.parent != null && this.parent
						.equals(other.getParent())))
				&& ((this.winClass == null && other.getWinClass() == null) || (this.winClass != null && this.winClass
						.equals(other.getWinClass())));
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
		if (getCaption() != null) {
			_hashCode += getCaption().hashCode();
		}
		if (getHwnd() != null) {
			_hashCode += getHwnd().hashCode();
		}
		_hashCode += getIndex();
		if (getParent() != null) {
			_hashCode += getParent().hashCode();
		}
		if (getWinClass() != null) {
			_hashCode += getWinClass().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Win32Locator.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://win32.server.sirius.org/", "win32Locator"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("caption");
		elemField.setXmlName(new javax.xml.namespace.QName("", "caption"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hwnd");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hwnd"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://win32.server.sirius.org/", "hwnd"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("index");
		elemField.setXmlName(new javax.xml.namespace.QName("", "index"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parent");
		elemField.setXmlName(new javax.xml.namespace.QName("", "parent"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://win32.server.sirius.org/", "hwnd"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("winClass");
		elemField.setXmlName(new javax.xml.namespace.QName("", "winClass"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
