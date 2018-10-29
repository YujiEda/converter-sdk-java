/**
 * InvalidCAMServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InvalidCAMServer  extends com.vmware.converter.ActiveDirectoryFault  implements java.io.Serializable {
    private java.lang.String camServer;

    public InvalidCAMServer() {
    }

    public InvalidCAMServer(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.Integer errorCode,
           java.lang.String camServer) {
        super(
            faultCause,
            faultMessage,
            errorCode);
        this.camServer = camServer;
    }


    /**
     * Gets the camServer value for this InvalidCAMServer.
     * 
     * @return camServer
     */
    public java.lang.String getCamServer() {
        return camServer;
    }


    /**
     * Sets the camServer value for this InvalidCAMServer.
     * 
     * @param camServer
     */
    public void setCamServer(java.lang.String camServer) {
        this.camServer = camServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidCAMServer)) return false;
        InvalidCAMServer other = (InvalidCAMServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.camServer==null && other.getCamServer()==null) || 
             (this.camServer!=null &&
              this.camServer.equals(other.getCamServer())));
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
        if (getCamServer() != null) {
            _hashCode += getCamServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidCAMServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InvalidCAMServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "camServer"));
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
