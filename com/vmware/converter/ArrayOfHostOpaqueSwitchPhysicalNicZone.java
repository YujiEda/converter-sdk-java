/**
 * ArrayOfHostOpaqueSwitchPhysicalNicZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostOpaqueSwitchPhysicalNicZone  implements java.io.Serializable {
    private com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] hostOpaqueSwitchPhysicalNicZone;

    public ArrayOfHostOpaqueSwitchPhysicalNicZone() {
    }

    public ArrayOfHostOpaqueSwitchPhysicalNicZone(
           com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] hostOpaqueSwitchPhysicalNicZone) {
           this.hostOpaqueSwitchPhysicalNicZone = hostOpaqueSwitchPhysicalNicZone;
    }


    /**
     * Gets the hostOpaqueSwitchPhysicalNicZone value for this ArrayOfHostOpaqueSwitchPhysicalNicZone.
     * 
     * @return hostOpaqueSwitchPhysicalNicZone
     */
    public com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] getHostOpaqueSwitchPhysicalNicZone() {
        return hostOpaqueSwitchPhysicalNicZone;
    }


    /**
     * Sets the hostOpaqueSwitchPhysicalNicZone value for this ArrayOfHostOpaqueSwitchPhysicalNicZone.
     * 
     * @param hostOpaqueSwitchPhysicalNicZone
     */
    public void setHostOpaqueSwitchPhysicalNicZone(com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] hostOpaqueSwitchPhysicalNicZone) {
        this.hostOpaqueSwitchPhysicalNicZone = hostOpaqueSwitchPhysicalNicZone;
    }

    public com.vmware.converter.HostOpaqueSwitchPhysicalNicZone getHostOpaqueSwitchPhysicalNicZone(int i) {
        return this.hostOpaqueSwitchPhysicalNicZone[i];
    }

    public void setHostOpaqueSwitchPhysicalNicZone(int i, com.vmware.converter.HostOpaqueSwitchPhysicalNicZone _value) {
        this.hostOpaqueSwitchPhysicalNicZone[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostOpaqueSwitchPhysicalNicZone)) return false;
        ArrayOfHostOpaqueSwitchPhysicalNicZone other = (ArrayOfHostOpaqueSwitchPhysicalNicZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostOpaqueSwitchPhysicalNicZone==null && other.getHostOpaqueSwitchPhysicalNicZone()==null) || 
             (this.hostOpaqueSwitchPhysicalNicZone!=null &&
              java.util.Arrays.equals(this.hostOpaqueSwitchPhysicalNicZone, other.getHostOpaqueSwitchPhysicalNicZone())));
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
        if (getHostOpaqueSwitchPhysicalNicZone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostOpaqueSwitchPhysicalNicZone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostOpaqueSwitchPhysicalNicZone(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostOpaqueSwitchPhysicalNicZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostOpaqueSwitchPhysicalNicZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostOpaqueSwitchPhysicalNicZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitchPhysicalNicZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitchPhysicalNicZone"));
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
