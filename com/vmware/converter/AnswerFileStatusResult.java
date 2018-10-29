/**
 * AnswerFileStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AnswerFileStatusResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.util.Calendar checkedTime;

    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String status;

    private com.vmware.converter.AnswerFileStatusError[] error;

    public AnswerFileStatusResult() {
    }

    public AnswerFileStatusResult(
           java.util.Calendar checkedTime,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String status,
           com.vmware.converter.AnswerFileStatusError[] error) {
        this.checkedTime = checkedTime;
        this.host = host;
        this.status = status;
        this.error = error;
    }


    /**
     * Gets the checkedTime value for this AnswerFileStatusResult.
     * 
     * @return checkedTime
     */
    public java.util.Calendar getCheckedTime() {
        return checkedTime;
    }


    /**
     * Sets the checkedTime value for this AnswerFileStatusResult.
     * 
     * @param checkedTime
     */
    public void setCheckedTime(java.util.Calendar checkedTime) {
        this.checkedTime = checkedTime;
    }


    /**
     * Gets the host value for this AnswerFileStatusResult.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this AnswerFileStatusResult.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the status value for this AnswerFileStatusResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AnswerFileStatusResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the error value for this AnswerFileStatusResult.
     * 
     * @return error
     */
    public com.vmware.converter.AnswerFileStatusError[] getError() {
        return error;
    }


    /**
     * Sets the error value for this AnswerFileStatusResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.AnswerFileStatusError[] error) {
        this.error = error;
    }

    public com.vmware.converter.AnswerFileStatusError getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.vmware.converter.AnswerFileStatusError _value) {
        this.error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnswerFileStatusResult)) return false;
        AnswerFileStatusResult other = (AnswerFileStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.checkedTime==null && other.getCheckedTime()==null) || 
             (this.checkedTime!=null &&
              this.checkedTime.equals(other.getCheckedTime()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError())));
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
        if (getCheckedTime() != null) {
            _hashCode += getCheckedTime().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
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
        new org.apache.axis.description.TypeDesc(AnswerFileStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusError"));
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
