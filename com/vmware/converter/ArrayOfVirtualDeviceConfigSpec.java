/**
 * ArrayOfVirtualDeviceConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualDeviceConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.VirtualDeviceConfigSpec[] virtualDeviceConfigSpec;

    public ArrayOfVirtualDeviceConfigSpec() {
    }

    public ArrayOfVirtualDeviceConfigSpec(
           com.vmware.converter.VirtualDeviceConfigSpec[] virtualDeviceConfigSpec) {
           this.virtualDeviceConfigSpec = virtualDeviceConfigSpec;
    }


    /**
     * Gets the virtualDeviceConfigSpec value for this ArrayOfVirtualDeviceConfigSpec.
     * 
     * @return virtualDeviceConfigSpec
     */
    public com.vmware.converter.VirtualDeviceConfigSpec[] getVirtualDeviceConfigSpec() {
        return virtualDeviceConfigSpec;
    }


    /**
     * Sets the virtualDeviceConfigSpec value for this ArrayOfVirtualDeviceConfigSpec.
     * 
     * @param virtualDeviceConfigSpec
     */
    public void setVirtualDeviceConfigSpec(com.vmware.converter.VirtualDeviceConfigSpec[] virtualDeviceConfigSpec) {
        this.virtualDeviceConfigSpec = virtualDeviceConfigSpec;
    }

    public com.vmware.converter.VirtualDeviceConfigSpec getVirtualDeviceConfigSpec(int i) {
        return this.virtualDeviceConfigSpec[i];
    }

    public void setVirtualDeviceConfigSpec(int i, com.vmware.converter.VirtualDeviceConfigSpec _value) {
        this.virtualDeviceConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDeviceConfigSpec)) return false;
        ArrayOfVirtualDeviceConfigSpec other = (ArrayOfVirtualDeviceConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDeviceConfigSpec==null && other.getVirtualDeviceConfigSpec()==null) || 
             (this.virtualDeviceConfigSpec!=null &&
              java.util.Arrays.equals(this.virtualDeviceConfigSpec, other.getVirtualDeviceConfigSpec())));
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
        if (getVirtualDeviceConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDeviceConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDeviceConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDeviceConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDeviceConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDeviceConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpec"));
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
