/**
 * ConverterHostAccessRestrictedFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHostAccessRestrictedFault  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private java.lang.String managementServer;

    public ConverterHostAccessRestrictedFault() {
    }

    public ConverterHostAccessRestrictedFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String managementServer) {
        super(
            faultCause,
            faultMessage);
        this.managementServer = managementServer;
    }


    /**
     * Gets the managementServer value for this ConverterHostAccessRestrictedFault.
     * 
     * @return managementServer
     */
    public java.lang.String getManagementServer() {
        return managementServer;
    }


    /**
     * Sets the managementServer value for this ConverterHostAccessRestrictedFault.
     * 
     * @param managementServer
     */
    public void setManagementServer(java.lang.String managementServer) {
        this.managementServer = managementServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHostAccessRestrictedFault)) return false;
        ConverterHostAccessRestrictedFault other = (ConverterHostAccessRestrictedFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.managementServer==null && other.getManagementServer()==null) || 
             (this.managementServer!=null &&
              this.managementServer.equals(other.getManagementServer())));
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
        if (getManagementServer() != null) {
            _hashCode += getManagementServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterHostAccessRestrictedFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHostAccessRestrictedFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "managementServer"));
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
