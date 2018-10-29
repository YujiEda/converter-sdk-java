/**
 * EVCUnsupportedByHostSoftware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EVCUnsupportedByHostSoftware  extends com.vmware.converter.EVCConfigFault  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] host;

    private java.lang.String[] hostName;

    public EVCUnsupportedByHostSoftware() {
    }

    public EVCUnsupportedByHostSoftware(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.LocalizedMethodFault[] faults,
           com.vmware.converter.ManagedObjectReference[] host,
           java.lang.String[] hostName) {
        super(
            faultCause,
            faultMessage,
            faults);
        this.host = host;
        this.hostName = hostName;
    }


    /**
     * Gets the host value for this EVCUnsupportedByHostSoftware.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this EVCUnsupportedByHostSoftware.
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


    /**
     * Gets the hostName value for this EVCUnsupportedByHostSoftware.
     * 
     * @return hostName
     */
    public java.lang.String[] getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this EVCUnsupportedByHostSoftware.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String[] hostName) {
        this.hostName = hostName;
    }

    public java.lang.String getHostName(int i) {
        return this.hostName[i];
    }

    public void setHostName(int i, java.lang.String _value) {
        this.hostName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCUnsupportedByHostSoftware)) return false;
        EVCUnsupportedByHostSoftware other = (EVCUnsupportedByHostSoftware) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              java.util.Arrays.equals(this.hostName, other.getHostName())));
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
        if (getHostName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostName(), i);
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
        new org.apache.axis.description.TypeDesc(EVCUnsupportedByHostSoftware.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCUnsupportedByHostSoftware"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
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
