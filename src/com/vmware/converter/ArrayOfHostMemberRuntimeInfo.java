/**
 * ArrayOfHostMemberRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostMemberRuntimeInfo  implements java.io.Serializable {
    private com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntimeInfo;

    public ArrayOfHostMemberRuntimeInfo() {
    }

    public ArrayOfHostMemberRuntimeInfo(
           com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntimeInfo) {
           this.hostMemberRuntimeInfo = hostMemberRuntimeInfo;
    }


    /**
     * Gets the hostMemberRuntimeInfo value for this ArrayOfHostMemberRuntimeInfo.
     * 
     * @return hostMemberRuntimeInfo
     */
    public com.vmware.converter.HostMemberRuntimeInfo[] getHostMemberRuntimeInfo() {
        return hostMemberRuntimeInfo;
    }


    /**
     * Sets the hostMemberRuntimeInfo value for this ArrayOfHostMemberRuntimeInfo.
     * 
     * @param hostMemberRuntimeInfo
     */
    public void setHostMemberRuntimeInfo(com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntimeInfo) {
        this.hostMemberRuntimeInfo = hostMemberRuntimeInfo;
    }

    public com.vmware.converter.HostMemberRuntimeInfo getHostMemberRuntimeInfo(int i) {
        return this.hostMemberRuntimeInfo[i];
    }

    public void setHostMemberRuntimeInfo(int i, com.vmware.converter.HostMemberRuntimeInfo _value) {
        this.hostMemberRuntimeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostMemberRuntimeInfo)) return false;
        ArrayOfHostMemberRuntimeInfo other = (ArrayOfHostMemberRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostMemberRuntimeInfo==null && other.getHostMemberRuntimeInfo()==null) || 
             (this.hostMemberRuntimeInfo!=null &&
              java.util.Arrays.equals(this.hostMemberRuntimeInfo, other.getHostMemberRuntimeInfo())));
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
        if (getHostMemberRuntimeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMemberRuntimeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMemberRuntimeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostMemberRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostMemberRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMemberRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostMemberRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberRuntimeInfo"));
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
