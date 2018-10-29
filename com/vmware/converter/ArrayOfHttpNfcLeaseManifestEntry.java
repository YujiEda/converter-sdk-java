/**
 * ArrayOfHttpNfcLeaseManifestEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHttpNfcLeaseManifestEntry  implements java.io.Serializable {
    private com.vmware.converter.HttpNfcLeaseManifestEntry[] httpNfcLeaseManifestEntry;

    public ArrayOfHttpNfcLeaseManifestEntry() {
    }

    public ArrayOfHttpNfcLeaseManifestEntry(
           com.vmware.converter.HttpNfcLeaseManifestEntry[] httpNfcLeaseManifestEntry) {
           this.httpNfcLeaseManifestEntry = httpNfcLeaseManifestEntry;
    }


    /**
     * Gets the httpNfcLeaseManifestEntry value for this ArrayOfHttpNfcLeaseManifestEntry.
     * 
     * @return httpNfcLeaseManifestEntry
     */
    public com.vmware.converter.HttpNfcLeaseManifestEntry[] getHttpNfcLeaseManifestEntry() {
        return httpNfcLeaseManifestEntry;
    }


    /**
     * Sets the httpNfcLeaseManifestEntry value for this ArrayOfHttpNfcLeaseManifestEntry.
     * 
     * @param httpNfcLeaseManifestEntry
     */
    public void setHttpNfcLeaseManifestEntry(com.vmware.converter.HttpNfcLeaseManifestEntry[] httpNfcLeaseManifestEntry) {
        this.httpNfcLeaseManifestEntry = httpNfcLeaseManifestEntry;
    }

    public com.vmware.converter.HttpNfcLeaseManifestEntry getHttpNfcLeaseManifestEntry(int i) {
        return this.httpNfcLeaseManifestEntry[i];
    }

    public void setHttpNfcLeaseManifestEntry(int i, com.vmware.converter.HttpNfcLeaseManifestEntry _value) {
        this.httpNfcLeaseManifestEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHttpNfcLeaseManifestEntry)) return false;
        ArrayOfHttpNfcLeaseManifestEntry other = (ArrayOfHttpNfcLeaseManifestEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpNfcLeaseManifestEntry==null && other.getHttpNfcLeaseManifestEntry()==null) || 
             (this.httpNfcLeaseManifestEntry!=null &&
              java.util.Arrays.equals(this.httpNfcLeaseManifestEntry, other.getHttpNfcLeaseManifestEntry())));
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
        if (getHttpNfcLeaseManifestEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpNfcLeaseManifestEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpNfcLeaseManifestEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHttpNfcLeaseManifestEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHttpNfcLeaseManifestEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpNfcLeaseManifestEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseManifestEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseManifestEntry"));
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
