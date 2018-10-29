/**
 * ArrayOfDVSNetworkResourcePoolConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDVSNetworkResourcePoolConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.DVSNetworkResourcePoolConfigSpec[] DVSNetworkResourcePoolConfigSpec;

    public ArrayOfDVSNetworkResourcePoolConfigSpec() {
    }

    public ArrayOfDVSNetworkResourcePoolConfigSpec(
           com.vmware.converter.DVSNetworkResourcePoolConfigSpec[] DVSNetworkResourcePoolConfigSpec) {
           this.DVSNetworkResourcePoolConfigSpec = DVSNetworkResourcePoolConfigSpec;
    }


    /**
     * Gets the DVSNetworkResourcePoolConfigSpec value for this ArrayOfDVSNetworkResourcePoolConfigSpec.
     * 
     * @return DVSNetworkResourcePoolConfigSpec
     */
    public com.vmware.converter.DVSNetworkResourcePoolConfigSpec[] getDVSNetworkResourcePoolConfigSpec() {
        return DVSNetworkResourcePoolConfigSpec;
    }


    /**
     * Sets the DVSNetworkResourcePoolConfigSpec value for this ArrayOfDVSNetworkResourcePoolConfigSpec.
     * 
     * @param DVSNetworkResourcePoolConfigSpec
     */
    public void setDVSNetworkResourcePoolConfigSpec(com.vmware.converter.DVSNetworkResourcePoolConfigSpec[] DVSNetworkResourcePoolConfigSpec) {
        this.DVSNetworkResourcePoolConfigSpec = DVSNetworkResourcePoolConfigSpec;
    }

    public com.vmware.converter.DVSNetworkResourcePoolConfigSpec getDVSNetworkResourcePoolConfigSpec(int i) {
        return this.DVSNetworkResourcePoolConfigSpec[i];
    }

    public void setDVSNetworkResourcePoolConfigSpec(int i, com.vmware.converter.DVSNetworkResourcePoolConfigSpec _value) {
        this.DVSNetworkResourcePoolConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDVSNetworkResourcePoolConfigSpec)) return false;
        ArrayOfDVSNetworkResourcePoolConfigSpec other = (ArrayOfDVSNetworkResourcePoolConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DVSNetworkResourcePoolConfigSpec==null && other.getDVSNetworkResourcePoolConfigSpec()==null) || 
             (this.DVSNetworkResourcePoolConfigSpec!=null &&
              java.util.Arrays.equals(this.DVSNetworkResourcePoolConfigSpec, other.getDVSNetworkResourcePoolConfigSpec())));
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
        if (getDVSNetworkResourcePoolConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDVSNetworkResourcePoolConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDVSNetworkResourcePoolConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDVSNetworkResourcePoolConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDVSNetworkResourcePoolConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DVSNetworkResourcePoolConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourcePoolConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourcePoolConfigSpec"));
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
