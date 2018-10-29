/**
 * ArrayOfVirtualAppLinkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualAppLinkInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualAppLinkInfo[] virtualAppLinkInfo;

    public ArrayOfVirtualAppLinkInfo() {
    }

    public ArrayOfVirtualAppLinkInfo(
           com.vmware.converter.VirtualAppLinkInfo[] virtualAppLinkInfo) {
           this.virtualAppLinkInfo = virtualAppLinkInfo;
    }


    /**
     * Gets the virtualAppLinkInfo value for this ArrayOfVirtualAppLinkInfo.
     * 
     * @return virtualAppLinkInfo
     */
    public com.vmware.converter.VirtualAppLinkInfo[] getVirtualAppLinkInfo() {
        return virtualAppLinkInfo;
    }


    /**
     * Sets the virtualAppLinkInfo value for this ArrayOfVirtualAppLinkInfo.
     * 
     * @param virtualAppLinkInfo
     */
    public void setVirtualAppLinkInfo(com.vmware.converter.VirtualAppLinkInfo[] virtualAppLinkInfo) {
        this.virtualAppLinkInfo = virtualAppLinkInfo;
    }

    public com.vmware.converter.VirtualAppLinkInfo getVirtualAppLinkInfo(int i) {
        return this.virtualAppLinkInfo[i];
    }

    public void setVirtualAppLinkInfo(int i, com.vmware.converter.VirtualAppLinkInfo _value) {
        this.virtualAppLinkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualAppLinkInfo)) return false;
        ArrayOfVirtualAppLinkInfo other = (ArrayOfVirtualAppLinkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualAppLinkInfo==null && other.getVirtualAppLinkInfo()==null) || 
             (this.virtualAppLinkInfo!=null &&
              java.util.Arrays.equals(this.virtualAppLinkInfo, other.getVirtualAppLinkInfo())));
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
        if (getVirtualAppLinkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualAppLinkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualAppLinkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualAppLinkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualAppLinkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualAppLinkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualAppLinkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppLinkInfo"));
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
