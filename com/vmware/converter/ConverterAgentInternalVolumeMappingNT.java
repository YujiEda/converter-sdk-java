/**
 * ConverterAgentInternalVolumeMappingNT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVolumeMappingNT  extends com.vmware.converter.ConverterAgentInternalVolumeMapping  implements java.io.Serializable {
    private int origDiskSignature;

    private long origPartOffset;

    private long origPartLength;

    public ConverterAgentInternalVolumeMappingNT() {
    }

    public ConverterAgentInternalVolumeMappingNT(
           int newDiskSignature,
           java.lang.String newDiskGuid,
           long newPartOffset,
           long newPartLength,
           int origDiskSignature,
           long origPartOffset,
           long origPartLength) {
        super(
            newDiskSignature,
            newDiskGuid,
            newPartOffset,
            newPartLength);
        this.origDiskSignature = origDiskSignature;
        this.origPartOffset = origPartOffset;
        this.origPartLength = origPartLength;
    }


    /**
     * Gets the origDiskSignature value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @return origDiskSignature
     */
    public int getOrigDiskSignature() {
        return origDiskSignature;
    }


    /**
     * Sets the origDiskSignature value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @param origDiskSignature
     */
    public void setOrigDiskSignature(int origDiskSignature) {
        this.origDiskSignature = origDiskSignature;
    }


    /**
     * Gets the origPartOffset value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @return origPartOffset
     */
    public long getOrigPartOffset() {
        return origPartOffset;
    }


    /**
     * Sets the origPartOffset value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @param origPartOffset
     */
    public void setOrigPartOffset(long origPartOffset) {
        this.origPartOffset = origPartOffset;
    }


    /**
     * Gets the origPartLength value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @return origPartLength
     */
    public long getOrigPartLength() {
        return origPartLength;
    }


    /**
     * Sets the origPartLength value for this ConverterAgentInternalVolumeMappingNT.
     * 
     * @param origPartLength
     */
    public void setOrigPartLength(long origPartLength) {
        this.origPartLength = origPartLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVolumeMappingNT)) return false;
        ConverterAgentInternalVolumeMappingNT other = (ConverterAgentInternalVolumeMappingNT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.origDiskSignature == other.getOrigDiskSignature() &&
            this.origPartOffset == other.getOrigPartOffset() &&
            this.origPartLength == other.getOrigPartLength();
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
        _hashCode += getOrigDiskSignature();
        _hashCode += new Long(getOrigPartOffset()).hashCode();
        _hashCode += new Long(getOrigPartLength()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVolumeMappingNT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVolumeMappingNT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origDiskSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "origDiskSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origPartOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "origPartOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origPartLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "origPartLength"));
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
