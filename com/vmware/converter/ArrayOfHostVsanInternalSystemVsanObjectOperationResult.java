/**
 * ArrayOfHostVsanInternalSystemVsanObjectOperationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostVsanInternalSystemVsanObjectOperationResult  implements java.io.Serializable {
    private com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult[] hostVsanInternalSystemVsanObjectOperationResult;

    public ArrayOfHostVsanInternalSystemVsanObjectOperationResult() {
    }

    public ArrayOfHostVsanInternalSystemVsanObjectOperationResult(
           com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult[] hostVsanInternalSystemVsanObjectOperationResult) {
           this.hostVsanInternalSystemVsanObjectOperationResult = hostVsanInternalSystemVsanObjectOperationResult;
    }


    /**
     * Gets the hostVsanInternalSystemVsanObjectOperationResult value for this ArrayOfHostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @return hostVsanInternalSystemVsanObjectOperationResult
     */
    public com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult[] getHostVsanInternalSystemVsanObjectOperationResult() {
        return hostVsanInternalSystemVsanObjectOperationResult;
    }


    /**
     * Sets the hostVsanInternalSystemVsanObjectOperationResult value for this ArrayOfHostVsanInternalSystemVsanObjectOperationResult.
     * 
     * @param hostVsanInternalSystemVsanObjectOperationResult
     */
    public void setHostVsanInternalSystemVsanObjectOperationResult(com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult[] hostVsanInternalSystemVsanObjectOperationResult) {
        this.hostVsanInternalSystemVsanObjectOperationResult = hostVsanInternalSystemVsanObjectOperationResult;
    }

    public com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult getHostVsanInternalSystemVsanObjectOperationResult(int i) {
        return this.hostVsanInternalSystemVsanObjectOperationResult[i];
    }

    public void setHostVsanInternalSystemVsanObjectOperationResult(int i, com.vmware.converter.HostVsanInternalSystemVsanObjectOperationResult _value) {
        this.hostVsanInternalSystemVsanObjectOperationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVsanInternalSystemVsanObjectOperationResult)) return false;
        ArrayOfHostVsanInternalSystemVsanObjectOperationResult other = (ArrayOfHostVsanInternalSystemVsanObjectOperationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVsanInternalSystemVsanObjectOperationResult==null && other.getHostVsanInternalSystemVsanObjectOperationResult()==null) || 
             (this.hostVsanInternalSystemVsanObjectOperationResult!=null &&
              java.util.Arrays.equals(this.hostVsanInternalSystemVsanObjectOperationResult, other.getHostVsanInternalSystemVsanObjectOperationResult())));
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
        if (getHostVsanInternalSystemVsanObjectOperationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVsanInternalSystemVsanObjectOperationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVsanInternalSystemVsanObjectOperationResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVsanInternalSystemVsanObjectOperationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVsanInternalSystemVsanObjectOperationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVsanInternalSystemVsanObjectOperationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVsanInternalSystemVsanObjectOperationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVsanInternalSystemVsanObjectOperationResult"));
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
