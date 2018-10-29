/**
 * HostConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConnectInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String serverIp;

    private java.lang.Boolean inDasCluster;

    private com.vmware.converter.HostListSummary host;

    private com.vmware.converter.VirtualMachineSummary[] vm;

    private java.lang.Boolean vimAccountNameRequired;

    private java.lang.Boolean clusterSupported;

    private com.vmware.converter.HostConnectInfoNetworkInfo[] network;

    private com.vmware.converter.HostDatastoreConnectInfo[] datastore;

    private com.vmware.converter.HostLicenseConnectInfo license;

    private com.vmware.converter.HostCapability capability;

    public HostConnectInfo() {
    }

    public HostConnectInfo(
           java.lang.String serverIp,
           java.lang.Boolean inDasCluster,
           com.vmware.converter.HostListSummary host,
           com.vmware.converter.VirtualMachineSummary[] vm,
           java.lang.Boolean vimAccountNameRequired,
           java.lang.Boolean clusterSupported,
           com.vmware.converter.HostConnectInfoNetworkInfo[] network,
           com.vmware.converter.HostDatastoreConnectInfo[] datastore,
           com.vmware.converter.HostLicenseConnectInfo license,
           com.vmware.converter.HostCapability capability) {
        this.serverIp = serverIp;
        this.inDasCluster = inDasCluster;
        this.host = host;
        this.vm = vm;
        this.vimAccountNameRequired = vimAccountNameRequired;
        this.clusterSupported = clusterSupported;
        this.network = network;
        this.datastore = datastore;
        this.license = license;
        this.capability = capability;
    }


    /**
     * Gets the serverIp value for this HostConnectInfo.
     * 
     * @return serverIp
     */
    public java.lang.String getServerIp() {
        return serverIp;
    }


    /**
     * Sets the serverIp value for this HostConnectInfo.
     * 
     * @param serverIp
     */
    public void setServerIp(java.lang.String serverIp) {
        this.serverIp = serverIp;
    }


    /**
     * Gets the inDasCluster value for this HostConnectInfo.
     * 
     * @return inDasCluster
     */
    public java.lang.Boolean getInDasCluster() {
        return inDasCluster;
    }


    /**
     * Sets the inDasCluster value for this HostConnectInfo.
     * 
     * @param inDasCluster
     */
    public void setInDasCluster(java.lang.Boolean inDasCluster) {
        this.inDasCluster = inDasCluster;
    }


    /**
     * Gets the host value for this HostConnectInfo.
     * 
     * @return host
     */
    public com.vmware.converter.HostListSummary getHost() {
        return host;
    }


    /**
     * Sets the host value for this HostConnectInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.HostListSummary host) {
        this.host = host;
    }


    /**
     * Gets the vm value for this HostConnectInfo.
     * 
     * @return vm
     */
    public com.vmware.converter.VirtualMachineSummary[] getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this HostConnectInfo.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.VirtualMachineSummary[] vm) {
        this.vm = vm;
    }

    public com.vmware.converter.VirtualMachineSummary getVm(int i) {
        return this.vm[i];
    }

    public void setVm(int i, com.vmware.converter.VirtualMachineSummary _value) {
        this.vm[i] = _value;
    }


    /**
     * Gets the vimAccountNameRequired value for this HostConnectInfo.
     * 
     * @return vimAccountNameRequired
     */
    public java.lang.Boolean getVimAccountNameRequired() {
        return vimAccountNameRequired;
    }


    /**
     * Sets the vimAccountNameRequired value for this HostConnectInfo.
     * 
     * @param vimAccountNameRequired
     */
    public void setVimAccountNameRequired(java.lang.Boolean vimAccountNameRequired) {
        this.vimAccountNameRequired = vimAccountNameRequired;
    }


    /**
     * Gets the clusterSupported value for this HostConnectInfo.
     * 
     * @return clusterSupported
     */
    public java.lang.Boolean getClusterSupported() {
        return clusterSupported;
    }


    /**
     * Sets the clusterSupported value for this HostConnectInfo.
     * 
     * @param clusterSupported
     */
    public void setClusterSupported(java.lang.Boolean clusterSupported) {
        this.clusterSupported = clusterSupported;
    }


    /**
     * Gets the network value for this HostConnectInfo.
     * 
     * @return network
     */
    public com.vmware.converter.HostConnectInfoNetworkInfo[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this HostConnectInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.HostConnectInfoNetworkInfo[] network) {
        this.network = network;
    }

    public com.vmware.converter.HostConnectInfoNetworkInfo getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.vmware.converter.HostConnectInfoNetworkInfo _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the datastore value for this HostConnectInfo.
     * 
     * @return datastore
     */
    public com.vmware.converter.HostDatastoreConnectInfo[] getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this HostConnectInfo.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.HostDatastoreConnectInfo[] datastore) {
        this.datastore = datastore;
    }

    public com.vmware.converter.HostDatastoreConnectInfo getDatastore(int i) {
        return this.datastore[i];
    }

    public void setDatastore(int i, com.vmware.converter.HostDatastoreConnectInfo _value) {
        this.datastore[i] = _value;
    }


    /**
     * Gets the license value for this HostConnectInfo.
     * 
     * @return license
     */
    public com.vmware.converter.HostLicenseConnectInfo getLicense() {
        return license;
    }


    /**
     * Sets the license value for this HostConnectInfo.
     * 
     * @param license
     */
    public void setLicense(com.vmware.converter.HostLicenseConnectInfo license) {
        this.license = license;
    }


    /**
     * Gets the capability value for this HostConnectInfo.
     * 
     * @return capability
     */
    public com.vmware.converter.HostCapability getCapability() {
        return capability;
    }


    /**
     * Sets the capability value for this HostConnectInfo.
     * 
     * @param capability
     */
    public void setCapability(com.vmware.converter.HostCapability capability) {
        this.capability = capability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConnectInfo)) return false;
        HostConnectInfo other = (HostConnectInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serverIp==null && other.getServerIp()==null) || 
             (this.serverIp!=null &&
              this.serverIp.equals(other.getServerIp()))) &&
            ((this.inDasCluster==null && other.getInDasCluster()==null) || 
             (this.inDasCluster!=null &&
              this.inDasCluster.equals(other.getInDasCluster()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              java.util.Arrays.equals(this.vm, other.getVm()))) &&
            ((this.vimAccountNameRequired==null && other.getVimAccountNameRequired()==null) || 
             (this.vimAccountNameRequired!=null &&
              this.vimAccountNameRequired.equals(other.getVimAccountNameRequired()))) &&
            ((this.clusterSupported==null && other.getClusterSupported()==null) || 
             (this.clusterSupported!=null &&
              this.clusterSupported.equals(other.getClusterSupported()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              java.util.Arrays.equals(this.datastore, other.getDatastore()))) &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense()))) &&
            ((this.capability==null && other.getCapability()==null) || 
             (this.capability!=null &&
              this.capability.equals(other.getCapability())));
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
        if (getServerIp() != null) {
            _hashCode += getServerIp().hashCode();
        }
        if (getInDasCluster() != null) {
            _hashCode += getInDasCluster().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVimAccountNameRequired() != null) {
            _hashCode += getVimAccountNameRequired().hashCode();
        }
        if (getClusterSupported() != null) {
            _hashCode += getClusterSupported().hashCode();
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
        }
        if (getCapability() != null) {
            _hashCode += getCapability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostConnectInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConnectInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serverIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDasCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inDasCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostListSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimAccountNameRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vimAccountNameRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConnectInfoNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDatastoreConnectInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "license"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLicenseConnectInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCapability"));
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
