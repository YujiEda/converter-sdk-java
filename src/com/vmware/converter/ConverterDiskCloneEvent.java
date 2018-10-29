/**
 * ConverterDiskCloneEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiskCloneEvent  extends com.vmware.converter.ConverterVmEvent  implements java.io.Serializable {
    private java.lang.String sourceDisk;

    public ConverterDiskCloneEvent() {
    }

    public ConverterDiskCloneEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String vmName,
           java.lang.String sourceDisk) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job,
            vmName);
        this.sourceDisk = sourceDisk;
    }


    /**
     * Gets the sourceDisk value for this ConverterDiskCloneEvent.
     * 
     * @return sourceDisk
     */
    public java.lang.String getSourceDisk() {
        return sourceDisk;
    }


    /**
     * Sets the sourceDisk value for this ConverterDiskCloneEvent.
     * 
     * @param sourceDisk
     */
    public void setSourceDisk(java.lang.String sourceDisk) {
        this.sourceDisk = sourceDisk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDiskCloneEvent)) return false;
        ConverterDiskCloneEvent other = (ConverterDiskCloneEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceDisk==null && other.getSourceDisk()==null) || 
             (this.sourceDisk!=null &&
              this.sourceDisk.equals(other.getSourceDisk())));
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
        if (getSourceDisk() != null) {
            _hashCode += getSourceDisk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiskCloneEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskCloneEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
