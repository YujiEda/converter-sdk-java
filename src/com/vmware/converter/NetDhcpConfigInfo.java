/**
 * NetDhcpConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetDhcpConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv6;

    private com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv4;

    public NetDhcpConfigInfo() {
    }

    public NetDhcpConfigInfo(
           com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv6,
           com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv4) {
        this.ipv6 = ipv6;
        this.ipv4 = ipv4;
    }


    /**
     * Gets the ipv6 value for this NetDhcpConfigInfo.
     * 
     * @return ipv6
     */
    public com.vmware.converter.NetDhcpConfigInfoDhcpOptions getIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this NetDhcpConfigInfo.
     * 
     * @param ipv6
     */
    public void setIpv6(com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv6) {
        this.ipv6 = ipv6;
    }


    /**
     * Gets the ipv4 value for this NetDhcpConfigInfo.
     * 
     * @return ipv4
     */
    public com.vmware.converter.NetDhcpConfigInfoDhcpOptions getIpv4() {
        return ipv4;
    }


    /**
     * Sets the ipv4 value for this NetDhcpConfigInfo.
     * 
     * @param ipv4
     */
    public void setIpv4(com.vmware.converter.NetDhcpConfigInfoDhcpOptions ipv4) {
        this.ipv4 = ipv4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetDhcpConfigInfo)) return false;
        NetDhcpConfigInfo other = (NetDhcpConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipv6==null && other.getIpv6()==null) || 
             (this.ipv6!=null &&
              this.ipv6.equals(other.getIpv6()))) &&
            ((this.ipv4==null && other.getIpv4()==null) || 
             (this.ipv4!=null &&
              this.ipv4.equals(other.getIpv4())));
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
        if (getIpv6() != null) {
            _hashCode += getIpv6().hashCode();
        }
        if (getIpv4() != null) {
            _hashCode += getIpv4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetDhcpConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfoDhcpOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv4"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfoDhcpOptions"));
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
