/**
 * HostNetworkResourceRuntime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNetworkResourceRuntime  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostPnicNetworkResourceInfo[] pnicResourceInfo;

    public HostNetworkResourceRuntime() {
    }

    public HostNetworkResourceRuntime(
           com.vmware.converter.HostPnicNetworkResourceInfo[] pnicResourceInfo) {
        this.pnicResourceInfo = pnicResourceInfo;
    }


    /**
     * Gets the pnicResourceInfo value for this HostNetworkResourceRuntime.
     * 
     * @return pnicResourceInfo
     */
    public com.vmware.converter.HostPnicNetworkResourceInfo[] getPnicResourceInfo() {
        return pnicResourceInfo;
    }


    /**
     * Sets the pnicResourceInfo value for this HostNetworkResourceRuntime.
     * 
     * @param pnicResourceInfo
     */
    public void setPnicResourceInfo(com.vmware.converter.HostPnicNetworkResourceInfo[] pnicResourceInfo) {
        this.pnicResourceInfo = pnicResourceInfo;
    }

    public com.vmware.converter.HostPnicNetworkResourceInfo getPnicResourceInfo(int i) {
        return this.pnicResourceInfo[i];
    }

    public void setPnicResourceInfo(int i, com.vmware.converter.HostPnicNetworkResourceInfo _value) {
        this.pnicResourceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkResourceRuntime)) return false;
        HostNetworkResourceRuntime other = (HostNetworkResourceRuntime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicResourceInfo==null && other.getPnicResourceInfo()==null) || 
             (this.pnicResourceInfo!=null &&
              java.util.Arrays.equals(this.pnicResourceInfo, other.getPnicResourceInfo())));
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
        if (getPnicResourceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicResourceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicResourceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostNetworkResourceRuntime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkResourceRuntime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicResourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicResourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPnicNetworkResourceInfo"));
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
