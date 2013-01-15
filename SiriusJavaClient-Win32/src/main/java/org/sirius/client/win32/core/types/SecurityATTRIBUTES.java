/**
 * SecurityATTRIBUTES.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class SecurityATTRIBUTES extends
		org.sirius.client.win32.core.types.Structure implements
		java.io.Serializable {
	private org.sirius.client.win32.core.types.Dword dwLength;

	private org.sirius.client.win32.core.types.Pointer lpSecurityDescriptor;

	private boolean bInheritHandle;

	public SecurityATTRIBUTES() {
	}

	public SecurityATTRIBUTES(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.types.Dword dwLength,
			org.sirius.client.win32.core.types.Pointer lpSecurityDescriptor,
			boolean bInheritHandle) {
		super(autoRead, autoWrite);
		this.dwLength = dwLength;
		this.lpSecurityDescriptor = lpSecurityDescriptor;
		this.bInheritHandle = bInheritHandle;
	}

	/**
	 * Gets the dwLength value for this SecurityATTRIBUTES.
	 * 
	 * @return dwLength
	 */
	public org.sirius.client.win32.core.types.Dword getDwLength() {
		return dwLength;
	}

	/**
	 * Sets the dwLength value for this SecurityATTRIBUTES.
	 * 
	 * @param dwLength
	 */
	public void setDwLength(org.sirius.client.win32.core.types.Dword dwLength) {
		this.dwLength = dwLength;
	}

	/**
	 * Gets the lpSecurityDescriptor value for this SecurityATTRIBUTES.
	 * 
	 * @return lpSecurityDescriptor
	 */
	public org.sirius.client.win32.core.types.Pointer getLpSecurityDescriptor() {
		return lpSecurityDescriptor;
	}

	/**
	 * Sets the lpSecurityDescriptor value for this SecurityATTRIBUTES.
	 * 
	 * @param lpSecurityDescriptor
	 */
	public void setLpSecurityDescriptor(
			org.sirius.client.win32.core.types.Pointer lpSecurityDescriptor) {
		this.lpSecurityDescriptor = lpSecurityDescriptor;
	}

	/**
	 * Gets the bInheritHandle value for this SecurityATTRIBUTES.
	 * 
	 * @return bInheritHandle
	 */
	public boolean isBInheritHandle() {
		return bInheritHandle;
	}

	/**
	 * Sets the bInheritHandle value for this SecurityATTRIBUTES.
	 * 
	 * @param bInheritHandle
	 */
	public void setBInheritHandle(boolean bInheritHandle) {
		this.bInheritHandle = bInheritHandle;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SecurityATTRIBUTES))
			return false;
		SecurityATTRIBUTES other = (SecurityATTRIBUTES) obj;
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
				&& ((this.dwLength == null && other.getDwLength() == null) || (this.dwLength != null && this.dwLength
						.equals(other.getDwLength())))
				&& ((this.lpSecurityDescriptor == null && other
						.getLpSecurityDescriptor() == null) || (this.lpSecurityDescriptor != null && this.lpSecurityDescriptor
						.equals(other.getLpSecurityDescriptor())))
				&& this.bInheritHandle == other.isBInheritHandle();
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
		if (getDwLength() != null) {
			_hashCode += getDwLength().hashCode();
		}
		if (getLpSecurityDescriptor() != null) {
			_hashCode += getLpSecurityDescriptor().hashCode();
		}
		_hashCode += (isBInheritHandle() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SecurityATTRIBUTES.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "securityATTRIBUTES"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwLength");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwLength"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lpSecurityDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"lpSecurityDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "pointer"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("BInheritHandle");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "bInheritHandle"));
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
