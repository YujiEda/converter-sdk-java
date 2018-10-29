/**
 * IpPoolManagerIpAllocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IpPoolManagerIpAllocation  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private java.lang.String allocationId;

    public IpPoolManagerIpAllocation() {
    }

    public IpPoolManagerIpAllocation(
           java.lang.String ipAddress,
           java.lang.String allocationId) {
        this.ipAddress = ipAddress;
        this.allocationId = allocationId;
    }


    /**
     * Gets the ipAddress value for this IpPoolManagerIpAllocation.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this IpPoolManagerIpAllocation.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the allocationId value for this IpPoolManagerIpAllocation.
     * 
     * @return allocationId
     */
    public java.lang.String getAllocationId() {
        return allocationId;
    }


    /**
     * Sets the allocationId value for this IpPoolManagerIpAllocation.
     * 
     * @param allocationId
     */
    public void setAllocationId(java.lang.String allocationId) {
        this.allocationId = allocationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpPoolManagerIpAllocation)) return false;
        IpPoolManagerIpAllocation other = (IpPoolManagerIpAllocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.allocationId==null && other.getAllocationId()==null) || 
             (this.allocationId!=null &&
              this.allocationId.equals(other.getAllocationId())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getAllocationId() != null) {
            _hashCode += getAllocationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpPoolManagerIpAllocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpPoolManagerIpAllocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
