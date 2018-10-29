/**
 * VirtualEthernetCardNetworkBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualEthernetCardNetworkBackingInfo  extends com.vmware.converter.VirtualDeviceDeviceBackingInfo  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference network;

    private java.lang.Boolean inPassthroughMode;

    public VirtualEthernetCardNetworkBackingInfo() {
    }

    public VirtualEthernetCardNetworkBackingInfo(
           java.lang.String deviceName,
           java.lang.Boolean useAutoDetect,
           com.vmware.converter.ManagedObjectReference network,
           java.lang.Boolean inPassthroughMode) {
        super(
            deviceName,
            useAutoDetect);
        this.network = network;
        this.inPassthroughMode = inPassthroughMode;
    }


    /**
     * Gets the network value for this VirtualEthernetCardNetworkBackingInfo.
     * 
     * @return network
     */
    public com.vmware.converter.ManagedObjectReference getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this VirtualEthernetCardNetworkBackingInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.ManagedObjectReference network) {
        this.network = network;
    }


    /**
     * Gets the inPassthroughMode value for this VirtualEthernetCardNetworkBackingInfo.
     * 
     * @return inPassthroughMode
     */
    public java.lang.Boolean getInPassthroughMode() {
        return inPassthroughMode;
    }


    /**
     * Sets the inPassthroughMode value for this VirtualEthernetCardNetworkBackingInfo.
     * 
     * @param inPassthroughMode
     */
    public void setInPassthroughMode(java.lang.Boolean inPassthroughMode) {
        this.inPassthroughMode = inPassthroughMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualEthernetCardNetworkBackingInfo)) return false;
        VirtualEthernetCardNetworkBackingInfo other = (VirtualEthernetCardNetworkBackingInfo) obj;
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
            ((this.inPassthroughMode==null && other.getInPassthroughMode()==null) || 
             (this.inPassthroughMode!=null &&
              this.inPassthroughMode.equals(other.getInPassthroughMode())));
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
        if (getInPassthroughMode() != null) {
            _hashCode += getInPassthroughMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualEthernetCardNetworkBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualEthernetCardNetworkBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPassthroughMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inPassthroughMode"));
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
