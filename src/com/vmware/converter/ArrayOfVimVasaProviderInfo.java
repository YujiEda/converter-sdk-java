/**
 * ArrayOfVimVasaProviderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVimVasaProviderInfo  implements java.io.Serializable {
    private com.vmware.converter.VimVasaProviderInfo[] vimVasaProviderInfo;

    public ArrayOfVimVasaProviderInfo() {
    }

    public ArrayOfVimVasaProviderInfo(
           com.vmware.converter.VimVasaProviderInfo[] vimVasaProviderInfo) {
           this.vimVasaProviderInfo = vimVasaProviderInfo;
    }


    /**
     * Gets the vimVasaProviderInfo value for this ArrayOfVimVasaProviderInfo.
     * 
     * @return vimVasaProviderInfo
     */
    public com.vmware.converter.VimVasaProviderInfo[] getVimVasaProviderInfo() {
        return vimVasaProviderInfo;
    }


    /**
     * Sets the vimVasaProviderInfo value for this ArrayOfVimVasaProviderInfo.
     * 
     * @param vimVasaProviderInfo
     */
    public void setVimVasaProviderInfo(com.vmware.converter.VimVasaProviderInfo[] vimVasaProviderInfo) {
        this.vimVasaProviderInfo = vimVasaProviderInfo;
    }

    public com.vmware.converter.VimVasaProviderInfo getVimVasaProviderInfo(int i) {
        return this.vimVasaProviderInfo[i];
    }

    public void setVimVasaProviderInfo(int i, com.vmware.converter.VimVasaProviderInfo _value) {
        this.vimVasaProviderInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVimVasaProviderInfo)) return false;
        ArrayOfVimVasaProviderInfo other = (ArrayOfVimVasaProviderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vimVasaProviderInfo==null && other.getVimVasaProviderInfo()==null) || 
             (this.vimVasaProviderInfo!=null &&
              java.util.Arrays.equals(this.vimVasaProviderInfo, other.getVimVasaProviderInfo())));
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
        if (getVimVasaProviderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVimVasaProviderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVimVasaProviderInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVimVasaProviderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVimVasaProviderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimVasaProviderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
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
