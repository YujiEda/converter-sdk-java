/**
 * NetDnsConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetDnsConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean dhcp;

    private java.lang.String hostName;

    private java.lang.String domainName;

    private java.lang.String[] ipAddress;

    private java.lang.String[] searchDomain;

    public NetDnsConfigInfo() {
    }

    public NetDnsConfigInfo(
           boolean dhcp,
           java.lang.String hostName,
           java.lang.String domainName,
           java.lang.String[] ipAddress,
           java.lang.String[] searchDomain) {
        this.dhcp = dhcp;
        this.hostName = hostName;
        this.domainName = domainName;
        this.ipAddress = ipAddress;
        this.searchDomain = searchDomain;
    }


    /**
     * Gets the dhcp value for this NetDnsConfigInfo.
     * 
     * @return dhcp
     */
    public boolean isDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this NetDnsConfigInfo.
     * 
     * @param dhcp
     */
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }


    /**
     * Gets the hostName value for this NetDnsConfigInfo.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this NetDnsConfigInfo.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the domainName value for this NetDnsConfigInfo.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this NetDnsConfigInfo.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the ipAddress value for this NetDnsConfigInfo.
     * 
     * @return ipAddress
     */
    public java.lang.String[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this NetDnsConfigInfo.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public java.lang.String getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, java.lang.String _value) {
        this.ipAddress[i] = _value;
    }


    /**
     * Gets the searchDomain value for this NetDnsConfigInfo.
     * 
     * @return searchDomain
     */
    public java.lang.String[] getSearchDomain() {
        return searchDomain;
    }


    /**
     * Sets the searchDomain value for this NetDnsConfigInfo.
     * 
     * @param searchDomain
     */
    public void setSearchDomain(java.lang.String[] searchDomain) {
        this.searchDomain = searchDomain;
    }

    public java.lang.String getSearchDomain(int i) {
        return this.searchDomain[i];
    }

    public void setSearchDomain(int i, java.lang.String _value) {
        this.searchDomain[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetDnsConfigInfo)) return false;
        NetDnsConfigInfo other = (NetDnsConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dhcp == other.isDhcp() &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress()))) &&
            ((this.searchDomain==null && other.getSearchDomain()==null) || 
             (this.searchDomain!=null &&
              java.util.Arrays.equals(this.searchDomain, other.getSearchDomain())));
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
        _hashCode += (isDhcp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getIpAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchDomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchDomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchDomain(), i);
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
        new org.apache.axis.description.TypeDesc(NetDnsConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDnsConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "searchDomain"));
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
