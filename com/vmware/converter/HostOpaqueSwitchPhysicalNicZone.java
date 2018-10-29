/**
 * HostOpaqueSwitchPhysicalNicZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostOpaqueSwitchPhysicalNicZone  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String[] pnicDevice;

    public HostOpaqueSwitchPhysicalNicZone() {
    }

    public HostOpaqueSwitchPhysicalNicZone(
           java.lang.String key,
           java.lang.String[] pnicDevice) {
        this.key = key;
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the key value for this HostOpaqueSwitchPhysicalNicZone.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostOpaqueSwitchPhysicalNicZone.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the pnicDevice value for this HostOpaqueSwitchPhysicalNicZone.
     * 
     * @return pnicDevice
     */
    public java.lang.String[] getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this HostOpaqueSwitchPhysicalNicZone.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String[] pnicDevice) {
        this.pnicDevice = pnicDevice;
    }

    public java.lang.String getPnicDevice(int i) {
        return this.pnicDevice[i];
    }

    public void setPnicDevice(int i, java.lang.String _value) {
        this.pnicDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostOpaqueSwitchPhysicalNicZone)) return false;
        HostOpaqueSwitchPhysicalNicZone other = (HostOpaqueSwitchPhysicalNicZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              java.util.Arrays.equals(this.pnicDevice, other.getPnicDevice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getPnicDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicDevice(), i);
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
        new org.apache.axis.description.TypeDesc(HostOpaqueSwitchPhysicalNicZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitchPhysicalNicZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
