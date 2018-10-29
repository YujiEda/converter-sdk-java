/**
 * ConverterScheduledTaskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterScheduledTaskSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ScheduledTaskSpec spec;

    private com.vmware.converter.ManagedObjectReference job;

    public ConverterScheduledTaskSpec() {
    }

    public ConverterScheduledTaskSpec(
           com.vmware.converter.ScheduledTaskSpec spec,
           com.vmware.converter.ManagedObjectReference job) {
        this.spec = spec;
        this.job = job;
    }


    /**
     * Gets the spec value for this ConverterScheduledTaskSpec.
     * 
     * @return spec
     */
    public com.vmware.converter.ScheduledTaskSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this ConverterScheduledTaskSpec.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.ScheduledTaskSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the job value for this ConverterScheduledTaskSpec.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterScheduledTaskSpec.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterScheduledTaskSpec)) return false;
        ConverterScheduledTaskSpec other = (ConverterScheduledTaskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob())));
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
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterScheduledTaskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterScheduledTaskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
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
