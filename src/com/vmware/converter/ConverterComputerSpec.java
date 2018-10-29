/**
 * ConverterComputerSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpecComputerLocation location;

    public ConverterComputerSpec() {
    }

    public ConverterComputerSpec(
           com.vmware.converter.ConverterComputerSpecComputerLocation location) {
        this.location = location;
    }


    /**
     * Gets the location value for this ConverterComputerSpec.
     * 
     * @return location
     */
    public com.vmware.converter.ConverterComputerSpecComputerLocation getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ConverterComputerSpec.
     * 
     * @param location
     */
    public void setLocation(com.vmware.converter.ConverterComputerSpecComputerLocation location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerSpec)) return false;
        ConverterComputerSpec other = (ConverterComputerSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecComputerLocation"));
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
