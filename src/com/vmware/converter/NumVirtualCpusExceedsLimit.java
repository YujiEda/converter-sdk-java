/**
 * NumVirtualCpusExceedsLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NumVirtualCpusExceedsLimit  extends com.vmware.converter.InsufficientResourcesFault  implements java.io.Serializable {
    private int maxSupportedVcpus;

    public NumVirtualCpusExceedsLimit() {
    }

    public NumVirtualCpusExceedsLimit(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int maxSupportedVcpus) {
        super(
            faultCause,
            faultMessage);
        this.maxSupportedVcpus = maxSupportedVcpus;
    }


    /**
     * Gets the maxSupportedVcpus value for this NumVirtualCpusExceedsLimit.
     * 
     * @return maxSupportedVcpus
     */
    public int getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }


    /**
     * Sets the maxSupportedVcpus value for this NumVirtualCpusExceedsLimit.
     * 
     * @param maxSupportedVcpus
     */
    public void setMaxSupportedVcpus(int maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumVirtualCpusExceedsLimit)) return false;
        NumVirtualCpusExceedsLimit other = (NumVirtualCpusExceedsLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.maxSupportedVcpus == other.getMaxSupportedVcpus();
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
        _hashCode += getMaxSupportedVcpus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumVirtualCpusExceedsLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumVirtualCpusExceedsLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
