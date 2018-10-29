/**
 * ArrayOfVMwareDvsLacpGroupSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVMwareDvsLacpGroupSpec  implements java.io.Serializable {
    private com.vmware.converter.VMwareDvsLacpGroupSpec[] VMwareDvsLacpGroupSpec;

    public ArrayOfVMwareDvsLacpGroupSpec() {
    }

    public ArrayOfVMwareDvsLacpGroupSpec(
           com.vmware.converter.VMwareDvsLacpGroupSpec[] VMwareDvsLacpGroupSpec) {
           this.VMwareDvsLacpGroupSpec = VMwareDvsLacpGroupSpec;
    }


    /**
     * Gets the VMwareDvsLacpGroupSpec value for this ArrayOfVMwareDvsLacpGroupSpec.
     * 
     * @return VMwareDvsLacpGroupSpec
     */
    public com.vmware.converter.VMwareDvsLacpGroupSpec[] getVMwareDvsLacpGroupSpec() {
        return VMwareDvsLacpGroupSpec;
    }


    /**
     * Sets the VMwareDvsLacpGroupSpec value for this ArrayOfVMwareDvsLacpGroupSpec.
     * 
     * @param VMwareDvsLacpGroupSpec
     */
    public void setVMwareDvsLacpGroupSpec(com.vmware.converter.VMwareDvsLacpGroupSpec[] VMwareDvsLacpGroupSpec) {
        this.VMwareDvsLacpGroupSpec = VMwareDvsLacpGroupSpec;
    }

    public com.vmware.converter.VMwareDvsLacpGroupSpec getVMwareDvsLacpGroupSpec(int i) {
        return this.VMwareDvsLacpGroupSpec[i];
    }

    public void setVMwareDvsLacpGroupSpec(int i, com.vmware.converter.VMwareDvsLacpGroupSpec _value) {
        this.VMwareDvsLacpGroupSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareDvsLacpGroupSpec)) return false;
        ArrayOfVMwareDvsLacpGroupSpec other = (ArrayOfVMwareDvsLacpGroupSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareDvsLacpGroupSpec==null && other.getVMwareDvsLacpGroupSpec()==null) || 
             (this.VMwareDvsLacpGroupSpec!=null &&
              java.util.Arrays.equals(this.VMwareDvsLacpGroupSpec, other.getVMwareDvsLacpGroupSpec())));
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
        if (getVMwareDvsLacpGroupSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareDvsLacpGroupSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareDvsLacpGroupSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareDvsLacpGroupSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareDvsLacpGroupSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareDvsLacpGroupSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupSpec"));
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
