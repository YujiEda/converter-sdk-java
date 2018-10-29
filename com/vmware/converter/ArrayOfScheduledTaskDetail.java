/**
 * ArrayOfScheduledTaskDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfScheduledTaskDetail  implements java.io.Serializable {
    private com.vmware.converter.ScheduledTaskDetail[] scheduledTaskDetail;

    public ArrayOfScheduledTaskDetail() {
    }

    public ArrayOfScheduledTaskDetail(
           com.vmware.converter.ScheduledTaskDetail[] scheduledTaskDetail) {
           this.scheduledTaskDetail = scheduledTaskDetail;
    }


    /**
     * Gets the scheduledTaskDetail value for this ArrayOfScheduledTaskDetail.
     * 
     * @return scheduledTaskDetail
     */
    public com.vmware.converter.ScheduledTaskDetail[] getScheduledTaskDetail() {
        return scheduledTaskDetail;
    }


    /**
     * Sets the scheduledTaskDetail value for this ArrayOfScheduledTaskDetail.
     * 
     * @param scheduledTaskDetail
     */
    public void setScheduledTaskDetail(com.vmware.converter.ScheduledTaskDetail[] scheduledTaskDetail) {
        this.scheduledTaskDetail = scheduledTaskDetail;
    }

    public com.vmware.converter.ScheduledTaskDetail getScheduledTaskDetail(int i) {
        return this.scheduledTaskDetail[i];
    }

    public void setScheduledTaskDetail(int i, com.vmware.converter.ScheduledTaskDetail _value) {
        this.scheduledTaskDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfScheduledTaskDetail)) return false;
        ArrayOfScheduledTaskDetail other = (ArrayOfScheduledTaskDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledTaskDetail==null && other.getScheduledTaskDetail()==null) || 
             (this.scheduledTaskDetail!=null &&
              java.util.Arrays.equals(this.scheduledTaskDetail, other.getScheduledTaskDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getScheduledTaskDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledTaskDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledTaskDetail(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfScheduledTaskDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfScheduledTaskDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTaskDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskDetail"));
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
