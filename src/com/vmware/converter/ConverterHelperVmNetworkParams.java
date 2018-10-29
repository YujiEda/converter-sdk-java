/**
 * ConverterHelperVmNetworkParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHelperVmNetworkParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean useIpv4;

    private java.lang.Boolean useDhcp;

    private java.lang.Boolean useIpv6;

    private java.lang.String ipv6ConfigType;

    private com.vmware.converter.ConverterHelperVmNetworkParamsStaticNetworkParams staticNetworkParams;

    private com.vmware.converter.ConverterHelperVmNetworkParamsStaticIpv6NetworkParams staticIpv6NetworkParams;

    private java.lang.String[] dnsServers;

    private java.lang.String[] dnsSuffixes;

    public ConverterHelperVmNetworkParams() {
    }

    public ConverterHelperVmNetworkParams(
           java.lang.Boolean useIpv4,
           java.lang.Boolean useDhcp,
           java.lang.Boolean useIpv6,
           java.lang.String ipv6ConfigType,
           com.vmware.converter.ConverterHelperVmNetworkParamsStaticNetworkParams staticNetworkParams,
           com.vmware.converter.ConverterHelperVmNetworkParamsStaticIpv6NetworkParams staticIpv6NetworkParams,
           java.lang.String[] dnsServers,
           java.lang.String[] dnsSuffixes) {
        this.useIpv4 = useIpv4;
        this.useDhcp = useDhcp;
        this.useIpv6 = useIpv6;
        this.ipv6ConfigType = ipv6ConfigType;
        this.staticNetworkParams = staticNetworkParams;
        this.staticIpv6NetworkParams = staticIpv6NetworkParams;
        this.dnsServers = dnsServers;
        this.dnsSuffixes = dnsSuffixes;
    }


    /**
     * Gets the useIpv4 value for this ConverterHelperVmNetworkParams.
     * 
     * @return useIpv4
     */
    public java.lang.Boolean getUseIpv4() {
        return useIpv4;
    }


    /**
     * Sets the useIpv4 value for this ConverterHelperVmNetworkParams.
     * 
     * @param useIpv4
     */
    public void setUseIpv4(java.lang.Boolean useIpv4) {
        this.useIpv4 = useIpv4;
    }


    /**
     * Gets the useDhcp value for this ConverterHelperVmNetworkParams.
     * 
     * @return useDhcp
     */
    public java.lang.Boolean getUseDhcp() {
        return useDhcp;
    }


    /**
     * Sets the useDhcp value for this ConverterHelperVmNetworkParams.
     * 
     * @param useDhcp
     */
    public void setUseDhcp(java.lang.Boolean useDhcp) {
        this.useDhcp = useDhcp;
    }


    /**
     * Gets the useIpv6 value for this ConverterHelperVmNetworkParams.
     * 
     * @return useIpv6
     */
    public java.lang.Boolean getUseIpv6() {
        return useIpv6;
    }


    /**
     * Sets the useIpv6 value for this ConverterHelperVmNetworkParams.
     * 
     * @param useIpv6
     */
    public void setUseIpv6(java.lang.Boolean useIpv6) {
        this.useIpv6 = useIpv6;
    }


    /**
     * Gets the ipv6ConfigType value for this ConverterHelperVmNetworkParams.
     * 
     * @return ipv6ConfigType
     */
    public java.lang.String getIpv6ConfigType() {
        return ipv6ConfigType;
    }


    /**
     * Sets the ipv6ConfigType value for this ConverterHelperVmNetworkParams.
     * 
     * @param ipv6ConfigType
     */
    public void setIpv6ConfigType(java.lang.String ipv6ConfigType) {
        this.ipv6ConfigType = ipv6ConfigType;
    }


    /**
     * Gets the staticNetworkParams value for this ConverterHelperVmNetworkParams.
     * 
     * @return staticNetworkParams
     */
    public com.vmware.converter.ConverterHelperVmNetworkParamsStaticNetworkParams getStaticNetworkParams() {
        return staticNetworkParams;
    }


    /**
     * Sets the staticNetworkParams value for this ConverterHelperVmNetworkParams.
     * 
     * @param staticNetworkParams
     */
    public void setStaticNetworkParams(com.vmware.converter.ConverterHelperVmNetworkParamsStaticNetworkParams staticNetworkParams) {
        this.staticNetworkParams = staticNetworkParams;
    }


    /**
     * Gets the staticIpv6NetworkParams value for this ConverterHelperVmNetworkParams.
     * 
     * @return staticIpv6NetworkParams
     */
    public com.vmware.converter.ConverterHelperVmNetworkParamsStaticIpv6NetworkParams getStaticIpv6NetworkParams() {
        return staticIpv6NetworkParams;
    }


    /**
     * Sets the staticIpv6NetworkParams value for this ConverterHelperVmNetworkParams.
     * 
     * @param staticIpv6NetworkParams
     */
    public void setStaticIpv6NetworkParams(com.vmware.converter.ConverterHelperVmNetworkParamsStaticIpv6NetworkParams staticIpv6NetworkParams) {
        this.staticIpv6NetworkParams = staticIpv6NetworkParams;
    }


    /**
     * Gets the dnsServers value for this ConverterHelperVmNetworkParams.
     * 
     * @return dnsServers
     */
    public java.lang.String[] getDnsServers() {
        return dnsServers;
    }


    /**
     * Sets the dnsServers value for this ConverterHelperVmNetworkParams.
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
     * Gets the dnsSuffixes value for this ConverterHelperVmNetworkParams.
     * 
     * @return dnsSuffixes
     */
    public java.lang.String[] getDnsSuffixes() {
        return dnsSuffixes;
    }


    /**
     * Sets the dnsSuffixes value for this ConverterHelperVmNetworkParams.
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
        if (!(obj instanceof ConverterHelperVmNetworkParams)) return false;
        ConverterHelperVmNetworkParams other = (ConverterHelperVmNetworkParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.useIpv4==null && other.getUseIpv4()==null) || 
             (this.useIpv4!=null &&
              this.useIpv4.equals(other.getUseIpv4()))) &&
            ((this.useDhcp==null && other.getUseDhcp()==null) || 
             (this.useDhcp!=null &&
              this.useDhcp.equals(other.getUseDhcp()))) &&
            ((this.useIpv6==null && other.getUseIpv6()==null) || 
             (this.useIpv6!=null &&
              this.useIpv6.equals(other.getUseIpv6()))) &&
            ((this.ipv6ConfigType==null && other.getIpv6ConfigType()==null) || 
             (this.ipv6ConfigType!=null &&
              this.ipv6ConfigType.equals(other.getIpv6ConfigType()))) &&
            ((this.staticNetworkParams==null && other.getStaticNetworkParams()==null) || 
             (this.staticNetworkParams!=null &&
              this.staticNetworkParams.equals(other.getStaticNetworkParams()))) &&
            ((this.staticIpv6NetworkParams==null && other.getStaticIpv6NetworkParams()==null) || 
             (this.staticIpv6NetworkParams!=null &&
              this.staticIpv6NetworkParams.equals(other.getStaticIpv6NetworkParams()))) &&
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
        if (getUseIpv4() != null) {
            _hashCode += getUseIpv4().hashCode();
        }
        if (getUseDhcp() != null) {
            _hashCode += getUseDhcp().hashCode();
        }
        if (getUseIpv6() != null) {
            _hashCode += getUseIpv6().hashCode();
        }
        if (getIpv6ConfigType() != null) {
            _hashCode += getIpv6ConfigType().hashCode();
        }
        if (getStaticNetworkParams() != null) {
            _hashCode += getStaticNetworkParams().hashCode();
        }
        if (getStaticIpv6NetworkParams() != null) {
            _hashCode += getStaticIpv6NetworkParams().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConverterHelperVmNetworkParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useIpv4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useIpv4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useDhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useIpv6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useIpv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6ConfigType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ipv6ConfigType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticNetworkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "staticNetworkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParamsStaticNetworkParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticIpv6NetworkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "staticIpv6NetworkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParamsStaticIpv6NetworkParams"));
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
