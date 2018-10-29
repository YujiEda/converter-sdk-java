/**
 * VirtualMachineProfileRawData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineProfileRawData  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String extensionKey;

    private java.lang.String objectData;

    public VirtualMachineProfileRawData() {
    }

    public VirtualMachineProfileRawData(
           java.lang.String extensionKey,
           java.lang.String objectData) {
        this.extensionKey = extensionKey;
        this.objectData = objectData;
    }


    /**
     * Gets the extensionKey value for this VirtualMachineProfileRawData.
     * 
     * @return extensionKey
     */
    public java.lang.String getExtensionKey() {
        return extensionKey;
    }


    /**
     * Sets the extensionKey value for this VirtualMachineProfileRawData.
     * 
     * @param extensionKey
     */
    public void setExtensionKey(java.lang.String extensionKey) {
        this.extensionKey = extensionKey;
    }


    /**
     * Gets the objectData value for this VirtualMachineProfileRawData.
     * 
     * @return objectData
     */
    public java.lang.String getObjectData() {
        return objectData;
    }


    /**
     * Sets the objectData value for this VirtualMachineProfileRawData.
     * 
     * @param objectData
     */
    public void setObjectData(java.lang.String objectData) {
        this.objectData = objectData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineProfileRawData)) return false;
        VirtualMachineProfileRawData other = (VirtualMachineProfileRawData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extensionKey==null && other.getExtensionKey()==null) || 
             (this.extensionKey!=null &&
              this.extensionKey.equals(other.getExtensionKey()))) &&
            ((this.objectData==null && other.getObjectData()==null) || 
             (this.objectData!=null &&
              this.objectData.equals(other.getObjectData())));
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
        if (getExtensionKey() != null) {
            _hashCode += getExtensionKey().hashCode();
        }
        if (getObjectData() != null) {
            _hashCode += getObjectData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineProfileRawData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileRawData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectData"));
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
