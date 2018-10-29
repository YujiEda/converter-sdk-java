/**
 * ReplicationVmFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmFault  extends com.vmware.converter.ReplicationFault  implements java.io.Serializable {
    private java.lang.String reason;

    private java.lang.String state;

    private java.lang.String instanceId;

    private com.vmware.converter.ManagedObjectReference vm;

    public ReplicationVmFault() {
    }

    public ReplicationVmFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String reason,
           java.lang.String state,
           java.lang.String instanceId,
           com.vmware.converter.ManagedObjectReference vm) {
        super(
            faultCause,
            faultMessage);
        this.reason = reason;
        this.state = state;
        this.instanceId = instanceId;
        this.vm = vm;
    }


    /**
     * Gets the reason value for this ReplicationVmFault.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ReplicationVmFault.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the state value for this ReplicationVmFault.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ReplicationVmFault.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the instanceId value for this ReplicationVmFault.
     * 
     * @return instanceId
     */
    public java.lang.String getInstanceId() {
        return instanceId;
    }


    /**
     * Sets the instanceId value for this ReplicationVmFault.
     * 
     * @param instanceId
     */
    public void setInstanceId(java.lang.String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * Gets the vm value for this ReplicationVmFault.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ReplicationVmFault.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationVmFault)) return false;
        ReplicationVmFault other = (ReplicationVmFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.instanceId==null && other.getInstanceId()==null) || 
             (this.instanceId!=null &&
              this.instanceId.equals(other.getInstanceId()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getInstanceId() != null) {
            _hashCode += getInstanceId().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicationVmFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
