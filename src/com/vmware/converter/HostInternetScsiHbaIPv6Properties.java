/**
 * HostInternetScsiHbaIPv6Properties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostInternetScsiHbaIPv6Properties  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address;

    private java.lang.Boolean ipv6DhcpConfigurationEnabled;

    private java.lang.Boolean ipv6LinkLocalAutoConfigurationEnabled;

    private java.lang.Boolean ipv6RouterAdvertisementConfigurationEnabled;

    private java.lang.String ipv6DefaultGateway;

    public HostInternetScsiHbaIPv6Properties() {
    }

    public HostInternetScsiHbaIPv6Properties(
           com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address,
           java.lang.Boolean ipv6DhcpConfigurationEnabled,
           java.lang.Boolean ipv6LinkLocalAutoConfigurationEnabled,
           java.lang.Boolean ipv6RouterAdvertisementConfigurationEnabled,
           java.lang.String ipv6DefaultGateway) {
        this.iscsiIpv6Address = iscsiIpv6Address;
        this.ipv6DhcpConfigurationEnabled = ipv6DhcpConfigurationEnabled;
        this.ipv6LinkLocalAutoConfigurationEnabled = ipv6LinkLocalAutoConfigurationEnabled;
        this.ipv6RouterAdvertisementConfigurationEnabled = ipv6RouterAdvertisementConfigurationEnabled;
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }


    /**
     * Gets the iscsiIpv6Address value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @return iscsiIpv6Address
     */
    public com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] getIscsiIpv6Address() {
        return iscsiIpv6Address;
    }


    /**
     * Sets the iscsiIpv6Address value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @param iscsiIpv6Address
     */
    public void setIscsiIpv6Address(com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address) {
        this.iscsiIpv6Address = iscsiIpv6Address;
    }

    public com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address getIscsiIpv6Address(int i) {
        return this.iscsiIpv6Address[i];
    }

    public void setIscsiIpv6Address(int i, com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address _value) {
        this.iscsiIpv6Address[i] = _value;
    }


    /**
     * Gets the ipv6DhcpConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @return ipv6DhcpConfigurationEnabled
     */
    public java.lang.Boolean getIpv6DhcpConfigurationEnabled() {
        return ipv6DhcpConfigurationEnabled;
    }


    /**
     * Sets the ipv6DhcpConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @param ipv6DhcpConfigurationEnabled
     */
    public void setIpv6DhcpConfigurationEnabled(java.lang.Boolean ipv6DhcpConfigurationEnabled) {
        this.ipv6DhcpConfigurationEnabled = ipv6DhcpConfigurationEnabled;
    }


    /**
     * Gets the ipv6LinkLocalAutoConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @return ipv6LinkLocalAutoConfigurationEnabled
     */
    public java.lang.Boolean getIpv6LinkLocalAutoConfigurationEnabled() {
        return ipv6LinkLocalAutoConfigurationEnabled;
    }


    /**
     * Sets the ipv6LinkLocalAutoConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @param ipv6LinkLocalAutoConfigurationEnabled
     */
    public void setIpv6LinkLocalAutoConfigurationEnabled(java.lang.Boolean ipv6LinkLocalAutoConfigurationEnabled) {
        this.ipv6LinkLocalAutoConfigurationEnabled = ipv6LinkLocalAutoConfigurationEnabled;
    }


    /**
     * Gets the ipv6RouterAdvertisementConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @return ipv6RouterAdvertisementConfigurationEnabled
     */
    public java.lang.Boolean getIpv6RouterAdvertisementConfigurationEnabled() {
        return ipv6RouterAdvertisementConfigurationEnabled;
    }


    /**
     * Sets the ipv6RouterAdvertisementConfigurationEnabled value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @param ipv6RouterAdvertisementConfigurationEnabled
     */
    public void setIpv6RouterAdvertisementConfigurationEnabled(java.lang.Boolean ipv6RouterAdvertisementConfigurationEnabled) {
        this.ipv6RouterAdvertisementConfigurationEnabled = ipv6RouterAdvertisementConfigurationEnabled;
    }


    /**
     * Gets the ipv6DefaultGateway value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @return ipv6DefaultGateway
     */
    public java.lang.String getIpv6DefaultGateway() {
        return ipv6DefaultGateway;
    }


    /**
     * Sets the ipv6DefaultGateway value for this HostInternetScsiHbaIPv6Properties.
     * 
     * @param ipv6DefaultGateway
     */
    public void setIpv6DefaultGateway(java.lang.String ipv6DefaultGateway) {
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaIPv6Properties)) return false;
        HostInternetScsiHbaIPv6Properties other = (HostInternetScsiHbaIPv6Properties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iscsiIpv6Address==null && other.getIscsiIpv6Address()==null) || 
             (this.iscsiIpv6Address!=null &&
              java.util.Arrays.equals(this.iscsiIpv6Address, other.getIscsiIpv6Address()))) &&
            ((this.ipv6DhcpConfigurationEnabled==null && other.getIpv6DhcpConfigurationEnabled()==null) || 
             (this.ipv6DhcpConfigurationEnabled!=null &&
              this.ipv6DhcpConfigurationEnabled.equals(other.getIpv6DhcpConfigurationEnabled()))) &&
            ((this.ipv6LinkLocalAutoConfigurationEnabled==null && other.getIpv6LinkLocalAutoConfigurationEnabled()==null) || 
             (this.ipv6LinkLocalAutoConfigurationEnabled!=null &&
              this.ipv6LinkLocalAutoConfigurationEnabled.equals(other.getIpv6LinkLocalAutoConfigurationEnabled()))) &&
            ((this.ipv6RouterAdvertisementConfigurationEnabled==null && other.getIpv6RouterAdvertisementConfigurationEnabled()==null) || 
             (this.ipv6RouterAdvertisementConfigurationEnabled!=null &&
              this.ipv6RouterAdvertisementConfigurationEnabled.equals(other.getIpv6RouterAdvertisementConfigurationEnabled()))) &&
            ((this.ipv6DefaultGateway==null && other.getIpv6DefaultGateway()==null) || 
             (this.ipv6DefaultGateway!=null &&
              this.ipv6DefaultGateway.equals(other.getIpv6DefaultGateway())));
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
        if (getIscsiIpv6Address() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIscsiIpv6Address());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIscsiIpv6Address(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpv6DhcpConfigurationEnabled() != null) {
            _hashCode += getIpv6DhcpConfigurationEnabled().hashCode();
        }
        if (getIpv6LinkLocalAutoConfigurationEnabled() != null) {
            _hashCode += getIpv6LinkLocalAutoConfigurationEnabled().hashCode();
        }
        if (getIpv6RouterAdvertisementConfigurationEnabled() != null) {
            _hashCode += getIpv6RouterAdvertisementConfigurationEnabled().hashCode();
        }
        if (getIpv6DefaultGateway() != null) {
            _hashCode += getIpv6DefaultGateway().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIPv6Properties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIPv6Properties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiIpv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iscsiIpv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIscsiIpv6Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6DhcpConfigurationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6DhcpConfigurationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6LinkLocalAutoConfigurationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6LinkLocalAutoConfigurationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6RouterAdvertisementConfigurationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6RouterAdvertisementConfigurationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6DefaultGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6DefaultGateway"));
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
