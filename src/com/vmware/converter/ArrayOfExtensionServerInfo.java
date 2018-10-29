/**
 * ArrayOfExtensionServerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfExtensionServerInfo  implements java.io.Serializable {
    private com.vmware.converter.ExtensionServerInfo[] extensionServerInfo;

    public ArrayOfExtensionServerInfo() {
    }

    public ArrayOfExtensionServerInfo(
           com.vmware.converter.ExtensionServerInfo[] extensionServerInfo) {
           this.extensionServerInfo = extensionServerInfo;
    }


    /**
     * Gets the extensionServerInfo value for this ArrayOfExtensionServerInfo.
     * 
     * @return extensionServerInfo
     */
    public com.vmware.converter.ExtensionServerInfo[] getExtensionServerInfo() {
        return extensionServerInfo;
    }


    /**
     * Sets the extensionServerInfo value for this ArrayOfExtensionServerInfo.
     * 
     * @param extensionServerInfo
     */
    public void setExtensionServerInfo(com.vmware.converter.ExtensionServerInfo[] extensionServerInfo) {
        this.extensionServerInfo = extensionServerInfo;
    }

    public com.vmware.converter.ExtensionServerInfo getExtensionServerInfo(int i) {
        return this.extensionServerInfo[i];
    }

    public void setExtensionServerInfo(int i, com.vmware.converter.ExtensionServerInfo _value) {
        this.extensionServerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtensionServerInfo)) return false;
        ArrayOfExtensionServerInfo other = (ArrayOfExtensionServerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionServerInfo==null && other.getExtensionServerInfo()==null) || 
             (this.extensionServerInfo!=null &&
              java.util.Arrays.equals(this.extensionServerInfo, other.getExtensionServerInfo())));
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
        if (getExtensionServerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionServerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionServerInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtensionServerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfExtensionServerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionServerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ExtensionServerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionServerInfo"));
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
