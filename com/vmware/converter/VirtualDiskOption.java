/**
 * VirtualDiskOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskOption  extends com.vmware.converter.VirtualDeviceOption  implements java.io.Serializable {
    private com.vmware.converter.LongOption capacityInKB;

    private com.vmware.converter.StorageIOAllocationOption ioAllocationOption;

    private com.vmware.converter.VirtualDiskOptionVFlashCacheConfigOption vFlashCacheConfigOption;

    public VirtualDiskOption() {
    }

    public VirtualDiskOption(
           java.lang.String type,
           com.vmware.converter.VirtualDeviceConnectOption connectOption,
           com.vmware.converter.VirtualDeviceBusSlotOption busSlotOption,
           java.lang.String controllerType,
           com.vmware.converter.BoolOption autoAssignController,
           com.vmware.converter.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           java.lang.Boolean hotRemoveSupported,
           com.vmware.converter.LongOption capacityInKB,
           com.vmware.converter.StorageIOAllocationOption ioAllocationOption,
           com.vmware.converter.VirtualDiskOptionVFlashCacheConfigOption vFlashCacheConfigOption) {
        super(
            type,
            connectOption,
            busSlotOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            hotRemoveSupported);
        this.capacityInKB = capacityInKB;
        this.ioAllocationOption = ioAllocationOption;
        this.vFlashCacheConfigOption = vFlashCacheConfigOption;
    }


    /**
     * Gets the capacityInKB value for this VirtualDiskOption.
     * 
     * @return capacityInKB
     */
    public com.vmware.converter.LongOption getCapacityInKB() {
        return capacityInKB;
    }


    /**
     * Sets the capacityInKB value for this VirtualDiskOption.
     * 
     * @param capacityInKB
     */
    public void setCapacityInKB(com.vmware.converter.LongOption capacityInKB) {
        this.capacityInKB = capacityInKB;
    }


    /**
     * Gets the ioAllocationOption value for this VirtualDiskOption.
     * 
     * @return ioAllocationOption
     */
    public com.vmware.converter.StorageIOAllocationOption getIoAllocationOption() {
        return ioAllocationOption;
    }


    /**
     * Sets the ioAllocationOption value for this VirtualDiskOption.
     * 
     * @param ioAllocationOption
     */
    public void setIoAllocationOption(com.vmware.converter.StorageIOAllocationOption ioAllocationOption) {
        this.ioAllocationOption = ioAllocationOption;
    }


    /**
     * Gets the vFlashCacheConfigOption value for this VirtualDiskOption.
     * 
     * @return vFlashCacheConfigOption
     */
    public com.vmware.converter.VirtualDiskOptionVFlashCacheConfigOption getVFlashCacheConfigOption() {
        return vFlashCacheConfigOption;
    }


    /**
     * Sets the vFlashCacheConfigOption value for this VirtualDiskOption.
     * 
     * @param vFlashCacheConfigOption
     */
    public void setVFlashCacheConfigOption(com.vmware.converter.VirtualDiskOptionVFlashCacheConfigOption vFlashCacheConfigOption) {
        this.vFlashCacheConfigOption = vFlashCacheConfigOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskOption)) return false;
        VirtualDiskOption other = (VirtualDiskOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capacityInKB==null && other.getCapacityInKB()==null) || 
             (this.capacityInKB!=null &&
              this.capacityInKB.equals(other.getCapacityInKB()))) &&
            ((this.ioAllocationOption==null && other.getIoAllocationOption()==null) || 
             (this.ioAllocationOption!=null &&
              this.ioAllocationOption.equals(other.getIoAllocationOption()))) &&
            ((this.vFlashCacheConfigOption==null && other.getVFlashCacheConfigOption()==null) || 
             (this.vFlashCacheConfigOption!=null &&
              this.vFlashCacheConfigOption.equals(other.getVFlashCacheConfigOption())));
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
        if (getCapacityInKB() != null) {
            _hashCode += getCapacityInKB().hashCode();
        }
        if (getIoAllocationOption() != null) {
            _hashCode += getIoAllocationOption().hashCode();
        }
        if (getVFlashCacheConfigOption() != null) {
            _hashCode += getVFlashCacheConfigOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioAllocationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioAllocationOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIOAllocationOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashCacheConfigOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashCacheConfigOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskOptionVFlashCacheConfigOption"));
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
