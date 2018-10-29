/**
 * VirtualDiskSeSparseBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskSeSparseBackingOption  extends com.vmware.converter.VirtualDeviceFileBackingOption  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption diskMode;

    private com.vmware.converter.BoolOption writeThrough;

    private boolean growable;

    private boolean hotGrowable;

    private boolean uuid;

    private com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] deltaDiskFormatsSupported;

    public VirtualDiskSeSparseBackingOption() {
    }

    public VirtualDiskSeSparseBackingOption(
           java.lang.String type,
           com.vmware.converter.ChoiceOption fileNameExtensions,
           com.vmware.converter.ChoiceOption diskMode,
           com.vmware.converter.BoolOption writeThrough,
           boolean growable,
           boolean hotGrowable,
           boolean uuid,
           com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] deltaDiskFormatsSupported) {
        super(
            type,
            fileNameExtensions);
        this.diskMode = diskMode;
        this.writeThrough = writeThrough;
        this.growable = growable;
        this.hotGrowable = hotGrowable;
        this.uuid = uuid;
        this.deltaDiskFormatsSupported = deltaDiskFormatsSupported;
    }


    /**
     * Gets the diskMode value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return diskMode
     */
    public com.vmware.converter.ChoiceOption getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskSeSparseBackingOption.
     * 
     * @param diskMode
     */
    public void setDiskMode(com.vmware.converter.ChoiceOption diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return writeThrough
     */
    public com.vmware.converter.BoolOption getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskSeSparseBackingOption.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(com.vmware.converter.BoolOption writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the growable value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return growable
     */
    public boolean isGrowable() {
        return growable;
    }


    /**
     * Sets the growable value for this VirtualDiskSeSparseBackingOption.
     * 
     * @param growable
     */
    public void setGrowable(boolean growable) {
        this.growable = growable;
    }


    /**
     * Gets the hotGrowable value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return hotGrowable
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }


    /**
     * Sets the hotGrowable value for this VirtualDiskSeSparseBackingOption.
     * 
     * @param hotGrowable
     */
    public void setHotGrowable(boolean hotGrowable) {
        this.hotGrowable = hotGrowable;
    }


    /**
     * Gets the uuid value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return uuid
     */
    public boolean isUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskSeSparseBackingOption.
     * 
     * @param uuid
     */
    public void setUuid(boolean uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the deltaDiskFormatsSupported value for this VirtualDiskSeSparseBackingOption.
     * 
     * @return deltaDiskFormatsSupported
     */
    public com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] getDeltaDiskFormatsSupported() {
        return deltaDiskFormatsSupported;
    }


    /**
     * Sets the deltaDiskFormatsSupported value for this VirtualDiskSeSparseBackingOption.
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
        if (!(obj instanceof VirtualDiskSeSparseBackingOption)) return false;
        VirtualDiskSeSparseBackingOption other = (VirtualDiskSeSparseBackingOption) obj;
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
            ((this.writeThrough==null && other.getWriteThrough()==null) || 
             (this.writeThrough!=null &&
              this.writeThrough.equals(other.getWriteThrough()))) &&
            this.growable == other.isGrowable() &&
            this.hotGrowable == other.isHotGrowable() &&
            this.uuid == other.isUuid() &&
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
        if (getWriteThrough() != null) {
            _hashCode += getWriteThrough().hashCode();
        }
        _hashCode += (isGrowable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHotGrowable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUuid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(VirtualDiskSeSparseBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSeSparseBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
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
        elemField.setFieldName("deltaDiskFormatsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormatsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskDeltaDiskFormatsSupported"));
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
