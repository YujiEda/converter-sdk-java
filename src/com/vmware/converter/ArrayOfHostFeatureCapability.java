/**
 * ArrayOfHostFeatureCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostFeatureCapability  implements java.io.Serializable {
    private com.vmware.converter.HostFeatureCapability[] hostFeatureCapability;

    public ArrayOfHostFeatureCapability() {
    }

    public ArrayOfHostFeatureCapability(
           com.vmware.converter.HostFeatureCapability[] hostFeatureCapability) {
           this.hostFeatureCapability = hostFeatureCapability;
    }


    /**
     * Gets the hostFeatureCapability value for this ArrayOfHostFeatureCapability.
     * 
     * @return hostFeatureCapability
     */
    public com.vmware.converter.HostFeatureCapability[] getHostFeatureCapability() {
        return hostFeatureCapability;
    }


    /**
     * Sets the hostFeatureCapability value for this ArrayOfHostFeatureCapability.
     * 
     * @param hostFeatureCapability
     */
    public void setHostFeatureCapability(com.vmware.converter.HostFeatureCapability[] hostFeatureCapability) {
        this.hostFeatureCapability = hostFeatureCapability;
    }

    public com.vmware.converter.HostFeatureCapability getHostFeatureCapability(int i) {
        return this.hostFeatureCapability[i];
    }

    public void setHostFeatureCapability(int i, com.vmware.converter.HostFeatureCapability _value) {
        this.hostFeatureCapability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFeatureCapability)) return false;
        ArrayOfHostFeatureCapability other = (ArrayOfHostFeatureCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFeatureCapability==null && other.getHostFeatureCapability()==null) || 
             (this.hostFeatureCapability!=null &&
              java.util.Arrays.equals(this.hostFeatureCapability, other.getHostFeatureCapability())));
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
        if (getHostFeatureCapability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFeatureCapability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFeatureCapability(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFeatureCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostFeatureCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFeatureCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostFeatureCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureCapability"));
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
