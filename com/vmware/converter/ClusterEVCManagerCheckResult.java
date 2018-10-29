/**
 * ClusterEVCManagerCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterEVCManagerCheckResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String evcModeKey;

    private com.vmware.converter.LocalizedMethodFault error;

    private com.vmware.converter.ManagedObjectReference[] host;

    public ClusterEVCManagerCheckResult() {
    }

    public ClusterEVCManagerCheckResult(
           java.lang.String evcModeKey,
           com.vmware.converter.LocalizedMethodFault error,
           com.vmware.converter.ManagedObjectReference[] host) {
        this.evcModeKey = evcModeKey;
        this.error = error;
        this.host = host;
    }


    /**
     * Gets the evcModeKey value for this ClusterEVCManagerCheckResult.
     * 
     * @return evcModeKey
     */
    public java.lang.String getEvcModeKey() {
        return evcModeKey;
    }


    /**
     * Sets the evcModeKey value for this ClusterEVCManagerCheckResult.
     * 
     * @param evcModeKey
     */
    public void setEvcModeKey(java.lang.String evcModeKey) {
        this.evcModeKey = evcModeKey;
    }


    /**
     * Gets the error value for this ClusterEVCManagerCheckResult.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault getError() {
        return error;
    }


    /**
     * Sets the error value for this ClusterEVCManagerCheckResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault error) {
        this.error = error;
    }


    /**
     * Gets the host value for this ClusterEVCManagerCheckResult.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this ClusterEVCManagerCheckResult.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference[] host) {
        this.host = host;
    }

    public com.vmware.converter.ManagedObjectReference getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.host[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterEVCManagerCheckResult)) return false;
        ClusterEVCManagerCheckResult other = (ClusterEVCManagerCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.evcModeKey==null && other.getEvcModeKey()==null) || 
             (this.evcModeKey!=null &&
              this.evcModeKey.equals(other.getEvcModeKey()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost())));
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
        if (getEvcModeKey() != null) {
            _hashCode += getEvcModeKey().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHost(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterEVCManagerCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterEVCManagerCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evcModeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "evcModeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
