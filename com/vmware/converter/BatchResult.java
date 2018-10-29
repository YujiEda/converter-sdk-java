/**
 * BatchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class BatchResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String hostKey;

    private com.vmware.converter.ManagedObjectReference ds;

    private com.vmware.converter.LocalizedMethodFault fault;

    public BatchResult() {
    }

    public BatchResult(
           java.lang.String result,
           java.lang.String hostKey,
           com.vmware.converter.ManagedObjectReference ds,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.result = result;
        this.hostKey = hostKey;
        this.ds = ds;
        this.fault = fault;
    }


    /**
     * Gets the result value for this BatchResult.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this BatchResult.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the hostKey value for this BatchResult.
     * 
     * @return hostKey
     */
    public java.lang.String getHostKey() {
        return hostKey;
    }


    /**
     * Sets the hostKey value for this BatchResult.
     * 
     * @param hostKey
     */
    public void setHostKey(java.lang.String hostKey) {
        this.hostKey = hostKey;
    }


    /**
     * Gets the ds value for this BatchResult.
     * 
     * @return ds
     */
    public com.vmware.converter.ManagedObjectReference getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this BatchResult.
     * 
     * @param ds
     */
    public void setDs(com.vmware.converter.ManagedObjectReference ds) {
        this.ds = ds;
    }


    /**
     * Gets the fault value for this BatchResult.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this BatchResult.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchResult)) return false;
        BatchResult other = (BatchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.hostKey==null && other.getHostKey()==null) || 
             (this.hostKey!=null &&
              this.hostKey.equals(other.getHostKey()))) &&
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getHostKey() != null) {
            _hashCode += getHostKey().hashCode();
        }
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BatchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
