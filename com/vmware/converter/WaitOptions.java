/**
 * WaitOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class WaitOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer maxWaitSeconds;

    private java.lang.Integer maxObjectUpdates;

    public WaitOptions() {
    }

    public WaitOptions(
           java.lang.Integer maxWaitSeconds,
           java.lang.Integer maxObjectUpdates) {
        this.maxWaitSeconds = maxWaitSeconds;
        this.maxObjectUpdates = maxObjectUpdates;
    }


    /**
     * Gets the maxWaitSeconds value for this WaitOptions.
     * 
     * @return maxWaitSeconds
     */
    public java.lang.Integer getMaxWaitSeconds() {
        return maxWaitSeconds;
    }


    /**
     * Sets the maxWaitSeconds value for this WaitOptions.
     * 
     * @param maxWaitSeconds
     */
    public void setMaxWaitSeconds(java.lang.Integer maxWaitSeconds) {
        this.maxWaitSeconds = maxWaitSeconds;
    }


    /**
     * Gets the maxObjectUpdates value for this WaitOptions.
     * 
     * @return maxObjectUpdates
     */
    public java.lang.Integer getMaxObjectUpdates() {
        return maxObjectUpdates;
    }


    /**
     * Sets the maxObjectUpdates value for this WaitOptions.
     * 
     * @param maxObjectUpdates
     */
    public void setMaxObjectUpdates(java.lang.Integer maxObjectUpdates) {
        this.maxObjectUpdates = maxObjectUpdates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaitOptions)) return false;
        WaitOptions other = (WaitOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxWaitSeconds==null && other.getMaxWaitSeconds()==null) || 
             (this.maxWaitSeconds!=null &&
              this.maxWaitSeconds.equals(other.getMaxWaitSeconds()))) &&
            ((this.maxObjectUpdates==null && other.getMaxObjectUpdates()==null) || 
             (this.maxObjectUpdates!=null &&
              this.maxObjectUpdates.equals(other.getMaxObjectUpdates())));
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
        if (getMaxWaitSeconds() != null) {
            _hashCode += getMaxWaitSeconds().hashCode();
        }
        if (getMaxObjectUpdates() != null) {
            _hashCode += getMaxObjectUpdates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WaitOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "WaitOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxWaitSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxWaitSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxObjectUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxObjectUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
