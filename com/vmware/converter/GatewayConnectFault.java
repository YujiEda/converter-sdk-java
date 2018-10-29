/**
 * GatewayConnectFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GatewayConnectFault  extends com.vmware.converter.HostConnectFault  implements java.io.Serializable {
    private java.lang.String gatewayType;

    private java.lang.String gatewayId;

    private java.lang.String gatewayInfo;

    private com.vmware.converter.LocalizableMessage details;

    public GatewayConnectFault() {
    }

    public GatewayConnectFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String gatewayType,
           java.lang.String gatewayId,
           java.lang.String gatewayInfo,
           com.vmware.converter.LocalizableMessage details) {
        super(
            faultCause,
            faultMessage);
        this.gatewayType = gatewayType;
        this.gatewayId = gatewayId;
        this.gatewayInfo = gatewayInfo;
        this.details = details;
    }


    /**
     * Gets the gatewayType value for this GatewayConnectFault.
     * 
     * @return gatewayType
     */
    public java.lang.String getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this GatewayConnectFault.
     * 
     * @param gatewayType
     */
    public void setGatewayType(java.lang.String gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the gatewayId value for this GatewayConnectFault.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this GatewayConnectFault.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the gatewayInfo value for this GatewayConnectFault.
     * 
     * @return gatewayInfo
     */
    public java.lang.String getGatewayInfo() {
        return gatewayInfo;
    }


    /**
     * Sets the gatewayInfo value for this GatewayConnectFault.
     * 
     * @param gatewayInfo
     */
    public void setGatewayInfo(java.lang.String gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
    }


    /**
     * Gets the details value for this GatewayConnectFault.
     * 
     * @return details
     */
    public com.vmware.converter.LocalizableMessage getDetails() {
        return details;
    }


    /**
     * Sets the details value for this GatewayConnectFault.
     * 
     * @param details
     */
    public void setDetails(com.vmware.converter.LocalizableMessage details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayConnectFault)) return false;
        GatewayConnectFault other = (GatewayConnectFault) obj;
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
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.gatewayInfo==null && other.getGatewayInfo()==null) || 
             (this.gatewayInfo!=null &&
              this.gatewayInfo.equals(other.getGatewayInfo()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails())));
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
        if (getGatewayInfo() != null) {
            _hashCode += getGatewayInfo().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GatewayConnectFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GatewayConnectFault"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gatewayInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
