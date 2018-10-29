/**
 * ConverterHelperVmNetworkParamsStaticNetworkParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHelperVmNetworkParamsStaticNetworkParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.String subnetMask;

    private java.lang.String gateway;

    private java.lang.String[] dnsServers;

    private java.lang.String[] dnsSuffixes;

    public ConverterHelperVmNetworkParamsStaticNetworkParams() {
    }

    public ConverterHelperVmNetworkParamsStaticNetworkParams(
           java.lang.String hostname,
           java.lang.String subnetMask,
           java.lang.String gateway,
           java.lang.String[] dnsServers,
           java.lang.String[] dnsSuffixes) {
        this.hostname = hostname;
        this.subnetMask = subnetMask;
        this.gateway = gateway;
        this.dnsServers = dnsServers;
        this.dnsSuffixes = dnsSuffixes;
    }


    /**
     * Gets the hostname value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the subnetMask value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @return subnetMask
     */
    public java.lang.String getSubnetMask() {
        return subnetMask;
    }


    /**
     * Sets the subnetMask value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @param subnetMask
     */
    public void setSubnetMask(java.lang.String subnetMask) {
        this.subnetMask = subnetMask;
    }


    /**
     * Gets the gateway value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the dnsServers value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @return dnsServers
     */
    public java.lang.String[] getDnsServers() {
        return dnsServers;
    }


    /**
     * Sets the dnsServers value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @param dnsServers
     */
    public void setDnsServers(java.lang.String[] dnsServers) {
        this.dnsServers = dnsServers;
    }

    public java.lang.String getDnsServers(int i) {
        return this.dnsServers[i];
    }

    public void setDnsServers(int i, java.lang.String _value) {
        this.dnsServers[i] = _value;
    }


    /**
     * Gets the dnsSuffixes value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @return dnsSuffixes
     */
    public java.lang.String[] getDnsSuffixes() {
        return dnsSuffixes;
    }


    /**
     * Sets the dnsSuffixes value for this ConverterHelperVmNetworkParamsStaticNetworkParams.
     * 
     * @param dnsSuffixes
     */
    public void setDnsSuffixes(java.lang.String[] dnsSuffixes) {
        this.dnsSuffixes = dnsSuffixes;
    }

    public java.lang.String getDnsSuffixes(int i) {
        return this.dnsSuffixes[i];
    }

    public void setDnsSuffixes(int i, java.lang.String _value) {
        this.dnsSuffixes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHelperVmNetworkParamsStaticNetworkParams)) return false;
        ConverterHelperVmNetworkParamsStaticNetworkParams other = (ConverterHelperVmNetworkParamsStaticNetworkParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.subnetMask==null && other.getSubnetMask()==null) || 
             (this.subnetMask!=null &&
              this.subnetMask.equals(other.getSubnetMask()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.dnsServers==null && other.getDnsServers()==null) || 
             (this.dnsServers!=null &&
              java.util.Arrays.equals(this.dnsServers, other.getDnsServers()))) &&
            ((this.dnsSuffixes==null && other.getDnsSuffixes()==null) || 
             (this.dnsSuffixes!=null &&
              java.util.Arrays.equals(this.dnsSuffixes, other.getDnsSuffixes())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getSubnetMask() != null) {
            _hashCode += getSubnetMask().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getDnsServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnsServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnsServers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnsSuffixes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnsSuffixes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnsSuffixes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterHelperVmNetworkParamsStaticNetworkParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParamsStaticNetworkParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "subnetMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsServers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dnsServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsSuffixes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dnsSuffixes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
