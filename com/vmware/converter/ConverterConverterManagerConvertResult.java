/**
 * ConverterConverterManagerConvertResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConverterManagerConvertResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpec targetVm;

    public ConverterConverterManagerConvertResult() {
    }

    public ConverterConverterManagerConvertResult(
           com.vmware.converter.ConverterComputerSpec targetVm) {
        this.targetVm = targetVm;
    }


    /**
     * Gets the targetVm value for this ConverterConverterManagerConvertResult.
     * 
     * @return targetVm
     */
    public com.vmware.converter.ConverterComputerSpec getTargetVm() {
        return targetVm;
    }


    /**
     * Sets the targetVm value for this ConverterConverterManagerConvertResult.
     * 
     * @param targetVm
     */
    public void setTargetVm(com.vmware.converter.ConverterComputerSpec targetVm) {
        this.targetVm = targetVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConverterManagerConvertResult)) return false;
        ConverterConverterManagerConvertResult other = (ConverterConverterManagerConvertResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetVm==null && other.getTargetVm()==null) || 
             (this.targetVm!=null &&
              this.targetVm.equals(other.getTargetVm())));
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
        if (getTargetVm() != null) {
            _hashCode += getTargetVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConverterManagerConvertResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConverterManagerConvertResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
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
