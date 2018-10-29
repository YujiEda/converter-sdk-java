/**
 * ArrayOfIscsiPortInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfIscsiPortInfo  implements java.io.Serializable {
    private com.vmware.converter.IscsiPortInfo[] iscsiPortInfo;

    public ArrayOfIscsiPortInfo() {
    }

    public ArrayOfIscsiPortInfo(
           com.vmware.converter.IscsiPortInfo[] iscsiPortInfo) {
           this.iscsiPortInfo = iscsiPortInfo;
    }


    /**
     * Gets the iscsiPortInfo value for this ArrayOfIscsiPortInfo.
     * 
     * @return iscsiPortInfo
     */
    public com.vmware.converter.IscsiPortInfo[] getIscsiPortInfo() {
        return iscsiPortInfo;
    }


    /**
     * Sets the iscsiPortInfo value for this ArrayOfIscsiPortInfo.
     * 
     * @param iscsiPortInfo
     */
    public void setIscsiPortInfo(com.vmware.converter.IscsiPortInfo[] iscsiPortInfo) {
        this.iscsiPortInfo = iscsiPortInfo;
    }

    public com.vmware.converter.IscsiPortInfo getIscsiPortInfo(int i) {
        return this.iscsiPortInfo[i];
    }

    public void setIscsiPortInfo(int i, com.vmware.converter.IscsiPortInfo _value) {
        this.iscsiPortInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfIscsiPortInfo)) return false;
        ArrayOfIscsiPortInfo other = (ArrayOfIscsiPortInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iscsiPortInfo==null && other.getIscsiPortInfo()==null) || 
             (this.iscsiPortInfo!=null &&
              java.util.Arrays.equals(this.iscsiPortInfo, other.getIscsiPortInfo())));
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
        if (getIscsiPortInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIscsiPortInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIscsiPortInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfIscsiPortInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfIscsiPortInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiPortInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "IscsiPortInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiPortInfo"));
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
