/**
 * VVolHostPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VVolHostPE  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference key;

    private com.vmware.converter.HostProtocolEndpoint[] protocolEndpoint;

    public VVolHostPE() {
    }

    public VVolHostPE(
           com.vmware.converter.ManagedObjectReference key,
           com.vmware.converter.HostProtocolEndpoint[] protocolEndpoint) {
        this.key = key;
        this.protocolEndpoint = protocolEndpoint;
    }


    /**
     * Gets the key value for this VVolHostPE.
     * 
     * @return key
     */
    public com.vmware.converter.ManagedObjectReference getKey() {
        return key;
    }


    /**
     * Sets the key value for this VVolHostPE.
     * 
     * @param key
     */
    public void setKey(com.vmware.converter.ManagedObjectReference key) {
        this.key = key;
    }


    /**
     * Gets the protocolEndpoint value for this VVolHostPE.
     * 
     * @return protocolEndpoint
     */
    public com.vmware.converter.HostProtocolEndpoint[] getProtocolEndpoint() {
        return protocolEndpoint;
    }


    /**
     * Sets the protocolEndpoint value for this VVolHostPE.
     * 
     * @param protocolEndpoint
     */
    public void setProtocolEndpoint(com.vmware.converter.HostProtocolEndpoint[] protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

    public com.vmware.converter.HostProtocolEndpoint getProtocolEndpoint(int i) {
        return this.protocolEndpoint[i];
    }

    public void setProtocolEndpoint(int i, com.vmware.converter.HostProtocolEndpoint _value) {
        this.protocolEndpoint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VVolHostPE)) return false;
        VVolHostPE other = (VVolHostPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.protocolEndpoint==null && other.getProtocolEndpoint()==null) || 
             (this.protocolEndpoint!=null &&
              java.util.Arrays.equals(this.protocolEndpoint, other.getProtocolEndpoint())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getProtocolEndpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtocolEndpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtocolEndpoint(), i);
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
        new org.apache.axis.description.TypeDesc(VVolHostPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VVolHostPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocolEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProtocolEndpoint"));
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
