/**
 * VirtualDeviceRemoteDeviceBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDeviceRemoteDeviceBackingOption  extends com.vmware.converter.VirtualDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.converter.BoolOption autoDetectAvailable;

    public VirtualDeviceRemoteDeviceBackingOption() {
    }

    public VirtualDeviceRemoteDeviceBackingOption(
           java.lang.String type,
           com.vmware.converter.BoolOption autoDetectAvailable) {
        super(
            type);
        this.autoDetectAvailable = autoDetectAvailable;
    }


    /**
     * Gets the autoDetectAvailable value for this VirtualDeviceRemoteDeviceBackingOption.
     * 
     * @return autoDetectAvailable
     */
    public com.vmware.converter.BoolOption getAutoDetectAvailable() {
        return autoDetectAvailable;
    }


    /**
     * Sets the autoDetectAvailable value for this VirtualDeviceRemoteDeviceBackingOption.
     * 
     * @param autoDetectAvailable
     */
    public void setAutoDetectAvailable(com.vmware.converter.BoolOption autoDetectAvailable) {
        this.autoDetectAvailable = autoDetectAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceRemoteDeviceBackingOption)) return false;
        VirtualDeviceRemoteDeviceBackingOption other = (VirtualDeviceRemoteDeviceBackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoDetectAvailable==null && other.getAutoDetectAvailable()==null) || 
             (this.autoDetectAvailable!=null &&
              this.autoDetectAvailable.equals(other.getAutoDetectAvailable())));
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
        if (getAutoDetectAvailable() != null) {
            _hashCode += getAutoDetectAvailable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDeviceRemoteDeviceBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceRemoteDeviceBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDetectAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoDetectAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
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