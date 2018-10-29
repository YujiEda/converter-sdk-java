/**
 * ArrayOfPlacementSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPlacementSpec  implements java.io.Serializable {
    private com.vmware.converter.PlacementSpec[] placementSpec;

    public ArrayOfPlacementSpec() {
    }

    public ArrayOfPlacementSpec(
           com.vmware.converter.PlacementSpec[] placementSpec) {
           this.placementSpec = placementSpec;
    }


    /**
     * Gets the placementSpec value for this ArrayOfPlacementSpec.
     * 
     * @return placementSpec
     */
    public com.vmware.converter.PlacementSpec[] getPlacementSpec() {
        return placementSpec;
    }


    /**
     * Sets the placementSpec value for this ArrayOfPlacementSpec.
     * 
     * @param placementSpec
     */
    public void setPlacementSpec(com.vmware.converter.PlacementSpec[] placementSpec) {
        this.placementSpec = placementSpec;
    }

    public com.vmware.converter.PlacementSpec getPlacementSpec(int i) {
        return this.placementSpec[i];
    }

    public void setPlacementSpec(int i, com.vmware.converter.PlacementSpec _value) {
        this.placementSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPlacementSpec)) return false;
        ArrayOfPlacementSpec other = (ArrayOfPlacementSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.placementSpec==null && other.getPlacementSpec()==null) || 
             (this.placementSpec!=null &&
              java.util.Arrays.equals(this.placementSpec, other.getPlacementSpec())));
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
        if (getPlacementSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPlacementSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPlacementSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PlacementSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementSpec"));
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
