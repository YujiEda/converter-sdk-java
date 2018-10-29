/**
 * ArrayOfHostOpaqueNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostOpaqueNetworkInfo  implements java.io.Serializable {
    private com.vmware.converter.HostOpaqueNetworkInfo[] hostOpaqueNetworkInfo;

    public ArrayOfHostOpaqueNetworkInfo() {
    }

    public ArrayOfHostOpaqueNetworkInfo(
           com.vmware.converter.HostOpaqueNetworkInfo[] hostOpaqueNetworkInfo) {
           this.hostOpaqueNetworkInfo = hostOpaqueNetworkInfo;
    }


    /**
     * Gets the hostOpaqueNetworkInfo value for this ArrayOfHostOpaqueNetworkInfo.
     * 
     * @return hostOpaqueNetworkInfo
     */
    public com.vmware.converter.HostOpaqueNetworkInfo[] getHostOpaqueNetworkInfo() {
        return hostOpaqueNetworkInfo;
    }


    /**
     * Sets the hostOpaqueNetworkInfo value for this ArrayOfHostOpaqueNetworkInfo.
     * 
     * @param hostOpaqueNetworkInfo
     */
    public void setHostOpaqueNetworkInfo(com.vmware.converter.HostOpaqueNetworkInfo[] hostOpaqueNetworkInfo) {
        this.hostOpaqueNetworkInfo = hostOpaqueNetworkInfo;
    }

    public com.vmware.converter.HostOpaqueNetworkInfo getHostOpaqueNetworkInfo(int i) {
        return this.hostOpaqueNetworkInfo[i];
    }

    public void setHostOpaqueNetworkInfo(int i, com.vmware.converter.HostOpaqueNetworkInfo _value) {
        this.hostOpaqueNetworkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostOpaqueNetworkInfo)) return false;
        ArrayOfHostOpaqueNetworkInfo other = (ArrayOfHostOpaqueNetworkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostOpaqueNetworkInfo==null && other.getHostOpaqueNetworkInfo()==null) || 
             (this.hostOpaqueNetworkInfo!=null &&
              java.util.Arrays.equals(this.hostOpaqueNetworkInfo, other.getHostOpaqueNetworkInfo())));
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
        if (getHostOpaqueNetworkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostOpaqueNetworkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostOpaqueNetworkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostOpaqueNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostOpaqueNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostOpaqueNetworkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueNetworkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueNetworkInfo"));
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
