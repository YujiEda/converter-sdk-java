/**
 * ArrayOfOvfOptionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfOvfOptionInfo  implements java.io.Serializable {
    private com.vmware.converter.OvfOptionInfo[] ovfOptionInfo;

    public ArrayOfOvfOptionInfo() {
    }

    public ArrayOfOvfOptionInfo(
           com.vmware.converter.OvfOptionInfo[] ovfOptionInfo) {
           this.ovfOptionInfo = ovfOptionInfo;
    }


    /**
     * Gets the ovfOptionInfo value for this ArrayOfOvfOptionInfo.
     * 
     * @return ovfOptionInfo
     */
    public com.vmware.converter.OvfOptionInfo[] getOvfOptionInfo() {
        return ovfOptionInfo;
    }


    /**
     * Sets the ovfOptionInfo value for this ArrayOfOvfOptionInfo.
     * 
     * @param ovfOptionInfo
     */
    public void setOvfOptionInfo(com.vmware.converter.OvfOptionInfo[] ovfOptionInfo) {
        this.ovfOptionInfo = ovfOptionInfo;
    }

    public com.vmware.converter.OvfOptionInfo getOvfOptionInfo(int i) {
        return this.ovfOptionInfo[i];
    }

    public void setOvfOptionInfo(int i, com.vmware.converter.OvfOptionInfo _value) {
        this.ovfOptionInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOvfOptionInfo)) return false;
        ArrayOfOvfOptionInfo other = (ArrayOfOvfOptionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ovfOptionInfo==null && other.getOvfOptionInfo()==null) || 
             (this.ovfOptionInfo!=null &&
              java.util.Arrays.equals(this.ovfOptionInfo, other.getOvfOptionInfo())));
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
        if (getOvfOptionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfOptionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfOptionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOvfOptionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfOvfOptionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfOptionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "OvfOptionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfOptionInfo"));
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
