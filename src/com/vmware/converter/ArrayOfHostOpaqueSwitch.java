/**
 * ArrayOfHostOpaqueSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostOpaqueSwitch  implements java.io.Serializable {
    private com.vmware.converter.HostOpaqueSwitch[] hostOpaqueSwitch;

    public ArrayOfHostOpaqueSwitch() {
    }

    public ArrayOfHostOpaqueSwitch(
           com.vmware.converter.HostOpaqueSwitch[] hostOpaqueSwitch) {
           this.hostOpaqueSwitch = hostOpaqueSwitch;
    }


    /**
     * Gets the hostOpaqueSwitch value for this ArrayOfHostOpaqueSwitch.
     * 
     * @return hostOpaqueSwitch
     */
    public com.vmware.converter.HostOpaqueSwitch[] getHostOpaqueSwitch() {
        return hostOpaqueSwitch;
    }


    /**
     * Sets the hostOpaqueSwitch value for this ArrayOfHostOpaqueSwitch.
     * 
     * @param hostOpaqueSwitch
     */
    public void setHostOpaqueSwitch(com.vmware.converter.HostOpaqueSwitch[] hostOpaqueSwitch) {
        this.hostOpaqueSwitch = hostOpaqueSwitch;
    }

    public com.vmware.converter.HostOpaqueSwitch getHostOpaqueSwitch(int i) {
        return this.hostOpaqueSwitch[i];
    }

    public void setHostOpaqueSwitch(int i, com.vmware.converter.HostOpaqueSwitch _value) {
        this.hostOpaqueSwitch[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostOpaqueSwitch)) return false;
        ArrayOfHostOpaqueSwitch other = (ArrayOfHostOpaqueSwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostOpaqueSwitch==null && other.getHostOpaqueSwitch()==null) || 
             (this.hostOpaqueSwitch!=null &&
              java.util.Arrays.equals(this.hostOpaqueSwitch, other.getHostOpaqueSwitch())));
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
        if (getHostOpaqueSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostOpaqueSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostOpaqueSwitch(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostOpaqueSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostOpaqueSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostOpaqueSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitch"));
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
