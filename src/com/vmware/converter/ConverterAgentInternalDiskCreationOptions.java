/**
 * ConverterAgentInternalDiskCreationOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskCreationOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String diskType;

    private boolean preallocateDisks;

    private int virtualHWVersion;

    private java.lang.String adapterType;

    public ConverterAgentInternalDiskCreationOptions() {
    }

    public ConverterAgentInternalDiskCreationOptions(
           java.lang.String diskType,
           boolean preallocateDisks,
           int virtualHWVersion,
           java.lang.String adapterType) {
        this.diskType = diskType;
        this.preallocateDisks = preallocateDisks;
        this.virtualHWVersion = virtualHWVersion;
        this.adapterType = adapterType;
    }


    /**
     * Gets the diskType value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @return diskType
     */
    public java.lang.String getDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @param diskType
     */
    public void setDiskType(java.lang.String diskType) {
        this.diskType = diskType;
    }


    /**
     * Gets the preallocateDisks value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @return preallocateDisks
     */
    public boolean isPreallocateDisks() {
        return preallocateDisks;
    }


    /**
     * Sets the preallocateDisks value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @param preallocateDisks
     */
    public void setPreallocateDisks(boolean preallocateDisks) {
        this.preallocateDisks = preallocateDisks;
    }


    /**
     * Gets the virtualHWVersion value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @return virtualHWVersion
     */
    public int getVirtualHWVersion() {
        return virtualHWVersion;
    }


    /**
     * Sets the virtualHWVersion value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @param virtualHWVersion
     */
    public void setVirtualHWVersion(int virtualHWVersion) {
        this.virtualHWVersion = virtualHWVersion;
    }


    /**
     * Gets the adapterType value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @return adapterType
     */
    public java.lang.String getAdapterType() {
        return adapterType;
    }


    /**
     * Sets the adapterType value for this ConverterAgentInternalDiskCreationOptions.
     * 
     * @param adapterType
     */
    public void setAdapterType(java.lang.String adapterType) {
        this.adapterType = adapterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDiskCreationOptions)) return false;
        ConverterAgentInternalDiskCreationOptions other = (ConverterAgentInternalDiskCreationOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskType==null && other.getDiskType()==null) || 
             (this.diskType!=null &&
              this.diskType.equals(other.getDiskType()))) &&
            this.preallocateDisks == other.isPreallocateDisks() &&
            this.virtualHWVersion == other.getVirtualHWVersion() &&
            ((this.adapterType==null && other.getAdapterType()==null) || 
             (this.adapterType!=null &&
              this.adapterType.equals(other.getAdapterType())));
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
        if (getDiskType() != null) {
            _hashCode += getDiskType().hashCode();
        }
        _hashCode += (isPreallocateDisks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getVirtualHWVersion();
        if (getAdapterType() != null) {
            _hashCode += getAdapterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskCreationOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskCreationOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preallocateDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preallocateDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualHWVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "virtualHWVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "adapterType"));
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
