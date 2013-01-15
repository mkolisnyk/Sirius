/**
 * Memorystatusex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Memorystatusex extends
		org.sirius.client.win32.core.types.Structure implements
		java.io.Serializable {
	private org.sirius.client.win32.core.types.Dword dwLength;

	private org.sirius.client.win32.core.types.Dword dwMemoryLoad;

	private org.sirius.client.win32.core.types.Dwordlong ullTotalPhys;

	private org.sirius.client.win32.core.types.Dwordlong ullAvailPhys;

	private org.sirius.client.win32.core.types.Dwordlong ullTotalPageFile;

	private org.sirius.client.win32.core.types.Dwordlong ullAvailPageFile;

	private org.sirius.client.win32.core.types.Dwordlong ullTotalVirtual;

	private org.sirius.client.win32.core.types.Dwordlong ullAvailVirtual;

	private org.sirius.client.win32.core.types.Dwordlong ullAvailExtendedVirtual;

	public Memorystatusex() {
	}

	public Memorystatusex(
			boolean autoRead,
			boolean autoWrite,
			org.sirius.client.win32.core.types.Dword dwLength,
			org.sirius.client.win32.core.types.Dword dwMemoryLoad,
			org.sirius.client.win32.core.types.Dwordlong ullTotalPhys,
			org.sirius.client.win32.core.types.Dwordlong ullAvailPhys,
			org.sirius.client.win32.core.types.Dwordlong ullTotalPageFile,
			org.sirius.client.win32.core.types.Dwordlong ullAvailPageFile,
			org.sirius.client.win32.core.types.Dwordlong ullTotalVirtual,
			org.sirius.client.win32.core.types.Dwordlong ullAvailVirtual,
			org.sirius.client.win32.core.types.Dwordlong ullAvailExtendedVirtual) {
		super(autoRead, autoWrite);
		this.dwLength = dwLength;
		this.dwMemoryLoad = dwMemoryLoad;
		this.ullTotalPhys = ullTotalPhys;
		this.ullAvailPhys = ullAvailPhys;
		this.ullTotalPageFile = ullTotalPageFile;
		this.ullAvailPageFile = ullAvailPageFile;
		this.ullTotalVirtual = ullTotalVirtual;
		this.ullAvailVirtual = ullAvailVirtual;
		this.ullAvailExtendedVirtual = ullAvailExtendedVirtual;
	}

	/**
	 * Gets the dwLength value for this Memorystatusex.
	 * 
	 * @return dwLength
	 */
	public org.sirius.client.win32.core.types.Dword getDwLength() {
		return dwLength;
	}

	/**
	 * Sets the dwLength value for this Memorystatusex.
	 * 
	 * @param dwLength
	 */
	public void setDwLength(org.sirius.client.win32.core.types.Dword dwLength) {
		this.dwLength = dwLength;
	}

	/**
	 * Gets the dwMemoryLoad value for this Memorystatusex.
	 * 
	 * @return dwMemoryLoad
	 */
	public org.sirius.client.win32.core.types.Dword getDwMemoryLoad() {
		return dwMemoryLoad;
	}

	/**
	 * Sets the dwMemoryLoad value for this Memorystatusex.
	 * 
	 * @param dwMemoryLoad
	 */
	public void setDwMemoryLoad(
			org.sirius.client.win32.core.types.Dword dwMemoryLoad) {
		this.dwMemoryLoad = dwMemoryLoad;
	}

	/**
	 * Gets the ullTotalPhys value for this Memorystatusex.
	 * 
	 * @return ullTotalPhys
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllTotalPhys() {
		return ullTotalPhys;
	}

	/**
	 * Sets the ullTotalPhys value for this Memorystatusex.
	 * 
	 * @param ullTotalPhys
	 */
	public void setUllTotalPhys(
			org.sirius.client.win32.core.types.Dwordlong ullTotalPhys) {
		this.ullTotalPhys = ullTotalPhys;
	}

	/**
	 * Gets the ullAvailPhys value for this Memorystatusex.
	 * 
	 * @return ullAvailPhys
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllAvailPhys() {
		return ullAvailPhys;
	}

	/**
	 * Sets the ullAvailPhys value for this Memorystatusex.
	 * 
	 * @param ullAvailPhys
	 */
	public void setUllAvailPhys(
			org.sirius.client.win32.core.types.Dwordlong ullAvailPhys) {
		this.ullAvailPhys = ullAvailPhys;
	}

	/**
	 * Gets the ullTotalPageFile value for this Memorystatusex.
	 * 
	 * @return ullTotalPageFile
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllTotalPageFile() {
		return ullTotalPageFile;
	}

	/**
	 * Sets the ullTotalPageFile value for this Memorystatusex.
	 * 
	 * @param ullTotalPageFile
	 */
	public void setUllTotalPageFile(
			org.sirius.client.win32.core.types.Dwordlong ullTotalPageFile) {
		this.ullTotalPageFile = ullTotalPageFile;
	}

	/**
	 * Gets the ullAvailPageFile value for this Memorystatusex.
	 * 
	 * @return ullAvailPageFile
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllAvailPageFile() {
		return ullAvailPageFile;
	}

	/**
	 * Sets the ullAvailPageFile value for this Memorystatusex.
	 * 
	 * @param ullAvailPageFile
	 */
	public void setUllAvailPageFile(
			org.sirius.client.win32.core.types.Dwordlong ullAvailPageFile) {
		this.ullAvailPageFile = ullAvailPageFile;
	}

	/**
	 * Gets the ullTotalVirtual value for this Memorystatusex.
	 * 
	 * @return ullTotalVirtual
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllTotalVirtual() {
		return ullTotalVirtual;
	}

	/**
	 * Sets the ullTotalVirtual value for this Memorystatusex.
	 * 
	 * @param ullTotalVirtual
	 */
	public void setUllTotalVirtual(
			org.sirius.client.win32.core.types.Dwordlong ullTotalVirtual) {
		this.ullTotalVirtual = ullTotalVirtual;
	}

	/**
	 * Gets the ullAvailVirtual value for this Memorystatusex.
	 * 
	 * @return ullAvailVirtual
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllAvailVirtual() {
		return ullAvailVirtual;
	}

	/**
	 * Sets the ullAvailVirtual value for this Memorystatusex.
	 * 
	 * @param ullAvailVirtual
	 */
	public void setUllAvailVirtual(
			org.sirius.client.win32.core.types.Dwordlong ullAvailVirtual) {
		this.ullAvailVirtual = ullAvailVirtual;
	}

	/**
	 * Gets the ullAvailExtendedVirtual value for this Memorystatusex.
	 * 
	 * @return ullAvailExtendedVirtual
	 */
	public org.sirius.client.win32.core.types.Dwordlong getUllAvailExtendedVirtual() {
		return ullAvailExtendedVirtual;
	}

	/**
	 * Sets the ullAvailExtendedVirtual value for this Memorystatusex.
	 * 
	 * @param ullAvailExtendedVirtual
	 */
	public void setUllAvailExtendedVirtual(
			org.sirius.client.win32.core.types.Dwordlong ullAvailExtendedVirtual) {
		this.ullAvailExtendedVirtual = ullAvailExtendedVirtual;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Memorystatusex))
			return false;
		Memorystatusex other = (Memorystatusex) obj;
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
				&& ((this.dwMemoryLoad == null && other.getDwMemoryLoad() == null) || (this.dwMemoryLoad != null && this.dwMemoryLoad
						.equals(other.getDwMemoryLoad())))
				&& ((this.ullTotalPhys == null && other.getUllTotalPhys() == null) || (this.ullTotalPhys != null && this.ullTotalPhys
						.equals(other.getUllTotalPhys())))
				&& ((this.ullAvailPhys == null && other.getUllAvailPhys() == null) || (this.ullAvailPhys != null && this.ullAvailPhys
						.equals(other.getUllAvailPhys())))
				&& ((this.ullTotalPageFile == null && other
						.getUllTotalPageFile() == null) || (this.ullTotalPageFile != null && this.ullTotalPageFile
						.equals(other.getUllTotalPageFile())))
				&& ((this.ullAvailPageFile == null && other
						.getUllAvailPageFile() == null) || (this.ullAvailPageFile != null && this.ullAvailPageFile
						.equals(other.getUllAvailPageFile())))
				&& ((this.ullTotalVirtual == null && other.getUllTotalVirtual() == null) || (this.ullTotalVirtual != null && this.ullTotalVirtual
						.equals(other.getUllTotalVirtual())))
				&& ((this.ullAvailVirtual == null && other.getUllAvailVirtual() == null) || (this.ullAvailVirtual != null && this.ullAvailVirtual
						.equals(other.getUllAvailVirtual())))
				&& ((this.ullAvailExtendedVirtual == null && other
						.getUllAvailExtendedVirtual() == null) || (this.ullAvailExtendedVirtual != null && this.ullAvailExtendedVirtual
						.equals(other.getUllAvailExtendedVirtual())));
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
		if (getDwMemoryLoad() != null) {
			_hashCode += getDwMemoryLoad().hashCode();
		}
		if (getUllTotalPhys() != null) {
			_hashCode += getUllTotalPhys().hashCode();
		}
		if (getUllAvailPhys() != null) {
			_hashCode += getUllAvailPhys().hashCode();
		}
		if (getUllTotalPageFile() != null) {
			_hashCode += getUllTotalPageFile().hashCode();
		}
		if (getUllAvailPageFile() != null) {
			_hashCode += getUllAvailPageFile().hashCode();
		}
		if (getUllTotalVirtual() != null) {
			_hashCode += getUllTotalVirtual().hashCode();
		}
		if (getUllAvailVirtual() != null) {
			_hashCode += getUllAvailVirtual().hashCode();
		}
		if (getUllAvailExtendedVirtual() != null) {
			_hashCode += getUllAvailExtendedVirtual().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Memorystatusex.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "memorystatusex"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwLength");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwLength"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dwMemoryLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dwMemoryLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullTotalPhys");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ullTotalPhys"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullAvailPhys");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ullAvailPhys"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullTotalPageFile");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ullTotalPageFile"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullAvailPageFile");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ullAvailPageFile"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullTotalVirtual");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ullTotalVirtual"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullAvailVirtual");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ullAvailVirtual"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ullAvailExtendedVirtual");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ullAvailExtendedVirtual"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "dwordlong"));
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
