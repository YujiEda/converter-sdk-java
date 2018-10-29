/**
 * ClusterIoFilterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterIoFilterInfo  extends com.vmware.converter.IoFilterInfo  implements java.io.Serializable {
    private java.lang.String opType;

    public ClusterIoFilterInfo() {
    }

    public ClusterIoFilterInfo(
           java.lang.String id,
           java.lang.String name,
           java.lang.String vendor,
           java.lang.String version,
           java.lang.String summary,
           java.lang.String releaseDate,
           java.lang.String opType) {
        super(
            id,
            name,
            vendor,
            version,
            summary,
            releaseDate);
        this.opType = opType;
    }


    /**
     * Gets the opType value for this ClusterIoFilterInfo.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ClusterIoFilterInfo.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterIoFilterInfo)) return false;
        ClusterIoFilterInfo other = (ClusterIoFilterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType())));
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
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterIoFilterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterIoFilterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
