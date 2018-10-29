/**
 * ConverterAgentInternalLegacyPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalLegacyPartition  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int partitionNumber;

    private int firstSector;

    private int lengthInSectors;

    private boolean empty;

    private java.lang.Byte typeId;

    private java.lang.String partitionGuid;

    private java.lang.String partitionUuid;

    private boolean logical;

    private boolean active;

    public ConverterAgentInternalLegacyPartition() {
    }

    public ConverterAgentInternalLegacyPartition(
           int partitionNumber,
           int firstSector,
           int lengthInSectors,
           boolean empty,
           java.lang.Byte typeId,
           java.lang.String partitionGuid,
           java.lang.String partitionUuid,
           boolean logical,
           boolean active) {
        this.partitionNumber = partitionNumber;
        this.firstSector = firstSector;
        this.lengthInSectors = lengthInSectors;
        this.empty = empty;
        this.typeId = typeId;
        this.partitionGuid = partitionGuid;
        this.partitionUuid = partitionUuid;
        this.logical = logical;
        this.active = active;
    }


    /**
     * Gets the partitionNumber value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return partitionNumber
     */
    public int getPartitionNumber() {
        return partitionNumber;
    }


    /**
     * Sets the partitionNumber value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param partitionNumber
     */
    public void setPartitionNumber(int partitionNumber) {
        this.partitionNumber = partitionNumber;
    }


    /**
     * Gets the firstSector value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return firstSector
     */
    public int getFirstSector() {
        return firstSector;
    }


    /**
     * Sets the firstSector value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param firstSector
     */
    public void setFirstSector(int firstSector) {
        this.firstSector = firstSector;
    }


    /**
     * Gets the lengthInSectors value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return lengthInSectors
     */
    public int getLengthInSectors() {
        return lengthInSectors;
    }


    /**
     * Sets the lengthInSectors value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param lengthInSectors
     */
    public void setLengthInSectors(int lengthInSectors) {
        this.lengthInSectors = lengthInSectors;
    }


    /**
     * Gets the empty value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return empty
     */
    public boolean isEmpty() {
        return empty;
    }


    /**
     * Sets the empty value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param empty
     */
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }


    /**
     * Gets the typeId value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return typeId
     */
    public java.lang.Byte getTypeId() {
        return typeId;
    }


    /**
     * Sets the typeId value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param typeId
     */
    public void setTypeId(java.lang.Byte typeId) {
        this.typeId = typeId;
    }


    /**
     * Gets the partitionGuid value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return partitionGuid
     */
    public java.lang.String getPartitionGuid() {
        return partitionGuid;
    }


    /**
     * Sets the partitionGuid value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param partitionGuid
     */
    public void setPartitionGuid(java.lang.String partitionGuid) {
        this.partitionGuid = partitionGuid;
    }


    /**
     * Gets the partitionUuid value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return partitionUuid
     */
    public java.lang.String getPartitionUuid() {
        return partitionUuid;
    }


    /**
     * Sets the partitionUuid value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param partitionUuid
     */
    public void setPartitionUuid(java.lang.String partitionUuid) {
        this.partitionUuid = partitionUuid;
    }


    /**
     * Gets the logical value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return logical
     */
    public boolean isLogical() {
        return logical;
    }


    /**
     * Sets the logical value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param logical
     */
    public void setLogical(boolean logical) {
        this.logical = logical;
    }


    /**
     * Gets the active value for this ConverterAgentInternalLegacyPartition.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ConverterAgentInternalLegacyPartition.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalLegacyPartition)) return false;
        ConverterAgentInternalLegacyPartition other = (ConverterAgentInternalLegacyPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.partitionNumber == other.getPartitionNumber() &&
            this.firstSector == other.getFirstSector() &&
            this.lengthInSectors == other.getLengthInSectors() &&
            this.empty == other.isEmpty() &&
            ((this.typeId==null && other.getTypeId()==null) || 
             (this.typeId!=null &&
              this.typeId.equals(other.getTypeId()))) &&
            ((this.partitionGuid==null && other.getPartitionGuid()==null) || 
             (this.partitionGuid!=null &&
              this.partitionGuid.equals(other.getPartitionGuid()))) &&
            ((this.partitionUuid==null && other.getPartitionUuid()==null) || 
             (this.partitionUuid!=null &&
              this.partitionUuid.equals(other.getPartitionUuid()))) &&
            this.logical == other.isLogical() &&
            this.active == other.isActive();
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
        _hashCode += getPartitionNumber();
        _hashCode += getFirstSector();
        _hashCode += getLengthInSectors();
        _hashCode += (isEmpty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTypeId() != null) {
            _hashCode += getTypeId().hashCode();
        }
        if (getPartitionGuid() != null) {
            _hashCode += getPartitionGuid().hashCode();
        }
        if (getPartitionUuid() != null) {
            _hashCode += getPartitionUuid().hashCode();
        }
        _hashCode += (isLogical() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalLegacyPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLegacyPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "firstSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lengthInSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lengthInSectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "empty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "typeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "logical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
