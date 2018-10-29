/**
 * ConverterAgentInternalDiskAttachPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskAttachPoint  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalDiskAttachPointBusType busType;

    private int bus;

    private int unit;

    private int origin;

    private com.vmware.converter.ConverterAgentInternalDiskAttachPoint history;

    public ConverterAgentInternalDiskAttachPoint() {
    }

    public ConverterAgentInternalDiskAttachPoint(
           com.vmware.converter.ConverterAgentInternalDiskAttachPointBusType busType,
           int bus,
           int unit,
           int origin,
           com.vmware.converter.ConverterAgentInternalDiskAttachPoint history) {
        this.busType = busType;
        this.bus = bus;
        this.unit = unit;
        this.origin = origin;
        this.history = history;
    }


    /**
     * Gets the busType value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @return busType
     */
    public com.vmware.converter.ConverterAgentInternalDiskAttachPointBusType getBusType() {
        return busType;
    }


    /**
     * Sets the busType value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @param busType
     */
    public void setBusType(com.vmware.converter.ConverterAgentInternalDiskAttachPointBusType busType) {
        this.busType = busType;
    }


    /**
     * Gets the bus value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @return bus
     */
    public int getBus() {
        return bus;
    }


    /**
     * Sets the bus value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @param bus
     */
    public void setBus(int bus) {
        this.bus = bus;
    }


    /**
     * Gets the unit value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @return unit
     */
    public int getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @param unit
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }


    /**
     * Gets the origin value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @return origin
     */
    public int getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @param origin
     */
    public void setOrigin(int origin) {
        this.origin = origin;
    }


    /**
     * Gets the history value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @return history
     */
    public com.vmware.converter.ConverterAgentInternalDiskAttachPoint getHistory() {
        return history;
    }


    /**
     * Sets the history value for this ConverterAgentInternalDiskAttachPoint.
     * 
     * @param history
     */
    public void setHistory(com.vmware.converter.ConverterAgentInternalDiskAttachPoint history) {
        this.history = history;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDiskAttachPoint)) return false;
        ConverterAgentInternalDiskAttachPoint other = (ConverterAgentInternalDiskAttachPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.busType==null && other.getBusType()==null) || 
             (this.busType!=null &&
              this.busType.equals(other.getBusType()))) &&
            this.bus == other.getBus() &&
            this.unit == other.getUnit() &&
            this.origin == other.getOrigin() &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              this.history.equals(other.getHistory())));
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
        if (getBusType() != null) {
            _hashCode += getBusType().hashCode();
        }
        _hashCode += getBus();
        _hashCode += getUnit();
        _hashCode += getOrigin();
        if (getHistory() != null) {
            _hashCode += getHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskAttachPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskAttachPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "busType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskAttachPointBusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskAttachPoint"));
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
