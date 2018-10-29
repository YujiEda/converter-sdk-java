/**
 * ArrayOfEVCMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfEVCMode  implements java.io.Serializable {
    private com.vmware.converter.EVCMode[] EVCMode;

    public ArrayOfEVCMode() {
    }

    public ArrayOfEVCMode(
           com.vmware.converter.EVCMode[] EVCMode) {
           this.EVCMode = EVCMode;
    }


    /**
     * Gets the EVCMode value for this ArrayOfEVCMode.
     * 
     * @return EVCMode
     */
    public com.vmware.converter.EVCMode[] getEVCMode() {
        return EVCMode;
    }


    /**
     * Sets the EVCMode value for this ArrayOfEVCMode.
     * 
     * @param EVCMode
     */
    public void setEVCMode(com.vmware.converter.EVCMode[] EVCMode) {
        this.EVCMode = EVCMode;
    }

    public com.vmware.converter.EVCMode getEVCMode(int i) {
        return this.EVCMode[i];
    }

    public void setEVCMode(int i, com.vmware.converter.EVCMode _value) {
        this.EVCMode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEVCMode)) return false;
        ArrayOfEVCMode other = (ArrayOfEVCMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EVCMode==null && other.getEVCMode()==null) || 
             (this.EVCMode!=null &&
              java.util.Arrays.equals(this.EVCMode, other.getEVCMode())));
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
        if (getEVCMode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEVCMode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEVCMode(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEVCMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfEVCMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EVCMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "EVCMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCMode"));
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
