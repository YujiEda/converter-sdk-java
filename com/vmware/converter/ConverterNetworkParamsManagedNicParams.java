/**
 * ConverterNetworkParamsManagedNicParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkParamsManagedNicParams  extends com.vmware.converter.ConverterNetworkParamsNicParams  implements java.io.Serializable {
    private java.lang.String networkName;

    private java.lang.String nicControllerType;

    public ConverterNetworkParamsManagedNicParams() {
    }

    public ConverterNetworkParamsManagedNicParams(
           java.lang.Boolean connected,
           java.lang.String networkName,
           java.lang.String nicControllerType) {
        super(
            connected);
        this.networkName = networkName;
        this.nicControllerType = nicControllerType;
    }


    /**
     * Gets the networkName value for this ConverterNetworkParamsManagedNicParams.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this ConverterNetworkParamsManagedNicParams.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the nicControllerType value for this ConverterNetworkParamsManagedNicParams.
     * 
     * @return nicControllerType
     */
    public java.lang.String getNicControllerType() {
        return nicControllerType;
    }


    /**
     * Sets the nicControllerType value for this ConverterNetworkParamsManagedNicParams.
     * 
     * @param nicControllerType
     */
    public void setNicControllerType(java.lang.String nicControllerType) {
        this.nicControllerType = nicControllerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkParamsManagedNicParams)) return false;
        ConverterNetworkParamsManagedNicParams other = (ConverterNetworkParamsManagedNicParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.nicControllerType==null && other.getNicControllerType()==null) || 
             (this.nicControllerType!=null &&
              this.nicControllerType.equals(other.getNicControllerType())));
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
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getNicControllerType() != null) {
            _hashCode += getNicControllerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNetworkParamsManagedNicParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParamsManagedNicParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicControllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nicControllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
