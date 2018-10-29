/**
 * StorageDrsHbrDiskNotMovable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsHbrDiskNotMovable  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private java.lang.String nonMovableDiskIds;

    public StorageDrsHbrDiskNotMovable() {
    }

    public StorageDrsHbrDiskNotMovable(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String nonMovableDiskIds) {
        super(
            faultCause,
            faultMessage);
        this.nonMovableDiskIds = nonMovableDiskIds;
    }


    /**
     * Gets the nonMovableDiskIds value for this StorageDrsHbrDiskNotMovable.
     * 
     * @return nonMovableDiskIds
     */
    public java.lang.String getNonMovableDiskIds() {
        return nonMovableDiskIds;
    }


    /**
     * Sets the nonMovableDiskIds value for this StorageDrsHbrDiskNotMovable.
     * 
     * @param nonMovableDiskIds
     */
    public void setNonMovableDiskIds(java.lang.String nonMovableDiskIds) {
        this.nonMovableDiskIds = nonMovableDiskIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsHbrDiskNotMovable)) return false;
        StorageDrsHbrDiskNotMovable other = (StorageDrsHbrDiskNotMovable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nonMovableDiskIds==null && other.getNonMovableDiskIds()==null) || 
             (this.nonMovableDiskIds!=null &&
              this.nonMovableDiskIds.equals(other.getNonMovableDiskIds())));
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
        if (getNonMovableDiskIds() != null) {
            _hashCode += getNonMovableDiskIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsHbrDiskNotMovable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsHbrDiskNotMovable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMovableDiskIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nonMovableDiskIds"));
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
