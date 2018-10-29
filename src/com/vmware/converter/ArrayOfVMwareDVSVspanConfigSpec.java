/**
 * ArrayOfVMwareDVSVspanConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVMwareDVSVspanConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.VMwareDVSVspanConfigSpec[] VMwareDVSVspanConfigSpec;

    public ArrayOfVMwareDVSVspanConfigSpec() {
    }

    public ArrayOfVMwareDVSVspanConfigSpec(
           com.vmware.converter.VMwareDVSVspanConfigSpec[] VMwareDVSVspanConfigSpec) {
           this.VMwareDVSVspanConfigSpec = VMwareDVSVspanConfigSpec;
    }


    /**
     * Gets the VMwareDVSVspanConfigSpec value for this ArrayOfVMwareDVSVspanConfigSpec.
     * 
     * @return VMwareDVSVspanConfigSpec
     */
    public com.vmware.converter.VMwareDVSVspanConfigSpec[] getVMwareDVSVspanConfigSpec() {
        return VMwareDVSVspanConfigSpec;
    }


    /**
     * Sets the VMwareDVSVspanConfigSpec value for this ArrayOfVMwareDVSVspanConfigSpec.
     * 
     * @param VMwareDVSVspanConfigSpec
     */
    public void setVMwareDVSVspanConfigSpec(com.vmware.converter.VMwareDVSVspanConfigSpec[] VMwareDVSVspanConfigSpec) {
        this.VMwareDVSVspanConfigSpec = VMwareDVSVspanConfigSpec;
    }

    public com.vmware.converter.VMwareDVSVspanConfigSpec getVMwareDVSVspanConfigSpec(int i) {
        return this.VMwareDVSVspanConfigSpec[i];
    }

    public void setVMwareDVSVspanConfigSpec(int i, com.vmware.converter.VMwareDVSVspanConfigSpec _value) {
        this.VMwareDVSVspanConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareDVSVspanConfigSpec)) return false;
        ArrayOfVMwareDVSVspanConfigSpec other = (ArrayOfVMwareDVSVspanConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareDVSVspanConfigSpec==null && other.getVMwareDVSVspanConfigSpec()==null) || 
             (this.VMwareDVSVspanConfigSpec!=null &&
              java.util.Arrays.equals(this.VMwareDVSVspanConfigSpec, other.getVMwareDVSVspanConfigSpec())));
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
        if (getVMwareDVSVspanConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareDVSVspanConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareDVSVspanConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareDVSVspanConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareDVSVspanConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareDVSVspanConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanConfigSpec"));
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
