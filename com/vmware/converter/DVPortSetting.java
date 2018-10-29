/**
 * DVPortSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVPortSetting  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.BoolPolicy blocked;

    private com.vmware.converter.BoolPolicy vmDirectPathGen2Allowed;

    private com.vmware.converter.DVSTrafficShapingPolicy inShapingPolicy;

    private com.vmware.converter.DVSTrafficShapingPolicy outShapingPolicy;

    private com.vmware.converter.DVSVendorSpecificConfig vendorSpecificConfig;

    private com.vmware.converter.StringPolicy networkResourcePoolKey;

    private com.vmware.converter.DvsFilterPolicy filterPolicy;

    public DVPortSetting() {
    }

    public DVPortSetting(
           com.vmware.converter.BoolPolicy blocked,
           com.vmware.converter.BoolPolicy vmDirectPathGen2Allowed,
           com.vmware.converter.DVSTrafficShapingPolicy inShapingPolicy,
           com.vmware.converter.DVSTrafficShapingPolicy outShapingPolicy,
           com.vmware.converter.DVSVendorSpecificConfig vendorSpecificConfig,
           com.vmware.converter.StringPolicy networkResourcePoolKey,
           com.vmware.converter.DvsFilterPolicy filterPolicy) {
        this.blocked = blocked;
        this.vmDirectPathGen2Allowed = vmDirectPathGen2Allowed;
        this.inShapingPolicy = inShapingPolicy;
        this.outShapingPolicy = outShapingPolicy;
        this.vendorSpecificConfig = vendorSpecificConfig;
        this.networkResourcePoolKey = networkResourcePoolKey;
        this.filterPolicy = filterPolicy;
    }


    /**
     * Gets the blocked value for this DVPortSetting.
     * 
     * @return blocked
     */
    public com.vmware.converter.BoolPolicy getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this DVPortSetting.
     * 
     * @param blocked
     */
    public void setBlocked(com.vmware.converter.BoolPolicy blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the vmDirectPathGen2Allowed value for this DVPortSetting.
     * 
     * @return vmDirectPathGen2Allowed
     */
    public com.vmware.converter.BoolPolicy getVmDirectPathGen2Allowed() {
        return vmDirectPathGen2Allowed;
    }


    /**
     * Sets the vmDirectPathGen2Allowed value for this DVPortSetting.
     * 
     * @param vmDirectPathGen2Allowed
     */
    public void setVmDirectPathGen2Allowed(com.vmware.converter.BoolPolicy vmDirectPathGen2Allowed) {
        this.vmDirectPathGen2Allowed = vmDirectPathGen2Allowed;
    }


    /**
     * Gets the inShapingPolicy value for this DVPortSetting.
     * 
     * @return inShapingPolicy
     */
    public com.vmware.converter.DVSTrafficShapingPolicy getInShapingPolicy() {
        return inShapingPolicy;
    }


    /**
     * Sets the inShapingPolicy value for this DVPortSetting.
     * 
     * @param inShapingPolicy
     */
    public void setInShapingPolicy(com.vmware.converter.DVSTrafficShapingPolicy inShapingPolicy) {
        this.inShapingPolicy = inShapingPolicy;
    }


    /**
     * Gets the outShapingPolicy value for this DVPortSetting.
     * 
     * @return outShapingPolicy
     */
    public com.vmware.converter.DVSTrafficShapingPolicy getOutShapingPolicy() {
        return outShapingPolicy;
    }


    /**
     * Sets the outShapingPolicy value for this DVPortSetting.
     * 
     * @param outShapingPolicy
     */
    public void setOutShapingPolicy(com.vmware.converter.DVSTrafficShapingPolicy outShapingPolicy) {
        this.outShapingPolicy = outShapingPolicy;
    }


    /**
     * Gets the vendorSpecificConfig value for this DVPortSetting.
     * 
     * @return vendorSpecificConfig
     */
    public com.vmware.converter.DVSVendorSpecificConfig getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }


    /**
     * Sets the vendorSpecificConfig value for this DVPortSetting.
     * 
     * @param vendorSpecificConfig
     */
    public void setVendorSpecificConfig(com.vmware.converter.DVSVendorSpecificConfig vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }


    /**
     * Gets the networkResourcePoolKey value for this DVPortSetting.
     * 
     * @return networkResourcePoolKey
     */
    public com.vmware.converter.StringPolicy getNetworkResourcePoolKey() {
        return networkResourcePoolKey;
    }


    /**
     * Sets the networkResourcePoolKey value for this DVPortSetting.
     * 
     * @param networkResourcePoolKey
     */
    public void setNetworkResourcePoolKey(com.vmware.converter.StringPolicy networkResourcePoolKey) {
        this.networkResourcePoolKey = networkResourcePoolKey;
    }


    /**
     * Gets the filterPolicy value for this DVPortSetting.
     * 
     * @return filterPolicy
     */
    public com.vmware.converter.DvsFilterPolicy getFilterPolicy() {
        return filterPolicy;
    }


    /**
     * Sets the filterPolicy value for this DVPortSetting.
     * 
     * @param filterPolicy
     */
    public void setFilterPolicy(com.vmware.converter.DvsFilterPolicy filterPolicy) {
        this.filterPolicy = filterPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortSetting)) return false;
        DVPortSetting other = (DVPortSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.vmDirectPathGen2Allowed==null && other.getVmDirectPathGen2Allowed()==null) || 
             (this.vmDirectPathGen2Allowed!=null &&
              this.vmDirectPathGen2Allowed.equals(other.getVmDirectPathGen2Allowed()))) &&
            ((this.inShapingPolicy==null && other.getInShapingPolicy()==null) || 
             (this.inShapingPolicy!=null &&
              this.inShapingPolicy.equals(other.getInShapingPolicy()))) &&
            ((this.outShapingPolicy==null && other.getOutShapingPolicy()==null) || 
             (this.outShapingPolicy!=null &&
              this.outShapingPolicy.equals(other.getOutShapingPolicy()))) &&
            ((this.vendorSpecificConfig==null && other.getVendorSpecificConfig()==null) || 
             (this.vendorSpecificConfig!=null &&
              this.vendorSpecificConfig.equals(other.getVendorSpecificConfig()))) &&
            ((this.networkResourcePoolKey==null && other.getNetworkResourcePoolKey()==null) || 
             (this.networkResourcePoolKey!=null &&
              this.networkResourcePoolKey.equals(other.getNetworkResourcePoolKey()))) &&
            ((this.filterPolicy==null && other.getFilterPolicy()==null) || 
             (this.filterPolicy!=null &&
              this.filterPolicy.equals(other.getFilterPolicy())));
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
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getVmDirectPathGen2Allowed() != null) {
            _hashCode += getVmDirectPathGen2Allowed().hashCode();
        }
        if (getInShapingPolicy() != null) {
            _hashCode += getInShapingPolicy().hashCode();
        }
        if (getOutShapingPolicy() != null) {
            _hashCode += getOutShapingPolicy().hashCode();
        }
        if (getVendorSpecificConfig() != null) {
            _hashCode += getVendorSpecificConfig().hashCode();
        }
        if (getNetworkResourcePoolKey() != null) {
            _hashCode += getNetworkResourcePoolKey().hashCode();
        }
        if (getFilterPolicy() != null) {
            _hashCode += getFilterPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2Allowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2Allowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inShapingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inShapingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSTrafficShapingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outShapingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "outShapingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSTrafficShapingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSpecificConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorSpecificConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSVendorSpecificConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourcePoolKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourcePoolKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StringPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filterPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsFilterPolicy"));
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
