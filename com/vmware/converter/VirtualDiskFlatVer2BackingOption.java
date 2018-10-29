/**
 * VirtualDiskFlatVer2BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskFlatVer2BackingOption  extends com.vmware.converter.VirtualDeviceFileBackingOption  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption diskMode;

    private com.vmware.converter.BoolOption split;

    private com.vmware.converter.BoolOption writeThrough;

    private boolean growable;

    private boolean hotGrowable;

    private boolean uuid;

    private com.vmware.converter.BoolOption thinProvisioned;

    private com.vmware.converter.BoolOption eagerlyScrub;

    private com.vmware.converter.ChoiceOption deltaDiskFormat;

    private com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] deltaDiskFormatsSupported;

    public VirtualDiskFlatVer2BackingOption() {
    }

    public VirtualDiskFlatVer2BackingOption(
           java.lang.String type,
           com.vmware.converter.ChoiceOption fileNameExtensions,
           com.vmware.converter.ChoiceOption diskMode,
           com.vmware.converter.BoolOption split,
           com.vmware.converter.BoolOption writeThrough,
           boolean growable,
           boolean hotGrowable,
           boolean uuid,
           com.vmware.converter.BoolOption thinProvisioned,
           com.vmware.converter.BoolOption eagerlyScrub,
           com.vmware.converter.ChoiceOption deltaDiskFormat,
           com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] deltaDiskFormatsSupported) {
        super(
            type,
            fileNameExtensions);
        this.diskMode = diskMode;
        this.split = split;
        this.writeThrough = writeThrough;
        this.growable = growable;
        this.hotGrowable = hotGrowable;
        this.uuid = uuid;
        this.thinProvisioned = thinProvisioned;
        this.eagerlyScrub = eagerlyScrub;
        this.deltaDiskFormat = deltaDiskFormat;
        this.deltaDiskFormatsSupported = deltaDiskFormatsSupported;
    }


    /**
     * Gets the diskMode value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return diskMode
     */
    public com.vmware.converter.ChoiceOption getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param diskMode
     */
    public void setDiskMode(com.vmware.converter.ChoiceOption diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the split value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return split
     */
    public com.vmware.converter.BoolOption getSplit() {
        return split;
    }


    /**
     * Sets the split value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param split
     */
    public void setSplit(com.vmware.converter.BoolOption split) {
        this.split = split;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return writeThrough
     */
    public com.vmware.converter.BoolOption getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(com.vmware.converter.BoolOption writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the growable value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return growable
     */
    public boolean isGrowable() {
        return growable;
    }


    /**
     * Sets the growable value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param growable
     */
    public void setGrowable(boolean growable) {
        this.growable = growable;
    }


    /**
     * Gets the hotGrowable value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return hotGrowable
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }


    /**
     * Sets the hotGrowable value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param hotGrowable
     */
    public void setHotGrowable(boolean hotGrowable) {
        this.hotGrowable = hotGrowable;
    }


    /**
     * Gets the uuid value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return uuid
     */
    public boolean isUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param uuid
     */
    public void setUuid(boolean uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the thinProvisioned value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return thinProvisioned
     */
    public com.vmware.converter.BoolOption getThinProvisioned() {
        return thinProvisioned;
    }


    /**
     * Sets the thinProvisioned value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param thinProvisioned
     */
    public void setThinProvisioned(com.vmware.converter.BoolOption thinProvisioned) {
        this.thinProvisioned = thinProvisioned;
    }


    /**
     * Gets the eagerlyScrub value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return eagerlyScrub
     */
    public com.vmware.converter.BoolOption getEagerlyScrub() {
        return eagerlyScrub;
    }


    /**
     * Sets the eagerlyScrub value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param eagerlyScrub
     */
    public void setEagerlyScrub(com.vmware.converter.BoolOption eagerlyScrub) {
        this.eagerlyScrub = eagerlyScrub;
    }


    /**
     * Gets the deltaDiskFormat value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return deltaDiskFormat
     */
    public com.vmware.converter.ChoiceOption getDeltaDiskFormat() {
        return deltaDiskFormat;
    }


    /**
     * Sets the deltaDiskFormat value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param deltaDiskFormat
     */
    public void setDeltaDiskFormat(com.vmware.converter.ChoiceOption deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }


    /**
     * Gets the deltaDiskFormatsSupported value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @return deltaDiskFormatsSupported
     */
    public com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] getDeltaDiskFormatsSupported() {
        return deltaDiskFormatsSupported;
    }


    /**
     * Sets the deltaDiskFormatsSupported value for this VirtualDiskFlatVer2BackingOption.
     * 
     * @param deltaDiskFormatsSupported
     */
    public void setDeltaDiskFormatsSupported(com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] deltaDiskFormatsSupported) {
        this.deltaDiskFormatsSupported = deltaDiskFormatsSupported;
    }

    public com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported getDeltaDiskFormatsSupported(int i) {
        return this.deltaDiskFormatsSupported[i];
    }

    public void setDeltaDiskFormatsSupported(int i, com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported _value) {
        this.deltaDiskFormatsSupported[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskFlatVer2BackingOption)) return false;
        VirtualDiskFlatVer2BackingOption other = (VirtualDiskFlatVer2BackingOption) obj;
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
            this.uuid == other.isUuid() &&
            ((this.thinProvisioned==null && other.getThinProvisioned()==null) || 
             (this.thinProvisioned!=null &&
              this.thinProvisioned.equals(other.getThinProvisioned()))) &&
            ((this.eagerlyScrub==null && other.getEagerlyScrub()==null) || 
             (this.eagerlyScrub!=null &&
              this.eagerlyScrub.equals(other.getEagerlyScrub()))) &&
            ((this.deltaDiskFormat==null && other.getDeltaDiskFormat()==null) || 
             (this.deltaDiskFormat!=null &&
              this.deltaDiskFormat.equals(other.getDeltaDiskFormat()))) &&
            ((this.deltaDiskFormatsSupported==null && other.getDeltaDiskFormatsSupported()==null) || 
             (this.deltaDiskFormatsSupported!=null &&
              java.util.Arrays.equals(this.deltaDiskFormatsSupported, other.getDeltaDiskFormatsSupported())));
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
        if (getThinProvisioned() != null) {
            _hashCode += getThinProvisioned().hashCode();
        }
        if (getEagerlyScrub() != null) {
            _hashCode += getEagerlyScrub().hashCode();
        }
        if (getDeltaDiskFormat() != null) {
            _hashCode += getDeltaDiskFormat().hashCode();
        }
        if (getDeltaDiskFormatsSupported() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeltaDiskFormatsSupported());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeltaDiskFormatsSupported(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualDiskFlatVer2BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskFlatVer2BackingOption"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thinProvisioned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thinProvisioned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eagerlyScrub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eagerlyScrub"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskFormatsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormatsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskDeltaDiskFormatsSupported"));
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
