/**
 * ArrayOfHostStorageSystemVmfsVolumeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostStorageSystemVmfsVolumeResult  implements java.io.Serializable {
    private com.vmware.converter.HostStorageSystemVmfsVolumeResult[] hostStorageSystemVmfsVolumeResult;

    public ArrayOfHostStorageSystemVmfsVolumeResult() {
    }

    public ArrayOfHostStorageSystemVmfsVolumeResult(
           com.vmware.converter.HostStorageSystemVmfsVolumeResult[] hostStorageSystemVmfsVolumeResult) {
           this.hostStorageSystemVmfsVolumeResult = hostStorageSystemVmfsVolumeResult;
    }


    /**
     * Gets the hostStorageSystemVmfsVolumeResult value for this ArrayOfHostStorageSystemVmfsVolumeResult.
     * 
     * @return hostStorageSystemVmfsVolumeResult
     */
    public com.vmware.converter.HostStorageSystemVmfsVolumeResult[] getHostStorageSystemVmfsVolumeResult() {
        return hostStorageSystemVmfsVolumeResult;
    }


    /**
     * Sets the hostStorageSystemVmfsVolumeResult value for this ArrayOfHostStorageSystemVmfsVolumeResult.
     * 
     * @param hostStorageSystemVmfsVolumeResult
     */
    public void setHostStorageSystemVmfsVolumeResult(com.vmware.converter.HostStorageSystemVmfsVolumeResult[] hostStorageSystemVmfsVolumeResult) {
        this.hostStorageSystemVmfsVolumeResult = hostStorageSystemVmfsVolumeResult;
    }

    public com.vmware.converter.HostStorageSystemVmfsVolumeResult getHostStorageSystemVmfsVolumeResult(int i) {
        return this.hostStorageSystemVmfsVolumeResult[i];
    }

    public void setHostStorageSystemVmfsVolumeResult(int i, com.vmware.converter.HostStorageSystemVmfsVolumeResult _value) {
        this.hostStorageSystemVmfsVolumeResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostStorageSystemVmfsVolumeResult)) return false;
        ArrayOfHostStorageSystemVmfsVolumeResult other = (ArrayOfHostStorageSystemVmfsVolumeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostStorageSystemVmfsVolumeResult==null && other.getHostStorageSystemVmfsVolumeResult()==null) || 
             (this.hostStorageSystemVmfsVolumeResult!=null &&
              java.util.Arrays.equals(this.hostStorageSystemVmfsVolumeResult, other.getHostStorageSystemVmfsVolumeResult())));
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
        if (getHostStorageSystemVmfsVolumeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostStorageSystemVmfsVolumeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostStorageSystemVmfsVolumeResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostStorageSystemVmfsVolumeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostStorageSystemVmfsVolumeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostStorageSystemVmfsVolumeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostStorageSystemVmfsVolumeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageSystemVmfsVolumeResult"));
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
