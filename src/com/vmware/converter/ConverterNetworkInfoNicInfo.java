/**
 * ConverterNetworkInfoNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfoNicInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String nicId;

    private boolean connected;

    private java.lang.String label;

    public ConverterNetworkInfoNicInfo() {
    }

    public ConverterNetworkInfoNicInfo(
           java.lang.String nicId,
           boolean connected,
           java.lang.String label) {
        this.nicId = nicId;
        this.connected = connected;
        this.label = label;
    }


    /**
     * Gets the nicId value for this ConverterNetworkInfoNicInfo.
     * 
     * @return nicId
     */
    public java.lang.String getNicId() {
        return nicId;
    }


    /**
     * Sets the nicId value for this ConverterNetworkInfoNicInfo.
     * 
     * @param nicId
     */
    public void setNicId(java.lang.String nicId) {
        this.nicId = nicId;
    }


    /**
     * Gets the connected value for this ConverterNetworkInfoNicInfo.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this ConverterNetworkInfoNicInfo.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the label value for this ConverterNetworkInfoNicInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ConverterNetworkInfoNicInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkInfoNicInfo)) return false;
        ConverterNetworkInfoNicInfo other = (ConverterNetworkInfoNicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nicId==null && other.getNicId()==null) || 
             (this.nicId!=null &&
              this.nicId.equals(other.getNicId()))) &&
            this.connected == other.isConnected() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (getNicId() != null) {
            _hashCode += getNicId().hashCode();
        }
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfoNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoNicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
