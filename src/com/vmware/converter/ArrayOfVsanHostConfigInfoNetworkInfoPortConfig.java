/**
 * ArrayOfVsanHostConfigInfoNetworkInfoPortConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostConfigInfoNetworkInfoPortConfig  implements java.io.Serializable {
    private com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig[] vsanHostConfigInfoNetworkInfoPortConfig;

    public ArrayOfVsanHostConfigInfoNetworkInfoPortConfig() {
    }

    public ArrayOfVsanHostConfigInfoNetworkInfoPortConfig(
           com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig[] vsanHostConfigInfoNetworkInfoPortConfig) {
           this.vsanHostConfigInfoNetworkInfoPortConfig = vsanHostConfigInfoNetworkInfoPortConfig;
    }


    /**
     * Gets the vsanHostConfigInfoNetworkInfoPortConfig value for this ArrayOfVsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @return vsanHostConfigInfoNetworkInfoPortConfig
     */
    public com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig[] getVsanHostConfigInfoNetworkInfoPortConfig() {
        return vsanHostConfigInfoNetworkInfoPortConfig;
    }


    /**
     * Sets the vsanHostConfigInfoNetworkInfoPortConfig value for this ArrayOfVsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @param vsanHostConfigInfoNetworkInfoPortConfig
     */
    public void setVsanHostConfigInfoNetworkInfoPortConfig(com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig[] vsanHostConfigInfoNetworkInfoPortConfig) {
        this.vsanHostConfigInfoNetworkInfoPortConfig = vsanHostConfigInfoNetworkInfoPortConfig;
    }

    public com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig getVsanHostConfigInfoNetworkInfoPortConfig(int i) {
        return this.vsanHostConfigInfoNetworkInfoPortConfig[i];
    }

    public void setVsanHostConfigInfoNetworkInfoPortConfig(int i, com.vmware.converter.VsanHostConfigInfoNetworkInfoPortConfig _value) {
        this.vsanHostConfigInfoNetworkInfoPortConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostConfigInfoNetworkInfoPortConfig)) return false;
        ArrayOfVsanHostConfigInfoNetworkInfoPortConfig other = (ArrayOfVsanHostConfigInfoNetworkInfoPortConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostConfigInfoNetworkInfoPortConfig==null && other.getVsanHostConfigInfoNetworkInfoPortConfig()==null) || 
             (this.vsanHostConfigInfoNetworkInfoPortConfig!=null &&
              java.util.Arrays.equals(this.vsanHostConfigInfoNetworkInfoPortConfig, other.getVsanHostConfigInfoNetworkInfoPortConfig())));
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
        if (getVsanHostConfigInfoNetworkInfoPortConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostConfigInfoNetworkInfoPortConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostConfigInfoNetworkInfoPortConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostConfigInfoNetworkInfoPortConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostConfigInfoNetworkInfoPortConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostConfigInfoNetworkInfoPortConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoNetworkInfoPortConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoNetworkInfoPortConfig"));
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
