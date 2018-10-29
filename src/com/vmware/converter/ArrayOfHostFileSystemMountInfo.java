/**
 * ArrayOfHostFileSystemMountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostFileSystemMountInfo  implements java.io.Serializable {
    private com.vmware.converter.HostFileSystemMountInfo[] hostFileSystemMountInfo;

    public ArrayOfHostFileSystemMountInfo() {
    }

    public ArrayOfHostFileSystemMountInfo(
           com.vmware.converter.HostFileSystemMountInfo[] hostFileSystemMountInfo) {
           this.hostFileSystemMountInfo = hostFileSystemMountInfo;
    }


    /**
     * Gets the hostFileSystemMountInfo value for this ArrayOfHostFileSystemMountInfo.
     * 
     * @return hostFileSystemMountInfo
     */
    public com.vmware.converter.HostFileSystemMountInfo[] getHostFileSystemMountInfo() {
        return hostFileSystemMountInfo;
    }


    /**
     * Sets the hostFileSystemMountInfo value for this ArrayOfHostFileSystemMountInfo.
     * 
     * @param hostFileSystemMountInfo
     */
    public void setHostFileSystemMountInfo(com.vmware.converter.HostFileSystemMountInfo[] hostFileSystemMountInfo) {
        this.hostFileSystemMountInfo = hostFileSystemMountInfo;
    }

    public com.vmware.converter.HostFileSystemMountInfo getHostFileSystemMountInfo(int i) {
        return this.hostFileSystemMountInfo[i];
    }

    public void setHostFileSystemMountInfo(int i, com.vmware.converter.HostFileSystemMountInfo _value) {
        this.hostFileSystemMountInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFileSystemMountInfo)) return false;
        ArrayOfHostFileSystemMountInfo other = (ArrayOfHostFileSystemMountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFileSystemMountInfo==null && other.getHostFileSystemMountInfo()==null) || 
             (this.hostFileSystemMountInfo!=null &&
              java.util.Arrays.equals(this.hostFileSystemMountInfo, other.getHostFileSystemMountInfo())));
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
        if (getHostFileSystemMountInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFileSystemMountInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFileSystemMountInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFileSystemMountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostFileSystemMountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFileSystemMountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemMountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemMountInfo"));
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
