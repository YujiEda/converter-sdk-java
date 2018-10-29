/**
 * ArrayOfHostPnicNetworkResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostPnicNetworkResourceInfo  implements java.io.Serializable {
    private com.vmware.converter.HostPnicNetworkResourceInfo[] hostPnicNetworkResourceInfo;

    public ArrayOfHostPnicNetworkResourceInfo() {
    }

    public ArrayOfHostPnicNetworkResourceInfo(
           com.vmware.converter.HostPnicNetworkResourceInfo[] hostPnicNetworkResourceInfo) {
           this.hostPnicNetworkResourceInfo = hostPnicNetworkResourceInfo;
    }


    /**
     * Gets the hostPnicNetworkResourceInfo value for this ArrayOfHostPnicNetworkResourceInfo.
     * 
     * @return hostPnicNetworkResourceInfo
     */
    public com.vmware.converter.HostPnicNetworkResourceInfo[] getHostPnicNetworkResourceInfo() {
        return hostPnicNetworkResourceInfo;
    }


    /**
     * Sets the hostPnicNetworkResourceInfo value for this ArrayOfHostPnicNetworkResourceInfo.
     * 
     * @param hostPnicNetworkResourceInfo
     */
    public void setHostPnicNetworkResourceInfo(com.vmware.converter.HostPnicNetworkResourceInfo[] hostPnicNetworkResourceInfo) {
        this.hostPnicNetworkResourceInfo = hostPnicNetworkResourceInfo;
    }

    public com.vmware.converter.HostPnicNetworkResourceInfo getHostPnicNetworkResourceInfo(int i) {
        return this.hostPnicNetworkResourceInfo[i];
    }

    public void setHostPnicNetworkResourceInfo(int i, com.vmware.converter.HostPnicNetworkResourceInfo _value) {
        this.hostPnicNetworkResourceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPnicNetworkResourceInfo)) return false;
        ArrayOfHostPnicNetworkResourceInfo other = (ArrayOfHostPnicNetworkResourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPnicNetworkResourceInfo==null && other.getHostPnicNetworkResourceInfo()==null) || 
             (this.hostPnicNetworkResourceInfo!=null &&
              java.util.Arrays.equals(this.hostPnicNetworkResourceInfo, other.getHostPnicNetworkResourceInfo())));
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
        if (getHostPnicNetworkResourceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPnicNetworkResourceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPnicNetworkResourceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPnicNetworkResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPnicNetworkResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPnicNetworkResourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPnicNetworkResourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPnicNetworkResourceInfo"));
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
