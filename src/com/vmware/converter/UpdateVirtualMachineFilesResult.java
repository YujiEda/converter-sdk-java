/**
 * UpdateVirtualMachineFilesResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class UpdateVirtualMachineFilesResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo[] failedVmFile;

    public UpdateVirtualMachineFilesResult() {
    }

    public UpdateVirtualMachineFilesResult(
           com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo[] failedVmFile) {
        this.failedVmFile = failedVmFile;
    }


    /**
     * Gets the failedVmFile value for this UpdateVirtualMachineFilesResult.
     * 
     * @return failedVmFile
     */
    public com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo[] getFailedVmFile() {
        return failedVmFile;
    }


    /**
     * Sets the failedVmFile value for this UpdateVirtualMachineFilesResult.
     * 
     * @param failedVmFile
     */
    public void setFailedVmFile(com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo[] failedVmFile) {
        this.failedVmFile = failedVmFile;
    }

    public com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo getFailedVmFile(int i) {
        return this.failedVmFile[i];
    }

    public void setFailedVmFile(int i, com.vmware.converter.UpdateVirtualMachineFilesResultFailedVmFileInfo _value) {
        this.failedVmFile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateVirtualMachineFilesResult)) return false;
        UpdateVirtualMachineFilesResult other = (UpdateVirtualMachineFilesResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.failedVmFile==null && other.getFailedVmFile()==null) || 
             (this.failedVmFile!=null &&
              java.util.Arrays.equals(this.failedVmFile, other.getFailedVmFile())));
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
        if (getFailedVmFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedVmFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedVmFile(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateVirtualMachineFilesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UpdateVirtualMachineFilesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedVmFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failedVmFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UpdateVirtualMachineFilesResultFailedVmFileInfo"));
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
