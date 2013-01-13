/**
 * Hardwareinput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class Hardwareinput extends
		org.sirius.client.win32.core.user32.Structure implements
		java.io.Serializable {
	private org.sirius.client.win32.core.user32.Dword uMsg;

	private org.sirius.client.win32.core.user32.Word wParamL;

	private org.sirius.client.win32.core.user32.Word wParamH;

	public Hardwareinput() {
	}

	public Hardwareinput(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.user32.Dword uMsg,
			org.sirius.client.win32.core.user32.Word wParamL,
			org.sirius.client.win32.core.user32.Word wParamH) {
		super(autoRead, autoWrite);
		this.uMsg = uMsg;
		this.wParamL = wParamL;
		this.wParamH = wParamH;
	}

	/**
	 * Gets the uMsg value for this Hardwareinput.
	 * 
	 * @return uMsg
	 */
	public org.sirius.client.win32.core.user32.Dword getUMsg() {
		return uMsg;
	}

	/**
	 * Sets the uMsg value for this Hardwareinput.
	 * 
	 * @param uMsg
	 */
	public void setUMsg(org.sirius.client.win32.core.user32.Dword uMsg) {
		this.uMsg = uMsg;
	}

	/**
	 * Gets the wParamL value for this Hardwareinput.
	 * 
	 * @return wParamL
	 */
	public org.sirius.client.win32.core.user32.Word getWParamL() {
		return wParamL;
	}

	/**
	 * Sets the wParamL value for this Hardwareinput.
	 * 
	 * @param wParamL
	 */
	public void setWParamL(org.sirius.client.win32.core.user32.Word wParamL) {
		this.wParamL = wParamL;
	}

	/**
	 * Gets the wParamH value for this Hardwareinput.
	 * 
	 * @return wParamH
	 */
	public org.sirius.client.win32.core.user32.Word getWParamH() {
		return wParamH;
	}

	/**
	 * Sets the wParamH value for this Hardwareinput.
	 * 
	 * @param wParamH
	 */
	public void setWParamH(org.sirius.client.win32.core.user32.Word wParamH) {
		this.wParamH = wParamH;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Hardwareinput))
			return false;
		Hardwareinput other = (Hardwareinput) obj;
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
				&& ((this.uMsg == null && other.getUMsg() == null) || (this.uMsg != null && this.uMsg
						.equals(other.getUMsg())))
				&& ((this.wParamL == null && other.getWParamL() == null) || (this.wParamL != null && this.wParamL
						.equals(other.getWParamL())))
				&& ((this.wParamH == null && other.getWParamH() == null) || (this.wParamH != null && this.wParamH
						.equals(other.getWParamH())));
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
		if (getUMsg() != null) {
			_hashCode += getUMsg().hashCode();
		}
		if (getWParamL() != null) {
			_hashCode += getWParamL().hashCode();
		}
		if (getWParamH() != null) {
			_hashCode += getWParamH().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Hardwareinput.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "hardwareinput"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("UMsg");
		elemField.setXmlName(new javax.xml.namespace.QName("", "uMsg"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WParamL");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wParamL"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "word"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("WParamH");
		elemField.setXmlName(new javax.xml.namespace.QName("", "wParamH"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "word"));
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
