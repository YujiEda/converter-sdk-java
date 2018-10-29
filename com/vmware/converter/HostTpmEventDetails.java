/**
 * HostTpmEventDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostTpmEventDetails  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private byte[] dataHash;

    public HostTpmEventDetails() {
    }

    public HostTpmEventDetails(
           byte[] dataHash) {
        this.dataHash = dataHash;
    }


    /**
     * Gets the dataHash value for this HostTpmEventDetails.
     * 
     * @return dataHash
     */
    public byte[] getDataHash() {
        return dataHash;
    }


    /**
     * Sets the dataHash value for this HostTpmEventDetails.
     * 
     * @param dataHash
     */
    public void setDataHash(byte[] dataHash) {
        this.dataHash = dataHash;
    }

    public byte getDataHash(int i) {
        return this.dataHash[i];
    }

    public void setDataHash(int i, byte _value) {
        this.dataHash[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTpmEventDetails)) return false;
        HostTpmEventDetails other = (HostTpmEventDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataHash==null && other.getDataHash()==null) || 
             (this.dataHash!=null &&
              java.util.Arrays.equals(this.dataHash, other.getDataHash())));
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
        if (getDataHash() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataHash());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataHash(), i);
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
        new org.apache.axis.description.TypeDesc(HostTpmEventDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmEventDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHash");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dataHash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
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
