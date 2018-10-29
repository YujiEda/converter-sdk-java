/**
 * ConverterAgentInternalVolumeMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVolumeMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int newDiskSignature;

    private java.lang.String newDiskGuid;

    private long newPartOffset;

    private long newPartLength;

    public ConverterAgentInternalVolumeMapping() {
    }

    public ConverterAgentInternalVolumeMapping(
           int newDiskSignature,
           java.lang.String newDiskGuid,
           long newPartOffset,
           long newPartLength) {
        this.newDiskSignature = newDiskSignature;
        this.newDiskGuid = newDiskGuid;
        this.newPartOffset = newPartOffset;
        this.newPartLength = newPartLength;
    }


    /**
     * Gets the newDiskSignature value for this ConverterAgentInternalVolumeMapping.
     * 
     * @return newDiskSignature
     */
    public int getNewDiskSignature() {
        return newDiskSignature;
    }


    /**
     * Sets the newDiskSignature value for this ConverterAgentInternalVolumeMapping.
     * 
     * @param newDiskSignature
     */
    public void setNewDiskSignature(int newDiskSignature) {
        this.newDiskSignature = newDiskSignature;
    }


    /**
     * Gets the newDiskGuid value for this ConverterAgentInternalVolumeMapping.
     * 
     * @return newDiskGuid
     */
    public java.lang.String getNewDiskGuid() {
        return newDiskGuid;
    }


    /**
     * Sets the newDiskGuid value for this ConverterAgentInternalVolumeMapping.
     * 
     * @param newDiskGuid
     */
    public void setNewDiskGuid(java.lang.String newDiskGuid) {
        this.newDiskGuid = newDiskGuid;
    }


    /**
     * Gets the newPartOffset value for this ConverterAgentInternalVolumeMapping.
     * 
     * @return newPartOffset
     */
    public long getNewPartOffset() {
        return newPartOffset;
    }


    /**
     * Sets the newPartOffset value for this ConverterAgentInternalVolumeMapping.
     * 
     * @param newPartOffset
     */
    public void setNewPartOffset(long newPartOffset) {
        this.newPartOffset = newPartOffset;
    }


    /**
     * Gets the newPartLength value for this ConverterAgentInternalVolumeMapping.
     * 
     * @return newPartLength
     */
    public long getNewPartLength() {
        return newPartLength;
    }


    /**
     * Sets the newPartLength value for this ConverterAgentInternalVolumeMapping.
     * 
     * @param newPartLength
     */
    public void setNewPartLength(long newPartLength) {
        this.newPartLength = newPartLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVolumeMapping)) return false;
        ConverterAgentInternalVolumeMapping other = (ConverterAgentInternalVolumeMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.newDiskSignature == other.getNewDiskSignature() &&
            ((this.newDiskGuid==null && other.getNewDiskGuid()==null) || 
             (this.newDiskGuid!=null &&
              this.newDiskGuid.equals(other.getNewDiskGuid()))) &&
            this.newPartOffset == other.getNewPartOffset() &&
            this.newPartLength == other.getNewPartLength();
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
        _hashCode += getNewDiskSignature();
        if (getNewDiskGuid() != null) {
            _hashCode += getNewDiskGuid().hashCode();
        }
        _hashCode += new Long(getNewPartOffset()).hashCode();
        _hashCode += new Long(getNewPartLength()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVolumeMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVolumeMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDiskSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newDiskSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDiskGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newDiskGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPartOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newPartOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPartLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newPartLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
