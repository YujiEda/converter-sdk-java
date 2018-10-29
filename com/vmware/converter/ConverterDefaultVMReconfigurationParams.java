/**
 * ConverterDefaultVMReconfigurationParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDefaultVMReconfigurationParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterConversionParams conversionParams;

    private com.vmware.converter.ConverterVMReconfigurationCapabilities vmReconfigurationCapabilities;

    public ConverterDefaultVMReconfigurationParams() {
    }

    public ConverterDefaultVMReconfigurationParams(
           com.vmware.converter.ConverterConversionParams conversionParams,
           com.vmware.converter.ConverterVMReconfigurationCapabilities vmReconfigurationCapabilities) {
        this.conversionParams = conversionParams;
        this.vmReconfigurationCapabilities = vmReconfigurationCapabilities;
    }


    /**
     * Gets the conversionParams value for this ConverterDefaultVMReconfigurationParams.
     * 
     * @return conversionParams
     */
    public com.vmware.converter.ConverterConversionParams getConversionParams() {
        return conversionParams;
    }


    /**
     * Sets the conversionParams value for this ConverterDefaultVMReconfigurationParams.
     * 
     * @param conversionParams
     */
    public void setConversionParams(com.vmware.converter.ConverterConversionParams conversionParams) {
        this.conversionParams = conversionParams;
    }


    /**
     * Gets the vmReconfigurationCapabilities value for this ConverterDefaultVMReconfigurationParams.
     * 
     * @return vmReconfigurationCapabilities
     */
    public com.vmware.converter.ConverterVMReconfigurationCapabilities getVmReconfigurationCapabilities() {
        return vmReconfigurationCapabilities;
    }


    /**
     * Sets the vmReconfigurationCapabilities value for this ConverterDefaultVMReconfigurationParams.
     * 
     * @param vmReconfigurationCapabilities
     */
    public void setVmReconfigurationCapabilities(com.vmware.converter.ConverterVMReconfigurationCapabilities vmReconfigurationCapabilities) {
        this.vmReconfigurationCapabilities = vmReconfigurationCapabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDefaultVMReconfigurationParams)) return false;
        ConverterDefaultVMReconfigurationParams other = (ConverterDefaultVMReconfigurationParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conversionParams==null && other.getConversionParams()==null) || 
             (this.conversionParams!=null &&
              this.conversionParams.equals(other.getConversionParams()))) &&
            ((this.vmReconfigurationCapabilities==null && other.getVmReconfigurationCapabilities()==null) || 
             (this.vmReconfigurationCapabilities!=null &&
              this.vmReconfigurationCapabilities.equals(other.getVmReconfigurationCapabilities())));
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
        if (getConversionParams() != null) {
            _hashCode += getConversionParams().hashCode();
        }
        if (getVmReconfigurationCapabilities() != null) {
            _hashCode += getVmReconfigurationCapabilities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDefaultVMReconfigurationParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDefaultVMReconfigurationParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "conversionParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionParams"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmReconfigurationCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmReconfigurationCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVMReconfigurationCapabilities"));
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
