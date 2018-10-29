/**
 * ConverterTargetVmSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTargetVmSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private com.vmware.converter.ConverterTargetVmSpecVmLocation location;

    private java.lang.String productVersion;

    private java.lang.String hardwareVersion;

    public ConverterTargetVmSpec() {
    }

    public ConverterTargetVmSpec(
           java.lang.String name,
           com.vmware.converter.ConverterTargetVmSpecVmLocation location,
           java.lang.String productVersion,
           java.lang.String hardwareVersion) {
        this.name = name;
        this.location = location;
        this.productVersion = productVersion;
        this.hardwareVersion = hardwareVersion;
    }


    /**
     * Gets the name value for this ConverterTargetVmSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConverterTargetVmSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the location value for this ConverterTargetVmSpec.
     * 
     * @return location
     */
    public com.vmware.converter.ConverterTargetVmSpecVmLocation getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ConverterTargetVmSpec.
     * 
     * @param location
     */
    public void setLocation(com.vmware.converter.ConverterTargetVmSpecVmLocation location) {
        this.location = location;
    }


    /**
     * Gets the productVersion value for this ConverterTargetVmSpec.
     * 
     * @return productVersion
     */
    public java.lang.String getProductVersion() {
        return productVersion;
    }


    /**
     * Sets the productVersion value for this ConverterTargetVmSpec.
     * 
     * @param productVersion
     */
    public void setProductVersion(java.lang.String productVersion) {
        this.productVersion = productVersion;
    }


    /**
     * Gets the hardwareVersion value for this ConverterTargetVmSpec.
     * 
     * @return hardwareVersion
     */
    public java.lang.String getHardwareVersion() {
        return hardwareVersion;
    }


    /**
     * Sets the hardwareVersion value for this ConverterTargetVmSpec.
     * 
     * @param hardwareVersion
     */
    public void setHardwareVersion(java.lang.String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTargetVmSpec)) return false;
        ConverterTargetVmSpec other = (ConverterTargetVmSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.productVersion==null && other.getProductVersion()==null) || 
             (this.productVersion!=null &&
              this.productVersion.equals(other.getProductVersion()))) &&
            ((this.hardwareVersion==null && other.getHardwareVersion()==null) || 
             (this.hardwareVersion!=null &&
              this.hardwareVersion.equals(other.getHardwareVersion())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getProductVersion() != null) {
            _hashCode += getProductVersion().hashCode();
        }
        if (getHardwareVersion() != null) {
            _hashCode += getHardwareVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterTargetVmSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpecVmLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "productVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hardwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
