/**
 * ArrayOfHostAccessControlEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostAccessControlEntry  implements java.io.Serializable {
    private com.vmware.converter.HostAccessControlEntry[] hostAccessControlEntry;

    public ArrayOfHostAccessControlEntry() {
    }

    public ArrayOfHostAccessControlEntry(
           com.vmware.converter.HostAccessControlEntry[] hostAccessControlEntry) {
           this.hostAccessControlEntry = hostAccessControlEntry;
    }


    /**
     * Gets the hostAccessControlEntry value for this ArrayOfHostAccessControlEntry.
     * 
     * @return hostAccessControlEntry
     */
    public com.vmware.converter.HostAccessControlEntry[] getHostAccessControlEntry() {
        return hostAccessControlEntry;
    }


    /**
     * Sets the hostAccessControlEntry value for this ArrayOfHostAccessControlEntry.
     * 
     * @param hostAccessControlEntry
     */
    public void setHostAccessControlEntry(com.vmware.converter.HostAccessControlEntry[] hostAccessControlEntry) {
        this.hostAccessControlEntry = hostAccessControlEntry;
    }

    public com.vmware.converter.HostAccessControlEntry getHostAccessControlEntry(int i) {
        return this.hostAccessControlEntry[i];
    }

    public void setHostAccessControlEntry(int i, com.vmware.converter.HostAccessControlEntry _value) {
        this.hostAccessControlEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostAccessControlEntry)) return false;
        ArrayOfHostAccessControlEntry other = (ArrayOfHostAccessControlEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostAccessControlEntry==null && other.getHostAccessControlEntry()==null) || 
             (this.hostAccessControlEntry!=null &&
              java.util.Arrays.equals(this.hostAccessControlEntry, other.getHostAccessControlEntry())));
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
        if (getHostAccessControlEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostAccessControlEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostAccessControlEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostAccessControlEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostAccessControlEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAccessControlEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostAccessControlEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccessControlEntry"));
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
