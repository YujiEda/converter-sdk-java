/**
 * VspanSameSessionPortConflict.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VspanSameSessionPortConflict  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String vspanSessionKey;

    private java.lang.String portKey;

    public VspanSameSessionPortConflict() {
    }

    public VspanSameSessionPortConflict(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String vspanSessionKey,
           java.lang.String portKey) {
        super(
            faultCause,
            faultMessage);
        this.vspanSessionKey = vspanSessionKey;
        this.portKey = portKey;
    }


    /**
     * Gets the vspanSessionKey value for this VspanSameSessionPortConflict.
     * 
     * @return vspanSessionKey
     */
    public java.lang.String getVspanSessionKey() {
        return vspanSessionKey;
    }


    /**
     * Sets the vspanSessionKey value for this VspanSameSessionPortConflict.
     * 
     * @param vspanSessionKey
     */
    public void setVspanSessionKey(java.lang.String vspanSessionKey) {
        this.vspanSessionKey = vspanSessionKey;
    }


    /**
     * Gets the portKey value for this VspanSameSessionPortConflict.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this VspanSameSessionPortConflict.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VspanSameSessionPortConflict)) return false;
        VspanSameSessionPortConflict other = (VspanSameSessionPortConflict) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vspanSessionKey==null && other.getVspanSessionKey()==null) || 
             (this.vspanSessionKey!=null &&
              this.vspanSessionKey.equals(other.getVspanSessionKey()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey())));
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
        if (getVspanSessionKey() != null) {
            _hashCode += getVspanSessionKey().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VspanSameSessionPortConflict.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VspanSameSessionPortConflict"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSessionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSessionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
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
