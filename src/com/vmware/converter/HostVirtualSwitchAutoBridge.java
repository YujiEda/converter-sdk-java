/**
 * HostVirtualSwitchAutoBridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVirtualSwitchAutoBridge  extends com.vmware.converter.HostVirtualSwitchBridge  implements java.io.Serializable {
    private java.lang.String[] excludedNicDevice;

    public HostVirtualSwitchAutoBridge() {
    }

    public HostVirtualSwitchAutoBridge(
           java.lang.String[] excludedNicDevice) {
        this.excludedNicDevice = excludedNicDevice;
    }


    /**
     * Gets the excludedNicDevice value for this HostVirtualSwitchAutoBridge.
     * 
     * @return excludedNicDevice
     */
    public java.lang.String[] getExcludedNicDevice() {
        return excludedNicDevice;
    }


    /**
     * Sets the excludedNicDevice value for this HostVirtualSwitchAutoBridge.
     * 
     * @param excludedNicDevice
     */
    public void setExcludedNicDevice(java.lang.String[] excludedNicDevice) {
        this.excludedNicDevice = excludedNicDevice;
    }

    public java.lang.String getExcludedNicDevice(int i) {
        return this.excludedNicDevice[i];
    }

    public void setExcludedNicDevice(int i, java.lang.String _value) {
        this.excludedNicDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitchAutoBridge)) return false;
        HostVirtualSwitchAutoBridge other = (HostVirtualSwitchAutoBridge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.excludedNicDevice==null && other.getExcludedNicDevice()==null) || 
             (this.excludedNicDevice!=null &&
              java.util.Arrays.equals(this.excludedNicDevice, other.getExcludedNicDevice())));
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
        if (getExcludedNicDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedNicDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedNicDevice(), i);
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
        new org.apache.axis.description.TypeDesc(HostVirtualSwitchAutoBridge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchAutoBridge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedNicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "excludedNicDevice"));
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
