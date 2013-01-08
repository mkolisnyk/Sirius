/**
 * Osversioninfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.kernel;

public class Osversioninfo extends
		org.sirius.client.win32.core.kernel.Structure implements
		java.io.Serializable {
	private org.sirius.client.win32.core.kernel.Dword dwOSVersionInfoSize;

	private org.sirius.client.win32.core.kernel.Dword dwMajorVersion;

	private org.sirius.client.win32.core.kernel.Dword dwMinorVersion;

	private org.sirius.client.win32.core.kernel.Dword dwBuildNumber;

	private org.sirius.client.win32.core.kernel.Dword dwPlatformId;

	private org.apache.axis.types.UnsignedShort[] szCSDVersion;

	public Osversioninfo() {
	}

	public Osversioninfo(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.kernel.Dword dwOSVersionInfoSize,
			org.sirius.client.win32.core.kernel.Dword dwMajorVersion,
			org.sirius.client.win32.core.kernel.Dword dwMinorVersion,
			org.sirius.client.win32.core.kernel.Dword dwBuildNumber,
			org.sirius.client.win32.core.kernel.Dword dwPlatformId,
			org.apache.axis.types.UnsignedShort[] szCSDVersion) {
		super(autoRead, autoWrite);
		this.dwOSVersionInfoSize = dwOSVersionInfoSize;
		this.dwMajorVersion = dwMajorVersion;
		this.dwMinorVersion = dwMinorVersion;
		this.dwBuildNumber = dwBuildNumber;
		this.dwPlatformId = dwPlatformId;
		this.szCSDVersion = szCSDVersion;
	}

	/**
	 * Gets the dwOSVersionInfoSize value for this Osversioninfo.
	 * 
	 * @return dwOSVersionInfoSize
	 */
	public org.sirius.client.win32.core.kernel.Dword getDwOSVersionInfoSize() {
		return dwOSVersionInfoSize;
	}

	/**
	 * Sets the dwOSVersionInfoSize value for this Osversioninfo.
	 * 
	 * @param dwOSVersionInfoSize
	 */
	public void setDwOSVersionInfoSize(
			org.sirius.client.win32.core.kernel.Dword dwOSVersionInfoSize) {
		this.dwOSVersionInfoSize = dwOSVersionInfoSize;
	}

	/**
	 * Gets the dwMajorVersion value for this Osversioninfo.
	 * 
	 * @return dwMajorVersion
	 */
	public org.sirius.client.win32.core.kernel.Dword getDwMajorVersion() {
		return dwMajorVersion;
	}

	/**
	 * Sets the dwMajorVersion value for this Osversioninfo.
	 * 
	 * @param dwMajorVersion
	 */
	public void setDwMajorVersion(
			org.sirius.client.win32.core.kernel.Dword dwMajorVersion) {
		this.dwMajorVersion = dwMajorVersion;
	}

	/**
	 * Gets the dwMinorVersion value for this Osversioninfo.
	 * 
	 * @return dwMinorVersion
	 */
	public org.sirius.client.win32.core.kernel.Dword getDwMinorVersion() {
		return dwMinorVersion;
	}

	/**
	 * Sets the dwMinorVersion value for this Osversioninfo.
	 * 
	 * @param dwMinorVersion
	 */
	public void setDwMinorVersion(
			org.sirius.client.win32.core.kernel.Dword dwMinorVersion) {
		this.dwMinorVersion = dwMinorVersion;
	}

	/**
	 * Gets the dwBuildNumber value for this Osversioninfo.
	 * 
	 * @return dwBuildNumber
	 */
	public org.sirius.client.win32.core.kernel.Dword getDwBuildNumber() {
		return dwBuildNumber;
	}

	/**
	 * Sets the dwBuildNumber value for this Osversioninfo.
	 * 
	 * @param dwBuildNumber
	 */
	public void setDwBuildNumber(
			org.sirius.client.win32.core.kernel.Dword dwBuildNumber) {
		this.dwBuildNumber = dwBuildNumber;
	}

	/**
	 * Gets the dwPlatformId value for this Osversioninfo.
	 * 
	 * @return dwPlatformId
	 */
	public org.sirius.client.win32.core.kernel.Dword getDwPlatformId() {
		return dwPlatformId;
	}

	/**
	 * Sets the dwPlatformId value for this Osversioninfo.
	 * 
	 * @param dwPlatformId
	 */
	public void setDwPlatformId(
			org.sirius.client.win32.core.kernel.Dword dwPlatformId) {
		this.dwPlatformId = dwPlatformId;
	}

	/**
	 * Gets the szCSDVersion value for this Osversioninfo.
	 * 
	 * @return szCSDVersion
	 */
	public org.apache.axis.types.UnsignedShort[] getSzCSDVersion() {
		return szCSDVersion;
	}

	/**
	 * Sets the szCSDVersion value for this Osversioninfo.
	 * 
	 * @param szCSDVersion
	 */
	public void setSzCSDVersion(
			org.apache.axis.types.UnsignedShort[] szCSDVersion) {
		this.szCSDVersion = szCSDVersion;
	}

	public org.apache.axis.types.UnsignedShort getSzCSDVersion(int i) {
		return this.szCSDVersion[i];
	}

	public void setSzCSDVersion(int i,
			org.apache.axis.types.UnsignedShort _value) {
		this.szCSDVersion[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Osversioninfo))
			return false;
		Osversioninfo other = (Osversioninfo) obj;
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
				&& ((this.dwOSVersionInfoSize == null && other
						.getDwOSVersionInfoSize() == null) || (this.dwOSVersionInfoSize != null && this.dwOSVersionInfoSize
						.equals(other.getDwOSVersionInfoSize())))
				&& ((this.dwMajorVersion == null && other.getDwMajorVersion() == null) || (this.dwMajorVersion != null && this.dwMajorVersion
						.equals(other.getDwMajorVersion())))
				&& ((this.dwMinorVersion == null && other.getDwMinorVersion() == null) || (this.dwMinorVersion != null && this.dwMinorVersion
						.equals(other.getDwMinorVersion())))
				&& ((this.dwBuildNumber == null && other.getDwBuildNumber() == null) || (this.dwBuildNumber != null && this.dwBuildNumber
						.equals(other.getDwBuildNumber())))
				&& ((this.dwPlatformId == null && other.getDwPlatformId() == null) || (this.dwPlatformId != null && this.dwPlatformId
						.equals(other.getDwPlatformId())))
				&& ((this.szCSDVersion == null && other.getSzCSDVersion() == null) || (this.szCSDVersion != null && java.util.Arrays
						.equals(this.szCSDVersion, other.getSzCSDVersion())));
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
		if (getDwOSVersionInfoSize() != null) {
			_hashCode += getDwOSVersionInfoSize().hashCode();
		}
		if (getDwMajorVersion() != null) {
			_hashCode += getDwMajorVersion().hashCode();
		}
		if (getDwMinorVersion() != null) {
			_hashCode += getDwMinorVersion().hashCode();
		}
		if (getDwBuildNumber() != null) {
			_hashCode += getDwBuildNumber().hashCode();
		}
		if (getDwPlatformId() != null) {
			_hashCode += getDwPlatformId().hashCode();
		}
		if (getSzCSDVersion() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSzCSDVersion()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSzCSDVersion(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Osversioninfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "osversioninfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwOSVersionInfoSize");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"dwOSVersionInfoSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwMajorVersion");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "dwMajorVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwMinorVersion");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "dwMinorVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwBuildNumber");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "dwBuildNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwPlatformId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwPlatformId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("szCSDVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "szCSDVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "unsignedShort"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setMaxOccursUnbounded(true);
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
