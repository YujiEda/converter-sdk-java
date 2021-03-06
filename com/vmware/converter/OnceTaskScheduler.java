/**
 * OnceTaskScheduler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OnceTaskScheduler  extends com.vmware.converter.TaskScheduler  implements java.io.Serializable {
    private java.util.Calendar runAt;

    public OnceTaskScheduler() {
    }

    public OnceTaskScheduler(
           java.util.Calendar activeTime,
           java.util.Calendar expireTime,
           java.util.Calendar runAt) {
        super(
            activeTime,
            expireTime);
        this.runAt = runAt;
    }


    /**
     * Gets the runAt value for this OnceTaskScheduler.
     * 
     * @return runAt
     */
    public java.util.Calendar getRunAt() {
        return runAt;
    }


    /**
     * Sets the runAt value for this OnceTaskScheduler.
     * 
     * @param runAt
     */
    public void setRunAt(java.util.Calendar runAt) {
        this.runAt = runAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnceTaskScheduler)) return false;
        OnceTaskScheduler other = (OnceTaskScheduler) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.runAt==null && other.getRunAt()==null) || 
             (this.runAt!=null &&
              this.runAt.equals(other.getRunAt())));
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
        if (getRunAt() != null) {
            _hashCode += getRunAt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnceTaskScheduler.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OnceTaskScheduler"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
