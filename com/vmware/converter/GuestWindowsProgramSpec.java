/**
 * GuestWindowsProgramSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestWindowsProgramSpec  extends com.vmware.converter.GuestProgramSpec  implements java.io.Serializable {
    private boolean startMinimized;

    public GuestWindowsProgramSpec() {
    }

    public GuestWindowsProgramSpec(
           java.lang.String programPath,
           java.lang.String arguments,
           java.lang.String workingDirectory,
           java.lang.String[] envVariables,
           boolean startMinimized) {
        super(
            programPath,
            arguments,
            workingDirectory,
            envVariables);
        this.startMinimized = startMinimized;
    }


    /**
     * Gets the startMinimized value for this GuestWindowsProgramSpec.
     * 
     * @return startMinimized
     */
    public boolean isStartMinimized() {
        return startMinimized;
    }


    /**
     * Sets the startMinimized value for this GuestWindowsProgramSpec.
     * 
     * @param startMinimized
     */
    public void setStartMinimized(boolean startMinimized) {
        this.startMinimized = startMinimized;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestWindowsProgramSpec)) return false;
        GuestWindowsProgramSpec other = (GuestWindowsProgramSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.startMinimized == other.isStartMinimized();
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
        _hashCode += (isStartMinimized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestWindowsProgramSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestWindowsProgramSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinimized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startMinimized"));
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
