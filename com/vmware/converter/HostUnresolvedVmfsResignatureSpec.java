/**
 * HostUnresolvedVmfsResignatureSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostUnresolvedVmfsResignatureSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] extentDevicePath;

    public HostUnresolvedVmfsResignatureSpec() {
    }

    public HostUnresolvedVmfsResignatureSpec(
           java.lang.String[] extentDevicePath) {
        this.extentDevicePath = extentDevicePath;
    }


    /**
     * Gets the extentDevicePath value for this HostUnresolvedVmfsResignatureSpec.
     * 
     * @return extentDevicePath
     */
    public java.lang.String[] getExtentDevicePath() {
        return extentDevicePath;
    }


    /**
     * Sets the extentDevicePath value for this HostUnresolvedVmfsResignatureSpec.
     * 
     * @param extentDevicePath
     */
    public void setExtentDevicePath(java.lang.String[] extentDevicePath) {
        this.extentDevicePath = extentDevicePath;
    }

    public java.lang.String getExtentDevicePath(int i) {
        return this.extentDevicePath[i];
    }

    public void setExtentDevicePath(int i, java.lang.String _value) {
        this.extentDevicePath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostUnresolvedVmfsResignatureSpec)) return false;
        HostUnresolvedVmfsResignatureSpec other = (HostUnresolvedVmfsResignatureSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extentDevicePath==null && other.getExtentDevicePath()==null) || 
             (this.extentDevicePath!=null &&
              java.util.Arrays.equals(this.extentDevicePath, other.getExtentDevicePath())));
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
        if (getExtentDevicePath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtentDevicePath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtentDevicePath(), i);
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
        new org.apache.axis.description.TypeDesc(HostUnresolvedVmfsResignatureSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsResignatureSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extentDevicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extentDevicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
