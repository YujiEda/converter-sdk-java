/**
 * QuiesceDatastoreIOForHAFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class QuiesceDatastoreIOForHAFailed  extends com.vmware.converter.ResourceInUse  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String hostName;

    private com.vmware.converter.ManagedObjectReference ds;

    private java.lang.String dsName;

    public QuiesceDatastoreIOForHAFailed() {
    }

    public QuiesceDatastoreIOForHAFailed(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String type,
           java.lang.String name,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String hostName,
           com.vmware.converter.ManagedObjectReference ds,
           java.lang.String dsName) {
        super(
            faultCause,
            faultMessage,
            type,
            name);
        this.host = host;
        this.hostName = hostName;
        this.ds = ds;
        this.dsName = dsName;
    }


    /**
     * Gets the host value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the hostName value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the ds value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @return ds
     */
    public com.vmware.converter.ManagedObjectReference getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @param ds
     */
    public void setDs(com.vmware.converter.ManagedObjectReference ds) {
        this.ds = ds;
    }


    /**
     * Gets the dsName value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @return dsName
     */
    public java.lang.String getDsName() {
        return dsName;
    }


    /**
     * Sets the dsName value for this QuiesceDatastoreIOForHAFailed.
     * 
     * @param dsName
     */
    public void setDsName(java.lang.String dsName) {
        this.dsName = dsName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuiesceDatastoreIOForHAFailed)) return false;
        QuiesceDatastoreIOForHAFailed other = (QuiesceDatastoreIOForHAFailed) obj;
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
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs()))) &&
            ((this.dsName==null && other.getDsName()==null) || 
             (this.dsName!=null &&
              this.dsName.equals(other.getDsName())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        if (getDsName() != null) {
            _hashCode += getDsName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuiesceDatastoreIOForHAFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "QuiesceDatastoreIOForHAFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
