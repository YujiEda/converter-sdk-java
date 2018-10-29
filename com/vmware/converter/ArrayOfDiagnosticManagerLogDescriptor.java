/**
 * ArrayOfDiagnosticManagerLogDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDiagnosticManagerLogDescriptor  implements java.io.Serializable {
    private com.vmware.converter.DiagnosticManagerLogDescriptor[] diagnosticManagerLogDescriptor;

    public ArrayOfDiagnosticManagerLogDescriptor() {
    }

    public ArrayOfDiagnosticManagerLogDescriptor(
           com.vmware.converter.DiagnosticManagerLogDescriptor[] diagnosticManagerLogDescriptor) {
           this.diagnosticManagerLogDescriptor = diagnosticManagerLogDescriptor;
    }


    /**
     * Gets the diagnosticManagerLogDescriptor value for this ArrayOfDiagnosticManagerLogDescriptor.
     * 
     * @return diagnosticManagerLogDescriptor
     */
    public com.vmware.converter.DiagnosticManagerLogDescriptor[] getDiagnosticManagerLogDescriptor() {
        return diagnosticManagerLogDescriptor;
    }


    /**
     * Sets the diagnosticManagerLogDescriptor value for this ArrayOfDiagnosticManagerLogDescriptor.
     * 
     * @param diagnosticManagerLogDescriptor
     */
    public void setDiagnosticManagerLogDescriptor(com.vmware.converter.DiagnosticManagerLogDescriptor[] diagnosticManagerLogDescriptor) {
        this.diagnosticManagerLogDescriptor = diagnosticManagerLogDescriptor;
    }

    public com.vmware.converter.DiagnosticManagerLogDescriptor getDiagnosticManagerLogDescriptor(int i) {
        return this.diagnosticManagerLogDescriptor[i];
    }

    public void setDiagnosticManagerLogDescriptor(int i, com.vmware.converter.DiagnosticManagerLogDescriptor _value) {
        this.diagnosticManagerLogDescriptor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDiagnosticManagerLogDescriptor)) return false;
        ArrayOfDiagnosticManagerLogDescriptor other = (ArrayOfDiagnosticManagerLogDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diagnosticManagerLogDescriptor==null && other.getDiagnosticManagerLogDescriptor()==null) || 
             (this.diagnosticManagerLogDescriptor!=null &&
              java.util.Arrays.equals(this.diagnosticManagerLogDescriptor, other.getDiagnosticManagerLogDescriptor())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDiagnosticManagerLogDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticManagerLogDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticManagerLogDescriptor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfDiagnosticManagerLogDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDiagnosticManagerLogDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticManagerLogDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DiagnosticManagerLogDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DiagnosticManagerLogDescriptor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
