/**
 * UpdateVirtualMachineFilesResultFailedVmFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class UpdateVirtualMachineFilesResultFailedVmFileInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vmFile;

    private com.vmware.converter.LocalizedMethodFault fault;

    public UpdateVirtualMachineFilesResultFailedVmFileInfo() {
    }

    public UpdateVirtualMachineFilesResultFailedVmFileInfo(
           java.lang.String vmFile,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.vmFile = vmFile;
        this.fault = fault;
    }


    /**
     * Gets the vmFile value for this UpdateVirtualMachineFilesResultFailedVmFileInfo.
     * 
     * @return vmFile
     */
    public java.lang.String getVmFile() {
        return vmFile;
    }


    /**
     * Sets the vmFile value for this UpdateVirtualMachineFilesResultFailedVmFileInfo.
     * 
     * @param vmFile
     */
    public void setVmFile(java.lang.String vmFile) {
        this.vmFile = vmFile;
    }


    /**
     * Gets the fault value for this UpdateVirtualMachineFilesResultFailedVmFileInfo.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this UpdateVirtualMachineFilesResultFailedVmFileInfo.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateVirtualMachineFilesResultFailedVmFileInfo)) return false;
        UpdateVirtualMachineFilesResultFailedVmFileInfo other = (UpdateVirtualMachineFilesResultFailedVmFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmFile==null && other.getVmFile()==null) || 
             (this.vmFile!=null &&
              this.vmFile.equals(other.getVmFile()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
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
        if (getVmFile() != null) {
            _hashCode += getVmFile().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateVirtualMachineFilesResultFailedVmFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UpdateVirtualMachineFilesResultFailedVmFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
