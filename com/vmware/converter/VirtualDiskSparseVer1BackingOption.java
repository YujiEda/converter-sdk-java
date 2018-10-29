/**
 * VirtualDiskSparseVer1BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskSparseVer1BackingOption  extends com.vmware.converter.VirtualDeviceFileBackingOption  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption diskModes;

    private com.vmware.converter.BoolOption split;

    private com.vmware.converter.BoolOption writeThrough;

    private boolean growable;

    public VirtualDiskSparseVer1BackingOption() {
    }

    public VirtualDiskSparseVer1BackingOption(
           java.lang.String type,
           com.vmware.converter.ChoiceOption fileNameExtensions,
           com.vmware.converter.ChoiceOption diskModes,
           com.vmware.converter.BoolOption split,
           com.vmware.converter.BoolOption writeThrough,
           boolean growable) {
        super(
            type,
            fileNameExtensions);
        this.diskModes = diskModes;
        this.split = split;
        this.writeThrough = writeThrough;
        this.growable = growable;
    }


    /**
     * Gets the diskModes value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @return diskModes
     */
    public com.vmware.converter.ChoiceOption getDiskModes() {
        return diskModes;
    }


    /**
     * Sets the diskModes value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @param diskModes
     */
    public void setDiskModes(com.vmware.converter.ChoiceOption diskModes) {
        this.diskModes = diskModes;
    }


    /**
     * Gets the split value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @return split
     */
    public com.vmware.converter.BoolOption getSplit() {
        return split;
    }


    /**
     * Sets the split value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @param split
     */
    public void setSplit(com.vmware.converter.BoolOption split) {
        this.split = split;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @return writeThrough
     */
    public com.vmware.converter.BoolOption getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(com.vmware.converter.BoolOption writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the growable value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @return growable
     */
    public boolean isGrowable() {
        return growable;
    }


    /**
     * Sets the growable value for this VirtualDiskSparseVer1BackingOption.
     * 
     * @param growable
     */
    public void setGrowable(boolean growable) {
        this.growable = growable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskSparseVer1BackingOption)) return false;
        VirtualDiskSparseVer1BackingOption other = (VirtualDiskSparseVer1BackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskModes==null && other.getDiskModes()==null) || 
             (this.diskModes!=null &&
              this.diskModes.equals(other.getDiskModes()))) &&
            ((this.split==null && other.getSplit()==null) || 
             (this.split!=null &&
              this.split.equals(other.getSplit()))) &&
            ((this.writeThrough==null && other.getWriteThrough()==null) || 
             (this.writeThrough!=null &&
              this.writeThrough.equals(other.getWriteThrough()))) &&
            this.growable == other.isGrowable();
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
        if (getDiskModes() != null) {
            _hashCode += getDiskModes().hashCode();
        }
        if (getSplit() != null) {
            _hashCode += getSplit().hashCode();
        }
        if (getWriteThrough() != null) {
            _hashCode += getWriteThrough().hashCode();
        }
        _hashCode += (isGrowable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskSparseVer1BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSparseVer1BackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskModes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskModes"));
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
