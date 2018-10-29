/**
 * DatacenterConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatacenterConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String defaultHardwareVersionKey;

    public DatacenterConfigInfo() {
    }

    public DatacenterConfigInfo(
           java.lang.String defaultHardwareVersionKey) {
        this.defaultHardwareVersionKey = defaultHardwareVersionKey;
    }


    /**
     * Gets the defaultHardwareVersionKey value for this DatacenterConfigInfo.
     * 
     * @return defaultHardwareVersionKey
     */
    public java.lang.String getDefaultHardwareVersionKey() {
        return defaultHardwareVersionKey;
    }


    /**
     * Sets the defaultHardwareVersionKey value for this DatacenterConfigInfo.
     * 
     * @param defaultHardwareVersionKey
     */
    public void setDefaultHardwareVersionKey(java.lang.String defaultHardwareVersionKey) {
        this.defaultHardwareVersionKey = defaultHardwareVersionKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacenterConfigInfo)) return false;
        DatacenterConfigInfo other = (DatacenterConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultHardwareVersionKey==null && other.getDefaultHardwareVersionKey()==null) || 
             (this.defaultHardwareVersionKey!=null &&
              this.defaultHardwareVersionKey.equals(other.getDefaultHardwareVersionKey())));
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
        if (getDefaultHardwareVersionKey() != null) {
            _hashCode += getDefaultHardwareVersionKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacenterConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultHardwareVersionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultHardwareVersionKey"));
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
