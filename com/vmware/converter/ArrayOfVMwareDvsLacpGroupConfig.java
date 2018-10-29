/**
 * ArrayOfVMwareDvsLacpGroupConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVMwareDvsLacpGroupConfig  implements java.io.Serializable {
    private com.vmware.converter.VMwareDvsLacpGroupConfig[] VMwareDvsLacpGroupConfig;

    public ArrayOfVMwareDvsLacpGroupConfig() {
    }

    public ArrayOfVMwareDvsLacpGroupConfig(
           com.vmware.converter.VMwareDvsLacpGroupConfig[] VMwareDvsLacpGroupConfig) {
           this.VMwareDvsLacpGroupConfig = VMwareDvsLacpGroupConfig;
    }


    /**
     * Gets the VMwareDvsLacpGroupConfig value for this ArrayOfVMwareDvsLacpGroupConfig.
     * 
     * @return VMwareDvsLacpGroupConfig
     */
    public com.vmware.converter.VMwareDvsLacpGroupConfig[] getVMwareDvsLacpGroupConfig() {
        return VMwareDvsLacpGroupConfig;
    }


    /**
     * Sets the VMwareDvsLacpGroupConfig value for this ArrayOfVMwareDvsLacpGroupConfig.
     * 
     * @param VMwareDvsLacpGroupConfig
     */
    public void setVMwareDvsLacpGroupConfig(com.vmware.converter.VMwareDvsLacpGroupConfig[] VMwareDvsLacpGroupConfig) {
        this.VMwareDvsLacpGroupConfig = VMwareDvsLacpGroupConfig;
    }

    public com.vmware.converter.VMwareDvsLacpGroupConfig getVMwareDvsLacpGroupConfig(int i) {
        return this.VMwareDvsLacpGroupConfig[i];
    }

    public void setVMwareDvsLacpGroupConfig(int i, com.vmware.converter.VMwareDvsLacpGroupConfig _value) {
        this.VMwareDvsLacpGroupConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareDvsLacpGroupConfig)) return false;
        ArrayOfVMwareDvsLacpGroupConfig other = (ArrayOfVMwareDvsLacpGroupConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareDvsLacpGroupConfig==null && other.getVMwareDvsLacpGroupConfig()==null) || 
             (this.VMwareDvsLacpGroupConfig!=null &&
              java.util.Arrays.equals(this.VMwareDvsLacpGroupConfig, other.getVMwareDvsLacpGroupConfig())));
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
        if (getVMwareDvsLacpGroupConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareDvsLacpGroupConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareDvsLacpGroupConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareDvsLacpGroupConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareDvsLacpGroupConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareDvsLacpGroupConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupConfig"));
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
