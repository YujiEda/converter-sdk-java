/**
 * VirtualDiskSparseVer2BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskSparseVer2BackingOption  extends com.vmware.converter.VirtualDeviceFileBackingOption  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption diskMode;

    private com.vmware.converter.BoolOption split;

    private com.vmware.converter.BoolOption writeThrough;

    private boolean growable;

    private boolean hotGrowable;

    private boolean uuid;

    public VirtualDiskSparseVer2BackingOption() {
    }

    public VirtualDiskSparseVer2BackingOption(
           java.lang.String type,
           com.vmware.converter.ChoiceOption fileNameExtensions,
           com.vmware.converter.ChoiceOption diskMode,
           com.vmware.converter.BoolOption split,
           com.vmware.converter.BoolOption writeThrough,
           boolean growable,
           boolean hotGrowable,
           boolean uuid) {
        super(
            type,
            fileNameExtensions);
        this.diskMode = diskMode;
        this.split = split;
        this.writeThrough = writeThrough;
        this.growable = growable;
        this.hotGrowable = hotGrowable;
        this.uuid = uuid;
    }


    /**
     * Gets the diskMode value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return diskMode
     */
    public com.vmware.converter.ChoiceOption getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param diskMode
     */
    public void setDiskMode(com.vmware.converter.ChoiceOption diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the split value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return split
     */
    public com.vmware.converter.BoolOption getSplit() {
        return split;
    }


    /**
     * Sets the split value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param split
     */
    public void setSplit(com.vmware.converter.BoolOption split) {
        this.split = split;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return writeThrough
     */
    public com.vmware.converter.BoolOption getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(com.vmware.converter.BoolOption writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the growable value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return growable
     */
    public boolean isGrowable() {
        return growable;
    }


    /**
     * Sets the growable value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param growable
     */
    public void setGrowable(boolean growable) {
        this.growable = growable;
    }


    /**
     * Gets the hotGrowable value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return hotGrowable
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }


    /**
     * Sets the hotGrowable value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param hotGrowable
     */
    public void setHotGrowable(boolean hotGrowable) {
        this.hotGrowable = hotGrowable;
    }


    /**
     * Gets the uuid value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @return uuid
     */
    public boolean isUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskSparseVer2BackingOption.
     * 
     * @param uuid
     */
    public void setUuid(boolean uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskSparseVer2BackingOption)) return false;
        VirtualDiskSparseVer2BackingOption other = (VirtualDiskSparseVer2BackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskMode==null && other.getDiskMode()==null) || 
             (this.diskMode!=null &&
              this.diskMode.equals(other.getDiskMode()))) &&
            ((this.split==null && other.getSplit()==null) || 
             (this.split!=null &&
              this.split.equals(other.getSplit()))) &&
            ((this.writeThrough==null && other.getWriteThrough()==null) || 
             (this.writeThrough!=null &&
              this.writeThrough.equals(other.getWriteThrough()))) &&
            this.growable == other.isGrowable() &&
            this.hotGrowable == other.isHotGrowable() &&
            this.uuid == other.isUuid();
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
        if (getDiskMode() != null) {
            _hashCode += getDiskMode().hashCode();
        }
        if (getSplit() != null) {
            _hashCode += getSplit().hashCode();
        }
        if (getWriteThrough() != null) {
            _hashCode += getWriteThrough().hashCode();
        }
        _hashCode += (isGrowable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHotGrowable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUuid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskSparseVer2BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSparseVer2BackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "split"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "writeThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("growable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "growable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotGrowable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hotGrowable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
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
