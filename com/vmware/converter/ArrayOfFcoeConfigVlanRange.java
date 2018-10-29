/**
 * ArrayOfFcoeConfigVlanRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfFcoeConfigVlanRange  implements java.io.Serializable {
    private com.vmware.converter.FcoeConfigVlanRange[] fcoeConfigVlanRange;

    public ArrayOfFcoeConfigVlanRange() {
    }

    public ArrayOfFcoeConfigVlanRange(
           com.vmware.converter.FcoeConfigVlanRange[] fcoeConfigVlanRange) {
           this.fcoeConfigVlanRange = fcoeConfigVlanRange;
    }


    /**
     * Gets the fcoeConfigVlanRange value for this ArrayOfFcoeConfigVlanRange.
     * 
     * @return fcoeConfigVlanRange
     */
    public com.vmware.converter.FcoeConfigVlanRange[] getFcoeConfigVlanRange() {
        return fcoeConfigVlanRange;
    }


    /**
     * Sets the fcoeConfigVlanRange value for this ArrayOfFcoeConfigVlanRange.
     * 
     * @param fcoeConfigVlanRange
     */
    public void setFcoeConfigVlanRange(com.vmware.converter.FcoeConfigVlanRange[] fcoeConfigVlanRange) {
        this.fcoeConfigVlanRange = fcoeConfigVlanRange;
    }

    public com.vmware.converter.FcoeConfigVlanRange getFcoeConfigVlanRange(int i) {
        return this.fcoeConfigVlanRange[i];
    }

    public void setFcoeConfigVlanRange(int i, com.vmware.converter.FcoeConfigVlanRange _value) {
        this.fcoeConfigVlanRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfFcoeConfigVlanRange)) return false;
        ArrayOfFcoeConfigVlanRange other = (ArrayOfFcoeConfigVlanRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fcoeConfigVlanRange==null && other.getFcoeConfigVlanRange()==null) || 
             (this.fcoeConfigVlanRange!=null &&
              java.util.Arrays.equals(this.fcoeConfigVlanRange, other.getFcoeConfigVlanRange())));
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
        if (getFcoeConfigVlanRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFcoeConfigVlanRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFcoeConfigVlanRange(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfFcoeConfigVlanRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfFcoeConfigVlanRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fcoeConfigVlanRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigVlanRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigVlanRange"));
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
