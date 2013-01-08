/**
 * Blendfunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.user32;

public class Blendfunction extends
		org.sirius.client.win32.core.user32.Structure implements
		java.io.Serializable {
	private byte blendOp;

	private byte blendFlags;

	private byte sourceConstantAlpha;

	private byte alphaFormat;

	public Blendfunction() {
	}

	public Blendfunction(boolean autoRead, boolean autoWrite, byte blendOp,
			byte blendFlags, byte sourceConstantAlpha, byte alphaFormat) {
		super(autoRead, autoWrite);
		this.blendOp = blendOp;
		this.blendFlags = blendFlags;
		this.sourceConstantAlpha = sourceConstantAlpha;
		this.alphaFormat = alphaFormat;
	}

	/**
	 * Gets the blendOp value for this Blendfunction.
	 * 
	 * @return blendOp
	 */
	public byte getBlendOp() {
		return blendOp;
	}

	/**
	 * Sets the blendOp value for this Blendfunction.
	 * 
	 * @param blendOp
	 */
	public void setBlendOp(byte blendOp) {
		this.blendOp = blendOp;
	}

	/**
	 * Gets the blendFlags value for this Blendfunction.
	 * 
	 * @return blendFlags
	 */
	public byte getBlendFlags() {
		return blendFlags;
	}

	/**
	 * Sets the blendFlags value for this Blendfunction.
	 * 
	 * @param blendFlags
	 */
	public void setBlendFlags(byte blendFlags) {
		this.blendFlags = blendFlags;
	}

	/**
	 * Gets the sourceConstantAlpha value for this Blendfunction.
	 * 
	 * @return sourceConstantAlpha
	 */
	public byte getSourceConstantAlpha() {
		return sourceConstantAlpha;
	}

	/**
	 * Sets the sourceConstantAlpha value for this Blendfunction.
	 * 
	 * @param sourceConstantAlpha
	 */
	public void setSourceConstantAlpha(byte sourceConstantAlpha) {
		this.sourceConstantAlpha = sourceConstantAlpha;
	}

	/**
	 * Gets the alphaFormat value for this Blendfunction.
	 * 
	 * @return alphaFormat
	 */
	public byte getAlphaFormat() {
		return alphaFormat;
	}

	/**
	 * Sets the alphaFormat value for this Blendfunction.
	 * 
	 * @param alphaFormat
	 */
	public void setAlphaFormat(byte alphaFormat) {
		this.alphaFormat = alphaFormat;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Blendfunction))
			return false;
		Blendfunction other = (Blendfunction) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj) && this.blendOp == other.getBlendOp()
				&& this.blendFlags == other.getBlendFlags()
				&& this.sourceConstantAlpha == other.getSourceConstantAlpha()
				&& this.alphaFormat == other.getAlphaFormat();
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
		_hashCode += getBlendOp();
		_hashCode += getBlendFlags();
		_hashCode += getSourceConstantAlpha();
		_hashCode += getAlphaFormat();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Blendfunction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://core.win32.server.sirius.org/", "blendfunction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("blendOp");
		elemField.setXmlName(new javax.xml.namespace.QName("", "BlendOp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("blendFlags");
		elemField.setXmlName(new javax.xml.namespace.QName("", "BlendFlags"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceConstantAlpha");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"SourceConstantAlpha"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alphaFormat");
		elemField.setXmlName(new javax.xml.namespace.QName("", "AlphaFormat"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
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
