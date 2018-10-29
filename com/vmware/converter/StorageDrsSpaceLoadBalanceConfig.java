/**
 * StorageDrsSpaceLoadBalanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsSpaceLoadBalanceConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String spaceThresholdMode;

    private java.lang.Integer spaceUtilizationThreshold;

    private java.lang.Integer freeSpaceThresholdGB;

    private java.lang.Integer minSpaceUtilizationDifference;

    public StorageDrsSpaceLoadBalanceConfig() {
    }

    public StorageDrsSpaceLoadBalanceConfig(
           java.lang.String spaceThresholdMode,
           java.lang.Integer spaceUtilizationThreshold,
           java.lang.Integer freeSpaceThresholdGB,
           java.lang.Integer minSpaceUtilizationDifference) {
        this.spaceThresholdMode = spaceThresholdMode;
        this.spaceUtilizationThreshold = spaceUtilizationThreshold;
        this.freeSpaceThresholdGB = freeSpaceThresholdGB;
        this.minSpaceUtilizationDifference = minSpaceUtilizationDifference;
    }


    /**
     * Gets the spaceThresholdMode value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @return spaceThresholdMode
     */
    public java.lang.String getSpaceThresholdMode() {
        return spaceThresholdMode;
    }


    /**
     * Sets the spaceThresholdMode value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @param spaceThresholdMode
     */
    public void setSpaceThresholdMode(java.lang.String spaceThresholdMode) {
        this.spaceThresholdMode = spaceThresholdMode;
    }


    /**
     * Gets the spaceUtilizationThreshold value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @return spaceUtilizationThreshold
     */
    public java.lang.Integer getSpaceUtilizationThreshold() {
        return spaceUtilizationThreshold;
    }


    /**
     * Sets the spaceUtilizationThreshold value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @param spaceUtilizationThreshold
     */
    public void setSpaceUtilizationThreshold(java.lang.Integer spaceUtilizationThreshold) {
        this.spaceUtilizationThreshold = spaceUtilizationThreshold;
    }


    /**
     * Gets the freeSpaceThresholdGB value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @return freeSpaceThresholdGB
     */
    public java.lang.Integer getFreeSpaceThresholdGB() {
        return freeSpaceThresholdGB;
    }


    /**
     * Sets the freeSpaceThresholdGB value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @param freeSpaceThresholdGB
     */
    public void setFreeSpaceThresholdGB(java.lang.Integer freeSpaceThresholdGB) {
        this.freeSpaceThresholdGB = freeSpaceThresholdGB;
    }


    /**
     * Gets the minSpaceUtilizationDifference value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @return minSpaceUtilizationDifference
     */
    public java.lang.Integer getMinSpaceUtilizationDifference() {
        return minSpaceUtilizationDifference;
    }


    /**
     * Sets the minSpaceUtilizationDifference value for this StorageDrsSpaceLoadBalanceConfig.
     * 
     * @param minSpaceUtilizationDifference
     */
    public void setMinSpaceUtilizationDifference(java.lang.Integer minSpaceUtilizationDifference) {
        this.minSpaceUtilizationDifference = minSpaceUtilizationDifference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsSpaceLoadBalanceConfig)) return false;
        StorageDrsSpaceLoadBalanceConfig other = (StorageDrsSpaceLoadBalanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.spaceThresholdMode==null && other.getSpaceThresholdMode()==null) || 
             (this.spaceThresholdMode!=null &&
              this.spaceThresholdMode.equals(other.getSpaceThresholdMode()))) &&
            ((this.spaceUtilizationThreshold==null && other.getSpaceUtilizationThreshold()==null) || 
             (this.spaceUtilizationThreshold!=null &&
              this.spaceUtilizationThreshold.equals(other.getSpaceUtilizationThreshold()))) &&
            ((this.freeSpaceThresholdGB==null && other.getFreeSpaceThresholdGB()==null) || 
             (this.freeSpaceThresholdGB!=null &&
              this.freeSpaceThresholdGB.equals(other.getFreeSpaceThresholdGB()))) &&
            ((this.minSpaceUtilizationDifference==null && other.getMinSpaceUtilizationDifference()==null) || 
             (this.minSpaceUtilizationDifference!=null &&
              this.minSpaceUtilizationDifference.equals(other.getMinSpaceUtilizationDifference())));
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
        if (getSpaceThresholdMode() != null) {
            _hashCode += getSpaceThresholdMode().hashCode();
        }
        if (getSpaceUtilizationThreshold() != null) {
            _hashCode += getSpaceUtilizationThreshold().hashCode();
        }
        if (getFreeSpaceThresholdGB() != null) {
            _hashCode += getFreeSpaceThresholdGB().hashCode();
        }
        if (getMinSpaceUtilizationDifference() != null) {
            _hashCode += getMinSpaceUtilizationDifference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsSpaceLoadBalanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsSpaceLoadBalanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceThresholdMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceThresholdMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilizationThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilizationThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpaceThresholdGB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpaceThresholdGB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSpaceUtilizationDifference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "minSpaceUtilizationDifference"));
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
