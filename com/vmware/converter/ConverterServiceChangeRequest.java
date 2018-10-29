/**
 * ConverterServiceChangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServiceChangeRequest  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String serviceName;

    private com.vmware.converter.ConverterServiceStartType startType;

    public ConverterServiceChangeRequest() {
    }

    public ConverterServiceChangeRequest(
           java.lang.String serviceName,
           com.vmware.converter.ConverterServiceStartType startType) {
        this.serviceName = serviceName;
        this.startType = startType;
    }


    /**
     * Gets the serviceName value for this ConverterServiceChangeRequest.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ConverterServiceChangeRequest.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the startType value for this ConverterServiceChangeRequest.
     * 
     * @return startType
     */
    public com.vmware.converter.ConverterServiceStartType getStartType() {
        return startType;
    }


    /**
     * Sets the startType value for this ConverterServiceChangeRequest.
     * 
     * @param startType
     */
    public void setStartType(com.vmware.converter.ConverterServiceStartType startType) {
        this.startType = startType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServiceChangeRequest)) return false;
        ConverterServiceChangeRequest other = (ConverterServiceChangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.startType==null && other.getStartType()==null) || 
             (this.startType!=null &&
              this.startType.equals(other.getStartType())));
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getStartType() != null) {
            _hashCode += getStartType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServiceChangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceChangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceStartType"));
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
