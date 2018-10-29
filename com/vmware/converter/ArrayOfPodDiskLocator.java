/**
 * ArrayOfPodDiskLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPodDiskLocator  implements java.io.Serializable {
    private com.vmware.converter.PodDiskLocator[] podDiskLocator;

    public ArrayOfPodDiskLocator() {
    }

    public ArrayOfPodDiskLocator(
           com.vmware.converter.PodDiskLocator[] podDiskLocator) {
           this.podDiskLocator = podDiskLocator;
    }


    /**
     * Gets the podDiskLocator value for this ArrayOfPodDiskLocator.
     * 
     * @return podDiskLocator
     */
    public com.vmware.converter.PodDiskLocator[] getPodDiskLocator() {
        return podDiskLocator;
    }


    /**
     * Sets the podDiskLocator value for this ArrayOfPodDiskLocator.
     * 
     * @param podDiskLocator
     */
    public void setPodDiskLocator(com.vmware.converter.PodDiskLocator[] podDiskLocator) {
        this.podDiskLocator = podDiskLocator;
    }

    public com.vmware.converter.PodDiskLocator getPodDiskLocator(int i) {
        return this.podDiskLocator[i];
    }

    public void setPodDiskLocator(int i, com.vmware.converter.PodDiskLocator _value) {
        this.podDiskLocator[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPodDiskLocator)) return false;
        ArrayOfPodDiskLocator other = (ArrayOfPodDiskLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.podDiskLocator==null && other.getPodDiskLocator()==null) || 
             (this.podDiskLocator!=null &&
              java.util.Arrays.equals(this.podDiskLocator, other.getPodDiskLocator())));
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
        if (getPodDiskLocator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPodDiskLocator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPodDiskLocator(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPodDiskLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPodDiskLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podDiskLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PodDiskLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PodDiskLocator"));
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
