/**
 * DvsHealthStatusChangeEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsHealthStatusChangeEvent  extends com.vmware.converter.HostEvent  implements java.io.Serializable {
    private java.lang.String switchUuid;

    private com.vmware.converter.HostMemberHealthCheckResult healthResult;

    public DvsHealthStatusChangeEvent() {
    }

    public DvsHealthStatusChangeEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           java.lang.String switchUuid,
           com.vmware.converter.HostMemberHealthCheckResult healthResult) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.switchUuid = switchUuid;
        this.healthResult = healthResult;
    }


    /**
     * Gets the switchUuid value for this DvsHealthStatusChangeEvent.
     * 
     * @return switchUuid
     */
    public java.lang.String getSwitchUuid() {
        return switchUuid;
    }


    /**
     * Sets the switchUuid value for this DvsHealthStatusChangeEvent.
     * 
     * @param switchUuid
     */
    public void setSwitchUuid(java.lang.String switchUuid) {
        this.switchUuid = switchUuid;
    }


    /**
     * Gets the healthResult value for this DvsHealthStatusChangeEvent.
     * 
     * @return healthResult
     */
    public com.vmware.converter.HostMemberHealthCheckResult getHealthResult() {
        return healthResult;
    }


    /**
     * Sets the healthResult value for this DvsHealthStatusChangeEvent.
     * 
     * @param healthResult
     */
    public void setHealthResult(com.vmware.converter.HostMemberHealthCheckResult healthResult) {
        this.healthResult = healthResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsHealthStatusChangeEvent)) return false;
        DvsHealthStatusChangeEvent other = (DvsHealthStatusChangeEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchUuid==null && other.getSwitchUuid()==null) || 
             (this.switchUuid!=null &&
              this.switchUuid.equals(other.getSwitchUuid()))) &&
            ((this.healthResult==null && other.getHealthResult()==null) || 
             (this.healthResult!=null &&
              this.healthResult.equals(other.getHealthResult())));
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
        if (getSwitchUuid() != null) {
            _hashCode += getSwitchUuid().hashCode();
        }
        if (getHealthResult() != null) {
            _hashCode += getHealthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsHealthStatusChangeEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsHealthStatusChangeEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberHealthCheckResult"));
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