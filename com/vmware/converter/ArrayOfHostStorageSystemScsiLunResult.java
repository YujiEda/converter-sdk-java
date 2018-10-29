/**
 * ArrayOfHostStorageSystemScsiLunResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostStorageSystemScsiLunResult  implements java.io.Serializable {
    private com.vmware.converter.HostStorageSystemScsiLunResult[] hostStorageSystemScsiLunResult;

    public ArrayOfHostStorageSystemScsiLunResult() {
    }

    public ArrayOfHostStorageSystemScsiLunResult(
           com.vmware.converter.HostStorageSystemScsiLunResult[] hostStorageSystemScsiLunResult) {
           this.hostStorageSystemScsiLunResult = hostStorageSystemScsiLunResult;
    }


    /**
     * Gets the hostStorageSystemScsiLunResult value for this ArrayOfHostStorageSystemScsiLunResult.
     * 
     * @return hostStorageSystemScsiLunResult
     */
    public com.vmware.converter.HostStorageSystemScsiLunResult[] getHostStorageSystemScsiLunResult() {
        return hostStorageSystemScsiLunResult;
    }


    /**
     * Sets the hostStorageSystemScsiLunResult value for this ArrayOfHostStorageSystemScsiLunResult.
     * 
     * @param hostStorageSystemScsiLunResult
     */
    public void setHostStorageSystemScsiLunResult(com.vmware.converter.HostStorageSystemScsiLunResult[] hostStorageSystemScsiLunResult) {
        this.hostStorageSystemScsiLunResult = hostStorageSystemScsiLunResult;
    }

    public com.vmware.converter.HostStorageSystemScsiLunResult getHostStorageSystemScsiLunResult(int i) {
        return this.hostStorageSystemScsiLunResult[i];
    }

    public void setHostStorageSystemScsiLunResult(int i, com.vmware.converter.HostStorageSystemScsiLunResult _value) {
        this.hostStorageSystemScsiLunResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostStorageSystemScsiLunResult)) return false;
        ArrayOfHostStorageSystemScsiLunResult other = (ArrayOfHostStorageSystemScsiLunResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostStorageSystemScsiLunResult==null && other.getHostStorageSystemScsiLunResult()==null) || 
             (this.hostStorageSystemScsiLunResult!=null &&
              java.util.Arrays.equals(this.hostStorageSystemScsiLunResult, other.getHostStorageSystemScsiLunResult())));
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
        if (getHostStorageSystemScsiLunResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostStorageSystemScsiLunResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostStorageSystemScsiLunResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostStorageSystemScsiLunResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostStorageSystemScsiLunResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostStorageSystemScsiLunResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostStorageSystemScsiLunResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageSystemScsiLunResult"));
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
