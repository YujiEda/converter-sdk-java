/**
 * ConverterImportSourceV2IPassword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterImportSourceV2IPassword  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private java.lang.String sourceVm;

    public ConverterImportSourceV2IPassword() {
    }

    public ConverterImportSourceV2IPassword(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String sourceVm) {
        super(
            faultCause,
            faultMessage);
        this.sourceVm = sourceVm;
    }


    /**
     * Gets the sourceVm value for this ConverterImportSourceV2IPassword.
     * 
     * @return sourceVm
     */
    public java.lang.String getSourceVm() {
        return sourceVm;
    }


    /**
     * Sets the sourceVm value for this ConverterImportSourceV2IPassword.
     * 
     * @param sourceVm
     */
    public void setSourceVm(java.lang.String sourceVm) {
        this.sourceVm = sourceVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterImportSourceV2IPassword)) return false;
        ConverterImportSourceV2IPassword other = (ConverterImportSourceV2IPassword) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceVm==null && other.getSourceVm()==null) || 
             (this.sourceVm!=null &&
              this.sourceVm.equals(other.getSourceVm())));
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
        if (getSourceVm() != null) {
            _hashCode += getSourceVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterImportSourceV2IPassword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterImportSourceV2iPassword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceVm"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
