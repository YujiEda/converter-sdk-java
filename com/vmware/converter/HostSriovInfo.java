/**
 * HostSriovInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostSriovInfo  extends com.vmware.converter.HostPciPassthruInfo  implements java.io.Serializable {
    private boolean sriovEnabled;

    private boolean sriovCapable;

    private boolean sriovActive;

    private int numVirtualFunctionRequested;

    private int numVirtualFunction;

    private int maxVirtualFunctionSupported;

    public HostSriovInfo() {
    }

    public HostSriovInfo(
           java.lang.String id,
           java.lang.String dependentDevice,
           boolean passthruEnabled,
           boolean passthruCapable,
           boolean passthruActive,
           boolean sriovEnabled,
           boolean sriovCapable,
           boolean sriovActive,
           int numVirtualFunctionRequested,
           int numVirtualFunction,
           int maxVirtualFunctionSupported) {
        super(
            id,
            dependentDevice,
            passthruEnabled,
            passthruCapable,
            passthruActive);
        this.sriovEnabled = sriovEnabled;
        this.sriovCapable = sriovCapable;
        this.sriovActive = sriovActive;
        this.numVirtualFunctionRequested = numVirtualFunctionRequested;
        this.numVirtualFunction = numVirtualFunction;
        this.maxVirtualFunctionSupported = maxVirtualFunctionSupported;
    }


    /**
     * Gets the sriovEnabled value for this HostSriovInfo.
     * 
     * @return sriovEnabled
     */
    public boolean isSriovEnabled() {
        return sriovEnabled;
    }


    /**
     * Sets the sriovEnabled value for this HostSriovInfo.
     * 
     * @param sriovEnabled
     */
    public void setSriovEnabled(boolean sriovEnabled) {
        this.sriovEnabled = sriovEnabled;
    }


    /**
     * Gets the sriovCapable value for this HostSriovInfo.
     * 
     * @return sriovCapable
     */
    public boolean isSriovCapable() {
        return sriovCapable;
    }


    /**
     * Sets the sriovCapable value for this HostSriovInfo.
     * 
     * @param sriovCapable
     */
    public void setSriovCapable(boolean sriovCapable) {
        this.sriovCapable = sriovCapable;
    }


    /**
     * Gets the sriovActive value for this HostSriovInfo.
     * 
     * @return sriovActive
     */
    public boolean isSriovActive() {
        return sriovActive;
    }


    /**
     * Sets the sriovActive value for this HostSriovInfo.
     * 
     * @param sriovActive
     */
    public void setSriovActive(boolean sriovActive) {
        this.sriovActive = sriovActive;
    }


    /**
     * Gets the numVirtualFunctionRequested value for this HostSriovInfo.
     * 
     * @return numVirtualFunctionRequested
     */
    public int getNumVirtualFunctionRequested() {
        return numVirtualFunctionRequested;
    }


    /**
     * Sets the numVirtualFunctionRequested value for this HostSriovInfo.
     * 
     * @param numVirtualFunctionRequested
     */
    public void setNumVirtualFunctionRequested(int numVirtualFunctionRequested) {
        this.numVirtualFunctionRequested = numVirtualFunctionRequested;
    }


    /**
     * Gets the numVirtualFunction value for this HostSriovInfo.
     * 
     * @return numVirtualFunction
     */
    public int getNumVirtualFunction() {
        return numVirtualFunction;
    }


    /**
     * Sets the numVirtualFunction value for this HostSriovInfo.
     * 
     * @param numVirtualFunction
     */
    public void setNumVirtualFunction(int numVirtualFunction) {
        this.numVirtualFunction = numVirtualFunction;
    }


    /**
     * Gets the maxVirtualFunctionSupported value for this HostSriovInfo.
     * 
     * @return maxVirtualFunctionSupported
     */
    public int getMaxVirtualFunctionSupported() {
        return maxVirtualFunctionSupported;
    }


    /**
     * Sets the maxVirtualFunctionSupported value for this HostSriovInfo.
     * 
     * @param maxVirtualFunctionSupported
     */
    public void setMaxVirtualFunctionSupported(int maxVirtualFunctionSupported) {
        this.maxVirtualFunctionSupported = maxVirtualFunctionSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSriovInfo)) return false;
        HostSriovInfo other = (HostSriovInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sriovEnabled == other.isSriovEnabled() &&
            this.sriovCapable == other.isSriovCapable() &&
            this.sriovActive == other.isSriovActive() &&
            this.numVirtualFunctionRequested == other.getNumVirtualFunctionRequested() &&
            this.numVirtualFunction == other.getNumVirtualFunction() &&
            this.maxVirtualFunctionSupported == other.getMaxVirtualFunctionSupported();
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
        _hashCode += (isSriovEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSriovCapable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSriovActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumVirtualFunctionRequested();
        _hashCode += getNumVirtualFunction();
        _hashCode += getMaxVirtualFunctionSupported();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostSriovInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSriovInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriovEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriovEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriovCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriovCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriovActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriovActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVirtualFunctionRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVirtualFunctionRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVirtualFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVirtualFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVirtualFunctionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxVirtualFunctionSupported"));
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
