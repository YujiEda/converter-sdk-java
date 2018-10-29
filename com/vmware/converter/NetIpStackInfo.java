/**
 * NetIpStackInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpStackInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.NetIpStackInfoNetToMedia[] neighbor;

    private com.vmware.converter.NetIpStackInfoDefaultRouter[] defaultRouter;

    public NetIpStackInfo() {
    }

    public NetIpStackInfo(
           com.vmware.converter.NetIpStackInfoNetToMedia[] neighbor,
           com.vmware.converter.NetIpStackInfoDefaultRouter[] defaultRouter) {
        this.neighbor = neighbor;
        this.defaultRouter = defaultRouter;
    }


    /**
     * Gets the neighbor value for this NetIpStackInfo.
     * 
     * @return neighbor
     */
    public com.vmware.converter.NetIpStackInfoNetToMedia[] getNeighbor() {
        return neighbor;
    }


    /**
     * Sets the neighbor value for this NetIpStackInfo.
     * 
     * @param neighbor
     */
    public void setNeighbor(com.vmware.converter.NetIpStackInfoNetToMedia[] neighbor) {
        this.neighbor = neighbor;
    }

    public com.vmware.converter.NetIpStackInfoNetToMedia getNeighbor(int i) {
        return this.neighbor[i];
    }

    public void setNeighbor(int i, com.vmware.converter.NetIpStackInfoNetToMedia _value) {
        this.neighbor[i] = _value;
    }


    /**
     * Gets the defaultRouter value for this NetIpStackInfo.
     * 
     * @return defaultRouter
     */
    public com.vmware.converter.NetIpStackInfoDefaultRouter[] getDefaultRouter() {
        return defaultRouter;
    }


    /**
     * Sets the defaultRouter value for this NetIpStackInfo.
     * 
     * @param defaultRouter
     */
    public void setDefaultRouter(com.vmware.converter.NetIpStackInfoDefaultRouter[] defaultRouter) {
        this.defaultRouter = defaultRouter;
    }

    public com.vmware.converter.NetIpStackInfoDefaultRouter getDefaultRouter(int i) {
        return this.defaultRouter[i];
    }

    public void setDefaultRouter(int i, com.vmware.converter.NetIpStackInfoDefaultRouter _value) {
        this.defaultRouter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpStackInfo)) return false;
        NetIpStackInfo other = (NetIpStackInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.neighbor==null && other.getNeighbor()==null) || 
             (this.neighbor!=null &&
              java.util.Arrays.equals(this.neighbor, other.getNeighbor()))) &&
            ((this.defaultRouter==null && other.getDefaultRouter()==null) || 
             (this.defaultRouter!=null &&
              java.util.Arrays.equals(this.defaultRouter, other.getDefaultRouter())));
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
        if (getNeighbor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNeighbor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNeighbor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultRouter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultRouter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultRouter(), i);
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
        new org.apache.axis.description.TypeDesc(NetIpStackInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpStackInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neighbor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "neighbor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpStackInfoNetToMedia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRouter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultRouter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpStackInfoDefaultRouter"));
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
