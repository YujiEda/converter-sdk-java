/**
 * ArrayOfHostSslThumbprintInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostSslThumbprintInfo  implements java.io.Serializable {
    private com.vmware.converter.HostSslThumbprintInfo[] hostSslThumbprintInfo;

    public ArrayOfHostSslThumbprintInfo() {
    }

    public ArrayOfHostSslThumbprintInfo(
           com.vmware.converter.HostSslThumbprintInfo[] hostSslThumbprintInfo) {
           this.hostSslThumbprintInfo = hostSslThumbprintInfo;
    }


    /**
     * Gets the hostSslThumbprintInfo value for this ArrayOfHostSslThumbprintInfo.
     * 
     * @return hostSslThumbprintInfo
     */
    public com.vmware.converter.HostSslThumbprintInfo[] getHostSslThumbprintInfo() {
        return hostSslThumbprintInfo;
    }


    /**
     * Sets the hostSslThumbprintInfo value for this ArrayOfHostSslThumbprintInfo.
     * 
     * @param hostSslThumbprintInfo
     */
    public void setHostSslThumbprintInfo(com.vmware.converter.HostSslThumbprintInfo[] hostSslThumbprintInfo) {
        this.hostSslThumbprintInfo = hostSslThumbprintInfo;
    }

    public com.vmware.converter.HostSslThumbprintInfo getHostSslThumbprintInfo(int i) {
        return this.hostSslThumbprintInfo[i];
    }

    public void setHostSslThumbprintInfo(int i, com.vmware.converter.HostSslThumbprintInfo _value) {
        this.hostSslThumbprintInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostSslThumbprintInfo)) return false;
        ArrayOfHostSslThumbprintInfo other = (ArrayOfHostSslThumbprintInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostSslThumbprintInfo==null && other.getHostSslThumbprintInfo()==null) || 
             (this.hostSslThumbprintInfo!=null &&
              java.util.Arrays.equals(this.hostSslThumbprintInfo, other.getHostSslThumbprintInfo())));
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
        if (getHostSslThumbprintInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostSslThumbprintInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostSslThumbprintInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostSslThumbprintInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostSslThumbprintInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSslThumbprintInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostSslThumbprintInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSslThumbprintInfo"));
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
