/**
 * VirtualDiskPartitionedRawDiskVer2BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskPartitionedRawDiskVer2BackingOption  extends com.vmware.converter.VirtualDiskRawDiskVer2BackingOption  implements java.io.Serializable {
    public VirtualDiskPartitionedRawDiskVer2BackingOption() {
    }

    public VirtualDiskPartitionedRawDiskVer2BackingOption(
           java.lang.String type,
           com.vmware.converter.BoolOption autoDetectAvailable,
           com.vmware.converter.ChoiceOption descriptorFileNameExtensions,
           boolean uuid) {
        super(
            type,
            autoDetectAvailable,
            descriptorFileNameExtensions,
            uuid);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskPartitionedRawDiskVer2BackingOption)) return false;
        VirtualDiskPartitionedRawDiskVer2BackingOption other = (VirtualDiskPartitionedRawDiskVer2BackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskPartitionedRawDiskVer2BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskPartitionedRawDiskVer2BackingOption"));
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
