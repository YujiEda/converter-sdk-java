/**
 * SsdDiskNotAvailable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SsdDiskNotAvailable  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private java.lang.String devicePath;

    public SsdDiskNotAvailable() {
    }

    public SsdDiskNotAvailable(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String devicePath) {
        super(
            faultCause,
            faultMessage);
        this.devicePath = devicePath;
    }


    /**
     * Gets the devicePath value for this SsdDiskNotAvailable.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this SsdDiskNotAvailable.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsdDiskNotAvailable)) return false;
        SsdDiskNotAvailable other = (SsdDiskNotAvailable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath())));
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
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsdDiskNotAvailable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SsdDiskNotAvailable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
