/**
 * FaultToleranceVMConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FaultToleranceVMConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vmConfig;

    private com.vmware.converter.FaultToleranceDiskSpec[] disks;

    public FaultToleranceVMConfigSpec() {
    }

    public FaultToleranceVMConfigSpec(
           com.vmware.converter.ManagedObjectReference vmConfig,
           com.vmware.converter.FaultToleranceDiskSpec[] disks) {
        this.vmConfig = vmConfig;
        this.disks = disks;
    }


    /**
     * Gets the vmConfig value for this FaultToleranceVMConfigSpec.
     * 
     * @return vmConfig
     */
    public com.vmware.converter.ManagedObjectReference getVmConfig() {
        return vmConfig;
    }


    /**
     * Sets the vmConfig value for this FaultToleranceVMConfigSpec.
     * 
     * @param vmConfig
     */
    public void setVmConfig(com.vmware.converter.ManagedObjectReference vmConfig) {
        this.vmConfig = vmConfig;
    }


    /**
     * Gets the disks value for this FaultToleranceVMConfigSpec.
     * 
     * @return disks
     */
    public com.vmware.converter.FaultToleranceDiskSpec[] getDisks() {
        return disks;
    }


    /**
     * Sets the disks value for this FaultToleranceVMConfigSpec.
     * 
     * @param disks
     */
    public void setDisks(com.vmware.converter.FaultToleranceDiskSpec[] disks) {
        this.disks = disks;
    }

    public com.vmware.converter.FaultToleranceDiskSpec getDisks(int i) {
        return this.disks[i];
    }

    public void setDisks(int i, com.vmware.converter.FaultToleranceDiskSpec _value) {
        this.disks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultToleranceVMConfigSpec)) return false;
        FaultToleranceVMConfigSpec other = (FaultToleranceVMConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmConfig==null && other.getVmConfig()==null) || 
             (this.vmConfig!=null &&
              this.vmConfig.equals(other.getVmConfig()))) &&
            ((this.disks==null && other.getDisks()==null) || 
             (this.disks!=null &&
              java.util.Arrays.equals(this.disks, other.getDisks())));
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
        if (getVmConfig() != null) {
            _hashCode += getVmConfig().hashCode();
        }
        if (getDisks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisks(), i);
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
        new org.apache.axis.description.TypeDesc(FaultToleranceVMConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceVMConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceDiskSpec"));
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
