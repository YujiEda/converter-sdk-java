/**
 * HostConfigSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConfigSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private int port;

    private java.lang.String sslThumbprint;

    private com.vmware.converter.AboutInfo product;

    private boolean vmotionEnabled;

    private java.lang.Boolean faultToleranceEnabled;

    private com.vmware.converter.HostFeatureVersionInfo[] featureVersion;

    private com.vmware.converter.ManagedObjectReference agentVmDatastore;

    private com.vmware.converter.ManagedObjectReference agentVmNetwork;

    public HostConfigSummary() {
    }

    public HostConfigSummary(
           java.lang.String name,
           int port,
           java.lang.String sslThumbprint,
           com.vmware.converter.AboutInfo product,
           boolean vmotionEnabled,
           java.lang.Boolean faultToleranceEnabled,
           com.vmware.converter.HostFeatureVersionInfo[] featureVersion,
           com.vmware.converter.ManagedObjectReference agentVmDatastore,
           com.vmware.converter.ManagedObjectReference agentVmNetwork) {
        this.name = name;
        this.port = port;
        this.sslThumbprint = sslThumbprint;
        this.product = product;
        this.vmotionEnabled = vmotionEnabled;
        this.faultToleranceEnabled = faultToleranceEnabled;
        this.featureVersion = featureVersion;
        this.agentVmDatastore = agentVmDatastore;
        this.agentVmNetwork = agentVmNetwork;
    }


    /**
     * Gets the name value for this HostConfigSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostConfigSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the port value for this HostConfigSummary.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this HostConfigSummary.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the sslThumbprint value for this HostConfigSummary.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this HostConfigSummary.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the product value for this HostConfigSummary.
     * 
     * @return product
     */
    public com.vmware.converter.AboutInfo getProduct() {
        return product;
    }


    /**
     * Sets the product value for this HostConfigSummary.
     * 
     * @param product
     */
    public void setProduct(com.vmware.converter.AboutInfo product) {
        this.product = product;
    }


    /**
     * Gets the vmotionEnabled value for this HostConfigSummary.
     * 
     * @return vmotionEnabled
     */
    public boolean isVmotionEnabled() {
        return vmotionEnabled;
    }


    /**
     * Sets the vmotionEnabled value for this HostConfigSummary.
     * 
     * @param vmotionEnabled
     */
    public void setVmotionEnabled(boolean vmotionEnabled) {
        this.vmotionEnabled = vmotionEnabled;
    }


    /**
     * Gets the faultToleranceEnabled value for this HostConfigSummary.
     * 
     * @return faultToleranceEnabled
     */
    public java.lang.Boolean getFaultToleranceEnabled() {
        return faultToleranceEnabled;
    }


    /**
     * Sets the faultToleranceEnabled value for this HostConfigSummary.
     * 
     * @param faultToleranceEnabled
     */
    public void setFaultToleranceEnabled(java.lang.Boolean faultToleranceEnabled) {
        this.faultToleranceEnabled = faultToleranceEnabled;
    }


    /**
     * Gets the featureVersion value for this HostConfigSummary.
     * 
     * @return featureVersion
     */
    public com.vmware.converter.HostFeatureVersionInfo[] getFeatureVersion() {
        return featureVersion;
    }


    /**
     * Sets the featureVersion value for this HostConfigSummary.
     * 
     * @param featureVersion
     */
    public void setFeatureVersion(com.vmware.converter.HostFeatureVersionInfo[] featureVersion) {
        this.featureVersion = featureVersion;
    }

    public com.vmware.converter.HostFeatureVersionInfo getFeatureVersion(int i) {
        return this.featureVersion[i];
    }

    public void setFeatureVersion(int i, com.vmware.converter.HostFeatureVersionInfo _value) {
        this.featureVersion[i] = _value;
    }


    /**
     * Gets the agentVmDatastore value for this HostConfigSummary.
     * 
     * @return agentVmDatastore
     */
    public com.vmware.converter.ManagedObjectReference getAgentVmDatastore() {
        return agentVmDatastore;
    }


    /**
     * Sets the agentVmDatastore value for this HostConfigSummary.
     * 
     * @param agentVmDatastore
     */
    public void setAgentVmDatastore(com.vmware.converter.ManagedObjectReference agentVmDatastore) {
        this.agentVmDatastore = agentVmDatastore;
    }


    /**
     * Gets the agentVmNetwork value for this HostConfigSummary.
     * 
     * @return agentVmNetwork
     */
    public com.vmware.converter.ManagedObjectReference getAgentVmNetwork() {
        return agentVmNetwork;
    }


    /**
     * Sets the agentVmNetwork value for this HostConfigSummary.
     * 
     * @param agentVmNetwork
     */
    public void setAgentVmNetwork(com.vmware.converter.ManagedObjectReference agentVmNetwork) {
        this.agentVmNetwork = agentVmNetwork;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConfigSummary)) return false;
        HostConfigSummary other = (HostConfigSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.port == other.getPort() &&
            ((this.sslThumbprint==null && other.getSslThumbprint()==null) || 
             (this.sslThumbprint!=null &&
              this.sslThumbprint.equals(other.getSslThumbprint()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            this.vmotionEnabled == other.isVmotionEnabled() &&
            ((this.faultToleranceEnabled==null && other.getFaultToleranceEnabled()==null) || 
             (this.faultToleranceEnabled!=null &&
              this.faultToleranceEnabled.equals(other.getFaultToleranceEnabled()))) &&
            ((this.featureVersion==null && other.getFeatureVersion()==null) || 
             (this.featureVersion!=null &&
              java.util.Arrays.equals(this.featureVersion, other.getFeatureVersion()))) &&
            ((this.agentVmDatastore==null && other.getAgentVmDatastore()==null) || 
             (this.agentVmDatastore!=null &&
              this.agentVmDatastore.equals(other.getAgentVmDatastore()))) &&
            ((this.agentVmNetwork==null && other.getAgentVmNetwork()==null) || 
             (this.agentVmNetwork!=null &&
              this.agentVmNetwork.equals(other.getAgentVmNetwork())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getPort();
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        _hashCode += (isVmotionEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFaultToleranceEnabled() != null) {
            _hashCode += getFaultToleranceEnabled().hashCode();
        }
        if (getFeatureVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureVersion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgentVmDatastore() != null) {
            _hashCode += getAgentVmDatastore().hashCode();
        }
        if (getAgentVmNetwork() != null) {
            _hashCode += getAgentVmNetwork().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostConfigSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultToleranceEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultToleranceEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureVersionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentVmDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "agentVmDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentVmNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "agentVmNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
