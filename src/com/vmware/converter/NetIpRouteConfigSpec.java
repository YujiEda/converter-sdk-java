/**
 * NetIpRouteConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpRouteConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] ipRoute;

    public NetIpRouteConfigSpec() {
    }

    public NetIpRouteConfigSpec(
           com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] ipRoute) {
        this.ipRoute = ipRoute;
    }


    /**
     * Gets the ipRoute value for this NetIpRouteConfigSpec.
     * 
     * @return ipRoute
     */
    public com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] getIpRoute() {
        return ipRoute;
    }


    /**
     * Sets the ipRoute value for this NetIpRouteConfigSpec.
     * 
     * @param ipRoute
     */
    public void setIpRoute(com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] ipRoute) {
        this.ipRoute = ipRoute;
    }

    public com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec getIpRoute(int i) {
        return this.ipRoute[i];
    }

    public void setIpRoute(int i, com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec _value) {
        this.ipRoute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpRouteConfigSpec)) return false;
        NetIpRouteConfigSpec other = (NetIpRouteConfigSpec) obj;
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
              java.util.Arrays.equals(this.ipRoute, other.getIpRoute())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpRouteConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpecIpRouteSpec"));
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
