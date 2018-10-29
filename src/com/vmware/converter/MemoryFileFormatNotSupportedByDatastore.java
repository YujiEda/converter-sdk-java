/**
 * MemoryFileFormatNotSupportedByDatastore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class MemoryFileFormatNotSupportedByDatastore  extends com.vmware.converter.UnsupportedDatastore  implements java.io.Serializable {
    private java.lang.String datastoreName;

    private java.lang.String type;

    public MemoryFileFormatNotSupportedByDatastore() {
    }

    public MemoryFileFormatNotSupportedByDatastore(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference datastore,
           java.lang.String datastoreName,
           java.lang.String type) {
        super(
            faultCause,
            faultMessage,
            datastore);
        this.datastoreName = datastoreName;
        this.type = type;
    }


    /**
     * Gets the datastoreName value for this MemoryFileFormatNotSupportedByDatastore.
     * 
     * @return datastoreName
     */
    public java.lang.String getDatastoreName() {
        return datastoreName;
    }


    /**
     * Sets the datastoreName value for this MemoryFileFormatNotSupportedByDatastore.
     * 
     * @param datastoreName
     */
    public void setDatastoreName(java.lang.String datastoreName) {
        this.datastoreName = datastoreName;
    }


    /**
     * Gets the type value for this MemoryFileFormatNotSupportedByDatastore.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MemoryFileFormatNotSupportedByDatastore.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemoryFileFormatNotSupportedByDatastore)) return false;
        MemoryFileFormatNotSupportedByDatastore other = (MemoryFileFormatNotSupportedByDatastore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastoreName==null && other.getDatastoreName()==null) || 
             (this.datastoreName!=null &&
              this.datastoreName.equals(other.getDatastoreName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDatastoreName() != null) {
            _hashCode += getDatastoreName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemoryFileFormatNotSupportedByDatastore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MemoryFileFormatNotSupportedByDatastore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
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
