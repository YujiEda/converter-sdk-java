/**
 * HostListSummaryGatewaySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostListSummaryGatewaySummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String gatewayType;

    private java.lang.String gatewayId;

    public HostListSummaryGatewaySummary() {
    }

    public HostListSummaryGatewaySummary(
           java.lang.String gatewayType,
           java.lang.String gatewayId) {
        this.gatewayType = gatewayType;
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the gatewayType value for this HostListSummaryGatewaySummary.
     * 
     * @return gatewayType
     */
    public java.lang.String getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this HostListSummaryGatewaySummary.
     * 
     * @param gatewayType
     */
    public void setGatewayType(java.lang.String gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the gatewayId value for this HostListSummaryGatewaySummary.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this HostListSummaryGatewaySummary.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostListSummaryGatewaySummary)) return false;
        HostListSummaryGatewaySummary other = (HostListSummaryGatewaySummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayType==null && other.getGatewayType()==null) || 
             (this.gatewayType!=null &&
              this.gatewayType.equals(other.getGatewayType()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId())));
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
        if (getGatewayType() != null) {
            _hashCode += getGatewayType().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostListSummaryGatewaySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostListSummaryGatewaySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gatewayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gatewayId"));
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
