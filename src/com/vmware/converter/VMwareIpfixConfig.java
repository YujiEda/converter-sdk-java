/**
 * VMwareIpfixConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareIpfixConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String collectorIpAddress;

    private java.lang.Integer collectorPort;

    private java.lang.Long observationDomainId;

    private int activeFlowTimeout;

    private int idleFlowTimeout;

    private int samplingRate;

    private boolean internalFlowsOnly;

    public VMwareIpfixConfig() {
    }

    public VMwareIpfixConfig(
           java.lang.String collectorIpAddress,
           java.lang.Integer collectorPort,
           java.lang.Long observationDomainId,
           int activeFlowTimeout,
           int idleFlowTimeout,
           int samplingRate,
           boolean internalFlowsOnly) {
        this.collectorIpAddress = collectorIpAddress;
        this.collectorPort = collectorPort;
        this.observationDomainId = observationDomainId;
        this.activeFlowTimeout = activeFlowTimeout;
        this.idleFlowTimeout = idleFlowTimeout;
        this.samplingRate = samplingRate;
        this.internalFlowsOnly = internalFlowsOnly;
    }


    /**
     * Gets the collectorIpAddress value for this VMwareIpfixConfig.
     * 
     * @return collectorIpAddress
     */
    public java.lang.String getCollectorIpAddress() {
        return collectorIpAddress;
    }


    /**
     * Sets the collectorIpAddress value for this VMwareIpfixConfig.
     * 
     * @param collectorIpAddress
     */
    public void setCollectorIpAddress(java.lang.String collectorIpAddress) {
        this.collectorIpAddress = collectorIpAddress;
    }


    /**
     * Gets the collectorPort value for this VMwareIpfixConfig.
     * 
     * @return collectorPort
     */
    public java.lang.Integer getCollectorPort() {
        return collectorPort;
    }


    /**
     * Sets the collectorPort value for this VMwareIpfixConfig.
     * 
     * @param collectorPort
     */
    public void setCollectorPort(java.lang.Integer collectorPort) {
        this.collectorPort = collectorPort;
    }


    /**
     * Gets the observationDomainId value for this VMwareIpfixConfig.
     * 
     * @return observationDomainId
     */
    public java.lang.Long getObservationDomainId() {
        return observationDomainId;
    }


    /**
     * Sets the observationDomainId value for this VMwareIpfixConfig.
     * 
     * @param observationDomainId
     */
    public void setObservationDomainId(java.lang.Long observationDomainId) {
        this.observationDomainId = observationDomainId;
    }


    /**
     * Gets the activeFlowTimeout value for this VMwareIpfixConfig.
     * 
     * @return activeFlowTimeout
     */
    public int getActiveFlowTimeout() {
        return activeFlowTimeout;
    }


    /**
     * Sets the activeFlowTimeout value for this VMwareIpfixConfig.
     * 
     * @param activeFlowTimeout
     */
    public void setActiveFlowTimeout(int activeFlowTimeout) {
        this.activeFlowTimeout = activeFlowTimeout;
    }


    /**
     * Gets the idleFlowTimeout value for this VMwareIpfixConfig.
     * 
     * @return idleFlowTimeout
     */
    public int getIdleFlowTimeout() {
        return idleFlowTimeout;
    }


    /**
     * Sets the idleFlowTimeout value for this VMwareIpfixConfig.
     * 
     * @param idleFlowTimeout
     */
    public void setIdleFlowTimeout(int idleFlowTimeout) {
        this.idleFlowTimeout = idleFlowTimeout;
    }


    /**
     * Gets the samplingRate value for this VMwareIpfixConfig.
     * 
     * @return samplingRate
     */
    public int getSamplingRate() {
        return samplingRate;
    }


    /**
     * Sets the samplingRate value for this VMwareIpfixConfig.
     * 
     * @param samplingRate
     */
    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }


    /**
     * Gets the internalFlowsOnly value for this VMwareIpfixConfig.
     * 
     * @return internalFlowsOnly
     */
    public boolean isInternalFlowsOnly() {
        return internalFlowsOnly;
    }


    /**
     * Sets the internalFlowsOnly value for this VMwareIpfixConfig.
     * 
     * @param internalFlowsOnly
     */
    public void setInternalFlowsOnly(boolean internalFlowsOnly) {
        this.internalFlowsOnly = internalFlowsOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareIpfixConfig)) return false;
        VMwareIpfixConfig other = (VMwareIpfixConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.collectorIpAddress==null && other.getCollectorIpAddress()==null) || 
             (this.collectorIpAddress!=null &&
              this.collectorIpAddress.equals(other.getCollectorIpAddress()))) &&
            ((this.collectorPort==null && other.getCollectorPort()==null) || 
             (this.collectorPort!=null &&
              this.collectorPort.equals(other.getCollectorPort()))) &&
            ((this.observationDomainId==null && other.getObservationDomainId()==null) || 
             (this.observationDomainId!=null &&
              this.observationDomainId.equals(other.getObservationDomainId()))) &&
            this.activeFlowTimeout == other.getActiveFlowTimeout() &&
            this.idleFlowTimeout == other.getIdleFlowTimeout() &&
            this.samplingRate == other.getSamplingRate() &&
            this.internalFlowsOnly == other.isInternalFlowsOnly();
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
        if (getCollectorIpAddress() != null) {
            _hashCode += getCollectorIpAddress().hashCode();
        }
        if (getCollectorPort() != null) {
            _hashCode += getCollectorPort().hashCode();
        }
        if (getObservationDomainId() != null) {
            _hashCode += getObservationDomainId().hashCode();
        }
        _hashCode += getActiveFlowTimeout();
        _hashCode += getIdleFlowTimeout();
        _hashCode += getSamplingRate();
        _hashCode += (isInternalFlowsOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareIpfixConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareIpfixConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectorIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "collectorIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectorPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "collectorPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observationDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "observationDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFlowTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeFlowTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idleFlowTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "idleFlowTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samplingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "samplingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalFlowsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "internalFlowsOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
