/**
 * ArrayOfHostTpmEventLogEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostTpmEventLogEntry  implements java.io.Serializable {
    private com.vmware.converter.HostTpmEventLogEntry[] hostTpmEventLogEntry;

    public ArrayOfHostTpmEventLogEntry() {
    }

    public ArrayOfHostTpmEventLogEntry(
           com.vmware.converter.HostTpmEventLogEntry[] hostTpmEventLogEntry) {
           this.hostTpmEventLogEntry = hostTpmEventLogEntry;
    }


    /**
     * Gets the hostTpmEventLogEntry value for this ArrayOfHostTpmEventLogEntry.
     * 
     * @return hostTpmEventLogEntry
     */
    public com.vmware.converter.HostTpmEventLogEntry[] getHostTpmEventLogEntry() {
        return hostTpmEventLogEntry;
    }


    /**
     * Sets the hostTpmEventLogEntry value for this ArrayOfHostTpmEventLogEntry.
     * 
     * @param hostTpmEventLogEntry
     */
    public void setHostTpmEventLogEntry(com.vmware.converter.HostTpmEventLogEntry[] hostTpmEventLogEntry) {
        this.hostTpmEventLogEntry = hostTpmEventLogEntry;
    }

    public com.vmware.converter.HostTpmEventLogEntry getHostTpmEventLogEntry(int i) {
        return this.hostTpmEventLogEntry[i];
    }

    public void setHostTpmEventLogEntry(int i, com.vmware.converter.HostTpmEventLogEntry _value) {
        this.hostTpmEventLogEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostTpmEventLogEntry)) return false;
        ArrayOfHostTpmEventLogEntry other = (ArrayOfHostTpmEventLogEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostTpmEventLogEntry==null && other.getHostTpmEventLogEntry()==null) || 
             (this.hostTpmEventLogEntry!=null &&
              java.util.Arrays.equals(this.hostTpmEventLogEntry, other.getHostTpmEventLogEntry())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHostTpmEventLogEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostTpmEventLogEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostTpmEventLogEntry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfHostTpmEventLogEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostTpmEventLogEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostTpmEventLogEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventLogEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventLogEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
