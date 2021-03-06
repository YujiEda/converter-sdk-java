/**
 * HostVsanInternalSystemVsanObjectOperationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVsanInternalSystemVsanObjectOperationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private com.vmware.converter.LocalizableMessage[] failureReason;

    public HostVsanInternalSystemVsanObjectOperationResult() {
    }

    public HostVsanInternalSystemVsanObjectOperationResult(
           java.lang.String uuid,
           com.vmware.converter.LocalizableMessage[] failureReason) {
        this.uuid = uuid;
        this.failureReason = failureReason;
    }


    /**
     * Gets the uuid value for this HostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the failureReason value for this HostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @return failureReason
     */
    public com.vmware.converter.LocalizableMessage[] getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this HostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @param failureReason
     */
    public void setFailureReason(com.vmware.converter.LocalizableMessage[] failureReason) {
        this.failureReason = failureReason;
    }

    public com.vmware.converter.LocalizableMessage getFailureReason(int i) {
        return this.failureReason[i];
    }

    public void setFailureReason(int i, com.vmware.converter.LocalizableMessage _value) {
        this.failureReason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVsanInternalSystemVsanObjectOperationResult)) return false;
        HostVsanInternalSystemVsanObjectOperationResult other = (HostVsanInternalSystemVsanObjectOperationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              java.util.Arrays.equals(this.failureReason, other.getFailureReason())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getFailureReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureReason(), i);
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
        new org.apache.axis.description.TypeDesc(HostVsanInternalSystemVsanObjectOperationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVsanInternalSystemVsanObjectOperationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
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
