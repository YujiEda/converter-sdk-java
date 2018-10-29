/**
 * ArrayOfVsanHostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigInfo;

    public ArrayOfVsanHostConfigInfo() {
    }

    public ArrayOfVsanHostConfigInfo(
           com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigInfo) {
           this.vsanHostConfigInfo = vsanHostConfigInfo;
    }


    /**
     * Gets the vsanHostConfigInfo value for this ArrayOfVsanHostConfigInfo.
     * 
     * @return vsanHostConfigInfo
     */
    public com.vmware.converter.VsanHostConfigInfo[] getVsanHostConfigInfo() {
        return vsanHostConfigInfo;
    }


    /**
     * Sets the vsanHostConfigInfo value for this ArrayOfVsanHostConfigInfo.
     * 
     * @param vsanHostConfigInfo
     */
    public void setVsanHostConfigInfo(com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigInfo) {
        this.vsanHostConfigInfo = vsanHostConfigInfo;
    }

    public com.vmware.converter.VsanHostConfigInfo getVsanHostConfigInfo(int i) {
        return this.vsanHostConfigInfo[i];
    }

    public void setVsanHostConfigInfo(int i, com.vmware.converter.VsanHostConfigInfo _value) {
        this.vsanHostConfigInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostConfigInfo)) return false;
        ArrayOfVsanHostConfigInfo other = (ArrayOfVsanHostConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostConfigInfo==null && other.getVsanHostConfigInfo()==null) || 
             (this.vsanHostConfigInfo!=null &&
              java.util.Arrays.equals(this.vsanHostConfigInfo, other.getVsanHostConfigInfo())));
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
        if (getVsanHostConfigInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostConfigInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostConfigInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
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
