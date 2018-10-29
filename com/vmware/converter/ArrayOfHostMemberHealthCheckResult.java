/**
 * ArrayOfHostMemberHealthCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostMemberHealthCheckResult  implements java.io.Serializable {
    private com.vmware.converter.HostMemberHealthCheckResult[] hostMemberHealthCheckResult;

    public ArrayOfHostMemberHealthCheckResult() {
    }

    public ArrayOfHostMemberHealthCheckResult(
           com.vmware.converter.HostMemberHealthCheckResult[] hostMemberHealthCheckResult) {
           this.hostMemberHealthCheckResult = hostMemberHealthCheckResult;
    }


    /**
     * Gets the hostMemberHealthCheckResult value for this ArrayOfHostMemberHealthCheckResult.
     * 
     * @return hostMemberHealthCheckResult
     */
    public com.vmware.converter.HostMemberHealthCheckResult[] getHostMemberHealthCheckResult() {
        return hostMemberHealthCheckResult;
    }


    /**
     * Sets the hostMemberHealthCheckResult value for this ArrayOfHostMemberHealthCheckResult.
     * 
     * @param hostMemberHealthCheckResult
     */
    public void setHostMemberHealthCheckResult(com.vmware.converter.HostMemberHealthCheckResult[] hostMemberHealthCheckResult) {
        this.hostMemberHealthCheckResult = hostMemberHealthCheckResult;
    }

    public com.vmware.converter.HostMemberHealthCheckResult getHostMemberHealthCheckResult(int i) {
        return this.hostMemberHealthCheckResult[i];
    }

    public void setHostMemberHealthCheckResult(int i, com.vmware.converter.HostMemberHealthCheckResult _value) {
        this.hostMemberHealthCheckResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostMemberHealthCheckResult)) return false;
        ArrayOfHostMemberHealthCheckResult other = (ArrayOfHostMemberHealthCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostMemberHealthCheckResult==null && other.getHostMemberHealthCheckResult()==null) || 
             (this.hostMemberHealthCheckResult!=null &&
              java.util.Arrays.equals(this.hostMemberHealthCheckResult, other.getHostMemberHealthCheckResult())));
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
        if (getHostMemberHealthCheckResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMemberHealthCheckResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMemberHealthCheckResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostMemberHealthCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostMemberHealthCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMemberHealthCheckResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostMemberHealthCheckResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberHealthCheckResult"));
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
