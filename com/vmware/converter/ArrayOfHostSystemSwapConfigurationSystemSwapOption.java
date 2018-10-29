/**
 * ArrayOfHostSystemSwapConfigurationSystemSwapOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostSystemSwapConfigurationSystemSwapOption  implements java.io.Serializable {
    private com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] hostSystemSwapConfigurationSystemSwapOption;

    public ArrayOfHostSystemSwapConfigurationSystemSwapOption() {
    }

    public ArrayOfHostSystemSwapConfigurationSystemSwapOption(
           com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] hostSystemSwapConfigurationSystemSwapOption) {
           this.hostSystemSwapConfigurationSystemSwapOption = hostSystemSwapConfigurationSystemSwapOption;
    }


    /**
     * Gets the hostSystemSwapConfigurationSystemSwapOption value for this ArrayOfHostSystemSwapConfigurationSystemSwapOption.
     * 
     * @return hostSystemSwapConfigurationSystemSwapOption
     */
    public com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] getHostSystemSwapConfigurationSystemSwapOption() {
        return hostSystemSwapConfigurationSystemSwapOption;
    }


    /**
     * Sets the hostSystemSwapConfigurationSystemSwapOption value for this ArrayOfHostSystemSwapConfigurationSystemSwapOption.
     * 
     * @param hostSystemSwapConfigurationSystemSwapOption
     */
    public void setHostSystemSwapConfigurationSystemSwapOption(com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] hostSystemSwapConfigurationSystemSwapOption) {
        this.hostSystemSwapConfigurationSystemSwapOption = hostSystemSwapConfigurationSystemSwapOption;
    }

    public com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption getHostSystemSwapConfigurationSystemSwapOption(int i) {
        return this.hostSystemSwapConfigurationSystemSwapOption[i];
    }

    public void setHostSystemSwapConfigurationSystemSwapOption(int i, com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption _value) {
        this.hostSystemSwapConfigurationSystemSwapOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostSystemSwapConfigurationSystemSwapOption)) return false;
        ArrayOfHostSystemSwapConfigurationSystemSwapOption other = (ArrayOfHostSystemSwapConfigurationSystemSwapOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostSystemSwapConfigurationSystemSwapOption==null && other.getHostSystemSwapConfigurationSystemSwapOption()==null) || 
             (this.hostSystemSwapConfigurationSystemSwapOption!=null &&
              java.util.Arrays.equals(this.hostSystemSwapConfigurationSystemSwapOption, other.getHostSystemSwapConfigurationSystemSwapOption())));
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
        if (getHostSystemSwapConfigurationSystemSwapOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostSystemSwapConfigurationSystemSwapOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostSystemSwapConfigurationSystemSwapOption(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostSystemSwapConfigurationSystemSwapOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostSystemSwapConfigurationSystemSwapOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystemSwapConfigurationSystemSwapOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostSystemSwapConfigurationSystemSwapOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemSwapConfigurationSystemSwapOption"));
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
