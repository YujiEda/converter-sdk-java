/**
 * ConverterTargetVmSpecManagedVmLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTargetVmSpecManagedVmLocation  extends com.vmware.converter.ConverterTargetVmSpecVmLocation  implements java.io.Serializable {
    private com.vmware.converter.ConverterVimConnectionSpec vimConnect;

    private com.vmware.converter.ManagedObjectReference vmFolder;

    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.ManagedObjectReference resourcePool;

    private com.vmware.converter.ManagedObjectReference computeResource;

    private java.lang.String vmFolderName;

    private java.lang.String hostName;

    private java.lang.String resourcePoolName;

    private java.lang.String computeResourceName;

    public ConverterTargetVmSpecManagedVmLocation() {
    }

    public ConverterTargetVmSpecManagedVmLocation(
           com.vmware.converter.ConverterVimConnectionSpec vimConnect,
           com.vmware.converter.ManagedObjectReference vmFolder,
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.ManagedObjectReference resourcePool,
           com.vmware.converter.ManagedObjectReference computeResource,
           java.lang.String vmFolderName,
           java.lang.String hostName,
           java.lang.String resourcePoolName,
           java.lang.String computeResourceName) {
        this.vimConnect = vimConnect;
        this.vmFolder = vmFolder;
        this.host = host;
        this.resourcePool = resourcePool;
        this.computeResource = computeResource;
        this.vmFolderName = vmFolderName;
        this.hostName = hostName;
        this.resourcePoolName = resourcePoolName;
        this.computeResourceName = computeResourceName;
    }


    /**
     * Gets the vimConnect value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return vimConnect
     */
    public com.vmware.converter.ConverterVimConnectionSpec getVimConnect() {
        return vimConnect;
    }


    /**
     * Sets the vimConnect value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param vimConnect
     */
    public void setVimConnect(com.vmware.converter.ConverterVimConnectionSpec vimConnect) {
        this.vimConnect = vimConnect;
    }


    /**
     * Gets the vmFolder value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return vmFolder
     */
    public com.vmware.converter.ManagedObjectReference getVmFolder() {
        return vmFolder;
    }


    /**
     * Sets the vmFolder value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param vmFolder
     */
    public void setVmFolder(com.vmware.converter.ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }


    /**
     * Gets the host value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the resourcePool value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return resourcePool
     */
    public com.vmware.converter.ManagedObjectReference getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param resourcePool
     */
    public void setResourcePool(com.vmware.converter.ManagedObjectReference resourcePool) {
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the computeResource value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return computeResource
     */
    public com.vmware.converter.ManagedObjectReference getComputeResource() {
        return computeResource;
    }


    /**
     * Sets the computeResource value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param computeResource
     */
    public void setComputeResource(com.vmware.converter.ManagedObjectReference computeResource) {
        this.computeResource = computeResource;
    }


    /**
     * Gets the vmFolderName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return vmFolderName
     */
    public java.lang.String getVmFolderName() {
        return vmFolderName;
    }


    /**
     * Sets the vmFolderName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param vmFolderName
     */
    public void setVmFolderName(java.lang.String vmFolderName) {
        this.vmFolderName = vmFolderName;
    }


    /**
     * Gets the hostName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the resourcePoolName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return resourcePoolName
     */
    public java.lang.String getResourcePoolName() {
        return resourcePoolName;
    }


    /**
     * Sets the resourcePoolName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param resourcePoolName
     */
    public void setResourcePoolName(java.lang.String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }


    /**
     * Gets the computeResourceName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @return computeResourceName
     */
    public java.lang.String getComputeResourceName() {
        return computeResourceName;
    }


    /**
     * Sets the computeResourceName value for this ConverterTargetVmSpecManagedVmLocation.
     * 
     * @param computeResourceName
     */
    public void setComputeResourceName(java.lang.String computeResourceName) {
        this.computeResourceName = computeResourceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTargetVmSpecManagedVmLocation)) return false;
        ConverterTargetVmSpecManagedVmLocation other = (ConverterTargetVmSpecManagedVmLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vimConnect==null && other.getVimConnect()==null) || 
             (this.vimConnect!=null &&
              this.vimConnect.equals(other.getVimConnect()))) &&
            ((this.vmFolder==null && other.getVmFolder()==null) || 
             (this.vmFolder!=null &&
              this.vmFolder.equals(other.getVmFolder()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool()))) &&
            ((this.computeResource==null && other.getComputeResource()==null) || 
             (this.computeResource!=null &&
              this.computeResource.equals(other.getComputeResource()))) &&
            ((this.vmFolderName==null && other.getVmFolderName()==null) || 
             (this.vmFolderName!=null &&
              this.vmFolderName.equals(other.getVmFolderName()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.resourcePoolName==null && other.getResourcePoolName()==null) || 
             (this.resourcePoolName!=null &&
              this.resourcePoolName.equals(other.getResourcePoolName()))) &&
            ((this.computeResourceName==null && other.getComputeResourceName()==null) || 
             (this.computeResourceName!=null &&
              this.computeResourceName.equals(other.getComputeResourceName())));
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
        if (getVimConnect() != null) {
            _hashCode += getVimConnect().hashCode();
        }
        if (getVmFolder() != null) {
            _hashCode += getVmFolder().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        if (getComputeResource() != null) {
            _hashCode += getComputeResource().hashCode();
        }
        if (getVmFolderName() != null) {
            _hashCode += getVmFolderName().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getResourcePoolName() != null) {
            _hashCode += getResourcePoolName().hashCode();
        }
        if (getComputeResourceName() != null) {
            _hashCode += getComputeResourceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterTargetVmSpecManagedVmLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpecManagedVmLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimConnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vimConnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVimConnectionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "computeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmFolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePoolName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resourcePoolName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computeResourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "computeResourceName"));
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
