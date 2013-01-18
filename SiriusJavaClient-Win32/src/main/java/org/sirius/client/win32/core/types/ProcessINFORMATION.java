/**
 * ProcessINFORMATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.types;

public class ProcessINFORMATION  extends org.sirius.client.win32.core.types.Structure  implements java.io.Serializable {
    private org.sirius.client.win32.core.types.Handle hProcess;

    private org.sirius.client.win32.core.types.Handle hThread;

    private org.sirius.client.win32.core.types.Dword dwProcessId;

    private org.sirius.client.win32.core.types.Dword dwThreadId;

    public ProcessINFORMATION() {
    }

    public ProcessINFORMATION(
           boolean autoRead,
           boolean autoWrite,
           org.sirius.client.win32.core.types.Handle hProcess,
           org.sirius.client.win32.core.types.Handle hThread,
           org.sirius.client.win32.core.types.Dword dwProcessId,
           org.sirius.client.win32.core.types.Dword dwThreadId) {
        super(
            autoRead,
            autoWrite);
        this.hProcess = hProcess;
        this.hThread = hThread;
        this.dwProcessId = dwProcessId;
        this.dwThreadId = dwThreadId;
    }


    /**
     * Gets the hProcess value for this ProcessINFORMATION.
     * 
     * @return hProcess
     */
    public org.sirius.client.win32.core.types.Handle getHProcess() {
        return hProcess;
    }


    /**
     * Sets the hProcess value for this ProcessINFORMATION.
     * 
     * @param hProcess
     */
    public void setHProcess(org.sirius.client.win32.core.types.Handle hProcess) {
        this.hProcess = hProcess;
    }


    /**
     * Gets the hThread value for this ProcessINFORMATION.
     * 
     * @return hThread
     */
    public org.sirius.client.win32.core.types.Handle getHThread() {
        return hThread;
    }


    /**
     * Sets the hThread value for this ProcessINFORMATION.
     * 
     * @param hThread
     */
    public void setHThread(org.sirius.client.win32.core.types.Handle hThread) {
        this.hThread = hThread;
    }


    /**
     * Gets the dwProcessId value for this ProcessINFORMATION.
     * 
     * @return dwProcessId
     */
    public org.sirius.client.win32.core.types.Dword getDwProcessId() {
        return dwProcessId;
    }


    /**
     * Sets the dwProcessId value for this ProcessINFORMATION.
     * 
     * @param dwProcessId
     */
    public void setDwProcessId(org.sirius.client.win32.core.types.Dword dwProcessId) {
        this.dwProcessId = dwProcessId;
    }


    /**
     * Gets the dwThreadId value for this ProcessINFORMATION.
     * 
     * @return dwThreadId
     */
    public org.sirius.client.win32.core.types.Dword getDwThreadId() {
        return dwThreadId;
    }


    /**
     * Sets the dwThreadId value for this ProcessINFORMATION.
     * 
     * @param dwThreadId
     */
    public void setDwThreadId(org.sirius.client.win32.core.types.Dword dwThreadId) {
        this.dwThreadId = dwThreadId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessINFORMATION)) return false;
        ProcessINFORMATION other = (ProcessINFORMATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hProcess==null && other.getHProcess()==null) || 
             (this.hProcess!=null &&
              this.hProcess.equals(other.getHProcess()))) &&
            ((this.hThread==null && other.getHThread()==null) || 
             (this.hThread!=null &&
              this.hThread.equals(other.getHThread()))) &&
            ((this.dwProcessId==null && other.getDwProcessId()==null) || 
             (this.dwProcessId!=null &&
              this.dwProcessId.equals(other.getDwProcessId()))) &&
            ((this.dwThreadId==null && other.getDwThreadId()==null) || 
             (this.dwThreadId!=null &&
              this.dwThreadId.equals(other.getDwThreadId())));
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
        if (getHProcess() != null) {
            _hashCode += getHProcess().hashCode();
        }
        if (getHThread() != null) {
            _hashCode += getHThread().hashCode();
        }
        if (getDwProcessId() != null) {
            _hashCode += getDwProcessId().hashCode();
        }
        if (getDwThreadId() != null) {
            _hashCode += getDwThreadId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessINFORMATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "processINFORMATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "handle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HThread");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "handle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "dword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dwThreadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dwThreadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://core.win32.server.sirius.org/", "dword"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
