/**
 * ArrayOfClusterHostRecommendation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfClusterHostRecommendation  implements java.io.Serializable {
    private com.vmware.converter.ClusterHostRecommendation[] clusterHostRecommendation;

    public ArrayOfClusterHostRecommendation() {
    }

    public ArrayOfClusterHostRecommendation(
           com.vmware.converter.ClusterHostRecommendation[] clusterHostRecommendation) {
           this.clusterHostRecommendation = clusterHostRecommendation;
    }


    /**
     * Gets the clusterHostRecommendation value for this ArrayOfClusterHostRecommendation.
     * 
     * @return clusterHostRecommendation
     */
    public com.vmware.converter.ClusterHostRecommendation[] getClusterHostRecommendation() {
        return clusterHostRecommendation;
    }


    /**
     * Sets the clusterHostRecommendation value for this ArrayOfClusterHostRecommendation.
     * 
     * @param clusterHostRecommendation
     */
    public void setClusterHostRecommendation(com.vmware.converter.ClusterHostRecommendation[] clusterHostRecommendation) {
        this.clusterHostRecommendation = clusterHostRecommendation;
    }

    public com.vmware.converter.ClusterHostRecommendation getClusterHostRecommendation(int i) {
        return this.clusterHostRecommendation[i];
    }

    public void setClusterHostRecommendation(int i, com.vmware.converter.ClusterHostRecommendation _value) {
        this.clusterHostRecommendation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterHostRecommendation)) return false;
        ArrayOfClusterHostRecommendation other = (ArrayOfClusterHostRecommendation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterHostRecommendation==null && other.getClusterHostRecommendation()==null) || 
             (this.clusterHostRecommendation!=null &&
              java.util.Arrays.equals(this.clusterHostRecommendation, other.getClusterHostRecommendation())));
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
        if (getClusterHostRecommendation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterHostRecommendation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterHostRecommendation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterHostRecommendation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterHostRecommendation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterHostRecommendation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterHostRecommendation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterHostRecommendation"));
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
