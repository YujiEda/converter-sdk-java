/**
 * HostVirtualNicOpaqueNetworkSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVirtualNicOpaqueNetworkSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String opaqueNetworkId;

    private java.lang.String opaqueNetworkType;

    public HostVirtualNicOpaqueNetworkSpec() {
    }

    public HostVirtualNicOpaqueNetworkSpec(
           java.lang.String opaqueNetworkId,
           java.lang.String opaqueNetworkType) {
        this.opaqueNetworkId = opaqueNetworkId;
        this.opaqueNetworkType = opaqueNetworkType;
    }


    /**
     * Gets the opaqueNetworkId value for this HostVirtualNicOpaqueNetworkSpec.
     * 
     * @return opaqueNetworkId
     */
    public java.lang.String getOpaqueNetworkId() {
        return opaqueNetworkId;
    }


    /**
     * Sets the opaqueNetworkId value for this HostVirtualNicOpaqueNetworkSpec.
     * 
     * @param opaqueNetworkId
     */
    public void setOpaqueNetworkId(java.lang.String opaqueNetworkId) {
        this.opaqueNetworkId = opaqueNetworkId;
    }


    /**
     * Gets the opaqueNetworkType value for this HostVirtualNicOpaqueNetworkSpec.
     * 
     * @return opaqueNetworkType
     */
    public java.lang.String getOpaqueNetworkType() {
        return opaqueNetworkType;
    }


    /**
     * Sets the opaqueNetworkType value for this HostVirtualNicOpaqueNetworkSpec.
     * 
     * @param opaqueNetworkType
     */
    public void setOpaqueNetworkType(java.lang.String opaqueNetworkType) {
        this.opaqueNetworkType = opaqueNetworkType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualNicOpaqueNetworkSpec)) return false;
        HostVirtualNicOpaqueNetworkSpec other = (HostVirtualNicOpaqueNetworkSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.opaqueNetworkId==null && other.getOpaqueNetworkId()==null) || 
             (this.opaqueNetworkId!=null &&
              this.opaqueNetworkId.equals(other.getOpaqueNetworkId()))) &&
            ((this.opaqueNetworkType==null && other.getOpaqueNetworkType()==null) || 
             (this.opaqueNetworkType!=null &&
              this.opaqueNetworkType.equals(other.getOpaqueNetworkType())));
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
        if (getOpaqueNetworkId() != null) {
            _hashCode += getOpaqueNetworkId().hashCode();
        }
        if (getOpaqueNetworkType() != null) {
            _hashCode += getOpaqueNetworkType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualNicOpaqueNetworkSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicOpaqueNetworkSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetworkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetworkType"));
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
