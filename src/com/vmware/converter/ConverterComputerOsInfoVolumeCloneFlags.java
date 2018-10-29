/**
 * ConverterComputerOsInfoVolumeCloneFlags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoVolumeCloneFlags  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long minSizeInBytes;

    private boolean canBeSkipped;

    private boolean canBeResized;

    private boolean canBeMovedToAnotherDisk;

    private java.lang.Boolean canChangeClusterSize;

    private java.lang.Boolean canChangeType;

    public ConverterComputerOsInfoVolumeCloneFlags() {
    }

    public ConverterComputerOsInfoVolumeCloneFlags(
           long minSizeInBytes,
           boolean canBeSkipped,
           boolean canBeResized,
           boolean canBeMovedToAnotherDisk,
           java.lang.Boolean canChangeClusterSize,
           java.lang.Boolean canChangeType) {
        this.minSizeInBytes = minSizeInBytes;
        this.canBeSkipped = canBeSkipped;
        this.canBeResized = canBeResized;
        this.canBeMovedToAnotherDisk = canBeMovedToAnotherDisk;
        this.canChangeClusterSize = canChangeClusterSize;
        this.canChangeType = canChangeType;
    }


    /**
     * Gets the minSizeInBytes value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return minSizeInBytes
     */
    public long getMinSizeInBytes() {
        return minSizeInBytes;
    }


    /**
     * Sets the minSizeInBytes value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param minSizeInBytes
     */
    public void setMinSizeInBytes(long minSizeInBytes) {
        this.minSizeInBytes = minSizeInBytes;
    }


    /**
     * Gets the canBeSkipped value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return canBeSkipped
     */
    public boolean isCanBeSkipped() {
        return canBeSkipped;
    }


    /**
     * Sets the canBeSkipped value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param canBeSkipped
     */
    public void setCanBeSkipped(boolean canBeSkipped) {
        this.canBeSkipped = canBeSkipped;
    }


    /**
     * Gets the canBeResized value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return canBeResized
     */
    public boolean isCanBeResized() {
        return canBeResized;
    }


    /**
     * Sets the canBeResized value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param canBeResized
     */
    public void setCanBeResized(boolean canBeResized) {
        this.canBeResized = canBeResized;
    }


    /**
     * Gets the canBeMovedToAnotherDisk value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return canBeMovedToAnotherDisk
     */
    public boolean isCanBeMovedToAnotherDisk() {
        return canBeMovedToAnotherDisk;
    }


    /**
     * Sets the canBeMovedToAnotherDisk value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param canBeMovedToAnotherDisk
     */
    public void setCanBeMovedToAnotherDisk(boolean canBeMovedToAnotherDisk) {
        this.canBeMovedToAnotherDisk = canBeMovedToAnotherDisk;
    }


    /**
     * Gets the canChangeClusterSize value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return canChangeClusterSize
     */
    public java.lang.Boolean getCanChangeClusterSize() {
        return canChangeClusterSize;
    }


    /**
     * Sets the canChangeClusterSize value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param canChangeClusterSize
     */
    public void setCanChangeClusterSize(java.lang.Boolean canChangeClusterSize) {
        this.canChangeClusterSize = canChangeClusterSize;
    }


    /**
     * Gets the canChangeType value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @return canChangeType
     */
    public java.lang.Boolean getCanChangeType() {
        return canChangeType;
    }


    /**
     * Sets the canChangeType value for this ConverterComputerOsInfoVolumeCloneFlags.
     * 
     * @param canChangeType
     */
    public void setCanChangeType(java.lang.Boolean canChangeType) {
        this.canChangeType = canChangeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerOsInfoVolumeCloneFlags)) return false;
        ConverterComputerOsInfoVolumeCloneFlags other = (ConverterComputerOsInfoVolumeCloneFlags) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.minSizeInBytes == other.getMinSizeInBytes() &&
            this.canBeSkipped == other.isCanBeSkipped() &&
            this.canBeResized == other.isCanBeResized() &&
            this.canBeMovedToAnotherDisk == other.isCanBeMovedToAnotherDisk() &&
            ((this.canChangeClusterSize==null && other.getCanChangeClusterSize()==null) || 
             (this.canChangeClusterSize!=null &&
              this.canChangeClusterSize.equals(other.getCanChangeClusterSize()))) &&
            ((this.canChangeType==null && other.getCanChangeType()==null) || 
             (this.canChangeType!=null &&
              this.canChangeType.equals(other.getCanChangeType())));
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
        _hashCode += new Long(getMinSizeInBytes()).hashCode();
        _hashCode += (isCanBeSkipped() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanBeResized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanBeMovedToAnotherDisk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCanChangeClusterSize() != null) {
            _hashCode += getCanChangeClusterSize().hashCode();
        }
        if (getCanChangeType() != null) {
            _hashCode += getCanChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoVolumeCloneFlags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoVolumeCloneFlags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSizeInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "minSizeInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canBeSkipped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canBeSkipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canBeResized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canBeResized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canBeMovedToAnotherDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canBeMovedToAnotherDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canChangeClusterSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canChangeClusterSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canChangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canChangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
