/**
 * HostDatastoreExistsConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostDatastoreExistsConnectInfo  extends com.vmware.converter.HostDatastoreConnectInfo  implements java.io.Serializable {
    private java.lang.String newDatastoreName;

    public HostDatastoreExistsConnectInfo() {
    }

    public HostDatastoreExistsConnectInfo(
           com.vmware.converter.DatastoreSummary summary,
           java.lang.String newDatastoreName) {
        super(
            summary);
        this.newDatastoreName = newDatastoreName;
    }


    /**
     * Gets the newDatastoreName value for this HostDatastoreExistsConnectInfo.
     * 
     * @return newDatastoreName
     */
    public java.lang.String getNewDatastoreName() {
        return newDatastoreName;
    }


    /**
     * Sets the newDatastoreName value for this HostDatastoreExistsConnectInfo.
     * 
     * @param newDatastoreName
     */
    public void setNewDatastoreName(java.lang.String newDatastoreName) {
        this.newDatastoreName = newDatastoreName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDatastoreExistsConnectInfo)) return false;
        HostDatastoreExistsConnectInfo other = (HostDatastoreExistsConnectInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newDatastoreName==null && other.getNewDatastoreName()==null) || 
             (this.newDatastoreName!=null &&
              this.newDatastoreName.equals(other.getNewDatastoreName())));
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
        if (getNewDatastoreName() != null) {
            _hashCode += getNewDatastoreName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDatastoreExistsConnectInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDatastoreExistsConnectInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDatastoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newDatastoreName"));
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
