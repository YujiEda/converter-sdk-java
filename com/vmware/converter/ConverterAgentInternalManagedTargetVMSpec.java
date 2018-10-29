/**
 * ConverterAgentInternalManagedTargetVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalManagedTargetVMSpec  extends com.vmware.converter.ConverterAgentInternalTargetVMSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLoginCredentials credentials;

    private java.lang.String esxHost;

    private java.lang.String datastore;

    private java.lang.String folder;

    private java.lang.String resourcePool;

    public ConverterAgentInternalManagedTargetVMSpec() {
    }

    public ConverterAgentInternalManagedTargetVMSpec(
           java.lang.String vmName,
           com.vmware.converter.ConverterAgentInternalLoginCredentials credentials,
           java.lang.String esxHost,
           java.lang.String datastore,
           java.lang.String folder,
           java.lang.String resourcePool) {
        super(
            vmName);
        this.credentials = credentials;
        this.esxHost = esxHost;
        this.datastore = datastore;
        this.folder = folder;
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the credentials value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @return credentials
     */
    public com.vmware.converter.ConverterAgentInternalLoginCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @param credentials
     */
    public void setCredentials(com.vmware.converter.ConverterAgentInternalLoginCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the esxHost value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @return esxHost
     */
    public java.lang.String getEsxHost() {
        return esxHost;
    }


    /**
     * Sets the esxHost value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @param esxHost
     */
    public void setEsxHost(java.lang.String esxHost) {
        this.esxHost = esxHost;
    }


    /**
     * Gets the datastore value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @return datastore
     */
    public java.lang.String getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @param datastore
     */
    public void setDatastore(java.lang.String datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the folder value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @return folder
     */
    public java.lang.String getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @param folder
     */
    public void setFolder(java.lang.String folder) {
        this.folder = folder;
    }


    /**
     * Gets the resourcePool value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @return resourcePool
     */
    public java.lang.String getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this ConverterAgentInternalManagedTargetVMSpec.
     * 
     * @param resourcePool
     */
    public void setResourcePool(java.lang.String resourcePool) {
        this.resourcePool = resourcePool;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalManagedTargetVMSpec)) return false;
        ConverterAgentInternalManagedTargetVMSpec other = (ConverterAgentInternalManagedTargetVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.esxHost==null && other.getEsxHost()==null) || 
             (this.esxHost!=null &&
              this.esxHost.equals(other.getEsxHost()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool())));
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
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getEsxHost() != null) {
            _hashCode += getEsxHost().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalManagedTargetVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalManagedTargetVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLoginCredentials"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "esxHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resourcePool"));
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
