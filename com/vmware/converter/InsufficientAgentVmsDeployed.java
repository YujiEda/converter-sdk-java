/**
 * InsufficientAgentVmsDeployed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InsufficientAgentVmsDeployed  extends com.vmware.converter.InsufficientResourcesFault  implements java.io.Serializable {
    private java.lang.String hostName;

    private int requiredNumAgentVms;

    private int currentNumAgentVms;

    public InsufficientAgentVmsDeployed() {
    }

    public InsufficientAgentVmsDeployed(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String hostName,
           int requiredNumAgentVms,
           int currentNumAgentVms) {
        super(
            faultCause,
            faultMessage);
        this.hostName = hostName;
        this.requiredNumAgentVms = requiredNumAgentVms;
        this.currentNumAgentVms = currentNumAgentVms;
    }


    /**
     * Gets the hostName value for this InsufficientAgentVmsDeployed.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this InsufficientAgentVmsDeployed.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the requiredNumAgentVms value for this InsufficientAgentVmsDeployed.
     * 
     * @return requiredNumAgentVms
     */
    public int getRequiredNumAgentVms() {
        return requiredNumAgentVms;
    }


    /**
     * Sets the requiredNumAgentVms value for this InsufficientAgentVmsDeployed.
     * 
     * @param requiredNumAgentVms
     */
    public void setRequiredNumAgentVms(int requiredNumAgentVms) {
        this.requiredNumAgentVms = requiredNumAgentVms;
    }


    /**
     * Gets the currentNumAgentVms value for this InsufficientAgentVmsDeployed.
     * 
     * @return currentNumAgentVms
     */
    public int getCurrentNumAgentVms() {
        return currentNumAgentVms;
    }


    /**
     * Sets the currentNumAgentVms value for this InsufficientAgentVmsDeployed.
     * 
     * @param currentNumAgentVms
     */
    public void setCurrentNumAgentVms(int currentNumAgentVms) {
        this.currentNumAgentVms = currentNumAgentVms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientAgentVmsDeployed)) return false;
        InsufficientAgentVmsDeployed other = (InsufficientAgentVmsDeployed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            this.requiredNumAgentVms == other.getRequiredNumAgentVms() &&
            this.currentNumAgentVms == other.getCurrentNumAgentVms();
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        _hashCode += getRequiredNumAgentVms();
        _hashCode += getCurrentNumAgentVms();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsufficientAgentVmsDeployed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InsufficientAgentVmsDeployed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredNumAgentVms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requiredNumAgentVms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentNumAgentVms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentNumAgentVms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
