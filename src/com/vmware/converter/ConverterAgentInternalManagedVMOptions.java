/**
 * ConverterAgentInternalManagedVMOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalManagedVMOptions  extends com.vmware.converter.ConverterAgentInternalVMOptions  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLoginCredentials login;

    private com.vmware.converter.ManagedObjectReference vmFolder;

    private com.vmware.converter.ManagedObjectReference resourcePool;

    private com.vmware.converter.ManagedObjectReference datastore;

    private com.vmware.converter.ManagedObjectReference[] datastoreLocations;

    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.Boolean doNotCreateUnspecifiedDevices;

    public ConverterAgentInternalManagedVMOptions() {
    }

    public ConverterAgentInternalManagedVMOptions(
           com.vmware.converter.VirtualMachineConfigSpec config,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout,
           java.lang.String vmName,
           com.vmware.converter.ConverterNetworkParams networkParams,
           com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams,
           java.lang.Boolean vmxnetPresent,
           java.lang.Boolean preserveDeviceBacking,
           java.lang.Boolean preserveIdentity,
           com.vmware.converter.ConverterAgentInternalLoginCredentials login,
           com.vmware.converter.ManagedObjectReference vmFolder,
           com.vmware.converter.ManagedObjectReference resourcePool,
           com.vmware.converter.ManagedObjectReference datastore,
           com.vmware.converter.ManagedObjectReference[] datastoreLocations,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.Boolean doNotCreateUnspecifiedDevices) {
        super(
            config,
            targetStorageLayout,
            vmName,
            networkParams,
            basicHardwareParams,
            vmxnetPresent,
            preserveDeviceBacking,
            preserveIdentity);
        this.login = login;
        this.vmFolder = vmFolder;
        this.resourcePool = resourcePool;
        this.datastore = datastore;
        this.datastoreLocations = datastoreLocations;
        this.host = host;
        this.doNotCreateUnspecifiedDevices = doNotCreateUnspecifiedDevices;
    }


    /**
     * Gets the login value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return login
     */
    public com.vmware.converter.ConverterAgentInternalLoginCredentials getLogin() {
        return login;
    }


    /**
     * Sets the login value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param login
     */
    public void setLogin(com.vmware.converter.ConverterAgentInternalLoginCredentials login) {
        this.login = login;
    }


    /**
     * Gets the vmFolder value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return vmFolder
     */
    public com.vmware.converter.ManagedObjectReference getVmFolder() {
        return vmFolder;
    }


    /**
     * Sets the vmFolder value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param vmFolder
     */
    public void setVmFolder(com.vmware.converter.ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }


    /**
     * Gets the resourcePool value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return resourcePool
     */
    public com.vmware.converter.ManagedObjectReference getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param resourcePool
     */
    public void setResourcePool(com.vmware.converter.ManagedObjectReference resourcePool) {
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the datastore value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the datastoreLocations value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return datastoreLocations
     */
    public com.vmware.converter.ManagedObjectReference[] getDatastoreLocations() {
        return datastoreLocations;
    }


    /**
     * Sets the datastoreLocations value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param datastoreLocations
     */
    public void setDatastoreLocations(com.vmware.converter.ManagedObjectReference[] datastoreLocations) {
        this.datastoreLocations = datastoreLocations;
    }

    public com.vmware.converter.ManagedObjectReference getDatastoreLocations(int i) {
        return this.datastoreLocations[i];
    }

    public void setDatastoreLocations(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.datastoreLocations[i] = _value;
    }


    /**
     * Gets the host value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the doNotCreateUnspecifiedDevices value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @return doNotCreateUnspecifiedDevices
     */
    public java.lang.Boolean getDoNotCreateUnspecifiedDevices() {
        return doNotCreateUnspecifiedDevices;
    }


    /**
     * Sets the doNotCreateUnspecifiedDevices value for this ConverterAgentInternalManagedVMOptions.
     * 
     * @param doNotCreateUnspecifiedDevices
     */
    public void setDoNotCreateUnspecifiedDevices(java.lang.Boolean doNotCreateUnspecifiedDevices) {
        this.doNotCreateUnspecifiedDevices = doNotCreateUnspecifiedDevices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalManagedVMOptions)) return false;
        ConverterAgentInternalManagedVMOptions other = (ConverterAgentInternalManagedVMOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.vmFolder==null && other.getVmFolder()==null) || 
             (this.vmFolder!=null &&
              this.vmFolder.equals(other.getVmFolder()))) &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.datastoreLocations==null && other.getDatastoreLocations()==null) || 
             (this.datastoreLocations!=null &&
              java.util.Arrays.equals(this.datastoreLocations, other.getDatastoreLocations()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.doNotCreateUnspecifiedDevices==null && other.getDoNotCreateUnspecifiedDevices()==null) || 
             (this.doNotCreateUnspecifiedDevices!=null &&
              this.doNotCreateUnspecifiedDevices.equals(other.getDoNotCreateUnspecifiedDevices())));
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getVmFolder() != null) {
            _hashCode += getVmFolder().hashCode();
        }
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getDatastoreLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getDoNotCreateUnspecifiedDevices() != null) {
            _hashCode += getDoNotCreateUnspecifiedDevices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalManagedVMOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalManagedVMOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLoginCredentials"));
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
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "datastoreLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotCreateUnspecifiedDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doNotCreateUnspecifiedDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
