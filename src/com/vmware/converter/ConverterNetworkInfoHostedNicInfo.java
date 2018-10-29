/**
 * ConverterNetworkInfoHostedNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfoHostedNicInfo  extends com.vmware.converter.ConverterNetworkInfoNicInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType;

    public ConverterNetworkInfoHostedNicInfo() {
    }

    public ConverterNetworkInfoHostedNicInfo(
           java.lang.String nicId,
           boolean connected,
           java.lang.String label,
           com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType) {
        super(
            nicId,
            connected,
            label);
        this.connectionType = connectionType;
    }


    /**
     * Gets the connectionType value for this ConverterNetworkInfoHostedNicInfo.
     * 
     * @return connectionType
     */
    public com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this ConverterNetworkInfoHostedNicInfo.
     * 
     * @param connectionType
     */
    public void setConnectionType(com.vmware.converter.ConverterNetworkInfoHostedNicInfoConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkInfoHostedNicInfo)) return false;
        ConverterNetworkInfoHostedNicInfo other = (ConverterNetworkInfoHostedNicInfo) obj;
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
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfoHostedNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoHostedNicInfo"));
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
