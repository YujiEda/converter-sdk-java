/**
 * InvalidDatastorePath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InvalidDatastorePath  extends com.vmware.converter.InvalidDatastore  implements java.io.Serializable {
    private java.lang.String datastorePath;

    public InvalidDatastorePath() {
    }

    public InvalidDatastorePath(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference datastore,
           java.lang.String name,
           java.lang.String datastorePath) {
        super(
            faultCause,
            faultMessage,
            datastore,
            name);
        this.datastorePath = datastorePath;
    }


    /**
     * Gets the datastorePath value for this InvalidDatastorePath.
     * 
     * @return datastorePath
     */
    public java.lang.String getDatastorePath() {
        return datastorePath;
    }


    /**
     * Sets the datastorePath value for this InvalidDatastorePath.
     * 
     * @param datastorePath
     */
    public void setDatastorePath(java.lang.String datastorePath) {
        this.datastorePath = datastorePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidDatastorePath)) return false;
        InvalidDatastorePath other = (InvalidDatastorePath) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastorePath==null && other.getDatastorePath()==null) || 
             (this.datastorePath!=null &&
              this.datastorePath.equals(other.getDatastorePath())));
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
        if (getDatastorePath() != null) {
            _hashCode += getDatastorePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidDatastorePath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InvalidDatastorePath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePath"));
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
