/**
 * VirtualDeviceConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDeviceConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualDeviceConfigSpecOperation operation;

    private com.vmware.converter.VirtualDeviceConfigSpecFileOperation fileOperation;

    private com.vmware.converter.VirtualDevice device;

    private com.vmware.converter.VirtualMachineProfileSpec[] profile;

    public VirtualDeviceConfigSpec() {
    }

    public VirtualDeviceConfigSpec(
           com.vmware.converter.VirtualDeviceConfigSpecOperation operation,
           com.vmware.converter.VirtualDeviceConfigSpecFileOperation fileOperation,
           com.vmware.converter.VirtualDevice device,
           com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.operation = operation;
        this.fileOperation = fileOperation;
        this.device = device;
        this.profile = profile;
    }


    /**
     * Gets the operation value for this VirtualDeviceConfigSpec.
     * 
     * @return operation
     */
    public com.vmware.converter.VirtualDeviceConfigSpecOperation getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this VirtualDeviceConfigSpec.
     * 
     * @param operation
     */
    public void setOperation(com.vmware.converter.VirtualDeviceConfigSpecOperation operation) {
        this.operation = operation;
    }


    /**
     * Gets the fileOperation value for this VirtualDeviceConfigSpec.
     * 
     * @return fileOperation
     */
    public com.vmware.converter.VirtualDeviceConfigSpecFileOperation getFileOperation() {
        return fileOperation;
    }


    /**
     * Sets the fileOperation value for this VirtualDeviceConfigSpec.
     * 
     * @param fileOperation
     */
    public void setFileOperation(com.vmware.converter.VirtualDeviceConfigSpecFileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }


    /**
     * Gets the device value for this VirtualDeviceConfigSpec.
     * 
     * @return device
     */
    public com.vmware.converter.VirtualDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this VirtualDeviceConfigSpec.
     * 
     * @param device
     */
    public void setDevice(com.vmware.converter.VirtualDevice device) {
        this.device = device;
    }


    /**
     * Gets the profile value for this VirtualDeviceConfigSpec.
     * 
     * @return profile
     */
    public com.vmware.converter.VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this VirtualDeviceConfigSpec.
     * 
     * @param profile
     */
    public void setProfile(com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public com.vmware.converter.VirtualMachineProfileSpec getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, com.vmware.converter.VirtualMachineProfileSpec _value) {
        this.profile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceConfigSpec)) return false;
        VirtualDeviceConfigSpec other = (VirtualDeviceConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.fileOperation==null && other.getFileOperation()==null) || 
             (this.fileOperation!=null &&
              this.fileOperation.equals(other.getFileOperation()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getFileOperation() != null) {
            _hashCode += getFileOperation().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualDeviceConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpecOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpecFileOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileSpec"));
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
