/**
 * ArrayOfExtManagedEntityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfExtManagedEntityInfo  implements java.io.Serializable {
    private com.vmware.converter.ExtManagedEntityInfo[] extManagedEntityInfo;

    public ArrayOfExtManagedEntityInfo() {
    }

    public ArrayOfExtManagedEntityInfo(
           com.vmware.converter.ExtManagedEntityInfo[] extManagedEntityInfo) {
           this.extManagedEntityInfo = extManagedEntityInfo;
    }


    /**
     * Gets the extManagedEntityInfo value for this ArrayOfExtManagedEntityInfo.
     * 
     * @return extManagedEntityInfo
     */
    public com.vmware.converter.ExtManagedEntityInfo[] getExtManagedEntityInfo() {
        return extManagedEntityInfo;
    }


    /**
     * Sets the extManagedEntityInfo value for this ArrayOfExtManagedEntityInfo.
     * 
     * @param extManagedEntityInfo
     */
    public void setExtManagedEntityInfo(com.vmware.converter.ExtManagedEntityInfo[] extManagedEntityInfo) {
        this.extManagedEntityInfo = extManagedEntityInfo;
    }

    public com.vmware.converter.ExtManagedEntityInfo getExtManagedEntityInfo(int i) {
        return this.extManagedEntityInfo[i];
    }

    public void setExtManagedEntityInfo(int i, com.vmware.converter.ExtManagedEntityInfo _value) {
        this.extManagedEntityInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtManagedEntityInfo)) return false;
        ArrayOfExtManagedEntityInfo other = (ArrayOfExtManagedEntityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extManagedEntityInfo==null && other.getExtManagedEntityInfo()==null) || 
             (this.extManagedEntityInfo!=null &&
              java.util.Arrays.equals(this.extManagedEntityInfo, other.getExtManagedEntityInfo())));
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
        if (getExtManagedEntityInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtManagedEntityInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtManagedEntityInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtManagedEntityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfExtManagedEntityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extManagedEntityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ExtManagedEntityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtManagedEntityInfo"));
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
