/**
 * ArrayOfVsanHostDiskMapInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostDiskMapInfo  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDiskMapInfo[] vsanHostDiskMapInfo;

    public ArrayOfVsanHostDiskMapInfo() {
    }

    public ArrayOfVsanHostDiskMapInfo(
           com.vmware.converter.VsanHostDiskMapInfo[] vsanHostDiskMapInfo) {
           this.vsanHostDiskMapInfo = vsanHostDiskMapInfo;
    }


    /**
     * Gets the vsanHostDiskMapInfo value for this ArrayOfVsanHostDiskMapInfo.
     * 
     * @return vsanHostDiskMapInfo
     */
    public com.vmware.converter.VsanHostDiskMapInfo[] getVsanHostDiskMapInfo() {
        return vsanHostDiskMapInfo;
    }


    /**
     * Sets the vsanHostDiskMapInfo value for this ArrayOfVsanHostDiskMapInfo.
     * 
     * @param vsanHostDiskMapInfo
     */
    public void setVsanHostDiskMapInfo(com.vmware.converter.VsanHostDiskMapInfo[] vsanHostDiskMapInfo) {
        this.vsanHostDiskMapInfo = vsanHostDiskMapInfo;
    }

    public com.vmware.converter.VsanHostDiskMapInfo getVsanHostDiskMapInfo(int i) {
        return this.vsanHostDiskMapInfo[i];
    }

    public void setVsanHostDiskMapInfo(int i, com.vmware.converter.VsanHostDiskMapInfo _value) {
        this.vsanHostDiskMapInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostDiskMapInfo)) return false;
        ArrayOfVsanHostDiskMapInfo other = (ArrayOfVsanHostDiskMapInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostDiskMapInfo==null && other.getVsanHostDiskMapInfo()==null) || 
             (this.vsanHostDiskMapInfo!=null &&
              java.util.Arrays.equals(this.vsanHostDiskMapInfo, other.getVsanHostDiskMapInfo())));
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
        if (getVsanHostDiskMapInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostDiskMapInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostDiskMapInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostDiskMapInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostDiskMapInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostDiskMapInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapInfo"));
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
