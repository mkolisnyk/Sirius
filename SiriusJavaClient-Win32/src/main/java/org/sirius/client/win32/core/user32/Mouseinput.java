/**
 * Mouseinput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class Mouseinput extends org.sirius.client.win32.core.user32.Structure
		implements java.io.Serializable {
	private org.sirius.client.win32.core.user32._long dx;

	private org.sirius.client.win32.core.user32._long dy;

	private org.sirius.client.win32.core.user32.Dword mouseData;

	private org.sirius.client.win32.core.user32.Dword dwFlags;

	private org.sirius.client.win32.core.user32.Dword time;

	private org.sirius.client.win32.core.user32.UlongPTR dwExtraInfo;

	public Mouseinput() {
	}

	public Mouseinput(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.user32._long dx,
			org.sirius.client.win32.core.user32._long dy,
			org.sirius.client.win32.core.user32.Dword mouseData,
			org.sirius.client.win32.core.user32.Dword dwFlags,
			org.sirius.client.win32.core.user32.Dword time,
			org.sirius.client.win32.core.user32.UlongPTR dwExtraInfo) {
		super(autoRead, autoWrite);
		this.dx = dx;
		this.dy = dy;
		this.mouseData = mouseData;
		this.dwFlags = dwFlags;
		this.time = time;
		this.dwExtraInfo = dwExtraInfo;
	}

	/**
	 * Gets the dx value for this Mouseinput.
	 * 
	 * @return dx
	 */
	public org.sirius.client.win32.core.user32._long getDx() {
		return dx;
	}

	/**
	 * Sets the dx value for this Mouseinput.
	 * 
	 * @param dx
	 */
	public void setDx(org.sirius.client.win32.core.user32._long dx) {
		this.dx = dx;
	}

	/**
	 * Gets the dy value for this Mouseinput.
	 * 
	 * @return dy
	 */
	public org.sirius.client.win32.core.user32._long getDy() {
		return dy;
	}

	/**
	 * Sets the dy value for this Mouseinput.
	 * 
	 * @param dy
	 */
	public void setDy(org.sirius.client.win32.core.user32._long dy) {
		this.dy = dy;
	}

	/**
	 * Gets the mouseData value for this Mouseinput.
	 * 
	 * @return mouseData
	 */
	public org.sirius.client.win32.core.user32.Dword getMouseData() {
		return mouseData;
	}

	/**
	 * Sets the mouseData value for this Mouseinput.
	 * 
	 * @param mouseData
	 */
	public void setMouseData(org.sirius.client.win32.core.user32.Dword mouseData) {
		this.mouseData = mouseData;
	}

	/**
	 * Gets the dwFlags value for this Mouseinput.
	 * 
	 * @return dwFlags
	 */
	public org.sirius.client.win32.core.user32.Dword getDwFlags() {
		return dwFlags;
	}

	/**
	 * Sets the dwFlags value for this Mouseinput.
	 * 
	 * @param dwFlags
	 */
	public void setDwFlags(org.sirius.client.win32.core.user32.Dword dwFlags) {
		this.dwFlags = dwFlags;
	}

	/**
	 * Gets the time value for this Mouseinput.
	 * 
	 * @return time
	 */
	public org.sirius.client.win32.core.user32.Dword getTime() {
		return time;
	}

	/**
	 * Sets the time value for this Mouseinput.
	 * 
	 * @param time
	 */
	public void setTime(org.sirius.client.win32.core.user32.Dword time) {
		this.time = time;
	}

	/**
	 * Gets the dwExtraInfo value for this Mouseinput.
	 * 
	 * @return dwExtraInfo
	 */
	public org.sirius.client.win32.core.user32.UlongPTR getDwExtraInfo() {
		return dwExtraInfo;
	}

	/**
	 * Sets the dwExtraInfo value for this Mouseinput.
	 * 
	 * @param dwExtraInfo
	 */
	public void setDwExtraInfo(
			org.sirius.client.win32.core.user32.UlongPTR dwExtraInfo) {
		this.dwExtraInfo = dwExtraInfo;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Mouseinput))
			return false;
		Mouseinput other = (Mouseinput) obj;
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
				&& ((this.dx == null && other.getDx() == null) || (this.dx != null && this.dx
						.equals(other.getDx())))
				&& ((this.dy == null && other.getDy() == null) || (this.dy != null && this.dy
						.equals(other.getDy())))
				&& ((this.mouseData == null && other.getMouseData() == null) || (this.mouseData != null && this.mouseData
						.equals(other.getMouseData())))
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
		if (getDx() != null) {
			_hashCode += getDx().hashCode();
		}
		if (getDy() != null) {
			_hashCode += getDy().hashCode();
		}
		if (getMouseData() != null) {
			_hashCode += getMouseData().hashCode();
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
			Mouseinput.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "mouseinput"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dx");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dx"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dy");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mouseData");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mouseData"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
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
