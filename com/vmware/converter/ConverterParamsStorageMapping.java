/**
 * ConverterParamsStorageMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsStorageMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] volumeMapping;

    private com.vmware.converter.ConverterParamsStorageMappingDiskMapping[] diskMapping;

    public ConverterParamsStorageMapping() {
    }

    public ConverterParamsStorageMapping(
           com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] volumeMapping,
           com.vmware.converter.ConverterParamsStorageMappingDiskMapping[] diskMapping) {
        this.volumeMapping = volumeMapping;
        this.diskMapping = diskMapping;
    }


    /**
     * Gets the volumeMapping value for this ConverterParamsStorageMapping.
     * 
     * @return volumeMapping
     */
    public com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] getVolumeMapping() {
        return volumeMapping;
    }


    /**
     * Sets the volumeMapping value for this ConverterParamsStorageMapping.
     * 
     * @param volumeMapping
     */
    public void setVolumeMapping(com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] volumeMapping) {
        this.volumeMapping = volumeMapping;
    }

    public com.vmware.converter.ConverterParamsStorageMappingVolumeMapping getVolumeMapping(int i) {
        return this.volumeMapping[i];
    }

    public void setVolumeMapping(int i, com.vmware.converter.ConverterParamsStorageMappingVolumeMapping _value) {
        this.volumeMapping[i] = _value;
    }


    /**
     * Gets the diskMapping value for this ConverterParamsStorageMapping.
     * 
     * @return diskMapping
     */
    public com.vmware.converter.ConverterParamsStorageMappingDiskMapping[] getDiskMapping() {
        return diskMapping;
    }


    /**
     * Sets the diskMapping value for this ConverterParamsStorageMapping.
     * 
     * @param diskMapping
     */
    public void setDiskMapping(com.vmware.converter.ConverterParamsStorageMappingDiskMapping[] diskMapping) {
        this.diskMapping = diskMapping;
    }

    public com.vmware.converter.ConverterParamsStorageMappingDiskMapping getDiskMapping(int i) {
        return this.diskMapping[i];
    }

    public void setDiskMapping(int i, com.vmware.converter.ConverterParamsStorageMappingDiskMapping _value) {
        this.diskMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsStorageMapping)) return false;
        ConverterParamsStorageMapping other = (ConverterParamsStorageMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.volumeMapping==null && other.getVolumeMapping()==null) || 
             (this.volumeMapping!=null &&
              java.util.Arrays.equals(this.volumeMapping, other.getVolumeMapping()))) &&
            ((this.diskMapping==null && other.getDiskMapping()==null) || 
             (this.diskMapping!=null &&
              java.util.Arrays.equals(this.diskMapping, other.getDiskMapping())));
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
        if (getVolumeMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumeMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumeMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterParamsStorageMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingVolumeMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingDiskMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
