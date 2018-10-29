/**
 * ConverterNetworkInfoLiveNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfoLiveNicInfo  extends com.vmware.converter.ConverterNetworkInfoNicInfo  implements java.io.Serializable {
    private java.lang.String[] ipAddress;

    public ConverterNetworkInfoLiveNicInfo() {
    }

    public ConverterNetworkInfoLiveNicInfo(
           java.lang.String nicId,
           boolean connected,
           java.lang.String label,
           java.lang.String[] ipAddress) {
        super(
            nicId,
            connected,
            label);
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the ipAddress value for this ConverterNetworkInfoLiveNicInfo.
     * 
     * @return ipAddress
     */
    public java.lang.String[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this ConverterNetworkInfoLiveNicInfo.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public java.lang.String getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, java.lang.String _value) {
        this.ipAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkInfoLiveNicInfo)) return false;
        ConverterNetworkInfoLiveNicInfo other = (ConverterNetworkInfoLiveNicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress())));
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
        if (getIpAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfoLiveNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoLiveNicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
