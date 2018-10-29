/**
 * GatewayToHostAuthFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GatewayToHostAuthFault  extends com.vmware.converter.GatewayToHostConnectFault  implements java.io.Serializable {
    private java.lang.String[] invalidProperties;

    private java.lang.String[] missingProperties;

    public GatewayToHostAuthFault() {
    }

    public GatewayToHostAuthFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String gatewayType,
           java.lang.String gatewayId,
           java.lang.String gatewayInfo,
           com.vmware.converter.LocalizableMessage details,
           java.lang.String hostname,
           java.lang.Integer port,
           java.lang.String[] invalidProperties,
           java.lang.String[] missingProperties) {
        super(
            faultCause,
            faultMessage,
            gatewayType,
            gatewayId,
            gatewayInfo,
            details,
            hostname,
            port);
        this.invalidProperties = invalidProperties;
        this.missingProperties = missingProperties;
    }


    /**
     * Gets the invalidProperties value for this GatewayToHostAuthFault.
     * 
     * @return invalidProperties
     */
    public java.lang.String[] getInvalidProperties() {
        return invalidProperties;
    }


    /**
     * Sets the invalidProperties value for this GatewayToHostAuthFault.
     * 
     * @param invalidProperties
     */
    public void setInvalidProperties(java.lang.String[] invalidProperties) {
        this.invalidProperties = invalidProperties;
    }

    public java.lang.String getInvalidProperties(int i) {
        return this.invalidProperties[i];
    }

    public void setInvalidProperties(int i, java.lang.String _value) {
        this.invalidProperties[i] = _value;
    }


    /**
     * Gets the missingProperties value for this GatewayToHostAuthFault.
     * 
     * @return missingProperties
     */
    public java.lang.String[] getMissingProperties() {
        return missingProperties;
    }


    /**
     * Sets the missingProperties value for this GatewayToHostAuthFault.
     * 
     * @param missingProperties
     */
    public void setMissingProperties(java.lang.String[] missingProperties) {
        this.missingProperties = missingProperties;
    }

    public java.lang.String getMissingProperties(int i) {
        return this.missingProperties[i];
    }

    public void setMissingProperties(int i, java.lang.String _value) {
        this.missingProperties[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayToHostAuthFault)) return false;
        GatewayToHostAuthFault other = (GatewayToHostAuthFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invalidProperties==null && other.getInvalidProperties()==null) || 
             (this.invalidProperties!=null &&
              java.util.Arrays.equals(this.invalidProperties, other.getInvalidProperties()))) &&
            ((this.missingProperties==null && other.getMissingProperties()==null) || 
             (this.missingProperties!=null &&
              java.util.Arrays.equals(this.missingProperties, other.getMissingProperties())));
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
        if (getInvalidProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissingProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingProperties(), i);
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
        new org.apache.axis.description.TypeDesc(GatewayToHostAuthFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GatewayToHostAuthFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "invalidProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "missingProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
