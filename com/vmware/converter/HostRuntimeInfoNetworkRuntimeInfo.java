/**
 * HostRuntimeInfoNetworkRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostRuntimeInfoNetworkRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo[] netStackInstanceRuntimeInfo;

    private com.vmware.converter.HostNetworkResourceRuntime networkResourceRuntime;

    public HostRuntimeInfoNetworkRuntimeInfo() {
    }

    public HostRuntimeInfoNetworkRuntimeInfo(
           com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo[] netStackInstanceRuntimeInfo,
           com.vmware.converter.HostNetworkResourceRuntime networkResourceRuntime) {
        this.netStackInstanceRuntimeInfo = netStackInstanceRuntimeInfo;
        this.networkResourceRuntime = networkResourceRuntime;
    }


    /**
     * Gets the netStackInstanceRuntimeInfo value for this HostRuntimeInfoNetworkRuntimeInfo.
     * 
     * @return netStackInstanceRuntimeInfo
     */
    public com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo[] getNetStackInstanceRuntimeInfo() {
        return netStackInstanceRuntimeInfo;
    }


    /**
     * Sets the netStackInstanceRuntimeInfo value for this HostRuntimeInfoNetworkRuntimeInfo.
     * 
     * @param netStackInstanceRuntimeInfo
     */
    public void setNetStackInstanceRuntimeInfo(com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo[] netStackInstanceRuntimeInfo) {
        this.netStackInstanceRuntimeInfo = netStackInstanceRuntimeInfo;
    }

    public com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo getNetStackInstanceRuntimeInfo(int i) {
        return this.netStackInstanceRuntimeInfo[i];
    }

    public void setNetStackInstanceRuntimeInfo(int i, com.vmware.converter.HostRuntimeInfoNetStackInstanceRuntimeInfo _value) {
        this.netStackInstanceRuntimeInfo[i] = _value;
    }


    /**
     * Gets the networkResourceRuntime value for this HostRuntimeInfoNetworkRuntimeInfo.
     * 
     * @return networkResourceRuntime
     */
    public com.vmware.converter.HostNetworkResourceRuntime getNetworkResourceRuntime() {
        return networkResourceRuntime;
    }


    /**
     * Sets the networkResourceRuntime value for this HostRuntimeInfoNetworkRuntimeInfo.
     * 
     * @param networkResourceRuntime
     */
    public void setNetworkResourceRuntime(com.vmware.converter.HostNetworkResourceRuntime networkResourceRuntime) {
        this.networkResourceRuntime = networkResourceRuntime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostRuntimeInfoNetworkRuntimeInfo)) return false;
        HostRuntimeInfoNetworkRuntimeInfo other = (HostRuntimeInfoNetworkRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.netStackInstanceRuntimeInfo==null && other.getNetStackInstanceRuntimeInfo()==null) || 
             (this.netStackInstanceRuntimeInfo!=null &&
              java.util.Arrays.equals(this.netStackInstanceRuntimeInfo, other.getNetStackInstanceRuntimeInfo()))) &&
            ((this.networkResourceRuntime==null && other.getNetworkResourceRuntime()==null) || 
             (this.networkResourceRuntime!=null &&
              this.networkResourceRuntime.equals(other.getNetworkResourceRuntime())));
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
        if (getNetStackInstanceRuntimeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetStackInstanceRuntimeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetStackInstanceRuntimeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkResourceRuntime() != null) {
            _hashCode += getNetworkResourceRuntime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostRuntimeInfoNetworkRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfoNetworkRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netStackInstanceRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netStackInstanceRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfoNetStackInstanceRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkResourceRuntime"));
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
