/**
 * DvsMacNetworkRuleQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsMacNetworkRuleQualifier  extends com.vmware.converter.DvsNetworkRuleQualifier  implements java.io.Serializable {
    private com.vmware.converter.MacAddress sourceAddress;

    private com.vmware.converter.MacAddress destinationAddress;

    private com.vmware.converter.IntExpression protocol;

    private com.vmware.converter.IntExpression vlanId;

    public DvsMacNetworkRuleQualifier() {
    }

    public DvsMacNetworkRuleQualifier(
           java.lang.String key,
           com.vmware.converter.MacAddress sourceAddress,
           com.vmware.converter.MacAddress destinationAddress,
           com.vmware.converter.IntExpression protocol,
           com.vmware.converter.IntExpression vlanId) {
        super(
            key);
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.protocol = protocol;
        this.vlanId = vlanId;
    }


    /**
     * Gets the sourceAddress value for this DvsMacNetworkRuleQualifier.
     * 
     * @return sourceAddress
     */
    public com.vmware.converter.MacAddress getSourceAddress() {
        return sourceAddress;
    }


    /**
     * Sets the sourceAddress value for this DvsMacNetworkRuleQualifier.
     * 
     * @param sourceAddress
     */
    public void setSourceAddress(com.vmware.converter.MacAddress sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    /**
     * Gets the destinationAddress value for this DvsMacNetworkRuleQualifier.
     * 
     * @return destinationAddress
     */
    public com.vmware.converter.MacAddress getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this DvsMacNetworkRuleQualifier.
     * 
     * @param destinationAddress
     */
    public void setDestinationAddress(com.vmware.converter.MacAddress destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the protocol value for this DvsMacNetworkRuleQualifier.
     * 
     * @return protocol
     */
    public com.vmware.converter.IntExpression getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this DvsMacNetworkRuleQualifier.
     * 
     * @param protocol
     */
    public void setProtocol(com.vmware.converter.IntExpression protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the vlanId value for this DvsMacNetworkRuleQualifier.
     * 
     * @return vlanId
     */
    public com.vmware.converter.IntExpression getVlanId() {
        return vlanId;
    }


    /**
     * Sets the vlanId value for this DvsMacNetworkRuleQualifier.
     * 
     * @param vlanId
     */
    public void setVlanId(com.vmware.converter.IntExpression vlanId) {
        this.vlanId = vlanId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsMacNetworkRuleQualifier)) return false;
        DvsMacNetworkRuleQualifier other = (DvsMacNetworkRuleQualifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceAddress==null && other.getSourceAddress()==null) || 
             (this.sourceAddress!=null &&
              this.sourceAddress.equals(other.getSourceAddress()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.vlanId==null && other.getVlanId()==null) || 
             (this.vlanId!=null &&
              this.vlanId.equals(other.getVlanId())));
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
        if (getSourceAddress() != null) {
            _hashCode += getSourceAddress().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getVlanId() != null) {
            _hashCode += getVlanId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsMacNetworkRuleQualifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsMacNetworkRuleQualifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MacAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MacAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntExpression"));
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
