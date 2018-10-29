/**
 * VimVasaProviderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VimVasaProviderInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VimVasaProvider provider;

    private com.vmware.converter.VimVasaProviderStatePerArray[] arrayState;

    public VimVasaProviderInfo() {
    }

    public VimVasaProviderInfo(
           com.vmware.converter.VimVasaProvider provider,
           com.vmware.converter.VimVasaProviderStatePerArray[] arrayState) {
        this.provider = provider;
        this.arrayState = arrayState;
    }


    /**
     * Gets the provider value for this VimVasaProviderInfo.
     * 
     * @return provider
     */
    public com.vmware.converter.VimVasaProvider getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this VimVasaProviderInfo.
     * 
     * @param provider
     */
    public void setProvider(com.vmware.converter.VimVasaProvider provider) {
        this.provider = provider;
    }


    /**
     * Gets the arrayState value for this VimVasaProviderInfo.
     * 
     * @return arrayState
     */
    public com.vmware.converter.VimVasaProviderStatePerArray[] getArrayState() {
        return arrayState;
    }


    /**
     * Sets the arrayState value for this VimVasaProviderInfo.
     * 
     * @param arrayState
     */
    public void setArrayState(com.vmware.converter.VimVasaProviderStatePerArray[] arrayState) {
        this.arrayState = arrayState;
    }

    public com.vmware.converter.VimVasaProviderStatePerArray getArrayState(int i) {
        return this.arrayState[i];
    }

    public void setArrayState(int i, com.vmware.converter.VimVasaProviderStatePerArray _value) {
        this.arrayState[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VimVasaProviderInfo)) return false;
        VimVasaProviderInfo other = (VimVasaProviderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider()))) &&
            ((this.arrayState==null && other.getArrayState()==null) || 
             (this.arrayState!=null &&
              java.util.Arrays.equals(this.arrayState, other.getArrayState())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        if (getArrayState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayState(), i);
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
        new org.apache.axis.description.TypeDesc(VimVasaProviderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProvider"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "arrayState"));
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
