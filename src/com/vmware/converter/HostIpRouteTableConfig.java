/**
 * HostIpRouteTableConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostIpRouteTableConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostIpRouteOp[] ipRoute;

    private com.vmware.converter.HostIpRouteOp[] ipv6Route;

    public HostIpRouteTableConfig() {
    }

    public HostIpRouteTableConfig(
           com.vmware.converter.HostIpRouteOp[] ipRoute,
           com.vmware.converter.HostIpRouteOp[] ipv6Route) {
        this.ipRoute = ipRoute;
        this.ipv6Route = ipv6Route;
    }


    /**
     * Gets the ipRoute value for this HostIpRouteTableConfig.
     * 
     * @return ipRoute
     */
    public com.vmware.converter.HostIpRouteOp[] getIpRoute() {
        return ipRoute;
    }


    /**
     * Sets the ipRoute value for this HostIpRouteTableConfig.
     * 
     * @param ipRoute
     */
    public void setIpRoute(com.vmware.converter.HostIpRouteOp[] ipRoute) {
        this.ipRoute = ipRoute;
    }

    public com.vmware.converter.HostIpRouteOp getIpRoute(int i) {
        return this.ipRoute[i];
    }

    public void setIpRoute(int i, com.vmware.converter.HostIpRouteOp _value) {
        this.ipRoute[i] = _value;
    }


    /**
     * Gets the ipv6Route value for this HostIpRouteTableConfig.
     * 
     * @return ipv6Route
     */
    public com.vmware.converter.HostIpRouteOp[] getIpv6Route() {
        return ipv6Route;
    }


    /**
     * Sets the ipv6Route value for this HostIpRouteTableConfig.
     * 
     * @param ipv6Route
     */
    public void setIpv6Route(com.vmware.converter.HostIpRouteOp[] ipv6Route) {
        this.ipv6Route = ipv6Route;
    }

    public com.vmware.converter.HostIpRouteOp getIpv6Route(int i) {
        return this.ipv6Route[i];
    }

    public void setIpv6Route(int i, com.vmware.converter.HostIpRouteOp _value) {
        this.ipv6Route[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostIpRouteTableConfig)) return false;
        HostIpRouteTableConfig other = (HostIpRouteTableConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipRoute==null && other.getIpRoute()==null) || 
             (this.ipRoute!=null &&
              java.util.Arrays.equals(this.ipRoute, other.getIpRoute()))) &&
            ((this.ipv6Route==null && other.getIpv6Route()==null) || 
             (this.ipv6Route!=null &&
              java.util.Arrays.equals(this.ipv6Route, other.getIpv6Route())));
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
        if (getIpRoute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpRoute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpRoute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpv6Route() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpv6Route());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpv6Route(), i);
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
        new org.apache.axis.description.TypeDesc(HostIpRouteTableConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteTableConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteOp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Route");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6Route"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteOp"));
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
