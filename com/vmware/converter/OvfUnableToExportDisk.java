/**
 * OvfUnableToExportDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfUnableToExportDisk  extends com.vmware.converter.OvfHardwareExport  implements java.io.Serializable {
    private java.lang.String diskName;

    public OvfUnableToExportDisk() {
    }

    public OvfUnableToExportDisk(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.VirtualDevice device,
           java.lang.String vmPath,
           java.lang.String diskName) {
        super(
            faultCause,
            faultMessage,
            device,
            vmPath);
        this.diskName = diskName;
    }


    /**
     * Gets the diskName value for this OvfUnableToExportDisk.
     * 
     * @return diskName
     */
    public java.lang.String getDiskName() {
        return diskName;
    }


    /**
     * Sets the diskName value for this OvfUnableToExportDisk.
     * 
     * @param diskName
     */
    public void setDiskName(java.lang.String diskName) {
        this.diskName = diskName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfUnableToExportDisk)) return false;
        OvfUnableToExportDisk other = (OvfUnableToExportDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskName==null && other.getDiskName()==null) || 
             (this.diskName!=null &&
              this.diskName.equals(other.getDiskName())));
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
        if (getDiskName() != null) {
            _hashCode += getDiskName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfUnableToExportDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfUnableToExportDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskName"));
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
