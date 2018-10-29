/**
 * ArrayOfHostPowerPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostPowerPolicy  implements java.io.Serializable {
    private com.vmware.converter.HostPowerPolicy[] hostPowerPolicy;

    public ArrayOfHostPowerPolicy() {
    }

    public ArrayOfHostPowerPolicy(
           com.vmware.converter.HostPowerPolicy[] hostPowerPolicy) {
           this.hostPowerPolicy = hostPowerPolicy;
    }


    /**
     * Gets the hostPowerPolicy value for this ArrayOfHostPowerPolicy.
     * 
     * @return hostPowerPolicy
     */
    public com.vmware.converter.HostPowerPolicy[] getHostPowerPolicy() {
        return hostPowerPolicy;
    }


    /**
     * Sets the hostPowerPolicy value for this ArrayOfHostPowerPolicy.
     * 
     * @param hostPowerPolicy
     */
    public void setHostPowerPolicy(com.vmware.converter.HostPowerPolicy[] hostPowerPolicy) {
        this.hostPowerPolicy = hostPowerPolicy;
    }

    public com.vmware.converter.HostPowerPolicy getHostPowerPolicy(int i) {
        return this.hostPowerPolicy[i];
    }

    public void setHostPowerPolicy(int i, com.vmware.converter.HostPowerPolicy _value) {
        this.hostPowerPolicy[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPowerPolicy)) return false;
        ArrayOfHostPowerPolicy other = (ArrayOfHostPowerPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPowerPolicy==null && other.getHostPowerPolicy()==null) || 
             (this.hostPowerPolicy!=null &&
              java.util.Arrays.equals(this.hostPowerPolicy, other.getHostPowerPolicy())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHostPowerPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPowerPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPowerPolicy(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPowerPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPowerPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPowerPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPowerPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPowerPolicy"));
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
