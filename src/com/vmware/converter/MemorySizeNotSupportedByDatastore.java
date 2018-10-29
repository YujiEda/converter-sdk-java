/**
 * MemorySizeNotSupportedByDatastore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class MemorySizeNotSupportedByDatastore  extends com.vmware.converter.VirtualHardwareCompatibilityIssue  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference datastore;

    private int memorySizeMB;

    private int maxMemorySizeMB;

    public MemorySizeNotSupportedByDatastore() {
    }

    public MemorySizeNotSupportedByDatastore(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference datastore,
           int memorySizeMB,
           int maxMemorySizeMB) {
        super(
            faultCause,
            faultMessage);
        this.datastore = datastore;
        this.memorySizeMB = memorySizeMB;
        this.maxMemorySizeMB = maxMemorySizeMB;
    }


    /**
     * Gets the datastore value for this MemorySizeNotSupportedByDatastore.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this MemorySizeNotSupportedByDatastore.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the memorySizeMB value for this MemorySizeNotSupportedByDatastore.
     * 
     * @return memorySizeMB
     */
    public int getMemorySizeMB() {
        return memorySizeMB;
    }


    /**
     * Sets the memorySizeMB value for this MemorySizeNotSupportedByDatastore.
     * 
     * @param memorySizeMB
     */
    public void setMemorySizeMB(int memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
    }


    /**
     * Gets the maxMemorySizeMB value for this MemorySizeNotSupportedByDatastore.
     * 
     * @return maxMemorySizeMB
     */
    public int getMaxMemorySizeMB() {
        return maxMemorySizeMB;
    }


    /**
     * Sets the maxMemorySizeMB value for this MemorySizeNotSupportedByDatastore.
     * 
     * @param maxMemorySizeMB
     */
    public void setMaxMemorySizeMB(int maxMemorySizeMB) {
        this.maxMemorySizeMB = maxMemorySizeMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemorySizeNotSupportedByDatastore)) return false;
        MemorySizeNotSupportedByDatastore other = (MemorySizeNotSupportedByDatastore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            this.memorySizeMB == other.getMemorySizeMB() &&
            this.maxMemorySizeMB == other.getMaxMemorySizeMB();
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
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        _hashCode += getMemorySizeMB();
        _hashCode += getMaxMemorySizeMB();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemorySizeNotSupportedByDatastore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MemorySizeNotSupportedByDatastore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
