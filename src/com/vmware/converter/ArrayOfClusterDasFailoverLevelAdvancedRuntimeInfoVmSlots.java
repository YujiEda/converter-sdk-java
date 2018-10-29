/**
 * ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots  implements java.io.Serializable {
    private com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;

    public ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots() {
    }

    public ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(
           com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots) {
           this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots = clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
    }


    /**
     * Gets the clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots value for this ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @return clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots
     */
    public com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots() {
        return clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
    }


    /**
     * Sets the clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots value for this ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @param clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots
     */
    public void setClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots) {
        this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots = clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots;
    }

    public com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(int i) {
        return this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[i];
    }

    public void setClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(int i, com.vmware.converter.ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots _value) {
        this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots)) return false;
        ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots other = (ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots==null && other.getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots()==null) || 
             (this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots!=null &&
              java.util.Arrays.equals(this.clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots, other.getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots())));
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
        if (getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDasFailoverLevelAdvancedRuntimeInfoVmSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots"));
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
