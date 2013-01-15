/**
 * Overlapped.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class Overlapped extends org.sirius.client.win32.core.types.Structure
		implements java.io.Serializable {
	private org.sirius.client.win32.core.types.UlongPTR internal;

	private org.sirius.client.win32.core.types.UlongPTR internalHigh;

	private int offset;

	private int offsetHigh;

	private org.sirius.client.win32.core.types.Handle hEvent;

	public Overlapped() {
	}

	public Overlapped(boolean autoRead, boolean autoWrite,
			org.sirius.client.win32.core.types.UlongPTR internal,
			org.sirius.client.win32.core.types.UlongPTR internalHigh,
			int offset, int offsetHigh,
			org.sirius.client.win32.core.types.Handle hEvent) {
		super(autoRead, autoWrite);
		this.internal = internal;
		this.internalHigh = internalHigh;
		this.offset = offset;
		this.offsetHigh = offsetHigh;
		this.hEvent = hEvent;
	}

	/**
	 * Gets the internal value for this Overlapped.
	 * 
	 * @return internal
	 */
	public org.sirius.client.win32.core.types.UlongPTR getInternal() {
		return internal;
	}

	/**
	 * Sets the internal value for this Overlapped.
	 * 
	 * @param internal
	 */
	public void setInternal(
			org.sirius.client.win32.core.types.UlongPTR internal) {
		this.internal = internal;
	}

	/**
	 * Gets the internalHigh value for this Overlapped.
	 * 
	 * @return internalHigh
	 */
	public org.sirius.client.win32.core.types.UlongPTR getInternalHigh() {
		return internalHigh;
	}

	/**
	 * Sets the internalHigh value for this Overlapped.
	 * 
	 * @param internalHigh
	 */
	public void setInternalHigh(
			org.sirius.client.win32.core.types.UlongPTR internalHigh) {
		this.internalHigh = internalHigh;
	}

	/**
	 * Gets the offset value for this Overlapped.
	 * 
	 * @return offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset value for this Overlapped.
	 * 
	 * @param offset
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Gets the offsetHigh value for this Overlapped.
	 * 
	 * @return offsetHigh
	 */
	public int getOffsetHigh() {
		return offsetHigh;
	}

	/**
	 * Sets the offsetHigh value for this Overlapped.
	 * 
	 * @param offsetHigh
	 */
	public void setOffsetHigh(int offsetHigh) {
		this.offsetHigh = offsetHigh;
	}

	/**
	 * Gets the hEvent value for this Overlapped.
	 * 
	 * @return hEvent
	 */
	public org.sirius.client.win32.core.types.Handle getHEvent() {
		return hEvent;
	}

	/**
	 * Sets the hEvent value for this Overlapped.
	 * 
	 * @param hEvent
	 */
	public void setHEvent(org.sirius.client.win32.core.types.Handle hEvent) {
		this.hEvent = hEvent;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Overlapped))
			return false;
		Overlapped other = (Overlapped) obj;
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
				&& ((this.internal == null && other.getInternal() == null) || (this.internal != null && this.internal
						.equals(other.getInternal())))
				&& ((this.internalHigh == null && other.getInternalHigh() == null) || (this.internalHigh != null && this.internalHigh
						.equals(other.getInternalHigh())))
				&& this.offset == other.getOffset()
				&& this.offsetHigh == other.getOffsetHigh()
				&& ((this.hEvent == null && other.getHEvent() == null) || (this.hEvent != null && this.hEvent
						.equals(other.getHEvent())));
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
		if (getInternal() != null) {
			_hashCode += getInternal().hashCode();
		}
		if (getInternalHigh() != null) {
			_hashCode += getInternalHigh().hashCode();
		}
		_hashCode += getOffset();
		_hashCode += getOffsetHigh();
		if (getHEvent() != null) {
			_hashCode += getHEvent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Overlapped.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "overlapped"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("internal");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Internal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "ulongPTR"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("internalHigh");
		elemField.setXmlName(new javax.xml.namespace.QName("", "InternalHigh"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "ulongPTR"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offset");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Offset"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offsetHigh");
		elemField.setXmlName(new javax.xml.namespace.QName("", "OffsetHigh"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("HEvent");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hEvent"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "handle"));
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
