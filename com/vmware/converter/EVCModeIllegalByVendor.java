/**
 * EVCModeIllegalByVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EVCModeIllegalByVendor  extends com.vmware.converter.EVCConfigFault  implements java.io.Serializable {
    private java.lang.String clusterCPUVendor;

    private java.lang.String modeCPUVendor;

    public EVCModeIllegalByVendor() {
    }

    public EVCModeIllegalByVendor(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.LocalizedMethodFault[] faults,
           java.lang.String clusterCPUVendor,
           java.lang.String modeCPUVendor) {
        super(
            faultCause,
            faultMessage,
            faults);
        this.clusterCPUVendor = clusterCPUVendor;
        this.modeCPUVendor = modeCPUVendor;
    }


    /**
     * Gets the clusterCPUVendor value for this EVCModeIllegalByVendor.
     * 
     * @return clusterCPUVendor
     */
    public java.lang.String getClusterCPUVendor() {
        return clusterCPUVendor;
    }


    /**
     * Sets the clusterCPUVendor value for this EVCModeIllegalByVendor.
     * 
     * @param clusterCPUVendor
     */
    public void setClusterCPUVendor(java.lang.String clusterCPUVendor) {
        this.clusterCPUVendor = clusterCPUVendor;
    }


    /**
     * Gets the modeCPUVendor value for this EVCModeIllegalByVendor.
     * 
     * @return modeCPUVendor
     */
    public java.lang.String getModeCPUVendor() {
        return modeCPUVendor;
    }


    /**
     * Sets the modeCPUVendor value for this EVCModeIllegalByVendor.
     * 
     * @param modeCPUVendor
     */
    public void setModeCPUVendor(java.lang.String modeCPUVendor) {
        this.modeCPUVendor = modeCPUVendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCModeIllegalByVendor)) return false;
        EVCModeIllegalByVendor other = (EVCModeIllegalByVendor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clusterCPUVendor==null && other.getClusterCPUVendor()==null) || 
             (this.clusterCPUVendor!=null &&
              this.clusterCPUVendor.equals(other.getClusterCPUVendor()))) &&
            ((this.modeCPUVendor==null && other.getModeCPUVendor()==null) || 
             (this.modeCPUVendor!=null &&
              this.modeCPUVendor.equals(other.getModeCPUVendor())));
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
        if (getClusterCPUVendor() != null) {
            _hashCode += getClusterCPUVendor().hashCode();
        }
        if (getModeCPUVendor() != null) {
            _hashCode += getModeCPUVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EVCModeIllegalByVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCModeIllegalByVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterCPUVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterCPUVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeCPUVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "modeCPUVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
