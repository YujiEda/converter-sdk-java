/**
 * ArrayOfHostLowLevelProvisioningManagerFileDeleteResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostLowLevelProvisioningManagerFileDeleteResult  implements java.io.Serializable {
    private com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult[] hostLowLevelProvisioningManagerFileDeleteResult;

    public ArrayOfHostLowLevelProvisioningManagerFileDeleteResult() {
    }

    public ArrayOfHostLowLevelProvisioningManagerFileDeleteResult(
           com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult[] hostLowLevelProvisioningManagerFileDeleteResult) {
           this.hostLowLevelProvisioningManagerFileDeleteResult = hostLowLevelProvisioningManagerFileDeleteResult;
    }


    /**
     * Gets the hostLowLevelProvisioningManagerFileDeleteResult value for this ArrayOfHostLowLevelProvisioningManagerFileDeleteResult.
     * 
     * @return hostLowLevelProvisioningManagerFileDeleteResult
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult[] getHostLowLevelProvisioningManagerFileDeleteResult() {
        return hostLowLevelProvisioningManagerFileDeleteResult;
    }


    /**
     * Sets the hostLowLevelProvisioningManagerFileDeleteResult value for this ArrayOfHostLowLevelProvisioningManagerFileDeleteResult.
     * 
     * @param hostLowLevelProvisioningManagerFileDeleteResult
     */
    public void setHostLowLevelProvisioningManagerFileDeleteResult(com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult[] hostLowLevelProvisioningManagerFileDeleteResult) {
        this.hostLowLevelProvisioningManagerFileDeleteResult = hostLowLevelProvisioningManagerFileDeleteResult;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult getHostLowLevelProvisioningManagerFileDeleteResult(int i) {
        return this.hostLowLevelProvisioningManagerFileDeleteResult[i];
    }

    public void setHostLowLevelProvisioningManagerFileDeleteResult(int i, com.vmware.converter.HostLowLevelProvisioningManagerFileDeleteResult _value) {
        this.hostLowLevelProvisioningManagerFileDeleteResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostLowLevelProvisioningManagerFileDeleteResult)) return false;
        ArrayOfHostLowLevelProvisioningManagerFileDeleteResult other = (ArrayOfHostLowLevelProvisioningManagerFileDeleteResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostLowLevelProvisioningManagerFileDeleteResult==null && other.getHostLowLevelProvisioningManagerFileDeleteResult()==null) || 
             (this.hostLowLevelProvisioningManagerFileDeleteResult!=null &&
              java.util.Arrays.equals(this.hostLowLevelProvisioningManagerFileDeleteResult, other.getHostLowLevelProvisioningManagerFileDeleteResult())));
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
        if (getHostLowLevelProvisioningManagerFileDeleteResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLowLevelProvisioningManagerFileDeleteResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLowLevelProvisioningManagerFileDeleteResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostLowLevelProvisioningManagerFileDeleteResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostLowLevelProvisioningManagerFileDeleteResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLowLevelProvisioningManagerFileDeleteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileDeleteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileDeleteResult"));
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
