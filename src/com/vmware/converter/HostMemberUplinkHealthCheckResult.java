/**
 * HostMemberUplinkHealthCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostMemberUplinkHealthCheckResult  extends com.vmware.converter.HostMemberHealthCheckResult  implements java.io.Serializable {
    private java.lang.String uplinkPortKey;

    public HostMemberUplinkHealthCheckResult() {
    }

    public HostMemberUplinkHealthCheckResult(
           java.lang.String summary,
           java.lang.String uplinkPortKey) {
        super(
            summary);
        this.uplinkPortKey = uplinkPortKey;
    }


    /**
     * Gets the uplinkPortKey value for this HostMemberUplinkHealthCheckResult.
     * 
     * @return uplinkPortKey
     */
    public java.lang.String getUplinkPortKey() {
        return uplinkPortKey;
    }


    /**
     * Sets the uplinkPortKey value for this HostMemberUplinkHealthCheckResult.
     * 
     * @param uplinkPortKey
     */
    public void setUplinkPortKey(java.lang.String uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMemberUplinkHealthCheckResult)) return false;
        HostMemberUplinkHealthCheckResult other = (HostMemberUplinkHealthCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uplinkPortKey==null && other.getUplinkPortKey()==null) || 
             (this.uplinkPortKey!=null &&
              this.uplinkPortKey.equals(other.getUplinkPortKey())));
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
        if (getUplinkPortKey() != null) {
            _hashCode += getUplinkPortKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMemberUplinkHealthCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberUplinkHealthCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortKey"));
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
