/**
 * DistributedVirtualSwitchHostMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchHostMember  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualSwitchHostMemberRuntimeState runtimeState;

    private com.vmware.converter.DistributedVirtualSwitchHostMemberConfigInfo config;

    private com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo;

    private java.lang.String[] uplinkPortKey;

    private java.lang.String status;

    private java.lang.String statusDetail;

    public DistributedVirtualSwitchHostMember() {
    }

    public DistributedVirtualSwitchHostMember(
           com.vmware.converter.DistributedVirtualSwitchHostMemberRuntimeState runtimeState,
           com.vmware.converter.DistributedVirtualSwitchHostMemberConfigInfo config,
           com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo,
           java.lang.String[] uplinkPortKey,
           java.lang.String status,
           java.lang.String statusDetail) {
        this.runtimeState = runtimeState;
        this.config = config;
        this.productInfo = productInfo;
        this.uplinkPortKey = uplinkPortKey;
        this.status = status;
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the runtimeState value for this DistributedVirtualSwitchHostMember.
     * 
     * @return runtimeState
     */
    public com.vmware.converter.DistributedVirtualSwitchHostMemberRuntimeState getRuntimeState() {
        return runtimeState;
    }


    /**
     * Sets the runtimeState value for this DistributedVirtualSwitchHostMember.
     * 
     * @param runtimeState
     */
    public void setRuntimeState(com.vmware.converter.DistributedVirtualSwitchHostMemberRuntimeState runtimeState) {
        this.runtimeState = runtimeState;
    }


    /**
     * Gets the config value for this DistributedVirtualSwitchHostMember.
     * 
     * @return config
     */
    public com.vmware.converter.DistributedVirtualSwitchHostMemberConfigInfo getConfig() {
        return config;
    }


    /**
     * Sets the config value for this DistributedVirtualSwitchHostMember.
     * 
     * @param config
     */
    public void setConfig(com.vmware.converter.DistributedVirtualSwitchHostMemberConfigInfo config) {
        this.config = config;
    }


    /**
     * Gets the productInfo value for this DistributedVirtualSwitchHostMember.
     * 
     * @return productInfo
     */
    public com.vmware.converter.DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }


    /**
     * Sets the productInfo value for this DistributedVirtualSwitchHostMember.
     * 
     * @param productInfo
     */
    public void setProductInfo(com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }


    /**
     * Gets the uplinkPortKey value for this DistributedVirtualSwitchHostMember.
     * 
     * @return uplinkPortKey
     */
    public java.lang.String[] getUplinkPortKey() {
        return uplinkPortKey;
    }


    /**
     * Sets the uplinkPortKey value for this DistributedVirtualSwitchHostMember.
     * 
     * @param uplinkPortKey
     */
    public void setUplinkPortKey(java.lang.String[] uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

    public java.lang.String getUplinkPortKey(int i) {
        return this.uplinkPortKey[i];
    }

    public void setUplinkPortKey(int i, java.lang.String _value) {
        this.uplinkPortKey[i] = _value;
    }


    /**
     * Gets the status value for this DistributedVirtualSwitchHostMember.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DistributedVirtualSwitchHostMember.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusDetail value for this DistributedVirtualSwitchHostMember.
     * 
     * @return statusDetail
     */
    public java.lang.String getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this DistributedVirtualSwitchHostMember.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(java.lang.String statusDetail) {
        this.statusDetail = statusDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchHostMember)) return false;
        DistributedVirtualSwitchHostMember other = (DistributedVirtualSwitchHostMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.runtimeState==null && other.getRuntimeState()==null) || 
             (this.runtimeState!=null &&
              this.runtimeState.equals(other.getRuntimeState()))) &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.productInfo==null && other.getProductInfo()==null) || 
             (this.productInfo!=null &&
              this.productInfo.equals(other.getProductInfo()))) &&
            ((this.uplinkPortKey==null && other.getUplinkPortKey()==null) || 
             (this.uplinkPortKey!=null &&
              java.util.Arrays.equals(this.uplinkPortKey, other.getUplinkPortKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail())));
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
        if (getRuntimeState() != null) {
            _hashCode += getRuntimeState().hashCode();
        }
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getProductInfo() != null) {
            _hashCode += getProductInfo().hashCode();
        }
        if (getUplinkPortKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPortKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPortKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runtimeState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberRuntimeState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statusDetail"));
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
