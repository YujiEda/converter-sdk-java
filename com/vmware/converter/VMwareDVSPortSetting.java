/**
 * VMwareDVSPortSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSPortSetting  extends com.vmware.converter.DVPortSetting  implements java.io.Serializable {
    private com.vmware.converter.VmwareDistributedVirtualSwitchVlanSpec vlan;

    private com.vmware.converter.IntPolicy qosTag;

    private com.vmware.converter.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy;

    private com.vmware.converter.DVSSecurityPolicy securityPolicy;

    private com.vmware.converter.BoolPolicy ipfixEnabled;

    private com.vmware.converter.BoolPolicy txUplink;

    private com.vmware.converter.VMwareUplinkLacpPolicy lacpPolicy;

    public VMwareDVSPortSetting() {
    }

    public VMwareDVSPortSetting(
           com.vmware.converter.BoolPolicy blocked,
           com.vmware.converter.BoolPolicy vmDirectPathGen2Allowed,
           com.vmware.converter.DVSTrafficShapingPolicy inShapingPolicy,
           com.vmware.converter.DVSTrafficShapingPolicy outShapingPolicy,
           com.vmware.converter.DVSVendorSpecificConfig vendorSpecificConfig,
           com.vmware.converter.StringPolicy networkResourcePoolKey,
           com.vmware.converter.DvsFilterPolicy filterPolicy,
           com.vmware.converter.VmwareDistributedVirtualSwitchVlanSpec vlan,
           com.vmware.converter.IntPolicy qosTag,
           com.vmware.converter.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy,
           com.vmware.converter.DVSSecurityPolicy securityPolicy,
           com.vmware.converter.BoolPolicy ipfixEnabled,
           com.vmware.converter.BoolPolicy txUplink,
           com.vmware.converter.VMwareUplinkLacpPolicy lacpPolicy) {
        super(
            blocked,
            vmDirectPathGen2Allowed,
            inShapingPolicy,
            outShapingPolicy,
            vendorSpecificConfig,
            networkResourcePoolKey,
            filterPolicy);
        this.vlan = vlan;
        this.qosTag = qosTag;
        this.uplinkTeamingPolicy = uplinkTeamingPolicy;
        this.securityPolicy = securityPolicy;
        this.ipfixEnabled = ipfixEnabled;
        this.txUplink = txUplink;
        this.lacpPolicy = lacpPolicy;
    }


    /**
     * Gets the vlan value for this VMwareDVSPortSetting.
     * 
     * @return vlan
     */
    public com.vmware.converter.VmwareDistributedVirtualSwitchVlanSpec getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this VMwareDVSPortSetting.
     * 
     * @param vlan
     */
    public void setVlan(com.vmware.converter.VmwareDistributedVirtualSwitchVlanSpec vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the qosTag value for this VMwareDVSPortSetting.
     * 
     * @return qosTag
     */
    public com.vmware.converter.IntPolicy getQosTag() {
        return qosTag;
    }


    /**
     * Sets the qosTag value for this VMwareDVSPortSetting.
     * 
     * @param qosTag
     */
    public void setQosTag(com.vmware.converter.IntPolicy qosTag) {
        this.qosTag = qosTag;
    }


    /**
     * Gets the uplinkTeamingPolicy value for this VMwareDVSPortSetting.
     * 
     * @return uplinkTeamingPolicy
     */
    public com.vmware.converter.VmwareUplinkPortTeamingPolicy getUplinkTeamingPolicy() {
        return uplinkTeamingPolicy;
    }


    /**
     * Sets the uplinkTeamingPolicy value for this VMwareDVSPortSetting.
     * 
     * @param uplinkTeamingPolicy
     */
    public void setUplinkTeamingPolicy(com.vmware.converter.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy) {
        this.uplinkTeamingPolicy = uplinkTeamingPolicy;
    }


    /**
     * Gets the securityPolicy value for this VMwareDVSPortSetting.
     * 
     * @return securityPolicy
     */
    public com.vmware.converter.DVSSecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }


    /**
     * Sets the securityPolicy value for this VMwareDVSPortSetting.
     * 
     * @param securityPolicy
     */
    public void setSecurityPolicy(com.vmware.converter.DVSSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }


    /**
     * Gets the ipfixEnabled value for this VMwareDVSPortSetting.
     * 
     * @return ipfixEnabled
     */
    public com.vmware.converter.BoolPolicy getIpfixEnabled() {
        return ipfixEnabled;
    }


    /**
     * Sets the ipfixEnabled value for this VMwareDVSPortSetting.
     * 
     * @param ipfixEnabled
     */
    public void setIpfixEnabled(com.vmware.converter.BoolPolicy ipfixEnabled) {
        this.ipfixEnabled = ipfixEnabled;
    }


    /**
     * Gets the txUplink value for this VMwareDVSPortSetting.
     * 
     * @return txUplink
     */
    public com.vmware.converter.BoolPolicy getTxUplink() {
        return txUplink;
    }


    /**
     * Sets the txUplink value for this VMwareDVSPortSetting.
     * 
     * @param txUplink
     */
    public void setTxUplink(com.vmware.converter.BoolPolicy txUplink) {
        this.txUplink = txUplink;
    }


    /**
     * Gets the lacpPolicy value for this VMwareDVSPortSetting.
     * 
     * @return lacpPolicy
     */
    public com.vmware.converter.VMwareUplinkLacpPolicy getLacpPolicy() {
        return lacpPolicy;
    }


    /**
     * Sets the lacpPolicy value for this VMwareDVSPortSetting.
     * 
     * @param lacpPolicy
     */
    public void setLacpPolicy(com.vmware.converter.VMwareUplinkLacpPolicy lacpPolicy) {
        this.lacpPolicy = lacpPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSPortSetting)) return false;
        VMwareDVSPortSetting other = (VMwareDVSPortSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.qosTag==null && other.getQosTag()==null) || 
             (this.qosTag!=null &&
              this.qosTag.equals(other.getQosTag()))) &&
            ((this.uplinkTeamingPolicy==null && other.getUplinkTeamingPolicy()==null) || 
             (this.uplinkTeamingPolicy!=null &&
              this.uplinkTeamingPolicy.equals(other.getUplinkTeamingPolicy()))) &&
            ((this.securityPolicy==null && other.getSecurityPolicy()==null) || 
             (this.securityPolicy!=null &&
              this.securityPolicy.equals(other.getSecurityPolicy()))) &&
            ((this.ipfixEnabled==null && other.getIpfixEnabled()==null) || 
             (this.ipfixEnabled!=null &&
              this.ipfixEnabled.equals(other.getIpfixEnabled()))) &&
            ((this.txUplink==null && other.getTxUplink()==null) || 
             (this.txUplink!=null &&
              this.txUplink.equals(other.getTxUplink()))) &&
            ((this.lacpPolicy==null && other.getLacpPolicy()==null) || 
             (this.lacpPolicy!=null &&
              this.lacpPolicy.equals(other.getLacpPolicy())));
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
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getQosTag() != null) {
            _hashCode += getQosTag().hashCode();
        }
        if (getUplinkTeamingPolicy() != null) {
            _hashCode += getUplinkTeamingPolicy().hashCode();
        }
        if (getSecurityPolicy() != null) {
            _hashCode += getSecurityPolicy().hashCode();
        }
        if (getIpfixEnabled() != null) {
            _hashCode += getIpfixEnabled().hashCode();
        }
        if (getTxUplink() != null) {
            _hashCode += getTxUplink().hashCode();
        }
        if (getLacpPolicy() != null) {
            _hashCode += getLacpPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSPortSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPortSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmwareDistributedVirtualSwitchVlanSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "qosTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkTeamingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkTeamingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmwareUplinkPortTeamingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "securityPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSSecurityPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txUplink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "txUplink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareUplinkLacpPolicy"));
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
