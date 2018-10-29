/**
 * ArrayOfHostIoFilterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostIoFilterInfo  implements java.io.Serializable {
    private com.vmware.converter.HostIoFilterInfo[] hostIoFilterInfo;

    public ArrayOfHostIoFilterInfo() {
    }

    public ArrayOfHostIoFilterInfo(
           com.vmware.converter.HostIoFilterInfo[] hostIoFilterInfo) {
           this.hostIoFilterInfo = hostIoFilterInfo;
    }


    /**
     * Gets the hostIoFilterInfo value for this ArrayOfHostIoFilterInfo.
     * 
     * @return hostIoFilterInfo
     */
    public com.vmware.converter.HostIoFilterInfo[] getHostIoFilterInfo() {
        return hostIoFilterInfo;
    }


    /**
     * Sets the hostIoFilterInfo value for this ArrayOfHostIoFilterInfo.
     * 
     * @param hostIoFilterInfo
     */
    public void setHostIoFilterInfo(com.vmware.converter.HostIoFilterInfo[] hostIoFilterInfo) {
        this.hostIoFilterInfo = hostIoFilterInfo;
    }

    public com.vmware.converter.HostIoFilterInfo getHostIoFilterInfo(int i) {
        return this.hostIoFilterInfo[i];
    }

    public void setHostIoFilterInfo(int i, com.vmware.converter.HostIoFilterInfo _value) {
        this.hostIoFilterInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostIoFilterInfo)) return false;
        ArrayOfHostIoFilterInfo other = (ArrayOfHostIoFilterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostIoFilterInfo==null && other.getHostIoFilterInfo()==null) || 
             (this.hostIoFilterInfo!=null &&
              java.util.Arrays.equals(this.hostIoFilterInfo, other.getHostIoFilterInfo())));
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
        if (getHostIoFilterInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostIoFilterInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostIoFilterInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostIoFilterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostIoFilterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIoFilterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostIoFilterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIoFilterInfo"));
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
