/**
 * ArrayOfDistributedVirtualPortgroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDistributedVirtualPortgroupInfo  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroupInfo;

    public ArrayOfDistributedVirtualPortgroupInfo() {
    }

    public ArrayOfDistributedVirtualPortgroupInfo(
           com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroupInfo) {
           this.distributedVirtualPortgroupInfo = distributedVirtualPortgroupInfo;
    }


    /**
     * Gets the distributedVirtualPortgroupInfo value for this ArrayOfDistributedVirtualPortgroupInfo.
     * 
     * @return distributedVirtualPortgroupInfo
     */
    public com.vmware.converter.DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroupInfo() {
        return distributedVirtualPortgroupInfo;
    }


    /**
     * Sets the distributedVirtualPortgroupInfo value for this ArrayOfDistributedVirtualPortgroupInfo.
     * 
     * @param distributedVirtualPortgroupInfo
     */
    public void setDistributedVirtualPortgroupInfo(com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroupInfo) {
        this.distributedVirtualPortgroupInfo = distributedVirtualPortgroupInfo;
    }

    public com.vmware.converter.DistributedVirtualPortgroupInfo getDistributedVirtualPortgroupInfo(int i) {
        return this.distributedVirtualPortgroupInfo[i];
    }

    public void setDistributedVirtualPortgroupInfo(int i, com.vmware.converter.DistributedVirtualPortgroupInfo _value) {
        this.distributedVirtualPortgroupInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualPortgroupInfo)) return false;
        ArrayOfDistributedVirtualPortgroupInfo other = (ArrayOfDistributedVirtualPortgroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualPortgroupInfo==null && other.getDistributedVirtualPortgroupInfo()==null) || 
             (this.distributedVirtualPortgroupInfo!=null &&
              java.util.Arrays.equals(this.distributedVirtualPortgroupInfo, other.getDistributedVirtualPortgroupInfo())));
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
        if (getDistributedVirtualPortgroupInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPortgroupInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPortgroupInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualPortgroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualPortgroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPortgroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPortgroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPortgroupInfo"));
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
