/**
 * ArrayOfVAppPropertyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVAppPropertyInfo  implements java.io.Serializable {
    private com.vmware.converter.VAppPropertyInfo[] VAppPropertyInfo;

    public ArrayOfVAppPropertyInfo() {
    }

    public ArrayOfVAppPropertyInfo(
           com.vmware.converter.VAppPropertyInfo[] VAppPropertyInfo) {
           this.VAppPropertyInfo = VAppPropertyInfo;
    }


    /**
     * Gets the VAppPropertyInfo value for this ArrayOfVAppPropertyInfo.
     * 
     * @return VAppPropertyInfo
     */
    public com.vmware.converter.VAppPropertyInfo[] getVAppPropertyInfo() {
        return VAppPropertyInfo;
    }


    /**
     * Sets the VAppPropertyInfo value for this ArrayOfVAppPropertyInfo.
     * 
     * @param VAppPropertyInfo
     */
    public void setVAppPropertyInfo(com.vmware.converter.VAppPropertyInfo[] VAppPropertyInfo) {
        this.VAppPropertyInfo = VAppPropertyInfo;
    }

    public com.vmware.converter.VAppPropertyInfo getVAppPropertyInfo(int i) {
        return this.VAppPropertyInfo[i];
    }

    public void setVAppPropertyInfo(int i, com.vmware.converter.VAppPropertyInfo _value) {
        this.VAppPropertyInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppPropertyInfo)) return false;
        ArrayOfVAppPropertyInfo other = (ArrayOfVAppPropertyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppPropertyInfo==null && other.getVAppPropertyInfo()==null) || 
             (this.VAppPropertyInfo!=null &&
              java.util.Arrays.equals(this.VAppPropertyInfo, other.getVAppPropertyInfo())));
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
        if (getVAppPropertyInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppPropertyInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppPropertyInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppPropertyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppPropertyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppPropertyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppPropertyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppPropertyInfo"));
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
