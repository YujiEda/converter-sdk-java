/**
 * TooManyDisksOnLegacyHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class TooManyDisksOnLegacyHost  extends com.vmware.converter.MigrationFault  implements java.io.Serializable {
    private int diskCount;

    private boolean timeoutDanger;

    public TooManyDisksOnLegacyHost() {
    }

    public TooManyDisksOnLegacyHost(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int diskCount,
           boolean timeoutDanger) {
        super(
            faultCause,
            faultMessage);
        this.diskCount = diskCount;
        this.timeoutDanger = timeoutDanger;
    }


    /**
     * Gets the diskCount value for this TooManyDisksOnLegacyHost.
     * 
     * @return diskCount
     */
    public int getDiskCount() {
        return diskCount;
    }


    /**
     * Sets the diskCount value for this TooManyDisksOnLegacyHost.
     * 
     * @param diskCount
     */
    public void setDiskCount(int diskCount) {
        this.diskCount = diskCount;
    }


    /**
     * Gets the timeoutDanger value for this TooManyDisksOnLegacyHost.
     * 
     * @return timeoutDanger
     */
    public boolean isTimeoutDanger() {
        return timeoutDanger;
    }


    /**
     * Sets the timeoutDanger value for this TooManyDisksOnLegacyHost.
     * 
     * @param timeoutDanger
     */
    public void setTimeoutDanger(boolean timeoutDanger) {
        this.timeoutDanger = timeoutDanger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TooManyDisksOnLegacyHost)) return false;
        TooManyDisksOnLegacyHost other = (TooManyDisksOnLegacyHost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.diskCount == other.getDiskCount() &&
            this.timeoutDanger == other.isTimeoutDanger();
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
        _hashCode += getDiskCount();
        _hashCode += (isTimeoutDanger() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TooManyDisksOnLegacyHost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TooManyDisksOnLegacyHost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeoutDanger");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timeoutDanger"));
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
