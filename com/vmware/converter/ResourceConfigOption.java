/**
 * ResourceConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ResourceConfigOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ResourceAllocationOption cpuAllocationOption;

    private com.vmware.converter.ResourceAllocationOption memoryAllocationOption;

    public ResourceConfigOption() {
    }

    public ResourceConfigOption(
           com.vmware.converter.ResourceAllocationOption cpuAllocationOption,
           com.vmware.converter.ResourceAllocationOption memoryAllocationOption) {
        this.cpuAllocationOption = cpuAllocationOption;
        this.memoryAllocationOption = memoryAllocationOption;
    }


    /**
     * Gets the cpuAllocationOption value for this ResourceConfigOption.
     * 
     * @return cpuAllocationOption
     */
    public com.vmware.converter.ResourceAllocationOption getCpuAllocationOption() {
        return cpuAllocationOption;
    }


    /**
     * Sets the cpuAllocationOption value for this ResourceConfigOption.
     * 
     * @param cpuAllocationOption
     */
    public void setCpuAllocationOption(com.vmware.converter.ResourceAllocationOption cpuAllocationOption) {
        this.cpuAllocationOption = cpuAllocationOption;
    }


    /**
     * Gets the memoryAllocationOption value for this ResourceConfigOption.
     * 
     * @return memoryAllocationOption
     */
    public com.vmware.converter.ResourceAllocationOption getMemoryAllocationOption() {
        return memoryAllocationOption;
    }


    /**
     * Sets the memoryAllocationOption value for this ResourceConfigOption.
     * 
     * @param memoryAllocationOption
     */
    public void setMemoryAllocationOption(com.vmware.converter.ResourceAllocationOption memoryAllocationOption) {
        this.memoryAllocationOption = memoryAllocationOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceConfigOption)) return false;
        ResourceConfigOption other = (ResourceConfigOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpuAllocationOption==null && other.getCpuAllocationOption()==null) || 
             (this.cpuAllocationOption!=null &&
              this.cpuAllocationOption.equals(other.getCpuAllocationOption()))) &&
            ((this.memoryAllocationOption==null && other.getMemoryAllocationOption()==null) || 
             (this.memoryAllocationOption!=null &&
              this.memoryAllocationOption.equals(other.getMemoryAllocationOption())));
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
        if (getCpuAllocationOption() != null) {
            _hashCode += getCpuAllocationOption().hashCode();
        }
        if (getMemoryAllocationOption() != null) {
            _hashCode += getMemoryAllocationOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceConfigOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceConfigOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAllocationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuAllocationOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceAllocationOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAllocationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryAllocationOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceAllocationOption"));
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
