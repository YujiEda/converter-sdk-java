/**
 * FcoeConfigFcoeCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FcoeConfigFcoeCapabilities  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean priorityClass;

    private boolean sourceMacAddress;

    private boolean vlanRange;

    public FcoeConfigFcoeCapabilities() {
    }

    public FcoeConfigFcoeCapabilities(
           boolean priorityClass,
           boolean sourceMacAddress,
           boolean vlanRange) {
        this.priorityClass = priorityClass;
        this.sourceMacAddress = sourceMacAddress;
        this.vlanRange = vlanRange;
    }


    /**
     * Gets the priorityClass value for this FcoeConfigFcoeCapabilities.
     * 
     * @return priorityClass
     */
    public boolean isPriorityClass() {
        return priorityClass;
    }


    /**
     * Sets the priorityClass value for this FcoeConfigFcoeCapabilities.
     * 
     * @param priorityClass
     */
    public void setPriorityClass(boolean priorityClass) {
        this.priorityClass = priorityClass;
    }


    /**
     * Gets the sourceMacAddress value for this FcoeConfigFcoeCapabilities.
     * 
     * @return sourceMacAddress
     */
    public boolean isSourceMacAddress() {
        return sourceMacAddress;
    }


    /**
     * Sets the sourceMacAddress value for this FcoeConfigFcoeCapabilities.
     * 
     * @param sourceMacAddress
     */
    public void setSourceMacAddress(boolean sourceMacAddress) {
        this.sourceMacAddress = sourceMacAddress;
    }


    /**
     * Gets the vlanRange value for this FcoeConfigFcoeCapabilities.
     * 
     * @return vlanRange
     */
    public boolean isVlanRange() {
        return vlanRange;
    }


    /**
     * Sets the vlanRange value for this FcoeConfigFcoeCapabilities.
     * 
     * @param vlanRange
     */
    public void setVlanRange(boolean vlanRange) {
        this.vlanRange = vlanRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcoeConfigFcoeCapabilities)) return false;
        FcoeConfigFcoeCapabilities other = (FcoeConfigFcoeCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.priorityClass == other.isPriorityClass() &&
            this.sourceMacAddress == other.isSourceMacAddress() &&
            this.vlanRange == other.isVlanRange();
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
        _hashCode += (isPriorityClass() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSourceMacAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVlanRange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FcoeConfigFcoeCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigFcoeCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "priorityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMacAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceMacAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
