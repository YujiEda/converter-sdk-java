/**
 * HostConfigFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConfigFailed  extends com.vmware.converter.HostConfigFault  implements java.io.Serializable {
    private com.vmware.converter.LocalizedMethodFault[] failure;

    public HostConfigFailed() {
    }

    public HostConfigFailed(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.LocalizedMethodFault[] failure) {
        super(
            faultCause,
            faultMessage);
        this.failure = failure;
    }


    /**
     * Gets the failure value for this HostConfigFailed.
     * 
     * @return failure
     */
    public com.vmware.converter.LocalizedMethodFault[] getFailure() {
        return failure;
    }


    /**
     * Sets the failure value for this HostConfigFailed.
     * 
     * @param failure
     */
    public void setFailure(com.vmware.converter.LocalizedMethodFault[] failure) {
        this.failure = failure;
    }

    public com.vmware.converter.LocalizedMethodFault getFailure(int i) {
        return this.failure[i];
    }

    public void setFailure(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.failure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConfigFailed)) return false;
        HostConfigFailed other = (HostConfigFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.failure==null && other.getFailure()==null) || 
             (this.failure!=null &&
              java.util.Arrays.equals(this.failure, other.getFailure())));
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
        if (getFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailure(), i);
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
        new org.apache.axis.description.TypeDesc(HostConfigFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
