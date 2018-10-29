/**
 * ConverterComputerHardwareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerHardwareInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterStorageInfo storage;

    private com.vmware.converter.ConverterNetworkInfo network;

    private com.vmware.converter.ConverterBasicHardwareInfo basicHardware;

    private com.vmware.converter.VirtualMachineConfigInfo configInfo;

    private java.lang.String currentEfiBootEntry;

    public ConverterComputerHardwareInfo() {
    }

    public ConverterComputerHardwareInfo(
           com.vmware.converter.ConverterStorageInfo storage,
           com.vmware.converter.ConverterNetworkInfo network,
           com.vmware.converter.ConverterBasicHardwareInfo basicHardware,
           com.vmware.converter.VirtualMachineConfigInfo configInfo,
           java.lang.String currentEfiBootEntry) {
        this.storage = storage;
        this.network = network;
        this.basicHardware = basicHardware;
        this.configInfo = configInfo;
        this.currentEfiBootEntry = currentEfiBootEntry;
    }


    /**
     * Gets the storage value for this ConverterComputerHardwareInfo.
     * 
     * @return storage
     */
    public com.vmware.converter.ConverterStorageInfo getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this ConverterComputerHardwareInfo.
     * 
     * @param storage
     */
    public void setStorage(com.vmware.converter.ConverterStorageInfo storage) {
        this.storage = storage;
    }


    /**
     * Gets the network value for this ConverterComputerHardwareInfo.
     * 
     * @return network
     */
    public com.vmware.converter.ConverterNetworkInfo getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ConverterComputerHardwareInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.ConverterNetworkInfo network) {
        this.network = network;
    }


    /**
     * Gets the basicHardware value for this ConverterComputerHardwareInfo.
     * 
     * @return basicHardware
     */
    public com.vmware.converter.ConverterBasicHardwareInfo getBasicHardware() {
        return basicHardware;
    }


    /**
     * Sets the basicHardware value for this ConverterComputerHardwareInfo.
     * 
     * @param basicHardware
     */
    public void setBasicHardware(com.vmware.converter.ConverterBasicHardwareInfo basicHardware) {
        this.basicHardware = basicHardware;
    }


    /**
     * Gets the configInfo value for this ConverterComputerHardwareInfo.
     * 
     * @return configInfo
     */
    public com.vmware.converter.VirtualMachineConfigInfo getConfigInfo() {
        return configInfo;
    }


    /**
     * Sets the configInfo value for this ConverterComputerHardwareInfo.
     * 
     * @param configInfo
     */
    public void setConfigInfo(com.vmware.converter.VirtualMachineConfigInfo configInfo) {
        this.configInfo = configInfo;
    }


    /**
     * Gets the currentEfiBootEntry value for this ConverterComputerHardwareInfo.
     * 
     * @return currentEfiBootEntry
     */
    public java.lang.String getCurrentEfiBootEntry() {
        return currentEfiBootEntry;
    }


    /**
     * Sets the currentEfiBootEntry value for this ConverterComputerHardwareInfo.
     * 
     * @param currentEfiBootEntry
     */
    public void setCurrentEfiBootEntry(java.lang.String currentEfiBootEntry) {
        this.currentEfiBootEntry = currentEfiBootEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerHardwareInfo)) return false;
        ConverterComputerHardwareInfo other = (ConverterComputerHardwareInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.basicHardware==null && other.getBasicHardware()==null) || 
             (this.basicHardware!=null &&
              this.basicHardware.equals(other.getBasicHardware()))) &&
            ((this.configInfo==null && other.getConfigInfo()==null) || 
             (this.configInfo!=null &&
              this.configInfo.equals(other.getConfigInfo()))) &&
            ((this.currentEfiBootEntry==null && other.getCurrentEfiBootEntry()==null) || 
             (this.currentEfiBootEntry!=null &&
              this.currentEfiBootEntry.equals(other.getCurrentEfiBootEntry())));
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
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getBasicHardware() != null) {
            _hashCode += getBasicHardware().hashCode();
        }
        if (getConfigInfo() != null) {
            _hashCode += getConfigInfo().hashCode();
        }
        if (getCurrentEfiBootEntry() != null) {
            _hashCode += getCurrentEfiBootEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerHardwareInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerHardwareInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "storage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicHardware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "basicHardware"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBasicHardwareInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "configInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentEfiBootEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "currentEfiBootEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
