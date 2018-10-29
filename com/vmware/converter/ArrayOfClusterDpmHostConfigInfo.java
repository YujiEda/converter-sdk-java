/**
 * ArrayOfClusterDpmHostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterDpmHostConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.ClusterDpmHostConfigInfo[] clusterDpmHostConfigInfo;

    public ArrayOfClusterDpmHostConfigInfo() {
    }

    public ArrayOfClusterDpmHostConfigInfo(
           com.vmware.converter.ClusterDpmHostConfigInfo[] clusterDpmHostConfigInfo) {
           this.clusterDpmHostConfigInfo = clusterDpmHostConfigInfo;
    }


    /**
     * Gets the clusterDpmHostConfigInfo value for this ArrayOfClusterDpmHostConfigInfo.
     * 
     * @return clusterDpmHostConfigInfo
     */
    public com.vmware.converter.ClusterDpmHostConfigInfo[] getClusterDpmHostConfigInfo() {
        return clusterDpmHostConfigInfo;
    }


    /**
     * Sets the clusterDpmHostConfigInfo value for this ArrayOfClusterDpmHostConfigInfo.
     * 
     * @param clusterDpmHostConfigInfo
     */
    public void setClusterDpmHostConfigInfo(com.vmware.converter.ClusterDpmHostConfigInfo[] clusterDpmHostConfigInfo) {
        this.clusterDpmHostConfigInfo = clusterDpmHostConfigInfo;
    }

    public com.vmware.converter.ClusterDpmHostConfigInfo getClusterDpmHostConfigInfo(int i) {
        return this.clusterDpmHostConfigInfo[i];
    }

    public void setClusterDpmHostConfigInfo(int i, com.vmware.converter.ClusterDpmHostConfigInfo _value) {
        this.clusterDpmHostConfigInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDpmHostConfigInfo)) return false;
        ArrayOfClusterDpmHostConfigInfo other = (ArrayOfClusterDpmHostConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDpmHostConfigInfo==null && other.getClusterDpmHostConfigInfo()==null) || 
             (this.clusterDpmHostConfigInfo!=null &&
              java.util.Arrays.equals(this.clusterDpmHostConfigInfo, other.getClusterDpmHostConfigInfo())));
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
        if (getClusterDpmHostConfigInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDpmHostConfigInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDpmHostConfigInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDpmHostConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDpmHostConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDpmHostConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigInfo"));
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
