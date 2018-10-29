/**
 * ConverterEstimateTimeToCompleteRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEstimateTimeToCompleteRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterTaskSpec taskSpec;

    private com.vmware.converter.ConverterRuntimeEnvironmentInfo envInfo;

    public ConverterEstimateTimeToCompleteRequestType() {
    }

    public ConverterEstimateTimeToCompleteRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterTaskSpec taskSpec,
           com.vmware.converter.ConverterRuntimeEnvironmentInfo envInfo) {
           this._this = _this;
           this.taskSpec = taskSpec;
           this.envInfo = envInfo;
    }


    /**
     * Gets the _this value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the taskSpec value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @return taskSpec
     */
    public com.vmware.converter.ConverterTaskSpec getTaskSpec() {
        return taskSpec;
    }


    /**
     * Sets the taskSpec value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @param taskSpec
     */
    public void setTaskSpec(com.vmware.converter.ConverterTaskSpec taskSpec) {
        this.taskSpec = taskSpec;
    }


    /**
     * Gets the envInfo value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @return envInfo
     */
    public com.vmware.converter.ConverterRuntimeEnvironmentInfo getEnvInfo() {
        return envInfo;
    }


    /**
     * Sets the envInfo value for this ConverterEstimateTimeToCompleteRequestType.
     * 
     * @param envInfo
     */
    public void setEnvInfo(com.vmware.converter.ConverterRuntimeEnvironmentInfo envInfo) {
        this.envInfo = envInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEstimateTimeToCompleteRequestType)) return false;
        ConverterEstimateTimeToCompleteRequestType other = (ConverterEstimateTimeToCompleteRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.taskSpec==null && other.getTaskSpec()==null) || 
             (this.taskSpec!=null &&
              this.taskSpec.equals(other.getTaskSpec()))) &&
            ((this.envInfo==null && other.getEnvInfo()==null) || 
             (this.envInfo!=null &&
              this.envInfo.equals(other.getEnvInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getTaskSpec() != null) {
            _hashCode += getTaskSpec().hashCode();
        }
        if (getEnvInfo() != null) {
            _hashCode += getEnvInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterEstimateTimeToCompleteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEstimateTimeToCompleteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "taskSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "envInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterRuntimeEnvironmentInfo"));
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
