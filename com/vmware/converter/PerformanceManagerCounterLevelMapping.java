/**
 * PerformanceManagerCounterLevelMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PerformanceManagerCounterLevelMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int counterId;

    private java.lang.Integer aggregateLevel;

    private java.lang.Integer perDeviceLevel;

    public PerformanceManagerCounterLevelMapping() {
    }

    public PerformanceManagerCounterLevelMapping(
           int counterId,
           java.lang.Integer aggregateLevel,
           java.lang.Integer perDeviceLevel) {
        this.counterId = counterId;
        this.aggregateLevel = aggregateLevel;
        this.perDeviceLevel = perDeviceLevel;
    }


    /**
     * Gets the counterId value for this PerformanceManagerCounterLevelMapping.
     * 
     * @return counterId
     */
    public int getCounterId() {
        return counterId;
    }


    /**
     * Sets the counterId value for this PerformanceManagerCounterLevelMapping.
     * 
     * @param counterId
     */
    public void setCounterId(int counterId) {
        this.counterId = counterId;
    }


    /**
     * Gets the aggregateLevel value for this PerformanceManagerCounterLevelMapping.
     * 
     * @return aggregateLevel
     */
    public java.lang.Integer getAggregateLevel() {
        return aggregateLevel;
    }


    /**
     * Sets the aggregateLevel value for this PerformanceManagerCounterLevelMapping.
     * 
     * @param aggregateLevel
     */
    public void setAggregateLevel(java.lang.Integer aggregateLevel) {
        this.aggregateLevel = aggregateLevel;
    }


    /**
     * Gets the perDeviceLevel value for this PerformanceManagerCounterLevelMapping.
     * 
     * @return perDeviceLevel
     */
    public java.lang.Integer getPerDeviceLevel() {
        return perDeviceLevel;
    }


    /**
     * Sets the perDeviceLevel value for this PerformanceManagerCounterLevelMapping.
     * 
     * @param perDeviceLevel
     */
    public void setPerDeviceLevel(java.lang.Integer perDeviceLevel) {
        this.perDeviceLevel = perDeviceLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceManagerCounterLevelMapping)) return false;
        PerformanceManagerCounterLevelMapping other = (PerformanceManagerCounterLevelMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.counterId == other.getCounterId() &&
            ((this.aggregateLevel==null && other.getAggregateLevel()==null) || 
             (this.aggregateLevel!=null &&
              this.aggregateLevel.equals(other.getAggregateLevel()))) &&
            ((this.perDeviceLevel==null && other.getPerDeviceLevel()==null) || 
             (this.perDeviceLevel!=null &&
              this.perDeviceLevel.equals(other.getPerDeviceLevel())));
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
        _hashCode += getCounterId();
        if (getAggregateLevel() != null) {
            _hashCode += getAggregateLevel().hashCode();
        }
        if (getPerDeviceLevel() != null) {
            _hashCode += getPerDeviceLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformanceManagerCounterLevelMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerformanceManagerCounterLevelMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "counterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "aggregateLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perDeviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perDeviceLevel"));
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
