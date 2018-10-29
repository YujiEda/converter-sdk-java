/**
 * InsufficientHostMemoryCapacityFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InsufficientHostMemoryCapacityFault  extends com.vmware.converter.InsufficientHostCapacityFault  implements java.io.Serializable {
    private long unreserved;

    private long requested;

    public InsufficientHostMemoryCapacityFault() {
    }

    public InsufficientHostMemoryCapacityFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference host,
           long unreserved,
           long requested) {
        super(
            faultCause,
            faultMessage,
            host);
        this.unreserved = unreserved;
        this.requested = requested;
    }


    /**
     * Gets the unreserved value for this InsufficientHostMemoryCapacityFault.
     * 
     * @return unreserved
     */
    public long getUnreserved() {
        return unreserved;
    }


    /**
     * Sets the unreserved value for this InsufficientHostMemoryCapacityFault.
     * 
     * @param unreserved
     */
    public void setUnreserved(long unreserved) {
        this.unreserved = unreserved;
    }


    /**
     * Gets the requested value for this InsufficientHostMemoryCapacityFault.
     * 
     * @return requested
     */
    public long getRequested() {
        return requested;
    }


    /**
     * Sets the requested value for this InsufficientHostMemoryCapacityFault.
     * 
     * @param requested
     */
    public void setRequested(long requested) {
        this.requested = requested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientHostMemoryCapacityFault)) return false;
        InsufficientHostMemoryCapacityFault other = (InsufficientHostMemoryCapacityFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.unreserved == other.getUnreserved() &&
            this.requested == other.getRequested();
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
        _hashCode += new Long(getUnreserved()).hashCode();
        _hashCode += new Long(getRequested()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsufficientHostMemoryCapacityFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InsufficientHostMemoryCapacityFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unreserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
