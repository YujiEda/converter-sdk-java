/**
 * OpaqueNetworkTargetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OpaqueNetworkTargetInfo  extends com.vmware.converter.VirtualMachineTargetInfo  implements java.io.Serializable {
    private com.vmware.converter.OpaqueNetworkSummary network;

    private java.lang.Boolean networkReservationSupported;

    public OpaqueNetworkTargetInfo() {
    }

    public OpaqueNetworkTargetInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           com.vmware.converter.OpaqueNetworkSummary network,
           java.lang.Boolean networkReservationSupported) {
        super(
            name,
            configurationTag);
        this.network = network;
        this.networkReservationSupported = networkReservationSupported;
    }


    /**
     * Gets the network value for this OpaqueNetworkTargetInfo.
     * 
     * @return network
     */
    public com.vmware.converter.OpaqueNetworkSummary getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this OpaqueNetworkTargetInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.OpaqueNetworkSummary network) {
        this.network = network;
    }


    /**
     * Gets the networkReservationSupported value for this OpaqueNetworkTargetInfo.
     * 
     * @return networkReservationSupported
     */
    public java.lang.Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }


    /**
     * Sets the networkReservationSupported value for this OpaqueNetworkTargetInfo.
     * 
     * @param networkReservationSupported
     */
    public void setNetworkReservationSupported(java.lang.Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpaqueNetworkTargetInfo)) return false;
        OpaqueNetworkTargetInfo other = (OpaqueNetworkTargetInfo) obj;
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
            ((this.networkReservationSupported==null && other.getNetworkReservationSupported()==null) || 
             (this.networkReservationSupported!=null &&
              this.networkReservationSupported.equals(other.getNetworkReservationSupported())));
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
        if (getNetworkReservationSupported() != null) {
            _hashCode += getNetworkReservationSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpaqueNetworkTargetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OpaqueNetworkTargetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OpaqueNetworkSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkReservationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkReservationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
