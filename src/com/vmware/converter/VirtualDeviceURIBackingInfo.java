/**
 * VirtualDeviceURIBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDeviceURIBackingInfo  extends com.vmware.converter.VirtualDeviceBackingInfo  implements java.io.Serializable {
    private java.lang.String serviceURI;

    private java.lang.String direction;

    private java.lang.String proxyURI;

    public VirtualDeviceURIBackingInfo() {
    }

    public VirtualDeviceURIBackingInfo(
           java.lang.String serviceURI,
           java.lang.String direction,
           java.lang.String proxyURI) {
        this.serviceURI = serviceURI;
        this.direction = direction;
        this.proxyURI = proxyURI;
    }


    /**
     * Gets the serviceURI value for this VirtualDeviceURIBackingInfo.
     * 
     * @return serviceURI
     */
    public java.lang.String getServiceURI() {
        return serviceURI;
    }


    /**
     * Sets the serviceURI value for this VirtualDeviceURIBackingInfo.
     * 
     * @param serviceURI
     */
    public void setServiceURI(java.lang.String serviceURI) {
        this.serviceURI = serviceURI;
    }


    /**
     * Gets the direction value for this VirtualDeviceURIBackingInfo.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this VirtualDeviceURIBackingInfo.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the proxyURI value for this VirtualDeviceURIBackingInfo.
     * 
     * @return proxyURI
     */
    public java.lang.String getProxyURI() {
        return proxyURI;
    }


    /**
     * Sets the proxyURI value for this VirtualDeviceURIBackingInfo.
     * 
     * @param proxyURI
     */
    public void setProxyURI(java.lang.String proxyURI) {
        this.proxyURI = proxyURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceURIBackingInfo)) return false;
        VirtualDeviceURIBackingInfo other = (VirtualDeviceURIBackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceURI==null && other.getServiceURI()==null) || 
             (this.serviceURI!=null &&
              this.serviceURI.equals(other.getServiceURI()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.proxyURI==null && other.getProxyURI()==null) || 
             (this.proxyURI!=null &&
              this.proxyURI.equals(other.getProxyURI())));
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
        if (getServiceURI() != null) {
            _hashCode += getServiceURI().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getProxyURI() != null) {
            _hashCode += getProxyURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDeviceURIBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceURIBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceURI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyURI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "proxyURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
