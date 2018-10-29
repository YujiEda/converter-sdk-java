/**
 * ArrayOfHostLowLevelProvisioningManagerFileReserveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostLowLevelProvisioningManagerFileReserveResult  implements java.io.Serializable {
    private com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult[] hostLowLevelProvisioningManagerFileReserveResult;

    public ArrayOfHostLowLevelProvisioningManagerFileReserveResult() {
    }

    public ArrayOfHostLowLevelProvisioningManagerFileReserveResult(
           com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult[] hostLowLevelProvisioningManagerFileReserveResult) {
           this.hostLowLevelProvisioningManagerFileReserveResult = hostLowLevelProvisioningManagerFileReserveResult;
    }


    /**
     * Gets the hostLowLevelProvisioningManagerFileReserveResult value for this ArrayOfHostLowLevelProvisioningManagerFileReserveResult.
     * 
     * @return hostLowLevelProvisioningManagerFileReserveResult
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult[] getHostLowLevelProvisioningManagerFileReserveResult() {
        return hostLowLevelProvisioningManagerFileReserveResult;
    }


    /**
     * Sets the hostLowLevelProvisioningManagerFileReserveResult value for this ArrayOfHostLowLevelProvisioningManagerFileReserveResult.
     * 
     * @param hostLowLevelProvisioningManagerFileReserveResult
     */
    public void setHostLowLevelProvisioningManagerFileReserveResult(com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult[] hostLowLevelProvisioningManagerFileReserveResult) {
        this.hostLowLevelProvisioningManagerFileReserveResult = hostLowLevelProvisioningManagerFileReserveResult;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult getHostLowLevelProvisioningManagerFileReserveResult(int i) {
        return this.hostLowLevelProvisioningManagerFileReserveResult[i];
    }

    public void setHostLowLevelProvisioningManagerFileReserveResult(int i, com.vmware.converter.HostLowLevelProvisioningManagerFileReserveResult _value) {
        this.hostLowLevelProvisioningManagerFileReserveResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostLowLevelProvisioningManagerFileReserveResult)) return false;
        ArrayOfHostLowLevelProvisioningManagerFileReserveResult other = (ArrayOfHostLowLevelProvisioningManagerFileReserveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostLowLevelProvisioningManagerFileReserveResult==null && other.getHostLowLevelProvisioningManagerFileReserveResult()==null) || 
             (this.hostLowLevelProvisioningManagerFileReserveResult!=null &&
              java.util.Arrays.equals(this.hostLowLevelProvisioningManagerFileReserveResult, other.getHostLowLevelProvisioningManagerFileReserveResult())));
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
        if (getHostLowLevelProvisioningManagerFileReserveResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLowLevelProvisioningManagerFileReserveResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLowLevelProvisioningManagerFileReserveResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostLowLevelProvisioningManagerFileReserveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostLowLevelProvisioningManagerFileReserveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLowLevelProvisioningManagerFileReserveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileReserveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileReserveResult"));
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
