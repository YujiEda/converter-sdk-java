/**
 * VsanHostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private com.vmware.converter.ManagedObjectReference hostSystem;

    private com.vmware.converter.VsanHostConfigInfoClusterInfo clusterInfo;

    private com.vmware.converter.VsanHostConfigInfoStorageInfo storageInfo;

    private com.vmware.converter.VsanHostConfigInfoNetworkInfo networkInfo;

    private com.vmware.converter.VsanHostFaultDomainInfo faultDomainInfo;

    public VsanHostConfigInfo() {
    }

    public VsanHostConfigInfo(
           java.lang.Boolean enabled,
           com.vmware.converter.ManagedObjectReference hostSystem,
           com.vmware.converter.VsanHostConfigInfoClusterInfo clusterInfo,
           com.vmware.converter.VsanHostConfigInfoStorageInfo storageInfo,
           com.vmware.converter.VsanHostConfigInfoNetworkInfo networkInfo,
           com.vmware.converter.VsanHostFaultDomainInfo faultDomainInfo) {
        this.enabled = enabled;
        this.hostSystem = hostSystem;
        this.clusterInfo = clusterInfo;
        this.storageInfo = storageInfo;
        this.networkInfo = networkInfo;
        this.faultDomainInfo = faultDomainInfo;
    }


    /**
     * Gets the enabled value for this VsanHostConfigInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this VsanHostConfigInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the hostSystem value for this VsanHostConfigInfo.
     * 
     * @return hostSystem
     */
    public com.vmware.converter.ManagedObjectReference getHostSystem() {
        return hostSystem;
    }


    /**
     * Sets the hostSystem value for this VsanHostConfigInfo.
     * 
     * @param hostSystem
     */
    public void setHostSystem(com.vmware.converter.ManagedObjectReference hostSystem) {
        this.hostSystem = hostSystem;
    }


    /**
     * Gets the clusterInfo value for this VsanHostConfigInfo.
     * 
     * @return clusterInfo
     */
    public com.vmware.converter.VsanHostConfigInfoClusterInfo getClusterInfo() {
        return clusterInfo;
    }


    /**
     * Sets the clusterInfo value for this VsanHostConfigInfo.
     * 
     * @param clusterInfo
     */
    public void setClusterInfo(com.vmware.converter.VsanHostConfigInfoClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }


    /**
     * Gets the storageInfo value for this VsanHostConfigInfo.
     * 
     * @return storageInfo
     */
    public com.vmware.converter.VsanHostConfigInfoStorageInfo getStorageInfo() {
        return storageInfo;
    }


    /**
     * Sets the storageInfo value for this VsanHostConfigInfo.
     * 
     * @param storageInfo
     */
    public void setStorageInfo(com.vmware.converter.VsanHostConfigInfoStorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }


    /**
     * Gets the networkInfo value for this VsanHostConfigInfo.
     * 
     * @return networkInfo
     */
    public com.vmware.converter.VsanHostConfigInfoNetworkInfo getNetworkInfo() {
        return networkInfo;
    }


    /**
     * Sets the networkInfo value for this VsanHostConfigInfo.
     * 
     * @param networkInfo
     */
    public void setNetworkInfo(com.vmware.converter.VsanHostConfigInfoNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }


    /**
     * Gets the faultDomainInfo value for this VsanHostConfigInfo.
     * 
     * @return faultDomainInfo
     */
    public com.vmware.converter.VsanHostFaultDomainInfo getFaultDomainInfo() {
        return faultDomainInfo;
    }


    /**
     * Sets the faultDomainInfo value for this VsanHostConfigInfo.
     * 
     * @param faultDomainInfo
     */
    public void setFaultDomainInfo(com.vmware.converter.VsanHostFaultDomainInfo faultDomainInfo) {
        this.faultDomainInfo = faultDomainInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostConfigInfo)) return false;
        VsanHostConfigInfo other = (VsanHostConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.hostSystem==null && other.getHostSystem()==null) || 
             (this.hostSystem!=null &&
              this.hostSystem.equals(other.getHostSystem()))) &&
            ((this.clusterInfo==null && other.getClusterInfo()==null) || 
             (this.clusterInfo!=null &&
              this.clusterInfo.equals(other.getClusterInfo()))) &&
            ((this.storageInfo==null && other.getStorageInfo()==null) || 
             (this.storageInfo!=null &&
              this.storageInfo.equals(other.getStorageInfo()))) &&
            ((this.networkInfo==null && other.getNetworkInfo()==null) || 
             (this.networkInfo!=null &&
              this.networkInfo.equals(other.getNetworkInfo()))) &&
            ((this.faultDomainInfo==null && other.getFaultDomainInfo()==null) || 
             (this.faultDomainInfo!=null &&
              this.faultDomainInfo.equals(other.getFaultDomainInfo())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getHostSystem() != null) {
            _hashCode += getHostSystem().hashCode();
        }
        if (getClusterInfo() != null) {
            _hashCode += getClusterInfo().hashCode();
        }
        if (getStorageInfo() != null) {
            _hashCode += getStorageInfo().hashCode();
        }
        if (getNetworkInfo() != null) {
            _hashCode += getNetworkInfo().hashCode();
        }
        if (getFaultDomainInfo() != null) {
            _hashCode += getFaultDomainInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoClusterInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoStorageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultDomainInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultDomainInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostFaultDomainInfo"));
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
