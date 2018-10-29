/**
 * ArrayOfVimVasaProviderStatePerArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVimVasaProviderStatePerArray  implements java.io.Serializable {
    private com.vmware.converter.VimVasaProviderStatePerArray[] vimVasaProviderStatePerArray;

    public ArrayOfVimVasaProviderStatePerArray() {
    }

    public ArrayOfVimVasaProviderStatePerArray(
           com.vmware.converter.VimVasaProviderStatePerArray[] vimVasaProviderStatePerArray) {
           this.vimVasaProviderStatePerArray = vimVasaProviderStatePerArray;
    }


    /**
     * Gets the vimVasaProviderStatePerArray value for this ArrayOfVimVasaProviderStatePerArray.
     * 
     * @return vimVasaProviderStatePerArray
     */
    public com.vmware.converter.VimVasaProviderStatePerArray[] getVimVasaProviderStatePerArray() {
        return vimVasaProviderStatePerArray;
    }


    /**
     * Sets the vimVasaProviderStatePerArray value for this ArrayOfVimVasaProviderStatePerArray.
     * 
     * @param vimVasaProviderStatePerArray
     */
    public void setVimVasaProviderStatePerArray(com.vmware.converter.VimVasaProviderStatePerArray[] vimVasaProviderStatePerArray) {
        this.vimVasaProviderStatePerArray = vimVasaProviderStatePerArray;
    }

    public com.vmware.converter.VimVasaProviderStatePerArray getVimVasaProviderStatePerArray(int i) {
        return this.vimVasaProviderStatePerArray[i];
    }

    public void setVimVasaProviderStatePerArray(int i, com.vmware.converter.VimVasaProviderStatePerArray _value) {
        this.vimVasaProviderStatePerArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVimVasaProviderStatePerArray)) return false;
        ArrayOfVimVasaProviderStatePerArray other = (ArrayOfVimVasaProviderStatePerArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vimVasaProviderStatePerArray==null && other.getVimVasaProviderStatePerArray()==null) || 
             (this.vimVasaProviderStatePerArray!=null &&
              java.util.Arrays.equals(this.vimVasaProviderStatePerArray, other.getVimVasaProviderStatePerArray())));
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
        if (getVimVasaProviderStatePerArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVimVasaProviderStatePerArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVimVasaProviderStatePerArray(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVimVasaProviderStatePerArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVimVasaProviderStatePerArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimVasaProviderStatePerArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderStatePerArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderStatePerArray"));
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
