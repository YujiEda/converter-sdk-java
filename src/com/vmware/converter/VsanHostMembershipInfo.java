/**
 * VsanHostMembershipInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostMembershipInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String nodeUuid;

    private java.lang.String hostname;

    public VsanHostMembershipInfo() {
    }

    public VsanHostMembershipInfo(
           java.lang.String nodeUuid,
           java.lang.String hostname) {
        this.nodeUuid = nodeUuid;
        this.hostname = hostname;
    }


    /**
     * Gets the nodeUuid value for this VsanHostMembershipInfo.
     * 
     * @return nodeUuid
     */
    public java.lang.String getNodeUuid() {
        return nodeUuid;
    }


    /**
     * Sets the nodeUuid value for this VsanHostMembershipInfo.
     * 
     * @param nodeUuid
     */
    public void setNodeUuid(java.lang.String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }


    /**
     * Gets the hostname value for this VsanHostMembershipInfo.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this VsanHostMembershipInfo.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostMembershipInfo)) return false;
        VsanHostMembershipInfo other = (VsanHostMembershipInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nodeUuid==null && other.getNodeUuid()==null) || 
             (this.nodeUuid!=null &&
              this.nodeUuid.equals(other.getNodeUuid()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname())));
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
        if (getNodeUuid() != null) {
            _hashCode += getNodeUuid().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostMembershipInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostMembershipInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostname"));
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
