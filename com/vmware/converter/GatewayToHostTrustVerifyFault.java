/**
 * GatewayToHostTrustVerifyFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GatewayToHostTrustVerifyFault  extends com.vmware.converter.GatewayToHostConnectFault  implements java.io.Serializable {
    private java.lang.String verificationToken;

    private com.vmware.converter.KeyValue[] propertiesToVerify;

    public GatewayToHostTrustVerifyFault() {
    }

    public GatewayToHostTrustVerifyFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String gatewayType,
           java.lang.String gatewayId,
           java.lang.String gatewayInfo,
           com.vmware.converter.LocalizableMessage details,
           java.lang.String hostname,
           java.lang.Integer port,
           java.lang.String verificationToken,
           com.vmware.converter.KeyValue[] propertiesToVerify) {
        super(
            faultCause,
            faultMessage,
            gatewayType,
            gatewayId,
            gatewayInfo,
            details,
            hostname,
            port);
        this.verificationToken = verificationToken;
        this.propertiesToVerify = propertiesToVerify;
    }


    /**
     * Gets the verificationToken value for this GatewayToHostTrustVerifyFault.
     * 
     * @return verificationToken
     */
    public java.lang.String getVerificationToken() {
        return verificationToken;
    }


    /**
     * Sets the verificationToken value for this GatewayToHostTrustVerifyFault.
     * 
     * @param verificationToken
     */
    public void setVerificationToken(java.lang.String verificationToken) {
        this.verificationToken = verificationToken;
    }


    /**
     * Gets the propertiesToVerify value for this GatewayToHostTrustVerifyFault.
     * 
     * @return propertiesToVerify
     */
    public com.vmware.converter.KeyValue[] getPropertiesToVerify() {
        return propertiesToVerify;
    }


    /**
     * Sets the propertiesToVerify value for this GatewayToHostTrustVerifyFault.
     * 
     * @param propertiesToVerify
     */
    public void setPropertiesToVerify(com.vmware.converter.KeyValue[] propertiesToVerify) {
        this.propertiesToVerify = propertiesToVerify;
    }

    public com.vmware.converter.KeyValue getPropertiesToVerify(int i) {
        return this.propertiesToVerify[i];
    }

    public void setPropertiesToVerify(int i, com.vmware.converter.KeyValue _value) {
        this.propertiesToVerify[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayToHostTrustVerifyFault)) return false;
        GatewayToHostTrustVerifyFault other = (GatewayToHostTrustVerifyFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.verificationToken==null && other.getVerificationToken()==null) || 
             (this.verificationToken!=null &&
              this.verificationToken.equals(other.getVerificationToken()))) &&
            ((this.propertiesToVerify==null && other.getPropertiesToVerify()==null) || 
             (this.propertiesToVerify!=null &&
              java.util.Arrays.equals(this.propertiesToVerify, other.getPropertiesToVerify())));
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
        if (getVerificationToken() != null) {
            _hashCode += getVerificationToken().hashCode();
        }
        if (getPropertiesToVerify() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertiesToVerify());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertiesToVerify(), i);
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
        new org.apache.axis.description.TypeDesc(GatewayToHostTrustVerifyFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GatewayToHostTrustVerifyFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "verificationToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertiesToVerify");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertiesToVerify"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
