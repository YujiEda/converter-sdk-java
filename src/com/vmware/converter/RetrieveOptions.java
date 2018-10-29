/**
 * RetrieveOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RetrieveOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer maxObjects;

    public RetrieveOptions() {
    }

    public RetrieveOptions(
           java.lang.Integer maxObjects) {
        this.maxObjects = maxObjects;
    }


    /**
     * Gets the maxObjects value for this RetrieveOptions.
     * 
     * @return maxObjects
     */
    public java.lang.Integer getMaxObjects() {
        return maxObjects;
    }


    /**
     * Sets the maxObjects value for this RetrieveOptions.
     * 
     * @param maxObjects
     */
    public void setMaxObjects(java.lang.Integer maxObjects) {
        this.maxObjects = maxObjects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveOptions)) return false;
        RetrieveOptions other = (RetrieveOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxObjects==null && other.getMaxObjects()==null) || 
             (this.maxObjects!=null &&
              this.maxObjects.equals(other.getMaxObjects())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMaxObjects() != null) {
            _hashCode += getMaxObjects().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RetrieveOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
