/**
 * ArrayOfHostDiskConfigurationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostDiskConfigurationResult  implements java.io.Serializable {
    private com.vmware.converter.HostDiskConfigurationResult[] hostDiskConfigurationResult;

    public ArrayOfHostDiskConfigurationResult() {
    }

    public ArrayOfHostDiskConfigurationResult(
           com.vmware.converter.HostDiskConfigurationResult[] hostDiskConfigurationResult) {
           this.hostDiskConfigurationResult = hostDiskConfigurationResult;
    }


    /**
     * Gets the hostDiskConfigurationResult value for this ArrayOfHostDiskConfigurationResult.
     * 
     * @return hostDiskConfigurationResult
     */
    public com.vmware.converter.HostDiskConfigurationResult[] getHostDiskConfigurationResult() {
        return hostDiskConfigurationResult;
    }


    /**
     * Sets the hostDiskConfigurationResult value for this ArrayOfHostDiskConfigurationResult.
     * 
     * @param hostDiskConfigurationResult
     */
    public void setHostDiskConfigurationResult(com.vmware.converter.HostDiskConfigurationResult[] hostDiskConfigurationResult) {
        this.hostDiskConfigurationResult = hostDiskConfigurationResult;
    }

    public com.vmware.converter.HostDiskConfigurationResult getHostDiskConfigurationResult(int i) {
        return this.hostDiskConfigurationResult[i];
    }

    public void setHostDiskConfigurationResult(int i, com.vmware.converter.HostDiskConfigurationResult _value) {
        this.hostDiskConfigurationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostDiskConfigurationResult)) return false;
        ArrayOfHostDiskConfigurationResult other = (ArrayOfHostDiskConfigurationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDiskConfigurationResult==null && other.getHostDiskConfigurationResult()==null) || 
             (this.hostDiskConfigurationResult!=null &&
              java.util.Arrays.equals(this.hostDiskConfigurationResult, other.getHostDiskConfigurationResult())));
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
        if (getHostDiskConfigurationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDiskConfigurationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDiskConfigurationResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostDiskConfigurationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostDiskConfigurationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDiskConfigurationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostDiskConfigurationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskConfigurationResult"));
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
