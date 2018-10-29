/**
 * ArrayOfVVolHostPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVVolHostPE  implements java.io.Serializable {
    private com.vmware.converter.VVolHostPE[] VVolHostPE;

    public ArrayOfVVolHostPE() {
    }

    public ArrayOfVVolHostPE(
           com.vmware.converter.VVolHostPE[] VVolHostPE) {
           this.VVolHostPE = VVolHostPE;
    }


    /**
     * Gets the VVolHostPE value for this ArrayOfVVolHostPE.
     * 
     * @return VVolHostPE
     */
    public com.vmware.converter.VVolHostPE[] getVVolHostPE() {
        return VVolHostPE;
    }


    /**
     * Sets the VVolHostPE value for this ArrayOfVVolHostPE.
     * 
     * @param VVolHostPE
     */
    public void setVVolHostPE(com.vmware.converter.VVolHostPE[] VVolHostPE) {
        this.VVolHostPE = VVolHostPE;
    }

    public com.vmware.converter.VVolHostPE getVVolHostPE(int i) {
        return this.VVolHostPE[i];
    }

    public void setVVolHostPE(int i, com.vmware.converter.VVolHostPE _value) {
        this.VVolHostPE[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVVolHostPE)) return false;
        ArrayOfVVolHostPE other = (ArrayOfVVolHostPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VVolHostPE==null && other.getVVolHostPE()==null) || 
             (this.VVolHostPE!=null &&
              java.util.Arrays.equals(this.VVolHostPE, other.getVVolHostPE())));
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
        if (getVVolHostPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVVolHostPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVVolHostPE(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVVolHostPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVVolHostPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VVolHostPE");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VVolHostPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VVolHostPE"));
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
