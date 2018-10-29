/**
 * ConverterConverterWorkerVmCreationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConverterWorkerVmCreationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpec target;

    private com.vmware.converter.ConverterParamsStorageMapping mapping;

    public ConverterConverterWorkerVmCreationResult() {
    }

    public ConverterConverterWorkerVmCreationResult(
           com.vmware.converter.ConverterComputerSpec target,
           com.vmware.converter.ConverterParamsStorageMapping mapping) {
        this.target = target;
        this.mapping = mapping;
    }


    /**
     * Gets the target value for this ConverterConverterWorkerVmCreationResult.
     * 
     * @return target
     */
    public com.vmware.converter.ConverterComputerSpec getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterConverterWorkerVmCreationResult.
     * 
     * @param target
     */
    public void setTarget(com.vmware.converter.ConverterComputerSpec target) {
        this.target = target;
    }


    /**
     * Gets the mapping value for this ConverterConverterWorkerVmCreationResult.
     * 
     * @return mapping
     */
    public com.vmware.converter.ConverterParamsStorageMapping getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this ConverterConverterWorkerVmCreationResult.
     * 
     * @param mapping
     */
    public void setMapping(com.vmware.converter.ConverterParamsStorageMapping mapping) {
        this.mapping = mapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConverterWorkerVmCreationResult)) return false;
        ConverterConverterWorkerVmCreationResult other = (ConverterConverterWorkerVmCreationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              this.mapping.equals(other.getMapping())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getMapping() != null) {
            _hashCode += getMapping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConverterWorkerVmCreationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConverterWorkerVmCreationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMapping"));
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
