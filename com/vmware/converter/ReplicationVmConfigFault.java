/**
 * ReplicationVmConfigFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmConfigFault  extends com.vmware.converter.ReplicationConfigFault  implements java.io.Serializable {
    private java.lang.String reason;

    private com.vmware.converter.ManagedObjectReference vmRef;

    public ReplicationVmConfigFault() {
    }

    public ReplicationVmConfigFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String reason,
           com.vmware.converter.ManagedObjectReference vmRef) {
        super(
            faultCause,
            faultMessage);
        this.reason = reason;
        this.vmRef = vmRef;
    }


    /**
     * Gets the reason value for this ReplicationVmConfigFault.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ReplicationVmConfigFault.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the vmRef value for this ReplicationVmConfigFault.
     * 
     * @return vmRef
     */
    public com.vmware.converter.ManagedObjectReference getVmRef() {
        return vmRef;
    }


    /**
     * Sets the vmRef value for this ReplicationVmConfigFault.
     * 
     * @param vmRef
     */
    public void setVmRef(com.vmware.converter.ManagedObjectReference vmRef) {
        this.vmRef = vmRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationVmConfigFault)) return false;
        ReplicationVmConfigFault other = (ReplicationVmConfigFault) obj;
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
            ((this.vmRef==null && other.getVmRef()==null) || 
             (this.vmRef!=null &&
              this.vmRef.equals(other.getVmRef())));
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
        if (getVmRef() != null) {
            _hashCode += getVmRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicationVmConfigFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmConfigFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmRef"));
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
