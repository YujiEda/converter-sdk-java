/**
 * OvfUnknownDeviceBacking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfUnknownDeviceBacking  extends com.vmware.converter.OvfHardwareExport  implements java.io.Serializable {
    private com.vmware.converter.VirtualDeviceBackingInfo backing;

    public OvfUnknownDeviceBacking() {
    }

    public OvfUnknownDeviceBacking(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.VirtualDevice device,
           java.lang.String vmPath,
           com.vmware.converter.VirtualDeviceBackingInfo backing) {
        super(
            faultCause,
            faultMessage,
            device,
            vmPath);
        this.backing = backing;
    }


    /**
     * Gets the backing value for this OvfUnknownDeviceBacking.
     * 
     * @return backing
     */
    public com.vmware.converter.VirtualDeviceBackingInfo getBacking() {
        return backing;
    }


    /**
     * Sets the backing value for this OvfUnknownDeviceBacking.
     * 
     * @param backing
     */
    public void setBacking(com.vmware.converter.VirtualDeviceBackingInfo backing) {
        this.backing = backing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfUnknownDeviceBacking)) return false;
        OvfUnknownDeviceBacking other = (OvfUnknownDeviceBacking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.backing==null && other.getBacking()==null) || 
             (this.backing!=null &&
              this.backing.equals(other.getBacking())));
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
        if (getBacking() != null) {
            _hashCode += getBacking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfUnknownDeviceBacking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfUnknownDeviceBacking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBackingInfo"));
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
