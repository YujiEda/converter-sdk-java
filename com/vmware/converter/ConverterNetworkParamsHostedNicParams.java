/**
 * ConverterNetworkParamsHostedNicParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkParamsHostedNicParams  extends com.vmware.converter.ConverterNetworkParamsNicParams  implements java.io.Serializable {
    private com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType;

    public ConverterNetworkParamsHostedNicParams() {
    }

    public ConverterNetworkParamsHostedNicParams(
           java.lang.Boolean connected,
           com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType) {
        super(
            connected);
        this.connectionType = connectionType;
    }


    /**
     * Gets the connectionType value for this ConverterNetworkParamsHostedNicParams.
     * 
     * @return connectionType
     */
    public com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this ConverterNetworkParamsHostedNicParams.
     * 
     * @param connectionType
     */
    public void setConnectionType(com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkParamsHostedNicParams)) return false;
        ConverterNetworkParamsHostedNicParams other = (ConverterNetworkParamsHostedNicParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType())));
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
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNetworkParamsHostedNicParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParamsHostedNicParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoHostedNicInfoConnectionType"));
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
