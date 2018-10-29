/**
 * HostNetStackInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNetStackInstance  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private com.vmware.converter.HostDnsConfig dnsConfig;

    private com.vmware.converter.HostIpRouteConfig ipRouteConfig;

    private java.lang.Integer requestedMaxNumberOfConnections;

    private java.lang.String congestionControlAlgorithm;

    private java.lang.Boolean ipV6Enabled;

    private com.vmware.converter.HostIpRouteTableConfig routeTableConfig;

    public HostNetStackInstance() {
    }

    public HostNetStackInstance(
           java.lang.String key,
           java.lang.String name,
           com.vmware.converter.HostDnsConfig dnsConfig,
           com.vmware.converter.HostIpRouteConfig ipRouteConfig,
           java.lang.Integer requestedMaxNumberOfConnections,
           java.lang.String congestionControlAlgorithm,
           java.lang.Boolean ipV6Enabled,
           com.vmware.converter.HostIpRouteTableConfig routeTableConfig) {
        this.key = key;
        this.name = name;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.requestedMaxNumberOfConnections = requestedMaxNumberOfConnections;
        this.congestionControlAlgorithm = congestionControlAlgorithm;
        this.ipV6Enabled = ipV6Enabled;
        this.routeTableConfig = routeTableConfig;
    }


    /**
     * Gets the key value for this HostNetStackInstance.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostNetStackInstance.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this HostNetStackInstance.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostNetStackInstance.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dnsConfig value for this HostNetStackInstance.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this HostNetStackInstance.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this HostNetStackInstance.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this HostNetStackInstance.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the requestedMaxNumberOfConnections value for this HostNetStackInstance.
     * 
     * @return requestedMaxNumberOfConnections
     */
    public java.lang.Integer getRequestedMaxNumberOfConnections() {
        return requestedMaxNumberOfConnections;
    }


    /**
     * Sets the requestedMaxNumberOfConnections value for this HostNetStackInstance.
     * 
     * @param requestedMaxNumberOfConnections
     */
    public void setRequestedMaxNumberOfConnections(java.lang.Integer requestedMaxNumberOfConnections) {
        this.requestedMaxNumberOfConnections = requestedMaxNumberOfConnections;
    }


    /**
     * Gets the congestionControlAlgorithm value for this HostNetStackInstance.
     * 
     * @return congestionControlAlgorithm
     */
    public java.lang.String getCongestionControlAlgorithm() {
        return congestionControlAlgorithm;
    }


    /**
     * Sets the congestionControlAlgorithm value for this HostNetStackInstance.
     * 
     * @param congestionControlAlgorithm
     */
    public void setCongestionControlAlgorithm(java.lang.String congestionControlAlgorithm) {
        this.congestionControlAlgorithm = congestionControlAlgorithm;
    }


    /**
     * Gets the ipV6Enabled value for this HostNetStackInstance.
     * 
     * @return ipV6Enabled
     */
    public java.lang.Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }


    /**
     * Sets the ipV6Enabled value for this HostNetStackInstance.
     * 
     * @param ipV6Enabled
     */
    public void setIpV6Enabled(java.lang.Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }


    /**
     * Gets the routeTableConfig value for this HostNetStackInstance.
     * 
     * @return routeTableConfig
     */
    public com.vmware.converter.HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }


    /**
     * Sets the routeTableConfig value for this HostNetStackInstance.
     * 
     * @param routeTableConfig
     */
    public void setRouteTableConfig(com.vmware.converter.HostIpRouteTableConfig routeTableConfig) {
        this.routeTableConfig = routeTableConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetStackInstance)) return false;
        HostNetStackInstance other = (HostNetStackInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig()))) &&
            ((this.requestedMaxNumberOfConnections==null && other.getRequestedMaxNumberOfConnections()==null) || 
             (this.requestedMaxNumberOfConnections!=null &&
              this.requestedMaxNumberOfConnections.equals(other.getRequestedMaxNumberOfConnections()))) &&
            ((this.congestionControlAlgorithm==null && other.getCongestionControlAlgorithm()==null) || 
             (this.congestionControlAlgorithm!=null &&
              this.congestionControlAlgorithm.equals(other.getCongestionControlAlgorithm()))) &&
            ((this.ipV6Enabled==null && other.getIpV6Enabled()==null) || 
             (this.ipV6Enabled!=null &&
              this.ipV6Enabled.equals(other.getIpV6Enabled()))) &&
            ((this.routeTableConfig==null && other.getRouteTableConfig()==null) || 
             (this.routeTableConfig!=null &&
              this.routeTableConfig.equals(other.getRouteTableConfig())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpRouteConfig() != null) {
            _hashCode += getIpRouteConfig().hashCode();
        }
        if (getRequestedMaxNumberOfConnections() != null) {
            _hashCode += getRequestedMaxNumberOfConnections().hashCode();
        }
        if (getCongestionControlAlgorithm() != null) {
            _hashCode += getCongestionControlAlgorithm().hashCode();
        }
        if (getIpV6Enabled() != null) {
            _hashCode += getIpV6Enabled().hashCode();
        }
        if (getRouteTableConfig() != null) {
            _hashCode += getRouteTableConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetStackInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetStackInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDnsConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedMaxNumberOfConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requestedMaxNumberOfConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionControlAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "congestionControlAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV6Enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipV6Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeTableConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "routeTableConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteTableConfig"));
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
