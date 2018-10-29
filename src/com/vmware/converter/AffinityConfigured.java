/**
 * AffinityConfigured.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AffinityConfigured  extends com.vmware.converter.MigrationFault  implements java.io.Serializable {
    private java.lang.String[] configuredAffinity;

    public AffinityConfigured() {
    }

    public AffinityConfigured(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String[] configuredAffinity) {
        super(
            faultCause,
            faultMessage);
        this.configuredAffinity = configuredAffinity;
    }


    /**
     * Gets the configuredAffinity value for this AffinityConfigured.
     * 
     * @return configuredAffinity
     */
    public java.lang.String[] getConfiguredAffinity() {
        return configuredAffinity;
    }


    /**
     * Sets the configuredAffinity value for this AffinityConfigured.
     * 
     * @param configuredAffinity
     */
    public void setConfiguredAffinity(java.lang.String[] configuredAffinity) {
        this.configuredAffinity = configuredAffinity;
    }

    public java.lang.String getConfiguredAffinity(int i) {
        return this.configuredAffinity[i];
    }

    public void setConfiguredAffinity(int i, java.lang.String _value) {
        this.configuredAffinity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AffinityConfigured)) return false;
        AffinityConfigured other = (AffinityConfigured) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configuredAffinity==null && other.getConfiguredAffinity()==null) || 
             (this.configuredAffinity!=null &&
              java.util.Arrays.equals(this.configuredAffinity, other.getConfiguredAffinity())));
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
        if (getConfiguredAffinity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfiguredAffinity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfiguredAffinity(), i);
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
        new org.apache.axis.description.TypeDesc(AffinityConfigured.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AffinityConfigured"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuredAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configuredAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
