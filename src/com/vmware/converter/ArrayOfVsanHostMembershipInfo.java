/**
 * ArrayOfVsanHostMembershipInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostMembershipInfo  implements java.io.Serializable {
    private com.vmware.converter.VsanHostMembershipInfo[] vsanHostMembershipInfo;

    public ArrayOfVsanHostMembershipInfo() {
    }

    public ArrayOfVsanHostMembershipInfo(
           com.vmware.converter.VsanHostMembershipInfo[] vsanHostMembershipInfo) {
           this.vsanHostMembershipInfo = vsanHostMembershipInfo;
    }


    /**
     * Gets the vsanHostMembershipInfo value for this ArrayOfVsanHostMembershipInfo.
     * 
     * @return vsanHostMembershipInfo
     */
    public com.vmware.converter.VsanHostMembershipInfo[] getVsanHostMembershipInfo() {
        return vsanHostMembershipInfo;
    }


    /**
     * Sets the vsanHostMembershipInfo value for this ArrayOfVsanHostMembershipInfo.
     * 
     * @param vsanHostMembershipInfo
     */
    public void setVsanHostMembershipInfo(com.vmware.converter.VsanHostMembershipInfo[] vsanHostMembershipInfo) {
        this.vsanHostMembershipInfo = vsanHostMembershipInfo;
    }

    public com.vmware.converter.VsanHostMembershipInfo getVsanHostMembershipInfo(int i) {
        return this.vsanHostMembershipInfo[i];
    }

    public void setVsanHostMembershipInfo(int i, com.vmware.converter.VsanHostMembershipInfo _value) {
        this.vsanHostMembershipInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostMembershipInfo)) return false;
        ArrayOfVsanHostMembershipInfo other = (ArrayOfVsanHostMembershipInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostMembershipInfo==null && other.getVsanHostMembershipInfo()==null) || 
             (this.vsanHostMembershipInfo!=null &&
              java.util.Arrays.equals(this.vsanHostMembershipInfo, other.getVsanHostMembershipInfo())));
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
        if (getVsanHostMembershipInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostMembershipInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostMembershipInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostMembershipInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostMembershipInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostMembershipInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostMembershipInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostMembershipInfo"));
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
