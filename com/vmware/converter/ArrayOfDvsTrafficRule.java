/**
 * ArrayOfDvsTrafficRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsTrafficRule  implements java.io.Serializable {
    private com.vmware.converter.DvsTrafficRule[] dvsTrafficRule;

    public ArrayOfDvsTrafficRule() {
    }

    public ArrayOfDvsTrafficRule(
           com.vmware.converter.DvsTrafficRule[] dvsTrafficRule) {
           this.dvsTrafficRule = dvsTrafficRule;
    }


    /**
     * Gets the dvsTrafficRule value for this ArrayOfDvsTrafficRule.
     * 
     * @return dvsTrafficRule
     */
    public com.vmware.converter.DvsTrafficRule[] getDvsTrafficRule() {
        return dvsTrafficRule;
    }


    /**
     * Sets the dvsTrafficRule value for this ArrayOfDvsTrafficRule.
     * 
     * @param dvsTrafficRule
     */
    public void setDvsTrafficRule(com.vmware.converter.DvsTrafficRule[] dvsTrafficRule) {
        this.dvsTrafficRule = dvsTrafficRule;
    }

    public com.vmware.converter.DvsTrafficRule getDvsTrafficRule(int i) {
        return this.dvsTrafficRule[i];
    }

    public void setDvsTrafficRule(int i, com.vmware.converter.DvsTrafficRule _value) {
        this.dvsTrafficRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsTrafficRule)) return false;
        ArrayOfDvsTrafficRule other = (ArrayOfDvsTrafficRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsTrafficRule==null && other.getDvsTrafficRule()==null) || 
             (this.dvsTrafficRule!=null &&
              java.util.Arrays.equals(this.dvsTrafficRule, other.getDvsTrafficRule())));
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
        if (getDvsTrafficRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsTrafficRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsTrafficRule(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsTrafficRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsTrafficRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsTrafficRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsTrafficRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsTrafficRule"));
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
