/**
 * ClusterDpmHostConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDpmHostConfigSpec  extends com.vmware.converter.ArrayUpdateSpec  implements java.io.Serializable {
    private com.vmware.converter.ClusterDpmHostConfigInfo info;

    public ClusterDpmHostConfigSpec() {
    }

    public ClusterDpmHostConfigSpec(
           com.vmware.converter.ArrayUpdateOperation operation,
           java.lang.Object removeKey,
           com.vmware.converter.ClusterDpmHostConfigInfo info) {
        super(
            operation,
            removeKey);
        this.info = info;
    }


    /**
     * Gets the info value for this ClusterDpmHostConfigSpec.
     * 
     * @return info
     */
    public com.vmware.converter.ClusterDpmHostConfigInfo getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ClusterDpmHostConfigSpec.
     * 
     * @param info
     */
    public void setInfo(com.vmware.converter.ClusterDpmHostConfigInfo info) {
        this.info = info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDpmHostConfigSpec)) return false;
        ClusterDpmHostConfigSpec other = (ClusterDpmHostConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo())));
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
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDpmHostConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigInfo"));
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
