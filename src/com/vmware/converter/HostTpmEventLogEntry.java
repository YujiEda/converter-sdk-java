/**
 * HostTpmEventLogEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostTpmEventLogEntry  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int pcrIndex;

    private com.vmware.converter.HostTpmEventDetails eventDetails;

    public HostTpmEventLogEntry() {
    }

    public HostTpmEventLogEntry(
           int pcrIndex,
           com.vmware.converter.HostTpmEventDetails eventDetails) {
        this.pcrIndex = pcrIndex;
        this.eventDetails = eventDetails;
    }


    /**
     * Gets the pcrIndex value for this HostTpmEventLogEntry.
     * 
     * @return pcrIndex
     */
    public int getPcrIndex() {
        return pcrIndex;
    }


    /**
     * Sets the pcrIndex value for this HostTpmEventLogEntry.
     * 
     * @param pcrIndex
     */
    public void setPcrIndex(int pcrIndex) {
        this.pcrIndex = pcrIndex;
    }


    /**
     * Gets the eventDetails value for this HostTpmEventLogEntry.
     * 
     * @return eventDetails
     */
    public com.vmware.converter.HostTpmEventDetails getEventDetails() {
        return eventDetails;
    }


    /**
     * Sets the eventDetails value for this HostTpmEventLogEntry.
     * 
     * @param eventDetails
     */
    public void setEventDetails(com.vmware.converter.HostTpmEventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTpmEventLogEntry)) return false;
        HostTpmEventLogEntry other = (HostTpmEventLogEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.pcrIndex == other.getPcrIndex() &&
            ((this.eventDetails==null && other.getEventDetails()==null) || 
             (this.eventDetails!=null &&
              this.eventDetails.equals(other.getEventDetails())));
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
        _hashCode += getPcrIndex();
        if (getEventDetails() != null) {
            _hashCode += getEventDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostTpmEventLogEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventLogEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcrIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pcrIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventDetails"));
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
