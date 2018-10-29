/**
 * HostHardwareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostHardwareInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostSystemInfo systemInfo;

    private com.vmware.converter.HostCpuPowerManagementInfo cpuPowerManagementInfo;

    private com.vmware.converter.HostCpuInfo cpuInfo;

    private com.vmware.converter.HostCpuPackage[] cpuPkg;

    private long memorySize;

    private com.vmware.converter.HostNumaInfo numaInfo;

    private java.lang.Boolean smcPresent;

    private com.vmware.converter.HostPciDevice[] pciDevice;

    private com.vmware.converter.HostCpuIdInfo[] cpuFeature;

    private com.vmware.converter.HostBIOSInfo biosInfo;

    private com.vmware.converter.HostReliableMemoryInfo reliableMemoryInfo;

    public HostHardwareInfo() {
    }

    public HostHardwareInfo(
           com.vmware.converter.HostSystemInfo systemInfo,
           com.vmware.converter.HostCpuPowerManagementInfo cpuPowerManagementInfo,
           com.vmware.converter.HostCpuInfo cpuInfo,
           com.vmware.converter.HostCpuPackage[] cpuPkg,
           long memorySize,
           com.vmware.converter.HostNumaInfo numaInfo,
           java.lang.Boolean smcPresent,
           com.vmware.converter.HostPciDevice[] pciDevice,
           com.vmware.converter.HostCpuIdInfo[] cpuFeature,
           com.vmware.converter.HostBIOSInfo biosInfo,
           com.vmware.converter.HostReliableMemoryInfo reliableMemoryInfo) {
        this.systemInfo = systemInfo;
        this.cpuPowerManagementInfo = cpuPowerManagementInfo;
        this.cpuInfo = cpuInfo;
        this.cpuPkg = cpuPkg;
        this.memorySize = memorySize;
        this.numaInfo = numaInfo;
        this.smcPresent = smcPresent;
        this.pciDevice = pciDevice;
        this.cpuFeature = cpuFeature;
        this.biosInfo = biosInfo;
        this.reliableMemoryInfo = reliableMemoryInfo;
    }


    /**
     * Gets the systemInfo value for this HostHardwareInfo.
     * 
     * @return systemInfo
     */
    public com.vmware.converter.HostSystemInfo getSystemInfo() {
        return systemInfo;
    }


    /**
     * Sets the systemInfo value for this HostHardwareInfo.
     * 
     * @param systemInfo
     */
    public void setSystemInfo(com.vmware.converter.HostSystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }


    /**
     * Gets the cpuPowerManagementInfo value for this HostHardwareInfo.
     * 
     * @return cpuPowerManagementInfo
     */
    public com.vmware.converter.HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
        return cpuPowerManagementInfo;
    }


    /**
     * Sets the cpuPowerManagementInfo value for this HostHardwareInfo.
     * 
     * @param cpuPowerManagementInfo
     */
    public void setCpuPowerManagementInfo(com.vmware.converter.HostCpuPowerManagementInfo cpuPowerManagementInfo) {
        this.cpuPowerManagementInfo = cpuPowerManagementInfo;
    }


    /**
     * Gets the cpuInfo value for this HostHardwareInfo.
     * 
     * @return cpuInfo
     */
    public com.vmware.converter.HostCpuInfo getCpuInfo() {
        return cpuInfo;
    }


    /**
     * Sets the cpuInfo value for this HostHardwareInfo.
     * 
     * @param cpuInfo
     */
    public void setCpuInfo(com.vmware.converter.HostCpuInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }


    /**
     * Gets the cpuPkg value for this HostHardwareInfo.
     * 
     * @return cpuPkg
     */
    public com.vmware.converter.HostCpuPackage[] getCpuPkg() {
        return cpuPkg;
    }


    /**
     * Sets the cpuPkg value for this HostHardwareInfo.
     * 
     * @param cpuPkg
     */
    public void setCpuPkg(com.vmware.converter.HostCpuPackage[] cpuPkg) {
        this.cpuPkg = cpuPkg;
    }

    public com.vmware.converter.HostCpuPackage getCpuPkg(int i) {
        return this.cpuPkg[i];
    }

    public void setCpuPkg(int i, com.vmware.converter.HostCpuPackage _value) {
        this.cpuPkg[i] = _value;
    }


    /**
     * Gets the memorySize value for this HostHardwareInfo.
     * 
     * @return memorySize
     */
    public long getMemorySize() {
        return memorySize;
    }


    /**
     * Sets the memorySize value for this HostHardwareInfo.
     * 
     * @param memorySize
     */
    public void setMemorySize(long memorySize) {
        this.memorySize = memorySize;
    }


    /**
     * Gets the numaInfo value for this HostHardwareInfo.
     * 
     * @return numaInfo
     */
    public com.vmware.converter.HostNumaInfo getNumaInfo() {
        return numaInfo;
    }


    /**
     * Sets the numaInfo value for this HostHardwareInfo.
     * 
     * @param numaInfo
     */
    public void setNumaInfo(com.vmware.converter.HostNumaInfo numaInfo) {
        this.numaInfo = numaInfo;
    }


    /**
     * Gets the smcPresent value for this HostHardwareInfo.
     * 
     * @return smcPresent
     */
    public java.lang.Boolean getSmcPresent() {
        return smcPresent;
    }


    /**
     * Sets the smcPresent value for this HostHardwareInfo.
     * 
     * @param smcPresent
     */
    public void setSmcPresent(java.lang.Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }


    /**
     * Gets the pciDevice value for this HostHardwareInfo.
     * 
     * @return pciDevice
     */
    public com.vmware.converter.HostPciDevice[] getPciDevice() {
        return pciDevice;
    }


    /**
     * Sets the pciDevice value for this HostHardwareInfo.
     * 
     * @param pciDevice
     */
    public void setPciDevice(com.vmware.converter.HostPciDevice[] pciDevice) {
        this.pciDevice = pciDevice;
    }

    public com.vmware.converter.HostPciDevice getPciDevice(int i) {
        return this.pciDevice[i];
    }

    public void setPciDevice(int i, com.vmware.converter.HostPciDevice _value) {
        this.pciDevice[i] = _value;
    }


    /**
     * Gets the cpuFeature value for this HostHardwareInfo.
     * 
     * @return cpuFeature
     */
    public com.vmware.converter.HostCpuIdInfo[] getCpuFeature() {
        return cpuFeature;
    }


    /**
     * Sets the cpuFeature value for this HostHardwareInfo.
     * 
     * @param cpuFeature
     */
    public void setCpuFeature(com.vmware.converter.HostCpuIdInfo[] cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public com.vmware.converter.HostCpuIdInfo getCpuFeature(int i) {
        return this.cpuFeature[i];
    }

    public void setCpuFeature(int i, com.vmware.converter.HostCpuIdInfo _value) {
        this.cpuFeature[i] = _value;
    }


    /**
     * Gets the biosInfo value for this HostHardwareInfo.
     * 
     * @return biosInfo
     */
    public com.vmware.converter.HostBIOSInfo getBiosInfo() {
        return biosInfo;
    }


    /**
     * Sets the biosInfo value for this HostHardwareInfo.
     * 
     * @param biosInfo
     */
    public void setBiosInfo(com.vmware.converter.HostBIOSInfo biosInfo) {
        this.biosInfo = biosInfo;
    }


    /**
     * Gets the reliableMemoryInfo value for this HostHardwareInfo.
     * 
     * @return reliableMemoryInfo
     */
    public com.vmware.converter.HostReliableMemoryInfo getReliableMemoryInfo() {
        return reliableMemoryInfo;
    }


    /**
     * Sets the reliableMemoryInfo value for this HostHardwareInfo.
     * 
     * @param reliableMemoryInfo
     */
    public void setReliableMemoryInfo(com.vmware.converter.HostReliableMemoryInfo reliableMemoryInfo) {
        this.reliableMemoryInfo = reliableMemoryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostHardwareInfo)) return false;
        HostHardwareInfo other = (HostHardwareInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.systemInfo==null && other.getSystemInfo()==null) || 
             (this.systemInfo!=null &&
              this.systemInfo.equals(other.getSystemInfo()))) &&
            ((this.cpuPowerManagementInfo==null && other.getCpuPowerManagementInfo()==null) || 
             (this.cpuPowerManagementInfo!=null &&
              this.cpuPowerManagementInfo.equals(other.getCpuPowerManagementInfo()))) &&
            ((this.cpuInfo==null && other.getCpuInfo()==null) || 
             (this.cpuInfo!=null &&
              this.cpuInfo.equals(other.getCpuInfo()))) &&
            ((this.cpuPkg==null && other.getCpuPkg()==null) || 
             (this.cpuPkg!=null &&
              java.util.Arrays.equals(this.cpuPkg, other.getCpuPkg()))) &&
            this.memorySize == other.getMemorySize() &&
            ((this.numaInfo==null && other.getNumaInfo()==null) || 
             (this.numaInfo!=null &&
              this.numaInfo.equals(other.getNumaInfo()))) &&
            ((this.smcPresent==null && other.getSmcPresent()==null) || 
             (this.smcPresent!=null &&
              this.smcPresent.equals(other.getSmcPresent()))) &&
            ((this.pciDevice==null && other.getPciDevice()==null) || 
             (this.pciDevice!=null &&
              java.util.Arrays.equals(this.pciDevice, other.getPciDevice()))) &&
            ((this.cpuFeature==null && other.getCpuFeature()==null) || 
             (this.cpuFeature!=null &&
              java.util.Arrays.equals(this.cpuFeature, other.getCpuFeature()))) &&
            ((this.biosInfo==null && other.getBiosInfo()==null) || 
             (this.biosInfo!=null &&
              this.biosInfo.equals(other.getBiosInfo()))) &&
            ((this.reliableMemoryInfo==null && other.getReliableMemoryInfo()==null) || 
             (this.reliableMemoryInfo!=null &&
              this.reliableMemoryInfo.equals(other.getReliableMemoryInfo())));
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
        if (getSystemInfo() != null) {
            _hashCode += getSystemInfo().hashCode();
        }
        if (getCpuPowerManagementInfo() != null) {
            _hashCode += getCpuPowerManagementInfo().hashCode();
        }
        if (getCpuInfo() != null) {
            _hashCode += getCpuInfo().hashCode();
        }
        if (getCpuPkg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuPkg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuPkg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getMemorySize()).hashCode();
        if (getNumaInfo() != null) {
            _hashCode += getNumaInfo().hashCode();
        }
        if (getSmcPresent() != null) {
            _hashCode += getSmcPresent().hashCode();
        }
        if (getPciDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPciDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPciDevice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCpuFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBiosInfo() != null) {
            _hashCode += getBiosInfo().hashCode();
        }
        if (getReliableMemoryInfo() != null) {
            _hashCode += getReliableMemoryInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostHardwareInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHardwareInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuPowerManagementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuPowerManagementInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuPowerManagementInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuPkg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuPkg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuPackage"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNumaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smcPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smcPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biosInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "biosInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostBIOSInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reliableMemoryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reliableMemoryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostReliableMemoryInfo"));
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
