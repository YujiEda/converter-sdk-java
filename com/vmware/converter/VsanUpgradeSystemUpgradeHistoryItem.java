/**
 * VsanUpgradeSystemUpgradeHistoryItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemUpgradeHistoryItem  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.util.Calendar timestamp;

    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String message;

    private com.vmware.converter.ManagedObjectReference task;

    public VsanUpgradeSystemUpgradeHistoryItem() {
    }

    public VsanUpgradeSystemUpgradeHistoryItem(
           java.util.Calendar timestamp,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String message,
           com.vmware.converter.ManagedObjectReference task) {
        this.timestamp = timestamp;
        this.host = host;
        this.message = message;
        this.task = task;
    }


    /**
     * Gets the timestamp value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the host value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the message value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the task value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @return task
     */
    public com.vmware.converter.ManagedObjectReference getTask() {
        return task;
    }


    /**
     * Sets the task value for this VsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @param task
     */
    public void setTask(com.vmware.converter.ManagedObjectReference task) {
        this.task = task;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemUpgradeHistoryItem)) return false;
        VsanUpgradeSystemUpgradeHistoryItem other = (VsanUpgradeSystemUpgradeHistoryItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.task==null && other.getTask()==null) || 
             (this.task!=null &&
              this.task.equals(other.getTask())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTask() != null) {
            _hashCode += getTask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemUpgradeHistoryItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeHistoryItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "task"));
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
