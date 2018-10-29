/**
 * ConverterComputerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo;

    private com.vmware.converter.ConverterComputerOsInfo osInfo;

    public ConverterComputerInfo() {
    }

    public ConverterComputerInfo(
           com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo,
           com.vmware.converter.ConverterComputerOsInfo osInfo) {
        this.hardwareInfo = hardwareInfo;
        this.osInfo = osInfo;
    }


    /**
     * Gets the hardwareInfo value for this ConverterComputerInfo.
     * 
     * @return hardwareInfo
     */
    public com.vmware.converter.ConverterComputerHardwareInfo getHardwareInfo() {
        return hardwareInfo;
    }


    /**
     * Sets the hardwareInfo value for this ConverterComputerInfo.
     * 
     * @param hardwareInfo
     */
    public void setHardwareInfo(com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }


    /**
     * Gets the osInfo value for this ConverterComputerInfo.
     * 
     * @return osInfo
     */
    public com.vmware.converter.ConverterComputerOsInfo getOsInfo() {
        return osInfo;
    }


    /**
     * Sets the osInfo value for this ConverterComputerInfo.
     * 
     * @param osInfo
     */
    public void setOsInfo(com.vmware.converter.ConverterComputerOsInfo osInfo) {
        this.osInfo = osInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerInfo)) return false;
        ConverterComputerInfo other = (ConverterComputerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hardwareInfo==null && other.getHardwareInfo()==null) || 
             (this.hardwareInfo!=null &&
              this.hardwareInfo.equals(other.getHardwareInfo()))) &&
            ((this.osInfo==null && other.getOsInfo()==null) || 
             (this.osInfo!=null &&
              this.osInfo.equals(other.getOsInfo())));
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
        if (getHardwareInfo() != null) {
            _hashCode += getHardwareInfo().hashCode();
        }
        if (getOsInfo() != null) {
            _hashCode += getOsInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hardwareInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerHardwareInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfo"));
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
