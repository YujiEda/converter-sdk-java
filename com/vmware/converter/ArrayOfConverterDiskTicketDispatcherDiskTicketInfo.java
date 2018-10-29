/**
 * ArrayOfConverterDiskTicketDispatcherDiskTicketInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterDiskTicketDispatcherDiskTicketInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] converterDiskTicketDispatcherDiskTicketInfo;

    public ArrayOfConverterDiskTicketDispatcherDiskTicketInfo() {
    }

    public ArrayOfConverterDiskTicketDispatcherDiskTicketInfo(
           com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] converterDiskTicketDispatcherDiskTicketInfo) {
           this.converterDiskTicketDispatcherDiskTicketInfo = converterDiskTicketDispatcherDiskTicketInfo;
    }


    /**
     * Gets the converterDiskTicketDispatcherDiskTicketInfo value for this ArrayOfConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @return converterDiskTicketDispatcherDiskTicketInfo
     */
    public com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] getConverterDiskTicketDispatcherDiskTicketInfo() {
        return converterDiskTicketDispatcherDiskTicketInfo;
    }


    /**
     * Sets the converterDiskTicketDispatcherDiskTicketInfo value for this ArrayOfConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @param converterDiskTicketDispatcherDiskTicketInfo
     */
    public void setConverterDiskTicketDispatcherDiskTicketInfo(com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] converterDiskTicketDispatcherDiskTicketInfo) {
        this.converterDiskTicketDispatcherDiskTicketInfo = converterDiskTicketDispatcherDiskTicketInfo;
    }

    public com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo getConverterDiskTicketDispatcherDiskTicketInfo(int i) {
        return this.converterDiskTicketDispatcherDiskTicketInfo[i];
    }

    public void setConverterDiskTicketDispatcherDiskTicketInfo(int i, com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo _value) {
        this.converterDiskTicketDispatcherDiskTicketInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterDiskTicketDispatcherDiskTicketInfo)) return false;
        ArrayOfConverterDiskTicketDispatcherDiskTicketInfo other = (ArrayOfConverterDiskTicketDispatcherDiskTicketInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterDiskTicketDispatcherDiskTicketInfo==null && other.getConverterDiskTicketDispatcherDiskTicketInfo()==null) || 
             (this.converterDiskTicketDispatcherDiskTicketInfo!=null &&
              java.util.Arrays.equals(this.converterDiskTicketDispatcherDiskTicketInfo, other.getConverterDiskTicketDispatcherDiskTicketInfo())));
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
        if (getConverterDiskTicketDispatcherDiskTicketInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterDiskTicketDispatcherDiskTicketInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterDiskTicketDispatcherDiskTicketInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterDiskTicketDispatcherDiskTicketInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterDiskTicketDispatcherDiskTicketInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterDiskTicketDispatcherDiskTicketInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterDiskTicketDispatcherDiskTicketInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskTicketDispatcherDiskTicketInfo"));
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
