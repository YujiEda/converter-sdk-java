/**
 * HostDatastoreConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostDatastoreConnectInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.DatastoreSummary summary;

    public HostDatastoreConnectInfo() {
    }

    public HostDatastoreConnectInfo(
           com.vmware.converter.DatastoreSummary summary) {
        this.summary = summary;
    }


    /**
     * Gets the summary value for this HostDatastoreConnectInfo.
     * 
     * @return summary
     */
    public com.vmware.converter.DatastoreSummary getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this HostDatastoreConnectInfo.
     * 
     * @param summary
     */
    public void setSummary(com.vmware.converter.DatastoreSummary summary) {
        this.summary = summary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDatastoreConnectInfo)) return false;
        HostDatastoreConnectInfo other = (HostDatastoreConnectInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary())));
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
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDatastoreConnectInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDatastoreConnectInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreSummary"));
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
