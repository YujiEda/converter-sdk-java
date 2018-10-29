/**
 * ArrayOfClusterDrsVmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterDrsVmConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.ClusterDrsVmConfigInfo[] clusterDrsVmConfigInfo;

    public ArrayOfClusterDrsVmConfigInfo() {
    }

    public ArrayOfClusterDrsVmConfigInfo(
           com.vmware.converter.ClusterDrsVmConfigInfo[] clusterDrsVmConfigInfo) {
           this.clusterDrsVmConfigInfo = clusterDrsVmConfigInfo;
    }


    /**
     * Gets the clusterDrsVmConfigInfo value for this ArrayOfClusterDrsVmConfigInfo.
     * 
     * @return clusterDrsVmConfigInfo
     */
    public com.vmware.converter.ClusterDrsVmConfigInfo[] getClusterDrsVmConfigInfo() {
        return clusterDrsVmConfigInfo;
    }


    /**
     * Sets the clusterDrsVmConfigInfo value for this ArrayOfClusterDrsVmConfigInfo.
     * 
     * @param clusterDrsVmConfigInfo
     */
    public void setClusterDrsVmConfigInfo(com.vmware.converter.ClusterDrsVmConfigInfo[] clusterDrsVmConfigInfo) {
        this.clusterDrsVmConfigInfo = clusterDrsVmConfigInfo;
    }

    public com.vmware.converter.ClusterDrsVmConfigInfo getClusterDrsVmConfigInfo(int i) {
        return this.clusterDrsVmConfigInfo[i];
    }

    public void setClusterDrsVmConfigInfo(int i, com.vmware.converter.ClusterDrsVmConfigInfo _value) {
        this.clusterDrsVmConfigInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDrsVmConfigInfo)) return false;
        ArrayOfClusterDrsVmConfigInfo other = (ArrayOfClusterDrsVmConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDrsVmConfigInfo==null && other.getClusterDrsVmConfigInfo()==null) || 
             (this.clusterDrsVmConfigInfo!=null &&
              java.util.Arrays.equals(this.clusterDrsVmConfigInfo, other.getClusterDrsVmConfigInfo())));
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
        if (getClusterDrsVmConfigInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDrsVmConfigInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDrsVmConfigInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDrsVmConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDrsVmConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDrsVmConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigInfo"));
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
