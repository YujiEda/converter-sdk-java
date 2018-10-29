/**
 * VsanHostConfigInfoClusterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostConfigInfoClusterInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private java.lang.String nodeUuid;

    public VsanHostConfigInfoClusterInfo() {
    }

    public VsanHostConfigInfoClusterInfo(
           java.lang.String uuid,
           java.lang.String nodeUuid) {
        this.uuid = uuid;
        this.nodeUuid = nodeUuid;
    }


    /**
     * Gets the uuid value for this VsanHostConfigInfoClusterInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VsanHostConfigInfoClusterInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the nodeUuid value for this VsanHostConfigInfoClusterInfo.
     * 
     * @return nodeUuid
     */
    public java.lang.String getNodeUuid() {
        return nodeUuid;
    }


    /**
     * Sets the nodeUuid value for this VsanHostConfigInfoClusterInfo.
     * 
     * @param nodeUuid
     */
    public void setNodeUuid(java.lang.String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostConfigInfoClusterInfo)) return false;
        VsanHostConfigInfoClusterInfo other = (VsanHostConfigInfoClusterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.nodeUuid==null && other.getNodeUuid()==null) || 
             (this.nodeUuid!=null &&
              this.nodeUuid.equals(other.getNodeUuid())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getNodeUuid() != null) {
            _hashCode += getNodeUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostConfigInfoClusterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoClusterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeUuid"));
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
