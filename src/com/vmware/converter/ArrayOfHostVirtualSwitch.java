/**
 * ArrayOfHostVirtualSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostVirtualSwitch  implements java.io.Serializable {
    private com.vmware.converter.HostVirtualSwitch[] hostVirtualSwitch;

    public ArrayOfHostVirtualSwitch() {
    }

    public ArrayOfHostVirtualSwitch(
           com.vmware.converter.HostVirtualSwitch[] hostVirtualSwitch) {
           this.hostVirtualSwitch = hostVirtualSwitch;
    }


    /**
     * Gets the hostVirtualSwitch value for this ArrayOfHostVirtualSwitch.
     * 
     * @return hostVirtualSwitch
     */
    public com.vmware.converter.HostVirtualSwitch[] getHostVirtualSwitch() {
        return hostVirtualSwitch;
    }


    /**
     * Sets the hostVirtualSwitch value for this ArrayOfHostVirtualSwitch.
     * 
     * @param hostVirtualSwitch
     */
    public void setHostVirtualSwitch(com.vmware.converter.HostVirtualSwitch[] hostVirtualSwitch) {
        this.hostVirtualSwitch = hostVirtualSwitch;
    }

    public com.vmware.converter.HostVirtualSwitch getHostVirtualSwitch(int i) {
        return this.hostVirtualSwitch[i];
    }

    public void setHostVirtualSwitch(int i, com.vmware.converter.HostVirtualSwitch _value) {
        this.hostVirtualSwitch[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVirtualSwitch)) return false;
        ArrayOfHostVirtualSwitch other = (ArrayOfHostVirtualSwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVirtualSwitch==null && other.getHostVirtualSwitch()==null) || 
             (this.hostVirtualSwitch!=null &&
              java.util.Arrays.equals(this.hostVirtualSwitch, other.getHostVirtualSwitch())));
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
        if (getHostVirtualSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVirtualSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVirtualSwitch(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVirtualSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVirtualSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitch"));
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
