/**
 * HostPrimaryAgentNotShortNameEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostPrimaryAgentNotShortNameEvent  extends com.vmware.converter.HostDasEvent  implements java.io.Serializable {
    private java.lang.String primaryAgent;

    public HostPrimaryAgentNotShortNameEvent() {
    }

    public HostPrimaryAgentNotShortNameEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           java.lang.String primaryAgent) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.primaryAgent = primaryAgent;
    }


    /**
     * Gets the primaryAgent value for this HostPrimaryAgentNotShortNameEvent.
     * 
     * @return primaryAgent
     */
    public java.lang.String getPrimaryAgent() {
        return primaryAgent;
    }


    /**
     * Sets the primaryAgent value for this HostPrimaryAgentNotShortNameEvent.
     * 
     * @param primaryAgent
     */
    public void setPrimaryAgent(java.lang.String primaryAgent) {
        this.primaryAgent = primaryAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostPrimaryAgentNotShortNameEvent)) return false;
        HostPrimaryAgentNotShortNameEvent other = (HostPrimaryAgentNotShortNameEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.primaryAgent==null && other.getPrimaryAgent()==null) || 
             (this.primaryAgent!=null &&
              this.primaryAgent.equals(other.getPrimaryAgent())));
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
        if (getPrimaryAgent() != null) {
            _hashCode += getPrimaryAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostPrimaryAgentNotShortNameEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPrimaryAgentNotShortNameEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
