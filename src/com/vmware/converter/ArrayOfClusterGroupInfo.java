/**
 * ArrayOfClusterGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterGroupInfo  implements java.io.Serializable {
    private com.vmware.converter.ClusterGroupInfo[] clusterGroupInfo;

    public ArrayOfClusterGroupInfo() {
    }

    public ArrayOfClusterGroupInfo(
           com.vmware.converter.ClusterGroupInfo[] clusterGroupInfo) {
           this.clusterGroupInfo = clusterGroupInfo;
    }


    /**
     * Gets the clusterGroupInfo value for this ArrayOfClusterGroupInfo.
     * 
     * @return clusterGroupInfo
     */
    public com.vmware.converter.ClusterGroupInfo[] getClusterGroupInfo() {
        return clusterGroupInfo;
    }


    /**
     * Sets the clusterGroupInfo value for this ArrayOfClusterGroupInfo.
     * 
     * @param clusterGroupInfo
     */
    public void setClusterGroupInfo(com.vmware.converter.ClusterGroupInfo[] clusterGroupInfo) {
        this.clusterGroupInfo = clusterGroupInfo;
    }

    public com.vmware.converter.ClusterGroupInfo getClusterGroupInfo(int i) {
        return this.clusterGroupInfo[i];
    }

    public void setClusterGroupInfo(int i, com.vmware.converter.ClusterGroupInfo _value) {
        this.clusterGroupInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterGroupInfo)) return false;
        ArrayOfClusterGroupInfo other = (ArrayOfClusterGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterGroupInfo==null && other.getClusterGroupInfo()==null) || 
             (this.clusterGroupInfo!=null &&
              java.util.Arrays.equals(this.clusterGroupInfo, other.getClusterGroupInfo())));
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
        if (getClusterGroupInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterGroupInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterGroupInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterGroupInfo"));
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
