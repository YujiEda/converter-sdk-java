/**
 * HostProfileHostBasedConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostProfileHostBasedConfigSpec  extends com.vmware.converter.HostProfileConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.Boolean useHostProfileEngine;

    public HostProfileHostBasedConfigSpec() {
    }

    public HostProfileHostBasedConfigSpec(
           java.lang.String name,
           java.lang.String annotation,
           java.lang.Boolean enabled,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.Boolean useHostProfileEngine) {
        super(
            name,
            annotation,
            enabled);
        this.host = host;
        this.useHostProfileEngine = useHostProfileEngine;
    }


    /**
     * Gets the host value for this HostProfileHostBasedConfigSpec.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this HostProfileHostBasedConfigSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the useHostProfileEngine value for this HostProfileHostBasedConfigSpec.
     * 
     * @return useHostProfileEngine
     */
    public java.lang.Boolean getUseHostProfileEngine() {
        return useHostProfileEngine;
    }


    /**
     * Sets the useHostProfileEngine value for this HostProfileHostBasedConfigSpec.
     * 
     * @param useHostProfileEngine
     */
    public void setUseHostProfileEngine(java.lang.Boolean useHostProfileEngine) {
        this.useHostProfileEngine = useHostProfileEngine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostProfileHostBasedConfigSpec)) return false;
        HostProfileHostBasedConfigSpec other = (HostProfileHostBasedConfigSpec) obj;
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
              this.host.equals(other.getHost()))) &&
            ((this.useHostProfileEngine==null && other.getUseHostProfileEngine()==null) || 
             (this.useHostProfileEngine!=null &&
              this.useHostProfileEngine.equals(other.getUseHostProfileEngine())));
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
            _hashCode += getHost().hashCode();
        }
        if (getUseHostProfileEngine() != null) {
            _hashCode += getUseHostProfileEngine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostProfileHostBasedConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProfileHostBasedConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useHostProfileEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "useHostProfileEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
