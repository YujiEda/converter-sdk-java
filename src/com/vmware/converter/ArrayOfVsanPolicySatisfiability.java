/**
 * ArrayOfVsanPolicySatisfiability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanPolicySatisfiability  implements java.io.Serializable {
    private com.vmware.converter.VsanPolicySatisfiability[] vsanPolicySatisfiability;

    public ArrayOfVsanPolicySatisfiability() {
    }

    public ArrayOfVsanPolicySatisfiability(
           com.vmware.converter.VsanPolicySatisfiability[] vsanPolicySatisfiability) {
           this.vsanPolicySatisfiability = vsanPolicySatisfiability;
    }


    /**
     * Gets the vsanPolicySatisfiability value for this ArrayOfVsanPolicySatisfiability.
     * 
     * @return vsanPolicySatisfiability
     */
    public com.vmware.converter.VsanPolicySatisfiability[] getVsanPolicySatisfiability() {
        return vsanPolicySatisfiability;
    }


    /**
     * Sets the vsanPolicySatisfiability value for this ArrayOfVsanPolicySatisfiability.
     * 
     * @param vsanPolicySatisfiability
     */
    public void setVsanPolicySatisfiability(com.vmware.converter.VsanPolicySatisfiability[] vsanPolicySatisfiability) {
        this.vsanPolicySatisfiability = vsanPolicySatisfiability;
    }

    public com.vmware.converter.VsanPolicySatisfiability getVsanPolicySatisfiability(int i) {
        return this.vsanPolicySatisfiability[i];
    }

    public void setVsanPolicySatisfiability(int i, com.vmware.converter.VsanPolicySatisfiability _value) {
        this.vsanPolicySatisfiability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanPolicySatisfiability)) return false;
        ArrayOfVsanPolicySatisfiability other = (ArrayOfVsanPolicySatisfiability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanPolicySatisfiability==null && other.getVsanPolicySatisfiability()==null) || 
             (this.vsanPolicySatisfiability!=null &&
              java.util.Arrays.equals(this.vsanPolicySatisfiability, other.getVsanPolicySatisfiability())));
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
        if (getVsanPolicySatisfiability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanPolicySatisfiability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanPolicySatisfiability(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanPolicySatisfiability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanPolicySatisfiability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanPolicySatisfiability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanPolicySatisfiability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanPolicySatisfiability"));
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
