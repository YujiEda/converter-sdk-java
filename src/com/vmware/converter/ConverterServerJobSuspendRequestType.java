/**
 * ConverterServerJobSuspendRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerJobSuspendRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private java.lang.String activeTaskHandling;

    public ConverterServerJobSuspendRequestType() {
    }

    public ConverterServerJobSuspendRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           java.lang.String activeTaskHandling) {
           this._this = _this;
           this.activeTaskHandling = activeTaskHandling;
    }


    /**
     * Gets the _this value for this ConverterServerJobSuspendRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterServerJobSuspendRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the activeTaskHandling value for this ConverterServerJobSuspendRequestType.
     * 
     * @return activeTaskHandling
     */
    public java.lang.String getActiveTaskHandling() {
        return activeTaskHandling;
    }


    /**
     * Sets the activeTaskHandling value for this ConverterServerJobSuspendRequestType.
     * 
     * @param activeTaskHandling
     */
    public void setActiveTaskHandling(java.lang.String activeTaskHandling) {
        this.activeTaskHandling = activeTaskHandling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerJobSuspendRequestType)) return false;
        ConverterServerJobSuspendRequestType other = (ConverterServerJobSuspendRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.activeTaskHandling==null && other.getActiveTaskHandling()==null) || 
             (this.activeTaskHandling!=null &&
              this.activeTaskHandling.equals(other.getActiveTaskHandling())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getActiveTaskHandling() != null) {
            _hashCode += getActiveTaskHandling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerJobSuspendRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobSuspendRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTaskHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "activeTaskHandling"));
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
