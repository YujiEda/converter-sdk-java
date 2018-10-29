/**
 * ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo  implements java.io.Serializable {
    private com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] dvsVmVnicNetworkResourcePoolRuntimeInfo;

    public ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo() {
    }

    public ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo(
           com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] dvsVmVnicNetworkResourcePoolRuntimeInfo) {
           this.dvsVmVnicNetworkResourcePoolRuntimeInfo = dvsVmVnicNetworkResourcePoolRuntimeInfo;
    }


    /**
     * Gets the dvsVmVnicNetworkResourcePoolRuntimeInfo value for this ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo.
     * 
     * @return dvsVmVnicNetworkResourcePoolRuntimeInfo
     */
    public com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] getDvsVmVnicNetworkResourcePoolRuntimeInfo() {
        return dvsVmVnicNetworkResourcePoolRuntimeInfo;
    }


    /**
     * Sets the dvsVmVnicNetworkResourcePoolRuntimeInfo value for this ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo.
     * 
     * @param dvsVmVnicNetworkResourcePoolRuntimeInfo
     */
    public void setDvsVmVnicNetworkResourcePoolRuntimeInfo(com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] dvsVmVnicNetworkResourcePoolRuntimeInfo) {
        this.dvsVmVnicNetworkResourcePoolRuntimeInfo = dvsVmVnicNetworkResourcePoolRuntimeInfo;
    }

    public com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo getDvsVmVnicNetworkResourcePoolRuntimeInfo(int i) {
        return this.dvsVmVnicNetworkResourcePoolRuntimeInfo[i];
    }

    public void setDvsVmVnicNetworkResourcePoolRuntimeInfo(int i, com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo _value) {
        this.dvsVmVnicNetworkResourcePoolRuntimeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo)) return false;
        ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo other = (ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsVmVnicNetworkResourcePoolRuntimeInfo==null && other.getDvsVmVnicNetworkResourcePoolRuntimeInfo()==null) || 
             (this.dvsVmVnicNetworkResourcePoolRuntimeInfo!=null &&
              java.util.Arrays.equals(this.dvsVmVnicNetworkResourcePoolRuntimeInfo, other.getDvsVmVnicNetworkResourcePoolRuntimeInfo())));
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
        if (getDvsVmVnicNetworkResourcePoolRuntimeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsVmVnicNetworkResourcePoolRuntimeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsVmVnicNetworkResourcePoolRuntimeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsVmVnicNetworkResourcePoolRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsVmVnicNetworkResourcePoolRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVmVnicNetworkResourcePoolRuntimeInfo"));
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
