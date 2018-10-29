/**
 * PowerSystemCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PowerSystemCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostPowerPolicy[] availablePolicy;

    public PowerSystemCapability() {
    }

    public PowerSystemCapability(
           com.vmware.converter.HostPowerPolicy[] availablePolicy) {
        this.availablePolicy = availablePolicy;
    }


    /**
     * Gets the availablePolicy value for this PowerSystemCapability.
     * 
     * @return availablePolicy
     */
    public com.vmware.converter.HostPowerPolicy[] getAvailablePolicy() {
        return availablePolicy;
    }


    /**
     * Sets the availablePolicy value for this PowerSystemCapability.
     * 
     * @param availablePolicy
     */
    public void setAvailablePolicy(com.vmware.converter.HostPowerPolicy[] availablePolicy) {
        this.availablePolicy = availablePolicy;
    }

    public com.vmware.converter.HostPowerPolicy getAvailablePolicy(int i) {
        return this.availablePolicy[i];
    }

    public void setAvailablePolicy(int i, com.vmware.converter.HostPowerPolicy _value) {
        this.availablePolicy[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PowerSystemCapability)) return false;
        PowerSystemCapability other = (PowerSystemCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availablePolicy==null && other.getAvailablePolicy()==null) || 
             (this.availablePolicy!=null &&
              java.util.Arrays.equals(this.availablePolicy, other.getAvailablePolicy())));
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
        if (getAvailablePolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePolicy(), i);
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
        new org.apache.axis.description.TypeDesc(PowerSystemCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PowerSystemCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "availablePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPowerPolicy"));
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
