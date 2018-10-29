/**
 * ArrayOfClusterRecommendation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterRecommendation  implements java.io.Serializable {
    private com.vmware.converter.ClusterRecommendation[] clusterRecommendation;

    public ArrayOfClusterRecommendation() {
    }

    public ArrayOfClusterRecommendation(
           com.vmware.converter.ClusterRecommendation[] clusterRecommendation) {
           this.clusterRecommendation = clusterRecommendation;
    }


    /**
     * Gets the clusterRecommendation value for this ArrayOfClusterRecommendation.
     * 
     * @return clusterRecommendation
     */
    public com.vmware.converter.ClusterRecommendation[] getClusterRecommendation() {
        return clusterRecommendation;
    }


    /**
     * Sets the clusterRecommendation value for this ArrayOfClusterRecommendation.
     * 
     * @param clusterRecommendation
     */
    public void setClusterRecommendation(com.vmware.converter.ClusterRecommendation[] clusterRecommendation) {
        this.clusterRecommendation = clusterRecommendation;
    }

    public com.vmware.converter.ClusterRecommendation getClusterRecommendation(int i) {
        return this.clusterRecommendation[i];
    }

    public void setClusterRecommendation(int i, com.vmware.converter.ClusterRecommendation _value) {
        this.clusterRecommendation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterRecommendation)) return false;
        ArrayOfClusterRecommendation other = (ArrayOfClusterRecommendation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterRecommendation==null && other.getClusterRecommendation()==null) || 
             (this.clusterRecommendation!=null &&
              java.util.Arrays.equals(this.clusterRecommendation, other.getClusterRecommendation())));
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
        if (getClusterRecommendation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterRecommendation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterRecommendation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterRecommendation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterRecommendation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterRecommendation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterRecommendation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRecommendation"));
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
