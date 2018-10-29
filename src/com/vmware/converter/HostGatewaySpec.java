/**
 * HostGatewaySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostGatewaySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String gatewayType;

    private java.lang.String gatewayId;

    private java.lang.String trustVerificationToken;

    private com.vmware.converter.KeyValue[] hostAuthParams;

    public HostGatewaySpec() {
    }

    public HostGatewaySpec(
           java.lang.String gatewayType,
           java.lang.String gatewayId,
           java.lang.String trustVerificationToken,
           com.vmware.converter.KeyValue[] hostAuthParams) {
        this.gatewayType = gatewayType;
        this.gatewayId = gatewayId;
        this.trustVerificationToken = trustVerificationToken;
        this.hostAuthParams = hostAuthParams;
    }


    /**
     * Gets the gatewayType value for this HostGatewaySpec.
     * 
     * @return gatewayType
     */
    public java.lang.String getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this HostGatewaySpec.
     * 
     * @param gatewayType
     */
    public void setGatewayType(java.lang.String gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the gatewayId value for this HostGatewaySpec.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this HostGatewaySpec.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the trustVerificationToken value for this HostGatewaySpec.
     * 
     * @return trustVerificationToken
     */
    public java.lang.String getTrustVerificationToken() {
        return trustVerificationToken;
    }


    /**
     * Sets the trustVerificationToken value for this HostGatewaySpec.
     * 
     * @param trustVerificationToken
     */
    public void setTrustVerificationToken(java.lang.String trustVerificationToken) {
        this.trustVerificationToken = trustVerificationToken;
    }


    /**
     * Gets the hostAuthParams value for this HostGatewaySpec.
     * 
     * @return hostAuthParams
     */
    public com.vmware.converter.KeyValue[] getHostAuthParams() {
        return hostAuthParams;
    }


    /**
     * Sets the hostAuthParams value for this HostGatewaySpec.
     * 
     * @param hostAuthParams
     */
    public void setHostAuthParams(com.vmware.converter.KeyValue[] hostAuthParams) {
        this.hostAuthParams = hostAuthParams;
    }

    public com.vmware.converter.KeyValue getHostAuthParams(int i) {
        return this.hostAuthParams[i];
    }

    public void setHostAuthParams(int i, com.vmware.converter.KeyValue _value) {
        this.hostAuthParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostGatewaySpec)) return false;
        HostGatewaySpec other = (HostGatewaySpec) obj;
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
            ((this.trustVerificationToken==null && other.getTrustVerificationToken()==null) || 
             (this.trustVerificationToken!=null &&
              this.trustVerificationToken.equals(other.getTrustVerificationToken()))) &&
            ((this.hostAuthParams==null && other.getHostAuthParams()==null) || 
             (this.hostAuthParams!=null &&
              java.util.Arrays.equals(this.hostAuthParams, other.getHostAuthParams())));
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
        if (getTrustVerificationToken() != null) {
            _hashCode += getTrustVerificationToken().hashCode();
        }
        if (getHostAuthParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostAuthParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostAuthParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostGatewaySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostGatewaySpec"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustVerificationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trustVerificationToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAuthParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostAuthParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
