/**
 * ConverterAgentInternalPvsSourceVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalPvsSourceVMSpec  extends com.vmware.converter.ConverterAgentInternalForeignSourceVMSpec  implements java.io.Serializable {
    private java.lang.String pvsFilePath;

    public ConverterAgentInternalPvsSourceVMSpec() {
    }

    public ConverterAgentInternalPvsSourceVMSpec(
           java.lang.String networkUsername,
           java.lang.String networkPassword,
           java.lang.String pvsFilePath) {
        super(
            networkUsername,
            networkPassword);
        this.pvsFilePath = pvsFilePath;
    }


    /**
     * Gets the pvsFilePath value for this ConverterAgentInternalPvsSourceVMSpec.
     * 
     * @return pvsFilePath
     */
    public java.lang.String getPvsFilePath() {
        return pvsFilePath;
    }


    /**
     * Sets the pvsFilePath value for this ConverterAgentInternalPvsSourceVMSpec.
     * 
     * @param pvsFilePath
     */
    public void setPvsFilePath(java.lang.String pvsFilePath) {
        this.pvsFilePath = pvsFilePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalPvsSourceVMSpec)) return false;
        ConverterAgentInternalPvsSourceVMSpec other = (ConverterAgentInternalPvsSourceVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pvsFilePath==null && other.getPvsFilePath()==null) || 
             (this.pvsFilePath!=null &&
              this.pvsFilePath.equals(other.getPvsFilePath())));
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
        if (getPvsFilePath() != null) {
            _hashCode += getPvsFilePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalPvsSourceVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalPvsSourceVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvsFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "pvsFilePath"));
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
