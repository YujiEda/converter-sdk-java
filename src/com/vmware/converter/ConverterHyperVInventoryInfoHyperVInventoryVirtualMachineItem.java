/**
 * ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vmName;

    private java.lang.String vmGUID;

    private java.lang.String osFamily;

    private java.lang.String osType;

    private com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState powerState;

    private long size;

    public ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem() {
    }

    public ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem(
           java.lang.String vmName,
           java.lang.String vmGUID,
           java.lang.String osFamily,
           java.lang.String osType,
           com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState powerState,
           long size) {
        this.vmName = vmName;
        this.vmGUID = vmGUID;
        this.osFamily = osFamily;
        this.osType = osType;
        this.powerState = powerState;
        this.size = size;
    }


    /**
     * Gets the vmName value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the vmGUID value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return vmGUID
     */
    public java.lang.String getVmGUID() {
        return vmGUID;
    }


    /**
     * Sets the vmGUID value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param vmGUID
     */
    public void setVmGUID(java.lang.String vmGUID) {
        this.vmGUID = vmGUID;
    }


    /**
     * Gets the osFamily value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return osFamily
     */
    public java.lang.String getOsFamily() {
        return osFamily;
    }


    /**
     * Sets the osFamily value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param osFamily
     */
    public void setOsFamily(java.lang.String osFamily) {
        this.osFamily = osFamily;
    }


    /**
     * Gets the osType value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return osType
     */
    public java.lang.String getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param osType
     */
    public void setOsType(java.lang.String osType) {
        this.osType = osType;
    }


    /**
     * Gets the powerState value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return powerState
     */
    public com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState getPowerState() {
        return powerState;
    }


    /**
     * Sets the powerState value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param powerState
     */
    public void setPowerState(com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the size value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem)) return false;
        ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem other = (ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.vmGUID==null && other.getVmGUID()==null) || 
             (this.vmGUID!=null &&
              this.vmGUID.equals(other.getVmGUID()))) &&
            ((this.osFamily==null && other.getOsFamily()==null) || 
             (this.osFamily!=null &&
              this.osFamily.equals(other.getOsFamily()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.powerState==null && other.getPowerState()==null) || 
             (this.powerState!=null &&
              this.powerState.equals(other.getPowerState()))) &&
            this.size == other.getSize();
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
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getVmGUID() != null) {
            _hashCode += getVmGUID().hashCode();
        }
        if (getOsFamily() != null) {
            _hashCode += getOsFamily().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getPowerState() != null) {
            _hashCode += getPowerState().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "powerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "size"));
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
