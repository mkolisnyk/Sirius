/**
 * Msg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Msg extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private org.sirius.client.win32.core.types.Hwnd hWnd;

	private int message;

	private org.sirius.client.win32.core.types.Wparam wParam;

	private org.sirius.client.win32.core.types.Lparam lParam;

	private int time;

	private org.sirius.client.win32.core.types.Point pt;

	public Msg() {
	}

	public Msg(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.types.Hwnd hWnd, int message,
			org.sirius.client.win32.core.types.Wparam wParam,
			org.sirius.client.win32.core.types.Lparam lParam, int time,
			org.sirius.client.win32.core.types.Point pt) {
		super(autoRead, autoWrite);
		this.hWnd = hWnd;
		this.message = message;
		this.wParam = wParam;
		this.lParam = lParam;
		this.time = time;
		this.pt = pt;
	}

	/**
	 * Gets the hWnd value for this Msg.
	 * 
	 * @return hWnd
	 */
	public org.sirius.client.win32.core.types.Hwnd getHWnd() {
		return hWnd;
	}

	/**
	 * Sets the hWnd value for this Msg.
	 * 
	 * @param hWnd
	 */
	public void setHWnd(org.sirius.client.win32.core.types.Hwnd hWnd) {
		this.hWnd = hWnd;
	}

	/**
	 * Gets the message value for this Msg.
	 * 
	 * @return message
	 */
	public int getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this Msg.
	 * 
	 * @param message
	 */
	public void setMessage(int message) {
		this.message = message;
	}

	/**
	 * Gets the wParam value for this Msg.
	 * 
	 * @return wParam
	 */
	public org.sirius.client.win32.core.types.Wparam getWParam() {
		return wParam;
	}

	/**
	 * Sets the wParam value for this Msg.
	 * 
	 * @param wParam
	 */
	public void setWParam(org.sirius.client.win32.core.types.Wparam wParam) {
		this.wParam = wParam;
	}

	/**
	 * Gets the lParam value for this Msg.
	 * 
	 * @return lParam
	 */
	public org.sirius.client.win32.core.types.Lparam getLParam() {
		return lParam;
	}

	/**
	 * Sets the lParam value for this Msg.
	 * 
	 * @param lParam
	 */
	public void setLParam(org.sirius.client.win32.core.types.Lparam lParam) {
		this.lParam = lParam;
	}

	/**
	 * Gets the time value for this Msg.
	 * 
	 * @return time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Sets the time value for this Msg.
	 * 
	 * @param time
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Gets the pt value for this Msg.
	 * 
	 * @return pt
	 */
	public org.sirius.client.win32.core.types.Point getPt() {
		return pt;
	}

	/**
	 * Sets the pt value for this Msg.
	 * 
	 * @param pt
	 */
	public void setPt(org.sirius.client.win32.core.types.Point pt) {
		this.pt = pt;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Msg))
			return false;
		Msg other = (Msg) obj;
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
				&& ((this.hWnd == null && other.getHWnd() == null) || (this.hWnd != null && this.hWnd
						.equals(other.getHWnd())))
				&& this.message == other.getMessage()
				&& ((this.wParam == null && other.getWParam() == null) || (this.wParam != null && this.wParam
						.equals(other.getWParam())))
				&& ((this.lParam == null && other.getLParam() == null) || (this.lParam != null && this.lParam
						.equals(other.getLParam())))
				&& this.time == other.getTime()
				&& ((this.pt == null && other.getPt() == null) || (this.pt != null && this.pt
						.equals(other.getPt())));
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
		if (getHWnd() != null) {
			_hashCode += getHWnd().hashCode();
		}
		_hashCode += getMessage();
		if (getWParam() != null) {
			_hashCode += getWParam().hashCode();
		}
		if (getLParam() != null) {
			_hashCode += getLParam().hashCode();
		}
		_hashCode += getTime();
		if (getPt() != null) {
			_hashCode += getPt().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Msg.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "msg"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("HWnd");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hWnd"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "hwnd"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WParam");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wParam"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "wparam"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("LParam");
		elemField.setXmlName(new javax.xml.namespace.QName("", "lParam"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "lparam"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time");
		elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pt");
		elemField.setXmlName(new javax.xml.namespace.QName("", "pt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "point"));
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
