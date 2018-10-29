/**
 * VirtualDiskDeltaDiskFormatsSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskDeltaDiskFormatsSupported  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String datastoreType;

    private com.vmware.converter.ChoiceOption deltaDiskFormat;

    public VirtualDiskDeltaDiskFormatsSupported() {
    }

    public VirtualDiskDeltaDiskFormatsSupported(
           java.lang.String datastoreType,
           com.vmware.converter.ChoiceOption deltaDiskFormat) {
        this.datastoreType = datastoreType;
        this.deltaDiskFormat = deltaDiskFormat;
    }


    /**
     * Gets the datastoreType value for this VirtualDiskDeltaDiskFormatsSupported.
     * 
     * @return datastoreType
     */
    public java.lang.String getDatastoreType() {
        return datastoreType;
    }


    /**
     * Sets the datastoreType value for this VirtualDiskDeltaDiskFormatsSupported.
     * 
     * @param datastoreType
     */
    public void setDatastoreType(java.lang.String datastoreType) {
        this.datastoreType = datastoreType;
    }


    /**
     * Gets the deltaDiskFormat value for this VirtualDiskDeltaDiskFormatsSupported.
     * 
     * @return deltaDiskFormat
     */
    public com.vmware.converter.ChoiceOption getDeltaDiskFormat() {
        return deltaDiskFormat;
    }


    /**
     * Sets the deltaDiskFormat value for this VirtualDiskDeltaDiskFormatsSupported.
     * 
     * @param deltaDiskFormat
     */
    public void setDeltaDiskFormat(com.vmware.converter.ChoiceOption deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskDeltaDiskFormatsSupported)) return false;
        VirtualDiskDeltaDiskFormatsSupported other = (VirtualDiskDeltaDiskFormatsSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastoreType==null && other.getDatastoreType()==null) || 
             (this.datastoreType!=null &&
              this.datastoreType.equals(other.getDatastoreType()))) &&
            ((this.deltaDiskFormat==null && other.getDeltaDiskFormat()==null) || 
             (this.deltaDiskFormat!=null &&
              this.deltaDiskFormat.equals(other.getDeltaDiskFormat())));
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
        if (getDatastoreType() != null) {
            _hashCode += getDatastoreType().hashCode();
        }
        if (getDeltaDiskFormat() != null) {
            _hashCode += getDeltaDiskFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskDeltaDiskFormatsSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskDeltaDiskFormatsSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
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
