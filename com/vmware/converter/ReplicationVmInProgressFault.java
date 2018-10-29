/**
 * ReplicationVmInProgressFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmInProgressFault  extends com.vmware.converter.ReplicationVmFault  implements java.io.Serializable {
    private java.lang.String requestedActivity;

    private java.lang.String inProgressActivity;

    public ReplicationVmInProgressFault() {
    }

    public ReplicationVmInProgressFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String reason,
           java.lang.String state,
           java.lang.String instanceId,
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String requestedActivity,
           java.lang.String inProgressActivity) {
        super(
            faultCause,
            faultMessage,
            reason,
            state,
            instanceId,
            vm);
        this.requestedActivity = requestedActivity;
        this.inProgressActivity = inProgressActivity;
    }


    /**
     * Gets the requestedActivity value for this ReplicationVmInProgressFault.
     * 
     * @return requestedActivity
     */
    public java.lang.String getRequestedActivity() {
        return requestedActivity;
    }


    /**
     * Sets the requestedActivity value for this ReplicationVmInProgressFault.
     * 
     * @param requestedActivity
     */
    public void setRequestedActivity(java.lang.String requestedActivity) {
        this.requestedActivity = requestedActivity;
    }


    /**
     * Gets the inProgressActivity value for this ReplicationVmInProgressFault.
     * 
     * @return inProgressActivity
     */
    public java.lang.String getInProgressActivity() {
        return inProgressActivity;
    }


    /**
     * Sets the inProgressActivity value for this ReplicationVmInProgressFault.
     * 
     * @param inProgressActivity
     */
    public void setInProgressActivity(java.lang.String inProgressActivity) {
        this.inProgressActivity = inProgressActivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationVmInProgressFault)) return false;
        ReplicationVmInProgressFault other = (ReplicationVmInProgressFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestedActivity==null && other.getRequestedActivity()==null) || 
             (this.requestedActivity!=null &&
              this.requestedActivity.equals(other.getRequestedActivity()))) &&
            ((this.inProgressActivity==null && other.getInProgressActivity()==null) || 
             (this.inProgressActivity!=null &&
              this.inProgressActivity.equals(other.getInProgressActivity())));
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
        if (getRequestedActivity() != null) {
            _hashCode += getRequestedActivity().hashCode();
        }
        if (getInProgressActivity() != null) {
            _hashCode += getInProgressActivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicationVmInProgressFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmInProgressFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requestedActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inProgressActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inProgressActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
