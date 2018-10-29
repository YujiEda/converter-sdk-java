/**
 * ConverterConverterWorkerWorkerCloningResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConverterWorkerWorkerCloningResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpec target;

    private com.vmware.converter.ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult incrementalP2VCloningResult;

    public ConverterConverterWorkerWorkerCloningResult() {
    }

    public ConverterConverterWorkerWorkerCloningResult(
           com.vmware.converter.ConverterComputerSpec target,
           com.vmware.converter.ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult incrementalP2VCloningResult) {
        this.target = target;
        this.incrementalP2VCloningResult = incrementalP2VCloningResult;
    }


    /**
     * Gets the target value for this ConverterConverterWorkerWorkerCloningResult.
     * 
     * @return target
     */
    public com.vmware.converter.ConverterComputerSpec getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterConverterWorkerWorkerCloningResult.
     * 
     * @param target
     */
    public void setTarget(com.vmware.converter.ConverterComputerSpec target) {
        this.target = target;
    }


    /**
     * Gets the incrementalP2VCloningResult value for this ConverterConverterWorkerWorkerCloningResult.
     * 
     * @return incrementalP2VCloningResult
     */
    public com.vmware.converter.ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult getIncrementalP2VCloningResult() {
        return incrementalP2VCloningResult;
    }


    /**
     * Sets the incrementalP2VCloningResult value for this ConverterConverterWorkerWorkerCloningResult.
     * 
     * @param incrementalP2VCloningResult
     */
    public void setIncrementalP2VCloningResult(com.vmware.converter.ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult incrementalP2VCloningResult) {
        this.incrementalP2VCloningResult = incrementalP2VCloningResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConverterWorkerWorkerCloningResult)) return false;
        ConverterConverterWorkerWorkerCloningResult other = (ConverterConverterWorkerWorkerCloningResult) obj;
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
            ((this.incrementalP2VCloningResult==null && other.getIncrementalP2VCloningResult()==null) || 
             (this.incrementalP2VCloningResult!=null &&
              this.incrementalP2VCloningResult.equals(other.getIncrementalP2VCloningResult())));
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
        if (getIncrementalP2VCloningResult() != null) {
            _hashCode += getIncrementalP2VCloningResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConverterWorkerWorkerCloningResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConverterWorkerWorkerCloningResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incrementalP2VCloningResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "incrementalP2VCloningResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult"));
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
