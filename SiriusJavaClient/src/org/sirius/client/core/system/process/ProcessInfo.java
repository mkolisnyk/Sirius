/**
 * ProcessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.core.system.process;

public class ProcessInfo implements java.io.Serializable {
	private java.lang.String imageName;

	private int memUsage;

	private int PID;

	private java.lang.String sessionName;

	private int sessionNum;

	public ProcessInfo() {
	}

	public ProcessInfo(java.lang.String imageName, int memUsage, int PID,
			java.lang.String sessionName, int sessionNum) {
		this.imageName = imageName;
		this.memUsage = memUsage;
		this.PID = PID;
		this.sessionName = sessionName;
		this.sessionNum = sessionNum;
	}

	/**
	 * Gets the imageName value for this ProcessInfo.
	 * 
	 * @return imageName
	 */
	public java.lang.String getImageName() {
		return imageName;
	}

	/**
	 * Sets the imageName value for this ProcessInfo.
	 * 
	 * @param imageName
	 */
	public void setImageName(java.lang.String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Gets the memUsage value for this ProcessInfo.
	 * 
	 * @return memUsage
	 */
	public int getMemUsage() {
		return memUsage;
	}

	/**
	 * Sets the memUsage value for this ProcessInfo.
	 * 
	 * @param memUsage
	 */
	public void setMemUsage(int memUsage) {
		this.memUsage = memUsage;
	}

	/**
	 * Gets the PID value for this ProcessInfo.
	 * 
	 * @return PID
	 */
	public int getPID() {
		return PID;
	}

	/**
	 * Sets the PID value for this ProcessInfo.
	 * 
	 * @param PID
	 */
	public void setPID(int PID) {
		this.PID = PID;
	}

	/**
	 * Gets the sessionName value for this ProcessInfo.
	 * 
	 * @return sessionName
	 */
	public java.lang.String getSessionName() {
		return sessionName;
	}

	/**
	 * Sets the sessionName value for this ProcessInfo.
	 * 
	 * @param sessionName
	 */
	public void setSessionName(java.lang.String sessionName) {
		this.sessionName = sessionName;
	}

	/**
	 * Gets the sessionNum value for this ProcessInfo.
	 * 
	 * @return sessionNum
	 */
	public int getSessionNum() {
		return sessionNum;
	}

	/**
	 * Sets the sessionNum value for this ProcessInfo.
	 * 
	 * @param sessionNum
	 */
	public void setSessionNum(int sessionNum) {
		this.sessionNum = sessionNum;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProcessInfo))
			return false;
		ProcessInfo other = (ProcessInfo) obj;
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
				&& ((this.imageName == null && other.getImageName() == null) || (this.imageName != null && this.imageName
						.equals(other.getImageName())))
				&& this.memUsage == other.getMemUsage()
				&& this.PID == other.getPID()
				&& ((this.sessionName == null && other.getSessionName() == null) || (this.sessionName != null && this.sessionName
						.equals(other.getSessionName())))
				&& this.sessionNum == other.getSessionNum();
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
		if (getImageName() != null) {
			_hashCode += getImageName().hashCode();
		}
		_hashCode += getMemUsage();
		_hashCode += getPID();
		if (getSessionName() != null) {
			_hashCode += getSessionName().hashCode();
		}
		_hashCode += getSessionNum();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ProcessInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://system.server.sirius.org/", "processInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imageName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "imageName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("", "memUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("PID");
		elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sessionName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "sessionName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sessionNum");
		elemField.setXmlName(new javax.xml.namespace.QName("", "sessionNum"));
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
