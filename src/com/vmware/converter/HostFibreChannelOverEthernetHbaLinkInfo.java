/**
 * HostFibreChannelOverEthernetHbaLinkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFibreChannelOverEthernetHbaLinkInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vnportMac;

    private java.lang.String fcfMac;

    private int vlanId;

    public HostFibreChannelOverEthernetHbaLinkInfo() {
    }

    public HostFibreChannelOverEthernetHbaLinkInfo(
           java.lang.String vnportMac,
           java.lang.String fcfMac,
           int vlanId) {
        this.vnportMac = vnportMac;
        this.fcfMac = fcfMac;
        this.vlanId = vlanId;
    }


    /**
     * Gets the vnportMac value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @return vnportMac
     */
    public java.lang.String getVnportMac() {
        return vnportMac;
    }


    /**
     * Sets the vnportMac value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @param vnportMac
     */
    public void setVnportMac(java.lang.String vnportMac) {
        this.vnportMac = vnportMac;
    }


    /**
     * Gets the fcfMac value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @return fcfMac
     */
    public java.lang.String getFcfMac() {
        return fcfMac;
    }


    /**
     * Sets the fcfMac value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @param fcfMac
     */
    public void setFcfMac(java.lang.String fcfMac) {
        this.fcfMac = fcfMac;
    }


    /**
     * Gets the vlanId value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @return vlanId
     */
    public int getVlanId() {
        return vlanId;
    }


    /**
     * Sets the vlanId value for this HostFibreChannelOverEthernetHbaLinkInfo.
     * 
     * @param vlanId
     */
    public void setVlanId(int vlanId) {
        this.vlanId = vlanId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFibreChannelOverEthernetHbaLinkInfo)) return false;
        HostFibreChannelOverEthernetHbaLinkInfo other = (HostFibreChannelOverEthernetHbaLinkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vnportMac==null && other.getVnportMac()==null) || 
             (this.vnportMac!=null &&
              this.vnportMac.equals(other.getVnportMac()))) &&
            ((this.fcfMac==null && other.getFcfMac()==null) || 
             (this.fcfMac!=null &&
              this.fcfMac.equals(other.getFcfMac()))) &&
            this.vlanId == other.getVlanId();
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
        if (getVnportMac() != null) {
            _hashCode += getVnportMac().hashCode();
        }
        if (getFcfMac() != null) {
            _hashCode += getFcfMac().hashCode();
        }
        _hashCode += getVlanId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFibreChannelOverEthernetHbaLinkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFibreChannelOverEthernetHbaLinkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnportMac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnportMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fcfMac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fcfMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
