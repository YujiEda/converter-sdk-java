/**
 * HostLicensableResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLicensableResourceInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.KeyAnyValue[] resource;

    public HostLicensableResourceInfo() {
    }

    public HostLicensableResourceInfo(
           com.vmware.converter.KeyAnyValue[] resource) {
        this.resource = resource;
    }


    /**
     * Gets the resource value for this HostLicensableResourceInfo.
     * 
     * @return resource
     */
    public com.vmware.converter.KeyAnyValue[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this HostLicensableResourceInfo.
     * 
     * @param resource
     */
    public void setResource(com.vmware.converter.KeyAnyValue[] resource) {
        this.resource = resource;
    }

    public com.vmware.converter.KeyAnyValue getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, com.vmware.converter.KeyAnyValue _value) {
        this.resource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLicensableResourceInfo)) return false;
        HostLicensableResourceInfo other = (HostLicensableResourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource())));
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
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
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
        new org.apache.axis.description.TypeDesc(HostLicensableResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLicensableResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyAnyValue"));
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
