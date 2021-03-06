/**
 * ArrayOfVmEventArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVmEventArgument  implements java.io.Serializable {
    private com.vmware.converter.VmEventArgument[] vmEventArgument;

    public ArrayOfVmEventArgument() {
    }

    public ArrayOfVmEventArgument(
           com.vmware.converter.VmEventArgument[] vmEventArgument) {
           this.vmEventArgument = vmEventArgument;
    }


    /**
     * Gets the vmEventArgument value for this ArrayOfVmEventArgument.
     * 
     * @return vmEventArgument
     */
    public com.vmware.converter.VmEventArgument[] getVmEventArgument() {
        return vmEventArgument;
    }


    /**
     * Sets the vmEventArgument value for this ArrayOfVmEventArgument.
     * 
     * @param vmEventArgument
     */
    public void setVmEventArgument(com.vmware.converter.VmEventArgument[] vmEventArgument) {
        this.vmEventArgument = vmEventArgument;
    }

    public com.vmware.converter.VmEventArgument getVmEventArgument(int i) {
        return this.vmEventArgument[i];
    }

    public void setVmEventArgument(int i, com.vmware.converter.VmEventArgument _value) {
        this.vmEventArgument[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVmEventArgument)) return false;
        ArrayOfVmEventArgument other = (ArrayOfVmEventArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vmEventArgument==null && other.getVmEventArgument()==null) || 
             (this.vmEventArgument!=null &&
              java.util.Arrays.equals(this.vmEventArgument, other.getVmEventArgument())));
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
        if (getVmEventArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmEventArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmEventArgument(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVmEventArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVmEventArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmEventArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VmEventArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmEventArgument"));
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
