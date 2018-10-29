/**
 * ArrayOfVAppProductInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVAppProductInfo  implements java.io.Serializable {
    private com.vmware.converter.VAppProductInfo[] VAppProductInfo;

    public ArrayOfVAppProductInfo() {
    }

    public ArrayOfVAppProductInfo(
           com.vmware.converter.VAppProductInfo[] VAppProductInfo) {
           this.VAppProductInfo = VAppProductInfo;
    }


    /**
     * Gets the VAppProductInfo value for this ArrayOfVAppProductInfo.
     * 
     * @return VAppProductInfo
     */
    public com.vmware.converter.VAppProductInfo[] getVAppProductInfo() {
        return VAppProductInfo;
    }


    /**
     * Sets the VAppProductInfo value for this ArrayOfVAppProductInfo.
     * 
     * @param VAppProductInfo
     */
    public void setVAppProductInfo(com.vmware.converter.VAppProductInfo[] VAppProductInfo) {
        this.VAppProductInfo = VAppProductInfo;
    }

    public com.vmware.converter.VAppProductInfo getVAppProductInfo(int i) {
        return this.VAppProductInfo[i];
    }

    public void setVAppProductInfo(int i, com.vmware.converter.VAppProductInfo _value) {
        this.VAppProductInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppProductInfo)) return false;
        ArrayOfVAppProductInfo other = (ArrayOfVAppProductInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppProductInfo==null && other.getVAppProductInfo()==null) || 
             (this.VAppProductInfo!=null &&
              java.util.Arrays.equals(this.VAppProductInfo, other.getVAppProductInfo())));
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
        if (getVAppProductInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppProductInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppProductInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppProductInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppProductInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
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
