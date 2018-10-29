/**
 * ConverterAgentInternalBlockCloningOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalBlockCloningOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer maxBandwidth;

    private com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions;

    private boolean setDDBGeometry;

    private boolean skipBadBlocks;

    private com.vmware.converter.ConverterAgentInternalDiskSizes sourceDimensions;

    public ConverterAgentInternalBlockCloningOptions() {
    }

    public ConverterAgentInternalBlockCloningOptions(
           java.lang.Integer maxBandwidth,
           com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions,
           boolean setDDBGeometry,
           boolean skipBadBlocks,
           com.vmware.converter.ConverterAgentInternalDiskSizes sourceDimensions) {
        this.maxBandwidth = maxBandwidth;
        this.creationOptions = creationOptions;
        this.setDDBGeometry = setDDBGeometry;
        this.skipBadBlocks = skipBadBlocks;
        this.sourceDimensions = sourceDimensions;
    }


    /**
     * Gets the maxBandwidth value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @return maxBandwidth
     */
    public java.lang.Integer getMaxBandwidth() {
        return maxBandwidth;
    }


    /**
     * Sets the maxBandwidth value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @param maxBandwidth
     */
    public void setMaxBandwidth(java.lang.Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }


    /**
     * Gets the creationOptions value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @return creationOptions
     */
    public com.vmware.converter.ConverterAgentInternalDiskCreationOptions getCreationOptions() {
        return creationOptions;
    }


    /**
     * Sets the creationOptions value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @param creationOptions
     */
    public void setCreationOptions(com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions) {
        this.creationOptions = creationOptions;
    }


    /**
     * Gets the setDDBGeometry value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @return setDDBGeometry
     */
    public boolean isSetDDBGeometry() {
        return setDDBGeometry;
    }


    /**
     * Sets the setDDBGeometry value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @param setDDBGeometry
     */
    public void setSetDDBGeometry(boolean setDDBGeometry) {
        this.setDDBGeometry = setDDBGeometry;
    }


    /**
     * Gets the skipBadBlocks value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @return skipBadBlocks
     */
    public boolean isSkipBadBlocks() {
        return skipBadBlocks;
    }


    /**
     * Sets the skipBadBlocks value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @param skipBadBlocks
     */
    public void setSkipBadBlocks(boolean skipBadBlocks) {
        this.skipBadBlocks = skipBadBlocks;
    }


    /**
     * Gets the sourceDimensions value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @return sourceDimensions
     */
    public com.vmware.converter.ConverterAgentInternalDiskSizes getSourceDimensions() {
        return sourceDimensions;
    }


    /**
     * Sets the sourceDimensions value for this ConverterAgentInternalBlockCloningOptions.
     * 
     * @param sourceDimensions
     */
    public void setSourceDimensions(com.vmware.converter.ConverterAgentInternalDiskSizes sourceDimensions) {
        this.sourceDimensions = sourceDimensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalBlockCloningOptions)) return false;
        ConverterAgentInternalBlockCloningOptions other = (ConverterAgentInternalBlockCloningOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxBandwidth==null && other.getMaxBandwidth()==null) || 
             (this.maxBandwidth!=null &&
              this.maxBandwidth.equals(other.getMaxBandwidth()))) &&
            ((this.creationOptions==null && other.getCreationOptions()==null) || 
             (this.creationOptions!=null &&
              this.creationOptions.equals(other.getCreationOptions()))) &&
            this.setDDBGeometry == other.isSetDDBGeometry() &&
            this.skipBadBlocks == other.isSkipBadBlocks() &&
            ((this.sourceDimensions==null && other.getSourceDimensions()==null) || 
             (this.sourceDimensions!=null &&
              this.sourceDimensions.equals(other.getSourceDimensions())));
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
        if (getMaxBandwidth() != null) {
            _hashCode += getMaxBandwidth().hashCode();
        }
        if (getCreationOptions() != null) {
            _hashCode += getCreationOptions().hashCode();
        }
        _hashCode += (isSetDDBGeometry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSkipBadBlocks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceDimensions() != null) {
            _hashCode += getSourceDimensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalBlockCloningOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalBlockCloningOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "maxBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "creationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskCreationOptions"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDDBGeometry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "setDDBGeometry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipBadBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipBadBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSizes"));
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
