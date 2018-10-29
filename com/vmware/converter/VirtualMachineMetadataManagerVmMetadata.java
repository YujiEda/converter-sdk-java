/**
 * VirtualMachineMetadataManagerVmMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineMetadataManagerVmMetadata  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vmId;

    private java.lang.String metadata;

    public VirtualMachineMetadataManagerVmMetadata() {
    }

    public VirtualMachineMetadataManagerVmMetadata(
           java.lang.String vmId,
           java.lang.String metadata) {
        this.vmId = vmId;
        this.metadata = metadata;
    }


    /**
     * Gets the vmId value for this VirtualMachineMetadataManagerVmMetadata.
     * 
     * @return vmId
     */
    public java.lang.String getVmId() {
        return vmId;
    }


    /**
     * Sets the vmId value for this VirtualMachineMetadataManagerVmMetadata.
     * 
     * @param vmId
     */
    public void setVmId(java.lang.String vmId) {
        this.vmId = vmId;
    }


    /**
     * Gets the metadata value for this VirtualMachineMetadataManagerVmMetadata.
     * 
     * @return metadata
     */
    public java.lang.String getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this VirtualMachineMetadataManagerVmMetadata.
     * 
     * @param metadata
     */
    public void setMetadata(java.lang.String metadata) {
        this.metadata = metadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineMetadataManagerVmMetadata)) return false;
        VirtualMachineMetadataManagerVmMetadata other = (VirtualMachineMetadataManagerVmMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmId==null && other.getVmId()==null) || 
             (this.vmId!=null &&
              this.vmId.equals(other.getVmId()))) &&
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              this.metadata.equals(other.getMetadata())));
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
        if (getVmId() != null) {
            _hashCode += getVmId().hashCode();
        }
        if (getMetadata() != null) {
            _hashCode += getMetadata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineMetadataManagerVmMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMetadataManagerVmMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "metadata"));
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
