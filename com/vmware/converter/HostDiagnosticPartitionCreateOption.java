/**
 * HostDiagnosticPartitionCreateOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostDiagnosticPartitionCreateOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String storageType;

    private java.lang.String diagnosticType;

    private com.vmware.converter.HostScsiDisk disk;

    public HostDiagnosticPartitionCreateOption() {
    }

    public HostDiagnosticPartitionCreateOption(
           java.lang.String storageType,
           java.lang.String diagnosticType,
           com.vmware.converter.HostScsiDisk disk) {
        this.storageType = storageType;
        this.diagnosticType = diagnosticType;
        this.disk = disk;
    }


    /**
     * Gets the storageType value for this HostDiagnosticPartitionCreateOption.
     * 
     * @return storageType
     */
    public java.lang.String getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this HostDiagnosticPartitionCreateOption.
     * 
     * @param storageType
     */
    public void setStorageType(java.lang.String storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the diagnosticType value for this HostDiagnosticPartitionCreateOption.
     * 
     * @return diagnosticType
     */
    public java.lang.String getDiagnosticType() {
        return diagnosticType;
    }


    /**
     * Sets the diagnosticType value for this HostDiagnosticPartitionCreateOption.
     * 
     * @param diagnosticType
     */
    public void setDiagnosticType(java.lang.String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }


    /**
     * Gets the disk value for this HostDiagnosticPartitionCreateOption.
     * 
     * @return disk
     */
    public com.vmware.converter.HostScsiDisk getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this HostDiagnosticPartitionCreateOption.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.HostScsiDisk disk) {
        this.disk = disk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiagnosticPartitionCreateOption)) return false;
        HostDiagnosticPartitionCreateOption other = (HostDiagnosticPartitionCreateOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storageType==null && other.getStorageType()==null) || 
             (this.storageType!=null &&
              this.storageType.equals(other.getStorageType()))) &&
            ((this.diagnosticType==null && other.getDiagnosticType()==null) || 
             (this.diagnosticType!=null &&
              this.diagnosticType.equals(other.getDiagnosticType()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              this.disk.equals(other.getDisk())));
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
        if (getStorageType() != null) {
            _hashCode += getStorageType().hashCode();
        }
        if (getDiagnosticType() != null) {
            _hashCode += getDiagnosticType().hashCode();
        }
        if (getDisk() != null) {
            _hashCode += getDisk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiagnosticPartitionCreateOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiagnosticPartitionCreateOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diagnosticType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
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
