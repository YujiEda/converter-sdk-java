/**
 * HostEsxAgentHostManagerConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostEsxAgentHostManagerConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference agentVmDatastore;

    private com.vmware.converter.ManagedObjectReference agentVmNetwork;

    public HostEsxAgentHostManagerConfigInfo() {
    }

    public HostEsxAgentHostManagerConfigInfo(
           com.vmware.converter.ManagedObjectReference agentVmDatastore,
           com.vmware.converter.ManagedObjectReference agentVmNetwork) {
        this.agentVmDatastore = agentVmDatastore;
        this.agentVmNetwork = agentVmNetwork;
    }


    /**
     * Gets the agentVmDatastore value for this HostEsxAgentHostManagerConfigInfo.
     * 
     * @return agentVmDatastore
     */
    public com.vmware.converter.ManagedObjectReference getAgentVmDatastore() {
        return agentVmDatastore;
    }


    /**
     * Sets the agentVmDatastore value for this HostEsxAgentHostManagerConfigInfo.
     * 
     * @param agentVmDatastore
     */
    public void setAgentVmDatastore(com.vmware.converter.ManagedObjectReference agentVmDatastore) {
        this.agentVmDatastore = agentVmDatastore;
    }


    /**
     * Gets the agentVmNetwork value for this HostEsxAgentHostManagerConfigInfo.
     * 
     * @return agentVmNetwork
     */
    public com.vmware.converter.ManagedObjectReference getAgentVmNetwork() {
        return agentVmNetwork;
    }


    /**
     * Sets the agentVmNetwork value for this HostEsxAgentHostManagerConfigInfo.
     * 
     * @param agentVmNetwork
     */
    public void setAgentVmNetwork(com.vmware.converter.ManagedObjectReference agentVmNetwork) {
        this.agentVmNetwork = agentVmNetwork;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostEsxAgentHostManagerConfigInfo)) return false;
        HostEsxAgentHostManagerConfigInfo other = (HostEsxAgentHostManagerConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agentVmDatastore==null && other.getAgentVmDatastore()==null) || 
             (this.agentVmDatastore!=null &&
              this.agentVmDatastore.equals(other.getAgentVmDatastore()))) &&
            ((this.agentVmNetwork==null && other.getAgentVmNetwork()==null) || 
             (this.agentVmNetwork!=null &&
              this.agentVmNetwork.equals(other.getAgentVmNetwork())));
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
        if (getAgentVmDatastore() != null) {
            _hashCode += getAgentVmDatastore().hashCode();
        }
        if (getAgentVmNetwork() != null) {
            _hashCode += getAgentVmNetwork().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostEsxAgentHostManagerConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEsxAgentHostManagerConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentVmDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "agentVmDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentVmNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "agentVmNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
