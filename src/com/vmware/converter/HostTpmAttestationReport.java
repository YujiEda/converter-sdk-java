/**
 * HostTpmAttestationReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostTpmAttestationReport  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues;

    private com.vmware.converter.HostTpmEventLogEntry[] tpmEvents;

    private boolean tpmLogReliable;

    public HostTpmAttestationReport() {
    }

    public HostTpmAttestationReport(
           com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues,
           com.vmware.converter.HostTpmEventLogEntry[] tpmEvents,
           boolean tpmLogReliable) {
        this.tpmPcrValues = tpmPcrValues;
        this.tpmEvents = tpmEvents;
        this.tpmLogReliable = tpmLogReliable;
    }


    /**
     * Gets the tpmPcrValues value for this HostTpmAttestationReport.
     * 
     * @return tpmPcrValues
     */
    public com.vmware.converter.HostTpmDigestInfo[] getTpmPcrValues() {
        return tpmPcrValues;
    }


    /**
     * Sets the tpmPcrValues value for this HostTpmAttestationReport.
     * 
     * @param tpmPcrValues
     */
    public void setTpmPcrValues(com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues) {
        this.tpmPcrValues = tpmPcrValues;
    }

    public com.vmware.converter.HostTpmDigestInfo getTpmPcrValues(int i) {
        return this.tpmPcrValues[i];
    }

    public void setTpmPcrValues(int i, com.vmware.converter.HostTpmDigestInfo _value) {
        this.tpmPcrValues[i] = _value;
    }


    /**
     * Gets the tpmEvents value for this HostTpmAttestationReport.
     * 
     * @return tpmEvents
     */
    public com.vmware.converter.HostTpmEventLogEntry[] getTpmEvents() {
        return tpmEvents;
    }


    /**
     * Sets the tpmEvents value for this HostTpmAttestationReport.
     * 
     * @param tpmEvents
     */
    public void setTpmEvents(com.vmware.converter.HostTpmEventLogEntry[] tpmEvents) {
        this.tpmEvents = tpmEvents;
    }

    public com.vmware.converter.HostTpmEventLogEntry getTpmEvents(int i) {
        return this.tpmEvents[i];
    }

    public void setTpmEvents(int i, com.vmware.converter.HostTpmEventLogEntry _value) {
        this.tpmEvents[i] = _value;
    }


    /**
     * Gets the tpmLogReliable value for this HostTpmAttestationReport.
     * 
     * @return tpmLogReliable
     */
    public boolean isTpmLogReliable() {
        return tpmLogReliable;
    }


    /**
     * Sets the tpmLogReliable value for this HostTpmAttestationReport.
     * 
     * @param tpmLogReliable
     */
    public void setTpmLogReliable(boolean tpmLogReliable) {
        this.tpmLogReliable = tpmLogReliable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTpmAttestationReport)) return false;
        HostTpmAttestationReport other = (HostTpmAttestationReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tpmPcrValues==null && other.getTpmPcrValues()==null) || 
             (this.tpmPcrValues!=null &&
              java.util.Arrays.equals(this.tpmPcrValues, other.getTpmPcrValues()))) &&
            ((this.tpmEvents==null && other.getTpmEvents()==null) || 
             (this.tpmEvents!=null &&
              java.util.Arrays.equals(this.tpmEvents, other.getTpmEvents()))) &&
            this.tpmLogReliable == other.isTpmLogReliable();
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
        if (getTpmPcrValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpmPcrValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpmPcrValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTpmEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpmEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpmEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTpmLogReliable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostTpmAttestationReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmAttestationReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmPcrValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmPcrValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmDigestInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventLogEntry"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmLogReliable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmLogReliable"));
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
