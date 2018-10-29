/**
 * HostMemberRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostMemberRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String status;

    private java.lang.String statusDetail;

    private com.vmware.converter.HostMemberHealthCheckResult[] healthCheckResult;

    public HostMemberRuntimeInfo() {
    }

    public HostMemberRuntimeInfo(
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String status,
           java.lang.String statusDetail,
           com.vmware.converter.HostMemberHealthCheckResult[] healthCheckResult) {
        this.host = host;
        this.status = status;
        this.statusDetail = statusDetail;
        this.healthCheckResult = healthCheckResult;
    }


    /**
     * Gets the host value for this HostMemberRuntimeInfo.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this HostMemberRuntimeInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the status value for this HostMemberRuntimeInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HostMemberRuntimeInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusDetail value for this HostMemberRuntimeInfo.
     * 
     * @return statusDetail
     */
    public java.lang.String getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this HostMemberRuntimeInfo.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(java.lang.String statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the healthCheckResult value for this HostMemberRuntimeInfo.
     * 
     * @return healthCheckResult
     */
    public com.vmware.converter.HostMemberHealthCheckResult[] getHealthCheckResult() {
        return healthCheckResult;
    }


    /**
     * Sets the healthCheckResult value for this HostMemberRuntimeInfo.
     * 
     * @param healthCheckResult
     */
    public void setHealthCheckResult(com.vmware.converter.HostMemberHealthCheckResult[] healthCheckResult) {
        this.healthCheckResult = healthCheckResult;
    }

    public com.vmware.converter.HostMemberHealthCheckResult getHealthCheckResult(int i) {
        return this.healthCheckResult[i];
    }

    public void setHealthCheckResult(int i, com.vmware.converter.HostMemberHealthCheckResult _value) {
        this.healthCheckResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMemberRuntimeInfo)) return false;
        HostMemberRuntimeInfo other = (HostMemberRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.healthCheckResult==null && other.getHealthCheckResult()==null) || 
             (this.healthCheckResult!=null &&
              java.util.Arrays.equals(this.healthCheckResult, other.getHealthCheckResult())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getHealthCheckResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHealthCheckResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHealthCheckResult(), i);
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
        new org.apache.axis.description.TypeDesc(HostMemberRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCheckResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthCheckResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberHealthCheckResult"));
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
