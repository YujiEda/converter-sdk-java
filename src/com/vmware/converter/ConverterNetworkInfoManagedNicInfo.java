/**
 * ConverterNetworkInfoManagedNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfoManagedNicInfo  extends com.vmware.converter.ConverterNetworkInfoNicInfo  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String controllerType;

    public ConverterNetworkInfoManagedNicInfo() {
    }

    public ConverterNetworkInfoManagedNicInfo(
           java.lang.String nicId,
           boolean connected,
           java.lang.String label,
           java.lang.String network,
           java.lang.String controllerType) {
        super(
            nicId,
            connected,
            label);
        this.network = network;
        this.controllerType = controllerType;
    }


    /**
     * Gets the network value for this ConverterNetworkInfoManagedNicInfo.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ConverterNetworkInfoManagedNicInfo.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the controllerType value for this ConverterNetworkInfoManagedNicInfo.
     * 
     * @return controllerType
     */
    public java.lang.String getControllerType() {
        return controllerType;
    }


    /**
     * Sets the controllerType value for this ConverterNetworkInfoManagedNicInfo.
     * 
     * @param controllerType
     */
    public void setControllerType(java.lang.String controllerType) {
        this.controllerType = controllerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkInfoManagedNicInfo)) return false;
        ConverterNetworkInfoManagedNicInfo other = (ConverterNetworkInfoManagedNicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.controllerType==null && other.getControllerType()==null) || 
             (this.controllerType!=null &&
              this.controllerType.equals(other.getControllerType())));
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getControllerType() != null) {
            _hashCode += getControllerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfoManagedNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoManagedNicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "controllerType"));
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
