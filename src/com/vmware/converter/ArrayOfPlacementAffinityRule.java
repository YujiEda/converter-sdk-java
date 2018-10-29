/**
 * ArrayOfPlacementAffinityRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPlacementAffinityRule  implements java.io.Serializable {
    private com.vmware.converter.PlacementAffinityRule[] placementAffinityRule;

    public ArrayOfPlacementAffinityRule() {
    }

    public ArrayOfPlacementAffinityRule(
           com.vmware.converter.PlacementAffinityRule[] placementAffinityRule) {
           this.placementAffinityRule = placementAffinityRule;
    }


    /**
     * Gets the placementAffinityRule value for this ArrayOfPlacementAffinityRule.
     * 
     * @return placementAffinityRule
     */
    public com.vmware.converter.PlacementAffinityRule[] getPlacementAffinityRule() {
        return placementAffinityRule;
    }


    /**
     * Sets the placementAffinityRule value for this ArrayOfPlacementAffinityRule.
     * 
     * @param placementAffinityRule
     */
    public void setPlacementAffinityRule(com.vmware.converter.PlacementAffinityRule[] placementAffinityRule) {
        this.placementAffinityRule = placementAffinityRule;
    }

    public com.vmware.converter.PlacementAffinityRule getPlacementAffinityRule(int i) {
        return this.placementAffinityRule[i];
    }

    public void setPlacementAffinityRule(int i, com.vmware.converter.PlacementAffinityRule _value) {
        this.placementAffinityRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPlacementAffinityRule)) return false;
        ArrayOfPlacementAffinityRule other = (ArrayOfPlacementAffinityRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.placementAffinityRule==null && other.getPlacementAffinityRule()==null) || 
             (this.placementAffinityRule!=null &&
              java.util.Arrays.equals(this.placementAffinityRule, other.getPlacementAffinityRule())));
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
        if (getPlacementAffinityRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementAffinityRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementAffinityRule(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPlacementAffinityRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPlacementAffinityRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementAffinityRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRule"));
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
