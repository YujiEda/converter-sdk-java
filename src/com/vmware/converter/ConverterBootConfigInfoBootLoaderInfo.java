/**
 * ConverterBootConfigInfoBootLoaderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBootConfigInfoBootLoaderInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterBootConfigInfoBootLoaderLocationInfo bootLoaderLocation;

    private com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo[] entry;

    public ConverterBootConfigInfoBootLoaderInfo() {
    }

    public ConverterBootConfigInfoBootLoaderInfo(
           com.vmware.converter.ConverterBootConfigInfoBootLoaderLocationInfo bootLoaderLocation,
           com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo[] entry) {
        this.bootLoaderLocation = bootLoaderLocation;
        this.entry = entry;
    }


    /**
     * Gets the bootLoaderLocation value for this ConverterBootConfigInfoBootLoaderInfo.
     * 
     * @return bootLoaderLocation
     */
    public com.vmware.converter.ConverterBootConfigInfoBootLoaderLocationInfo getBootLoaderLocation() {
        return bootLoaderLocation;
    }


    /**
     * Sets the bootLoaderLocation value for this ConverterBootConfigInfoBootLoaderInfo.
     * 
     * @param bootLoaderLocation
     */
    public void setBootLoaderLocation(com.vmware.converter.ConverterBootConfigInfoBootLoaderLocationInfo bootLoaderLocation) {
        this.bootLoaderLocation = bootLoaderLocation;
    }


    /**
     * Gets the entry value for this ConverterBootConfigInfoBootLoaderInfo.
     * 
     * @return entry
     */
    public com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo[] getEntry() {
        return entry;
    }


    /**
     * Sets the entry value for this ConverterBootConfigInfoBootLoaderInfo.
     * 
     * @param entry
     */
    public void setEntry(com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo[] entry) {
        this.entry = entry;
    }

    public com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo getEntry(int i) {
        return this.entry[i];
    }

    public void setEntry(int i, com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo _value) {
        this.entry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBootConfigInfoBootLoaderInfo)) return false;
        ConverterBootConfigInfoBootLoaderInfo other = (ConverterBootConfigInfoBootLoaderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bootLoaderLocation==null && other.getBootLoaderLocation()==null) || 
             (this.bootLoaderLocation!=null &&
              this.bootLoaderLocation.equals(other.getBootLoaderLocation()))) &&
            ((this.entry==null && other.getEntry()==null) || 
             (this.entry!=null &&
              java.util.Arrays.equals(this.entry, other.getEntry())));
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
        if (getBootLoaderLocation() != null) {
            _hashCode += getBootLoaderLocation().hashCode();
        }
        if (getEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterBootConfigInfoBootLoaderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootLoaderLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootLoaderLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderLocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderEntryInfo"));
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
